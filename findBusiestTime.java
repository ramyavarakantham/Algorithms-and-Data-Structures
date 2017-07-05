/*The Westfield Mall management is trying to figure out what the busiest moment at the mall was last year. You’re given data extracted from the mall’s door detectors. Each data point is represented as an integer array whose size is 3. The values at indices 0, 1 and 2 are the timestamp, the count of visitors, and whether the visitors entered or exited the mall (0 for exit and 1 for entrance), respectively. Here’s an example of a data point: [ 1440084737, 4, 0 ].

Note that time is given in a Unix format called Epoch, which is a nonnegative integer holding the number of seconds that have elapsed since 00:00:00 UTC, Thursday, 1 January 1970.

Given an array, data, of data points, write a function findBusiestPeriod that returns the time at which the mall reached its busiest moment last year. The return value is the timestamp, e.g. 1480640292. Note that if there is more than one period with the same visitor peak, return the earliest one.
*/
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class findBusiestTime {
	
  static int findBusiestPeriod(int[][] data) {
	/* Uses hashmap to store at each timestamp, count of visitors in the mall. Then finds max of hashmap values.
	 int count=0;
    HashMap<Integer, Integer> hm=new HashMap<>();
    for(int i=0;i<data.length;i++)
    {
      if(data[i][2]==1)
    	  count+=data[i][1];
      else
    	  count-=data[i][1];
      hm.put(data[i][0], count);
    }
    
    Entry<Integer,Integer> maxEntry = null;

    for(Entry<Integer, Integer> entry : hm.entrySet()) {
        if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
            maxEntry = entry;
        }
    }
    
   return maxEntry.getKey();*/
	  
	  //Uses constant space to calculate max num of visitors at any point of time in the mall
	  //array empty
	  if(data.length==0)
		  return 0;
	  //only one timestamp data in the array
	  if(data.length==1)
		  return data[0][0];
	  //more than one timestamp data present in the array
	  int count=0, maxcount=0, timestamp=0;
	  for(int i=0;i<data.length-1;i++)
	  {
		  if(data[i][2]==1)
			  count+=data[i][1];
		  else
			  count-=data[i][1];
		  if(data[i][0]==data[i+1][0])
			  continue;
		  if(count>maxcount)
		  {
			  maxcount=count;
			  timestamp=data[i][0];
		  }
	  }
	  return timestamp;
    
  }

  public static void main(String[] args) {
int[][] data={{1487799425, 14, 1}, {1487799425, 4,  0}, {1487799425, 2,  0},{1487800378, 10, 1}, {1487801478, 18, 0},{1487801478, 18, 1}, {1487901013, 1,  0},{1487901211, 7,  1},{1487901211, 7,  0}};
    System.out.println(findBusiestPeriod(data)); 

}
}


