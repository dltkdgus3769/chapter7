import java.util.Vector;
import java.util.Scanner;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			Integer rain = scanner.nextInt();			
			if(rain == 0) //0�Է½� ���α׷� ����
				break;
			else {
				sum += rain; //������ �ջ�
				v.add(rain); //������ ����
				for(int i =0; i<v.size(); i++) {
					int n = v.get(i);
					//�Է� ���� �������� ���
					System.out.print(n + " "); 					
				}
				System.out.println(" ");
				//��� ����ϱ�
				System.out.println("���� ��� "+ (int)sum/v.size());
			}
		}
		scanner.close();
	}
}
