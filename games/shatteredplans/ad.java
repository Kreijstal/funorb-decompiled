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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -24925) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var2 = (nc) ((Object) param0.d(0));
            L2: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                L3: {
                  if (var2.field_o <= var2.field_j) {
                    var2.b((byte) -71);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2 = (nc) ((Object) param0.a((byte) -71));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("ad.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Send private message";
        field_g = "Accept <%0> into this game";
        field_a = "1 fleet remaining.";
        field_b = "All colonies have agreed to a diplomatic settlement.";
    }
}
