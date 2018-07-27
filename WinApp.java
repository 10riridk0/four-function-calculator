import java.awt.*;
import java.awt.event.*;

// MyFrameクラスの宣言
class MyFrame extends Frame {
  public MyFrame() {
    setTitle("簡易計算機"); // ウィンドウのタイトル
    setSize(500, 800); // ウィンドウサイズ
    addWindowListener(new MyWindowAdapter()); // WindowEventを受け取るイベントリスナを指定する
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