package by.jb29.mod1.les02;


// ����� (� �������� � ��������) ��� ���� ������������ �� ��������� �, b, �.


public class Task29 {

	public static void main(String[] args) {
		
		double a, b, c;
		
		a = 3;
		b = 4;
		c = 5;
		
		double alpha = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
		double beta = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		double gamma = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		
		
		//���� � ��������
		double alphaG = Math.round(Math.toDegrees(alpha));
		double betaG = Math.round(Math.toDegrees(beta));
		double gammaG = Math.round(Math.toDegrees(gamma));
		
		
		//���� � ��������
		double alphaR = Math.toRadians(alphaG);
		double betaR = Math.toRadians(betaG);
		double gammaR = Math.toRadians(gammaG);
		
		System.out.println("���� ����� � ��������: " + alphaG);
		System.out.println("���� ���� � ��������: " + betaG);
		System.out.println("���� ����� � ��������: " + gammaG);
		System.out.println();
		System.out.printf("���� ����� � ��������: %.4f ������", alphaR);
		System.out.println();
		System.out.printf("���� ���� � ��������: %.4f ������", betaR);
		System.out.println();
		System.out.printf("���� ����� � ��������: %.4f ������", gammaR);
		
	}

}
