package ndk1;

public class Simple {
	//ͷ�ļ������� cmd --->cd ����ǰĿ¼ 
	//2  ����jniͷ�ļ� cd ��src�ļ���        javah -d ../jni -jni  ndk1.Simple  ������һ��.h�ļ�
	// 3 ���ļ����Ƶ� visual studio������dll�ļ�
	// jni.h jin_md.h�ļ���ַ %java_path%include   %java_path%include/win32
	// ��vs��ʵ��ͷ�ļ���ķ���
	//����dll�ļ�
	//java system.load(xxx.dll)
	//����dll visual studio �� ����--->����--->���� ------>��ĿĬ��ֵ---->��������----->Ӧ�ó���--->��̬��(.dll)
	//visual studio ����--->���ù�����---->ѡ��ƽ̨(x64)
	//visual studio ����--->���ɽ������
	//java��system.load()
	//jnienv �����c��java�໥���õ�����
//	public static void main(String[] args) {
//		String signuture = new Simple().getStirngnaturePassword();
//		System.out.println("��Կ="+signuture);
//	}
	
	//д�ñ��ص�native���� ��dll���õ�
	public static native String getStirngnaturePassword() ;
	
	//��̬����
	//System.load ���ط������ϻ��߱�ĵط��Ķ�̬��
	//System.loadlibrary ����apk�еĶ�̬��
	static {
		System.load("F:/c#demo/Project2/x64/Debug/Project2.dll");
	}
}
