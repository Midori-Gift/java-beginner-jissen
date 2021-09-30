
public class StrongBox<E> {
	private E data;
	public void put(E d) {this.data = d;}
	public E get() {return this.data;}
	private KeyType keyType;
	private 
	public StrongBox(KeyType keyType) {
		System.out.println(keyType);
	}
}
