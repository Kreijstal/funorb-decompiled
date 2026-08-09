/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends jk {
    private int field_L;
    private ta field_M;
    static String field_H;
    static String field_F;
    static int field_D;
    private int field_G;
    private String field_J;
    private boolean field_E;
    private int field_I;

    final String a(byte param0) {
        int var2 = this.field_v.field_g ? 1 : 0;
        this.field_v.field_g = this.field_g;
        String var3 = this.field_v.a(param0);
        this.field_v.field_g = var2 != 0 ? true : false;
        return var3;
    }

    mh(int param0, int param1, int param2, int param3, we param4, boolean param5, int param6, int param7, ta param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ml) null, (of) null);
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
              this.field_M = param8;
              this.field_J = param10;
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
                ((mh) (this)).field_E = stackIn_4_1 != 0;
                this.field_v = param4;
                this.field_I = param7;
                this.field_L = param6;
                this.field_G = param9;
                var12_int = this.field_L - this.field_I;
                var13 = this.field_M.a(param10, var12_int, this.field_M.field_C) + 2 * this.field_I;
                if (var13 > param3) {
                  break L3;
                } else {
                  var13 = param3;
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a(var13, 13361, param0, param2, param1);
              break L2;
            }
            L4: {
              if (this.field_E) {
                stackIn_10_0 = 0;
                break L4;
              } else {
                stackIn_10_0 = this.field_I * 2 + this.field_L;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            this.field_v.a(-(2 * this.field_I) + param3, 13361, var14, -this.field_L + param2 - this.field_I * 3, this.field_I - -(-param3 + var13 >> -554802399));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("mh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final static void a(vl param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ob.field_s.a(-8212, param0);
              pf.a((byte) -111, param0, param2);
              if (param1 == 0) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mh.A(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_4_0 = 0;
        ta stackIn_6_0;
        String stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        int stackIn_6_6;
        int stackIn_6_7;
        ta stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        var5 = this.field_r + param3;
        var6 = this.field_e + param2;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            if (this.field_E) {
              stackIn_4_0 = -(this.field_I * 2) + this.field_l - this.field_L;
              break L0;
            } else {
              stackIn_4_0 = 0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackIn_6_0 = this.field_M;

            stackIn_6_1 = this.field_J;

            stackIn_6_2 = this.field_I + var5 - -var7;

            stackIn_6_3 = var6 + this.field_I;

            stackIn_6_4 = -this.field_I + this.field_L;

            stackIn_6_5 = this.field_p + -(this.field_I * 2);

            stackIn_6_6 = this.field_G;

            stackIn_6_7 = -1;

            if (!this.field_E) {
              stackIn_7_0 = (ta) ((Object) stackIn_6_0);
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
              stackIn_7_0 = (ta) ((Object) stackIn_6_0);
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
          ((ta) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, this.field_M.field_C);
          return;
        }
    }

    final static void a(float[] param0, byte param1, float[] param2) {
        if (param1 >= -124) {
            return;
        }
        try {
            param0[1] = param0[1] - param2[1];
            param0[0] = param0[0] - param2[0];
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            if (param0 > -54) {
                java.awt.Component var3 = (java.awt.Component) null;
                mh.a(48, (java.awt.Component) null);
            }
            param1.addKeyListener(wj.field_k);
            param1.addFocusListener(wj.field_k);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_F = null;
        int var1 = 46 % ((55 - param0) / 40);
        field_H = null;
    }

    static {
        field_H = "Please enter your age in years";
    }
}
