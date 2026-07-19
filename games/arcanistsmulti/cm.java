/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends pg {
    int field_i;
    int field_o;
    int field_k;
    int field_n;
    int field_g;
    static vn field_l;
    int field_m;
    static String field_h;
    static int field_j;

    public static void a(int param0) {
        field_l = null;
        if (param0 != 49) {
            field_j = 83;
            field_h = null;
            return;
        }
        field_h = null;
    }

    cm(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param3;
        this.field_g = param0;
        this.field_o = param4;
        this.field_k = param5;
        this.field_m = param2;
        this.field_i = param1;
    }

    static {
        field_h = "Passwords can only contain letters and numbers";
        field_l = new vn();
        field_j = 49;
    }
}
