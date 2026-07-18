/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rf {
    static String field_b;
    static String field_a;
    static String[] field_c;

    public static void a() {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static long b() {
        return -ue.field_s + bva.b((byte) -107);
    }

    final static String a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        String stackOut_20_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param1;
            if (!fs.a(true, var6)) {
              stackOut_2_0 = pk.field_v;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (ae.field_g != 2) {
                stackOut_6_0 = db.field_j;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!ue.a(param1, 0)) {
                  if (dda.a(true, param1)) {
                    stackOut_13_0 = gl.a((byte) 119, ce.field_w, new String[1]);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    L1: {
                      if (ii.field_a < 100) {
                        break L1;
                      } else {
                        if (wla.field_ub > 0) {
                          break L1;
                        } else {
                          stackOut_17_0 = bq.field_b;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                    if (ii.field_a < 200) {
                      if (qaa.a(2180, param1)) {
                        stackOut_24_0 = gl.a((byte) 119, vra.field_c, new String[1]);
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      } else {
                        var5 = ql.field_k;
                        var5.k(param2, -2988);
                        var5.field_h = var5.field_h + 1;
                        var4 = var5.field_h;
                        var5.i(0, 0);
                        var5.a(param1, false);
                        var5.d(var5.field_h + -var4, (byte) 40);
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      }
                    } else {
                      stackOut_20_0 = bq.field_b;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  }
                } else {
                  stackOut_9_0 = iia.field_q;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("rf.B(").append(true).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Reset penalty <%0>";
        field_b = "Find opponent";
        field_c = new String[]{"Title", "Game", "Win", "Lose"};
    }
}
