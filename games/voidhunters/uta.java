/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uta extends rqa {
    static int[] field_q;
    static String field_p;
    static String field_o;

    public static void e(byte param0) {
        if (param0 != 112) {
            return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    uta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(69, 62, param0[0].a(116));
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("uta.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1) {
        pia var2;
        hca.field_o.b(param0, param1 ^ 3970);
        var2 = ada.field_b;
        if (param1 != 4095) {
          L0: {
            uta.a(true, 28);
            if (var2 != null) {
              var2.a(0, hca.field_o.field_u, hca.field_o.field_M);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (var2 != null) {
              var2.a(0, hca.field_o.field_u, hca.field_o.field_M);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_p = "Logging in...";
        field_o = "Hide private chat and appear offline to friends";
        field_q = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
