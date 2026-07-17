/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kmb {
    static String field_b;
    static String field_e;
    static boolean field_c;
    static int field_a;
    static int field_f;
    static String field_d;

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
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
            if (di.field_l == null) {
              break L0;
            } else {
              di.field_l.a(dpa.field_p, -3094, param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("kmb.A(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + 18700 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 32768) {
          field_f = 35;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Toggle debug mode";
        field_c = false;
        field_b = "Mosquito chassis";
        field_d = "Waiting for players...";
        field_f = 32768;
    }
}
