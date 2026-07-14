/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    int[] field_H;
    int[] field_c;
    int field_z;
    int field_t;
    int field_v;
    int field_o;
    boolean[] field_C;
    int[][] field_r;
    byte[] field_y;
    int field_A;
    static int[] field_q;
    static boolean field_n;
    static oh field_F;
    byte[] field_J;
    int field_I;
    int[] field_m;
    int field_K;
    int field_u;
    byte[] field_i;
    boolean[] field_B;
    static v field_x;
    int field_a;
    int field_d;
    int field_G;
    int field_k;
    int[] field_D;
    int field_s;
    static String field_b;
    byte[] field_w;
    int[][] field_p;
    byte[][] field_h;
    int field_E;
    int field_f;
    byte[] field_g;
    int[][] field_e;
    byte[] field_j;
    byte field_l;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var3 = 1;
        L0: while (true) {
          if (1 >= param2) {
            if (1 != param2) {
              if (param1 < 80) {
                return -51;
              } else {
                return var3;
              }
            } else {
              return param0 * var3;
            }
          } else {
            L1: {
              if (-1 == (1 & param2 ^ -1)) {
                break L1;
              } else {
                var3 = var3 * param0;
                break L1;
              }
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
            continue L0;
          }
        }
    }

    public static void b(byte param0) {
        field_F = null;
        field_q = null;
        if (param0 <= 8) {
            return;
        }
        field_b = null;
        field_x = null;
    }

    final static void a(byte param0) {
        if (param0 > -111) {
            return;
        }
        sj.field_g = new nd(sa.field_h, hl.field_gb, sn.field_c, bk.field_i, (hl) (Object) vd.field_c, ek.field_n);
    }

    cm() {
        ((cm) this).field_c = new int[16];
        ((cm) this).field_H = new int[256];
        ((cm) this).field_r = new int[6][258];
        ((cm) this).field_t = 0;
        ((cm) this).field_y = new byte[4096];
        ((cm) this).field_o = 0;
        ((cm) this).field_m = new int[257];
        ((cm) this).field_C = new boolean[16];
        ((cm) this).field_D = new int[6];
        ((cm) this).field_B = new boolean[256];
        ((cm) this).field_p = new int[6][258];
        ((cm) this).field_w = new byte[256];
        ((cm) this).field_h = new byte[6][258];
        ((cm) this).field_e = new int[6][258];
        ((cm) this).field_g = new byte[18002];
        ((cm) this).field_j = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = null;
        field_b = "Accept invitation to <%0>'s game";
    }
}
