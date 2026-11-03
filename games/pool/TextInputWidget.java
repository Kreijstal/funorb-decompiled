/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputWidget extends ButtonWidget {
    private int maximumTextLength;
    static byte[] field_Y;
    private int wordSelectionEndIndex;
    private long caretBlinkStartMillis;
    private long lastPointerPressMillis;
    static int[] field_V;
    private int caretIndex;
    static int[] field_P;
    private int selectionAnchorIndex;
    private boolean caretScrollingEnabled;
    private boolean wordSelectionDrag;
    static String playerYouX2AreOut;
    static String tutorialOptionBasics;

    private final void notifyTextInputSubmitted(byte param0) {
        if (this.listener instanceof TextInputListener) {
          ((TextInputListener) (this.listener)).onTextInputSubmitted(this, false);
        }
        if (param0 != 3) {
          this.selectionAnchorIndex = 98;
        }
    }

    final static String decodeBase37Name(boolean param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        if (0L >= param1) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = TextureCache.field_d[(int)(var7 - param1 * 37L)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param0) {
          tutorialOptionBasics = (String) null;
        }
        return var6.toString();
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.renderer instanceof io)) {
            return false;
          }
          var8_int = ((io) ((Object) this.renderer)).characterIndexAtPosition(param5, wn.field_i, DebouncedValidationProvider.field_f, (UiWidget) (this), 105, param1);
          stackIn_6_1 = 86;
          if (var8_int != -1) {
            stackIn_7_2 = var8_int;
          } else {
            stackIn_7_2 = 0;
          }
          this.moveCaret(stackIn_6_1, stackIn_7_2);
          var8_long = rl.monotonicTimeMillis((byte) -107);
          stackIn_10_1 = !(var8_long - this.lastPointerPressMillis >= 250L);
          this.wordSelectionDrag = stackIn_10_1;
          if (this.wordSelectionDrag) {
            this.selectionAnchorIndex = this.findPreviousWordBoundary(32);
            this.caretIndex = this.findNextWordBoundary(27);
            if (this.caretIndex > 0 &&
              this.widgetText.charAt(this.caretIndex - 1) == 32) {
              this.caretIndex = this.caretIndex - 1;
            }
            this.wordSelectionEndIndex = this.caretIndex;
          }
          this.lastPointerPressMillis = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("sl.AA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void deleteSelectedText(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -14642) {
          UiWidget var4 = (UiWidget) null;
          this.handleKeyInput('ﾣ', -96, true, (UiWidget) null);
        }
        if (this.selectionAnchorIndex != this.caretIndex) {
          var2 = this.selectionAnchorIndex < this.caretIndex ? this.selectionAnchorIndex : this.caretIndex;
          var3 = this.selectionAnchorIndex >= this.caretIndex ? this.selectionAnchorIndex : this.caretIndex;
          this.selectionAnchorIndex = var2;
          this.caretIndex = var2;
          this.widgetText = this.widgetText.substring(0, var2) + this.widgetText.substring(var3, this.widgetText.length());
          this.notifyTextInputChanged(117);
        }
    }

    private final int findNextWordBoundary(int param0) {
        int discarded$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (param0 <= 15) {
          discarded$1 = this.findNextWordBoundary(-3);
        }
        var2 = this.widgetText.length();
        if (this.caretIndex == var2) {
          return this.caretIndex;
        }
        for (var3 = 1 + this.caretIndex; var3 < var2; var3++) {
          if (this.widgetText.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void moveCaret(int param0, int param1) {
        this.caretIndex = param1;
        if (!TextLineLayout.field_c[81]) {
          this.selectionAnchorIndex = this.caretIndex;
        }
        int var3 = -72 / ((param0 + 33) / 62);
    }

    void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        io var7 = null;
        int var6 = 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.updateCaretScroll(-20923);
          if (this.pressedPointerButton == 1) {
            if (this.renderer instanceof io) {
              var7 = (io) ((Object) this.renderer);
              var6 = var7.characterIndexAtPosition(param3, wn.field_i, DebouncedValidationProvider.field_f, (UiWidget) (this), param1 - 882, param2);
              if (-1 != var6) {
                if (this.wordSelectionDrag && var6 < this.wordSelectionEndIndex &&
                  var6 > this.selectionAnchorIndex) {
                  var6 = this.wordSelectionEndIndex;
                }
                this.caretIndex = var6;
              }
            }
            this.caretBlinkStartMillis = rl.monotonicTimeMillis((byte) -126);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sl.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void clearInputText(int param0) {
        if (param0 < 55) {
          this.wordSelectionEndIndex = -85;
        }
        this.caretIndex = 0;
        this.selectionAnchorIndex = 0;
        this.widgetText = "";
        this.notifyTextInputChanged(-44);
    }

    final void setInputText(byte param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
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
          this.widgetText = param2;
          if (param0 != -124) {
            return;
          }
          var4_int = param2.length();
          if (-1 != this.maximumTextLength &&
            var4_int > this.maximumTextLength) {
            this.widgetText = this.widgetText.substring(0, this.maximumTextLength);
          }
          dupTemp$1 = this.widgetText.length();
          this.selectionAnchorIndex = dupTemp$1;
          this.caretIndex = dupTemp$1;
          if (!param1) {
            this.notifyTextInputChanged(param0 + 211);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("sl.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void insertTextAtCaret(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (-1 != this.maximumTextLength) {
            var3_int = this.maximumTextLength - this.widgetText.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.caretIndex != this.widgetText.length()) {
            this.widgetText = this.widgetText.substring(0, this.caretIndex) + param1 + this.widgetText.substring(this.caretIndex, this.widgetText.length());
          } else {
            this.widgetText = this.widgetText + param1;
          }
          this.caretIndex = this.caretIndex + param1.length();
          if (param0 <= 21) {
            this.moveCaret(-32, -52);
          }
          this.selectionAnchorIndex = this.caretIndex;
          this.notifyTextInputChanged(118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("sl.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_Y = null;
        field_V = null;
        tutorialOptionBasics = null;
        playerYouX2AreOut = null;
        if (param0 != 23) {
          return;
        }
        field_P = null;
    }

    private final void pasteClipboardText(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 != 4) {
            return;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelectedText(-14642);
            this.insertTextAtCaret(param0 + 106, var2);
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

    private final void updateCaretScroll(int param0) {
        int var8 = Pool.field_O;
        if (!this.caretScrollingEnabled) {
          this.textOffsetY = 0;
          this.textOffsetX = 0;
          return;
        }
        if (!(this.renderer instanceof io)) {
          return;
        }
        io var9 = (io) ((Object) this.renderer);
        op var3 = var9.ensureTextLayout(0, (UiWidget) (this));
        int var4 = var3.a(-1);
        int var5 = var9.contentWidth((byte) 26, (UiWidget) (this));
        int var6 = var9.lineHeight(-10492) >> 1;
        if (-var6 + var5 > var4) {
          this.textOffsetX = 0;
          this.textOffsetY = 0;
          return;
        }
        int var7 = this.textOffsetX + var3.a(this.caretIndex, (byte) -88);
        if (-var6 + var5 < var7) {
          this.textOffsetX = -var7 + (-var6 + (var5 + this.textOffsetX));
        } else {
          if (var7 < var6) {
            this.textOffsetX = this.textOffsetX - var7 + var6;
          }
        }
        if (param0 != -20923) {
          return;
        }
        if (0 < this.textOffsetX) {
          this.textOffsetX = 0;
        } else {
          if (!(-var5 + var6 <= this.textOffsetX)) {
            this.textOffsetX = -var5 + var6;
          }
        }
    }

    TextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.wordSelectionEndIndex = -1;
        this.wordSelectionDrag = false;
        this.lastPointerPressMillis = 0L;
        try {
          this.maximumTextLength = param2;
          this.renderer = VerticalScrollbar.field_Sb.field_j;
          this.setInputText((byte) -124, true, param0);
          this.caretScrollingEnabled = true;
          this.caretBlinkStartMillis = rl.monotonicTimeMillis((byte) -101);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void copySelectedTextToClipboard(boolean param0) {
        String var2 = this.getSelectedText((byte) 63);
        if (param0) {
          this.maximumTextLength = 71;
        }
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) 63))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        int dupTemp$0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.caretBlinkStartMillis = rl.monotonicTimeMillis((byte) -116);
          if (param2) {
            this.caretBlinkStartMillis = 25L;
          }
          if (param0 != 60 &&
            param0 != 62) {
            if (param0 >= 32 &&
              param0 <= 126) {
              if (this.caretIndex != this.selectionAnchorIndex) {
                this.deleteSelectedText(-14642);
              }
              if (this.maximumTextLength != -1 &&
                this.widgetText.length() >= this.maximumTextLength) {
                return true;
              }
              if (this.caretIndex >= this.widgetText.length()) {
                this.widgetText = this.widgetText + param0;
                dupTemp$0 = this.widgetText.length();
                this.caretIndex = dupTemp$0;
                this.selectionAnchorIndex = dupTemp$0;
              } else {
                this.widgetText = this.widgetText.substring(0, this.caretIndex) + param0 + this.widgetText.substring(this.caretIndex, this.widgetText.length());
                this.caretIndex = this.caretIndex + 1;
                this.selectionAnchorIndex = this.caretIndex;
              }
              this.notifyTextInputChanged(-27);
              return true;
            }
            if (85 != param1) {
              if (param1 == 101) {
                if (this.caretIndex != this.selectionAnchorIndex) {
                  this.deleteSelectedText(-14642);
                  return true;
                }
                if (this.caretIndex < this.widgetText.length()) {
                  this.selectionAnchorIndex = 1 + this.caretIndex;
                  this.deleteSelectedText(-14642);
                  return true;
                }
              } else {
                if (param1 == 13) {
                  this.clearInputText(57);
                  return true;
                }
                if (param1 != 96) {
                  if (param1 != 97) {
                    if (102 == param1) {
                      this.moveCaret(-113, 0);
                      return true;
                    }
                    if (param1 == 103) {
                      this.moveCaret(76, this.widgetText.length());
                      return true;
                    }
                    if (84 == param1) {
                      this.notifyTextInputSubmitted((byte) 3);
                      return true;
                    }
                    if (TextLineLayout.field_c[82] &&
                      65 == param1) {
                      this.cutSelectedText(-98);
                      return true;
                    }
                    if (TextLineLayout.field_c[82] &&
                      66 == param1) {
                      this.copySelectedTextToClipboard(param2);
                      return true;
                    }
                    if (TextLineLayout.field_c[82] &&
                      param1 == 67) {
                      this.pasteClipboardText((byte) 4);
                      return true;
                    }
                  } else {
                    if (this.caretIndex < this.widgetText.length()) {
                      stackIn_43_1 = -128;
                      if (!TextLineLayout.field_c[82]) {
                        stackIn_44_2 = this.caretIndex + 1;
                      } else {
                        stackIn_44_2 = this.findNextWordBoundary(31);
                      }
                      this.moveCaret(stackIn_43_1, stackIn_44_2);
                      return true;
                    }
                  }
                } else {
                  if (this.caretIndex > 0) {
                    stackIn_35_1 = 97;
                    if (TextLineLayout.field_c[82]) {
                      stackIn_36_2 = this.findPreviousWordBoundary(32);
                    } else {
                      stackIn_36_2 = this.caretIndex - 1;
                    }
                    this.moveCaret(stackIn_35_1, stackIn_36_2);
                    return true;
                  }
                }
              }
            } else {
              if (this.selectionAnchorIndex != this.caretIndex) {
                this.deleteSelectedText(-14642);
                return true;
              }
              if (this.caretIndex > 0) {
                this.selectionAnchorIndex = -1 + this.caretIndex;
                this.deleteSelectedText(-14642);
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
          stackIn_79_1 = new StringBuilder().append("sl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    private final void cutSelectedText(int param0) {
        this.copySelectedTextToClipboard(false);
        int var2 = -115 % ((-16 - param0) / 63);
        this.deleteSelectedText(-14642);
    }

    private final int findPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        if (0 == this.caretIndex) {
          return this.caretIndex;
        }
        if (param0 != 32) {
          this.caretBlinkStartMillis = -5L;
        }
        for (var2 = -1 + this.caretIndex; var2 > 0; var2--) {
          if (32 != this.widgetText.charAt(var2 - 1)) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final String getSelectedText(byte param0) {
        if (param0 != 63) {
          TextInputWidget.decodeBase37Name(true, -93L);
        }
        int var2 = this.selectionAnchorIndex >= this.caretIndex ? this.caretIndex : this.selectionAnchorIndex;
        int var3 = this.caretIndex <= this.selectionAnchorIndex ? this.selectionAnchorIndex : this.caretIndex;
        return this.widgetText.substring(var2, var3);
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        io var6 = null;
        long var7 = 0L;
        int var5 = 60 % ((-42 - param1) / 53);
        if (null != this.renderer &&
          param0 == 0) {
          this.renderer.paintWidget(this.enabled, param2, (byte) 77, param3, (UiWidget) (this));
          if (this.renderer instanceof io) {
            var6 = (io) ((Object) this.renderer);
            if (this.selectionAnchorIndex != this.caretIndex) {
              var6.drawSelection(this.caretIndex, this.selectionAnchorIndex, param2, param3, 154888568, (UiWidget) (this));
            }
            var7 = rl.monotonicTimeMillis((byte) -126);
            if (500L > (-this.caretBlinkStartMillis + var7) % 1000L) {
              var6.drawCaret(1, param3, this.caretIndex, param2, (UiWidget) (this));
            }
          }
        }
    }

    void notifyTextInputChanged(int param0) {
        if (this.listener instanceof TextInputListener) {
          ((TextInputListener) (this.listener)).onTextInputChanged(this, -79);
        }
        int var2 = -31 % ((param0 - 28) / 49);
    }

    static {
        field_Y = new byte[]{(byte)2, (byte)3, (byte)4, (byte)5};
        field_P = new int[8192];
        tutorialOptionBasics = "Basics";
        playerYouX2AreOut = "You and <%0> are out of lives!";
    }
}
