/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> cur=head;
        while(cur!=null){
            LinkedListNode<Integer> nt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nt;
            
        }
        return prev;
	}
}
