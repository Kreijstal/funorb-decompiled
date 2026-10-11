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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -81 / ((48 - param0) / 56);
          stackIn_1_0 = df.field_H.a("", (byte) 123, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("dn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_b = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
        field_c = (String[]) null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_c = new String[2];
        field_c[1] = "Lava";
        field_c[0] = "Normal";
    }
}
