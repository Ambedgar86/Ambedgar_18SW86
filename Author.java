class Author
{
	String name;
	String email;
	char gender;
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return("Auther[name="+name+"  ,  "+"Email"+email+"  ,  "+"gender="+gender+"]");
	}
}
class UseAuthor
{
	public static void main(String[] args) {
		Auther auth=new Auther("Ambedgar Omgar","ambedgaromgar7866@gmail.com",'m');
		System.out.println(auth.toString());
	}
}