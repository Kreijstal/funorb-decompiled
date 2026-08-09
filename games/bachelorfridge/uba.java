/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends td {
    static String field_p;
    static String field_q;

    uba(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_k = param2;
            this.field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uba.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_q = (String) null;
            field_q = null;
            field_p = null;
            return;
        }
        field_q = null;
        field_p = null;
    }

    final static void a(int param0, kv[] param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if (var2_int >= param1.length) {
                break L0;
              } else {
                lka.a((byte) 54, param1[var2_int]);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("uba.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ima var4 = null;
        ima stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                uba.b(45);
                break L1;
              }
            }
            L2: {
              var3 = this.field_h.a(94, param0);
              var4 = new ima(this.field_g, new nq(var3));
              var4.field_t = this.field_n;
              var4.field_q = this.field_k;
              if (param0.a(var3, this.field_n, this.field_k, (byte) 54)) {
                var4.field_o.a(new bj(new nq(var3), this.field_k, this.field_n), true);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (ima) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("uba.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_6_0);
    }

    static {
        field_p = "This is the portal to the arena! Here you fight to win cash for more food.";
        field_q = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
