/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt {
    static iu[] field_c;
    static String field_b;
    static fpa field_d;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 <= 105) {
            wt.a((byte) -46);
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = sv.a((byte) -38, jm.a(param1, -127));
              if (param0 == 30433) {
                break L1;
              } else {
                field_a = -2;
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("wt.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(byte param0) {
        int var1;
        ej.field_a.e(true);
        if (null == ena.field_p) {
          ena.field_p = new vs(ej.field_a, sea.field_o);
          ej.field_a.c(ena.field_p, 87);
          var1 = 44 % ((param0 - -68) / 49);
          return;
        } else {
          ej.field_a.c(ena.field_p, 87);
          var1 = 44 % ((param0 - -68) / 49);
          return;
        }
    }

    static {
        field_b = "Waiting for extra data";
    }
}
