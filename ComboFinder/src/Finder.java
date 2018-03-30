import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 
 */

/**
 * @author TK048537
 *
 */
public class Finder {

	/**
	 * @param args
	 */
	
	 public static void main(String args[])
	    {
	    	Finder obj = new Finder();
	    	int inputArray[] = {1,2,2,3,4,5,6,9};
	    	int sum = 20;
	    	System.out.println( (obj.comboFinder(inputArray, sum)).size() + " combination found for the given input array " + obj.printArray(inputArray) +" having sum as " + sum);
	    }
	 
	 			String printArray(int[] ipArray)
	 			{
	 				String array = "";
	 				for(int i = 0; i<ipArray.length; i++)
	 				{
	 					array = array + " " + ipArray[i];
	 				}
	 				return array;
	 			}
	     
	    private void recursiveCaller(List<List<Integer>> result,
	        List<Integer> list, int[] inputArray, int finalValue, int index) {
	 
	            int sum = 0;
	            for (int i: list) {
	                    sum += i;
	            }
	 
	            if (sum == finalValue) {
	                    result.add(new ArrayList<Integer>(list));
	                    return;
	            }
	            if (sum < finalValue)
	            {
	                for (int j = index; j < inputArray.length; j++)
	                {
	                    if(index != j && inputArray[j] == inputArray[j-1])
	                    {
	                        continue;
	                    }
	                    list.add(inputArray[j]);
	                    recursiveCaller(result, list, inputArray, finalValue, j+1);
	                    list.remove(list.size() - 1);
	                }
	            }
	        }
	    
	    public List<List<Integer>> comboFinder(int[] inputArray, int output) {
	        Arrays.sort(inputArray);
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        List<Integer> list = new ArrayList<Integer>();
	 
	        recursiveCaller(result, list, inputArray, output, 0);
	        System.out.println("Printing whole list - \n " + result);  		//combination of numbers summing to output
	        return result;
	    }
	}


