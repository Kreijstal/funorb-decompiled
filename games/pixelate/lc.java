/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends fa {
    int field_p;
    boolean field_u;
    static boolean[] field_t;
    int field_s;
    int[][] field_r;
    int field_v;
    int field_m;
    static ak field_q;
    int field_n;
    int field_k;
    String[][] field_o;
    static String[][] field_l;

    public static void a() {
        field_t = null;
        field_l = null;
        field_q = null;
    }

    final static int a(aa param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = vp.field_Ib;
              if (2 == param0.field_j) {
                if (!param0.field_a) {
                  L2: {
                    if (0 != param0.field_d) {
                      break L2;
                    } else {
                      if (0 != param0.field_e) {
                        break L2;
                      } else {
                        var2_int = ib.field_i[param0.field_j];
                        break L1;
                      }
                    }
                  }
                  var2_int = qp.field_P[param0.field_j];
                  break L1;
                } else {
                  var2_int = vp.field_Ib;
                  break L1;
                }
              } else {
                if (param0.field_j == 4) {
                  var2_int = qp.field_P[param0.field_j];
                  break L1;
                } else {
                  if (~param0.field_k == ~hn.field_f) {
                    var2_int = ib.field_i[param0.field_j];
                    break L1;
                  } else {
                    var2_int = qp.field_P[param0.field_j];
                    break L1;
                  }
                }
              }
            }
            stackOut_13_0 = var2_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("lc.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + false + ')');
        }
        return stackIn_14_0;
    }

    lc() {
    }

    static {
    }
}
