// Given a list of coin denominations and a sum, find the minimum number of coins needed to form the sum.

import java.util.*;

public class minimumNoCoins{

	static public int coinChange(int[] coins, int amount) {
        
		int min[] = new int[amount+1];

        for(int i = 1; i < amount+1; i++)
		{
			min[i] = 9999;
		}
    
		if(amount == 0)
		    return 0;

		for(int i = 1; i <= amount; i++)
		{
			for(int j = 0; j < coins.length; j++)
			{
				if(coins[j] <= i && (min[i - coins[j]] + 1 )< min[i])
				{
					min[i] = min[i - coins[j]] + 1;
				}

			}
		}
		if(min[amount] == 9999)
		    return -1;
		return min[amount];
        
    }

	public static void main(String args[])
	{
		int[] coins =  new int[] {1,3,5};
		System.out.println("Minimum number of coins needed - " + coinChange(coins,11));
	}
}