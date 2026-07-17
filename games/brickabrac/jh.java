/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String[] field_e;
    static int field_a;
    static int[] field_b;
    static jp field_d;
    static String field_c;

    final static jp a(int param0, jp param1) {
        jp var2 = null;
        RuntimeException var2_ref = null;
        jp stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_0_0 = null;
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
            var2 = new jp(param1.field_x / 2, param1.field_z / 2);
            var2.g();
            param1.a(0, 0, param1.field_x / 2, param1.field_z / 2);
            kc.field_q.a((byte) 102);
            stackOut_0_0 = (jp) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("jh.C(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void a() {
        int var1 = 54;
        field_d = null;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final static void a(boolean param0, mh param1) {
        mh var4 = null;
        mh var5 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        try {
            var4 = (mh) (Object) param1.field_bb.d(-104);
            mh var2 = var4;
            while (var4 != null) {
                var4.field_Db = 0;
                var4.field_cb = 0;
                var4.field_C = 0;
                var4.field_zb = 0;
                var5 = (mh) (Object) param1.field_bb.a((byte) 116);
                var5 = var5;
            }
            param1.field_zb = 0;
            param1.field_Db = 0;
            param1.field_cb = 0;
            param1.field_C = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "jh.A(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Good grief!";
        field_a = 250;
    }
}
