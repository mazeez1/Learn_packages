import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title)
    {
        super(title);
        setSize(800,540);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public void paint(Graphics g){
        super.paint(g);
        Font sansSarifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSarifsmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSarifLarge);
        g.drawString("The Complete Java devloper Course",60,100);
        g.setFont(sansSarifsmall);
        g.drawString("By Tim Buchalka",60,200);


    }
}
