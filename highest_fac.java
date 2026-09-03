public class highest_fac{
    public static void main(String[] args){
        int a=10;
        int b=20;
        int highest = 0;
        for(int i=1;i<a;i++){
            if (a%i==0 && b%i==0){
                
                    highest = i;
                
            }
        }
        System.out.println(highest);

    }
}