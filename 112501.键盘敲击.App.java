import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_textA = new JTextArea();
    JTextArea textArea_textB = new JTextArea();
    //构造方法
    public App() {
            textArea_textA.setText("点击上↑键输出文字！！！！");
            textArea_textA.setBounds(100,100,250,150);
            textArea_textA.setBackground(Color.orange);
            myPanel.add(textArea_textA);
            textArea_textB.setBounds(100,300,250,150);
            textArea_textB.setBackground(Color.yellow);
            myPanel.add(textArea_textB);

            textArea_textA.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    super.keyReleased(e);
                    if(e.getKeyCode() == KeyEvent.VK_UP){
                        textArea_textB.append("干饭干饭干饭！！！！！\n");
                    }
                    if(e.getKeyCode() == KeyEvent.VK_DOWN){
                        textArea_textB.setText("");
                    }
                }
            });

    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
