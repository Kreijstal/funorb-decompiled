/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    byte[] field_j;
    byte[] field_t;
    int field_A;
    int[] field_i;
    byte[] field_J;
    int field_y;
    byte[] field_h;
    int field_g;
    byte[] field_D;
    int field_L;
    int field_x;
    int field_s;
    boolean[] field_e;
    byte field_C;
    int[][] field_G;
    int[] field_d;
    int[][] field_f;
    int field_n;
    byte[] field_z;
    int field_c;
    byte[][] field_o;
    static tl field_r;
    int[] field_u;
    int field_a;
    boolean[] field_v;
    int[] field_I;
    int field_H;
    int field_p;
    int field_w;
    int[][] field_k;
    int field_l;
    int field_E;
    static tl field_m;
    int field_q;
    static int field_b;
    static long field_F;
    static int field_B;

    public static void b(int param0) {
        field_m = null;
        field_r = null;
        if (param0 != 16) {
            field_r = null;
        }
    }

    final static String a(int param0) {
        if (param0 > -79) {
            String discarded$0 = da.a(-50);
            return tj.field_a;
        }
        return tj.field_a;
    }

    da() {
        ((da) this).field_j = new byte[4096];
        ((da) this).field_n = 0;
        ((da) this).field_e = new boolean[16];
        ((da) this).field_u = new int[257];
        ((da) this).field_G = new int[6][258];
        ((da) this).field_s = 0;
        ((da) this).field_v = new boolean[256];
        ((da) this).field_o = new byte[6][258];
        ((da) this).field_z = new byte[18002];
        ((da) this).field_D = new byte[18002];
        ((da) this).field_f = new int[6][258];
        ((da) this).field_J = new byte[256];
        ((da) this).field_k = new int[6][258];
        ((da) this).field_d = new int[6];
        ((da) this).field_I = new int[256];
        ((da) this).field_i = new int[16];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new tl();
        field_m = new tl();
    }
}
