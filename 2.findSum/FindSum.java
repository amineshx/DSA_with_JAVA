public class FindSum {
    public static void main(String[] args){
        double now= System.currentTimeMillis();
        FindSum demo= new FindSum();
        System.out.println(demo.findSum1(99999));
        System.out.println("Time taken- "+(System.currentTimeMillis()-now)+ "miliseces");
    }
    // public int findSum1(int n){
    //     return n*(n+1)/2;
    // }

    public int findSum1(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
