package w1d2;

import java.util.List;

public class Reducer {
  List<Pair> pairs;
  List<GroupByPair> groupByPairs;

  public Reducer(List<Pair> pairs, List<GroupByPair> groupByPairs) {
    this.pairs = pairs;
    this.groupByPairs = groupByPairs;
  }

  public List<GroupByPair> getGroupByPairs() {
    return groupByPairs;
  }
}
