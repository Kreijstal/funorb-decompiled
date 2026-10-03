/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FadingDialog extends WidgetContainer {
    private DialogLayer dialogLayer;
    boolean dialogVisible;
    static PaletteBitmapFont uiPaletteFont;
    static int variantMatchCandidateCount;
    static ResourceArchive field_J;
    private int dialogOpacity;
    static int decodedSpriteCanvasHeight;
    static String loadingMusicText;
    static String[] field_E;

    final static boolean a(byte param0) {
        if (param0 != 47) {
            field_J = (ResourceArchive) null;
            return DelayedPcmStream.b(true);
        }
        return DelayedPcmStream.b(true);
    }

    final void resizeAndCenter(int targetHeight, int methodGuard, int targetWidth) {
        if (methodGuard > 95) {
            this.setWidgetBounds(targetHeight, targetWidth, (byte) -87, -targetHeight + MessageDialogSupport.field_i >> 1, kb.field_b - targetWidth >> 1);
            return;
        }
        uiPaletteFont = (PaletteBitmapFont) null;
        this.setWidgetBounds(targetHeight, targetWidth, (byte) -87, -targetHeight + MessageDialogSupport.field_i >> 1, kb.field_b - targetWidth >> 1);
    }

    private final int getTargetOpacity(int methodGuard) {
        int guardResidue = 80 % ((-11 - methodGuard) / 46);
        return !this.dialogVisible ? 0 : this.dialogLayer.getTopVisibleDialog(81) != this ? 0 : 256;
    }

    abstract void b(int param0, int param1, int param2);

    boolean advanceDialogAnimation(int methodGuard) {
        int targetOpacity = this.getTargetOpacity(-75);
        int opacityDelta = -this.dialogOpacity + targetOpacity;
        if (!(~opacityDelta >= methodGuard)) {
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
        super(kb.field_b - initialWidth >> 1, -initialHeight + MessageDialogSupport.field_i >> 1, initialWidth, initialHeight, (WidgetRenderer) null);
        try {
            this.dialogLayer = dialogLayer;
            this.dialogOpacity = 0;
            this.dialogVisible = false;
        } catch (RuntimeException dialogConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogConstructionFailure), "dd.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + initialWidth + ',' + initialHeight + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ak.a(param0, (byte) -67)) {
            return false;
          }
          if (SecondaryNodeDeque.a(18725, param0)) {
            return false;
          }
          if (ArchiveCatalog.a(param0, param2 + 25409)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (ak.a(param0, param1, -75)) {
            return false;
          }
          if (param2 != -25321) {
            FadingDialog.i(31);
          }
          if (UsernameAvailabilityValidator.a(8, param1, param0)) {
            return false;
          }
          if (!CrcAcknowledgedPacket.a(param0, param1, (byte) -107)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("dd.MB(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
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

    public static void i(int param0) {
        if (param0 == 256) {
            field_J = null;
            loadingMusicText = null;
            uiPaletteFont = null;
            field_E = null;
            return;
        }
        FadingDialog.a((byte) -87);
        field_J = null;
        loadingMusicText = null;
        uiPaletteFont = null;
        field_E = null;
    }

    final UiWidget findFocusTarget(byte methodGuard) {
        UiWidget focusedChild = super.findFocusTarget((byte) -62);
        if (methodGuard > -60) {
            this.dialogVisible = false;
            if (!(focusedChild == null)) {
                return focusedChild;
            }
            return (UiWidget) (this);
        }
        if (!(focusedChild == null)) {
            return focusedChild;
        }
        return (UiWidget) (this);
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int guardResidue = 0;
        if (this.dialogOpacity == 0) {
            return;
        }
        if (256 <= this.dialogOpacity) {
            if (!(renderPass == 0)) {
                return;
            }
            this.b(this.widgetX + parentX, 20, parentY + this.widgetY);
            super.renderWidget(parentX, parentY, (byte) -52, renderPass);
            return;
        }
        if (oi.field_b == null) {
            oi.field_b = new Sprite(this.widgetWidth, this.widgetHeight);
            guardResidue = 111 / ((1 - methodGuard) / 43);
            Geoblox.setRasterTarget(1, oi.field_b);
            SoftwareRasterizer.clearFramebuffer();
            this.b(0, 20, 0);
            super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
            id.restoreRasterTarget(true);
            oi.field_b.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
            return;
        }
        if (oi.field_b.width < this.widgetWidth) {
            oi.field_b = new Sprite(this.widgetWidth, this.widgetHeight);
            guardResidue = 111 / ((1 - methodGuard) / 43);
            Geoblox.setRasterTarget(1, oi.field_b);
            SoftwareRasterizer.clearFramebuffer();
            this.b(0, 20, 0);
            super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
            id.restoreRasterTarget(true);
            oi.field_b.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
            return;
        }
        if (oi.field_b.height < this.widgetHeight) {
            oi.field_b = new Sprite(this.widgetWidth, this.widgetHeight);
            guardResidue = 111 / ((1 - methodGuard) / 43);
            Geoblox.setRasterTarget(1, oi.field_b);
            SoftwareRasterizer.clearFramebuffer();
            this.b(0, 20, 0);
            super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
            id.restoreRasterTarget(true);
            oi.field_b.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
            return;
        }
        guardResidue = 111 / ((1 - methodGuard) / 43);
        Geoblox.setRasterTarget(1, oi.field_b);
        SoftwareRasterizer.clearFramebuffer();
        this.b(0, 20, 0);
        super.renderWidget(-parentX - this.widgetX, -parentY - this.widgetY, (byte) 104, renderPass);
        id.restoreRasterTarget(true);
        oi.field_b.drawAlpha(parentX + this.widgetX, this.widgetY + parentY, this.dialogOpacity);
    }

    static {
        variantMatchCandidateCount = 0;
        loadingMusicText = "Loading music";
    }
}
