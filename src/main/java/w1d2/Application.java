package w1d2;

public class Application {
  private static final String fileName = "testDataForW1D1.txt";

  public static void main(String[] args) {
    WordCountW1D2 w1d2 = new WordCountW1D2();
    Mapper mapper = new Mapper();
    w1d2.setMapper(mapper);
    mapper.map(fileName);
    Reducer reducer = new Reducer(w1d2.createGroupByPairs());
    w1d2.setReducer(reducer);
    System.out.println("### Mapper Output ###");
    System.out.println(mapper + "\n\n");
    System.out.println("### Reducer Input ###");
    reducer.printGroupByPairs();
    System.out.println("\n\n");
    System.out.println("### Reducer Output ###");
    reducer.reduce();
  }
}
