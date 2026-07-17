/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ae {
    static String field_l;
    static byte[] field_k;
    static int field_j;
    static ja field_m;
    private int[] field_i;

    public static void c(int param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = 105 % ((22 - param0) / 60);
    }

    fg(int param0, int[] param1) {
        super(param0);
        try {
            ((fg) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "fg.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            field_j = -107;
        }
    }

    final static void a(int param0) {
        if (param0 != -29956) {
            fg.a(-45);
        }
    }

    final void a(int param0, qd param1) {
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
              param1.a(((fg) this).field_i, false);
              if (param0 == 0) {
                break L1;
              } else {
                fg.c(-54);
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
            stackOut_3_1 = new StringBuilder().append("fg.D(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            qf.field_g = param2;
            if (param0 != -16745) {
                field_k = null;
            }
            va.field_a = 2;
            var5 = (CharSequence) (Object) param2;
            ql.field_a = tg.a(var5, false);
            jj.field_M = param1;
            lp.a((byte) 69);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "fg.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Instructions";
    }
}
