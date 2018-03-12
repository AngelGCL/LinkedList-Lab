package linkedLists;

import java.util.NoSuchElementException;

/**
 * 
 * @author manch
 *
 * @param <E>
 * 
 * For the excercise 6 we can extend the Cloneable class but this only lets me use the methods inside the super class,
 * on the other hand if i were to implement the Cloneable Interface it will obligate me to re-implement the clone method
 * this could also be done with extending the class into an intermediate AbstractLinkedList class. it just needs to 
 * implement the LinkedList interface and i can implement the Clone() method.
 */

public interface LinkedList<E> extends Cloneable{
	
	/**
	 * Determines the number of nodes currently in the linked list. 
	 * @return integer value (>= 0) corresponding to the number of
	 * nodes actually in the linked list.
	 */
	int length(); 

	/**
	 * 
	 * @param target
	 * @return
	 * @throws NoSuchElementException
	 */
	Node<E> getNodeBefore(Node<E> target) throws NoSuchElementException; 
	
	/**
	 * 
	 * @param target
	 * @return
	 * @throws INoSuchElementException
	 */
	Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException; 
	
	/**
	 *  @return reference to the first node of the linked list
	 *  @throws INoSuchElementException if the linked list is empty
	 */
	Node<E> getFirstNode() throws NoSuchElementException; 
	
	/**
	 * 
	 * @return
	 * @throws INoSuchElementException
	 */
	Node<E> getLastNode() throws NoSuchElementException; 
	
	/**
	 * 
	 * @param nuevo
	 */
	void addFirstNode(Node<E> nuevo); 
	
	/**
	 * 
	 * @param newNode
	 */
	void addLastNode(Node<E> newNode); 
	
	/**
	 * 
	 * @param target
	 * @param nuevo
	 */
	void addNodeAfter(Node<E> target, Node<E> nuevo); 
	
	/**
	 * 
	 * @param target
	 * @param nuevo
	 */
	void addNodeBefore(Node<E> target, Node<E> nuevo); 
		
	/**
	 * 
	 * @param target
	 */
	void removeNode(Node<E> target); 
	
		
	/**
	 * Creates a new node instance of the type of nodes that the linked list
	 * uses. The new node will have all its instance fields initialized to
	 * null. The new node is not linked to the list in any way.
	 * @return reference to the new node instance. 
	 */
	Node<E> createNewNode();

	

}
