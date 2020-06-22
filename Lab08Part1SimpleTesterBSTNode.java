package lab08treespt1pt2sum18testers;

/**
 * Purpose          To Test remove() method when tree is empty
*/

public class Lab08Part1SimpleTesterBSTNode
{
    public static void main(String args[])
    {
        int results = 0;
        // create 3 nodes for test
        BSTNode<Car> node2 = new BSTNode<Car>(new Car(2018,"Explorer"),null,null);
        BSTNode<Car> node3 = new BSTNode<Car>(new Car(2019,"Foo"),null,null);
        BSTNode<Car> node1 = new BSTNode<Car>(new Car(2017,"Dodge"),node2,node3);
        
        // create some cars
        Car checkCar1 = new Car(2017,"Dodge");
        Car checkCar2 = new Car(2018,"Explorer");
        Car checkCar3 = new Car(2019,"Foo");
        
        Car newCar1 = new Car(1965,"Shelby");
        Car newCar2 = new Car(1973,"Lemans");
        Car newCar3 = new Car(1954,"Edsel");
        
        System.out.println("========Test BSTNode");
        //check data
        System.out.println("\nCheck constructor-data and getData()\n");
        System.out.print("node1.getData()="+node1.getData());
        
        System.out.print("\tcheckCar1="+checkCar1);
        if (node1.getData().equals(checkCar1))
            System.out.println("\tnode1 data checks");            
        else
        {
            results++;
            System.out.println("node1 data <== issue");
        }

        System.out.print("node2.getData()="+node2.getData());
        System.out.print("\tcheckCar2="+checkCar2);
        if (node2.getData().equals(checkCar2))
            System.out.println("node2 data checks");
        else
        {
            results++;
            System.out.println("node2 data <== issue");
        }

        System.out.print("node3.getData()="+node3.getData());
        System.out.print("\tcheckCar3="+checkCar3);
        if (node3.getData().equals(checkCar3))
            System.out.println("node3 data checks");
        else
        {
            results++;
            System.out.println("node3 data <== issue");
        }
        
        // check link
        System.out.println("\nCheck constructor-link and getLink()\n");
        
        //display node1
        System.out.print("node1= "+node1.getData());
        
        //Check left of node1
        if (node1.getLeft() == node2)
            System.out.print("-Left Yes");
        else
        {
            results++;
            System.out.print("-Left XXX << issue");
        }
        
        //Check right of node1
        if (node1.getRight() == node3)
            System.out.println("-Right Yes");
        else
        {
            results++;
            System.out.println("-Right XXX << issue");
        }
        
        //check nodes 2 and 3 to be nulls
        System.out.print("node2= "+node2.getData());
        //Check left of node2
        if (node2.getLeft() == null)
            System.out.print("-Left null Yes");
        else
        {
            results++;
            System.out.print("-Left != null << issue");
        }
        
        //Check right of node2
        if (node2.getRight() == null)
            System.out.println("-Right null Yes");
        else
        {
            results++;
            System.out.println("-Right != null << issue");
        }
        
        System.out.print("node3= "+node3.getData());
        //Check left of node3
        if (node3.getLeft() == null)
            System.out.print("-Left null Yes");
        else
        {
            results++;
            System.out.print("-Left != null << issue");
        }
        
        //Check right of node3
        if (node3.getRight() == null)
            System.out.println("-Right null Yes");
        else
        {
            results++;
            System.out.println("-Right != null << issue");
        }

        System.out.println("\nCheck setData()\n");
        
        // change data in nodes to new value
        node1.setData(newCar1);
        node2.setData(newCar2);
        node3.setData(newCar3);

        // set left of node1 to node3
        node1.setLeft(node3);
        // set right of node1 to node2
        node1.setRight(node2);
        
        System.out.print("node1.getData()="+node1.getData());
        
        System.out.print("\tcheckCar1="+newCar1);
        if (node1.getData().equals(newCar1))
            System.out.println("\tnode1 data checks");            
        else
        {
            results++;
            System.out.println("node1 data <== issue");
        }

        System.out.print("node2.getData()="+node2.getData());
        System.out.print("\tcheckCar2="+newCar2);
        if (node2.getData().equals(newCar2))
            System.out.println("node2 data checks");
        else
        {
            results++;
            System.out.println("node2 data <== issue");
        }

        System.out.print("node3.getData()="+node3.getData());
        System.out.print("\tcheckCar3="+newCar3);
        if (node3.getData().equals(newCar3))
            System.out.println("node3 data checks");
        else
        {
            results++;
            System.out.println("node3 data <== issue");
        }

        System.out.println("\nCheck setLink()\n");
        
        //display node 1
        System.out.print("node1= "+node1.getData());
        
        //Check left of node1
        if (node1.getLeft() == node3)
            System.out.print("-Left Yes");
        else
        {
            results++;
            System.out.print("-Left XXX << issue");
        }
        
        //Check right of node1
        if (node1.getRight() == node2)
            System.out.println("-Right Yes");
        else
        {
            results++;
            System.out.println("-Right XXX << issue");
        }
        
        //check nodes 2 and 3 to be nulls
        System.out.print("node2= "+node2.getData());
        //Check left of node2
        if (node2.getLeft() == null)
            System.out.print("-Left null Yes");
        else
        {
            results++;
            System.out.print("-Left != null << issue");
        }
        
        //Check right of node2
        if (node2.getRight() == null)
            System.out.println("-Right null Yes");
        else
        {
            results++;
            System.out.println("-Right != null << issue");
        }
        
        System.out.print("node3= "+node3.getData());
        //Check left of node3
        if (node3.getLeft() == null)
            System.out.print("-Left null Yes");
        else
        {
            results++;
            System.out.print("-Left != null << issue");
        }
        
        //Check right of node3
        if (node3.getRight() == null)
            System.out.println("-Right null Yes");
        else
        {
            results++;
            System.out.println("-Right != null << issue");
        }
        
        System.out.print("\n\nResults of all BSTNode tests: " + results);
        if (results==0)
            System.out.println("--Good");
        else
            System.out.println("<---------issue(s)");

    }
}
/* output should be:
run:
========Test BSTNode

Check constructor-data and getData()

node1.getData()=[Car 2017 Dodge]	checkCar1=[Car 2017 Dodge]	node1 data checks
node2.getData()=[Car 2018 Explorer]	checkCar2=[Car 2018 Explorer]node2 data checks
node3.getData()=[Car 2019 Foo]	checkCar3=[Car 2019 Foo]node3 data checks

Check constructor-link and getLink()

node1= [Car 2017 Dodge]-Left Yes-Right Yes
node2= [Car 2018 Explorer]-Left null Yes-Right null Yes
node3= [Car 2019 Foo]-Left null Yes-Right null Yes

Check setData()

node1.getData()=[Car 1965 Shelby]	checkCar1=[Car 1965 Shelby]	node1 data checks
node2.getData()=[Car 1973 Lemans]	checkCar2=[Car 1973 Lemans]node2 data checks
node3.getData()=[Car 1954 Edsel]	checkCar3=[Car 1954 Edsel]node3 data checks

Check setLink()

node1= [Car 1965 Shelby]-Left Yes-Right Yes
node2= [Car 1973 Lemans]-Left null Yes-Right null Yes
node3= [Car 1954 Edsel]-Left null Yes-Right null Yes


Results of all BSTNode tests: 0--Good
BUILD SUCCESSFUL (total time: 0 seconds)



*/