/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends qb {
    int field_n;
    int field_k;
    static String field_l;
    static int field_h;
    static String field_o;
    fk field_m;
    int field_j;
    int field_g;
    int field_i;

    final static void a(int param0, boolean param1) {
        wh.field_a.a(16511, param1);
    }

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        if (param0 != -30530) {
            fk.a(116);
        }
    }

    fk(int param0, int param1, int param2, int param3, int param4) {
        ((fk) this).field_k = param4;
        ((fk) this).field_i = param1;
        ((fk) this).field_j = param3;
        ((fk) this).field_g = param0;
        ((fk) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Visit the Account Management section on the main site to view.";
    }
}
