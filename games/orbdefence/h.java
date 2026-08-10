/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends kj {
    private boolean field_F;
    static java.awt.Frame field_J;
    private String field_I;
    static int field_E;
    static int field_H;
    private int field_K;
    private kc field_C;
    private int field_D;
    private int field_B;
    static int field_A;
    static String field_L;

    final static void k(int param0) {
        vh var1;
        L0: {
          var1 = (vh) ((Object) ml.field_f.a((byte) 42));
          if (var1 == null) {
            var1 = new vh();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 120) {
          h.l(-54);
          var1.a(ul.field_b, 95, ul.field_i, ul.field_a, ul.field_f, ul.field_l, ul.field_d, ul.field_e);
          le.field_a.a(-115, var1);
          return;
        } else {
          var1.a(ul.field_b, 95, ul.field_i, ul.field_a, ul.field_f, ul.field_l, ul.field_d, ul.field_e);
          le.field_a.a(-115, var1);
          return;
        }
    }

    h(int param0, int param1, int param2, int param3, pj param4, boolean param5, int param6, int param7, kc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (td) null, (ag) null);
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
              this.field_C = param8;
              this.field_K = param9;
              this.field_y = param4;
              this.field_I = param10;
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
              ((h) (this)).field_F = stackIn_4_1 != 0;
              this.field_D = param7;
              this.field_B = param6;
              var12_int = -this.field_D + this.field_B;
              var13 = this.field_C.a(param10, var12_int, this.field_C.field_H) - -(2 * this.field_D);
              if (param3 < var13) {
                this.a(param0, param1, var13, (byte) -90, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_F) {
                stackIn_10_0 = 2 * this.field_D + this.field_B;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_y.a(var14, this.field_D + (-param3 + var13 >> 704580449), param3 + -(2 * this.field_D), (byte) -90, -this.field_B + param2 + -(3 * this.field_D));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("h.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final String g(int param0) {
        int var2 = this.field_y.field_t ? 1 : 0;
        this.field_y.field_t = this.field_t;
        String var3 = this.field_y.g(param0);
        this.field_y.field_t = var2 != 0 ? true : false;
        return var3;
    }

    public static void l(int param0) {
        int var1 = -23 % ((param0 - -30) / 42);
        field_L = null;
        field_J = null;
    }

    final static qg a(qg param0, byte param1, int[] param2) {
        qg var3 = null;
        RuntimeException var3_ref = null;
        qg stackIn_2_0 = null;
        qg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new qg(0, 0, 0);
            var3.field_i = param0.field_i;
            if (param1 == 37) {
              var3.field_h = param0.field_h;
              var3.field_l = param0.field_l;
              var3.field_g = param0.field_g;
              var3.field_d = param0.field_d;
              var3.field_b = param0.field_b;
              var3.field_c = param0.field_c;
              var3.field_k = param2;
              stackIn_4_0 = (qg) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("h.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_4_0 = 0;
        kc stackIn_6_0;
        String stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        int stackIn_6_6;
        int stackIn_6_7;
        kc stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        var5 = this.field_s + param3;
        var6 = param0 + this.field_n;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        } else {
          L0: {
            if (this.field_F) {
              stackIn_4_0 = -(this.field_D * 2) + (-this.field_B + this.field_m);
              break L0;
            } else {
              stackIn_4_0 = 0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackIn_6_0 = this.field_C;

            stackIn_6_1 = this.field_I;

            stackIn_6_2 = var7 + var5 - -this.field_D;

            stackIn_6_3 = var6 + this.field_D;

            stackIn_6_4 = this.field_B + -this.field_D;

            stackIn_6_5 = -(this.field_D * 2) + this.field_r;

            stackIn_6_6 = this.field_K;

            stackIn_6_7 = -1;

            if (this.field_F) {
              stackIn_7_0 = (kc) ((Object) stackIn_6_0);
              stackIn_7_1 = (String) ((Object) stackIn_6_1);
              stackIn_7_2 = stackIn_6_2;
              stackIn_7_3 = stackIn_6_3;
              stackIn_7_4 = stackIn_6_4;
              stackIn_7_5 = stackIn_6_5;
              stackIn_7_6 = stackIn_6_6;
              stackIn_7_7 = stackIn_6_7;
              stackIn_7_8 = 0;
              break L1;
            } else {
              stackIn_7_0 = (kc) ((Object) stackIn_6_0);
              stackIn_7_1 = (String) ((Object) stackIn_6_1);
              stackIn_7_2 = stackIn_6_2;
              stackIn_7_3 = stackIn_6_3;
              stackIn_7_4 = stackIn_6_4;
              stackIn_7_5 = stackIn_6_5;
              stackIn_7_6 = stackIn_6_6;
              stackIn_7_7 = stackIn_6_7;
              stackIn_7_8 = 2;
              break L1;
            }
          }
          ((kc) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, this.field_C.field_H);
          return;
        }
    }

    static {
        field_L = "Friends can be added in multiplayer<nbsp>games";
    }
}
