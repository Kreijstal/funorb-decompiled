/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ec {
    private e field_E;
    static int field_L;
    static int field_P;
    private int field_I;
    private int field_G;
    private int field_B;
    private String field_K;
    static String field_H;
    static String field_O;
    static String field_M;
    private boolean field_J;
    static String field_F;

    ej(int param0, int param1, int param2, int param3, fi param4, boolean param5, int param6, int param7, e param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ol) null, (cd) null);
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
              this.field_K = param10;
              this.field_I = param6;
              this.field_E = param8;
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
              ((ej) (this)).field_J = stackIn_4_1 != 0;
              this.field_x = param4;
              this.field_G = param9;
              this.field_B = param7;
              var12_int = this.field_I + -this.field_B;
              var13 = this.field_E.a(param10, var12_int, this.field_E.field_H) - -(this.field_B * 2);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a(var13, true, param1, param0, param2);
                break L2;
              }
            }
            L3: {
              if (this.field_J) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_B * 2 + this.field_I;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_x.a(param3 - 2 * this.field_B, true, this.field_B + (var13 + -param3 >> 1961596001), var14, param2 + (-this.field_I - 3 * this.field_B));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ej.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final String d(int param0) {
        int var2;
        String var3;
        fi stackIn_2_0 = null;
        fi stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var2 = this.field_x.field_p ? 1 : 0;
          this.field_x.field_p = this.field_p;
          var3 = this.field_x.d(41);
          stackIn_2_0 = this.field_x;

          if (var2 == 0) {
            stackIn_3_0 = (fi) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (fi) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_p = stackIn_3_1 != 0;
        if (param0 < 35) {
          return (String) null;
        } else {
          return var3;
        }
    }

    public static void f(int param0) {
        field_F = null;
        field_O = null;
        if (param0 != 2) {
          ej.a(true, 112);
          field_H = null;
          field_M = null;
          return;
        } else {
          field_H = null;
          field_M = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        df.c();
        if (param1 != 25680) {
            ej.a(true, 87);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_4_0 = 0;
        e stackIn_6_0;
        String stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        int stackIn_6_6;
        int stackIn_6_7;
        e stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        var5 = param1 + this.field_l;
        var6 = this.field_u - -param2;
        super.a(param0, param1, param2, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          L0: {
            if (!this.field_J) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = -(this.field_B * 2) + -this.field_I + this.field_g;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackIn_6_0 = this.field_E;

            stackIn_6_1 = this.field_K;

            stackIn_6_2 = this.field_B + var7 + var5;

            stackIn_6_3 = var6 - -this.field_B;

            stackIn_6_4 = -this.field_B + this.field_I;

            stackIn_6_5 = -(this.field_B * 2) + this.field_m;

            stackIn_6_6 = this.field_G;

            stackIn_6_7 = -1;

            if (!this.field_J) {
              stackIn_7_0 = (e) ((Object) stackIn_6_0);
              stackIn_7_1 = (String) ((Object) stackIn_6_1);
              stackIn_7_2 = stackIn_6_2;
              stackIn_7_3 = stackIn_6_3;
              stackIn_7_4 = stackIn_6_4;
              stackIn_7_5 = stackIn_6_5;
              stackIn_7_6 = stackIn_6_6;
              stackIn_7_7 = stackIn_6_7;
              stackIn_7_8 = 2;
              break L1;
            } else {
              stackIn_7_0 = (e) ((Object) stackIn_6_0);
              stackIn_7_1 = (String) ((Object) stackIn_6_1);
              stackIn_7_2 = stackIn_6_2;
              stackIn_7_3 = stackIn_6_3;
              stackIn_7_4 = stackIn_6_4;
              stackIn_7_5 = stackIn_6_5;
              stackIn_7_6 = stackIn_6_6;
              stackIn_7_7 = stackIn_6_7;
              stackIn_7_8 = 0;
              break L1;
            }
          }
          ((e) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, this.field_E.field_H);
          return;
        }
    }

    static {
        field_H = "Asking for or providing contact information";
        field_O = "Time: <%0>";
        field_F = "Yes";
    }
}
