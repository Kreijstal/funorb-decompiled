/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static boolean field_x;
    private IntrusiveDeque field_w;
    static String field_y;

    final void showDialog(byte param0, UiWidget param1) {
        ModalDialog var3 = null;
        if (param0 <= 68) {
          return;
        }
        try {
          if (!(param1 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param1);
          this.field_w.addFirst(-125, var3);
          var3.field_G = true;
          var3.takeFocus(0, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "tc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public ModalDialogHost() {
        super(0, 0, SpriteState.field_o, ak.field_h, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_w = new IntrusiveDeque();
    }

    final static void j(int param0) {
        int var1_int = 0;
        int var2 = StarCannon.field_A;
        p.field_d.resetTiming((byte) -78);
        for (var1_int = 0; 32 > var1_int; var1_int++) {
          IsaacRandom.field_j[var1_int] = 0L;
        }
        if (param0 != 32) {
          return;
        }
        try {
          for (var1_int = 0; 32 > var1_int; var1_int++) {
            vd.field_g[var1_int] = 0L;
          }
          sg.field_k = 0;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "tc.B(" + param0 + ')');
        }
    }

    final ModalDialog getTopOpenDialog(int param0) {
        ba var2;
        ModalDialog var3;
        var2 = new ba(this.field_w);
        var3 = (ModalDialog) (var2.a(param0 ^ param0));
        while (var3 != null) {
          if (var3.field_G) {
            return var3;
          }
          var3 = (ModalDialog) (var2.b(param0 ^ 97));
        }
        return null;
    }

    final void advanceDialogs(int param0) {
        ba var2 = new ba(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.a(0));
        if (param0 != -10597) {
          field_x = false;
        }
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) -124)) {
            var3.unlink(4);
          }
          var3 = (ModalDialog) (var2.b(param0 + 10679));
        }
        this.field_t = (UiWidget) ((Object) this.getTopOpenDialog(0));
    }

    final void closeAllDialogs(int param0) {
        ba var2 = new ba(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.a(0));
        while (var3 != null) {
          var3.field_G = false;
          var3 = (ModalDialog) (var2.b(102));
        }
        this.field_t = null;
        if (param0 != 26756) {
          this.getFocusedChild(-38);
        }
    }

    final UiWidget getFocusedChild(int param0) {
        ba var2;
        ModalDialog var3;
        var2 = new ba(this.field_w);
        var3 = (ModalDialog) (var2.a(param0 + param0));
        while (var3 != null) {
          if (var3.field_G) {
            return var3.getFocusedChild(1);
          }
          var3 = (ModalDialog) (var2.b(99));
        }
        return null;
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        int var7 = StarCannon.field_A;
        if (this.field_o != null) {
          this.field_o.paintWidget(param1, true, -93, param3, (UiWidget) (this));
        }
        ba var5 = new ba(this.field_w);
        if (param2 != 49) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.a(false));
        while (var6 != null) {
          var6.drawWidget(param0, this.field_s + param1, (byte) 49, param3 + this.field_j);
          var6 = (UiWidget) (var5.a((byte) -34));
        }
    }

    final void snapAndPruneDialogs(int param0) {
        int var4 = StarCannon.field_A;
        ba var2 = new ba(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.a(param0 ^ param0));
        while (var3 != null) {
          if (var3.snapDialogAnimation(-126)) {
            var3.unlink(4);
          }
          var3 = (ModalDialog) (var2.b(99));
        }
    }

    public static void clearStaticReferences(int param0) {
        field_y = null;
        if (param0 != -14528) {
          ModalDialogHost.clearStaticReferences(39);
        }
    }

    static {
        field_y = "CONTROLS:";
    }
}
