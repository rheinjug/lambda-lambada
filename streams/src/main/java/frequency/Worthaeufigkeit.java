package frequency;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Worthaeufigkeit {

    public static void main(String[] args) {
      if (args.length != 1) {
        System.out.println("Requires exactly one filename");
        System.exit(-1);
      }
      Path file = Path.of(args[0]);

      Map<String, Long> frequency = new HashMap<>();

      try (Stream<String> words = new Scanner(file).tokens()) {



        /* frequency =  mit Hilfe von Streams implementieren */

      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println(frequency);
    }
}
