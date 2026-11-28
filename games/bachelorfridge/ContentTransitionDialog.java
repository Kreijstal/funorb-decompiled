/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalDialog {
    private int field_Z;
    static int[] field_X;
    static String[] field_cb;
    static String field_ab;
    private int field_W;
    private int field_V;
    private int field_db;
    static ResourceArchive field_U;
    private AlphaWidgetContainer field_S;
    private int field_bb;
    private kf field_Y;
    private UiWidget field_T;
    static String field_eb;

    boolean advanceDialogAnimation(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        var3 = BachelorFridge.field_y;
        if (null == this.field_Y) {
          if (param0 >= -32) {
            return false;
          }
          return super.advanceDialogAnimation(-118);
        }
        if (BufferedSocket.field_n == this.field_Y) {
          fieldTemp$0 = this.field_Z + 1;
          this.field_Z = this.field_Z + 1;
          if (fieldTemp$0 != this.field_W) {
            this.field_S.field_F = -((this.field_Z << 8) / this.field_W) + 256;
          } else {
            this.field_Y = cp.field_b;
            this.resizeDialog(this.field_db, 26012, this.field_T.height + 12 + this.field_bb, 12 + this.field_T.width);
            this.field_S.field_F = 0;
            this.field_Z = 0;
          }
          if (param0 >= -32) {
            return false;
          }
          return super.advanceDialogAnimation(-118);
        }
        if (this.field_Y != dha.field_b) {
          if (param0 >= -32) {
            return false;
          }
          return super.advanceDialogAnimation(-118);
        }
        fieldTemp$1 = this.field_Z + 1;
        this.field_Z = this.field_Z + 1;
        if (this.field_V != fieldTemp$1) {
          this.field_S.field_F = (this.field_Z << 8) / this.field_V;
        } else {
          this.field_Y = null;
          this.field_S.field_F = 256;
        }
        if (param0 >= -32) {
          return false;
        }
        return super.advanceDialogAnimation(-118);
    }

    final boolean snapDialogAnimation(int param0) {
        if (param0 >= -59) {
          return true;
        }
        this.finishResize(17310);
        return super.snapDialogAnimation(-79);
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        if (param3 < 13) {
          return;
        }
        RasterBuffer.a(false, param0, param1, param2);
    }

    public static void releaseStatics(int param0) {
        if (param0 > 109) {
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        }
        ContentTransitionDialog.releaseStatics(-52);
        field_U = null;
        field_X = null;
        field_cb = null;
        field_ab = null;
        field_eb = null;
    }

    boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_S == null) {
            return false;
          }
          if (98 == param1) {
            this.field_S.acquireFocus(param3, -101);
          }
          if (param1 == 99) {
            this.field_S.acquireFocus(param3, -94);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("uda.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void resizeCompleted(boolean param0) {
        if (BufferedSocket.field_n == this.field_Y) {
          return;
        }
        this.field_Y = dha.field_b;
        this.field_Z = 0;
        if (!param0) {
          this.installContent(this.field_T, -15084);
          this.field_S.field_F = 0;
          this.field_T = null;
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.replaceContent((UiWidget) null, 10);
        this.installContent(this.field_T, -15084);
        this.field_S.field_F = 0;
        this.field_T = null;
    }

    ContentTransitionDialog(ModalDialogHost param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.width, param1.height + (12 + param2));
        try {
          this.field_db = param4;
          this.field_bb = param2;
          this.field_V = param3;
          this.field_W = param3;
          this.installContent(param1, -15084);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void installContent(UiWidget param0, int param1) {
        try {
          if (null != this.field_S) {
            this.field_S.unlink(false);
          }
          if (param0 == null) {
            this.field_S = new AlphaWidgetContainer();
          } else {
            param0.setBounds(6, param0.height, (byte) 59, param0.width, 6 + this.field_bb);
            this.field_S = new AlphaWidgetContainer(param0);
          }
          this.addChild(this.field_S, param1 + 15073);
          if (param1 != -15084) {
            this.field_Z = -77;
          }
          this.field_T = null;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uda.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void replaceContent(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_T = param0;
          if (param1 != 33) {
            return;
          }
          if (this.field_Y == cp.field_b) {
            this.resizeDialog(this.field_db, 26012, this.field_T.height + this.field_bb + 12, 12 + this.field_T.width);
            this.field_Z = 0;
            return;
          }
          if (BufferedSocket.field_n == this.field_Y) {
            return;
          }
          this.field_Z = 0;
          this.field_Y = BufferedSocket.field_n;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("uda.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void finishResize(int param0) {
        if (null != this.field_Y) {
          if (this.field_Y != dha.field_b) {
            this.setCenteredSize(-41, 12 + this.field_bb + this.field_T.height, 12 + this.field_T.width);
            this.installContent(this.field_T, -15084);
          }
          this.field_S.field_F = 256;
          this.field_Y = null;
        }
        super.finishResize(param0 ^ 0);
        if (param0 == 17310) {
          return;
        }
        this.resizeCompleted(false);
    }

    static {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_ab = "Quit to website";
        field_eb = "Press F10 to open Quick Chat.";
    }
}
