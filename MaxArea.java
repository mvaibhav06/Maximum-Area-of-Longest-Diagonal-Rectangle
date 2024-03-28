public class MaxArea {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal = 0;
        int area = 0;

        for(int i=0; i<dimensions.length; i++){
            int a = dimensions[i][0];
            int b = dimensions[i][1];
            double dia = Math.sqrt((a*a)+(b*b));
            if(dia > diagonal){
                diagonal = dia;
                area = a*b;
            }else if(dia == diagonal){
                int ar = a*b;
                if(ar > area){
                    area = ar;
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] nums = {{2,6},{5,1},{3,10},{8,4}};
        System.out.println(areaOfMaxDiagonal(nums));
    }
}
