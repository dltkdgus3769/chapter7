import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String city;
	private int a; //경도
	private int b; //위도
		
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
		System.out.println("도시,경도,위도를 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			int a = Integer.parseInt(st.nextToken().trim());
			int b = Integer.parseInt(st.nextToken().trim());
			
			
			Location lo = new Location(city,a,b);
			dept.put(city,lo); //해시맵에 저장
		}			
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			String city = it.next(); // 도시 알아냄
			Location lo = dept.get(city); // 도시 이름을 키로하여 해시맵으로 Location 객체 얻어냄
			System.out.println(lo.getcity()+" "+lo.geta()+" "+lo.getb());
		}	
		System.out.println("---------------------------");
	}

	private void processQuery() {
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = scanner.nextLine(); // 도시 이름 입력
			if(city.equals("그만"))
				return; // 종료
			
			Location lo = dept.get(city); // 해시맵에서 이름을 키로 검색
			if(lo == null) { // 이름이 해시맵에 없다면
				System.out.println(city + "는 없습니다.");
			}
			else { // 해시맵에서 검색된  Location 객체
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

