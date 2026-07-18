/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_c;
    static int field_b;
    static String field_a;
    static boolean field_e;
    static int field_d;

    public static void a() {
        field_a = null;
        field_c = null;
    }

    final static void b() {
        if (!(rq.field_D == null)) {
            pi.field_b.b((lq) (Object) rq.field_D);
        }
        qd.field_c = null;
        vg.field_Bb = null;
        rq.field_D = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = hw.field_i * iw.field_g.field_o >> 8;
        var4 = iw.field_g.field_o * hw.field_i >> 8;
        var5 = hw.field_i * sa.field_e >> 8;
        var6 = lr.field_m * hw.field_i >> 8;
        if (rg.field_f) {
          iw.field_g.e(param1 - var5 + -(var3 >> 1), -var6 + (param2 + -(var4 >> 1)), var3, var4, 256);
          return;
        } else {
          eo.a(iw.field_g, -(var3 >> 1) + (-var5 + param1), -var6 + param2 + -(var4 >> 1), var3, var4);
          return;
        }
    }

    final static void a(ks param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          os.field_I = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ee.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Send private Quick Chat to <%0>";
        field_d = 2;
    }
}
