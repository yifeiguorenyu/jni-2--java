package ndk1;

//c访问java中的属性和方法
public class Simple2 {
  private String name="guorenyu";

  
  public static void main(String[] args) {
	  Simple2 simple2 = new Simple2();
	  simple2.changeName();
	  System.out.println(simple2.name);
}
  
  public native void changeName() ;
  static {
	  System.load("F:/c#demo/Project2/x64/Debug/Project2.dll");
  }
}
