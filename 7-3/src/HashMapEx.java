import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> n = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구>> ");;
			String nation = scanner.next();
			if(nation.equals("그만"))
				break;
			int population = scanner.nextInt();
			n.put(nation, population);			
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만"))
				break;
			Integer p = n.get(nation);
			if(p == null)
				System.out.println(nation +" 나라는 없습니다.");
			else
				System.out.println(nation+ "의 인구는 "+ p );
		}
		scanner.close();
	}

}
