import java.util.*;

public class CallCenterDemo {

	public static void main(String[] args) {
		ArrayDeque <String> q=new ArrayDeque();
		Scanner sc=new Scanner(System.in);
		String call1=sc.nextLine();
		String call2=sc.nextLine();
		String call3=sc.nextLine();
		q.add(call1);
		q.add(call2);
		q.add(call3);
		System.out.println("call center:"+q);
		while(!q.isEmpty()) {
			String cc=q.poll();
			System.out.println("Current call:"+cc);
		}
		System.out.println("All calls received");
		

	}

}
