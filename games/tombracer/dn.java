/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static hla field_b;
    static jea field_a;
    static nh[] field_d;
    private static String[] field_c;

    final static byte[] a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -81 / ((48 - param0) / 56);
            stackIn_1_0 = df.field_H.a("", (byte) 123, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("dn.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = (String[]) null;
          field_b = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        field_c = new String[2];
        field_c[1] = "Lava";
        field_c[0] = "Normal";
    }
}
