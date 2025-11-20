package exam2;

public class Test {
	int id;
	
	public Test(int id)
	{
		this.id = id;
	}
	
	public boolean eauals(Object obj)
	{
		if(obj instanceof Test)
		{
			Test t = (Test) obj;
			if(this.id == t.id)
			{
				return true;
			}
		}
		
		return false;
	}

}
