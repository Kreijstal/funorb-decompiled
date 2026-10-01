/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static qg field_b;
    static Sprite[] field_a;
    static String[] ratingModeNames;
    static rf field_d;
    private static String field_z;

    public static void a(int param0) {
        if (param0 < -2) {
            field_b = null;
            field_a = null;
            ratingModeNames = null;
            field_d = null;
            return;
        }
        ej.a(1);
        field_b = null;
        field_a = null;
        ratingModeNames = null;
        field_d = null;
    }

    static {
        field_z = "ej.A(";
        ratingModeNames = new String[]{"By rating", "By win percentage"};
        field_a = new Sprite[4];
        field_b = new qg(3);
    }
}
