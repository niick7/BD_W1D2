package w1d2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordCountW1D2 {
  Mapper mapper;
  Reducer reducer;

  public WordCountW1D2() {}

  public List<Pair> sortPair() {
    List<Pair> pairs = mapper.getPairs();
    pairs.sort(Comparator.comparing(Pair::getKey));
    return pairs;
  }

  public List<GroupByPair> createGroupByPairs() {
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
    return groupByPairs;
  }

  public void setMapper(Mapper mapper) { this.mapper = mapper; }
  public void setReducer(Reducer reducer) { this.reducer = reducer; }
}
