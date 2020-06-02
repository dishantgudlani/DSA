class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class Tree
{
    Node root;
    
    int height(Node node)
    {
        if(node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        if(left > right)
            return left + 1;

        else
            return right + 1;
    }
public static void main(String[] args)
{
    Tree obj = new Tree();
    Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        System.out.println(obj.height(root) + " ");
}
}