/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport105 {
    static RgbSprite rgbSpriteState0041;
    static boolean[] booleanArrayState0008;
    static RawSound rawSoundState0016;
    static RgbSprite rgbSpriteState0042;
    static String stringState0420;
    static String stringState0421;
    static double doubleState0002;

    final static Boolean computeBoolean1417(int integerArgument1) {
        Boolean booleanLocal1 = null;
        Boolean booleanLocal2;
        if (integerArgument1 != 24994) {
          stringState0420 = (String) null;
          booleanLocal1 = SceneWidgetPart014.booleanState0220;
          SceneWidgetPart014.booleanState0220 = null;
          return booleanLocal1;
        }
        booleanLocal2 = SceneWidgetPart014.booleanState0220;
        SceneWidgetPart014.booleanState0220 = null;
        return booleanLocal2;
    }

    public static void performAction1416(byte byteArgument1) {
        stringState0421 = null;
        booleanArrayState0008 = null;
        stringState0420 = null;
        rgbSpriteState0042 = null;
        rgbSpriteState0041 = null;
        rawSoundState0016 = null;
        if (byteArgument1 != 126) {
          MixedSupport105.performAction1416((byte) 95);
        }
    }

    static {
        booleanArrayState0008 = new boolean[8];
        stringState0421 = "Accept draw";
        stringState0420 = "TAB - hide chat temporarily";
        doubleState0002 = 0.0;
    }
}
