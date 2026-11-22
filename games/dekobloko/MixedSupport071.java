/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport071 extends HashNode {
    int integerState0406;
    AsyncTask[] asyncTaskArrayState0001;
    int[] integerArrayState0135;
    AsyncTask[] asyncTaskArrayState0002;
    int integerState0407;
    static MixedSupport132 mixedSupport132State0005;
    int[] integerArrayState0136;
    static MixedSupport004 mixedSupport004State0002;
    byte[][][] byteArrayArrayArrayState0002;
    static RgbSprite rgbSpriteState0027;
    static int[] integerArrayState0137;
    static String stringState0316;
    int[] integerArrayState0138;
    static MixedSupport080 mixedSupport080State0002;
    static SceneWidget sceneWidgetState0070;
    static String stringState0317;

    public static void clearStaticReferences(boolean booleanArgument1) {
        if (booleanArgument1) {
          mixedSupport132State0005 = null;
          sceneWidgetState0070 = null;
          stringState0316 = null;
          mixedSupport080State0002 = null;
          mixedSupport004State0002 = null;
          integerArrayState0137 = null;
          stringState0317 = null;
          rgbSpriteState0027 = null;
          return;
        }
    }

    final static void performAction0914(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument1 != 11024) {
          MixedSupport071.performAction0914(-96, 40, 17);
          MixedSupport124.integerState0790 = integerArgument3;
          MixedSupport112.integerState0726 = integerArgument2;
          return;
        }
        MixedSupport124.integerState0790 = integerArgument3;
        MixedSupport112.integerState0726 = integerArgument2;
    }

    MixedSupport071() {
    }

    static {
        mixedSupport132State0005 = new MixedSupport132();
        stringState0316 = "Unable to delete friend - system busy";
        integerArrayState0137 = new int[8192];
        mixedSupport004State0002 = new MixedSupport004();
        mixedSupport080State0002 = new MixedSupport080();
        stringState0317 = "Bugs";
    }
}
