class Node{
    int value;
    Node next;
    
    Node(int val){
        this.value = val;
        this.next = null;
    }
    
    public void print(Node node) {
        while(node != null){
            System.out.print(node.value+" ");
            node = node.next;
        }
    }
    
    public Node reverse(Node node){
        Node prev = null;
        Node next = null;
        
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
public class ReverseHalfLinkedList
{
	public static void main(String[] args) {
	    Node list =  new Node(5);
	    list.next =  new Node(10);
	    list.next.next =  new Node(15);
	    list.next.next.next =  new Node(20);
	    list.next.next.next.next =  new Node(25);
	    
	    list.print(list);
	    System.out.println();
	   
	    Node slow = list;
	    Node fast = list;
	    
	    Node mid = null;
	    while(slow != null && fast != null && fast.next != null){
	        mid = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    Node rev = list.reverse(mid.next);
	    mid.next = rev;
	    list.print(list);
	}
}
