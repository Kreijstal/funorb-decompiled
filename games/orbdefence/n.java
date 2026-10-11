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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 81) {
            n.c((byte) -124);
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          mk.a(param0, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("n.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (!d.field_k) {
          throw new IllegalStateException();
        }
        pa.field_b = true;
        qd.a(88, false);
        hi.field_k = 0;
        if (param0 == -110) {
          return;
        }
        field_c = (int[]) null;
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 > -28) {
          n.a((byte) 86);
        }
    }

    final static boolean b(byte param0) {
        int var1 = 111 / ((param0 + 18) / 48);
        return d.field_k;
    }

    static {
        field_a = 0;
    }
}
