package converter.util;

public class F_to_C {
	public double fIn;
	public double cOut;
	
	public F_to_C() {
		fIn = 0;
		cOut = 0;
	}
	
	public double ftoC(double x){
		fIn = x;
		cOut = ((fIn-32)*(5D / 9D));
		return cOut;
	}
}