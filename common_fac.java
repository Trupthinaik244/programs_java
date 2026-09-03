public class common_fac{
    public static void main(String[] args){
        int a=10;
        int b=20;
        for(int i=1;i<a;i++){
            if (a%i==0 && b%i==0){
                System.out.println(i);
            }
        }

    }
}
