import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> n = new HashMap<String, Integer>();
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α�>> ");;
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			int population = scanner.nextInt();
			n.put(nation, population);			
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			Integer p = n.get(nation);
			if(p == null)
				System.out.println(nation +" ����� �����ϴ�.");
			else
				System.out.println(nation+ "�� �α��� "+ p );
		}
		scanner.close();
	}

}
