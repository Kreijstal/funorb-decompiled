/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport077 {
    static int integerState0415;
    static RgbSprite[] rgbSpriteArrayState0017;
    static int integerState0416;
    static RgbSprite rgbSpriteState0028;
    static String stringState0321;
    static ClientException[] clientExceptionArrayState0001;
    static RgbSprite rgbSpriteState0029;
    static SceneWidget sceneWidgetState0073;
    static long longState0025;
    static int[] integerArrayState0140;

    final static SceneWidget computeSceneWidget1040(int integerArgument1) {
        if (integerArgument1 > -72) {
          return (SceneWidget) null;
        }
        return SoftwareFramebuffer.computeSceneWidget2032(-122);
    }

    final static int[] computeIntegerArray1042(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 4) {
          MixedSupport077.computeSceneWidget1040(64);
        }
        int[] integerArrayLocal3 = new int[4];
        int[] integerArrayLocal4 = integerArrayLocal3;
        for (integerLocal1 = 0; integerLocal1 < 4; integerLocal1++) {
          integerArrayLocal3[integerLocal1] = RenderingSupport001.randomState0001.nextInt();
        }
        return integerArrayLocal4;
    }

    public static void performAction1041(int integerArgument1) {
        sceneWidgetState0073 = null;
        stringState0321 = null;
        rgbSpriteState0029 = null;
        if (integerArgument1 < 118) {
          longState0025 = -47L;
        }
        clientExceptionArrayState0001 = null;
        rgbSpriteState0028 = null;
        rgbSpriteArrayState0017 = null;
        integerArrayState0140 = null;
    }

    static {
        int integerLocal1 = 0;
        rgbSpriteArrayState0017 = new RgbSprite[64];
        integerState0416 = 0;
        stringState0321 = "City";
        for (integerLocal1 = 0; integerLocal1 < 64; integerLocal1++) {
          rgbSpriteArrayState0017[integerLocal1] = new RgbSprite(9, 9);
        }
        longState0025 = 0L;
        integerArrayState0140 = new int[8];
    }
}
