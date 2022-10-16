package risk;
import java.util.*;

// possono esistere due regioni con lo stesso nome
// una singola regione non va MAI salvata in due oggetti separati
// i nomi delle regioni sono Maiuscoli
public class Region {
  private List<Region> adjRegions;
  private Player propertyOf;
  private String name;

  public Region(String name, Region... adjRegions){
    this.propertyOf = null;
    this.name = name;
    for (Region r : adjRegions) this.adjRegions.add(r);
  }

  public Player getPropertyOf() {
    return propertyOf;
  }

  public List<Region> getAdjRegions() {
    return adjRegions;
  }

  public boolean isAdjacent(Region region){
    for (Region r : adjRegions) if (r == region) return true;
    return false;
  }

  public void setPropertyOf(Player propertyOf) {
    this.propertyOf = propertyOf;
  }

  public String getName() {
    return name;
  }  
}
