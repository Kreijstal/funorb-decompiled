/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static int field_b;
    static String field_a;
    static String field_f;
    static int field_c;
    static nf[] field_d;
    static String field_e;

    final static bi a(int param0, int param1) {
        bi var2 = new bi(dc.field_F.field_z, dc.field_F.field_w);
        ra.a(-110);
        var2.e();
        dc.field_F.b(0, 0, param0 < 0 ? 2105376 : param0);
        cg.i(0);
        return var2;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    final static int a(CharSequence param0) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 1;
            stackOut_0_0 = fc.a(16, param0, (byte) 124);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("wm.B(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 16 + ',' + 11 + ')');
        }
        return stackIn_1_0;
    }

    final static void a() {
        int discarded$0 = -120;
        nj.b();
    }

    final static double a(int param0, byte param1, int param2) {
        if (param1 <= 90) {
          return 0.18024758453966921;
        } else {
          return (double)(param0 * param0) * (double)(param2 * 3 - param0 * 2) / (double)(param2 * (param2 * param2));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 256;
        field_f = "Single-player Skirmish";
        field_a = "Click to show the Fleet Info window.";
        field_e = "Press <col=2F5FBF>'ENTER'</col> to continue.";
    }
}
