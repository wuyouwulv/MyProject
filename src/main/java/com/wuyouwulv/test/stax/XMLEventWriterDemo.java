package com.wuyouwulv.test.stax;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.junit.Test;
public class XMLEventWriterDemo {

	public static void main(String[] args) throws Exception{
       //声明静态工厂
       XMLOutputFactory factory = 
              XMLOutputFactory.newFactory();
       //创建XMLEventWriter对象
       XMLEventWriter writer = 
              factory.createXMLEventWriter(new FileWriter("src/main/resources/users2.xml"));
       //声明XMLEvent工厂
       XMLEventFactory ef = XMLEventFactory.newInstance();
       //声明文档开始即：<?xml version="1.0" encoding="UTF-8"?>
       XMLEvent event = ef.createStartDocument("UTF-8","1.0");
       writer.add(event);
       //声明开始标签<user,注意后面没有那个>，只在遇到EndElement时才会有>.
       StartElement se = ef.createStartElement(new QName("users"),null,null);
       writer.add(se);
       //给user元素声明一个属性
       Attribute att =ef.createAttribute("id", "UX001");
       List<Attribute> list = new ArrayList<Attribute>();
       list.add(att);
       //声明user元素，且带有属性
       se = 
ef.createStartElement(new QName("user"),list.iterator(),null);
       writer.add(se);
       //在user子元素内部声明一个name元素再
       se = ef.createStartElement(new QName("name"),null,null);
       writer.add(se);
       //声明一个文本元素
       Characters ce  =ef.createCharacters("Jack在中国北京");
       writer.add(ce);
       //以下再从内向外依次声明结束元素
       EndElement ee = null;
       ee = ef.createEndElement(new QName("name"),null);
       writer.add(ee);
                   
       ee = ef.createEndElement(new QName("user"),null);
       writer.add(ee);
                   
       ee = ef.createEndElement(new QName("users"),null);
       writer.add(ee);
       writer.flush();
       writer.close();
                   
    }
}