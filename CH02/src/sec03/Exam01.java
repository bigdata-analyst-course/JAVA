package sec03;

public class Exam01 {
	public static void main(String[] args) {
		//Type변환에 대해서 알아보자
		
		//범위가 더 작은 변수는 상위 변수에 저장할 수 있음(자동 형변환 됨)	
		byte var1 = 10;
		short var2 = var1;
		int var3 = var1;
		long var4 = var1;	
		
		//범위가 더 큰 변수는 하위 변수에 저장할 수 없음(형변환 필요)
		//원래 값이 보존되면서 변환이 되어야함(하위 변수 범위에 맞춰서)
		long var5 = 200;
		int var6 = (int)var5;
		short var7 = (short)var5;	
		byte var8 = (byte)var5;

		//문자열을 정수 or 실수로 변환(!!!중요!!!)
		String var9 = "300";
		int var10 = Integer.parseInt(var9); //문자열이 정수로 변환됨
		
		String var11 = "300.7";
		double var12 = Double.parseDouble(var11); //문자열이 실수로 변환됨
		
		
	}
}
