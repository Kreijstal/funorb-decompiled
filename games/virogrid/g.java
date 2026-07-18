/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class g {
    static eh field_a;
    static tn field_b;
    static boolean field_c;
    static String field_d;

    final static void a(int param0) {
        if (param0 != 13984) {
            field_c = false;
            qc.field_h = true;
            sd.field_e = 0;
            return;
        }
        qc.field_h = true;
        sd.field_e = 0;
    }

    final static void a(byte param0, u param1) {
        try {
            param1.field_w = new int[]{-1};
            param1.field_r = new char[]{'?'};
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "g.B(" + 124 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        kf.a(4, -1);
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        hg var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        String stackOut_9_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param0;
            if (dm.a(var6, -1478)) {
              if (jc.a(param0, true)) {
                stackOut_6_0 = ql.field_k;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (oa.field_q == 2) {
                  if (!fm.a(param0, -1369854352)) {
                    if (mj.field_z < 100) {
                      if (!ch.a(param0, (byte) -73)) {
                        var5 = gk.field_g;
                        var5.g(param2, 8);
                        var5.field_l = var5.field_l + 1;
                        var4 = var5.field_l;
                        var5.a(2, 76);
                        var5.a(param0, (byte) -96);
                        var5.b(var5.field_l - var4, -1);
                        stackOut_20_0 = null;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        stackOut_18_0 = oi.a(new String[1], o.field_c, 2);
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    } else {
                      stackOut_15_0 = ig.field_a;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = oi.a(new String[1], lc.field_d, 2);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = sa.field_p;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_1_0 = sa.field_l;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("g.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L1;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + -128 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new tn(1);
        field_d = "This game option is not available in rated games.";
        field_c = false;
    }
}
