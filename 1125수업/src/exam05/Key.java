package exam05;

public class Key {
	int id;
	
	public Key(int id)
	{
		this.id = id;
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Key)
		{
			Key key = (Key) obj;
			if(this.id == key.id)
			{
				return true;
			}
		}
		return false;
	}

}
