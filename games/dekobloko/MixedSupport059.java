/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixedSupport059 {
    static MixedSupport111 mixedSupport111State0004;
    static SceneWidget sceneWidgetState0054;
    static int integerState0320;
    static RawSound rawSoundState0011;
    static SceneWidget sceneWidgetState0055;

    abstract int computeInteger0419(byte byteArgument1, long longArgument2);

    abstract void performAction0422(int integerArgument1);

    abstract long computeLong0420(int integerArgument1);

    final static void performAction0796(RgbSprite[] rgbSpriteArrayArgument1, BitmapFont bitmapFontArgument2, RgbSprite[] rgbSpriteArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, BitmapFont bitmapFontArgument13, RgbSprite[] rgbSpriteArrayArgument14, int integerArgument15, int integerArgument16, int integerArgument17, int integerArgument18, int integerArgument19, int integerArgument20) {
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
          if (integerArgument17 != 10406) {
            return;
          }
          ClientException.performAction0401(bitmapFontArgument2, integerArgument8, integerArgument7, new MixedSupport015(rgbSpriteArrayArgument1), new MixedSupport015(rgbSpriteArrayArgument3), new MixedSupport015(rgbSpriteArrayArgument14), integerArgument15, integerArgument4, bitmapFontArgument13, integerArgument11, integerArgument19, integerArgument12, integerArgument6, false, integerArgument16, integerArgument10, integerArgument18, integerArgument5, integerArgument9, integerArgument20);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal13;
          stackStringBuilderLocal2 = new StringBuilder().append("ie.B(");
          if (rgbSpriteArrayArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (bitmapFontArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (rgbSpriteArrayArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',').append(integerArgument9).append(',').append(integerArgument10).append(',').append(integerArgument11).append(',').append(integerArgument12).append(',');
          if (bitmapFontArgument13 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (rgbSpriteArrayArgument14 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument15).append(',').append(integerArgument16).append(',').append(integerArgument17).append(',').append(integerArgument18).append(',').append(integerArgument19).append(',').append(integerArgument20).append(')').toString());
        }
    }

    public static void performAction0794(byte byteArgument1) {
        mixedSupport111State0004 = null;
        sceneWidgetState0055 = null;
        if (byteArgument1 < -117) {
          sceneWidgetState0054 = null;
          rawSoundState0011 = null;
          return;
        }
        RgbSprite[] rgbSpriteArrayLocal1 = (RgbSprite[]) null;
        MixedSupport059.performAction0796((RgbSprite[]) null, (BitmapFont) null, (RgbSprite[]) null, 49, -127, -49, -3, 31, 17, -85, 4, 92, (BitmapFont) null, (RgbSprite[]) null, -45, 72, 26, 15, 123, 106);
        sceneWidgetState0054 = null;
        rawSoundState0011 = null;
    }

    final int computeInteger0795(long longArgument1, int integerArgument2) {
        long longLocal1 = 0L;
        long longLocal2;
        if (integerArgument2 == 4) {
          longLocal1 = this.computeLong0420(integerArgument2 ^ -22966);
          if (0L < longLocal1) {
            MixedSupport132.performAction1837(longLocal1, integerArgument2 ^ -124);
          }
          return this.computeInteger0419((byte) 109, longArgument1);
        }
        rawSoundState0011 = (RawSound) null;
        longLocal2 = this.computeLong0420(integerArgument2 ^ -22966);
        if (0L < longLocal2) {
          MixedSupport132.performAction1837(longLocal2, integerArgument2 ^ -124);
        }
        return this.computeInteger0419((byte) 109, longArgument1);
    }

    static {
        mixedSupport111State0004 = new MixedSupport111(2, 4, 4, 0);
    }
}
