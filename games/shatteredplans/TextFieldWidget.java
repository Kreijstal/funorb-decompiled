/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextFieldWidget extends FocusableWidget {
    private int field_H;
    private int field_R;
    private int field_N;
    static os field_E;
    static String field_K;
    static boolean field_D;
    static String field_G;
    private long field_F;
    static AnimatedPanel field_I;
    static Sprite field_L;
    private boolean field_P;
    private int field_O;
    private long field_Q;
    private boolean field_M;

    private final void deleteSelection(byte param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_H != this.field_N) {
          var2 = this.field_N < this.field_H ? this.field_N : this.field_H;
          var3 = this.field_H > this.field_N ? this.field_H : this.field_N;
          this.field_N = var2;
          this.field_H = var2;
          this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
          this.notifyTextChanged(5018);
        }
        var2Lifetime1 = 75 % ((-61 - param0) / 54);
    }

    private final void cutSelection(byte param0) {
        if (param0 <= -33) {
          this.copyToClipboard(-1);
          this.deleteSelection((byte) 120);
          return;
        }
        field_E = (os) null;
        this.copyToClipboard(-1);
        this.deleteSelection((byte) 120);
    }

    private final void insertText(byte param0, String param1) {
        int var3_int = 0;
        if (this.field_O != -1) {
          var3_int = this.field_O - this.field_s.length();
          if (0 <= var3_int) {
            return;
          }
          param1 = param1.substring(0, var3_int);
        }
        if (this.field_H != this.field_s.length()) {
          this.field_s = this.field_s.substring(0, this.field_H) + param1 + this.field_s.substring(this.field_H, this.field_s.length());
        } else {
          this.field_s = this.field_s + param1;
        }
        this.field_H = this.field_H + param1.length();
        if (param0 > -88) {
          return;
        }
        try {
          this.field_N = this.field_H;
          this.notifyTextChanged(5018);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "go.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void clear(boolean param0) {
        if (!param0) {
          return;
        }
        this.field_N = 0;
        this.field_H = 0;
        this.field_s = "";
        this.notifyTextChanged(5018);
    }

    final boolean handlePress(int param0, int param1, byte param2, int param3, int param4, int param5, UiWidget param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.handlePress(param0, param1, (byte) 100, param3, param4, param5, param6) &&
            this.field_p instanceof WidgetMetrics) {
            var8_int = ((WidgetMetrics) ((Object) this.field_p)).getCharacterIndexAt(param4, pd.field_k, param5, (UiWidget) (this), true, bb.field_b);
            stackIn_5_1 = 119;
            if (var8_int == -1) {
              stackIn_6_2 = 0;
            } else {
              stackIn_6_2 = var8_int;
            }
            this.moveCaret(stackIn_5_1, stackIn_6_2);
            var8_long = pr.currentTimeMillis(14274);
            stackIn_9_1 = !(-this.field_F + var8_long >= 250L);
            this.field_P = stackIn_9_1;
            if (this.field_P) {
              this.field_N = this.findPreviousWordBoundary((byte) 96);
              this.field_H = this.findNextWordBoundary(-1);
              if (this.field_H > 0 &&
                this.field_s.charAt(-1 + this.field_H) == 32) {
                this.field_H = this.field_H - 1;
              }
              this.field_R = this.field_H;
            }
            this.field_F = var8_long;
            return true;
          }
          if (param2 > 95) {
            return false;
          }
          field_L = (Sprite) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("go.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        WidgetMetrics var9;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_M) {
          this.field_l = 0;
          this.field_h = 0;
          return;
        }
        if (!(this.field_p instanceof WidgetMetrics)) {
          return;
        }
        var9 = (WidgetMetrics) ((Object) this.field_p);
        var3 = var9.getTextLayout((UiWidget) (this), true);
        var4 = var3.getMaxLineWidth(126);
        if (param0 != -59) {
          return;
        }
        var5 = var9.getInnerWidth(120, (UiWidget) (this));
        var6 = var9.getLineHeight(false) >> 1;
        if (var4 < -var6 + var5) {
          this.field_l = 0;
          this.field_h = 0;
          return;
        }
        var7 = this.field_h + var3.a(true, this.field_H);
        if (-var6 + var5 < var7) {
          this.field_h = this.field_h - var6 + (var5 - var7);
        } else {
          if (var6 > var7) {
            this.field_h = -var7 + var6 + this.field_h;
          }
        }
        if (this.field_h > 0) {
          this.field_h = 0;
          return;
        }
        if (this.field_h >= -var5 + var6) {
          return;
        }
        this.field_h = -var5 + var6;
        return;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (param1 != -11857) {
          return;
        }
        if (this.field_p == null) {
          return;
        }
        if (param0 != 0) {
          return;
        }
        this.field_p.a((UiWidget) (this), param3, this.field_y, param2, (byte) 12);
        if (!(this.field_p instanceof WidgetMetrics)) {
          return;
        }
        WidgetMetrics var5 = (WidgetMetrics) ((Object) this.field_p);
        if (this.field_H != this.field_N) {
          var5.drawSelection(this.field_N, param2, param3, this.field_H, 0, (UiWidget) (this));
        }
        long var6 = pr.currentTimeMillis(param1 + 26131);
        if ((var6 - this.field_Q) % 1000L < 500L) {
          var5.drawCaret(this.field_H, param3, -127, param2, (UiWidget) (this));
          return;
        }
    }

    private final void moveCaret(int param0, int param1) {
        if (param0 < 64) {
          return;
        }
        this.field_H = param1;
        if (di.field_p[81]) {
          return;
        }
        this.field_N = this.field_H;
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        int dupTemp$0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_2 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 != 13) {
            this.field_F = -52L;
          }
          this.field_Q = pr.currentTimeMillis(param2 ^ 14287);
          if (param1 != 60 &&
            62 != param1) {
            if (param1 >= 32 &&
              param1 <= 126) {
              if (this.field_H != this.field_N) {
                this.deleteSelection((byte) -116);
              }
              if (this.field_O == -1 ||
                !(this.field_s.length() >= this.field_O)) {
                if (this.field_H < this.field_s.length()) {
                  this.field_s = this.field_s.substring(0, this.field_H) + param1 + this.field_s.substring(this.field_H, this.field_s.length());
                  this.field_H = this.field_H + 1;
                  this.field_N = this.field_H;
                } else {
                  this.field_s = this.field_s + param1;
                  dupTemp$0 = this.field_s.length();
                  this.field_H = dupTemp$0;
                  this.field_N = dupTemp$0;
                }
                this.notifyTextChanged(5018);
              }
              return true;
            }
            if (85 == param0) {
              if (this.field_N != this.field_H) {
                this.deleteSelection((byte) 22);
                return true;
              }
              if (this.field_H <= 0) {
                return false;
              }
              this.field_N = -1 + this.field_H;
              this.deleteSelection((byte) -120);
              return true;
            }
            if (param0 == 101) {
              if (this.field_N != this.field_H) {
                this.deleteSelection((byte) -117);
                return true;
              }
              if (this.field_H < this.field_s.length()) {
                this.field_N = 1 + this.field_H;
                this.deleteSelection((byte) -117);
                return true;
              }
            } else {
              if (13 == param0) {
                this.clear(true);
                return true;
              }
              if (param0 == 96) {
                if (this.field_H > 0) {
                  stackIn_56_1 = 127;
                  if (di.field_p[82]) {
                    stackIn_57_2 = this.findPreviousWordBoundary((byte) 88);
                  } else {
                    stackIn_57_2 = -1 + this.field_H;
                  }
                  this.moveCaret(stackIn_56_1, stackIn_57_2);
                  return true;
                }
              } else {
                if (param0 == 97) {
                  if (this.field_H < this.field_s.length()) {
                    stackIn_49_1 = 88;
                    if (!di.field_p[82]) {
                      stackIn_50_2 = 1 + this.field_H;
                    } else {
                      stackIn_50_2 = this.findNextWordBoundary(-1);
                    }
                    this.moveCaret(stackIn_49_1, stackIn_50_2);
                    return true;
                  }
                } else {
                  if (102 == param0) {
                    this.moveCaret(97, 0);
                    return true;
                  }
                  if (param0 == 103) {
                    this.moveCaret(88, this.field_s.length());
                    return true;
                  }
                  if (param0 == 84) {
                    this.i((byte) 2);
                    return true;
                  }
                  if (di.field_p[82] &&
                    param0 == 65) {
                    this.cutSelection((byte) -95);
                    return true;
                  }
                  if (di.field_p[82] &&
                    param0 == 66) {
                    this.copyToClipboard(param2 - 14);
                    return true;
                  }
                  if (di.field_p[82] &&
                    67 == param0) {
                    this.pasteFromClipboard((byte) -7);
                    return true;
                  }
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("go.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
          return false;
        }
        return js.a(-83, GameScreen.getHostApplet((byte) 127));
    }

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_s.length();
        if (var2 == this.field_H) {
          return this.field_H;
        }
        var3 = 1 + this.field_H;
        while (true) {
          if (var2 <= var3) {
            if (param0 == -1) {
              return var3;
            }
            this.cutSelection((byte) 17);
            return var3;
          }
          if (this.field_s.charAt(-1 + var3) != 32) {
            var3++;
            continue;
          }
          break;
        }
        if (param0 == -1) {
          return var3;
        }
        this.cutSelection((byte) 17);
        return var3;
    }

    TextFieldWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.field_F = 0L;
        this.field_R = -1;
        this.field_P = false;
        try {
          this.field_p = MusicVoice.field_I.field_f;
          this.field_O = param2;
          this.setText(67, param0, true);
          this.field_M = true;
          this.field_Q = pr.currentTimeMillis(14274);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        WidgetMetrics var5 = null;
        int var6 = 0;
        try {
          super.updateHover(param0, param1, param2, param3);
          this.j((byte) -59);
          if (1 == this.field_o) {
            if (this.field_p instanceof WidgetMetrics) {
              var5 = (WidgetMetrics) ((Object) this.field_p);
              var6 = var5.getCharacterIndexAt(param0, pd.field_k, param1, (UiWidget) (this), true, bb.field_b);
              if (var6 != -1) {
                if (this.field_P &&
                  this.field_R > var6 &&
                  var6 > this.field_N) {
                  var6 = this.field_R;
                }
                this.field_H = var6;
              }
            }
            this.field_Q = pr.currentTimeMillis(14274);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "go.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    void notifyTextChanged(int param0) {
        if (this.field_u instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_u)).a(this, 95);
        }
        if (param0 != 5018) {
          this.field_N = -127;
          return;
        }
    }

    final void setText(int param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 98 % ((4 - param0) / 40);
          if (param1 == null) {
            param1 = "";
          }
          this.field_s = param1;
          var5 = param1.length();
          if (this.field_O != -1 &&
            this.field_O < var5) {
            this.field_s = this.field_s.substring(0, this.field_O);
          }
          dupTemp$1 = this.field_s.length();
          this.field_N = dupTemp$1;
          this.field_H = dupTemp$1;
          if (param2) {
            return;
          }
          this.notifyTextChanged(5018);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("go.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final String getSelectedText(byte param0) {
        int var2 = this.field_H > this.field_N ? this.field_N : this.field_H;
        int var3 = this.field_N < this.field_H ? this.field_H : this.field_N;
        if (param0 >= 78) {
          return this.field_s.substring(var2, var3);
        }
        String var4 = (String) null;
        this.insertText((byte) 98, (String) null);
        return this.field_s.substring(var2, var3);
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_E = (os) null;
          }
          stackIn_3_0 = wk.a(10, param1, param0 ^ 126, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("go.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void pasteFromClipboard(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection((byte) -117);
            this.insertText((byte) -109, var2);
            if (param0 != -7) {
              this.field_R = -30;
              return;
            }
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

    final static hh a(int param0, String param1, Archive param2, Archive param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hh stackIn_2_0 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.getGroupIdByName(126, param4);
          var6 = param2.getFileIdByName(var5_int, (byte) 106, param1);
          if (param0 >= 94) {
            stackIn_4_0 = cf.a(param3, 1, param2, var5_int, var6);
            return stackIn_4_0;
          }
          stackIn_2_0 = (hh) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("go.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void copyToClipboard(int param0) {
        try {
          String var2 = this.getSelectedText((byte) 102);
          if (param0 > ~var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) 120))), (java.awt.datatransfer.ClipboardOwner) null);
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStatics(int param0) {
        field_G = null;
        if (param0 <= 73) {
          return;
        }
        field_I = null;
        field_E = null;
        field_K = null;
        field_L = null;
    }

    private final int findPreviousWordBoundary(byte param0) {
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_H == 0) {
          return this.field_H;
        }
        var2 = -1 + this.field_H;
        if (param0 < 87) {
          return -4;
        }
        while (0 < var2) {
          if (this.field_s.charAt(var2 - 1) == 32) {
            return var2;
          }
          var2--;
        }
        return var2;
    }

    private final void i(byte param0) {
        String discarded$0 = null;
        String discarded$1 = null;
        if (this.field_u instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_u)).a(4340, this);
          if (param0 != 2) {
            discarded$0 = this.getSelectedText((byte) -113);
            return;
          }
          return;
        }
        if (param0 != 2) {
          discarded$1 = this.getSelectedText((byte) -113);
          return;
        }
    }

    static {
        field_D = false;
        field_K = "If you are not, please change your password to something more obscure!";
        field_G = "Please remove <%0> from your ignore list first.";
    }
}
