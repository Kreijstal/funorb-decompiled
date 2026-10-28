/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextWidget extends TextButton {
    private boolean field_J;
    static Sprite[] field_E;
    private int field_N;
    private long field_G;
    private boolean field_M;
    static int[] field_I;
    static TrackerMusicDefinition field_O;
    private long field_D;
    private int maximumLength;
    private int selectionAnchor;
    private int caretIndex;

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        int stackIn_49_1 = 0;
        int stackIn_55_1 = 0;
        String stackIn_81_2 = null;
        try {
          this.field_G = MonotonicClockSupport.monotonicMillis(128);
          if (guard < 0) {
            this.cutSelection((byte) 21);
          }
          if (character != 60 &&
            62 != character) {
            if (character >= 32 &&
              126 >= character) {
              if (this.caretIndex != this.selectionAnchor) {
                this.deleteSelection(0);
              }
              if (this.maximumLength == -1 ||
                !(this.text.length() >= this.maximumLength)) {
                if (this.caretIndex >= this.text.length()) {
                  this.text = this.text + character;
                  int dupTemp$0 = this.text.length();
                  this.caretIndex = dupTemp$0;
                  this.selectionAnchor = dupTemp$0;
                } else {
                  this.text = this.text.substring(0, this.caretIndex) + character + this.text.substring(this.caretIndex, this.text.length());
                  this.caretIndex = this.caretIndex + 1;
                  this.selectionAnchor = this.caretIndex;
                }
                this.notifyTextChanged(false);
              }
              return true;
            }
            if (keyCode == 85) {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(0);
                return true;
              }
              if (this.caretIndex > 0) {
                this.selectionAnchor = this.caretIndex - 1;
                this.deleteSelection(0);
                return true;
              }
            } else if (keyCode != 101) {
              if (keyCode == 13) {
                this.clearText((byte) -29);
                return true;
              }
              if (keyCode != 96) {
                if (97 == keyCode) {
                  if (this.caretIndex >= this.text.length()) {
                    return false;
                  }
                  if (ScoreSubmission.field_h[82]) {
                    stackIn_49_1 = this.nextWordBoundary(1);
                  } else {
                    stackIn_49_1 = this.caretIndex + 1;
                  }
                  this.moveCaret(stackIn_49_1, 121);
                  return true;
                }
                if (102 == keyCode) {
                  this.moveCaret(0, 33);
                  return true;
                }
                if (keyCode == 103) {
                  this.moveCaret(this.text.length(), 115);
                  return true;
                }
                if (keyCode == 84) {
                  this.notifySubmit(0);
                  return true;
                }
                if (ScoreSubmission.field_h[82] &&
                  keyCode == 65) {
                  this.cutSelection((byte) 8);
                  return true;
                }
                if (ScoreSubmission.field_h[82] &&
                  66 == keyCode) {
                  this.copySelection((byte) 104);
                  return true;
                }
                if (ScoreSubmission.field_h[82] &&
                  keyCode == 67) {
                  this.pasteClipboard(87);
                  return true;
                }
              } else if (this.caretIndex > 0) {
                if (!ScoreSubmission.field_h[82]) {
                  stackIn_55_1 = -1 + this.caretIndex;
                } else {
                  stackIn_55_1 = this.previousWordBoundary(-94);
                }
                this.moveCaret(stackIn_55_1, 22);
                return true;
              }
            } else {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(0);
                return true;
              }
              if (this.caretIndex < this.text.length()) {
                this.selectionAnchor = this.caretIndex + 1;
                this.deleteSelection(0);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_80_0 = var5;
          StringBuilder stackIn_80_1 = new StringBuilder().append("ul.G(");
          if (root == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    private final String selectedText(int guard) {
        int var2 = this.selectionAnchor < this.caretIndex ? this.selectionAnchor : this.caretIndex;
        if (guard == 100) {
          int var3 = this.caretIndex > this.selectionAnchor ? this.caretIndex : this.selectionAnchor;
          return this.text.substring(var2, var3);
        }
        return (String) null;
    }

    void notifyTextChanged(boolean guard) {
        if (this.listener instanceof TextInputListener) {
          ((TextInputListener) (this.listener)).onTextChanged(this, 0);
          if (guard) {
            field_O = (TrackerMusicDefinition) null;
            return;
          }
          return;
        }
        if (!guard) {
          return;
        }
        field_O = (TrackerMusicDefinition) null;
    }

    private final int nextWordBoundary(int offset) {
        int var3;
        int var4 = EscapeVector.obfuscationControl;
        int var2 = this.text.length();
        if (var2 == this.caretIndex) {
          return this.caretIndex;
        }
        for (var3 = offset + this.caretIndex; var2 > var3; var3++) {
          if (this.text.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    final static int cosQ16(int guard, int angle) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        angle = angle & 8191;
        if (guard <= -124) {
          if (angle < 4096) {
            if (angle >= 2048) {
              stackIn_19_0 = -PasswordFieldPainter.field_t[-2048 + angle];
            } else {
              stackIn_19_0 = PasswordFieldPainter.field_t[-angle + 2048];
            }
            return stackIn_19_0;
          }
          if (angle < 6144) {
            stackIn_15_0 = -PasswordFieldPainter.field_t[6144 - angle];
          } else {
            stackIn_15_0 = PasswordFieldPainter.field_t[-6144 + angle];
          }
          return stackIn_15_0;
        }
        EditableTextWidget.cosQ16(-64, 14);
        if (angle < 4096) {
          if (angle >= 2048) {
            stackIn_9_0 = -PasswordFieldPainter.field_t[-2048 + angle];
          } else {
            stackIn_9_0 = PasswordFieldPainter.field_t[-angle + 2048];
          }
          return stackIn_9_0;
        }
        if (angle < 6144) {
          stackIn_5_0 = -PasswordFieldPainter.field_t[6144 - angle];
        } else {
          stackIn_5_0 = PasswordFieldPainter.field_t[-6144 + angle];
        }
        return stackIn_5_0;
    }

    private final void notifySubmit(int guard) {
        if (this.listener instanceof TextInputListener) {
          ((TextInputListener) (this.listener)).onSubmit(true, this);
          if (guard != 0) {
            EditableTextWidget.a(-65, 47, 47);
            return;
          }
          return;
        }
        if (guard == 0) {
          return;
        }
        EditableTextWidget.a(-65, 47, 47);
    }

    final void setText(String text, boolean suppressNotification, int guard) {
        String stackIn_15_2 = null;
        try {
          if (guard != -33) {
            this.clearText((byte) 111);
          }
          if (text == null) {
            text = "";
          }
          this.text = text;
          int var4_int = text.length();
          if (this.maximumLength != -1 &&
            var4_int > this.maximumLength) {
            this.text = this.text.substring(0, this.maximumLength);
          }
          int dupTemp$1 = this.text.length();
          this.selectionAnchor = dupTemp$1;
          this.caretIndex = dupTemp$1;
          if (suppressNotification) {
            return;
          }
          this.notifyTextChanged(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ul.DA(");
          if (text == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(suppressNotification).append(',').append(guard).append(')').toString());
        }
    }

    private final void insertText(byte guard, String insertedText) {
        String stackIn_15_2 = null;
        try {
          if (this.maximumLength != -1) {
            int var3_int = this.maximumLength - this.text.length();
            if (0 <= var3_int) {
              return;
            }
            insertedText = insertedText.substring(0, var3_int);
          }
          if (guard != -120) {
            this.field_J = false;
          }
          if (this.caretIndex != this.text.length()) {
            this.text = this.text.substring(0, this.caretIndex) + insertedText + this.text.substring(this.caretIndex, this.text.length());
          } else {
            this.text = this.text + insertedText;
          }
          this.caretIndex = this.caretIndex + insertedText.length();
          this.selectionAnchor = this.caretIndex;
          this.notifyTextChanged(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var3;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ul.W(").append(guard).append(',');
          if (insertedText == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        int stackIn_6_1 = 0;
        String stackIn_22_2 = null;
        try {
          if (!super.onPointerPressed(offsetY, pointerX, guard, pointerY, offsetX, root, button)) {
            return false;
          }
          if (!(this.painter instanceof WidgetTextLayout)) {
            return false;
          }
          int var8_int = ((WidgetTextLayout) ((Object) this.painter)).characterIndexAtPosition(offsetX, offsetY, UiContainer.field_y, GzipDecoder.field_d, 118, (UiComponent) (this));
          stackIn_6_1 = (var8_int == -1) ? (0) : (var8_int);
          this.moveCaret(stackIn_6_1, 61);
          long var8_long = MonotonicClockSupport.monotonicMillis(guard + 125);
          boolean stackIn_9_1 = !(-this.field_D + var8_long >= 250L);
          this.field_M = stackIn_9_1;
          if (this.field_M) {
            this.selectionAnchor = this.previousWordBoundary(-121);
            this.caretIndex = this.nextWordBoundary(1);
            if (this.caretIndex > 0 &&
              this.text.charAt(-1 + this.caretIndex) == 32) {
              this.caretIndex = this.caretIndex - 1;
            }
            this.field_N = this.caretIndex;
          }
          this.field_D = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var8;
          StringBuilder stackIn_21_1 = new StringBuilder().append("ul.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(button).append(')').toString());
        }
    }

    final static Sprite a(int param0, int param1, ResourceArchive param2, byte param3) {
        String stackIn_9_2 = null;
        try {
          if (param3 <= 3) {
            EditableTextWidget.releaseStatics((byte) -115);
          }
          if (ArchivePreloader.loadSpriteSheet(param2, 105, param0, param1)) {
            return AccountFormStage.buildRgbSpriteFromSheet((byte) 108);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ul.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int previousWordBoundary(int guard) {
        int var2;
        int var4 = EscapeVector.obfuscationControl;
        if (this.caretIndex == 0) {
          return this.caretIndex;
        }
        int var3 = -8 % ((guard - 6) / 38);
        for (var2 = this.caretIndex - 1; var2 > 0; var2--) {
          if (this.text.charAt(var2 - 1) == 32) {
            return var2;
          }
        }
        return var2;
    }

    public static void releaseStatics(byte guard) {
        field_O = null;
        if (guard > -52) {
          field_O = (TrackerMusicDefinition) null;
          field_E = null;
          field_I = null;
          return;
        }
        field_E = null;
        field_I = null;
    }

    private final void moveCaret(int index, int guard) {
        if (guard < 17) {
          EditableTextWidget.releaseStatics((byte) -102);
          this.caretIndex = index;
          if (!ScoreSubmission.field_h[81]) {
            this.selectionAnchor = this.caretIndex;
            return;
          }
          return;
        }
        this.caretIndex = index;
        if (ScoreSubmission.field_h[81]) {
          return;
        }
        this.selectionAnchor = this.caretIndex;
    }

    private final void m(int param0) {
        int var8 = EscapeVector.obfuscationControl;
        if (!this.field_J) {
          this.field_n = 0;
          this.field_v = 0;
          return;
        }
        if (!(this.painter instanceof WidgetTextLayout)) {
          return;
        }
        WidgetTextLayout var9 = (WidgetTextLayout) ((Object) this.painter);
        TextLayout var3 = var9.ensureTextLayout((UiComponent) (this), 90);
        int var4 = var3.maximumLineWidth((byte) -112);
        int var5 = var9.contentWidth((UiComponent) (this), -25033);
        int var6 = var9.lineHeight(115) >> 1;
        if (var5 - var6 > var4) {
          this.field_n = 0;
          this.field_v = 0;
          return;
        }
        if (param0 != -22686) {
          return;
        }
        int var7 = this.field_n + var3.characterX((byte) -79, this.caretIndex);
        if (var5 - var6 < var7) {
          this.field_n = this.field_n - (var7 + (-var5 + var6));
        } else if (var7 < var6) {
          this.field_n = -var7 + var6 + this.field_n;
        }
        if (this.field_n > 0) {
          this.field_n = 0;
          return;
        }
        if (-var5 + var6 <= this.field_n) {
          return;
        }
        this.field_n = -var5 + var6;
        return;
    }

    private final void pasteClipboard(int guard) {
        try {
          try {
            String var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(0);
            this.insertText((byte) -120, var2);
          } catch (Exception exception) {
          }
          if (guard >= 34) {
            return;
          }
          EditableTextWidget.releaseStatics((byte) 49);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void cutSelection(byte guard) {
        if (guard == 8) {
          this.copySelection((byte) 90);
          this.deleteSelection(0);
          return;
        }
        this.drawLayer(-32, (byte) 101, 85, 10);
        this.copySelection((byte) 90);
        this.deleteSelection(0);
    }

    private final void deleteSelection(int guard) {
        if (this.caretIndex != this.selectionAnchor) {
          int var2 = this.caretIndex > this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
          int var3 = this.selectionAnchor < this.caretIndex ? this.caretIndex : this.selectionAnchor;
          this.caretIndex = var2;
          this.selectionAnchor = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.notifyTextChanged(false);
        }
        if (guard == 0) {
          return;
        }
        this.selectionAnchor = 46;
    }

    final static int a(int param0, int param1, int param2) {
        if (0 == param1) {
          return param0;
        }
        if (param1 == 1) {
          return param0 / 2;
        }
        if (param1 == 2) {
          param0 = ProgressQuery.ceilDivide(-110, 100, param0) * 100;
          return param0;
        }
        if (param2 < 24) {
          return 31;
        }
        if (3 == param1) {
          param0 = ProgressQuery.ceilDivide(-74, 100, param0) * 100;
          return param0;
        }
        return 0;
    }

    EditableTextWidget(String param0, UiListener param1, int param2) {
        super(param0, param1);
        this.field_N = -1;
        this.field_M = false;
        this.field_D = 0L;
        try {
          this.painter = AchievementThresholdRule.field_g.editableTextPainter;
          this.maximumLength = param2;
          this.setText(param0, true, -33);
          this.field_J = true;
          this.field_G = MonotonicClockSupport.monotonicMillis(128);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          super.updateHover(guard + 0, offsetY, offsetX, root);
          if (guard != -14472) {
            field_I = (int[]) null;
          }
          this.m(-22686);
          if (this.field_t == 1) {
            if (this.painter instanceof WidgetTextLayout) {
              WidgetTextLayout var7 = (WidgetTextLayout) ((Object) this.painter);
              int var6 = var7.characterIndexAtPosition(offsetX, offsetY, UiContainer.field_y, GzipDecoder.field_d, guard + 14560, (UiComponent) (this));
              if (var6 != -1) {
                if (this.field_M && this.field_N > var6 &&
                  var6 > this.selectionAnchor) {
                  var6 = this.field_N;
                }
                this.caretIndex = var6;
              }
            }
            this.field_G = MonotonicClockSupport.monotonicMillis(128);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ul.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    final void clearText(byte guard) {
        this.text = "";
        this.selectionAnchor = 0;
        this.caretIndex = 0;
        if (guard == -29) {
          this.notifyTextChanged(false);
          return;
        }
        UiComponent var3 = (UiComponent) null;
        this.onPointerPressed(-33, 14, (byte) 69, 46, -80, (UiComponent) null, 28);
        this.notifyTextChanged(false);
    }

    private final void copySelection(byte guard) {
        try {
          if (guard > 86) {
            String var2 = this.selectedText(100);
            if (!(var2.length() <= 0)) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.selectedText(100))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
          this.caretIndex = -80;
          String var2Lifetime1 = this.selectedText(100);
          if (!(var2Lifetime1.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.selectedText(100))), (java.awt.datatransfer.ClipboardOwner) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (guard > 85) {
          if (this.painter == null) {
            return;
          }
          if (layer != 0) {
            return;
          }
          this.painter.drawWidget(screenX, screenY, -21, (UiComponent) (this), this.enabled);
          if (!(this.painter instanceof WidgetTextLayout)) {
            return;
          }
          WidgetTextLayout var10 = (WidgetTextLayout) ((Object) this.painter);
          if (this.selectionAnchor != this.caretIndex) {
            var10.drawSelection(screenX, this.caretIndex, (UiComponent) (this), this.selectionAnchor, -613528456, screenY);
          }
          long var6 = MonotonicClockSupport.monotonicMillis(128);
          if (500L <= (-this.field_G + var6) % 1000L) {
            return;
          }
          var10.drawCaret((UiComponent) (this), this.caretIndex, screenX, screenY, true);
          return;
        }
        this.maximumLength = -76;
        if (this.painter == null) {
          return;
        }
        if (layer != 0) {
          return;
        }
        this.painter.drawWidget(screenX, screenY, -21, (UiComponent) (this), this.enabled);
        if (!(this.painter instanceof WidgetTextLayout)) {
          return;
        }
        WidgetTextLayout var9 = (WidgetTextLayout) ((Object) this.painter);
        WidgetTextLayout var8 = var9;
        if (this.selectionAnchor != this.caretIndex) {
          var9.drawSelection(screenX, this.caretIndex, (UiComponent) (this), this.selectionAnchor, -613528456, screenY);
        }
        long var6Lifetime1 = MonotonicClockSupport.monotonicMillis(128);
        if (500L <= (-this.field_G + var6Lifetime1) % 1000L) {
          return;
        }
        var9.drawCaret((UiComponent) (this), this.caretIndex, screenX, screenY, true);
        return;
    }

    static {
        field_I = new int[128];
    }
}
