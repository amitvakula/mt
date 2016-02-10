// TO RUN RENAME TO CN.java

public class CN {
	int val;
	char c;
	CN next;
	CN oNext;
	
	public static void main(String[]args){
		CN m = new CN();
		m.val = 5;
		m.c = 'a';
		m.next = new CN();
		m.oNext = new CN();
		
		m.next.val = 2;
		m.next.c = 'c';
		m.next.next = m;
		m.next.oNext = m.oNext;
		
		m.oNext.val = 4;
		m.oNext.c = 'm';
		m.oNext.next = m;
		m.oNext.oNext = m.next;
	}

}


