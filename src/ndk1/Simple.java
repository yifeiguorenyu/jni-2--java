package ndk1;

public class Simple {
	//头文件的生成 cmd --->cd 到当前目录 
	//2  生成jni头文件 cd 到src文件中        javah -d ../jni -jni  ndk1.Simple  生成了一个.h文件
	// 3 将文件复制到 visual studio中生成dll文件
	// jni.h jin_md.h文件地址 %java_path%include   %java_path%include/win32
	// 在vs中实现头文件里的方法
	//生成dll文件
	//java system.load(xxx.dll)
	//生成dll visual studio 中 调试--->属性--->常规 ------>项目默认值---->配置类型----->应用程序--->动态库(.dll)
	//visual studio 生成--->配置管理器---->选择平台(x64)
	//visual studio 生成--->生成解决方案
	//java中system.load()
	//jnienv 这个是c和java相互调用的桥梁
//	public static void main(String[] args) {
//		String signuture = new Simple().getStirngnaturePassword();
//		System.out.println("秘钥="+signuture);
//	}
	
	//写好本地的native方法 从dll中拿到
	public static native String getStirngnaturePassword() ;
	
	//静态方法
	//System.load 加载服务器上或者别的地方的动态库
	//System.loadlibrary 加载apk中的动态库
	static {
		System.load("F:/c#demo/Project2/x64/Debug/Project2.dll");
	}
}
