/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static jn field_c;
    static int[] field_d;
    static int[] field_f;
    static int[] field_e;
    static String field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 == -13181) {
                break L1;
              } else {
                boolean discarded$2 = jf.a(74, (byte) -66, -15);
                break L1;
              }
            }
            stackOut_2_0 = ra.a(10, param1, -46, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("jf.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 > -85) {
            return true;
        }
        return 0 != (2048 & param0) ? true : false;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 78) {
          jf.a((byte) 7);
          field_e = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jn();
        field_d = new int[128];
        field_e = new int[8192];
        field_b = "This is a hidden Achievement";
        field_a = "Waiting for instruments";
    }
}
