/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends dg {
    private int field_C;
    private String field_G;
    static int field_H;
    private boolean field_A;
    static int field_E;
    private int field_I;
    private int field_B;
    private bd field_F;
    static int field_D;

    final static void d(boolean param0) {
        ma var1;
        if (param0) {
          return;
        } else {
          L0: {
            var1 = (ma) ((Object) mb.field_b.c((byte) -111));
            if (var1 == null) {
              var1 = new ma();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(543992579, ti.field_f, ti.field_b, ti.field_e, ti.field_a, ti.field_c, ti.field_i, ti.field_l);
          dd.field_g.b(-105, var1);
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param3 + this.field_w;
        int var6 = param2 + this.field_k;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = this.field_A ? -(this.field_C * 2) + this.field_p - this.field_I : 0;
        this.field_F.a(this.field_G, var5 - -var7 - -this.field_C, this.field_C + var6, -this.field_C + this.field_I, this.field_t - this.field_C * 2, this.field_B, -1, !this.field_A ? 2 : 0, 1, this.field_F.field_N);
    }

    final static void a(int param0, af param1, boolean param2) {
        ha var3 = null;
        try {
            var3 = pg.field_fb;
            var3.f(param0, 950);
            var3.a(param2, 2);
            var3.a(param2, 0);
            var3.a(false, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "kg.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String d(int param0) {
        int var2 = this.field_y.field_q ? 1 : 0;
        this.field_y.field_q = this.field_q;
        String var3 = this.field_y.d(param0);
        this.field_y.field_q = var2 != 0 ? true : false;
        return var3;
    }

    final static boolean e(boolean param0) {
        if (param0) {
            return true;
        }
        return qe.field_o;
    }

    kg(int param0, int param1, int param2, int param3, rj param4, boolean param5, int param6, int param7, bd param8, int param9, String param10) {
        super(param0, param1, param2, param3, (uk) null, (lf) null);
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
              this.field_C = param7;
              this.field_F = param8;
              this.field_G = param10;
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
              ((kg) (this)).field_A = stackIn_4_1 != 0;
              this.field_B = param9;
              this.field_I = param6;
              this.field_y = param4;
              var12_int = -this.field_C + this.field_I;
              var13 = this.field_F.b(param10, var12_int, this.field_F.field_N) + this.field_C * 2;
              if (var13 > param3) {
                this.b(param2, param0, param1, var13, 23987);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_A) {
                stackIn_10_0 = this.field_I - -(2 * this.field_C);
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_y.b(param2 + -this.field_I - this.field_C * 3, var14, (-param3 + var13 >> -284065791) + this.field_C, param3 + -(this.field_C * 2), 23987);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("kg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
    }
}
