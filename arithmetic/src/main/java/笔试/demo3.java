package 笔试;

public class demo3 {
    public static void main(String[] args) {
        int[] line = new int[]{4,1,8,2,6};
        System.out.println(getMethod(line, 3));
    }
    public static int getMethod(int line[],int num){

        //使用两层嵌套，遍历所有最小的值
        int dp[] = new int[1000];
        int flag[]=new int[line.length+1];
        for(int i=0;i<line.length;i++){
            int min=line[i];
            for(int j=1;j<line.length-1;j++){
                 //  System.out.println(min+line[j]+" "+(line[j+1]+line[i]));
                  min =Math.min(min+line[j],line[j+1]+line[i]);
                //  System.out.println("第"+i+"和第"+j+" "+min);

                if((min+line[j])>(line[j+1]+line[i])){

                }
            }
            dp[i]=min;


        }
        for (int i=0;i<line.length;i++) {
            System.out.println(String.valueOf(dp[i]));
        }
        for(int k=0;k<=line.length-1;k++){
            for(int l=1;l<=line.length-1;l++){
                if(dp[k]>dp[l]){
                    int temp=dp[l];
                    dp[l] = dp[k];
                    dp[k]=temp;
                }
            }

        }

        return  dp[num-1];
    }
}
