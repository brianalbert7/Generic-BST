package lab08treespt1pt2sum18testers;

/**
 * 5/6/2018  - added check for size
 * pillaged from Lab07TestCarCondition3A but to use parent's right
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 * updated by Linda Yang
 */
public class Lab08Part2D2TestCarCondition3B
{
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2018,"Edsel");
        boolean debug = true;
        int sizeBeforeAction = 7, sizeAfterAction = 6;

        System.out.println("========Test Condition 3b - no left, use parent's right");

        myTree.add(new Car(2018,"Explorer"));
        myTree.add(new Car(2018,"Dodge"));
        myTree.add(new Car(2018,"Malibu"));
        myTree.add(new Car(2018,"Aero"));
        myTree.add(new Car(2018,"Edsel"));
        myTree.add(new Car(2018,"Avalon"));
        myTree.add(new Car(2018,"Eieio"));

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
/* sample output is:
run:
========Test Condition 3b - no left, use parent's right
Tree before removal (Size == 7)-Yes
[Car 2018 Aero]
[Car 2018 Avalon]
[Car 2018 Dodge]
[Car 2018 Edsel]
[Car 2018 Eieio]
[Car 2018 Explorer]
[Car 2018 Malibu]

[Car 2018 Edsel] removed
Tree After removal (Size == 6)-Yes
[Car 2018 Aero]
[Car 2018 Avalon]
[Car 2018 Dodge]
[Car 2018 Eieio]
[Car 2018 Explorer]
[Car 2018 Malibu]

BUILD SUCCESSFUL (total time: 0 seconds)


*/
