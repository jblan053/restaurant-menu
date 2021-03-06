/*
 * Jonathan Blanco
 * version 2.0
 * The program represents a restaurant menu.
 * Concepts being applied are GUIs (Graphical User Interface) used with 
 * LinkedLists and Queues.
 */

package restaurant;

/**
 * A class that creates a window with several restaurant-like options.
 */
public class ReservationWindow extends javax.swing.JFrame
{
    private LinkedList reservationList = new LinkedList();
    private ListIterator iterator = reservationList.listIterator();
    
    private RestaurantQueue walkInList = new RestaurantQueue();

    /**
     * Creates new form ReservationWindow
     */
    public ReservationWindow()
    {
        initComponents();
    }

    /**
     * Check for empty fields and valid time format, for reservations. 
     * @return true if appropriate time format, false otherwise
     */
    private boolean isValidTimeReservation()
    {
        //Check for empty inputs
        if(lastNameReservation.getText().equals("") || firstNameReservation.getText().equals("") 
                || reservationTimeField.getText().equals(""))
        {
            displayReservationMessage.setText("Enter a first, last name, and/or time." + "\n");
            return false;
        }
        //Check for wrong time format           
        else if (reservationTimeField.getText().compareTo("09:00") < 0                      //In this format 15:45 for example,
                    || reservationTimeField.getText().compareTo("23:00") > 0                //check the number is between 09:00 &
                    || reservationTimeField.getText().length() != 5                         //23:00 (or desire values). Check that char
                    || reservationTimeField.getText().charAt(2) != ':'                      //at position 2 has to be ':'. Check that
                    || reservationTimeField.getText().substring(1, 2).compareTo("9") > 0    //char at pos. 1 is a number up to 9 & not a
                    || reservationTimeField.getText().substring(3, 4).compareTo("6") >= 0   //letter, for instance. Do the same w/ char
                    || reservationTimeField.getText().substring(4, 5).compareTo("9") > 0)   //at pos. 3 & 4. This also guarantees that
            {                                                                               //minutes are not higher than 59 minutes.
                displayReservationMessage.setText("Please enter a valid time and/or correct format." + "\n");
                return false;
            }
        else
            return true;
    }
    
    /**
     * Check for empty fields and valid time format, for walk-ins. 
     * @return true if appropriate time format
     */
    private boolean isValidTimeWalkIn()
    {
        //Check for empty inputs
        if(lastNameWalkIn.getText().equals("") || firstNameWalkIn.getText().equals("") 
                || walkInTimeField.getText().equals(""))
        {
            displayWalkInMessage.setText("Enter a first, last name, and/or time." + "\n");
            return false;
        }
        //Check for wrong time format           
        else if (walkInTimeField.getText().compareTo("09:00") < 0                      //In this format 15:45 for example,
                    || walkInTimeField.getText().compareTo("23:00") > 0                //check the number is between 09:00 &
                    || walkInTimeField.getText().length() != 5                         //23:00 (or desire values). Check that char
                    || walkInTimeField.getText().charAt(2) != ':'                      //at position 2 has to be ':'. Check that
                    || walkInTimeField.getText().substring(1, 2).compareTo("9") > 0    //char at pos. 1 is a number up to 9 & not a
                    || walkInTimeField.getText().substring(3, 4).compareTo("6") >= 0   //letter, for instance. Do the same w/ char
                    || walkInTimeField.getText().substring(4, 5).compareTo("9") > 0)   //at pos. 3 & 4. This also guarantees that
            {                                                                          //minutes are not higher than 59 minutes.
                displayWalkInMessage.setText("Please enter a valid time and/or correct format." + "\n");
                return false;
            }
        else
            return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        addReservation = new javax.swing.JButton();
        replaceReservation = new javax.swing.JButton();
        cancelReservation = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lastNameReservation = new javax.swing.JTextField();
        firstNameReservation = new javax.swing.JTextField();
        reservationTimeField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayReservation = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        displayReservationMessage = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        addWalkIn = new javax.swing.JButton();
        fillEmptyTable = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastNameWalkIn = new javax.swing.JTextField();
        firstNameWalkIn = new javax.swing.JTextField();
        walkInTimeField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayWalkIn = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayWalkInMessage = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("  Welcome To Blanco's Restaurant");
        jLabel1.setToolTipText("");

        addReservation.setText("ADD");
        addReservation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addReservationActionPerformed(evt);
            }
        });

        replaceReservation.setText("REPLACE");
        replaceReservation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                replaceReservationActionPerformed(evt);
            }
        });

        cancelReservation.setText("CANCEL");
        cancelReservation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelReservationActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name");

        jLabel3.setText("First Name");

        jLabel4.setText("Reservation Time (ex. 09:56)");

        jLabel5.setText("09:00 - 23:00");

        displayReservation.setEditable(false);
        displayReservation.setColumns(20);
        displayReservation.setRows(5);
        jScrollPane1.setViewportView(displayReservation);

        jLabel11.setText("Reservations:");

        displayReservationMessage.setColumns(20);
        displayReservationMessage.setRows(5);
        jScrollPane4.setViewportView(displayReservationMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(lastNameReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(addReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(replaceReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(firstNameReservation))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(cancelReservation)
                            .addComponent(reservationTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addReservation)
                    .addComponent(replaceReservation)
                    .addComponent(cancelReservation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Reservation", jPanel1);

        addWalkIn.setText("ADD");
        addWalkIn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addWalkInActionPerformed(evt);
            }
        });

        fillEmptyTable.setText("FILL TABLE");
        fillEmptyTable.setMaximumSize(new java.awt.Dimension(80, 23));
        fillEmptyTable.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fillEmptyTableActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name");

        jLabel7.setText("First Name");

        jLabel8.setText("Reservation Time (ex. 09:56)");

        jLabel9.setText("09:00 - 23:00");

        displayWalkIn.setEditable(false);
        displayWalkIn.setColumns(20);
        displayWalkIn.setRows(5);
        jScrollPane2.setViewportView(displayWalkIn);

        displayWalkInMessage.setEditable(false);
        displayWalkInMessage.setColumns(20);
        displayWalkInMessage.setRows(5);
        jScrollPane3.setViewportView(displayWalkInMessage);

        jLabel10.setText("Walk-Ins:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameWalkIn)
                            .addComponent(addWalkIn, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(firstNameWalkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(walkInTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addComponent(fillEmptyTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addWalkIn)
                    .addComponent(fillEmptyTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameWalkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameWalkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(walkInTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Walk-In", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addReservationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addReservationActionPerformed
    {//GEN-HEADEREND:event_addReservationActionPerformed
        if(isValidTimeReservation())
        {
            Reservation res = new Reservation(lastNameReservation.getText(),
                                              firstNameReservation.getText(),
                                              reservationTimeField.getText());
          
            if (iterator.find(res))
                displayReservationMessage.setText("Resevation already exists." + "\n");
            else
            {
                iterator.makeReservation(res);
                displayReservation.setText(iterator.toString() + "\n");
            }
        }
    }//GEN-LAST:event_addReservationActionPerformed

    private void replaceReservationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_replaceReservationActionPerformed
    {//GEN-HEADEREND:event_replaceReservationActionPerformed
        if (isValidTimeReservation())
        {
            Reservation newRes = new Reservation(lastNameReservation.getText(),
                                                 firstNameReservation.getText(),
                                                 reservationTimeField.getText());
            if (iterator.find(newRes))
                displayReservationMessage.setText("Resevation already exists." + "\n");
            else
            {
                boolean found = false;
                ListIterator temp = reservationList.listIterator();
                Reservation oldRes = null;

                while (temp.hasNext() && !found)
                {
                    oldRes = (Reservation) temp.next();

                    if ((oldRes.getFirstName().equals(newRes.getFirstName()))
                            && oldRes.getLastName().equals(newRes.getLastName()))
                        found = true;
                }

                if (found)
                {
                    iterator.replaceReservation(oldRes, newRes);
                    displayReservation.setText(iterator.toString() + "\n");
                }
                else
                    displayReservationMessage.setText("No Reservation Found" + "\n");
            }
        }
    }//GEN-LAST:event_replaceReservationActionPerformed

    private void cancelReservationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelReservationActionPerformed
    {//GEN-HEADEREND:event_cancelReservationActionPerformed
        if (isValidTimeReservation())
        {
            Reservation newRes = new Reservation(lastNameReservation.getText(),
                                                 firstNameReservation.getText(),
                                                 reservationTimeField.getText());
            if (iterator.find(newRes))
            {
                iterator.cancelReservation(newRes);
                displayReservation.setText(iterator.toString() + "\n");
            }
            else
                displayReservationMessage.setText("Resevation not found." + "\n");
        }
    }//GEN-LAST:event_cancelReservationActionPerformed

    private void addWalkInActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addWalkInActionPerformed
    {//GEN-HEADEREND:event_addWalkInActionPerformed
        if(isValidTimeWalkIn())
        {
            WalkIn walkIn = new WalkIn(lastNameWalkIn.getText(),
                                       firstNameWalkIn.getText(),
                                       walkInTimeField.getText());
          
                walkInList.addWalkIn(walkIn);
                displayWalkIn.setText(walkInList.toString() + "\n");
        }
    }//GEN-LAST:event_addWalkInActionPerformed

    private void fillEmptyTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fillEmptyTableActionPerformed
    {//GEN-HEADEREND:event_fillEmptyTableActionPerformed
            WalkIn walkIn = walkInList.fillEmptyTable();
            
            if(walkInList.peek() == null)
            {
                displayWalkIn.setText("");
                displayWalkInMessage.setText("There are no more persons waiting "
                                             + "\n" + "to be seated as walk-ins.");
            }
            else
            {
                displayWalkInMessage.setText("Here is your table " + walkIn.getFirstName()
                                             + " " + walkIn.getLastName() + ".\n" + "\n");
                displayWalkIn.setText(walkInList.toString() + "\n");
                displayWalkInMessage.append(walkInList.peek().getFirstName() + " you will be seated next." + "\n");
            }
    }//GEN-LAST:event_fillEmptyTableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReservation;
    private javax.swing.JButton addWalkIn;
    private javax.swing.JButton cancelReservation;
    private javax.swing.JTextArea displayReservation;
    private javax.swing.JTextArea displayReservationMessage;
    private javax.swing.JTextArea displayWalkIn;
    private javax.swing.JTextArea displayWalkInMessage;
    private javax.swing.JButton fillEmptyTable;
    private javax.swing.JTextField firstNameReservation;
    private javax.swing.JTextField firstNameWalkIn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameReservation;
    private javax.swing.JTextField lastNameWalkIn;
    private javax.swing.JButton replaceReservation;
    private javax.swing.JTextField reservationTimeField;
    private javax.swing.JTextField walkInTimeField;
    // End of variables declaration//GEN-END:variables
}
