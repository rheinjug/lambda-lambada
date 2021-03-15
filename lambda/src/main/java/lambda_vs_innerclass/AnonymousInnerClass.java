package lambda_vs_innerclass;

public class AnonymousInnerClass {


  public void run1() {
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Viel Code zu schreiben für einen Thread :-/");
      }
    }).start();
  }

  public void run2() {
    new Thread(() -> { System.out.println("Besser :-)"); }).start();
  }

  public static void main(String[] args) {
    AnonymousInnerClass code = new AnonymousInnerClass();
    code.run1();
    code.run2();
  }


}
