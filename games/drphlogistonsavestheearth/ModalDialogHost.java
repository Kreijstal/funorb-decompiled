/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static AudioOutput field_J;
    static int field_L;
    static int[] field_M;
    static BitmapFont field_H;
    private IntrusiveDeque field_K;
    static int[] field_I;

    public static void clearStaticReferences(byte param0) {
        field_M = null;
        field_J = null;
        field_H = null;
        if (param0 != 52) {
          field_J = (AudioOutput) null;
        }
        field_I = null;
    }

    final static int b(int param0, int param1) {
        if (param0 != 0) {
          return 45;
        }
        return uc.field_b[param1 & 2047];
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
          return;
        }
        ProgressMessageDialog.field_vb = 1000000000L / (long)param1;
    }

    final void closeAllDialogs(int param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(this.field_K);
        ModalDialog var3 = (ModalDialog) (var2.c(-1));
        while (var3 != null) {
          var3.field_Q = false;
          var3 = (ModalDialog) (var2.a((byte) -82));
        }
        this.field_z = null;
        if (param0 != 300) {
          field_J = (AudioOutput) null;
        }
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_l != null) {
          this.field_l.paintWidget(true, 119, (UiWidget) (this), param3, param0);
        }
        rh var5 = new rh(this.field_K);
        if (param2 != -21) {
          field_H = (BitmapFont) null;
        }
        UiWidget var6 = (UiWidget) (var5.a(-119));
        while (var6 != null) {
          var6.drawWidget(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
          var6 = (UiWidget) (var5.b((byte) 87));
        }
    }

    final void advanceDialogs(boolean param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(this.field_K);
        ModalDialog var3 = (ModalDialog) (var2.c(-1));
        if (param0) {
          this.closeAllDialogs(-61);
        }
        while (var3 != null) {
          if (var3.advanceDialogAnimation(2968)) {
            var3.unlink(-16175);
          }
          var3 = (ModalDialog) (var2.a((byte) -103));
        }
        this.field_z = (UiWidget) ((Object) this.getTopOpenDialog(-29));
    }

    final void snapAndPruneDialogs(byte param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= -6) {
          return;
        }
        rh var2 = new rh(this.field_K);
        ModalDialog var3 = (ModalDialog) (var2.c(-1));
        while (var3 != null) {
          if (var3.snapDialogAnimation(0)) {
            var3.unlink(-16175);
          }
          var3 = (ModalDialog) (var2.a((byte) -100));
        }
    }

    final ModalDialog getTopOpenDialog(int param0) {
        rh var2;
        int var3;
        ModalDialog var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = 87 % ((param0 - 56) / 53);
        var2 = new rh(this.field_K);
        var4 = (ModalDialog) (var2.c(-1));
        while (var4 != null) {
          if (var4.field_Q) {
            return var4;
          }
          var4 = (ModalDialog) (var2.a((byte) -81));
        }
        return null;
    }

    public ModalDialogHost() {
        super(0, 0, di.field_a, BufferedSocket.field_l, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_K = new IntrusiveDeque();
    }

    final void showDialog(byte param0, UiWidget param1) {
        ModalDialog var3 = null;
        try {
          if (!(param1 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param1);
          this.field_K.addFirst(48, var3);
          if (param0 > -82) {
            field_M = (int[]) null;
          }
          var3.field_Q = true;
          var3.takeFocus(false, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "k.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final UiWidget getFocusedChild(int param0) {
        rh var2;
        int var3;
        ModalDialog var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = -123 / ((param0 + 28) / 57);
        var2 = new rh(this.field_K);
        var4 = (ModalDialog) (var2.c(-1));
        while (var4 != null) {
          if (var4.field_Q) {
            return var4.getFocusedChild(-22426);
          }
          var4 = (ModalDialog) (var2.a((byte) -108));
        }
        return null;
    }

    static {
        field_M = new int[]{1, 0, 50, 0, 25, 500, 0, 10, 0, 0, 0, 450, 600, 200, 150, 300, 180, 400, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 50, 100, 0, 0, 200, 25, 25, 25, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 50, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_L = 0;
        field_I = new int[8192];
    }
}
