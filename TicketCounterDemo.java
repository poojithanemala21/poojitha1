package samp;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TicketCounterDemo {

	public static void main(String[] args) {
		Queue <String> q= new ArrayDeque();
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String s4=sc.nextLine();
		q.add(s1);
		q.add(s2);
		q.add(s3);
		q.add(s4);
		System.out.println(q);
		while(!q.isEmpty()) {
			String s=q.poll();
			System.out.println("Current ticket holder:"+s);
			System.out.println("Ticket recieved customer:"+q);
			
		}
		System.out.println("All tickets served");
		
				;
		
		

	}

}
