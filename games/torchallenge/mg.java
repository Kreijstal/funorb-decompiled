/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static ne field_c;
    static int[] field_a;
    static int field_e;
    static int field_b;
    static int field_d;

    public static void a(byte param0) {
        if (param0 != 113) {
            mg.a(false, 103, -66);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, rd param1, int param2) {
        pa var5 = null;
        int var4 = 0;
        try {
            var5 = dk.field_s;
            var5.d(25, param2);
            var5.field_q = var5.field_q + 1;
            if (param0 >= -125) {
                field_a = (int[]) null;
            }
            var4 = var5.field_q;
            var5.d(1, (byte) 122);
            var5.d(param1.field_n, (byte) 122);
            var5.d(param1.field_m, (byte) 122);
            var5.a(param1.field_k, false);
            var5.a(param1.field_l, false);
            var5.a(param1.field_o, false);
            var5.a(param1.field_q, false);
            var5.b(var4, 14430);
            var5.a(var5.field_q + -var4, -127);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "mg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static ef a(byte param0, String param1, int param2) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        rd var4 = null;
        ef stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 12) {
                break L1;
              } else {
                var4 = (rd) null;
                mg.a(34, (rd) null, -58);
                break L1;
              }
            }
            var3 = new ef(false);
            var3.field_g = param1;
            var3.field_n = param2;
            stackIn_3_0 = (ef) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("mg.A(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, int param2) {
        fe var3;
        int var4;
        var3 = bf.field_c[param2][param1];
        if (!param0) {
          mg.a(true, -93, -2);
          var4 = bf.field_d[param1][param2];
          ol.a(-123, var3, var4);
          return;
        } else {
          var4 = bf.field_d[param1][param2];
          ol.a(-123, var3, var4);
          return;
        }
    }

    static {
        field_a = new int[]{0, 0};
        field_c = new ne();
    }
}
