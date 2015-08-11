package com.wuyouwulv.test.stax;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
/**
 * XMLEventReader读取XML文档
 */
public class XMLEventReaderDemo {
	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
       //初始化工厂类以创建出XMLEventReader对象
       XMLInputFactory factory =    
              XMLInputFactory.newFactory();
       //通过读取XML文件创建XMLEventReader
       XMLEventReader reader=      
              factory.createXMLEventReader(
                     new FileReader("src/main/resources/users.xml"));
       //判断是否还有下一个元素
       while(reader.hasNext()){
           //获取元素对象XMLEvent
           XMLEvent en= reader.nextEvent();    
           //判断是否是元素的开始
           if(en.isStartElement()){        
              StartElement se = en.asStartElement();
              //只获取非命名空间的部分
              if(se.getName().getLocalPart().equals("user")){
                  System.out.println("ID:"+
                            se.getAttributeByName(new QName("id"))
                            .getValue());
              }
              //判断是否是姓名元素
              if(se.getName().getLocalPart().equals("name")){
                  //获取姓名元素里面的文本元素
                  XMLEvent cha= reader.nextEvent();
                  //转成字符串输出
                  System.out.println("Name:"+cha.asCharacters());
              }
              if(se.getName().getLocalPart().equals("age")){
                  XMLEvent cha= reader.nextEvent();
                  System.out.println("Age:"+cha.asCharacters());
                  System.out.println("--------------------------");
              }
           }
       }
       reader.close();
    }
}