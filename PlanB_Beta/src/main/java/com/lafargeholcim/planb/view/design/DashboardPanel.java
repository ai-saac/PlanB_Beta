/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lafargeholcim.planb.view.design;

/**
 *
 * @author AI-Saac
 */
public class DashboardPanel extends javax.swing.JFrame {

    /**
     * Creates new form DashboardPane
     */
    public DashboardPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        titlePanel = new javax.swing.JPanel();
        panelNameLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        usernameLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        summaryPanel = new javax.swing.JPanel();
        actionsPanel = new javax.swing.JPanel();
        actionsLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        completedPanel = new javax.swing.JPanel();
        completedLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        appPanel = new javax.swing.JPanel();
        appLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        overduePanel = new javax.swing.JPanel();
        overdueLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nearDueDatePanel = new javax.swing.JPanel();
        nearDueDateLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inProcessPanel = new javax.swing.JPanel();
        inProcessLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        executionPanel = new javax.swing.JPanel();
        executionLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        perfomancePanel = new javax.swing.JPanel();
        performanceLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        overdueListPanel = new javax.swing.JPanel();
        overdueListScrollPane = new javax.swing.JScrollPane();
        overdueListTable = new javax.swing.JTable();
        overdueListLabel = new javax.swing.JLabel();
        nearDueDateListPanel = new javax.swing.JPanel();
        nearDueDateScrollPane = new javax.swing.JScrollPane();
        nearDueDateListTable = new javax.swing.JTable();
        nearDueDateListLabel = new javax.swing.JLabel();
        inProcessListPanel = new javax.swing.JPanel();
        inProcessListLabel = new javax.swing.JLabel();
        inProcessListScrollPane = new javax.swing.JScrollPane();
        inProcessListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        titlePanel.setBackground(new java.awt.Color(69, 73, 74));
        titlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 8, 4, 8, new java.awt.Color(60, 63, 65)));
        titlePanel.setMaximumSize(new java.awt.Dimension(32767, 65));
        titlePanel.setMinimumSize(new java.awt.Dimension(0, 45));
        titlePanel.setPreferredSize(new java.awt.Dimension(400, 45));
        titlePanel.setLayout(new javax.swing.BoxLayout(titlePanel, javax.swing.BoxLayout.LINE_AXIS));

        panelNameLabel.setForeground(new java.awt.Color(252, 254, 252));
        panelNameLabel.setText("  Dashboard");
        titlePanel.add(panelNameLabel);
        titlePanel.add(filler1);

        usernameLabel.setForeground(new java.awt.Color(252, 254, 252));
        usernameLabel.setText("Username: joel  ");
        titlePanel.add(usernameLabel);

        getContentPane().add(titlePanel, java.awt.BorderLayout.PAGE_START);

        dashboardPanel.setLayout(new javax.swing.BoxLayout(dashboardPanel, javax.swing.BoxLayout.PAGE_AXIS));

        summaryPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 8, 4, 8, new java.awt.Color(60, 63, 65)));
        summaryPanel.setLayout(new java.awt.GridBagLayout());

        actionsPanel.setBackground(new java.awt.Color(230, 231, 234));
        actionsPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(60, 63, 65)));
        actionsPanel.setForeground(new java.awt.Color(252, 254, 252));
        actionsPanel.setMaximumSize(new java.awt.Dimension(32767, 120));
        actionsPanel.setMinimumSize(new java.awt.Dimension(110, 100));
        actionsPanel.setPreferredSize(new java.awt.Dimension(110, 100));

        actionsLabel.setForeground(new java.awt.Color(48, 49, 50));
        actionsLabel.setText("actions");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("200");

        javax.swing.GroupLayout actionsPanelLayout = new javax.swing.GroupLayout(actionsPanel);
        actionsPanel.setLayout(actionsPanelLayout);
        actionsPanelLayout.setHorizontalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionsPanelLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(actionsLabel)
                .addContainerGap())
            .addGroup(actionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        actionsPanelLayout.setVerticalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsPanelLayout.createSequentialGroup()
                .addComponent(actionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(actionsPanel, gridBagConstraints);

        completedPanel.setBackground(new java.awt.Color(242, 211, 69));
        completedPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(60, 63, 65)));
        completedPanel.setMaximumSize(new java.awt.Dimension(32767, 120));
        completedPanel.setMinimumSize(new java.awt.Dimension(110, 100));
        completedPanel.setPreferredSize(new java.awt.Dimension(110, 100));

        completedLabel.setForeground(new java.awt.Color(252, 254, 252));
        completedLabel.setText("completed");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 254, 252));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("100");
        jLabel6.setIconTextGap(0);

        javax.swing.GroupLayout completedPanelLayout = new javax.swing.GroupLayout(completedPanel);
        completedPanel.setLayout(completedPanelLayout);
        completedPanelLayout.setHorizontalGroup(
            completedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, completedPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(completedLabel)
                .addContainerGap())
            .addGroup(completedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        completedPanelLayout.setVerticalGroup(
            completedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(completedPanelLayout.createSequentialGroup()
                .addComponent(completedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(completedPanel, gridBagConstraints);

        appPanel.setBackground(new java.awt.Color(100, 214, 16));
        appPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(60, 63, 65)));
        appPanel.setMaximumSize(new java.awt.Dimension(32767, 120));
        appPanel.setMinimumSize(new java.awt.Dimension(110, 100));
        appPanel.setPreferredSize(new java.awt.Dimension(110, 100));

        appLabel.setForeground(new java.awt.Color(252, 254, 252));
        appLabel.setText("asPerPlanned");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 254, 252));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("100");
        jLabel3.setIconTextGap(0);
        jLabel3.setPreferredSize(new java.awt.Dimension(64, 50));

        javax.swing.GroupLayout appPanelLayout = new javax.swing.GroupLayout(appPanel);
        appPanel.setLayout(appPanelLayout);
        appPanelLayout.setHorizontalGroup(
            appPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(appLabel)
                .addContainerGap())
            .addGroup(appPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appPanelLayout.setVerticalGroup(
            appPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appPanelLayout.createSequentialGroup()
                .addComponent(appLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(appPanel, gridBagConstraints);

        overduePanel.setBackground(new java.awt.Color(254, 67, 68));
        overduePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(60, 63, 65)));
        overduePanel.setMaximumSize(new java.awt.Dimension(32767, 120));
        overduePanel.setMinimumSize(new java.awt.Dimension(110, 100));
        overduePanel.setPreferredSize(new java.awt.Dimension(110, 100));

        overdueLabel.setForeground(new java.awt.Color(252, 254, 252));
        overdueLabel.setText("overdue");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 254, 252));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("100");
        jLabel5.setIconTextGap(0);

        javax.swing.GroupLayout overduePanelLayout = new javax.swing.GroupLayout(overduePanel);
        overduePanel.setLayout(overduePanelLayout);
        overduePanelLayout.setHorizontalGroup(
            overduePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overduePanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(overdueLabel)
                .addContainerGap())
            .addGroup(overduePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        overduePanelLayout.setVerticalGroup(
            overduePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overduePanelLayout.createSequentialGroup()
                .addComponent(overdueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(overduePanel, gridBagConstraints);

        nearDueDatePanel.setBackground(new java.awt.Color(240, 119, 70));
        nearDueDatePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(60, 63, 65)));
        nearDueDatePanel.setMaximumSize(new java.awt.Dimension(32767, 120));
        nearDueDatePanel.setMinimumSize(new java.awt.Dimension(110, 100));
        nearDueDatePanel.setPreferredSize(new java.awt.Dimension(110, 100));

        nearDueDateLabel.setForeground(new java.awt.Color(252, 254, 252));
        nearDueDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nearDueDateLabel.setText("nearDueDate");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 254, 252));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("100");

        javax.swing.GroupLayout nearDueDatePanelLayout = new javax.swing.GroupLayout(nearDueDatePanel);
        nearDueDatePanel.setLayout(nearDueDatePanelLayout);
        nearDueDatePanelLayout.setHorizontalGroup(
            nearDueDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nearDueDatePanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(nearDueDateLabel)
                .addContainerGap())
            .addGroup(nearDueDatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nearDueDatePanelLayout.setVerticalGroup(
            nearDueDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nearDueDatePanelLayout.createSequentialGroup()
                .addComponent(nearDueDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(nearDueDatePanel, gridBagConstraints);

        inProcessPanel.setBackground(new java.awt.Color(152, 118, 170));
        inProcessPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(60, 63, 65)));
        inProcessPanel.setMaximumSize(new java.awt.Dimension(32767, 120));
        inProcessPanel.setMinimumSize(new java.awt.Dimension(110, 100));
        inProcessPanel.setPreferredSize(new java.awt.Dimension(110, 100));

        inProcessLabel.setForeground(new java.awt.Color(252, 254, 252));
        inProcessLabel.setText("inProcess");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 254, 252));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("100");
        jLabel7.setIconTextGap(0);

        javax.swing.GroupLayout inProcessPanelLayout = new javax.swing.GroupLayout(inProcessPanel);
        inProcessPanel.setLayout(inProcessPanelLayout);
        inProcessPanelLayout.setHorizontalGroup(
            inProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inProcessPanelLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(inProcessLabel)
                .addContainerGap())
            .addGroup(inProcessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inProcessPanelLayout.setVerticalGroup(
            inProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inProcessPanelLayout.createSequentialGroup()
                .addComponent(inProcessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(inProcessPanel, gridBagConstraints);

        executionPanel.setBackground(new java.awt.Color(69, 73, 74));
        executionPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 8, 2, 0, new java.awt.Color(60, 63, 65)));
        executionPanel.setPreferredSize(new java.awt.Dimension(200, 200));

        executionLabel.setText("execution");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("100%");

        javax.swing.GroupLayout executionPanelLayout = new javax.swing.GroupLayout(executionPanel);
        executionPanel.setLayout(executionPanelLayout);
        executionPanelLayout.setHorizontalGroup(
            executionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, executionPanelLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(executionLabel)
                .addContainerGap())
            .addGroup(executionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        executionPanelLayout.setVerticalGroup(
            executionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(executionPanelLayout.createSequentialGroup()
                .addComponent(executionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(executionPanel, gridBagConstraints);

        perfomancePanel.setBackground(new java.awt.Color(69, 73, 74));
        perfomancePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 8, 2, 0, new java.awt.Color(60, 63, 65)));
        perfomancePanel.setMaximumSize(new java.awt.Dimension(32767, 240));
        perfomancePanel.setMinimumSize(new java.awt.Dimension(0, 200));
        perfomancePanel.setPreferredSize(new java.awt.Dimension(200, 200));

        performanceLabel.setText("performance");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("100%");

        javax.swing.GroupLayout perfomancePanelLayout = new javax.swing.GroupLayout(perfomancePanel);
        perfomancePanel.setLayout(perfomancePanelLayout);
        perfomancePanelLayout.setHorizontalGroup(
            perfomancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfomancePanelLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(performanceLabel)
                .addContainerGap())
            .addGroup(perfomancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        perfomancePanelLayout.setVerticalGroup(
            perfomancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfomancePanelLayout.createSequentialGroup()
                .addComponent(performanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        summaryPanel.add(perfomancePanel, gridBagConstraints);

        dashboardPanel.add(summaryPanel);

        overdueListPanel.setMinimumSize(new java.awt.Dimension(0, 100));
        overdueListPanel.setPreferredSize(new java.awt.Dimension(864, 135));

        overdueListScrollPane.setBorder(new javax.swing.border.MatteBorder(null));

        overdueListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        overdueListScrollPane.setViewportView(overdueListTable);

        overdueListLabel.setText("Overdue Actions List");
        overdueListLabel.setMaximumSize(new java.awt.Dimension(118, 30));
        overdueListLabel.setMinimumSize(new java.awt.Dimension(118, 30));
        overdueListLabel.setPreferredSize(new java.awt.Dimension(118, 30));

        javax.swing.GroupLayout overdueListPanelLayout = new javax.swing.GroupLayout(overdueListPanel);
        overdueListPanel.setLayout(overdueListPanelLayout);
        overdueListPanelLayout.setHorizontalGroup(
            overdueListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overdueListPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(overdueListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(overdueListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                    .addGroup(overdueListPanelLayout.createSequentialGroup()
                        .addComponent(overdueListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        overdueListPanelLayout.setVerticalGroup(
            overdueListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overdueListPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(overdueListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overdueListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        dashboardPanel.add(overdueListPanel);

        nearDueDateListPanel.setMinimumSize(new java.awt.Dimension(0, 120));

        nearDueDateScrollPane.setBorder(new javax.swing.border.MatteBorder(null));

        nearDueDateListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        nearDueDateScrollPane.setViewportView(nearDueDateListTable);

        nearDueDateListLabel.setText("Near Due Date Actions List");
        nearDueDateListLabel.setMaximumSize(new java.awt.Dimension(118, 30));
        nearDueDateListLabel.setMinimumSize(new java.awt.Dimension(118, 30));
        nearDueDateListLabel.setPreferredSize(new java.awt.Dimension(118, 30));

        javax.swing.GroupLayout nearDueDateListPanelLayout = new javax.swing.GroupLayout(nearDueDateListPanel);
        nearDueDateListPanel.setLayout(nearDueDateListPanelLayout);
        nearDueDateListPanelLayout.setHorizontalGroup(
            nearDueDateListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nearDueDateListPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(nearDueDateListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nearDueDateListPanelLayout.createSequentialGroup()
                        .addComponent(nearDueDateScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(nearDueDateListPanelLayout.createSequentialGroup()
                        .addComponent(nearDueDateListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        nearDueDateListPanelLayout.setVerticalGroup(
            nearDueDateListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nearDueDateListPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(nearDueDateListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(nearDueDateScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        dashboardPanel.add(nearDueDateListPanel);

        inProcessListPanel.setMaximumSize(new java.awt.Dimension(32767, 140));
        inProcessListPanel.setMinimumSize(new java.awt.Dimension(0, 120));
        inProcessListPanel.setPreferredSize(new java.awt.Dimension(864, 135));

        inProcessListLabel.setText("In Process Action List");
        inProcessListLabel.setMaximumSize(new java.awt.Dimension(124, 30));
        inProcessListLabel.setMinimumSize(new java.awt.Dimension(124, 30));
        inProcessListLabel.setPreferredSize(new java.awt.Dimension(124, 30));

        inProcessListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        inProcessListScrollPane.setViewportView(inProcessListTable);

        javax.swing.GroupLayout inProcessListPanelLayout = new javax.swing.GroupLayout(inProcessListPanel);
        inProcessListPanel.setLayout(inProcessListPanelLayout);
        inProcessListPanelLayout.setHorizontalGroup(
            inProcessListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inProcessListPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(inProcessListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inProcessListPanelLayout.createSequentialGroup()
                        .addComponent(inProcessListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inProcessListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        inProcessListPanelLayout.setVerticalGroup(
            inProcessListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inProcessListPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(inProcessListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(inProcessListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        dashboardPanel.add(inProcessListPanel);

        getContentPane().add(dashboardPanel, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actionsLabel;
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JLabel appLabel;
    private javax.swing.JPanel appPanel;
    private javax.swing.JLabel completedLabel;
    private javax.swing.JPanel completedPanel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel executionLabel;
    private javax.swing.JPanel executionPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel inProcessLabel;
    private javax.swing.JLabel inProcessListLabel;
    private javax.swing.JPanel inProcessListPanel;
    private javax.swing.JScrollPane inProcessListScrollPane;
    private javax.swing.JTable inProcessListTable;
    private javax.swing.JPanel inProcessPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nearDueDateLabel;
    private javax.swing.JLabel nearDueDateListLabel;
    private javax.swing.JPanel nearDueDateListPanel;
    private javax.swing.JTable nearDueDateListTable;
    private javax.swing.JPanel nearDueDatePanel;
    private javax.swing.JScrollPane nearDueDateScrollPane;
    private javax.swing.JLabel overdueLabel;
    private javax.swing.JLabel overdueListLabel;
    private javax.swing.JPanel overdueListPanel;
    private javax.swing.JScrollPane overdueListScrollPane;
    private javax.swing.JTable overdueListTable;
    private javax.swing.JPanel overduePanel;
    private javax.swing.JLabel panelNameLabel;
    private javax.swing.JPanel perfomancePanel;
    private javax.swing.JLabel performanceLabel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
