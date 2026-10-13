/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextWidget extends EditableTextWidget implements ValidationProvider {
    static boolean field_Z;
    private int pointerLocalX;
    private ValidationSource validationSource;
    static String field_Y;
    static String field_X;
    static long responseTargetAccountId;

    final void notifyTextChanged(byte obfuscationGuard) {
        if (obfuscationGuard >= -114) {
          this.getValidationSource(-106);
        }
        super.notifyTextChanged((byte) -117);
        if (null != this.validationSource) {
          this.validationSource.validationChanged(124);
        }
    }

    final String getTooltipText(int obfuscationGuard) {
        if (!this.hovered) {
          return null;
        }
        if (this.tooltipText == null) {
          return null;
        }
        ip.a(ko.pointerY, this.width - this.pointerLocalX + AiPlanningStrategy.pointerX, (byte) 113);
        if (obfuscationGuard != 21384) {
          return (String) null;
        }
        return this.tooltipText;
    }

    final static FullscreenDisplayMode[] getFullscreenDisplayModes(int obfuscationGuard, PlatformTaskService platformService) {
        int modeIndex = 0;
        FullscreenDisplayMode[] unsupportedModes = null;
        FullscreenDisplayMode[] failedModes = null;
        FullscreenDisplayMode[] decodedModes = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String serviceDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int[] modeValues = null;
        FullscreenDisplayMode[] modes = null;
        FullscreenDisplayMode mode = null;
        int obfuscationControl = 0;
        PlatformTask modeTask = null;
        int[] modeValuesAlias = null;
        int[] returnedModeValues = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!platformService.supportsFullscreen(false)) {
            unsupportedModes = new FullscreenDisplayMode[]{};
            return unsupportedModes;
          }
          modeTask = platformService.getDisplayModesAsync(-20681);
          while (0 == modeTask.status) {
            SpriteButtonPainter.a(10L, 0);
          }
          if (2 == modeTask.status) {
            failedModes = new FullscreenDisplayMode[]{};
            return failedModes;
          }
          returnedModeValues = (int[]) (modeTask.result);
          modeValuesAlias = returnedModeValues;
          modeValues = modeValuesAlias;
          modes = new FullscreenDisplayMode[returnedModeValues.length >> 2];
          if (obfuscationGuard >= -3) {
            field_X = (String) null;
          }
          for (modeIndex = 0; modeIndex < modes.length; modeIndex++) {
            mode = new FullscreenDisplayMode();
            modes[modeIndex] = mode;
            mode.width = modeValues[modeIndex << 2];
            mode.height = modeValues[(modeIndex << 2) + 1];
            mode.bitDepth = modeValues[(modeIndex << 2) + 2];
            mode.refreshRate = modeValues[(modeIndex << 2) + 3];
          }
          decodedModes = modes;
          return decodedModes;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ma.C(").append(obfuscationGuard).append(',');
          if (platformService == null) {
            serviceDescription = "null";
          } else {
            serviceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(serviceDescription).append(')').toString());
        }
    }

    public final ValidationSource getValidationSource(int obfuscationGuard) {
        if (obfuscationGuard != -918933630) {
          this.getValidationSource(-10);
        }
        return this.validationSource;
    }

    final static int diagonalNoiseGradient12(int offsetX12, int obfuscationGuard, int hash, int offsetY12) {
        if (obfuscationGuard != 3) {
          ValidatedTextWidget.diagonalNoiseGradient12(71, -15, 73, 84);
        }
        return ((hash & 1) == 0 ? offsetX12 : -offsetX12) + ((hash & 2) != 0 ? -offsetY12 : offsetY12);
    }

    ValidatedTextWidget(String text, WidgetListener listener, int maximumLength) {
        super(text, listener, maximumLength);
    }

    final void setValidationSource(byte obfuscationGuard, ValidationSource source) {
        try {
          this.validationSource = source;
          if (obfuscationGuard != 16) {
            ValidationSource var4 = (ValidationSource) null;
            this.setValidationSource((byte) -62, (ValidationSource) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ma.G(" + obfuscationGuard + ',' + (source != null ? "{...}" : "null") + ')');
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          if (obfuscationGuard != 32722) {
            this.pointerLocalX = 103;
          }
          super.updatePointer(obfuscationGuard + 0, originX, originY, rootWidget);
          this.pointerLocalX = AiPlanningStrategy.pointerX - this.x - originX;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ma.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_X = null;
        field_Y = null;
        int var1 = 21 % ((param0 + 67) / 48);
    }

    static {
        field_Y = "Units";
        field_X = "Items that can be given to units to improve their abilities in battle.";
        field_Z = true;
    }
}
