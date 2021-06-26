package collection;
import java.util.ArrayList;
import java.util.List;

public class Node<T> {
public Node<T> leftNode;
public Node<T> rightNode;
public T value;
public void add(T t) {
	if(null== value)
		value=t;
	else {
		// change type into Integer to compare (it does not matter what type it is ,change it into Integer)
		if((Integer) t-((Integer) value)<=0 ) {
			if(null==leftNode) 
				//**************************************************************************
				//if the value is null, have to initialize a new Node<>; use recursion to add;
				//after initialization, the leftNode become Node itself, call add() method then. 
				//**************************************************************************
				leftNode=new Node<T>();
			   leftNode.add(t);
		}
		else {
			if(null==rightNode) 
				rightNode=new Node<T>();
			    rightNode.add(t);
		}
	}	
}
public List<T> list(){
	List<T> list=new ArrayList<>();
	if(leftNode!=null)
		list.addAll(leftNode.list());
	list.add(value);
	if(rightNode!=null)
		list.addAll(rightNode.list());
	return list;
}

public List<T> values(){
	List<T> values =new ArrayList<T>();
	if(null!=leftNode) {
		//*************************************************************
		//left first, call values() method itself(recursion) and List it
		//**************************************************************
		values.addAll(leftNode.values());
	}
	values.add(value);
	if(null!=rightNode) {
		values.addAll(rightNode.values());
	}
	return values;
}
public static void main(String[] args) {
    int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
    Node<Integer> roots=new Node<>();
    for(Integer i:randoms) {
    	roots.add(i);
    }
    System.out.println(roots.values());
    System.out.println(roots.list());//list() equals values()/practice propose.
}
}
