/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport036 {
    static SceneWidget sceneWidgetState0027;
    static int[] integerArrayState0044;
    static SceneWidget sceneWidgetState0028;
    static int[] integerArrayState0045;
    static long longState0015;
    static int integerState0221;
    static String stringState0167;
    static int integerState0222;

    final static void performAction0557(int integerArgument1, byte byteArgument2, boolean booleanArgument3, int integerArgument4) {
        MixedSupport042.performAction0595(integerArgument1 + 20, 256, 16777215, MixedSupport136.stringState0559, integerArgument4 + 4, SceneWidget.renderingSupport010State0007);
        integerArgument1 += 26;
        MixedSupport042.performAction0595(12 + integerArgument1, 256, 16777215, GameplayControls.stringArrayState0056[0], 4 + integerArgument4, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[0].performAction0300(122 + integerArgument4, integerArgument1);
        integerArgument1 += 16;
        MixedSupport042.performAction0595(12 + integerArgument1, byteArgument2 ^ 261, 16777215, GameplayControls.stringArrayState0056[1], integerArgument4 + 4, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[1].performAction0300(integerArgument4 + 122, integerArgument1);
        integerArgument1 += 23;
        if (byteArgument2 != 5) {
          String stringLocal1 = (String) null;
          MixedSupport036.computeBoolean0555((byte) 7, (String) null);
        }
        MixedSupport042.performAction0595(12 + integerArgument1, 256, 16777215, GameplayControls.stringArrayState0056[2], 4 + integerArgument4, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[3].performAction0300(122 + integerArgument4, integerArgument1);
        integerArgument1 += 16;
        MixedSupport042.performAction0595(integerArgument1 + 12, 256, 16777215, GameplayControls.stringArrayState0056[3], 4 + integerArgument4, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[2].performAction0300(integerArgument4 + 100, integerArgument1);
        MixedSupport029.performAction0447(16777215, 119 + integerArgument4, "/", 12 + integerArgument1, (byte) 75, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[4].performAction0300(122 + integerArgument4, integerArgument1);
        integerArgument1 += 23;
        MixedSupport042.performAction0595(integerArgument1 + 12, 256, 16777215, GameplayControls.stringArrayState0056[5], integerArgument4 + 4, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[5].performAction0300(122 + integerArgument4, integerArgument1);
        integerArgument1 += 23;
        if (booleanArgument3) {
          MixedSupport042.performAction0595(12 + integerArgument1, 256, 16777215, GameplayControls.stringArrayState0056[6], 4 + integerArgument4, UiComponentPart029.renderingSupport010State0005);
          UiComponentPart023.rgbSpriteArrayState0021[6].performAction0300(integerArgument4 + 122, integerArgument1);
        }
    }

    final static void performAction0559(int integerArgument1, boolean booleanArgument2) {
        if (RichTextLayout.computeBoolean0437((byte) 80)) {
          booleanArgument2 = false;
        }
        RenderingSupport002.performAction0269(booleanArgument2, 1);
        MixedSupport133.performAction1844((byte) 54);
        if (integerArgument1 != 5) {
          stringState0167 = (String) null;
        }
    }

    public static void performAction0556(int integerArgument1) {
        if (integerArgument1 < 26) {
          return;
        }
        integerArrayState0044 = null;
        stringState0167 = null;
        sceneWidgetState0028 = null;
        sceneWidgetState0027 = null;
        integerArrayState0045 = null;
    }

    final static RgbSprite[] computeRgbSpriteArray0558(int integerArgument1, RgbSprite rgbSpriteArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RgbSprite cachedRgbSpriteLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal5 = null;
        RgbSprite[] stackRgbSpriteArrayLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        RgbSprite[] rgbSpriteArrayLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        int[] integerArrayLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        RgbSprite rgbSpriteLocal16 = null;
        int[] integerArrayLocal17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          rgbSpriteArrayLocal11 = new RgbSprite[integerArgument1];
          integerArrayLocal13 = rgbSpriteArgument2.integerArrayState0024;
          integerLocal14 = rgbSpriteArgument2.integerState0254 / integerArgument1;
          if (integerArgument3 != -10241) {
            stackRgbSpriteArrayLocal5 = (RgbSprite[]) null;
            return stackRgbSpriteArrayLocal5;
          }
          integerLocal15 = rgbSpriteArgument2.integerState0258 - integerLocal14;
          for (integerLocal1 = 0; integerLocal1 < integerArgument1; integerLocal1++) {
            cachedRgbSpriteLocal2 = new RgbSprite(integerLocal14, rgbSpriteArgument2.integerState0255);
            rgbSpriteArrayLocal11[integerLocal1] = cachedRgbSpriteLocal2;
            rgbSpriteLocal16 = cachedRgbSpriteLocal2;
            integerArrayLocal17 = rgbSpriteLocal16.integerArrayState0024;
            integerLocal18 = integerLocal1 * integerLocal14 + rgbSpriteArgument2.integerState0259;
            integerLocal19 = rgbSpriteArgument2.integerState0256;
            integerLocal20 = integerLocal19 * integerLocal14 + integerLocal18;
            integerLocal21 = 0;
            for (integerLocal3 = -rgbSpriteArgument2.integerState0255; integerLocal3 < 0; integerLocal3++) {
              for (integerLocal4 = -integerLocal14; integerLocal4 < 0; integerLocal4++) {
                integerArrayLocal17[integerLocal21++] = integerArrayLocal13[integerLocal20++];
              }
              integerLocal20 = integerLocal20 + integerLocal15;
            }
          }
          stackRgbSpriteArrayLocal6 = rgbSpriteArrayLocal11;
          return stackRgbSpriteArrayLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal23) {
          caughtExceptionLocal10 = caughtParameterLocal23;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal12;
          stackStringBuilderLocal8 = new StringBuilder().append("fc.B(").append(integerArgument1).append(',');
          if (rgbSpriteArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static boolean computeBoolean0555(byte byteArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        String stringLocal2 = null;
        Exception exceptionLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        Throwable caughtExceptionLocal9 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          try {
            if (!PlatformService.stringState0171.startsWith("win")) {
              return false;
            }
            if (!stringArgument2.startsWith("http://") &&
              !stringArgument2.startsWith("https://")) {
              return false;
            }
            stringLocal2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (integerLocal1 = 0; integerLocal1 < stringArgument2.length(); integerLocal1++) {
              if (stringLocal2.indexOf((int) stringArgument2.charAt(integerLocal1)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + stringArgument2 + "\"");
            if (byteArgument1 == -19) {
              return true;
            }
            return false;
          } catch (java.lang.Exception caughtParameterLocal10) {
            caughtExceptionLocal9 = caughtParameterLocal10;
            exceptionLocal3 = (Exception) (Object) caughtExceptionLocal9;
            return false;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal4 = (RuntimeException) (Object) caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal4;
          stackStringBuilderLocal7 = new StringBuilder().append("fc.F(").append(byteArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    final static void performAction0554(byte byteArgument1) {
        try {
          int integerLocal1 = 0;
          IOException iOException = null;
          IOException iOExceptionLocal3 = null;
          int integerLocal4 = 0;
          int integerLocal5 = 0;
          Throwable caughtExceptionLocal6 = null;
          RuntimeException runtimeExceptionLocal7 = null;
          integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            if (MixedSupport124.networkSupport003State0003 != null) {
              MixedSupport124.networkSupport003State0003.performAction0386((byte) 117);
            }
            if (NetworkArchiveRequestManager.cacheWorkQueueState0003 != null) {
              NetworkArchiveRequestManager.cacheWorkQueueState0003.performAction0833((byte) -98);
            }
            if (null != MixedSupport086.mixedSupport091State0004) {
              try {
                MixedSupport086.mixedSupport091State0004.performAction1273((byte) 124);
              } catch (java.io.IOException caughtParameterLocal8) {
                caughtExceptionLocal6 = caughtParameterLocal8;
                iOException = (IOException) (Object) caughtExceptionLocal6;
              }
            }
            integerLocal4 = -32 % ((byteArgument1 + 41) / 50);
            if (null != SceneWidgetPart005.mixedSupport091ArrayState0001) {
              for (integerLocal1 = 0; SceneWidgetPart005.mixedSupport091ArrayState0001.length > integerLocal1; integerLocal1++) {
                if (SceneWidgetPart005.mixedSupport091ArrayState0001[integerLocal1] != null) {
                  try {
                    SceneWidgetPart005.mixedSupport091ArrayState0001[integerLocal1].performAction1273((byte) 125);
                  } catch (java.io.IOException caughtParameterLocal9) {
                    caughtExceptionLocal6 = caughtParameterLocal9;
                    iOExceptionLocal3 = (IOException) (Object) caughtExceptionLocal6;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal10) {
            caughtExceptionLocal6 = caughtParameterLocal10;
            runtimeExceptionLocal7 = (RuntimeException) (Object) caughtExceptionLocal6;
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal7), "fc.C(" + byteArgument1 + ')');
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    static {
        integerArrayState0044 = new int[8192];
        stringState0167 = "Cancel";
        integerArrayState0045 = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
