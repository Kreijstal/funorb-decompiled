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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.a(this.field_k, this.field_i, -34, this.field_q, this.field_p, this.field_n, this.field_o, this.field_j);
              if (param0 == 0) {
                break L1;
              } else {
                this.a(-4, true, -103, 39);
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

            stackIn_5_1 = new StringBuilder().append("np.D(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            this.a(-45, true, 92, -81);
            if (!((this.field_j ^ -1) != -2)) {
                return;
            }
            pb.field_e.c(Integer.toString(this.field_f - param3), this.field_i >> -param2 + 16, this.field_o >> -param0 + 16, 4, -1);
            pb.field_e.c(Integer.toString(-param3 + this.field_f), -param2 + this.field_n, -param0 + this.field_p, 0, -1);
            oo.d(this.field_i >> -param2 + 16, this.field_o >> 16 - param0, -param2 + this.field_n, this.field_p + -param0, 16711680, 10);
            return;
        }
        if (!((this.field_j ^ -1) != -2)) {
            return;
        }
        pb.field_e.c(Integer.toString(this.field_f - param3), this.field_i >> -param2 + 16, this.field_o >> -param0 + 16, 4, -1);
        pb.field_e.c(Integer.toString(-param3 + this.field_f), -param2 + this.field_n, -param0 + this.field_p, 0, -1);
        oo.d(this.field_i >> -param2 + 16, this.field_o >> 16 - param0, -param2 + this.field_n, this.field_p + -param0, 16711680, 10);
    }

    np(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0);
        this.field_i = param6;
        this.field_o = param7;
        this.field_p = param4;
        this.field_q = param5;
        this.field_n = param3;
        this.field_k = param1;
        this.field_j = param2;
    }

    public static void c(boolean param0) {
        if (!param0) {
            return;
        }
        field_l = null;
        field_m = null;
    }

    static {
        field_l = "Select a zombie!";
    }
}
