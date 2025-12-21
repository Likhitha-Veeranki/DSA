public class StringBuilderFile{
    public static void main(String [] args){
        //creation
        //StringBuilder sb = new StringBuilder();
         StringBuilder sb = new StringBuilder("Hello");

         System.out.println("initial String Builder : "+sb);

         //append methods
         sb.append("abc"); 
         sb.append(10);
         sb.append('X');
         System.out.println("after appending String, number, character sb is : "+sb.toString());

         //insert methods
         sb.insert(5,"inserted");
         System.out.println("sb after inserting at position 5 is : "+ sb.toString());

         //delete methods
         sb.delete(5,12);
         System.out.println("sb after deleting the substring : "+sb.toString());
         sb.deleteCharAt(3);
         System.out.println("sb after deleting a character : "+sb.toString());

         //reversing
         sb.reverse();
         System.out.println("sb after reversing : "+sb.toString());

         //length
         System.out.println("length of sb : "+sb.length());

         //character access
         System.out.println("character at position 3 in sb is : "+sb.charAt(3));

         //traversal methods of StringBuilder are same as String

    }
}

/*
String Buffer :-
   all aspects of String Buffer are same as String Builder 
   But String Buffer is used when multiple threads modify the same string
   it includes Sychronized methods i.e. Thread safe

Comparision of String, String Builder and String Buffer :-
  -------------------------------------------------------------------------------
  | Feature       |    String     |    String Builder    |        String Buffer |
  -------------------------------------------------------------------------------
  | Mutable       |     No        |       Yes            |          Yes         |
  -------------------------------------------------------------------------------
  | Thread safe   |     Yes       |        No            |          Yes         |
  -------------------------------------------------------------------------------
  | Speed         |     slow      |       fast           |         medium       |
  -------------------------------------------------------------------------------


# In solving most of the DSA problems we prefer String Builder

 */