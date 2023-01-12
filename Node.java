public class Node {

    //NOTE: These are 'public' so any method in the class 'Node' can use them
    public int data; //creates an integer called data
    public Node leftChild, rightChild; //creates the left and right nodes
    public Node(int newData, Node newLeftChild, Node newRightChild) //Creates the node method
            //the parameters are just the public variables under a different name so they can be manipulated
            //without affecting the originals
    {
        data = newData; // sets the value of data to whatever is passed through newData parameter
        leftChild = newLeftChild; //repeats above step respectively
        rightChild = newRightChild; //repeats above step respectively
    }
}