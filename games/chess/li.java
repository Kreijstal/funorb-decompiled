/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;
    static double[] field_d;
    static double[] field_e;
    static String field_c;
    static String field_b;
    static um field_g;
    static java.awt.Font field_f;

    final static hg a(int param0, int param1) {
        int var3 = 0;
        hg[] var2;
        int var4;
        hg[] var5;
        var4 = Chess.field_G;
        var5 = ln.l(2);
        var2 = var5;
        for (var3 = param1; var5.length > var3; var3++) {
          if (var5[var3].field_e == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 > -30) {
          li.a(86);
        }
    }

    final static km a(int param0, byte param1, um param2, int param3) {
        RuntimeException var4 = null;
        km stackIn_5_0 = null;
        km stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tj.a(param3, param0, param2, (byte) 83)) {
            return null;
          }
          if (param1 == -2) {
            stackIn_7_0 = hl.a(param1 + 2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (km) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("li.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = new double[65536];
        field_e = new double[65536];
        for (var0 = 0; 65536 > var0; var0++) {
          field_d[var0] = Math.sin(3.141592653589793 * (double)var0 / 32768.0);
          field_e[var0] = Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
        field_c = "You cannot join this game - it is in progress";
        field_b = "Error connecting to server. Please try using a different server.";
    }
}
