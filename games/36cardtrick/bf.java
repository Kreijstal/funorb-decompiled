/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static qa field_c;
    static int field_a;
    static String field_b;
    static String[] field_d;

    public static void a(byte param0) {
        int var1 = -106 % ((-34 - param0) / 60);
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, byte param1) {
        ej.a(true, (byte) 55, param0);
        if (param1 != -8) {
            byte[] var3 = (byte[]) null;
            bf.a(116, (byte[]) null);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            og.a(param1, 0, var3, param0, var2_int);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("bf.C(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = new qa("");
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
