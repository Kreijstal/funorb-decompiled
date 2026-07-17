/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends mc {
    int field_s;
    int field_q;
    int field_o;
    int[] field_t;
    int field_u;
    int field_p;
    int field_r;
    static String field_n;

    final static void a(int param0) {
        if (param0 != 18278) {
            dl.a(38);
        }
    }

    final static void a(int param0, ri param1) {
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
              mm.a(param1, (byte) -71, true);
              if (param0 == 27654) {
                break L1;
              } else {
                field_n = null;
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
            stackOut_3_1 = new StringBuilder().append("dl.D(").append(param0).append(44);
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
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void c(int param0) {
        field_n = null;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7) {
        try {
            ((dl) this).field_p = param2;
            if (!param5) {
                ((dl) this).field_t = null;
            }
            ((dl) this).field_t = param4;
            ((dl) this).field_s = param0;
            ((dl) this).field_o = param7;
            ((dl) this).field_q = param6;
            ((dl) this).field_r = param3;
            ((dl) this).field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "dl.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    dl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Enter multiplayer lobby";
    }
}
