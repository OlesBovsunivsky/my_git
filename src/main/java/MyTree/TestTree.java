package MyTree;

import java.util.ArrayList;

public class TestTree {

    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<Integer>();

        tree.add(47);
        tree.add(17514);
        tree.add(1457);
        tree.add(25457);
        tree.add(1440);
        tree.add(11);

        tree.print();



    }

    private static void testPrint(ArrayList list){
        list.isEmpty();
    }
}
