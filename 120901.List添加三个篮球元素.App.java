import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> labelList = new ArrayList<>();
    //构造方法
    public App() {
        labelList.add(new JLabel());
        labelList.add(new JLabel());
        labelList.add(new JLabel());

        java.net.URL imgURL = App.class.getResource("img/ball.png");
        labelList.get(0).setIcon(new ImageIcon(imgURL));
        labelList.get(0).setBounds(100,100,128,128);
        myPanel.add(labelList.get(0));

        java.net.URL imgURL2 = App.class.getResource("img/ball.png");
        labelList.get(1).setIcon(new ImageIcon(imgURL2));
        labelList.get(1).setBounds(169,100,128,128);
        myPanel.add(labelList.get(1));

        java.net.URL imgURL3 = App.class.getResource("img/ball.png");
        labelList.get(2).setIcon(new ImageIcon(imgURL3));
        labelList.get(2).setBounds(238,100,128,128);
        myPanel.add(labelList.get(2));
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);



        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
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
