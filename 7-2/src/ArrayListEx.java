import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i=0; i<6; i++) { // 입력받은 점수 ArreyList에 삽입
			String s = scanner.next();
			a.add(s);			
		}
		double sum = 0; //총점 초기화
		for(int i=0; i<6; i++) { //입력 받은 점수 출력
			String grade = a.get(i);
			switch(grade) { //학점을 점수로 변환
			case "A":
				sum +=4.0;
				break;
			case "B":
				sum +=3.0;
				break;
			case "C":
				sum +=2.0;
				break;
			case "D":
				sum +=1.0;
				break;
			case "F":
				sum +=0;
				break;
			default :
				System.out.println("성적을 잘못 입력하셨습니다.");
			}			
		}
		System.out.println(sum/6); // 평균값 출력
		scanner.close();
	}

}
