package com.srtech.setterInjection;

import java.util.Date;

public class WishMessageGenerator {
	// Ctrl+Shft + o for imporing packages
	private Date date;

	// alt +shft + s , r for generating setters and getters
	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}
	
	
	
 public void genarateWishGenarator(String name)
 {
	 int hour = date.getHours();
	 if(hour <12)
	 {
		 System.out.println("Good Morning "+name);
	 }
	 else if(hour <16)
	 {
		 System.out.println("Good Afternoon "+name);
	 }

	 else 
	 {
		 System.out.println("Good Ni8 "+name);
	 }
 }

}
