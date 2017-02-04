package ku.util;
import java.util.Iterator;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 * Class for doing array iteration of any type of element.
 * @author Theeruth Borisuth
 */
public class ArrayIterator<T> implements Iterator<T> {
	/** attribute for the array we want to iterate over */
	 private T[ ] array;
	/** Length of array */
	 private int lengthofarray;
	 /** Store cursor of array index */
	 private int cursor;
	 /**
	  * Initialize a new array iterator with the array to process.
	  * @param array is the array to iterate over
	  */
	  public ArrayIterator(T[] array) 
	  {
	  this.array = array;
	  this.lengthofarray = array.length;
	  this.cursor = -1;
	  }
	  /**
	   * Return the next non-null element from array, if any.
	   * @return the next non-null element in the array.
	   * @throws NoSuchElementException if there are no more elements
	   * to return.
	   */
 /**
  * Check if there is an element in array or not.
  * @return true if it has else return false.
  */
@Override
public boolean hasNext() 
{
	return cursor != lengthofarray-1;
}
/**
 * Return the next non-null element from array, if any.
 * @return the next non-null element in the array.
 * @throws NoSuchElementException if there are no more elements to return.
 */
@Override
public T next() 
{
	while(hasNext())
	{
		cursor++;
		if(array[cursor]!=null)
		{
			return array[cursor];	
		}
	}
	throw new NoSuchElementException();
}
/**
 * Get the current array.
 * @return the array
 */
public T[] getArray()
{
	return array;
}
/**
 * empty method
 */
	public void remove(){}
}