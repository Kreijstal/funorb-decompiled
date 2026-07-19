/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf {
    static bk field_d;
    static km field_f;
    static boolean field_e;
    static int[] field_b;
    static String[] field_a;
    static String field_c;
    static String field_g;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        if (param0 != 540) {
            field_f = (km) null;
        }
    }

    static {
        field_z = "gf.A(";
        field_f = new km(540, 140);
        field_e = false;
        field_g = "You are on <%0>";
        field_c = "<%0> has dropped out.";
    }
}
