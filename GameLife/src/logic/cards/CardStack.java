package cards;
import java.util.Stack;

@SuppressWarnings("serial")
public class CardStack<E> extends Stack<E> {
	
	public CardStack(E[] e) {
		for(E el : e) {
			push(el);
		}
	}
	
	public void shuffle() {
		//shuffles the stack
	}
}
