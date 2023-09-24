package s21204;

public class Stest02 {

	public static void main(String[] args) {
		
		int sum = 0;											// 변수 생성
		for(int cnt=0;cnt<=10; cnt++) {						// for문 시작
			sum= sum+cnt;									// 더하기
			System.out.println(" cnt:"+cnt+" sum:"+sum);	// 결과 값1
		}													// for문 끝
		System.out.println(" sum:"+sum);					// 결과 값2
	}
}
