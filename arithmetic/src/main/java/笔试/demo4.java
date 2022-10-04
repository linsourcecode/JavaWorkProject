package 笔试;

public class demo4 {
    public static void main(String[] args) {
        System.out.println(getbox(10,3, 2, 2));

    }
    public static  int getbox(int a,int b,int k,int v){
        //能达到的箱子最大的承载量的数量
        int max = b/(k-1);
        //System.out.println(max);
        //剩下的最小的隔间
        int mid = ((b-max))*(v);
       // System.out.println(mid);
        int min=Math.max((a-max*k*v-mid)/v,0);

        int l = (a-max*k*v-mid)%v<=0?0:1;
       // System.out.println(l);
       // System.out.println((a-max*k*v-mid)/v);
        return  (min+mid+max+l);
    }
}
