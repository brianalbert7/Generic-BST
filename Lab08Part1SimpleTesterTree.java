package lab08treespt1pt2sum18testers;

/**
   Programmed by    Stephen Brower
   Updated by       Linda Yang

   Note - The Tree is the Tree<E> you will create for Lab 8 and will update for lab 9

   Purpose          To Test adding to a binary search tree
*/

public class Lab08Part1SimpleTesterTree
{
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();

        System.out.println("========Simple Tester - Test add()");

        myTree.add(new Car(2018,"Edsel"));
        myTree.add(new Car(2018,"Dodge"));
        myTree.add(new Car(2018,"Malibu"));
        myTree.add(new Car(2018,"Explorer"));
        myTree.add(new Car(2018,"Aero"));
        myTree.add(new Car(2018,"Camaro"));
        myTree.add(new Car(2018,"Neon"));

        System.out.println("Tree after 7 adds (Size == "+myTree.size()+")");
        myTree.printTree();
    }
}

/* output should be:
run:
========Simple Tester - Test add()
Tree after 7 adds (Size == 7)
[Car 2018 Aero]
[Car 2018 Camaro]
[Car 2018 Dodge]
[Car 2018 Edsel]
[Car 2018 Explorer]
[Car 2018 Malibu]
[Car 2018 Neon]
BUILD SUCCESSFUL (total time: 0 seconds)



*/