import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    // replace with your code
    return 0;
  }

  public static int indexOf(double[] arr, double target)
  {
    // replace with your code
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr.length; j++)
      {
        if (i !=j)
        {
          if (arr[i] == arr[j])
          {
            return true;
          }
        }
      }

      // implement the finding alg here 
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    // count it up 
    int count = 0;
    int mode - arr[0];
    int max_coutn = 0; 
    for (int i = 0; i < arr.length; i++) 
    {
      int target = arr[i];
      count = 0; 
      for int j = 0; j < arr.length; j++)
      {
        if (arr[j] == target) 
        {
          count ++;
        }
      }

      if (count > max_count)
      {
        max_count = coutn; 
        mode = arr[i];
      }
    }
    return mode;
  
    return null;
  }
}
