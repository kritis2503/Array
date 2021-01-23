import java.util.*;
public class r {
    public static int noOfWords(String str){
        String []s=str.split("");
        for (String strr:s){
            System.out.println(strr);
        }
        System.out.println();
        System.out.println();
        int ctr=0;
        int flag=-1;
        for(int i=0;i<s.length;i++){
            flag=0;
            for(int j=0;j<s[i].length();j++){
                char ch=s[i].charAt(j);
                if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')|| ch==',' || ch=='.'||ch=='?'|| ch=='!');
                else
                {
                    flag=1;
                    break;
                }
                // if(s[i].length()==1 && (ch==',' || ch=='.'|| ch=='?'|| ch=='!')){
                //    flag=1;                    
                // }
            }
            if(flag==0)
            {
                ctr++;
                System.out.println(s[i]);
            }   
                 
        }
        return ctr;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        System.out.println(noOfWords(str));
    }
}
