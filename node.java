/**
 * Created by rosejh on 10/9/17.
 */
public class node {
    public int a;
    node next;
    public node(int p){
        this.a = p;
        next = null;
    }

    public void printNode(){
        System.out.print(a+"|");
    }
}
