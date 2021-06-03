package com.srtech.setterInjection.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.srtech.setterInjection.WishMessageGenerator;

public class MainSetterInjectionMain {
	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Object obj = factory.getBean("wmg");
		WishMessageGenerator wishGenerator = (WishMessageGenerator) obj;
		wishGenerator.genarateWishGenarator("Srinivas");

	}

}
	