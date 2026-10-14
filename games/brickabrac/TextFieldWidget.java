/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextFieldWidget extends FocusableWidget {
    private long lastPressMillis;
    private int maxLength;
    private boolean doubleClickSelection;
    private int selectionAnchor;
    static int field_S;
    private int caretIndex;
    static UiComponent field_K;
    private boolean autoScrollCaret;
    private int wordSelectionEnd;
    private long caretBlinkStartMillis;

    final void clearText(boolean obfuscationGuard) {
        this.selectionAnchor = 0;
        this.text = "";
        this.caretIndex = 0;
        this.notifyTextChanged(122);
        if (obfuscationGuard) {
          field_S = 97;
        }
    }

    public static void i(int param0) {
        if (param0 < 63) {
          return;
        }
        field_K = null;
    }

    private final void deleteSelection(int obfuscationGuard) {
        int var2 = 0;
        int var3 = 0;
        if (this.selectionAnchor != this.caretIndex) {
          var2 = this.selectionAnchor >= this.caretIndex ? this.caretIndex : this.selectionAnchor;
          var3 = this.selectionAnchor < this.caretIndex ? this.caretIndex : this.selectionAnchor;
          this.selectionAnchor = var2;
          this.caretIndex = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.notifyTextChanged(46);
        }
        if (obfuscationGuard >= -34) {
          String var4 = (String) null;
          this.insertClipboardText(false, (String) null);
        }
    }

    TextFieldWidget(String text, WidgetListener listener, int maxLength) {
        super(text, listener);
        this.lastPressMillis = 0L;
        this.doubleClickSelection = false;
        this.wordSelectionEnd = -1;
        try {
          this.renderer = PopupWidgetLayer.widgetTheme.textFieldRenderer;
          this.maxLength = maxLength;
          this.setText(text, -12592, true);
          this.autoScrollCaret = true;
          this.caretBlinkStartMillis = MonotonicTime.nowMillis(false);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "vb.<init>(" + (text != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + maxLength + ')');
        }
    }

    private final int nextWordBoundary(byte obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = this.text.length();
        if (var2 == this.caretIndex) {
          return this.caretIndex;
        }
        if (obfuscationGuard < 93) {
          return -128;
        }
        for (var3 = this.caretIndex + 1; var3 < var2; var3++) {
          if (this.text.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void f(byte param0) {
        WidgetTextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        WidgetLayoutProvider var9;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (!this.autoScrollCaret) {
          this.textOffsetX = 0;
          this.textOffsetY = 0;
          return;
        }
        if (!(this.renderer instanceof WidgetLayoutProvider)) {
          return;
        }
        if (param0 != 81) {
          this.selectionAnchor = 16;
        }
        var9 = (WidgetLayoutProvider) ((Object) this.renderer);
        var3 = var9.getTextLayout((Widget) (this), -3);
        var4 = var3.getRightEdge(31458);
        var5 = var9.getTextAreaWidth(61823, (Widget) (this));
        var6 = var9.getLineHeight((byte) 99) >> 1;
        if (var4 < var5 - var6) {
          this.textOffsetY = 0;
          this.textOffsetX = 0;
          return;
        }
        var7 = this.textOffsetX + var3.getCaretX(this.caretIndex, (byte) -108);
        if (-var6 + var5 < var7) {
          this.textOffsetX = -var7 - (-var5 + var6 - this.textOffsetX);
        } else {
          if (var7 < var6) {
            this.textOffsetX = var6 - (var7 - this.textOffsetX);
          }
        }
        if (this.textOffsetX > 0) {
          this.textOffsetX = 0;
        } else {
          if (this.textOffsetX < -var5 + var6) {
            this.textOffsetX = var6 - var5;
          }
        }
        return;
    }

    private final void insertClipboardText(boolean copyToClipboard, String text) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.maxLength != -1) {
            var3_int = this.maxLength - this.text.length();
            if (var3_int >= 0) {
              return;
            }
            text = text.substring(0, var3_int);
          }
          if (this.caretIndex == this.text.length()) {
            this.text = this.text + text;
          } else {
            this.text = this.text.substring(0, this.caretIndex) + text + this.text.substring(this.caretIndex, this.text.length());
          }
          this.caretIndex = this.caretIndex + text.length();
          this.selectionAnchor = this.caretIndex;
          if (copyToClipboard) {
            this.l(95);
            this.notifyTextChanged(80);
          } else {
            this.notifyTextChanged(80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vb.U(").append(copyToClipboard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int var6 = 0;
        WidgetLayoutProvider var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.f((byte) 81);
          if (this.pressedButton == 1) {
            if (this.renderer instanceof WidgetLayoutProvider) {
              var7 = (WidgetLayoutProvider) ((Object) this.renderer);
              var6 = var7.findTextSourceOffset((Widget) (this), MusicPatch.pointerX, true, parentY, ResourcePreparationEntry.pointerY, parentX);
              if (var6 != -1) {
                if (this.doubleClickSelection &&
                  this.wordSelectionEnd > var6 &&
                  var6 > this.selectionAnchor) {
                  var6 = this.wordSelectionEnd;
                }
                this.caretIndex = var6;
              }
            }
            this.caretBlinkStartMillis = MonotonicTime.nowMillis(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vb.WA(");
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    private final void m(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 != 32) {
            field_S = 68;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(param0 ^ -8);
            this.insertClipboardText(false, var2);
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

    final void setText(String text, int obfuscationGuard, boolean suppressChangeCallback) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        String var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (text == null) {
            text = "";
          }
          this.text = text;
          var4_int = text.length();
          if (this.maxLength != -1 &&
            this.maxLength < var4_int) {
            this.text = this.text.substring(0, this.maxLength);
          }
          dupTemp$1 = this.text.length();
          this.selectionAnchor = dupTemp$1;
          this.caretIndex = dupTemp$1;
          if (!suppressChangeCallback) {
            this.notifyTextChanged(19);
          }
          if (obfuscationGuard != -12592) {
            var5 = (String) null;
            this.setText((String) null, 58, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vb.F(");
          if (text == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(',').append(suppressChangeCallback).append(')').toString());
        }
    }

    private final void l(int param0) {
        String var2 = this.getSelectedText((byte) -108);
        if (!(var2.length() <= param0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) -124))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, int param1) {
        this.caretIndex = param0;
        if (!IntArrayRequest.heldKeys[param1]) {
          this.selectionAnchor = this.caretIndex;
        }
    }

    private final void notifySubmitted(int obfuscationGuard) {
        if (obfuscationGuard != -66) {
          this.doubleClickSelection = false;
        }
        if (this.listener instanceof TextFieldListener) {
          ((TextFieldListener) (this.listener)).onSubmitted(this, -40);
        }
    }

    void notifyTextChanged(int obfuscationGuard) {
        if (this.listener instanceof TextFieldListener) {
          ((TextFieldListener) (this.listener)).onTextChanged(this, (byte) -100);
        }
        if (obfuscationGuard <= 7) {
          TextFieldWidget.i(41);
        }
    }

    private final int previousWordBoundary(boolean obfuscationGuard) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (this.caretIndex == 0) {
          return this.caretIndex;
        }
        for (var2 = -1 + this.caretIndex; var2 > 0; var2--) {
          if (this.text.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        if (obfuscationGuard) {
          this.selectionAnchor = -72;
        }
        return var2;
    }

    private final String getSelectedText(byte obfuscationGuard) {
        int var2 = this.selectionAnchor >= this.caretIndex ? this.caretIndex : this.selectionAnchor;
        if (obfuscationGuard > -97) {
          return (String) null;
        }
        int var3 = this.selectionAnchor < this.caretIndex ? this.caretIndex : this.selectionAnchor;
        return this.text.substring(var2, var3);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        WidgetLayoutProvider var5 = null;
        long var6 = 0L;
        if (obfuscationGuard != -11) {
          return;
        }
        if (null != this.renderer &&
          layer == 0) {
          this.renderer.paintWidget(this.enabled, -20618, parentX, (Widget) (this), parentY);
          if (this.renderer instanceof WidgetLayoutProvider) {
            var5 = (WidgetLayoutProvider) ((Object) this.renderer);
            if (this.caretIndex != this.selectionAnchor) {
              var5.paintTextSelection(-15964, parentY, parentX, this.selectionAnchor, this.caretIndex, (Widget) (this));
            }
            var6 = MonotonicTime.nowMillis(false);
            if ((var6 - this.caretBlinkStartMillis) % 1000L < 500L) {
              var5.paintTextCaret((Widget) (this), parentX, this.caretIndex, parentY, (byte) 123);
            }
          }
        }
    }

    final static void k(int param0) {
        if (!LevelPackSelectScreen.field_s) {
          throw new IllegalStateException();
        }
        SpaceBackground.field_t = true;
        RankingsScreen.a((byte) -71, true);
        AchievementIcon.field_j = param0;
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        int dupTemp$0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.caretBlinkStartMillis = MonotonicTime.nowMillis(false);
          if (obfuscationGuard != 110) {
            field_S = 20;
          }
          if (character != 60 &&
            62 != character) {
            if (character >= 32 &&
              character <= 126) {
              if (this.caretIndex != this.selectionAnchor) {
                this.deleteSelection(-84);
              }
              if (-1 == this.maxLength ||
                !(this.text.length() >= this.maxLength)) {
                if (this.caretIndex >= this.text.length()) {
                  this.text = this.text + character;
                  dupTemp$0 = this.text.length();
                  this.caretIndex = dupTemp$0;
                  this.selectionAnchor = dupTemp$0;
                } else {
                  this.text = this.text.substring(0, this.caretIndex) + character + this.text.substring(this.caretIndex, this.text.length());
                  this.caretIndex = this.caretIndex + 1;
                  this.selectionAnchor = this.caretIndex;
                }
                this.notifyTextChanged(66);
              }
              return true;
            }
            if (keyCode != 85) {
              if (keyCode == 101) {
                if (this.caretIndex != this.selectionAnchor) {
                  this.deleteSelection(-114);
                  return true;
                }
                if (this.caretIndex < this.text.length()) {
                  this.selectionAnchor = this.caretIndex + 1;
                  this.deleteSelection(obfuscationGuard - 182);
                  return true;
                }
              } else {
                if (keyCode == 13) {
                  this.clearText(false);
                  return true;
                }
                if (96 == keyCode) {
                  if (this.caretIndex <= 0) {
                    return false;
                  }
                  if (!IntArrayRequest.heldKeys[82]) {
                    stackIn_38_1 = this.caretIndex - 1;
                  } else {
                    stackIn_38_1 = this.previousWordBoundary(false);
                  }
                  this.a(stackIn_38_1, obfuscationGuard - 29);
                  return true;
                }
                if (keyCode == 97) {
                  if (this.caretIndex < this.text.length()) {
                    if (!IntArrayRequest.heldKeys[82]) {
                      stackIn_69_1 = this.caretIndex + 1;
                    } else {
                      stackIn_69_1 = this.nextWordBoundary((byte) 106);
                    }
                    this.a(stackIn_69_1, 81);
                    return true;
                  }
                } else {
                  if (keyCode == 102) {
                    this.a(0, 81);
                    return true;
                  }
                  if (keyCode == 103) {
                    this.a(this.text.length(), 81);
                    return true;
                  }
                  if (keyCode == 84) {
                    this.notifySubmitted(-66);
                    return true;
                  }
                  if (IntArrayRequest.heldKeys[82] &&
                    keyCode == 65) {
                    this.g((byte) -49);
                    return true;
                  }
                  if (IntArrayRequest.heldKeys[82] &&
                    66 == keyCode) {
                    this.l(0);
                    return true;
                  }
                  if (IntArrayRequest.heldKeys[82] &&
                    67 == keyCode) {
                    this.m(32);
                    return true;
                  }
                }
              }
            } else {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(obfuscationGuard ^ -55);
                return true;
              }
              if (this.caretIndex > 0) {
                this.selectionAnchor = -1 + this.caretIndex;
                this.deleteSelection(obfuscationGuard ^ -41);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("vb.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(character).append(')').toString());
        }
    }

    private final void g(byte param0) {
        this.l(param0 ^ -49);
        this.deleteSelection(-118);
        if (param0 != -49) {
          this.caretBlinkStartMillis = -103L;
        }
    }

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
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
          if (!super.handlePointerPress(focusRoot, pointerX, parentX, parentY, button, pointerY, obfuscationGuard + obfuscationGuard)) {
            return false;
          }
          if (!(this.renderer instanceof WidgetLayoutProvider)) {
            return false;
          }
          var8_int = ((WidgetLayoutProvider) ((Object) this.renderer)).findTextSourceOffset((Widget) (this), MusicPatch.pointerX, true, parentY, ResourcePreparationEntry.pointerY, parentX);
          if (var8_int == -1) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = var8_int;
          }
          this.a(stackIn_7_1, 81);
          var8_long = MonotonicTime.nowMillis(false);
          stackIn_10_1 = !(-this.lastPressMillis + var8_long >= 250L);
          this.doubleClickSelection = stackIn_10_1;
          if (this.doubleClickSelection) {
            this.selectionAnchor = this.previousWordBoundary(false);
            this.caretIndex = this.nextWordBoundary((byte) 103);
            if (this.caretIndex > 0 &&
              this.text.charAt(-1 + this.caretIndex) == 32) {
              this.caretIndex = this.caretIndex - 1;
            }
            this.wordSelectionEnd = this.caretIndex;
          }
          this.lastPressMillis = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("vb.MA(");
          if (focusRoot == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
