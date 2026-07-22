class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length(); int m=num2.length();
        if(num1.equals("0") || num2.equals("0")) return"0";
        
        int[] result=new int[n+m];

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(j)-'0';

                int mul=digit1*digit2;

                int digit=i+j+1;
                int carry=i+j;

                int sum=mul+result[digit];

                result[digit]=sum%10;
                result[carry]+=sum/10;
            }
        }
                StringBuilder sb=new StringBuilder();
                for(int x: result){
                    if(!(x==0 && sb.length()==0)) sb.append(x);
                }
                return sb.toString();
    }
}
