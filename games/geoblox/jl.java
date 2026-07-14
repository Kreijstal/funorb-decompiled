/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static boolean field_t;
    int field_q;
    int field_i;
    byte[] field_e;
    byte field_h;
    byte[] field_r;
    int field_C;
    int field_B;
    int[][] field_E;
    int[][] field_f;
    byte[] field_p;
    int field_u;
    boolean[] field_b;
    byte[] field_j;
    int field_s;
    int field_k;
    int[][] field_l;
    byte[] field_x;
    int[] field_m;
    int[] field_y;
    byte[][] field_v;
    int field_d;
    int field_o;
    int field_D;
    int[] field_w;
    int field_a;
    int field_A;
    int field_g;
    int[] field_F;
    boolean[] field_n;
    int field_c;
    int field_G;
    byte[] field_z;

    final static boolean a(qc param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 0) {
          L0: {
            jl.a((byte) 47);
            var2 = param0.c((byte) 34);
            if (var2 == 1) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return var3 != 0;
        } else {
          L1: {
            var2 = param0.c((byte) 34);
            if (var2 == 1) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    final static void a(byte param0) {
        if (param0 >= -113) {
          L0: {
            field_t = true;
            if (oc.field_e != null) {
              oc.field_e.b(-122);
              oc.field_e = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (oc.field_e != null) {
              oc.field_e.b(-122);
              oc.field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    jl() {
        ((jl) this).field_C = 0;
        ((jl) this).field_B = 0;
        ((jl) this).field_E = new int[6][258];
        ((jl) this).field_r = new byte[18002];
        ((jl) this).field_b = new boolean[16];
        ((jl) this).field_x = new byte[256];
        ((jl) this).field_y = new int[16];
        ((jl) this).field_l = new int[6][258];
        ((jl) this).field_m = new int[256];
        ((jl) this).field_w = new int[6];
        ((jl) this).field_f = new int[6][258];
        ((jl) this).field_F = new int[257];
        ((jl) this).field_e = new byte[4096];
        ((jl) this).field_z = new byte[18002];
        ((jl) this).field_v = new byte[6][258];
        ((jl) this).field_n = new boolean[256];
    }

    static {
    }
}
