package mainView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Runnable runApplication=new Runnable() {
            @Override
            public void run() {
               MainViewTemplate w=new MainViewTemplate();
            }
        };
        SwingUtilities.invokeLater(runApplication);
    }
}
