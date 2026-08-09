/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_b;
    static String field_a;

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              g.a(param1, "", -3603);
              di.a(param1, 63);
              if (param0 == -1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -25 / ((24 - param0) / 60);
        field_b = null;
    }

    final static void a(int param0, o param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = param0 + (param1.field_s + param6 + -param4);
        int var10 = param1.field_s - -param0 - -param6 + param2;
        int var11 = param1.field_n - -param5 - -(param1.field_t >> 59643873);
        mi.d(var9_int, 0, var10, param7 + var11);
        param1.a(param0 + -1, -1 + param5, param8);
        param1.a(-1 + param0, 1 + param5, param8);
        mi.a(lj.field_D);
        mi.d(1 + var9_int, 0, 1 + var10, param7 + var11);
        param1.a(param0 + 1, param5 - 1, param8);
        param1.a(param0 + 1, param5 - -1, param8);
        if (param3 != 118) {
            return;
        }
        try {
            mi.a(lj.field_D);
            var10 = param0 + (param1.field_s + (param1.field_p - param6)) + -param4;
            var9_int = -param2 + (-param6 + param0) + param1.field_s - -param1.field_p;
            mi.d(var9_int, var11 + -param7, var10, 480);
            param1.a(param0 + -1, -1 + param5, param8);
            param1.a(param0 + -1, param5 + 1, param8);
            mi.a(lj.field_D);
            mi.d(var9_int - -1, var11 - param7, var10 + 1, 480);
            param1.a(param0 + 1, param5 + -1, param8);
            param1.a(1 + param0, param5 - -1, param8);
            mi.a(lj.field_D);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_b = "Weapon for next level:";
        field_a = "Music: ";
    }
}
