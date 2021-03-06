package Exercise1;

public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int number)
	{
		value = number;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} 
			else {
				right.add(newNumber);
			}
		}
		else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} 
			else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean remove(int newNumber) {
		if(left != null && left.value == newNumber)
		{
			this.left = left.left;
			return true;
		}
		
		if(right != null && right.value == newNumber)
		{
			if(left != null)
				this.right = left.left;
			else if(right != null)
				this.right = right.right;
			else
				this.right = null;
			return true;
		}
		
		if (newNumber > this.value) {
			if(right != null) {
				return right.remove(newNumber);
			}
			else {
				System.out.println("The number is not part of the tree");
				return false;
			}
				
		}
		else {
			if(left != null) {
				return left.remove(newNumber);
			}
			else {
				System.out.println("The number is not part of the tree");
				return false;
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} 
		else { 
			if (n > this.value) {
				if (right == null) {
					return false;
				} 
				else {
					return right.contains(n);
				}
			} 
			else {
				if (left == null) {
					return false;
				} 
				else {
					return left.contains(n);
				}
			}
		}
	}
	
	public int getMax() {
		if(right != null) {
			return right.getMax();
		}
		else {
			return this.value;
		}
	}
	
	public int getMin() {
		if(left != null) {
			return left.getMin();
		}
		else {
			return this.value;
		}
	}
	
	public String ToString() {
		return "[" + this.value + ((left != null) ? " L" + left.ToString() : " L[]") + ((right != null) ? " R" + right.ToString() : " R[]") + "]";
	}	
	
	public int depth() {
		int leftDepth = 0;
		int rightDepth = 0;
		if(left == null && right == null) {
			return 0;
		}
		else {
			if(left != null){
				leftDepth = left.depth();
			}
			if(right != null){
				rightDepth = right.depth();
			}
		}
		
		if(leftDepth > rightDepth) {
			return leftDepth + 1;
		}
		else
		{
			return rightDepth + 1;
		}
	}
}
