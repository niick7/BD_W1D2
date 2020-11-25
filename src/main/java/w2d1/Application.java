package w2d1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {
  private static final String fileName = "testDataForW1D1.txt";
  private static final String splitBySpaceOrMinusSign = "[\\s-]+";
  private static final String fileExceptionMessage = "An error occurred.";
  private static final String isNumberOrContainUnderscoreMatcherRegex = "[0-9]|_";

  public static void main(String[] args) {
    Mapper mapper = new Mapper();
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while(scanner.hasNext()) {
        String line = scanner.nextLine();
        List<String> wordsInLine = Arrays.asList(line.split(splitBySpaceOrMinusSign));
        for(String word : wordsInLine) {
          word = trimWord(word);
          if(isWord(word))
            mapper.addPairFromKey(word);
        }
      }
      System.out.println(mapper);
    }
    catch(FileNotFoundException e) {
      System.out.println(fileExceptionMessage);
      e.printStackTrace();
    }
  }

  public static String trimWord(String word) {
    word = word.replace(",", "");
    word = word.replace(".", "");
    word = word.replace("\"", "");
    return word;
  }

  public static boolean isWord(String word){
    if ("".equals(word) || Pattern.compile(isNumberOrContainUnderscoreMatcherRegex).matcher(word).find())
      return false;
    return true;
  }
}
