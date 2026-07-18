/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class epb extends pw {
    private float field_n;
    private float field_e;
    private float field_g;
    private float field_l;
    private float field_j;
    private float field_h;
    static phb field_m;
    private float field_c;
    private float field_f;
    private float field_k;
    private float field_i;
    private float field_b;
    private float field_d;

    final float[] b(byte param0) {
        tra.field_p[6] = ((epb) this).field_d;
        tra.field_p[0] = ((epb) this).field_k;
        tra.field_p[8] = ((epb) this).field_f;
        tra.field_p[13] = 0.0f;
        tra.field_p[14] = 0.0f;
        tra.field_p[10] = ((epb) this).field_c;
        if (param0 <= 27) {
          float[] discarded$1 = ((epb) this).a(false);
          tra.field_p[5] = ((epb) this).field_j;
          tra.field_p[4] = ((epb) this).field_i;
          tra.field_p[12] = 0.0f;
          tra.field_p[2] = ((epb) this).field_b;
          tra.field_p[9] = ((epb) this).field_g;
          tra.field_p[1] = ((epb) this).field_h;
          return tra.field_p;
        } else {
          tra.field_p[5] = ((epb) this).field_j;
          tra.field_p[4] = ((epb) this).field_i;
          tra.field_p[12] = 0.0f;
          tra.field_p[2] = ((epb) this).field_b;
          tra.field_p[9] = ((epb) this).field_g;
          tra.field_p[1] = ((epb) this).field_h;
          return tra.field_p;
        }
    }

    final void a(float[] param0, float param1, float param2, float param3, int param4, float param5) {
        RuntimeException var7 = null;
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == 13) {
                break L1;
              } else {
                ((epb) this).field_l = -0.19119702279567719f;
                break L1;
              }
            }
            L2: {
              L3: {
                param0[0] = param5 * ((epb) this).field_i + param1 * ((epb) this).field_k + ((epb) this).field_f * param3;
                param0[2] = param3 * ((epb) this).field_c + (((epb) this).field_b * param1 + ((epb) this).field_d * param5);
                if (0.00390625f < param1) {
                  break L3;
                } else {
                  if (-0.00390625f <= param1) {
                    L4: {
                      if (param5 > 0.00390625f) {
                        break L4;
                      } else {
                        if (-0.00390625f > param5) {
                          break L4;
                        } else {
                          var10 = -param2 / param3;
                          var9 = ((epb) this).field_l + ((epb) this).field_c * var10;
                          var8 = ((epb) this).field_e + var10 * ((epb) this).field_g;
                          var7_float = var10 * ((epb) this).field_f + ((epb) this).field_n;
                          break L2;
                        }
                      }
                    }
                    var10 = -param2 / param5;
                    var9 = ((epb) this).field_l + ((epb) this).field_d * var10;
                    var7_float = var10 * ((epb) this).field_i + ((epb) this).field_n;
                    var8 = var10 * ((epb) this).field_j + ((epb) this).field_e;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = -param2 / param1;
              var8 = ((epb) this).field_h * var10 + ((epb) this).field_e;
              var7_float = var10 * ((epb) this).field_k + ((epb) this).field_n;
              var9 = ((epb) this).field_l + ((epb) this).field_b * var10;
              break L2;
            }
            param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
            param0[3] = -(param0[0] * var7_float + var8 * param0[1] + var9 * param0[2]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("epb.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0, pw param1) {
        epb var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3 = (epb) (Object) param1;
            ((epb) this).field_l = var3.field_l;
            ((epb) this).field_i = var3.field_i;
            ((epb) this).field_n = var3.field_n;
            ((epb) this).field_j = var3.field_j;
            ((epb) this).field_e = var3.field_e;
            ((epb) this).field_g = var3.field_g;
            ((epb) this).field_k = var3.field_k;
            ((epb) this).field_b = var3.field_b;
            ((epb) this).field_f = var3.field_f;
            ((epb) this).field_c = var3.field_c;
            ((epb) this).field_h = var3.field_h;
            ((epb) this).field_d = var3.field_d;
            if (!param0) {
              break L0;
            } else {
              epb.c(30);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("epb.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(pw param0, int param1) {
        RuntimeException var3 = null;
        epb var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = (epb) (Object) param0;
              ((epb) this).field_f = var4.field_b;
              ((epb) this).field_k = var4.field_k;
              ((epb) this).field_i = var4.field_h;
              ((epb) this).field_g = var4.field_d;
              ((epb) this).field_h = var4.field_i;
              ((epb) this).field_j = var4.field_j;
              if (param1 == 14) {
                break L1;
              } else {
                ((epb) this).a(-58, -73, -57, 3, -107, -43);
                break L1;
              }
            }
            ((epb) this).field_b = var4.field_f;
            ((epb) this).field_n = -(((epb) this).field_f * var4.field_l + (((epb) this).field_k * var4.field_n + ((epb) this).field_i * var4.field_e));
            ((epb) this).field_d = var4.field_g;
            ((epb) this).field_c = var4.field_c;
            ((epb) this).field_e = -(((epb) this).field_g * var4.field_l + (((epb) this).field_j * var4.field_e + var4.field_n * ((epb) this).field_h));
            ((epb) this).field_l = -(((epb) this).field_c * var4.field_l + (var4.field_n * ((epb) this).field_b + var4.field_e * ((epb) this).field_d));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("epb.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private final void a() {
        ((epb) this).field_n = 0.0f;
        ((epb) this).field_d = 0.0f;
        ((epb) this).field_l = 0.0f;
        ((epb) this).field_i = 0.0f;
        ((epb) this).field_b = 0.0f;
        ((epb) this).field_j = 1.0f;
        ((epb) this).field_e = 0.0f;
        ((epb) this).field_g = 0.0f;
        ((epb) this).field_h = 0.0f;
        ((epb) this).field_c = (float)1;
        ((epb) this).field_f = 0.0f;
        ((epb) this).field_k = 1.0f;
    }

    public static void c(int param0) {
        if (param0 != 13) {
            field_m = null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void b(int param0) {
        ((epb) this).field_j = -((epb) this).field_j;
        ((epb) this).field_c = -((epb) this).field_c;
        ((epb) this).field_b = -((epb) this).field_b;
        if (param0 != 5) {
          float[] discarded$1 = ((epb) this).a(true);
          ((epb) this).field_e = -((epb) this).field_e;
          ((epb) this).field_l = -((epb) this).field_l;
          ((epb) this).field_d = -((epb) this).field_d;
          ((epb) this).field_g = -((epb) this).field_g;
          ((epb) this).field_h = -((epb) this).field_h;
          return;
        } else {
          ((epb) this).field_e = -((epb) this).field_e;
          ((epb) this).field_l = -((epb) this).field_l;
          ((epb) this).field_d = -((epb) this).field_d;
          ((epb) this).field_g = -((epb) this).field_g;
          ((epb) this).field_h = -((epb) this).field_h;
          return;
        }
    }

    final float[] a(boolean param0) {
        tra.field_p[13] = ((epb) this).field_e;
        tra.field_p[4] = ((epb) this).field_i;
        tra.field_p[14] = ((epb) this).field_l;
        tra.field_p[0] = ((epb) this).field_k;
        tra.field_p[1] = ((epb) this).field_h;
        tra.field_p[2] = ((epb) this).field_b;
        tra.field_p[5] = ((epb) this).field_j;
        tra.field_p[6] = ((epb) this).field_d;
        tra.field_p[12] = ((epb) this).field_n;
        tra.field_p[9] = ((epb) this).field_g;
        tra.field_p[10] = ((epb) this).field_c;
        tra.field_p[8] = ((epb) this).field_f;
        if (!param0) {
          ((epb) this).field_n = 1.1959586143493652f;
          return tra.field_p;
        } else {
          return tra.field_p;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = kn.field_o[16383 & param3];
        float var8 = kn.field_r[param3 & 16383];
        float var9 = kn.field_o[param4 & 16383];
        float var10 = kn.field_r[param4 & 16383];
        float var11 = kn.field_o[param5 & 16383];
        float var12 = kn.field_r[16383 & param5];
        float var13 = var11 * var8;
        float var14 = var8 * var12;
        ((epb) this).field_k = var9 * var11 + var14 * var10;
        ((epb) this).field_j = var7 * var11;
        ((epb) this).field_f = var14 * var9 + var11 * -var10;
        ((epb) this).field_c = var7 * var9;
        ((epb) this).field_g = var10 * var12 + var9 * var13;
        ((epb) this).field_i = var7 * var12;
        ((epb) this).field_h = var13 * var10 + var12 * -var9;
        ((epb) this).field_b = var7 * var10;
        ((epb) this).field_d = -var8;
        ((epb) this).field_n = -((float)param1 * ((epb) this).field_i) + (float)(-param0) * ((epb) this).field_k - ((epb) this).field_f * (float)param2;
        ((epb) this).field_e = -(((epb) this).field_g * (float)param2) + (((epb) this).field_h * (float)(-param0) - ((epb) this).field_j * (float)param1);
        ((epb) this).field_l = -(((epb) this).field_c * (float)param2) + (-(((epb) this).field_d * (float)param1) + (float)(-param0) * ((epb) this).field_b);
    }

    epb() {
        int discarded$0 = 1;
        this.a();
    }

    static {
    }
}
