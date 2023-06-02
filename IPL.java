import java.util.Stack;

public class IPL
{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class LLStack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }

            int x=head.data;
            head=head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        void displayrev(Node head){
            if(head==null) return;
            displayrev(head.next);
            System.out.print(head.data+" ");
        }

        void display(){
            displayrev(head);
            System.out.println();
        }

        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isempty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args)
    {
        LLStack st=new LLStack();

        st.push(32);
        st.display();
        st.push(223);
        st.display();
        st.push(24);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());

    }
}