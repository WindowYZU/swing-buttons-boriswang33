/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.FlowLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class ButtonSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        //1. 建立 button，text 設定為 Find
        //2. 建立 icon
        //3. 設定 icon
        JButton button=new JButton("Find");
        button.setMnemonic('F');
        
        ImageIcon icon=new ImageIcon(new URL("https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/crop%3D0%2C57%2C692%2C456%3Bc0%3Dbaike92%2C5%2C5%2C92%2C30/sign=5cf833e3bbde9c82b22aa3cf51b1ac3f/960a304e251f95ca1f68456cc1177f3e6609524f.jpg"));
        ImageIcon icon2=new ImageIcon(icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        button.setIcon(icon2);
        ////////////////////////////////////
        frame.add(button);
        frame.getRootPane().setDefaultButton(button);
        
        frame.setVisible(true);
    }
    
}
