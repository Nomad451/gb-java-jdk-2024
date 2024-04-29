package seminars.seminar_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {

    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;

    private JButton btnStart;

    SettingsWindow(GameWindow gameWindow) {
        btnStart = new JButton("Start new game");

        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameWindow.startNewGame(0, 3, 3, 3);
            }
        });

        add(btnStart);

        setLayout(new GridLayout(10, 1));
        add(new JLabel("Выберите режим"));
        ButtonGroup bg = new ButtonGroup();
        JRadioButton pvc = new JRadioButton("Человек против компьютера");
        JRadioButton pvp = new JRadioButton("Человек против человека");
        bg.add(pvc);
        bg.add(pvp);
        add(pvc);
        add(pvp);
        add(new JLabel("Выберите размеры поля"));
        add(new JLabel("Установленный размер поля"));
        add(new JSlider(3, 10, 3));
        add(new JLabel("Выберите длину для победы"));
        add(new JLabel("Установленная длина"));
        add(new JSlider(3, 10, 3));
        add(btnStart);


    }
}
