/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    private IntrusiveDeque field_D;
    static String field_A;
    static BitmapFont field_C;
    static String field_F;
    static int[] field_E;

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = Main.field_T;
        if (null != this.field_v) {
          this.field_v.paintWidget(param0, (UiWidget) (this), 11447, param1, true);
        }
        qd var5 = new qd(this.field_D);
        if (param2 != -1) {
          field_A = (String) null;
        }
        UiWidget var6 = (UiWidget) (var5.c((byte) -13));
        while (var6 != null) {
          var6.drawWidget(this.field_o + param0, param1 + this.field_i, -1, param3);
          var6 = (UiWidget) (var5.a((byte) 108));
        }
    }

    final UiWidget getFocusedChild(boolean param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_D);
        ModalDialog var3 = (ModalDialog) (var2.b((byte) -33));
        while (var3 != null) {
          if (var3.field_E) {
            return var3.getFocusedChild(-1);
          }
          var3 = (ModalDialog) (var2.a(28869));
        }
        if (!param0) {
          return null;
        }
        field_A = (String) null;
        return null;
    }

    final void advanceDialogs(int param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_D);
        if (param0 != -2054) {
          this.advanceDialogs(102);
        }
        ModalDialog var3 = (ModalDialog) (var2.b((byte) -33));
        while (var3 != null) {
          if (var3.advanceDialogAnimation(true)) {
            var3.unlink(105);
          }
          var3 = (ModalDialog) (var2.a(28869));
        }
        this.field_y = (UiWidget) ((Object) this.getTopOpenDialog((byte) 61));
    }

    final static void i(int param0) {
        gh.a(17, 31888);
        if (param0 <= 91) {
          ModalDialogHost.j(50);
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        if (param0 <= 37) {
          field_F = (String) null;
        }
        field_F = null;
        field_A = null;
        field_C = null;
        field_E = null;
    }

    final ModalDialog getTopOpenDialog(byte param0) {
        qd var2;
        ModalDialog var3;
        int var4;
        var4 = Main.field_T;
        if (param0 < 7) {
          ModalDialogHost.releaseDeclaredStaticReferences(65);
        }
        var2 = new qd(this.field_D);
        var3 = (ModalDialog) (var2.b((byte) -33));
        while (var3 != null) {
          if (var3.field_E) {
            return var3;
          }
          var3 = (ModalDialog) (var2.a(28869));
        }
        return null;
    }

    final void showDialog(UiWidget param0, byte param1) {
        ModalDialog var3 = null;
        try {
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          int var4 = 61 % ((41 - param1) / 33);
          var3 = (ModalDialog) (param0);
          this.field_D.addFirst(-121, var3);
          var3.field_E = true;
          var3.takeFocus(115, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "j.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void closeAllDialogs(int param0) {
        int var5 = Main.field_T;
        qd var2 = new qd(this.field_D);
        ModalDialog var3 = (ModalDialog) (var2.b((byte) -33));
        while (var3 != null) {
          var3.field_E = false;
          var3 = (ModalDialog) (var2.a(28869));
        }
        this.field_y = null;
        int var4 = 14 % ((param0 - 55) / 61);
    }

    public ModalDialogHost() {
        super(0, 0, lb.field_g, kb.field_d, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_D = new IntrusiveDeque();
    }

    final void snapAndPruneDialogs(boolean param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_D);
        if (!param0) {
          field_E = (int[]) null;
        }
        ModalDialog var3 = (ModalDialog) (var2.b((byte) -33));
        while (var3 != null) {
          if (var3.snapDialogAnimation(928516712)) {
            var3.unlink(120);
          }
          var3 = (ModalDialog) (var2.a(28869));
        }
    }

    final static void j(int param0) {
        r.field_p = false;
        DirectByteArrayStore.field_e = false;
        gh.a(-1, 31888);
        jc.field_P = tj.field_F;
        if (param0 != -23687) {
          field_A = (String) null;
        }
        DirectByteArrayStore.field_d = tj.field_F;
    }

    static {
        field_A = "Unpacking music";
        field_F = "No highscores";
        field_E = new int[8192];
    }
}
