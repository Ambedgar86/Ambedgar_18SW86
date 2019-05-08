class Square
{
	public void area(int side)
	{
		System.out.println("Area of a square is:"+ (side*side));
	}
	public void area(int length,int breadth)
	{
		System.out.println("Area of Rectangle is:"  +(length*breadth));
	}
}
class Usesquare
{
	public  static void main(String[] args)
	{
		Square sq=new Square();
		sq.area(6);
		sq.area(5,8);
	}

}