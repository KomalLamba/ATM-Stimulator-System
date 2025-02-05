
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, income, education;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12, l13;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
                
        l1= new JLabel("Page 2: Additinal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290,80,400,30);
        add(l1);
        
        l2= new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l2.setBounds(100,140,100,30);
        add(l2);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh","Christian","Other"};
        religion = new JComboBox(valReligion); 
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,190,200,30);
        add(l3);
        
        String valCategory[] = {"General", "OBC", "SC", "ST","Other"};
        category = new JComboBox(valCategory); 
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        l4 = new JLabel("Income :");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100,240,100,30);
        add(l4);
        
        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(valIncome); 
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100,290,200,30);
        add(l5);
        
        
        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100,315,200,30);
        l11.setBackground(Color.WHITE);
        add(l11);
        
                
        String educationValues[] = {"Non-Graduate", "Graduation", "Post- Graduation", "Doctorate","Others"};
        education = new JComboBox(educationValues); 
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100,390,200,30);
        add(l6);
        
        String occupationValues[] = {"Salaried", "Self- Employed", "Buisness", "Student","Retired", "Others"};
        occupation = new JComboBox(occupationValues); 
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        l7 = new JLabel("PAN No.:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100,440,100,30);
        add(l7);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        l8= new JLabel("Aadhar:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100,490,100,30);
        add(l8);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100,540,200,30);
        add(l9);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(syes);
        seniorcitizen.add(sno);
        
        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100,590,200,30);
        add(l10);
        
        l12 = new JLabel("Form no:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        l12.setBounds(350,105,100,30);
        l12.setBackground(Color.WHITE);
        add(l12);
        
        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        l13.setBounds(400,315,100,30);
        l13.setBackground(Color.WHITE);
        add(l13);

        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation= (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount= "Yes";
        } else if(eno.isSelected()){
            existingaccount = "No";
        } 
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try{
            if(aadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields.");
            } else{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"', '"+soccupation+"', '"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);

                // signup 3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]){
        new SignupTwo("");
    } 
}

