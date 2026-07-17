/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class foa implements bo {
    static String field_a;
    private int field_c;
    static boolean field_b;

    final void a(qh param0, int param1, v param2) {
        if (!param0.f(0)) {
            return;
        }
        try {
            if (param1 != -1) {
                field_b = true;
            }
            param0.field_r = ((foa) this).field_c;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "foa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    final static boolean a() {
        return jf.field_r;
    }

    final static boolean a(int param0, int param1) {
        return 0 != (2048 & param0);
    }

    public final void a(int param0, kh param1) {
        param1.i(8);
        param1.a((byte) -128, 1 + ((foa) this).field_c, 32);
        if (param0 != 200) {
            return;
        }
        try {
            param1.k(-1826190686);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "foa.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.h((byte) -62);
              ((foa) this).field_c = param0.b((byte) 44, 32) + -1;
              param0.i((byte) 98);
              if (param1 == -19) {
                break L1;
              } else {
                foa.a(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("foa.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    foa() {
        ((foa) this).field_c = -1;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9) {
        if (!io.a(param4, param3, (byte) -122, param7, param1, param2, param0, param6, param9)) {
          return 0;
        } else {
          return jqa.a(-(param7 / 2) + param2, 1, -(param0 / 2) + param3, param3 + (1 + param0) / 2, param2 + (param7 + 1) / 2, 16, param1 - param6 / 2, (param4 - -1) / 2 + param9, (1 + param6) / 2 + param1, param9 + -(param4 / 2));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create a free Account";
        field_b = true;
    }
}
