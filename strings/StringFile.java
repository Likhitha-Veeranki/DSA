public class StringFile {
    public static void main(String [] args){
        //creation 
        String s = new String("Hello");  

       /* String s ="Hello";
       char[] letters ={'H','e','l','l','o'};
       String s = new String(letters);

       byte[] bytes = {65,66,67};
       String name = new String(bytes);

       int num=10;
       String s = String.valueOf(num);

       String s = num.toString();

       */

        System.out.println(s);

        //common methods
        
        System.out.println("length  of the string s is : "+s.length());
        System.out.println("character at index 2 is : "+s.charAt(2));
        System.out.println("substring of s from 2 to end is : "+s.substring(2));
        System.out.println("index of e in s i s : "+s.indexOf('e'));
        System.out.println("index of l in s from base position 1 i s : "+s.indexOf('l',1));
        System.out.println("index of ell(substring) in s i s : "+s.indexOf("ell"));
        System.out.println("index of ell(substring) in s from base position 1 i s : "+s.indexOf("ll",1));
        System.out.println("does s contains llo : "+s.contains("llo"));
        System.out.println("does s equals hello : "+s.equals("hello")); 
        char[] letters = s.toCharArray();


        //traversing
        for(char c : letters){
            System.out.print(c+" ");  //observe the difference of print function that it used print instead of println
        }

        System.out.println("\n");
        for(int i =0 ; i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }


    }
}
/*
Strings are immutable and in java if 
       String s ="Hello";
       s=s+"world";    (doesnt mutate the string instead it creates the new object)

String Pooling:
     consider 
         a="java";
         b="java";
           (here a and b both point to same object in the string pool)
        String c = new String("java");
           a==b - True  (because == checks the reference equality)
           a==c - False
           a.equals(c)  -True (because equals method checks the content equality)
*/ 