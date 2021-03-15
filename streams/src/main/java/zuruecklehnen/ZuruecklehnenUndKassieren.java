package zuruecklehnen;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// Siehe https://autoweird.fm/2019/09/22/folge-70-heise-kommentarspalte/
// https://www.heise.de/forum/heise-Developer/Kommentare/Ich-oeffne-die-Buechse-der-Pandora-Interview-mit-Alberto-Brandolini/Kraftausdruecke-und-Bullshit-Bingo-hat-nichts-mit-der-Realitaet-zu-tun/posting-35147470/show/
public class ZuruecklehnenUndKassieren {


  private int[] ziehung;


  public void ziehen(Random r) {
    int[] q = IntStream.generate(() -> r.nextInt(49) + 1)
            .distinct()
            .limit(6)
            .toArray();
    ziehung = q;
  }

  // Hier stimmt etwas nicht!
  public void print(Printer<Integer> p) {
    Arrays.stream(ziehung).map(p::print);
  }


}
