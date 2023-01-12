//Brian;  Github.com/GrierTechSolutions
//Professor Stanley; Bridgewater State University

public class Traversal  {

    public static void main(String[] args) {
        //create 3 nodes to traverse

        Node one = new Node(1,null, null);
        Node three = new Node(3,null,null);
        Node root = new Node(2,one,three);

        //NOTE: the root node is the only one with left and right because the other nodes are the last nodes
        //on the branches
        /*
                root
                 /\
              left right
         */

    //Prints out 'newData' from each node
        System.out.println(one.data); // = 1
        System.out.println(root.data);// = 2
        System.out.println(three.data);// = 3
        inorder(root);
        preorder(root);
        postorder(root);
    }
    public static void inorder(Node current){
        //INORDER = LEFT -> ROOT -> RIGHT; prints the data in this order

        //LEFT
        if(current.leftChild != null){
            inorder(current.leftChild); //keeps going down the left until there is no more left nodes
        }

        //ROOT(Current)
        System.out.println(current.data); //prints out the current nodes data

        //RIGHT
        if(current.rightChild != null){
            inorder(current.rightChild); //keeps going down the right until there is no more right nodes
        }

    }
    public static void preorder(Node current){
        //PREORDER = ROOT -> LEFT -> RIGHT

        //Root(current)
        System.out.println(current.data);

        //LEFT
        if(current.leftChild != null){
            inorder(current.leftChild);
        }
        //RIGHT
        if(current.rightChild != null){
            inorder(current.rightChild);
        }

    }
    public static void postorder(Node current){
        //POSTORDER = LEFT -> RIGHT -> ROOT

        //LEFT
        if(current.leftChild != null){
            inorder(current.leftChild);
        }

        //RIGHT
        if(current.rightChild != null){
            inorder(current.rightChild);
        }

        //Root(current)
        System.out.println(current.data);

    }
}
