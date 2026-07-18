/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    int field_d;
    static int field_c;
    int field_g;
    static int field_b;
    static String field_h;
    int field_e;
    static int[] field_a;
    int field_f;

    final static hc a(int param0) {
        if (!(ue.field_e != null)) {
            ue.field_e = new hc();
            ue.field_e.a(1, si.field_V);
            ue.field_e.field_c = 0;
            ue.field_e.field_p = 2763306;
            ue.field_e.field_i = 7697781;
            ue.field_e.field_o = 5;
            ue.field_e.field_e = 4;
            ue.field_e.field_q = 14;
            ue.field_e.field_l = 6;
            ue.field_e.field_g = de.field_c;
        }
        int var1 = 0;
        return ue.field_e;
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
        field_a = new int[8192];
    }
}
