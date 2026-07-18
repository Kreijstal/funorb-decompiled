/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static cc field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static er a(r param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        er stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        er stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (hq.a(124, param3, param1, param0)) {
              stackOut_4_0 = td.a(4205);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (er) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("mf.A(");
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + -94 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static boolean b(int param0) {
        int var6 = Vertigo2.field_L ? 1 : 0;
        long var1 = gk.a(123);
        long var3 = -id.field_a + var1;
        if (var3 > 30000L) {
            nj.field_d = 0;
            id.field_a = var1;
            return true;
        }
        int var5 = 3000;
        if (nj.field_d < 7) {
            if (nj.field_d < 5) {
                if (nj.field_d < 3) {
                    if (~(long)var5 > ~var3) {
                        id.field_a = var1;
                        nj.field_d = nj.field_d + 1;
                        return true;
                    }
                    return false;
                }
                var5 = 6000;
                if (~(long)var5 > ~var3) {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                }
                return false;
            }
            var5 = 9000;
            if (~(long)var5 > ~var3) {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
            }
            return false;
        }
        var5 = 12000;
        if (~(long)var5 > ~var3) {
            id.field_a = var1;
            nj.field_d = nj.field_d + 1;
            return true;
        }
        return false;
    }

    final static boolean a(byte param0, int param1) {
        return (param1 & mb.field_s) != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 2;
        field_a = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
