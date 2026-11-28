/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalDialog {
    private qc field_V;
    static int field_U;
    static lj field_R;
    private UiWidget field_X;
    private int field_Q;
    private int field_T;
    static int field_Y;
    private int field_ab;
    static String field_W;
    private int field_O;
    static int field_Z;
    private int field_N;
    private AlphaWidgetContainer field_S;

    boolean handleKey(UiWidget param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -14565) {
            return false;
          }
          if (super.handleKey(param0, param1, param2, param3 ^ 0)) {
            return true;
          }
          if (null != this.field_S) {
            if (param2 == 98) {
              this.field_S.takeFocus(param0, false);
            }
            if (param2 == 99) {
              this.field_S.takeFocus(param0, false);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("mh.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void replaceContent(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_X = param1;
          if (param0 != 10768) {
            this.advanceDialogAnimation((byte) -12);
          }
          if (RichTextLayout.field_n == this.field_V) {
            this.resizeDialog((byte) 126, this.field_ab, 12 + this.field_Q + this.field_X.field_m, 12 + this.field_X.field_k);
            this.field_T = 0;
            return;
          }
          if (ub.field_b == this.field_V) {
            return;
          }
          this.field_V = ub.field_b;
          this.field_T = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void resetStaticState(int param0) {
        field_R = null;
        field_W = null;
        if (param0 != -16167) {
          field_U = 91;
        }
    }

    final void finishResize(byte param0) {
        int var2 = -66 / ((31 - param0) / 35);
        if (null != this.field_V) {
          if (this.field_V != vb.field_g) {
            this.setCenteredSize(-463076575, this.field_X.field_k + 12, this.field_X.field_m + 12 + this.field_Q);
            this.installContent(this.field_X, 6);
          }
          this.field_V = null;
          this.field_S.field_E = 256;
        }
        super.finishResize((byte) -58);
    }

    ContentTransitionDialog(ModalDialogHost param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_k, param2 + (12 + param1.field_m));
        try {
          this.field_Q = param2;
          this.field_ab = param4;
          this.field_O = param3;
          this.field_N = param3;
          this.installContent(param1, 6);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, oh param3, int param4, int param5, int param6, BitmapFont param7, int param8, int param9, int param10, byte param11, int param12, int param13, int param14, BitmapFont param15, int param16, int param17, int param18, oh param19, oh param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          lb.a(param7, param12, -101, param15);
          hh.b(param10, param6, param1, param13, 0);
          l.a(param0, (byte) 127, param4);
          uk.a(param3, param18, param9, param19, param17, (byte) 82);
          var21_int = 16 % ((0 - param11) / 41);
          SecondaryNodeDequeIterator.a(param16, 0, param14, param20);
          ValidatedTextField.a(param2, param8, param5, (byte) 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("mh.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param20 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean advanceDialogAnimation(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = Bounce.field_N;
        if (param0 == 21) {
          if (null == this.field_V) {
            return super.advanceDialogAnimation((byte) 21);
          }
          if (ub.field_b != this.field_V) {
            if (vb.field_g != this.field_V) {
              return super.advanceDialogAnimation((byte) 21);
            }
            fieldTemp$0 = this.field_T + 1;
            this.field_T = this.field_T + 1;
            if (fieldTemp$0 == this.field_O) {
              this.field_V = null;
              this.field_S.field_E = 256;
              return super.advanceDialogAnimation((byte) 21);
            }
            this.field_S.field_E = (this.field_T << 8) / this.field_O;
            return super.advanceDialogAnimation((byte) 21);
          }
          fieldTemp$1 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (fieldTemp$1 == this.field_N) {
            this.field_V = RichTextLayout.field_n;
            this.resizeDialog((byte) 126, this.field_ab, this.field_Q + 12 + this.field_X.field_m, this.field_X.field_k + 12);
            this.field_T = 0;
            this.field_S.field_E = 0;
            return super.advanceDialogAnimation((byte) 21);
          }
          this.field_S.field_E = -((this.field_T << 8) / this.field_N) + 256;
          return super.advanceDialogAnimation((byte) 21);
        }
        this.finishResize((byte) 37);
        if (null == this.field_V) {
          return super.advanceDialogAnimation((byte) 21);
        }
        if (ub.field_b != this.field_V) {
          if (vb.field_g != this.field_V) {
            return super.advanceDialogAnimation((byte) 21);
          }
          fieldTemp$2 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (fieldTemp$2 == this.field_O) {
            this.field_V = null;
            this.field_S.field_E = 256;
            return super.advanceDialogAnimation((byte) 21);
          }
          this.field_S.field_E = (this.field_T << 8) / this.field_O;
          return super.advanceDialogAnimation((byte) 21);
        }
        int fieldTemp$3 = this.field_T + 1;
        this.field_T = this.field_T + 1;
        if (fieldTemp$3 == this.field_N) {
          this.field_V = RichTextLayout.field_n;
          this.resizeDialog((byte) 126, this.field_ab, this.field_Q + 12 + this.field_X.field_m, this.field_X.field_k + 12);
          this.field_T = 0;
          this.field_S.field_E = 0;
          return super.advanceDialogAnimation((byte) 21);
        }
        this.field_S.field_E = -((this.field_T << 8) / this.field_N) + 256;
        return super.advanceDialogAnimation((byte) 21);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if (param1 < 77) {
          return;
        }
        try {
          le.a(-1, (java.awt.Component) ((Object) param0));
          MusicPatchPcmStream.a((java.awt.Component) ((Object) param0), (byte) -80);
          if (null != AgeValidator.field_k) {
            AgeValidator.field_k.detach(55, (java.awt.Component) ((Object) param0));
          }
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "mh.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void installContent(UiWidget param0, int param1) {
        try {
          if (null != this.field_S) {
            this.field_S.unlink(2);
          }
          if (param1 != 6) {
            UiWidget var4 = (UiWidget) null;
            this.replaceContent(112, (UiWidget) null);
          }
          if (param0 != null) {
            param0.setBounds(param0.field_m, param1 + 74, param0.field_k, 6, this.field_Q + 6);
            this.field_S = new AlphaWidgetContainer(param0);
          } else {
            this.field_S = new AlphaWidgetContainer();
          }
          this.addChild(this.field_S, true);
          this.field_X = null;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "mh.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean snapDialogAnimation(byte param0) {
        this.finishResize((byte) -119);
        if (param0 != -33) {
          this.field_T = -104;
          return super.snapDialogAnimation((byte) -33);
        }
        return super.snapDialogAnimation((byte) -33);
    }

    final void resizeCompleted(int param0) {
        if (ub.field_b == this.field_V) {
          return;
        }
        this.field_T = 0;
        if (param0 == -4993) {
          this.field_V = vb.field_g;
          this.installContent(this.field_X, param0 + 4999);
          this.field_S.field_E = 0;
          this.field_X = null;
          return;
        }
        ContentTransitionDialog.resetStaticState(-111);
        this.field_V = vb.field_g;
        this.installContent(this.field_X, param0 + 4999);
        this.field_S.field_E = 0;
        this.field_X = null;
    }

    static {
        field_W = "Retry";
        field_Z = -1;
        field_R = new lj();
    }
}
