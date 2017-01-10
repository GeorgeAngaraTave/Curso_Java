package BreakContinue;

import Anid.Lampara;
import Anid.Lampara.Foco;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		/*while(num<20){
			System.out.println(num);
			if(num == 10){
				break;
			}
			num++;
		}*/
		
		for (int i = 0; i < 10; i++) {
			System.out.println("1");
			System.out.println("2");
			break;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("3");
			System.out.println("4");
			continue;
		}
	}
	
}
