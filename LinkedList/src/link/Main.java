package link;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>();

		l.addFirst(25);
		l.addLast(20);
		l.addLast(15);
		l.addFirst(30);
		l.addLast(10);
		l.removeFirst();
//		l.removeLast();
		l.addAt(1, 5);
		System.out.println(l.toString());
		l.removeFrom(4);
		System.out.println(l.toString());
	}

}
