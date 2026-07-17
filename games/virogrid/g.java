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
        if (param0 < 60) {
            return;
        }
        try {
            param1.field_w = new int[]{-1};
            param1.field_r = new char[]{'?'};
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "g.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 > -18) {
            Object var2 = null;
            g.a((byte) 15, (u) null);
        }
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
        Object stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        Object stackOut_22_0 = null;
        String stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param0;
            if (dm.a(var6, -1478)) {
              if (param1 <= -127) {
                if (jc.a(param0, true)) {
                  stackOut_8_0 = ql.field_k;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
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
                          stackOut_22_0 = null;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          stackOut_20_0 = oi.a(new String[1], o.field_c, 2);
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = ig.field_a;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = oi.a(new String[1], lc.field_d, 2);
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = sa.field_p;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
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
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("g.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L1;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_23_0;
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
