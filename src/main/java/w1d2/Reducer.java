package w1d2;

import java.util.ArrayList;
import java.util.List;

public class Reducer {
  List<GroupByPair> groupByPairs;

  public Reducer(List<GroupByPair> groupByPairs) {
    this.groupByPairs = groupByPairs;
  }

  public void printGroupByPairs() {
    for(GroupByPair g : this.getGroupByPairs()) {
      System.out.println(g);
    }
  }

  public void reduce() {
    List<Pair> pairs = new ArrayList<>();
    for(GroupByPair g : this.getGroupByPairs()) {
      Pair pair = new Pair(g.getKey());
      pairs.add(pair);
      pair.setValue(g.getValues().size());
    }

    for(Pair p : pairs) {
      System.out.print(p);
    }
  }

  public List<GroupByPair> getGroupByPairs() {
    return groupByPairs;
  }
}
