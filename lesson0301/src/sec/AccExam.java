package sec;

public class AccExam {

	public static void main(String[] args) {
		/*
		 * 사과가 1있다. 이사과를 10조각으로 나눈다.
		 * 한조각은 0.1
		 * 7조각을 먹고 남은 조각은 몇인가?
		 * 0.3
		 * */
		int apple =1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number*onePeace;
		System.out.println("사과 한개에서 남은 양은" + resultApple + "입니다.");   // 0.2999999999999
		
		
		int totalpeace = apple * 10;
		int resultApple2 = totalpeace - number;
		System.out.println("사과 10조각 중에 남은 조각은 " + resultApple2);
		System.out.println("사과 한개에서 남은양은 "  + resultApple2/10.0);
		
		

	}

}
