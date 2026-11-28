/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends InteractiveWidget {
    private long field_L;
    private int field_N;
    static boolean field_U;
    static long field_P;
    private int field_M;
    private long field_Q;
    static int field_S;
    private int field_O;
    private boolean field_T;
    private boolean field_R;
    private int field_K;

    private final void copySelection(int param0) {
        String var2 = this.getSelectedText(0);
        if (param0 <= 82) {
          this.field_O = -105;
        }
        if (!(0 >= var2.length())) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(0))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void deleteSelection(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_K != this.field_M) {
          var2 = this.field_M <= this.field_K ? this.field_M : this.field_K;
          var3 = this.field_M > this.field_K ? this.field_M : this.field_K;
          this.field_M = var2;
          this.field_K = var2;
          this.field_i = this.field_i.substring(0, var2) + this.field_i.substring(var3, this.field_i.length());
          this.notifyTextChanged(-1);
        }
        if (param0) {
          this.field_R = true;
        }
    }

    final static void o(int param0) {
        NameSuggestionsPanel.field_H = null;
        of.field_d = (byte[][]) null;
        if (param0 != -28210) {
          field_S = 0;
        }
        vg.field_I = null;
        MouseInputHandler.field_d = null;
        ob.field_a = null;
        b.field_b = null;
    }

    final void drawWidget(int param0, int param1, boolean param2, int param3) {
        long var6;
        TextWidgetRenderer var8;
        if (!param2) {
          this.field_O = -50;
        }
        if (null != this.field_p &&
          param3 == 0) {
          this.field_p.paintWidget(-74, param1, this.field_D, (UiComponent) (this), param0);
          if (this.field_p instanceof TextWidgetRenderer) {
            var8 = (TextWidgetRenderer) ((Object) this.field_p);
            if (this.field_M != this.field_K) {
              var8.paintSelection((UiComponent) (this), this.field_M, param0, this.field_K, -30298, param1);
            }
            var6 = lj.correctedCurrentTimeMillis((byte) -27);
            if ((var6 - this.field_Q) % 1000L < 500L) {
              var8.paintCaret(param0, 0, (UiComponent) (this), this.field_M, param1);
            }
          }
        }
    }

    final void clearText(int param0) {
        this.field_M = 0;
        this.field_K = 0;
        this.field_i = "";
        this.notifyTextChanged(-1);
        if (param0 != 32) {
          field_U = false;
        }
    }

    private final void insertTextAtCaret(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != ~this.field_O) {
            var3_int = this.field_O - this.field_i.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_M != this.field_i.length()) {
            this.field_i = this.field_i.substring(0, this.field_M) + param1 + this.field_i.substring(this.field_M, this.field_i.length());
          } else {
            this.field_i = this.field_i + param1;
          }
          this.field_M = this.field_M + param1.length();
          this.field_K = this.field_M;
          this.notifyTextChanged(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("c.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean pointerPressed(int param0, boolean param1, int param2, UiComponent param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.pointerPressed(param0, param1, param2, param3, param4, param5, param6) &&
            this.field_p instanceof TextWidgetRenderer) {
            var8_int = ((TextWidgetRenderer) ((Object) this.field_p)).findTextOffsetAtScreenPosition(kc.field_b, (UiComponent) (this), (byte) 97, param6, param0, ag.field_f);
            if (-1 == var8_int) {
              stackIn_5_1 = 0;
            } else {
              stackIn_5_1 = var8_int;
            }
            this.moveCaret(stackIn_5_1, -57);
            var8_long = lj.correctedCurrentTimeMillis((byte) -93);
            stackIn_8_1 = !(var8_long - this.field_L >= 250L);
            this.field_R = stackIn_8_1;
            if (this.field_R) {
              this.field_K = this.findPreviousWordBoundary(127);
              this.field_M = this.findNextWordBoundary(32);
              if (this.field_M > 0 &&
                32 == this.field_i.charAt(-1 + this.field_M)) {
                this.field_M = this.field_M - 1;
              }
              this.field_N = this.field_M;
            }
            this.field_L = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("c.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void pasteClipboardText(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            if (param0 != -1) {
              this.field_N = 63;
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(false);
            this.insertTextAtCaret(param0 + 1, var2);
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

    EditableTextField(String param0, WidgetEventListener param1, int param2) {
        super(param0, param1);
        this.field_N = -1;
        this.field_R = false;
        this.field_L = 0L;
        try {
          this.field_p = DisplayNameSelectionPanel.field_M.field_l;
          this.field_O = param2;
          this.setText(true, (byte) -78, param0);
          this.field_T = true;
          this.field_Q = lj.correctedCurrentTimeMillis((byte) -19);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void scrollCaretIntoView(int param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        UiComponent var9;
        TextWidgetRenderer var10;
        var8 = fleas.field_A ? 1 : 0;
        if (!this.field_T) {
          this.field_n = 0;
          this.field_r = 0;
          return;
        }
        if (!(this.field_p instanceof TextWidgetRenderer)) {
          return;
        }
        var10 = (TextWidgetRenderer) ((Object) this.field_p);
        var3 = var10.getTextLayout((UiComponent) (this), (byte) -35);
        var4 = var3.getMaxLineRightX((byte) 97);
        if (param0 <= 89) {
          var9 = (UiComponent) null;
          this.handleKey(11, 11, (UiComponent) null, '*');
        }
        var5 = var10.getTextAreaWidth((UiComponent) (this), (byte) -67);
        var6 = var10.getFontLineHeight((byte) 127) >> 1;
        if (var4 < var5 - var6) {
          this.field_r = 0;
          this.field_n = 0;
          return;
        }
        var7 = this.field_r + var3.getXForTextOffset(-1, this.field_M);
        if (var5 - var6 >= var7) {
          if (var7 < var6) {
            this.field_r = this.field_r + (var6 - var7);
          }
        } else {
          this.field_r = this.field_r - (-var5 + var6) - var7;
        }
        if (this.field_r <= 0) {
          if (this.field_r < -var5 + var6) {
            this.field_r = -var5 + var6;
          }
        } else {
          this.field_r = 0;
        }
        return;
    }

    private final void cutSelection(int param0) {
        if (param0 != -14) {
          return;
        }
        this.copySelection(param0 ^ -97);
        this.deleteSelection(false);
    }

    private final int findPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        if (0 == this.field_M) {
          return this.field_M;
        }
        var2 = -1 + this.field_M;
        if (param0 <= 79) {
          this.clearText(-57);
        }
        while (var2 > 0) {
          if (this.field_i.charAt(var2 - 1) != 32) {
            var2--;
            continue;
          }
          break;
        }
        return var2;
    }

    final void setText(boolean param0, byte param1, String param2) {
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
          if (param1 > -39) {
            this.notifyTextChanged(125);
          }
          this.field_i = param2;
          var4_int = param2.length();
          if (-1 != this.field_O &&
            this.field_O < var4_int) {
            this.field_i = this.field_i.substring(0, this.field_O);
          }
          dupTemp$2 = this.field_i.length();
          this.field_K = dupTemp$2;
          this.field_M = dupTemp$2;
          if (!param0) {
            this.notifyTextChanged(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("c.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void moveCaret(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 > -27) {
          discarded$0 = this.findPreviousWordBoundary(-45);
        }
        this.field_M = param0;
        if (!MidiPcmStream.field_H[81]) {
          this.field_K = this.field_M;
        }
    }

    private final void submitText(byte param0) {
        if (param0 <= 88) {
          return;
        }
        if (this.field_s instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_s)).onTextSubmitted(-31825, this);
        }
    }

    void notifyTextChanged(int param0) {
        if (this.field_s instanceof TextFieldListener) {
          ((TextFieldListener) (this.field_s)).onTextChanged(param0 ^ -41, this);
        }
        if (param0 != -1) {
          field_U = true;
        }
    }

    private final String getSelectedText(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        int var2 = this.field_M <= this.field_K ? this.field_M : this.field_K;
        int var3 = this.field_M > this.field_K ? this.field_M : this.field_K;
        return this.field_i.substring(var2, var3);
    }

    final static void a(int param0, byte param1, int param2, RgbSprite[] param3, int param4, int param5, BitmapFont param6, RgbSprite[] param7, int param8, int param9, boolean param10, int param11) {
        try {
          ib.a(param0, param9, param6, param3, param7, param2, 0, param8, param4, param2, param9, param5, param11, param10, param6);
          if (param1 <= 66) {
            field_P = 53L;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "c.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    void updatePointer(int param0, int param1, UiComponent param2, byte param3) {
        int var6 = 0;
        TextWidgetRenderer var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, (byte) -93);
          if (param3 >= -85) {
            this.field_N = 68;
          }
          this.scrollCaretIntoView(127);
          if (this.field_v == 1) {
            if (this.field_p instanceof TextWidgetRenderer) {
              var7 = (TextWidgetRenderer) ((Object) this.field_p);
              var6 = var7.findTextOffsetAtScreenPosition(kc.field_b, (UiComponent) (this), (byte) 80, param1, param0, ag.field_f);
              if (var6 != -1) {
                if (this.field_R &&
                  this.field_N > var6 &&
                  this.field_K < var6) {
                  var6 = this.field_N;
                }
                this.field_M = var6;
              }
            }
            this.field_Q = lj.correctedCurrentTimeMillis((byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_Q = lj.correctedCurrentTimeMillis((byte) -37);
          if (param0 != -2) {
            return true;
          }
          if (param3 != 60 &&
            62 != param3) {
            if (param3 >= 32 &&
              126 >= param3) {
              if (this.field_K != this.field_M) {
                this.deleteSelection(false);
              }
              if (this.field_O != -1 &&
                this.field_i.length() >= this.field_O) {
                return true;
              }
              if (this.field_M >= this.field_i.length()) {
                this.field_i = this.field_i + param3;
                dupTemp$0 = this.field_i.length();
                this.field_M = dupTemp$0;
                this.field_K = dupTemp$0;
              } else {
                this.field_i = this.field_i.substring(0, this.field_M) + param3 + this.field_i.substring(this.field_M, this.field_i.length());
                this.field_M = this.field_M + 1;
                this.field_K = this.field_M;
              }
              this.notifyTextChanged(-1);
              return true;
            }
            if (85 == param1) {
              if (this.field_M != this.field_K) {
                this.deleteSelection(false);
                return true;
              }
              if (0 < this.field_M) {
                this.field_K = -1 + this.field_M;
                this.deleteSelection(false);
                return true;
              }
            } else {
              if (param1 == 101) {
                if (this.field_M != this.field_K) {
                  this.deleteSelection(false);
                  return true;
                }
                if (this.field_M < this.field_i.length()) {
                  this.field_K = this.field_M + 1;
                  this.deleteSelection(false);
                  return true;
                }
              } else {
                if (param1 == 13) {
                  this.clearText(32);
                  return true;
                }
                if (param1 != 96) {
                  if (param1 != 97) {
                    if (102 == param1) {
                      this.moveCaret(0, -47);
                      return true;
                    }
                    if (103 == param1) {
                      this.moveCaret(this.field_i.length(), -92);
                      return true;
                    }
                    if (param1 == 84) {
                      this.submitText((byte) 115);
                      return true;
                    }
                    if (MidiPcmStream.field_H[82] &&
                      65 == param1) {
                      this.cutSelection(-14);
                      return true;
                    }
                    if (MidiPcmStream.field_H[82] &&
                      param1 == 66) {
                      this.copySelection(105);
                      return true;
                    }
                    if (MidiPcmStream.field_H[82] &&
                      param1 == 67) {
                      this.pasteClipboardText(-1);
                      return true;
                    }
                  } else {
                    if (this.field_M < this.field_i.length()) {
                      if (!MidiPcmStream.field_H[82]) {
                        stackIn_40_1 = this.field_M + 1;
                      } else {
                        stackIn_40_1 = this.findNextWordBoundary(32);
                      }
                      this.moveCaret(stackIn_40_1, -72);
                      return true;
                    }
                  }
                } else {
                  if (this.field_M > 0) {
                    if (MidiPcmStream.field_H[82]) {
                      stackIn_32_1 = this.findPreviousWordBoundary(param0 ^ -100);
                    } else {
                      stackIn_32_1 = this.field_M - 1;
                    }
                    this.moveCaret(stackIn_32_1, -127);
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
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("c.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int findNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var2 = this.field_i.length();
        if (var2 == this.field_M) {
          return this.field_M;
        }
        if (param0 != 32) {
          return -60;
        }
        for (var3 = this.field_M + 1; var3 < var2; var3++) {
          if (this.field_i.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    static {
        field_S = 0;
    }
}
