// Green Mushrooms | Emily Ortiz, Tasnim Chowdhury, Kartik Vanjani
// APCS pd8
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent:  1hr

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 * 1. Select smallest element, move to end.
 * 2. Select next smallest, move to next-to-end.
 * 3. Wash, rinse, repeat.
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n-1 passes
 * q1: What do you know after pass p?
 * a1: After pass p, all values are set in their final positions at all indexes less than and equal to p-1.
 * q2: How do you know if sorted?
 * a2: If the pass number is equal to or less than  the index+1.
 * q3: What does a pass boil down to?
 * a3: When 1 swap happens between the smallest value and the value at the position its looking at.
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
 {
   //note: this version places greatest value at "rightmost" end
   //maxPos will point to position of SELECTION (greatest value)
   int maxPos;

   for(int pass=data.size()-1; pass < 0; pass-- ) {
     System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
     int min = (int)(data.get(0));;

     for( maxPos=pass; maxPos > 0; maxPos-- ) {
       System.out.println( "maxPos: " + maxPos );//diag
       System.out.println( data );//diag
       if ((data.get(maxPos)).compareTo(min) > 0) {
         min = (int)(data.get(maxPos));
       }
     }

     data.set(data.indexOf(min), data.get(pass));
     data.set(pass, min);
     System.out.println( "after swap: " +  data );//diag
   }

 }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.


  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {


    //===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
  //============================================


    /*==========for AL-returning methods==========
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      ============================================*/
  }//end main

}//end class SelectionSort
