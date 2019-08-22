package ndk1;

public class Simple {
	//头文件的生成 cmd --->cd 到当前目录 
	//2  生成jni头文件        javah -d ../jni -jni  ndk1.Simple  生成了一个.h文件
	// 3 将文件复制到 visual studio中生成dll文件
	public static void main(String[] args) {
		String signuture = new Simple().getStirngnaturePassword();
		System.out.println("秘钥="+signuture);
	}
	
	//写好本地的native方法 从dll中拿到
	public native String getStirngnaturePassword() ;
}
