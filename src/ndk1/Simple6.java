package ndk1;

import model.Point;

public class Simple6 {
	//c层构建java对象
	public static void main(String[] args) {
		Point point = createPoint();
		System.out.println("point.x="+point.getX()+"point.y="+point.getY());
	
	}
	
	
	private native static Point createPoint();
	static {
		System.load("F:/c#demo/Project7/x64/Debug/Project7.dll");
	}
}
