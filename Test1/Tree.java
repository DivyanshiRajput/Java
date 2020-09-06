import java.util.ArrayList;

public class Tree {
	public Tree(int v) {
		this.val = v;
	}

	public void setChildren(Tree left, Tree right) {
		this.lChild = left;
		this.rChild = right;
	}

	int findDepth(int a) {
		// the depth of the tree at which the value a is found
		// -1 if not found. Assume values are not duplicated
		int l = -1, r = -1;
		if (this.val == a){
			return 0;
		}

		if (this.lChild != null)
		{
			l = this.lChild.findDepth(a);
		}

		if(this.rChild != null)
		{
			r = this.rChild.findDepth(a);
		}

		if (l>=0)
			return l+1;

		if (r>=0)
			return r+1;

		else
			return -1;
	}

	private int val;
	private Tree lChild, rChild;

	public static void main(String[] args) {
		// create Tree nodes from input

		int[] vals = {11, 3, 4, 5, 7, 8 , 2, 14};

		Tree[] nodes = new Tree[vals.length];

		for(int i=0;i<vals.length;i++) {
			nodes[i] = new Tree(vals[i]);
		}
		Tree root = nodes[2];
		nodes[2].setChildren(nodes[3], nodes[4]);
		nodes[3].setChildren(nodes[0], nodes[1]);
		nodes[4].setChildren(nodes[5], nodes[6]);
		nodes[6].setChildren(null,  nodes[7]);

		System.out.println(root.findDepth(4));
		System.out.println(root.findDepth(14));
		System.out.println(root.findDepth(7));
		System.out.println(root.findDepth(3));
		System.out.println(root.findDepth(31));

	}
}
