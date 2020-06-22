package lab08treespt1pt2sum18testers;

/**
    Programmed by    Stephen Brower
    Updated by       Linda Yang

    Note - The Tree is the Tree<E> you created for Lab 6 and updated for lab 7

    Purpose          To Test remove() method when tree is empty
*/

public class Lab08Part2ATestCarWhenEmptyTree
{
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2016,"Explorer");

        boolean debug = true;
        int sizeBeforeAction = 0, sizeAfterAction = 0;

        System.out.println("========Test Condition 0 - tree is empty");

        System.out.print("Tree before removal (Size == "+myTree.size()+")");
        if (myTree.size() == sizeBeforeAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();


        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove))
            System.out.println(" "+valueToRemove + " removed <<---Issue");
        else
            System.out.println(" "+valueToRemove + " not removed");

        System.out.print("Tree After removal (Size == "+myTree.size()+")");
        if (myTree.size() == sizeAfterAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();

    }
}
/* output should be:
run:
========Test Condition 0 - tree is empty
Tree before removal (Size == 0)-Yes
empty
 [Car 2016 Explorer] not removed
Tree After removal (Size == 0)-Yes
empty
BUILD SUCCESSFUL (total time: 0 seconds)


*/