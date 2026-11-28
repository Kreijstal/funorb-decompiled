/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static int field_F;
    private IntrusiveDeque field_E;
    static Sprite[] field_H;
    static int field_D;
    static int field_G;

    final static void a(int param0, int param1, TooltipPanel[] param2, byte param3) {
        TooltipPanel var4 = null;
        try {
          if (param3 != -58) {
            field_G = 10;
          }
          var4 = param2[param2.length - 1];
          var4.addVerticalSpace(param0, param1, 86);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "ln.NA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void closeAllDialogs(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_E);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 79));
        while (var3 != null) {
          var3.field_D = false;
          var3 = (ModalDialog) (var2.b(true));
        }
        if (param0 < 0) {
          return;
        }
        this.field_C = null;
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        int var7 = Torquing.field_u;
        if (null != this.renderer) {
          this.renderer.paintWidget(114, param2, param3, true, (UiWidget) (this));
        }
        re var5 = new re(this.field_E);
        if (param1 > -7) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.a(17514));
        while (var6 != null) {
          var6.drawWidget(param0, (byte) -58, param2 + this.y, param3 + this.x);
          var6 = (UiWidget) (var5.a(true));
        }
    }

    final void advanceDialogs(byte param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_E);
        if (param0 >= -63) {
          field_G = -105;
        }
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 95));
        while (var3 != null) {
          if (var3.advanceDialogAnimation(-7)) {
            var3.unlink(0);
          }
          var3 = (ModalDialog) (var2.b(true));
        }
        this.field_C = (UiWidget) ((Object) this.getTopOpenDialog(0));
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 < 68) {
          return -102;
        }
        return param2 < param1 ? param1 : param0 < param2 ? param0 : param2;
    }

    public static void h(byte param0) {
        field_H = null;
        if (param0 < 81) {
          ModalDialogHost.a(3, -20, 23, 107);
        }
    }

    final void showDialog(UiWidget param0, byte param1) {
        ModalDialog var3 = null;
        try {
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param0);
          this.field_E.addLast((byte) 68, var3);
          var3.field_D = true;
          int var4 = 107 % ((param1 - 18) / 61);
          var3.takeFocus((UiWidget) (this), false);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "ln.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public ModalDialogHost() {
        super(0, 0, qj.field_f, RasterBuffer.field_h, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_E = new IntrusiveDeque();
    }

    final void snapAndPruneDialogs(boolean param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_E);
        if (param0) {
          this.field_E = (IntrusiveDeque) null;
        }
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 68));
        while (var3 != null) {
          if (var3.snapDialogAnimation((byte) 122)) {
            var3.unlink(0);
          }
          var3 = (ModalDialog) (var2.b(true));
        }
    }

    final ModalDialog getTopOpenDialog(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(this.field_E);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) 66));
        while (var3 != null) {
          if (var3.field_D) {
            return var3;
          }
          var3 = (ModalDialog) (var2.b(true));
        }
        if (param0 == 0) {
          return null;
        }
        field_D = -119;
        return null;
    }

    final static void a(byte param0, int param1) {
        int var2 = -73 % ((33 - param0) / 38);
        oe.a(true, param1, false);
    }

    final UiWidget getFocusedChild(boolean param0) {
        re var2;
        ModalDialog var3;
        int var4;
        var4 = Torquing.field_u;
        if (!param0) {
          this.field_E = (IntrusiveDeque) null;
        }
        var2 = new re(this.field_E);
        var3 = (ModalDialog) (var2.a((byte) 99));
        while (var3 != null) {
          if (var3.field_D) {
            return var3.getFocusedChild(0);
          }
          var3 = (ModalDialog) (var2.b(true));
        }
        return null;
    }

    static {
    }
}
