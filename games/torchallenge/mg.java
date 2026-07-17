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
                field_a = null;
            }
            var4 = var5.field_q;
            var5.d(1, (byte) 122);
            var5.d(param1.field_n, (byte) 122);
            var5.d(param1.field_m, (byte) 122);
            var5.a(param1.field_k, false);
            var5.a(param1.field_l, false);
            var5.a(param1.field_o, false);
            var5.a(param1.field_q, false);
            int discarded$0 = var5.b(var4, 14430);
            var5.a(var5.field_q + -var4, -127);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "mg.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static ef a(byte param0, String param1, int param2) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        ef stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 12) {
                break L1;
              } else {
                var4 = null;
                mg.a(34, (rd) null, -58);
                break L1;
              }
            }
            var3 = new ef(false);
            var3.field_g = param1;
            var3.field_n = param2;
            stackOut_2_0 = (ef) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("mg.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, int param2) {
        fe var3 = null;
        int var4 = 0;
        var3 = bf.field_c[param2][param1];
        if (!param0) {
          mg.a(true, -93, -2);
          var4 = bf.field_d[param1][param2];
          e discarded$4 = ol.a(-123, var3, var4);
          return;
        } else {
          var4 = bf.field_d[param1][param2];
          e discarded$5 = ol.a(-123, var3, var4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{0, 0};
        field_c = new ne();
    }
}
