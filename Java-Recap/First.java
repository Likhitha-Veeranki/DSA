public class First{
    public static void main(String[] args){
        System.out.println("First Line to be Printed");

        System.out.println(50+50);

        //single line comments
        /* 
          multi 
                line
                      comments
                               */

        
        //data types:- (Primitive:- char, byte, short, int, long, float, double, boolean); (Non-primitive:-  String, Arrays, Classes)
        char grade='A';
        String identity = "student";
        int age= 19;
        age = 20; //modification
        float height= 5.1f;  //for float we should mention f at the end 
        boolean interested = true;
        System.out.println("\nidentity :"+identity+"\n age: "+age+"\n height: "+height+"\n grade: "+grade+"\n interested"+interested);
        
        //constants:- final keyword
        final int num = 10;
        /* num = 120;  //this will generate error .remove multi line comments to check*/
        System.out.println(num);

        //var keyword (works only whe you assign a value i.e assign in declaration itself and once type is choosen it stays the same can not be changed)
        var name ="sita";
        System.out.println(name);
        name="gita";
        /*name=42; //generates an error */
        System.out.println(name);

        //Type cating (widening(automatically i.e small to big) and narrowing(manually done i.e big to small)):-
        int num1 =42;
        double num2= num1;
        System.out.println(num1);
        System.out.println(num2);

        double num3=2.5;
        int num4= (int) num3;
        System.out.println(num3);
        System.out.println(num4);

        //Operators
        /* Arithmetic (+, -, *, /, %, ++, --)
           Assignment(=, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=)
           Comparison (==, !=, <, >, <=, >=)
           Logical(&&, ||, !)
           Bitwise        */
        
        //Strings
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("length= "+ alpha.length()
                      + "\n Convert to lower= "+ alpha.toLowerCase()
                      + "\n convert to upper= "+alpha.toUpperCase()
                      + "\n index of XYZ = "+alpha.indexOf("XYZ")
                      + "\n character at 4th place= "+alpha.charAt(3));
        String str1="hi";
        String str2="     hello   ";
        System.out.println(str2.trim()); //trims out the space
        System.out.println(str1.equals(str2)); //returns true if same else false

        //String concatenation
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        //JAVA Math
        System.out.println(Math.min(1,2));
        System.out.println(Math.max(1,2));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-4.8));
        System.out.println(Math.pow(4,2));

        //Rounding Methods
        System.out.println(Math.round(4.5));
        System.out.println(Math.ceil(4.5));
        System.out.println(Math.floor(4.5));

        //Random Numbers
        System.out.println(Math.random()); // between 0.0 and 1.0
        System.out.println((int) (Math.random()*100));



        //conditionals if, else, else if, switch
        int a=18;
        if(a<18){
            System.out.println("can not vote and can not be married");
        }
        else if(a<21){
            System.out.println("can vote but can not be married");
        }
        else{
            System.out.println("can vote and can be married");
        }
        

        //short hand if - else
        int b=2;
        System.out.println((a > b) ? "a is big" : "b is big");



        switch(a){
            case 18:
                System.out.println("it is 18");
                break;
            default:
                System.out.println("it is not 18");
        }


        //loops:- while, do-while, for, for each
        int i=0,n=5;
        while(i<n){
            System.out.println(i);
            i++;
        }

        System.out.println("\n");


        do{
            System.out.println(i);
            i--;
        }while(i>0);



        System.out.println("\n");

        for(i=0;i<n;i++){
            System.out.println(i);
        }
        
        System.out.println("\n");

        String[] words={"This","is","a","code"};
        for(String j : words){
            System.out.println(j);
        }

        /*String word="This";
        for(char k : word){
            System.out.println(k);
        }*/             //this will not work because string is not directly iterable.

        //break and continue statements
        System.out.println("\n");

         for(i=0;i<n;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n");

        for(i=0;i<n;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        //arrays

        //char[] grades = {'A','B','C','D','F'};
        char[] grades = new char[] {'A','B','C','D','F'}; //using new keyword
        grades[4]='E'; //changing
        System.out.println(grades[2]);  //accessing
        System.out.println("no:of grades= "+ grades.length);  //length of an array

        System.out.println("\n");

        for(i=0;i<grades.length;i++){    //looping
            System.out.println(grades[i]);
        }

        for(char m : grades){           //looping with for each loop
            System.out.println(m);
        }

        System.out.println("\n");

        //multi-Dimensional Arrays
        int[][] ar ={{1,2},{3,4},{5,7}};
        ar[2][1]=6;
        System.out.println(ar[0][1]);
        System.out.println(ar.length);
        System.out.println(ar[0].length);

        System.out.println("\n");

        for(i=0;i<ar.length;i++){
            for(int x=0;x<ar[i].length;x++){
                System.out.println(ar[i][x]);
            }
        }

        for(int[] y : ar){
            for(int x : y){
                System.out.println(x);
            }
        }
    }
}