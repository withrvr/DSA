// SinglyLinkedList

public class SinglyLinkedList {
	Node head, tail;
	int size = 0;

	class Node {
		int value;
		Node next;

		Node() {
		}

		Node(int value) {
			this.value = value;
			this.next = null;
		}

		Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	void display() {
		if (head == null) {
			System.out.println("::: null :::\n");
			return;
		}

		Node traverse = head;
		while (traverse != null) {
			System.out.print(String.format("%d --> ", traverse.value));
			traverse = traverse.next;
		}
		System.out.println("null");
		System.out.println(String.format("size:%d, head: %d, tail: %d\n", size, head.value, tail.value));
	}

	// --- insert ---
	void insertAtEnd(int value) {
		Node new_node = new Node(value);

		if (head == null) {
			head = tail = new_node;
		} else {
			tail.next = new_node;
			tail = new_node;
		}
		size++;

	}

	void insertAtStart(int value) {
		Node new_node = new Node(value);

		if (head == null) {
			head = tail = new_node;
		} else {
			new_node.next = head;
			head = new_node;
		}

		size++;
	}

	void insertAfter(Node pre_node, int value) {
		if (pre_node == null) {
			System.out.println("::: Can't insert after null node :::");
			return;
		}

		Node new_node = new Node(value);
		new_node.next = pre_node.next;
		pre_node.next = new_node;
		size++;
	}

	// start from one
	void insertAfterPosition(int i, int value) {
		if (i > size || i < 0) {
			System.out.println("::: incorrect index, to insert after :::");
			return;
		} else if (i == 0) {
			insertAtStart(value);
			return;
		}

		Node point = head;

		while (--i > 0) {
			point = point.next;
		}

		Node new_node = new Node(value);
		new_node.next = point.next;
		point.next = new_node;
		size++;
	}

	// --- delete ---
	void deletePosition(int i) {
		if (i > size || i <= 0) {
			System.out.println("::: incorrect index, to delete :::");
			return;
		}
		if (head == null) {
			System.out.println("No nodes to delete");
			return;
		}

		if (i == 1) {
			head = head.next;
		} else {
			Node current = head;
			--i;
			while (--i > 0)
				current = current.next;

			Node temp = current.next.next;
			current.next.next = null;
			current.next = temp;
		}

		size--;
	}

	// --- Search ---
	// index starting from 1
	int search(int value) {
		Node current = head;
		int i = 1;
		while (current != null) {
			if (current.value == value)
				return i;
			current = current.next;
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.display();

		l.insertAtEnd(11);
		l.insertAtEnd(22);
		l.insertAtEnd(33);
		l.display();

		l.insertAtStart(-11);
		l.insertAtStart(-99);
		l.display();

		l.insertAfter(null, 0);
		l.insertAfter(l.head.next.next.next.next.next, 0);
		l.insertAfter(l.head.next, 0);
		l.display();

		l.insertAfterPosition(0, -7777);
		l.display();
		l.insertAfterPosition(1, 77);
		l.display();

		System.out.println("index: " + l.search(33));

		l.deletePosition(0);
		l.deletePosition(987);
		l.deletePosition(6);

		l.display();
	}
}
