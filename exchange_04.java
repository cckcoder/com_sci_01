public class exchange_04 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int t = a;
    a = b;
    b = t;
    System.out.println("A " + a);
    System.out.println("B " + b);
    System.out.println("A - B " + (a - b));
  }
}
