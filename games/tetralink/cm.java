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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (1 >= param2) {
                if (1 != param2) {
                  if (param1 >= 80) {
                    stackOut_12_0 = var3_int;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_10_0 = -51;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = param0 * var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  if (-1 == (1 & param2 ^ -1)) {
                    break L2;
                  } else {
                    var3_int = var3_int * param0;
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param2 = param2 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "cm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
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
        sj.field_g = new nd(sa.field_h, hl.field_gb, sn.field_c, bk.field_i, vd.field_c, ek.field_n);
    }

    cm() {
        this.field_c = new int[16];
        this.field_H = new int[256];
        this.field_r = new int[6][258];
        this.field_t = 0;
        this.field_y = new byte[4096];
        this.field_o = 0;
        this.field_m = new int[257];
        this.field_C = new boolean[16];
        this.field_D = new int[6];
        this.field_B = new boolean[256];
        this.field_p = new int[6][258];
        this.field_w = new byte[256];
        this.field_h = new byte[6][258];
        this.field_e = new int[6][258];
        this.field_g = new byte[18002];
        this.field_j = new byte[18002];
    }

    static {
        field_x = null;
        field_b = "Accept invitation to <%0>'s game";
    }
}
