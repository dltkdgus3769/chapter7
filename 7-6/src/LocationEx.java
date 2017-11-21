import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String city;
	private int a; //�浵
	private int b; //����
		
	public Location(String city,int a, int b) {
		this.city = city;
		this.a = a;
		this.b = b;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getcity() {
		return city;
	}
	public void seta(int a) {
		this.a = a;
	}
	public int geta() {
		return a;
	}
	public void setb(int b) {
		this.b = b;
	}
	public int getb() {
		return b;
	}
}

public class LocationEx {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			int a = Integer.parseInt(st.nextToken().trim());
			int b = Integer.parseInt(st.nextToken().trim());
			
			
			Location lo = new Location(city,a,b);
			dept.put(city,lo); //�ؽøʿ� ����
		}			
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			String city = it.next(); // ���� �˾Ƴ�
			Location lo = dept.get(city); // ���� �̸��� Ű���Ͽ� �ؽø����� Location ��ü ��
			System.out.println(lo.getcity()+" "+lo.geta()+" "+lo.getb());
		}	
		System.out.println("---------------------------");
	}

	private void processQuery() {
		while(true) {
			System.out.print("���� �̸� >> ");
			String city = scanner.nextLine(); // ���� �̸� �Է�
			if(city.equals("�׸�"))
				return; // ����
			
			Location lo = dept.get(city); // �ؽøʿ��� �̸��� Ű�� �˻�
			if(lo == null) { // �̸��� �ؽøʿ� ���ٸ�
				System.out.println(city + "�� �����ϴ�.");
			}
			else { // �ؽøʿ��� �˻���  Location ��ü
				System.out.println(lo.getcity()+" "+lo.geta()+" "+lo.getb());
			}
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	public static void main (String[] args) {
		LocationEx loc = new LocationEx();
		loc.run();
	}
}

