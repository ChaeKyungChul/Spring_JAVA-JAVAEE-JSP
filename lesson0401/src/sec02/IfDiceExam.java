package sec02;

public class IfDiceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int) (Math.random()*6+1);
			if(num ==1 ) {
				System.out.println("1腰戚 蟹尽柔艦陥.");
			}else  if(num == 2) {
				System.out.println("2腰戚 蟹甚柔艦陥.");
			}else  if(num == 3) {
				System.out.println("3腰戚 蟹甚柔艦陥.");
			}else  if(num == 4) {
				System.out.println("4腰戚 蟹甚柔艦陥.");
			}else  if(num == 5) {
				System.out.println("5腰戚 蟹甚柔艦陥.");
			}
			
			switch(num) {
			case 1:
				System.out.println("1腰戚 蟹甚柔艦陥.");
				break;
			case 2:
				System.out.println("2腰戚 蟹甚柔艦陥.");
				break;
			case 3:
				System.out.println("3腰戚 蟹甚柔艦陥.");
				break;
			case 4:
				System.out.println("4腰戚 蟹甚柔艦陥.");
				break;
			case 5:
				System.out.println("5腰戚 蟹甚柔艦陥.");
				break;
			case 6:
				System.out.println("6腰戚 蟹甚柔艦陥.");
				break;
			default:
				System.out.println("けいしけいし");
					
			}	
		
	}

}
