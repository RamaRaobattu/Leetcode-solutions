# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return  *all elements of the*  `matrix`  *in spiral order*.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.4 MB (beats 97.59%)  
**Submitted:** 2026-10-18T12:03:52.720Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)