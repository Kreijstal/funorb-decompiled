/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static fc field_c;
    static int[] field_a;
    static int[] field_e;
    static int field_h;
    static String field_b;
    static k field_d;
    static int field_g;
    static dd field_f;

    final static void a(int param0) {
        if (param0 <= 118) {
            return;
        }
        jk.field_m = new vc();
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        int var1 = -110 % ((-11 - param0) / 39);
    }

    static {
        field_a = new int[40];
        field_c = new fc();
        field_e = new int[128];
        field_b = "This password contains repeated characters, and would be easy to guess";
    }
}
