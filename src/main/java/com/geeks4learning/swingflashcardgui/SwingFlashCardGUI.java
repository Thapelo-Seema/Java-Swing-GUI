/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.geeks4learning.swingflashcardgui;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Reverside
 */
public class SwingFlashCardGUI {
    JTextArea question;
    JTextArea answer;
    ArrayList<FlashCard> cardList;
    JFrame frame;
    
    public SwingFlashCardGUI(){
        //Build the interface
        this.frame = new JFrame("Flash Card");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a JPanel to hold everything
        JPanel mainPanel = new JPanel();
        
        //Create Font 
        
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
