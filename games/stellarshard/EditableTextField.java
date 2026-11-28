/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends ig {
    private boolean field_L;
    private int field_H;
    private long field_K;
    private int field_M;
    static ha field_N;
    private boolean field_G;
    private long field_J;
    private int field_F;
    private int field_I;

    final static BinaryBitmapFont a(String param0, String param1, ResourceArchive param2, int param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -105) {
            field_N = (ha) null;
          }
          var5_int = param2.getGroupIdByName(param0, (byte) -118);
          var6 = param2.getFileIdByName(var5_int, param1, (byte) -11);
          stackIn_3_0 = BufferedRandomAccessFile.a(var5_int, param4, param2, (byte) -39, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ae.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void insertTextAtCaret(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_M != -1) {
            var3_int = this.field_M - this.field_m.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_H == this.field_m.length()) {
            this.field_m = this.field_m + param0;
          } else {
            this.field_m = this.field_m.substring(0, this.field_H) + param0 + this.field_m.substring(this.field_H, this.field_m.length());
          }
          if (param1 != 97) {
            this.moveCaret(12, -91);
          }
          this.field_H = this.field_H + param0.length();
          this.field_I = this.field_H;
          this.notifyTextChanged(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ae.BB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void moveCaret(int param0, int param1) {
        this.field_H = param1;
        if (!si.field_jb[param0]) {
          this.field_I = this.field_H;
        }
    }

    final boolean a(UiWidget param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, (byte) 38, param6) &&
            this.field_u instanceof pj) {
            var8_int = ((pj) ((Object) this.field_u)).a(-109, (UiWidget) (this), param4, KeyHandler.field_a, param6, ni.field_e);
            stackIn_4_1 = 81;
            if (var8_int == -1) {
              stackIn_5_2 = 0;
            } else {
              stackIn_5_2 = var8_int;
            }
            this.moveCaret(stackIn_4_1, stackIn_5_2);
            var8_long = ih.correctedCurrentTimeMillis((byte) -98);
            stackIn_8_1 = !(250L <= -this.field_K + var8_long);
            this.field_L = stackIn_8_1;
            if (this.field_L) {
              this.field_I = this.findPreviousWordBoundary(-1);
              this.field_H = this.findNextWordBoundary(-4238);
              if (0 < this.field_H &&
                this.field_m.charAt(this.field_H - 1) == 32) {
                this.field_H = this.field_H - 1;
              }
              this.field_F = this.field_H;
            }
            this.field_K = var8_long;
            return true;
          }
          if (param5 > 24) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("ae.P(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void deleteSelection(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_I != this.field_H) {
          var2 = this.field_H > this.field_I ? this.field_I : this.field_H;
          var3 = this.field_H <= this.field_I ? this.field_I : this.field_H;
          this.field_I = var2;
          this.field_H = var2;
          this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
          this.notifyTextChanged(param0 + 0);
        }
        if (param0 != 0) {
          field_N = (ha) null;
        }
    }

    void notifyTextChanged(int param0) {
        if (param0 != 0) {
          return;
        }
        if (this.field_v instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_v)).onTextChanged(this, param0 + 0);
        }
    }

    private final void cutSelection(byte param0) {
        int discarded$0 = 0;
        this.copySelection(0);
        this.deleteSelection(0);
        if (param0 != -20) {
          discarded$0 = this.findPreviousWordBoundary(120);
        }
    }

    private final void submitText(int param0) {
        if (param0 != -1) {
          this.field_H = 78;
        }
        if (this.field_v instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_v)).onTextSubmitted(this, 0);
        }
    }

    final void clearText(boolean param0) {
        this.field_H = 0;
        if (!param0) {
          this.deleteSelection(68);
        }
        this.field_m = "";
        this.field_I = 0;
        this.notifyTextChanged(0);
    }

    private final void scrollCaretIntoView(int param0) {
        int var8 = stellarshard.field_B;
        if (!this.field_G) {
          this.field_l = 0;
          this.field_n = 0;
          return;
        }
        if (!(this.field_u instanceof pj)) {
          return;
        }
        if (param0 != -9104) {
          return;
        }
        pj var9 = (pj) ((Object) this.field_u);
        vk var3 = var9.b((UiWidget) (this), (byte) 107);
        int var4 = var3.a(false);
        int var5 = var9.a(-27246, (UiWidget) (this));
        int var6 = var9.a((byte) -73) >> 1;
        if (var5 - var6 > var4) {
          this.field_l = 0;
          this.field_n = 0;
          return;
        }
        int var7 = this.field_l + var3.b(this.field_H, 49);
        if (var7 > var5 - var6) {
          this.field_l = this.field_l - var6 - (-var5 + var7);
        } else {
          if (var6 > var7) {
            this.field_l = this.field_l - var7 + var6;
          }
        }
        if (this.field_l > 0) {
          this.field_l = 0;
        } else {
          if (!(this.field_l >= var6 - var5)) {
            this.field_l = var6 - var5;
          }
        }
    }

    void a(int param0, boolean param1, int param2, UiWidget param3) {
        pj var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.scrollCaretIntoView(-9104);
          if (this.field_o == 1) {
            if (this.field_u instanceof pj) {
              var5 = (pj) ((Object) this.field_u);
              var6 = var5.a(73, (UiWidget) (this), param2, KeyHandler.field_a, param0, ni.field_e);
              if (-1 != var6) {
                if (this.field_L &&
                  var6 < this.field_F &&
                  var6 > this.field_I) {
                  var6 = this.field_F;
                }
                this.field_H = var6;
              }
            }
            this.field_J = ih.correctedCurrentTimeMillis((byte) -98);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ae.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_N = null;
        if (param0 < 110) {
          ResourceArchive var2 = (ResourceArchive) null;
          EditableTextField.a(-3, (ResourceArchive) null);
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ha var8 = null;
        int var9 = 0;
        ha var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = stellarshard.field_B;
        try {
          var8 = new ha(param1.getFileByName("logo.fo3d", "", (byte) -12));
          var10 = var8;
          var3 = var10.readUnsignedByte(4);
          var10.j(8);
          e.field_d = uh.a(var10, -1);
          sj.field_B = new n[var3];
          bi.field_s = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            sj.field_B[var4] = ResourceArchive.decodeLogoMesh(16, var8);
          }
          var10.g((byte) 95);
          var9 = 0;
          var4Lifetime1 = var9;
          if (param0 <= 4) {
            return;
          }
          while (var9 < var3) {
            var5 = sj.field_B[var9];
            var5.a(-12966, 6, 1, 6, 6);
            var5.b((byte) -53);
            var6 = new int[]{var5.field_F + var5.field_t >> 1, var5.field_x + var5.field_G >> 1, var5.field_u + var5.field_k >> 1};
            bi.field_s[var9] = var6;
            var5.a((byte) 108, -var6[1], -var6[2], -var6[0]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ae.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    EditableTextField(String param0, lf param1, int param2) {
        super(param0, param1);
        this.field_L = false;
        this.field_K = 0L;
        this.field_F = -1;
        try {
          this.field_M = param2;
          this.field_u = n.field_i.field_d;
          this.setText((byte) 20, param0, true);
          this.field_G = true;
          this.field_J = ih.correctedCurrentTimeMillis((byte) -98);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ae.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void pasteClipboardText(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 >= -53) {
            this.submitText(-83);
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(0);
            this.insertTextAtCaret(var2, (byte) 97);
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

    final void a(int param0, byte param1, int param2, int param3) {
        pj var8 = null;
        long var6 = 0L;
        if (param1 != -57) {
          this.field_L = true;
        }
        if (null != this.field_u &&
          0 == param0) {
          this.field_u.a(this.field_E, param3, param2, (UiWidget) (this), 4549);
          if (this.field_u instanceof pj) {
            var8 = (pj) ((Object) this.field_u);
            if (this.field_H != this.field_I) {
              var8.a((UiWidget) (this), this.field_H, param2, 0, param3, this.field_I);
            }
            var6 = ih.correctedCurrentTimeMillis((byte) -98);
            if (500L > (var6 - this.field_J) % 1000L) {
              var8.a(this.field_H, false, param2, (UiWidget) (this), param3);
            }
          }
        }
    }

    final void setText(byte param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_m = param1;
          var4_int = param1.length();
          if (-1 != this.field_M &&
            var4_int > this.field_M) {
            this.field_m = this.field_m.substring(0, this.field_M);
          }
          dupTemp$1 = this.field_m.length();
          this.field_I = dupTemp$1;
          this.field_H = dupTemp$1;
          if (param0 != 20) {
            this.field_G = false;
          }
          if (!param2) {
            this.notifyTextChanged(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ae.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, UiWidget param3) {
        int discarded$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_61_1 = 0;
        int stackIn_62_2 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 29657) {
            discarded$0 = this.findPreviousWordBoundary(-114);
          }
          this.field_J = ih.correctedCurrentTimeMillis((byte) -98);
          if (param2 != 60 &&
            param2 != 62) {
            if (param2 >= 32 &&
              126 >= param2) {
              if (this.field_H != this.field_I) {
                this.deleteSelection(0);
              }
              if (this.field_M == -1 ||
                !(this.field_m.length() >= this.field_M)) {
                if (this.field_H < this.field_m.length()) {
                  this.field_m = this.field_m.substring(0, this.field_H) + param2 + this.field_m.substring(this.field_H, this.field_m.length());
                  this.field_H = this.field_H + 1;
                  this.field_I = this.field_H;
                } else {
                  this.field_m = this.field_m + param2;
                  dupTemp$1 = this.field_m.length();
                  this.field_H = dupTemp$1;
                  this.field_I = dupTemp$1;
                }
                this.notifyTextChanged(0);
              }
              return true;
            }
            if (param1 != 85) {
              if (param1 == 101) {
                if (this.field_H != this.field_I) {
                  this.deleteSelection(0);
                  return true;
                }
                if (this.field_H >= this.field_m.length()) {
                  return false;
                }
                this.field_I = this.field_H + 1;
                this.deleteSelection(0);
                return true;
              }
              if (param1 == 13) {
                this.clearText(true);
                return true;
              }
              if (param1 == 96) {
                if (this.field_H > 0) {
                  stackIn_61_1 = 81;
                  if (!si.field_jb[82]) {
                    stackIn_62_2 = -1 + this.field_H;
                  } else {
                    stackIn_62_2 = this.findPreviousWordBoundary(-1);
                  }
                  this.moveCaret(stackIn_61_1, stackIn_62_2);
                  return true;
                }
              } else {
                if (param1 != 97) {
                  if (102 == param1) {
                    this.moveCaret(81, 0);
                    return true;
                  }
                  if (param1 == 103) {
                    this.moveCaret(81, this.field_m.length());
                    return true;
                  }
                  if (param1 == 84) {
                    this.submitText(-1);
                    return true;
                  }
                  if (si.field_jb[82] &&
                    param1 == 65) {
                    this.cutSelection((byte) -20);
                    return true;
                  }
                  if (si.field_jb[82] &&
                    param1 == 66) {
                    this.copySelection(0);
                    return true;
                  }
                  if (si.field_jb[82] &&
                    67 == param1) {
                    this.pasteClipboardText(-78);
                    return true;
                  }
                } else {
                  if (this.field_H < this.field_m.length()) {
                    stackIn_31_1 = param0 - 29576;
                    if (si.field_jb[82]) {
                      stackIn_32_2 = this.findNextWordBoundary(param0 - 33895);
                    } else {
                      stackIn_32_2 = this.field_H + 1;
                    }
                    this.moveCaret(stackIn_31_1, stackIn_32_2);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_I != this.field_H) {
                this.deleteSelection(0);
                return true;
              }
              if (0 < this.field_H) {
                this.field_I = -1 + this.field_H;
                this.deleteSelection(0);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("ae.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        String var5;
        var4 = stellarshard.field_B;
        if (param0 != -4238) {
          var5 = (String) null;
          this.setText((byte) 68, (String) null, true);
        }
        var2 = this.field_m.length();
        if (this.field_H == var2) {
          return this.field_H;
        }
        for (var3 = 1 + this.field_H; var2 > var3; var3++) {
          if (this.field_m.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final int findPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = stellarshard.field_B;
        if (this.field_H == 0) {
          return this.field_H;
        }
        for (var2 = param0 + this.field_H; var2 > 0; var2--) {
          if (this.field_m.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void copySelection(int param0) {
        String var2 = this.getSelectedText(79);
        if (var2.length() > param0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(44))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String getSelectedText(int param0) {
        int var2 = this.field_H > this.field_I ? this.field_I : this.field_H;
        int var4 = 59 / ((-66 - param0) / 56);
        int var3 = this.field_H > this.field_I ? this.field_H : this.field_I;
        return this.field_m.substring(var2, var3);
    }

    static {
    }
}
