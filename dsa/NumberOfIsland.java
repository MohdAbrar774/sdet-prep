public class NumberOfIsland{

     public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, visited, i, j, n, m);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j, int n, int m) {
        // base cases
        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || grid[i][j] != '1') {
            return;
        }

        visited[i][j] = true; // mark current land as visited

        // explore 4 directions
        dfs(grid, visited, i - 1, j, n, m); // top
        dfs(grid, visited, i + 1, j, n, m); // bottom
        dfs(grid, visited, i, j - 1, n, m); // left
        dfs(grid, visited, i, j + 1, n, m); // right
    }
}