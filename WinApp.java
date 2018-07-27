import java.awt.*;
import java.awt.event.*;

// MyFrameクラスの宣言
// ActionListenerインターフェースを実装
class MyFrame extends Frame implements ActionListener {
  Button b1; // ボタンオブジェクトを生成
  Label dispLabel; // 計算結果等を示すラベルを生成

  public MyFrame() {
    setTitle("簡易計算機"); // ウィンドウのタイトル
    setSize(500, 800); // ウィンドウサイズ
    addWindowListener(new MyWindowAdapter()); // WindowEventを受け取るイベントリスナを指定する
    setLayout(new FlowLayout()); // 左から右にボタンを配置する
    dispLabel = new Label("Hello");
    b1 = new Button("1");
    b1.addActionListener(this); // いベントリスナーを登録
    add(b1);
    add(dispLabel);
  }

  // ボタンがクリックされたときのアクションを記述
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == b1) {
      System.out.println("クリックされたよ");
      dispLabel.setText("Hello");
    }
  }
}

// イベントリスナー: MyWindowAdapter
// 機能: ウィンドウがクローズ状態になったら終了する
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