package week6;

import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

// 전체를 메모리에 로드 후 parsing
public class DomParser {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new ClassPathResource("members.xml").getInputStream());
        NodeList members = document.getElementsByTagName("member");
        for (int i = 0; i < members.getLength(); i++) {
            Node node = members.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String id = element.getAttribute("id");
                System.out.println(id);
                NodeList child = element.getChildNodes();
                for (int j = 0; j < child.getLength(); j++) {
                    Node item = child.item(j);
                    if (item.getNodeType() == Node.ELEMENT_NODE) {
                        Element childNode = (Element) item;
                        String textContent = childNode.getTextContent();
                        System.out.println(childNode.getNodeName() + " " + textContent);
                    }


                }
            }
        }
    }
}
