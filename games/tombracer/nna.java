/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nna {
    int field_c;
    byte[] field_y;
    int field_F;
    int field_f;
    byte[] field_v;
    int[][] field_t;
    byte[][] field_e;
    boolean[] field_C;
    int[][] field_b;
    int field_i;
    int[][] field_s;
    byte[] field_p;
    byte[] field_g;
    boolean[] field_r;
    int field_B;
    int[] field_w;
    byte[] field_l;
    int field_E;
    int field_d;
    byte field_k;
    int[] field_q;
    int field_D;
    int field_o;
    int field_u;
    int field_n;
    int field_A;
    byte[] field_m;
    int field_x;
    int field_h;
    int[] field_j;
    int field_z;
    int[] field_a;

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_19_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param1;
            if (fs.a(true, var6)) {
              if (ue.a(param1, 0)) {
                stackOut_5_0 = iia.field_q;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (ae.field_g == 2) {
                  if (qaa.a(2180, param1)) {
                    stackOut_12_0 = gl.a((byte) 125, bva.field_a, new String[1]);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (100 <= tba.field_k) {
                      stackOut_16_0 = bs.field_h;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (!dda.a(false, param1)) {
                        var5 = ql.field_k;
                        var5.k(param2, -2988);
                        var5.field_h = var5.field_h + 1;
                        var4 = var5.field_h;
                        var5.i(2, 0);
                        var5.a(param1, false);
                        var5.d(-var4 + var5.field_h, (byte) -104);
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        stackOut_19_0 = gl.a((byte) 94, bha.field_o, new String[1]);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = eia.field_o;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = pk.field_v;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("nna.A(").append(-3).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_22_0;
    }

    nna() {
        ((nna) this).field_C = new boolean[16];
        ((nna) this).field_e = new byte[6][258];
        ((nna) this).field_s = new int[6][258];
        ((nna) this).field_b = new int[6][258];
        ((nna) this).field_r = new boolean[256];
        ((nna) this).field_w = new int[16];
        ((nna) this).field_g = new byte[4096];
        ((nna) this).field_t = new int[6][258];
        ((nna) this).field_B = 0;
        ((nna) this).field_y = new byte[18002];
        ((nna) this).field_p = new byte[18002];
        ((nna) this).field_m = new byte[256];
        ((nna) this).field_A = 0;
        ((nna) this).field_j = new int[6];
        ((nna) this).field_q = new int[256];
        ((nna) this).field_a = new int[257];
    }

    static {
    }
}
