/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends InteractiveWidget {
    private int field_B;
    private boolean field_I;
    private int field_D;
    static Sprite field_H;
    private long field_E;
    private long field_F;
    private int field_A;
    private boolean field_G;
    private int field_C;
    static BufferedRandomAccessFile[] field_J;

    private final void submitText(boolean param0) {
        UiWidget var3 = null;
        UiWidget var3Lifetime1;
        if (this.field_g instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_g)).onTextSubmitted(false, this);
          if (param0) {
            var3 = (UiWidget) null;
            this.a((UiWidget) null, 'z', (byte) -18, -33);
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        var3Lifetime1 = (UiWidget) null;
        this.a((UiWidget) null, 'z', (byte) -18, -33);
    }

    private final void cutSelection(boolean param0) {
        if (!param0) {
          this.copySelection(true);
          this.deleteSelection((byte) -113);
          return;
        }
        this.field_C = 3;
        this.copySelection(true);
        this.deleteSelection((byte) -113);
    }

    private final void scrollCaretIntoView(int param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        TextWidgetRenderer var9;
        var8 = StarCannon.field_A;
        if (!this.field_I) {
          this.field_n = 0;
          this.field_q = 0;
          return;
        }
        if (!(this.field_o instanceof TextWidgetRenderer)) {
          return;
        }
        var9 = (TextWidgetRenderer) ((Object) this.field_o);
        var3 = var9.getTextLayout((UiWidget) (this), (byte) -106);
        var4 = var3.getMaxLineRightX(param0 + 101);
        var5 = var9.getTextAreaWidth(91, (UiWidget) (this));
        var6 = var9.getFontLineHeight(param0 + param0) >> 1;
        if (var5 - var6 > var4) {
          this.field_n = 0;
          this.field_q = 0;
          return;
        }
        var7 = this.field_n + var3.getXForTextOffset((byte) -30, this.field_B);
        if (var7 > -var6 + var5) {
          this.field_n = this.field_n - var7 - (var6 - var5);
        } else {
          if (var7 < var6) {
            this.field_n = -var7 + (var6 + this.field_n);
          }
        }
        if (this.field_n > 0) {
          this.field_n = 0;
          return;
        }
        if (var6 - var5 <= this.field_n) {
          return;
        }
        this.field_n = var6 - var5;
        return;
    }

    private final int findPreviousWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = StarCannon.field_A;
        if (this.field_B == 0) {
          return this.field_B;
        }
        var2 = -1 + this.field_B;
        while (true) {
          if (0 >= var2) {
            var3 = -16 / ((54 - param0) / 61);
            return var2;
          }
          if (32 != this.field_k.charAt(var2 - 1)) {
            var2--;
            continue;
          }
          break;
        }
        var3Lifetime1 = -16 / ((54 - param0) / 61);
        return var2;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6;
        UiWidget var8;
        TextWidgetRenderer var9;
        TextWidgetRenderer var11;
        TextWidgetRenderer var12;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        if (param2 == 49) {
          if (null == this.field_o) {
            return;
          }
          if (0 != param0) {
            return;
          }
          this.field_o.a(param1, this.field_u, param2 ^ -102, param3, (UiWidget) (this));
          if (!(this.field_o instanceof TextWidgetRenderer)) {
            return;
          }
          var12 = (TextWidgetRenderer) ((Object) this.field_o);
          if (this.field_B == this.field_D) {
            var6 = dd.correctedCurrentTimeMillis(74);
            if (500L <= (-this.field_F + var6) % 1000L) {
              return;
            }
            var12.paintCaret(-3, (UiWidget) (this), param1, param3, this.field_B);
            return;
          }
          var12.paintSelection(param3, param1, this.field_B, (UiWidget) (this), (byte) 104, this.field_D);
          var6Lifetime3 = dd.correctedCurrentTimeMillis(74);
          if (500L > (-this.field_F + var6Lifetime3) % 1000L) {
            var12.paintCaret(-3, (UiWidget) (this), param1, param3, this.field_B);
          }
          return;
        }
        var8 = (UiWidget) null;
        this.a((UiWidget) null, '￑', (byte) 109, -100);
        if (null == this.field_o) {
          return;
        }
        if (0 != param0) {
          return;
        }
        this.field_o.a(param1, this.field_u, param2 ^ -102, param3, (UiWidget) (this));
        if (!(this.field_o instanceof TextWidgetRenderer)) {
          return;
        }
        var11 = (TextWidgetRenderer) ((Object) this.field_o);
        var9 = var11;
        if (this.field_B == this.field_D) {
          var6Lifetime1 = dd.correctedCurrentTimeMillis(74);
          if (500L <= (-this.field_F + var6Lifetime1) % 1000L) {
            return;
          }
          var11.paintCaret(-3, (UiWidget) (this), param1, param3, this.field_B);
          return;
        }
        var11.paintSelection(param3, param1, this.field_B, (UiWidget) (this), (byte) 104, this.field_D);
        var6Lifetime2 = dd.correctedCurrentTimeMillis(74);
        if (500L > (-this.field_F + var6Lifetime2) % 1000L) {
          var11.paintCaret(-3, (UiWidget) (this), param1, param3, this.field_B);
        }
        return;
    }

    final boolean a(UiWidget param0, char param1, byte param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_F = dd.correctedCurrentTimeMillis(param2 ^ -2);
          if (param2 != -90) {
            this.notifyTextChanged(true);
          }
          if (param1 == 60) {
            return false;
          }
          if (param1 == 62) {
            return false;
          }
          if (param1 >= 32 &&
            param1 <= 126) {
            if (this.field_B != this.field_D) {
              this.deleteSelection((byte) -106);
            }
            if (this.field_A == -1 ||
              !(this.field_k.length() >= this.field_A)) {
              if (this.field_B >= this.field_k.length()) {
                this.field_k = this.field_k + param1;
                dupTemp$0 = this.field_k.length();
                this.field_B = dupTemp$0;
                this.field_D = dupTemp$0;
              } else {
                this.field_k = this.field_k.substring(0, this.field_B) + param1 + this.field_k.substring(this.field_B, this.field_k.length());
                this.field_B = this.field_B + 1;
                this.field_D = this.field_B;
              }
              this.notifyTextChanged(true);
            }
            return true;
          }
          if (param3 != 85) {
            if (101 == param3) {
              if (this.field_D != this.field_B) {
                this.deleteSelection((byte) -97);
                return true;
              }
              if (this.field_B < this.field_k.length()) {
                this.field_D = 1 + this.field_B;
                this.deleteSelection((byte) -109);
                return true;
              }
            } else {
              if (param3 == 13) {
                this.clearText(19293);
                return true;
              }
              if (param3 == 96) {
                if (0 < this.field_B) {
                  if (!wc.field_c[82]) {
                    stackIn_53_1 = -1 + this.field_B;
                  } else {
                    stackIn_53_1 = this.findPreviousWordBoundary((byte) 122);
                  }
                  this.moveCaret(stackIn_53_1, 101);
                  return true;
                }
              } else {
                if (param3 != 97) {
                  if (param3 == 102) {
                    this.moveCaret(0, 101);
                    return true;
                  }
                  if (param3 == 103) {
                    this.moveCaret(this.field_k.length(), param2 + 191);
                    return true;
                  }
                  if (param3 == 84) {
                    this.submitText(false);
                    return true;
                  }
                  if (wc.field_c[82] &&
                    param3 == 65) {
                    this.cutSelection(false);
                    return true;
                  }
                  if (wc.field_c[82] &&
                    param3 == 66) {
                    this.copySelection(true);
                    return true;
                  }
                  if (wc.field_c[82] &&
                    param3 == 67) {
                    this.pasteClipboardText(param2 + 89);
                    return true;
                  }
                } else {
                  if (this.field_B < this.field_k.length()) {
                    if (!wc.field_c[82]) {
                      stackIn_25_1 = this.field_B + 1;
                    } else {
                      stackIn_25_1 = this.findNextWordBoundary(param2 ^ 89);
                    }
                    this.moveCaret(stackIn_25_1, 101);
                    return true;
                  }
                }
              }
            }
          } else {
            if (this.field_D != this.field_B) {
              this.deleteSelection((byte) -94);
              return true;
            }
            if (this.field_B > 0) {
              this.field_D = this.field_B - 1;
              this.deleteSelection((byte) -123);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_78_0 = var5;
          stackIn_78_1 = new StringBuilder().append("fe.EA(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void notifyTextChanged(boolean param0) {
        if (this.field_g instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_g)).onTextChanged(-4312, this);
        }
        if (param0) {
          return;
        }
        field_H = (Sprite) null;
    }

    private final void deleteSelection(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 < -73) {
          if (this.field_D != this.field_B) {
            var2 = this.field_B > this.field_D ? this.field_D : this.field_B;
            var3 = this.field_B <= this.field_D ? this.field_D : this.field_B;
            this.field_D = var2;
            this.field_B = var2;
            this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
            this.notifyTextChanged(true);
          }
          return;
        }
        this.a(-88, 64, (byte) -102, 68);
        if (this.field_D != this.field_B) {
          var2Lifetime1 = this.field_B > this.field_D ? this.field_D : this.field_B;
          var3Lifetime1 = this.field_B <= this.field_D ? this.field_D : this.field_B;
          this.field_D = var2Lifetime1;
          this.field_B = var2Lifetime1;
          this.field_k = this.field_k.substring(0, var2Lifetime1) + this.field_k.substring(var3Lifetime1, this.field_k.length());
          this.notifyTextChanged(true);
        }
    }

    final static void a(IntrusiveNode param0, IntrusiveNode param1, boolean param2) {
        try {
          if (param1.previous != null) {
            param1.unlink(4);
          }
          param1.previous = param0.previous;
          param1.next = param0;
          if (param2) {
            field_J = (BufferedRandomAccessFile[]) null;
          }
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "fe.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = StarCannon.field_A;
        var2 = this.field_k.length();
        if (var2 == this.field_B) {
          return this.field_B;
        }
        for (var3 = this.field_B - param0; var2 > var3; var3++) {
          if (this.field_k.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    private final void copySelection(boolean param0) {
        try {
          String var2 = null;
          String var2Lifetime1;
          if (param0) {
            var2 = this.getSelectedText(-107);
            if (!(0 >= var2.length())) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(-110))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
          this.submitText(false);
          var2Lifetime1 = this.getSelectedText(-107);
          if (!(0 >= var2Lifetime1.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(-110))), (java.awt.datatransfer.ClipboardOwner) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    EditableTextField(String param0, qg param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_E = 0L;
        this.field_C = -1;
        try {
          this.field_A = param2;
          this.field_o = eh.field_j.field_c;
          this.setText((byte) -91, true, param0);
          this.field_I = true;
          this.field_F = dd.correctedCurrentTimeMillis(84);
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void clearText(int param0) {
        this.field_B = 0;
        if (param0 != 19293) {
          return;
        }
        this.field_D = 0;
        this.field_k = "";
        this.notifyTextChanged(true);
    }

    private final String getSelectedText(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= -102) {
          var2 = this.field_B <= this.field_D ? this.field_B : this.field_D;
          var3 = this.field_D >= this.field_B ? this.field_D : this.field_B;
          return this.field_k.substring(var2, var3);
        }
        return (String) null;
    }

    private final void moveCaret(int param0, int param1) {
        this.field_B = param0;
        if (!wc.field_c[81]) {
          this.field_D = this.field_B;
        }
        if (param1 == 101) {
          return;
        }
        this.field_C = -124;
    }

    private final void pasteClipboardText(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection((byte) -106);
            if (param0 != -1) {
              return;
            }
            this.insertTextAtCaret(var2, 4);
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

    private final void insertTextAtCaret(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          if (this.field_A != -1) {
            var3_int = this.field_A - this.field_k.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          var3_intLifetime1 = 67 % ((-58 - param1) / 50);
          if (this.field_B != this.field_k.length()) {
            this.field_k = this.field_k.substring(0, this.field_B) + param0 + this.field_k.substring(this.field_B, this.field_k.length());
          } else {
            this.field_k = this.field_k + param0;
          }
          this.field_B = this.field_B + param0.length();
          this.field_D = this.field_B;
          this.notifyTextChanged(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fe.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, UiWidget param2, int param3) {
        TextWidgetRenderer var7 = null;
        int var6 = 0;
        super.a(60, param1, param2, param3);
        this.scrollCaretIntoView(0);
        if (param0 < 27) {
          return;
        }
        try {
          if (this.field_l == 1) {
            if (this.field_o instanceof TextWidgetRenderer) {
              var7 = (TextWidgetRenderer) ((Object) this.field_o);
              var6 = var7.findTextOffsetAtScreenPosition(pe.field_d, la.field_c, (UiWidget) (this), param1, param3, true);
              if (var6 != -1) {
                if (this.field_G && var6 < this.field_C &&
                  this.field_D < var6) {
                  var6 = this.field_C;
                }
                this.field_B = var6;
              }
            }
            this.field_F = dd.correctedCurrentTimeMillis(122);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "fe.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(UiWidget param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_o instanceof TextWidgetRenderer)) {
            return false;
          }
          var8_int = ((TextWidgetRenderer) ((Object) this.field_o)).findTextOffsetAtScreenPosition(pe.field_d, la.field_c, (UiWidget) (this), param2, param3, true);
          if (var8_int == -1) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = var8_int;
          }
          this.moveCaret(stackIn_7_1, 101);
          var8_long = dd.correctedCurrentTimeMillis(param4 + 137);
          stackIn_10_1 = !(var8_long - this.field_E >= 250L);
          this.field_G = stackIn_10_1;
          if (this.field_G) {
            this.field_D = this.findPreviousWordBoundary((byte) 124);
            this.field_B = this.findNextWordBoundary(-1);
            if (0 < this.field_B &&
              this.field_k.charAt(-1 + this.field_B) == 32) {
              this.field_B = this.field_B - 1;
            }
            this.field_C = this.field_B;
          }
          this.field_E = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("fe.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void setText(byte param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_k = param2;
          var4_int = param2.length();
          if (this.field_A != -1 &&
            this.field_A < var4_int) {
            this.field_k = this.field_k.substring(0, this.field_A);
          }
          if (param0 != -91) {
            var5 = (String) null;
            this.setText((byte) 3, true, (String) null);
          }
          dupTemp$1 = this.field_k.length();
          this.field_D = dupTemp$1;
          this.field_B = dupTemp$1;
          if (param1) {
            return;
          }
          this.notifyTextChanged(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("fe.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_H = null;
        if (param0 != 73) {
          field_H = (Sprite) null;
          field_J = null;
          return;
        }
        field_J = null;
    }

    static {
    }
}
