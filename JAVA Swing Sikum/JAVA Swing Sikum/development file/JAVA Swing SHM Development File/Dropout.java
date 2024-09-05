public class Dropout extends Student {
    
     //attributes
     private int numOfRemainingModules;
     private int numOfMonthsAttended;
     private String dateOfDropout;
     private int remainingAmount;
     private boolean hasPaid = false;
     
     //constructor 
     //calling super class
public Dropout(int enrollmentID,String dateOfBirth, int tutionFee, int courseDuration, String studentName,  int numOfRemainingModules, int numOfMonthsAttended,String dateOfDropout)
 {
   //calling constructor from the super class 
   super(dateOfBirth, studentName,  courseDuration, tutionFee);
   
   //setter/mutator method
   super.setCourseName("Java");
   super.setEnrollmentID(enrollmentID);
   super.setDateOfEnrollment("2003-09-21");
   
   this.numOfRemainingModules = numOfRemainingModules;
   this.numOfMonthsAttended =  numOfMonthsAttended;
   this.dateOfDropout = dateOfDropout;
   
   //initializing thr values of remainingAmount to 0
   this.remainingAmount = 0;
   
   //initializing the values of hasPaid to false
   this.hasPaid = false;
}

//accesor/getter method for each attribute
    public int getNumOfRemainingModules() 
    {
           return numOfRemainingModules;
    }
    
    public int getNumOfMonthsAttended() 
    {
           return numOfMonthsAttended;
    }
    
    public String getDateOfDropout() 
    {
           return dateOfDropout;
    }
    
    public int getRemainingAmount() 
    {
           return remainingAmount;
    }
    
     public boolean getHasPaid() 
    {
           return hasPaid;
    }
    
//billsPayble method to calculate the pending tution fee amount
public void billsPayable(int numOfMonthsAttended) { //calculate the pending tuition fee amount based on the number of months attended by the student
        this.remainingAmount = (getCourseDuration() - numOfMonthsAttended) * super.getTutionFee(); 
        this.hasPaid = true;
        System.out.println("Bills paid successfully!");
}

//removeStudent method to calculate the final amount paid
public void removeStudent() {
   if (hasPaid) {
          //if bills are paid then it will reset all attributes to default
         setDateOfBirth("");
         setCourseName("");
         setStudentName("");
         setDateOfEnrollment("");
         setCourseDuration(0);
         setTutionFee(0);
         dateOfDropout= "";
        setEnrollmentID(0);
        numOfMonthsAttended= 0;
        numOfRemainingModules= 0;
        remainingAmount= 0;
          
          //display message
          System.out.println("Student Removed");
   } else {
          //if bills are not paid then display this message
          System.out.println("All Bills are not cleared.");
    }
  }
    
//display method to display the details of the dropout 
public void display() {
      //calling display method of the super class student
      super.display();
      
      //displaying the specific details of dropout
      System.out.println("Number of remainig modules: " + numOfRemainingModules);
      System.out.println("Number of months attended: " + numOfMonthsAttended);
      System.out.println("Date of drop out: " + dateOfDropout);
      System.out.println("Remaining amount: " + remainingAmount);
}
}
