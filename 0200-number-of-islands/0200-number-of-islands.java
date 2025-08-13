class Solution {
    public int numIslands(char[][] gd) {
        if(gd == null || gd.length ==0) return 0;
        int count =0;
        for(int i=0;i<gd.length;i++){
            for(int j=0;j<gd[0].length;j++){
                if(gd[i][j]=='1'){
                    dfs(gd,i,j);
                    count++;
                }
            }
        }
        return count;  
    }
    void dfs(char[][] gd,int i,int j){
        if(i<0 || j<0 || i>=gd.length || j>=gd[0].length || gd[i][j]=='0')return;
        gd[i][j]='0';
        dfs(gd,i + 1,j);
        dfs(gd,i - 1,j);
        dfs(gd,i,j + 1);
        dfs(gd,i,j - 1);
    }
}