import java.awt.*;
import java.awt.event.*;

// MyFrameクラスの宣言
// ActionListenerインターフェースを実装
class MyFrame extends Frame implements ActionListener {
  Label dispLabel; // 計算結果等を示すラベルを生成
  Button btn[] = new Button[10];
  String buttonLavel[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

  public MyFrame() {
    setTitle("簡易計算機"); // ウィンドウのタイトル
    setSize(1920, 1080); // ウィンドウサイズ
    addWindowListener(new MyWindowAdapter()); // WindowEventを受け取るイベントリスナを指定する
    setLayout(new FlowLayout()); // 左から右にボタンを配置する
    dispLabel = new Label("Hello");
    for (int i = 0; i < 10; i++) {
      btn[i] = new Button(buttonLavel[i]);
      add(btn[i]);
    }
    add(dispLabel);
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