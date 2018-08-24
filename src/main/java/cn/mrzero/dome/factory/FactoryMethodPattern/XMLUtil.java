package cn.mrzero.dome.factory.FactoryMethodPattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document = builder.parse(new File("src/main/java/cn/mrzero/dome/factory/FactoryMethodPattern/config.xml"));
			NodeList nodeList = document.getElementsByTagName("factoryType");
			Node node = nodeList.item(0).getFirstChild();
			String factoryType = node.getNodeValue().trim();
			Object obj = Class.forName(factoryType).newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
