package w1d2;

import java.util.List;

public class Reducer {
  List<GroupByPair> groupByPairs;

  public Reducer(List<GroupByPair> groupByPairs) {
    this.groupByPairs = groupByPairs;
  }

  public List<GroupByPair> getGroupByPairs() {
    return groupByPairs;
  }
}
