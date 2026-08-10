/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    static ja field_a;
    static int field_e;
    static int field_h;
    static th field_f;
    static ri[] field_c;
    static cj field_g;
    static int field_b;
    static char field_d;
    static String field_i;

    public static void a(int param0) {
        if (param0 != 31) {
            return;
        }
        field_g = null;
        field_i = null;
        field_f = null;
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = hl.field_e[0];
              var2 = 1;
              if (param0 == 8) {
                break L1;
              } else {
                field_e = -57;
                break L1;
              }
            }
            L2: while (true) {
              if (hl.field_e.length <= var2) {
                break L0;
              } else {
                var3 = hl.field_e[var2];
                d.a(ah.field_f, var2 << 1685179428, ah.field_f, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "pn.A(" + param0 + ')');
        }
    }

    final static boolean a(int param0, go param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -9) {
                break L1;
              } else {
                field_g = (cj) null;
                break L1;
              }
            }
            stackIn_3_0 = param1.a(-53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        nh.field_m = false;
        sh.field_L = s.field_e.g(31365) == 0 ? true : false;
        if (param0 > 51) {
            return;
        }
        pn.a(74);
    }

    static {
        field_h = 0;
        field_f = new th();
        field_i = "Connection lost - attempting to reconnect";
    }
}
