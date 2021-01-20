package com.day07.shuzu;

import javax.swing.*;


 public class APP{
     static int[][] arr = {
             {0, 2, 2, 4},
             {2, 2, 4, 4},
             {0, 8, 2, 4},
             {0, 32, 0, 64}
     };
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame frame = new JFrame();
        // 设置宽和高
        frame.setSize(514, 538);
        // 设置窗体居中
        frame.setLocationRelativeTo(null);
        // 设置窗体置顶
        frame.setAlwaysOnTop(true);
        // 设置关闭模式
        frame.setDefaultCloseOperation(3);
        // 设置窗体标题
        frame.setTitle("2048小游戏");

        // 取消默认布局
        frame.setLayout(null);

        for(int i = 0; i < 4; i++){
            // i = 0 1 2 3
            for(int j = 0; j < 4; j++){
                // j = 0 1 2 3
                JLabel image = new JLabel(new ImageIcon("D:\\image\\A-" + arr[i][j] + ".PNG"));
                image.setBounds(50 + 100 * j, 50 + 100 * i, 100, 100);
                frame.getContentPane().add(image);
            }
        }

        JLabel background = new JLabel(new ImageIcon("D:\\image\\A-Background.jpg"));
        background.setBounds(40,40,420,420);
        frame.getContentPane().add(background);

        // 设置窗体可见
        frame.setVisible(true);
    }
}

