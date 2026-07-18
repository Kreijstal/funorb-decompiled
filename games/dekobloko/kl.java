/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends bh {
    int field_C;
    mh[] field_t;
    int[] field_A;
    mh[] field_y;
    int field_o;
    static um field_B;
    int[] field_q;
    static af field_z;
    byte[][][] field_s;
    static ck field_v;
    static int[] field_n;
    static String field_x;
    int[] field_u;
    static ln field_p;
    static w field_r;
    static String field_w;

    public static void a(boolean param0) {
        field_B = null;
        field_r = null;
        field_x = null;
        field_p = null;
        field_z = null;
        field_n = null;
        field_w = null;
        field_v = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 11024) {
            kl.a(-96, 40, 17);
            u.field_e = param2;
            sa.field_p = param1;
            return;
        }
        u.field_e = param2;
        sa.field_p = param1;
    }

    kl() {
    }

    static {
        field_B = new um();
        field_x = "Unable to delete friend - system busy";
        field_n = new int[8192];
        field_z = new af();
        field_p = new ln();
        field_w = "Bugs";
    }
}
