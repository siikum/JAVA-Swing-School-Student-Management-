import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class StudentGUI implements ActionListener
{
    //declaring all components
    private JFrame MainMenuFrame1, RegularFrame1, DropoutFrame1;

    private ImageIcon MainImage, RegImage, DropImage;
    
    //making only one arraylist
    private ArrayList<Student> students = new ArrayList<>();

    private JLabel 
    Mainlabel, Reglabel, Droplabel,//for image
        //Regular Student Label
    StudentNameLabel1, DOBLabel1, EnrollmentIDLabel1, DOEnrollmentLabel1, 
    CourseNameLabel1, TutionFeeLabel1, NumOfModulesLabel1, NumOfCredithrsLabel1, 
    NumOfDaysPresentLabel1, CourseDurationLabel1,
        //Dropout Student Label
    StudentNameLabel2,CourseNameLabel2, DOBLabel2,EnrollmentIDLabel2, DOEnrollmentLabel2, CourseDurationLabel2, TutionFeeLabel2, 
    NumOfRemainingModulesLabel2, NumOfMonthsAttendedLabel2,RemainingAmountLabel2,
    DODropoutLabel2;

    private JTextField
        //regular form textfield 
    StudentNametf1, EnrollmentIDtf1, CourseNametf1, TutionFeetf1, NumOfModulestf1,
    NumOfCredithrstf1, NumOfDaysPresenttf1, CourseDurationtf1,
        //dropout student form
    StudentNametf2, CourseNametf2, EnrollmentIDtf2, CourseDurationtf2, TutionFeetf2, NumOfRemainingModulestf2,
    NumOfMonthsAttendedtf2, RemainingAmounttf2;

    private JComboBox<String> //regular student combo box
    DOBYearcb1, DOBMonthcb1, DOBDaycb1,  DOEnrollmentYearcb1, DOEnrollmentMonthcb1, DOEnrollmentDaycb1,
        //dropout student combo box
    DOBYearcb2, DOBMonthcb2, DOBDaycb2, DOEnrollmentYearcb2, DOEnrollmentMonthcb2, DOEnrollmentDaycb2,
    DODropoutYearcb2, DODropoutMonthcb2, DODropoutDaycb2;

    private JButton RegularButton, DropoutButton,
        //regular student button
    PresentPercentageButton, RegularHomeButton, GrantCertificateButton, RegularAddstdButton, RegularDisplayButton, RegularClearButton,
        //dropout student button
    PayButton, DropoutHomeButton, RemoveStudentButton, DropoutAddstdButton, DropoutDisplayButton, DropoutClearButton;

    public StudentGUI(){
        String[] Month = {"jan","feb","march","april","may","june","july","august","sep","oct","nov","dec"};
        String[] Day = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] Year = {"1999", "2000", "2001", "2002", "2003", "2004", "2005"};

        MainMenuFrame1 = new JFrame("Harvard University-Student Details");
        MainImage = new ImageIcon("harvard1.jpg");
        Mainlabel = new JLabel(MainImage);
        
        RegularButton = new JButton("Regular Student");
        RegularButton.setBackground(Color.WHITE);
        RegularButton.setForeground(Color.BLACK);

        DropoutButton = new JButton("Dropout Student");
        DropoutButton.setBackground(Color.WHITE);
        DropoutButton.setForeground(Color.BLACK);
        
        Font font = new Font("Times New Roman", Font.PLAIN, 18);
        RegularButton.setFont(font);
        DropoutButton.setFont(font);


    
        //-----------Regular Student--------------------------------//
        RegularFrame1 = new JFrame("Harvard University-Regular Student");
        RegImage = new ImageIcon("h3.png");
        Reglabel = new JLabel(RegImage);

        StudentNameLabel1 = new JLabel("Student's Name:");
        StudentNameLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        StudentNametf1 = new JTextField();

        DOBLabel1 = new JLabel("Date Of Birth:");
        DOBLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        DOBYearcb1 = new JComboBox<String>(Year);
        DOBMonthcb1 = new JComboBox<String>(Month);
        DOBDaycb1 = new JComboBox<String>(Day);

        EnrollmentIDLabel1 = new JLabel("Enrollment ID:");
        EnrollmentIDLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        EnrollmentIDtf1 = new JTextField();

        DOEnrollmentLabel1 = new JLabel("Date Of Enrollment:");
        DOEnrollmentLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        DOEnrollmentYearcb1 = new JComboBox<String>(Year);
        DOEnrollmentMonthcb1 = new JComboBox<String>(Month);
        DOEnrollmentDaycb1 = new JComboBox<String>(Day);

        CourseNameLabel1 = new JLabel("Course Name:");
        CourseNameLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        CourseNametf1 = new JTextField();

        CourseDurationLabel1 = new JLabel("Course Duration:");
        CourseDurationLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        CourseDurationtf1 = new JTextField();

        TutionFeeLabel1 = new JLabel("Tution Fee");
        TutionFeeLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        TutionFeetf1 = new JTextField();

        NumOfModulesLabel1 = new JLabel("Number Of Modules:");
        NumOfModulesLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        NumOfModulestf1 = new JTextField();

        NumOfCredithrsLabel1 = new JLabel("Credit Hours:");
        NumOfCredithrsLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        NumOfCredithrstf1 = new JTextField();

        NumOfDaysPresentLabel1 = new JLabel("Days Present:");
        NumOfDaysPresentLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        NumOfDaysPresenttf1 = new JTextField();
        PresentPercentageButton = new JButton("Present Percentage");
        PresentPercentageButton.setFont(font);

        RegularHomeButton = new JButton("Home");
        RegularHomeButton.setFont(font);

        GrantCertificateButton = new JButton("Grant Certificate");
        GrantCertificateButton.setFont(font);
        
        RegularAddstdButton = new JButton("Add Student");
        RegularAddstdButton.setFont(font);
        
        RegularDisplayButton= new JButton("Display");
        RegularDisplayButton.setFont(font);
        
        RegularClearButton = new JButton("Clear");
        RegularClearButton.setFont(font);

        //-----------------dropout student--------------------//
        DropoutFrame1 = new JFrame("Harvard University-Dropout Student");
        
        DropImage = new ImageIcon("h3.png");
        Droplabel = new JLabel(DropImage);
        
        DropoutFrame1 = new JFrame("Dropout Student");

        StudentNameLabel2 = new JLabel("Student's Name:");
        StudentNameLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        StudentNametf2 = new JTextField();

        DOBLabel2 = new JLabel("Date Of Birth:");
        DOBLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        DOBYearcb2 = new JComboBox<String>(Year);
        DOBMonthcb2 = new JComboBox<String>(Month);
        DOBDaycb2 = new JComboBox<String>(Day);

        EnrollmentIDLabel2 = new JLabel("Enrollment ID:");
        EnrollmentIDLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        EnrollmentIDtf2 = new JTextField();

        DOEnrollmentLabel2 = new JLabel("Date Of Enrollment:");
        DOEnrollmentLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        DOEnrollmentYearcb2 = new JComboBox<String>(Year);
        DOEnrollmentMonthcb2 = new JComboBox<String>(Month);
        DOEnrollmentDaycb2 = new JComboBox<String>(Day);
        
        CourseNameLabel2 = new JLabel("Course Name");
        CourseNameLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        CourseNametf2 = new JTextField();

        CourseDurationLabel2 = new JLabel("Course Duration:");
        CourseDurationLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        CourseDurationtf2 = new JTextField();

        TutionFeeLabel2 = new JLabel("Tution Fee:");
        TutionFeeLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        TutionFeetf2 = new JTextField();

        NumOfRemainingModulesLabel2 = new JLabel("Remaining Modules:");
        NumOfRemainingModulesLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        NumOfRemainingModulestf2 = new JTextField();

        NumOfMonthsAttendedLabel2 = new JLabel("Months Attended:");
        NumOfMonthsAttendedLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        NumOfMonthsAttendedtf2 = new JTextField();

        RemainingAmountLabel2 = new JLabel("Remaining Amount:");
        RemainingAmountLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        RemainingAmounttf2 = new JTextField();
        PayButton = new JButton("Pay");
        PayButton.setFont(font);


        DODropoutLabel2 = new JLabel("Date Of Dropout:");
        DODropoutLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        DODropoutYearcb2 = new JComboBox<String>(Year);
        DODropoutMonthcb2 = new JComboBox<String>(Month);
        DODropoutDaycb2 = new JComboBox<String>(Day);

        RemoveStudentButton = new JButton("Remove Student");
        RemoveStudentButton.setFont(font);
        DropoutHomeButton = new JButton("Home");
        DropoutHomeButton.setFont(font);
        DropoutAddstdButton = new JButton("Add Student");
        DropoutAddstdButton.setFont(font);
        DropoutDisplayButton = new JButton("Display");
        DropoutDisplayButton.setFont(font);
        DropoutClearButton = new JButton("Clear");
        DropoutClearButton.setFont(font);

        //--------------setBounds------------//
        Mainlabel.setBounds(0, 10, 700, 650);
        RegularButton.setBounds(130, 600, 150, 40);
        DropoutButton.setBounds(380,600,160,40);
        //---------------set bounds for regular student--------//
        Reglabel.setBounds(0, 0, 1500, 150);
        //RegularFrame1.setContentPane(Reglabel);
        
        EnrollmentIDLabel1.setBounds(36,44,89,20);  
        EnrollmentIDtf1.setBounds(174,44,160,30);

        StudentNameLabel1.setBounds(36,135,118,20);     
        StudentNametf1.setBounds(174,135,160,30);

        DOBLabel1.setBounds(542,197,97,20);
        DOBYearcb1.setBounds(704,191,75,28);
        DOBMonthcb1.setBounds(795,191,79,28);
        DOBDaycb1.setBounds(890,191,72,28);

        DOEnrollmentLabel1.setBounds(36,197,141,20);   
        DOEnrollmentYearcb1.setBounds(174,191,75,28);
        DOEnrollmentMonthcb1.setBounds(256,191,79,28);
        DOEnrollmentDaycb1.setBounds(342,191,67,28);

        CourseNameLabel1.setBounds(36,278,103,20);      
        CourseNametf1.setBounds(174,270,160,30);

        CourseDurationLabel1.setBounds(542,278,117,20);
        CourseDurationtf1.setBounds(704,268,160,32);

        TutionFeeLabel1.setBounds(36,337,80,20);       
        TutionFeetf1.setBounds(174,329,160,30);

        NumOfModulesLabel1.setBounds(542,329,148,20);     
        NumOfModulestf1.setBounds(704,329,160,30);

        NumOfCredithrsLabel1.setBounds(542,391,99,20);    
        NumOfCredithrstf1.setBounds(704,381,160,30);

        NumOfDaysPresentLabel1.setBounds(36,396,100,20);
        NumOfDaysPresenttf1.setBounds(174,388,160,30);
        PresentPercentageButton.setBounds(174,430,175,30);

        RegularHomeButton.setBounds(35,525,90,20);    //Home
        GrantCertificateButton.setBounds(150,480,168,32);
        RegularAddstdButton.setBounds(355,480,168,32);
        RegularDisplayButton.setBounds(594,480,120,32);     //display
        RegularClearButton.setBounds(734,480,120,32);

        //---------set bounds for dropout student-------------//
        Droplabel.setBounds(0, 0, 1450, 200);
        
        EnrollmentIDLabel2.setBounds(50,58,89,20);
        EnrollmentIDtf2.setBounds(196,53,189,30);

        StudentNameLabel2.setBounds(50,137,103,20);     
        StudentNametf2.setBounds(196,132,189,30);

        DOBLabel2.setBounds(542,197,97,20);
        DOBYearcb2.setBounds(697,191,75,28);
        DOBMonthcb2.setBounds(786,191,79,28);
        DOBDaycb2.setBounds(879,190,72,28);

        DOEnrollmentLabel2.setBounds(50,200,127,20);
        DOEnrollmentYearcb2.setBounds(196,192,75,28);
        DOEnrollmentMonthcb2.setBounds(283,191,79,28);
        DOEnrollmentDaycb2.setBounds(374,191,72,28);

        CourseNameLabel2.setBounds(50,280,90,20);
        CourseNametf2.setBounds(196,275,189,30);
        
        CourseDurationLabel2.setBounds(542,276,117,20);      
        CourseDurationtf2.setBounds(697,268,160,32);

        TutionFeeLabel2.setBounds(50,338,70,20);       
        TutionFeetf2.setBounds(196,333,189,30);

        RemainingAmountLabel2.setBounds(50,390,122,20);
        RemainingAmounttf2.setBounds(196,380,132,30);
        PayButton.setBounds(342,380,65,30);
    

        NumOfRemainingModulesLabel2.setBounds(541,338,128,20);     
        NumOfRemainingModulestf2.setBounds(697,333,160,30);

        NumOfMonthsAttendedLabel2.setBounds(50,442,113,20);    
        NumOfMonthsAttendedtf2.setBounds(196,437,189,30);

        DODropoutLabel2.setBounds(541,390,120,20);
        DODropoutYearcb2.setBounds(697,380,75,28);
        DODropoutMonthcb2.setBounds(782,380,79,28);
        DODropoutDaycb2.setBounds(871,380,72,28);

        DropoutHomeButton.setBounds(30,520,90,20);                //Home
        RemoveStudentButton.setBounds(147,490,168,32);
        DropoutAddstdButton.setBounds(345,490,168,32);
        DropoutDisplayButton.setBounds(590,490,120,32);     //Display   
        DropoutClearButton.setBounds(732,490,120,32);
        
        //-----------------adding the components--------------//
        MainMenuFrame1.add(RegularButton);
        MainMenuFrame1.add(DropoutButton);

        //-----------------adding the components for regular students--------------//
        RegularFrame1.add(Reglabel);
        
        RegularFrame1.add(StudentNameLabel1);
        RegularFrame1.add(StudentNametf1);

        RegularFrame1.add(DOBLabel1);
        RegularFrame1.add(DOBYearcb1);
        RegularFrame1.add(DOBMonthcb1);
        RegularFrame1.add(DOBDaycb1);

        RegularFrame1.add(EnrollmentIDLabel1);
        RegularFrame1.add(EnrollmentIDtf1);

        RegularFrame1.add(DOEnrollmentLabel1);
        RegularFrame1.add(DOEnrollmentYearcb1);
        RegularFrame1.add(DOEnrollmentMonthcb1);
        RegularFrame1.add(DOEnrollmentDaycb1);

        RegularFrame1.add(CourseNameLabel1);
        RegularFrame1.add(CourseNametf1);

        RegularFrame1.add(CourseDurationLabel1);
        RegularFrame1.add(CourseDurationtf1);

        RegularFrame1.add(TutionFeeLabel1);
        RegularFrame1.add(TutionFeetf1);

        RegularFrame1.add(NumOfModulesLabel1);
        RegularFrame1.add(NumOfModulestf1);

        RegularFrame1.add(NumOfCredithrsLabel1);
        RegularFrame1.add(NumOfCredithrstf1);

        RegularFrame1.add(NumOfDaysPresentLabel1);
        RegularFrame1.add(NumOfDaysPresenttf1);
        RegularFrame1.add(PresentPercentageButton);

        RegularFrame1.add(RegularDisplayButton);
        RegularFrame1.add(RegularHomeButton);
        RegularFrame1.add(GrantCertificateButton);
        RegularFrame1.add(RegularAddstdButton);
        RegularFrame1.add(RegularClearButton);

        //-----------------adding the components for dropout students--------------//
        DropoutFrame1.add(Droplabel);
        
        DropoutFrame1.add(StudentNameLabel2);
        DropoutFrame1.add(StudentNametf2);

        DropoutFrame1.add(DOBLabel2);
        DropoutFrame1.add(DOBYearcb2);
        DropoutFrame1.add(DOBMonthcb2);
        DropoutFrame1.add(DOBDaycb2);

        DropoutFrame1.add(EnrollmentIDLabel2);
        DropoutFrame1.add(EnrollmentIDtf2);

        DropoutFrame1.add(DOEnrollmentLabel2);
        DropoutFrame1.add(DOEnrollmentYearcb2);
        DropoutFrame1.add(DOEnrollmentMonthcb2);
        DropoutFrame1.add(DOEnrollmentDaycb2);

        DropoutFrame1.add(CourseNameLabel2);
        DropoutFrame1.add(CourseNametf2);
        
        DropoutFrame1.add(CourseDurationLabel2);
        DropoutFrame1.add(CourseDurationtf2);

        DropoutFrame1.add(TutionFeeLabel2);
        DropoutFrame1.add(TutionFeetf2);

        DropoutFrame1.add(NumOfRemainingModulesLabel2);
        DropoutFrame1.add(NumOfRemainingModulestf2);

        DropoutFrame1.add(NumOfMonthsAttendedLabel2);
        DropoutFrame1.add(NumOfMonthsAttendedtf2);

        DropoutFrame1.add(RemainingAmountLabel2);
        DropoutFrame1.add(RemainingAmounttf2);
        DropoutFrame1.add(PayButton);

        DropoutFrame1.add(DODropoutLabel2);
        DropoutFrame1.add(DODropoutYearcb2);
        DropoutFrame1.add(DODropoutMonthcb2);
        DropoutFrame1.add(DODropoutDaycb2);

        DropoutFrame1.add(DropoutDisplayButton);
        DropoutFrame1.add(DropoutHomeButton);
        DropoutFrame1.add(RemoveStudentButton);
        DropoutFrame1.add(DropoutAddstdButton);
        DropoutFrame1.add(DropoutClearButton);

        //----------adding or registering buttons to the required listerner interface
        RegularButton.addActionListener(this);
        DropoutButton.addActionListener(this);


        //----------adding or registering buttons to the required listerner interface of regular and dropout class
        PresentPercentageButton.addActionListener(this);
        PayButton.addActionListener(this);

        RegularHomeButton.addActionListener(this);
        DropoutHomeButton.addActionListener(this);

        RegularDisplayButton.addActionListener(this);
        DropoutDisplayButton.addActionListener(this);

        GrantCertificateButton.addActionListener(this);
        RemoveStudentButton.addActionListener(this);

        RegularAddstdButton.addActionListener(this);
        DropoutAddstdButton.addActionListener(this);

        RegularClearButton.addActionListener(this);
        DropoutClearButton.addActionListener(this);

        
        MainMenuFrame1.setLayout(null);
        MainMenuFrame1.add(Mainlabel);
        MainMenuFrame1.setSize(700, 700);
        MainMenuFrame1.setVisible(true);
        MainMenuFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenuFrame1.setLocationRelativeTo(null);
        
        
        RegularFrame1.setLayout(null);
        RegularFrame1.setSize(1000,600);
        RegularFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegularFrame1.setLocationRelativeTo(null);

        DropoutFrame1.setLayout(null);
        DropoutFrame1.setSize(1000,600);
        DropoutFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DropoutFrame1.setLocationRelativeTo(null);

    }
    //implement the method
    //action listener

    @Override
    public void actionPerformed(ActionEvent event){
        //logic of button functionality
        // This method is executed when a button is clicked in the GUI.
        // Check which button was clicked using the event.getSource() method.
        
        // If the RegularButton was clicked:
        if (event.getSource() == RegularButton){
             // Display the RegularFrame and hide the MainMenuFrame.
            RegularFrame1.setVisible(true);
            MainMenuFrame1.setVisible(false);

        // If the DropoutButton was clicked:
        }else if(event.getSource() == DropoutButton){
            // Display the DropoutFrame and hide the MainMenuFrame.
            DropoutFrame1.setVisible(true);
            MainMenuFrame1.setVisible(false);
            
        // If the RegularHomeButton was clicked:
        }else if(event.getSource() == RegularHomeButton){
            // Display the MainMenuFrame and hide the RegularFrame.
            MainMenuFrame1.setVisible(true);
            RegularFrame1.setVisible(false);

            // If the DropoutHomeButton was clicked:
        }else if(event.getSource() == DropoutHomeButton){
            // Display the MainMenuFrame and hide the DropoutFrame.
            MainMenuFrame1.setVisible(true);
            DropoutFrame1.setVisible(false);

        }
        //Add Grant certificate, add student , display and clear
        //regular student functions

        //adding regular student and getting all the parameters to make constructors
        //add object of regular class and creat object using constructor
        //add to the arraylist
        //check if the buttons input and output are valid or not 
        //courseName, enrollmentID, dateOfEnrollment
        // Assuming your Regular class has a grantCertificate method


    else if(event.getSource() == GrantCertificateButton) {
        if(EnrollmentIDtf1.getText().isEmpty() || CourseNametf1.getText().isEmpty()){
            JOptionPane.showMessageDialog(RegularFrame1, "Empty textFields.Please input properly!",
            "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
            // Retrieving input values from GUI fields
            String courseName = CourseNametf1.getText();
            //conveting integer into string and retriving values
            int enrollmentID = Integer.parseInt(EnrollmentIDtf1.getText());
            //using get selected item for combo box
            String DOEnrollmentYearcb2 = DOEnrollmentYearcb1.getSelectedItem().toString();
            String DOEnrollmentMonthcb2 = DOEnrollmentMonthcb1.getSelectedItem().toString();
            String DOEnrollmentDaycb2 = DOEnrollmentDaycb1.getSelectedItem().toString();
            String dateOfEnrollment = DOEnrollmentYearcb2 + "/" +DOEnrollmentMonthcb2 + "/" + DOEnrollmentDaycb2;
            // ypu can reolace "/"(displays 2004/10/24) with "-"(displays 2004-10-24)
            //debugging 
            /*System.out.println("Button clicked: Grant Certificate");
        System.out.println("Course Name: " + courseName);
        System.out.println("Enrollment ID: " + enrollmentID);
        System.out.println("Date of Enrollment: " + dateOfEnrollment);*/
        boolean check = true; 
        // Iterate through students and call grantCertificate method
            for (Student regstudent : students) {
                // Check if the student is an instance of Regular class.
                if(regstudent instanceof Regular){
                // Downcast the student to a Regular object.
                Regular regularStudent = (Regular) regstudent;
                
                 // Check if the enrollment ID of the student matches the provided enrollment ID.
                    if(regstudent.getEnrollmentID() == enrollmentID){
                    // If the enrollment ID matches, grant a certificate to the regular student.
                    regularStudent.grantCertificate(courseName, enrollmentID, dateOfEnrollment);
                    JOptionPane.showMessageDialog(null,"Student with enrollment id " + enrollmentID + " has been Granted Certificate!");       
                    }else{
                    // If the enrollment ID doesn't match, show an error message.
                    // This catch block handles any exceptions that might occur during the process.
                    // It's a good practice to catch specific exceptions rather than a general Exception class.
                    // You can add appropriate error handling or logging here.
                    JOptionPane.showMessageDialog(RegularFrame1, "Student with enrollment id " + enrollmentID + " not found. Please Try Again" ,
                    "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }  
        }catch(Exception exp){
        // Display an error message using JOptionPane if there are any number format exceptiom
        JOptionPane.showMessageDialog(null, "An error occurred: " + exp.getMessage(),
        "Error", JOptionPane.ERROR_MESSAGE);
    
            }
        }
    }
    //checking if arraylist is empty
    // add student button
    /*String dateOfEnrollment, int enrollmentID, String courseName, String studentName, String dateOfBirth, int courseDuration, int tutionFee,
    int numOfModules,  int numOfCreditHours, int daysPresent*/
    else if (event.getSource() == RegularAddstdButton) { 
        if (StudentNametf1.getText().isEmpty() ||
        EnrollmentIDtf1.getText().isEmpty() ||
        CourseNametf1.getText().isEmpty() ||
        TutionFeetf1.getText().isEmpty() ||
        NumOfModulestf1.getText().isEmpty() ||
        NumOfCredithrstf1.getText().isEmpty() ||
        NumOfDaysPresenttf1.getText().isEmpty() ||
        CourseDurationtf1.getText().isEmpty()) {

        JOptionPane.showMessageDialog(RegularFrame1, "Error: Please fill in all details.");
        } else {
            try {
            //first retriving all the parameters from the Regular class
            //convertinf interger datat type into string 
            //re-check it incase for number format exception
            //only takes values in string
            int enrollmentID = Integer.parseInt(EnrollmentIDtf1.getText());
            int tutionFee = Integer.parseInt(TutionFeetf1.getText());
            int numOfModules = Integer.parseInt(NumOfModulestf1.getText());
            int numOfCreditHours = Integer.parseInt(NumOfCredithrstf1.getText());
            int daysPresent = Integer.parseInt(NumOfDaysPresenttf1.getText());
            int courseDuration = Integer.parseInt(CourseDurationtf1.getText());
                        
            String enrollmentIDString = EnrollmentIDtf1.getText();
            String studentName = StudentNametf1.getText();
            String courseName = CourseNametf1.getText();
            String tutionFeeString = TutionFeetf1.getText();
            String numOfModulesString = NumOfModulestf1.getText();
            String numOfCreditHrsString = NumOfCredithrstf1.getText();
            String numOfDaysPresentString = NumOfDaysPresenttf1.getText();
            String courseDurationString = CourseDurationtf1.getText();

            String DOBYearcb2 = DOBYearcb1.getSelectedItem().toString();
            String DOBMonthcb2 = DOBMonthcb1.getSelectedItem().toString();
            String DOBDaycb2 = DOBDaycb1.getSelectedItem().toString();
            String dateOfBirth = DOBYearcb2 + "/" +DOBMonthcb2 + "/" + DOBDaycb2; 
                        
            String DOEnrollmentYearcb2 = DOEnrollmentYearcb1.getSelectedItem().toString();
            String DOEnrollmentMonthcb2 = DOEnrollmentMonthcb1.getSelectedItem().toString();
            String DOEnrollmentDaycb2 = DOEnrollmentDaycb1.getSelectedItem().toString();
            String dateOfEnrollment = DOEnrollmentYearcb2 + "/" +DOEnrollmentMonthcb2 + "/" + DOEnrollmentDaycb2;

            //checking if the arraylist is emoty
            //if empty then check for duplication of enrollment id
            //same enrollment id cannot be used since it overlaps 
            if(students.isEmpty()){
            // Creating an instance of the Regular class
            //parameters are passed down same as from Regular class
            //the order of this parameters is to be same as regular class
            Regular addStudent = new Regular(dateOfEnrollment, enrollmentID, courseName, studentName, dateOfBirth, courseDuration,
                                tutionFee, numOfModules, numOfCreditHours, daysPresent);
            students.add(addStudent);
            JOptionPane.showMessageDialog(RegularFrame1, "Array list has been added");
            }else{  
            // Checking for duplication
            // declaring isDuplicate as a variable to confirm duplication throught boolean data type
            //if duplication true cannot add student
            int EnrollmentIDnew =  enrollmentID;
            //declaring EnrollmentIDnew as th enrollmentID
            boolean isDuplicate = false;
            for (Student existingStudent : students) {
                 // Check if the student is an instance of Regular class.
                if (existingStudent instanceof Regular) {
                    //downcastinf the existingStudent to a regular object
                    Regular regstd = (Regular) existingStudent;
                    if(regstd.getEnrollmentID() == EnrollmentIDnew){
                        //if enrollmentId matches then new array list should be updated or formed
                        isDuplicate = true;
                    }
                }
            }
            if (isDuplicate) {
                //incase for repeated or duplicated enrollmentid then thros some error message
                JOptionPane.showMessageDialog(RegularFrame1, "This enrollment ID already exists",
                 "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                Regular addStudent = new Regular(dateOfEnrollment, enrollmentID, courseName, studentName, dateOfBirth, courseDuration,
                                tutionFee, numOfModules, numOfCreditHours, daysPresent);
                                students.add(addStudent);
                JOptionPane.showMessageDialog(RegularFrame1, "Student has been successfully added.");
                    }
            }
        } catch (NumberFormatException nfe) {
            // This catch block handles any exceptions that might occur during the process.
            // It's a good practice to catch specific exceptions rather than a general Exception class.
            // You can add appropriate error handling or logging here.
            System.out.println("NumberFormatException: " + nfe.getMessage());
            JOptionPane.showMessageDialog(RegularFrame1, "Invalid input. Please check the entered values.");
            }
        }
    }

    
    //display button
    //displays the input fields by the user
    //calling the display method from regular class
    else if(event.getSource() == RegularDisplayButton){
        if(students.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error: No Information to Display");
            }else{
            //loop through arraylist
            //loop continues uintil its from the same class
                for (Student student: students){
                //checking if the student info belongs to regular class
                //if not error message
                    if(student instanceof Regular){
                        //downcasting student obj into regular
                        //parent to chikd class
                        Regular RegObj = (Regular) student;
                        System.out.println("The information of Regular students are given: \n");
                        RegObj.display();
                    }else{
                        JOptionPane.showMessageDialog(RegularFrame1, "Error: No information on Regular Student to display");
                    }
                    
                }
            }
    }

    //present percentage
    //calling the present percentage method from regular class
    //calculates the present percentage value from the class 
    //grade given in char data type within the dialog box
    else if (event.getSource() == PresentPercentageButton) {
        if (CourseNametf1.getText().isEmpty() || 
            EnrollmentIDtf1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(RegularFrame1, "Error: Please Add the details.");
        } else {
            try {
                //first retriving the input values from the users
                //and should also match the parameters from the regular class
                //converting string into integer for number format exception
                int enrollmentID = Integer.parseInt(EnrollmentIDtf1.getText());
                int tutionFee = Integer.parseInt(TutionFeetf1.getText());
                int numOfModules = Integer.parseInt(NumOfModulestf1.getText());
                int numOfCreditHours = Integer.parseInt(NumOfCredithrstf1.getText());
                int daysPresent = Integer.parseInt(NumOfDaysPresenttf1.getText());
                int courseDuration = Integer.parseInt(CourseDurationtf1.getText());
                            
                String enrollmentIDString = EnrollmentIDtf1.getText();
                String studentName = StudentNametf1.getText();
                String courseName = CourseNametf1.getText();
                String tutionFeeString = TutionFeetf1.getText();
                String numOfModulesString = NumOfModulestf1.getText();
                String numOfCreditHrsString = NumOfCredithrstf1.getText();
                String numOfDaysPresentString = NumOfDaysPresenttf1.getText();
                String courseDurationString = CourseDurationtf1.getText();
    
                String DOBYearcb2 = DOBYearcb1.getSelectedItem().toString();
                String DOBMonthcb2 = DOBMonthcb1.getSelectedItem().toString();
                String DOBDaycb2 = DOBDaycb1.getSelectedItem().toString();
                String dateOfBirth = DOBYearcb2 + "/" +DOBMonthcb2 + "/" + DOBDaycb2; 
                            
                String DOEnrollmentYearcb2 = DOEnrollmentYearcb1.getSelectedItem().toString();
                String DOEnrollmentMonthcb2 = DOEnrollmentMonthcb1.getSelectedItem().toString();
                String DOEnrollmentDaycb2 = DOEnrollmentDaycb1.getSelectedItem().toString();
                String dateOfEnrollment = DOEnrollmentYearcb2 + "/" +DOEnrollmentMonthcb2 + "/" + DOEnrollmentDaycb2;
                //creating an instance of the studentGui class and calling the present percentage  method
                //calculates the present percentage and returns value in char data type within the dialog box
                Regular student = new Regular(dateOfEnrollment, enrollmentID, courseName, studentName,dateOfBirth,courseDuration, 
                        tutionFee ,numOfModules,  numOfCreditHours, daysPresent);
                // Calculate present percentage and grade   
                //if else loop returns grade in char similar to what it did in regular method
                char grade;
                if (daysPresent > courseDuration) {
                    //checking the given condition and throwing error message
                    JOptionPane.showMessageDialog(null,
                    "Error: Number of days present cannot be greater than course duration.",
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                    return;
                    } else {
                    double percentage = (double) daysPresent / courseDuration * 100;
                    if (percentage >= 80) {
                        grade = 'A';
                        } else if (percentage >= 60) {
                        grade = 'B';
                        } else if (percentage >= 40) {
                        grade = 'C';
                        } else if (percentage >= 20) {
                        grade = 'D';
                        } else {
                        grade = 'E';
                    }
                    // Display result in a message dialog
                    JOptionPane.showMessageDialog(RegularFrame1,
                    "Present Percentage: " + grade,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
                    }
            } catch (NumberFormatException ex) {
                    //if number format exception found error message is displayed
                    JOptionPane.showMessageDialog(RegularFrame1,
                    "Invalid input for days present. Please enter a valid number.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    // This catch block handles any exceptions that might occur during the process.
                    // It's a good practice to catch specific exceptions rather than a general Exception class.
                    // You can add appropriate error handling or logging here.
                    JOptionPane.showMessageDialog(RegularFrame1,
                    "An error occurred: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
        }
    }

    //clear button clears all the textfields and users can reinput the values in the form
    // dateOfEnrollment,  enrollmentID,  courseName,  studentName,  dateOfBirth,  courseDuration,  tutionFee,numOfModules,   numOfCreditHours,  daysPresent
    else if (event.getSource() == RegularClearButton){
        //setting all the textfields into null
        StudentNametf1.setText("");
        EnrollmentIDtf1.setText("");
        CourseNametf1.setText("");
        TutionFeetf1.setText("");
        NumOfModulestf1.setText("");
        NumOfCredithrstf1.setText("");
        NumOfDaysPresenttf1.setText("");
        CourseDurationtf1.setText("");
        //as for combo box setting it back to its originak value
        //using getselected item for combo box
        DOEnrollmentYearcb1.setSelectedItem("1999");//set back to 1999
        DOEnrollmentMonthcb1.setSelectedItem("Jan");
        DOEnrollmentDaycb1.setSelectedItem("1");
        DOBYearcb1.setSelectedItem("1999");
        DOBYearcb1.setSelectedItem("Jan");
        DOBYearcb1.setSelectedItem("1");
    }
    
    
    //pay button for the remaining amount
    //calling billspayable method from dropout class
    //calculaates the remaining amount
    //if pay bills 0 then student removed
    //bils payable button
    else if (event.getSource() == PayButton) {
            try {
                // Get the enrollment ID entered by the user
                int enrollmentID = Integer.parseInt(EnrollmentIDtf2.getText());
                int numOfMonthsAttended = Integer.parseInt(NumOfMonthsAttendedtf2.getText());
                String enrollmentIDString = EnrollmentIDtf2.getText();
                String numOfMonthsAttendedString = NumOfMonthsAttendedtf2.getText();

                /*
                System.out.println("Enrollment ID: " + enrollmentID);
                System.out.println("Number of Months Attended: " + numOfMonthsAttended);*/
                // Iterate through the list of students to find a match
                for (Student student1 : students) {
                    if (student1.getEnrollmentID() == enrollmentID) {
                        // Check if the student is a Dropout
                        if (student1 instanceof Dropout) {
                            // Downcast the student to a Dropout
                            Dropout dropoutstd = (Dropout) student1;
                            
                            // Call the billsPayable method and update the display
                            dropoutstd.billsPayable(dropoutstd.getNumOfMonthsAttended());
                            JOptionPane.showMessageDialog(DropoutFrame1, "Bills paid successfully.");
                        } else {
                            // Display a message if the student is not a dropout
                            JOptionPane.showMessageDialog(DropoutFrame1, "Student is not a dropout.");
                        }
                        break; // Exit the loop after finding the student
                    }
                }
            } catch (NumberFormatException ex) {
                // incase for exception handling
                JOptionPane.showMessageDialog(DropoutFrame1,
                    "Invalid enrollment ID format. Please enter a valid number.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            
    } else if (event.getSource() == RemoveStudentButton) {
        try {
        // Get the enrollment ID entered by the user
        int enrollmentID = Integer.parseInt(EnrollmentIDtf2.getText());
        //String enrollmentIDString = EnrollmentIDtf2.getText();

        // Iterate through the list of students to find a match
        for (Student student1 : students) {
             if (student1 instanceof Dropout){
                Dropout dropoutstd = (Dropout) student1;
                // Check if the student is a Dropout
                if (student1.getEnrollmentID() == enrollmentID) {
                // Downcast the student to a Dropout
                
                //checking if the bills are all cleared and doinf the same as the dropout class
                if (dropoutstd.getHasPaid() ){
                // Call the removeStudent method and update the display
                dropoutstd.removeStudent();
                students.remove(dropoutstd);
                JOptionPane.showMessageDialog(DropoutFrame1, "Dropout student removed successfully.");

                } else {
                // Display a message if the student is not a dropout
                JOptionPane.showMessageDialog(DropoutFrame1, "Student is not a dropout.");
                    }
                break; // Exit the loop after finding the student
                }
            }
        }
        } catch (NumberFormatException ex) {
            // Handle invalid enrollment ID format
            // This catch block handles any exceptions that might occur during the process.
            // It's a good practice to catch specific exceptions rather than a general Exception class.
            // You can add appropriate error handling or logging here.
            JOptionPane.showMessageDialog(DropoutFrame1,
                    "Invalid enrollment ID format. Please enter a valid number.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    //adds new dropout student 
    //first checks if arraylist is empty then duplicate enrollment id
    //same as for the regular add student button
    //add button for dropout class 
    else if(event.getSource() == DropoutAddstdButton ){
        if(StudentNametf2.getText().isEmpty() ||
        EnrollmentIDtf2.getText().isEmpty() ||
        TutionFeetf2.getText().isEmpty() ||
        NumOfRemainingModulestf2.getText().isEmpty() ||
        NumOfMonthsAttendedtf2.getText().isEmpty() ||
        CourseDurationtf2.getText().isEmpty() ||
        RemainingAmounttf2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(DropoutFrame1, "Error: Please fill in all details.");
        }else {
            try{
            //calling parameters from dropout class 
            //String dateOfBirth, int tutionFee, int courseDuration, String studentName,  int numOfRemainingModules, int numOfMonthsAttended,String dateOfDropout
            /*setter/mutator method
               super.setCourseName("Java");
               super.setEnrollmentID(4);
               super.setDateOfEnrollment("2003-09-21");*/
            int enrollmentID = Integer.parseInt(EnrollmentIDtf2.getText());
            int tutionFee = Integer.parseInt(TutionFeetf2.getText());
            int numOfRemainingModules = Integer.parseInt(NumOfRemainingModulestf2.getText());
            int numOfMonthsAttended = Integer.parseInt(NumOfMonthsAttendedtf2.getText());
            int courseDuration = Integer.parseInt(CourseDurationtf2.getText());
            int remainingAmount = Integer.parseInt(RemainingAmounttf2.getText());
          
            String enrollmentIDString = EnrollmentIDtf2.getText();
            String studentName = StudentNametf2.getText();
            
            String tutionFeeString = TutionFeetf2.getText();
            String numOfRemainingModulesString = NumOfRemainingModulestf2.getText();
            String numOfMonthsAttendedString = NumOfMonthsAttendedtf2.getText();
            String courseDurationString = CourseDurationtf2.getText();
            String remainingAmountString = RemainingAmounttf2.getText();


            String DOBYearcb3 = DOBYearcb2.getSelectedItem().toString();
            String DOBMonthcb3 = DOBMonthcb2.getSelectedItem().toString();
            String DOBDaycb3 = DOBDaycb2.getSelectedItem().toString();
            String dateOfBirth = DOBYearcb3 + "/" +DOBMonthcb3 + "/" + DOBDaycb3; 
                        
            String DOEnrollmentYearcb3 = DOEnrollmentYearcb2.getSelectedItem().toString();
            String DOEnrollmentMonthcb3 = DOEnrollmentMonthcb2.getSelectedItem().toString();
            String DOEnrollmentDaycb3 = DOEnrollmentDaycb2.getSelectedItem().toString();
            String dateOfEnrollment = DOEnrollmentYearcb3 + "/" +DOEnrollmentMonthcb3 + "/" + DOEnrollmentDaycb3;
            
            String DODropoutYearcb3 = DODropoutYearcb2.getSelectedItem().toString();
            String DODropoutMonthcb3 = DODropoutMonthcb2.getSelectedItem().toString();
            String DODropoutDaycb3 = DODropoutDaycb2.getSelectedItem().toString();
            String dateOfDropout = DODropoutYearcb3 + "/" +DODropoutMonthcb3 + "/" + DODropoutDaycb3; 
            
            
            //checking if the arraylist is emoty
            if(students.isEmpty()){
            // Creating an instance of the Regular class
            Dropout addDStudent = new Dropout(enrollmentID, dateOfBirth, tutionFee, courseDuration, studentName,
                    numOfRemainingModules, numOfMonthsAttended,dateOfDropout);
            
            students.add(addDStudent);
            JOptionPane.showMessageDialog(DropoutFrame1, "array list has been updated");
            }else{  
            // Checking for duplication
            int newEnrollmentID = enrollmentID;
            boolean isDuplicate = false;
            for (Student DropoutStudent : students) {
                //check if the Student is an instance of droput class
                if (DropoutStudent instanceof Dropout) {
                    //downcast the student to the dropout object
                    Dropout dropstd = (Dropout) DropoutStudent;
                    if(dropstd.getEnrollmentID() ==newEnrollmentID){
                    //check if the enrollment id matches of that of dropout 
                    isDuplicate = true;
                    }
                }
            }if (isDuplicate) {
                JOptionPane.showMessageDialog(DropoutFrame1, "This enrollment ID already exists");
            } else {
                Dropout addDStudent = new Dropout(enrollmentID, dateOfBirth, tutionFee, courseDuration, studentName,
                        numOfRemainingModules, numOfMonthsAttended,dateOfDropout);
                students.add(addDStudent);
                JOptionPane.showMessageDialog(DropoutFrame1, "Student has been succesfully added.");
                }
            }
        }catch (NumberFormatException numfe){
            // This catch block handles any exceptions that might occur during the process.
            // It's a good practice to catch specific exceptions rather than a general Exception class.
            // You can add appropriate error handling or logging here.
            System.out.println("NumberFormatException: " + numfe.getMessage());
            JOptionPane.showMessageDialog(DropoutFrame1, "Invalid input. Please check the entered values.");
            }
        }
    }
    
    //display button
    //displays all the values input but the users 
    else if(event.getSource() == DropoutDisplayButton ){
        if(students.isEmpty()){
        JOptionPane.showMessageDialog(null, "Error: No information to display");
        } else{
        //loop throught the arraylist
            for(Student student: students){
            //checking if the students info belongs to the class dropout 
                if(student instanceof Dropout){
                //downcasting student obj into dropoit
                //parent to child class
                Dropout DropObj = (Dropout) student;
                System.out.println("the information for Dropout class is give as: \n");
                DropObj.display();
                }else{
                    JOptionPane.showMessageDialog(DropoutFrame1, "Error: No information on Regular Student to display");
                }
            }
        }    
    }
    
    //clear button 
    //emptys all the textfield of the dropout form
    else if(event.getSource() == DropoutClearButton){
        EnrollmentIDtf2.setText("");
        StudentNametf2.setText("");
        CourseNametf2.setText("");
        CourseDurationtf2.setText("");
        TutionFeetf2.setText("");
        RemainingAmounttf2.setText("");
        NumOfRemainingModulestf2.setText("");
        NumOfMonthsAttendedtf2.setText("");
        DOEnrollmentYearcb2.setSelectedItem("1999");// Set back to 1999
        DOEnrollmentMonthcb2.setSelectedItem("Jan");// Set back to jan
        DOEnrollmentDaycb2.setSelectedItem("1");// Set back to 1
        DOBYearcb2.setSelectedItem("1999");// Set back to 1999
        DOBMonthcb2.setSelectedItem("Jan");// Set back to jan
        DOBDaycb2.setSelectedItem("1");// Set back to 1
        DODropoutYearcb2.setSelectedItem("1999");// Set back to 1999
        DODropoutMonthcb2.setSelectedItem("Jan");// Set back to jan
        DODropoutDaycb2.setSelectedItem("1");// Set back to 1
    }
}
public static void main(String[]args){
         new StudentGUI();
    } 
}
