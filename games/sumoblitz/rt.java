/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt extends ie {
    private int field_A;
    private vn field_D;
    private int field_z;
    private int field_F;
    private boolean field_H;
    static mp field_C;
    static String[] field_G;
    private String field_B;
    static ri field_E;

    final String c(int param0) {
        int var2 = this.field_y.field_k ? 1 : 0;
        this.field_y.field_k = this.field_k;
        String var3 = this.field_y.c(param0);
        this.field_y.field_k = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_5_0 = 0;
        vn stackIn_7_0;
        String stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        int stackIn_7_6;
        int stackIn_7_7;
        vn stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_15_0 = 0;
        vn stackIn_17_0;
        String stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_17_5;
        int stackIn_17_6;
        int stackIn_17_7;
        vn stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        var5 = this.field_r + param0;
        if (param2 <= -35) {
          var6 = param1 + this.field_v;
          super.a(param0, param1, (byte) -40, param3);
          if (0 != param3) {
            return;
          } else {
            L0: {
              if (!this.field_H) {
                stackIn_15_0 = 0;
                break L0;
              } else {
                stackIn_15_0 = -this.field_A + this.field_q + -(2 * this.field_F);
                break L0;
              }
            }
            L1: {
              var7 = stackIn_15_0;
              stackIn_17_0 = this.field_D;

              stackIn_17_1 = this.field_B;

              stackIn_17_2 = var5 + (var7 - -this.field_F);

              stackIn_17_3 = var6 - -this.field_F;

              stackIn_17_4 = this.field_A + -this.field_F;

              stackIn_17_5 = -(this.field_F * 2) + this.field_p;

              stackIn_17_6 = this.field_z;

              stackIn_17_7 = -1;

              if (!this.field_H) {
                stackIn_18_0 = (vn) ((Object) stackIn_17_0);
                stackIn_18_1 = (String) ((Object) stackIn_17_1);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = stackIn_17_4;
                stackIn_18_5 = stackIn_17_5;
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 2;
                break L1;
              } else {
                stackIn_18_0 = (vn) ((Object) stackIn_17_0);
                stackIn_18_1 = (String) ((Object) stackIn_17_1);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = stackIn_17_4;
                stackIn_18_5 = stackIn_17_5;
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 0;
                break L1;
              }
            }
            ((vn) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, 1, this.field_D.field_s);
            return;
          }
        } else {
          this.field_D = (vn) null;
          var6 = param1 + this.field_v;
          super.a(param0, param1, (byte) -40, param3);
          if (0 != param3) {
            return;
          } else {
            L2: {
              if (!this.field_H) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = -this.field_A + this.field_q + -(2 * this.field_F);
                break L2;
              }
            }
            L3: {
              var7 = stackIn_5_0;
              stackIn_7_0 = this.field_D;

              stackIn_7_1 = this.field_B;

              stackIn_7_2 = var5 + (var7 - -this.field_F);

              stackIn_7_3 = var6 - -this.field_F;

              stackIn_7_4 = this.field_A + -this.field_F;

              stackIn_7_5 = -(this.field_F * 2) + this.field_p;

              stackIn_7_6 = this.field_z;

              stackIn_7_7 = -1;

              if (!this.field_H) {
                stackIn_8_0 = (vn) ((Object) stackIn_7_0);
                stackIn_8_1 = (String) ((Object) stackIn_7_1);
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = stackIn_7_5;
                stackIn_8_6 = stackIn_7_6;
                stackIn_8_7 = stackIn_7_7;
                stackIn_8_8 = 2;
                break L3;
              } else {
                stackIn_8_0 = (vn) ((Object) stackIn_7_0);
                stackIn_8_1 = (String) ((Object) stackIn_7_1);
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = stackIn_7_5;
                stackIn_8_6 = stackIn_7_6;
                stackIn_8_7 = stackIn_7_7;
                stackIn_8_8 = 0;
                break L3;
              }
            }
            ((vn) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5, stackIn_8_6, stackIn_8_7, stackIn_8_8, 1, this.field_D.field_s);
            return;
          }
        }
    }

    rt(int param0, int param1, int param2, int param3, pk param4, boolean param5, int param6, int param7, vn param8, int param9, String param10) {
        super(param0, param1, param2, param3, (mh) null, (qm) null);
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
              ((rt) (this)).field_H = stackIn_4_1 != 0;
              this.field_z = param9;
              this.field_F = param7;
              this.field_A = param6;
              this.field_y = param4;
              this.field_D = param8;
              this.field_B = param10;
              var12_int = this.field_A + -this.field_F;
              var13 = this.field_D.a(param10, var12_int, this.field_D.field_s) + 2 * this.field_F;
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(118, param0, param1, var13, param2);
                break L2;
              }
            }
            L3: {
              if (this.field_H) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 2 * this.field_F + this.field_A;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_y.a(117, var14, this.field_F + (-param3 + var13 >> -1132900863), -(this.field_F * 2) + param3, -(this.field_F * 3) + -this.field_A + param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("rt.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_E = null;
        field_C = null;
        int var1 = 48 % ((-8 - param0) / 55);
    }

    static {
        field_G = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_C = new mp();
    }
}
