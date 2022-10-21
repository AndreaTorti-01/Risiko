package risk;

import java.util.*;

public class World {
    private List<Region> regions;

    public World() throws Exception {
        regions = Utils.getRegionsList();
        for (Region r : regions) {
            List<Region> adjRegions = new ArrayList<Region>();
            for (String s : Utils.getRegionAdjStringList(r)) {
                adjRegions.add(this.getRegion(s));
            }
            r.setAdjRegions(adjRegions);
        }
    }

    public Region getRegion(String name) throws Exception {
        for (Region r : regions)
            if (r.getName().equals(name))
                return r;
        throw new Exception("region not present");
    }

    public List<Region> getRegions() {
        return regions;
    }

}
