/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_b;
    static String field_c;
    static String field_a;

    final static wb a(int param0, int param1, int param2, byte param3, int param4, int[] param5, int param6, int param7) {
        wb var9 = null;
        RuntimeException var9_ref = null;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_0_0 = null;
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
            var9 = new wb(param6, param1, param4, param7, param2, param0, param5);
            hj.field_k.a((byte) 91, (pi) (Object) var9);
            ab.a(-20680, 3, var9);
            stackOut_0_0 = (wb) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("tj.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(-66).append(44).append(param4).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param5 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param6 + 44 + param7 + 44 + 3 + 41);
        }
        return stackIn_1_0;
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "New obstacles to overcome: freezing water";
        field_c = "Superior aqualung: Extends time that can be spent underwater further.";
        field_a = "Ice bomb: Turns water into loose ice blocks and freezes ice blocks back onto the Super Volcano.";
    }
}
