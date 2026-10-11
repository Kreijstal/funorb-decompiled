/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart017 extends ComponentContainer implements CallbackContract019 {
    static UiComponentPart029 uiComponentPart029State0001;
    private InteractiveComponent interactiveComponentState0007;
    private InteractiveComponent interactiveComponentState0008;
    private InteractiveComponent interactiveComponentState0009;
    static int integerState0437;
    static String stringState0329;
    static int integerState0438;

    public UiComponentPart017() {
        super(0, 0, 476, 225, (CallbackContract004) null);
        this.interactiveComponentState0009 = new InteractiveComponent(MixedSupport057.stringState0246, (CallbackContract006) null);
        this.interactiveComponentState0008 = new InteractiveComponent(GameDomainSupport002.stringState0146, (CallbackContract006) null);
        this.interactiveComponentState0007 = new InteractiveComponent(MixedSupport058.stringState0250, (CallbackContract006) null);
        MixedSupport041 mixedSupport041Local1 = new MixedSupport041();
        this.interactiveComponentState0009.callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport041Local1);
        this.interactiveComponentState0008.callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport041Local1);
        this.interactiveComponentState0007.callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport041Local1);
        int integerLocal2 = 4;
        int integerLocal3 = 326;
        int integerLocal4 = integerLocal3 - integerLocal2 >> 1;
        this.interactiveComponentState0008.performAction0241(30, integerLocal4, -integerLocal3 + this.integerState0107 >> 1, -integerLocal2 + (this.integerState0108 - 48), -16555);
        this.interactiveComponentState0007.performAction0241(30, integerLocal4, integerLocal4 + ((-integerLocal3 + this.integerState0107 >> 1) + integerLocal2), -48 + (this.integerState0108 - integerLocal2), -16555);
        this.interactiveComponentState0009.performAction0241(30, integerLocal3, this.integerState0107 - integerLocal3 >> 1, -(2 * integerLocal2) - 78 + this.integerState0108, -16555);
        this.interactiveComponentState0008.callbackContract006State0001 = (CallbackContract006) (this);
        this.interactiveComponentState0009.callbackContract006State0001 = (CallbackContract006) (this);
        this.interactiveComponentState0009.stringState0080 = MixedSupport130.stringState0541;
        this.interactiveComponentState0007.callbackContract006State0001 = (CallbackContract006) (this);
        this.interactiveComponentState0007.stringState0080 = MixedSupport073.stringState0312;
        this.performAction1012(this.interactiveComponentState0008, (byte) -55);
        this.performAction1012(this.interactiveComponentState0009, (byte) -55);
        this.performAction1012(this.interactiveComponentState0007, (byte) -55);
    }

    public static void performAction1081(byte byteArgument1) {
        if (byteArgument1 != 1) {
          stringState0329 = (String) null;
          stringState0329 = null;
          uiComponentPart029State0001 = null;
          return;
        }
        stringState0329 = null;
        uiComponentPart029State0001 = null;
    }

    final static int computeInteger1079(int integerArgument1, boolean booleanArgument2) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          ProxySocketFactory.integerState0732 = ProxySocketFactory.integerState0732 + 65536;
          while (MixedSupport139.computeInteger1898(PlatformSupport002.integerState0148, ProxySocketFactory.integerState0732, integerArgument1 + 11469) >= 65536) {
            ProxySocketFactory.integerState0732 = ProxySocketFactory.integerState0732 - PlatformSupport002.integerState0148;
            MixedSupport112.integerState0682 = MixedSupport112.integerState0682 + 1;
          }
          integerLocal10 = -1;
          if (null != MixedSupport021.rgbSpriteArrayState0008) {
            integerLocal10 = MixedSupport021.rgbSpriteArrayState0008.length;
          } else {
            if (MixedSupport147.rgbSpriteArrayState0031 != null) {
              integerLocal10 = MixedSupport147.rgbSpriteArrayState0031.length;
            }
          }
          if (-1 != integerLocal10) {
            boolean frameRemainderLocal15 = true;
            if (MixedSupport003.integerState0019 < PlatformSupport002.integerState0146) {
              MixedSupport003.integerState0019 = MixedSupport003.integerState0019 + 1;
              if (PlatformSupport002.integerState0147 < MixedSupport003.integerState0019 && (null == MixedSupport021.rgbSpriteArrayState0008 ||
                MixedSupport021.rgbSpriteArrayState0008[MixedSupport153.integerState0930] == null)) {
                MixedSupport003.integerState0019 = MixedSupport003.integerState0019 - 1;
                frameRemainderLocal15 = false;
              }
              else {
                if (MixedSupport003.integerState0019 >= PlatformSupport002.integerState0146 &&
                  MixedSupport021.rgbSpriteArrayState0008[(1 + MixedSupport153.integerState0930) % integerLocal10] == null) {
                  MixedSupport003.integerState0019 = MixedSupport003.integerState0019 - 1;
                }
              }
            }
            if (PlatformSupport002.integerState0146 <= MixedSupport003.integerState0019) {
              HashNode.integerState0068 = MixedSupport153.integerState0930;
              if (MixedSupport079.booleanState0098) {
                MixedSupport153.integerState0930 = MixedSupport153.integerState0930 + 1;
                if (MixedSupport153.integerState0930 >= integerLocal10) {
                  MixedSupport153.integerState0930 = MixedSupport153.integerState0930 - integerLocal10;
                }
              } else {
                MixedSupport153.integerState0930 = MixedSupport153.integerState0930 - 1;
                if (MixedSupport153.integerState0930 < 0) {
                  MixedSupport153.integerState0930 = MixedSupport153.integerState0930 + integerLocal10;
                }
              }
              MixedSupport003.integerState0019 = MixedSupport003.integerState0019 - PlatformSupport002.integerState0146;
            }
            if (PlatformSupport002.integerState0147 < MixedSupport003.integerState0019) {
              MixedSupport079.booleanState0098 = true;
            }
          }
          if (RenderingSupport003.rgbSpriteState0017 != null) {
            integerLocal12 = -(RenderingSupport003.rgbSpriteState0017.integerState0260 / 2) + 357;
            integerLocal13 = 0;
            if (SceneWidgetPart005.integerState0328 != 0 &&
              TextLineMetrics.integerState0535 > integerLocal12 &&
              TextLineMetrics.integerState0535 < RenderingSupport003.rgbSpriteState0017.integerState0255 + integerLocal12) {
              if (UiComponentPart013.integerState0276 > 269 - RenderingSupport003.rgbSpriteState0017.integerState0258 &&
                UiComponentPart013.integerState0276 < 269) {
                MixedSupport079.booleanState0098 = false;
                integerLocal13 = 1;
                MixedSupport003.integerState0019 = PlatformSupport002.integerState0146;
              }
              if (UiComponentPart013.integerState0276 > 586 &&
                UiComponentPart013.integerState0276 < RenderingSupport003.rgbSpriteState0017.integerState0258 + 586) {
                MixedSupport079.booleanState0098 = true;
                integerLocal13 = 1;
                MixedSupport003.integerState0019 = PlatformSupport002.integerState0146;
              }
            }
            if (integerLocal13 == 0 &&
              MixedSupport003.integerState0019 > PlatformSupport002.integerState0147 &&
              integerLocal12 < MixedSupport106.integerState0590 &&
              MixedSupport106.integerState0590 < RenderingSupport003.rgbSpriteState0017.integerState0255 + integerLocal12) {
              if (269 - RenderingSupport003.rgbSpriteState0017.integerState0258 < HashNode.integerState0069 &&
                HashNode.integerState0069 < 269) {
                MixedSupport003.integerState0019 = PlatformSupport002.integerState0147;
              }
              if (HashNode.integerState0069 > 586 &&
                HashNode.integerState0069 < 586 + RenderingSupport003.rgbSpriteState0017.integerState0258) {
                MixedSupport003.integerState0019 = PlatformSupport002.integerState0147;
              }
            }
          }
          if (integerArgument1 != 0) {
            stackIntegerLocal1 = 81;
            return stackIntegerLocal1;
          }
          if (booleanArgument2) {
            MixedSupport114.mixedSupport121State0003.performAction1721(MixedSupport006.computeInteger0072(HashNode.integerState0069, MixedSupport106.integerState0590, (byte) 7), -20563, MixedSupport006.computeInteger0072(UiComponentPart013.integerState0276, TextLineMetrics.integerState0535, (byte) 7));
            if (MixedSupport114.mixedSupport121State0003.computeBoolean1726((byte) 114)) {
              if (MixedSupport114.mixedSupport121State0003.integerState0754 == 0) {
                stackIntegerLocal2 = 3;
                return stackIntegerLocal2;
              }
              if (MixedSupport114.mixedSupport121State0003.integerState0754 == 1) {
                stackIntegerLocal3 = 2;
                return stackIntegerLocal3;
              }
            }
            stackIntegerLocal4 = -125;
            while (DualNodeDeque.computeBoolean0028(stackIntegerLocal4)) {
              MixedSupport114.mixedSupport121State0003.performAction1717((byte) 58, 0);
              if (MixedSupport114.mixedSupport121State0003.computeBoolean1726((byte) 114)) {
                if (MixedSupport114.mixedSupport121State0003.integerState0754 == 0) {
                  stackIntegerLocal5 = 3;
                  return stackIntegerLocal5;
                }
                if (1 == MixedSupport114.mixedSupport121State0003.integerState0754) {
                  stackIntegerLocal6 = 1;
                  return stackIntegerLocal6;
                }
              }
              if (MixedSupport153.integerState0931 != 13) {
                stackIntegerLocal4 = -125;
                continue;
              }
              stackIntegerLocal7 = 1;
              return stackIntegerLocal7;
            }
          }
          stackIntegerLocal8 = 0;
          return stackIntegerLocal8;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal9 = caughtParameterLocal16;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal11), "lg.F(" + integerArgument1 + ',' + booleanArgument2 + ')');
        }
    }

    final static void performAction1078(int integerArgument1) {
        if (integerArgument1 != 8927) {
          uiComponentPart029State0001 = (UiComponentPart029) null;
          InputAdapter003.performAction0749(4, (byte) -111);
          return;
        }
        InputAdapter003.performAction0749(4, (byte) -111);
    }

    final static void performAction1080(boolean booleanArgument1, int integerArgument2) {
        if (integerArgument2 > -101) {
          return;
        }
        if (null != MixedSupport071.sceneWidgetPart001State0001) {
          SoftwareRaster.performAction0737(SoftwareRaster.integerState0282, SoftwareRaster.integerState0280, SoftwareRaster.integerState0281 - SoftwareRaster.integerState0282, SoftwareRaster.integerState0283 - SoftwareRaster.integerState0280);
          MixedSupport071.sceneWidgetPart001State0001.performAction1997(1141039778, booleanArgument1);
          return;
        }
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        if (integerArgument2 < -103) {
          integerLocal1 = integerArgument1 + this.integerState0110;
          integerLocal2 = this.integerState0104 + integerArgument4;
          GameDomainSupport003.bitmapFontState0015.computeInteger1213(GameDomainSupport003.stringState0234, integerLocal1 + 20, integerLocal2 + 20, this.integerState0107 - 40, this.integerState0108 - 50, 16777215, -1, 1, 0, GameDomainSupport003.bitmapFontState0015.integerState0518);
          super.performAction0175(integerArgument1, -109, integerArgument3, integerArgument4);
          return;
        }
        integerState0437 = 48;
        integerLocal3 = integerArgument1 + this.integerState0110;
        integerLocal4 = this.integerState0104 + integerArgument4;
        GameDomainSupport003.bitmapFontState0015.computeInteger1213(GameDomainSupport003.stringState0234, integerLocal3 + 20, integerLocal4 + 20, this.integerState0107 - 40, this.integerState0108 - 50, 16777215, -1, 1, 0, GameDomainSupport003.bitmapFontState0015.integerState0518);
        super.performAction0175(integerArgument1, -109, integerArgument3, integerArgument4);
    }

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (this.interactiveComponentState0008 == interactiveComponentArgument3) {
            UiComponentPart032.performAction1928((byte) 105);
          } else {
            if (interactiveComponentArgument3 != this.interactiveComponentState0009) {
              if (this.interactiveComponentState0007 == interactiveComponentArgument3) {
                UiComponentPart028.performAction1646(false);
              }
            } else {
              SceneWidgetPart003.performAction0676(0);
            }
          }
          if (byteArgument1 == 67) {
            return;
          }
          stringState0329 = (String) null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("lg.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (super.computeBoolean0198(95, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          if (integerArgument2 == 98) {
            stackBooleanLocal3 = this.computeBoolean1010(uiComponentArgument3, (byte) -74);
            return stackBooleanLocal3;
          }
          if (integerArgument2 == 99) {
            stackBooleanLocal4 = this.computeBoolean1009(32, uiComponentArgument3);
            return stackBooleanLocal4;
          }
          integerLocal1 = 86 / ((integerArgument1 + 22) / 49);
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("lg.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    static {
        stringState0329 = "Discard";
        integerState0438 = -1;
    }
}
