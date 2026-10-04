/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedTextLayout extends TextLayout {
    private int cachedAvailableWidth;
    private int cachedAvailableHeight;
    private String cachedText;
    private int cachedVerticalAlignment;
    private BitmapFont cachedFont;
    private int cachedHorizontalAlignment;
    static String loadingBootstrapText;
    static Sprite menuForegroundSprite;
    private int cachedLineSpacing;
    private boolean singleLineMode;
    static int introFaceFrameIndex;
    static int wheelRotationSnapshot;
    static MouseWheelInput mouseWheelInput;

    final static void compactDepthBucketFaceOrder(int guard) {
        int depthBucketIndex = 0;
        int destinationFaceOffset = 0;
        int bucketFaceCount = 0;
        int controlFlagSnapshot = 0;
        RuntimeException caughtCompactionFailure = null;
        RuntimeException compactionFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (guard != 2971) {
            return;
          }
          destinationFaceOffset = GameApplet.meshFaceCountsByDepthBucket[0];
          for (depthBucketIndex = 1; depthBucketIndex < GameApplet.meshFaceCountsByDepthBucket.length; depthBucketIndex++) {
            bucketFaceCount = GameApplet.meshFaceCountsByDepthBucket[depthBucketIndex];
            ArrayOperations.copyInts(InstrumentNoteMask.meshFaceOrder, depthBucketIndex << 4, InstrumentNoteMask.meshFaceOrder, destinationFaceOffset, bucketFaceCount);
            destinationFaceOffset = destinationFaceOffset + bucketFaceCount;
          }
          return;
        } catch (java.lang.RuntimeException caughtCompactionParameter) {
          caughtCompactionFailure = caughtCompactionParameter;
          compactionFailure = caughtCompactionFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) compactionFailure), "vc.G(" + guard + ')');
        }
    }

    final void layoutRightAlignedLine(int rightX, int baselineY, byte methodGuard, BitmapFont font, String text) {
        RuntimeException layoutFailureForContext = null;
        StringBuilder layoutContextBuilder = null;
        String fontDescription = null;
        StringBuilder layoutContextBeforeText = null;
        String textDescription = null;
        RuntimeException caughtLayoutFailure = null;
        RuntimeException rightLayoutFailure = null;
        BitmapFont unusedFont = null;
        TextLayoutLine line = null;
        TextLayoutLine lineAlias = null;
        try {
          if (text == null) {
            this.lines = null;
            return;
          }
          if ((this.cachedFont == font) &&
              (this.singleLineMode) &&
              (this.cachedHorizontalAlignment == 2) &&
              (null != this.cachedText) &&
              (this.cachedText.equals(text))) {
            return;
          }
          this.cachedFont = font;
          this.cachedText = text;
          this.singleLineMode = true;
          this.cachedHorizontalAlignment = 2;
          line = this.createSingleLine(-1, baselineY, font, text);
          lineAlias = line;
          lineAlias.caretX[0] = rightX - font.measureTextWidth(text);
          lineAlias.caretX[text.length()] = rightX;
          DialWidget.populateCaretPositions(0, lineAlias, text, 60, font);
          if (methodGuard >= -12) {
            unusedFont = (BitmapFont) null;
            this.layoutParagraph(98, 34, (String) null, 56, (BitmapFont) null, 65, 122, -79);
          }
          return;
        } catch (java.lang.RuntimeException layoutException) {
          caughtLayoutFailure = layoutException;
          rightLayoutFailure = caughtLayoutFailure;
          layoutFailureForContext = rightLayoutFailure;
          layoutContextBuilder = new StringBuilder().append("vc.D(").append(rightX).append(',').append(baselineY).append(',').append(methodGuard).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          layoutContextBeforeText = ((StringBuilder) (Object) layoutContextBuilder).append(fontDescription).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) layoutFailureForContext), ((StringBuilder) (Object) layoutContextBeforeText).append(textDescription).append(')').toString());
        }
    }

    final void layoutCenteredLine(String text, int baselineY, int centerX, byte methodGuard, BitmapFont font) {
        TextLayoutLine line = null;
        int textWidth = 0;
        if (text == null) {
            this.lines = null;
            return;
        }
        if (methodGuard != 58) {
            CachedTextLayout.compactDepthBucketFaceOrder(-90);
        }
        if (this.cachedFont == font && this.singleLineMode && this.cachedHorizontalAlignment == 1 && null != this.cachedText && this.cachedText.equals(text)) {
            return;
        }
        try {
            this.cachedHorizontalAlignment = 1;
            this.singleLineMode = true;
            this.cachedFont = font;
            line = this.createSingleLine(-1, baselineY, font, text);
            textWidth = font.measureTextWidth(text);
            line.caretX[0] = centerX - (textWidth >> 1);
            line.caretX[text.length()] = (textWidth >> 1) + centerX;
            DialWidget.populateCaretPositions(0, line, text, 60, font);
        } catch (RuntimeException centeredLayoutFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) centeredLayoutFailure), "vc.A(" + (text != null ? "{...}" : "null") + ',' + baselineY + ',' + centerX + ',' + methodGuard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    final void layoutLeftAlignedLine(int baselineY, int leftX, String text, int methodGuard, BitmapFont font) {
        TextLayoutLine line = null;
        TextLayoutLine lineAlias = null;
        if (text == null) {
            this.lines = null;
            return;
        }
        if (methodGuard > -89) {
            menuForegroundSprite = (Sprite) null;
        }
        if ((this.cachedFont == font && this.singleLineMode && 0 == this.cachedHorizontalAlignment && this.cachedText != null) &&
            ((this.cachedText.equals(text)))) {
            return;
        }
        try {
            this.cachedText = text;
            this.cachedHorizontalAlignment = 0;
            this.singleLineMode = true;
            this.cachedFont = font;
            line = this.createSingleLine(-1, baselineY, font, text);
            lineAlias = line;
            line.caretX[0] = leftX;
            lineAlias.caretX[text.length()] = font.measureTextWidth(text) + leftX;
            DialWidget.populateCaretPositions(0, lineAlias, text, 60, font);
        } catch (RuntimeException leftLayoutFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) leftLayoutFailure), "vc.E(" + baselineY + ',' + leftX + ',' + (text != null ? "{...}" : "null") + ',' + methodGuard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    final void layoutParagraph(int verticalAlignment, int lineArraySlack, String text, int lineSpacing, BitmapFont font, int availableWidth, int horizontalAlignment, int availableHeight) {
        TextLayoutLine unusedLineReceiverA;
        TextLayoutLine unusedLineReceiverB;
        int lineTopY;
        int lineBottomY;
        TextLayoutLine unusedLineReceiverC = null;
        TextLayoutLine unusedLineReceiverD = null;
        int lineCharacterCount = 0;
        int spaceJustification256 = 0;
        RuntimeException layoutFailureForContext = null;
        StringBuilder layoutContextBuilder = null;
        String textDescription = null;
        StringBuilder layoutContextBeforeFont = null;
        String fontDescription = null;
        RuntimeException caughtLayoutFailure = null;
        RuntimeException paragraphLayoutFailure = null;
        int lineCount = 0;
        int baselineY = 0;
        int lineIndexOrExtraSpacing = 0;
        String lineText = null;
        TextLayoutLine line = null;
        int clientControlFlowSnapshot = 0;
        String[] wrappedLines = null;
        String[] wrappedLinesAlias = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (lineSpacing == 0) {
            lineSpacing = font.lineAdvance;
          }
          if (text == null) {
            this.lines = null;
            return;
          }
          if ((font == this.cachedFont) &&
              (!this.singleLineMode) &&
              (this.cachedHorizontalAlignment == horizontalAlignment) &&
              (this.cachedVerticalAlignment == verticalAlignment) &&
              (this.cachedLineSpacing == lineSpacing) &&
              (availableHeight == this.cachedAvailableHeight) &&
              (availableWidth == this.cachedAvailableWidth) &&
              (null != this.cachedText) &&
              (this.cachedText.equals(text))) {
            return;
          }
          this.cachedAvailableHeight = availableHeight;
          this.cachedHorizontalAlignment = horizontalAlignment;
          this.cachedVerticalAlignment = verticalAlignment;
          this.cachedLineSpacing = lineSpacing;
          this.cachedAvailableWidth = availableWidth;
          this.cachedText = text;
          this.singleLineMode = false;
          this.cachedFont = font;
          wrappedLines = new String[lineArraySlack + font.countWrappedLines(text, availableWidth)];
          wrappedLinesAlias = wrappedLines;
          lineCount = Math.max(1, font.wrapText(text, new int[]{availableWidth}, wrappedLinesAlias));
          if ((this.cachedVerticalAlignment == 3) &&
              (lineCount == 1)) {
            this.cachedVerticalAlignment = 1;
          }
          this.lines = new TextLayoutLine[lineCount];
          if (this.cachedVerticalAlignment != 0) {
            if (this.cachedVerticalAlignment != 1) {
              if (this.cachedVerticalAlignment == 2) {
                baselineY = -font.maxDescent + this.cachedAvailableHeight - lineCount * this.cachedLineSpacing;
              } else {
                lineIndexOrExtraSpacing = (-(this.cachedLineSpacing * lineCount) + this.cachedAvailableHeight) / (lineCount + 1);
                if (lineIndexOrExtraSpacing < 0) {
                  lineIndexOrExtraSpacing = 0;
                }
                this.cachedLineSpacing = this.cachedLineSpacing + lineIndexOrExtraSpacing;
                baselineY = font.maxAscent + lineIndexOrExtraSpacing;
              }
            } else {
              baselineY = font.maxAscent + (this.cachedAvailableHeight - this.cachedLineSpacing * lineCount >> 1);
            }
          } else {
            baselineY = font.maxAscent;
          }
          for (lineIndexOrExtraSpacing = 0; lineIndexOrExtraSpacing < lineCount; lineIndexOrExtraSpacing++) {
            lineText = wrappedLines[lineIndexOrExtraSpacing];
            unusedLineReceiverA = null;
            unusedLineReceiverB = null;
            lineTopY = -font.maxAscent + baselineY;
            lineBottomY = baselineY + font.maxDescent;
            if (lineText == null) {
              unusedLineReceiverC = null;
              unusedLineReceiverD = null;
              lineCharacterCount = 0;
            } else {
              unusedLineReceiverC = null;
              unusedLineReceiverD = null;
              lineCharacterCount = lineText.length();
            }
            line = new TextLayoutLine(lineTopY, lineBottomY, lineCharacterCount);
            line.caretX[0] = 0;
            if (lineText != null) {
              line.caretX[lineText.length()] = font.measureTextWidth(lineText);
              if (horizontalAlignment != 3) {
                spaceJustification256 = 0;
              } else {
                spaceJustification256 = this.calculateSpaceJustification256(-116, font.measureTextWidth(lineText), availableWidth, lineText);
              }
              DialWidget.populateCaretPositions(spaceJustification256, line, lineText, 60, font);
            }
            this.lines[lineIndexOrExtraSpacing] = line;
            baselineY = baselineY + lineSpacing;
          }
          return;
        } catch (java.lang.RuntimeException layoutException) {
          caughtLayoutFailure = layoutException;
          paragraphLayoutFailure = caughtLayoutFailure;
          layoutFailureForContext = paragraphLayoutFailure;
          layoutContextBuilder = new StringBuilder().append("vc.B(").append(verticalAlignment).append(',').append(lineArraySlack).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          layoutContextBeforeFont = ((StringBuilder) (Object) layoutContextBuilder).append(textDescription).append(',').append(lineSpacing).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) layoutFailureForContext), ((StringBuilder) (Object) layoutContextBeforeFont).append(fontDescription).append(',').append(availableWidth).append(',').append(horizontalAlignment).append(',').append(availableHeight).append(')').toString());
        }
    }

    final static void drawPendingActionPanel(int methodGuard) {
        int pendingActionDrawTop = 0;
        if (methodGuard != -1) {
            introFaceFrameIndex = 119;
        }
        PendingActionMarker pendingActionMarkerForDrawing = (PendingActionMarker) ((Object) ArchiveRequest.pendingActionMarkers.firstForIteration(0));
        PendingActionMarker pendingActionMarkerBeforeNullCheck = pendingActionMarkerForDrawing;
        if (pendingActionMarkerBeforeNullCheck != null) {
            pendingActionDrawTop = LogoCompositor.pendingActionPanelTop;
            DelayedIncomingPacket.drawNineSlicePanel(pendingActionDrawTop, 10, RasterTargetSnapshot.pendingActionPanelHeight, (byte) -92, MultiHandleSliderRenderer.pendingActionPanelWidth, GameGraphicsResources.frameNineSliceSprites);
            UsernameAvailabilityQuery.achievementSprites[pendingActionMarkerForDrawing.actionId].drawQuarterSize(25, pendingActionDrawTop + (-32 + (RasterTargetSnapshot.pendingActionPanelHeight - 15)) / 2);
            FadingDialog.uiPaletteFont.drawParagraph(GameplaySetupSupport.achievementTitles[pendingActionMarkerForDrawing.actionId], 67, 15 + pendingActionDrawTop, MultiHandleSliderRenderer.pendingActionPanelWidth - 42 - 30, RasterTargetSnapshot.pendingActionPanelHeight - 30, 0, -1, 1, 1, 30);
        }
    }

    private final TextLayoutLine createSingleLine(int methodGuard, int baselineY, BitmapFont font, String text) {
        TextLayoutLine lineAlias = null;
        RuntimeException lineCreationFailure = null;
        BitmapFont unusedFont = null;
        TextLayoutLine line = null;
        TextLayoutLine lineBeforeReturn = null;
        RuntimeException creationFailureForContext = null;
        StringBuilder creationContextBuilder = null;
        String fontDescription = null;
        StringBuilder creationContextBeforeText = null;
        String textDescription = null;
        RuntimeException caughtCreationFailure = null;
        try {
          line = new TextLayoutLine(baselineY - font.maxAscent, baselineY + font.maxDescent, text.length());
          lineAlias = line;
          if (methodGuard != -1) {
            unusedFont = (BitmapFont) null;
            this.layoutParagraph(-65, -103, (String) null, -76, (BitmapFont) null, -99, 20, -32);
          }
          this.lines = new TextLayoutLine[]{line};
          lineBeforeReturn = lineAlias;
          return lineBeforeReturn;
        } catch (java.lang.RuntimeException creationException) {
          caughtCreationFailure = creationException;
          lineCreationFailure = caughtCreationFailure;
          creationFailureForContext = lineCreationFailure;
          creationContextBuilder = new StringBuilder().append("vc.C(").append(methodGuard).append(',').append(baselineY).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          creationContextBeforeText = ((StringBuilder) (Object) creationContextBuilder).append(fontDescription).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) creationFailureForContext), ((StringBuilder) (Object) creationContextBeforeText).append(textDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        loadingBootstrapText = null;
        menuForegroundSprite = null;
        mouseWheelInput = null;
        int guardResidue = 78 % ((-20 - methodGuard) / 33);
    }

    public CachedTextLayout() {
    }

    static {
        introFaceFrameIndex = 0;
    }
}
