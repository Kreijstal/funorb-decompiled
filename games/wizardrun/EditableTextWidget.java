/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextWidget extends TextButton {
    private boolean field_F;
    private int caretIndex;
    private int maximumLength;
    private boolean field_Q;
    private long field_I;
    static NineSliceFrame field_N;
    static String field_P;
    static NineSliceFrame field_S;
    static String[] field_R;
    static int field_O;
    private int field_M;
    static String field_G;
    private int selectionAnchor;
    private long field_K;

    final void drawLayer(int param0, int param1, int param2, int param3) {
        TextWidgetRenderer var8 = null;
        long var6 = 0L;
        if (null != this.renderer &&
          param2 == 0) {
          this.renderer.drawWidget(param0, param3, (UiWidget) (this), true, this.field_B);
          if (this.renderer instanceof TextWidgetRenderer) {
            var8 = (TextWidgetRenderer) ((Object) this.renderer);
            if (this.selectionAnchor != this.caretIndex) {
              var8.drawSelection(this.caretIndex, true, this.selectionAnchor, param3, param0, (UiWidget) (this));
            }
            var6 = MonotonicClockHelpers.monotonicMillis((byte) 54);
            if ((-this.field_I + var6) % 1000L < 500L) {
              var8.drawCaret(param3, param0, (UiWidget) (this), 0, this.caretIndex);
            }
          }
        }
        if (param1 != 0) {
          this.field_Q = true;
        }
    }

    final static void setTooltipAnchor(int param0, int param1, int param2) {
        if (param2 > -69) {
          return;
        }
        field_O = param0;
        StyleNode.field_r = param1;
    }

    private final int nextWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = wizardrun.field_H;
        var2 = this.text.length();
        if (this.caretIndex == var2) {
          return this.caretIndex;
        }
        if (param0 < 19) {
          return 50;
        }
        for (var3 = 1 + this.caretIndex; var3 < var2; var3++) {
          if (this.text.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    EditableTextWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.field_Q = false;
        this.field_M = -1;
        this.field_K = 0L;
        try {
          this.renderer = ValidationIndicator.field_H.field_b;
          this.maximumLength = param2;
          this.setText(-1, true, param0);
          this.field_F = true;
          this.field_I = MonotonicClockHelpers.monotonicMillis((byte) 94);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        int dupTemp$0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_70_1 = 0;
        int stackIn_71_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_I = MonotonicClockHelpers.monotonicMillis((byte) 99);
          if (param0 != 60 &&
            param0 != 62) {
            if (param2 >= -96) {
              return false;
            }
            if (param0 >= 32 &&
              param0 <= 126) {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(-110);
              }
              if (this.maximumLength != -1 &&
                this.text.length() >= this.maximumLength) {
                return true;
              }
              if (this.caretIndex >= this.text.length()) {
                this.text = this.text + param0;
                dupTemp$0 = this.text.length();
                this.caretIndex = dupTemp$0;
                this.selectionAnchor = dupTemp$0;
              } else {
                this.text = this.text.substring(0, this.caretIndex) + param0 + this.text.substring(this.caretIndex, this.text.length());
                this.caretIndex = this.caretIndex + 1;
                this.selectionAnchor = this.caretIndex;
              }
              this.notifyTextChanged((byte) -84);
              return true;
            }
            if (param1 != 85) {
              if (param1 != 101) {
                if (param1 == 13) {
                  this.clearText(true);
                  return true;
                }
                if (96 == param1) {
                  if (0 < this.caretIndex) {
                    stackIn_70_1 = 27;
                    if (BufferedSocket.field_p[82]) {
                      stackIn_71_2 = this.previousWordBoundary(31823);
                    } else {
                      stackIn_71_2 = -1 + this.caretIndex;
                    }
                    this.moveCaret((byte) stackIn_70_1, stackIn_71_2);
                    return true;
                  }
                } else {
                  if (param1 != 97) {
                    if (param1 == 102) {
                      this.moveCaret((byte) 10, 0);
                      return true;
                    }
                    if (param1 == 103) {
                      this.moveCaret((byte) 92, this.text.length());
                      return true;
                    }
                    if (param1 == 84) {
                      this.notifyTextSubmitted(0);
                      return true;
                    }
                    if (BufferedSocket.field_p[82] &&
                      param1 == 65) {
                      this.cutSelection((byte) 75);
                      return true;
                    }
                    if (BufferedSocket.field_p[82] &&
                      param1 == 66) {
                      this.copySelection(false);
                      return true;
                    }
                    if (BufferedSocket.field_p[82] &&
                      param1 == 67) {
                      this.pasteClipboard((byte) 126);
                      return true;
                    }
                  } else {
                    if (this.caretIndex < this.text.length()) {
                      stackIn_41_1 = -127;
                      if (!BufferedSocket.field_p[82]) {
                        stackIn_42_2 = 1 + this.caretIndex;
                      } else {
                        stackIn_42_2 = this.nextWordBoundary((byte) 24);
                      }
                      this.moveCaret((byte) stackIn_41_1, stackIn_42_2);
                      return true;
                    }
                  }
                }
              } else {
                if (this.caretIndex != this.selectionAnchor) {
                  this.deleteSelection(76);
                  return true;
                }
                if (this.caretIndex < this.text.length()) {
                  this.selectionAnchor = 1 + this.caretIndex;
                  this.deleteSelection(-73);
                  return true;
                }
              }
            } else {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(-92);
                return true;
              }
              if (this.caretIndex > 0) {
                this.selectionAnchor = -1 + this.caretIndex;
                this.deleteSelection(31);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("og.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
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
            var3_int = this.maximumLength - this.text.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.caretIndex != this.text.length()) {
            this.text = this.text.substring(0, this.caretIndex) + param0 + this.text.substring(this.caretIndex, this.text.length());
          } else {
            this.text = this.text + param0;
          }
          this.caretIndex = this.caretIndex + param0.length();
          if (param1 <= 76) {
            this.moveCaret((byte) -42, -84);
          }
          this.selectionAnchor = this.caretIndex;
          this.notifyTextChanged((byte) -122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("og.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    void notifyTextChanged(byte param0) {
        if (this.listener instanceof TextChangeListener) {
          ((TextChangeListener) (this.listener)).onTextChanged(this, 5);
        }
        if (param0 >= -59) {
          this.field_Q = true;
        }
    }

    final static void writeScoreSubmission(ScoreSubmission param0, int param1, int param2) {
        IsaacPacketBuffer var8 = null;
        IsaacPacketBuffer var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = wizardrun.field_H;
        try {
          var8 = AccountPacketState.field_b;
          var9 = var8;
          var9.writeCipheredOpcode((byte) -105, param1);
          var9.position = var9.position + 1;
          var4 = var9.position;
          var9.writeByte((byte) 11, 1);
          var9.writeShort(-1947079288, param0.field_i);
          var9.writeShort(-1947079288, param0.field_t);
          var9.writeShort(-1947079288, param0.field_o);
          var9.writeInt(param0.field_k, 613003928);
          var9.writeInt(param0.field_l, 613003928);
          var9.writeInt(param0.field_m, 613003928);
          var9.writeInt(param0.field_p, 613003928);
          var9.writeByte((byte) 11, param0.field_q.length);
          var5 = 0;
          int var6 = -49 / ((param2 - 44) / 56);
          while (param0.field_q.length > var5) {
            var8.writeInt(param0.field_q[var5], 613003928);
            var5++;
          }
          var9.appendCrc(var4, -1182887024);
          var9.backpatchByteLength(-var4 + var9.position, -87);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "og.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean handleMousePress(int param0, byte param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        int var8_intLifetime1;
        try {
          if (super.handleMousePress(param0, (byte) -83, param2, param3, param4, param5, param6) &&
            this.renderer instanceof TextWidgetRenderer) {
            var8_int = ((TextWidgetRenderer) ((Object) this.renderer)).getTextIndexAt(9397, AchievementSubmission.field_n, param0, (UiWidget) (this), param3, NetworkArchiveRequest.field_B);
            stackIn_5_1 = -118;
            if (-1 == var8_int) {
              stackIn_6_2 = 0;
            } else {
              stackIn_6_2 = var8_int;
            }
            this.moveCaret((byte) stackIn_5_1, stackIn_6_2);
            var8_long = MonotonicClockHelpers.monotonicMillis((byte) 42);
            stackIn_9_1 = !(var8_long - this.field_K >= 250L);
            this.field_Q = stackIn_9_1;
            if (this.field_Q) {
              this.selectionAnchor = this.previousWordBoundary(31823);
              this.caretIndex = this.nextWordBoundary((byte) 113);
              if (this.caretIndex > 0 &&
                this.text.charAt(-1 + this.caretIndex) == 32) {
                this.caretIndex = this.caretIndex - 1;
              }
              this.field_M = this.caretIndex;
            }
            this.field_K = var8_long;
            return true;
          }
          var8_intLifetime1 = -66 % ((param1 - 12) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("og.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void clearText(boolean param0) {
        this.selectionAnchor = 0;
        this.caretIndex = 0;
        this.text = "";
        if (!param0) {
          return;
        }
        this.notifyTextChanged((byte) -81);
    }

    void updateInput(int param0, int param1, int param2, UiWidget param3) {
        TextWidgetRenderer var7 = null;
        int var6 = 0;
        try {
          super.updateInput(param0 + 0, param1, param2, param3);
          this.scrollCaretIntoView(param0 ^ param0);
          if (this.pressedMouseButton == 1) {
            if (this.renderer instanceof TextWidgetRenderer) {
              var7 = (TextWidgetRenderer) ((Object) this.renderer);
              var6 = var7.getTextIndexAt(9397, AchievementSubmission.field_n, param2, (UiWidget) (this), param1, NetworkArchiveRequest.field_B);
              if (var6 != -1) {
                if (this.field_Q && var6 < this.field_M &&
                  var6 > this.selectionAnchor) {
                  var6 = this.field_M;
                }
                this.caretIndex = var6;
              }
            }
            this.field_I = MonotonicClockHelpers.monotonicMillis((byte) 44);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "og.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_S = null;
        field_G = null;
        if (param0 != 37) {
          ScoreSubmission var2 = (ScoreSubmission) null;
          EditableTextWidget.writeScoreSubmission((ScoreSubmission) null, 98, 109);
        }
        field_N = null;
        field_R = null;
        field_P = null;
    }

    private final int previousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = wizardrun.field_H;
        if (this.caretIndex == 0) {
          return this.caretIndex;
        }
        if (param0 != 31823) {
          field_O = -60;
        }
        for (var2 = this.caretIndex - 1; 0 < var2; var2--) {
          if (this.text.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void notifyTextSubmitted(int param0) {
        if (param0 != 0) {
          this.drawLayer(59, -78, 27, 72);
        }
        if (this.listener instanceof TextChangeListener) {
          ((TextChangeListener) (this.listener)).onTextSubmitted(param0 ^ -117, this);
        }
    }

    private final void moveCaret(byte param0, int param1) {
        int var3 = 10 % ((-48 - param0) / 44);
        this.caretIndex = param1;
        if (!BufferedSocket.field_p[81]) {
          this.selectionAnchor = this.caretIndex;
        }
    }

    private final String getSelectedText(int param0) {
        if (param0 != -12938) {
          this.selectionAnchor = 68;
        }
        int var2 = this.caretIndex > this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
        int var3 = this.caretIndex > this.selectionAnchor ? this.caretIndex : this.selectionAnchor;
        return this.text.substring(var2, var3);
    }

    private final void scrollCaretIntoView(int param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        TextWidgetRenderer var9;
        var8 = wizardrun.field_H;
        if (!this.field_F) {
          this.textOffsetY = 0;
          this.textOffsetX = 0;
          return;
        }
        if (param0 != 0) {
          this.field_K = 13L;
        }
        if (!(this.renderer instanceof TextWidgetRenderer)) {
          return;
        }
        var9 = (TextWidgetRenderer) ((Object) this.renderer);
        var3 = var9.getTextLayout((UiWidget) (this), (byte) 78);
        var4 = var3.getMaximumLineWidth(-127);
        var5 = var9.getContentWidth((UiWidget) (this), param0 - 106);
        var6 = var9.getLineHeight((byte) 62) >> 1;
        if (var4 < var5 - var6) {
          this.textOffsetX = 0;
          this.textOffsetY = 0;
          return;
        }
        var7 = this.textOffsetX + var3.getCharacterX(62, this.caretIndex);
        if (var5 - var6 >= var7) {
          if (var6 > var7) {
            this.textOffsetX = this.textOffsetX + var6 - var7;
          }
        } else {
          this.textOffsetX = var5 + (-var6 - var7) + this.textOffsetX;
        }
        if (this.textOffsetX > 0) {
          this.textOffsetX = 0;
        } else {
          if (this.textOffsetX < var6 - var5) {
            this.textOffsetX = var6 - var5;
          }
        }
        return;
    }

    private final void copySelection(boolean param0) {
        String var2 = this.getSelectedText(-12938);
        if (param0) {
          return;
        }
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText(-12938))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void setText(int param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.text = param2;
          var4_int = param2.length();
          if (this.maximumLength != param0 &&
            this.maximumLength < var4_int) {
            this.text = this.text.substring(0, this.maximumLength);
          }
          dupTemp$1 = this.text.length();
          this.selectionAnchor = dupTemp$1;
          this.caretIndex = dupTemp$1;
          if (!param1) {
            this.notifyTextChanged((byte) -94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("og.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void deleteSelection(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.selectionAnchor != this.caretIndex) {
          var2 = this.caretIndex > this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
          var3 = this.caretIndex <= this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
          this.caretIndex = var2;
          this.selectionAnchor = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.notifyTextChanged((byte) -115);
        }
        var2Lifetime1 = 47 / ((param0 + 20) / 43);
    }

    private final void pasteClipboard(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            if (param0 < 1) {
              this.selectionAnchor = -125;
            }
            this.deleteSelection(-125);
            this.insertText(var2, 84);
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

    private final void cutSelection(byte param0) {
        if (param0 != 75) {
          this.drawLayer(-59, 57, 98, 61);
        }
        this.copySelection(false);
        this.deleteSelection(param0 - 145);
    }

    static {
        field_O = -1;
        field_G = "Main Menu";
        field_P = "Move left and right";
    }
}
