package w1d2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordCountW1D2 {
  Mapper mapper;
  Reducer reducer;

  public WordCountW1D2(Mapper mapper) {
    this.mapper = mapper;
  }

  public List<Pair> sortPair() {
    List<Pair> pairs = mapper.getPairs();
    pairs.sort(Comparator.comparing(Pair::getKey));
    return pairs;
  }

  public void createGroupByPairs() {
    List<GroupByPair> groupByPairs = new ArrayList<>();
    String tempKey = "";
    GroupByPair tempGroupByPair = new GroupByPair(tempKey);
    for(Pair pair : sortPair()) {
      String key = pair.getKey();
      GroupByPair groupByPair = new GroupByPair(key);
      if (!tempKey.equals(key)) {
        tempKey = key;
        groupByPair.addValue(pair.getValue());
        tempGroupByPair = groupByPair;
        groupByPairs.add(groupByPair);
      } else {
        groupByPair = tempGroupByPair;
        groupByPair.addValue(pair.getValue());
      }
    }
    this.reducer = new Reducer(groupByPairs);
  }

  public void printGroupByPair() {
    for(GroupByPair g : this.reducer.getGroupByPairs()) {
      System.out.println(g);
    }
  }

  public void sumValueByPairKey() {
    List<Pair> pairs = new ArrayList<>();
    for(GroupByPair g : this.reducer.getGroupByPairs()) {
      Pair pair = new Pair(g.getKey());
      pairs.add(pair);
      pair.setValue(g.getValues().size());
    }

    for(Pair p : pairs) {
      System.out.println(p);
    }
  }
}
