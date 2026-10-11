/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static java.math.BigInteger field_a;
    static boolean field_b;
    static int[] field_c;

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8192) {
            stackIn_4_0 = ne.a(param0, 0, false);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ff.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract int a(boolean param0, int param1);

    public static void a(int param0) {
        field_c = null;
        if (param0 != 8192) {
          ff.a(-20);
          field_a = null;
          return;
        }
        field_a = null;
    }

    abstract byte[] a(byte param0, int param1);

    abstract kn a(byte param0);

    static {
        field_a = new java.math.BigInteger("65537");
        field_c = new int[8192];
    }
}
