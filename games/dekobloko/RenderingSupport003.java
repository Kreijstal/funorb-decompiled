/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport003 {
    static int integerState0251;
    static SceneWidgetPart010 sceneWidgetPart010State0001;
    static String stringState0199;
    static boolean booleanState0054;
    static RgbSprite rgbSpriteState0017;
    static MixedSupport062 mixedSupport062State0002;
    static int integerState0252;
    static volatile int integerState0253;
    static volatile boolean booleanState0055;
    static boolean booleanState0056;

    final static int computeInteger0632(BucketBoard bucketBoardArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        BucketBoard bucketBoardLocal13 = null;
        int integerLocal14;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (bucketBoardArgument1 == null) {
            stackIntegerLocal2 = 0;
            return stackIntegerLocal2;
          }
          integerLocal8 = 0;
          integerLocal10 = 10000 / bucketBoardArgument1.boardWidth;
          if (integerArgument2 <= 14) {
            bucketBoardLocal13 = (BucketBoard) null;
            RenderingSupport003.computeInteger0632((BucketBoard) null, 96);
          }
          for (integerLocal11 = bucketBoardArgument1.integerState0473; bucketBoardArgument1.boardHeight > integerLocal11; integerLocal11++) {
            for (integerLocal1 = 0; bucketBoardArgument1.boardWidth > integerLocal1; integerLocal1++) {
              if (bucketBoardArgument1.settledCells[integerLocal11 * bucketBoardArgument1.boardWidth + integerLocal1] != 0) {
                integerLocal8 = integerLocal8 + integerLocal10;
              }
            }
            integerLocal10 = integerLocal10 * 3 / 4;
          }
          integerLocal8 = integerLocal8 + integerLocal10 * bucketBoardArgument1.boardWidth;
          integerLocal14 = 0;
          if (integerLocal8 >= 5000) {
            integerLocal14 = 1;
          }
          if (integerLocal8 >= 20000) {
            integerLocal14 = 2;
          }
          stackIntegerLocal3 = integerLocal14;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal7 = caughtParameterLocal15;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
          stackStringBuilderLocal5 = new StringBuilder().append("ge.E(");
          if (bucketBoardArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static LoginCredentials computeLoginCredentials0634(byte byteArgument1) {
        String stringLocal1 = MixedSupport002.computeString0026(byteArgument1 + 35);
        if (stringLocal1 != null &&
          stringLocal1.indexOf('@') >= 0) {
          stringLocal1 = "";
        }
        if (byteArgument1 != -89) {
          integerState0252 = 0;
        }
        return new LoginCredentials(MixedSupport002.computeString0026(-65), AnimatedTileRegion.computeBoolean1890((byte) -17));
    }

    public static void performAction0633(boolean booleanArgument1) {
        stringState0199 = null;
        if (!booleanArgument1) {
          return;
        }
        sceneWidgetPart010State0001 = null;
        rgbSpriteState0017 = null;
        mixedSupport062State0002 = null;
    }

    final static RenderingSupport011 computeRenderingSupport0110629(byte byteArgument1, int integerArgument2, int integerArgument3, IndexedSprite[] indexedSpriteArrayArgument4, byte[] byteArrayArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        byte[] byteArrayLocal2 = null;
        int previousIntegerLocal3 = 0;
        int integerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        RenderingSupport011 stackRenderingSupport011Local6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int[] integerArrayLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        int[] integerArrayLocal15 = null;
        int[] integerArrayLocal16 = null;
        int[] integerArrayLocal17 = null;
        int[] integerArrayLocal18 = null;
        int integerLocal19 = 0;
        byte[][] byteArrayArrayLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        RenderingSupport011 renderingSupport011Local23 = null;
        byte[] byteArrayLocal24 = null;
        byte[] byteArrayLocal25 = null;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        int integerLocal33 = 0;
        int[] integerArrayLocal34 = null;
        int[] integerArrayLocal35 = null;
        int[] integerArrayLocal36 = null;
        int[] integerArrayLocal37 = null;
        byte[][] byteArrayArrayLocal38 = null;
        int[] integerArrayLocal39 = null;
        int[] integerArrayLocal40 = null;
        int[] integerArrayLocal41 = null;
        int[] integerArrayLocal42 = null;
        byte[][] byteArrayArrayLocal43 = null;
        int[] integerArrayLocal44 = null;
        int[] integerArrayLocal45 = null;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        int integerLocal49;
        integerLocal33 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (256 != indexedSpriteArrayArgument4.length) {
            throw new IllegalArgumentException();
          }
          integerArrayLocal41 = new int[256];
          integerArrayLocal36 = integerArrayLocal41;
          integerArrayLocal13 = integerArrayLocal36;
          integerArrayLocal42 = new int[256];
          integerArrayLocal37 = integerArrayLocal42;
          integerArrayLocal15 = integerArrayLocal37;
          integerArrayLocal39 = new int[256];
          integerArrayLocal34 = integerArrayLocal39;
          integerArrayLocal16 = integerArrayLocal34;
          integerArrayLocal40 = new int[256];
          integerArrayLocal35 = integerArrayLocal40;
          integerArrayLocal17 = integerArrayLocal35;
          integerLocal19 = -2 / ((48 - byteArgument1) / 43);
          integerArrayLocal18 = new int[]{0, integerArgument2, integerArgument6};
          byteArrayArrayLocal43 = new byte[256][];
          byteArrayArrayLocal38 = byteArrayArrayLocal43;
          byteArrayArrayLocal20 = byteArrayArrayLocal38;
          integerArrayLocal45 = SoftwareRaster.integerArrayState0063;
          integerLocal21 = SoftwareRaster.integerState0285;
          integerLocal22 = SoftwareRaster.integerState0284;
          integerArrayLocal44 = new int[4];
          SoftwareRaster.performAction0731(integerArrayLocal44);
          for (integerLocal1 = 0; integerLocal1 < 256; integerLocal1++) {
            integerArrayLocal13[integerLocal1] = indexedSpriteArrayArgument4[integerLocal1].integerState0427 - integerArgument3;
            integerArrayLocal15[integerLocal1] = indexedSpriteArrayArgument4[integerLocal1].integerState0428 - integerArgument3;
            integerArrayLocal16[integerLocal1] = (integerArgument3 << 1) + indexedSpriteArrayArgument4[integerLocal1].integerState0425;
            integerArrayLocal17[integerLocal1] = indexedSpriteArrayArgument4[integerLocal1].integerState0426 + (integerArgument3 << 1);
            byteArrayLocal2 = new byte[integerArrayLocal39[integerLocal1] * integerArrayLocal40[integerLocal1]];
            byteArrayArrayLocal20[integerLocal1] = byteArrayLocal2;
            byteArrayLocal24 = byteArrayLocal2;
            byteArrayLocal25 = indexedSpriteArrayArgument4[integerLocal1].byteArrayState0021;
            integerLocal26 = indexedSpriteArrayArgument4[integerLocal1].integerState0425;
            integerLocal27 = indexedSpriteArrayArgument4[integerLocal1].integerState0426;
            integerLocal28 = integerArrayLocal39[integerLocal1];
            integerLocal29 = integerLocal28 - integerLocal26;
            SoftwareRaster.performAction0724(new int[integerArrayLocal40[integerLocal1] * integerArrayLocal39[integerLocal1]], integerArrayLocal39[integerLocal1], integerArrayLocal40[integerLocal1]);
            integerLocal30 = 0;
            for (integerLocal31 = 0; integerLocal31 < integerLocal27; integerLocal31++) {
              for (integerLocal32 = 0; integerLocal26 > integerLocal32; integerLocal32++) {
                previousIntegerLocal3 = integerLocal30;
                integerLocal30++;
                if (0 != byteArrayLocal25[previousIntegerLocal3]) {
                  SoftwareRaster.performAction0719(integerLocal32, integerLocal31, (integerArgument3 << 1) + 1, (integerArgument3 << 1) + 1, 2);
                }
              }
            }
            integerLocal46 = 0;
            for (integerLocal47 = 0; byteArrayLocal24.length > integerLocal47; integerLocal47++) {
              byteArrayLocal24[integerLocal47] = (byte)SoftwareRaster.integerArrayState0063[integerLocal47];
            }
            integerLocal48 = (1 + integerArrayLocal39[integerLocal1]) * integerArgument3;
            for (integerLocal49 = 0; integerLocal49 < integerLocal27; integerLocal49++) {
              for (integerLocal4 = 0; integerLocal26 > integerLocal4; integerLocal4++) {
                if (byteArrayLocal25[integerLocal46++] != 0) {
                  previousIntegerLocal5 = integerLocal48;
                  integerLocal48++;
                  byteArrayLocal24[previousIntegerLocal5] = (byte) 1;
                } else {
                  integerLocal48++;
                }
              }
              integerLocal48 = integerLocal48 + integerLocal29;
            }
          }
          renderingSupport011Local23 = new RenderingSupport011(byteArrayArgument5, integerArrayLocal41, integerArrayLocal42, integerArrayLocal39, integerArrayLocal40, integerArrayLocal18, byteArrayArrayLocal43);
          renderingSupport011Local23.integerState0517 = renderingSupport011Local23.integerState0517 - integerArgument3;
          renderingSupport011Local23.integerState0523 = renderingSupport011Local23.integerState0523 - integerArgument3;
          renderingSupport011Local23.integerState0518 = renderingSupport011Local23.integerState0518 - integerArgument3;
          SoftwareRaster.performAction0724(integerArrayLocal45, integerLocal21, integerLocal22);
          SoftwareRaster.performAction0723(integerArrayLocal44);
          stackRenderingSupport011Local6 = renderingSupport011Local23;
          return stackRenderingSupport011Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal50) {
          caughtExceptionLocal12 = caughtParameterLocal50;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal14;
          stackStringBuilderLocal8 = new StringBuilder().append("ge.B(").append(byteArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (indexedSpriteArrayArgument4 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (byteArrayArgument5 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static void performAction0631(int integerArgument1, int integerArgument2, byte byteArgument3, RawSound rawSoundArgument4) {
        try {
          UiComponentPart001.performAction0063(80, 0, rawSoundArgument4, integerArgument1, integerArgument2);
          if (byteArgument3 != 127) {
            RenderingSupport003.performAction0628((byte) 73);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ge.D(" + integerArgument1 + ',' + integerArgument2 + ',' + byteArgument3 + ',' + (rawSoundArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0628(byte byteArgument1) {
        UiComponentPart024.stringArrayState0032 = new String[NetworkArchiveRequestManager.integerState0598];
        UiComponentPart024.stringArrayState0032[18] = RenderingSupport004.stringState0202;
        UiComponentPart024.stringArrayState0032[17] = MixedSupport135.stringState0555;
        UiComponentPart024.stringArrayState0032[5] = MixedSupport015.stringState0073;
        UiComponentPart024.stringArrayState0032[4] = CacheWorkQueue.stringState0264;
        UiComponentPart024.stringArrayState0032[9] = SceneWidgetPart002.stringState0194;
        UiComponentPart024.stringArrayState0032[15] = TranslatedUiText.stringState0353;
        UiComponentPart024.stringArrayState0032[21] = MixedSupport014.stringState0067;
        UiComponentPart024.stringArrayState0032[11] = SceneWidgetNode.stringState0319;
        UiComponentPart024.stringArrayState0032[7] = MixedSupport048.stringState0203;
        UiComponentPart024.stringArrayState0032[20] = MixedSupport053.stringState0222;
        UiComponentPart024.stringArrayState0032[19] = GameDomainSupport006.stringState0624;
        UiComponentPart024.stringArrayState0032[6] = SceneWidgetPart006.stringState0277;
        UiComponentPart024.stringArrayState0032[13] = MixedSupport146.stringState0593;
        if (byteArgument1 != 123) {
          integerState0251 = 114;
        }
        UiComponentPart024.stringArrayState0032[16] = MixedSupport137.stringState0563;
    }

    final static void performAction0630(byte byteArgument1, MixedSupport068 mixedSupport068Argument2) {
        try {
          if (byteArgument1 > -65) {
            byte[] byteArrayLocal1 = (byte[]) null;
            RenderingSupport003.computeRenderingSupport0110629((byte) -116, -89, -66, (IndexedSprite[]) null, (byte[]) null, 119);
          }
          NetworkSupport007.mixedSupport068State0001 = mixedSupport068Argument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ge.G(" + byteArgument1 + ',' + (mixedSupport068Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        booleanState0054 = false;
        stringState0199 = "Invalid name";
        mixedSupport062State0002 = new MixedSupport062("usename");
        integerState0253 = 0;
        booleanState0055 = true;
    }
}
