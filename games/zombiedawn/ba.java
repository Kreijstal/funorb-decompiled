/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    int field_I;
    byte[] field_G;
    int field_B;
    int field_c;
    int field_k;
    byte[] field_i;
    int field_n;
    int field_K;
    int field_m;
    byte[] field_f;
    int[][] field_H;
    int field_A;
    int[] field_u;
    byte field_l;
    int field_J;
    static String field_e;
    static int[] field_w;
    int[] field_v;
    int[] field_a;
    int field_L;
    int field_E;
    int[] field_z;
    static int field_b;
    boolean[] field_x;
    static int field_s;
    static Boolean field_g;
    int field_p;
    byte[][] field_q;
    static int field_j;
    byte[] field_o;
    byte[] field_h;
    int[][] field_t;
    int[][] field_C;
    boolean[] field_r;
    int field_d;
    byte[] field_F;
    int field_y;
    int field_D;

    final static void a(int param0, int param1, int param2) {
        if (param0 != 18002) {
            ba.a(38, 82, 80);
            im.field_d = param2;
            sc.field_b = param1;
            return;
        }
        im.field_d = param2;
        sc.field_b = param1;
    }

    public static void a(boolean param0) {
        field_w = null;
        field_g = null;
        field_e = null;
    }

    ba() {
        ((ba) this).field_m = 0;
        ((ba) this).field_H = new int[6][258];
        ((ba) this).field_i = new byte[4096];
        ((ba) this).field_f = new byte[18002];
        ((ba) this).field_a = new int[6];
        ((ba) this).field_z = new int[257];
        ((ba) this).field_k = 0;
        ((ba) this).field_u = new int[16];
        ((ba) this).field_v = new int[256];
        ((ba) this).field_x = new boolean[256];
        ((ba) this).field_o = new byte[18002];
        ((ba) this).field_C = new int[6][258];
        ((ba) this).field_r = new boolean[16];
        ((ba) this).field_t = new int[6][258];
        ((ba) this).field_F = new byte[256];
        ((ba) this).field_q = new byte[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_e = "Loading fonts";
    }
}
