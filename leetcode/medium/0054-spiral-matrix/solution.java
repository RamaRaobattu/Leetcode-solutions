class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0){
            return new ArrayList<>();
        }
        List<Integer> order=new ArrayList<>();
        int top=0,left=0;
        int right=matrix[0].length-1,bottom=matrix.length-1;
        while(left<=right && top<=bottom){
            for(int row=left;row<=right;row++){
                order.add(matrix[top][row]);
            }
            top++;
            for(int col=top;col<=bottom;col++){
                order.add(matrix[col][right]);
            }
            right--;
            if(top<=bottom){
                for(int row=right;row>=left;row--){
                    order.add(matrix[bottom][row]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int col=bottom;col>=top;col--){
                    order.add(matrix[col][left]);
                }
                left++;
            }
        }
        return order;
    }
}