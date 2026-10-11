/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static eaa field_c;
    static java.awt.Font field_b;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -7778) {
          field_a = (String) null;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nu var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 57) {
            field_b = (java.awt.Font) null;
          }
          if (param2 == null) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof nu)) {
              throw new IllegalArgumentException();
            }
            var4 = (nu) (param2);
            stackIn_15_0 = var4.a(false);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param2);
          if (param0) {
            stackIn_11_0 = gs.a((byte) 120, var3);
            return stackIn_11_0;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("tb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_c = new eaa();
        field_a = "Names should contain a maximum of 12 characters";
    }
}
