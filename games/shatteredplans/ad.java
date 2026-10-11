/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad implements jk {
    static String field_d;
    static qr field_c;
    ff field_e;
    bd field_f;
    static String field_a;
    static String field_g;
    static String field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 != 18973) {
          ad.a('`', 73, -40);
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 > -33) {
          field_b = (String) null;
        }
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
          var6[var4] = param0;
        }
        return new String(var6);
    }

    final static void a(int param0, v param1, int param2, byte param3) {
        try {
          if (param3 <= 92) {
            v var5 = (v) null;
            ad.a(-96, (v) null, -95, (byte) -3);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ad.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(pf param0, int param1) {
        nc var2 = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -24925) {
            field_d = (String) null;
          }
          var2 = (nc) (param0.d(0));
          while (var2 != null) {
            if (var2.field_o <= var2.field_j) {
              var2.b((byte) -71);
            }
            var2 = (nc) (param0.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("ad.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Send private message";
        field_g = "Accept <%0> into this game";
        field_a = "1 fleet remaining.";
        field_b = "All colonies have agreed to a diplomatic settlement.";
    }
}
