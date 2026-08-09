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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              mm.a(param1, (byte) -71, true);
              if (param0 == 27654) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("dl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -25) {
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7) {
        try {
            this.field_p = param2;
            if (!param5) {
                this.field_t = (int[]) null;
            }
            this.field_t = param4;
            this.field_s = param0;
            this.field_o = param7;
            this.field_q = param6;
            this.field_r = param3;
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "dl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    dl() {
    }

    static {
        field_n = "Enter multiplayer lobby";
    }
}
