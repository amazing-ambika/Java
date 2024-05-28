public class loops {
    public static void main(String[] args) {

//Condition and loops
        
        //if elseif else Condition


        int marks = 75;
        if (marks >= 80 && marks <= 100){
             System.out.println("Distinction");
         }else if(marks >= 60 && marks < 80 ){
             System.out.println("First Division");
         }else if(marks >= 45 && marks < 60){
             System.out.println("Second Division");
         }else if(marks >= 33 && marks < 45){
             System.out.println("Third Division");
         }else if(marks >= 0 && marks < 33){
             System.out.println("Failed");
         }else{
             System.out.println("Invalid Input");
         }


        // Switch Case

         int marks_stu = 30;

         switch (marks_stu) 
         {
             case 1:
                 System.out.println("fail");
                 break;
             case 2:
                 System.out.println("pass");
                 break;
                 case 3:
                 System.out.println("1 pass");
                 break;
                 case 4:
                 System.out.println("2 pass");
                 break;
                 case 5:
                 System.out.println("3 pass");
                 break;  
                 default:
                 System.out.println("none above");
         }

                             
                             
        //For Loop



                              for (int a =2; a<= 5;a++){
                                 System.out.println(a);}


        // Nested loop
         for (int a=2; a<= 5;a++){
             System.out.println("*");
             for(int b =100; b<= 105; b++){
                 System.out.println("**");
             }
         }



        // While Loop

        int a=0;
        while (a <= 100){
         System.out.println("hello");
        a +=5;
        }


        // Do While loop

         int a = 0;
         do{
             System.out.println("number is: "+ a);
             a++;
         }while(a <= 10);
    }
}





