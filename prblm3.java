/*You are tasked with creating a Java GUI application to manage student records. The application should include the following features:

Interface Design:

Design a GUI with appropriate components such as labels, text fields, buttons, and a text area.
Include fields for Student ID, Name, GPA, and Major.
Event Handling:

Implement an "Add Student" button that captures input from the text fields and adds a new student entry to the system.
Implement a "Display Records" button that retrieves student information from a file and displays it in the text area.
File I/O Operations:

Create a file named "StudentRecords.txt" to store student information.
When the "Add Student" button is clicked, append the student details to the file in the format: StudentID,Name,GPA,Major.
When the "Display Records" button is clicked, read the content of the file and display it in the text area.
Error Handling:

Implement appropriate error handling to manage situations such as file not found, incorrect data format, or other exceptions. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prblm3 {
    JFrame f = new JFrame("Student Records");
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    JTextArea ta;
    
}
