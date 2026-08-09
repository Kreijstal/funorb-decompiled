/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_b;
    static k field_a;
    static int field_c;
    static cb field_d;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 20 / ((param0 - -5) / 58);
        field_b = null;
        field_a = null;
    }

    final static byte[] a(int param0, byte param1, byte[] param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 1) {
                break L1;
              } else {
                field_d = (cb) null;
                break L1;
              }
            }
            var4 = new byte[param0];
            var3 = var4;
            dk.a(param2, 0, var4, 0, param0);
            stackIn_3_0 = (byte[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("cc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_b = "Names cannot start or end with space or underscore";
        field_a = new k(2, 4, 4, 0);
    }
}
