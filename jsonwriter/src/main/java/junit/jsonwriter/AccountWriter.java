package junit.jsonwriter ;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

public class AccountWriter {
public static void main(String[] args) throws IOException {
	JsonWriter jsonWriter=Json.createWriter(new FileOutputStream(new File("D:\\JUnit\\jsonwriter\\src\\main\\resources\\account.json")));
JsonObjectBuilder accountObjectBuilder=Json.createObjectBuilder();
accountObjectBuilder.add("accountName", "Chiranjeevi");
accountObjectBuilder.add("AccountNo", 2569785469156l);
accountObjectBuilder.add("accountType","savings");
accountObjectBuilder.add("ifscCode","INDB0005821");
accountObjectBuilder.add("balance", 5000d);

JsonObjectBuilder addressObjectBuilder=Json.createObjectBuilder();
addressObjectBuilder.add("addressLine1", "1-Dasarinethamvillage,Kollagunta post");
addressObjectBuilder.add("addressLine2", "Katrvatinagar mandal,Chittoor district");
addressObjectBuilder.add("city", "Tirupathi");
addressObjectBuilder.add("State", "Andhra Pradesh");
addressObjectBuilder.add("Country", "India");
addressObjectBuilder.add("PinCode", 517582);

JsonObject addresObject=addressObjectBuilder.build();
accountObjectBuilder.add("address", addresObject);

JsonArrayBuilder nomineeArrayBuilder=Json.createArrayBuilder();
nomineeArrayBuilder.add("Subramanyam");
nomineeArrayBuilder.add("Janaki");

JsonArray nomineeArray=nomineeArrayBuilder.build();
accountObjectBuilder.add("nominee", nomineeArray);



JsonObject accountObject=accountObjectBuilder.build();
jsonWriter.writeObject(accountObject);
jsonWriter.close();

}
}
