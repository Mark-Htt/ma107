package com.day07.shuzu;

import javax.swing.*;

public class APP2 {
    public static void main(String[] args) {
        JFrame game=new JFrame();
        game.setSize(514,538);
        game.setLocationRelativeTo(null);
        game.setAlwaysOnTop(true);
        game.setDefaultCloseOperation(3);
        game.setTitle("2048小游戏");
        game.setLayout(null);
        int[][]arr={
                {0,2,4,8},
                {2,4,2,2},
                {16,8,8,32},
                {64,8,16,2}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ImageIcon img=new ImageIcon("D:\\image\\A-"+arr[i][j]+".png");
                JLabel ic=new JLabel(img);
                ic.setBounds(50+100*i,50+100*j,100,100);
                game.getContentPane().add(ic);

            }

        }


        JLabel back=new JLabel(new ImageIcon("D:\\image\\C-Background.png"));
        back.setBounds(40,40,420,420);
        game.getContentPane().add(back);

        game.setVisible(true);


    }
}

