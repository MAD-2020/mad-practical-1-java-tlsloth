import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    System.out.print("Enter the number of numbers: ");
    int numofnums = in.nextInt();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    while(numbers.size() != numofnums){
        String reply = String.format("Number #%d: ",numbers.size()+1);
        System.out.print(reply);
        Integer integer = in.nextInt();
        numbers.add(integer);
    }
    Integer[] numarray = numbers.toArray(new Integer[0]);
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    int max = 1;
    int largestnum = 0;
    for (int i = 0; i < numbers.size(); i++){
        //check if number is in hashmap yet else add it
        if (hm.get(numarray[i]) != null){
            //get the value for the key and increase by one
            int count = hm.get(numarray[i]);
            count++;
            hm.put(numarray[i],count);
            //find largest count and number and set updated value
            if (count > max){
                max = count;
                largestnum = numarray[i];
            }
        }

        else{
            hm.put(numarray[i],1);
        }

        //else put into hashmap
    }
    String reply = String.format("Mode of the list: %d",largestnum);
    System.out.print(reply);

    
  }
}
