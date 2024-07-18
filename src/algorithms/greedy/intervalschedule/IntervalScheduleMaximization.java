package algorithms.greedy.intervalschedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntervalScheduleMaximization {
    public static void main(String[] args) {
        int[][] intervals={{0,3},{0,15},{5,10},{7,12},{11,16},{12,14},{16,20}};
        List<int[]> optimalSchedule=schedule(intervals);
        for (int[] optimal:optimalSchedule) {
            for(int i = 0; i < optimal.length ; i++) {
                System.out.print(optimal[i]+" ");
            }
            System.out.println();
        }
    }

    private static List<int[]> schedule(int[][] intervals) {
        List<int[]> OptimalIntervalSchedule=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int lastFinishTime=Integer.MIN_VALUE;
        for (int[] interval:intervals) {
            int start=interval[0];
            if(start>lastFinishTime){
                int end=interval[1];
                OptimalIntervalSchedule.add(interval);
                lastFinishTime=end;
            }
        }
        return OptimalIntervalSchedule;
    }
}
