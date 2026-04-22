class Solution {
    public int[] singleNumber(int[] nums) {
        int XOR=0;
        for(int n:nums){
            XOR=XOR^n;
        }

        int leftBit=(XOR&(XOR-1))^XOR;

        int one=0;
        int two=0;
        for(int i:nums){
            if((i&leftBit)!=0){
                one=one^i;
            }else{
                two=two^i;
            }
        }
        return new int[]{one,two};
    }
}