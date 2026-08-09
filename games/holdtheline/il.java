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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 115 / ((-67 - param0) / 52);
            if (qg.a(param2, param3, (byte) -27, param1)) {
              stackIn_4_0 = eg.b(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("il.A(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bm[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static jg a(int param0, int param1, int param2, int param3, byte param4) {
        jg var5;
        int var6;
        jg var9;
        jg var10;
        var6 = HoldTheLine.field_D;
        var5 = (jg) ((Object) pc.field_e.b((byte) 120));
        L0: while (true) {
          if (var5 == null) {
            if (param4 != -66) {
              il.a(-18);
              var9 = new jg();
              var9.field_n = param0;
              var9.field_l = param3;
              var9.field_i = param2;
              pc.field_e.a((byte) -114, var9);
              gd.a(var9, (byte) 86, param1);
              return var9;
            } else {
              var10 = new jg();
              var10.field_n = param0;
              var10.field_l = param3;
              var10.field_i = param2;
              pc.field_e.a((byte) -114, var10);
              gd.a(var10, (byte) 86, param1);
              return var10;
            }
          } else {
            if (var5.field_i != param2) {
              var5 = (jg) ((Object) pc.field_e.c((byte) -45));
              continue L0;
            } else {
              return var5;
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
