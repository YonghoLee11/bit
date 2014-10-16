package java02;

public class ArgCalc {
	
	private int money;
	private int num;
	private int byeMoney;
	
	private int se1Val = 2000;
	private int se2Val = 1500;
	
	int getNum(){
		return this.num;
	}
	
	int getMoney(){
		return this.money;
	}
	
	int getBuyMoney(){
		return this.byeMoney;
	}
	
	void plusNum(int value){
		this.num += value;
	}
	
	void plusMoney(int value){
		this.money += value;
	}
	
	void seCompute(int seller,int number){
		
		this.num -= number;
		if(seller==1){
		this.money += (se1Val*number);
		}if(seller==2){
		this.money += (se2Val*number);
		}
	}	
	
	void cuCompute(int number, int seller){
		this.num += number;
		
		
		if(seller==1){
			this.money -= (se1Val*number);
			this.byeMoney = (se1Val*number); 
		}if(seller==2){
			this.money -= (se2Val*number);
			this.byeMoney = (se1Val*number);
		}
	}

}
