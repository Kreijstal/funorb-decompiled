/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    private String field_i;
    static byte[] field_m;
    static int field_e;
    private boolean field_f;
    static sk field_b;
    private boolean field_k;
    static String field_g;
    static String field_l;
    static String field_c;
    static int field_h;
    static int field_j;
    static int field_a;
    static String field_d;

    final static boolean a(byte param0, int param1, int param2, ue param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            var4_int = 52 / ((15 - param0) / 60);
            var5 = param3.a(param1, true, param2);
            if (var5 != null) {
              hi.a(var5, 0);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("qb.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        ((qb) this).field_k = true;
        ((qb) this).field_f = param0 ? true : false;
    }

    final String a(byte param0) {
        if (param0 != 2) {
            ((qb) this).field_i = null;
            return ((qb) this).field_i;
        }
        return ((qb) this).field_i;
    }

    final static void b(int param0) {
        tc.field_x = false;
        s.field_c = false;
        fd.a(-1, 0);
        ie.field_x = cl.field_k;
        uh.field_k = cl.field_k;
    }

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_m = null;
        field_c = null;
        field_l = null;
        field_d = null;
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return ((qb) this).field_k;
    }

    final boolean b(byte param0) {
        int var2 = 14 % ((param0 - -8) / 44);
        return ((qb) this).field_f;
    }

    final static fi a(boolean param0) {
        return (fi) (Object) new hf();
    }

    qb(String param0) {
        ((qb) this).field_f = false;
        ((qb) this).field_k = false;
        try {
            ((qb) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = new sk();
        field_c = "Not yet achieved";
        field_d = "This entry doesn't match";
        field_l = "Discard";
    }
}
