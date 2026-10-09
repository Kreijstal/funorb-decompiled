/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FadingDialog extends WidgetContainer {
    private DialogLayer dialogLayer;
    boolean dialogVisible;
    static PaletteBitmapFont uiPaletteFont;
    static int variantMatchCandidateCount;
    static ResourceArchive interfaceTextArchive;
    private int dialogOpacity;
    static int decodedSpriteCanvasHeight;
    static String loadingMusicText;
    static String[] wrappedTooltipLines;

    final static boolean beginSessionRetryAndCheckStageEleven(byte methodGuard) {
        if (methodGuard != 47) {
            interfaceTextArchive = (ResourceArchive) null;
            return DelayedPcmStream.beginSessionRetryAndCheckStageEleven(true);
        }
        return DelayedPcmStream.beginSessionRetryAndCheckStageEleven(true);
    }

    final void resizeAndCenter(int targetHeight, int methodGuard, int targetWidth) {
        if (methodGuard > 95) {
            this.setWidgetBounds(targetHeight, targetWidth, (byte) -87, -targetHeight + MessageDialogSupport.accountUiViewportHeight >> 1, UsernameResponseSupport.accountUiViewportWidth - targetWidth >> 1);
            return;
        }
        uiPaletteFont = (PaletteBitmapFont) null;
        this.setWidgetBounds(targetHeight, targetWidth, (byte) -87, -targetHeight + MessageDialogSupport.accountUiViewportHeight >> 1, UsernameResponseSupport.accountUiViewportWidth - targetWidth >> 1);
    }

    private final int getTargetOpacity(int methodGuard) {
        int guardResidue = 80 % ((-11 - methodGuard) / 46);
        return !this.dialogVisible ? 0 : this.dialogLayer.getTopVisibleDialog(81) != this ? 0 : 256;
    }

    abstract void drawDialogFrame(int x, int methodGuard, int y);

    boolean advanceDialogAnimation(int methodGuard) {
        int targetOpacity = this.getTargetOpacity(-75);
        int opacityDelta = -this.dialogOpacity + targetOpacity;
        if (~opacityDelta < methodGuard) {
            this.dialogOpacity = this.dialogOpacity + (opacityDelta + 8 - 1) / 8;
        }
        if (opacityDelta < 0) {
            this.dialogOpacity = this.dialogOpacity + (-16 + (opacityDelta + 1)) / 16;
            if (this.dialogOpacity != 0) {
                return false;
            }
            if (0 == targetOpacity) {
                return !this.dialogVisible ? true : false;
            }
            return false;
        }
        if (this.dialogOpacity != 0) {
            return false;
        }
        if (0 == targetOpacity) {
            return !this.dialogVisible ? true : false;
        }
        return false;
    }

    FadingDialog(DialogLayer dialogLayer, int initialWidth, int initialHeight) {
        super(UsernameResponseSupport.accountUiViewportWidth - initialWidth >> 1, -initialHeight + MessageDialogSupport.accountUiViewportHeight >> 1, initialWidth, initialHeight, (WidgetRenderer) null);
        try {
            this.dialogLayer = dialogLayer;
            this.dialogOpacity = 0;
            this.dialogVisible = false;
        } catch (RuntimeException dialogConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogConstructionFailure), "dd.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + initialWidth + ',' + initialHeight + ')');
        }
    }

    final static boolean isPasswordAcceptableForUsername(String password, String username, int methodGuard) {
        RuntimeException passwordValidationFailureForContext = null;
        RuntimeException passwordFailureBeforeContext = null;
        StringBuilder passwordMessagePrefix = null;
        String passwordDescription = null;
        StringBuilder usernameMessagePrefix = null;
        String usernameDescription = null;
        RuntimeException caughtPasswordValidationFailure = null;
        try {
          if (TextValidationSupport.containsNonAsciiAlphanumeric(password, (byte) -67)) {
            return false;
          }
          if (SecondaryNodeDeque.hasUniformCharacters(18725, password)) {
            return false;
          }
          if (ArchiveCatalog.isPasswordLengthInvalid(password, methodGuard + 25409)) {
            return false;
          }
          if (username.length() == 0) {
            return true;
          }
          if (TextValidationSupport.containsTextOrReverse(password, username, -75)) {
            return false;
          }
          if (methodGuard != -25321) {
            FadingDialog.releaseFadingDialogResources(31);
          }
          if (UsernameAvailabilityValidator.usernameContainsPasswordOrReverse(8, username, password)) {
            return false;
          }
          if (!CrcAcknowledgedPacket.containsAccountNameOrReverse(password, username, (byte) -107)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException passwordValidationFailure) {
          caughtPasswordValidationFailure = passwordValidationFailure;
          passwordValidationFailureForContext = caughtPasswordValidationFailure;
          passwordFailureBeforeContext = passwordValidationFailureForContext;
          passwordMessagePrefix = new StringBuilder().append("dd.MB(");
          if (password == null) {
            passwordDescription = "null";
          } else {
            passwordDescription = "{...}";
          }
          usernameMessagePrefix = ((StringBuilder) (Object) passwordMessagePrefix).append(passwordDescription).append(',');
          if (username == null) {
            usernameDescription = "null";
          } else {
            usernameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) passwordFailureBeforeContext), ((StringBuilder) (Object) usernameMessagePrefix).append(usernameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    boolean settleDialogAnimation(int methodGuard) {
        this.dialogOpacity = this.getTargetOpacity(methodGuard - 297);
        if (methodGuard != 229) {
            return true;
        }
        if (0 != this.dialogOpacity) {
            return false;
        }
        if (!this.dialogVisible) {
            return true;
        }
        return false;
    }

    public static void releaseFadingDialogResources(int methodGuard) {
        if (methodGuard == 256) {
            interfaceTextArchive = null;
            loadingMusicText = null;
            uiPaletteFont = null;
            wrappedTooltipLines = null;
            return;
        }
        FadingDialog.beginSessionRetryAndCheckStageEleven((byte) -87);
        interfaceTextArchive = null;
        loadingMusicText = null;
        uiPaletteFont = null;
        wrappedTooltipLines = null;
    }

    final UiWidget findFocusTarget(byte methodGuard) {
        UiWidget focusedChild = super.findFocusTarget((byte) -62);
        if (methodGuard > -60) {
            this.dialogVisible = false;
            if (focusedChild != null) {
                return focusedChild;
            }
            return (UiWidget) (this);
        }
        if (focusedChild != null) {
            return focusedChild;
        }
        return (UiWidget) (this);
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int newScratchGuardQuotient = 0;
        int widerScratchGuardQuotient;
        int tallerScratchGuardQuotient;
        int reusedScratchGuardQuotient;
        if (this.dialogOpacity == 0) {
            return;
        }
        if (256 <= this.dialogOpacity) {
            if (renderPass != 0) {
                return;
            }
            this.drawDialogFrame(this.widgetX + parentX, 20, parentY + this.widgetY);
            super.renderWidget(parentX, parentY, (byte) -52, renderPass);
            return;
        }
        if (ByteArrayPoolSupport.fadingDialogScratchSprite == null) {
            ByteArrayPoolSupport.fadingDialogScratchSprite = new Sprite(this.widgetWidth, this.widgetHeight);
            newScratchGuardQuotient = 111 / ((1 - methodGuard) / 43);
            Geoblox.setRasterTarget(1, ByteArrayPoolSupport.fadingDialogScratchSprite);
            SoftwareRasterizer.clearFramebuffer();
            this.drawDialogFrame(0, 20, 0);
            super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            ByteArrayPoolSupport.fadingDialogScratchSprite.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
            return;
        }
        if (ByteArrayPoolSupport.fadingDialogScratchSprite.width < this.widgetWidth) {
            ByteArrayPoolSupport.fadingDialogScratchSprite = new Sprite(this.widgetWidth, this.widgetHeight);
            widerScratchGuardQuotient = 111 / ((1 - methodGuard) / 43);
            Geoblox.setRasterTarget(1, ByteArrayPoolSupport.fadingDialogScratchSprite);
            SoftwareRasterizer.clearFramebuffer();
            this.drawDialogFrame(0, 20, 0);
            super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            ByteArrayPoolSupport.fadingDialogScratchSprite.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
            return;
        }
        if (ByteArrayPoolSupport.fadingDialogScratchSprite.height < this.widgetHeight) {
            ByteArrayPoolSupport.fadingDialogScratchSprite = new Sprite(this.widgetWidth, this.widgetHeight);
            tallerScratchGuardQuotient = 111 / ((1 - methodGuard) / 43);
            Geoblox.setRasterTarget(1, ByteArrayPoolSupport.fadingDialogScratchSprite);
            SoftwareRasterizer.clearFramebuffer();
            this.drawDialogFrame(0, 20, 0);
            super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            ByteArrayPoolSupport.fadingDialogScratchSprite.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
            return;
        }
        reusedScratchGuardQuotient = 111 / ((1 - methodGuard) / 43);
        Geoblox.setRasterTarget(1, ByteArrayPoolSupport.fadingDialogScratchSprite);
        SoftwareRasterizer.clearFramebuffer();
        this.drawDialogFrame(0, 20, 0);
        super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
        RasterTargetRestoreSupport.restoreRasterTarget(true);
        ByteArrayPoolSupport.fadingDialogScratchSprite.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
    }

    static {
        variantMatchCandidateCount = 0;
        loadingMusicText = "Loading music";
    }
}
