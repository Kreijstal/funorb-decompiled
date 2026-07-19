/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ct extends tc {
    int field_l;
    int field_n;
    static String field_m;
    int field_r;
    static rg[] field_o;
    int field_q;
    ct field_k;
    int field_p;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 135) {
            field_o = (rg[]) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    ct(int param0, int param1, int param2, int param3, int param4) {
        this.field_q = param4;
        this.field_n = param0;
        this.field_l = param2;
        this.field_p = param3;
        this.field_r = param1;
    }

    static {
        field_m = "Unable to add name - system busy";
        field_o = new rg[135];
    }
}
