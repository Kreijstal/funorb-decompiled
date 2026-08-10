/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static String field_b;
    static String field_c;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 8450) {
            field_a = (String) null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(sj.field_d);
            param1.removeFocusListener(sj.field_d);
            bg.field_rb = -1;
            if (param0 > -87) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ad a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        ad var9 = null;
        RuntimeException var9_ref = null;
        ad stackIn_2_0 = null;
        ad stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new ad(param0, param3, param6, param4, param5, param2, param1);
            if (param7 > 50) {
              od.field_b.a(var9, 27362);
              aa.a(var9, 3298, param8);
              stackIn_4_0 = (ad) (var9);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ad) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9_ref);

            stackIn_7_1 = new StringBuilder().append("pk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_b = "Achieved";
        field_c = "Player names can be up to 12 letters, numbers and underscores";
        field_a = null;
    }
}
