package Problem9;

import java.util.ArrayList;
import java.util.List;

public class NodeTreeSum {

    public static void main(String[] args) {

        /** Visual of Below Example

            n
        /      \
       n1       n2
      /  \     /  \
     n11 n12  n21 n22
      20  2    10  20

         **/


        // children of n1
        Node n11 = new Node(20);
        Node n12 = new Node(2);

        // level 2 [level 1 of n1]
        ArrayList<Node> n1Leve1 = new ArrayList<>();
        n1Leve1.add(n11);
        n1Leve1.add(n12);
        Node n1 = new Node(n1Leve1);


        // children of n2
        Node n21 = new Node(10);
        Node n22 = new Node(20);

        // level 2 [level 1 of n2]
        ArrayList<Node> n2Leve1 = new ArrayList<>();
        n2Leve1.add(n21);
        n2Leve1.add(n22);
        Node n2 = new Node(n2Leve1);


        // level 1
        ArrayList<Node> nLeve1 = new ArrayList<>();
        nLeve1.add(n1);
        nLeve1.add(n2);
        Node n = new Node(nLeve1);


        // Sum of specific node
        System.out.println("Sum Of Node n: " + Node.getSumOfChildrenOfNode(n));

        // These values already accumulated before
        System.out.println("Get Value of Node n1: " + n1.getValue());
        System.out.println("Get Value Of Node n2: " +  n2.getValue());

    }

}


class Node{

    int value;
    List<Node> children;

    public Node(int value) {
        this.value = value;
    }

    public Node(List<Node> children) {
        this.children = children;
    }

    public List<Node> getChildren() {
        return children;
    }

    public int getValue() {
        return value;
    }

    static int getSumOfChildrenOfNode(Node n){
        if(n.getChildren() != null)
            for (Node currentNode : n.getChildren()) {
                n.value +=  getSumOfChildrenOfNode(currentNode);
            }
        return n.value;
    }
}