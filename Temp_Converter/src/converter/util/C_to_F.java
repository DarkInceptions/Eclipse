package converter.util;

public class C_to_F {
	
	public double cIn;
	public double fOut;
	
	public C_to_F() {
		cIn = 0;
		fOut = 0;
	}
	
	public double ctof(double x){
		cIn = x;
		fOut = ((cIn * 9D/5D) + 32);
		return fOut;
	}
}