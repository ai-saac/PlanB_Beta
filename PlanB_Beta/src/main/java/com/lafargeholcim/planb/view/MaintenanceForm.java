/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lafargeholcim.planb.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author AI-Saac
 */
public class MaintenanceForm extends JDialog{
    private JButton addButton, cancellButton;
    private JLabel commentsLabel, daysLabel, detailLabel, dueDateLabel, 
            durationLabel, durationValueLabel, endDateLabel, idLabel, 
            progressLabel, progressValueLabel, responsibleLabel, startDateLabel, statusLabel;
    private JScrollPane commentsScrollPane, detailScrollPane;
    private JTextArea commentsTextArea, detailTextArea;
    private JDateChooser dueDateChooser, endDateChooser, startDateChooser;
    private JTextField idValueTextField, statusTextField;
    private JComboBox<String> ownerComboBox;
    private JSlider progressSlider;
    
    public MaintenanceForm(){
        
    }
    
    public void initComponents(){
        idLabel = new javax.swing.JLabel();
        detailLabel = new javax.swing.JLabel();
        commentsLabel = new javax.swing.JLabel();
        idValueTextField = new javax.swing.JTextField();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        commentsScrollPane = new javax.swing.JScrollPane();
        commentsTextArea = new javax.swing.JTextArea();
        responsibleLabel = new javax.swing.JLabel();
        ownerComboBox = new javax.swing.JComboBox<>();
        startDateLabel = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        dueDateLabel = new javax.swing.JLabel();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        endDateLabel = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        addButton = new javax.swing.JButton();
        cancellButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        progressLabel = new javax.swing.JLabel();
        progressValueLabel = new javax.swing.JLabel();
        progressSlider = new javax.swing.JSlider();
        statusTextField = new javax.swing.JTextField();
        durationLabel = new javax.swing.JLabel();
        durationValueLabel = new javax.swing.JLabel();
        daysLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#3C3F41"));

        idLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        idLabel.setText("ID");
        idLabel.setForeground(Color.decode("#BBBBBB"));

        detailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        detailLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        detailLabel.setText("Detail");
        detailLabel.setForeground(Color.decode("#BBBBBB"));

        commentsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        commentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        commentsLabel.setText("Comments");
        commentsLabel.setForeground(Color.decode("#BBBBBB"));

        idValueTextField.setText("Auto-Generated");

        detailTextArea.setColumns(20);
        detailTextArea.setLineWrap(true);
        detailTextArea.setRows(5);
        detailTextArea.setTabSize(0);
        detailTextArea.setWrapStyleWord(true);
        detailTextArea.setForeground(Color.decode("#BBBBBB"));
        detailTextArea.setBackground(Color.decode("#45494A"));
        detailScrollPane.setViewportView(detailTextArea);

        commentsTextArea.setColumns(20);
        commentsTextArea.setLineWrap(true);
        commentsTextArea.setRows(5);
        commentsTextArea.setTabSize(0);
        commentsTextArea.setWrapStyleWord(true);
        commentsTextArea.setForeground(Color.decode("#BBBBBB"));
        commentsTextArea.setBackground(Color.decode("#45494A"));
        commentsScrollPane.setViewportView(commentsTextArea);

        responsibleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        responsibleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        responsibleLabel.setText("Responsible");
        responsibleLabel.setForeground(Color.decode("#BBBBBB"));

        ownerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SERGIO ORJUELA R", "Item 2", "Item 3", "Item 4" }));

        startDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        startDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        startDateLabel.setText("Start Date");
        startDateLabel.setForeground(Color.decode("#BBBBBB"));
        
        startDateChooser.setDateFormatString("yyyy-MM-dd");

        dueDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dueDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dueDateLabel.setText("Due  Date");
        dueDateLabel.setForeground(Color.decode("#BBBBBB"));
        
        endDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        endDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        endDateLabel.setText("End  Date");
        endDateLabel.setForeground(Color.decode("#BBBBBB"));
        
        addButton.setText("ADD");

        cancellButton.setText("CANCELL");

        statusLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        statusLabel.setText("Status");
        statusLabel.setForeground(Color.decode("#BBBBBB"));
        
        progressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        progressLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        progressLabel.setText("Progress");
        progressLabel.setForeground(Color.decode("#BBBBBB"));
        
        progressValueLabel.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        progressValueLabel.setForeground(new java.awt.Color(0, 51, 255));
        progressValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressValueLabel.setText("100%");
        progressValueLabel.setOpaque(true);
        
        progressSlider.setValue(0);

        statusTextField.setText("IN_PROCESS");

        durationLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        durationLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        durationLabel.setText("Duration");
        durationLabel.setForeground(Color.decode("#BBBBBB"));
        
        durationValueLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        durationValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        durationValueLabel.setText("100");

        daysLabel.setText("days");
        daysLabel.setForeground(Color.decode("#BBBBBB"));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cancellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(responsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ownerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(detailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(commentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentsScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(startDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(dueDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(endDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(statusTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(durationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(progressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(durationValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(daysLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(progressSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(progressValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(responsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commentsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dueDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(progressSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(progressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(progressValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(durationValueLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(durationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }
}
