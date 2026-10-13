/*
 * Decompiled by CFR-JS 0.4.0.
 */
class EditableTextWidget extends InteractiveWidget {
    static int field_M;
    private int caretIndex;
    private int selectionAnchor;
    static int[] field_Q;
    private int doubleClickWordEnd;
    private long lastPointerPressMillis;
    private int maximumLength;
    private long lastInputMillis;
    private boolean wordDragSelection;
    static String field_S;
    private boolean autoScrollCaret;

    private final String selectedText(int obfuscationGuard) {
        if (obfuscationGuard >= -58) {
          return (String) null;
        }
        int firstIndex = this.caretIndex > this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
        int lastIndex = this.caretIndex > this.selectionAnchor ? this.caretIndex : this.selectionAnchor;
        return this.text.substring(firstIndex, lastIndex);
    }

    private final int previousWordBoundary(byte obfuscationGuard) {
        int index;
        int guardQuotient;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 == this.caretIndex) {
          return this.caretIndex;
        }
        index = -1 + this.caretIndex;
        guardQuotient = -88 / ((obfuscationGuard - 11) / 55);
        while (0 < index) {
          if (this.text.charAt(index - 1) != 32) {
            index--;
            continue;
          }
          break;
        }
        return index;
    }

    private final void cutSelection(boolean obfuscationGuard) {
        this.copySelection((byte) -53);
        if (!obfuscationGuard) {
          this.doubleClickWordEnd = 32;
        }
        this.deleteSelection(1000);
    }

    private final void deleteSelection(int obfuscationGuard) {
        int firstIndex = 0;
        int lastIndex = 0;
        if (obfuscationGuard != 1000) {
          return;
        }
        if (this.selectionAnchor != this.caretIndex) {
          firstIndex = this.caretIndex > this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
          lastIndex = this.caretIndex <= this.selectionAnchor ? this.selectionAnchor : this.caretIndex;
          this.selectionAnchor = firstIndex;
          this.caretIndex = firstIndex;
          this.text = this.text.substring(0, firstIndex) + this.text.substring(lastIndex, this.text.length());
          this.notifyTextChanged((byte) -123);
        }
    }

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        TextWidgetPainter textPainter = null;
        int hitIndex = 0;
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          this.scrollCaretIntoView(obfuscationGuard - 32722);
          if (1 == this.pressedButton) {
            if (this.painter instanceof TextWidgetPainter) {
              textPainter = (TextWidgetPainter) ((Object) this.painter);
              hitIndex = textPainter.hitTestCharacter((Widget) (this), AiPlanningStrategy.pointerX, 113, originY, ko.pointerY, originX);
              if (hitIndex != -1) {
                if (this.wordDragSelection &&
                  this.doubleClickWordEnd > hitIndex &&
                  hitIndex > this.selectionAnchor) {
                  hitIndex = this.doubleClickWordEnd;
                }
                this.caretIndex = hitIndex;
              }
            }
            this.lastInputMillis = vi.monotonicMillis(98);
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "fn.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    private final void submitText(int obfuscationGuard) {
        if (obfuscationGuard >= -46) {
          return;
        }
        if (this.listener instanceof EditableTextWidgetListener) {
          ((EditableTextWidgetListener) (this.listener)).textSubmitted(this, 80);
        }
    }

    final void setText(boolean suppressNotification, String text, int obfuscationGuard) {
        int endIndex = 0;
        int textLength = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (obfuscationGuard != -27934) {
            field_M = -84;
          }
          if (text == null) {
            text = "";
          }
          this.text = text;
          textLength = text.length();
          if (this.maximumLength != -1 &&
            textLength > this.maximumLength) {
            this.text = this.text.substring(0, this.maximumLength);
          }
          endIndex = this.text.length();
          this.selectionAnchor = endIndex;
          this.caretIndex = endIndex;
          if (!suppressNotification) {
            this.notifyTextChanged((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fn.H(").append(suppressNotification).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var5 = null;
        MeshData var6 = null;
        int var8 = 0;
        String var9 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9 = "";
          if (43 == param1) {
            param1 = 77;
          }
          if (param2 != -32596) {
            return;
          }
          if (!param0) {
            if (param1 == 16) {
              param1 = 78;
            }
            if (param1 == 25) {
              param1 = 79;
            }
            if (param1 == 48) {
              param1 = 80;
            }
            if (param1 == 85) {
              param1 = 89;
            }
          }
          if (param1 == 76) {
            bn.field_a = new ModelMeshBase[ActionRequest.field_m[param1].length];
            bn.field_a[0] = ActionRequest.unitModels[param1][0];
          }
          for (var4 = 1; var4 < ActionRequest.field_m[param1].length; var4++) {
            if (null == ActionRequest.unitModels[param1][var4]) {
              var5 = ActionRequest.field_m[param1][var4];
              var6 = ArrayWidgetContainer.a(var5, param2 ^ -32697, var9);
              if (var6 != null) {
                if (th.a(var6, -17900)) {
                  DiskCacheRequest.unitProjectionVariants[param1] = true;
                }
                if (null != var6.faceRenderTypes) {
                  for (var7 = 0; var7 < var6.faceCount; var7++) {
                    if (var6.faceRenderTypes[var7] == 2) {
                      var6.faceVertexA[var7] = 0;
                      var6.faceVertexB[var7] = 0;
                      var6.faceVertexC[var7] = 0;
                    }
                  }
                }
                ActionRequest.unitModels[param1][var4] = var6.createModel(SummonAction.field_x, fm.field_a, ol.field_A, BattleCharacter.field_t, MeshObject.field_a);
                if (param1 == 76) {
                  bn.field_a[var4] = ActionRequest.unitModels[param1][var4];
                }
                if (0 == ((ModelMesh) (ActionRequest.unitModels[param1][var4])).vertexCount) {
                  ActionRequest.unitModels[param1] = null;
                }
              }
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "fn.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        int endIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          this.lastInputMillis = vi.monotonicMillis(-82);
          if (obfuscationGuard != -12215) {
            return true;
          }
          if (character != 60 &&
            character != 62) {
            if (character >= 32 &&
              character <= 126) {
              if (this.caretIndex != this.selectionAnchor) {
                this.deleteSelection(1000);
              }
              if (this.maximumLength == -1 ||
                !(this.text.length() >= this.maximumLength)) {
                if (this.caretIndex >= this.text.length()) {
                  this.text = this.text + character;
                  endIndex = this.text.length();
                  this.caretIndex = endIndex;
                  this.selectionAnchor = endIndex;
                } else {
                  this.text = this.text.substring(0, this.caretIndex) + character + this.text.substring(this.caretIndex, this.text.length());
                  this.caretIndex = this.caretIndex + 1;
                  this.selectionAnchor = this.caretIndex;
                }
                this.notifyTextChanged((byte) -123);
              }
              return true;
            }
            if (85 == keyCode) {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(1000);
                return true;
              }
              if (0 >= this.caretIndex) {
                return false;
              }
              this.selectionAnchor = -1 + this.caretIndex;
              this.deleteSelection(1000);
              return true;
            }
            if (keyCode == 101) {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(1000);
                return true;
              }
              if (this.caretIndex < this.text.length()) {
                this.selectionAnchor = 1 + this.caretIndex;
                this.deleteSelection(1000);
                return true;
              }
            } else {
              if (keyCode == 13) {
                this.clearText(98);
                return true;
              }
              if (keyCode != 96) {
                if (keyCode != 97) {
                  if (keyCode == 102) {
                    this.moveCaret(0, (byte) -59);
                    return true;
                  }
                  if (103 == keyCode) {
                    this.moveCaret(this.text.length(), (byte) -59);
                    return true;
                  }
                  if (keyCode == 84) {
                    this.submitText(-92);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    keyCode == 65) {
                    this.cutSelection(true);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    keyCode == 66) {
                    this.copySelection((byte) -53);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    67 == keyCode) {
                    this.pasteClipboard((byte) -104);
                    return true;
                  }
                } else {
                  if (this.caretIndex < this.text.length()) {
                    if (!br.heldKeys[82]) {
                      rightIndex = this.caretIndex + 1;
                    } else {
                      rightIndex = this.nextWordBoundary(-97);
                    }
                    this.moveCaret(rightIndex, (byte) -59);
                    return true;
                  }
                }
              } else {
                if (this.caretIndex > 0) {
                  if (br.heldKeys[82]) {
                    leftIndex = this.previousWordBoundary((byte) 81);
                  } else {
                    leftIndex = -1 + this.caretIndex;
                  }
                  this.moveCaret(leftIndex, (byte) -59);
                  return true;
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fn.F(");
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3) {
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RgbSprite var16 = null;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param3.normalizeCanvas();
          var4_int = 0;
          var5 = param3.pixelWidth / 2;
          if (param0 != 8678) {
            var16 = (RgbSprite) null;
            EditableTextWidget.a(-106, -71, -114, (RgbSprite) null);
          }
          var6 = param3.pixelHeight / 2;
          stackIn_6_0 = (var5 >= var6) ? var6 : var5;
          var7 = stackIn_6_0;
          for (var8 = 0; param3.pixelHeight > var8; var8++) {
            for (var9 = 0; param3.pixelWidth > var9; var9++) {
              var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 - var6) * (-var6 + var8)));
              if (param2 <= var10) {
                var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
              } else {
                var10 = param1;
              }
              if (0 < var10) {
                var11 = param3.pixels[var4_int];
                if (var11 == 1) {
                  var11 = 0;
                }
                var12 = (var11 & 16711680) + (var10 << 16);
                var13 = (var11 & 65280) + (var10 << 8);
                if (var12 > 16711680) {
                  var12 = 16711680;
                }
                var14 = (var11 & 255) + var10;
                if (var13 > 65280) {
                  var13 = 65280;
                }
                if (255 < var14) {
                  var14 = 255;
                }
                param3.pixels[var4_int] = oe.bitwiseOr(oe.bitwiseOr(var12, var13), var14);
              }
              var4_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("fn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    EditableTextWidget(String text, WidgetListener listener, int maximumLength) {
        super(text, listener);
        this.lastPointerPressMillis = 0L;
        this.wordDragSelection = false;
        this.doubleClickWordEnd = -1;
        try {
          this.painter = t.field_c.field_w;
          this.maximumLength = maximumLength;
          this.setText(true, text, -27934);
          this.autoScrollCaret = true;
          this.lastInputMillis = vi.monotonicMillis(-83);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "fn.<init>(" + (text != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    final void clearText(int obfuscationGuard) {
        this.caretIndex = 0;
        this.selectionAnchor = 0;
        this.text = "";
        int guardRemainder = 26 % ((33 - obfuscationGuard) / 36);
        this.notifyTextChanged((byte) -126);
    }

    private final void scrollCaretIntoView(int obfuscationGuard) {
        int guardBoundary = 0;
        TextLayout layout;
        int rightExtent;
        int contentWidth;
        int caretMargin;
        int caretX;
        int obfuscationControl;
        TextWidgetPainter textPainter;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.autoScrollCaret) {
          this.contentOffsetX = 0;
          this.contentOffsetY = 0;
          return;
        }
        if (!(this.painter instanceof TextWidgetPainter)) {
          return;
        }
        textPainter = (TextWidgetPainter) ((Object) this.painter);
        layout = textPainter.getTextLayout(-100, (Widget) (this));
        if (obfuscationGuard != 0) {
          guardBoundary = this.previousWordBoundary((byte) -33);
        }
        rightExtent = layout.getRightExtent(false);
        contentWidth = textPainter.getContentWidth(66, (Widget) (this));
        caretMargin = textPainter.getLineInkHeight(true) >> 1;
        if (-caretMargin + contentWidth > rightExtent) {
          this.contentOffsetY = 0;
          this.contentOffsetX = 0;
          return;
        }
        caretX = this.contentOffsetX + layout.getCaretX((byte) -66, this.caretIndex);
        if (contentWidth - caretMargin < caretX) {
          this.contentOffsetX = this.contentOffsetX - caretX - caretMargin + contentWidth;
        } else {
          if (caretX < caretMargin) {
            this.contentOffsetX = this.contentOffsetX + (-caretX + caretMargin);
          }
        }
        if (this.contentOffsetX <= 0) {
          if (caretMargin - contentWidth > this.contentOffsetX) {
            this.contentOffsetX = caretMargin - contentWidth;
          }
        } else {
          this.contentOffsetX = 0;
        }
        return;
    }

    void notifyTextChanged(byte obfuscationGuard) {
        if (this.listener instanceof EditableTextWidgetListener) {
          ((EditableTextWidgetListener) (this.listener)).textChanged(this, 111);
        }
        if (obfuscationGuard >= -114) {
          this.maximumLength = -53;
        }
    }

    private final void copySelection(byte obfuscationGuard) {
        String selection = this.selectedText(obfuscationGuard ^ 108);
        if (obfuscationGuard != -53) {
          return;
        }
        if (0 < selection.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.selectedText(-74))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void moveCaret(int index, byte obfuscationGuard) {
        this.caretIndex = index;
        if (!br.heldKeys[81]) {
          this.selectionAnchor = this.caretIndex;
        }
        if (obfuscationGuard != -59) {
          this.submitText(-104);
        }
    }

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        int caretIndex = 0;
        boolean doubleClick = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        int hitIndex = 0;
        long now = 0L;
        RuntimeException failure = null;
        try {
          if (obfuscationGuard <= 103) {
            return false;
          }
          if (!super.pointerPressed(pointerX, originX, originY, 119, rootWidget, pointerY, button)) {
            return false;
          }
          if (!(this.painter instanceof TextWidgetPainter)) {
            return false;
          }
          hitIndex = ((TextWidgetPainter) ((Object) this.painter)).hitTestCharacter((Widget) (this), AiPlanningStrategy.pointerX, 87, originY, ko.pointerY, originX);
          if (hitIndex != -1) {
            caretIndex = hitIndex;
          } else {
            caretIndex = 0;
          }
          this.moveCaret(caretIndex, (byte) -59);
          now = vi.monotonicMillis(39);
          doubleClick = !(-this.lastPointerPressMillis + now >= 250L);
          this.wordDragSelection = doubleClick;
          if (this.wordDragSelection) {
            this.selectionAnchor = this.previousWordBoundary((byte) -85);
            this.caretIndex = this.nextWordBoundary(-89);
            if (this.caretIndex > 0 &&
              this.text.charAt(this.caretIndex - 1) == 32) {
              this.caretIndex = this.caretIndex - 1;
            }
            this.doubleClickWordEnd = this.caretIndex;
          }
          this.lastPointerPressMillis = now;
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fn.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    public static void m(int param0) {
        if (param0 != 32) {
          field_Q = (int[]) null;
        }
        field_S = null;
        field_Q = null;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        TextWidgetPainter textPainter = null;
        long now = 0L;
        if (obfuscationGuard > -82) {
          return;
        }
        if (this.painter != null &&
          renderLayer == 0) {
          this.painter.paintWidget((Widget) (this), originX, -128, this.enabled, originY);
          if (this.painter instanceof TextWidgetPainter) {
            textPainter = (TextWidgetPainter) ((Object) this.painter);
            if (this.caretIndex != this.selectionAnchor) {
              textPainter.drawSelection(-21259, this.caretIndex, this.selectionAnchor, (Widget) (this), originY, originX);
            }
            now = vi.monotonicMillis(-126);
            if ((now - this.lastInputMillis) % 1000L < 500L) {
              textPainter.drawCaret(originY, 1024, originX, (Widget) (this), this.caretIndex);
            }
          }
        }
    }

    private final void pasteClipboard(byte obfuscationGuard) {
        try {
          Throwable caughtClipboardFailure = null;
          String clipboardText = null;
          Exception clipboardFailure = null;
          Widget guardWidget = null;
          try {
            if (obfuscationGuard != -104) {
              guardWidget = (Widget) null;
              this.handleKey((Widget) null, -59, 'x', 71);
            }
            clipboardText = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection(obfuscationGuard + 1104);
            this.insertText(clipboardText, (byte) -114);
          } catch (java.lang.Exception caughtParameter) {
            caughtClipboardFailure = caughtParameter;
            clipboardFailure = (Exception) (Object) caughtClipboardFailure;
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    private final void insertText(String text, byte obfuscationGuard) {
        int remainingCapacity = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (this.maximumLength != -1) {
            remainingCapacity = this.maximumLength - this.text.length();
            if (remainingCapacity >= 0) {
              return;
            }
            text = text.substring(0, remainingCapacity);
          }
          if (this.caretIndex != this.text.length()) {
            this.text = this.text.substring(0, this.caretIndex) + text + this.text.substring(this.caretIndex, this.text.length());
          } else {
            this.text = this.text + text;
          }
          this.caretIndex = this.caretIndex + text.length();
          this.selectionAnchor = this.caretIndex;
          if (obfuscationGuard > -78) {
            this.selectionAnchor = 91;
            this.notifyTextChanged((byte) -126);
          } else {
            this.notifyTextChanged((byte) -126);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fn.BA(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final int nextWordBoundary(int obfuscationGuard) {
        int textLength;
        int index;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > -10) {
          return -64;
        }
        textLength = this.text.length();
        if (this.caretIndex == textLength) {
          return this.caretIndex;
        }
        for (index = this.caretIndex + 1; index < textLength; index++) {
          if (this.text.charAt(-1 + index) != 32) {
            continue;
          }
          break;
        }
        return index;
    }

    static {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
