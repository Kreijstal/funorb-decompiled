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

    public static void a(byte param0) {
        int discarded$2 = 0;
        aa var2 = null;
        if (param0 != 90) {
          var2 = (aa) null;
          discarded$2 = lc.a((aa) null, false);
          field_t = null;
          field_l = (String[][]) null;
          field_q = null;
          return;
        } else {
          field_t = null;
          field_l = (String[][]) null;
          field_q = null;
          return;
        }
    }

    final static int a(aa param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                if ((param0.field_j ^ -1) == -5) {
                  var2_int = qp.field_P[param0.field_j];
                  break L1;
                } else {
                  if ((param0.field_k ^ -1L) == (hn.field_f ^ -1L)) {
                    var2_int = ib.field_i[param0.field_j];
                    break L1;
                  } else {
                    var2_int = qp.field_P[param0.field_j];
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                field_l = (String[][]) null;
                break L3;
              }
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("lc.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    lc() {
    }

    static {
    }
}
