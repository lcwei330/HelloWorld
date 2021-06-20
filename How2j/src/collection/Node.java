package collection;
import java.util.HashMap;

public class Node {
	public Node leftNode;
	public Node rightNode;
	public Object value;

	public void add(Object v) {
		if (null == value)
			value = v;

		else {
			if ((Integer) v - (Integer) value <= 0) {
				if (null == leftNode)
					leftNode = new Node();
				leftNode.add(v);
			} else {
				if (null == rightNode)
					rightNode = new Node();
				rightNode.add(v);
			}
		}
	}

	public static void main(String[] args) {
        int random[]=new int[] {67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node roots =new Node();
        for(int number:random) {
        	roots.add(number);
        }
     
       
	}
}
