/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oj extends pw {
    static clb field_b;
    private float field_l;
    private float field_j;
    private float field_h;
    private float field_c;
    private float field_k;
    private float field_g;
    private float field_d;
    private float field_n;
    private float field_f;
    private float field_e;
    private float field_m;
    private float field_i;

    final void a(pw param0, int param1) {
        oj var3 = null;
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
            var3 = (oj) (Object) param0;
            ((oj) this).field_m = var3.field_m;
            ((oj) this).field_l = var3.field_l;
            ((oj) this).field_c = var3.field_c;
            ((oj) this).field_n = var3.field_n;
            ((oj) this).field_k = var3.field_k;
            ((oj) this).field_h = var3.field_h;
            ((oj) this).field_f = var3.field_f;
            ((oj) this).field_e = var3.field_e;
            ((oj) this).field_i = var3.field_i;
            ((oj) this).field_j = var3.field_j;
            ((oj) this).field_d = var3.field_d;
            ((oj) this).field_g = var3.field_g;
            if (param1 == 16383) {
              break L0;
            } else {
              ((oj) this).field_m = -0.5222663879394531f;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("oj.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        var3 = mla.field_s[param0 & 16383];
        var4 = mla.field_p[param0 & 16383];
        var5 = ((oj) this).field_g;
        var6 = ((oj) this).field_c;
        var7 = ((oj) this).field_m;
        ((oj) this).field_g = -(((oj) this).field_n * var4) + var5 * var3;
        var8 = ((oj) this).field_j;
        ((oj) this).field_n = var5 * var4 + ((oj) this).field_n * var3;
        ((oj) this).field_c = var6 * var3 - var4 * ((oj) this).field_i;
        ((oj) this).field_i = var3 * ((oj) this).field_i + var6 * var4;
        ((oj) this).field_m = var7 * var3 - ((oj) this).field_e * var4;
        if (param1 != 3) {
          ((oj) this).field_e = -1.153786063194275f;
          ((oj) this).field_j = var8 * var3 - var4 * ((oj) this).field_d;
          ((oj) this).field_e = var7 * var4 + var3 * ((oj) this).field_e;
          ((oj) this).field_d = var3 * ((oj) this).field_d + var4 * var8;
          return;
        } else {
          ((oj) this).field_j = var8 * var3 - var4 * ((oj) this).field_d;
          ((oj) this).field_e = var7 * var4 + var3 * ((oj) this).field_e;
          ((oj) this).field_d = var3 * ((oj) this).field_d + var4 * var8;
          return;
        }
    }

    final void b(int param0, float param1, float param2, float param3) {
        ((oj) this).field_m = ((oj) this).field_m * param1;
        ((oj) this).field_h = ((oj) this).field_h * param3;
        ((oj) this).field_i = ((oj) this).field_i * param2;
        ((oj) this).field_c = ((oj) this).field_c * param1;
        ((oj) this).field_g = ((oj) this).field_g * param1;
        ((oj) this).field_e = ((oj) this).field_e * param2;
        if (param0 != -3286) {
          return;
        } else {
          ((oj) this).field_d = ((oj) this).field_d * param2;
          ((oj) this).field_j = ((oj) this).field_j * param1;
          ((oj) this).field_k = ((oj) this).field_k * param3;
          ((oj) this).field_n = ((oj) this).field_n * param2;
          ((oj) this).field_l = ((oj) this).field_l * param3;
          ((oj) this).field_f = ((oj) this).field_f * param3;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 16383) {
          return;
        } else {
          ((oj) this).field_d = ((oj) this).field_d + (float)param0;
          ((oj) this).field_k = ((oj) this).field_k + (float)param2;
          ((oj) this).field_j = ((oj) this).field_j + (float)param3;
          return;
        }
    }

    public static void b(int param0) {
        if (param0 < 65) {
            oj.a((byte) 104, false, 86);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(float param0, float[] param1, float param2, float param3, boolean param4) {
        RuntimeException runtimeException = null;
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
            L1: {
              param1[2] = param0 * ((oj) this).field_f + param3 * ((oj) this).field_l + ((oj) this).field_h * param2;
              param1[1] = ((oj) this).field_e * param2 + (((oj) this).field_i * param0 + param3 * ((oj) this).field_n);
              param1[0] = param2 * ((oj) this).field_m + (((oj) this).field_g * param3 + ((oj) this).field_c * param0);
              if (!param4) {
                break L1;
              } else {
                ((oj) this).field_m = 0.9724645614624023f;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oj.DA(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(float param0, float param1, float param2, byte param3) {
        ((oj) this).field_j = ((oj) this).field_j + param1;
        ((oj) this).field_k = ((oj) this).field_k + param0;
        ((oj) this).field_d = ((oj) this).field_d + param2;
        if (param3 != 13) {
            oj.b(6);
        }
    }

    final float[] b(byte param0, float[] param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              param1[4] = ((oj) this).field_n;
              param1[5] = ((oj) this).field_i;
              param1[0] = ((oj) this).field_g;
              param1[3] = ((oj) this).field_j;
              param1[6] = ((oj) this).field_e;
              if (param0 == 105) {
                break L1;
              } else {
                var4 = null;
                float[] discarded$2 = ((oj) this).b((float[]) null, (byte) 52);
                break L1;
              }
            }
            param1[7] = ((oj) this).field_d;
            param1[2] = ((oj) this).field_m;
            param1[1] = ((oj) this).field_c;
            stackOut_2_0 = (float[]) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.O(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(File param0, int param1, byte[] param2, int param3) throws IOException {
        FileOutputStream var4 = new FileOutputStream(param0);
        var4.write(param2, 0, param3);
        try {
            var4.close();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "oj.J(" + (param0 != null ? "{...}" : "null") + ',' + 3 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final float[] b(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              param0[0] = ((oj) this).field_g;
              if (param1 == 114) {
                break L1;
              } else {
                ((oj) this).a(-1.1722569465637207f, -0.8717162609100342f, (byte) 106, -0.6868294477462769f, -1.6954988241195679f, 0.7221444845199585f, -1.6910157203674316f, 0.8159959316253662f, 0.2177412509918213f, -0.711976170539856f);
                break L1;
              }
            }
            param0[1] = ((oj) this).field_n;
            param0[12] = ((oj) this).field_j;
            param0[8] = ((oj) this).field_m;
            param0[4] = ((oj) this).field_c;
            param0[3] = 0.0f;
            param0[9] = ((oj) this).field_e;
            param0[6] = ((oj) this).field_f;
            param0[5] = ((oj) this).field_i;
            param0[2] = ((oj) this).field_l;
            param0[15] = 1.0f;
            param0[10] = ((oj) this).field_h;
            param0[13] = ((oj) this).field_d;
            param0[14] = ((oj) this).field_k;
            param0[7] = 0.0f;
            param0[11] = 0.0f;
            stackOut_2_0 = (float[]) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.F(");
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
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = mla.field_s[16383 & param3];
        float var8 = mla.field_p[16383 & param3];
        float var9 = mla.field_s[16383 & param4];
        float var10 = mla.field_p[param4 & 16383];
        float var11 = mla.field_s[param5 & 16383];
        float var12 = mla.field_p[16383 & param5];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        ((oj) this).field_g = var14 * var10 + var11 * var9;
        ((oj) this).field_f = -var8;
        ((oj) this).field_l = var10 * var7;
        ((oj) this).field_c = var12 * var7;
        ((oj) this).field_i = var7 * var11;
        ((oj) this).field_n = var10 * var13 + var12 * -var9;
        ((oj) this).field_h = var9 * var7;
        ((oj) this).field_e = var12 * var10 + var13 * var9;
        ((oj) this).field_m = var14 * var9 + var11 * -var10;
        ((oj) this).field_j = -((float)param1 * ((oj) this).field_c) + (float)(-param0) * ((oj) this).field_g - (float)param2 * ((oj) this).field_m;
        ((oj) this).field_k = -(((oj) this).field_h * (float)param2) + (-(((oj) this).field_f * (float)param1) + ((oj) this).field_l * (float)(-param0));
        ((oj) this).field_d = ((oj) this).field_n * (float)(-param0) - ((oj) this).field_i * (float)param1 - (float)param2 * ((oj) this).field_e;
    }

    final float[] a(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              param0[3] = ((oj) this).field_j;
              param0[15] = 1.0f;
              if (param1 == 22) {
                break L1;
              } else {
                ((oj) this).field_d = -0.7088243961334229f;
                break L1;
              }
            }
            param0[2] = ((oj) this).field_m;
            param0[13] = 0.0f;
            param0[5] = ((oj) this).field_i;
            param0[11] = ((oj) this).field_k;
            param0[0] = ((oj) this).field_g;
            param0[9] = ((oj) this).field_f;
            param0[12] = 0.0f;
            param0[6] = ((oj) this).field_e;
            param0[10] = ((oj) this).field_h;
            param0[14] = 0.0f;
            param0[8] = ((oj) this).field_l;
            param0[7] = ((oj) this).field_d;
            param0[1] = ((oj) this).field_c;
            param0[4] = ((oj) this).field_n;
            stackOut_2_0 = (float[]) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.CA(");
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
        return stackIn_3_0;
    }

    final void a(float[] param0, float param1, byte param2, float param3, float param4, float param5) {
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
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 67) {
                break L1;
              } else {
                ((oj) this).field_f = -1.5288702249526978f;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param5 > 0.00390625f) {
                  break L3;
                } else {
                  if (-0.00390625f <= param5) {
                    L4: {
                      if (param1 > 0.00390625f) {
                        break L4;
                      } else {
                        if (param1 >= -0.00390625f) {
                          var10 = -param3 / param4;
                          var9 = ((oj) this).field_k + var10 * ((oj) this).field_h;
                          var8 = ((oj) this).field_e * var10 + ((oj) this).field_d;
                          var7_float = ((oj) this).field_j + var10 * ((oj) this).field_m;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var10 = -param3 / param1;
                    var7_float = var10 * ((oj) this).field_c + ((oj) this).field_j;
                    var9 = var10 * ((oj) this).field_f + ((oj) this).field_k;
                    var8 = var10 * ((oj) this).field_i + ((oj) this).field_d;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = -param3 / param5;
              var8 = var10 * ((oj) this).field_n + ((oj) this).field_d;
              var7_float = var10 * ((oj) this).field_g + ((oj) this).field_j;
              var9 = ((oj) this).field_l * var10 + ((oj) this).field_k;
              break L2;
            }
            param0[1] = ((oj) this).field_e * param4 + (((oj) this).field_i * param1 + ((oj) this).field_n * param5);
            param0[2] = param4 * ((oj) this).field_h + (((oj) this).field_l * param5 + param1 * ((oj) this).field_f);
            param0[0] = param4 * ((oj) this).field_m + (param5 * ((oj) this).field_g + ((oj) this).field_c * param1);
            param0[3] = -(var9 * param0[2] + (param0[0] * var7_float + var8 * param0[1]));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("oj.H(");
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != -80) {
          ((oj) this).field_d = -0.43025723099708557f;
          ((oj) this).field_g = 1.0f;
          ((oj) this).field_h = mla.field_s[param1 & 16383];
          ((oj) this).field_i = mla.field_s[param1 & 16383];
          ((oj) this).field_f = mla.field_p[16383 & param1];
          ((oj) this).field_n = 0.0f;
          ((oj) this).field_k = 0.0f;
          ((oj) this).field_m = 0.0f;
          ((oj) this).field_c = 0.0f;
          ((oj) this).field_d = 0.0f;
          ((oj) this).field_l = 0.0f;
          ((oj) this).field_e = -((oj) this).field_f;
          ((oj) this).field_j = 0.0f;
          return;
        } else {
          ((oj) this).field_g = 1.0f;
          ((oj) this).field_h = mla.field_s[param1 & 16383];
          ((oj) this).field_i = mla.field_s[param1 & 16383];
          ((oj) this).field_f = mla.field_p[16383 & param1];
          ((oj) this).field_n = 0.0f;
          ((oj) this).field_k = 0.0f;
          ((oj) this).field_m = 0.0f;
          ((oj) this).field_c = 0.0f;
          ((oj) this).field_d = 0.0f;
          ((oj) this).field_l = 0.0f;
          ((oj) this).field_e = -((oj) this).field_f;
          ((oj) this).field_j = 0.0f;
          return;
        }
    }

    final void a(float param0, float param1, int param2, float param3) {
        ((oj) this).field_d = param1;
        if (param2 < 44) {
          return;
        } else {
          ((oj) this).field_f = 0.0f;
          ((oj) this).field_l = 0.0f;
          ((oj) this).field_h = 1.0f;
          ((oj) this).field_n = 0.0f;
          ((oj) this).field_j = param0;
          ((oj) this).field_c = 0.0f;
          ((oj) this).field_e = 0.0f;
          ((oj) this).field_k = param3;
          ((oj) this).field_m = 0.0f;
          ((oj) this).field_i = 1.0f;
          ((oj) this).field_g = 1.0f;
          return;
        }
    }

    final void a(float param0, float param1, byte param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
        ((oj) this).field_h = param8;
        ((oj) this).field_g = param3;
        ((oj) this).field_k = 0.0f;
        ((oj) this).field_c = param9;
        ((oj) this).field_m = param1;
        int var11 = 123 / ((param2 - 40) / 58);
        ((oj) this).field_d = 0.0f;
        ((oj) this).field_i = param6;
        ((oj) this).field_l = param0;
        ((oj) this).field_e = param4;
        ((oj) this).field_j = 0.0f;
        ((oj) this).field_f = param5;
        ((oj) this).field_n = param7;
    }

    final void a(int param0) {
        ((oj) this).field_l = -((oj) this).field_l;
        ((oj) this).field_h = -((oj) this).field_h;
        ((oj) this).field_k = -((oj) this).field_k;
        ((oj) this).field_f = -((oj) this).field_f;
        ((oj) this).field_i = -((oj) this).field_i;
        ((oj) this).field_n = -((oj) this).field_n;
        if (param0 != 16489) {
          ((oj) this).field_i = 1.4025397300720215f;
          ((oj) this).field_d = -((oj) this).field_d;
          ((oj) this).field_e = -((oj) this).field_e;
          return;
        } else {
          ((oj) this).field_d = -((oj) this).field_d;
          ((oj) this).field_e = -((oj) this).field_e;
          return;
        }
    }

    final void a(int param0, pw param1) {
        RuntimeException var3 = null;
        oj var4 = null;
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
              var4 = (oj) (Object) param1;
              ((oj) this).field_m = var4.field_l;
              ((oj) this).field_c = var4.field_n;
              ((oj) this).field_g = var4.field_g;
              ((oj) this).field_e = var4.field_f;
              ((oj) this).field_n = var4.field_c;
              ((oj) this).field_i = var4.field_i;
              ((oj) this).field_l = var4.field_m;
              ((oj) this).field_h = var4.field_h;
              ((oj) this).field_f = var4.field_e;
              ((oj) this).field_j = -(var4.field_k * ((oj) this).field_m + (((oj) this).field_c * var4.field_d + var4.field_j * ((oj) this).field_g));
              ((oj) this).field_d = -(var4.field_j * ((oj) this).field_n + ((oj) this).field_i * var4.field_d + ((oj) this).field_e * var4.field_k);
              if (param0 == -25609) {
                break L1;
              } else {
                ((oj) this).field_d = -1.8182164430618286f;
                break L1;
              }
            }
            ((oj) this).field_k = -(((oj) this).field_f * var4.field_d + ((oj) this).field_l * var4.field_j + ((oj) this).field_h * var4.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((oj) this).field_d = (float)param1;
        ((oj) this).field_f = 0.0f;
        ((oj) this).field_e = 0.0f;
        ((oj) this).field_h = 1.0f;
        ((oj) this).field_i = 1.0f;
        ((oj) this).field_c = 0.0f;
        ((oj) this).field_l = 0.0f;
        if (param2 >= -45) {
          oj.b(-43);
          ((oj) this).field_j = (float)param0;
          ((oj) this).field_k = (float)param3;
          ((oj) this).field_g = 1.0f;
          ((oj) this).field_m = 0.0f;
          ((oj) this).field_n = 0.0f;
          return;
        } else {
          ((oj) this).field_j = (float)param0;
          ((oj) this).field_k = (float)param3;
          ((oj) this).field_g = 1.0f;
          ((oj) this).field_m = 0.0f;
          ((oj) this).field_n = 0.0f;
          return;
        }
    }

    final float[] a(byte param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              param1[12] = 0.0f;
              param1[3] = 0.0f;
              param1[7] = 0.0f;
              param1[2] = ((oj) this).field_m;
              param1[9] = ((oj) this).field_f;
              param1[10] = ((oj) this).field_h;
              param1[14] = 0.0f;
              param1[15] = 0.0f;
              param1[0] = ((oj) this).field_g;
              param1[1] = ((oj) this).field_c;
              param1[6] = ((oj) this).field_e;
              param1[13] = 0.0f;
              param1[11] = 0.0f;
              param1[4] = ((oj) this).field_n;
              param1[8] = ((oj) this).field_l;
              param1[5] = ((oj) this).field_i;
              if (param0 == -4) {
                break L1;
              } else {
                ((oj) this).field_f = 1.1912505626678467f;
                break L1;
              }
            }
            stackOut_2_0 = (float[]) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.P(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(pw param0, pw param1, boolean param2) {
        RuntimeException var4 = null;
        oj var5 = null;
        oj var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var6 = (oj) (Object) param1;
              if (param2) {
                break L1;
              } else {
                oj.a((byte) -123, false, 91);
                break L1;
              }
            }
            var5 = (oj) (Object) param0;
            ((oj) this).field_g = var6.field_m * var5.field_l + (var5.field_n * var6.field_c + var6.field_g * var5.field_g);
            ((oj) this).field_n = var6.field_n * var5.field_g + var5.field_n * var6.field_i + var5.field_l * var6.field_e;
            ((oj) this).field_l = var5.field_l * var6.field_h + (var6.field_f * var5.field_n + var5.field_g * var6.field_l);
            ((oj) this).field_c = var5.field_i * var6.field_c + var5.field_c * var6.field_g + var6.field_m * var5.field_f;
            ((oj) this).field_i = var6.field_n * var5.field_c + var5.field_i * var6.field_i + var5.field_f * var6.field_e;
            ((oj) this).field_f = var6.field_h * var5.field_f + (var5.field_i * var6.field_f + var6.field_l * var5.field_c);
            ((oj) this).field_m = var6.field_m * var5.field_h + (var5.field_m * var6.field_g + var5.field_e * var6.field_c);
            ((oj) this).field_e = var6.field_n * var5.field_m + var5.field_e * var6.field_i + var6.field_e * var5.field_h;
            ((oj) this).field_h = var5.field_e * var6.field_f + var6.field_l * var5.field_m + var6.field_h * var5.field_h;
            ((oj) this).field_j = var6.field_j + (var5.field_j * var6.field_g + var6.field_c * var5.field_d + var5.field_k * var6.field_m);
            ((oj) this).field_d = var6.field_d + (var6.field_i * var5.field_d + var5.field_j * var6.field_n + var6.field_e * var5.field_k);
            ((oj) this).field_k = var6.field_k + (var5.field_d * var6.field_f + var6.field_l * var5.field_j + var6.field_h * var5.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("oj.I(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, float param1, float param2, float param3) {
        ((oj) this).field_l = 0.0f;
        ((oj) this).field_g = param1;
        ((oj) this).field_k = 0.0f;
        if (param0 != 5557) {
          return;
        } else {
          ((oj) this).field_n = 0.0f;
          ((oj) this).field_m = 0.0f;
          ((oj) this).field_i = param2;
          ((oj) this).field_c = 0.0f;
          ((oj) this).field_d = 0.0f;
          ((oj) this).field_f = 0.0f;
          ((oj) this).field_h = param3;
          ((oj) this).field_j = 0.0f;
          ((oj) this).field_e = 0.0f;
          return;
        }
    }

    final void c(int param0) {
        ((oj) this).field_j = 0.0f;
        ((oj) this).field_i = 1.0f;
        ((oj) this).field_d = 0.0f;
        ((oj) this).field_g = 1.0f;
        ((oj) this).field_f = 0.0f;
        ((oj) this).field_h = (float)param0;
        ((oj) this).field_k = 0.0f;
        ((oj) this).field_m = 0.0f;
        ((oj) this).field_c = 0.0f;
        ((oj) this).field_l = 0.0f;
        ((oj) this).field_e = 0.0f;
        ((oj) this).field_n = 0.0f;
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param0 == -127) {
          if (null == crb.field_v) {
            return;
          } else {
            L0: {
              var3 = crb.field_v.c(param1, -8703);
              if (var3 == -2) {
                break L0;
              } else {
                L1: {
                  if (-1 != var3) {
                    var4 = crb.field_v.e((byte) -108) ? 1 : 0;
                    vga.a(var3, (byte) -119, crb.field_v.i(0), crb.field_v.field_yb, param2, var4 != 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                crb.field_v = null;
                int discarded$2 = 0;
                lnb.d();
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0, pw param1) {
        oj var3 = null;
        try {
            var3 = (oj) (Object) param1;
            ((oj) this).field_i = var3.field_i;
            ((oj) this).field_n = var3.field_n;
            ((oj) this).field_k = 0.0f;
            ((oj) this).field_g = var3.field_g;
            ((oj) this).field_f = var3.field_f;
            ((oj) this).field_c = var3.field_c;
            ((oj) this).field_m = var3.field_m;
            ((oj) this).field_l = var3.field_l;
            ((oj) this).field_e = var3.field_e;
            ((oj) this).field_d = 0.0f;
            ((oj) this).field_h = var3.field_h;
            ((oj) this).field_j = (float)param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "oj.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final float[] c(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              param0[9] = ((oj) this).field_d;
              if (param1 <= -7) {
                break L1;
              } else {
                ((oj) this).field_m = 0.04084920510649681f;
                break L1;
              }
            }
            param0[3] = 0.0f;
            param0[14] = 0.0f;
            param0[8] = ((oj) this).field_j;
            param0[2] = 0.0f;
            param0[15] = 1.0f;
            param0[1] = ((oj) this).field_n;
            param0[12] = 0.0f;
            param0[4] = ((oj) this).field_c;
            param0[5] = ((oj) this).field_i;
            param0[0] = ((oj) this).field_g;
            param0[13] = 0.0f;
            param0[6] = 0.0f;
            param0[7] = 0.0f;
            param0[10] = ((oj) this).field_k;
            param0[11] = 0.0f;
            stackOut_2_0 = (float[]) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.U(");
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
        return stackIn_3_0;
    }

    oj() {
        ((oj) this).c(1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new clb();
    }
}
