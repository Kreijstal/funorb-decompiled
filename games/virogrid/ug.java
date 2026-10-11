/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static dl field_a;
    static int field_b;

    final static byte[] a(byte[] param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        fm var5 = null;
        byte[] var6 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; param1 > var5_int; var5_int++) {
              var8[var5_int] = param0[param2 + var5_int];
            }
          } else {
            var4 = param0;
          }
          var5 = new fm();
          var5.a(-44);
          var5.a((long)(param1 * 8), param3, var4);
          var6 = new byte[64];
          var5.a(0, var6, 8);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ug.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -4) {
          ug.a(81);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return la.field_n;
    }

    static {
    }
}
