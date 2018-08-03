import java.awt.*;
import java.awt.event.*;

// MyFrameクラスの宣言
// ActionListenerインターフェースを実装
class MyFrame extends Frame implements ActionListener {
  Label ansLabel; // 計算結果を示すラベルを生成
  Label formulLabel; // 計算式を示すラベル
  Button btn[] = new Button[20];
  String buttonLavel[] = { "hoge", "Reset", "Delete", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+",
      "negate", "0", ".", "=" };

  public MyFrame() {
    setTitle("簡易計算機"); // ウィンドウのタイトル
    setSize(1920, 1080); // ウィンドウサイズ
    addWindowListener(new MyWindowAdapter()); // WindowEventを受け取るイベントリスナを指定する
    
    setLayout(new GridLayout(2, 1));
    formulLabel = new Label("formulLavel");
    ansLabel = new Label("ansLabel");

    formulLabel.setPreferredSize(new Dimension(1080, 100));
    ansLabel.setPreferredSize(new Dimension(1080, 100));
    add(formulLabel);
    add(ansLabel);

    setLayout(new GridLayout(5, 4)); // 左から右にボタンを配置する
    for (int i = 0; i < 20; i++) {
      btn[i] = new Button(buttonLavel[i]);
      btn[i].setPreferredSize(new Dimension(50, 100));
      btn[i].setFont(new Font("Calibri", Font.PLAIN, 30));
      add(btn[i]);
    }

    setVisible(true);
  }

  // ボタンがクリックされたときのアクションを記述
  public void actionPerformed(ActionEvent ae) {
    System.out.println("hey");
  }
}

// イベントリスナー: MyWindowAdapter
class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.exit(0); // 終了処理
  }
}

public class WinApp {
  public static void main(String args[]) {
    MyFrame mf = new MyFrame(); // MyFrameオブジェクトを生成
    mf.setVisible(true); // ウィンドウを表示できるようにする
  }
}