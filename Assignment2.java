public class Assignment2 {
    public static void main(String[] args) throws Exception {
    
    String firstname = "Zophia Ann";
    String middlename = "Mariano";
    String lastname = "Rey";
    
    //while loop
    int c1 = 0;

        while (c1!=3) {
        System.out.println(firstname); 
        c1 ++;           
        }
    
    //do while loop
    int c2 = 0;

        do {
            System.out.println(middlename);
            c2++;
        } while (c2!=4);

    //for loop
        for (int c3 = 0; c3!=5; c3++) {
            System.out.println(lastname);
        }

    //char array
    String[] myfirstname = {"Z","O","P","H","I","A"}; 
        for (int counter = 0; counter < myfirstname.length; counter++) {
            System.out.println(myfirstname[counter]);
    }

    //char array reverse
    String[] myFirstname = {"A","I","H","P","O","Z"}; 
        for (int counter = 0; counter < myFirstname.length; counter++) {
            System.out.println(myFirstname[counter]);
    }
}
}
