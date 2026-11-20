/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextField extends TextButton {
    private boolean scrollingEnabled;
    static String field_M;
    private boolean selectingWord;
    private int maxLength;
    private long caretBlinkEpochMillis;
    static int[] field_K;
    private int selectionAnchor;
    static int[] field_J;
    private int caret;
    private long lastClickMillis;
    static boolean field_R;
    private int dragAnchor;

    private final void deleteSelection(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.caret != this.selectionAnchor) {
          var2 = this.caret > this.selectionAnchor ? this.selectionAnchor : this.caret;
          var3 = this.selectionAnchor < this.caret ? this.caret : this.selectionAnchor;
          this.caret = var2;
          this.selectionAnchor = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.notifyTextChanged((byte) 100);
        }
        if (!param0) {
          return;
        }
        this.selectingWord = false;
    }

    private final void moveCaret(int param0, int param1) {
        if (param0 != -31523) {
          this.drawLayer(-33, -31, 0, 101);
          this.caret = param1;
          if (!IterableSecondaryNodeDeque.field_g[81]) {
            this.selectionAnchor = this.caret;
            return;
          }
          return;
        }
        this.caret = param1;
        if (IterableSecondaryNodeDeque.field_g[81]) {
          return;
        }
        this.selectionAnchor = this.caret;
    }

    private final void cutSelection(int param0) {
        this.copySelection(-117);
        if (param0 <= 93) {
          EditableTextField.clearSharedReferences(-47);
          this.deleteSelection(false);
          return;
        }
        this.deleteSelection(false);
    }

    private final void pasteClipboard(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(false);
            if (!param0) {
              return;
            }
            this.insertText(-127, var2);
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

    final boolean handleMousePress(int param0, int param1, int param2, UiWidget param3, byte param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.handleMousePress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.renderer instanceof TextWidgetRenderer)) {
            return false;
          }
          var8_int = ((TextWidgetRenderer) ((Object) this.renderer)).characterAtPoint(param2, (byte) 76, NodeHashTableIterator.field_g, param0, (UiWidget) (this), FullscreenErrorDialog.field_X);
          stackIn_6_1 = -31523;
          if (var8_int != -1) {
            stackIn_7_2 = var8_int;
          } else {
            stackIn_7_2 = 0;
          }
          this.moveCaret(stackIn_6_1, stackIn_7_2);
          var8_long = BoundaryLoopTracer.monotonicTimeMillis(-1);
          stackIn_10_1 = !(-this.lastClickMillis + var8_long >= 250L);
          this.selectingWord = stackIn_10_1;
          if (this.selectingWord) {
            this.selectionAnchor = this.previousWordBoundary((byte) 70);
            this.caret = this.nextWordBoundary((byte) -88);
            if (this.caret > 0 &&
              32 == this.text.charAt(this.caret - 1)) {
              this.caret = this.caret - 1;
            }
            this.dragAnchor = this.caret;
          }
          this.lastClickMillis = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("nk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        TextWidgetRenderer var5 = null;
        int var6 = 0;
        try {
          super.updateHover(param0, param1, param2, param3);
          this.scrollCaretIntoView(-62);
          if (this.pressedButton == 1) {
            if (this.renderer instanceof TextWidgetRenderer) {
              var5 = (TextWidgetRenderer) ((Object) this.renderer);
              var6 = var5.characterAtPoint(param2, (byte) 110, NodeHashTableIterator.field_g, param0, (UiWidget) (this), FullscreenErrorDialog.field_X);
              if (var6 != -1) {
                if (this.selectingWord &&
                  var6 < this.dragAnchor &&
                  var6 > this.selectionAnchor) {
                  var6 = this.dragAnchor;
                }
                this.caret = var6;
              }
            }
            this.caretBlinkEpochMillis = BoundaryLoopTracer.monotonicTimeMillis(-1);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nk.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        TextWidgetRenderer var8 = null;
        long var6 = 0L;
        if (this.renderer == null) {
          if (param0 == -9532) {
            return;
          }
          this.scrollCaretIntoView(-36);
          return;
        }
        if (param3 != 0) {
          if (param0 == -9532) {
            return;
          }
          this.scrollCaretIntoView(-36);
          return;
        }
        this.renderer.drawWidget(this.field_D, param2, -101, (UiWidget) (this), param1);
        if (this.renderer instanceof TextWidgetRenderer) {
          var8 = (TextWidgetRenderer) ((Object) this.renderer);
          if (this.caret != this.selectionAnchor) {
            var8.drawSelection(-108, param1, param2, this.caret, this.selectionAnchor, (UiWidget) (this));
          }
          var6 = BoundaryLoopTracer.monotonicTimeMillis(-1);
          if ((var6 - this.caretBlinkEpochMillis) % 1000L >= 500L) {
            if (param0 == -9532) {
              return;
            }
            this.scrollCaretIntoView(-36);
            return;
          }
          var8.drawCaret(param2, (UiWidget) (this), this.caret, (byte) -98, param1);
        }
        if (param0 == -9532) {
          return;
        }
        this.scrollCaretIntoView(-36);
    }

    private final String getSelectedText(byte param0) {
        int var3 = -83 / ((-74 - param0) / 45);
        int var2 = this.selectionAnchor >= this.caret ? this.caret : this.selectionAnchor;
        int var4 = this.selectionAnchor >= this.caret ? this.selectionAnchor : this.caret;
        return this.text.substring(var2, var4);
    }

    private final int nextWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = this.text.length();
        if (this.caret == var2) {
          return this.caret;
        }
        if (param0 != -88) {
          return -8;
        }
        for (var3 = 1 + this.caret; var2 > var3; var3++) {
          if (this.text.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    EditableTextField(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.selectingWord = false;
        this.dragAnchor = -1;
        this.lastClickMillis = 0L;
        try {
          this.maxLength = param2;
          this.renderer = MenuList.field_b.field_s;
          this.setText(true, param0, 1471);
          this.scrollingEnabled = true;
          this.caretBlinkEpochMillis = BoundaryLoopTracer.monotonicTimeMillis(-1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void insertText(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.maxLength != -1) {
            var3_int = this.maxLength - this.text.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (param0 >= -117) {
            this.selectionAnchor = -34;
          }
          if (this.caret != this.text.length()) {
            this.text = this.text.substring(0, this.caret) + param1 + this.text.substring(this.caret, this.text.length());
          } else {
            this.text = this.text + param1;
          }
          this.caret = this.caret + param1.length();
          this.selectionAnchor = this.caret;
          this.notifyTextChanged((byte) -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nk.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int previousWordBoundary(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (this.caret == 0) {
          return this.caret;
        }
        var2 = -1 + this.caret;
        var3 = 56 / ((5 - param0) / 42);
        while (var2 > 0) {
          if (32 == this.text.charAt(-1 + var2)) {
            return var2;
          }
          var2--;
        }
        return var2;
    }

    private final void notifySubmit(int param0) {
        int discarded$0 = 0;
        if (this.listener instanceof TextChangeListener) {
          ((TextChangeListener) (this.listener)).onSubmit((byte) 19, this);
          if (param0 <= 83) {
            discarded$0 = this.nextWordBoundary((byte) -112);
            return;
          }
          return;
        }
        if (param0 > 83) {
          return;
        }
        int discarded$1 = this.nextWordBoundary((byte) -112);
    }

    void notifyTextChanged(byte param0) {
        if (this.listener instanceof TextChangeListener) {
          ((TextChangeListener) (this.listener)).onTextChanged(this, -110);
        }
        int var2 = 81 % ((param0 + 44) / 59);
    }

    private final void scrollCaretIntoView(int param0) {
        int var9 = HoldTheLine.field_D;
        if (!this.scrollingEnabled) {
          this.field_m = 0;
          this.field_y = 0;
          return;
        }
        if (!(this.renderer instanceof TextWidgetRenderer)) {
          return;
        }
        TextWidgetRenderer var10 = (TextWidgetRenderer) ((Object) this.renderer);
        int var3 = 14 / ((70 - param0) / 49);
        TextLayout var4 = var10.getTextLayout((byte) 20, (UiWidget) (this));
        int var5 = var4.getWidth((byte) 98);
        int var6 = var10.getContentWidth(9, (UiWidget) (this));
        int var7 = var10.getFontHeight(true) >> 1;
        if (var6 - var7 > var5) {
          this.field_y = 0;
          this.field_m = 0;
          return;
        }
        int var8 = this.field_m + var4.getCaretX(16777215, this.caret);
        if (-var7 + var6 < var8) {
          this.field_m = this.field_m - (var8 + var7) + var6;
          if (0 < this.field_m) {
            this.field_m = 0;
            return;
          }
          if (this.field_m < -var6 + var7) {
            this.field_m = -var6 + var7;
            return;
          }
          return;
        }
        if (var8 < var7) {
          this.field_m = this.field_m + var7 - var8;
          if (0 < this.field_m) {
            this.field_m = 0;
            return;
          }
          if (this.field_m < -var6 + var7) {
            this.field_m = -var6 + var7;
            return;
          }
          return;
        }
        if (0 < this.field_m) {
          this.field_m = 0;
          return;
        }
        if (this.field_m >= -var6 + var7) {
          return;
        }
        this.field_m = -var6 + var7;
    }

    final boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.caretBlinkEpochMillis = BoundaryLoopTracer.monotonicTimeMillis(-1);
          if (param2 != -78) {
            return false;
          }
          if (param3 != 60 &&
            param3 != 62) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.selectionAnchor != this.caret) {
                this.deleteSelection(false);
              }
              if (this.maxLength == -1 ||
                !(this.text.length() >= this.maxLength)) {
                if (this.caret < this.text.length()) {
                  this.text = this.text.substring(0, this.caret) + param3 + this.text.substring(this.caret, this.text.length());
                  this.caret = this.caret + 1;
                  this.selectionAnchor = this.caret;
                } else {
                  this.text = this.text + param3;
                  dupTemp$0 = this.text.length();
                  this.caret = dupTemp$0;
                  this.selectionAnchor = dupTemp$0;
                }
                this.notifyTextChanged((byte) 126);
              }
              return true;
            }
            if (param1 == 85) {
              if (this.selectionAnchor != this.caret) {
                this.deleteSelection(false);
                return true;
              }
              if (this.caret > 0) {
                this.selectionAnchor = -1 + this.caret;
                this.deleteSelection(false);
                return true;
              }
            } else {
              if (param1 == 101) {
                if (this.selectionAnchor != this.caret) {
                  this.deleteSelection(false);
                  return true;
                }
                if (this.caret < this.text.length()) {
                  this.selectionAnchor = 1 + this.caret;
                  this.deleteSelection(false);
                  return true;
                }
              } else {
                if (13 == param1) {
                  this.clearText(1);
                  return true;
                }
                if (param1 == 96) {
                  if (0 < this.caret) {
                    stackIn_48_1 = -31523;
                    if (IterableSecondaryNodeDeque.field_g[82]) {
                      stackIn_49_2 = this.previousWordBoundary((byte) -37);
                    } else {
                      stackIn_49_2 = -1 + this.caret;
                    }
                    this.moveCaret(stackIn_48_1, stackIn_49_2);
                    return true;
                  }
                } else {
                  if (param1 == 97) {
                    if (this.caret < this.text.length()) {
                      stackIn_42_1 = -31523;
                      if (!IterableSecondaryNodeDeque.field_g[82]) {
                        stackIn_43_2 = 1 + this.caret;
                      } else {
                        stackIn_43_2 = this.nextWordBoundary((byte) -88);
                      }
                      this.moveCaret(stackIn_42_1, stackIn_43_2);
                      return true;
                    }
                  } else {
                    if (param1 == 102) {
                      this.moveCaret(-31523, 0);
                      return true;
                    }
                    if (103 == param1) {
                      this.moveCaret(-31523, this.text.length());
                      return true;
                    }
                    if (84 == param1) {
                      this.notifySubmit(93);
                      return true;
                    }
                    if (IterableSecondaryNodeDeque.field_g[82] &&
                      param1 == 65) {
                      this.cutSelection(103);
                      return true;
                    }
                    if (IterableSecondaryNodeDeque.field_g[82] &&
                      param1 == 66) {
                      this.copySelection(-73);
                      return true;
                    }
                    if (IterableSecondaryNodeDeque.field_g[82] &&
                      67 == param1) {
                      this.pasteClipboard(true);
                      return true;
                    }
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
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("nk.T(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void copySelection(int param0) {
        try {
          String var2 = this.getSelectedText((byte) -126);
          if (param0 > -37) {
            this.scrollingEnabled = false;
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) -20))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
            return;
          }
          if (var2.length() <= 0) {
            return;
          }
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) -20))), (java.awt.datatransfer.ClipboardOwner) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setText(boolean param0, String param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          if (param2 != 1471) {
            this.clearText(114);
          }
          this.text = param1;
          var4_int = param1.length();
          if (this.maxLength != -1 &&
            this.maxLength < var4_int) {
            this.text = this.text.substring(0, this.maxLength);
          }
          dupTemp$1 = this.text.length();
          this.selectionAnchor = dupTemp$1;
          this.caret = dupTemp$1;
          if (param0) {
            return;
          }
          this.notifyTextChanged((byte) 19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("nk.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final void clearText(int param0) {
        this.caret = 0;
        this.text = "";
        this.selectionAnchor = 0;
        this.notifyTextChanged((byte) 105);
        if (param0 != 1) {
          this.pasteClipboard(true);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_M = null;
        field_J = null;
        if (param0 != 3875) {
          return;
        }
        field_K = null;
    }

    static {
        field_M = "Create a free account to";
    }
}
