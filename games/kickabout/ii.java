/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends gn {
    static String field_h;
    int field_j;
    static String field_m;
    int field_g;
    int field_f;
    int field_i;
    static int field_l;
    int field_e;
    int field_k;

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        eg var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            ad.field_c = new ut[je.field_g.length];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= je.field_g.length) {
                break L0;
              } else {
                ad.field_c[var1_int] = new ut(94, 84);
                var2 = df.a(var1_int, (int) wk.a(255, 63), true, (int) wk.a(65280, 63)).b(100, 728, 20, -56, -20);
                pe.a(var2, ad.field_c[var1_int], var1_int, 40);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ii.C(" + 65280 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_m = null;
    }

    final static void a(hn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ic.field_h.a(param0, cq.e(15137), 0);
              da.field_h.a((gn) (Object) param0, 3);
              if (param1 >= 47) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ii.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static void a(byte param0) {
        wh discarded$4 = sp.c(48, 36);
        if (param0 >= -116) {
            field_h = null;
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "MY KIT";
        field_m = "Connection restored.";
        field_l = 0;
    }
}
