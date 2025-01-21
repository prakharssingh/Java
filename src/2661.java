class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            map.put(arr[i],i);
        }
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for(int i = 0; i<mat.length ; i++){
            for(int j = 0 ; j<mat[0].length ; j++){
                row[i] = Math.max(row[i],map.get(mat[i][j]));
                col[j] = Math.max(col[j],map.get(mat[i][j]));
            }
        }
        int index =row[0];
        for(int i = 1; i<row.length ; i++){
            index = Math.min(index,row[i]);
        }
        for(int i = 0; i<col.length ; i++){
            index = Math.min(index,col[i]);
        }
        return index;
    }
}
