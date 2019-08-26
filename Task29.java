package by.jb29.mod1.les02;


// Ќайти (в радианах в градусах) все углы треугольника со сторонами а, b, с.


public class Task29 {

	public static void main(String[] args) {
		
		double a, b, c;
		
		a = 3;
		b = 4;
		c = 5;
		
		double alpha = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
		double beta = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		double gamma = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		
		
		//углы в градусах
		double alphaG = Math.round(Math.toDegrees(alpha));
		double betaG = Math.round(Math.toDegrees(beta));
		double gammaG = Math.round(Math.toDegrees(gamma));
		
		
		//углы в радианах
		double alphaR = Math.toRadians(alphaG);
		double betaR = Math.toRadians(betaG);
		double gammaR = Math.toRadians(gammaG);
		
		System.out.println("”гол альфа в градусах: " + alphaG);
		System.out.println("”гол бета в градусах: " + betaG);
		System.out.println("”гол гамма в градусах: " + gammaG);
		System.out.println();
		System.out.printf("”гол альфа в радианах: %.4f радиан", alphaR);
		System.out.println();
		System.out.printf("”гол бета в радианах: %.4f радиан", betaR);
		System.out.println();
		System.out.printf("”гол гамма в радианах: %.4f радиан", gammaR);
		
	}

}
