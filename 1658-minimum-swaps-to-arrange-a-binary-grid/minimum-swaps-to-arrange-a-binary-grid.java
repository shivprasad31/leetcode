class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int[] zeros=new int[n];

        for(int i=0;i<n;i++){
            int count=0;
            int j=n-1;
            while(j>=0&&grid[i][j]==0){
                count++;
                j--;
            }
            zeros[i]=count;
        }
        int steps=0;
        for(int i=0;i<n;i++){
            int need=n-i-1;
            int j=i;
            while(j<n&&zeros[j]<need){
                j++;
            }
            if(j==n){
                return -1;
            }

            steps+=j-i;
            while(j>i){
                swap(j,j-1,zeros);
                j--;
            }

        }
        return steps;
        
    }
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
}