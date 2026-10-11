/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputAdapter001 extends InputAdapter003 implements java.awt.event.MouseWheelListener {
    private int integerState0031;

    final void performAction0057(int integerArgument1, java.awt.Component componentArgument2) {
        if (integerArgument1 <= 10) {
          this.integerState0031 = 89;
          componentArgument2.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
          return;
        }
        componentArgument2.removeMouseWheelListener((java.awt.event.MouseWheelListener) (this));
    }

    public final synchronized void mouseWheelMoved(java.awt.event.MouseWheelEvent mouseWheelEventArgument1) {
        this.integerState0031 = this.integerState0031 + mouseWheelEventArgument1.getWheelRotation();
        mouseWheelEventArgument1.consume();
    }

    final void performAction0058(java.awt.Component componentArgument1, int integerArgument2) {
        componentArgument1.addMouseWheelListener((java.awt.event.MouseWheelListener) (this));
        if (integerArgument2 != -63) {
          java.awt.Component componentLocal1 = (java.awt.Component) null;
          this.performAction0058((java.awt.Component) null, 100);
        }
    }

    InputAdapter001() {
        this.integerState0031 = 0;
    }

    final synchronized int computeInteger0056(int integerArgument1) {
        int integerLocal1 = this.integerState0031;
        if (integerArgument1 == 60) {
          this.integerState0031 = 0;
          return integerLocal1;
        }
        this.integerState0031 = 41;
        this.integerState0031 = 0;
        return integerLocal1;
    }
}
