import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		for(int i=0; i<6; i++) { // �Է¹��� ���� ArreyList�� ����
			String s = scanner.next();
			a.add(s);			
		}
		double sum = 0; //���� �ʱ�ȭ
		for(int i=0; i<6; i++) { //�Է� ���� ���� ���
			String grade = a.get(i);
			switch(grade) { //������ ������ ��ȯ
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
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			}			
		}
		System.out.println(sum/6); // ��հ� ���
		scanner.close();
	}

}
