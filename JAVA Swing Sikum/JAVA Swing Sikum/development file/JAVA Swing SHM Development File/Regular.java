public class Regular extends Student {
    
    //attributes
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    
    //constructor
    
    public Regular(String dateOfEnrollment, int enrollmentID, String courseName, String studentName, String dateOfBirth, int courseDuration, int tutionFee,
                  int numOfModules,  int numOfCreditHours, int daysPresent) 
    {
        //calling four parameters
        //calling Constructor from Student Class
        super(dateOfBirth,studentName, courseDuration ,tutionFee);
        
        //setter/mutator method
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setEnrollmentID(enrollmentID);
    
        
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        
        //Initializing isGrantedScholarship is False
        this.isGrantedScholarship = false;
    }
    

    //Accessor/getter method for the respective classes
    
    public int getNumOfModules() 
    {
           return numOfModules;
    }
    
    public int getNumOfCreditHours() 
    {
           return numOfCreditHours;
    }
    
    public double getDaysPresent() 
    {
           return daysPresent;
    }
    
    public boolean getIsGrantedScholarship() 
    {
           return isGrantedScholarship;
    }

    
    //presentPercentage method calculated the present percentage and returns attendence grade
    public char presentPercentage(int daysPresent) {
           if (daysPresent > super.getCourseDuration()) {
            System.out.println("numbers of days present cannot be greater than courseDuration");
    }
           double percentage = (double) daysPresent / super.getCourseDuration() * 100;
           if (percentage >= 80){
              isGrantedScholarship = true; 
              return 'A';
            } else if  (percentage >= 60) {
              return 'B';
            } 
            else if  (percentage >= 40) {
              return 'C';
            } 
           else if  (percentage >= 20) {
              return 'D';
            }
           else {
              return 'E';
            } 
    
    }
    
    public boolean isGrantedScholarship() {
           return isGrantedScholarship;
    }
    
    // grantCertificate method accepts 3 parameters and displays message 
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment) 
    {
        System.out.println("Way To Go! You've succesfully graduated from " + courseName + ".");
        System.out.println("Enrollment ID: " + enrollmentID);
        System.out.println("date Of Enrollment : " + dateOfEnrollment);

        if (isGrantedScholarship) {
            System.out.println("The Scholarship has been granted.");
        }
    }
    
    
    // creating a display method where it displays the details of the supper class
    public void display() {
         super.display();
         System.out.println("Number of Modules: " + numOfModules);
         System.out.println("Number Of Credit Hours: " + numOfCreditHours);
         System.out.println("Days Present: " + daysPresent);
    }
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    }



