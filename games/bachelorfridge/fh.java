/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends bw {
    int field_h;
    je field_z;
    int field_t;
    int field_m;
    int field_q;
    static int field_v;
    static du field_i;
    int field_A;
    int field_x;
    int field_n;
    int field_l;
    int field_p;
    int field_u;
    static String field_s;
    be field_f;
    int field_w;
    int field_k;
    eka field_j;
    int field_y;
    int field_o;
    int field_C;
    int field_g;
    un field_B;
    int field_r;

    public static void c(byte param0) {
        field_s = null;
        field_i = null;
        if (param0 != 73) {
            field_v = 58;
        }
    }

    final void a(int param0) {
        ((fh) this).field_j = null;
        ((fh) this).field_B = null;
        ((fh) this).field_f = null;
        int var2 = 64 / ((-2 - param0) / 40);
        ((fh) this).field_z = null;
    }

    final static kv[] a(String param0, vr param1, String param2, int param3) {
        kv[] var5 = pi.a(param1, -8845, param2, param0);
        kv[] var4 = var5;
        var5[1].field_n = var5[1].field_q;
        var5[3].field_o = var5[3].field_p;
        var5[param3].field_n = var5[7].field_q;
        var5[5].field_o = var5[5].field_p;
        return var4;
    }

    fh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new du(0, 2, 2, 1);
        field_s = "Withdraw request to join <%0>'s game";
    }
}
