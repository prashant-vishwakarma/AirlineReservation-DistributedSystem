/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsfinal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewJFrame extends javax.swing.JFrame {

     boolean end;
    
    String fselect; //selected flight no
    int countpa;    //to keep a count on passenger
    
    String ticket_no;
    
    ArrayList<Integer> selectedSeats=new ArrayList<>();
    
    
   String flight;
    String from=null;
    String to=null;
    Date date=null;
    int passenger=0;
    String sclass=null;
    
    
    /*******User ****/
    String name=null;
    String no=null;
    String password=null;
    String email=null;
    
    boolean SE[]=new boolean[10]; 
     int Wallet=50;
 /************flight***/
    
    String flight_no="00";           //query2 
    String flightname=null;
    int arrive=1000;
    int dept=1500;
    int seat_avail=0;
    int price=0;    
   
    
    DataInputStream in;
    DataOutputStream out;
    Socket s;

    public NewJFrame(DataInputStream ain, DataOutputStream aout ,Socket as) {
         out=aout;
        in=ain;
        s=as;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        From = new javax.swing.JTextField();
        To = new javax.swing.JTextField();
        Passenger = new javax.swing.JTextField();
        Date = new org.jdesktop.swingx.JXDatePicker();
        Search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        list = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lFrom = new javax.swing.JTextField();
        lTo = new javax.swing.JTextField();
        lDate = new org.jdesktop.swingx.JXDatePicker();
        jButton7 = new javax.swing.JButton();
        details = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        No = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        seats = new javax.swing.JPanel();
        sfrom = new javax.swing.JTextField();
        sto = new javax.swing.JTextField();
        sflightno = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        A0 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        scontinue = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        sdate = new org.jdesktop.swingx.JXDatePicker();
        sback = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        Bpay = new javax.swing.JButton();
        Bname1 = new javax.swing.JTextField();
        BDate = new org.jdesktop.swingx.JXDatePicker();
        Bflight1 = new javax.swing.JTextField();
        Bflightno1 = new javax.swing.JTextField();
        Btime1 = new javax.swing.JTextField();
        Bfrom1 = new javax.swing.JTextField();
        Bto1 = new javax.swing.JTextField();
        Bcardno1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        BExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setVisible(true);

        //start.setVisible(false);

        jLabel1.setText(" FLIGHT :");

        From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromActionPerformed(evt);
            }
        });

        To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToActionPerformed(evt);
            }
        });

        Passenger.setText("1");
        Passenger.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassengerFocusLost(evt);
            }
        });

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel2.setText("passenger");

        jLabel3.setText("Dept. date");

        jLabel37.setText("From");

        jLabel38.setText("To");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class", "Economy", "Bussiness" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel43.setText("Class");

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(startLayout.createSequentialGroup()
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Passenger))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search)
                            .addGroup(startLayout.createSequentialGroup()
                                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Passenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        list.setVisible(false);

        jLabel4.setText("From");

        jLabel5.setText("To");

        jLabel8.setText("Dept Date");

        jButton2.setText("Continue >");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight_no", "Flight Name", "arrival", "dept", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        lFrom.setEditable(false);
        lFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lFromActionPerformed(evt);
            }
        });

        lTo.setEditable(false);

        lDate.setEditable(false);

        jButton7.setText("<Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listLayout = new javax.swing.GroupLayout(list);
        list.setLayout(listLayout);
        listLayout.setHorizontalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listLayout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(listLayout.createSequentialGroup()
                        .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lTo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        listLayout.setVerticalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        details.setVisible(false);

        jLabel9.setText("Details ");

        jLabel10.setText("Name");

        jLabel11.setText("Phone Number");

        jLabel12.setText("Email");

        jLabel14.setText("Password");

        jButton3.setText("Continue>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        No.setText(" ");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });

        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        Password.setText(" ");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jButton8.setText("<Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsLayout = new javax.swing.GroupLayout(details);
        details.setLayout(detailsLayout);
        detailsLayout.setHorizontalGroup(
            detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsLayout.createSequentialGroup()
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(detailsLayout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(detailsLayout.createSequentialGroup()
                                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(85, 85, 85)
                                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Name)
                                        .addComponent(No, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(Email)))))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        detailsLayout.setVerticalGroup(
            detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        seats.setVisible(false);
        //seats.setVisible(true);

        sfrom.setEditable(false);
        sfrom.setText(" ");

        sto.setEditable(false);

        sflightno.setEditable(false);
        sflightno.setText(" ");

        sname.setEditable(false);

        jLabel16.setText("Assigned");

        jLabel17.setText("Free");

        jLabel18.setText("Occupied");

        jLabel19.setBackground(new java.awt.Color(255, 0, 51));
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("   ");

        jLabel20.setBackground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("   ");

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setForeground(new java.awt.Color(51, 255, 51));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 255, 204));
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        if(SE[0]!=true){
            A0.setBackground(new java.awt.Color(0, 255, 0));
            A0.setForeground(new java.awt.Color(51, 255, 51));
        }
        A0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A0ActionPerformed(evt);
            }
        });

        if(SE[1]!=true){
            A1.setBackground(new java.awt.Color(0, 255, 0));
            A1.setForeground(new java.awt.Color(51, 255, 51));
        }
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        if(SE[2]!=true){
            A2.setBackground(new java.awt.Color(0, 255, 0));
            A2.setForeground(new java.awt.Color(51, 255, 51));
        }
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        if(SE[3]!=true){
            A3.setBackground(new java.awt.Color(0, 255, 0));
            A3.setForeground(new java.awt.Color(51, 255, 51));
        }
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        if(SE[4]!=true){
            A4.setBackground(new java.awt.Color(0, 255, 0));
            A4.setForeground(new java.awt.Color(51, 255, 51));
        }
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        if(SE[5]!=true){
            A5.setBackground(new java.awt.Color(0, 255, 0));
            A5.setForeground(new java.awt.Color(51, 255, 51));
        }
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        if(SE[6]!=true){
            A6.setBackground(new java.awt.Color(0, 255, 0));
            A6.setForeground(new java.awt.Color(51, 255, 51));
        }
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        if(SE[7]!=true){
            A7.setBackground(new java.awt.Color(0, 255, 0));
            A7.setForeground(new java.awt.Color(51, 255, 51));
        }
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        if(SE[8]!=true){
            A8.setBackground(new java.awt.Color(0, 255, 0));
            A8.setForeground(new java.awt.Color(51, 255, 51));
        }
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        if(SE[9]!=true){
            A9.setBackground(new java.awt.Color(0, 255, 0));
            A9.setForeground(new java.awt.Color(51, 255, 51));
        }
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        scontinue.setText("Continue>");
        scontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scontinueActionPerformed(evt);
            }
        });

        jLabel21.setText("A1");

        jLabel22.setText("A2");

        jLabel23.setText("B1");

        jLabel24.setText("B2");

        jLabel25.setText("C1");

        jLabel26.setText("D1");

        jLabel27.setText("E1");

        jLabel31.setText("C2");

        jLabel32.setText("D2");

        jLabel33.setText("E2");

        sdate.setEditable(false);

        sback.setText("<Back");
        sback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seatsLayout = new javax.swing.GroupLayout(seats);
        seats.setLayout(seatsLayout);
        seatsLayout.setHorizontalGroup(
            seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatsLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(15, 15, 15)))
                    .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(seatsLayout.createSequentialGroup()
                                    .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(seatsLayout.createSequentialGroup()
                                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(seatsLayout.createSequentialGroup()
                                                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(seatsLayout.createSequentialGroup()
                                                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(seatsLayout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel24)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel31)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel32)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel33)))
                                    .addGap(67, 67, 67))
                                .addGroup(seatsLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel23)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel25)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel26)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel27)
                                    .addGap(56, 56, 56)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17)
                                .addComponent(jLabel16)))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sname)
                                .addComponent(sfrom, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addComponent(sback)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scontinue))))
                .addGap(64, 75, Short.MAX_VALUE))
        );
        seatsLayout.setVerticalGroup(
            seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sflightno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scontinue)
                            .addComponent(sback))
                        .addGap(43, 43, 43))
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(seatsLayout.createSequentialGroup()
                                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, seatsLayout.createSequentialGroup()
                                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(seatsLayout.createSequentialGroup()
                                        .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(seatsLayout.createSequentialGroup()
                                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(seatsLayout.createSequentialGroup()
                                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(seatsLayout.createSequentialGroup()
                                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)))
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)))))
        );

        jInternalFrame1.setVisible(false);

        Bpay.setText("Pay");
        Bpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpayActionPerformed(evt);
            }
        });

        Bname1.setEditable(false);
        Bname1.setText(" ");
        Bname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bname1ActionPerformed(evt);
            }
        });

        BDate.setEditable(false);
        BDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDateActionPerformed(evt);
            }
        });

        Bflight1.setEditable(false);
        Bflight1.setText(" ");
        Bflight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bflight1ActionPerformed(evt);
            }
        });

        Bflightno1.setEditable(false);

        Btime1.setEditable(false);
        Btime1.setText(" ");

        Bfrom1.setEditable(false);
        Bfrom1.setText(" ");

        Bto1.setEditable(false);
        Bto1.setText(" ");

        Bcardno1.setEditable(false);
        Bcardno1.setText(" ");
        Bcardno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcardno1ActionPerformed(evt);
            }
        });

        jLabel44.setText("Name");

        jLabel45.setText("Date");

        jLabel46.setText("Flight");

        jLabel47.setText("Flight no");

        jLabel48.setText("time");

        jLabel49.setText("From");

        jLabel50.setText("To");

        jLabel51.setText("Wallet Amount");

        BExit.setText("Exit");
        BExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bpay))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(Bname1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bflight1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(Bfrom1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bto1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel47)
                                            .addComponent(Bflightno1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(Btime1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(Bcardno1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bflight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bflightno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bfrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bcardno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bpay)
                    .addComponent(BExit))
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromActionPerformed

    private void ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToActionPerformed

    private void PassengerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_PassengerFocusLost

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        //this.setVisible(false);        // TODO add your handling code here:
        //DSClient2.remove(jPanel1);
        //DSClient2.add(jPanel2);
        start.setVisible(false);
        to = To.getText();
        from = From.getText();
        passenger = Integer.parseInt(Passenger.getText());
        countpa=passenger;
        date = Date.getDate();
        DateFormat dt= new SimpleDateFormat("yyyy/MM/dd");

        sclass=(String) jComboBox1.getSelectedItem();
        try{
            out.writeUTF("SEARCHFLIGHTS");
           // out.writeUTF("select * from Flight;");
            out.writeUTF("Select * from Flight where origin = '"+from+"' AND dest= '"+to+"'"+/* AND date ="+dt.format(date)+*/" AND class='"+sclass+"' AND seat_avail > "+passenger+" ;");

            String tosend="";
            tosend=in.readUTF();
            
            while(!tosend.equals("FINISH")){
                System.out.println(tosend);
                String[] abc=tosend.split(" ");
                System.out.println(abc.length);
                System.out.println(abc[0]+" "+abc[1]+" "+abc[5]+" "+abc[6]+" "+abc[9]);
                Object[] row= new Object[]{abc[0],abc[1],abc[5],abc[6],abc[9]};
                DefaultTableModel model=(DefaultTableModel) table.getModel();
                model.addRow(row);
                tosend=in.readUTF();
            }
        }catch(IOException e){
            System.out.println(e);

        }
        
        lFrom.setText(from);
        lTo.setText(to);
        lDate.setDate(date);

        list.setVisible(true);

    }//GEN-LAST:event_SearchActionPerformed

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            list.setVisible(false);
            fselect=table.getValueAt(table.getSelectedRow(), 0).toString();
            System.out.println(fselect);
            
            out.writeUTF("SEARCHFLIGHTS");
            out.writeUTF("select * from Flight where flight_no ='"+fselect+"';");
            flight=in.readUTF();
            System.out.println(flight);
            String abc[]=flight.split(" ");
            flight_no=abc[0];
            flightname=abc[1];
            from=abc[2];
            to=abc[3];
            arrive=Integer.parseInt(abc[5]);
            dept=Integer.parseInt(abc[6]);
            price=Integer.parseInt(abc[9]);
            seat_avail=Integer.parseInt(abc[7]);
            //flight=abc[0];
            in.readUTF();
            
            out.writeUTF("CHECKSEATS");
            
            out.writeUTF("Select * from seats where flight_no='"+flight_no+"';");
            
            String xyz="";
            xyz=in.readUTF();
            System.out.println(xyz);
            String[] pqr=xyz.split(" ");
                for(int i=0;i<10;i++){
                    System.out.println(pqr[i+1]);
                    if(pqr[i+1].equals("0"))
                        SE[i]=false;
                    else
                        SE[i]=true;
                }
            

            //out.writeUTF(flightid);

            details.setVisible(true);
            // TODO add your handling code here:
        } catch (IOException ex) {
          //  Logger.getLogger(DSClient2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lFromActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        list.setVisible(false);
        start.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            //details.setVisible(false);
            name=Name.getText();
            try{
                no=No.getText();
            }catch(NumberFormatException e){
                System.out.println(e);
            }
            email=Email.getText();
           
            String conc=name+" "+no+" "+email+" "+password+" ";
                out.writeUTF("USER");
                out.writeUTF(conc);
                Wallet=Integer.parseInt(in.readUTF());
                
                details.setVisible(false);
                sname.setText(name);
                sfrom.setText(from);
                sto.setText(to);
                sdate.setDate(date);

                if(SE[0]==true){
                    A0.setBackground(new java.awt.Color(0, 255, 204));
                    A0.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[1]==true){
                    A1.setBackground(new java.awt.Color(0, 255, 204));
                    A1.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[2]==true){
                    A2.setBackground(new java.awt.Color(0, 255, 204));
                    A2.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[3]==true){
                    A3.setBackground(new java.awt.Color(0, 255, 204));
                    A3.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[4]==true){
                    A4.setBackground(new java.awt.Color(0, 255, 204));
                    A4.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[5]==true){
                    A5.setBackground(new java.awt.Color(0, 255, 204));
                    A5.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[6]==true){
                    A6.setBackground(new java.awt.Color(0, 255, 204));
                    A6.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[7]==true){
                    A7.setBackground(new java.awt.Color(0, 255, 204));
                    A7.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[8]==true){
                    A8.setBackground(new java.awt.Color(0, 255, 204));
                    A8.setForeground(new java.awt.Color(255, 0, 0));
                }
                if(SE[9]==true){
                    A9.setBackground(new java.awt.Color(0, 255, 204));
                    A9.setForeground(new java.awt.Color(255, 0, 0));
                }

                seats.setVisible(true);
                //  }else
            //     VPassword.setText("enter correct password"+password+" "+VPassword.getText());

            //}
        // TODO add your handling code here:

        }catch(IOException ex){
           // Logger.getLogger(DSClient2.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoActionPerformed

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_EmailFocusLost

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        details.setVisible(false);
        list.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void A0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A0ActionPerformed

        if(countpa-->0 && SE[0]!=true){
            A0.setBackground(new java.awt.Color(255, 0, 51));
            A0.setForeground(new java.awt.Color(255, 0, 0));
            selectedSeats.add(0);
        }// TODO add your handling code here:
    }//GEN-LAST:event_A0ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        if(countpa-->0 && SE[1]!=true){A1.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(1);
            A1.setForeground(new java.awt.Color(255, 0, 0));}  // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        if(countpa-->0 && SE[2]!=true){A2.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(2);
            A2.setForeground(new java.awt.Color(255, 0, 0));} // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        if(countpa-->0 && SE[3]!=true){ A3.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(3);
            A3.setForeground(new java.awt.Color(255, 0, 0));} // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        if(countpa-->0 && SE[4]!=true){  A4.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(4);
            A4.setForeground(new java.awt.Color(255, 0, 0)); }// TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        if(countpa-->0 && SE[5]!=true){  A5.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(5);
            A5.setForeground(new java.awt.Color(255, 0, 0));} // TODO add your handling code here:
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        if(countpa-->0 && SE[6]!=true){ A6.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(6);
            A6.setForeground(new java.awt.Color(255, 0, 0));}// TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        if(countpa-->0 && SE[7]!=true){A7.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(7);
            A7.setForeground(new java.awt.Color(255, 0, 0)); }// TODO add your handling code here:
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        if(countpa-->0 && SE[8]!=true){ A8.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(8);
            A8.setForeground(new java.awt.Color(255, 0, 0)); }// TODO add your handling code here:
    }//GEN-LAST:event_A8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        if(countpa-->0 && SE[9]!=true){
            A9.setBackground(new java.awt.Color(255, 0, 51));
            selectedSeats.add(9);
            A9.setForeground(new java.awt.Color(255, 0, 0));}
    }//GEN-LAST:event_A9ActionPerformed

    private void scontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scontinueActionPerformed

        System.out.println(selectedSeats);

        try {
            out.writeUTF("ASSIGN");
            String sad="";
            
            int n=selectedSeats.size();
            System.out.println(n);
            seat_avail=seat_avail-n;
            out.writeUTF("UPDATE Flight SET seat_avail = "+seat_avail+" where flight_no='"+flight_no+"';");
            out.writeUTF(Integer.toString(n));

            for(int x:selectedSeats)
                out.writeUTF("UPDATE seats SET s"+(x+1)+"='1' where flight_no='"+flight_no+"';");
        } catch (IOException ex) {
//            Logger.getLogger(DSClient2.class.getName()).log(Level.SEVERE, null, ex);
        }

        Bname1.setText(name);
        Bflight1.setText(flightname);
        Bcardno1.setText(Integer.toString(Wallet));
        Bflightno1.setText(flight_no);
        Btime1.setText(Integer.toString(arrive));
        Bto1.setText(to);
        Bfrom1.setText(from);
        BDate.setDate(date);

        jInternalFrame1.setVisible(true);
    }//GEN-LAST:event_scontinueActionPerformed

    private void sbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbackActionPerformed
        seats.setVisible(false);
        for(int x:selectedSeats){
            SE[x]=false;
        }
        selectedSeats.removeAll(selectedSeats);
        details.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_sbackActionPerformed

    private void BpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpayActionPerformed
        // jPanel2.setVisible(false);
        jInternalFrame1.setVisible(false);
        seats.setVisible(false);

        try {
            out.writeUTF("COMPLETE");
            String sea="";
            for(int x:selectedSeats){sea="S"+x+" ";}
            
            ticket_no=in.readUTF();
           
            String loga="TICKET NO : "+ticket_no+"\nNAME :"+name+"\nEMAIL :"+email+"\n  *****Flight***** \nFrom"+from+"\nTO :"+to;
            for(int x:selectedSeats){
                loga=loga+"\nSeats:\tS"+x;
            }
            
            System.out.println(loga);
            
            out.writeUTF("\"Insert into tickets(name,seats) values('"+name+"','"+sea+"');");
            ticket_no=in.readUTF();
           
        } catch (IOException ex) {
    //            Logger.getLogger(DSClient2.class.getName()).log(Level.SEVERE, null, ex);
        }
        start.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BpayActionPerformed

    private void Bname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bname1ActionPerformed

    private void BDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDateActionPerformed

    private void Bflight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bflight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bflight1ActionPerformed

    private void Bcardno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcardno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bcardno1ActionPerformed

    private void BExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExitActionPerformed
        jInternalFrame1.setVisible(false);       // jPanel2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BExitActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A0;
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private org.jdesktop.swingx.JXDatePicker BDate;
    private javax.swing.JButton BExit;
    private javax.swing.JTextField Bcardno1;
    private javax.swing.JTextField Bflight1;
    private javax.swing.JTextField Bflightno1;
    private javax.swing.JTextField Bfrom1;
    private javax.swing.JTextField Bname1;
    private javax.swing.JButton Bpay;
    private javax.swing.JTextField Btime1;
    private javax.swing.JTextField Bto1;
    private org.jdesktop.swingx.JXDatePicker Date;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField From;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField No;
    private javax.swing.JTextField Passenger;
    private javax.swing.JTextField Password;
    private javax.swing.JButton Search;
    private javax.swing.JTextField To;
    private javax.swing.JPanel details;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker lDate;
    private javax.swing.JTextField lFrom;
    private javax.swing.JTextField lTo;
    private javax.swing.JPanel list;
    private javax.swing.JButton sback;
    private javax.swing.JButton scontinue;
    private org.jdesktop.swingx.JXDatePicker sdate;
    private javax.swing.JPanel seats;
    private javax.swing.JTextField sflightno;
    private javax.swing.JTextField sfrom;
    private javax.swing.JTextField sname;
    private javax.swing.JPanel start;
    private javax.swing.JTextField sto;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
