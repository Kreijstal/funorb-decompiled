/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    int field_B;
    byte[][] field_l;
    boolean[] field_r;
    byte[] field_g;
    int field_D;
    int field_E;
    byte[] field_I;
    int[] field_A;
    int field_y;
    byte[] field_K;
    int field_F;
    int[][] field_o;
    int field_H;
    int field_f;
    int field_i;
    byte[] field_m;
    int field_j;
    byte field_w;
    int[] field_z;
    byte[] field_v;
    int[] field_x;
    int field_p;
    int field_c;
    int field_n;
    int field_s;
    byte[] field_t;
    int[] field_h;
    int[][] field_C;
    static rb field_k;
    boolean[] field_J;
    int field_e;
    static char[] field_q;
    int[][] field_a;
    int field_u;
    static ng field_b;
    static int[] field_G;
    static String field_d;

    final static m[] b(byte param0) {
        int var1 = -103 / ((10 - param0) / 62);
        return new m[]{bb.field_J, mh.field_B, el.field_b};
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 != 28) {
            return;
        }
        field_b = null;
        field_d = null;
        field_G = null;
        field_q = null;
    }

    ok() {
        ((ok) this).field_g = new byte[18002];
        ((ok) this).field_B = 0;
        ((ok) this).field_A = new int[256];
        ((ok) this).field_r = new boolean[256];
        ((ok) this).field_z = new int[16];
        ((ok) this).field_H = 0;
        ((ok) this).field_v = new byte[18002];
        ((ok) this).field_m = new byte[256];
        ((ok) this).field_x = new int[257];
        ((ok) this).field_t = new byte[4096];
        ((ok) this).field_o = new int[6][258];
        ((ok) this).field_J = new boolean[16];
        ((ok) this).field_C = new int[6][258];
        ((ok) this).field_h = new int[6];
        ((ok) this).field_a = new int[6][258];
        ((ok) this).field_l = new byte[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new rb();
        field_q = new char[128];
        field_b = new ng();
        field_d = "Please enter your age in years";
    }
}
