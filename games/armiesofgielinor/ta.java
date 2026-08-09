/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends nl {
    static at field_O;
    private int field_H;
    private int field_S;
    private String field_K;
    static String field_Q;
    private int field_I;
    static boolean field_L;
    static int field_N;
    static String field_M;
    static je field_R;
    private boolean field_J;
    private ka field_P;

    final String h(int param0) {
        int var2;
        String var3;
        kb stackIn_3_0 = null;
        kb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kb stackIn_7_0 = null;
        kb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != 21384) {
          L0: {
            this.field_J = true;
            var2 = this.field_E.field_t ? 1 : 0;
            this.field_E.field_t = this.field_t;
            var3 = this.field_E.h(param0 + 0);
            stackIn_7_0 = this.field_E;

            if (var2 == 0) {
              stackIn_8_0 = (kb) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (kb) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_t = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            var2 = this.field_E.field_t ? 1 : 0;
            this.field_E.field_t = this.field_t;
            var3 = this.field_E.h(param0 + 0);
            stackIn_3_0 = this.field_E;

            if (var2 == 0) {
              stackIn_4_0 = (kb) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (kb) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_t = stackIn_4_1 != 0;
          return var3;
        }
    }

    public static void j(int param0) {
        if (param0 != -12819) {
            return;
        }
        field_O = null;
        field_M = null;
        field_Q = null;
        field_R = null;
    }

    final static void a(String param0, int param1, int param2, String param3, String param4, int param5) {
        mo var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new mo(param1, param3, param5, param0, param4);
            bc.a(param2 ^ -19023, var6);
            if (param2 == -18119) {
              break L0;
            } else {
              field_N = 8;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var6_ref);

            stackIn_5_1 = new StringBuilder().append("ta.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param5 + ')');
        }
    }

    ta(int param0, int param1, int param2, int param3, kb param4, boolean param5, int param6, int param7, ka param8, int param9, String param10) {
        super(param0, param1, param2, param3, (kh) null, (qo) null);
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
              this.field_E = param4;
              this.field_H = param7;
              this.field_I = param9;
              this.field_S = param6;
              this.field_K = param10;
              this.field_P = param8;
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
              ((ta) (this)).field_J = stackIn_4_1 != 0;
              var12_int = this.field_S + -this.field_H;
              var13 = this.field_P.a(param10, var12_int, this.field_P.field_H) - -(2 * this.field_H);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a(param0, param2, param1, 8192, var13);
                break L2;
              }
            }
            L3: {
              if (!this.field_J) {
                stackIn_10_0 = 2 * this.field_H + this.field_S;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_E.a(var14, param2 + (-this.field_S - this.field_H * 3), (var13 + -param3 >> -1371969823) + this.field_H, 8192, param3 - 2 * this.field_H);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ta.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_6_0 = 0;
        ka stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_8_5;
        int stackIn_8_6;
        int stackIn_8_7;
        ka stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        var5 = this.field_B - -param0;
        var6 = param1 + this.field_p;
        super.a(param0, param1, (byte) -90, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          L0: {
            if (!this.field_J) {
              stackIn_6_0 = 0;
              break L0;
            } else {
              stackIn_6_0 = -(2 * this.field_H) + (-this.field_S + this.field_l);
              break L0;
            }
          }
          L1: {
            var7 = stackIn_6_0;
            stackIn_8_0 = this.field_P;

            stackIn_8_1 = this.field_K;

            stackIn_8_2 = this.field_H + var7 + var5;

            stackIn_8_3 = this.field_H + var6;

            stackIn_8_4 = this.field_S + -this.field_H;

            stackIn_8_5 = -(this.field_H * 2) + this.field_w;

            stackIn_8_6 = this.field_I;

            stackIn_8_7 = -1;

            if (this.field_J) {
              stackIn_9_0 = (ka) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 0;
              break L1;
            } else {
              stackIn_9_0 = (ka) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 2;
              break L1;
            }
          }
          ((ka) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, this.field_P.field_H);
          if (param2 > -82) {
            field_Q = (String) null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_O = new at();
        field_Q = "To <%0>: ";
        field_L = false;
        field_M = "Unpacking music";
    }
}
