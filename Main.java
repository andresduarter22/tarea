import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.PrintWriter;


public class Main {
    public static void main(String[] args){
    Persona pepe = new Persona("Pepe",20,"Pizza");

        Gson gson = new Gson();
        XStream xStream = new XStream(new DomDriver());

        System.out.println(gson.toJson(pepe));
        System.out.println(xStream.toXML(pepe));



    }
}
