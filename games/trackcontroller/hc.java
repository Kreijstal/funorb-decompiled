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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param2 <= 0) {
                  break L1;
                } else {
                  var5_int = param3[0].field_s;
                  var6 = param3[2].field_s;
                  var7 = param3[1].field_s;
                  param3[0].e(param0, param1);
                  param3[2].e(-var6 + (param2 + param0), param1);
                  ll.a(kk.field_g);
                  ll.b(param0 - -var5_int, param1, -var6 + (param0 + param2), param1 + param3[1].field_v);
                  if (param4 == -22081) {
                    var8 = param0 + var5_int;
                    var9 = param0 - -param2 + -var6;
                    param0 = var8;
                    L2: while (true) {
                      if (param0 >= var9) {
                        ll.b(kk.field_g);
                        break L0;
                      } else {
                        param3[1].e(param0, param1);
                        param0 = param0 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("hc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
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
