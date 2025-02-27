package p1;

public class A {
   public int pub = 0;
   private int pri = 0;
   protected int pro = 0;
   int def = 0;

   public void access() {
      System.out.println(pub);
      System.out.println(pri);
      System.out.println(def);
      System.out.println(pro);
   }
}
