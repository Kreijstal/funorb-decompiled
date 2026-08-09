/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static long field_g;
    static String field_d;
    static jk field_b;
    static String field_a;
    static int[] field_e;
    static sj field_f;
    static float field_c;

    final static int a(byte param0) {
        if (param0 != 26) {
            field_f = (sj) null;
            return wk.field_c;
        }
        return wk.field_c;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return ll.field_C == pi.field_a ? true : false;
    }

    public static void a(int param0) {
        int var1 = 0 / ((-10 - param0) / 50);
        field_d = null;
        field_f = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static de a(String param0, String param1, ah param2, ah param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        de stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -39) {
                break L1;
              } else {
                pm.a(118, -47);
                break L1;
              }
            }
            var5_int = param2.a(-1, param0);
            var6 = param2.a(var5_int, false, param1);
            stackIn_3_0 = hc.a(var5_int, (byte) 74, param2, var6, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("pm.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        int incrementValue$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            var2_int = 0;
            var3 = -(ra.field_f * ra.field_e);
            L1: while (true) {
              if (0 <= var3) {
                if (param0 == -16711936) {
                  break L0;
                } else {
                  pm.a(true);
                  return;
                }
              } else {
                var4 = ra.field_b[var2_int];
                var5 = 16711935 & var4;
                var4 = var4 & 65280;
                var5 = var5 * param1;
                var4 = var4 * param1;
                var5 = var5 & -16711936;
                var4 = var4 & 16711680;
                var4 = (var5 | var4) >> 1750885544;
                incrementValue$1 = var2_int;
                var2_int++;
                ra.field_b[incrementValue$1] = var4;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "pm.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Player";
        field_e = new int[8192];
        field_d = "<%0> has withdrawn the request to join.";
        field_b = new jk();
    }
}
