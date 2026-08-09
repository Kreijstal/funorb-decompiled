/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends qg {
    static String field_F;
    private boolean field_H;
    static String field_G;
    static String field_I;
    private int field_A;
    private ee field_E;
    private int field_C;
    private int field_B;
    private String field_D;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_o - -param0;
        int var6 = this.field_i + param1;
        super.a(param0, param1, -1, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = this.field_H ? -(2 * this.field_A) + -this.field_C + this.field_h : 0;
        this.field_E.a(this.field_D, var7 + var5 + this.field_A, var6 + this.field_A, -this.field_A + this.field_C, -(2 * this.field_A) + this.field_q, this.field_B, param2, !this.field_H ? 2 : 0, 1, this.field_E.field_s);
    }

    final String b(byte param0) {
        int var2 = this.field_y.field_j ? 1 : 0;
        this.field_y.field_j = this.field_j;
        String var3 = this.field_y.b(param0);
        this.field_y.field_j = var2 != 0 ? true : false;
        return var3;
    }

    public static void d(byte param0) {
        field_F = null;
        field_I = null;
        if (param0 != 41) {
            field_G = (String) null;
            field_G = null;
            return;
        }
        field_G = null;
    }

    ck(int param0, int param1, int param2, int param3, lk param4, boolean param5, int param6, int param7, ee param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ci) null, (pl) null);
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
              this.field_A = param7;
              this.field_E = param8;
              this.field_B = param9;
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
              ((ck) (this)).field_H = stackIn_4_1 != 0;
              this.field_D = param10;
              this.field_y = param4;
              this.field_C = param6;
              var12_int = this.field_C - this.field_A;
              var13 = this.field_E.b(param10, var12_int, this.field_E.field_s) + 2 * this.field_A;
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(var13, param1, param2, param0, true);
                break L2;
              }
            }
            L3: {
              if (this.field_H) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 2 * this.field_A + this.field_C;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_y.a(-(this.field_A * 2) + param3, this.field_A - -(var13 + -param3 >> -1346711711), -this.field_C + (param2 + -(this.field_A * 3)), var14, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ck.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_F = "Login: ";
        field_I = "Members";
    }
}
