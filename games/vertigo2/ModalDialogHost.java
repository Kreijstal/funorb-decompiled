/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends WidgetWrapper {
    private IntrusiveDeque field_J;
    static FullscreenNoticeType field_I;
    static String[] field_M;
    static int[] field_P;
    static java.security.SecureRandom field_O;
    static int field_N;
    static String field_H;
    static String field_K;
    static int field_L;
    static String field_G;

    final void closeAllDialogs(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_J);
        if (param0 != 0) {
          return;
        }
        ModalDialog var3 = (ModalDialog) (var2.d(4));
        while (var3 != null) {
          var3.field_I = false;
          var3 = (ModalDialog) (var2.c(2));
        }
        this.field_C = null;
    }

    public ModalDialogHost() {
        super(0, 0, gi.field_m, BufferedRandomAccessFile.field_h, (WidgetListener) null, (WidgetEventListener) null);
        this.field_J = new IntrusiveDeque();
    }

    final void snapAndPruneDialogs(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_J);
        ModalDialog var3 = (ModalDialog) (var2.d(4));
        if (param0 != 0) {
          return;
        }
        while (var3 != null) {
          if (var3.snapDialogAnimation(-1)) {
            var3.unlink(2);
          }
          var3 = (ModalDialog) (var2.c(2));
        }
    }

    final UiWidget getFocusedChild(int param0) {
        IntrusiveDequeCursor var2;
        ModalDialog var3;
        int var4;
        UiWidget var5;
        var4 = Vertigo2.field_L ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_J);
        var3 = (ModalDialog) (var2.d(4));
        if (param0 != 15197) {
          var5 = (UiWidget) null;
          this.showDialog((UiWidget) null, 32);
        }
        while (var3 != null) {
          if (var3.field_I) {
            return var3.getFocusedChild(true);
          }
          var3 = (ModalDialog) (var2.c(2));
        }
        return null;
    }

    final void advanceDialogs(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_J);
        ModalDialog var3 = (ModalDialog) (var2.d(4));
        while (var3 != null) {
          if (var3.advanceDialogAnimation(17)) {
            var3.unlink(param0 ^ 2);
          }
          var3 = (ModalDialog) (var2.c(2));
        }
        this.field_C = (UiWidget) ((Object) this.getTopOpenDialog(param0 + param0));
    }

    final static void f(byte param0) {
        String var2 = (String) null;
        ProxySocketConnector.a((String) null, "", (byte) 33);
        if (param0 != -1) {
          ModalDialogHost.f((byte) -45);
        }
    }

    final void showDialog(UiWidget param0, int param1) {
        ModalDialog var3 = null;
        try {
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param0);
          this.field_J.addLast(var3, (byte) 27);
          var3.field_I = true;
          if (param1 != 0) {
            ModalDialogHost.f((byte) 122);
          }
          var3.takeFocus((byte) 116, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "sd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawWidget(boolean param0, int param1, int param2, int param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (null != this.listener) {
          this.listener.paintWidget(true, param2, true, (UiWidget) (this), param3);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_J);
        if (param0) {
          this.getFocusedChild(45);
        }
        UiWidget var6 = (UiWidget) (var5.b(4));
        while (var6 != null) {
          var6.drawWidget(false, param1, param2 + this.x, this.y + param3);
          var6 = (UiWidget) (var5.a((byte) 50));
        }
    }

    public static void clearStaticReferences(int param0) {
        field_M = null;
        field_H = null;
        if (param0 != -25849) {
          ModalDialogHost.clearStaticReferences(91);
        }
        field_O = null;
        field_P = null;
        field_I = null;
        field_G = null;
        field_K = null;
    }

    final ModalDialog getTopOpenDialog(int param0) {
        IntrusiveDequeCursor var2;
        ModalDialog var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 0) {
          ModalDialogHost.f((byte) 76);
        }
        var2 = new IntrusiveDequeCursor(this.field_J);
        var3 = (ModalDialog) (var2.d(4));
        while (var3 != null) {
          if (var3.field_I) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(2));
        }
        return null;
    }

    static {
        field_I = new FullscreenNoticeType();
        field_M = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_H = "To report a player, right-click on their name and select the option to report abuse.";
        field_N = 0;
        field_G = "Service unavailable";
        field_K = "To complete each level, you must paint all the blue blocks purple. You'll need to collect the paint pots scattered around the level to have enough paint.<br><br>There are numerous blocks that will help or hinder your progress. Play the tutorial for more information about each block.";
    }
}
