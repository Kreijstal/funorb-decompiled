/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputWidget extends ButtonWidget {
    static byte[] diskSectorBuffer;
    private int caretIndex;
    private int selectionAnchorIndex;
    private int wordSelectionEndIndex;
    private boolean wordSelectionDrag;
    private boolean caretScrollingEnabled;
    private long lastPointerPressMillis;
    static byte[][] byteArrayPool100;
    private int maximumTextLength;
    private long caretBlinkStartMillis;
    static int[] projectedMeshVertexY;

    private final void deleteSelectedText(int methodGuard) {
        int selectionStart = 0;
        int selectionEnd = 0;
        if (methodGuard != 0) {
            this.wordSelectionEndIndex = -7;
        }
        if (this.selectionAnchorIndex != this.caretIndex) {
            selectionStart = this.selectionAnchorIndex >= this.caretIndex ? this.caretIndex : this.selectionAnchorIndex;
            selectionEnd = this.caretIndex > this.selectionAnchorIndex ? this.caretIndex : this.selectionAnchorIndex;
            this.caretIndex = selectionStart;
            this.selectionAnchorIndex = selectionStart;
            this.widgetText = this.widgetText.substring(0, selectionStart) + this.widgetText.substring(selectionEnd, this.widgetText.length());
            this.notifyTextInputChanged((byte) -117);
        }
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        int hitTextIndex = 0;
        TextWidgetLayout textRenderer = null;
        RuntimeException pointerFailureForContext = null;
        StringBuilder pointerContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPointerFailure = null;
        RuntimeException pointerUpdateFailure = null;
        try {
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          this.updateCaretScroll(-115);
          if (this.pressedPointerButton == 1) {
            if (this.renderer instanceof TextWidgetLayout) {
              textRenderer = (TextWidgetLayout) ((Object) this.renderer);
              hitTextIndex = textRenderer.hitTestCaretIndex((UiWidget) (this), PrefixCodeDecoder.pointerXSnapshot, -15539, parentY, PcmResampler.pointerYSnapshot, parentX);
              if (-1 != hitTextIndex) {
                if (this.wordSelectionDrag &&
                    this.wordSelectionEndIndex > hitTextIndex &&
                    this.selectionAnchorIndex < hitTextIndex) {
                  hitTextIndex = this.wordSelectionEndIndex;
                }
                this.caretIndex = hitTextIndex;
              }
            }
            this.caretBlinkStartMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
          }
          if (hoverGuard) {
            byteArrayPool100 = (byte[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException pointerFailure) {
          caughtPointerFailure = pointerFailure;
          pointerUpdateFailure = caughtPointerFailure;
          pointerFailureForContext = pointerUpdateFailure;
          pointerContextBuilder = new StringBuilder().append("dj.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerFailureForContext), ((StringBuilder) (Object) pointerContextBuilder).append(eventContextDescription).append(',').append(parentX).append(')').toString());
        }
    }

    private final int findNextWordBoundary(byte methodGuard) {
        String discardedSelectionSnapshot = null;
        int textLength;
        int boundaryIndex;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        textLength = this.widgetText.length();
        if (textLength == this.caretIndex) {
          return this.caretIndex;
        }
        boundaryIndex = 1 + this.caretIndex;
        if (methodGuard != -57) {
          discardedSelectionSnapshot = this.getSelectedText((byte) -79);
        }
        while (boundaryIndex < textLength) {
          if (32 != this.widgetText.charAt(-1 + boundaryIndex)) {
            boundaryIndex++;
            continue;
          }
          break;
        }
        return boundaryIndex;
    }

    private final String getSelectedText(byte methodGuard) {
        int guardResidue = 33 % ((-77 - methodGuard) / 39);
        int selectionStart = this.selectionAnchorIndex >= this.caretIndex ? this.caretIndex : this.selectionAnchorIndex;
        int selectionEnd = this.selectionAnchorIndex < this.caretIndex ? this.caretIndex : this.selectionAnchorIndex;
        return this.widgetText.substring(selectionStart, selectionEnd);
    }

    final static Sprite[] createTwoTonePanelSprites(int firstBorderColor, byte methodGuard, int secondBorderColor, int centerColor, int borderSpriteSize) {
        if (methodGuard != -70) {
            diskSectorBuffer = (byte[]) null;
        }
        Sprite[] allocatedSprites = new Sprite[9];
        Sprite[] sprites = allocatedSprites;
        Sprite firstBorderSprite = SecondaryNodeDequeIterator.createPartiallyFilledSquareSprite(0, firstBorderColor, borderSpriteSize);
        allocatedSprites[6] = firstBorderSprite;
        sprites[3] = firstBorderSprite;
        sprites[2] = firstBorderSprite;
        sprites[1] = firstBorderSprite;
        sprites[0] = firstBorderSprite;
        Sprite secondBorderSprite = SecondaryNodeDequeIterator.createPartiallyFilledSquareSprite(0, secondBorderColor, borderSpriteSize);
        allocatedSprites[8] = secondBorderSprite;
        sprites[7] = secondBorderSprite;
        sprites[5] = secondBorderSprite;
        if (centerColor != 0) {
            allocatedSprites[4] = SecondaryNodeDequeIterator.createPartiallyFilledSquareSprite(0, centerColor, 64);
        }
        return sprites;
    }

    TextInputWidget(String initialText, WidgetListener listener, int maximumLength) {
        super(initialText, listener);
        this.wordSelectionDrag = false;
        this.lastPointerPressMillis = 0L;
        this.wordSelectionEndIndex = -1;
        try {
            this.maximumTextLength = maximumLength;
            this.renderer = DialRenderer.accountUiTheme.textInputRenderer;
            this.setInputText(-128, initialText, true);
            this.caretScrollingEnabled = true;
            this.caretBlinkStartMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
        } catch (RuntimeException textInputConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textInputConstructionFailure), "dj.<init>(" + (initialText != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    private final void cutSelectedText(int methodGuard) {
        this.copySelectedTextToClipboard(-23161);
        if (methodGuard <= 29) {
            this.wordSelectionDrag = false;
        }
        this.deleteSelectedText(0);
    }

    private final void insertTextAtCaret(String text, int methodGuard) {
        int guardQuotient = 0;
        int remainingCapacity = 0;
        RuntimeException insertionFailureForContext = null;
        StringBuilder insertionContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtInsertionFailure = null;
        RuntimeException textInsertionFailure = null;
        try {
          guardQuotient = -6 / ((methodGuard - 63) / 50);
          if (this.maximumTextLength != -1) {
            remainingCapacity = this.maximumTextLength - this.widgetText.length();
            if (remainingCapacity >= 0) {
              return;
            }
            text = text.substring(0, remainingCapacity);
          }
          if (this.caretIndex != this.widgetText.length()) {
            this.widgetText = this.widgetText.substring(0, this.caretIndex) + text + this.widgetText.substring(this.caretIndex, this.widgetText.length());
          } else {
            this.widgetText = this.widgetText + text;
          }
          this.caretIndex = this.caretIndex + text.length();
          this.selectionAnchorIndex = this.caretIndex;
          this.notifyTextInputChanged((byte) -36);
          return;
        } catch (java.lang.RuntimeException insertionFailure) {
          caughtInsertionFailure = insertionFailure;
          textInsertionFailure = caughtInsertionFailure;
          insertionFailureForContext = textInsertionFailure;
          insertionContextBuilder = new StringBuilder().append("dj.B(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) insertionFailureForContext), ((StringBuilder) (Object) insertionContextBuilder).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final void moveCaret(int newCaretIndex, byte methodGuard) {
        this.caretIndex = newCaretIndex;
        if (methodGuard >= -114) {
            this.updateCaretScroll(-114);
        }
        if (!MidiPcmStream.heldInternalKeys[81]) {
            this.selectionAnchorIndex = this.caretIndex;
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        diskSectorBuffer = null;
        if (methodGuard != -15) {
            return;
        }
        projectedMeshVertexY = null;
        byteArrayPool100 = (byte[][]) null;
    }

    final boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int hitCaretIndexSnapshot = 0;
        boolean doubleClickSnapshot = false;
        RuntimeException pressFailureForContext = null;
        StringBuilder pressContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPressFailure = null;
        int hitTextIndexOrGuardQuotient = 0;
        long nowMillis = 0L;
        RuntimeException pointerPressFailure = null;
        try {
          if (super.handlePointerPress(parentY, 104, parentX, pointerButton, pointerX, pointerY, eventContext) &&
              this.renderer instanceof TextWidgetLayout) {
            hitTextIndexOrGuardQuotient = ((TextWidgetLayout) ((Object) this.renderer)).hitTestCaretIndex((UiWidget) (this), PrefixCodeDecoder.pointerXSnapshot, -15539, parentY, PcmResampler.pointerYSnapshot, parentX);
            if (hitTextIndexOrGuardQuotient != -1) {
              hitCaretIndexSnapshot = hitTextIndexOrGuardQuotient;
            } else {
              hitCaretIndexSnapshot = 0;
            }
            this.moveCaret(hitCaretIndexSnapshot, (byte) -123);
            nowMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
            doubleClickSnapshot = !(nowMillis - this.lastPointerPressMillis >= 250L);
            this.wordSelectionDrag = doubleClickSnapshot;
            if (this.wordSelectionDrag) {
              this.selectionAnchorIndex = this.findPreviousWordBoundary((byte) 77);
              this.caretIndex = this.findNextWordBoundary((byte) -57);
              if (0 < this.caretIndex &&
                  this.widgetText.charAt(this.caretIndex - 1) == 32) {
                this.caretIndex = this.caretIndex - 1;
              }
              this.wordSelectionEndIndex = this.caretIndex;
            }
            this.lastPointerPressMillis = nowMillis;
            return true;
          }
          hitTextIndexOrGuardQuotient = 70 / ((methodGuard + 3) / 38);
          return false;
        } catch (java.lang.RuntimeException pressFailure) {
          caughtPressFailure = pressFailure;
          pointerPressFailure = caughtPressFailure;
          pressFailureForContext = pointerPressFailure;
          pressContextBuilder = new StringBuilder().append("dj.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pressFailureForContext), ((StringBuilder) (Object) pressContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    private final void pasteClipboardText(int methodGuard) {
        try {
            Throwable caughtClipboardFailure = null;
            String clipboardText = null;
            Exception clipboardFailure = null;
            try {
              clipboardText = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.deleteSelectedText(methodGuard ^ methodGuard);
              this.insertTextAtCaret(clipboardText, methodGuard ^ 43);
            } catch (java.lang.Exception clipboardException) {
              caughtClipboardFailure = clipboardException;
              clipboardFailure = (Exception) (Object) caughtClipboardFailure;
            }
        } catch (RuntimeException | Error uncheckedClipboardFailure) {
            throw uncheckedClipboardFailure;
        } catch (Throwable checkedClipboardFailure) {
            throw new RuntimeException(checkedClipboardFailure);
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int guardResidue;
        TextWidgetLayout textRenderer;
        long nowMillis;
        guardResidue = -124 % ((methodGuard - 1) / 43);
        if (this.renderer != null &&
            renderPass == 0) {
          this.renderer.drawWidget(parentX, -8, parentY, this.enabled, (UiWidget) (this));
          if (this.renderer instanceof TextWidgetLayout) {
            textRenderer = (TextWidgetLayout) ((Object) this.renderer);
            if (this.caretIndex != this.selectionAnchorIndex) {
              textRenderer.drawSelection(this.selectionAnchorIndex, 0, parentY, parentX, this.caretIndex, (UiWidget) (this));
            }
            nowMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
            if ((-this.caretBlinkStartMillis + nowMillis) % 1000L < 500L) {
              textRenderer.drawCaret(parentX, this.caretIndex, -2, (UiWidget) (this), parentY);
            }
          }
        }
    }

    private final void notifyTextInputSubmitted(byte methodGuard) {
        if (this.listener instanceof TextInputListener) {
            ((TextInputListener) ((Object) this.listener)).onTextInputSubmitted(this, -18649);
        }
        if (methodGuard < 107) {
            this.wordSelectionDrag = true;
        }
    }

    private final int findPreviousWordBoundary(byte methodGuard) {
        int boundaryIndex;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (0 == this.caretIndex) {
          return this.caretIndex;
        }
        if (methodGuard != 77) {
          return 108;
        }
        for (boundaryIndex = this.caretIndex - 1; boundaryIndex > 0; boundaryIndex--) {
          if (this.widgetText.charAt(boundaryIndex - 1) != 32) {
            continue;
          }
          break;
        }
        return boundaryIndex;
    }

    private final void copySelectedTextToClipboard(int methodGuard) {
        if (methodGuard != -23161) {
            return;
        }
        String selectedText = this.getSelectedText((byte) -128);
        if (selectedText.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) -117))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void clearInputText(byte methodGuard) {
        this.selectionAnchorIndex = 0;
        this.caretIndex = 0;
        this.widgetText = "";
        this.notifyTextInputChanged((byte) -78);
        if (methodGuard <= 20) {
            this.caretScrollingEnabled = true;
        }
    }

    final boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        int textEndBeforeCaretAssignment = 0;
        int forwardCaretIndex = 0;
        int backwardCaretIndex = 0;
        RuntimeException keyFailureForContext = null;
        StringBuilder keyContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        RuntimeException keyInputFailure = null;
        try {
          if (methodGuard != 13) {
            return false;
          }
          this.caretBlinkStartMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
          if (60 == typedCharacter) {
            return false;
          }
          if (typedCharacter == 62) {
            return false;
          }
          if (32 <= typedCharacter &&
              typedCharacter <= 126) {
            if (this.caretIndex != this.selectionAnchorIndex) {
              this.deleteSelectedText(0);
            }
            if (-1 == this.maximumTextLength ||
                  !(this.widgetText.length() >= this.maximumTextLength)) {
              if (this.caretIndex >= this.widgetText.length()) {
                this.widgetText = this.widgetText + typedCharacter;
                textEndBeforeCaretAssignment = this.widgetText.length();
                this.caretIndex = textEndBeforeCaretAssignment;
                this.selectionAnchorIndex = textEndBeforeCaretAssignment;
              } else {
                this.widgetText = this.widgetText.substring(0, this.caretIndex) + typedCharacter + this.widgetText.substring(this.caretIndex, this.widgetText.length());
                this.caretIndex = this.caretIndex + 1;
                this.selectionAnchorIndex = this.caretIndex;
              }
              this.notifyTextInputChanged((byte) -36);
            }
            return true;
          }
          if (keyCode == 85) {
            if (this.caretIndex != this.selectionAnchorIndex) {
              this.deleteSelectedText(0);
              return true;
            }
            if (0 < this.caretIndex) {
              this.selectionAnchorIndex = this.caretIndex - 1;
              this.deleteSelectedText(methodGuard ^ 13);
              return true;
            }
          } else {
            if (101 != keyCode) {
              if (keyCode == 13) {
                this.clearInputText((byte) 76);
                return true;
              }
              if (keyCode == 96) {
                if (0 < this.caretIndex) {
                  if (!MidiPcmStream.heldInternalKeys[82]) {
                    backwardCaretIndex = this.caretIndex - 1;
                  } else {
                    backwardCaretIndex = this.findPreviousWordBoundary((byte) 77);
                  }
                  this.moveCaret(backwardCaretIndex, (byte) -126);
                  return true;
                }
              } else {
                if (keyCode == 97) {
                  if (this.caretIndex < this.widgetText.length()) {
                    if (!MidiPcmStream.heldInternalKeys[82]) {
                      forwardCaretIndex = this.caretIndex + 1;
                    } else {
                      forwardCaretIndex = this.findNextWordBoundary((byte) -57);
                    }
                    this.moveCaret(forwardCaretIndex, (byte) -125);
                    return true;
                  }
                } else {
                  if (102 == keyCode) {
                    this.moveCaret(0, (byte) -118);
                    return true;
                  }
                  if (keyCode == 103) {
                    this.moveCaret(this.widgetText.length(), (byte) -126);
                    return true;
                  }
                  if (keyCode == 84) {
                    this.notifyTextInputSubmitted((byte) 111);
                    return true;
                  }
                  if (MidiPcmStream.heldInternalKeys[82] &&
                      keyCode == 65) {
                    this.cutSelectedText(112);
                    return true;
                  }
                  if (MidiPcmStream.heldInternalKeys[82] &&
                      keyCode == 66) {
                    this.copySelectedTextToClipboard(-23161);
                    return true;
                  }
                  if (MidiPcmStream.heldInternalKeys[82] &&
                      67 == keyCode) {
                    this.pasteClipboardText(82);
                    return true;
                  }
                }
              }
            } else {
              if (this.selectionAnchorIndex != this.caretIndex) {
                this.deleteSelectedText(0);
                return true;
              }
              if (this.caretIndex < this.widgetText.length()) {
                this.selectionAnchorIndex = this.caretIndex + 1;
                this.deleteSelectedText(0);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException keyFailure) {
          caughtKeyFailure = keyFailure;
          keyInputFailure = caughtKeyFailure;
          keyFailureForContext = keyInputFailure;
          keyContextBuilder = new StringBuilder().append("dj.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureForContext), ((StringBuilder) (Object) keyContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    private final void updateCaretScroll(int methodGuard) {
        TextLayout layout;
        int textWidth;
        int availableTextWidth;
        int halfCaretMargin;
        int caretXWithOffset;
        int clientControlFlowSnapshot;
        TextWidgetLayout textRenderer;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (!this.caretScrollingEnabled) {
          this.textOffsetY = 0;
          this.textOffsetX = 0;
          return;
        }
        if (!(this.renderer instanceof TextWidgetLayout)) {
          return;
        }
        textRenderer = (TextWidgetLayout) ((Object) this.renderer);
        if (methodGuard > -66) {
          return;
        }
        layout = textRenderer.getTextLayout((byte) 119, (UiWidget) (this));
        textWidth = layout.getMaximumLineEndX(96);
        availableTextWidth = textRenderer.getAvailableTextWidth((UiWidget) (this), -1);
        halfCaretMargin = textRenderer.getFontHeight(1) >> 1;
        if (textWidth < availableTextWidth - halfCaretMargin) {
          this.textOffsetX = 0;
          this.textOffsetY = 0;
        } else {
          caretXWithOffset = this.textOffsetX + layout.getCaretX(this.caretIndex, 120);
          if (caretXWithOffset > availableTextWidth - halfCaretMargin) {
            this.textOffsetX = this.textOffsetX - (caretXWithOffset + halfCaretMargin - availableTextWidth);
          } else {
            if (caretXWithOffset < halfCaretMargin) {
              this.textOffsetX = this.textOffsetX - (-halfCaretMargin + caretXWithOffset);
            }
          }
          if (this.textOffsetX <= 0) {
            if (halfCaretMargin - availableTextWidth > this.textOffsetX) {
              this.textOffsetX = halfCaretMargin - availableTextWidth;
            }
          } else {
            this.textOffsetX = 0;
          }
        }
    }

    final void setInputText(int methodGuard, String text, boolean suppressChangeNotification) {
        int textEndBeforeCaretAssignment = 0;
        int guardQuotient = 0;
        int inputLength = 0;
        RuntimeException textSetFailureForContext = null;
        StringBuilder textSetContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtTextSetFailure = null;
        RuntimeException textSetFailure = null;
        try {
          guardQuotient = 8 / ((methodGuard + 65) / 44);
          if (text == null) {
            text = "";
          }
          this.widgetText = text;
          inputLength = text.length();
          if (this.maximumTextLength != -1 &&
              this.maximumTextLength < inputLength) {
            this.widgetText = this.widgetText.substring(0, this.maximumTextLength);
          }
          textEndBeforeCaretAssignment = this.widgetText.length();
          this.selectionAnchorIndex = textEndBeforeCaretAssignment;
          this.caretIndex = textEndBeforeCaretAssignment;
          if (!suppressChangeNotification) {
            this.notifyTextInputChanged((byte) -58);
          }
          return;
        } catch (java.lang.RuntimeException setTextFailure) {
          caughtTextSetFailure = setTextFailure;
          textSetFailure = caughtTextSetFailure;
          textSetFailureForContext = textSetFailure;
          textSetContextBuilder = new StringBuilder().append("dj.C(").append(methodGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textSetFailureForContext), ((StringBuilder) (Object) textSetContextBuilder).append(textDescription).append(',').append(suppressChangeNotification).append(')').toString());
        }
    }

    void notifyTextInputChanged(byte methodGuard) {
        if (methodGuard >= -16) {
            return;
        }
        if (this.listener instanceof TextInputListener) {
            ((TextInputListener) ((Object) this.listener)).onTextInputChanged(this, (byte) 74);
        }
    }

    static {
        diskSectorBuffer = new byte[520];
        byteArrayPool100 = new byte[1000][];
        projectedMeshVertexY = new int[8192];
    }
}
