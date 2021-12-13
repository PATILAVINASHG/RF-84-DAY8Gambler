package com.gambler;

public class GamblerGame {
	 
	public   static void Gambler() {
		int stake = 100 ;
		int arr[] =new int[30] ;
		int bet = 1;
		
		int won = 0;
		int lost = 0;
		int totalWin = 0;
		int totalLost = 0;

		
		for (int i = 0; i < 30; i++) {
			int stake1 = stake * 50 /100;
			int stake2 = stake + stake1;
		//	System.out.println(stake1 + " -----" +stake2);
			//for (int days = 1; days <= 20; days++) {
				while (stake >  stake1 && stake < stake2) {
					double betCheck = Math.floor(Math.random() * 10) % 2;
					if (betCheck == 1) {
						stake = stake + bet;
					} else {
						stake = stake - bet;
					}
					
	
				}
				int j = i + 1; 
				arr[i] = stake;
				System.out.println(" Day  "+ j  + "of earning "+arr[i] + "$");
				stake = stake + 100;	
			//	int max = arr[0];
				
			}
		int max = arr[0]; int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
		
			if  (max < arr[i]) {
				max = arr[i];	
				min = arr[i];
				
				}
			}
		if (max > 3000) {
			System.out.println(" player should be  playing for next month ");
			}else {
				System.out.println(("player  should not play for next month"));
			}
		System.out.println("maximum money earn on day "+ max+ "$");
		for (int i = 1; i < arr.length; i++) {
			
			if  (min > arr[i]) {
				max = arr[i];	
				min = arr[i];
				}
			}
		
		System.out.println("minimum  money earn on day " +min+ "$");
		
	}
	public static void main(String[] args) {
		// problem from UC-1 to UC-6
		Gambler();
		 	 
	}
}