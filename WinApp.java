import java.awt.*;
import java.awt.event.*;

// MyFrameクラスの宣言
class MyFrame extends Frame {
  public MyFrame() {
    setSize(500, 800);
    addWindowListener(new MyWindowAdapter());
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }
}

public class WinApp {
  public static void main(String args[]) {
    MyFrame mf = new MyFrame();
    mf.setVisible(true);
  }
}