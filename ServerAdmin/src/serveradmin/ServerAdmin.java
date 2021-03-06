/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import Framework.sqlop;
/**
 *
 * @author sathyanarrayananstark
 */
public class ServerAdmin {

    /**
     * @param args the command line arguments
     */
    JFrame container=new JFrame("Server Admin v 0.0.1");
    JButton createbtn=new JButton("create");
    JButton searchbtn=new JButton("search");
    JButton updatebtn=new JButton("update");
    JButton deletebtn=new JButton("delete");
   public ServerAdmin()
    {
    JLabel copyright=new JLabel("Copy Right to SGC Co-operation");
    JLabel namelabel=new JLabel("Select  the operation");
    JLabel author=new JLabel("   by Sathya Narrayanan Stark");
    namelabel.setBounds(20,30,150,50);
    createbtn.setBounds(20,90,100,50);
    searchbtn.setBounds(140,90,100,50);
    updatebtn.setBounds(270,90,100,50);
    deletebtn.setBounds(390,90,100,50);
    copyright.setBounds(90,120,250,180);
    author.setBounds(90,170,250,180);
    createbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                createdb cdb=new createdb();
            }
        });
 searchbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    searchdb sdb=new searchdb();
                    } 
                  catch (SQLException|ClassNotFoundException ex)
                {
                  
                }
            }
        });
 updatebtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             updatedb udb=new updatedb();
            }
        });
 deletebtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
              deletedb ddb=new deletedb();
            }
        });
     container.add(author);
    container.add(createbtn);
    container.add(searchbtn);
    container.add(deletebtn);
    container.add(updatebtn);
    container.add(copyright);
    container.add(namelabel);
    container.setLayout(null);
    container.setSize(500,300);
    container.setVisible(true);
    container.setDefaultCloseOperation(container.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        sqlop sp=new sqlop();
        sp.displayUrl();
    }
}
