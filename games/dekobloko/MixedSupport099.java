/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport099 implements CallbackContract004 {
    private int integerState0570;
    private BitmapFont bitmapFontState0017;
    static String stringState0394;
    static RgbSprite[] rgbSpriteArrayState0020;
    static boolean booleanState0132;
    private int integerState0571;
    static String stringState0395;
    static String stringState0396;
    static String stringState0397;
    static int[] integerArrayState0178;

    final static RenderingSupport012 computeRenderingSupport0121377(byte[] byteArrayArgument1, byte byteArgument2) {
        RenderingSupport012 renderingSupport012Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        Object stackObjectLocal3 = null;
        RenderingSupport012 stackRenderingSupport012Local4 = null;
        RenderingSupport012 stackRenderingSupport012Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (byteArrayArgument1 == null) {
            stackObjectLocal3 = null;
            return (RenderingSupport012) (stackObjectLocal3);
          }
          if (byteArgument2 <= 7) {
            stackRenderingSupport012Local4 = (RenderingSupport012) null;
            return stackRenderingSupport012Local4;
          }
          renderingSupport012Local1 = new RenderingSupport012(byteArrayArgument1, InputAdapter006.integerArrayState0206, MixedSupport039.integerArrayState0047, MixedSupport130.integerArrayState0208, MixedSupport052.integerArrayState0054, NetworkSupport006.integerArrayState0152, SceneWidgetPart011.byteArrayArrayState0008);
          MixedSupport094.performAction1305(126);
          stackRenderingSupport012Local5 = renderingSupport012Local1;
          return stackRenderingSupport012Local5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("on.A(");
          if (byteArrayArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction1376(boolean booleanArgument1, int[] integerArrayArgument2, boolean booleanArgument3, int[] integerArrayArgument4, boolean booleanArgument5, boolean booleanArgument6, MixedSupport145 mixedSupport145Argument7) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        int integerLocal33 = 0;
        int integerLocal34 = 0;
        int integerLocal35 = 0;
        integerLocal35 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal11 = 2147483647;
          if (!booleanArgument1) {
            return;
          }
          integerLocal13 = -2147483648;
          integerLocal26 = integerArrayArgument2[3] >> 2;
          integerLocal27 = integerArrayArgument2[4] >> 2;
          integerLocal28 = integerArrayArgument2[5] >> 2;
          integerLocal29 = integerArrayArgument2[6] >> 2;
          integerLocal30 = integerArrayArgument2[7] >> 2;
          integerLocal31 = integerArrayArgument2[8] >> 2;
          integerLocal32 = integerArrayArgument2[9] >> 2;
          integerLocal33 = integerArrayArgument2[10] >> 2;
          integerLocal34 = integerArrayArgument2[11] >> 2;
          integerLocal18 = integerLocal31 * integerArrayArgument4[5] + integerLocal29 * integerArrayArgument4[3] + integerLocal30 * integerArrayArgument4[4] >> 14;
          integerLocal17 = integerArrayArgument4[5] * integerLocal28 + integerArrayArgument4[3] * integerLocal26 + integerArrayArgument4[4] * integerLocal27 >> 14;
          integerLocal20 = integerArrayArgument4[6] * integerLocal26 - (-(integerArrayArgument4[7] * integerLocal27) - integerLocal28 * integerArrayArgument4[8]) >> 14;
          integerLocal23 = integerArrayArgument4[11] * integerLocal28 + integerArrayArgument4[10] * integerLocal27 + integerArrayArgument4[9] * integerLocal26 >> 14;
          integerLocal24 = integerLocal31 * integerArrayArgument4[11] + (integerArrayArgument4[10] * integerLocal30 + integerLocal29 * integerArrayArgument4[9]) >> 14;
          integerLocal19 = integerLocal34 * integerArrayArgument4[5] + (integerArrayArgument4[4] * integerLocal33 + integerArrayArgument4[3] * integerLocal32) >> 14;
          integerLocal25 = integerArrayArgument4[10] * integerLocal33 + (integerLocal32 * integerArrayArgument4[9] + integerLocal34 * integerArrayArgument4[11]) >> 14;
          integerLocal22 = integerArrayArgument4[6] * integerLocal32 + integerLocal33 * integerArrayArgument4[7] + integerLocal34 * integerArrayArgument4[8] >> 14;
          integerLocal21 = integerArrayArgument4[7] * integerLocal30 + (integerLocal29 * integerArrayArgument4[6] + integerLocal31 * integerArrayArgument4[8]) >> 14;
          integerLocal26 = integerArrayArgument4[0] - integerArrayArgument2[0];
          integerLocal27 = -integerArrayArgument2[1] + integerArrayArgument4[1];
          integerLocal28 = -integerArrayArgument2[2] + integerArrayArgument4[2];
          integerLocal14 = integerLocal26 * integerArrayArgument2[3] - (-(integerArrayArgument2[4] * integerLocal27) - integerArrayArgument2[5] * integerLocal28) >> -NetworkSupport007.integerState0503 + 16;
          integerLocal15 = integerArrayArgument2[6] * integerLocal26 + integerArrayArgument2[7] * integerLocal27 + integerLocal28 * integerArrayArgument2[8] >> 16 - NetworkSupport007.integerState0503;
          integerLocal16 = integerLocal28 * integerArrayArgument2[11] + integerArrayArgument2[10] * integerLocal27 + integerLocal26 * integerArrayArgument2[9] >> 16;
          integerLocal26 = MixedSupport109.integerState0651;
          integerLocal27 = MixedSupport109.integerState0652;
          integerLocal28 = 0;
          scanLoop1: while (true) {
            if (integerLocal28 < mixedSupport145Argument7.shortState0003) {
              integerLocal29 = mixedSupport145Argument7.shortArrayState0001[integerLocal28];
              integerLocal30 = mixedSupport145Argument7.shortArrayState0004[integerLocal28];
              integerLocal31 = mixedSupport145Argument7.shortArrayState0009[integerLocal28];
              integerLocal32 = (integerLocal30 * integerLocal20 + (integerLocal29 * integerLocal17 + integerLocal31 * integerLocal23) >> -NetworkSupport007.integerState0503 + 16) + integerLocal14;
              integerLocal33 = (integerLocal24 * integerLocal31 + (integerLocal29 * integerLocal18 + integerLocal21 * integerLocal30) >> 16 - NetworkSupport007.integerState0503) + integerLocal15;
              integerLocal34 = integerLocal16 + (integerLocal25 * integerLocal31 + integerLocal19 * integerLocal29 + integerLocal22 * integerLocal30 >> 16);
              stackIntegerLocal1 = -51;
              stackIntegerLocal2 = ~integerLocal34;
              if (integerLocal35 != 0) {
                if (stackIntegerLocal1 < stackIntegerLocal2) {
                  if (UiComponentPart015.integerArrayState0100.length <= integerLocal23) {
                    break scanLoop1;
                  }
                  integerLocal24 = mixedSupport145Argument7.shortArrayState0013[integerLocal23];
                  integerLocal25 = mixedSupport145Argument7.shortArrayState0011[integerLocal23];
                  integerLocal26 = mixedSupport145Argument7.shortArrayState0007[integerLocal23];
                  UiComponentPart015.integerArrayState0100[integerLocal23] = integerLocal26 * integerLocal20 + (integerLocal17 * integerLocal25 + integerLocal24 * integerLocal14) >> 16;
                  MixedSupport009.integerArrayState0016[integerLocal23] = integerLocal21 * integerLocal26 + integerLocal15 * integerLocal24 + integerLocal25 * integerLocal18 >> 16;
                  MixedSupport120.integerArrayState0205[integerLocal23] = integerLocal25 * integerLocal19 + integerLocal16 * integerLocal24 + integerLocal26 * integerLocal22 >> 16;
                  integerLocal23++;
                  break scanLoop1;
                }
                break scanLoop1;
              }
              if (stackIntegerLocal1 >= stackIntegerLocal2) {
                MixedSupport075.integerArrayState0137[integerLocal28] = integerLocal32 / integerLocal34 + integerLocal26;
                MixedSupport116.integerArrayState0200[integerLocal28] = integerLocal27 + integerLocal33 / integerLocal34;
                if (integerLocal11 > integerLocal34) {
                  integerLocal11 = integerLocal34;
                }
                MixedSupport145.integerArrayState0248[integerLocal28] = integerLocal34;
                if (integerLocal34 > integerLocal13) {
                  integerLocal13 = integerLocal34;
                }
              } else {
                MixedSupport145.integerArrayState0248[integerLocal28] = -2147483648;
              }
              if (booleanArgument6) {
                NetworkSupport003.integerArrayState0031[integerLocal28] = integerLocal32 >> NetworkSupport007.integerState0503;
                AnimatedTileRegion.integerArrayState0233[integerLocal28] = integerLocal33 >> NetworkSupport007.integerState0503;
                NodeDeque.integerArrayState0250[integerLocal28] = integerLocal34;
              }
              integerLocal28++;
              continue;
            }
            if (null != mixedSupport145Argument7.integerArrayState0249 &&
              mixedSupport145Argument7.integerArrayState0240 != null &&
              mixedSupport145Argument7.integerArrayState0246 != null &&
              mixedSupport145Argument7.integerArrayState0241 != null &&
              null != mixedSupport145Argument7.integerArrayState0245 &&
              mixedSupport145Argument7.integerArrayState0242 != null &&
              mixedSupport145Argument7.integerArrayState0244 != null &&
              mixedSupport145Argument7.integerArrayState0247 != null &&
              mixedSupport145Argument7.integerArrayState0243 != null) {
              integerLocal28 = 0;
              while (!(integerLocal28 >= mixedSupport145Argument7.shortState0001)) {
                integerLocal29 = mixedSupport145Argument7.integerArrayState0249[integerLocal28];
                integerLocal30 = mixedSupport145Argument7.integerArrayState0240[integerLocal28];
                integerLocal31 = mixedSupport145Argument7.integerArrayState0246[integerLocal28];
                GameDomainSupport002.integerArrayState0035[integerLocal28] = integerLocal14 + (integerLocal20 * integerLocal30 + (integerLocal29 * integerLocal17 + integerLocal31 * integerLocal23) >> 16);
                MixedSupport036.integerArrayState0044[integerLocal28] = integerLocal15 + (integerLocal30 * integerLocal21 + integerLocal29 * integerLocal18 + integerLocal24 * integerLocal31 >> 16);
                LoginCredentials.integerArrayState0116[integerLocal28] = integerLocal16 + (integerLocal22 * integerLocal30 + (integerLocal29 * integerLocal19 + integerLocal25 * integerLocal31) >> 16);
                integerLocal29 = mixedSupport145Argument7.integerArrayState0241[integerLocal28];
                integerLocal30 = mixedSupport145Argument7.integerArrayState0245[integerLocal28];
                integerLocal31 = mixedSupport145Argument7.integerArrayState0242[integerLocal28];
                MixedSupport071.integerArrayState0120[integerLocal28] = (integerLocal31 * integerLocal23 + integerLocal17 * integerLocal29 + integerLocal30 * integerLocal20 >> 16) + integerLocal14;
                MixedSupport016.integerArrayState0021[integerLocal28] = integerLocal15 + (integerLocal21 * integerLocal30 + integerLocal18 * integerLocal29 + integerLocal24 * integerLocal31 >> 16);
                DualNode.integerArrayState0017[integerLocal28] = (integerLocal31 * integerLocal25 + (integerLocal22 * integerLocal30 + integerLocal19 * integerLocal29) >> 16) + integerLocal16;
                integerLocal29 = mixedSupport145Argument7.integerArrayState0244[integerLocal28];
                integerLocal30 = mixedSupport145Argument7.integerArrayState0247[integerLocal28];
                integerLocal31 = mixedSupport145Argument7.integerArrayState0243[integerLocal28];
                RenderingSupport008.integerArrayState0122[integerLocal28] = integerLocal14 + (integerLocal23 * integerLocal31 + (integerLocal17 * integerLocal29 + integerLocal30 * integerLocal20) >> 16);
                UiComponentPart002.integerArrayState0013[integerLocal28] = integerLocal15 + (integerLocal24 * integerLocal31 + integerLocal18 * integerLocal29 + integerLocal30 * integerLocal21 >> 16);
                MixedSupport021.integerArrayState0029[integerLocal28] = integerLocal16 + (integerLocal31 * integerLocal25 + integerLocal22 * integerLocal30 + integerLocal19 * integerLocal29 >> 16);
                integerLocal28++;
                if (integerLocal35 != 0) {
                  return;
                }
              }
            }
            if (booleanArgument5) {
              integerLocal14 = integerArrayArgument4[3];
              integerLocal15 = integerArrayArgument4[4];
              integerLocal16 = integerArrayArgument4[5];
              integerLocal17 = integerArrayArgument4[6];
              integerLocal18 = integerArrayArgument4[7];
              integerLocal19 = integerArrayArgument4[8];
              integerLocal20 = integerArrayArgument4[9];
              integerLocal21 = integerArrayArgument4[10];
              integerLocal22 = integerArrayArgument4[11];
              integerLocal23 = 0;
              do {
                stackIntegerLocal1 = integerLocal23;
                stackIntegerLocal2 = mixedSupport145Argument7.shortState0002;
                if (stackIntegerLocal1 >= stackIntegerLocal2) {
                  break;
                }
                if (UiComponentPart015.integerArrayState0100.length <= integerLocal23) {
                  break;
                }
                integerLocal24 = mixedSupport145Argument7.shortArrayState0013[integerLocal23];
                integerLocal25 = mixedSupport145Argument7.shortArrayState0011[integerLocal23];
                integerLocal26 = mixedSupport145Argument7.shortArrayState0007[integerLocal23];
                UiComponentPart015.integerArrayState0100[integerLocal23] = integerLocal26 * integerLocal20 + (integerLocal17 * integerLocal25 + integerLocal24 * integerLocal14) >> 16;
                MixedSupport009.integerArrayState0016[integerLocal23] = integerLocal21 * integerLocal26 + integerLocal15 * integerLocal24 + integerLocal25 * integerLocal18 >> 16;
                MixedSupport120.integerArrayState0205[integerLocal23] = integerLocal25 * integerLocal19 + integerLocal16 * integerLocal24 + integerLocal26 * integerLocal22 >> 16;
                integerLocal23++;
              } while (integerLocal35 == 0);
            }
            break;
          }
          MixedSupport032.performAction0524(mixedSupport145Argument7, booleanArgument3, integerLocal13, (byte) 103, integerLocal11);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal36) {
          caughtExceptionLocal10 = caughtParameterLocal36;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal12;
          stackStringBuilderLocal4 = new StringBuilder().append("on.G(").append(booleanArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument3).append(',');
          if (integerArrayArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument5).append(',').append(booleanArgument6).append(',');
          if (mixedSupport145Argument7 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        int stackIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!uiComponentArgument5.booleanState0018 &&
            !uiComponentArgument5.computeBoolean0239(true)) {
            stackIntegerLocal1 = 2188450;
          } else {
            stackIntegerLocal1 = 3249872;
          }
          integerLocal6 = stackIntegerLocal1;
          if (byteArgument4 > -60) {
            return;
          }
          this.bitmapFontState0017.computeInteger1213("<u=" + Integer.toString(integerLocal6, 16) + ">" + uiComponentArgument5.stringState0078 + "</u>", uiComponentArgument5.integerState0110 + integerArgument2, uiComponentArgument5.integerState0104 + integerArgument3, uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, integerLocal6, -1, this.integerState0570, this.integerState0571, this.bitmapFontState0017.integerState0523 + this.bitmapFontState0017.integerState0518);
          if (uiComponentArgument5.computeBoolean0239(true)) {
            integerLocal8 = this.bitmapFontState0017.computeInteger1208(uiComponentArgument5.stringState0078);
            integerLocal9 = this.bitmapFontState0017.integerState0523 + this.bitmapFontState0017.integerState0518;
            integerLocal10 = uiComponentArgument5.integerState0110 + integerArgument2;
            if (2 != this.integerState0570) {
              if (this.integerState0570 == 1) {
                integerLocal10 = integerLocal10 + (uiComponentArgument5.integerState0107 - integerLocal8 >> 1);
                if (integerLocal12 != 0) {
                  integerLocal10 = integerLocal10 + (-integerLocal8 + uiComponentArgument5.integerState0107);
                }
              }
            } else {
              integerLocal10 = integerLocal10 + (-integerLocal8 + uiComponentArgument5.integerState0107);
            }
            integerLocal11 = integerArgument3 + uiComponentArgument5.integerState0104;
            if (this.integerState0571 != 2) {
              if (this.integerState0571 == 1) {
                integerLocal11 = integerLocal11 + (uiComponentArgument5.integerState0108 - integerLocal9 >> 1);
                if (integerLocal12 != 0) {
                  integerLocal11 = integerLocal11 + (uiComponentArgument5.integerState0108 - integerLocal9);
                }
              }
            } else {
              integerLocal11 = integerLocal11 + (uiComponentArgument5.integerState0108 - integerLocal9);
            }
            RenderingSupport007.performAction0958(4 + integerLocal8, -2 + integerLocal10, (byte) -96, integerLocal11 + 2, integerLocal9);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal5 = caughtParameterLocal13;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("on.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final static void performAction1379(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
        if (byteArgument1 != -100) {
          return;
        }
        try {
          integerLocal1 = integerLocal3 - UiComponentPart003.integerState0073 * UiComponentPart003.integerState0073;
          integerLocal2 = GameSession.integerState0618 + (MixedSupport003.integerState0017 - GameSession.integerState0618) * integerLocal1 / integerLocal3;
          RichTextLayout.sceneWidgetState0021.performAction1994(640, byteArgument1 + 100, integerLocal2, 120, MixedSupport146.integerState0857);
          MixedSupport049.performAction0647(MixedSupport003.integerState0017 - 24, MixedSupport064.integerState0335, 640, CollectionSupport003.integerState0540, 0, 5, (byte) -107);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "on.C(" + byteArgument1 + ')');
        }
    }

    public MixedSupport099() {
        try {
          this.bitmapFontState0017 = GameDomainSupport003.bitmapFontState0015;
          this.integerState0571 = 1;
          this.integerState0570 = 1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "on.<init>()");
        }
    }

    MixedSupport099(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          this.integerState0570 = integerArgument2;
          this.bitmapFontState0017 = bitmapFontArgument1;
          this.integerState0571 = integerArgument3;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeException = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("on.<init>(");
          if (bitmapFontArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static IndexedSprite[] computeIndexedSpriteArray1375(int integerArgument1, byte byteArgument2, int integerArgument3, ResourceArchive resourceArchiveArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        Object stackObjectLocal2 = null;
        IndexedSprite[] stackIndexedSpriteArrayLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0618(integerArgument3, resourceArchiveArgument4, integerArgument1, 38)) {
            stackObjectLocal2 = null;
            return (IndexedSprite[]) (stackObjectLocal2);
          }
          if (byteArgument2 != 37) {
            MixedSupport099.performAction1379((byte) 98);
          }
          stackIndexedSpriteArrayLocal3 = MixedSupport018.computeIndexedSpriteArray0276(-112);
          return stackIndexedSpriteArrayLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("on.F(").append(integerArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    public static void performAction1374(byte byteArgument1) {
        stringState0395 = null;
        rgbSpriteArrayState0020 = null;
        stringState0394 = null;
        if (byteArgument1 != 6) {
          return;
        }
        try {
          stringState0396 = null;
          stringState0397 = null;
          integerArrayState0178 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "on.D(" + byteArgument1 + ')');
        }
    }

    final static void performAction1378(RgbSprite[] rgbSpriteArrayArgument1, int integerArgument2) {
        RuntimeException runtimeException = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 != 19264) {
            return;
          }
          if (null != rgbSpriteArrayArgument1) {
            integerLocal2 = 0;
            while (integerLocal2 < rgbSpriteArrayArgument1.length) {
              rgbSpriteArrayArgument1[integerLocal2].performAction0291();
              integerLocal2++;
              if (integerLocal3 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeException = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeException;
          stackStringBuilderLocal5 = new StringBuilder().append("on.E(");
          if (rgbSpriteArrayArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    static {
        stringState0394 = "No options available";
        stringState0395 = "<%0> AT ONCE";
        integerArrayState0178 = new int[]{200, 100, 200, 300, 200, 1000, 200, 1000, 300, 500, 500, 100, 100, 200, 500, 200, 300, 1000, 100, 200, 500, 300, 500, 500, 100, 100, 100, 100, 200, 200, 300};
        stringState0396 = "Return to Options Menu";
        stringState0397 = "Special Item Bonus: ";
    }
}
