/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart001 extends InteractiveComponent {
    int integerState0032;
    static byte[] byteArrayState0002;
    static String stringState0022;
    int integerState0033;
    static int integerState0034;
    int integerState0035;
    static String stringState0023;
    static String stringState0024;
    int integerState0036;
    int integerState0037;
    static String stringState0025;
    int integerState0038;

    final boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        double doubleLocal8 = 0.0;
        int integerLocal9 = 0;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!super.computeBoolean0062(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, integerArgument5, integerArgument6, byteArgument7)) {
            return false;
          }
          integerLocal5 = -this.integerState0032 - (integerArgument6 + this.integerState0110) + integerArgument2;
          integerLocal7 = integerArgument1 - this.integerState0037 - (integerArgument5 + this.integerState0104);
          if (integerLocal5 * integerLocal5 + integerLocal7 * integerLocal7 >= this.integerState0035 * this.integerState0035) {
            return true;
          }
          doubleLocal8 = Math.atan2((double)integerLocal7, (double)integerLocal5) - MixedSupport052.doubleState0001;
          if (!(0.0 > doubleLocal8)) {
            if (0.0 < doubleLocal8) {
              doubleLocal8 = doubleLocal8 + 3.141592653589793 / (double)this.integerState0038;
            }
          } else {
            doubleLocal8 = doubleLocal8 - 3.141592653589793 / (double)this.integerState0038;
          }
          this.integerState0033 = (int)((double)this.integerState0038 * doubleLocal8 / 6.283185307179586);
          while (this.integerState0038 <= this.integerState0033) {
            this.integerState0033 = this.integerState0033 - this.integerState0038;
          }
          while (this.integerState0033 < 0) {
            this.integerState0033 = this.integerState0033 + this.integerState0038;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal4 = caughtParameterLocal10;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("ai.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    public static void performAction0060(int integerArgument1) {
        if (integerArgument1 <= -7) {
          stringState0024 = null;
          byteArrayState0002 = null;
          stringState0023 = null;
          stringState0022 = null;
          stringState0025 = null;
          return;
        }
        UiComponentPart001.performAction0064((byte) -48);
        stringState0024 = null;
        byteArrayState0002 = null;
        stringState0023 = null;
        stringState0022 = null;
        stringState0025 = null;
    }

    final static void performAction0063(int integerArgument1, int integerArgument2, RawSound rawSoundArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        try {
          if (integerArgument1 <= 56) {
            integerState0034 = -82;
          }
          integerLocal1 = (int)(0.5 + (double)(rawSoundArgument3.integerState0794 * 256) * Math.pow(2.0, (double)integerArgument2 * 0.08333333333333333) / (double)PcmPlayer.integerState0209);
          CollectionSupport002.pcmStreamMixerState0001.performAction1192(rawSoundArgument3, integerLocal1, integerArgument5 * GameDomainSupport005.integerState0578, integerArgument4 << 6);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ai.G(" + integerArgument1 + ',' + integerArgument2 + ',' + (rawSoundArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final static void performAction0064(byte byteArgument1) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RgbSprite rgbSpriteLocal5;
        RgbSprite rgbSpriteLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        if (!DiagnosticSupport001.booleanState0024) {
          rgbSpriteLocal5 = MixedSupport135.rgbSpriteState0060;
          integerLocal9 = 320 * (MixedSupport144.integerState0848 * MixedSupport144.integerState0848) / 900;
          stackIntegerLocal3 = (!SceneWidgetPart009.booleanState0151) ? 0 : 1;
          integerLocal8 = stackIntegerLocal3;
          stackIntegerLocal4 = (!MouseInput.booleanState0223) ? 0 : 1;
          integerLocal7 = stackIntegerLocal4;
          rgbSpriteLocal6 = GameDomainSupport003.rgbSpriteState0020;
        } else {
          rgbSpriteLocal5 = GameDomainSupport003.rgbSpriteState0020;
          stackIntegerLocal1 = (!MouseInput.booleanState0223) ? 0 : 1;
          integerLocal8 = stackIntegerLocal1;
          rgbSpriteLocal6 = MixedSupport135.rgbSpriteState0060;
          stackIntegerLocal2 = (!SceneWidgetPart009.booleanState0151) ? 0 : 1;
          integerLocal7 = stackIntegerLocal2;
          integerLocal9 = 320 - MixedSupport144.integerState0848 * MixedSupport144.integerState0848 * 320 / 900;
        }
        if (integerLocal7 != 0 &&
          integerLocal8 != 0) {
          integerLocal8 = 0;
          integerLocal7 = 0;
        }
        SoftwareRaster.performAction0728(0, 0, 640, 160 - integerLocal9);
        integerLocal10 = 128 * integerLocal9 / 320 + 128;
        UiComponentPart009.performAction0412((byte) 93, integerLocal8 != 0, rgbSpriteLocal6, -integerLocal9, 256);
        SoftwareRaster.performAction0728(0, 160 - integerLocal9, 213, 320 - integerLocal9);
        UiComponentPart009.performAction0412((byte) 123, integerLocal8 != 0, rgbSpriteLocal6, -integerLocal9, 256);
        SoftwareRaster.performAction0728(427, 160 - integerLocal9, 640, 320 - integerLocal9);
        UiComponentPart009.performAction0412((byte) 121, integerLocal8 != 0, rgbSpriteLocal6, -integerLocal9, 256);
        SoftwareRaster.performAction0728(0, -integerLocal9 + 320, 213, 320 + integerLocal9);
        UiComponentPart009.performAction0412((byte) 92, integerLocal7 != 0, rgbSpriteLocal5, 0, integerLocal10);
        SoftwareRaster.performAction0728(213, 160 - integerLocal9, 427, integerLocal9 + 160);
        UiComponentPart009.performAction0412((byte) 91, integerLocal7 != 0, rgbSpriteLocal5, 0, integerLocal10);
        SoftwareRaster.performAction0728(427, 320 - integerLocal9, 640, 320 + integerLocal9);
        UiComponentPart009.performAction0412((byte) 91, integerLocal7 != 0, rgbSpriteLocal5, 0, integerLocal10);
        if (byteArgument1 == 84) {
          SoftwareRaster.performAction0728(213, 160 + integerLocal9, 427, 320 + integerLocal9);
          UiComponentPart009.performAction0412((byte) 43, integerLocal8 != 0, rgbSpriteLocal6, integerLocal9, 256);
          SoftwareRaster.performAction0728(0, integerLocal9 + 320, 640, 480);
          UiComponentPart009.performAction0412((byte) 121, integerLocal8 != 0, rgbSpriteLocal6, integerLocal9, 256);
          SoftwareRaster.performAction0736();
          if (!SceneWidgetPart009.booleanState0151) {
            return;
          }
          if (!MouseInput.booleanState0223) {
            return;
          }
          if (MixedSupport049.booleanState0058) {
            return;
          }
          MixedSupport040.performAction0588(0, 256, -71, 0);
          return;
        }
        stringState0025 = (String) null;
        SoftwareRaster.performAction0728(213, 160 + integerLocal9, 427, 320 + integerLocal9);
        UiComponentPart009.performAction0412((byte) 43, integerLocal8 != 0, rgbSpriteLocal6, integerLocal9, 256);
        SoftwareRaster.performAction0728(0, integerLocal9 + 320, 640, 480);
        UiComponentPart009.performAction0412((byte) 121, integerLocal8 != 0, rgbSpriteLocal6, integerLocal9, 256);
        SoftwareRaster.performAction0736();
        if (!SceneWidgetPart009.booleanState0151) {
          return;
        }
        if (!MouseInput.booleanState0223) {
          return;
        }
        if (!MixedSupport049.booleanState0058) {
          MixedSupport040.performAction0588(0, 256, -71, 0);
        }
    }

    final static boolean computeBoolean0065(byte byteArgument1) {
        int integerLocal1 = -28 % ((byteArgument1 + 57) / 39);
        return MixedSupport040.booleanState0046;
    }

    final static void performAction0066(int integerArgument1) {
        String stringLocal1 = (String) null;
        InputAdapter005.performAction1532(MixedSupport126.stringState0527, -128, (String) null);
        if (integerArgument1 >= -6) {
          RawSound rawSoundLocal2 = (RawSound) null;
          UiComponentPart001.performAction0063(-10, 44, (RawSound) null, 29, -93);
          return;
        }
    }

    private UiComponentPart001() throws Throwable {
        throw new Error();
    }

    final static MixedSupport020 computeMixedSupport0200061(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4) {
        MixedSupport020 mixedSupport020Local1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport020 mixedSupport020Local3 = (MixedSupport020) (UiComponentPart020.nodeDequeState0022.computeHashNode1970((byte) 19));
        while (mixedSupport020Local3 != null) {
          if (integerArgument4 == mixedSupport020Local3.integerState0115) {
            return mixedSupport020Local3;
          }
          mixedSupport020Local3 = (MixedSupport020) (UiComponentPart020.nodeDequeState0022.computeHashNode1974(true));
        }
        if (byteArgument3 == -111) {
          mixedSupport020Local1 = new MixedSupport020();
          mixedSupport020Local1.integerState0116 = integerArgument2;
          mixedSupport020Local1.integerState0115 = integerArgument4;
          UiComponentPart020.nodeDequeState0022.performAction1963(mixedSupport020Local1, byteArgument3 + 2888);
          MixedSupport039.performAction0581((byte) 8, mixedSupport020Local1, integerArgument1);
          return mixedSupport020Local1;
        }
        stringState0024 = (String) null;
        MixedSupport020 mixedSupport020Local4 = new MixedSupport020();
        mixedSupport020Local4.integerState0116 = integerArgument2;
        mixedSupport020Local4.integerState0115 = integerArgument4;
        UiComponentPart020.nodeDequeState0022.performAction1963(mixedSupport020Local4, byteArgument3 + 2888);
        MixedSupport039.performAction0581((byte) 8, mixedSupport020Local4, integerArgument1);
        return mixedSupport020Local4;
    }

    static {
        stringState0022 = "This option cannot be combined with the current '<%0>' setting.";
        integerState0034 = -1;
        stringState0024 = "Send private message to <%0>";
        stringState0023 = "Only show game chat from my friends";
        stringState0025 = "Play free version";
    }
}
