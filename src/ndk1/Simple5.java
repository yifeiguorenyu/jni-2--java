package ndk1;

import java.util.UUID;

public class Simple5 {
	public static void main(String[] args) {
		Simple5.callGetUuid();
	}
	private static String getUuid() {
		return UUID.randomUUID().toString();
	}
	private native static void callGetUuid();
	static {
		System.load("F:/c#demo/Project5/x64/Debug/Project5.dll");
	}
}
