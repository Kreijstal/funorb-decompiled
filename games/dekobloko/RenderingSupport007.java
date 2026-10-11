/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport007 extends MixedSupport155 {
    static int integerState0360;
    static int[][] integerArrayArrayState0015;
    static int integerState0361;
    static String stringState0304;
    static String stringState0305;
    static RgbSprite rgbSpriteState0026;

    final String computeString0816(String stringArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stackStringLocal2 = null;
        Object stackObjectLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (this.computeRenderingSupport0150817(stringArgument1, (byte) -40) == MixedSupport149.renderingSupport015State0005) {
            stackStringLocal2 = MixedSupport139.stringState0570;
            return stackStringLocal2;
          }
          if (byteArgument2 == -11) {
            return null;
          }
          integerState0361 = 2;
          stackObjectLocal3 = null;
          return (String) (stackObjectLocal3);
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("kd.A(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final RenderingSupport015 computeRenderingSupport0150817(String stringArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        CharSequence charSequenceLocal4 = null;
        RenderingSupport015 stackRenderingSupport015Local5 = null;
        RenderingSupport015 stackRenderingSupport015Local6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          charSequenceLocal3 = (CharSequence) ((Object) stringArgument1);
          if (!DualNode.computeBoolean0139((byte) 98, charSequenceLocal3)) {
            stackRenderingSupport015Local5 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local5;
          }
          if (byteArgument2 != -40) {
            rgbSpriteState0026 = (RgbSprite) null;
          }
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument1);
          integerLocal1 = MixedSupport014.computeInteger0207((byte) -106, charSequenceLocal4);
          if (integerLocal1 > 0 &&
            integerLocal1 <= 130) {
            return MixedSupport023.renderingSupport015State0001;
          }
          stackRenderingSupport015Local6 = MixedSupport149.renderingSupport015State0005;
          return stackRenderingSupport015Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("kd.B(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction0958(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4, int integerArgument5) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
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
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal6 = integerArgument2 + integerArgument1;
          integerLocal8 = integerArgument5 + integerArgument4;
          if (integerArgument2 > SoftwareRaster.integerState0282) {
            stackIntegerLocal1 = integerArgument2;
          } else {
            stackIntegerLocal1 = SoftwareRaster.integerState0282;
          }
          integerLocal9 = stackIntegerLocal1;
          integerLocal11 = -83 / ((byteArgument3 - 29) / 53);
          if (SoftwareRaster.integerState0280 >= integerArgument4) {
            stackIntegerLocal2 = SoftwareRaster.integerState0280;
          } else {
            stackIntegerLocal2 = integerArgument4;
          }
          integerLocal10 = stackIntegerLocal2;
          if (SoftwareRaster.integerState0281 <= integerLocal6) {
            stackIntegerLocal3 = SoftwareRaster.integerState0281;
          } else {
            stackIntegerLocal3 = integerLocal6;
          }
          integerLocal12 = stackIntegerLocal3;
          if (integerLocal8 < SoftwareRaster.integerState0283) {
            stackIntegerLocal4 = integerLocal8;
          } else {
            stackIntegerLocal4 = SoftwareRaster.integerState0283;
          }
          integerLocal13 = stackIntegerLocal4;
          if (integerArgument2 >= SoftwareRaster.integerState0282 &&
            SoftwareRaster.integerState0281 > integerArgument2) {
            integerLocal14 = integerArgument2 + integerLocal10 * SoftwareRaster.integerState0285;
            integerLocal15 = -integerLocal10 + integerLocal13 + 1 >> 1;
            while (true) {
              integerLocal15--;
              if (integerLocal15 < 0) {
                break;
              }
              SoftwareRaster.integerArrayState0063[integerLocal14] = 16777215;
              integerLocal14 = integerLocal14 + SoftwareRaster.integerState0285 * 2;
            }
          }
          if (integerArgument4 >= SoftwareRaster.integerState0280 &&
            SoftwareRaster.integerState0283 > integerLocal8) {
            integerLocal17 = SoftwareRaster.integerState0285 * integerArgument4 + integerLocal9;
            integerLocal20 = -integerLocal9 + integerLocal12 + 1 >> 1;
            while (true) {
              integerLocal20--;
              if (integerLocal20 < 0) {
                break;
              }
              SoftwareRaster.integerArrayState0063[integerLocal17] = 16777215;
              integerLocal17 += 2;
            }
          }
          if (integerLocal6 >= SoftwareRaster.integerState0282 &&
            integerLocal6 < SoftwareRaster.integerState0281) {
            integerLocal18 = (integerLocal10 + (integerLocal6 - integerArgument2 & 1)) * SoftwareRaster.integerState0285 + integerLocal6;
            integerLocal21 = -integerLocal10 + 1 + integerLocal13 >> 1;
            while (true) {
              integerLocal21--;
              if (integerLocal21 < 0) {
                break;
              }
              SoftwareRaster.integerArrayState0063[integerLocal18] = 16777215;
              integerLocal18 = integerLocal18 + 2 * SoftwareRaster.integerState0285;
            }
          }
          if (SoftwareRaster.integerState0280 <= integerArgument4) {
            if (SoftwareRaster.integerState0283 <= integerLocal8) {
              return;
            }
            integerLocal19 = (-integerArgument4 + integerLocal8 & 1) + integerLocal8 * SoftwareRaster.integerState0285 + integerLocal9;
            integerLocal22 = 1 + integerLocal12 - integerLocal9 >> 1;
            while (true) {
              integerLocal22--;
              if (0 > integerLocal22) {
                return;
              }
              SoftwareRaster.integerArrayState0063[integerLocal19] = 16777215;
              integerLocal19 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal23) {
          caughtExceptionLocal5 = caughtParameterLocal23;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal7), "kd.D(" + integerArgument1 + ',' + integerArgument2 + ',' + byteArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    RenderingSupport007(UiComponentPart028 uiComponentPart028Argument1) {
        super(uiComponentPart028Argument1);
    }

    public static void performAction0959(int integerArgument1) {
        rgbSpriteState0026 = null;
        stringState0305 = null;
        integerArrayArrayState0015 = (int[][]) null;
        stringState0304 = null;
        int integerLocal1 = -6 / ((80 - integerArgument1) / 42);
    }

    static {
        integerArrayArrayState0015 = new int[2][8];
        stringState0304 = "Find opponent";
        stringState0305 = "Loading music";
        NodeDeque discarded$0 = new NodeDeque();
    }
}
