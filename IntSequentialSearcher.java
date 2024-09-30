public class IntSequentialSearcher 
{
    public static int search(int[] array, int value)
    {
        int index; // loop control vairable
        int position; // position the value is found at
        boolean found; // flag indicating search result
        
        index = 0; //starting point of the search
        position = -1; //stores deafult values
        found = false; //stores deafult values
        
        while(!found && index < array.length)
        {
            if(array[index] == value)
            {
                found = true;
                position = index;
            }
          index ++;
        }
      return position; //return the found element position or -1 if not found
    }
}
