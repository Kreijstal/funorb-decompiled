/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextWidget extends TextButton {
    private boolean field_P;
    private int maximumLength;
    private long field_U;
    private int caretIndex;
    private boolean field_Q;
    private int field_V;
    static bd field_Z;
    private long field_W;
    private int selectionAnchor;
    static boolean field_T;
    static volatile int field_X;
    static String field_O;
    static CanvasRasterBuffer field_R;
    static BinaryBitmapFont field_Y;

    private final void pasteClipboard(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.l(121);
            if (!param0) {
              field_X = 86;
            }
            this.insertText(var2, 32240);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -5782) {
          field_O = (String) null;
        }
        var2 = this.field_q.length();
        if (var2 == this.caretIndex) {
          return this.caretIndex;
        }
        for (var3 = this.caretIndex + 1; var3 < var2; var3++) {
          if (32 != this.field_q.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    EditableTextWidget(String param0, UiListener param1, int param2) {
        super(param0, param1);
        this.field_U = 0L;
        this.field_V = -1;
        this.field_P = false;
        try {
          this.field_y = Checkbox.field_X.field_i;
          this.maximumLength = param2;
          this.setText(true, (byte) 87, param0);
          this.field_Q = true;
          this.field_W = hm.a(64);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void insertText(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.maximumLength != -1) {
            var3_int = this.maximumLength - this.field_q.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.caretIndex == this.field_q.length()) {
            this.field_q = this.field_q + param0;
          } else {
            this.field_q = this.field_q.substring(0, this.caretIndex) + param0 + this.field_q.substring(this.caretIndex, this.field_q.length());
          }
          this.caretIndex = this.caretIndex + param0.length();
          if (param1 != 32240) {
            field_R = (CanvasRasterBuffer) null;
          }
          this.selectionAnchor = this.caretIndex;
          this.n(param1 + 1392121585);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("c.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void r(int param0) {
        this.e(false);
        if (param0 != -1) {
          return;
        }
        this.l(126);
    }

    public static void o(int param0) {
        field_Z = null;
        field_Y = null;
        field_O = null;
        if (param0 != 12669) {
          return;
        }
        field_R = null;
    }

    final static void m(int param0) {
        int var1 = (ni.field_q - 640) / 2;
        if (param0 < 18) {
          field_Y = (BinaryBitmapFont) null;
        }
        int var2 = qh.field_c * qh.field_c;
        int var3 = var2 - oo.field_b * oo.field_b;
        GreenGrowTheRushesBackground.field_n.a(90, -210 + SoftwareRasterizer.field_d - 4, -(var3 * 199 / var2) + var1, 256, 199);
        MidiPcmStream.field_E.a(0, -120 + SoftwareRasterizer.field_d - 4, 438 * var3 / var2 + var1 + 202, 256, 438);
    }

    private final String a(byte param0) {
        if (param0 != 11) {
          this.field_V = -69;
        }
        int var2 = this.selectionAnchor >= this.caretIndex ? this.caretIndex : this.selectionAnchor;
        int var3 = this.caretIndex <= this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
        return this.field_q.substring(var2, var3);
    }

    private final void moveCaret(int param0, int param1) {
        this.caretIndex = param0;
        if (!EmailValidator.field_m[param1]) {
          this.selectionAnchor = this.caretIndex;
        }
    }

    final boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 3) {
            this.field_P = true;
          }
          this.field_W = hm.a(64);
          if (60 == param3) {
            return false;
          }
          if (param3 == 62) {
            return false;
          }
          if (param3 >= 32 &&
            param3 <= 126) {
            if (this.selectionAnchor != this.caretIndex) {
              this.l(-114);
            }
            if (this.maximumLength == -1 ||
              !(this.field_q.length() >= this.maximumLength)) {
              if (this.caretIndex < this.field_q.length()) {
                this.field_q = this.field_q.substring(0, this.caretIndex) + param3 + this.field_q.substring(this.caretIndex, this.field_q.length());
                this.caretIndex = this.caretIndex + 1;
                this.selectionAnchor = this.caretIndex;
              } else {
                this.field_q = this.field_q + param3;
                dupTemp$0 = this.field_q.length();
                this.caretIndex = dupTemp$0;
                this.selectionAnchor = dupTemp$0;
              }
              this.n(1392153825);
            }
            return true;
          }
          if (param0 == 85) {
            if (this.caretIndex != this.selectionAnchor) {
              this.l(-14);
              return true;
            }
            if (this.caretIndex > 0) {
              this.selectionAnchor = this.caretIndex - 1;
              this.l(-78);
              return true;
            }
          } else {
            if (param0 != 101) {
              if (param0 == 13) {
                this.p(127);
                return true;
              }
              if (param0 != 96) {
                if (97 == param0) {
                  if (this.caretIndex < this.field_q.length()) {
                    if (!EmailValidator.field_m[82]) {
                      stackIn_57_1 = 1 + this.caretIndex;
                    } else {
                      stackIn_57_1 = this.k(-5782);
                    }
                    this.moveCaret(stackIn_57_1, 81);
                    return true;
                  }
                } else {
                  if (param0 == 102) {
                    this.moveCaret(0, param1 + 78);
                    return true;
                  }
                  if (param0 == 103) {
                    this.moveCaret(this.field_q.length(), param1 + 78);
                    return true;
                  }
                  if (param0 == 84) {
                    this.d((byte) -126);
                    return true;
                  }
                  if (EmailValidator.field_m[82] &&
                    param0 == 65) {
                    this.r(-1);
                    return true;
                  }
                  if (EmailValidator.field_m[82] &&
                    param0 == 66) {
                    this.e(false);
                    return true;
                  }
                  if (EmailValidator.field_m[82] &&
                    67 == param0) {
                    this.pasteClipboard(true);
                    return true;
                  }
                }
              } else {
                if (0 < this.caretIndex) {
                  if (!EmailValidator.field_m[82]) {
                    stackIn_28_1 = this.caretIndex - 1;
                  } else {
                    stackIn_28_1 = this.previousWordBoundary(false);
                  }
                  this.moveCaret(stackIn_28_1, 81);
                  return true;
                }
              }
            } else {
              if (this.caretIndex != this.selectionAnchor) {
                this.l(param1 - 12);
                return true;
              }
              if (this.caretIndex < this.field_q.length()) {
                this.selectionAnchor = 1 + this.caretIndex;
                this.l(18);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("c.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(')').toString());
        }
    }

    void n(int param0) {
        if (this.field_n instanceof TextInputListener) {
          ((TextInputListener) (this.field_n)).a(-107, this);
        }
        if (param0 != 1392153825) {
          this.n(103);
        }
    }

    final void p(int param0) {
        this.caretIndex = 0;
        this.selectionAnchor = 0;
        int var2 = 19 % ((52 - param0) / 55);
        this.field_q = "";
        this.n(1392153825);
    }

    private final void q(int param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        WidgetTextLayout var9;
        var8 = Pixelate.field_H ? 1 : 0;
        if (!this.field_Q) {
          this.field_B = 0;
          this.field_x = 0;
          return;
        }
        if (!(this.field_y instanceof WidgetTextLayout)) {
          return;
        }
        var9 = (WidgetTextLayout) ((Object) this.field_y);
        var3 = var9.getTextLayout(-88, (UiComponent) (this));
        var4 = var3.a(0);
        var5 = var9.getAvailableTextHeight(true, (UiComponent) (this));
        var6 = var9.a(-3) >> 1;
        if (-var6 + var5 > var4) {
          this.field_B = 0;
          this.field_x = 0;
          return;
        }
        var7 = this.field_B + var3.b(true, this.caretIndex);
        if (var5 - var6 < var7) {
          this.field_B = -var6 + var5 + (-var7 + this.field_B);
        } else {
          if (var6 > var7) {
            this.field_B = -var7 + var6 + this.field_B;
          }
        }
        if (param0 >= -60) {
          return;
        }
        if (this.field_B <= 0) {
          if (var6 - var5 > this.field_B) {
            this.field_B = -var5 + var6;
          }
        } else {
          this.field_B = 0;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        WidgetTextLayout var6 = null;
        long var7 = 0L;
        int var5 = 118 % ((param3 - 70) / 49);
        if (null != this.field_y &&
          param1 == 0) {
          this.field_y.drawWidget((UiComponent) (this), (byte) -124, param0, param2, this.field_H);
          if (this.field_y instanceof WidgetTextLayout) {
            var6 = (WidgetTextLayout) ((Object) this.field_y);
            if (this.selectionAnchor != this.caretIndex) {
              var6.drawSelection(this.selectionAnchor, (UiComponent) (this), -1, this.caretIndex, param0, param2);
            }
            var7 = hm.a(64);
            if ((var7 - this.field_W) % 1000L < 500L) {
              var6.a(param2, param0, (byte) -91, (UiComponent) (this), this.caretIndex);
            }
          }
        }
    }

    private final void l(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.selectionAnchor != this.caretIndex) {
          var2 = this.caretIndex > this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
          var3 = this.caretIndex > this.selectionAnchor ? this.caretIndex : this.selectionAnchor;
          this.caretIndex = var2;
          this.selectionAnchor = var2;
          this.field_q = this.field_q.substring(0, var2) + this.field_q.substring(var3, this.field_q.length());
          this.n(1392153825);
        }
        var2Lifetime1 = 96 / ((param0 - 64) / 46);
    }

    private final void d(byte param0) {
        if (this.field_n instanceof TextInputListener) {
          ((TextInputListener) (this.field_n)).onTextChanged(this, 4);
        }
        int var2 = -72 / ((-78 - param0) / 32);
    }

    final boolean handlePointerPress(byte param0, UiComponent param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_y instanceof WidgetTextLayout)) {
            return false;
          }
          var8_int = ((WidgetTextLayout) ((Object) this.field_y)).a(param3, param5, 0, ProxyAuthenticationException.field_d, bg.field_k, (UiComponent) (this));
          if (var8_int == -1) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.moveCaret(stackIn_6_1, 81);
          var8_long = hm.a(64);
          stackIn_9_1 = !(-this.field_U + var8_long >= 250L);
          this.field_P = stackIn_9_1;
          if (this.field_P) {
            this.selectionAnchor = this.previousWordBoundary(false);
            this.caretIndex = this.k(-5782);
            if (this.caretIndex > 0 &&
              32 == this.field_q.charAt(-1 + this.caretIndex)) {
              this.caretIndex = this.caretIndex - 1;
            }
            this.field_V = this.caretIndex;
          }
          this.field_U = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("c.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          return;
        }
        String var2 = this.a((byte) 11);
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.a((byte) 11))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void setText(boolean param0, byte param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_q = param2;
          var4_int = param2.length();
          if (this.maximumLength != -1 &&
            this.maximumLength < var4_int) {
            this.field_q = this.field_q.substring(0, this.maximumLength);
          }
          dupTemp$1 = this.field_q.length();
          this.selectionAnchor = dupTemp$1;
          this.caretIndex = dupTemp$1;
          if (param1 != 87) {
            EditableTextWidget.o(97);
          }
          if (!param0) {
            this.n(1392153825);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        WidgetTextLayout var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.q(-117);
          if (this.field_k == 1) {
            if (this.field_y instanceof WidgetTextLayout) {
              var5 = (WidgetTextLayout) ((Object) this.field_y);
              var6 = var5.a(param1, param2, param0 ^ 40, ProxyAuthenticationException.field_d, bg.field_k, (UiComponent) (this));
              if (var6 != -1) {
                if (this.field_P &&
                  var6 < this.field_V &&
                  var6 > this.selectionAnchor) {
                  var6 = this.field_V;
                }
                this.caretIndex = var6;
              }
            }
            this.field_W = hm.a(64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("c.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int previousWordBoundary(boolean param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (this.caretIndex == 0) {
          return this.caretIndex;
        }
        for (var2 = -1 + this.caretIndex; var2 > 0; var2--) {
          if (this.field_q.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0) {
          this.maximumLength = -56;
        }
        return var2;
    }

    static {
        field_Z = new bd();
        field_O = "Your request to join has been declined.";
        field_X = 0;
    }
}
