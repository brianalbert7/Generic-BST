package lab08treespt1pt2sum18testers;

/**
   Purpose          To Test remove() method - condition 3
                    node removed is not at root and has no left child
                    5/6/2018  - added check for size
*/

public class Lab08Part2D1TestCarCondition3A
{
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2018,"Aero");
        boolean debug = true;
        int sizeBeforeAction = 6, sizeAfterAction = 5;

        System.out.println("========Test Condition 3a - no left, use parent's left");

        myTree.add(new Car(2018,"Explorer"));
        myTree.add(new Car(2018,"Dodge"));
        myTree.add(new Car(2018,"Malibu"));
        myTree.add(new Car(2018,"Aero"));
        myTree.add(new Car(2018,"Edsel"));
        myTree.add(new Car(2018,"Avalon"));

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
========Test Condition 3a - no left, use parent's left
Tree before removal (Size == 6)-Yes
[Car 2018 Aero]
[Car 2018 Avalon]
[Car 2018 Dodge]
[Car 2018 Edsel]
[Car 2018 Explorer]
[Car 2018 Malibu]

[Car 2018 Aero] removed
Tree After removal (Size == 5)-Yes
[Car 2018 Avalon]
[Car 2018 Dodge]
[Car 2018 Edsel]
[Car 2018 Explorer]
[Car 2018 Malibu]

BUILD SUCCESSFUL (total time: 0 seconds)



*/