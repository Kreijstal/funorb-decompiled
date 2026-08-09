/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsa extends qr {
    private int field_G;
    static String field_F;
    private String field_C;
    private int field_D;
    static String field_z;
    private boolean field_E;
    private int field_A;
    private il field_B;
    static String field_y;

    final String d(byte param0) {
        int var3 = 114 % ((param0 - -58) / 60);
        int var2 = this.field_x.field_f ? 1 : 0;
        this.field_x.field_f = this.field_f;
        String var4 = this.field_x.d((byte) 56);
        this.field_x.field_f = var2 != 0 ? true : false;
        return var4;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_i + param0;
        int var6 = this.field_n - -param1;
        super.a(param0, param1, param2 ^ param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = this.field_E ? this.field_m - this.field_D - this.field_G * 2 : 0;
        this.field_B.a(this.field_C, this.field_G + var5 - -var7, this.field_G + var6, this.field_D + -this.field_G, -(this.field_G * 2) + this.field_p, this.field_A, -1, !this.field_E ? 2 : 0, 1, this.field_B.field_w);
    }

    jsa(int param0, int param1, int param2, int param3, ae param4, boolean param5, int param6, int param7, il param8, int param9, String param10) {
        super(param0, param1, param2, param3, (isa) null, (qc) null);
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
              this.field_D = param6;
              this.field_A = param9;
              this.field_C = param10;
              this.field_B = param8;
              this.field_x = param4;
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
              ((jsa) (this)).field_E = stackIn_4_1 != 0;
              this.field_G = param7;
              var12_int = -this.field_G + this.field_D;
              var13 = this.field_B.a(param10, var12_int, this.field_B.field_w) - -(this.field_G * 2);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a((byte) -31, param2, var13, param0, param1);
                break L2;
              }
            }
            L3: {
              if (this.field_E) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 2 * this.field_G + this.field_D;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_x.a((byte) -31, -this.field_D + param2 + -(this.field_G * 3), -(this.field_G * 2) + param3, var14, this.field_G - -(var13 - param3 >> 2094708161));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("jsa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final static iu[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 2) {
          field_z = (String) null;
          return hi.a(param0, 1, param3, 1, param4, 1, 3, true, param2);
        } else {
          return hi.a(param0, 1, param3, 1, param4, 1, 3, true, param2);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
            return;
        }
        bf.field_a = param1;
    }

    public static void e(int param0) {
        field_z = null;
        field_F = null;
        if (param0 != 2) {
            field_y = (String) null;
            field_y = null;
            return;
        }
        field_y = null;
    }

    static {
        field_z = "Show all private chat";
        field_F = "Waiting for Other Players";
        field_y = "This is your RuneScape clan if you have one.";
    }
}
