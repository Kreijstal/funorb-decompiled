/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart011 extends InteractiveComponent {
    static SceneWidget sceneWidgetState0035;
    static int integerState0238;
    static RgbSprite[] rgbSpriteArrayState0013;
    private CallbackContract011 callbackContract011State0001;
    static String stringState0188;
    private int integerState0239;
    static SceneWidgetPart013 sceneWidgetPart013State0002;
    static int integerState0240;

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        RenderingSupport015 renderingSupport015Local3;
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
        RenderingSupport015 renderingSupport015Local19;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        super.performAction0175(integerArgument1, -105, integerArgument3, integerArgument4);
        if (integerArgument3 != 0) {
          return;
        }
        integerLocal1 = (this.integerState0107 >> 1) + (this.integerState0110 + integerArgument1);
        integerLocal2 = integerArgument4 - (-this.integerState0104 - (this.integerState0108 >> 1));
        if (integerArgument2 > -103) {
          this.computeString0242((byte) -60);
          renderingSupport015Local3 = this.callbackContract011State0001.computeRenderingSupport0150093(20350);
          if (MixedSupport080.renderingSupport015State0004 == renderingSupport015Local3) {
            rgbSpriteLocal8 = MixedSupport129.rgbSpriteArrayState0028[0];
            integerLocal4 = rgbSpriteLocal8.integerState0254 << 1;
            integerLocal5 = rgbSpriteLocal8.integerState0260 << 1;
            if (MixedSupport075.rgbSpriteState0027 != null &&
              integerLocal4 <= MixedSupport075.rgbSpriteState0027.integerState0258 &&
              integerLocal5 <= MixedSupport075.rgbSpriteState0027.integerState0255) {
              RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
              SoftwareRaster.performAction0727();
            } else {
              MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal4, integerLocal5);
              RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
            }
            rgbSpriteLocal8.performAction0281(112, 144, rgbSpriteLocal8.integerState0254 << 4, rgbSpriteLocal8.integerState0260 << 4, -this.integerState0239 << 10, 4096);
            MixedSupport086.performAction1200((byte) -5);
            MixedSupport075.rgbSpriteState0027.performAction0317(integerLocal1 - rgbSpriteLocal8.integerState0254, -rgbSpriteLocal8.integerState0260 + integerLocal2, 256);
            return;
          }
          if (DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local3) {
            if (renderingSupport015Local3 == MixedSupport149.renderingSupport015State0005) {
              rgbSpriteLocal10 = MixedSupport129.rgbSpriteArrayState0028[2];
              rgbSpriteLocal10.performAction0317(integerLocal1 - (rgbSpriteLocal10.integerState0258 >> 1), integerLocal2 - (rgbSpriteLocal10.integerState0255 >> 1), 256);
              return;
            }
            if (renderingSupport015Local3 != MixedSupport023.renderingSupport015State0001) {
              return;
            }
            rgbSpriteLocal11 = MixedSupport129.rgbSpriteArrayState0028[1];
            rgbSpriteLocal11.performAction0317(-(rgbSpriteLocal11.integerState0258 >> 1) + integerLocal1, integerLocal2 - (rgbSpriteLocal11.integerState0255 >> 1), 256);
            return;
          }
          rgbSpriteLocal9 = MixedSupport129.rgbSpriteArrayState0028[0];
          rgbSpriteLocal7 = rgbSpriteLocal9;
          integerLocal17 = rgbSpriteLocal9.integerState0254 << 1;
          integerLocal18 = rgbSpriteLocal9.integerState0260 << 1;
          if (MixedSupport075.rgbSpriteState0027 == null) {
            MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal17, integerLocal18);
            RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
          } else {
            if (integerLocal17 > MixedSupport075.rgbSpriteState0027.integerState0258) {
              MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal17, integerLocal18);
              RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
            } else {
              if (integerLocal18 <= MixedSupport075.rgbSpriteState0027.integerState0255) {
                RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
                SoftwareRaster.performAction0727();
              } else {
                MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal17, integerLocal18);
                RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
              }
            }
          }
          rgbSpriteLocal9.performAction0281(112, 144, rgbSpriteLocal9.integerState0254 << 4, rgbSpriteLocal9.integerState0260 << 4, -this.integerState0239 << 10, 4096);
          MixedSupport086.performAction1200((byte) -5);
          MixedSupport075.rgbSpriteState0027.performAction0317(integerLocal1 - rgbSpriteLocal9.integerState0254, -rgbSpriteLocal9.integerState0260 + integerLocal2, 256);
          return;
        }
        renderingSupport015Local19 = this.callbackContract011State0001.computeRenderingSupport0150093(20350);
        if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local19 &&
          DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local19) {
          if (renderingSupport015Local19 == MixedSupport149.renderingSupport015State0005) {
            rgbSpriteLocal12 = MixedSupport129.rgbSpriteArrayState0028[2];
            rgbSpriteLocal12.performAction0317(integerLocal1 - (rgbSpriteLocal12.integerState0258 >> 1), integerLocal2 - (rgbSpriteLocal12.integerState0255 >> 1), 256);
            return;
          }
          if (renderingSupport015Local19 != MixedSupport023.renderingSupport015State0001) {
            return;
          }
          rgbSpriteLocal13 = MixedSupport129.rgbSpriteArrayState0028[1];
          rgbSpriteLocal13.performAction0317(-(rgbSpriteLocal13.integerState0258 >> 1) + integerLocal1, integerLocal2 - (rgbSpriteLocal13.integerState0255 >> 1), 256);
          return;
        }
        rgbSpriteLocal14 = MixedSupport129.rgbSpriteArrayState0028[0];
        integerLocal15 = rgbSpriteLocal14.integerState0254 << 1;
        integerLocal16 = rgbSpriteLocal14.integerState0260 << 1;
        if (MixedSupport075.rgbSpriteState0027 == null) {
          MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal15, integerLocal16);
          RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
        } else {
          if (integerLocal15 > MixedSupport075.rgbSpriteState0027.integerState0258) {
            MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal15, integerLocal16);
            RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
          } else {
            if (integerLocal16 <= MixedSupport075.rgbSpriteState0027.integerState0255) {
              RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
              SoftwareRaster.performAction0727();
            } else {
              MixedSupport075.rgbSpriteState0027 = new RgbSprite(integerLocal15, integerLocal16);
              RenderingSupport015.performAction1778(true, MixedSupport075.rgbSpriteState0027);
            }
          }
        }
        rgbSpriteLocal14.performAction0281(112, 144, rgbSpriteLocal14.integerState0254 << 4, rgbSpriteLocal14.integerState0260 << 4, -this.integerState0239 << 10, 4096);
        MixedSupport086.performAction1200((byte) -5);
        MixedSupport075.rgbSpriteState0027.performAction0317(integerLocal1 - rgbSpriteLocal14.integerState0254, -rgbSpriteLocal14.integerState0260 + integerLocal2, 256);
    }

    final void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument2 <= 38) {
            UiComponentPart011.performAction0609(100);
          }
          this.integerState0239 = this.integerState0239 + 1;
          super.performAction0237(uiComponentArgument1, 89, integerArgument3, integerArgument4);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "g.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final static SceneWidgetPart014 computeSceneWidgetPart0140610(int integerArgument1, String stringArgument2) {
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
          if (null == MixedSupport054.collectionSupport003State0001) {
            return null;
          }
          charSequenceLocal5 = (CharSequence) ((Object) stringArgument2);
          stringLocal1 = ComponentContainer.computeString1011(charSequenceLocal5, (byte) 2);
          if (stringLocal1 == null) {
            stringLocal1 = stringArgument2;
          }
          if (integerArgument1 != -3805) {
            UiComponentPart011.performAction0609(106);
          }
          sceneWidgetPart014Local2 = (SceneWidgetPart014) (MixedSupport054.collectionSupport003State0001.computeDualNode1280(24710, (long)stringLocal1.hashCode()));
          while (sceneWidgetPart014Local2 != null) {
            charSequenceLocal6 = (CharSequence) ((Object) sceneWidgetPart014Local2.stringState0606);
            stringLocal3 = ComponentContainer.computeString1011(charSequenceLocal6, (byte) 2);
            if (stringLocal3 == null) {
              stringLocal3 = sceneWidgetPart014Local2.stringState0606;
            }
            if (stringLocal3.equals(stringLocal1)) {
              stackSceneWidgetPart014Local7 = sceneWidgetPart014Local2;
              return stackSceneWidgetPart014Local7;
            }
            sceneWidgetPart014Local2 = (SceneWidgetPart014) (MixedSupport054.collectionSupport003State0001.computeDualNode1286(-17713));
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final String computeString0242(byte byteArgument1) {
        if (this.booleanState0018) {
          return this.callbackContract011State0001.computeString0097((byte) 69);
        }
        if (byteArgument1 == 113) {
          return null;
        }
        return (String) null;
    }

    final boolean computeBoolean0240(boolean booleanArgument1, UiComponent uiComponentArgument2) {
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public static void performAction0609(int integerArgument1) {
        sceneWidgetPart013State0002 = null;
        sceneWidgetState0035 = null;
        rgbSpriteArrayState0013 = null;
        stringState0188 = null;
        if (integerArgument1 >= -91) {
          stringState0188 = (String) null;
        }
    }

    UiComponentPart011(CallbackContract011 callbackContract011Argument1) {
        try {
          this.callbackContract011State0001 = callbackContract011Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "g.<init>(" + (callbackContract011Argument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        integerState0238 = 2;
        stringState0188 = "Suggested names: ";
    }
}
