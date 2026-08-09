/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends fi {
    private String field_z;
    static int field_y;
    static String field_E;
    private kg field_D;
    private boolean field_B;
    static qj field_G;
    private int field_A;
    private int field_C;
    private int field_F;
    static String field_H;

    oc(int param0, int param1, int param2, int param3, qg param4, boolean param5, int param6, int param7, kg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ui) null, (ma) null);
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
              this.field_v = param4;
              this.field_C = param9;
              this.field_D = param8;
              this.field_A = param6;
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
              L3: {
                ((oc) (this)).field_B = stackIn_4_1 != 0;
                this.field_z = param10;
                this.field_F = param7;
                var12_int = this.field_A + -this.field_F;
                var13 = this.field_D.a(param10, var12_int, this.field_D.field_y) - -(this.field_F * 2);
                if (param3 < var13) {
                  break L3;
                } else {
                  var13 = param3;
                  if (!Transmogrify.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a(-124, param1, param0, param2, var13);
              break L2;
            }
            L4: {
              if (this.field_B) {
                stackIn_10_0 = 0;
                break L4;
              } else {
                stackIn_10_0 = 2 * this.field_F + this.field_A;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            this.field_v.a(-109, this.field_F - -(-param3 + var13 >> 261596673), var14, -this.field_A + (param2 + -(this.field_F * 3)), param3 - 2 * this.field_F);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("oc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final String f(int param0) {
        int var2 = this.field_v.field_g ? 1 : 0;
        this.field_v.field_g = this.field_g;
        String var3 = this.field_v.f(param0);
        this.field_v.field_g = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_4_0 = 0;
        kg stackIn_6_0;
        String stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        int stackIn_6_6;
        int stackIn_6_7;
        kg stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        var5 = param0 + this.field_p;
        var6 = this.field_n + param1;
        super.a(param0, param1, param2, (byte) -125);
        if (0 != param2) {
          return;
        } else {
          L0: {
            if (!this.field_B) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = this.field_l - this.field_A + -(2 * this.field_F);
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackIn_6_0 = this.field_D;

            stackIn_6_1 = this.field_z;

            stackIn_6_2 = var7 + var5 + this.field_F;

            stackIn_6_3 = this.field_F + var6;

            stackIn_6_4 = -this.field_F + this.field_A;

            stackIn_6_5 = -(this.field_F * 2) + this.field_h;

            stackIn_6_6 = this.field_C;

            stackIn_6_7 = -1;

            if (!this.field_B) {
              stackIn_7_0 = (kg) ((Object) stackIn_6_0);
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
              stackIn_7_0 = (kg) ((Object) stackIn_6_0);
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
          ((kg) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, this.field_D.field_y);
          var8 = -104 / ((param3 - 77) / 34);
          return;
        }
    }

    final static td j(int param0) {
        if (param0 != 0) {
            field_G = (qj) null;
            return (td) ((Object) new kf());
        }
        return (td) ((Object) new kf());
    }

    public static void i(int param0) {
        field_G = null;
        field_E = null;
        if (param0 <= 115) {
            oc.i(77);
            field_H = null;
            return;
        }
        field_H = null;
    }

    static {
        field_E = "Connection lost - attempting to reconnect";
        field_y = 0;
        field_G = new qj();
        field_H = "Waiting for sound effects";
    }
}
