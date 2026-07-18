/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oba extends gda {
    float field_j;
    float field_p;
    static jqa field_e;
    float field_h;
    float field_o;
    float field_k;
    float field_r;
    float field_i;
    float field_m;
    float field_l;
    float field_g;
    float field_q;
    static jea field_f;
    static String field_n;
    float field_s;

    final float[] e(int param0) {
        gt.field_c[10] = ((oba) this).field_q;
        gt.field_c[14] = ((oba) this).field_o;
        gt.field_c[12] = ((oba) this).field_m;
        gt.field_c[8] = ((oba) this).field_s;
        gt.field_c[4] = ((oba) this).field_k;
        gt.field_c[5] = ((oba) this).field_r;
        gt.field_c[0] = ((oba) this).field_l;
        gt.field_c[9] = ((oba) this).field_g;
        gt.field_c[2] = ((oba) this).field_j;
        gt.field_c[13] = ((oba) this).field_p;
        int var2 = 108 / (param0 / 43);
        gt.field_c[1] = ((oba) this).field_i;
        gt.field_c[6] = ((oba) this).field_h;
        return gt.field_c;
    }

    final static boolean c(int param0, int param1) {
        int discarded$10 = 2048;
        int discarded$11 = 0;
        return vta.a(param1, param0) & ((0 != (8192 & param0) ? true : false) | kaa.a(param1, param0) | rg.e(param1, -56, param0));
    }

    final void c(int param0) {
        float var2 = hu.field_c[param0 & 16383];
        float var3 = hu.field_b[param0 & 16383];
        float var4 = ((oba) this).field_i;
        float var5 = ((oba) this).field_r;
        float var6 = ((oba) this).field_g;
        ((oba) this).field_i = var2 * var4 - var3 * ((oba) this).field_j;
        float var7 = ((oba) this).field_p;
        ((oba) this).field_r = var2 * var5 - ((oba) this).field_h * var3;
        ((oba) this).field_j = var3 * var4 + var2 * ((oba) this).field_j;
        ((oba) this).field_h = var3 * var5 + var2 * ((oba) this).field_h;
        ((oba) this).field_g = -(var3 * ((oba) this).field_q) + var6 * var2;
        ((oba) this).field_q = ((oba) this).field_q * var2 + var3 * var6;
        ((oba) this).field_p = var7 * var2 - var3 * ((oba) this).field_o;
        ((oba) this).field_o = var2 * ((oba) this).field_o + var7 * var3;
    }

    final void a(gda param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        oba var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5 = (oba) (Object) param0;
            ((oba) this).field_k = var5.field_i;
            var4 = -37 % ((-23 - param1) / 33);
            ((oba) this).field_s = var5.field_j;
            ((oba) this).field_l = var5.field_l;
            ((oba) this).field_j = var5.field_s;
            ((oba) this).field_i = var5.field_k;
            ((oba) this).field_r = var5.field_r;
            ((oba) this).field_g = var5.field_h;
            ((oba) this).field_m = -(((oba) this).field_k * var5.field_p + ((oba) this).field_l * var5.field_m + var5.field_o * ((oba) this).field_s);
            ((oba) this).field_h = var5.field_g;
            ((oba) this).field_q = var5.field_q;
            ((oba) this).field_p = -(var5.field_m * ((oba) this).field_i + var5.field_p * ((oba) this).field_r + var5.field_o * ((oba) this).field_g);
            ((oba) this).field_o = -(var5.field_m * ((oba) this).field_j + ((oba) this).field_h * var5.field_p + ((oba) this).field_q * var5.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("oba.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
    }

    final void a(float[] param0, float param1, float param2, float param3, int param4, float param5) {
        RuntimeException var7 = null;
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 == -9479) {
              L1: {
                L2: {
                  param0[1] = ((oba) this).field_g * param3 + (((oba) this).field_i * param1 + ((oba) this).field_r * param5);
                  param0[0] = ((oba) this).field_l * param1 + param5 * ((oba) this).field_k + ((oba) this).field_s * param3;
                  param0[2] = ((oba) this).field_q * param3 + (((oba) this).field_h * param5 + param1 * ((oba) this).field_j);
                  if (0.00390625f < param1) {
                    break L2;
                  } else {
                    if (-0.00390625f <= param1) {
                      L3: {
                        if (0.00390625f < param5) {
                          break L3;
                        } else {
                          if (param5 >= -0.00390625f) {
                            var10 = -param2 / param3;
                            var7_float = ((oba) this).field_m + ((oba) this).field_s * var10;
                            var9 = ((oba) this).field_q * var10 + ((oba) this).field_o;
                            var8 = var10 * ((oba) this).field_g + ((oba) this).field_p;
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var10 = -param2 / param5;
                      var9 = var10 * ((oba) this).field_h + ((oba) this).field_o;
                      var7_float = ((oba) this).field_m + var10 * ((oba) this).field_k;
                      var8 = ((oba) this).field_p + var10 * ((oba) this).field_r;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = -param2 / param1;
                var7_float = ((oba) this).field_m + var10 * ((oba) this).field_l;
                var8 = ((oba) this).field_p + var10 * ((oba) this).field_i;
                var9 = ((oba) this).field_j * var10 + ((oba) this).field_o;
                break L1;
              }
              param0[3] = -(var9 * param0[2] + (var7_float * param0[0] + var8 * param0[1]));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("oba.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(byte param0) {
        ((oba) this).field_q = -((oba) this).field_q;
        ((oba) this).field_o = -((oba) this).field_o;
        ((oba) this).field_h = -((oba) this).field_h;
        if (param0 != 57) {
          return;
        } else {
          ((oba) this).field_j = -((oba) this).field_j;
          ((oba) this).field_r = -((oba) this).field_r;
          ((oba) this).field_i = -((oba) this).field_i;
          ((oba) this).field_g = -((oba) this).field_g;
          ((oba) this).field_p = -((oba) this).field_p;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((oba) this).field_p = ((oba) this).field_p + (float)param1;
        ((oba) this).field_m = ((oba) this).field_m + (float)param0;
        ((oba) this).field_o = ((oba) this).field_o + (float)param2;
    }

    final void a(int param0, float param1, float param2, int param3, byte param4, int param5, float param6) {
        float var8 = 0.0f;
        float var9 = 0.0f;
        if (0 == param0) {
          ((oba) this).field_j = 0.0f;
          ((oba) this).field_g = 0.0f;
          ((oba) this).field_r = (float)param3;
          ((oba) this).field_i = 0.0f;
          ((oba) this).field_q = 1.0f;
          ((oba) this).field_h = 0.0f;
          ((oba) this).field_s = 0.0f;
          ((oba) this).field_l = (float)param5;
          ((oba) this).field_k = 0.0f;
          ((oba) this).field_p = param6;
          ((oba) this).field_m = param2;
          ((oba) this).field_o = param1;
          if (param4 <= -8) {
            return;
          } else {
            ((oba) this).field_s = 1.013883352279663f;
            return;
          }
        } else {
          var8 = hu.field_c[16383 & param0];
          var9 = hu.field_b[16383 & param0];
          ((oba) this).field_h = 0.0f;
          ((oba) this).field_j = 0.0f;
          ((oba) this).field_k = (float)param3 * -var9;
          ((oba) this).field_l = var8 * (float)param5;
          ((oba) this).field_s = 0.0f;
          ((oba) this).field_i = (float)param5 * var9;
          ((oba) this).field_g = 0.0f;
          ((oba) this).field_q = 1.0f;
          ((oba) this).field_r = var8 * (float)param3;
          ((oba) this).field_p = param6;
          ((oba) this).field_m = param2;
          ((oba) this).field_o = param1;
          if (param4 <= -8) {
            return;
          } else {
            ((oba) this).field_s = 1.013883352279663f;
            return;
          }
        }
    }

    final void d(int param0) {
        float var2 = hu.field_c[param0 & 16383];
        float var3 = hu.field_b[param0 & 16383];
        float var4 = ((oba) this).field_l;
        float var5 = ((oba) this).field_k;
        float var6 = ((oba) this).field_s;
        float var7 = ((oba) this).field_m;
        ((oba) this).field_l = var3 * ((oba) this).field_j + var2 * var4;
        ((oba) this).field_k = ((oba) this).field_h * var3 + var2 * var5;
        ((oba) this).field_j = ((oba) this).field_j * var2 - var3 * var4;
        ((oba) this).field_s = var3 * ((oba) this).field_q + var2 * var6;
        ((oba) this).field_h = -(var5 * var3) + ((oba) this).field_h * var2;
        ((oba) this).field_q = -(var3 * var6) + var2 * ((oba) this).field_q;
        ((oba) this).field_m = var7 * var2 + var3 * ((oba) this).field_o;
        ((oba) this).field_o = -(var3 * var7) + ((oba) this).field_o * var2;
    }

    public static void a(byte param0) {
        field_f = null;
        field_n = null;
        field_e = null;
    }

    final void a() {
        ((oba) this).field_s = 0.0f;
        ((oba) this).field_k = 0.0f;
        ((oba) this).field_o = 0.0f;
        ((oba) this).field_p = 0.0f;
        ((oba) this).field_h = 0.0f;
        ((oba) this).field_m = 0.0f;
        ((oba) this).field_q = 1.0f;
        ((oba) this).field_r = 1.0f;
        ((oba) this).field_l = 1.0f;
        ((oba) this).field_j = 0.0f;
        ((oba) this).field_g = 0.0f;
        ((oba) this).field_i = 0.0f;
    }

    final float[] b(byte param0) {
        Object var3 = null;
        gt.field_c[12] = 0.0f;
        gt.field_c[9] = ((oba) this).field_g;
        gt.field_c[2] = ((oba) this).field_j;
        gt.field_c[14] = 0.0f;
        gt.field_c[8] = ((oba) this).field_s;
        gt.field_c[4] = ((oba) this).field_k;
        gt.field_c[13] = 0.0f;
        if (param0 != 57) {
          var3 = null;
          ((oba) this).a((gda) null, 114);
          gt.field_c[1] = ((oba) this).field_i;
          gt.field_c[10] = ((oba) this).field_q;
          gt.field_c[0] = ((oba) this).field_l;
          gt.field_c[5] = ((oba) this).field_r;
          gt.field_c[6] = ((oba) this).field_h;
          return gt.field_c;
        } else {
          gt.field_c[1] = ((oba) this).field_i;
          gt.field_c[10] = ((oba) this).field_q;
          gt.field_c[0] = ((oba) this).field_l;
          gt.field_c[5] = ((oba) this).field_r;
          gt.field_c[6] = ((oba) this).field_h;
          return gt.field_c;
        }
    }

    final void a(gda param0, int param1) {
        oba var3 = null;
        try {
            var3 = (oba) (Object) param0;
            ((oba) this).field_k = var3.field_k;
            ((oba) this).field_p = var3.field_p;
            ((oba) this).field_l = var3.field_l;
            ((oba) this).field_g = var3.field_g;
            ((oba) this).field_j = var3.field_j;
            ((oba) this).field_h = var3.field_h;
            ((oba) this).field_i = var3.field_i;
            int var4 = -24 / ((param1 - -9) / 49);
            ((oba) this).field_m = var3.field_m;
            ((oba) this).field_q = var3.field_q;
            ((oba) this).field_r = var3.field_r;
            ((oba) this).field_s = var3.field_s;
            ((oba) this).field_o = var3.field_o;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oba.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        float var2 = hu.field_c[16383 & param0];
        float var3 = hu.field_b[param0 & 16383];
        float var4 = ((oba) this).field_l;
        float var5 = ((oba) this).field_k;
        float var6 = ((oba) this).field_s;
        ((oba) this).field_l = var2 * var4 - ((oba) this).field_i * var3;
        float var7 = ((oba) this).field_m;
        ((oba) this).field_i = ((oba) this).field_i * var2 + var4 * var3;
        ((oba) this).field_k = var2 * var5 - ((oba) this).field_r * var3;
        ((oba) this).field_r = ((oba) this).field_r * var2 + var3 * var5;
        ((oba) this).field_s = var6 * var2 - var3 * ((oba) this).field_g;
        ((oba) this).field_m = -(var3 * ((oba) this).field_p) + var2 * var7;
        ((oba) this).field_g = var2 * ((oba) this).field_g + var3 * var6;
        ((oba) this).field_p = var3 * var7 + ((oba) this).field_p * var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = hu.field_c[16383 & param3];
        float var8 = hu.field_b[param3 & 16383];
        float var9 = hu.field_c[16383 & param4];
        float var10 = hu.field_b[16383 & param4];
        float var11 = hu.field_c[16383 & param5];
        float var12 = hu.field_b[16383 & param5];
        float var13 = var8 * var11;
        float var14 = var12 * var8;
        ((oba) this).field_i = var12 * -var9 + var13 * var10;
        ((oba) this).field_l = var11 * var9 + var14 * var10;
        ((oba) this).field_k = var7 * var12;
        ((oba) this).field_g = var10 * var12 + var13 * var9;
        ((oba) this).field_s = var9 * var14 + var11 * -var10;
        ((oba) this).field_q = var7 * var9;
        ((oba) this).field_j = var10 * var7;
        ((oba) this).field_r = var11 * var7;
        ((oba) this).field_h = -var8;
        ((oba) this).field_o = (float)(-param0) * ((oba) this).field_j - (float)param1 * ((oba) this).field_h - ((oba) this).field_q * (float)param2;
        ((oba) this).field_m = -(((oba) this).field_s * (float)param2) + ((float)(-param0) * ((oba) this).field_l - ((oba) this).field_k * (float)param1);
        ((oba) this).field_p = -((float)param2 * ((oba) this).field_g) + ((float)(-param0) * ((oba) this).field_i - (float)param1 * ((oba) this).field_r);
    }

    oba() {
        ((oba) this).a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "<%0> didn't choose a reward!";
    }
}
