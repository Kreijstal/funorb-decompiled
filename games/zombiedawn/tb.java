/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb extends an {
    private int field_L;
    static int field_E;
    private int field_N;
    private int field_H;
    private boolean field_F;
    static Sprite field_G;
    private long field_M;
    private int field_O;
    private boolean field_I;
    private long field_J;
    static Js5Archive field_K;

    private final void notifyTextSubmitted(boolean param0) {
        if (this.field_v instanceof ok) {
          ((ok) (this.field_v)).onTextSubmitted(this, -19);
        }
        if (param0) {
          this.field_J = -25L;
        }
    }

    private final int previousWordBoundary(boolean param0) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        if (this.field_N == 0) {
          return this.field_N;
        }
        if (!param0) {
          field_K = (Js5Archive) null;
        }
        for (var2 = this.field_N - 1; var2 > 0; var2--) {
          if (32 != this.field_o.charAt(var2 - 1)) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void cutSelection(byte param0) {
        if (param0 >= -1) {
          this.clearText(-105);
        }
        this.copySelectionToClipboard(-127);
        this.deleteSelection(121);
    }

    final static Sprite[] createSolidFrameSprites(int param0, int param1, int param2, int param3) {
        if (param2 != -2967) {
          return (Sprite[]) null;
        }
        return kj.a(1, param1, 12692, param3, param0);
    }

    final void setText(boolean param0, boolean param1, String param2) {
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
          this.field_o = param2;
          var4_int = param2.length();
          if (this.field_O != -1 &&
            var4_int > this.field_O) {
            this.field_o = this.field_o.substring(0, this.field_O);
          }
          dupTemp$1 = this.field_o.length();
          this.field_H = dupTemp$1;
          this.field_N = dupTemp$1;
          if (param0) {
            return;
          }
          if (!param1) {
            this.notifyTextChanged((byte) 77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("tb.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void deleteSelection(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_H != this.field_N) {
          var2 = this.field_H < this.field_N ? this.field_H : this.field_N;
          var3 = this.field_N > this.field_H ? this.field_N : this.field_H;
          this.field_H = var2;
          this.field_N = var2;
          this.field_o = this.field_o.substring(0, var2) + this.field_o.substring(var3, this.field_o.length());
          this.notifyTextChanged((byte) -113);
        }
        var2Lifetime1 = -113 % ((param0 + 26) / 49);
    }

    final void clearText(int param0) {
        this.field_o = "";
        this.field_H = 0;
        this.field_N = param0;
        this.notifyTextChanged((byte) 119);
    }

    void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        ak var6 = null;
        int var7 = 0;
        try {
          int var5_int = 108 / ((46 - param1) / 42);
          super.updatePointer(param0, (byte) 119, param2, param3);
          this.scrollCaretIntoView(-94);
          if (1 == this.field_m) {
            if (this.field_h instanceof ak) {
              var6 = (ak) ((Object) this.field_h);
              var7 = var6.hitTestCaretIndex((UiWidget) (this), -1, param2, ha.field_b, ei.field_K, param3);
              if (-1 != var7) {
                if (this.field_F &&
                  var7 < this.field_L &&
                  this.field_H < var7) {
                  var7 = this.field_L;
                }
                this.field_N = var7;
              }
            }
            this.field_M = pd.monotonicTimeMillis(-22826);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void notifyTextChanged(byte param0) {
        if (this.field_v instanceof ok) {
          ((ok) (this.field_v)).onTextEdited(this, 8);
        }
        int var2 = 4 % ((-50 - param0) / 49);
    }

    tb(String param0, sk param1, int param2) {
        super(param0, param1);
        this.field_L = -1;
        this.field_F = false;
        this.field_J = 0L;
        try {
          this.field_h = ProxySocketConnector.field_j.field_b;
          this.field_O = param2;
          this.setText(false, true, param0);
          this.field_I = true;
          this.field_M = pd.monotonicTimeMillis(-22826);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int nextWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        var2 = this.field_o.length();
        if (var2 == this.field_N) {
          return this.field_N;
        }
        var3 = this.field_N + 1;
        if (param0 != 7) {
          this.field_F = false;
        }
        while (var3 < var2) {
          if (this.field_o.charAt(var3 - 1) != 32) {
            var3++;
            continue;
          }
          break;
        }
        return var3;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        long var6;
        ak var8;
        if (param3 != 0) {
          tb.encodeCodePageChar('ﾲ', 59);
        }
        if (this.field_h != null &&
          param1 == 0) {
          this.field_h.drawWidget(16777215, this.field_C, param0, (UiWidget) (this), param2);
          if (this.field_h instanceof ak) {
            var8 = (ak) ((Object) this.field_h);
            if (this.field_H != this.field_N) {
              var8.drawSelection(-118, this.field_H, param0, (UiWidget) (this), param2, this.field_N);
            }
            var6 = pd.monotonicTimeMillis(-22826);
            if ((var6 - this.field_M) % 1000L < 500L) {
              var8.drawCaret(this.field_N, param2, param0, param3 ^ -39, (UiWidget) (this));
            }
          }
        }
    }

    public static void releaseStatics(boolean param0) {
        field_G = null;
        field_K = null;
        if (!param0) {
          tb.releaseStatics(true);
        }
    }

    private final void copySelectionToClipboard(int param0) {
        if (param0 >= -40) {
          return;
        }
        String var2 = this.selectedText((byte) 112);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.selectedText((byte) -10))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void insertText(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_O != -1) {
            var3_int = this.field_O - this.field_o.length();
            if (0 <= var3_int) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_N == this.field_o.length()) {
            this.field_o = this.field_o + param0;
          } else {
            this.field_o = this.field_o.substring(0, this.field_N) + param0 + this.field_o.substring(this.field_N, this.field_o.length());
          }
          this.field_N = this.field_N + param0.length();
          this.field_H = this.field_N;
          if (param1 != -37) {
            this.field_J = -49L;
            this.notifyTextChanged((byte) -103);
          } else {
            this.notifyTextChanged((byte) -103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("tb.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean isSingleRepeatedChar(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (~param1.charAt(var3) != ~var2_int) {
              return false;
            }
          }
          if (param0 == -10723) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("tb.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void moveCaret(int param0, int param1) {
        this.field_N = param0;
        if (!bo.field_p[param1]) {
          this.field_H = this.field_N;
        }
    }

    private final void pasteClipboard(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          String var3 = null;
          Exception var3_ref = null;
          var2 = -11 % ((-30 - param0) / 58);
          try {
            var3 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(127);
            this.insertText(var3, (byte) -37);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String selectedText(byte param0) {
        int var2 = this.field_N <= this.field_H ? this.field_N : this.field_H;
        int var4 = -7 / ((param0 - 66) / 34);
        int var3 = this.field_H < this.field_N ? this.field_N : this.field_H;
        return this.field_o.substring(var2, var3);
    }

    final boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.handlePointerPress(param0, param1 ^ 0, param2, param3, param4, param5, param6) &&
            this.field_h instanceof ak) {
            var8_int = ((ak) ((Object) this.field_h)).hitTestCaretIndex((UiWidget) (this), param1 - 2, param2, ha.field_b, ei.field_K, param4);
            if (var8_int != -1) {
              stackIn_6_1 = var8_int;
            } else {
              stackIn_6_1 = 0;
            }
            this.moveCaret(stackIn_6_1, 81);
            var8_long = pd.monotonicTimeMillis(param1 - 22827);
            stackIn_9_1 = !(-this.field_J + var8_long >= 250L);
            this.field_F = stackIn_9_1;
            if (this.field_F) {
              this.field_H = this.previousWordBoundary(true);
              this.field_N = this.nextWordBoundary((byte) 7);
              if (this.field_N > 0 &&
                this.field_o.charAt(-1 + this.field_N) == 32) {
                this.field_N = this.field_N - 1;
              }
              this.field_L = this.field_N;
            }
            this.field_J = var8_long;
            return true;
          }
          if (param1 == 1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("tb.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void scrollCaretIntoView(int param0) {
        vg var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ak var9;
        var8 = ZombieDawn.field_J;
        if (!this.field_I) {
          this.field_u = 0;
          this.field_p = 0;
          return;
        }
        if (!(this.field_h instanceof ak)) {
          return;
        }
        if (param0 >= -87) {
          field_E = -5;
        }
        var9 = (ak) ((Object) this.field_h);
        var3 = var9.getTextLayout(98, (UiWidget) (this));
        var4 = var3.width((byte) 123);
        var5 = var9.getAvailableTextWidth((byte) 124, (UiWidget) (this));
        var6 = var9.getLineInkHeight(5) >> 1;
        if (var5 - var6 > var4) {
          this.field_u = 0;
          this.field_p = 0;
        } else {
          var7 = this.field_u + var3.characterX((byte) -72, this.field_N);
          if (var7 <= var5 - var6) {
            if (var7 < var6) {
              this.field_u = this.field_u + var6 - var7;
            }
          } else {
            this.field_u = var5 - (var6 + (var7 - this.field_u));
          }
          if (0 < this.field_u) {
            this.field_u = 0;
          } else {
            if (-var5 + var6 > this.field_u) {
              this.field_u = var6 - var5;
            }
          }
        }
    }

    final static byte encodeCodePageChar(char param0, int param1) {
        int var2;
        int var3;
        {
          var3 = ZombieDawn.field_J;
          if ((0 >= param0 ||
            param0 >= 128) && (param0 < 160 ||
            param0 > 255)) {
            if (8364 == param0) {
              var2 = -128;
            } else if (param0 == 8218) {
              var2 = -126;
            } else if (param0 == 402) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (param0 == 8230) {
              var2 = -123;
            } else if (param0 == 8224) {
              var2 = -122;
            } else if (8225 == param0) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (param0 == 8240) {
              var2 = -119;
            } else if (352 == param0) {
              var2 = -118;
            } else if (param0 == 8249) {
              var2 = -117;
            } else if (338 == param0) {
              var2 = -116;
            } else if (param0 == 381) {
              var2 = -114;
            } else if (param0 == 8216) {
              var2 = -111;
            } else if (param0 == 8217) {
              var2 = -110;
            } else if (param0 == 8220) {
              var2 = -109;
            } else if (param0 == 8221) {
              var2 = -108;
            } else if (param0 == 8226) {
              var2 = -107;
            } else if (8211 == param0) {
              var2 = -106;
            } else if (param0 == 8212) {
              var2 = -105;
            } else if (732 == param0) {
              var2 = -104;
            } else if (param0 == 8482) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (param0 == 8250) {
              var2 = -101;
            } else if (param0 == 339) {
              var2 = -100;
            } else if (param0 == 382) {
              var2 = -98;
            } else if (param0 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        if (param1 == -8225) {
          return (byte) var2;
        }
        return (byte) 9;
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_M = pd.monotonicTimeMillis(-22826);
          if (param3 == 60) {
            return false;
          }
          if (param3 == 62) {
            return false;
          }
          var5_int = -121 / ((param0 + 83) / 32);
          if (param3 >= 32 &&
            126 >= param3) {
            if (this.field_N != this.field_H) {
              this.deleteSelection(77);
            }
            if (-1 == this.field_O ||
              !(this.field_o.length() >= this.field_O)) {
              if (this.field_N < this.field_o.length()) {
                this.field_o = this.field_o.substring(0, this.field_N) + param3 + this.field_o.substring(this.field_N, this.field_o.length());
                this.field_N = this.field_N + 1;
                this.field_H = this.field_N;
              } else {
                this.field_o = this.field_o + param3;
                dupTemp$0 = this.field_o.length();
                this.field_N = dupTemp$0;
                this.field_H = dupTemp$0;
              }
              this.notifyTextChanged((byte) -101);
            }
            return true;
          }
          if (param1 != 85) {
            if (param1 != 101) {
              if (param1 == 13) {
                this.clearText(0);
                return true;
              }
              if (param1 == 96) {
                if (this.field_N > 0) {
                  if (!bo.field_p[82]) {
                    stackIn_62_1 = this.field_N - 1;
                  } else {
                    stackIn_62_1 = this.previousWordBoundary(true);
                  }
                  this.moveCaret(stackIn_62_1, 81);
                  return true;
                }
              } else {
                if (param1 != 97) {
                  if (param1 == 102) {
                    this.moveCaret(0, 81);
                    return true;
                  }
                  if (param1 == 103) {
                    this.moveCaret(this.field_o.length(), 81);
                    return true;
                  }
                  if (84 == param1) {
                    this.notifyTextSubmitted(false);
                    return true;
                  }
                  if (bo.field_p[82] &&
                    65 == param1) {
                    this.cutSelection((byte) -58);
                    return true;
                  }
                  if (bo.field_p[82] &&
                    param1 == 66) {
                    this.copySelectionToClipboard(-111);
                    return true;
                  }
                  if (bo.field_p[82] &&
                    67 == param1) {
                    this.pasteClipboard(91);
                    return true;
                  }
                } else {
                  if (this.field_N < this.field_o.length()) {
                    if (!bo.field_p[82]) {
                      stackIn_33_1 = 1 + this.field_N;
                    } else {
                      stackIn_33_1 = this.nextWordBoundary((byte) 7);
                    }
                    this.moveCaret(stackIn_33_1, 81);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_H != this.field_N) {
                this.deleteSelection(-96);
                return true;
              }
              if (this.field_N < this.field_o.length()) {
                this.field_H = this.field_N + 1;
                this.deleteSelection(-82);
                return true;
              }
            }
          } else {
            if (this.field_H != this.field_N) {
              this.deleteSelection(28);
              return true;
            }
            if (this.field_N > 0) {
              this.field_H = -1 + this.field_N;
              this.deleteSelection(75);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("tb.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
