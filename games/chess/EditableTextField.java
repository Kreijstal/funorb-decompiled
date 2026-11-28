/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends InteractiveWidget {
    private boolean field_S;
    private int field_T;
    static ci field_P;
    static int field_M;
    static BitPacketBuffer field_U;
    private int field_Q;
    private int field_X;
    private int field_N;
    private boolean field_W;
    static String field_R;
    private long field_V;
    private long field_O;

    private final void deleteSelection(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_Q != this.field_X) {
          var2 = this.field_Q <= this.field_X ? this.field_Q : this.field_X;
          var3 = this.field_Q <= this.field_X ? this.field_X : this.field_Q;
          this.field_Q = var2;
          this.field_X = var2;
          this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
          this.notifyTextChanged((byte) 63);
        }
        if (param0 != 1) {
          this.pasteClipboardText((byte) -107);
        }
    }

    private final void submitText(boolean param0) {
        if (this.field_p instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_p)).onTextSubmitted(this, 3);
        }
        if (!param0) {
          this.moveCaret(-126, (byte) -127);
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_n instanceof TextWidgetRenderer)) {
            return false;
          }
          var8_int = ((TextWidgetRenderer) ((Object) this.field_n)).findTextOffsetAtScreenPosition(rf.field_b, param5, -4, param6, (mf) (this), BufferedSocket.field_k);
          if (-1 != var8_int) {
            stackIn_7_1 = var8_int;
          } else {
            stackIn_7_1 = 0;
          }
          this.moveCaret(stackIn_7_1, (byte) 80);
          var8_long = ud.correctedCurrentTimeMillis(2);
          stackIn_10_1 = !(var8_long - this.field_O >= 250L);
          this.field_S = stackIn_10_1;
          if (this.field_S) {
            this.field_X = this.findPreviousWordBoundary(param3 ^ 41);
            this.field_Q = this.findNextWordBoundary(param3 - 23899);
            if (this.field_Q > 0 &&
              32 == this.field_v.charAt(-1 + this.field_Q)) {
              this.field_Q = this.field_Q - 1;
            }
            this.field_N = this.field_Q;
          }
          this.field_O = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("qn.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void copySelection(byte param0) {
        int var3 = 71 % ((param0 - 31) / 51);
        String var2 = this.getSelectedText(false);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(false))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void setText(int param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          if (param0 != 0) {
            EditableTextField.a((byte) 44, 60, -34);
          }
          this.field_v = param2;
          var4_int = param2.length();
          if (this.field_T != -1 &&
            this.field_T < var4_int) {
            this.field_v = this.field_v.substring(0, this.field_T);
          }
          dupTemp$2 = this.field_v.length();
          this.field_X = dupTemp$2;
          this.field_Q = dupTemp$2;
          if (!param1) {
            this.notifyTextChanged((byte) 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qn.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final String getSelectedText(boolean param0) {
        int var2 = this.field_Q <= this.field_X ? this.field_Q : this.field_X;
        if (param0) {
          return (String) null;
        }
        int var3 = this.field_X < this.field_Q ? this.field_Q : this.field_X;
        return this.field_v.substring(var2, var3);
    }

    private final void pasteClipboardText(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            if (param0 != -18) {
              this.field_W = true;
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(1);
            this.insertTextAtCaret(var2, 99);
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

    private final int findPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        if (param0 <= 47) {
          this.field_V = -33L;
        }
        if (this.field_Q == 0) {
          return this.field_Q;
        }
        for (var2 = -1 + this.field_Q; var2 > 0; var2--) {
          if (this.field_v.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        TextWidgetRenderer var8 = null;
        long var6 = 0L;
        if (param2 > -80) {
          this.field_Q = -93;
        }
        if (null != this.field_n &&
          0 == param1) {
          this.field_n.a((byte) 124, param3, param0, this.field_H, (mf) (this));
          if (this.field_n instanceof TextWidgetRenderer) {
            var8 = (TextWidgetRenderer) ((Object) this.field_n);
            if (this.field_Q != this.field_X) {
              var8.paintSelection((mf) (this), param3, this.field_Q, param0, 122, this.field_X);
            }
            var6 = ud.correctedCurrentTimeMillis(2);
            if (500L > (-this.field_V + var6) % 1000L) {
              var8.paintCaret(param3, this.field_Q, param0, (byte) -125, (mf) (this));
            }
          }
        }
    }

    private final void insertTextAtCaret(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < 93) {
            this.notifyTextChanged((byte) 65);
          }
          if (this.field_T != -1) {
            var3_int = this.field_T - this.field_v.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_Q != this.field_v.length()) {
            this.field_v = this.field_v.substring(0, this.field_Q) + param0 + this.field_v.substring(this.field_Q, this.field_v.length());
          } else {
            this.field_v = this.field_v + param0;
          }
          this.field_Q = this.field_Q + param0.length();
          this.field_X = this.field_Q;
          this.notifyTextChanged((byte) 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("qn.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void moveCaret(int param0, byte param1) {
        this.field_Q = param0;
        if (param1 < 55) {
          this.field_W = false;
        }
        if (!ok.field_Jb[81]) {
          this.field_X = this.field_Q;
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_R = null;
        if (param0 != -14) {
          field_R = (String) null;
        }
        field_U = null;
        field_P = null;
    }

    EditableTextField(String param0, rg param1, int param2) {
        super(param0, param1);
        this.field_S = false;
        this.field_N = -1;
        this.field_O = 0L;
        try {
          this.field_n = FullscreenFocusCanvas.field_a.field_o;
          this.field_T = param2;
          this.setText(0, true, param0);
          this.field_W = true;
          this.field_V = ud.correctedCurrentTimeMillis(2);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          if (param0 != 107) {
            stackIn_3_0 = 104;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = id.field_c;
          while (var3_int < bd.field_e.length) {
            var5 = ec.field_l[var3_int];
            if (var5 < 0) {
              var4 = var4 + qd.field_r;
            } else {
              var6 = in.a(bd.field_e[var3_int], 71, true);
              var4 = var4 + mf.field_z;
              var7 = of.field_k - (var6 >> 1);
              if (ve.a(var4, var7 - FrameTimer.field_e, var6 + (FrameTimer.field_e << 1), param2, (fh.field_e << 1) + ug.field_a, 2, param1)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + ((fh.field_e << 1) - (-mf.field_z - ug.field_a));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) var3), "qn.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static double a(int param0, double param1) {
        if (param0 != -17513) {
          field_U = (BitPacketBuffer) null;
        }
        return li.field_e[65535 & (int)(param1 * 32768.0 / 3.141592653589793)];
    }

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Chess.field_G;
        if (param0 != -23811) {
          return 12;
        }
        var2 = this.field_v.length();
        if (this.field_Q == var2) {
          return this.field_Q;
        }
        for (var3 = 1 + this.field_Q; var2 > var3; var3++) {
          if (this.field_v.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void cutSelection(byte param0) {
        this.copySelection((byte) -98);
        this.deleteSelection(param0 ^ 78);
        if (param0 != 79) {
          this.pasteClipboardText((byte) 7);
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        int dupTemp$0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_V = ud.correctedCurrentTimeMillis(2);
          if (param0 == 60) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param2 != -1) {
            return true;
          }
          if (32 <= param0 &&
            param0 <= 126) {
            if (this.field_X != this.field_Q) {
              this.deleteSelection(1);
            }
            if (this.field_T == -1 ||
              !(this.field_v.length() >= this.field_T)) {
              if (this.field_Q < this.field_v.length()) {
                this.field_v = this.field_v.substring(0, this.field_Q) + param0 + this.field_v.substring(this.field_Q, this.field_v.length());
                this.field_Q = this.field_Q + 1;
                this.field_X = this.field_Q;
              } else {
                this.field_v = this.field_v + param0;
                dupTemp$0 = this.field_v.length();
                this.field_Q = dupTemp$0;
                this.field_X = dupTemp$0;
              }
              this.notifyTextChanged((byte) 63);
            }
            return true;
          }
          if (param1 == 85) {
            if (this.field_Q != this.field_X) {
              this.deleteSelection(1);
              return true;
            }
            if (0 < this.field_Q) {
              this.field_X = this.field_Q - 1;
              this.deleteSelection(1);
              return true;
            }
          } else {
            if (param1 != 101) {
              if (param1 == 13) {
                this.clearText(-12881);
                return true;
              }
              if (param1 == 96) {
                if (this.field_Q > 0) {
                  if (!ok.field_Jb[82]) {
                    stackIn_57_1 = this.field_Q - 1;
                  } else {
                    stackIn_57_1 = this.findPreviousWordBoundary(param2 ^ -113);
                  }
                  this.moveCaret(stackIn_57_1, (byte) 56);
                  return true;
                }
              } else {
                if (param1 == 97) {
                  if (this.field_Q < this.field_v.length()) {
                    if (ok.field_Jb[82]) {
                      stackIn_51_1 = this.findNextWordBoundary(-23811);
                    } else {
                      stackIn_51_1 = this.field_Q + 1;
                    }
                    this.moveCaret(stackIn_51_1, (byte) 65);
                    return true;
                  }
                } else {
                  if (102 == param1) {
                    this.moveCaret(0, (byte) 114);
                    return true;
                  }
                  if (param1 == 103) {
                    this.moveCaret(this.field_v.length(), (byte) 99);
                    return true;
                  }
                  if (param1 == 84) {
                    this.submitText(true);
                    return true;
                  }
                  if (ok.field_Jb[82] &&
                    param1 == 65) {
                    this.cutSelection((byte) 79);
                    return true;
                  }
                  if (ok.field_Jb[82] &&
                    66 == param1) {
                    this.copySelection((byte) 122);
                    return true;
                  }
                  if (ok.field_Jb[82] &&
                    param1 == 67) {
                    this.pasteClipboardText((byte) -18);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_Q != this.field_X) {
                this.deleteSelection(1);
                return true;
              }
              if (this.field_Q < this.field_v.length()) {
                this.field_X = this.field_Q + 1;
                this.deleteSelection(param2 ^ -2);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("qn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    void notifyTextChanged(byte param0) {
        if (this.field_p instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_p)).onTextChanged(this, 10999);
        }
        if (param0 != 63) {
          EditableTextField.a((byte) 32, -122, 110);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Chess.field_G;
        if (param7 <= param6) {
          if (param6 >= param4) {
            if (param7 < param4) {
              lg.a(SoftwareRasterizer.field_d, false, param10, param7, param9, param1, param6, param15, param12, param11, param2, param8, param4, param5, param0, param13, param14);
            } else {
              lg.a(SoftwareRasterizer.field_d, false, param0, param4, param15, param1, param6, param9, param11, param12, param2, param14, param7, param5, param10, param13, param8);
            }
          } else {
            lg.a(SoftwareRasterizer.field_d, false, param10, param7, param9, param15, param4, param1, param2, param11, param12, param8, param6, param14, param13, param0, param5);
          }
        } else {
          if (param4 > param7) {
            lg.a(SoftwareRasterizer.field_d, false, param13, param6, param1, param15, param4, param9, param11, param2, param12, param5, param7, param14, param10, param0, param8);
          } else {
            if (param4 <= param6) {
              lg.a(SoftwareRasterizer.field_d, false, param0, param4, param15, param9, param7, param1, param2, param12, param11, param14, param6, param8, param13, param10, param5);
            } else {
              lg.a(SoftwareRasterizer.field_d, false, param13, param6, param1, param9, param7, param15, param12, param2, param11, param5, param4, param8, param0, param10, param14);
            }
          }
        }
        if (param3 != 0) {
          EditableTextField.a(95, 0.2911132497082521);
        }
    }

    private final void scrollCaretIntoView(boolean param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        TextWidgetRenderer var9;
        var8 = Chess.field_G;
        if (!this.field_W) {
          this.field_A = 0;
          this.field_k = 0;
          return;
        }
        if (!(this.field_n instanceof TextWidgetRenderer)) {
          return;
        }
        var9 = (TextWidgetRenderer) ((Object) this.field_n);
        var3 = var9.getTextLayout((mf) (this), -23159);
        var4 = var3.getMaxLineRightX((byte) -24);
        var5 = var9.getTextAreaWidth((mf) (this), 0);
        var6 = var9.getFontLineHeight((byte) 76) >> 1;
        if (var4 < -var6 + var5) {
          this.field_A = 0;
          this.field_k = 0;
        } else {
          if (!param0) {
            EditableTextField.releaseDeclaredStaticReferences(61);
          }
          var7 = this.field_A + var3.getXForTextOffset(-5940, this.field_Q);
          if (var7 <= -var6 + var5) {
            if (var6 > var7) {
              this.field_A = -var7 - (-var6 - this.field_A);
            }
          } else {
            this.field_A = this.field_A - var7 + (var5 - var6);
          }
          if (this.field_A > 0) {
            this.field_A = 0;
          } else {
            if (var6 - var5 > this.field_A) {
              this.field_A = -var5 + var6;
            }
          }
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        TextWidgetRenderer var5 = null;
        int var6 = 0;
        super.a(param0, -51, param2, param3);
        if (param1 >= -6) {
          return;
        }
        try {
          this.scrollCaretIntoView(true);
          if (1 == this.field_q) {
            if (this.field_n instanceof TextWidgetRenderer) {
              var5 = (TextWidgetRenderer) ((Object) this.field_n);
              var6 = var5.findTextOffsetAtScreenPosition(rf.field_b, param3, -4, param0, (mf) (this), BufferedSocket.field_k);
              if (var6 != -1) {
                if (this.field_S &&
                  this.field_N > var6 &&
                  this.field_X < var6) {
                  var6 = this.field_N;
                }
                this.field_Q = var6;
              }
            }
            this.field_V = ud.correctedCurrentTimeMillis(2);
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "qn.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void clearText(int param0) {
        this.field_X = 0;
        this.field_Q = 0;
        if (param0 != -12881) {
          this.pasteClipboardText((byte) 102);
        }
        this.field_v = "";
        this.notifyTextChanged((byte) 63);
    }

    static {
    }
}
