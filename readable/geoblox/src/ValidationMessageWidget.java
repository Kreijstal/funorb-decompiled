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
            ValidationMessageWidget.j(-27);
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
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pi.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard <= -30) {
            return false;
          }
          this.animationTicks = 97;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pi.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        String var5;
        ValidationState var6;
        int var14;
        TextWidgetLayout var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        Sprite var18;
        Sprite var19;
        var14 = Geoblox.clientControlFlowFlag;
        var6 = this.validationProvider.a((byte) -105);
        if ((var6 != ImageProducerRasterBuffer.field_g) &&
            (var6 != WidgetSkinState.field_n)) {
          var5 = this.validationProvider.c(-21666);
          if (!(var5 != null)) {
            var5 = this.fallbackMessage;
          }
        } else {
          var5 = NanoFrameTimer.checkingText;
        }
        if (!var5.equals(this.widgetText)) {
          this.widgetText = var5;
          this.rebuildHotspotBounds(-55);
        }
        super.renderWidget(parentX, parentY, (byte) 106, renderPass);
        var6 = this.validationProvider.a((byte) -105);
        var8 = (TextWidgetLayout) ((Object) this.renderer);
        var9 = this.widgetX + parentX;
        var10 = var8.a(parentY, -2, (UiWidget) (this)) + (var8.a((byte) 125, (UiWidget) (this)).b(-3111) >> 1);
        var11 = 7 % ((methodGuard - 1) / 43);
        if (ImageProducerRasterBuffer.field_g == var6) {
          var19 = ClientClockSupport.validationStateSprites[0];
          var12 = var19.fullWidth << 1;
          var13 = var19.fullHeight << 1;
          if (this.spinnerSprite == null) {
            this.spinnerSprite = new Sprite(var12, var13);
            Geoblox.setRasterTarget(1, this.spinnerSprite);
          } else {
            if (this.spinnerSprite.width < var12) {
              this.spinnerSprite = new Sprite(var12, var13);
              Geoblox.setRasterTarget(1, this.spinnerSprite);
            } else {
              if (this.spinnerSprite.height < var13) {
                this.spinnerSprite = new Sprite(var12, var13);
                Geoblox.setRasterTarget(1, this.spinnerSprite);
              } else {
                Geoblox.setRasterTarget(1, this.spinnerSprite);
                SoftwareRasterizer.clearFramebuffer();
              }
            }
          }
          var19.rotateSmooth(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.animationTicks << 10, 4096);
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          this.spinnerSprite.drawAdditive(-(var19.fullWidth >> 1) + var9, var10 - var19.fullHeight, 256);
          return;
        }
        if (var6 != WidgetSkinState.field_n) {
          if (WidgetSkinState.field_m == var6) {
            var17 = ClientClockSupport.validationStateSprites[2];
            var17.drawAdditive(var9, var10 - (var17.height >> 1), 256);
            return;
          }
          if (SocketArchiveNetworkClient.field_w != var6) {
            return;
          }
          var16 = ClientClockSupport.validationStateSprites[1];
          var16.drawAdditive(var9, var10 - (var16.height >> 1), 256);
          return;
        }
        var18 = ClientClockSupport.validationStateSprites[0];
        var15 = var18;
        var12 = var18.fullWidth << 1;
        var13 = var18.fullHeight << 1;
        if (this.spinnerSprite == null) {
          this.spinnerSprite = new Sprite(var12, var13);
          Geoblox.setRasterTarget(1, this.spinnerSprite);
        } else {
          if (this.spinnerSprite.width < var12) {
            this.spinnerSprite = new Sprite(var12, var13);
            Geoblox.setRasterTarget(1, this.spinnerSprite);
          } else {
            if (this.spinnerSprite.height < var13) {
              this.spinnerSprite = new Sprite(var12, var13);
              Geoblox.setRasterTarget(1, this.spinnerSprite);
            } else {
              Geoblox.setRasterTarget(1, this.spinnerSprite);
              SoftwareRasterizer.clearFramebuffer();
            }
          }
        }
        var18.rotateSmooth(112, 144, var18.fullWidth << 4, var18.fullHeight << 4, -this.animationTicks << 10, 4096);
        RasterTargetRestoreSupport.restoreRasterTarget(true);
        this.spinnerSprite.drawAdditive(-(var18.fullWidth >> 1) + var9, var10 - var18.fullHeight, 256);
        return;
    }

    public static void j(int param0) {
        logoMeshCenters = (int[][]) null;
        gameOverMusicTrack = null;
        if (param0 != 24033) {
            logoMeshCenters = (int[][]) null;
            sweetsBackgroundSprite = null;
            return;
        }
        sweetsBackgroundSprite = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
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
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pi.<init>(" + (validationProvider != null ? "{...}" : "null") + ',' + (fallbackMessage != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + width + ',' + height + ')');
        }
    }

    static {
    }
}
