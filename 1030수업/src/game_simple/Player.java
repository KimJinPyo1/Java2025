package game_simple;

public class Player {
	int health;
	int money;
	int food;
	
	Player(int health, int money, int food)
	{
		this.health = health;
		this.money = money;
		this.food = food;
	}
	
	boolean isAlive()
	{
		if(health > 0 && money > 0 && food > 0)
			return true;
		else
			return false;
	}
}
