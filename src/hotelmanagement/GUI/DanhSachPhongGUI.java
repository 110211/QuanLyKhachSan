/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hotelmanagement.GUI;

import hotelmanagement.BLL.PhongBLL;
import hotelmanagement.DTO.PhongDTO;
import hotelmanagement.GUI.Components.PhongComponent;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nguyenxuanhoang
 */
public class DanhSachPhongGUI extends javax.swing.JPanel {
    
    private static DanhSachPhongGUI instance = null;
    
    public static DanhSachPhongGUI getInstance() {
        if (instance == null)
            instance = new DanhSachPhongGUI();
        return instance;
    }
    
    
    /**
     * Creates new form DanhSachPhong
     */
    
    public DanhSachPhongGUI() {
        initComponents();
        loadData();
    }

    public void loadData() {
        phongPanel.removeAll();
        ArrayList<PhongDTO> DSPhong = new ArrayList<PhongDTO>();
        DSPhong = PhongBLL.getInstance().loadData();
        this.countAllRoom.setText(Integer.toString(DSPhong.size()));
        this.countUsingRoom.setText(Integer.toString(PhongBLL.getInstance().countByRoomStatus(1)));
        this.countCleaningRoom.setText(Integer.toString(PhongBLL.getInstance().countByRoomStatus(-1)));
        this.countEmptyRoom.setText(Integer.toString(PhongBLL.getInstance().countByRoomStatus(0)));
        int tang = 1;
        while (true) {
            
            ArrayList<PhongDTO> dsPhongByTang = new ArrayList<>();
            dsPhongByTang = PhongBLL.getInstance().loadDataByTang(tang);
            if (dsPhongByTang.size() <= 0) break;
            for (PhongDTO phong: dsPhongByTang) {
                phongPanel.add(new PhongComponent(phong));
            }
            if (dsPhongByTang.size() % 5 != 0)
                for (int i = 0; i < 5 - (dsPhongByTang.size() % 5) ; i++) 
                    phongPanel.add(new JPanel());

            tang++;
        }

        // for (int i = 0; i < DSPhong.size(); i++) {
        //     phongPanel.add(new PhongComponent(DSPhong.get(i)));  
        // }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        chuthichPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        countAllRoom = new javax.swing.JLabel();
        countEmptyRoom = new javax.swing.JLabel();
        countUsingRoom = new javax.swing.JLabel();
        countCleaningRoom = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        phongPanel = new javax.swing.JPanel();

        setMaximumSize(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1581, 734));

        chuthichPanel.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 0, 204));
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(241, 196, 15));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setOpaque(true);

        jLabel5.setText("Tất cả ");

        jLabel6.setText("Phòng trống");

        jLabel7.setText("Phòng có người ở");

        jLabel8.setText("Phòng đang dọn dẹp ");

        countAllRoom.setText("()");

        countEmptyRoom.setText("()");

        countUsingRoom.setText("()");

        countCleaningRoom.setText("()");

        jButton1.setText("Thêm phòng");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setText("Xoá phòng");

        javax.swing.GroupLayout chuthichPanelLayout = new javax.swing.GroupLayout(chuthichPanel);
        chuthichPanel.setLayout(chuthichPanelLayout);
        chuthichPanelLayout.setHorizontalGroup(
            chuthichPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chuthichPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countAllRoom)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countEmptyRoom)
                .addGap(82, 82, 82)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countUsingRoom)
                .addGap(48, 48, 48)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countCleaningRoom)
                .addGap(225, 225, 225)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addComponent(jButton3)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        chuthichPanelLayout.setVerticalGroup(
            chuthichPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chuthichPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(chuthichPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chuthichPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countEmptyRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countUsingRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(countAllRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(chuthichPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(countCleaningRoom)
                        .addComponent(jButton1)
                        .addComponent(jButton3)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jScrollPane1.setRowHeaderView(null);

        phongPanel.setMaximumSize(null);
        phongPanel.setName(""); // NOI18N
        phongPanel.setRequestFocusEnabled(false);
        phongPanel.setLayout(new java.awt.GridLayout(0, 5, 10, 10));
        jScrollPane1.setViewportView(phongPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chuthichPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chuthichPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        ThemPhongGUI them = new ThemPhongGUI();
        them.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel chuthichPanel;
    private javax.swing.JLabel countAllRoom;
    private javax.swing.JLabel countCleaningRoom;
    private javax.swing.JLabel countEmptyRoom;
    private javax.swing.JLabel countUsingRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel phongPanel;
    // End of variables declaration//GEN-END:variables
}
