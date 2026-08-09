/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends am {
    private String field_Q;
    static int field_R;
    static int[] field_T;
    private boolean field_L;
    private int field_U;
    static e field_N;
    private int field_K;
    static int field_O;
    private ok field_P;
    static long[] field_S;
    private int field_J;
    static ej field_M;

    final String f(byte param0) {
        int var2 = this.field_H.field_w ? 1 : 0;
        this.field_H.field_w = this.field_w;
        if (param0 > -82) {
            la.i(13);
        }
        String var3 = this.field_H.f((byte) -84);
        this.field_H.field_w = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 < 36) {
            this.f((byte) 63);
        }
        int var5 = param3 + this.field_q;
        int var6 = param0 + this.field_m;
        super.a(param0, param1, (byte) 75, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        int var7 = !this.field_L ? 0 : -(this.field_U * 2) + this.field_F + -this.field_J;
        this.field_P.a(this.field_Q, var5 - (-var7 - this.field_U), var6 - -this.field_U, -this.field_U + this.field_J, -(this.field_U * 2) + this.field_z, this.field_K, -1, this.field_L ? 0 : 2, 1, this.field_P.field_C);
    }

    final static void j(int param0) {
        bj.a(true, kc.field_n, 14451, rd.field_Jb);
        pc.field_f = true;
        if (param0 < 23) {
            la.j(106);
        }
    }

    la(int param0, int param1, int param2, int param3, fj param4, boolean param5, int param6, int param7, ok param8, int param9, String param10) {
        super(param0, param1, param2, param3, (fe) null, (uk) null);
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
              this.field_K = param9;
              this.field_U = param7;
              this.field_Q = param10;
              this.field_P = param8;
              this.field_H = param4;
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
              ((la) (this)).field_L = stackIn_4_1 != 0;
              this.field_J = param6;
              var12_int = this.field_J + -this.field_U;
              var13 = this.field_P.b(param10, var12_int, this.field_P.field_C) - -(this.field_U * 2);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(-111, param2, param1, var13, param0);
                break L2;
              }
            }
            L3: {
              if (!this.field_L) {
                stackIn_10_0 = 2 * this.field_U + this.field_J;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_H.a(-114, -this.field_J + param2 - this.field_U * 3, (var13 - param3 >> -914293439) + this.field_U, param3 + -(this.field_U * 2), var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("la.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    public static void i(int param0) {
        field_T = null;
        field_N = null;
        field_M = null;
        field_S = null;
        int var1 = -101 % ((param0 - -31) / 34);
    }

    final static long h(int param0) {
        if (param0 <= 110) {
            la.j(13);
        }
        return -m.field_b + ri.a(-3);
    }

    static {
        field_S = new long[1000];
        field_N = new e(8, 0, 4, 1);
        field_M = new ej();
    }
}
