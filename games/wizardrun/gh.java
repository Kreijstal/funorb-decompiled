/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static vd field_b;
    static Boolean field_c;
    static String[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -681844375) {
          field_a = (String[]) null;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0) {
        kj.field_d = new oi();
        if (param0 <= 93) {
          byte[] var2 = (byte[]) null;
          gh.a((byte[]) null, 57, -42, 25);
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          var4_int = -1;
          if (param1 <= 84) {
            gh.a(47);
          }
          for (var5 = param2; var5 < param3; var5++) {
            var4_int = var4_int >>> 8 ^ wd.field_f[255 & (param0[var5] ^ var4_int)];
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gh.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
