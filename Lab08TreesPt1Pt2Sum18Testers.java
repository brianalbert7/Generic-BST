package lab08treespt1pt2sum18testers;

import java.util.Scanner;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 * updated by Linda Yang
 */
public class Lab08TreesPt1Pt2Sum18Testers
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String userCommand, dummyString;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("================");
            System.out.println("\n'Testers' for Trees");
            System.out.println("\nAll = run all 'tests'");
            System.out.println("\nS = all Part 1 simple 'tests'");
            System.out.println("B = test of BSTNode");
            System.out.println("A = simple test of add() in Tree");
            System.out.println("\nR = all Part 2 remove() 'tests'");
            System.out.println("E = Test when tree is empty");
            System.out.println("1 = test of remove - condition 1");
            System.out.println("2 = test of remove - condition 2");
            System.out.println("3 = test of remove - conditions 3A and 3B");
            System.out.println("3A = test of remove - just condition 3A");
            System.out.println("3B = test of remove - just condition 3B");
            System.out.println("4 = test of remove - condition 4");
            System.out.print("Enter command (x to exit): ");
            userCommand = input.nextLine();
            switch (userCommand.toLowerCase())
            {
                case "s":
                    Lab08Part1SimpleTesterBSTNode.main(args);
                    Lab08Part1SimpleTesterTree.main(args);
                    break;
                case "b":
                    Lab08Part1SimpleTesterBSTNode.main(args);
                    break;
                case "a":
                    Lab08Part1SimpleTesterTree.main(args);
                    break;
                case "e":
                    Lab08Part2ATestCarWhenEmptyTree.main(args);
                    break;
                case "1":
                    Lab08Part2BTestCarCondition1.main(args);
                    break;
                case "2":
                    Lab08Part2CTestCarCondition2.main(args);
                    break;
                case "3":
                    Lab08Part2D1TestCarCondition3A.main(args);
                    Lab08Part2D2TestCarCondition3B.main(args);
                    break;
                case "3a":
                    Lab08Part2D1TestCarCondition3A.main(args);
                    break;
                case "3b":
                    Lab08Part2D2TestCarCondition3B.main(args);
                    break;
                case "4":
                    Lab08Part2ETestCarCondition4.main(args);
                    break;
                case "r":
                    Lab08Part2ATestCarWhenEmptyTree.main(args);
                    Lab08Part2BTestCarCondition1.main(args);
                    Lab08Part2CTestCarCondition2.main(args);
                    Lab08Part2D1TestCarCondition3A.main(args);
                    Lab08Part2D2TestCarCondition3B.main(args);
                    Lab08Part2ETestCarCondition4.main(args);
                    break;
                case "all":
                    Lab08Part1SimpleTesterBSTNode.main(args);
                    Lab08Part1SimpleTesterTree.main(args);
                    Lab08Part2ATestCarWhenEmptyTree.main(args);
                    Lab08Part2BTestCarCondition1.main(args);
                    Lab08Part2CTestCarCondition2.main(args);
                    Lab08Part2D1TestCarCondition3A.main(args);
                    Lab08Part2D2TestCarCondition3B.main(args);
                    Lab08Part2ETestCarCondition4.main(args);
                    break;
                case "x":
                    System.out.print(" Bye!");
                    break;
                default:
                    System.out.println("\n\thuh?");
            }
            switch (userCommand.toLowerCase())
            {
                case "s": case "b": case "e": case "1": case "2": case "3":
                case "4": case "3a": case "3b": case "r": case "a": case "all":
                    System.out.print("^^please visually inspect results...then");
                    System.out.println(" press enter to continue: ");
                    dummyString = input.nextLine();
                    break;
                case "x":
                    System.out.println(" bye!");
                    break;
                default:
                    System.out.println(" press enter to continue: ");
                    dummyString = input.nextLine();
            }

        } while ( !(userCommand.equalsIgnoreCase("X")));

    }
}
