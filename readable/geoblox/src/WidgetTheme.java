/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetTheme {
    private boolean wrapTooltips;
    int tooltipBackgroundColor;
    BitmapFont tooltipFont;
    WidgetRenderer buttonRenderer;
    int tooltipLineSpacing;
    int tooltipPaddingBottom;
    WidgetRenderer textInputRenderer;
    static int avatarShockEffectTicks;
    WidgetRenderer checkboxRenderer;
    WidgetRenderer fallbackButtonRenderer;
    int tooltipPaddingLeft;
    private int tooltipTextAndBorderColor;
    WidgetRenderer textRenderer;
    int tooltipPaddingRight;
    int tooltipPaddingTop;
    int wrappedTooltipBorderColor;

    private final void drawSingleLineTooltip(byte methodGuard, int pointerX, String text, int pointerY) {
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtTooltipFailure = null;
        int textWidth = 0;
        RuntimeException tooltipFailure = null;
        int textHeight = 0;
        int boxX = 0;
        int boxY = 0;
        String unusedNullTooltipText = null;
        try {
          textWidth = this.tooltipFont.measureTextWidth(text);
          textHeight = this.tooltipFont.maxDescent + this.tooltipFont.capitalXAscent;
          boxX = pointerX;
          if (SoftwareRasterizer.stride < 6 + boxX + textWidth) {
            boxX = -6 + SoftwareRasterizer.stride - textWidth;
          }
          boxY = -this.tooltipFont.capitalXAscent + (pointerY + 32);
          if (SoftwareRasterizer.framebufferHeight < 6 + (boxY + textHeight)) {
            boxY = SoftwareRasterizer.framebufferHeight - textHeight - 6;
          }
          SoftwareRasterizer.drawRectangle(boxX, boxY, 6 + textWidth, textHeight + 6, this.tooltipTextAndBorderColor);
          if (methodGuard != 69) {
            unusedNullTooltipText = (String) null;
            this.drawTooltip(-83, false, 61, (String) null);
          }
          SoftwareRasterizer.fillRectangle(1 + boxX, boxY + 1, textWidth + 4, 4 + textHeight, this.tooltipBackgroundColor);
          this.tooltipFont.drawText(text, 3 + boxX, this.tooltipFont.capitalXAscent + 3 + boxY, this.tooltipTextAndBorderColor, -1);
          return;
        } catch (java.lang.RuntimeException tooltipException) {
          caughtTooltipFailure = tooltipException;
          tooltipFailure = caughtTooltipFailure;
          failureBeforeContext = tooltipFailure;
          failureContextBuilder = new StringBuilder().append("wa.C(").append(methodGuard).append(',').append(pointerX).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(textDescription).append(',').append(pointerY).append(')').toString());
        }
    }

    final void initializeRenderers(int methodGuard, BitmapFont font) {
        TextWidgetRenderer baseTextRenderer = null;
        StatefulWidgetRenderer buttonSkinRenderer = null;
        Sprite[] disabledOverlayPanels = null;
        ArgbSprite overlaySprite = null;
        ArgbSprite overlaySpriteAlias = null;
        int overlayPixelIndex = 0;
        StatefulWidgetRenderer unusedLeftAlignedButtonRenderer = null;
        StatefulWidgetRenderer unusedSolidPanelButtonRenderer = null;
        DialRenderer unusedDialRenderer = null;
        MultiHandleSliderRenderer unusedSliderRenderer = null;
        StatefulWidgetRenderer inputSkinRenderer = null;
        Sprite[] twoColumnPanelSprites = null;
        Sprite[] twoRowPanelSprites = null;
        Sprite columnSpriteForPixelStore = null;
        StatefulWidgetRenderer unusedTwoColumnRenderer = null;
        StatefulWidgetRenderer unusedTwoRowRenderer = null;
        Sprite arrowSprite = null;
        StatefulWidgetRenderer unusedArrowButtonRenderer = null;
        StatefulWidgetRenderer unusedFinalArrowButtonRenderer = null;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
            baseTextRenderer = new TextWidgetRenderer(font, 2, 2, 2236962, 1, 1, 1, 2 + (font.maxAscent + font.maxDescent));
            this.textRenderer = (WidgetRenderer) ((Object) baseTextRenderer);
            baseTextRenderer.textColor = 16777215;
            buttonSkinRenderer = new StatefulWidgetRenderer();
            baseTextRenderer.copyStyleTo(buttonSkinRenderer, true);
            this.wrappedTooltipBorderColor = 15658734;
            buttonSkinRenderer.selectionArgb = 11711154;
            buttonSkinRenderer.caretColor = 15658734;
            this.tooltipBackgroundColor = 5592405;
            this.tooltipPaddingRight = 3;
            this.tooltipPaddingBottom = 3;
            this.tooltipTextAndBorderColor = 15658734;
            this.tooltipLineSpacing = -1;
            this.tooltipPaddingLeft = 3;
            this.tooltipPaddingTop = 3;
            this.tooltipFont = font;
            buttonSkinRenderer.replaceStateSkin(methodGuard - 126, 0).setTextColor(256, 15658734).setPanelSprites(WidgetTheme.createBeveledPanelSprites(10066329, 8947848, 7829367, 1), true);
            buttonSkinRenderer.replaceStateSkin(-106, 1).setPanelSprites(WidgetTheme.createBeveledPanelSprites(10066329, 11184810, 13421772, 1), true);
            buttonSkinRenderer.replaceStateSkin(methodGuard ^ -100, 3).setPanelSprites(WidgetTheme.createBeveledPanelSprites(7829367, 8947848, 10066329, methodGuard - 8), true).setOffsetX((byte) -53, 1).setOffsetY(methodGuard - 9, 1);
            disabledOverlayPanels = new Sprite[9];
            overlaySprite = new ArgbSprite(32, 32);
            overlaySpriteAlias = overlaySprite;
            for (overlayPixelIndex = 0; overlaySpriteAlias.pixels.length > overlayPixelIndex; overlayPixelIndex++) {
                overlaySprite.pixels[overlayPixelIndex] = 1077952576;
            }
            disabledOverlayPanels[4] = (Sprite) ((Object) overlaySpriteAlias);
            buttonSkinRenderer.replaceStateSkin(-127, 4).setFlushBeforeOverlay(true, (byte) 73).setPanelSprites(disabledOverlayPanels, true);
            buttonSkinRenderer.replaceStateSkin(-101, 5).setPanelSprites(IntrusiveDeque.buildUnitBorderNineSliceSprites(0, 0, 116, 0, 65793), true).setFlushBeforeOverlay(true, (byte) 73).setTextColor(256, -1);
            this.buttonRenderer = (WidgetRenderer) ((Object) buttonSkinRenderer);
            unusedLeftAlignedButtonRenderer = new StatefulWidgetRenderer(buttonSkinRenderer, true);
            unusedLeftAlignedButtonRenderer.horizontalAlignment = 0;
            unusedSolidPanelButtonRenderer = new StatefulWidgetRenderer(buttonSkinRenderer, true);
            unusedSolidPanelButtonRenderer.horizontalAlignment = 0;
            unusedSolidPanelButtonRenderer.setPanelSpritesOnExistingStates((byte) 124, MeshPrioritySupport.createSolidCenterSlices(8947848, (byte) -112));
            unusedSolidPanelButtonRenderer.replaceStateSkin(-116, 1).setPanelSprites(MeshPrioritySupport.createSolidCenterSlices(11184810, (byte) -112), true).setTextColor(256, 2236962);
            this.checkboxRenderer = (WidgetRenderer) ((Object) new CheckboxRenderer(font, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            unusedDialRenderer = new DialRenderer(font, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            unusedSliderRenderer = new MultiHandleSliderRenderer(font, 16777215, -1, 125269879, 4473924, 3, 268435455);
            inputSkinRenderer = new StatefulWidgetRenderer();
            baseTextRenderer.copyStyleTo(inputSkinRenderer, true);
            inputSkinRenderer.replaceStateSkin(-124, 0).setPanelSprites(WidgetTheme.createBeveledPanelSprites(7829367, 15658734, 10066329, 1), true).setTextColor(256, 1118481).setTextShadowColor((byte) 16, -1);
            inputSkinRenderer.replaceStateSkin(-105, 4).setFlushBeforeOverlay(true, (byte) 73).setPanelSprites(disabledOverlayPanels, true);
            this.textInputRenderer = (WidgetRenderer) ((Object) inputSkinRenderer);
            twoColumnPanelSprites = new Sprite[methodGuard];
            twoRowPanelSprites = new Sprite[9];
            twoColumnPanelSprites[4] = new Sprite(2, 1);
            twoRowPanelSprites[4] = new Sprite(1, 2);
            columnSpriteForPixelStore = twoColumnPanelSprites[4];
            columnSpriteForPixelStore.pixels = new int[]{6710886, 7829367};
            twoRowPanelSprites[4].pixels = new int[]{6710886, 7829367};
            unusedTwoColumnRenderer = new StatefulWidgetRenderer();
            unusedTwoRowRenderer = new StatefulWidgetRenderer();
            unusedTwoColumnRenderer.setStatePanelSprites(twoColumnPanelSprites, 0, (byte) 57);
            unusedTwoRowRenderer.setStatePanelSprites(twoRowPanelSprites, 0, (byte) 108);
            arrowSprite = new Sprite(7, 4);
            arrowSprite.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            unusedArrowButtonRenderer = new StatefulWidgetRenderer(buttonSkinRenderer, true);
            unusedArrowButtonRenderer.setIconOnExistingStates(0, arrowSprite.copy());
            arrowSprite.rotateClockwise();
            unusedArrowButtonRenderer = new StatefulWidgetRenderer(buttonSkinRenderer, true);
            unusedArrowButtonRenderer.setIconOnExistingStates(methodGuard ^ 9, arrowSprite.copy());
            arrowSprite.rotateClockwise();
            unusedArrowButtonRenderer = new StatefulWidgetRenderer(buttonSkinRenderer, true);
            unusedArrowButtonRenderer.setIconOnExistingStates(0, arrowSprite.copy());
            arrowSprite.rotateClockwise();
            unusedFinalArrowButtonRenderer = new StatefulWidgetRenderer(buttonSkinRenderer, true);
            unusedFinalArrowButtonRenderer.setIconOnExistingStates(methodGuard ^ 9, arrowSprite);
        } catch (RuntimeException initializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailure), "wa.B(" + methodGuard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawWrappedTooltip(int pointerY, String text, int pointerX, int methodGuard) {
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtTooltipFailure = null;
        int horizontalPadding = 0;
        RuntimeException tooltipFailure = null;
        int verticalPadding = 0;
        int lineSpacing = 0;
        int quarterRasterWidth = 0;
        int textWidth = 0;
        int textHeight = 0;
        int lineCount = 0;
        int wrapWidthOrBoxX = 0;
        int widthChunkCountOrLineIndexOrBoxY = 0;
        int measuredLineWidth = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          horizontalPadding = this.tooltipPaddingRight + this.tooltipPaddingLeft;
          verticalPadding = this.tooltipPaddingBottom + this.tooltipPaddingTop;
          lineSpacing = this.tooltipLineSpacing;
          if (methodGuard != -3140) {
            return;
          }
          if (-1 == lineSpacing) {
            lineSpacing = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          }
          quarterRasterWidth = SoftwareRasterizer.stride >> 2;
          textWidth = this.tooltipFont.measureTextWidth(text);
          textHeight = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          lineCount = 1;
          if ((((quarterRasterWidth < textWidth)) ||
              (-1 != text.indexOf("<br>")))) {
            if (FadingDialog.wrappedTooltipLines == null) {
              FadingDialog.wrappedTooltipLines = new String[16];
            }
            if (quarterRasterWidth >= textWidth) {
              wrapWidthOrBoxX = quarterRasterWidth;
            } else {
              widthChunkCountOrLineIndexOrBoxY = textWidth / quarterRasterWidth;
              wrapWidthOrBoxX = (textWidth % quarterRasterWidth + widthChunkCountOrLineIndexOrBoxY - 1) / widthChunkCountOrLineIndexOrBoxY * 2 + quarterRasterWidth;
            }
            lineCount = this.tooltipFont.wrapText(text, new int[]{wrapWidthOrBoxX}, FadingDialog.wrappedTooltipLines);
            textWidth = 0;
            textHeight = textHeight + (lineCount - 1) * lineSpacing;
            for (widthChunkCountOrLineIndexOrBoxY = 0; widthChunkCountOrLineIndexOrBoxY < lineCount; widthChunkCountOrLineIndexOrBoxY++) {
              measuredLineWidth = this.tooltipFont.measureTextWidth(FadingDialog.wrappedTooltipLines[widthChunkCountOrLineIndexOrBoxY]);
              if (measuredLineWidth <= textWidth) {
                continue;
              }
              textWidth = measuredLineWidth;
            }
          }
          wrapWidthOrBoxX = pointerX;
          if (horizontalPadding + textWidth + wrapWidthOrBoxX > SoftwareRasterizer.stride) {
            wrapWidthOrBoxX = -horizontalPadding + (SoftwareRasterizer.stride - textWidth);
          }
          widthChunkCountOrLineIndexOrBoxY = 32 + (-this.tooltipFont.capitalXAscent + pointerY);
          if (SoftwareRasterizer.framebufferHeight < textHeight + (widthChunkCountOrLineIndexOrBoxY + verticalPadding)) {
            widthChunkCountOrLineIndexOrBoxY = pointerY - textHeight - verticalPadding;
          }
          SoftwareRasterizer.drawRectangle(wrapWidthOrBoxX, widthChunkCountOrLineIndexOrBoxY, horizontalPadding + textWidth, textHeight + verticalPadding, this.wrappedTooltipBorderColor);
          SoftwareRasterizer.fillRectangle(1 + wrapWidthOrBoxX, 1 + widthChunkCountOrLineIndexOrBoxY, textWidth + (horizontalPadding - 2), -2 + (textHeight + verticalPadding), this.tooltipBackgroundColor);
          this.tooltipFont.drawParagraph(text, this.tooltipPaddingLeft + wrapWidthOrBoxX, this.tooltipPaddingTop + widthChunkCountOrLineIndexOrBoxY, textWidth, textHeight, this.tooltipTextAndBorderColor, -1, 0, 0, lineSpacing);
          return;
        } catch (java.lang.RuntimeException tooltipException) {
          caughtTooltipFailure = tooltipException;
          tooltipFailure = caughtTooltipFailure;
          failureBeforeContext = tooltipFailure;
          failureContextBuilder = new StringBuilder().append("wa.G(").append(pointerY).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(textDescription).append(',').append(pointerX).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void drawTooltip(int pointerY, boolean methodGuard, int pointerX, String text) {
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String textDescription = null;
        RuntimeException caughtTooltipFailure = null;
        RuntimeException tooltipFailure = null;
        try {
          if (!this.wrapTooltips) {
            this.drawSingleLineTooltip((byte) 69, pointerX, text, pointerY);
          } else {
            this.drawWrappedTooltip(pointerY, text, pointerX, -3140);
          }
          if (!methodGuard) {
            this.checkboxRenderer = (WidgetRenderer) null;
          }
          return;
        } catch (java.lang.RuntimeException tooltipException) {
          caughtTooltipFailure = tooltipException;
          tooltipFailure = caughtTooltipFailure;
          failureBeforeContext = tooltipFailure;
          failureContextBuilder = new StringBuilder().append("wa.D(").append(pointerY).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(textDescription).append(')').toString());
        }
    }

    private final static Sprite[] createBeveledPanelSprites(int firstBorderColor, int centerColor, int secondBorderColor, int methodGuard) {
        if (methodGuard != 1) {
            WidgetTheme.createBeveledPanelSprites(-34, 65, 52, 47);
        }
        return TextInputWidget.createTwoTonePanelSprites(firstBorderColor, (byte) -70, secondBorderColor, centerColor, 1);
    }

    final void fillWidgetRectangleAlpha(int y, int height, int width, int alpha, int methodGuard, int color, int x) {
        if (methodGuard != 15658734) {
            return;
        }
        SoftwareRasterizer.fillRectangleAlpha(x, y, width, height, color, alpha);
    }

    final void drawWidgetLine(int endY, int endX, int color, int startY, int startX, int methodGuard) {
        SoftwareRasterizer.drawLine(startX, startY, endX, endY, color);
        if (methodGuard != 8947848) {
            this.tooltipPaddingBottom = 22;
        }
    }

    public WidgetTheme() {
        this.wrapTooltips = true;
    }

    final static int collectUnfinishedPopupPoints(int methodGuard) {
        int unfinishedPoints = 0;
        RuntimeException popupCollectionFailure = null;
        ScorePopup popup = null;
        int clientControlFlowSnapshot = 0;
        int pointsBeforeReturn = 0;
        RuntimeException caughtPopupFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          unfinishedPoints = 0;
          if (methodGuard != -25866) {
            WidgetTheme.createBeveledPanelSprites(53, -56, 122, 126);
          }
          popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.removeFirst((byte) -121));
          while (popup != null) {
            unfinishedPoints = unfinishedPoints + popup.points;
            popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.removeFirst((byte) -99));
          }
          pointsBeforeReturn = unfinishedPoints;
          return pointsBeforeReturn;
        } catch (java.lang.RuntimeException popupException) {
          caughtPopupFailure = popupException;
          popupCollectionFailure = caughtPopupFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) popupCollectionFailure), "wa.H(" + methodGuard + ')');
        }
    }

    static {
        avatarShockEffectTicks = 0;
    }
}
