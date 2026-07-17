/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends aa {
    static ia field_cb;
    static int[] field_ab;
    static ei field_Y;
    static t field_db;
    static int field_bb;
    static int field_Z;

    final static kl a(int param0, byte param1, lf param2) {
        RuntimeException var3 = null;
        kl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -112) {
                break L1;
              } else {
                qc.n(52);
                break L1;
              }
            }
            stackOut_2_0 = new kl(param2, pi.field_c * param0 / 1000);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qc.OA(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    qc(ln param0, gm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void c(gm param0, int param1) {
        try {
            if (param1 != 33) {
                field_db = null;
            }
            super.c(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "qc.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void n(int param0) {
        field_ab = null;
        field_cb = null;
        field_db = null;
        field_Y = null;
        if (param0 != 1269) {
            field_bb = -19;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new ei();
    }
}
