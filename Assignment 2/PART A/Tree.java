public class Tree{
  int data;
  Tree lChild;
  Tree rChild;
  Tree (int data, Tree leftChild, Tree rightChild)
  {
    this.data = data;
    this.lChild = leftChild;
    this.rChild = rightChild;
  }
  public static void main( String[] args)
  {
    Tree node6 = new Tree(6, null, null);
    Tree node5 = new Tree(5, null, null);
    Tree node4 = new Tree(4, null, null);
    Tree node3 = new Tree(3, node5, node6);
    Tree node2 = new Tree(2, node4, null);
    Tree root = new Tree(1, node2, node3);

    Traversal(root);

  }

  static void Traversal(Tree Root)
  {
    if (Root != null)
    {
      System.out.printf("%d ", Root.data);
      Traversal(Root.lChild);
      Traversal(Root.rChild);
    }
  }
}
