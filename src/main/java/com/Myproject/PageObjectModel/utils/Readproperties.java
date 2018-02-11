package com.Myproject.PageObjectModel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Readproperties {

	static Properties p = new Properties();
	public  static String readproperty(String keys) throws IOException
	{
		File fl= new File("C:\\Users\\Amaresh\\Desktop\\Read.properties");
		InputStream in= new FileInputStream(fl);
		p.load(in);
	System.out.println(p.getProperty(keys));
	return p.getProperty(keys);
	
	}
	
	
}
