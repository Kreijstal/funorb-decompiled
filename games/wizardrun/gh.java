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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param1 > 84) {
                break L1;
              } else {
                gh.a(47);
                break L1;
              }
            }
            var5 = param2;
            L2: while (true) {
              if (var5 >= param3) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> -179253400 ^ wd.field_f[255 & (param0[var5] ^ var4_int)];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("gh.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_a = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
