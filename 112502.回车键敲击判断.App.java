import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea jTextArea_A = new JTextArea();
    JTextArea jTextArea_B = new JTextArea();
    //构造方法
    public Test() {
        jTextArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(jTextArea_A.getText().equals("王大锤")){
                        jTextArea_B.setText("回答正确，好帅呀！！");
                    }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        jTextArea_B.setText("错误");
                    }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        jTextArea_A.setBounds(100,100,100,100);
        jTextArea_B.setBounds(100,300,100,100);
        jTextArea_A.setBackground(Color.yellow);
        jTextArea_B.setBackground(Color.green);
        jTextArea_A.setText("魔镜，谁最丑");
        myPanel.add(jTextArea_A);
        myPanel.add(jTextArea_B);
        JFrame frame = new JFrame("诚实的魔镜");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Test().go();
    }
}
