/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    private IntrusiveDeque field_L;
    static long field_H;
    static GameKeyHandler field_J;
    static int field_K;
    static String[] field_I;

    final void advanceDialogs(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        if (param0) {
          return;
        }
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 94));
        while (var3 != null) {
          if (var3.advanceDialogAnimation(1784)) {
            var3.unlink(10);
          }
          var3 = (ModalDialog) (var2.c(122));
        }
        this.field_G = (UiWidget) ((Object) this.getTopOpenDialog((byte) 115));
    }

    public static void clearStaticReferences(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 != 30) {
          ModalDialogHost.clearStaticReferences((byte) -67);
        }
    }

    final UiWidget getFocusedChild(int param0) {
        ck var2;
        ModalDialog var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != 0) {
          return (UiWidget) null;
        }
        var2 = new ck(this.field_L);
        var3 = (ModalDialog) (var2.a((byte) 84));
        while (var3 != null) {
          if (var3.field_J) {
            return var3.getFocusedChild((byte) -48);
          }
          var3 = (ModalDialog) (var2.c(param0 ^ 113));
        }
        return null;
    }

    final void showDialog(UiWidget param0, int param1) {
        ModalDialog var4 = null;
        try {
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          int var3_int = 63 % ((18 - param1) / 59);
          var4 = (ModalDialog) (param0);
          this.field_L.addLast(-3024, var4);
          var4.field_J = true;
          var4.takeFocus(-1463, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "i.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void closeAllDialogs(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 109));
        while (var3 != null) {
          var3.field_J = false;
          var3 = (ModalDialog) (var2.c(117));
        }
        if (param0 != 1) {
          field_I = (String[]) null;
        }
        this.field_G = null;
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        if (null != this.field_w) {
          this.field_w.paintWidget((byte) 125, param0, true, param2, (UiWidget) (this));
        }
        if (param3 != 0) {
          this.getFocusedChild(-93);
        }
        ck var5 = new ck(this.field_L);
        UiWidget var6 = (UiWidget) (var5.a(param3 ^ -25119));
        while (var6 != null) {
          var6.drawWidget(param0 + this.field_j, param1, this.field_m + param2, param3 ^ 0);
          var6 = (UiWidget) (var5.b(640));
        }
    }

    final ModalDialog getTopOpenDialog(byte param0) {
        ck var2;
        ModalDialog var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        var3 = (ModalDialog) (var2.a((byte) 92));
        if (param0 < 81) {
          field_I = (String[]) null;
        }
        while (var3 != null) {
          if (var3.field_J) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(121));
        }
        return null;
    }

    final void snapAndPruneDialogs(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) -66));
        while (var3 != null) {
          if (var3.snapDialogAnimation((byte) 124)) {
            var3.unlink(10);
          }
          var3 = (ModalDialog) (var2.c(119));
        }
        if (!param0) {
          this.field_L = (IntrusiveDeque) null;
        }
    }

    public ModalDialogHost() {
        super(0, 0, og.field_f, wc.field_e, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_L = new IntrusiveDeque();
    }

    final static void sleepMillis(byte param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param1 % 10L == 0L) {
          lc.sleepIgnoringInterrupts(2767, param1 - 1L);
          lc.sleepIgnoringInterrupts(2767, 1L);
        } else {
          lc.sleepIgnoringInterrupts(2767, param1);
        }
        if (param0 < 11) {
          field_I = (String[]) null;
        }
    }

    static {
        field_J = new GameKeyHandler();
    }
}
