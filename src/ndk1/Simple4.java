package ndk1;

public class Simple4 {
	//c ����java�ķ���
	public static void main(String[] args) {
		new Simple4().callAddMethod();
	}
	
	public  int add(int num1,int num2) {
		System.out.println("122");
		return num1+num2;
	}
	public native void callAddMethod();
	static {
		System.load("F:/c#demo/Project4/x64/Debug/Project4.dll");
	}
}
