package w2d1;

public class Pair {
  String key;
  int value = 1;

  public Pair(String key) {
    this.key = key;
  }

  public int compareTo(Pair p) {
    return this.key.toLowerCase().compareTo(p.key.toLowerCase());
  }

  @Override
  public String toString() {
    return "(" + key + ", " + value +")\n";
  }
}
