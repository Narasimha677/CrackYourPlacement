package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int s=0;
        int e=m-1;
        if(a.size()==m){
            return a.get(a.size()-1)-a.get(0);
        }
        int min=Integer.MAX_VALUE;
        while(e<a.size()){
            int sub=a.get(e)-a.get(s);
            if(sub<min){
                min=sub;
            }
            s++;
            e++;
        }
        return min;

    }
}
