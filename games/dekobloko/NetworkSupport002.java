/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport002 {
    int integerState0081;
    static RgbSprite rgbSpriteState0008;
    int integerState0082;
    private boolean booleanState0012;
    int integerState0083;
    BitmapFont bitmapFontState0008;
    int integerState0084;
    static NodeDeque nodeDequeState0002;
    CallbackContract004 callbackContract004State0001;
    int integerState0085;
    int integerState0086;
    CallbackContract004 callbackContract004State0002;
    int integerState0087;
    CallbackContract004 callbackContract004State0003;
    CallbackContract004 callbackContract004State0004;
    CallbackContract004 callbackContract004State0005;
    private int integerState0088;
    static RgbSprite[] rgbSpriteArrayState0003;

    public static void performAction0191(int integerArgument1) {
        rgbSpriteArrayState0003 = null;
        if (integerArgument1 != 23302) {
          return;
        }
        nodeDequeState0002 = null;
        rgbSpriteState0008 = null;
    }

    final void performAction0189(byte byteArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        SoftwareRaster.performAction0720(integerArgument7, integerArgument2, integerArgument4, integerArgument5, integerArgument6, integerArgument3);
        int integerLocal1 = -40 / ((byteArgument1 + 68) / 42);
    }

    final static void performAction0190(byte byteArgument1, String stringArgument2, boolean booleanArgument3, java.applet.Applet appletArgument4) {
        try {
          java.net.MalformedURLException malformedURLExceptionLocal1 = null;
          RuntimeException runtimeExceptionLocal2 = null;
          RuntimeException stackRuntimeExceptionLocal3 = null;
          StringBuilder stackStringBuilderLocal4 = null;
          String stackStringLocal5 = null;
          StringBuilder stackStringBuilderLocal6 = null;
          String stackStringLocal7 = null;
          Throwable caughtExceptionLocal8 = null;
          try {
            if (PlatformService.stringState0171.startsWith("win") &&
              MixedSupport036.computeBoolean0555((byte) -19, stringArgument2)) {
              return;
            }
            try {
              appletArgument4.getAppletContext().showDocument(new java.net.URL(stringArgument2), "_blank");
              if (byteArgument1 > 72) {
                return;
              }
              rgbSpriteArrayState0003 = (RgbSprite[]) null;
              return;
            } catch (java.net.MalformedURLException caughtParameterLocal9) {
              caughtExceptionLocal8 = caughtParameterLocal9;
              malformedURLExceptionLocal1 = (java.net.MalformedURLException) (Object) caughtExceptionLocal8;
              NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "MGR1: " + stringArgument2);
              return;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal10) {
            caughtExceptionLocal8 = caughtParameterLocal10;
            runtimeExceptionLocal2 = (RuntimeException) (Object) caughtExceptionLocal8;
            stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
            stackStringBuilderLocal4 = new StringBuilder().append("c.A(").append(byteArgument1).append(',');
            if (stringArgument2 == null) {
              stackStringLocal5 = "null";
            } else {
              stackStringLocal5 = "{...}";
            }
            stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument3).append(',');
            if (appletArgument4 == null) {
              stackStringLocal7 = "null";
            } else {
              stackStringLocal7 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    final void performAction0195(int integerArgument1, BitmapFont bitmapFontArgument2) {
        MixedSupport001 mixedSupport001Local1 = null;
        MixedSupport009 mixedSupport009Local2 = null;
        RgbSprite[] rgbSpriteArrayLocal3 = null;
        RenderingSupport009 renderingSupport009Local4 = null;
        RenderingSupport009 renderingSupport009Local5 = null;
        int integerLocal6 = 0;
        MixedSupport009 mixedSupport009Local7 = null;
        MixedSupport009 mixedSupport009Local8 = null;
        InputAdapter002 discarded$0 = null;
        MixedSupport110 discarded$1 = null;
        MixedSupport009 mixedSupport009Local11 = null;
        RgbSprite[] rgbSpriteArrayLocal12 = null;
        RgbSprite[] rgbSpriteArrayLocal13 = null;
        RgbSprite cachedRgbSpriteLocal14 = null;
        MixedSupport009 mixedSupport009Local15 = null;
        MixedSupport009 mixedSupport009Local16 = null;
        RgbSprite rgbSpriteLocal17 = null;
        MixedSupport009 mixedSupport009Local18 = null;
        MixedSupport009 mixedSupport009Local19 = null;
        int integerLocal20 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport009 mixedSupport009Local21;
        MixedSupport009 mixedSupport009Local22;
        try {
          mixedSupport001Local1 = new MixedSupport001(bitmapFontArgument2, 2, 2, 2236962, 1, 1, 1, 2 + bitmapFontArgument2.integerState0523 + bitmapFontArgument2.integerState0518);
          mixedSupport001Local1.integerState0002 = 16777215;
          this.callbackContract004State0005 = (CallbackContract004) ((Object) mixedSupport001Local1);
          mixedSupport009Local2 = new MixedSupport009();
          mixedSupport001Local1.performAction0009(-12253, mixedSupport009Local2);
          mixedSupport009Local2.integerState0007 = 11711154;
          mixedSupport009Local2.integerState0012 = 15658734;
          this.integerState0082 = 3;
          this.bitmapFontState0008 = bitmapFontArgument2;
          this.integerState0088 = 15658734;
          this.integerState0086 = -1;
          this.integerState0084 = 3;
          this.integerState0087 = 5592405;
          this.integerState0083 = 15658734;
          this.integerState0085 = 3;
          this.integerState0081 = 3;
          mixedSupport009Local2.computeMixedSupport1230109(0, 117).computeMixedSupport1231745(15658734, (byte) 106).computeMixedSupport1231749(120, MixedSupport042.computeRgbSpriteArray0593(7829367, 8947848, 10066329, 32140));
          mixedSupport009Local2.computeMixedSupport1230109(1, integerArgument1 ^ 13421780).computeMixedSupport1231749(-50, MixedSupport042.computeRgbSpriteArray0593(13421772, 11184810, 10066329, 32140));
          mixedSupport009Local2.computeMixedSupport1230109(3, 101).computeMixedSupport1231749(121, MixedSupport042.computeRgbSpriteArray0593(10066329, 8947848, 7829367, 32140)).computeMixedSupport1231758(-1, 1).computeMixedSupport1231746(1, -2147483648);
          rgbSpriteArrayLocal3 = new RgbSprite[9];
          renderingSupport009Local4 = new RenderingSupport009(32, 32);
          renderingSupport009Local5 = renderingSupport009Local4;
          for (integerLocal6 = 0; renderingSupport009Local5.integerArrayState0024.length > integerLocal6; integerLocal6++) {
            renderingSupport009Local4.integerArrayState0024[integerLocal6] = 1077952576;
          }
          rgbSpriteArrayLocal3[4] = (RgbSprite) ((Object) renderingSupport009Local5);
          mixedSupport009Local2.computeMixedSupport1230109(4, 25).computeMixedSupport1231748(integerArgument1 - 13438370, true).computeMixedSupport1231749(113, rgbSpriteArrayLocal3);
          mixedSupport009Local2.computeMixedSupport1230109(5, 44).computeMixedSupport1231749(integerArgument1 ^ 13421739, MixedSupport124.computeRgbSpriteArray1772(false, 0, 65793, 0, 0)).computeMixedSupport1231748(integerArgument1 - 13438370, true).computeMixedSupport1231745(-1, (byte) 106);
          this.callbackContract004State0001 = (CallbackContract004) ((Object) mixedSupport009Local2);
          mixedSupport009Local7 = new MixedSupport009(mixedSupport009Local2, true);
          mixedSupport009Local7.integerState0009 = 0;
          mixedSupport009Local8 = new MixedSupport009(mixedSupport009Local2, true);
          mixedSupport009Local8.integerState0009 = 0;
          mixedSupport009Local8.performAction0113(MixedSupport111.computeRgbSpriteArray1573(9, 8947848), false);
          mixedSupport009Local8.computeMixedSupport1230109(1, 95).computeMixedSupport1231749(-128, MixedSupport111.computeRgbSpriteArray1573(9, 11184810)).computeMixedSupport1231745(2236962, (byte) 106);
          this.callbackContract004State0004 = (CallbackContract004) ((Object) new MixedSupport074(bitmapFontArgument2, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new InputAdapter002(bitmapFontArgument2, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new MixedSupport110(bitmapFontArgument2, 16777215, -1, 125269879, 4473924, 3, 268435455);
          mixedSupport009Local11 = new MixedSupport009();
          mixedSupport001Local1.performAction0009(-12253, mixedSupport009Local11);
          mixedSupport009Local11.computeMixedSupport1230109(0, 78).computeMixedSupport1231749(integerArgument1 ^ -13421740, MixedSupport042.computeRgbSpriteArray0593(10066329, 15658734, 7829367, integerArgument1 - 13389632)).computeMixedSupport1231745(1118481, (byte) 106).computeMixedSupport1231756(-83, -1);
          mixedSupport009Local11.computeMixedSupport1230109(4, integerArgument1 ^ 13421812).computeMixedSupport1231748(-16598, true).computeMixedSupport1231749(-27, rgbSpriteArrayLocal3);
          this.callbackContract004State0002 = (CallbackContract004) ((Object) mixedSupport009Local11);
          rgbSpriteArrayLocal12 = new RgbSprite[9];
          rgbSpriteArrayLocal12[4] = new RgbSprite(2, 1);
          rgbSpriteArrayLocal13 = new RgbSprite[9];
          rgbSpriteArrayLocal13[4] = new RgbSprite(1, 2);
          cachedRgbSpriteLocal14 = rgbSpriteArrayLocal12[4];
          cachedRgbSpriteLocal14.integerArrayState0024 = new int[]{6710886, 7829367};
          rgbSpriteArrayLocal13[4].integerArrayState0024 = new int[]{6710886, 7829367};
          mixedSupport009Local15 = new MixedSupport009();
          mixedSupport009Local16 = new MixedSupport009();
          mixedSupport009Local15.performAction0110(119, rgbSpriteArrayLocal12, 0);
          mixedSupport009Local16.performAction0110(integerArgument1 ^ 13421750, rgbSpriteArrayLocal13, 0);
          rgbSpriteLocal17 = new RgbSprite(7, 4);
          rgbSpriteLocal17.integerArrayState0024 = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, integerArgument1, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          mixedSupport009Local18 = new MixedSupport009(mixedSupport009Local2, true);
          mixedSupport009Local18.performAction0111(rgbSpriteLocal17.computeRgbSprite0299(), 2);
          rgbSpriteLocal17.performAction0306();
          mixedSupport009Local21 = new MixedSupport009(mixedSupport009Local2, true);
          mixedSupport009Local21.performAction0111(rgbSpriteLocal17.computeRgbSprite0299(), 2);
          rgbSpriteLocal17.performAction0306();
          mixedSupport009Local22 = new MixedSupport009(mixedSupport009Local2, true);
          mixedSupport009Local22.performAction0111(rgbSpriteLocal17.computeRgbSprite0299(), 2);
          rgbSpriteLocal17.performAction0306();
          mixedSupport009Local19 = new MixedSupport009(mixedSupport009Local2, true);
          mixedSupport009Local19.performAction0111(rgbSpriteLocal17, 2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "c.G(" + integerArgument1 + ',' + (bitmapFontArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void performAction0194(int integerArgument1, String stringArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        try {
          if (integerArgument1 < 50) {
            return;
          }
          integerLocal5 = this.bitmapFontState0008.computeInteger1208(stringArgument2);
          integerLocal7 = this.bitmapFontState0008.integerState0523 + this.bitmapFontState0008.integerState0517;
          integerLocal8 = integerArgument3;
          if (SoftwareRaster.integerState0285 < integerLocal8 + (integerLocal5 + 6)) {
            integerLocal8 = -integerLocal5 + (SoftwareRaster.integerState0285 - 6);
          }
          integerLocal9 = 32 + (-this.bitmapFontState0008.integerState0517 + integerArgument4);
          if (SoftwareRaster.integerState0284 < integerLocal9 - (-integerLocal7 - 6)) {
            integerLocal9 = -6 + SoftwareRaster.integerState0284 - integerLocal7;
          }
          SoftwareRaster.performAction0743(integerLocal8, integerLocal9, integerLocal5 + 6, 6 + integerLocal7, this.integerState0088);
          SoftwareRaster.performAction0719(1 + integerLocal8, integerLocal9 + 1, integerLocal5 + 4, 4 + integerLocal7, this.integerState0087);
          this.bitmapFontState0008.performAction1211(stringArgument2, integerLocal8 + 3, integerLocal9 - (-3 - this.bitmapFontState0008.integerState0517), this.integerState0088, -1);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal4 = caughtParameterLocal10;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("c.C(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction0192(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, byte byteArgument5, int integerArgument6) {
        int integerLocal1 = 111 % ((byteArgument5 + 23) / 54);
        SoftwareRaster.performAction0729(integerArgument3, integerArgument2, integerArgument1, integerArgument6, integerArgument4);
    }

    private final void performAction0193(int integerArgument1, int integerArgument2, String stringArgument3, int integerArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal5 = this.integerState0084 + this.integerState0085;
          integerLocal7 = this.integerState0082 + this.integerState0081;
          integerLocal8 = this.integerState0086;
          if (integerLocal8 == -1) {
            integerLocal8 = this.bitmapFontState0008.integerState0523 + this.bitmapFontState0008.integerState0518;
          }
          if (integerArgument2 != 16521) {
            return;
          }
          integerLocal9 = SoftwareRaster.integerState0285 >> 2;
          integerLocal10 = this.bitmapFontState0008.computeInteger1208(stringArgument3);
          integerLocal11 = this.bitmapFontState0008.integerState0518 + this.bitmapFontState0008.integerState0523;
          integerLocal12 = 1;
          if (integerLocal10 > integerLocal9 ||
            -1 != stringArgument3.indexOf("<br>")) {
            if (integerLocal9 < integerLocal10) {
              integerLocal14 = integerLocal10 / integerLocal9;
              integerLocal13 = integerLocal9 + 2 * ((-1 + (integerLocal10 % integerLocal9 + integerLocal14)) / integerLocal14);
            } else {
              integerLocal13 = integerLocal9;
            }
            if (ArchiveRequestManager.stringArrayState0013 == null) {
              ArchiveRequestManager.stringArrayState0013 = new String[16];
            }
            integerLocal17 = this.bitmapFontState0008.computeInteger1215(stringArgument3, new int[]{integerLocal13}, ArchiveRequestManager.stringArrayState0013);
            integerLocal11 = integerLocal11 + (-1 + integerLocal17) * integerLocal8;
            integerLocal10 = 0;
            for (integerLocal19 = 0; integerLocal17 > integerLocal19; integerLocal19++) {
              integerLocal15 = this.bitmapFontState0008.computeInteger1208(ArchiveRequestManager.stringArrayState0013[integerLocal19]);
              if (integerLocal15 > integerLocal10) {
                integerLocal10 = integerLocal15;
              }
            }
          }
          integerLocal13 = integerArgument1;
          if (integerLocal5 + integerLocal13 + integerLocal10 > SoftwareRaster.integerState0285) {
            integerLocal13 = SoftwareRaster.integerState0285 + (-integerLocal10 - integerLocal5);
          }
          integerLocal18 = 32 + integerArgument4 - this.bitmapFontState0008.integerState0517;
          if (SoftwareRaster.integerState0284 < integerLocal18 - (-integerLocal11 - integerLocal7)) {
            integerLocal18 = -integerLocal7 + (integerArgument4 - integerLocal11);
          }
          SoftwareRaster.performAction0743(integerLocal13, integerLocal18, integerLocal5 + integerLocal10, integerLocal11 + integerLocal7, this.integerState0083);
          SoftwareRaster.performAction0719(1 + integerLocal13, 1 + integerLocal18, integerLocal5 + (integerLocal10 - 2), integerLocal11 - (-integerLocal7 + 2), this.integerState0087);
          this.bitmapFontState0008.computeInteger1213(stringArgument3, this.integerState0084 + integerLocal13, this.integerState0081 + integerLocal18, integerLocal10, integerLocal11, this.integerState0088, -1, 0, 0, integerLocal8);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal4 = caughtParameterLocal20;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("c.D(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public NetworkSupport002() {
        this.booleanState0012 = true;
    }

    final void performAction0196(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!this.booleanState0012) {
            this.performAction0194(integerArgument2 ^ -55, stringArgument1, integerArgument4, integerArgument3);
          } else {
            this.performAction0193(integerArgument4, 16521, stringArgument1, integerArgument3);
          }
          if (integerArgument2 == -1) {
            return;
          }
          this.performAction0192(124, 123, -118, 6, (byte) -71, 127);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("c.F(");
          if (stringArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    static {
        nodeDequeState0002 = new NodeDeque();
    }
}
