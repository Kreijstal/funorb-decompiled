/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BigBurstaProgress {
    static int bigDefeatBalance;
    static SpriteData[] attractorSpriteData;
    private static String field_z;

    public static void releaseStatics(int param0) {
        attractorSpriteData = null;
        if (param0 > -74) {
          attractorSpriteData = (SpriteData[]) null;
        }
    }

    static {
        field_z = "ei.A(";
        bigDefeatBalance = 0;
    }
}
