/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ps {
    static phb[] field_a;

    final static byte[] a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_2_0 = new byte[]{};
            return stackIn_2_0;
          }
          var3 = -4 & var2_int + 3;
          var4 = 3 * (var3 / 4);
          if (var2_int > var3 - 2 &&
            mwa.a(param0.charAt(-2 + var3), -82) != -1) {
            if (var3 - 1 >= var2_int ||
              mwa.a(param0.charAt(var3 - 1), -46) == -1) {
              var4--;
            }
          } else {
            var4 -= 2;
          }
          var7 = new byte[var4];
          var6 = var7;
          var5 = var6;
          if (param1 != 1) {
            stackIn_13_0 = (byte[]) null;
            return stackIn_13_0;
          }
          ij.a(var7, param1 - 10389, 0, param0);
          stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ps.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
          field_a = (phb[]) null;
        }
    }

    abstract byte[] b(int param0);

    static {
    }
}
