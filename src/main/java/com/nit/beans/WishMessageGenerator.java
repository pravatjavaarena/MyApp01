
package com.nit.beans;

import java.util.Date;
public class WishMessageGenerator{
 
  private  Date date;
  
    public void setDate(Date date){
  
  
         this.date=date;
  
     }
	 
	 public String generateMessage(String name){
	 
	    int hour=date.getHours();
	 
	    if(hour>6 && hour<=12)
		
		return "Good Morning:::"+name;
		
		else if(hour>12 && hour<=16)
		
		 return "Good afternoon::"+name;
		 
		 else if(hour>16 && hour<20)
		 
		   return "Good Evening::"+name;
		   
		   else
		   return "Good Night::"+name;
		
		
		
	 
	 
	 }
	 


}