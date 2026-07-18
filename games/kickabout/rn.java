/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rn {
    int field_g;
    int field_b;
    int field_a;
    int field_f;
    static int field_c;
    static String field_e;
    static String field_h;
    static int[] field_d;

    final static void a(dg param0, int param1, dg param2, int param3, int param4, int param5) {
        try {
            cr.field_e = param0;
            if (param5 > -80) {
                Object var7 = null;
                String discarded$0 = rn.a((String) null, 123, -38, (String) null);
            }
            pr.field_d = param3;
            eb.field_d = param4;
            aj.field_a = param1;
            qn.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "rn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static qt a(int param0, int param1) {
        Object var3 = null;
        if (param0 >= -43) {
          var3 = null;
          rn.a((dg) null, 59, (dg) null, 65, 60, 35);
          return un.field_b[param1];
        } else {
          return un.field_b[param1];
        }
    }

    final static String a(String param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        ml var5 = null;
        int var6 = 0;
        gg var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var8 = (CharSequence) (Object) param3;
            int discarded$11 = -9907;
            if (!ef.a(var8)) {
              stackOut_2_0 = kq.field_Ib;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 != ts.field_d) {
                stackOut_6_0 = sp.field_Db;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                int discarded$12 = 145;
                var7 = fm.a(param0);
                if (var7 != null) {
                  var7.c((byte) -109);
                  var7.f(66);
                  ou.field_y = ou.field_y - 1;
                  var5 = or.field_d;
                  var5.b(param2, (byte) 110);
                  var5.field_n = var5.field_n + 1;
                  var6 = var5.field_n;
                  var5.a(105, 3);
                  var5.a(14190, param3);
                  var5.c(62, var5.field_n + -var6);
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = vo.a((byte) -18, jf.field_A, new String[1]);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rn.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return (String) (Object) stackIn_12_0;
    }

    final static int b(int param0) {
        return t.field_f[param0 & 2047];
    }

    public static void a() {
        int var1 = -98;
        field_e = null;
        field_d = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Kick <%0> from this game";
        field_h = "You must play <%1> more rated games before playing with the current options.";
    }
}
