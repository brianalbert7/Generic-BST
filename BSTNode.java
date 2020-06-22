package lab08treespt1pt2sum18testers;

/**
 *
 * @author Linda Yang edited by Brian Albert
 */
// note: add <E extends Comparable<E>> if you use recursive
//       method instructor wrote on board...hope that's
//       not news
public class BSTNode<E extends Comparable<E>> {

    private E data;
    private BSTNode<E> left;
    private BSTNode<E> right;

    /**
     * Constructor
     *
     * @param newData value for data field
     * @param newLeft value for left field
     * @param newRight value for right field
     */
    public BSTNode(E newData, BSTNode<E> newLeft, BSTNode<E> newRight) {
        data = newData;
        left = newLeft;
        right = newRight;
    }

    /**
     * getData method returns the value stored in the data field.
     *
     * @return value from the data field
     */
    public E getData() {
        return data;
    }

    /**
     * getLeft method returns the value stored in the left field
     *
     * @return value from the left field
     */
    public BSTNode<E> getLeft() {
        return left;
    }

    /**
     * getRight method returns the value stored in the right field
     *
     * @return value from the right field
     */
    public BSTNode<E> getRight() {
        return right;
    }

    /**
     * getRightMostData method returns the value stored in the right most field
     *
     * @return value from the right most field
     */
    public E getRightMostData() {
        if (right == null) {
            return data;
        } else {
            return right.getRightMostData();
        }
    }

    /**
     * inorderPrint method prints the data in order
     */
    public void inorderPrint() {
        if (left != null) {
            left.inorderPrint();
        }

        System.out.println(data);

        if (right != null) {
            right.inorderPrint();
        }
    }

    /**
     * removeRightmost method removes the right most data
     *
     * @return value in this field
     */
    public BSTNode<E> removeRightmost() {
        if (right == null) {
            return left;
        } else {
            right = right.removeRightmost();
            return this;
        }
    }

    /**
     * setData method accepts an argument which is stored in the data field.
     *
     * @param newData value for data field
     */
    public void setData(E newData) {
        data = newData;
    }

    /**
     * setLeft method accepts an argument which is stored in the left field.
     *
     * @param newLeft value for the left field
     */
    public void setLeft(BSTNode<E> newLeft) {
        left = newLeft;
    }

    /**
     * setRight method accepts an argument which is stored in the right field.
     *
     * @param newRight value for the right field
     */
    public void setRight(BSTNode<E> newRight) {
        right = newRight;
    }
}
