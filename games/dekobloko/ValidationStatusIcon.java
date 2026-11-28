/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusIcon extends InteractiveComponent {
    static SceneWidget sceneWidgetState0035;
    static int integerState0238;
    static RgbSprite[] rgbSpriteArrayState0013;
    private FieldValidator callbackContract011State0001;
    static String stringState0188;
    private int integerState0239;
    static LobbyRoomRow sceneWidgetPart013State0002;
    static int integerState0240;

    final void drawWidget(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        ValidationStatus validationStatusLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        RgbSprite rgbSpriteLocal7;
        RgbSprite rgbSpriteLocal8;
        RgbSprite rgbSpriteLocal9;
        RgbSprite rgbSpriteLocal10;
        RgbSprite rgbSpriteLocal11;
        RgbSprite rgbSpriteLocal12;
        RgbSprite rgbSpriteLocal13;
        RgbSprite rgbSpriteLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        ValidationStatus validationStatusLocal19;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        super.drawWidget(integerArgument1, -105, integerArgument3, integerArgument4);
        if (integerArgument3 != 0) {
          return;
        }
        integerLocal1 = (this.integerState0107 >> 1) + (this.integerState0110 + integerArgument1);
        integerLocal2 = integerArgument4 - (-this.integerState0104 - (this.integerState0108 >> 1));
        if (integerArgument2 > -103) {
          this.getTooltipText((byte) -60);
          validationStatusLocal3 = this.callbackContract011State0001.getValidationStatus(20350);
          if (MixedSupport076.validationStatusState0004 == validationStatusLocal3) {
            rgbSpriteLocal8 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[0];
            integerLocal4 = rgbSpriteLocal8.integerState0254 << 1;
            integerLocal5 = rgbSpriteLocal8.integerState0260 << 1;
            if (MixedSupport071.rgbSpriteState0027 != null &&
              integerLocal4 <= MixedSupport071.rgbSpriteState0027.integerState0258 &&
              integerLocal5 <= MixedSupport071.rgbSpriteState0027.integerState0255) {
              ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
              SoftwareRaster.clearRaster();
            } else {
              MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal4, integerLocal5);
              ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
            }
            rgbSpriteLocal8.drawRotatedAbout(112, 144, rgbSpriteLocal8.integerState0254 << 4, rgbSpriteLocal8.integerState0260 << 4, -this.integerState0239 << 10, 4096);
            ByteStorage.performAction1060((byte) -5);
            MixedSupport071.rgbSpriteState0027.drawAdditive(integerLocal1 - rgbSpriteLocal8.integerState0254, -rgbSpriteLocal8.integerState0260 + integerLocal2, 256);
            return;
          }
          if (DiagnosticSupport002.validationStatusState0002 != validationStatusLocal3) {
            if (validationStatusLocal3 == ReturnedShapeUpdate.validationStatusState0005) {
              rgbSpriteLocal10 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[2];
              rgbSpriteLocal10.drawAdditive(integerLocal1 - (rgbSpriteLocal10.integerState0258 >> 1), integerLocal2 - (rgbSpriteLocal10.integerState0255 >> 1), 256);
              return;
            }
            if (validationStatusLocal3 != MixedSupport023.validationStatusState0001) {
              return;
            }
            rgbSpriteLocal11 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[1];
            rgbSpriteLocal11.drawAdditive(-(rgbSpriteLocal11.integerState0258 >> 1) + integerLocal1, integerLocal2 - (rgbSpriteLocal11.integerState0255 >> 1), 256);
            return;
          }
          rgbSpriteLocal9 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[0];
          rgbSpriteLocal7 = rgbSpriteLocal9;
          integerLocal17 = rgbSpriteLocal9.integerState0254 << 1;
          integerLocal18 = rgbSpriteLocal9.integerState0260 << 1;
          if (MixedSupport071.rgbSpriteState0027 == null) {
            MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal17, integerLocal18);
            ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
          } else {
            if (integerLocal17 > MixedSupport071.rgbSpriteState0027.integerState0258) {
              MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal17, integerLocal18);
              ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
            } else {
              if (integerLocal18 <= MixedSupport071.rgbSpriteState0027.integerState0255) {
                ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
                SoftwareRaster.clearRaster();
              } else {
                MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal17, integerLocal18);
                ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
              }
            }
          }
          rgbSpriteLocal9.drawRotatedAbout(112, 144, rgbSpriteLocal9.integerState0254 << 4, rgbSpriteLocal9.integerState0260 << 4, -this.integerState0239 << 10, 4096);
          ByteStorage.performAction1060((byte) -5);
          MixedSupport071.rgbSpriteState0027.drawAdditive(integerLocal1 - rgbSpriteLocal9.integerState0254, -rgbSpriteLocal9.integerState0260 + integerLocal2, 256);
          return;
        }
        validationStatusLocal19 = this.callbackContract011State0001.getValidationStatus(20350);
        if (MixedSupport076.validationStatusState0004 != validationStatusLocal19 &&
          DiagnosticSupport002.validationStatusState0002 != validationStatusLocal19) {
          if (validationStatusLocal19 == ReturnedShapeUpdate.validationStatusState0005) {
            rgbSpriteLocal12 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[2];
            rgbSpriteLocal12.drawAdditive(integerLocal1 - (rgbSpriteLocal12.integerState0258 >> 1), integerLocal2 - (rgbSpriteLocal12.integerState0255 >> 1), 256);
            return;
          }
          if (validationStatusLocal19 != MixedSupport023.validationStatusState0001) {
            return;
          }
          rgbSpriteLocal13 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[1];
          rgbSpriteLocal13.drawAdditive(-(rgbSpriteLocal13.integerState0258 >> 1) + integerLocal1, integerLocal2 - (rgbSpriteLocal13.integerState0255 >> 1), 256);
          return;
        }
        rgbSpriteLocal14 = ConfirmedEmailAvailabilityValidator.rgbSpriteArrayState0028[0];
        integerLocal15 = rgbSpriteLocal14.integerState0254 << 1;
        integerLocal16 = rgbSpriteLocal14.integerState0260 << 1;
        if (MixedSupport071.rgbSpriteState0027 == null) {
          MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal15, integerLocal16);
          ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
        } else {
          if (integerLocal15 > MixedSupport071.rgbSpriteState0027.integerState0258) {
            MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal15, integerLocal16);
            ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
          } else {
            if (integerLocal16 <= MixedSupport071.rgbSpriteState0027.integerState0255) {
              ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
              SoftwareRaster.clearRaster();
            } else {
              MixedSupport071.rgbSpriteState0027 = new RgbSprite(integerLocal15, integerLocal16);
              ValidationStatus.performAction1570(true, MixedSupport071.rgbSpriteState0027);
            }
          }
        }
        rgbSpriteLocal14.drawRotatedAbout(112, 144, rgbSpriteLocal14.integerState0254 << 4, rgbSpriteLocal14.integerState0260 << 4, -this.integerState0239 << 10, 4096);
        ByteStorage.performAction1060((byte) -5);
        MixedSupport071.rgbSpriteState0027.drawAdditive(integerLocal1 - rgbSpriteLocal14.integerState0254, -rgbSpriteLocal14.integerState0260 + integerLocal2, 256);
    }

    final void updatePointer(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument2 <= 38) {
            ValidationStatusIcon.clearStaticReferences(100);
          }
          this.integerState0239 = this.integerState0239 + 1;
          super.updatePointer(uiComponentArgument1, 89, integerArgument3, integerArgument4);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "g.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final static SceneWidgetPart014 computeSceneWidgetPart0140551(int integerArgument1, String stringArgument2) {
        String stringLocal1 = null;
        SceneWidgetPart014 sceneWidgetPart014Local2 = null;
        String stringLocal3 = null;
        int integerLocal4 = 0;
        CharSequence charSequenceLocal5 = null;
        CharSequence charSequenceLocal6 = null;
        SceneWidgetPart014 stackSceneWidgetPart014Local7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null == MixedSupport054.secondaryNodeHashTableState0001) {
            return null;
          }
          charSequenceLocal5 = (CharSequence) ((Object) stringArgument2);
          stringLocal1 = ComponentContainer.computeString0894(charSequenceLocal5, (byte) 2);
          if (stringLocal1 == null) {
            stringLocal1 = stringArgument2;
          }
          if (integerArgument1 != -3805) {
            ValidationStatusIcon.clearStaticReferences(106);
          }
          sceneWidgetPart014Local2 = (SceneWidgetPart014) (MixedSupport054.secondaryNodeHashTableState0001.get(24710, (long)stringLocal1.hashCode()));
          while (sceneWidgetPart014Local2 != null) {
            charSequenceLocal6 = (CharSequence) ((Object) sceneWidgetPart014Local2.stringState0606);
            stringLocal3 = ComponentContainer.computeString0894(charSequenceLocal6, (byte) 2);
            if (stringLocal3 == null) {
              stringLocal3 = sceneWidgetPart014Local2.stringState0606;
            }
            if (stringLocal3.equals(stringLocal1)) {
              stackSceneWidgetPart014Local7 = sceneWidgetPart014Local2;
              return stackSceneWidgetPart014Local7;
            }
            sceneWidgetPart014Local2 = (SceneWidgetPart014) (MixedSupport054.secondaryNodeHashTableState0001.nextWithSameKey(-17713));
          }
          return null;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal11 = caughtParameterLocal13;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal12;
          stackStringBuilderLocal9 = new StringBuilder().append("g.D(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final String getTooltipText(byte byteArgument1) {
        if (this.booleanState0018) {
          return this.callbackContract011State0001.getValidationMessage((byte) 69);
        }
        if (byteArgument1 == 113) {
          return null;
        }
        return (String) null;
    }

    final boolean takeFocus(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!booleanArgument1) {
            return false;
          }
          integerState0240 = -39;
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("g.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        sceneWidgetPart013State0002 = null;
        sceneWidgetState0035 = null;
        rgbSpriteArrayState0013 = null;
        stringState0188 = null;
        if (integerArgument1 >= -91) {
          stringState0188 = (String) null;
        }
    }

    ValidationStatusIcon(FieldValidator callbackContract011Argument1) {
        try {
          this.callbackContract011State0001 = callbackContract011Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "g.<init>(" + (callbackContract011Argument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        integerState0238 = 2;
        stringState0188 = "Suggested names: ";
    }
}
