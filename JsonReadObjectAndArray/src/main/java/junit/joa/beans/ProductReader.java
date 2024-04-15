package junit.joa.beans;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class ProductReader {
public static void main(String[] args) {
	JsonReader jsonReader=Json.createReader(ProductReader.class.getClassLoader().getResourceAsStream("product.json"));
	JsonObject product=jsonReader.readObject();
	System.out.println("productName   :"+product.getString("rom"));
    JsonArray features=product.getJsonArray("features");
	features.forEach(v-> {System.out.println(v);
	});
	jsonReader.close();
}
}