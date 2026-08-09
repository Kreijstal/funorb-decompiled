/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static int[] field_a;
    private int field_f;
    static int[] field_l;
    static int field_k;
    private q field_d;
    static int[] field_n;
    private boolean field_g;
    static jp field_e;
    private int field_m;
    private km field_h;
    private int field_b;
    private jp field_j;
    static int field_i;
    private String field_c;

    final static boolean a(int param0, int param1) {
        if (param1 >= -26) {
            field_n = (int[]) null;
            if (!(-1 != param0)) {
                return true;
            }
            return (1 << param0 & o.field_d) != 0 ? true : false;
        }
        if (!(-1 != param0)) {
            return true;
        }
        return (1 << param0 & o.field_d) != 0 ? true : false;
    }

    final static void a(String[][] param0, tp[] param1, byte param2, String[] param3, int param4, String[] param5, String[][] param6, mf param7, mf param8, mf param9, int[] param10, jp[][] param11, int param12, boolean param13, jp[][] param14, byte[] param15, byte[] param16, int[] param17, int param18) {
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
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        int[] var20 = null;
        String[] var21 = null;
        try {
          L0: {
            L1: {
              var21 = (String[]) null;
              pf.a(param18, param15, param8, param3, -27460, param13, param14, param7, param12, param10, (String[]) null, param11, param1, 1, param16, param0, param5, param6, param17, param9);
              if (param2 == 47) {
                break L1;
              } else {
                var20 = (int[]) null;
                lc.a((String[][]) null, (tp[]) null, (byte) -33, (String[]) null, 104, (String[]) null, (String[][]) null, (mf) null, (mf) null, (mf) null, (int[]) null, (jp[][]) null, 5, true, (jp[][]) null, (byte[]) null, (byte[]) null, (int[]) null, -25);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var19 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var19);

            stackIn_5_1 = new StringBuilder().append("lc.E(");

            if (param0 == null) {
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
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param15 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param16 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param17 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L15;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L15;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_45_2 + ',' + param18 + ')');
        }
    }

    final void a(byte param0) {
        int var2;
        int stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        int stackIn_3_5;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        bi stackIn_6_0;
        String stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        bi stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_10_0;
        int stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        int stackIn_10_5;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        bi stackIn_13_0;
        String stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        bi stackIn_14_0 = null;
        String stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        if (param0 <= 89) {
          L0: {
            this.field_d = (q) null;
            var2 = sa.a(100 * (-this.field_f + de.field_x), -4097) + 65536 >> 1133957100;
            stackIn_10_0 = this.field_d.field_c + -2;

            stackIn_10_1 = -2 + this.field_d.field_a;

            stackIn_10_2 = 4 + this.field_d.field_j;

            stackIn_10_3 = this.field_d.field_d + 4;

            stackIn_10_4 = 20;

            stackIn_10_5 = 16777215;

            if (!this.field_g) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = stackIn_10_1;
              stackIn_11_2 = stackIn_10_2;
              stackIn_11_3 = stackIn_10_3;
              stackIn_11_4 = stackIn_10_4;
              stackIn_11_5 = stackIn_10_5;
              stackIn_11_6 = 0;
              break L0;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = stackIn_10_1;
              stackIn_11_2 = stackIn_10_2;
              stackIn_11_3 = stackIn_10_3;
              stackIn_11_4 = stackIn_10_4;
              stackIn_11_5 = stackIn_10_5;
              stackIn_11_6 = var2;
              break L0;
            }
          }
          L1: {
            lb.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_11_6 + 32);
            lb.b(this.field_d.field_c, this.field_d.field_a, this.field_d.field_j, this.field_d.field_d, 20, 0);
            this.field_j.c(this.field_d.field_c + 30, this.field_d.field_a + 20);
            stackIn_13_0 = nn.field_g;

            stackIn_13_1 = this.field_c;

            stackIn_13_2 = (this.field_d.field_j + this.field_d.field_c * 2) / 2;

            stackIn_13_3 = this.field_d.field_a - (-this.field_d.field_d - -13);

            if (this.field_g) {
              stackIn_14_0 = (bi) ((Object) stackIn_13_0);
              stackIn_14_1 = (String) ((Object) stackIn_13_1);
              stackIn_14_2 = stackIn_13_2;
              stackIn_14_3 = stackIn_13_3;
              stackIn_14_4 = 1;
              break L1;
            } else {
              stackIn_14_0 = (bi) ((Object) stackIn_13_0);
              stackIn_14_1 = (String) ((Object) stackIn_13_1);
              stackIn_14_2 = stackIn_13_2;
              stackIn_14_3 = stackIn_13_3;
              stackIn_14_4 = 0;
              break L1;
            }
          }
          ((bi) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4, -1);
          return;
        } else {
          L2: {
            var2 = sa.a(100 * (-this.field_f + de.field_x), -4097) + 65536 >> 1133957100;
            stackIn_3_0 = this.field_d.field_c + -2;

            stackIn_3_1 = -2 + this.field_d.field_a;

            stackIn_3_2 = 4 + this.field_d.field_j;

            stackIn_3_3 = this.field_d.field_d + 4;

            stackIn_3_4 = 20;

            stackIn_3_5 = 16777215;

            if (!this.field_g) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = stackIn_3_2;
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = stackIn_3_4;
              stackIn_4_5 = stackIn_3_5;
              stackIn_4_6 = 0;
              break L2;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = stackIn_3_2;
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = stackIn_3_4;
              stackIn_4_5 = stackIn_3_5;
              stackIn_4_6 = var2;
              break L2;
            }
          }
          L3: {
            lb.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6 + 32);
            lb.b(this.field_d.field_c, this.field_d.field_a, this.field_d.field_j, this.field_d.field_d, 20, 0);
            this.field_j.c(this.field_d.field_c + 30, this.field_d.field_a + 20);
            stackIn_6_0 = nn.field_g;

            stackIn_6_1 = this.field_c;

            stackIn_6_2 = (this.field_d.field_j + this.field_d.field_c * 2) / 2;

            stackIn_6_3 = this.field_d.field_a - (-this.field_d.field_d - -13);

            if (this.field_g) {
              stackIn_7_0 = (bi) ((Object) stackIn_6_0);
              stackIn_7_1 = (String) ((Object) stackIn_6_1);
              stackIn_7_2 = stackIn_6_2;
              stackIn_7_3 = stackIn_6_3;
              stackIn_7_4 = 1;
              break L3;
            } else {
              stackIn_7_0 = (bi) ((Object) stackIn_6_0);
              stackIn_7_1 = (String) ((Object) stackIn_6_1);
              stackIn_7_2 = stackIn_6_2;
              stackIn_7_3 = stackIn_6_3;
              stackIn_7_4 = 0;
              break L3;
            }
          }
          ((bi) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, -1);
          return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_a = null;
        if (param0 != 32156) {
          lc.a(-115);
          field_l = null;
          field_e = null;
          return;
        } else {
          field_l = null;
          field_e = null;
          return;
        }
    }

    final void b(byte param0) {
        if (param0 == -75) {
          if (this.field_h.field_h.field_j == this.field_b) {
            if (!this.field_g) {
              this.field_f = de.field_x;
              this.field_g = true;
              return;
            } else {
              this.field_g = true;
              return;
            }
          } else {
            this.field_g = false;
            return;
          }
        } else {
          return;
        }
    }

    lc(km param0, q param1, int param2, int param3) {
        try {
            this.field_m = param3;
            this.field_b = param2;
            this.field_d = param1;
            this.field_h = param0;
            this.field_c = qn.field_u[this.field_m].toLowerCase();
            this.field_j = hq.field_s[this.field_m];
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_l = new int[8192];
        field_n = new int[]{25, 8, 26, 37};
        field_a = new int[4];
        field_k = 9;
    }
}
