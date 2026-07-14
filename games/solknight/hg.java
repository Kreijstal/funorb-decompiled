/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends gg {
    int field_z;
    int field_s;
    int field_k;
    fc field_p;
    int field_v;
    int field_l;
    int field_t;
    int field_i;
    static int field_F;
    int field_r;
    int field_j;
    static qf field_E;
    int field_n;
    int field_q;
    sh field_u;
    int field_x;
    int field_h;
    int field_o;
    g field_D;
    int field_A;
    qi field_w;
    static int field_y;
    int field_m;
    static int[] field_B;
    int field_C;

    final void a(byte param0) {
        ((hg) this).field_D = null;
        if (param0 <= 90) {
            return;
        }
        ((hg) this).field_w = null;
        ((hg) this).field_u = null;
        ((hg) this).field_p = null;
    }

    final static void a(int param0, String param1, String param2) {
        hc.a(param2, false, param1, false);
        if (param0 != 8192) {
            Object var4 = null;
            hg.a(40, (String) null, (String) null);
        }
    }

    public static void a(int param0) {
        field_B = null;
        if (param0 != 8192) {
            hg.a(15);
            field_E = null;
            return;
        }
        field_E = null;
    }

    hg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 0;
        field_E = new qf();
        field_B = new int[8192];
    }
}
