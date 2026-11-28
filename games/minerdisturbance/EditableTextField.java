/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends InteractiveWidget {
    private int field_M;
    static String[] field_N;
    private int field_O;
    private int field_J;
    private int field_I;
    private boolean field_Q;
    private long field_K;
    private long field_P;
    static int field_L;
    private boolean field_R;

    private final void deleteSelection(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= 56) {
          return;
        }
        if (this.field_J != this.field_O) {
          var2 = this.field_J <= this.field_O ? this.field_J : this.field_O;
          var3 = this.field_O >= this.field_J ? this.field_O : this.field_J;
          this.field_O = var2;
          this.field_J = var2;
          this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
          this.notifyTextChanged(125);
        }
    }

    private final void scrollCaretIntoView(boolean param0) {
        int var8 = MinerDisturbance.field_ab;
        if (!this.field_Q) {
          this.field_o = 0;
          this.field_p = 0;
          return;
        }
        if (!(this.field_A instanceof TextWidgetRenderer)) {
          return;
        }
        TextWidgetRenderer var9 = (TextWidgetRenderer) ((Object) this.field_A);
        TextLayout var3 = var9.getTextLayout(0, (fe) (this));
        int var4 = var3.getMaxLineRightX(-1);
        int var5 = var9.getTextAreaWidth((fe) (this), param0);
        int var6 = var9.getFontLineHeight(123) >> 1;
        if (var4 < -var6 + var5) {
          this.field_p = 0;
          this.field_o = 0;
          return;
        }
        int var7 = this.field_p + var3.getXForTextOffset(this.field_J, (byte) -124);
        if (-var6 + var5 < var7) {
          this.field_p = this.field_p - var7 + (-var6 + var5);
        } else {
          if (var7 < var6) {
            this.field_p = this.field_p + var6 - var7;
          }
        }
        if (this.field_p > 0) {
          this.field_p = 0;
        } else {
          if (!(-var5 + var6 <= this.field_p)) {
            this.field_p = var6 - var5;
          }
        }
    }

    EditableTextField(String param0, rm param1, int param2) {
        super(param0, param1);
        this.field_I = -1;
        this.field_P = 0L;
        this.field_R = false;
        try {
          this.field_M = param2;
          this.field_A = AccountRequestState.field_c.field_a;
          this.setText(true, false, param0);
          this.field_Q = true;
          this.field_K = sf.correctedCurrentTimeMillis((byte) 109);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void insertTextAtCaret(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_M != -1) {
            var3_int = this.field_M - this.field_s.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_J != this.field_s.length()) {
            this.field_s = this.field_s.substring(0, this.field_J) + param0 + this.field_s.substring(this.field_J, this.field_s.length());
          } else {
            this.field_s = this.field_s + param0;
          }
          this.field_J = this.field_J + param0.length();
          this.field_O = this.field_J;
          this.notifyTextChanged(124);
          if (param1) {
            this.a((byte) 121, -109, -44, 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ui.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String getSelectedText(int param0) {
        if (param0 != -19659) {
          return (String) null;
        }
        int var2 = this.field_J > this.field_O ? this.field_O : this.field_J;
        int var3 = this.field_O >= this.field_J ? this.field_O : this.field_J;
        return this.field_s.substring(var2, var3);
    }

    private final void copySelection(byte param0) {
        String var2 = this.getSelectedText(-19659);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(-19659))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        int var3 = -106 % ((67 - param0) / 44);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
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
          if (!(this.field_A instanceof TextWidgetRenderer)) {
            return false;
          }
          var8_int = ((TextWidgetRenderer) ((Object) this.field_A)).findTextOffsetAtScreenPosition((fe) (this), param6, false, NodeHashTableIterator.field_e, nk.field_w, param1);
          stackIn_5_1 = 82;
          if (-1 != var8_int) {
            stackIn_6_2 = var8_int;
          } else {
            stackIn_6_2 = 0;
          }
          this.moveCaret(stackIn_5_1, stackIn_6_2);
          var8_long = sf.correctedCurrentTimeMillis((byte) 106);
          stackIn_9_1 = !(250L <= -this.field_P + var8_long);
          this.field_R = stackIn_9_1;
          if (this.field_R) {
            this.field_O = this.findPreviousWordBoundary(119);
            this.field_J = this.findNextWordBoundary(param2 - 127);
            if (0 < this.field_J &&
              this.field_s.charAt(-1 + this.field_J) == 32) {
              this.field_J = this.field_J - 1;
            }
            this.field_I = this.field_J;
          }
          this.field_P = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ui.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    private final void cutSelection(int param0) {
        if (param0 != -6277) {
          this.pasteClipboardText((byte) -38);
        }
        this.copySelection((byte) 6);
        this.deleteSelection((byte) 105);
    }

    private final void moveCaret(int param0, int param1) {
        this.field_J = param1;
        if (param0 != 82) {
          return;
        }
        if (!qd.field_O[81]) {
          this.field_O = this.field_J;
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_69_1 = 0;
        int stackIn_70_2 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_K = sf.correctedCurrentTimeMillis((byte) 111);
          if (param0 == 60) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_O != this.field_J) {
              this.deleteSelection((byte) 77);
            }
            if (this.field_M == -1 ||
              !(this.field_s.length() >= this.field_M)) {
              if (this.field_J < this.field_s.length()) {
                this.field_s = this.field_s.substring(0, this.field_J) + param0 + this.field_s.substring(this.field_J, this.field_s.length());
                this.field_J = this.field_J + 1;
                this.field_O = this.field_J;
              } else {
                this.field_s = this.field_s + param0;
                dupTemp$0 = this.field_s.length();
                this.field_J = dupTemp$0;
                this.field_O = dupTemp$0;
              }
              this.notifyTextChanged(124);
            }
            return true;
          }
          if (param3 != 85) {
            if (param3 != 101) {
              if (param3 == 13) {
                this.clearText((byte) 112);
                return true;
              }
              if (96 == param3) {
                if (this.field_J > 0) {
                  stackIn_69_1 = 82;
                  if (!qd.field_O[82]) {
                    stackIn_70_2 = this.field_J - 1;
                  } else {
                    stackIn_70_2 = this.findPreviousWordBoundary(param2 + 191);
                  }
                  this.moveCaret(stackIn_69_1, stackIn_70_2);
                  return true;
                }
              } else {
                if (param3 == 97) {
                  if (this.field_J < this.field_s.length()) {
                    stackIn_62_1 = 82;
                    if (qd.field_O[82]) {
                      stackIn_63_2 = this.findNextWordBoundary(param2 - 48);
                    } else {
                      stackIn_63_2 = 1 + this.field_J;
                    }
                    this.moveCaret(stackIn_62_1, stackIn_63_2);
                    return true;
                  }
                } else {
                  if (param3 == 102) {
                    this.moveCaret(82, 0);
                    return true;
                  }
                  if (param3 == 103) {
                    this.moveCaret(82, this.field_s.length());
                    return true;
                  }
                  if (param3 == 84) {
                    this.submitText((byte) 66);
                    return true;
                  }
                  if (qd.field_O[82] &&
                    param3 == 65) {
                    this.cutSelection(-6277);
                    return true;
                  }
                  if (qd.field_O[82] &&
                    param3 == 66) {
                    this.copySelection((byte) 122);
                    return true;
                  }
                  if (qd.field_O[82] &&
                    param3 == 67) {
                    this.pasteClipboardText((byte) 115);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_O != this.field_J) {
                this.deleteSelection((byte) 88);
                return true;
              }
              if (this.field_J < this.field_s.length()) {
                this.field_O = 1 + this.field_J;
                this.deleteSelection((byte) 102);
                return true;
              }
            }
          } else {
            if (this.field_J != this.field_O) {
              this.deleteSelection((byte) 65);
              return true;
            }
            if (this.field_J > 0) {
              this.field_O = this.field_J - 1;
              this.deleteSelection((byte) 92);
              return true;
            }
          }
          if (param2 != -79) {
            this.field_P = 57L;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("ui.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void clearText(byte param0) {
        if (param0 != 112) {
          return;
        }
        this.field_s = "";
        this.field_O = 0;
        this.field_J = 0;
        this.notifyTextChanged(param0 ^ 12);
    }

    private final int findPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = MinerDisturbance.field_ab;
        if (this.field_J == 0) {
          return this.field_J;
        }
        for (var2 = -1 + this.field_J; var2 > 0; var2--) {
          if (32 != this.field_s.charAt(-1 + var2)) {
            continue;
          }
          break;
        }
        if (param0 >= 36) {
          return var2;
        }
        return 38;
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != -1) {
          EditableTextField.clearDeclaredStaticReferences(68);
        }
        field_N = null;
    }

    final void setText(boolean param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          if (param1) {
            this.field_I = -97;
          }
          this.field_s = param2;
          var4_int = param2.length();
          if (-1 != this.field_M &&
            var4_int > this.field_M) {
            this.field_s = this.field_s.substring(0, this.field_M);
          }
          dupTemp$2 = this.field_s.length();
          this.field_O = dupTemp$2;
          this.field_J = dupTemp$2;
          if (!param0) {
            this.notifyTextChanged(124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ui.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void submitText(byte param0) {
        if (this.field_y instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_y)).onTextSubmitted(this, -7802);
        }
        if (param0 < 21) {
          this.field_O = 46;
        }
    }

    void notifyTextChanged(int param0) {
        if (param0 <= 123) {
          this.cutSelection(115);
        }
        if (this.field_y instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_y)).onTextChanged(this, 60);
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        TextWidgetRenderer var7 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, (byte) 75, param3);
          if (param2 < 49) {
            field_N = (String[]) null;
          }
          this.scrollCaretIntoView(false);
          if (this.field_w == 1) {
            if (this.field_A instanceof TextWidgetRenderer) {
              var7 = (TextWidgetRenderer) ((Object) this.field_A);
              var6 = var7.findTextOffsetAtScreenPosition((fe) (this), param1, false, NodeHashTableIterator.field_e, nk.field_w, param0);
              if (var6 != -1) {
                if (this.field_R && var6 < this.field_I &&
                  this.field_O < var6) {
                  var6 = this.field_I;
                }
                this.field_J = var6;
              }
            }
            this.field_K = sf.correctedCurrentTimeMillis((byte) -123);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "ui.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        TextWidgetRenderer var8 = null;
        long var6 = 0L;
        if (this.field_A != null &&
          param3 == 0) {
          this.field_A.a(param0 ^ 12092, param1, (fe) (this), param2, this.field_E);
          if (this.field_A instanceof TextWidgetRenderer) {
            var8 = (TextWidgetRenderer) ((Object) this.field_A);
            if (this.field_J != this.field_O) {
              var8.paintSelection(this.field_J, (fe) (this), param2, param1, this.field_O, false);
            }
            var6 = sf.correctedCurrentTimeMillis((byte) 107);
            if ((var6 - this.field_K) % 1000L < 500L) {
              var8.paintCaret(param0 + 13030, param1, this.field_J, param2, (fe) (this));
            }
          }
        }
        if (param0 != 4) {
          this.field_Q = false;
        }
    }

    private final void pasteClipboardText(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection((byte) 101);
            if (param0 < 62) {
              this.field_I = 10;
            }
            this.insertTextAtCaret(var2, false);
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

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        var2 = this.field_s.length();
        if (this.field_J == var2) {
          return this.field_J;
        }
        if (param0 != -127) {
          this.field_R = false;
        }
        for (var3 = this.field_J + 1; var3 < var2; var3++) {
          if (32 != this.field_s.charAt(-1 + var3)) {
            continue;
          }
          break;
        }
        return var3;
    }

    static {
        field_N = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
