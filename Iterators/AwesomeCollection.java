import java.util.ArrayList;
import java.util.Iterator;

public class AwesomeCollection<T> implements Iterable<T> {
    ArrayList<T> myCollection = new ArrayList<T>();
    
    public void add(T item) {
    	myCollection.add(item);
    }

    public class AwesomeCollectionIterator implements Iterator<T> {
		private int index=0;
		
		public boolean hasNext() {
			return index < myCollection.size();
		}
	
		public T next() {
			T toRtn = myCollection.get(index);
			index++;
			return toRtn;
		}
	}
	
	public Iterator<T> iterator() {
		return new AwesomeCollectionIterator();
	}

	public static void main(String[] args) {
	    AwesomeCollection<String> col = new AwesomeCollection<String>();
	    col.add("one");
	    col.add("two");
	    col.add("three");
	    for(String item: col) {
		System.out.println(item);
	    }
	}
}