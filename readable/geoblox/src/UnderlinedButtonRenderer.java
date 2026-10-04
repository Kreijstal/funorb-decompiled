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
        int stackIn_5_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Geoblox.clientControlFlowFlag;
        try {
          if ((!widget.pointerInside) &&
              (!widget.hasKeyboardFocus((byte) 54))) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.labelFont.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + widget.widgetText + "</u>", widget.widgetX + parentX, parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.labelFont.maxAscent + this.labelFont.maxDescent);
          if (methodGuard > -5) {
            UnderlinedButtonRenderer.decodeBase37DisplayName(53L, -116);
          }
          if (!widget.hasKeyboardFocus((byte) 54)) {
            return;
          }
          var7 = this.labelFont.measureTextWidth(widget.widgetText);
          var8 = this.labelFont.maxDescent + this.labelFont.maxAscent;
          var9 = widget.widgetX + parentX;
          if (this.horizontalAlignment == 2) {
            var9 = var9 + (-var7 + widget.widgetWidth);
          } else {
            if (this.horizontalAlignment == 1) {
              var9 = var9 + (-var7 + widget.widgetWidth >> 1);
            }
          }
          var10 = parentY + widget.widgetY;
          if (this.verticalAlignment == 2) {
            var10 = var10 + (widget.widgetHeight - var8);
          } else {
            if (this.verticalAlignment == 1) {
              var10 = var10 + (widget.widgetHeight - var8 >> 1);
            }
          }
          ImageProducerRasterBuffer.drawDottedWhiteFocusRectangle(var10 + 2, 4 + var7, 14164, var8, -2 + var9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("fh.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
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
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fh.<init>(" + (labelFont != null ? "{...}" : "null") + ',' + horizontalAlignment + ',' + verticalAlignment + ')');
        }
    }

    static {
        introFaceFrameStartTick = 0;
    }
}
