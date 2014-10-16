package java02;

import java.util.Scanner;

public class Apple {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		//구입자
		ArgCalc cu = new ArgCalc();
		
		//상인1
		ArgCalc se1 = new ArgCalc();
		
		//상인2
		ArgCalc se2 = new ArgCalc();
		
		
		cu.plusNum(0);
		se1.plusNum(30);
		se2.plusNum(20);
		
		cu.plusMoney(30000);
		se1.plusMoney(10000);
		se2.plusMoney(10000);
		
		System.out.println("누구에게 구입하시겠습니까?");
		int seller = scan.nextInt();
		
		System.out.println("몇개를 구입하시겠습니까?");
		int num = scan.nextInt();
		
		if(seller==1){
			se1.seCompute(seller,num);
			cu.cuCompute(num,seller);
		}else{
			se2.seCompute(seller,num);
			cu.cuCompute(num,seller);
		}
		
		/*System.out.println(seller +"   " +num);*/	
		
		System.out.printf("고객 %d , %s \n",cu.getNum(),cu.getMoney());
		System.out.printf("판매자1 %d , %s \n",se1.getNum() ,se1.getMoney());
		System.out.printf("판매자2 %d , %s \n",se2.getNum() ,se2.getMoney());
		
	}

}
