import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;

// MyFrameクラスの宣言
// ActionListenerインターフェースを実装
class MyFrame extends Frame implements ActionListener {
  Label ansLabel; // 計算結果を示すラベルを生成
  Label formulLabel; // 計算式を示すラベル
  Button btn[] = new Button[20];
  String buttonLavel[] = { "hoge", "Reset", "Delete", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+",
      "negate", "0", ".", "=" }; // btn[]に表示する文字列
  Panel buttonPanel; // btn[]を置くパネル

  public MyFrame() {
    setTitle("簡易計算機"); // ウィンドウのタイトル
    setSize(1920, 1080); // ウィンドウサイズ
    addWindowListener(new MyWindowAdapter()); // WindowEventを受け取るイベントリスナを指定する

    /* 計算式と答えを示すラベルをセンターに配置 */
    setLayout(new FlowLayout(FlowLayout.CENTER));
    formulLabel = new Label("");
    ansLabel = new Label("0");
    /* ラベルの外見を変更 */
    formulLabel.setPreferredSize(new Dimension(1920, 80));
    ansLabel.setPreferredSize(new Dimension(1920, 80));
    formulLabel.setAlignment(Label.RIGHT);
    ansLabel.setAlignment(Label.RIGHT);
    formulLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
    ansLabel.setFont(new Font("Calibri", Font.PLAIN, 30));

    /* ウィンドウに追加する */
    add(formulLabel);
    add(ansLabel);

    /* ボタンを配置するパネルを生成GridLayoutを適応しておく */
    buttonPanel = new Panel();
    buttonPanel.setLayout(new GridLayout(5, 4));
    /* ボタン生成, 外見の設定 */
    for (int i = 0; i < 20; i++) {
      btn[i] = new Button(buttonLavel[i]);
      btn[i].setPreferredSize(new Dimension(480, 170));
      btn[i].setFont(new Font("Calibri", Font.PLAIN, 20));
      buttonPanel.add(btn[i]);
    }
    /* パネルをウィンドウに表示 */
    add(buttonPanel);

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