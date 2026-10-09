/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationMessageWidget extends HotspotTextWidget {
    private Sprite spinnerSprite;
    private int animationTicks;
    static int[][] logoMeshCenters;
    private ValidationProvider validationProvider;
    static IndexedSprite sweetsBackgroundSprite;
    static MusicScore gameOverMusicTrack;
    private String fallbackMessage;

    final String getHoverText(byte methodGuard) {
        if (methodGuard == 69) {
            return null;
        }
        return (String) null;
    }

    final static PaletteBitmapFont loadPaletteFontById(ResourceArchive fontMetricsArchive, int groupId, int methodGuard, ResourceArchive glyphGraphicsArchive, int fileId) {
        int sentinelRemainder = 0;
        RuntimeException fontFailureForContext = null;
        Object nullFontBeforeReturn = null;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeArchiveDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageBeforeGlyphArchive = null;
        String glyphArchiveDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          sentinelRemainder = -107 % ((-62 - methodGuard) / 58);
          if (SpawnQuotaSupport.decodeSpritesFromArchive(fileId, groupId, 116, glyphGraphicsArchive)) {
            fontBeforeReturn = MessageDialogContent.buildPaletteFontFromDecodedSprites(fontMetricsArchive.getFile(groupId, -28153, fileId), -108);
            return fontBeforeReturn;
          }
          nullFontBeforeReturn = null;
          return (PaletteBitmapFont) (nullFontBeforeReturn);
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeArchiveDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("pi.O(");
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageBeforeGlyphArchive = ((StringBuilder) (Object) fontMessagePrefix).append(metricsArchiveDescription).append(',').append(groupId).append(',').append(methodGuard).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeArchiveDescriptions), ((StringBuilder) (Object) fontMessageBeforeGlyphArchive).append(glyphArchiveDescription).append(',').append(fileId).append(')').toString());
        }
    }

    final static void decodeSocialSettingBits(int packedSettings, int methodGuard) {
        AsyncResourceDownloader.receivedSocialSettingHigh = packedSettings >> 4 & 3;
        if (!(AsyncResourceDownloader.receivedSocialSettingHigh <= 2)) {
            AsyncResourceDownloader.receivedSocialSettingHigh = 2;
        }
        ByteArrayBuffer.receivedSocialSettingMiddle = packedSettings >> 2 & 3;
        MidiNoteMixer.receivedSocialSettingLow = 3 & packedSettings;
        if (!(ByteArrayBuffer.receivedSocialSettingMiddle <= 2)) {
            ByteArrayBuffer.receivedSocialSettingMiddle = 2;
        }
        if (methodGuard != -12718) {
            ValidationMessageWidget.releaseStaticReferences(-27);
            if (MidiNoteMixer.receivedSocialSettingLow > 2) {
                MidiNoteMixer.receivedSocialSettingLow = 2;
                return;
            }
            return;
        }
        if (MidiNoteMixer.receivedSocialSettingLow <= 2) {
            return;
        }
        MidiNoteMixer.receivedSocialSettingLow = 2;
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            this.animationTicks = this.animationTicks + 1;
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
        } catch (RuntimeException pointerUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailure), "pi.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException focusFailureForContext = null;
        RuntimeException focusFailureBeforeDescription = null;
        StringBuilder focusMessagePrefix = null;
        String focusContextDescription = null;
        RuntimeException focusFailure = null;
        try {
          if (methodGuard <= -30) {
            return false;
          }
          this.animationTicks = 97;
          return false;
        } catch (java.lang.RuntimeException caughtFocusFailure) {
          focusFailure = caughtFocusFailure;
          focusFailureForContext = focusFailure;
          focusFailureBeforeDescription = focusFailureForContext;
          focusMessagePrefix = new StringBuilder().append("pi.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureBeforeDescription), ((StringBuilder) (Object) focusMessagePrefix).append(focusContextDescription).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        String displayMessage;
        ValidationState validationState;
        int clientControlFlowSnapshot;
        TextWidgetLayout textLayoutRenderer;
        int iconScreenX;
        int iconCenterY;
        int renderGuardRemainder;
        int requiredSpinnerWidth;
        int requiredSpinnerHeight;
        Sprite unusedPendingIconAlias;
        Sprite validIconSprite;
        Sprite invalidIconSprite;
        Sprite pendingIconSprite;
        Sprite debouncingIconSprite;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        validationState = this.validationProvider.getDebouncedValidationState((byte) -105);
        if (validationState != ImageProducerRasterBuffer.debouncingValidationState &&
            validationState != WidgetSkinState.pendingQueryValidationState) {
          displayMessage = this.validationProvider.getDebouncedValidationMessage(-21666);
          if (displayMessage == null) {
            displayMessage = this.fallbackMessage;
          }
        } else {
          displayMessage = NanoFrameTimer.checkingText;
        }
        if (!displayMessage.equals(this.widgetText)) {
          this.widgetText = displayMessage;
          this.rebuildHotspotBounds(-55);
        }
        super.renderWidget(parentX, parentY, (byte) 106, renderPass);
        validationState = this.validationProvider.getDebouncedValidationState((byte) -105);
        textLayoutRenderer = (TextWidgetLayout) ((Object) this.renderer);
        iconScreenX = this.widgetX + parentX;
        iconCenterY = textLayoutRenderer.getTextOriginY(parentY, -2, (UiWidget) (this)) + (textLayoutRenderer.getTextLayout((byte) 125, (UiWidget) (this)).getLayoutHeight(-3111) >> 1);
        renderGuardRemainder = 7 % ((methodGuard - 1) / 43);
        if (ImageProducerRasterBuffer.debouncingValidationState == validationState) {
          debouncingIconSprite = ClientClockSupport.validationStateSprites[0];
          requiredSpinnerWidth = debouncingIconSprite.fullWidth << 1;
          requiredSpinnerHeight = debouncingIconSprite.fullHeight << 1;
          if (this.spinnerSprite == null) {
            this.spinnerSprite = new Sprite(requiredSpinnerWidth, requiredSpinnerHeight);
            Geoblox.setRasterTarget(1, this.spinnerSprite);
          } else {
            if (this.spinnerSprite.width < requiredSpinnerWidth) {
              this.spinnerSprite = new Sprite(requiredSpinnerWidth, requiredSpinnerHeight);
              Geoblox.setRasterTarget(1, this.spinnerSprite);
            } else {
              if (this.spinnerSprite.height < requiredSpinnerHeight) {
                this.spinnerSprite = new Sprite(requiredSpinnerWidth, requiredSpinnerHeight);
                Geoblox.setRasterTarget(1, this.spinnerSprite);
              } else {
                Geoblox.setRasterTarget(1, this.spinnerSprite);
                SoftwareRasterizer.clearFramebuffer();
              }
            }
          }
          debouncingIconSprite.rotateSmooth(112, 144, debouncingIconSprite.fullWidth << 4, debouncingIconSprite.fullHeight << 4, -this.animationTicks << 10, 4096);
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          this.spinnerSprite.drawAdditive(-(debouncingIconSprite.fullWidth >> 1) + iconScreenX, iconCenterY - debouncingIconSprite.fullHeight, 256);
          return;
        }
        if (validationState != WidgetSkinState.pendingQueryValidationState) {
          if (WidgetSkinState.invalidInputValidationState == validationState) {
            invalidIconSprite = ClientClockSupport.validationStateSprites[2];
            invalidIconSprite.drawAdditive(iconScreenX, iconCenterY - (invalidIconSprite.height >> 1), 256);
            return;
          }
          if (SocketArchiveNetworkClient.validInputValidationState != validationState) {
            return;
          }
          validIconSprite = ClientClockSupport.validationStateSprites[1];
          validIconSprite.drawAdditive(iconScreenX, iconCenterY - (validIconSprite.height >> 1), 256);
          return;
        }
        pendingIconSprite = ClientClockSupport.validationStateSprites[0];
        unusedPendingIconAlias = pendingIconSprite;
        requiredSpinnerWidth = pendingIconSprite.fullWidth << 1;
        requiredSpinnerHeight = pendingIconSprite.fullHeight << 1;
        if (this.spinnerSprite == null) {
          this.spinnerSprite = new Sprite(requiredSpinnerWidth, requiredSpinnerHeight);
          Geoblox.setRasterTarget(1, this.spinnerSprite);
        } else {
          if (this.spinnerSprite.width < requiredSpinnerWidth) {
            this.spinnerSprite = new Sprite(requiredSpinnerWidth, requiredSpinnerHeight);
            Geoblox.setRasterTarget(1, this.spinnerSprite);
          } else {
            if (this.spinnerSprite.height < requiredSpinnerHeight) {
              this.spinnerSprite = new Sprite(requiredSpinnerWidth, requiredSpinnerHeight);
              Geoblox.setRasterTarget(1, this.spinnerSprite);
            } else {
              Geoblox.setRasterTarget(1, this.spinnerSprite);
              SoftwareRasterizer.clearFramebuffer();
            }
          }
        }
        pendingIconSprite.rotateSmooth(112, 144, pendingIconSprite.fullWidth << 4, pendingIconSprite.fullHeight << 4, -this.animationTicks << 10, 4096);
        RasterTargetRestoreSupport.restoreRasterTarget(true);
        this.spinnerSprite.drawAdditive(-(pendingIconSprite.fullWidth >> 1) + iconScreenX, iconCenterY - pendingIconSprite.fullHeight, 256);
        return;
    }

    public static void releaseStaticReferences(int methodGuard) {
        logoMeshCenters = (int[][]) null;
        gameOverMusicTrack = null;
        if (methodGuard != 24033) {
            logoMeshCenters = (int[][]) null;
            sweetsBackgroundSprite = null;
            return;
        }
        sweetsBackgroundSprite = null;
    }

    final static void renderAccountDialogLayer(boolean unusedRenderOption, boolean skipRendering) {
        if (skipRendering) {
            return;
        }
        ClientFlowState.accountDialogLayer.renderWidgetPassesAndTooltip(0, 0, 0);
    }

    ValidationMessageWidget(ValidationProvider validationProvider, String fallbackMessage, int x, int y, int width, int height) {
        super(fallbackMessage, TextWidgetSupport.getDefaultTextWidgetRenderer((byte) -66));
        try {
            this.validationProvider = validationProvider;
            this.fallbackMessage = fallbackMessage;
            this.setWidgetBounds(height, width, (byte) -77, y, x);
        } catch (RuntimeException messageInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageInitializationFailure), "pi.<init>(" + (validationProvider != null ? "{...}" : "null") + ',' + (fallbackMessage != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + width + ',' + height + ')');
        }
    }

    static {
    }
}
