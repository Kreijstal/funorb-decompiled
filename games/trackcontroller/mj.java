/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static aa field_e;
    static String field_a;
    static volatile boolean field_c;
    static int field_d;
    static String field_f;
    static int[] field_b;

    public static void b() {
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a() {
        qj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qj[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        qj[] stackOut_3_0 = null;
        qj[] stackOut_4_0 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var1 = ii.field_r[39];
            var2 = 40;
            var3 = 0;
            stackOut_3_0 = mb.field_d;
            stackIn_5_0 = stackOut_3_0;
            L1: while (true) {
              if (stackIn_5_0.length <= var3) {
                ia.field_b.a(-91);
                break L0;
              } else {
                mb.field_d[var3] = new qj(var2, var2);
                mb.field_d[var3].a();
                var1.a(208, 208, var2 << 3, var2 << 3, (int)(0.5 + 16384.0 * (double)var3 / 26.0), 4096);
                var3++;
                stackOut_4_0 = mb.field_d;
                stackIn_5_0 = stackOut_4_0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1_ref, "mj.A(" + 208 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_f = "All";
        field_c = false;
        field_e = new aa(1, 2, 2, 0);
    }
}
