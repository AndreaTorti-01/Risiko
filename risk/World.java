package risk;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class World {
  List<Region> regions = new ArrayList<Region>();
  public World(){
    try {
      String myFile = Files.readString(Paths.get("json/Regions.json"));
      JSONArray myJSON = new JSONArray(myFile);
      JSONObject myJSON2 = myJSON.getJSONObject(0);
      //regions.add(new Region();
      System.out.println(myJSON2.getString("name"));
    } catch (Exception e) {};
    
  }

  public void Print(){
    System.out.println(regions.get(0).getName());
  }
}
