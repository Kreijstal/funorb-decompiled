/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends ig {
    static java.math.BigInteger field_s;
    private Object field_r;
    static o field_v;
    static o field_t;
    static String field_w;
    static int field_u;

    final boolean d(int param0) {
        if (param0 != -9861) {
            field_w = (String) null;
            return false;
        }
        return false;
    }

    final Object e(int param0) {
        if (param0 != 1) {
            return (Object) null;
        }
        return this.field_r;
    }

    public static void f(int param0) {
        field_v = null;
        field_s = null;
        field_t = null;
        int var1 = -9 / ((1 - param0) / 37);
        field_w = null;
    }

    ag(Object param0, int param1) {
        super(param1);
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 == 1) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[var2_int - (1 + var4)] = param0.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ag.I(");

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
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_s = new java.math.BigInteger("65537");
        field_w = "Hold down SPACE or <%0> key to charge your starpower.";
        field_t = new o(270, 70);
        field_u = -1;
    }
}
