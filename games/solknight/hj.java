/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    boolean[] field_u;
    int field_s;
    int[] field_j;
    int field_m;
    int field_E;
    int field_c;
    int[] field_h;
    int field_f;
    byte[] field_k;
    static String field_o;
    boolean[] field_J;
    int[][] field_y;
    int[][] field_b;
    static o field_n;
    byte[][] field_D;
    static o field_p;
    byte[] field_v;
    byte[] field_z;
    int field_C;
    int field_t;
    int field_w;
    byte[] field_A;
    static pd field_e;
    int field_g;
    int field_K;
    int field_H;
    int field_l;
    int[] field_I;
    byte[] field_d;
    int field_q;
    int[] field_r;
    int[][] field_B;
    int field_F;
    int field_G;
    static int field_x;
    byte field_a;
    byte[] field_i;

    final static byte[] a(byte param0, String param1) {
        if (param0 != -2) {
            return null;
        }
        return ch.field_a.a(4, "", param1);
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return gf.field_Z == gb.field_i ? true : false;
    }

    public static void b(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != -37) {
            return;
        }
        field_p = null;
        field_e = null;
    }

    final static af a(byte param0) {
        if (null != la.field_i) {
          if (param0 >= -58) {
            field_e = null;
            return la.field_i;
          } else {
            return la.field_i;
          }
        } else {
          la.field_i = new af(jh.field_g, 20, 0, 0, 0, 11579568, -1, 0, 0, jh.field_g.field_F, -1, 2147483647, true);
          if (param0 < -58) {
            return la.field_i;
          } else {
            field_e = null;
            return la.field_i;
          }
        }
    }

    hj() {
        ((hj) this).field_j = new int[256];
        ((hj) this).field_J = new boolean[256];
        ((hj) this).field_y = new int[6][258];
        ((hj) this).field_b = new int[6][258];
        ((hj) this).field_u = new boolean[16];
        ((hj) this).field_z = new byte[256];
        ((hj) this).field_k = new byte[4096];
        ((hj) this).field_A = new byte[18002];
        ((hj) this).field_I = new int[257];
        ((hj) this).field_h = new int[16];
        ((hj) this).field_r = new int[6];
        ((hj) this).field_w = 0;
        ((hj) this).field_D = new byte[6][258];
        ((hj) this).field_F = 0;
        ((hj) this).field_i = new byte[18002];
        ((hj) this).field_B = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Name is available";
    }
}
