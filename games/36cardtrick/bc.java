/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;
    static String field_b;

    final static void a(int param0) {
        da.field_b = false;
        int discarded$0 = rd.field_j.f(96);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(boolean param0) {
        field_b = null;
    }

    final static void a(boolean param0, pb param1) {
        cg.field_h = param1.d((byte) 72) << 5;
        int var2_int = param1.f(-128);
        cg.field_h = cg.field_h + (var2_int >> 3);
        sa.field_a = (7 & var2_int) << 18;
        sa.field_a = sa.field_a + (param1.d((byte) 72) << 2);
        var2_int = param1.f(123);
        pc.field_c = 2064384 & var2_int << 15;
        sa.field_a = sa.field_a + (var2_int >> 6);
        pc.field_c = pc.field_c + (param1.f(-107) << 7);
        var2_int = param1.f(90);
        try {
            nl.field_b = 65536 & var2_int << 16;
            pc.field_c = pc.field_c + (var2_int >> 1);
            nl.field_b = nl.field_b + param1.d((byte) 72);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "bc.B(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_4_0 = (StringBuilder) param0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("bc.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + ' ' + ',' + 0 + ',' + 2053368837 + ')');
        }
        return stackIn_5_0;
    }

    static {
    }
}
