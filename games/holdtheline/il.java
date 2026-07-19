/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_c;
    static String field_a;
    static String field_b;
    static float[] field_d;

    public static void a(int param0) {
        int var1 = -102 % ((param0 - -9) / 36);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static bm[] a(byte param0, gn param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bm[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bm[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = 115 / ((-67 - param0) / 52);
            if (qg.a(param2, param3, (byte) -27, param1)) {
              stackOut_3_0 = eg.b(false);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("il.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bm[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static jg a(int param0, int param1, int param2, int param3, byte param4) {
        jg var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var5 = (jg) ((Object) pc.field_e.b((byte) 120));
        L0: while (true) {
          if (var5 == null) {
            if (param4 != -66) {
              il.a(-18);
              var5 = new jg();
              var5.field_n = param0;
              var5.field_l = param3;
              var5.field_i = param2;
              pc.field_e.a((byte) -114, var5);
              gd.a(var5, (byte) 86, param1);
              return var5;
            } else {
              var5 = new jg();
              var5.field_n = param0;
              var5.field_l = param3;
              var5.field_i = param2;
              pc.field_e.a((byte) -114, var5);
              gd.a(var5, (byte) 86, param1);
              return var5;
            }
          } else {
            if (var5.field_i == param2) {
              return var5;
            } else {
              var5 = (jg) ((Object) pc.field_e.c((byte) -45));
              continue L0;
            }
          }
        }
    }

    static {
        field_c = 9;
        field_b = "Go!";
        field_d = new float[]{1.0f, 0.75f, 0.5f, 0.0f};
    }
}
