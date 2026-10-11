/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport011 {
    static String stringState0054;
    static boolean[] booleanArrayState0002;
    static BitmapFont bitmapFontState0006;
    static boolean booleanState0010;
    static RawSound rawSoundState0004;
    static String stringState0055;

    public static void performAction0166(int integerArgument1) {
        booleanArrayState0002 = null;
        bitmapFontState0006 = null;
        rawSoundState0004 = null;
        stringState0055 = null;
        stringState0054 = null;
        if (integerArgument1 != 112) {
          stringState0055 = (String) null;
        }
    }

    final static void performAction0168(int integerArgument1, RgbSprite[] rgbSpriteArrayArgument2, BitmapFont bitmapFontArgument3, boolean booleanArgument4, BitmapFont bitmapFontArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, RgbSprite[] rgbSpriteArrayArgument13, int integerArgument14, int integerArgument15, int integerArgument16, RgbSprite[] rgbSpriteArrayArgument17, int integerArgument18, int integerArgument19, int integerArgument20, int integerArgument21) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        try {
          InputAdapter004.performAction1236(integerArgument19, new MixedSupport015(rgbSpriteArrayArgument13), bitmapFontArgument5, integerArgument7, integerArgument21, new MixedSupport015(rgbSpriteArrayArgument2), integerArgument14, bitmapFontArgument3, integerArgument15, integerArgument20, new MixedSupport015(rgbSpriteArrayArgument17), integerArgument8, -6, integerArgument18, integerArgument16, integerArgument1, integerArgument11, integerArgument9, integerArgument6, integerArgument12, integerArgument10);
          if (!booleanArgument4) {
            rawSoundState0004 = (RawSound) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal13;
          stackStringBuilderLocal2 = new StringBuilder().append("bj.D(").append(integerArgument1).append(',');
          if (rgbSpriteArrayArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (bitmapFontArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument4).append(',');
          if (bitmapFontArgument5 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',').append(integerArgument9).append(',').append(integerArgument10).append(',').append(integerArgument11).append(',').append(integerArgument12).append(',');
          if (rgbSpriteArrayArgument13 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument14).append(',').append(integerArgument15).append(',').append(integerArgument16).append(',');
          if (rgbSpriteArrayArgument17 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument18).append(',').append(integerArgument19).append(',').append(integerArgument20).append(',').append(integerArgument21).append(')').toString());
        }
    }

    final static RgbSprite[] computeRgbSpriteArray0167(int integerArgument1, ResourceArchive resourceArchiveArgument2, String stringArgument3, String stringArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RgbSprite[] stackRgbSpriteArrayLocal4 = null;
        RgbSprite[] stackRgbSpriteArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          if (integerArgument1 != 112) {
            stackRgbSpriteArrayLocal4 = (RgbSprite[]) null;
            return stackRgbSpriteArrayLocal4;
          }
          integerLocal1 = resourceArchiveArgument2.computeInteger0926(integerArgument1 - 113, stringArgument3);
          integerLocal3 = resourceArchiveArgument2.computeInteger0913(integerLocal1, 13030, stringArgument4);
          stackRgbSpriteArrayLocal5 = SocketFactory.computeRgbSpriteArray2024(resourceArchiveArgument2, -126, integerLocal3, integerLocal1);
          return stackRgbSpriteArrayLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("bj.B(").append(integerArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (stringArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (stringArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    final static SceneWidgetPart012 computeSceneWidgetPart0120169(long longArgument1, byte byteArgument2) {
        if (byteArgument2 < 47) {
          return (SceneWidgetPart012) null;
        }
        return (SceneWidgetPart012) (GameApplet.collectionSupport003State0002.computeDualNode1280(24710, longArgument1));
    }

    static {
        stringState0054 = "The Twist";
        booleanArrayState0002 = new boolean[112];
        stringState0055 = "<%0> cannot join; the game is full.";
    }
}
