package basics;

public class Methodsprblm {

	public static void main(String[] args) {
			Methodsprblm m=new Methodsprblm();
			m.circle();
			m.square(4);
			m.rectangle(5, 8);
			m.triangle();
			

	}
	//withoout returntype without parameters area of circle
	
	public void circle()
	{
		double a=3.14;
		int r=4;
		double area=a*r*r;
		System.out.println(area);
	}
	
	//with returntype with parameter area of square
	
	public int square(int b)
	{
		int areasq=b*b;
		System.out.println(areasq);
		return areasq;
	}
	//without returntype with parameters area of rectangle
	
	public void rectangle(int c,int d)
	{
		int arearec=c*d;
		System.out.println(arearec);
	}
	//with returntype withoutparameters area of triangle
	
	public double triangle()
	{
		int e=4,f=6;
		double g=0.5;
		double areatri=g*e*f;
		System.out.println(areatri);
		return areatri;
	}
	

	
}
