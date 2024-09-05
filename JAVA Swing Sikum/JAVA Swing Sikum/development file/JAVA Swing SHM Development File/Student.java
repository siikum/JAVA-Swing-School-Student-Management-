public class Student {
       private int enrollmentID;      //inmonths
       private String dateOfBirth;
       private String courseName = "";
       private String studentName;
       private String dateOfEnrollment = "";
       private int courseDuration;          //inmonths
       private int tutionFee;

//constructors      
// constructor accepts four parameter which are dateOfBirth, studentName, courseDuration, tutionFee
public Student(String dateOfBirth, String studentName, int courseDuration, int tutionFee) {
    this.dateOfBirth = dateOfBirth;
    this.studentName = studentName;
    this.courseDuration = courseDuration;
    this.tutionFee = tutionFee;
    
// 2 attributes coursename and dateofenrollment are initialized to an empty string that mean
    this.enrollmentID = 0;

// enrollmentID is initialized to xero     
    this.courseName = "";
    this.dateOfEnrollment = "";
}


//getter
//corresponding accesor of each method 
public String getDateOfBirth() {
       return dateOfBirth;
}

public String getStudentName() {
       return studentName;
}
public int getCourseDuration() {
       return courseDuration;
}

public int getTutionFee() {
       return tutionFee;
}

public int getEnrollmentID() {
       return enrollmentID;
}

public String getCourseName() {
       return courseName;
}

public String getDateOfEnrollment() {
       return dateOfEnrollment;
}

//setter
//method to set the enrollment id 
public void setEnrollmentID(int enrollmentID) {
    this.enrollmentID = enrollmentID;
}

//method to set the course name 
public void setCourseName(String courseName) {
     this.courseName = courseName;
} 

//mutator method for the attribute dateofenrolment 
public void setDateOfEnrollment(String dateOfEnrollment) {
      this.dateOfEnrollment = dateOfEnrollment;
}

//mutator method for attribute datofbrith (droupout class)
public void setDateOfBirth(String dateOfBirth){
       this.dateOfBirth = dateOfBirth;
}

//mutator method for attribute studentName (dropout class)
public void setStudentName(String studentName){
       this.studentName = studentName;
}

//mutator method for attribute studentName (dropout class)
public void setCourseDuration(int  courseDuration){
       this.courseDuration = courseDuration;
}

//mutator method for attribute studentName (dropout class)
public void setTutionFee(int tutionFee){
       this.tutionFee = tutionFee;
}




//display method to show the details of the student 
public void display() {
    //checking all the parameter weather it is zero or have empty string
    if (enrollmentID == 0 || courseName.isEmpty() || dateOfEnrollment.isEmpty()) {
                    System.out.println("the parameters have not been set");
    } else {
       int yearsEnrolled = courseDuration / 12;
       System.out.println("Enrollment ID: " + enrollmentID);
       System.out.println("Date of Birth: " + dateOfBirth);
       System.out.println("Course Name: " + courseName);
       System.out.println("Student Name: " + studentName);
       System.out.println("Years Enrolled: " + yearsEnrolled);
       System.out.println("Course Duration: " + courseDuration + " months");
       System.out.println("Tution Fee: $" + tutionFee);
       System.out.println("Date of Enrollment: " + dateOfEnrollment);
    }
  }
public static void main(String[] args){
  //Dropout obj = new Dropout("2004-10-24" , 23000, 13, "umang", 4, 3, "2015-06-07");
   // obj.display();
  Regular Obj = new Regular("", 0, "", "", "", 0, 0, 10, 4, 30);
     Obj.display();
}
   




}











