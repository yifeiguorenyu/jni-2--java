package ndk1;

public class Simple {
	//头文件的生成 cmd --->cd 到当前目录 
	//2  生成jni头文件        javah -d ../jni -jni  ndk1.Simple  生成了一个.h文件
	// 3 将文件复制到 visual studio中生成dll文件
	// jni.h jin_md.h文件地址 %java_path%include   %java_path%include/win32
	// 在vs中实现头文件里的方法
	//生成dll文件
	//java system.load(xxx.dll)
	//生成dll visual studio 中 调试--->属性--->常规 ------>目标文件扩展名
	public static void main(String[] args) {
		String signuture = new Simple().getStirngnaturePassword();
		System.out.println("秘钥="+signuture);
	}
	
	//写好本地的native方法 从dll中拿到
	public native String getStirngnaturePassword() ;
}
