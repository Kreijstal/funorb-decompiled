/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static nh field_b;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 82) {
          byte[] var2 = (byte[]) null;
          lh.a((byte[]) null, 101);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6711) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          lua.a(param0, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lh.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
