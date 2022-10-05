package test;

class Cal_area {
	int r = 10, l = 4, w = 5, h = 6, area;
	double volume;

}

public class class01 {


	public static void main(String[] args) {

		Cal_area cal = new Cal_area();

		System.out.println("半徑 = " + cal.r);
		System.out.println("球型體積 = " + (4 / 3) * 3.14159 * cal.r * cal.r * cal.r);
		System.out.println("長 = " + cal.l);
		System.out.println("寬 = " + cal.w);
		System.out.println("高 = " + cal.h);
		cal.area = (cal.l * cal.w + cal.h * cal.w + cal.l * cal.h) * 2;
		System.out.println("立方體表面積 = " + cal.area);

	}

}
