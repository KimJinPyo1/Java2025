package game_simple;

import java.util.Random;

public class Thief extends Enemy {
	int money;
	int reward;
	int winRatio;
	
	Thief(int money, int reward, int winRatio)
	{
		this.money = money;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void Attack(Player player)
	{
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val < 50)
		{
			System.out.println("Thief Win!");
			Damage(player);
		} else
		{
			System.out.println("Player Win!");
			Reward(player);
		}
	}
	
	void Damage(Player player)
	{
		player.money -= money;
	}
	
	void Reward(Player player)
	{
		player.money += reward;
	}
}
