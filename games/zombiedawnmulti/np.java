/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends ae {
    static qd field_m;
    private int field_k;
    private int field_q;
    private int field_p;
    static String field_l;
    private int field_o;
    private int field_n;
    private int field_i;
    private int field_j;

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
              param1.a(((np) this).field_k, ((np) this).field_i, -34, ((np) this).field_q, ((np) this).field_p, ((np) this).field_n, ((np) this).field_o, ((np) this).field_j);
              if (param0 == 0) {
                break L1;
              } else {
                ((np) this).a(-4, true, -103, 39);
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
            stackOut_3_1 = new StringBuilder().append("np.D(").append(param0).append(44);
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

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          if (((np) this).field_j == 1) {
            return;
          } else {
            pb.field_e.c(Integer.toString(((np) this).field_f - param3), ((np) this).field_i >> -param2 + 16, ((np) this).field_o >> -param0 + 16, 4, -1);
            pb.field_e.c(Integer.toString(-param3 + ((np) this).field_f), -param2 + ((np) this).field_n, -param0 + ((np) this).field_p, 0, -1);
            oo.d(((np) this).field_i >> -param2 + 16, ((np) this).field_o >> 16 - param0, -param2 + ((np) this).field_n, ((np) this).field_p + -param0, 16711680, 10);
            return;
          }
        } else {
          ((np) this).a(-45, true, 92, -81);
          if (((np) this).field_j == 1) {
            return;
          } else {
            pb.field_e.c(Integer.toString(((np) this).field_f - param3), ((np) this).field_i >> -param2 + 16, ((np) this).field_o >> -param0 + 16, 4, -1);
            pb.field_e.c(Integer.toString(-param3 + ((np) this).field_f), -param2 + ((np) this).field_n, -param0 + ((np) this).field_p, 0, -1);
            oo.d(((np) this).field_i >> -param2 + 16, ((np) this).field_o >> 16 - param0, -param2 + ((np) this).field_n, ((np) this).field_p + -param0, 16711680, 10);
            return;
          }
        }
    }

    np(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0);
        ((np) this).field_i = param6;
        ((np) this).field_o = param7;
        ((np) this).field_p = param4;
        ((np) this).field_q = param5;
        ((np) this).field_n = param3;
        ((np) this).field_k = param1;
        ((np) this).field_j = param2;
    }

    public static void c(boolean param0) {
        field_l = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Select a zombie!";
    }
}
