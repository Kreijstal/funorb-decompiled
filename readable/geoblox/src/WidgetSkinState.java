/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetSkinState {
    Sprite[] panelSprites;
    private int textAlpha;
    static ValidationState pendingQueryValidationState;
    private int textShadowColor;
    private boolean flushBeforeOverlay;
    private int textColor;
    private int offsetY;
    static String[] pendingUsernameSuggestions;
    Sprite icon;
    private int offsetX;
    static boolean archiveUseControlOpcode2;
    static ValidationState invalidInputValidationState;
    static int introFaceModulationRgb;
    static ClientFlowToken usernameQueryFlowState;

    final static String formatArchiveLoadingProgress(String fallbackText, int indexGuard, String loadingStageText, ResourceArchive archive) {
        RuntimeException loadingProgressFailure = null;
        String fallbackBeforeReturn = null;
        String progressBeforeReturn = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String fallbackDescription = null;
        StringBuilder contextAfterFallback = null;
        String stageDescription = null;
        StringBuilder contextAfterStage = null;
        String archiveDescription = null;
        RuntimeException caughtLoadingFailure = null;
        try {
          if (archive.ensureIndexLoaded(indexGuard ^ indexGuard)) {
            progressBeforeReturn = loadingStageText + " - " + archive.getLoadProgress((byte) 110) + "%";
            return progressBeforeReturn;
          }
          fallbackBeforeReturn = (String) (fallbackText);
          return fallbackBeforeReturn;
        } catch (java.lang.RuntimeException loadingException) {
          caughtLoadingFailure = loadingException;
          loadingProgressFailure = caughtLoadingFailure;
          failureBeforeContext = loadingProgressFailure;
          failureContextBuilder = new StringBuilder().append("si.A(");
          if (fallbackText == null) {
            fallbackDescription = "null";
          } else {
            fallbackDescription = "{...}";
          }
          contextAfterFallback = ((StringBuilder) (Object) failureContextBuilder).append(fallbackDescription).append(',').append(indexGuard).append(',');
          if (loadingStageText == null) {
            stageDescription = "null";
          } else {
            stageDescription = "{...}";
          }
          contextAfterStage = ((StringBuilder) (Object) contextAfterFallback).append(stageDescription).append(',');
          if (archive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) contextAfterStage).append(archiveDescription).append(')').toString());
        }
    }

    final WidgetSkinState setOffsetY(int methodGuard, int yOffset) {
        this.offsetY = yOffset;
        if (methodGuard != 0) {
            return (WidgetSkinState) null;
        }
        return this;
    }

    final WidgetSkinState setTextColor(int methodGuard, int color) {
        this.textColor = color;
        if (methodGuard != 256) {
            return (WidgetSkinState) null;
        }
        return this;
    }

    final WidgetSkinState setFlushBeforeOverlay(boolean flushEnabled, byte methodGuard) {
        this.flushBeforeOverlay = flushEnabled ? true : false;
        if (methodGuard != 73) {
            WidgetSkinState.releaseSharedResources(false);
            return this;
        }
        return this;
    }

    final void drawSkin(StatefulWidgetRenderer renderer, int parentX, int parentY, UiWidget widget, int methodGuard) {
        BitmapFont fontForParagraph = null;
        String textForParagraph = null;
        int effectiveOffsetX = 0;
        int textX;
        int paddingTopSnapshot;
        int widgetOriginY;
        int effectiveOffsetY = 0;
        int textY;
        int textWidth;
        int textHeight;
        int paragraphColor;
        int paragraphShadowColor;
        int paragraphAlpha;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String rendererDescription = null;
        StringBuilder contextAfterRenderer = null;
        String widgetDescription = null;
        RuntimeException caughtDrawFailure = null;
        int iconX = 0;
        String displayText = null;
        RuntimeException drawFailure = null;
        int iconY = 0;
        try {
          DelayedIncomingPacket.drawNineSlicePanel(widget.widgetY + parentY, parentX + widget.widgetX, widget.widgetHeight, (byte) -92, widget.widgetWidth, this.panelSprites);
          if (this.icon != null) {
            iconX = this.offsetX + (widget.widgetX + parentX);
            iconY = this.offsetY + parentY + widget.widgetY;
            if (renderer.horizontalAlignment == 1) {
              iconX = iconX + (-this.icon.fullWidth + widget.widgetWidth) / 2;
            }
            if (2 == renderer.horizontalAlignment) {
              iconX = iconX + (-this.icon.fullWidth + widget.widgetWidth);
            }
            if (renderer.verticalAlignment == 1) {
              iconY = iconY + (widget.widgetHeight - this.icon.fullHeight) / 2;
            }
            if (2 == renderer.verticalAlignment) {
              iconY = iconY + (-this.icon.fullHeight + widget.widgetHeight);
            }
            this.icon.draw(iconX, iconY);
          }
          if (methodGuard != 0) {
            pendingQueryValidationState = (ValidationState) null;
          }
          displayText = renderer.getDisplayText(120, widget);
          if (displayText != null &&
              null != renderer.font) {
            if (this.textColor < 0) {
              return;
            }
            fontForParagraph = renderer.font;
            textForParagraph = displayText;
            if (this.offsetX != -2147483648) {
              effectiveOffsetX = this.offsetX;
            } else {
              effectiveOffsetX = 0;
            }
            textX = effectiveOffsetX + renderer.paddingLeft + widget.widgetX + parentX;
            paddingTopSnapshot = renderer.paddingTop;
            widgetOriginY = widget.widgetY + parentY;
            if (this.offsetY == -2147483648) {
              effectiveOffsetY = 0;
            } else {
              effectiveOffsetY = this.offsetY;
            }
            textY = paddingTopSnapshot + (widgetOriginY + effectiveOffsetY);
            textWidth = -renderer.paddingLeft + widget.widgetWidth - renderer.paddingRight;
            textHeight = -renderer.paddingBottom + (-renderer.paddingTop + widget.widgetHeight);
            paragraphColor = this.textColor;
            paragraphShadowColor = this.textShadowColor;
            if (this.textAlpha != -2147483648) {
              paragraphAlpha = this.textAlpha;
            } else {
              paragraphAlpha = 256;
            }
            ((BitmapFont) (Object) fontForParagraph).drawParagraphAlpha(textForParagraph, textX, textY, textWidth, textHeight, paragraphColor, paragraphShadowColor, paragraphAlpha, renderer.horizontalAlignment, renderer.verticalAlignment, renderer.lineSpacing);
          }
          return;
        } catch (java.lang.RuntimeException drawException) {
          caughtDrawFailure = drawException;
          drawFailure = caughtDrawFailure;
          failureBeforeContext = drawFailure;
          failureContextBuilder = new StringBuilder().append("si.B(");
          if (renderer == null) {
            rendererDescription = "null";
          } else {
            rendererDescription = "{...}";
          }
          contextAfterRenderer = ((StringBuilder) (Object) failureContextBuilder).append(rendererDescription).append(',').append(parentX).append(',').append(parentY).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) contextAfterRenderer).append(widgetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final WidgetSkinState setTextShadowColor(byte methodGuard, int shadowColor) {
        this.textShadowColor = shadowColor;
        if (methodGuard != 16) {
            return (WidgetSkinState) null;
        }
        return this;
    }

    final WidgetSkinState setOffsetX(byte methodGuard, int xOffset) {
        this.offsetX = xOffset;
        if (methodGuard != -53) {
            this.flushBeforeOverlay = true;
            return this;
        }
        return this;
    }

    public static void releaseSharedResources(boolean enableArchiveControlOpcode) {
        pendingUsernameSuggestions = null;
        invalidInputValidationState = null;
        usernameQueryFlowState = null;
        if (enableArchiveControlOpcode) {
            archiveUseControlOpcode2 = true;
            pendingQueryValidationState = null;
            return;
        }
        pendingQueryValidationState = null;
    }

    final void mergeIntoWorkingSkin(int parentX, int parentY, WidgetSkinState targetSkin, StatefulWidgetRenderer renderer, int methodGuard, UiWidget widget) {
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String targetDescription = null;
        StringBuilder contextAfterTarget = null;
        String rendererDescription = null;
        StringBuilder contextAfterRenderer = null;
        String widgetDescription = null;
        RuntimeException caughtMergeFailure = null;
        RuntimeException mergeFailure = null;
        try {
          if (this.flushBeforeOverlay) {
            targetSkin.drawSkin(renderer, parentX, parentY, widget, 0);
            targetSkin.resetDrawingProperties((byte) -8);
          }
          if (methodGuard != -16566) {
            return;
          }
          if (this.offsetY != -2147483648) {
            targetSkin.offsetY = this.offsetY;
          }
          if (this.textShadowColor >= -1) {
            targetSkin.textShadowColor = this.textShadowColor;
          }
          if (this.textAlpha != -2147483648) {
            targetSkin.textAlpha = this.textAlpha;
          }
          if (null != this.panelSprites) {
            targetSkin.panelSprites = this.panelSprites;
          }
          if (null != this.icon) {
            targetSkin.icon = this.icon;
          }
          if (this.textColor >= -1) {
            targetSkin.textColor = this.textColor;
          }
          if (this.offsetX == -2147483648) {
            return;
          }
          targetSkin.offsetX = this.offsetX;
          return;
        } catch (java.lang.RuntimeException mergeException) {
          caughtMergeFailure = mergeException;
          mergeFailure = caughtMergeFailure;
          failureBeforeContext = mergeFailure;
          failureContextBuilder = new StringBuilder().append("si.F(").append(parentX).append(',').append(parentY).append(',');
          if (targetSkin == null) {
            targetDescription = "null";
          } else {
            targetDescription = "{...}";
          }
          contextAfterTarget = ((StringBuilder) (Object) failureContextBuilder).append(targetDescription).append(',');
          if (renderer == null) {
            rendererDescription = "null";
          } else {
            rendererDescription = "{...}";
          }
          contextAfterRenderer = ((StringBuilder) (Object) contextAfterTarget).append(rendererDescription).append(',').append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) contextAfterRenderer).append(widgetDescription).append(')').toString());
        }
    }

    final void copyPropertiesTo(int methodGuard, WidgetSkinState targetSkin) {
        try {
            targetSkin.textColor = this.textColor;
            if (methodGuard != 2) {
                Sprite[] unusedNullPanelSprites = (Sprite[]) null;
                this.setPanelSprites((Sprite[]) null, true);
            }
            targetSkin.textAlpha = this.textAlpha;
            targetSkin.offsetX = this.offsetX;
            targetSkin.panelSprites = this.panelSprites;
            targetSkin.icon = this.icon;
            targetSkin.flushBeforeOverlay = this.flushBeforeOverlay;
            targetSkin.offsetY = this.offsetY;
            targetSkin.textShadowColor = this.textShadowColor;
        } catch (RuntimeException copyFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) copyFailure), "si.G(" + methodGuard + ',' + (targetSkin != null ? "{...}" : "null") + ')');
        }
    }

    final WidgetSkinState setPanelSprites(Sprite[] sprites, boolean preserveShadowColor) {
        RuntimeException panelFailure = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String spritesDescription = null;
        RuntimeException caughtPanelFailure = null;
        try {
          if (!preserveShadowColor) {
            this.setTextShadowColor((byte) 66, -18);
          }
          this.panelSprites = sprites;
          return this;
        } catch (java.lang.RuntimeException panelException) {
          caughtPanelFailure = panelException;
          panelFailure = caughtPanelFailure;
          failureBeforeContext = panelFailure;
          failureContextBuilder = new StringBuilder().append("si.L(");
          if (sprites == null) {
            spritesDescription = "null";
          } else {
            spritesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(spritesDescription).append(',').append(preserveShadowColor).append(')').toString());
        }
    }

    final void resetDrawingProperties(byte methodGuard) {
        this.panelSprites = null;
        this.icon = null;
        this.textShadowColor = -1;
        this.offsetX = 0;
        this.textAlpha = 256;
        int guardArithmetic = 108 / ((57 - methodGuard) / 46);
        this.offsetY = 0;
        this.textColor = 0;
    }

    WidgetSkinState() {
        this.panelSprites = null;
        this.textShadowColor = -2;
        this.textAlpha = -2147483648;
        this.flushBeforeOverlay = false;
        this.textColor = -2;
        this.offsetY = -2147483648;
        this.icon = null;
        this.offsetX = -2147483648;
    }

    static {
        pendingQueryValidationState = new ValidationState();
        invalidInputValidationState = new ValidationState();
        introFaceModulationRgb = 5167632;
    }
}
