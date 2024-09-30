public class SequentialSearchTest 
{

    public static void main(String[] args) 
    {
        int[] tests = {87, 75, 98, 100, 82};
        int results;
        
        results = IntSequentialSearcher.search(tests, 100);
        
        if(results == -1)
        {
            System.out.println("You did not earn 100 on any test");
        }
        
        else
        {
            System.out.println("You earned 100 on test " + (results + 1));
        }
    }
}
