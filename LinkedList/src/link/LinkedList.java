package link;

public class LinkedList<E> {
	
	private static class Node<E>{
		private E element;
		private Node<E> next;
		
		public Node(E e,Node<E> n){
			element = e;
			next = n;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public void setNext(Node<E> n){
			next = n;
		}
	}	// end of Node class
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}
	
	public E Last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	
	public void addFirst(E e){
		head = new Node<>(e, head);
		
		if( size == 0) {
			tail = head;
		}
		size++;
	}
	
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		
		if (isEmpty()) {
			head = newest;
		} else {
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if (isEmpty()) return null;
		
		E answer = head.getElement();
		head = head.getNext();
		size--;
		
		if(size == 0) {
			tail = null;
		}
		return answer;
	}
	
	// remove Last
	public void removeLast() {
		
		Node<E> curr = head;
		Node<E> prev = null;
		
		while (curr.getNext() != null) {
			prev = curr;
			curr = curr.getNext();
		}
		
		prev.setNext(null);
		size--;
	}
	
	// addAt
	public void addAt(int index, E e) {
		Node<E> curr = head;
		Node<E> node = new Node<>(e, curr.getNext());
		
		int i = 0;
		while(i <= index) {
			Node<E> af = curr.getNext();
			
			if(i+1 == index) {
				curr.setNext(node);
				node.setNext(af);
			}
			curr = curr.getNext();
			i++;
		}
	}
	
	//removeFrom
	public void removeFrom(int index) {
		Node<E> curr = head;
		Node<E> prev = curr;
		
		int i = 0;
		while(i < index) {
			curr = curr.next;
			
			if (i +1 != index) {
				prev = prev.getNext();
			}
			i++;
		}

		curr = curr.getNext();
		prev.setNext(curr);
			
		size--;
	}
		
	
	public String toString() {
		String output = "";
		Node<E> node = head;
		
		while( node != null) {
			output += node.getElement().toString();
			if (node.getNext() != null) {
				output += ", ";
			}
			node = node.getNext();
		}
		
		return output;
	}
}
