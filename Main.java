import risk.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        World world = new World();
        System.out.println(world.getRegion("alberta").getName());
        System.out.println(world.getRegion("alberta").getAdjRegions());
        for (Region r : world.getRegion("alberta").getAdjRegions()) {
            System.out.println(r.getName());
        }
    }
}
