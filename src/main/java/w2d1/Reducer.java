package w2d1;

import java.util.List;

public class Reducer {
  List<Pair> pairs;
  List<GroupByPair> groupByPairs;

  public Reducer(List<Pair> pairs, List<GroupByPair> groupByPairs) {
    this.pairs = pairs;
    this.groupByPairs = groupByPairs;
  }

  public List<Pair> getPairs() {
    return pairs;
  }

  public List<GroupByPair> getGroupByPairs() {
    return groupByPairs;
  }
}
