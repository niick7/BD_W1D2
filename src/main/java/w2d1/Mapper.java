package w2d1;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
  List<Pair> pairs;
  public Mapper() {
    this.pairs = new ArrayList<Pair>();
  }

  public void addPairFromKey(String key) {
    Pair pair = new Pair(key.toLowerCase());
    pairs.add(pair);
  }

  public List<Pair> getPairs() {
    return pairs;
  }

  @Override
  public String toString() {
    String str = "";

    for(Pair p : pairs) {
      str += p;
    }
    return str;
  }
}
