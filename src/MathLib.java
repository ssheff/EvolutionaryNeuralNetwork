
public class MathLib {
	public static double[] vectorSum(double[] a, double[] b) {
		if (a.length != b.length) {
			System.out.println("Attempting to add arrays of incompatible dimension");
			return null;
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i] += b[i];
		}
		
		return a;
	}
	
	public static void printVector(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}
	
	// activation function
	public static double sigmoid(double x) {
		return 1/(1+Math.exp(-x));
	}
}