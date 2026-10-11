/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport075 extends HashNode {
    int integerState0406;
    AsyncTask[] asyncTaskArrayState0001;
    int[] integerArrayState0135;
    AsyncTask[] asyncTaskArrayState0002;
    int integerState0407;
    static MixedSupport139 mixedSupport139State0005;
    int[] integerArrayState0136;
    static MixedSupport004 mixedSupport004State0002;
    byte[][][] byteArrayArrayArrayState0002;
    static RgbSprite rgbSpriteState0027;
    static int[] integerArrayState0137;
    static String stringState0316;
    int[] integerArrayState0138;
    static MixedSupport084 mixedSupport084State0002;
    static SceneWidget sceneWidgetState0070;
    static String stringState0317;

    public static void performAction1034(boolean booleanArgument1) {
        if (booleanArgument1) {
          mixedSupport139State0005 = null;
          sceneWidgetState0070 = null;
          stringState0316 = null;
          mixedSupport084State0002 = null;
          mixedSupport004State0002 = null;
          integerArrayState0137 = null;
          stringState0317 = null;
          rgbSpriteState0027 = null;
          return;
        }
    }

    final static void performAction1033(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument1 != 11024) {
          MixedSupport075.performAction1033(-96, 40, 17);
          MixedSupport131.integerState0790 = integerArgument3;
          MixedSupport117.integerState0726 = integerArgument2;
          return;
        }
        MixedSupport131.integerState0790 = integerArgument3;
        MixedSupport117.integerState0726 = integerArgument2;
    }

    MixedSupport075() {
    }

    static {
        mixedSupport139State0005 = new MixedSupport139();
        stringState0316 = "Unable to delete friend - system busy";
        integerArrayState0137 = new int[8192];
        mixedSupport004State0002 = new MixedSupport004();
        mixedSupport084State0002 = new MixedSupport084();
        stringState0317 = "Bugs";
    }
}
