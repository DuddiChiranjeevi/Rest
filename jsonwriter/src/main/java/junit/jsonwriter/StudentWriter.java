package junit.jsonwriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

public class StudentWriter {
public static void main(String[] args) throws IOException {
	JsonWriter jsonWriter=Json.createWriter(new FileOutputStream(new File("D:\\JUnit\\jsonwriter\\src\\main\\resources\\student.json")));

JsonObjectBuilder studentObjectBuilder =Json.createObjectBuilder();
studentObjectBuilder.add("StudentId", 1234);
studentObjectBuilder.add("studentName", "Chiranjeevi");
studentObjectBuilder.add("fatherName", "Subramanyam");
studentObjectBuilder.add("motherName", "Janaki");
studentObjectBuilder.add("mobileNo", "9059798193");

JsonObjectBuilder courseObjectBuilder=Json.createObjectBuilder();
courseObjectBuilder.add("Degree", "Bsc(Maths),Bsc(Statitics),Bsc(MPC)");
courseObjectBuilder.add("Master Degeree", "Master of Business Administration,Master Of Computer applications");
courseObjectBuilder.add("Phd", "Computer application");

JsonObject courseObject=courseObjectBuilder.build();
studentObjectBuilder.add("course", courseObject);

JsonArrayBuilder collageArrayBuilder=Json.createArrayBuilder();
collageArrayBuilder.add("Seshachala Degeree colage");
collageArrayBuilder.add("Vedavyasa Degeree collage");
collageArrayBuilder.add("Himaja degeree collage");
collageArrayBuilder.add("Ramana degeree collage");

JsonArray collageArray=collageArrayBuilder.build();
studentObjectBuilder.add("collage",collageArray);

JsonObject studentObject=studentObjectBuilder.build();

jsonWriter.writeObject(studentObject);
jsonWriter.close();


}

}
