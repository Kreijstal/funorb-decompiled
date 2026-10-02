/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static volatile int field_b;
    static ck field_e;
    static int field_a;
    static Sprite smallBoxSprite;
    static IndexedSprite[] field_c;
    private static String field_z;

    public static void a(int param0) {
        if (param0 == -1) {
            smallBoxSprite = null;
            field_e = null;
            field_c = null;
            return;
        }
        field_b = -112;
        smallBoxSprite = null;
        field_e = null;
        field_c = null;
    }

    static {
        field_z = "lj.A(";
        field_b = -1;
        field_e = new ck(6, 0, 4, 2);
        field_a = 20;
    }
}
