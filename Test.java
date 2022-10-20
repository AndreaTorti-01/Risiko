
import java.nio.file.Files;
import org.json.*;
import java.nio.file.Paths;

public class Test {
  public static void main(String[] args) {
    try {
      String myFile = Files.readString(Paths.get("risk/json/Regions.json"));
      JSONArray myJSON = new JSONArray(myFile);
      JSONObject myJSON2 = myJSON.getJSONObject(0);
      //regions.add(new Region();
      System.out.println(myJSON2.getString("name"));
    } catch (Exception e) {};
  }
}
