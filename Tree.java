package lab08treespt1pt2sum18testers;

/**
 *
 * @author Linda Yang edited by Brian Albert
 */
public class Tree<E extends Comparable<E>> {

    private BSTNode<E> root;
    private int numItems;

    /**
     * no-arg constructor
     */
    public Tree() {
        root = null;
        numItems = 0;
    }

    /**
     * add method adds an element to the tree
     *
     * @param element The E element to be added
     */
    public void add(E element) {
        if (root == null) {
            root = new BSTNode<E>(element, null, null);
        } else {
            BSTNode<E> cursor = root;
            boolean done = false;

            while (!done) {
                if (element.compareTo(cursor.getData()) < 0) {
                    if (cursor.getLeft() == null) {
                        cursor.setLeft(new BSTNode<E>(element, null, null));
                        done = true;
                    } else {
                        cursor = cursor.getLeft();
                    }
                } else {
                    if (cursor.getRight() == null) {
                        cursor.setRight(new BSTNode<E>(element, null, null));
                        done = true;
                    } else {
                        cursor = cursor.getRight();
                    }
                }
            }
        }
        numItems++;
    }

    /**
     * remove method searches for an element and removes it if found
     *
     * @param element to be removed
     * @return true if an element was removed, false if the element wasn't in
     * the list
     */
    public boolean remove(E element) {
        boolean found = false;
        BSTNode<E> cursor = root;
        BSTNode<E> parentOfCursor = null;

        while (cursor != null && !found) {
            if (element.compareTo(cursor.getData()) == 0) {
                found = true;
            } else if (element.compareTo(cursor.getData()) < 0) {
                parentOfCursor = cursor;
                cursor = cursor.getLeft();
            } else if (element.compareTo(cursor.getData()) > 0) {
                parentOfCursor = cursor;
                cursor = cursor.getRight();
            }
        }

        if (cursor == null) {
            found = false;
        } else if (cursor == root && cursor.getLeft() == null) {
            root = root.getRight();
        } else if (cursor != root && cursor.getLeft() == null) {
            if (cursor == (parentOfCursor.getLeft())) {
                parentOfCursor.setLeft(cursor.getRight());
            } else {
                parentOfCursor.setRight(cursor.getRight());
            }
        } else {
            cursor.setData(cursor.getLeft().getRightMostData());
            cursor.setLeft(cursor.getLeft().removeRightmost());
        }

        if (found == true) {
            numItems--;
        }

        return found;
    }

    /**
     * size method returns the number of elements in the tree
     *
     * @return the value in the numItems field
     */
    public int size() {
        return numItems;
    }

    /**
     * printTree method will call inorderPrint if the root is not null
     */
    public void printTree() {
        if (root != null) {
            root.inorderPrint();
        }
    }
}
