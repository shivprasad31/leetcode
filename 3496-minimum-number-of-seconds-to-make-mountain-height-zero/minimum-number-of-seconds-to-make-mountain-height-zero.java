class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        int max = findMax(workerTimes);

        long start = 1;
        long end = (long)max * (mountainHeight * (mountainHeight + 1L) / 2);

        long result = 0;

        while(start <= end){

            long mid = start + (end - start) / 2;

            if(check(mid, workerTimes, mountainHeight)){
                result = mid;
                end = mid - 1;
            } 
            else{
                start = mid + 1;
            }
        }

        return result;
    }

    public boolean check(long mid, int[] wk, int mh){

        long h = 0;

        for(int t : wk){

            long k = (long)((Math.sqrt(1 + (8.0 * mid)/t) - 1) / 2);

            h += k;

            if(h >= mh){
                return true;
            }
        }

        return false;
    }

    public int findMax(int[] arr){
        int max = 0;

        for(int i : arr){
            if(i > max){
                max = i;
            }
        }

        return max;
    }
}