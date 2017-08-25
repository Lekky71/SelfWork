package selfwork;

public class Matrices {
	public double determinant(double a11,double a12, double a13,
			double b11,double b12,double b13,double c11,double c12, double c13){
		double a1 = a11 , a2 = a12 ,  a3 = a13 ;
		double b1 = b11,b2 = b12, b3 = b13,c1 =c11, c2 =c12, c3 =c13 ;
		double det = 0;
		det = ( a1*((b2*c3)-(b3*c2)) - a2*((b1*c3)-(b3*c1)) + a3*((b1*c2)-(b2*c1)) );
		return det ;
	}
	public String transpose(double a11,double a12, double a13,
			double b11,double b12,double b13,double c11,double c12, double c13){
		double a1 = a11 , a2 = a12 ,  a3 = a13 ;
		double b1 = b11,b2 = b12, b3 = b13,c1 =c11, c2 =c12, c3 =c13 ;
		return String.format(" %s %s %s\n\n %s %s %s\n\n %s %s %s", a1,b1,c1,a2,b2,c2,a3,b3,c3);

}
}
