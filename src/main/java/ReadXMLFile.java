import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class ReadXMLFile {
    private ProteinBar bar;
    private List<ProteinBar> list ;
    public List<ProteinBar> readFromXMLFile() {
          list = new LinkedList<>();
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean fett = false;
                boolean energy = false;
                boolean kolhydrat = false;
                boolean protein = false;
                boolean fiber = false;
                boolean date = false;
                boolean score = false;

                public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {

                    if (qName.contains("BAR")) {
                       // System.out.println("\nNAME : " + qName);
                        bar = new ProteinBar();
                        //System.out.println("SN : " + attributes.getValue(0));
                        bar.setName(qName);
                        bar.setProductID(attributes.getValue(0));
                    }

                    if (qName.equalsIgnoreCase("fett")) {
                        fett = true;
                    }

                    if (qName.equalsIgnoreCase("energy")) {
                        energy = true;
                    }

                    if (qName.equalsIgnoreCase("kolhydrat")) {
                        kolhydrat = true;
                    }

                    if (qName.equalsIgnoreCase("protein")) {
                        protein = true;
                    }
                    if (qName.equalsIgnoreCase("fiber")) {
                        fiber = true;
                    }

                    if (qName.contains("reviewer")) {
                           // System.out.println("reviewer : " + attributes.getValue(0));
                         //     bar.setRevName(attributes.getValue(0));
                        }
                        if (qName.equalsIgnoreCase("date")) {
                            date = true;
                        }
                        if (qName.equalsIgnoreCase("score")) {
                            score = true;
                        }
                    }


                public void characters(char[] ch, int start, int length) throws SAXException {

                    if (fett) {
                       // System.out.println("fett : " + new String(ch, start, length));
                        double fettAsDouble = Double.parseDouble(new String(ch, start, length));
                        bar.setFett(fettAsDouble);
                        fett = false;
                    }
                    if (energy) {
                        //System.out.println("energy : " + new String(ch, start, length));
                        double energyAsDouble = Double.parseDouble(new String(ch, start, length));
                        bar.setEnergy(energyAsDouble);
                        energy = false;
                    }
                    if (kolhydrat) {
                        //System.out.println("kolhydrat : " + new String(ch, start, length));
                        double kolhydratAsDouble = Double.parseDouble(new String(ch, start, length));
                        bar.setKalhydrate(kolhydratAsDouble);
                        kolhydrat = false;
                    }
                    if (protein) {
                        //System.out.println("protein : " + new String(ch, start, length));
                        double proteinAsD = Double.parseDouble(new String(ch, start, length));
                        bar.setProtein(proteinAsD);
                        protein = false;
                    }
                    if (fiber) {
                        //System.out.println("fiber : " + new String(ch, start, length));
                        double fiberAsDouble = Double.parseDouble(new String(ch, start, length));
                        bar.setFiber(fiberAsDouble);
                        fiber = false;
                    }
                    if (date) {
                        //System.out.println("date : " + new String(ch, start, length));
                       // bar.setRevDate(new String(ch, start, length));
                        date = false;
                    }
                    if (score) {
                        //System.out.println("score : " + new String(ch, start, length));
                       // int scoreAsDouble = Integer.parseInt(new String(ch, start, length));
                       // bar.setRevRate(scoreAsDouble);
                        score = false;
                    }
                }
                public void endElement(String uri, String localName, String qName) throws SAXException {

                    if (qName.contains("BAR")) {
                        // add it to the list
                        list.add(bar);}}
            };
           File file = new File("./bars.xml");
            saxParser.parse(file, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
         return list;
    }
}
