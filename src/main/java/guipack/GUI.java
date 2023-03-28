package guipack;

import com.formdev.flatlaf.FlatIntelliJLaf;

import java.awt.*;
import java.io.File;
import java.util.Objects;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import applicationcore.Database;
import datatypes.Record;


/**
 *
 * @author isiahcastro
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        FlatIntelliJLaf.setup();
        initComponents();
        dataTable.setEnabled(false);
        infoText.setEditable(false);
        infoText.setLineWrap(true);
        infoText.setWrapStyleWord(true);
        statusLabel.setVisible(false);
        sortOptions.addItem("TMAX");
        sortOptions.addItem("TMIN");
        sortOptions.addItem("Date");
        sortOptions.addItem("Snow");
        sortOptions.addItem("Wind");
        algoBox.addItem("Insertion");
        algoBox.addItem("Dual-pivot");
        algoBox.addItem("Selection");
        consoleText.setEditable(false);
        sortText.setEditable(false);
        model = (DefaultTableModel)dataTable.getModel();
        homePane.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moreInfo = new javax.swing.JDialog();
        infoPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoText = new javax.swing.JTextArea();
        mainPane = new javax.swing.JTabbedPane();
        homePane = new javax.swing.JPanel();
        javax.swing.JButton moreInformationButton = new javax.swing.JButton();
        headerLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        loadFilePane = new javax.swing.JPanel();
        csvLabel = new javax.swing.JLabel();
        openFile = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consoleText = new javax.swing.JTextArea();
        fileLabel = new javax.swing.JLabel();
        viewData = new javax.swing.JPanel();
        tablePane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        displayChecked = new javax.swing.JCheckBox();
        refreshButton = new javax.swing.JButton();
        sortsPane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sortText = new javax.swing.JTextArea();
        sortOptions = new javax.swing.JComboBox<>();
        sortButton = new javax.swing.JButton();
        paramLabel = new javax.swing.JLabel();
        algoBox = new javax.swing.JComboBox<>();
        algoLabel = new javax.swing.JLabel();

        moreInfo.setSize(new java.awt.Dimension(500, 500));

        infoText.setColumns(20);
        infoText.setRows(5);
        infoText.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nibh cras pulvinar mattis nunc sed. Malesuada bibendum arcu vitae elementum curabitur vitae nunc sed. Tellus rutrum tellus pellentesque eu tincidunt tortor aliquam. Est lorem ipsum dolor sit amet. At auctor urna nunc id cursus metus aliquam eleifend. Viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Lobortis mattis aliquam faucibus purus in massa tempor nec feugiat. Ante in nibh mauris cursus. Tellus id interdum velit laoreet id. Sit amet massa vitae tortor condimentum. Dolor magna eget est lorem. Eget sit amet tellus cras. Gravida in fermentum et sollicitudin ac orci. Est pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat. Enim neque volutpat ac tincidunt vitae semper quis lectus nulla. Mi proin sed libero enim sed faucibus turpis.\n\nAc tortor vitae purus faucibus ornare suspendisse sed nisi lacus. Ultricies tristique nulla aliquet enim. Pretium lectus quam id leo in vitae turpis massa sed. Semper feugiat nibh sed pulvinar proin gravida. Venenatis a condimentum vitae sapien. Mauris a diam maecenas sed enim. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque. Nulla pellentesque dignissim enim sit amet venenatis. Enim ut sem viverra aliquet eget. Aliquam ut porttitor leo a diam sollicitudin tempor id. A diam maecenas sed enim ut sem viverra. Justo donec enim diam vulputate ut pharetra sit amet. Ipsum dolor sit amet consectetur adipiscing elit duis tristique sollicitudin. Libero volutpat sed cras ornare arcu. Eu non diam phasellus vestibulum lorem sed. Commodo viverra maecenas accumsan lacus vel facilisis. Tempor id eu nisl nunc mi.");
        jScrollPane1.setViewportView(infoText);

        javax.swing.GroupLayout infoPaneLayout = new javax.swing.GroupLayout(infoPane);
        infoPane.setLayout(infoPaneLayout);
        infoPaneLayout.setHorizontalGroup(
            infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        infoPaneLayout.setVerticalGroup(
            infoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout moreInfoLayout = new javax.swing.GroupLayout(moreInfo.getContentPane());
        moreInfo.getContentPane().setLayout(moreInfoLayout);
        moreInfoLayout.setHorizontalGroup(
            moreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        moreInfoLayout.setVerticalGroup(
            moreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOAA WEATHER APP");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(705, 430));

        homePane.setEnabled(false);

        moreInformationButton.setText("More Info");
        moreInformationButton.setToolTipText("click for more information!");
        moreInformationButton.setFocusPainted(false);
        moreInformationButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moreInformationButton.setMaximumSize(new java.awt.Dimension(125, 125));
        moreInformationButton.setMinimumSize(new java.awt.Dimension(125, 125));
        moreInformationButton.setPreferredSize(new java.awt.Dimension(512, 512));
        moreInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreInformationButtonActionPerformed(evt);
            }
        });

        headerLabel.setText("Written by Isiah Castro");

        versionLabel.setForeground(new java.awt.Color(255, 0, 0));
        versionLabel.setText("V1.1.2");

        javax.swing.GroupLayout homePaneLayout = new javax.swing.GroupLayout(homePane);
        homePane.setLayout(homePaneLayout);
        homePaneLayout.setHorizontalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePaneLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel)
                    .addComponent(moreInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(versionLabel)
                .addGap(17, 17, 17))
        );
        homePaneLayout.setVerticalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePaneLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addGap(18, 18, 18)
                .addComponent(moreInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(versionLabel)
                .addContainerGap())
        );

        mainPane.addTab("Home", homePane);

        csvLabel.setText("Choose a CSV");

        openFile.setText("Open File");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        statusLabel.setText("NULL");

        consoleText.setColumns(20);
        consoleText.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        consoleText.setRows(5);
        consoleText.setFocusable(false);
        jScrollPane2.setViewportView(consoleText);

        fileLabel.setText("File Information:");

        javax.swing.GroupLayout loadFilePaneLayout = new javax.swing.GroupLayout(loadFilePane);
        loadFilePane.setLayout(loadFilePaneLayout);
        loadFilePaneLayout.setHorizontalGroup(
            loadFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadFilePaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(loadFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(openFile)
                    .addComponent(csvLabel)
                    .addComponent(statusLabel))
                .addGap(43, 43, 43)
                .addGroup(loadFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loadFilePaneLayout.createSequentialGroup()
                        .addComponent(fileLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addContainerGap())
        );
        loadFilePaneLayout.setVerticalGroup(
            loadFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadFilePaneLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(csvLabel)
                .addGap(18, 18, 18)
                .addComponent(openFile)
                .addGap(24, 24, 24)
                .addComponent(statusLabel)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadFilePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        mainPane.addTab("Load File", loadFilePane);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Station Location", "Date", "TMAX", "TMIN"
            }
        ));
        dataTable.setSelectionBackground(new java.awt.Color(62, 200, 225));
        dataTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        dataTable.setShowGrid(true);
        tablePane.setViewportView(dataTable);

        displayChecked.setText("Display All Fields");

        refreshButton.setText("Refresh");
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        refreshButton.setIconTextGap(10);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewDataLayout = new javax.swing.GroupLayout(viewData);
        viewData.setLayout(viewDataLayout);
        viewDataLayout.setHorizontalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePane)
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addComponent(displayChecked)
                        .addGap(18, 18, 18)
                        .addComponent(refreshButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewDataLayout.setVerticalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayChecked)
                    .addComponent(refreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPane.addTab("View Data", viewData);

        sortText.setColumns(20);
        sortText.setRows(5);
        sortText.setFocusable(false);
        jScrollPane3.setViewportView(sortText);

        sortButton.setText("Sort!");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        paramLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paramLabel.setText("Sort by...");

        algoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        algoLabel.setText("Algorithm");

        javax.swing.GroupLayout sortsPaneLayout = new javax.swing.GroupLayout(sortsPane);
        sortsPane.setLayout(sortsPaneLayout);
        sortsPaneLayout.setHorizontalGroup(
            sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortsPaneLayout.createSequentialGroup()
                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sortsPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sortOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paramLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(algoBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(algoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(sortsPaneLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(sortButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sortsPaneLayout.setVerticalGroup(
            sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortsPaneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(sortsPaneLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paramLabel)
                    .addComponent(algoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(algoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(sortButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPane.addTab("Sorts and Algorithms", sortsPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("NOAA WEATHER APP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method handles opening a JFileChooser when "Open File" button is
     * pressed. The directory for the file that is selected comes from here.
     * @param evt not used
     */
    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        //file browser that opens
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //sets filter on file types
        chooser.setFileFilter(new FileNameExtensionFilter("CSV FILES", "csv"));
        //opens file browser
        chooser.showOpenDialog(mainPane);
        //gets selected file path
        File file = chooser.getSelectedFile();
        //case if user clicks out of File Browser without using cancel.
        if(file == null) {
            return;
        }
        try {
            //checking to see if file is csv
            if (!"csv".equalsIgnoreCase(file.getAbsolutePath()
                    .substring(file.getAbsolutePath().length() - 3, 
                            file.getAbsolutePath().length() - 1))) {
                statusLabel.setText("SUCCESS!");
                statusLabel.setForeground(Color.GREEN);
                data = new Database(file.getName(), getInstance());
                fileLabel.setText("File: " + file.getName());
            } else {
                statusLabel.setText("Failure");
                statusLabel.setForeground(Color.RED);
            }
        } catch (NullPointerException e) {
            System.err.println("error in opening file");
            System.exit(5);
            loadFilePane.setVisible(true);
            return;
        }
        statusLabel.setVisible(true);
        populateTable();
    }//GEN-LAST:event_openFileActionPerformed

    /**
     * Method parses the information found within the GUI to properly select
     * the correct sort.
     * @param evt not used
     */
    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {
            data.pickSorts(algoBox.getSelectedIndex() + 1,
                    Objects.requireNonNull(sortOptions.getSelectedItem()).toString());
            populateTable();
    }

    /**
     * Handles refreshing the table when user wants to show extra data.
     * @param evt not used
     */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        //shows extra data
        if(displayChecked.isSelected() && !isDataShown){
            model.addColumn("Wind Speed");
            model.addColumn("Snow Depth");
            isDataShown = true;
            populateTable();
        //removes extra data
        } else if (!displayChecked.isSelected() && isDataShown) {
            model.setColumnCount(4);
            isDataShown = false;
            populateTable();
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    /**
     * Displays information about the project
     * @param evt not used
     */
    private void moreInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreInformationButtonActionPerformed
        //opens moreInfo dialog box
        moreInfo.setVisible(true);
    }//GEN-LAST:event_moreInformationButtonActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Method entry. Gets GUI singleton and set's it to visible.
             */
            public void run() {
                getInstance().setVisible(true);
            }
        });
    }

    /**
     * Generates a new GUI singleton used for changing GUI from outside this
     * class.
     * @return new GUI object if object doesn't exist, current GUI object
     * otherwise.
     */
    public static GUI getInstance(){
        if(GUI_INSTANCE == null){
            GUI_INSTANCE = new GUI();
        }
        return GUI_INSTANCE;
    }

    /**
     * Populates table depending on what is selected. Limited currently to
     * pre-determined column values.
     */
    private void populateTable() {
        if(!displayChecked.isSelected()) {
            if (model.getDataVector().size() == 0) {
                for (Record record : data.getDataList()) {
                    model.addRow(new Object[]{record.getStation().getStation(),
                            record.getStation().getDate(),
                            record.getTmax().getTmax(), record.getTmin().getTmin()});
                    dataTable.setModel(model);
                }
                //case if model for dataTable already exists
            } else {
                model.getDataVector().clear();
                for (Record record : data.getDataList()) {
                    model.addRow(new Object[]{record.getStation().getStation(),
                            record.getStation().getDate(),
                            record.getTmax().getTmax(), record.getTmin().getTmin()});
                    dataTable.setModel(model);
                }
            }
        } else {
            if (model.getDataVector().size() == 0) {
                for (Record record : data.getDataList()) {
                    model.addRow(new Object[]{record.getStation().getStation(),
                            record.getStation().getDate(),
                            record.getTmax().getTmax(),
                            record.getTmin().getTmin(),
                            record.getPeakWindSpeed().getPeakWindSpeed(),
                            record.getSnowDepth().getSnowDepth(),
                            });
                    dataTable.setModel(model);
                }
                //case if model for dataTable already exists
            } else {
                model.getDataVector().clear();
                for (Record record : data.getDataList()) {
                    model.addRow(new Object[]{record.getStation().getStation(),
                            record.getStation().getDate(),
                            record.getTmax().getTmax(), record.getTmin().getTmin(),
                            record.getPeakWindSpeed().getPeakWindSpeed(),
                            record.getSnowDepth().getSnowDepth()});
                    dataTable.setModel(model);
                }
            }
        }
    }

    /**
     * Used in conjunction with GUI singleton, changes sortText field.
     * @param value new text
     */
    public void setSortTextField(String value) {
        sortText.setText(value);
    }
    /**
     * Used in conjunction with GUI singleton, changes consoleText field.
     * @param value new text
     */
    public void setFileTextField(String value) {
        consoleText.setText(value);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> algoBox;
    private javax.swing.JLabel algoLabel;
    private javax.swing.JTextArea consoleText;
    private javax.swing.JLabel csvLabel;
    private javax.swing.JTable dataTable;
    private javax.swing.JCheckBox displayChecked;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel homePane;
    private javax.swing.JPanel infoPane;
    private javax.swing.JTextArea infoText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel loadFilePane;
    private javax.swing.JTabbedPane mainPane;
    private javax.swing.JDialog moreInfo;
    private javax.swing.JButton openFile;
    private javax.swing.JLabel paramLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortOptions;
    private javax.swing.JTextArea sortText;
    private javax.swing.JPanel sortsPane;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JPanel viewData;
    // End of variables declaration//GEN-END:variables
    private Database data;
    private DefaultTableModel model;
    private static GUI GUI_INSTANCE = null;
    private boolean isDataShown = false;

}

