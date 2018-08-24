package cn.mrzero.dome.factory.SimpleFactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static String getChartType() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory  = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder  = dFactory .newDocumentBuilder();
			Document doc = builder.parse(new File("src/main/java/cn/mrzero/dome/factory/SimpleFactory/config.xml"));
			
			//获取包含图表类型的文本节点
			NodeList nl = doc.getElementsByTagName("charttype");
			Element classNode = (Element)nl.item(0);
			Element node = (Element)classNode.getElementsByTagName("chart").item(0);
			String el = node.getTextContent();
			System.out.println(el);
			return el;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
