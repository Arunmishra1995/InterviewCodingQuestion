import java.io.*;
import java.util.*;

public class MiniMumParkingSpace {
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
          // YOUR CODE HERE
	   int count = 0, i=0, j=parkingStartEndTimes.length-1;
       while(i<j){
        if((parkingStartEndTimes[i][0]<parkingStartEndTimes[j][0]) && 
      (parkingStartEndTimes[i][1]<parkingStartEndTimes[j][1]) ){
       count++;
       i++;
	   j--;
    }
    else{
       i++;
    }
  }
  return count;

	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!
	//4
//	5,10 0,20 25,40 35,45

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}