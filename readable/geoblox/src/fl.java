/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    static PcmSample[] field_c;
    static Sprite spaceForegroundSprite;
    private static String field_z;

    public static void a(int param0) {
        spaceForegroundSprite = null;
        if (param0 != 33) {
            fl.a(76);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_z = "fl.A(";
        field_c = new PcmSample[33];
    }
}
