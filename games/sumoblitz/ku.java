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
        if (!param0) {
            field_j = 2;
            field_J = null;
            return;
        }
        field_J = null;
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 == -94) {
                break L1;
              } else {
                field_J = (wc[]) null;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var2 ^ -1) <= -26) {
                    break L4;
                  } else {
                    stackOut_5_0 = var1_int + go.field_j[var2];
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      var1_int = stackIn_6_0;
                      var2++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = var1_int;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ku.B(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    ku() {
        this.field_r = 0;
        this.field_y = new int[6][258];
        this.field_t = new int[16];
        this.field_F = new int[6];
        this.field_l = new byte[18002];
        this.field_b = new byte[18002];
        this.field_E = new boolean[256];
        this.field_m = new byte[6][258];
        this.field_q = new int[257];
        this.field_u = new byte[256];
        this.field_z = new byte[4096];
        this.field_w = 0;
        this.field_f = new int[6][258];
        this.field_v = new int[6][258];
        this.field_n = new boolean[16];
        this.field_A = new int[256];
    }

    static {
        field_I = new vf();
    }
}
