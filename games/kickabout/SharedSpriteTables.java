/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SharedSpriteTables {
    static Sprite[][] field_a;
    static String field_c;
    static int field_b;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        int var1 = 69 / ((-21 - param0) / 57);
        field_a = (Sprite[][]) null;
        field_c = null;
    }

    static {
        field_z = "fh.A(";
        field_c = "Show private chat from my friends and opponents";
    }
}
