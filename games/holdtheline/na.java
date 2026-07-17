/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hl {
    int field_m;
    static boolean field_k;
    boolean field_j;
    static ib field_s;
    static hj field_t;
    int field_n;
    static va field_q;
    static vn field_p;
    int field_i;
    int field_l;
    static String field_o;
    static int[] field_r;

    final static void a(int param0, ih param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          io.field_c.a((byte) -105, (hl) (Object) param1);
          mk.a(1, 4, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("na.B(").append(4).append(44);
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
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -79 + 41);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_t = null;
        field_o = null;
        field_q = null;
        field_s = null;
        field_p = null;
        if (param0 >= -70) {
            field_q = null;
        }
    }

    na(int param0, int param1, int param2, int param3, hj param4) {
        try {
            ((na) this).field_l = param0;
            ((na) this).field_j = false;
            ((na) this).field_i = param3;
            ((na) this).field_n = param1;
            ((na) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "na.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_o = "Creating your account";
        field_r = new int[128];
    }
}
