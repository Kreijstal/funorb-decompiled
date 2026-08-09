/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static long field_b;
    static int field_a;
    static int[] field_c;

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
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
              if (param1 >= 81) {
                break L1;
              } else {
                n.c((byte) -124);
                break L1;
              }
            }
            var2_int = param0.length;
            var3 = new byte[var2_int];
            mk.a(param0, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("n.A(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        if (!d.field_k) {
          throw new IllegalStateException();
        } else {
          pa.field_b = true;
          qd.a(88, false);
          hi.field_k = 0;
          if (param0 != -110) {
            field_c = (int[]) null;
            return;
          } else {
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 > -28) {
            n.a((byte) 86);
        }
    }

    final static boolean b(byte param0) {
        int var1 = 111 / ((param0 - -18) / 48);
        return d.field_k;
    }

    static {
        field_a = 0;
    }
}
