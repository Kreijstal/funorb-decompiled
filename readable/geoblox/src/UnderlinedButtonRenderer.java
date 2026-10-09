/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnderlinedButtonRenderer implements WidgetRenderer {
    private int verticalAlignment;
    private int horizontalAlignment;
    private BitmapFont labelFont;
    static int introFaceFrameStartTick;
    static Sprite[] frameBottomSprites;

    final static void resetAccountUiFlow(int methodGuard) {
        AgeValidator.reconnectingLoginMode = false;
        MeshPrioritySupport.messageDialogUiFlowActive = false;
        MidiNote.setPendingLoginUiAction(-1, false);
        WidgetSkinState.usernameQueryFlowState = DiskCacheWorker.idleClientFlowToken;
        ClientFlowState.accountCreationFlowState = DiskCacheWorker.idleClientFlowToken;
        if (methodGuard != -6011) {
            introFaceFrameStartTick = 36;
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 1) {
            UnderlinedButtonRenderer.releaseStaticReferences(51);
            frameBottomSprites = null;
            return;
        }
        frameBottomSprites = null;
    }

    final static boolean isGuestSessionMode(int methodGuard) {
        if (methodGuard > -78) {
            return false;
        }
        return ProgressBarWidget.guestSessionMode;
    }

    final static String decodeBase37DisplayName(long encodedNameThenRemainingDigits, int methodGuard) {
        int digitCount = 0;
        long digitsForLengthCount = 0L;
        StringBuilder reversedNameBuilder = null;
        long encodedValueBeforeDivision = 0L;
        int decodedCharacterCode = 0;
        int precedingCharacterIndex = 0;
        StringBuilder unusedAppendResult = null;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (encodedNameThenRemainingDigits <= 0L) {
            return null;
        }
        if (encodedNameThenRemainingDigits >= 6582952005840035281L) {
            return null;
        }
        if (0L != encodedNameThenRemainingDigits % 37L) {
            digitCount = 0;
            digitsForLengthCount = encodedNameThenRemainingDigits;
            while (digitsForLengthCount != 0L) {
                digitsForLengthCount = digitsForLengthCount / 37L;
                digitCount++;
            }
            reversedNameBuilder = new StringBuilder(digitCount);
            while (encodedNameThenRemainingDigits != 0L) {
                encodedValueBeforeDivision = encodedNameThenRemainingDigits;
                encodedNameThenRemainingDigits = encodedNameThenRemainingDigits / 37L;
                decodedCharacterCode = SessionSocketSupport.base37NameAlphabet[(int)(-(37L * encodedNameThenRemainingDigits) + encodedValueBeforeDivision)];
                if (95 == decodedCharacterCode) {
                    precedingCharacterIndex = -1 + reversedNameBuilder.length();
                    decodedCharacterCode = 160;
                    reversedNameBuilder.setCharAt(precedingCharacterIndex, Character.toUpperCase(reversedNameBuilder.charAt(precedingCharacterIndex)));
                }
                unusedAppendResult = reversedNameBuilder.append((char) decodedCharacterCode);
            }
            reversedNameBuilder.reverse();
            int guardRemainder = 49 % ((27 - methodGuard) / 36);
            reversedNameBuilder.setCharAt(0, Character.toUpperCase(reversedNameBuilder.charAt(0)));
            return reversedNameBuilder.toString();
        }
        return null;
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        int selectedLabelColor = 0;
        RuntimeException drawingFailureBeforeDescription = null;
        StringBuilder drawingMessagePrefix = null;
        String widgetDescription = null;
        RuntimeException drawingFailure = null;
        int labelColor = 0;
        RuntimeException drawingFailureForContext = null;
        int labelWidth = 0;
        int labelHeight = 0;
        int labelScreenX = 0;
        int labelScreenY = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (!widget.pointerInside &&
              !widget.hasKeyboardFocus((byte) 54)) {
            selectedLabelColor = 2188450;
          } else {
            selectedLabelColor = 3249872;
          }
          labelColor = selectedLabelColor;
          this.labelFont.drawParagraph("<u=" + Integer.toString(labelColor, 16) + ">" + widget.widgetText + "</u>", widget.widgetX + parentX, parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, labelColor, -1, this.horizontalAlignment, this.verticalAlignment, this.labelFont.maxAscent + this.labelFont.maxDescent);
          if (methodGuard > -5) {
            UnderlinedButtonRenderer.decodeBase37DisplayName(53L, -116);
          }
          if (!widget.hasKeyboardFocus((byte) 54)) {
            return;
          }
          labelWidth = this.labelFont.measureTextWidth(widget.widgetText);
          labelHeight = this.labelFont.maxDescent + this.labelFont.maxAscent;
          labelScreenX = widget.widgetX + parentX;
          if (this.horizontalAlignment == 2) {
            labelScreenX = labelScreenX + (-labelWidth + widget.widgetWidth);
          } else {
            if (this.horizontalAlignment == 1) {
              labelScreenX = labelScreenX + (-labelWidth + widget.widgetWidth >> 1);
            }
          }
          labelScreenY = parentY + widget.widgetY;
          if (this.verticalAlignment == 2) {
            labelScreenY = labelScreenY + (widget.widgetHeight - labelHeight);
          } else {
            if (this.verticalAlignment == 1) {
              labelScreenY = labelScreenY + (widget.widgetHeight - labelHeight >> 1);
            }
          }
          ImageProducerRasterBuffer.drawDottedWhiteFocusRectangle(labelScreenY + 2, 4 + labelWidth, 14164, labelHeight, -2 + labelScreenX);
          return;
        } catch (java.lang.RuntimeException caughtDrawingFailure) {
          drawingFailure = caughtDrawingFailure;
          drawingFailureForContext = drawingFailure;
          drawingFailureBeforeDescription = drawingFailureForContext;
          drawingMessagePrefix = new StringBuilder().append("fh.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawingFailureBeforeDescription), ((StringBuilder) (Object) drawingMessagePrefix).append(widgetDescription).append(')').toString());
        }
    }

    public UnderlinedButtonRenderer() {
        this.verticalAlignment = 1;
        this.horizontalAlignment = 1;
        this.labelFont = DialogLayer.sharedUiFont;
    }

    UnderlinedButtonRenderer(BitmapFont labelFont, int horizontalAlignment, int verticalAlignment) {
        try {
            this.verticalAlignment = verticalAlignment;
            this.horizontalAlignment = horizontalAlignment;
            this.labelFont = labelFont;
        } catch (RuntimeException rendererInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rendererInitializationFailure), "fh.<init>(" + (labelFont != null ? "{...}" : "null") + ',' + horizontalAlignment + ',' + verticalAlignment + ')');
        }
    }

    static {
        introFaceFrameStartTick = 0;
    }
}
