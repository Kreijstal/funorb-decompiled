/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static boolean field_d;
    static int field_e;
    static boolean field_b;
    static String field_a;
    static String field_c;

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param1--;
              if ((param1 ^ -1) > -1) {
                if (param4 == -1) {
                  break L0;
                } else {
                  field_a = (String) null;
                  return;
                }
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param3;
                var7 = param2;
                var9[var6] = var7 + (ik.a(var9[var6], 16711422) >> 780224673);
                param3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("wc.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -1) {
          field_d = false;
          mf.field_f.a(0, 0, param1 + 1);
          return;
        } else {
          mf.field_f.a(0, 0, param1 + 1);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 62) {
            field_e = 120;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_a = "Quit to website";
        field_c = "Password: ";
    }
}
