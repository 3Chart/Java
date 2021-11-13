import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class GUI extends JFrame implements ActionListener {
    int t1 = 0;
    int t2 = 0;
    String t = "N/A";
    JPanel pnl = new JPanel(null);
    JButton Milan = new JButton("FC Milan");
    JButton Real = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: " + t1 + "X" + t2);
    JLabel ls= new JLabel("Last scorer: " + t);
    JLabel win = new JLabel("DRAW");

    public GUI(){
        this.setContentPane(pnl);
        ls.setBounds(125,80,140,20);
        Real.setBounds(170,40,110,20);
        Real.addActionListener(this);
        result.setBounds(125,60,80,20);
        win.setBounds(125,100,70,20);
        Milan.setBounds(40,40,110,20);
        Milan.addActionListener(this);
        pnl.add(result);
        pnl.add(ls);
        pnl.add(Milan);
        pnl.add(Real);
        pnl.add(win);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("FC Milan")){
            t = "FC Milan";
            t1++;
            if(t1 > t2){
                win.setText("FC Milan");
            }
            else if(t1==t2){
                win.setText("DRAW");
            }
            result.setText("Result: " + t1 + "X" + t2);
            ls.setText("Last scorer: " + t);
        }
        else if(command.equals("Real Madrid")){
            t = "Real Madrid";
            t2++;
            if(t2 > t1){
                win.setText("Real Madrid");
            }
            else if(t1 == t2){
                win.setText("Draw");
            }
            result.setText("Result: " + t1 + "X" + t2);
            ls.setText("Last scorer: " + t);
        }
    }
    public static void main(String[] args) {
        GUI example = new GUI();
        example.setVisible(true);
        example.setSize(320,240);
        example.setResizable(false);
    }
}
