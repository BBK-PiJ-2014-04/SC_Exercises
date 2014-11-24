package Exercise1;

public class TestProgram {
	public static void main(String[] args) {
		IntegerTreeNode myhead = new IntegerTreeNode(6);
		myhead.add(5);
		myhead.add(9);
		myhead.add(3);
		myhead.add(8);
		myhead.add(11);
		myhead.add(12);
		
		myhead.remove(12);
		myhead.remove(8);
		myhead.remove(11);
		myhead.remove(13);
		
		
		System.out.println(Integer.toString(myhead.getMax()));
		System.out.println(Integer.toString(myhead.getMin()));
		System.out.println(myhead.ToString());
		System.out.println(Integer.toString(myhead.depth()));
	}
}
