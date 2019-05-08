class Static
{
	static int number;
	private static String name;
	static double num;
	public static String func(String name)
	{
		return name;
	}
}
	class Usestatic
	{
		public static void main(String[] args) 
		{
			Static ss=new Static();
			Static.number=198;
			Static.num=523.5;
			//Static.name="Ambedgar";
			System.out.println(Static.func("Ambedgar")+"  "+Static.num+"   "+Static.number);
			
		}

	}

