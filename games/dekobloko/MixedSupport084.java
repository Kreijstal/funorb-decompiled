/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport084 {
    static int[] integerArrayState0149;
    static int[] integerArrayState0150;
    static RgbSprite rgbSpriteState0033;
    static String stringState0337;
    static String stringState0338;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void performAction1134(byte byteArgument1) {
        stringState0337 = null;
        rgbSpriteState0033 = null;
        stringState0338 = null;
        integerArrayState0150 = null;
        int integerLocal1 = 52 / ((byteArgument1 - 7) / 42);
        integerArrayState0149 = null;
    }

    static {
        stringState0337 = "<%0> has lost connection.";
        stringState0338 = "Press F10 to open Quick Chat.";
    }
}
