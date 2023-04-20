package guipack;
//theme import
import com.formdev.flatlaf.FlatIntelliJLaf;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.Stack;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import applicationcore.Database;
import datatypes.Record;
import datatypes.Result;


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
        statusLabel.setVisible(false);
        sortOptions.addItem("TMAX");
        sortOptions.addItem("TMIN");
        sortOptions.addItem("Date");
        sortOptions.addItem("Snow");
        sortOptions.addItem("Wind");
        algoBox.addItem("Insertion");
        algoBox.addItem("Dual-pivot");
        algoBox.addItem("Selection");
        algoBox.addItem("Merge Sort");
        versionLabel.setText("v1.3.1");
        displayChecked.setText("Display all fields");
        runAllSorts.setText("Run all sorts");
        consoleText.setEditable(false);
        sortText.setEditable(false);
        model = (DefaultTableModel)dataTable.getModel();
        homePane.setVisible(false);
        databaseLengthLabel.setVisible(false);
        dataLengthHeader.setVisible(false);
        trimSuccess.setVisible(false);
        reloadLabel.setVisible(false);
        generateResultsButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reloadBeforeFilePane = new javax.swing.JDialog();
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
        runAllSorts = new javax.swing.JButton();
        sliderLabel = new javax.swing.JLabel();
        trimAmount = new javax.swing.JTextField();
        runTrim = new javax.swing.JButton();
        dataLengthHeader = new javax.swing.JLabel();
        databaseLengthLabel = new javax.swing.JLabel();
        trimSuccess = new javax.swing.JLabel();
        reloadButton = new javax.swing.JButton();
        reloadLabel = new javax.swing.JLabel();
        clearOutputButton = new javax.swing.JButton();
        continueSavingResults = new javax.swing.JToggleButton();
        generateResultsButton = new javax.swing.JButton();

        reloadBeforeFilePane.setTitle("ERROR");
        reloadBeforeFilePane.setIconImage(null);
        reloadBeforeFilePane.setType(java.awt.Window.Type.POPUP);

        javax.swing.GroupLayout reloadBeforeFilePaneLayout = new javax.swing.GroupLayout(reloadBeforeFilePane.getContentPane());
        reloadBeforeFilePane.getContentPane().setLayout(reloadBeforeFilePaneLayout);
        reloadBeforeFilePaneLayout.setHorizontalGroup(
            reloadBeforeFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        reloadBeforeFilePaneLayout.setVerticalGroup(
            reloadBeforeFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOAA WEATHER APP");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(770, 445));

        homePane.setEnabled(false);
        homePane.setPreferredSize(new java.awt.Dimension(740, 440));
        homePane.setRequestFocusEnabled(false);

        moreInformationButton.setText("More Info on GitHub");
        moreInformationButton.setToolTipText("Redirects to GitHub repo");
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

        javax.swing.GroupLayout homePaneLayout = new javax.swing.GroupLayout(homePane);
        homePane.setLayout(homePaneLayout);
        homePaneLayout.setHorizontalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePaneLayout.createSequentialGroup()
                .addContainerGap(733, Short.MAX_VALUE)
                .addComponent(versionLabel)
                .addGap(17, 17, 17))
            .addGroup(homePaneLayout.createSequentialGroup()
                .addGroup(homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePaneLayout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(headerLabel))
                    .addGroup(homePaneLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(moreInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePaneLayout.setVerticalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePaneLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addGap(18, 18, 18)
                .addComponent(moreInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(versionLabel)
                .addContainerGap())
        );

        mainPane.addTab("Home", homePane);

        loadFilePane.setPreferredSize(new java.awt.Dimension(715, 440));

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
                .addGap(28, 28, 28)
                .addGroup(loadFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(openFile)
                    .addComponent(csvLabel)
                    .addComponent(statusLabel))
                .addGap(44, 44, 44)
                .addGroup(loadFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loadFilePaneLayout.createSequentialGroup()
                        .addComponent(fileLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
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
                .addContainerGap(179, Short.MAX_VALUE))
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

        sortsPane.setPreferredSize(new java.awt.Dimension(750, 450));

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

        runAllSorts.setText("jButton1");
        runAllSorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runAllSortsActionPerformed(evt);
            }
        });

        sliderLabel.setText("Trim Data Length");

        trimAmount.setToolTipText("Enter truncated length");

        runTrim.setText("Trim");
        runTrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runTrimActionPerformed(evt);
            }
        });

        dataLengthHeader.setText("Current Dataset Length:");

        databaseLengthLabel.setText("jLabel2");

        trimSuccess.setText("jLabel1");

        reloadButton.setForeground(new java.awt.Color(255, 0, 0));
        reloadButton.setText("Reload Dataset");
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        reloadLabel.setText("jLabel1");

        clearOutputButton.setForeground(new java.awt.Color(0, 0, 204));
        clearOutputButton.setText("Clear Output");
        clearOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOutputButtonActionPerformed(evt);
            }
        });

        continueSavingResults.setText("Continuously Save Results");
        continueSavingResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueSavingResultsActionPerformed(evt);
            }
        });

        generateResultsButton.setText("Generate CSV");
        generateResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateResultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sortsPaneLayout = new javax.swing.GroupLayout(sortsPane);
        sortsPane.setLayout(sortsPaneLayout);
        sortsPaneLayout.setHorizontalGroup(
            sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sortsPaneLayout.createSequentialGroup()
                        .addComponent(dataLengthHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(databaseLengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sortsPaneLayout.createSequentialGroup()
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sortsPaneLayout.createSequentialGroup()
                                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sortOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paramLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(algoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(runAllSorts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(algoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(sortsPaneLayout.createSequentialGroup()
                                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(sortsPaneLayout.createSequentialGroup()
                                        .addComponent(trimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(runTrim)
                                        .addGap(18, 18, 18)
                                        .addComponent(trimSuccess))
                                    .addComponent(sliderLabel)
                                    .addComponent(sortButton)
                                    .addComponent(reloadLabel)
                                    .addGroup(sortsPaneLayout.createSequentialGroup()
                                        .addComponent(reloadButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearOutputButton))
                                    .addComponent(continueSavingResults)
                                    .addComponent(generateResultsButton))
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        sortsPaneLayout.setVerticalGroup(
            sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortsPaneLayout.createSequentialGroup()
                .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sortsPaneLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paramLabel)
                            .addComponent(algoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(algoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortButton)
                            .addComponent(runAllSorts))
                        .addGap(18, 18, 18)
                        .addComponent(continueSavingResults)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateResultsButton)
                        .addGap(36, 36, 36)
                        .addComponent(reloadLabel)
                        .addGap(18, 18, 18)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataLengthHeader)
                            .addComponent(databaseLengthLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sliderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(runTrim)
                            .addComponent(trimSuccess))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sortsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reloadButton)
                            .addComponent(clearOutputButton)))
                    .addGroup(sortsPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
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
        setLocationRelativeTo(null);
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
                data = new Database(file.getAbsolutePath(), getInstance());
                fileLabel.setText("File: " + file.getName());
                sliderLabel.setVisible(true);
                dataLengthHeader.setVisible(true);
                databaseLengthLabel.setText(String.valueOf(data.getDataArray().length));
                databaseLengthLabel.setVisible(true);
                JOptionPane.showMessageDialog(getInstance(), "Successfully Initialized Database", "Database Notification", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(getInstance(), "Failed To Initialize Database", "Database Notification", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {
            System.err.println("error in opening file");
            System.exit(5);
            loadFilePane.setVisible(true);
            return;
        }
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
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if(desktop != null) {
            try {
                desktop.browse(new URI("https://github.com/isiahzzzz/NOAA-Weather-Analysis-App"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
    }//GEN-LAST:event_moreInformationButtonActionPerformed

    /**
     * Runs every sort and simultaneously records all statistics about the sorts.
     * @param evt not used
     */
    private void runAllSortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runAllSortsActionPerformed
        data.setRunAllSorts(true);
        for(int i = 1; i <= 4; i++) {
            data.pickSorts(i, Objects.requireNonNull(sortOptions.getSelectedItem()).toString());
        }
        sortText.setText(data.getLog());
        data.setRunAllSorts(false);
    }//GEN-LAST:event_runAllSortsActionPerformed

    private void runTrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runTrimActionPerformed
        try {
            data.trimArray(Integer.parseInt(trimAmount.getText()));
            databaseLengthLabel.setText(String.valueOf(data.getDataArray().length));
            trimSuccess.setForeground(Color.GREEN);
            trimSuccess.setText("OK");
            trimSuccess.setVisible(true);
        } catch (NumberFormatException e) {
            trimSuccess.setForeground(Color.RED);
            trimSuccess.setText("Please enter a valid number...");
            trimSuccess.setVisible(true);
        }
    }//GEN-LAST:event_runTrimActionPerformed

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        try {
            String temp = this.data.getSavedFileLocation();
            this.data = new Database(temp, getInstance());
            databaseLengthLabel.setText(String.valueOf(data.getDataArray().length));
            trimSuccess.setVisible(false);
            JOptionPane.showMessageDialog(getInstance(), "Dataset Reloaded", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            clearOutputButtonActionPerformed(null);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(getInstance(), "Please import a CSV before attempting to reload", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void clearOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOutputButtonActionPerformed
        sortText.setText("");
    }//GEN-LAST:event_clearOutputButtonActionPerformed

    private void continueSavingResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueSavingResultsActionPerformed
        if(!data.getContinuouslySavingResults()) {
            generateResultsButton.setVisible(true);
            JOptionPane.showMessageDialog(getInstance(), "Program will now save run results", "Continuous Saving", JOptionPane.INFORMATION_MESSAGE);
            data.setContinuouslySavingResults(true);
        } else {
            generateResultsButton.setVisible(false);
            JOptionPane.showMessageDialog(getInstance(), "Program will no longer save results", "Continuous Saving", JOptionPane.INFORMATION_MESSAGE);
            data.setContinuouslySavingResults(false);
        }
    }//GEN-LAST:event_continueSavingResultsActionPerformed

    private void generateResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateResultsButtonActionPerformed
        data.writeToCSV();
    }//GEN-LAST:event_generateResultsButtonActionPerformed


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
                int version = Integer.parseInt(System.getProperty("java.version").substring(0,2));
                if(version < 18){
                    JOptionPane.showMessageDialog(getInstance(), """
                            It is strongly recommended that you use JDK 18 and above.\s

                            To ensure proper operation please visit https://www.oracle.com/java/technologies/downloads/ and download the latest JDK.""",
                            "Version Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                if(version < 17) {
                    JOptionPane.showMessageDialog(getInstance(), """
                            Please update your JDK to JDK 17 or above. \s
                            
                            https://www.oracle.com/java/technologies/downloads/
                            """, "Incompatible Version",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
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
                            record.getSnowFall().getAmntSnowed(),
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
                            record.getSnowFall().getAmntSnowed()});
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
    public String getSortField() {
        return Objects.requireNonNull(sortOptions.getSelectedItem()).toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> algoBox;
    private javax.swing.JLabel algoLabel;
    private javax.swing.JButton clearOutputButton;
    private javax.swing.JTextArea consoleText;
    private javax.swing.JToggleButton continueSavingResults;
    private javax.swing.JLabel csvLabel;
    private javax.swing.JLabel dataLengthHeader;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel databaseLengthLabel;
    private javax.swing.JCheckBox displayChecked;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JButton generateResultsButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel homePane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel loadFilePane;
    private javax.swing.JTabbedPane mainPane;
    private javax.swing.JButton openFile;
    private javax.swing.JLabel paramLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JDialog reloadBeforeFilePane;
    private javax.swing.JButton reloadButton;
    private javax.swing.JLabel reloadLabel;
    private javax.swing.JButton runAllSorts;
    private javax.swing.JButton runTrim;
    private javax.swing.JLabel sliderLabel;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortOptions;
    private javax.swing.JTextArea sortText;
    private javax.swing.JPanel sortsPane;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JTextField trimAmount;
    private javax.swing.JLabel trimSuccess;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JPanel viewData;
    // End of variables declaration//GEN-END:variables
    private Database data;
    private DefaultTableModel model;
    private static GUI GUI_INSTANCE = null;
    private boolean isDataShown = false;

}

