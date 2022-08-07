
 package com.nit.main;
   import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import  com.nit.beans.WishMessageGenerator;

  class WishMessageApp{
  
    public static  void  main(String args[]) throws Exception{
	
	   FileSystemResource res=new FileSystemResource("");
	   
	    XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Object obj=factory.getBean("wmg");
	    WishMessageGenerator generator=(WishMessageGenerator)obj;
	
	     String message=generator.generateMessage("pravat");
	
	    System.out.println(message);
	
	
	}
  
  }