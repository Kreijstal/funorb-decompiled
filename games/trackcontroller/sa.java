/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends ok {
    static String[] field_I;
    static String field_K;
    static int[] field_R;
    static j field_Q;
    static int field_T;
    static String field_J;
    static String field_P;
    private int field_E;
    private int field_N;
    private oh field_H;
    private String field_O;
    private int field_S;
    private boolean field_L;
    static volatile int field_M;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_p + param1;
        int var6 = param2 + this.field_m;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = this.field_L ? -(2 * this.field_S) + -this.field_E + this.field_x : 0;
        this.field_H.a(this.field_O, this.field_S + var7 + var5, this.field_S + var6, this.field_E + -this.field_S, -(this.field_S * 2) + this.field_u, this.field_N, -1, !this.field_L ? 2 : 0, 1, this.field_H.field_G);
    }

    final String e(int param0) {
        int var2 = this.field_B.field_q ? 1 : 0;
        this.field_B.field_q = this.field_q;
        String var3 = this.field_B.e(param0);
        this.field_B.field_q = var2 != 0 ? true : false;
        return var3;
    }

    final static void j(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = rf.field_a[0];
              if (param0 >= 3) {
                break L1;
              } else {
                sa.b(false);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (var2 >= rf.field_a.length) {
                break L0;
              } else {
                var3 = rf.field_a[var2];
                pd.a(gk.field_b, var2 << 247379844, gk.field_b, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "sa.B(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
            sa.b(true);
            field_R = null;
            field_J = null;
            field_P = null;
            field_Q = null;
            field_K = null;
            return;
        }
        field_R = null;
        field_J = null;
        field_P = null;
        field_Q = null;
        field_K = null;
    }

    sa(int param0, int param1, int param2, int param3, al param4, boolean param5, int param6, int param7, oh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (t) null, (tg) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_O = param10;
              this.field_B = param4;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((sa) (this)).field_L = stackIn_4_1 != 0;
              this.field_N = param9;
              this.field_S = param7;
              this.field_E = param6;
              this.field_H = param8;
              var12_int = -this.field_S + this.field_E;
              var13 = this.field_H.a(param10, var12_int, this.field_H.field_G) + 2 * this.field_S;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a(var13, -3050, param1, param2, param0);
                break L2;
              }
            }
            L3: {
              if (this.field_L) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_E + 2 * this.field_S;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_B.a(param3 + -(2 * this.field_S), -3050, (-param3 + var13 >> 483046369) + this.field_S, -this.field_E + (param2 - 3 * this.field_S), var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("sa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_K = "Waiting for graphics";
        field_J = "Creating your account";
        field_M = 0;
    }
}
