import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Paint extends JFrame   {

    int r[]=new int[300];
    int x1[]=new int[300];
    int R[]=new int[300];
    int y1[]=new int[300];

    JPanel jPanel=new JPanel();
    JButton jButton=new JButton("泡泡动");

    public Paint() {

        setSize(600, 600);
        setVisible(true);
        setTitle("海绵宝宝和章鱼哥和派大星");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(jPanel,BorderLayout.SOUTH);
        jPanel.add(jButton);

        for(int i=0;i<300;i++){
            r[i]=(int)(1+Math.random()*(10-1+1));
            x1[i] = (int) (1 + Math.random() * (600 - 1 + 1));
            R[i]=(int)(10+Math.random()*(30-10+1));
            y1[i]=(int)(1 + Math.random() * (600 - 1 + 1));

        }

        Three_Man three_man=new Three_Man();
        add(three_man);

        Thread t1=new Thread(three_man);

        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });




        validate();

    }

    class Three_Man extends JPanel implements Runnable
    {



        Three_Man()
        {
            setSize(600, 600);
        }




        @Override
        public void paintComponent(Graphics g) {


            super.paintComponent(g);


            //派大星
            g.setColor(new Color(255, 173, 175));
            g.fillRect(0, 0, 200, 600);
            g.setColor(new Color(68, 63, 57));

            //嘴
            g.fillOval(33, 297, 114, 67);
            g.setColor(new Color(255, 173, 175));
            g.fillOval(36, 298, 108, 63);
            g.fillRect(13, 271, 147, 61);
            g.setColor(new Color(254, 154, 156));
            g.fillOval(80, 376, 22, 8);

            g.setColor(new Color(68, 63, 57));
            g.drawLine(39, 328, 27, 334);
            g.drawLine(39, 329, 27, 335);
            g.drawLine(39, 330, 27, 336);

            g.drawLine(142, 327, 152, 334);
            g.drawLine(142, 328, 152, 335);
            g.drawLine(142, 329, 152, 336);

            //左眉毛
            g.setColor(new Color(68, 63, 57));
            g.drawLine(47, 236, 65, 229);
            g.drawLine(47, 237, 65, 230);
            g.drawLine(47, 238, 65, 231);
            g.drawLine(47, 239, 65, 232);
            g.drawLine(47, 240, 65, 233);


            g.drawLine(49, 241, 68, 233);
            g.drawLine(49, 242, 68, 234);
            g.drawLine(49, 243, 68, 235);
            g.drawLine(49, 243, 68, 236);

            g.drawLine(49, 245, 69, 237);
            g.drawLine(49, 246, 69, 238);
            g.drawLine(49, 247, 69, 239);

            //右眉毛
            g.drawLine(112, 229, 130, 233);
            g.drawLine(112, 230, 130, 234);
            g.drawLine(112, 231, 130, 235);
            g.drawLine(112, 232, 130, 236);
            g.drawLine(112, 233, 130, 237);

            g.drawLine(110, 233, 130, 238);
            g.drawLine(110, 234, 130, 239);
            g.drawLine(110, 235, 130, 240);
            g.drawLine(110, 236, 130, 241);

            g.drawLine(110, 237, 127, 242);
            g.drawLine(110, 238, 127, 243);
            g.drawLine(110, 239, 127, 244);

            //左眼睛
            g.fillOval(33, 256, 55, 76);

            g.setColor(Color.white);
            g.fillOval(36, 259, 49, 70);

            g.setColor(new Color(68, 63, 57));
            g.fillOval(57, 288, 12, 14);

            //右眼睛
            g.fillOval(87, 257, 57, 76);

            g.setColor(Color.white);
            g.fillOval(90, 260, 51, 70);

            g.setColor(new Color(68, 63, 57));
            g.fillOval(108, 287, 11, 16);

            //-------------------------------------------------------------------------------------------
            //-------------------------------------------------------------------------------------------

            //章鱼哥
            g.setColor(new Color(179, 221, 201));
            g.fillRect(200, 0, 200, 600);

            //嘴

            g.setColor(new Color(84, 121, 107));
            g.fillOval(235, 230, 142, 104);
            g.setColor(new Color(179, 221, 201));
            g.fillOval(237, 232, 138, 100);
            g.fillRect(218, 217, 166, 97);

            //嘴角
            g.setColor(new Color(84, 121, 107));
            g.drawLine(254, 309, 245, 318);
            g.drawLine(254, 310, 245, 319);


            g.drawLine(357, 310, 365, 320);
            g.drawLine(357, 311, 365, 321);


            //皱纹
            g.setColor(new Color(84, 121, 107));
            g.fillOval(275, 224, 68, 51);
            g.setColor(new Color(179, 221, 201));
            g.fillOval(273, 225, 71, 54);
            g.fillOval(269, 228, 79, 22);

            g.setColor(new Color(84, 121, 107));
            g.fillOval(261, 231, 83, 30);
            g.setColor(new Color(179, 221, 201));
            g.fillOval(256, 233, 93, 34);

            g.setColor(new Color(84, 121, 107));
            g.fillOval(264, 239, 76, 57);
            g.setColor(new Color(179, 221, 201));
            g.fillOval(258, 241, 90, 62);

            //老年斑
            g.setColor(new Color(84, 121, 107));
            g.fillOval(257, 238, 4, 3);
            g.fillOval(268, 229, 4, 3);
            g.fillOval(273, 230, 3, 3);
            g.fillOval(316, 226, 4, 4);
            g.fillOval(330, 228, 3, 3);
            g.fillOval(344, 238, 3, 3);

            //左眼睛
            g.setColor(new Color(84, 121, 107));
            g.fillOval(269, 251, 38, 61);
            g.setColor(new Color(238, 242, 186));
            g.fillOval(271, 253, 34, 57);

            //下眼皮
            g.setColor(new Color(84, 121, 107));
            g.fillOval(269, 279, 35, 32);
            g.setColor(new Color(135, 190, 161));
            g.fillOval(271, 281, 31, 28);

            g.setColor(new Color(84, 121, 107));
            g.fillOval(265, 279, 42, 15);
            g.setColor(new Color(135, 190, 161));
            g.fillOval(270, 280, 35, 16);
            g.fillOval(301, 286, 3, 9);

            g.setColor(new Color(84, 121, 107));
            g.fillOval(276, 283, 20, 9);
            g.setColor(new Color(135, 190, 161));
            g.fillOval(275, 284, 22, 10);
            g.fillOval(273, 285, 29, 6);

            //左眼珠
            g.setColor(new Color(68, 44, 24));
            g.fillOval(289, 273, 7, 8);

            //右眼睛
            g.setColor(new Color(84, 121, 107));
            g.fillOval(305, 251, 38, 61);
            g.setColor(new Color(238, 242, 186));
            g.fillOval(307, 253, 34, 57);


            //下眼皮
            g.setColor(new Color(84, 121, 107));
            g.fillOval(305, 279, 35, 32);
            g.setColor(new Color(135, 190, 161));
            g.fillOval(307, 281, 31, 28);

            g.setColor(new Color(84, 121, 107));
            g.fillOval(305, 279, 42, 15);
            g.setColor(new Color(135, 190, 161));
            g.fillOval(306, 280, 37, 15);
            g.fillOval(337, 286, 3, 9);

            g.setColor(new Color(84, 121, 107));
            g.fillOval(312, 283, 20, 9);
            g.setColor(new Color(135, 190, 161));
            g.fillOval(311, 284, 22, 10);
            g.fillOval(309, 285, 29, 6);

            //右眼珠
            g.setColor(new Color(68, 44, 24));
            g.fillOval(315, 273, 7, 8);

            //鼻子
            g.setColor(new Color(84, 121, 107));
            g.fillOval(281, 295, 46, 75);

            g.setColor(new Color(179, 221, 201));
            g.fillOval(283, 297, 42, 71);


            //-------------------------------------------------------------------------------------------
            //-------------------------------------------------------------------------------------------

            //海绵宝宝
            g.setColor(new Color(255, 243, 89));
            g.fillRect(400, 0, 200, 600);

            //嘴
            g.setColor(new Color(64, 61, 33));
            g.fillOval(451, 329, 135, 81);
            g.setColor(new Color(255, 243, 89));
            g.fillOval(453, 331, 131, 77);
            g.fillRect(531, 310, 56, 111);
            g.fillRect(434, 325, 42, 94);
            g.fillRect(426, 348, 165, 80);

            g.setColor(new Color(64, 61, 33));
            int x[] = {484, 502, 502, 484};
            int y[] = {337, 332, 345, 345};
            int n = 4;
            g.fillPolygon(x, y, n);

            g.setColor(Color.white);
            int xn[] = {486, 500, 500, 486};
            int yn[] = {337, 332, 343, 343};
            int nn = 4;
            g.fillPolygon(xn, yn, nn);

            g.setColor(new Color(64, 61, 33));
            int xr[] = {505, 522, 522, 505};
            int yr[] = {331, 330, 345, 345};
            int nr = 4;
            g.fillPolygon(xr, yr, nr);

            g.setColor(Color.white);
            int xrn[] = {507, 520, 520, 507};
            int yrn[] = {332, 331, 343, 343};
            int nrn = 4;
            g.fillPolygon(xrn, yrn, nrn);

            //眉毛
            g.setColor(new Color(110, 105, 99));
            g.fillArc(464, 219, 35, 36, 0, 70);

            g.setColor(new Color(255, 243, 89));
            g.fillArc(466, 221, 31, 32, 0, 70);

            //左眼睛
            g.setColor(new Color(110, 105, 99));
            g.fillOval(430, 230, 71, 69);
            g.setColor(Color.white);
            g.fillOval(432, 232, 67, 65);


            g.setColor(new Color(110, 105, 99));
            g.fillOval(456, 253, 30, 25);
            g.setColor(new Color(63, 183, 234));
            g.fillOval(458, 255, 26, 21);
            g.setColor(Color.BLACK);
            g.fillOval(464, 261, 14, 9);

            g.setColor(new Color(255, 243, 89));
            g.fillArc(432, 232, 67, 65, 0, 180);


            g.setColor(new Color(110, 105, 99));
            g.drawLine(430, 264, 500, 264);

            //右眼睛
            g.setColor(new Color(110, 105, 99));
            g.fillOval(500, 230, 71, 69);

            g.setColor(Color.white);
            g.fillOval(502, 232, 67, 65);

            g.setColor(new Color(110, 105, 99));
            g.fillOval(519, 253, 30, 25);
            g.setColor(new Color(63, 183, 234));
            g.fillOval(521, 255, 26, 21);
            g.setColor(Color.BLACK);
            g.fillOval(527, 261, 14, 9);

            g.setColor(new Color(110, 105, 99));
            g.drawLine(500, 264, 571, 264);

            g.setColor(new Color(255, 243, 89));
            g.fillArc(502, 232, 67, 65, 0, 180);

            g.setColor(new Color(110, 105, 99));
            g.drawLine(500, 264, 571, 264);

            //鼻子
            g.setColor(new Color(110, 105, 99));
            g.fillOval(491, 262, 23, 40);
            g.setColor(new Color(255, 243, 89));
            g.fillOval(493, 264, 19, 36);
            g.fillOval(493, 298, 18, 7);

            //雀斑
            g.setColor(new Color(208, 21, 10));
            g.fillOval(432, 298, 4, 4);
            g.fillOval(450, 303, 4, 4);
            g.fillOval(441, 309, 4, 4);
            g.fillOval(550, 304, 4, 4);
            g.fillOval(568, 299, 4, 4);
            g.fillOval(560, 309, 4, 4);

            //孔
            g.setColor(new Color(155, 159, 6));
            g.fillOval(422, 217, 17, 14);
            g.fillOval(418, 236, 6, 6);
            g.fillOval(575, 218, 11, 12);
            g.fillOval(442, 337, 18, 27);
            g.fillOval(433, 325, 10, 13);
            g.fillOval(544, 355, 8, 10);
            g.fillOval(553, 329, 28, 25);

            //下嘴唇
            g.setColor(new Color(238, 173, 136));
            g.fillOval(473, 348, 30, 12);
            g.setColor(new Color(255, 243, 89));
            g.fillOval(475, 350, 26, 8);
            g.fillOval(473, 347, 31, 12);

            g.setColor(new Color(238, 173, 136));
            g.fillOval(502, 347, 30, 12);
            g.setColor(new Color(255, 243, 89));
            g.fillOval(504, 349, 26, 8);
            g.fillOval(499, 346, 33, 11);

            for(int i=0;i<20;i++) {


                //气泡
					/*g.setColor(new Color(250, 157, 158));
					g.fillOval(x1[i], y1[i], R[i], R[i]);
					g.setColor(Color.white);
					g.fillArc(x1[i]+4,y1[i]+4,R[i]-7,R[i]-7,-180,-60);
					g.setColor(new Color(250, 157, 158));
					g.fillOval(x1[i]+6,y1[i]+6,R[i]-12,R[i]-12);
					g.setColor(Color.white);
					g.fillOval(x1[i]+11,y1[i]+3,R[i]-25,R[i]-25);*/
                g.drawString("谢谢",x1[i],y1[i]);

            }

        }


        @Override
        public void run() {


            while (true){

                for (int i=0;i<100;i++) {
                    y1[i] = y1[i] - r[i];
                    if (y1[i] < 0) {
                        y1[i] = 600;
                    }

                }
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                repaint();

            }


        }
    }



}

