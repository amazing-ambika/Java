class Students{
String name; 
    int id;
    String email;
    // String name="Ambi";
    // String roll="1";
    // // int[] marks={68,69,72,79,85};
    // String email="ambika@gmail.com";

    public void display(){
        System.out.println(name+" "+id+" "+email);

    }
}


public class Classes {
public static void main(String[] args) {
 //---------single entry--------//
   Students a1 = new Students();

   a1.name="Ambi";
   a1.id=01;
   a1.email="ambika@abc.com";

  a1.display();

  //--------multiple entries--------//

  Students a2 = new Students();
  Students a3 = new Students();
  Students a4 = new Students();
  Students a5 = new Students();


  a2.name="Shivani";
  a2.id=02;
  a2.email="shivani@abc.com";

  a3.name="Omvati";
  a3.id=03;
  a3.email="omvati@abc.com";

  a4.name="Usha";
  a4.id=04;
  a4.email="usha@abc.com";

  a5.name="Bulbul";
  a5.id=05;
  a5.email="bulbul@abc.com";

  a2.name="abc";

  a2.display();
  a3.display();
  a4.display();
  a5.display();


    // System.out.println("Hello");
    // int a, b, c;
}

}



