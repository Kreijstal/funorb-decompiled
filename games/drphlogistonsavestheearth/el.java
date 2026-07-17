/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends jf {
    static he[] field_vb;
    static he field_ub;
    static id field_sb;
    static long field_rb;
    static int field_tb;

    final void a(int param0, vg param1) {
        try {
            if (param0 != 33) {
                field_tb = -12;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "el.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    el(k param0, vg param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        kc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4 = (kc) (Object) rd.field_C.h(-11151);
            if (!param0) {
              L1: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  rh.a(125, var4, param1);
                  var4 = (kc) (Object) rd.field_C.e(0);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "el.R(" + param0 + 44 + param1 + 41);
        }
    }

    final static hj a(String param0, int param1, byte param2) {
        ka var3 = null;
        RuntimeException var3_ref = null;
        ka stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new ka();
            ((hj) (Object) var3).field_b = param0;
            ((hj) (Object) var3).field_d = param1;
            stackOut_0_0 = (ka) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("el.P(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 58 + 41);
        }
        return (hj) (Object) stackIn_1_0;
    }

    public static void n(int param0) {
        field_sb = null;
        field_vb = null;
        field_ub = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_tb = 0;
    }
}
