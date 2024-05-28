public class buffer {
    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("Ambika");
        System.out.println(a.capacity());


            //........methods......//

        //...Append...//

    // a.append(" is the greatest.");
    // System.out.println(a);
   
    // a.append("Invincible.");
    // System.out.println(a);


        //..Delete...//

    // a.deleteCharAt(3);
    // System.out.println(a);


        //...Insert...//

    a.append(" Ajai Singh");
    a.insert(10, " Web Developer");
    System.out.println(a);



   

    }
}
