/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    int field_d;
    static boolean field_b;
    static boolean field_a;
    static String field_c;

    final static void a(d param0, int param1, int param2) {
        se var3 = null;
        try {
            if (param2 < 14) {
                fa.a(false);
            }
            var3 = uk.field_b;
            var3.i(param1, -74);
            var3.a(param0.field_f, -12);
            var3.a(param0.field_i, -99);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            qc.field_g = kf.field_d;
            if (param0 <= -103) {
              break L0;
            } else {
              field_a = true;
              break L0;
            }
          }
          if ((param1 ^ -1) != -256) {
            if (param1 < 100) {
              tl.field_g = oe.a(param1, param3, -3);
              return;
            } else {
              if (param1 <= 105) {
                tl.field_g = hi.a(2, param2);
                return;
              } else {
                tl.field_g = oe.a(param1, param3, -3);
                return;
              }
            }
          } else {
            L1: {
              if (ae.field_a >= 13) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            tl.field_g = fk.a(stackIn_7_0 != 0, (byte) -68);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("fa.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_c = "Loading extra data";
    }
}
