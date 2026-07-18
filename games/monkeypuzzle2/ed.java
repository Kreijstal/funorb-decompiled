/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static lk field_c;
    static String field_a;
    int field_e;
    static ib field_b;
    static long field_d;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              if (param1 <= param0) {
                break L2;
              } else {
                var3_int = param0;
                param0 = param1;
                param1 = var3_int;
                break L2;
              }
            }
            L3: while (true) {
              if (0 == param1) {
                stackOut_7_0 = param0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var3_int = param0 % param1;
                param0 = param1;
                param1 = var3_int;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "ed.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(ad param0, int param1) {
        sf var2 = null;
        try {
            sf.a(param0.a("", "headers.packvorbis", 30));
            if (param1 < 44) {
                int discarded$0 = ed.a(-96, -76, 44);
            }
            var2 = sf.a(param0, "jagex logo2.packvorbis", "");
            td discarded$1 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ed.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading graphics";
        field_b = new ib();
        field_d = 20000000L;
    }
}
