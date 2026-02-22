public class ReverseString {
    //using for loop with extra space
    static String reverseString(String str){
        String res = "";
        int l=str.length()-1;
        for(int i=l; i>=0; i--){
            res=res + str.charAt(i);
        }
        return res;
    }
    //using loop with String Builder
    static String reverse2(String str){
        String s = "";
        //during concatenation with + operator it creates new String object in each iteration to save memory i use string builder
        for (char c: str.toCharArray()){
            s=c+s;
        }
        return s;
    }

    //reverse using swapping
    static void reverse3(String name){
        int s=0, e=name.length()-1;
        char[] strA = name.toCharArray();
        while(s<e){
            char temp = strA[s];
            strA[s]=strA[e];
            strA[e]=temp;
            s++;
            e--;
        }
        //to convert char Array to String -> String.valueOf(char[])
        System.out.println(String.valueOf(strA));
    }

    //Using stringBuilder in built function
    static void reverse4(String name){
        StringBuilder str = new StringBuilder(name);
        str.reverse();
        System.out.println(str);

    }

    public static void main(String[] args) {
        String name= "Md kaif";
        System.out.println(reverseString(name));
        System.out.println(reverse2(name));
        reverse3(name);
        reverse4(name);
    }
}
