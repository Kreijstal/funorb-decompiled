/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;
    static String field_b;

    final static void a(int param0) {
        da.field_b = false;
        if (param0 != -464379825) {
            field_a = 5;
        }
        int discarded$0 = rd.field_j.f(96);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = -21;
        }
    }

    final static void a(boolean param0, pb param1) {
        cg.field_h = param1.d((byte) 72) << 2053368837;
        int var2_int = param1.f(-128);
        cg.field_h = cg.field_h + (var2_int >> 1421443875);
        sa.field_a = (7 & var2_int) << 1218813234;
        sa.field_a = sa.field_a + (param1.d((byte) 72) << 37676290);
        var2_int = param1.f(123);
        pc.field_c = 2064384 & var2_int << -464379825;
        sa.field_a = sa.field_a + (var2_int >> 1736280646);
        pc.field_c = pc.field_c + (param1.f(-107) << -1330418201);
        var2_int = param1.f(90);
        if (param0) {
            return;
        }
        try {
            nl.field_b = 65536 & var2_int << 700350160;
            pc.field_c = pc.field_c + (var2_int >> 1656520321);
            nl.field_b = nl.field_b + param1.d((byte) 72);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              param0.setLength(param2);
              if (param3 == 2053368837) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (var5 >= param2) {
                stackOut_6_0 = (StringBuilder) (param0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.setCharAt(var5, param1);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("bc.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
    }
}
