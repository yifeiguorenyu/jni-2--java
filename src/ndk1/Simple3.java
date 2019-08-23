package ndk1;

public class Simple3 {
	public static int age = 50;
 public static void main(String[] args) {
	Simple3 simple3 = new Simple3();
	Simple3.changeage();
	System.out.println("age="+Simple3.age);
}
 
 public static native void changeage();
 static {
	 System.load("F:/c#demo/Project3/x64/Debug/Project3.dll");
 }
}
