/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputWidget extends InteractiveWidget {
    private long lastClickMillis;
    private int maxLength;
    static float[] field_N;
    private boolean wordSelection;
    private int selectionAnchor;
    private long caretBlinkStartMillis;
    private int caret;
    static float[] field_M;
    private int wordSelectionEnd;
    private boolean scrollToCaretEnabled;
    static int[] field_H;

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (guard >= -42) {
            this.wordSelection = true;
          }
          if (!super.onPointerPressed(root, -128, pointerY, button, parentX, pointerX, parentY)) {
            return false;
          }
          if (!(this.renderer instanceof TextWidgetLayout)) {
            return false;
          }
          var8_int = ((TextWidgetLayout) ((Object) this.renderer)).characterAtPoint(parentX, (UiWidget) (this), ko.field_p, pi.field_e, -4059, parentY);
          stackIn_7_1 = 124;
          if (-1 != var8_int) {
            stackIn_8_2 = var8_int;
          } else {
            stackIn_8_2 = 0;
          }
          this.moveCaret(stackIn_7_1, stackIn_8_2);
          var8_long = wq.a(-17);
          stackIn_11_1 = !(250L <= var8_long - this.lastClickMillis);
          this.wordSelection = stackIn_11_1;
          if (this.wordSelection) {
            this.selectionAnchor = this.previousWordBoundary(14236);
            this.caret = this.nextWordBoundary(true);
            if (this.caret > 0 &&
              this.text.charAt(this.caret - 1) == 32) {
              this.caret = this.caret - 1;
            }
            this.wordSelectionEnd = this.caret;
          }
          this.lastClickMillis = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("dh.R(");
          if (root == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    private final void moveCaret(int guard, int position) {
        if (guard < 84) {
          this.maxLength = 55;
        }
        this.caret = position;
        if (!hw.field_b[81]) {
          this.selectionAnchor = this.caret;
        }
    }

    final static int b(int param0, int param1, boolean param2) {
        if (param2) {
          field_N = (float[]) null;
        }
        int var3 = param0 >>> 31;
        return (var3 + param0) / param1 - var3;
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_M = null;
        field_N = null;
        if (param0 != 82) {
          field_N = (float[]) null;
        }
    }

    private final String selectedText(int guard) {
        if (guard > -99) {
          this.wordSelection = true;
        }
        int var2 = this.selectionAnchor < this.caret ? this.selectionAnchor : this.caret;
        int var3 = this.caret > this.selectionAnchor ? this.caret : this.selectionAnchor;
        return this.text.substring(var2, var3);
    }

    private final void pasteClipboard(int guard) {
        try {
          String var2 = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection((byte) -80);
            this.insertText(true, var2);
          } catch (Exception exception) {
          }
          if (guard != -1) {
            this.scrollToCaretEnabled = true;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void insertText(boolean guard, String insertedText) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!guard) {
            this.lastClickMillis = -107L;
          }
          if (this.maxLength != -1) {
            var3_int = this.maxLength - this.text.length();
            if (var3_int >= 0) {
              return;
            }
            insertedText = insertedText.substring(0, var3_int);
          }
          if (this.caret == this.text.length()) {
            this.text = this.text + insertedText;
          } else {
            this.text = this.text.substring(0, this.caret) + insertedText + this.text.substring(this.caret, this.text.length());
          }
          this.caret = this.caret + insertedText.length();
          this.selectionAnchor = this.caret;
          this.notifyChanged((byte) 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("dh.V(").append(guard).append(',');
          if (insertedText == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final int previousWordBoundary(int guard) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.caret == 0) {
          return this.caret;
        }
        if (guard != 14236) {
          return 31;
        }
        for (var2 = -1 + this.caret; var2 > 0; var2--) {
          if (this.text.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    TextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.lastClickMillis = 0L;
        this.wordSelection = false;
        this.wordSelectionEnd = -1;
        try {
          this.maxLength = param2;
          this.renderer = ks.field_x.field_j;
          this.setText(true, param0, (byte) 118);
          this.scrollToCaretEnabled = true;
          this.caretBlinkStartMillis = wq.a(-9);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setText(boolean suppressNotification, String newText, byte guard) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (newText == null) {
            newText = "";
          }
          this.text = newText;
          var4_int = newText.length();
          if (this.maxLength != -1 &&
            var4_int > this.maxLength) {
            this.text = this.text.substring(0, this.maxLength);
          }
          dupTemp$1 = this.text.length();
          this.selectionAnchor = dupTemp$1;
          this.caret = dupTemp$1;
          if (!suppressNotification) {
            this.notifyChanged((byte) 103);
          }
          if (guard < 3) {
            field_N = (float[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("dh.O(").append(suppressNotification).append(',');
          if (newText == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        int dupTemp$0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_2 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.caretBlinkStartMillis = wq.a(-6);
          if (character == 60) {
            return false;
          }
          if (62 == character) {
            return false;
          }
          if (guard <= 9) {
            return false;
          }
          if (32 <= character &&
            126 >= character) {
            if (this.caret != this.selectionAnchor) {
              this.deleteSelection((byte) -71);
            }
            if (-1 == this.maxLength ||
              !(this.text.length() >= this.maxLength)) {
              if (this.caret >= this.text.length()) {
                this.text = this.text + character;
                dupTemp$0 = this.text.length();
                this.caret = dupTemp$0;
                this.selectionAnchor = dupTemp$0;
              } else {
                this.text = this.text.substring(0, this.caret) + character + this.text.substring(this.caret, this.text.length());
                this.caret = this.caret + 1;
                this.selectionAnchor = this.caret;
              }
              this.notifyChanged((byte) 124);
            }
            return true;
          }
          if (keyCode == 85) {
            if (this.caret != this.selectionAnchor) {
              this.deleteSelection((byte) 122);
              return true;
            }
            if (0 < this.caret) {
              this.selectionAnchor = -1 + this.caret;
              this.deleteSelection((byte) 127);
              return true;
            }
          } else {
            if (101 != keyCode) {
              if (keyCode == 13) {
                this.clearText(-1);
                return true;
              }
              if (96 == keyCode) {
                if (this.caret > 0) {
                  stackIn_56_1 = 127;
                  if (hw.field_b[82]) {
                    stackIn_57_2 = this.previousWordBoundary(14236);
                  } else {
                    stackIn_57_2 = -1 + this.caret;
                  }
                  this.moveCaret(stackIn_56_1, stackIn_57_2);
                  return true;
                }
              } else {
                if (keyCode != 97) {
                  if (keyCode == 102) {
                    this.moveCaret(93, 0);
                    return true;
                  }
                  if (keyCode == 103) {
                    this.moveCaret(121, this.text.length());
                    return true;
                  }
                  if (keyCode == 84) {
                    this.notifySubmitted((byte) -106);
                    return true;
                  }
                  if (hw.field_b[82] &&
                    keyCode == 65) {
                    this.cutSelection(96);
                    return true;
                  }
                  if (hw.field_b[82] &&
                    keyCode == 66) {
                    this.copySelection(false);
                    return true;
                  }
                  if (hw.field_b[82] &&
                    keyCode == 67) {
                    this.pasteClipboard(-1);
                    return true;
                  }
                } else {
                  if (this.caret < this.text.length()) {
                    stackIn_26_1 = 111;
                    if (!hw.field_b[82]) {
                      stackIn_27_2 = this.caret + 1;
                    } else {
                      stackIn_27_2 = this.nextWordBoundary(true);
                    }
                    this.moveCaret(stackIn_26_1, stackIn_27_2);
                    return true;
                  }
                }
              }
            } else {
              if (this.caret != this.selectionAnchor) {
                this.deleteSelection((byte) 123);
                return true;
              }
              if (this.caret < this.text.length()) {
                this.selectionAnchor = this.caret + 1;
                this.deleteSelection((byte) -69);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("dh.KA(");
          if (root == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final void deleteSelection(byte guard) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.caret != this.selectionAnchor) {
          var2 = this.selectionAnchor >= this.caret ? this.caret : this.selectionAnchor;
          var3 = this.selectionAnchor < this.caret ? this.caret : this.selectionAnchor;
          this.caret = var2;
          this.selectionAnchor = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.notifyChanged((byte) 81);
        }
        var2Lifetime1 = -67 / ((85 - guard) / 37);
    }

    private final void notifySubmitted(byte guard) {
        if (this.listener instanceof TextInputListener) {
          ((TextInputListener) (this.listener)).onTextSubmitted(this, -66);
        }
        if (guard != -106) {
          this.notifyChanged((byte) -55);
        }
    }

    private final void cutSelection(int guard) {
        if (guard != 96) {
          return;
        }
        this.copySelection(false);
        this.deleteSelection((byte) 123);
    }

    private final void ensureCaretVisible(byte guard) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        TextWidgetLayout var9;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (!this.scrollToCaretEnabled) {
          this.textOffsetX = 0;
          this.textOffsetY = 0;
          return;
        }
        if (!(this.renderer instanceof TextWidgetLayout)) {
          return;
        }
        var9 = (TextWidgetLayout) ((Object) this.renderer);
        var3 = var9.layoutText(-3, (UiWidget) (this));
        var4 = var3.maximumRightEdge((byte) -15);
        if (guard != -44) {
          field_H = (int[]) null;
        }
        var5 = var9.contentWidth(guard ^ -120, (UiWidget) (this));
        var6 = var9.lineHeight(14763) >> 1;
        if (-var6 + var5 > var4) {
          this.textOffsetY = 0;
          this.textOffsetX = 0;
          return;
        }
        var7 = this.textOffsetX + var3.caretX((byte) 113, this.caret);
        if (-var6 + var5 >= var7) {
          if (var6 > var7) {
            this.textOffsetX = -var7 + var6 + this.textOffsetX;
          }
        } else {
          this.textOffsetX = -var7 - (-var5 + (var6 - this.textOffsetX));
        }
        if (this.textOffsetX <= 0) {
          if (var6 - var5 > this.textOffsetX) {
            this.textOffsetX = -var5 + var6;
          }
        } else {
          this.textOffsetX = 0;
        }
        return;
    }

    final void clearText(int guard) {
        this.caret = 0;
        this.selectionAnchor = 0;
        this.text = "";
        this.notifyChanged((byte) 104);
        if (guard != -1) {
          this.scrollToCaretEnabled = true;
        }
    }

    private final void copySelection(boolean guard) {
        String var2 = this.selectedText(-115);
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.selectedText(-116))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (guard) {
          this.ensureCaretVisible((byte) -38);
        }
    }

    void update(int parentX, int guard, UiWidget root, int parentY) {
        int var5_int = 0;
        TextWidgetLayout var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.update(parentX, 62, root, parentY);
          var5_int = 109 % ((-25 - guard) / 45);
          this.ensureCaretVisible((byte) -44);
          if (this.pressedButton == 1) {
            if (this.renderer instanceof TextWidgetLayout) {
              var6 = (TextWidgetLayout) ((Object) this.renderer);
              var7 = var6.characterAtPoint(parentX, (UiWidget) (this), ko.field_p, pi.field_e, -4059, parentY);
              if (var7 != -1) {
                if (this.wordSelection &&
                  this.wordSelectionEnd > var7 &&
                  this.selectionAnchor < var7) {
                  var7 = this.wordSelectionEnd;
                }
                this.caret = var7;
              }
            }
            this.caretBlinkStartMillis = wq.a(-93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dh.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(parentY).append(')').toString());
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        TextWidgetLayout var8 = null;
        long var6 = 0L;
        int discarded$0 = 0;
        if (null != this.renderer &&
          layer == 0) {
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, this.enabled, parentX);
          if (this.renderer instanceof TextWidgetLayout) {
            var8 = (TextWidgetLayout) ((Object) this.renderer);
            if (this.caret != this.selectionAnchor) {
              var8.drawSelection(parentX, this.selectionAnchor, 0, this.caret, (UiWidget) (this), parentY);
            }
            var6 = wq.a(-6);
            if (500L > (-this.caretBlinkStartMillis + var6) % 1000L) {
              var8.drawCaret(1, parentX, parentY, this.caret, (UiWidget) (this));
            }
          }
        }
        if (guard >= -35) {
          discarded$0 = this.nextWordBoundary(false);
        }
    }

    private final int nextWordBoundary(boolean guard) {
        int var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (!guard) {
          this.ensureCaretVisible((byte) -32);
        }
        var2 = this.text.length();
        if (this.caret == var2) {
          return this.caret;
        }
        for (var3 = this.caret + 1; var2 > var3; var3++) {
          if (32 != this.text.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    void notifyChanged(byte guard) {
        if (this.listener instanceof TextInputListener) {
          ((TextInputListener) (this.listener)).onTextChanged(this, (byte) -128);
        }
        if (guard <= 78) {
          TextInputWidget.releaseStatics(5);
        }
    }

    static {
        int var2 = 0;
        field_N = new float[16384];
        field_M = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          field_N[var2] = (float)Math.sin(var0 * (double)var2);
          field_M[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_H = new int[2];
    }
}
