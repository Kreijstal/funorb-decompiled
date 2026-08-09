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
        aa var2;
        if (param0 != 90) {
          var2 = (aa) null;
          lc.a((aa) null, false);
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
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_16_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("lc.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
