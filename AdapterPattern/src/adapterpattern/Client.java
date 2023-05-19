/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author Avik
 */
public class Client {
    public static void main(String[] args) {
        JSON json = new JSON("json data");
        Adapter adapter = new JsonToXmlAdapter(json);
        XML xml = adapter.convert(json);
        
        
        Protobuf protobuf = new Protobuf("protobuf data");
        adapter = new ProtobufToXmlAdapter(protobuf);
        xml = adapter.convert(protobuf);
    }
}
