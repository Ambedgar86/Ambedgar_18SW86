class Traingle
{
	double hyp;
	double prep;
	double base;
	double angle;
	public double getHyp(double angle,double prep)
	{
		double b=Math.toRadians(angle);
		hyp=prep/Math.sin(b);
		return hyp;
	}
	public double getPrep(double angle,double hyp)
	{
		double b= Math.toRadians(angle);
		prep =hyp*Math.sin(b);
		return prep;
	}
	public double getBase(double angle, double hyp)
	{
		double b=Math.toRadians(angle);
		base=hyp*Math.cos(b);
		return base;
	}
	public double getAngle(double prep,double base)
	{
		double xy;xy=prep/base;
		angle=Math.toDegrees(Math.atan(xy));
		return angle;
	}
}
class UseTraingle
{
	public static void main(String[] args) {
		Traingle traingle=new Traingle();
		System.out.println("prep"+traingle.getPrep(30,2));
		System.out.println("Angle of Tan"+traingle.getPrep(2,2));
	}
}