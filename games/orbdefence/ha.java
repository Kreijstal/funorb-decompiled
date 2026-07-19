/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends ca {
    int field_f;
    static String field_j;
    static boolean[] field_g;
    int field_m;
    int field_k;
    static int field_o;
    static String field_l;
    int field_i;
    int field_n;
    int field_h;

    public static void a(byte param0) {
        field_j = null;
        field_l = null;
        if (param0 <= 91) {
            field_l = (String) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    ha(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_h = param0;
        this.field_n = param3;
        this.field_m = param2;
        this.field_f = param5;
        this.field_k = param4;
        this.field_i = param1;
    }

    static {
        field_j = "Log in / Create account";
        field_l = "Loading music";
    }
}
