package ndk1;

public class Simple {
	//ͷ�ļ������� cmd --->cd ����ǰĿ¼ 
	//2  ����jniͷ�ļ�        javah -d ../jni -jni  ndk1.Simple  ������һ��.h�ļ�
	// 3 ���ļ����Ƶ� visual studio������dll�ļ�
	public static void main(String[] args) {
		String signuture = new Simple().getStirngnaturePassword();
		System.out.println("��Կ="+signuture);
	}
	
	//д�ñ��ص�native���� ��dll���õ�
	public native String getStirngnaturePassword() ;
}
