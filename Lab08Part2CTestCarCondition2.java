package lab08treespt1pt2sum18testers;

/**
   Programmed by    Stephen Brower
   Updated by       Linda Yang

   Purpose          To Test remove() method - condition 2
                    node to be removed is at root and no left child
*/

public class Lab08Part2CTestCarCondition2
{
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2018,"Dodge");
        boolean debug = true;
        int sizeBeforeAction = 4, sizeAfterAction = 3;

        System.out.println("========Test Condition 2 - at root, no left");

        myTree.add(new Car(2018,"Dodge"));
        myTree.add(new Car(2018,"Explorer"));
        myTree.add(new Car(2018,"Malibu"));
        myTree.add(new Car(2018,"Edsel"));

        System.out.print("Tree before removal (Size == "+myTree.size()+")");
        if (myTree.size() == sizeBeforeAction )
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove))
            System.out.println("\n"+valueToRemove + " removed");
        else
            System.out.println("\n"+valueToRemove + " not removed <<---Issue");

        System.out.print("Tree After removal (Size == "+myTree.size()+")");
        if (myTree.size() ==  sizeAfterAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();
        System.out.println();

    }
}
/* output should be:
run:
========Test Condition 2 - at root, no left
Tree before removal (Size == 4)-Yes
[Car 2018 Dodge]
[Car 2018 Edsel]
[Car 2018 Explorer]
[Car 2018 Malibu]

[Car 2018 Dodge] removed
Tree After removal (Size == 3)-Yes
[Car 2018 Edsel]
[Car 2018 Explorer]
[Car 2018 Malibu]

BUILD SUCCESSFUL (total time: 0 seconds)

*/