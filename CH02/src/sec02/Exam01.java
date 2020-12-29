package sec02;


public class Exam01 {

	public static void main(String[] args) {
		//정수 타입의 종류를 알아보자
		byte var1 = 10; //8bit(-128 ~ 127)
		short var2 = 10; //16bit(-2^15 ~ +2^15-1)
		int var3 = 10; //32bit(-2^31 ~ +2^31-1)
		long var4 = 10000000000L; //64bit(-2^63 ~ +2^63-1) , 뒤에 L을 붙여 long type명시 (기본integer)
		
		//실수 타입(소수점)의 종류를 알아보자
		float var5 = 3.123456789123456789F;	//32bit, 뒤에 F를 붙여  float타입 명시(기본double)
		double var6 = 3.123456789123456789; //64bit (정밀도 more GOOD)
		
		//문자 타입을 알아보자
		char var7 = 'A';	//하나의 문자를 저장 가능

		//문자열 타입을 알아보자
		String var8 = "ABCDEFG";	//문자열을 저장 가능
		
		//논리타입을(TRUE, FALSE) 알아보자
		boolean var9 = true;
		boolean var10 = false;
		
		
	}

}
