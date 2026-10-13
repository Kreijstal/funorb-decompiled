/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EditableTextField extends ClientUiComponent {
    private PlatformTaskService platformService;
    private ClientUiComponent caretComponent;
    private int selectionHeight;
    static int[][] field_Vb;
    private boolean wordSelectionDrag;
    private int initialWordEnd;
    private int selectionAnchor;
    static long field_Lb;
    private boolean pointerSelecting;
    private long lastPressMillis;
    ClientUiComponent textComponent;
    private int maximumLength;
    private StringBuilder textBuffer;
    private PlatformTask pendingClipboardTask;
    private ClientUiComponent selectionComponent;
    private int caretIndex;

    private final int characterIndexAtX(int obfuscationGuard, int pixelOffset) {
        int characterIndexBeforeIncrement = 0;
        int characterIndex = 0;
        RuntimeException var3 = null;
        int measuredWidth = 0;
        int textLength = 0;
        int obfuscationControl = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 48) {
            this.caretIndex = -37;
          }
          characterIndex = 0;
          measuredWidth = 0;
          textLength = this.textBuffer.length();
          while (pixelOffset > measuredWidth) {
            if (textLength > characterIndex) {
              characterIndexBeforeIncrement = characterIndex;
              characterIndex++;
              measuredWidth = measuredWidth + this.textComponent.font.characterWidth(this.textBuffer.charAt(characterIndexBeforeIncrement));
              continue;
            }
            break;
          }
          stackIn_8_0 = characterIndex;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "dp.U(" + obfuscationGuard + ',' + pixelOffset + ')');
        }
    }

    final void clearText(boolean resizePolicy) {
        try {
          PortalLossCondition.a(' ', 0, this.textBuffer, resizePolicy);
          this.caretIndex = 0;
          this.selectionAnchor = 0;
          this.textComponent.text = this.textBuffer.toString();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.A(" + resizePolicy + ')');
        }
    }

    final void setPlatformService(PlatformTaskService platformService, int obfuscationGuard) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.platformService = platformService;
          if (obfuscationGuard != 176) {
            EditableTextField.n(63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("dp.L(");
          if (platformService == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void n(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = MoveAttackRequest.field_K;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "dp.O(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
          if (param0 != -123) {
            EditableTextField.f((byte) -111);
          }
          field_Vb = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.R(" + param0 + ')');
        }
    }

    private EditableTextField(long key, ClientUiComponent style, ClientUiComponent selectionStyle, ClientUiComponent textStyle, int maximumLength) {
        super(key, style);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.initialWordEnd = -1;
        this.wordSelectionDrag = false;
        this.pointerSelecting = false;
        this.lastPressMillis = 0L;
        try {
          this.maximumLength = maximumLength;
          this.selectionComponent = new ClientUiComponent(0L, selectionStyle);
          this.textComponent = new ClientUiComponent(0L, textStyle);
          this.caretComponent = new ClientUiComponent(0L, textStyle);
          this.field_M = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.maximumLength == -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.maximumLength;
          }
          this.textBuffer = new StringBuilder(stackIn_4_3);
          this.textComponent.text = this.textBuffer.toString();
          this.caretComponent.text = "";
          this.caretComponent.blinkTextSuffix = "|";
          this.children = new NodeDeque();
          this.addChild(this.selectionComponent, 48);
          this.addChild(this.textComponent, 48);
          this.addChild(this.caretComponent, 89);
          this.focused = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("dp.<init>(").append(key).append(',');
          if (style == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (selectionStyle == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_14_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (textStyle == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_14_0;
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(maximumLength).append(')').toString());
        }
    }

    final void setSelection(int obfuscationGuard, int selectionAnchor, int caretIndex) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int textLength = 0;
        int obfuscationControl = 0;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          textLength = this.textBuffer.length();
          if (0 > selectionAnchor) {
            selectionAnchor = 0;
          } else {
            if (selectionAnchor > textLength) {
              selectionAnchor = textLength;
            }
          }
          if (0 > caretIndex) {
            caretIndex = 0;
          } else {
            if (caretIndex > textLength) {
              caretIndex = textLength;
            }
          }
          if (obfuscationGuard != -98) {
            discarded$1 = this.previousSeparatorBoundary(-15);
          }
          this.caretIndex = caretIndex;
          this.selectionAnchor = selectionAnchor;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.Q(" + obfuscationGuard + ',' + selectionAnchor + ',' + caretIndex + ')');
        }
    }

    private final void deleteSelection(int obfuscationGuard) {
        StringBuilder discarded$0 = null;
        int selectionStartValue = 0;
        int selectionEndValue = 0;
        RuntimeException decompiledCaughtException = null;
        int selectionStart = 0;
        RuntimeException var2 = null;
        int selectionEnd = 0;
        String retainedSuffix = null;
        try {
          if (this.caretIndex != this.selectionAnchor) {
            if (this.caretIndex <= this.selectionAnchor) {
              selectionStartValue = this.caretIndex;
            } else {
              selectionStartValue = this.selectionAnchor;
            }
            selectionStart = selectionStartValue;
            if (this.selectionAnchor >= this.caretIndex) {
              selectionEndValue = this.selectionAnchor;
            } else {
              selectionEndValue = this.caretIndex;
            }
            selectionEnd = selectionEndValue;
            this.selectionAnchor = selectionStart;
            this.caretIndex = selectionStart;
            retainedSuffix = this.textBuffer.toString().substring(selectionEnd, this.textBuffer.length());
            PortalLossCondition.a(' ', selectionStart, this.textBuffer, true);
            discarded$0 = this.textBuffer.append(retainedSuffix);
            this.textComponent.text = this.textBuffer.toString();
          }
          if (obfuscationGuard == 32) {
            return;
          }
          field_Lb = -1L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.M(" + obfuscationGuard + ')');
        }
    }

    private final void insertClipboardText(byte obfuscationGuard, String text) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int remainingCapacity = 0;
        RuntimeException var3 = null;
        String retainedSuffix = null;
        int guardQuotient;
        try {
          if (this.maximumLength != -1) {
            remainingCapacity = this.maximumLength - this.textBuffer.length();
            if (0 == remainingCapacity) {
              return;
            }
            text = text.substring(0, remainingCapacity);
          }
          if (this.caretIndex == this.textBuffer.length()) {
            discarded$0 = this.textBuffer.append(text);
          } else {
            retainedSuffix = this.textBuffer.toString().substring(this.caretIndex, this.textBuffer.length());
            PortalLossCondition.a(' ', this.caretIndex, this.textBuffer, true);
            discarded$1 = this.textBuffer.append(text);
            discarded$2 = this.textBuffer.append(retainedSuffix);
          }
          guardQuotient = 109 / ((obfuscationGuard - 44) / 40);
          this.textComponent.text = this.textBuffer.toString();
          this.caretIndex = this.textBuffer.length();
          this.selectionAnchor = this.caretIndex;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("dp.P(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final String getSelectedText(byte obfuscationGuard) {
        String text = null;
        int selectionStartValue = 0;
        int selectionEndValue = 0;
        String selectedText = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int selectionStart = 0;
        int selectionEnd = 0;
        try {
          if (obfuscationGuard != 115) {
            this.copySelection(78);
          }
          text = this.textBuffer.toString();
          if (this.caretIndex <= this.selectionAnchor) {
            selectionStartValue = this.caretIndex;
          } else {
            selectionStartValue = this.selectionAnchor;
          }
          selectionStart = selectionStartValue;
          if (this.selectionAnchor >= this.caretIndex) {
            selectionEndValue = this.selectionAnchor;
          } else {
            selectionEndValue = this.caretIndex;
          }
          selectionEnd = selectionEndValue;
          selectedText = text.substring(selectionStart, selectionEnd);
          return selectedText;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "dp.D(" + obfuscationGuard + ')');
        }
    }

    final boolean handleKey(int keyCode, int obfuscationGuard, char typedCharacter) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int forwardCaretValue = 0;
        int backwardCaretValue = 0;
        RuntimeException decompiledCaughtException = null;
        int nextCaret = 0;
        RuntimeException var4 = null;
        String retainedSuffix = null;
        try {
          if (typedCharacter == 60) {
            return false;
          }
          if (62 == typedCharacter) {
            return false;
          }
          if (typedCharacter >= 32 &&
            typedCharacter <= 126) {
            if (this.caretIndex != this.selectionAnchor) {
              this.deleteSelection(32);
            }
            if (-1 == this.maximumLength ||
              !(this.textBuffer.length() >= this.maximumLength)) {
              if (this.caretIndex != this.textBuffer.length()) {
                retainedSuffix = this.textBuffer.toString().substring(this.caretIndex, this.textBuffer.length());
                PortalLossCondition.a(' ', this.caretIndex, this.textBuffer, true);
                discarded$0 = this.textBuffer.append(typedCharacter);
                discarded$1 = this.textBuffer.append(retainedSuffix);
              } else {
                discarded$2 = this.textBuffer.append(typedCharacter);
              }
              this.textComponent.text = this.textBuffer.toString();
              this.caretIndex = this.caretIndex + 1;
              this.selectionAnchor = this.caretIndex;
            }
            return true;
          }
          if (keyCode != 85) {
            if (keyCode != 101) {
              if (keyCode == 13) {
                this.clearText(true);
                return true;
              }
              if (keyCode == 96) {
                if (this.caretIndex > 0) {
                  if (!br.heldKeys[82]) {
                    backwardCaretValue = -1 + this.caretIndex;
                  } else {
                    backwardCaretValue = this.previousSeparatorBoundary(-1);
                  }
                  nextCaret = backwardCaretValue;
                  this.moveCaret(nextCaret, false);
                  return true;
                }
              } else {
                if (keyCode == 97) {
                  if (this.caretIndex < this.textBuffer.length()) {
                    if (!br.heldKeys[82]) {
                      forwardCaretValue = this.caretIndex + 1;
                    } else {
                      forwardCaretValue = this.nextSeparatorBoundary((byte) 109);
                    }
                    nextCaret = forwardCaretValue;
                    this.moveCaret(nextCaret, false);
                    return true;
                  }
                } else {
                  if (keyCode == 102) {
                    this.moveCaret(0, false);
                    return true;
                  }
                  if (keyCode == 103) {
                    this.moveCaret(this.textBuffer.length(), false);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    keyCode == 65) {
                    this.cutSelection((byte) 114);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    keyCode == 66) {
                    this.copySelection(obfuscationGuard ^ 26164);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    keyCode == 67) {
                    this.requestPaste((byte) -77);
                    return true;
                  }
                }
              }
            } else {
              if (this.selectionAnchor != this.caretIndex) {
                this.deleteSelection(32);
                return true;
              }
              if (this.caretIndex < this.textBuffer.length()) {
                this.selectionAnchor = 1 + this.caretIndex;
                this.deleteSelection(32);
                return true;
              }
            }
          } else {
            if (this.caretIndex != this.selectionAnchor) {
              this.deleteSelection(32);
              return true;
            }
            if (this.caretIndex > 0) {
              this.selectionAnchor = this.caretIndex - 1;
              this.deleteSelection(32);
              return true;
            }
          }
          if (obfuscationGuard != -26126) {
            this.lastPressMillis = -48L;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "dp.K(" + keyCode + ',' + obfuscationGuard + ',' + typedCharacter + ')');
        }
    }

    private final void requestPaste(byte obfuscationGuard) {
        if (this.platformService == null) {
          return;
        }
        try {
          int var2_int = -66 / ((72 - obfuscationGuard) / 35);
          this.pendingClipboardTask = this.platformService.readClipboardAsync(0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.N(" + obfuscationGuard + ')');
        }
    }

    private final void cutSelection(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null == this.platformService) {
            return;
          }
          this.copySelection(-87);
          if (obfuscationGuard <= 90) {
            this.selectionComponent = (ClientUiComponent) null;
            this.deleteSelection(32);
          } else {
            this.deleteSelection(32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.G(" + obfuscationGuard + ')');
        }
    }

    private final void copySelection(int obfuscationGuard) {
        try {
          java.awt.datatransfer.StringSelection var4 = null;
          if (this.platformService == null) {
            return;
          }
          int var2_int = -53 / ((obfuscationGuard - 11) / 49);
          String var3 = this.getSelectedText((byte) 115);
          if (var3.length() == 0) {
            return;
          }
          try {
            var4 = new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) 115));
            this.platformService.writeClipboardAsync((java.awt.datatransfer.Transferable) ((Object) var4), -26522);
          } catch (RuntimeException runtimeException) {
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.H(" + obfuscationGuard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String getText(int obfuscationGuard) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            this.selectionComponent = (ClientUiComponent) null;
          }
          stackIn_3_0 = this.textBuffer.toString();
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.I(" + obfuscationGuard + ')');
        }
    }

    final int getCaretIndex(int obfuscationGuard) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -34 / ((obfuscationGuard - 21) / 39);
          stackIn_1_0 = this.caretIndex;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.S(" + obfuscationGuard + ')');
        }
    }

    final void setText(String text, byte obfuscationGuard) {
        StringBuilder discarded$4 = null;
        int dupTemp$5 = 0;
        int discarded$6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.textBuffer.setLength(0);
          var3_int = text.length();
          if (this.maximumLength != -1 &&
            this.maximumLength < var3_int) {
            var3_int = this.maximumLength;
          }
          discarded$4 = this.textBuffer.append(text.substring(0, var3_int));
          dupTemp$5 = this.textBuffer.length();
          this.selectionAnchor = dupTemp$5;
          this.caretIndex = dupTemp$5;
          this.textComponent.text = this.textBuffer.toString();
          if (obfuscationGuard == 45) {
            return;
          }
          discarded$6 = this.nextSeparatorBoundary((byte) 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dp.T(");
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void setLayout(int y, int textYOffset, int width, int height, int x) {
        try {
          this.setBounds(height, -20500, width, y, x);
          this.textComponent.setBounds(height, -20500, width, textYOffset, 0);
          this.caretComponent.setBounds(height, -20500, width, 0, 0);
          this.selectionHeight = -4 + height;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.V(" + y + ',' + textYOffset + ',' + width + ',' + height + ',' + x + ')');
        }
    }

    private final void moveCaret(int caretIndex, boolean preserveAnchor) {
        this.caretIndex = caretIndex;
        if (preserveAnchor) {
          return;
        }
        try {
          if (!br.heldKeys[81]) {
            this.selectionAnchor = this.caretIndex;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.C(" + caretIndex + ',' + preserveAnchor + ')');
        }
    }

    EditableTextField(long key, ClientUiComponent style, ClientUiComponent selectionStyle, ClientUiComponent textStyle) {
        this(key, style, selectionStyle, textStyle, -1);
    }

    final void setCollapsedSelection(int caretIndex, boolean obfuscationGuard) {
        try {
          this.selectionAnchor = caretIndex;
          this.caretIndex = caretIndex;
          if (obfuscationGuard) {
            this.handleKey(-36, 44, '\177');
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dp.E(" + caretIndex + ',' + obfuscationGuard + ')');
        }
    }

    final void advanceEditing(int obfuscationGuard) {
        try {
          int unfocusedTextLength = 0;
          boolean pressWithinDoubleClickThreshold = false;
          int selectionLeftValue = 0;
          Throwable decompiledCaughtException = null;
          int pointerCharacterIndex = 0;
          RuntimeException var2 = null;
          long pressMillis = 0L;
          int anchorPixelX = 0;
          int selectionLeftX = 0;
          Exception pasteFailure = null;
          int selectionWidth = 0;
          int obfuscationControl = 0;
          java.awt.datatransfer.Transferable clipboardContents = null;
          String clipboardText = null;
          obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            boolean decompiledFrameRemainder0 = true;
            pointerCharacterIndex = this.characterIndexAtX(obfuscationGuard ^ 48, AiPlanningStrategy.pointerX - (this.screenX + this.textComponent.contentOffsetX));
            if (this.pressedButton == 1) {
              this.moveCaret(pointerCharacterIndex, false);
              this.pointerSelecting = true;
              pressMillis = vi.monotonicMillis(obfuscationGuard - 95);
              pressWithinDoubleClickThreshold = !(250L <= pressMillis - this.lastPressMillis);
              this.wordSelectionDrag = pressWithinDoubleClickThreshold;
              if (this.wordSelectionDrag) {
                this.selectionAnchor = this.previousSeparatorBoundary(-1);
                this.caretIndex = this.nextSeparatorBoundary((byte) 109);
                if (this.caretIndex > 0 &&
                  this.textBuffer.charAt(this.caretIndex - 1) == 32) {
                  this.caretIndex = this.caretIndex - 1;
                }
                this.initialWordEnd = this.caretIndex;
              }
              this.lastPressMillis = pressMillis;
            } else {
              if (ro.pointerButton == 1 &&
                this.pointerSelecting) {
                if (!this.wordSelectionDrag) {
                  this.caretIndex = pointerCharacterIndex;
                } else {
                  if (pointerCharacterIndex >= this.initialWordEnd) {
                    this.caretIndex = pointerCharacterIndex;
                  } else {
                    if (this.selectionAnchor >= pointerCharacterIndex) {
                      this.caretIndex = pointerCharacterIndex;
                    } else {
                      pointerCharacterIndex = this.initialWordEnd;
                      this.caretIndex = pointerCharacterIndex;
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.pointerSelecting = false;
              }
            }
            if (!this.focused) {
              unfocusedTextLength = this.textBuffer.length();
              this.selectionAnchor = unfocusedTextLength;
              this.caretIndex = unfocusedTextLength;
            }
            this.caretComponent.x = this.textComponent.font.textWidth(this.textBuffer.toString().substring(obfuscationGuard, this.caretIndex));
            if (this.selectionAnchor == this.caretIndex) {
              this.selectionComponent.setBounds(this.selectionHeight, -20500, 0, 2, this.caretComponent.x);
            } else {
              anchorPixelX = this.textComponent.x + this.textComponent.font.textWidth(this.textBuffer.toString().substring(0, this.selectionAnchor));
              if (this.caretComponent.x <= anchorPixelX) {
                selectionLeftValue = this.caretComponent.x;
              } else {
                selectionLeftValue = anchorPixelX;
              }
              selectionLeftX = selectionLeftValue;
              selectionWidth = Math.abs(anchorPixelX - this.caretComponent.x);
              this.selectionComponent.setBounds(this.selectionHeight, obfuscationGuard - 20500, selectionWidth, 2, selectionLeftX + this.textComponent.contentOffsetX);
            }
            if (this.pendingClipboardTask != null) {
              if (this.pendingClipboardTask.status == 0) {
                return;
              }
              clipboardContents = (java.awt.datatransfer.Transferable) (this.pendingClipboardTask.result);
              try {
                clipboardText = (String) (clipboardContents.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.deleteSelection(32);
                this.insertClipboardText((byte) 90, clipboardText);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                pasteFailure = (Exception) (Object) decompiledCaughtException;
              }
              this.pendingClipboardTask = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.F(" + obfuscationGuard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int previousSeparatorBoundary(int obfuscationGuard) {
        int characterIndex = 0;
        int obfuscationControl = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (~this.caretIndex == obfuscationGuard) {
            stackIn_3_0 = this.caretIndex;
            return stackIn_3_0;
          }
          for (characterIndex = this.caretIndex - 1; 0 < characterIndex; characterIndex--) {
            if (!wr.isTextNavigationSeparator(this.textBuffer.charAt(-1 + characterIndex), (byte) 95)) {
              continue;
            }
            break;
          }
          stackIn_10_0 = characterIndex;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.J(" + obfuscationGuard + ')');
        }
    }

    private final int nextSeparatorBoundary(byte obfuscationGuard) {
        int textLength = 0;
        int characterIndex = 0;
        int obfuscationControl = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 109) {
            this.pointerSelecting = false;
          }
          textLength = this.textBuffer.length();
          if (this.caretIndex == textLength) {
            stackIn_5_0 = this.caretIndex;
            return stackIn_5_0;
          }
          for (characterIndex = 1 + this.caretIndex; textLength > characterIndex; characterIndex++) {
            if (!wr.isTextNavigationSeparator(this.textBuffer.charAt(characterIndex - 1), (byte) 95)) {
              continue;
            }
            break;
          }
          stackIn_12_0 = characterIndex;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "dp.B(" + obfuscationGuard + ')');
        }
    }

    static {
        field_Vb = new int[][]{new int[]{48, 48}, new int[]{144, 0}, new int[]{0, 0}, new int[]{0, 176}, new int[]{32, 0}, new int[]{64, 64}};
    }
}
