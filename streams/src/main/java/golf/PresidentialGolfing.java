package golf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PresidentialGolfing {


  private final List<GolfResult> results = new ArrayList<>();

  public void addResult(String name, int... strokes) {
    results.add(new GolfResult(name, strokes));
  }

  public String bestPlayer() {
    return results.stream()
            .sorted(Comparator.comparingInt(GolfResult::minStroke))
            .map(r -> r.getName())
            .limit(1)
            .collect(Collectors.toList())
            .get(0);
  }

  public GolfResult getResult(int i) {
    return results.get(i);
  }

  static class GolfResult {
    private String name;
    private int[] strokes;

    public GolfResult(String name, int[] strokes) {
      this.name = name;
      this.strokes = strokes;
    }

    public String getName() {
      return name;
    }

    public int[] getStrokes() {
      return strokes;
    }

    public int minStroke() {
      Arrays.sort(strokes);
      return strokes[0];
    }
  }


}
