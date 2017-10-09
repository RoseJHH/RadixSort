/**
 * Created by rosejh on 10/9/17.
 */
public class LList {
    public node first = null;
    public node last = null;
    public int count;
    public int result = 0;

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public void add(int a) {
        if (isEmpty()) {
            first = new node(a);
            last = first;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = new node(a);

        }


    }

    public void print() {
        node t = first;
        while (t != null) {
            t.printNode();
            t = t.next;
        }
    }

    public int find(String words) {
        if (!isEmpty()) {
            result = 0;
            node check = first;
            node pin = first;
            char word;
            while (pin != null) {
                count = 0;
                for (int i = 0; i < words.length(); i++) {
                    word = words.charAt(i);
                    if (word != check.a) {
                        break;
                    } else {
                        count++;
                    }
                    check = check.next;
                }
                if (count == words.length()) {
                    result++;
                }
                pin = pin.next;
                check = pin;
            }
        }
        return result;
    }
    public void enqueue(int a){
        add(a);
    }

    public String dequeue(){
        String a = first.a+"";
        if(!isEmpty()){
            first=first.next;
        }else System.out.print("Empty");
        return a;
    }
}
