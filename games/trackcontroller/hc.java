/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    int field_B;
    byte field_C;
    int field_A;
    byte[] field_m;
    byte[] field_D;
    int field_f;
    int field_r;
    int[][] field_l;
    int[] field_x;
    byte[][] field_E;
    int field_d;
    int[] field_n;
    int field_z;
    boolean[] field_F;
    int field_b;
    int field_v;
    int[] field_o;
    byte[] field_k;
    byte[] field_t;
    int field_i;
    int field_p;
    int[][] field_u;
    byte[] field_h;
    int[][] field_c;
    int field_e;
    boolean[] field_y;
    int field_w;
    byte[] field_j;
    int field_a;
    int[] field_q;
    int field_g;
    int field_s;

    final static void a(int param0, int param1, int param2, qj[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        if (param3 != null) {
          if (param2 > 0) {
            var5 = param3[0].field_s;
            var6 = param3[2].field_s;
            var7 = param3[1].field_s;
            param3[0].e(param0, param1);
            param3[2].e(-var6 + (param2 + param0), param1);
            ll.a(kk.field_g);
            ll.b(param0 - -var5, param1, -var6 + (param0 + param2), param1 + param3[1].field_v);
            if (param4 != -22081) {
              return;
            } else {
              var8 = param0 + var5;
              var9 = param0 - -param2 + -var6;
              param0 = var8;
              L0: while (true) {
                if (param0 >= var9) {
                  ll.b(kk.field_g);
                  return;
                } else {
                  param3[1].e(param0, param1);
                  param0 = param0 + var7;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    hc() {
        ((hc) this).field_m = new byte[4096];
        ((hc) this).field_x = new int[257];
        ((hc) this).field_l = new int[6][258];
        ((hc) this).field_k = new byte[18002];
        ((hc) this).field_n = new int[256];
        ((hc) this).field_z = 0;
        ((hc) this).field_E = new byte[6][258];
        ((hc) this).field_F = new boolean[16];
        ((hc) this).field_o = new int[6];
        ((hc) this).field_h = new byte[256];
        ((hc) this).field_y = new boolean[256];
        ((hc) this).field_c = new int[6][258];
        ((hc) this).field_u = new int[6][258];
        ((hc) this).field_j = new byte[18002];
        ((hc) this).field_s = 0;
        ((hc) this).field_q = new int[16];
    }

    static {
    }
}
