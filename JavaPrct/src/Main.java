import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class Main {

public static void main(String[] args) {

        try
        {
            // Step 1: Create a DocumentBuilder object
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Step 2: Create a new Document object
            Document doc = dBuilder.newDocument();

            // Step 3: Create new Element objects and add them to the Document object
            Element rootElement = doc.createElement("departments");
            doc.appendChild(rootElement);

            Element department1 = doc.createElement("department");
            rootElement.appendChild(department1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("HR"));
            department1.appendChild(name1);

            Element email1 = doc.createElement("email");
            email1.appendChild(doc.createTextNode("hr@oracle.com"));
            department1.appendChild(email1);

            Element student2 = doc.createElement("department");
            rootElement.appendChild(student2);

            Element firstname2 = doc.createElement("firstname");
            firstname2.appendChild(doc.createTextNode("IT"));
            student2.appendChild(firstname2);

            Element email2 = doc.createElement("email");
            email2.appendChild(doc.createTextNode("it@java.com"));
            student2.appendChild(email2);

            // Step 4: Save the Document object to an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("department.xml"));
            transformer.transform(source, result);


        }
        catch (ParserConfigurationException | TransformerException e)
        {
                e.printStackTrace();
        }


        int[] masivi = {2342,11,21342,5,2,6};
        MasiviFunction.MasiviSashualo(masivi);
        MasiviFunction.MasivikentiSashualo(masivi);

         Department department1 = new Department("Jano","HR",1);
         Department department2 = new Department("Mari","IT",2);
         Department department3 = new Department("Jano","HR",1);

        System.out.println(department1);
        System.out.println(department1.equals(department2));
        System.out.println(department1.equals(department3));
    }
}
