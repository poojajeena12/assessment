package java4;
    import java.util.*;

//    question 7. Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(),
// isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))


class StackElement{
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> linkedList = new LinkedList<>();
    int minimum = Integer.MAX_VALUE;
    int count=0;
    void pushElement(){
        int element = sc.nextInt();
        linkedList.push(element);
    }
    void popElement(){
        System.out.println("Element popped = " + linkedList.getFirst());
        linkedList.pop();
    }
    void MinElement() {
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            if ((Integer) iterator.next() < minimum) {
                minimum = (Integer) iterator.next();
            }
            count++;
        }
        System.out.println("Minimum element is : " + minimum);
    }
    boolean isEmpty(){
        return linkedList.isEmpty();
    }
    void isFull(){
        if (linkedList.size()==count){
            System.out.println("isFull : true");
        }
        else
            System.out.println("isFull : false");
    }
}

class SpecialStack {
    public static void main(String[] args) {

        StackElement se = new StackElement();

        System.out.println("Enter size of stack : ");
        int n = se.sc.nextInt();

        System.out.println("Enter stack elements : ");
        for (int i = 0; i < n; i++) {
            se.pushElement();
        }

        se.popElement();
        System.out.println("Stack  " + se.linkedList);
        se.MinElement();
        System.out.println("IsEmpty : " + se.isEmpty());
        se.isFull();
        }
    }

