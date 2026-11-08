/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static int field_a;
    static SpriteData[] field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 > -74) {
          field_b = (SpriteData[]) null;
        }
    }

    static {
        field_z = "ei.A(";
        field_a = 0;
    }
}
