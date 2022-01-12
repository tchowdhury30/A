// Green Mushrooms | Kartik Vanjani, Tasnim Chowdhury, Emily Ortiz
// APCS Pd. 8
// HW 55: Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 0.5

/*
 DISCO:
 - O(1) for the add method would be increased if the array length/ data was increased (or doubled)
 - Constants usually means the array does not have to shift elements or make many comparisons, and the task being accomplished can be done by plopping the element into its place.

 QCC:
 - Which sort methods does java have?
 - If two sorting methods have the same worst and best cases for time complexities, does it mean they are in one family of methods?
 - Can you use sorting methods with strings?

*/

public class OrderedArrayList
{


  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public OrderedArrayList()
  {
    _data = new int[10];
    _size = 0;
  }

  //adds an item after the last item
  // time complexity: should be O(1) because you look at only the last element and place the element you want at the end of the array.
  // It would be more if the array were to be doubled..
  public void add( int newVal )
  {
    //add( _size, newVal);
    _data[_size] = newVal;
    _size++;
  }


  //inserts an item at index
  // time complexity: this should be O(n) because adding an element at a given index requires java to look through indexes, find the proper one,
  // and move all the elements down accordingly, making java go through it n times, which would therefore be O(n).
  public void add( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
    if (_data.length - 1 < index) {
      //expand();
      System.out.println("out of range");
    }
    else {_size += 1;}
    for (int i = _size - 1; i >= index; i--) {
      _data[i] = _data[i-1];
    }
    _data[index] = newVal;

  }

  /*
  size() has a time complecity of O(1) because the time it takes to retrieve the value of _size
  is constant and does not change between instances of SuperArray, and therefore, there cannot be any best or worst case.
  */

  //return number of meaningful items in _data
  public int size()
  {
    return _size;
  }

   /*
  get() has a time complecity of O(1) because the time it takes to retrieve the value of at an index of an array
  is constant because there is no iterating through the array and therefore, there cannot be any best or worst case
  since it takes a constant amount of time to retrieve the value at an index.
  */

  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  // return old value at index
  // time complexity: O(1) because only the value at one index is changed. There is no need to traverse through the elements of this array,
  // therefore, the length of the list will not affect the time
  public int set( int index, int newVal )
  {
    if (_size < index){
      _size = index + 1;
    }
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  // time complexity: O(n) because once a value is removed, all the ones to the right of it are shifted to the left
  // a longer array will mean more values to shift, therefore taking more time
  // BC: Remove element at the end, no shifts
  // WC: Remove first element, shift all elements
  public void remove( int index )
  {
    if (index < _size) {
      for (int i = index; i < _size - 1; i++){
        _data[i] = _data[i+1];
      }
    _size -= 1;
    _data[_size - 1] = 0;
    }
    else {
    	System.out.println("index out of range");
    }
  }

  //main method for testing
  public static void main( String[] args )
  {
  }
}
