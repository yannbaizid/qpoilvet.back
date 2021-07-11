 package fr.benezid.poilvet.PoilvetQ.services;

import java.io.*;
import java.util.Base64;
import java.util.List;

import fr.benezid.poilvet.PoilvetQ.bo.WebFile;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.benezid.poilvet.PoilvetQ.bo.Item;
import fr.benezid.poilvet.PoilvetQ.dao.ItemDao;

@Service
public class ItemServiceImp implements ItemService {
@Autowired
ItemDao itemDao;
	
	@Override
	public Item save(Item object) {
		System.out.println("XXX");
				String path= object.getTitle()+"/imgs/";
				new File(path).mkdirs();
		for (WebFile webFile : object.getWebFileList()) {
			String extension = webFile.getType().split("/")[1];
			String fileBase64 = webFile.getFileBase64();
			fileBase64=fileBase64.substring(fileBase64.lastIndexOf(',')+1).split("=")[0];
			byte[] data = Base64.getDecoder().decode(fileBase64);
			//System.out.println(data);
			try{
				OutputStream out = new FileOutputStream("docs/"+webFile.getName()+"."+extension,false);
				out.write(data);
				out.flush();
				out.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}

return null;
		//return itemDao.save(object);
	}

	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return (List<Item>) itemDao.findAll();
	}

	@Override
	public Item get(int id) {
		// TODO Auto-generated method stub
		return itemDao.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		Item item=new Item();
		item.setId(id);
		delete(item);

	}

	@Override
	public void delete(Item object) {
		itemDao.delete(object);


	}

}
