package sec03;

public class Exam01 {
	public static void main(String[] args) {
		//Type��ȯ�� ���ؼ� �˾ƺ���
		
		//������ �� ���� ������ ���� ������ ������ �� ����(�ڵ� ����ȯ ��)	
		byte var1 = 10;
		short var2 = var1;
		int var3 = var1;
		long var4 = var1;	
		
		//������ �� ū ������ ���� ������ ������ �� ����(����ȯ �ʿ�)
		//���� ���� �����Ǹ鼭 ��ȯ�� �Ǿ����(���� ���� ������ ���缭)
		long var5 = 200;
		int var6 = (int)var5;
		short var7 = (short)var5;	
		byte var8 = (byte)var5;

		//���ڿ��� ���� or �Ǽ��� ��ȯ(!!!�߿�!!!)
		String var9 = "300";
		int var10 = Integer.parseInt(var9); //���ڿ��� ������ ��ȯ��
		
		String var11 = "300.7";
		double var12 = Double.parseDouble(var11); //���ڿ��� �Ǽ��� ��ȯ��
		
		
	}
}
