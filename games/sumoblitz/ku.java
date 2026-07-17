/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku {
    int field_r;
    int[] field_F;
    int field_o;
    int[][] field_y;
    int field_k;
    int field_i;
    byte field_d;
    byte[] field_p;
    int field_H;
    static vf field_I;
    byte[] field_b;
    int[] field_t;
    int field_e;
    int field_G;
    int field_a;
    boolean[] field_E;
    boolean[] field_n;
    byte[] field_l;
    int field_B;
    int field_x;
    int[] field_q;
    byte[][] field_m;
    int field_s;
    static wc[] field_J;
    int field_g;
    byte[] field_h;
    int field_C;
    int field_w;
    byte[] field_z;
    byte[] field_u;
    int[] field_A;
    int[][] field_f;
    static int field_j;
    int[][] field_v;
    int field_c;

    public static void a(boolean param0) {
        field_I = null;
        field_J = null;
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 25) {
                stackOut_4_0 = var1_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var1_int = var1_int + go.field_j[var2];
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "ku.B(" + -94 + 41);
        }
        return stackIn_5_0;
    }

    ku() {
        ((ku) this).field_r = 0;
        ((ku) this).field_y = new int[6][258];
        ((ku) this).field_t = new int[16];
        ((ku) this).field_F = new int[6];
        ((ku) this).field_l = new byte[18002];
        ((ku) this).field_b = new byte[18002];
        ((ku) this).field_E = new boolean[256];
        ((ku) this).field_m = new byte[6][258];
        ((ku) this).field_q = new int[257];
        ((ku) this).field_u = new byte[256];
        ((ku) this).field_z = new byte[4096];
        ((ku) this).field_w = 0;
        ((ku) this).field_f = new int[6][258];
        ((ku) this).field_v = new int[6][258];
        ((ku) this).field_n = new boolean[16];
        ((ku) this).field_A = new int[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new vf();
    }
}
