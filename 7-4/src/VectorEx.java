import java.util.Vector;
import java.util.Scanner;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			Integer rain = scanner.nextInt();			
			if(rain == 0) //0입력시 프로그램 종료
				break;
			else {
				sum += rain; //강수량 합산
				v.add(rain); //강수량 삽입
				for(int i =0; i<v.size(); i++) {
					int n = v.get(i);
					//입력 받은 강수량들 출력
					System.out.print(n + " "); 					
				}
				System.out.println(" ");
				//평균 출력하기
				System.out.println("현재 평균 "+ (int)sum/v.size());
			}
		}
		scanner.close();
	}
}
