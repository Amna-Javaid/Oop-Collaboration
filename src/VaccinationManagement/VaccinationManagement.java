package VaccinationManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VaccinationManagement {
     List<Person> persons = new ArrayList<>();
     Scanner sc = new Scanner(System.in);

     VaccinationManagement(){
          persons.add(new Person("Amna" ,"36726792-79","finance",true));
          persons.add(new Person("Areesha" ,"36723232-79","engenering ",true));
          persons.add(new Person("Anam" ,"33896792-79","technical",true));
          persons.add(new Person("Faiza" ,"36782392-79","Management",true));
     }

     public void display(){
          System.out.println("----VACCINATION CHECKING INTERFACE----");


          System.out.println("1. Check your Current Vaccination Status");
          System.out.println("2. Enroll for Vaccination");
          System.out.println("3. Enter vaccination code for Confirmation ");
          System.out.println("4. Exit");
          System.out.print("Enter your choice: ");

          int choice = sc.nextInt();


          switch(choice){
               case 1 : checkStatus();
               break;
               case 2:
          }


     }
     public void checkStatus(){

          System.out.println("Enter your CNIC number");
          String yourCnic= sc.nextLine();

          for (Person p : persons)
          {
               if (p.CNIC.equals(yourCnic))
               {
                    if (p.isVaccinated){
                         System.out.println("You are already vaccinated");
                    }
                    else {
                         System.out.println("you are not vaccinated yet");
                    }
               }
          }
     }

     public void enrollForVaccination(){
          System.out.println("Enter your CNIC number");
          String yourCnic= sc.nextLine();
          for (Person p : persons)
          {
               if (p.CNIC.equals(yourCnic))
               {
                    if (!p.isVaccinated) {
                         System.out.println(p.name + "get yourself vaccinated !!");
                         p.
                    }

               }
          }
     }




}
