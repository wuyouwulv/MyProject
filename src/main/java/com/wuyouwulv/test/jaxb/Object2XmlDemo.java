package com.wuyouwulv.test.jaxb;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

//Marshaller
public class Object2XmlDemo {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("suo");
		customer.setAge(29);
		
		try {
			File file = new File("src/main/resources/customer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}