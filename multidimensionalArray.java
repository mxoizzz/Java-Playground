public class multidimensionalArray {
    public static void main(String[] args) {
        int[][] mat1 = new int[][] {{1,2,3},{4,5,6}};
        System.out.println(mat1[0][0]);
        System.out.println(mat1[0][1]);
        System.out.println(mat1[0][2]);
        System.out.println(mat1[1][0]);
        System.out.println(mat1[1][1]);
        System.out.println(mat1[1][2]);

        for(int i = 0;i<mat1.length;i++){
            for(int j = 0;j<mat1[i].length;j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        for(int i[]:mat1){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
