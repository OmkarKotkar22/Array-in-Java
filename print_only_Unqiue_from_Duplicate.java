public class print_only_Unqiue_from_Duplicate{
    public static void main(String x[]){
        int a[]= {1,1,2,2,3};
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j< a.length; j++){
                
                if(a[i] == a[j]){
                    a[j] = max;
                }
            }
        }
        for (int i = 0;i <a.length ;i++) {
            if(a[i] == max) continue;
            System.out.println(a[i]);
        }
    }
}