package lab08treespt1pt2sum18testers;


/**
   Programmed by    Stephen Brower
   Updated by       Linda Yang

   Purpose          To Test remove() method - condition 1
                    - cursor is null - target not found
                    meaning:  attempt to remove value not in tree
*/

public class Lab08Part2BTestCarCondition1
{
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2016,"Cruz");
        boolean debug = true;
        int sizeBeforeAction = 6, sizeAfterAction = 6;

        System.out.println("========Test Condition 1 - not there");

        myTree.add(new Car(2016,"Explorer"));
        myTree.add(new Car(2016,"Dodge"));
        myTree.add(new Car(2016,"Malibu"));
        myTree.add(new Car(2016,"Aero"));
        myTree.add(new Car(2016,"Edsel"));
        myTree.add(new Car(2016,"Avalon"));

        System.out.print("Tree before removal (Size == "+myTree.size()+")");
        if (myTree.size() == sizeBeforeAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove))
            System.out.println("\n"+valueToRemove + " removed <<---Issue");
        else
            System.out.println("\n"+valueToRemove + " not removed");

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
========Test Condition 1 - not there
Tree before removal (Size == 6)-Yes
[Car 2016 Aero]
[Car 2016 Avalon]
[Car 2016 Dodge]
[Car 2016 Edsel]
[Car 2016 Explorer]
[Car 2016 Malibu]

[Car 2016 Cruz] not removed
Tree After removal (Size == 6)-Yes
[Car 2016 Aero]
[Car 2016 Avalon]
[Car 2016 Dodge]
[Car 2016 Edsel]
[Car 2016 Explorer]
[Car 2016 Malibu]

BUILD SUCCESSFUL (total time: 0 seconds)

*/