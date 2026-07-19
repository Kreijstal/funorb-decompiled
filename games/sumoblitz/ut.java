/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ut extends eu {
    private float field_g;
    private float field_e;
    private float field_f;
    static int field_j;
    private float field_h;
    private float field_c;
    private float field_i;
    private float field_n;
    static bj field_o;
    private float field_d;
    private float field_k;
    private float field_b;
    private float field_l;
    private float field_m;

    final void a(int param0, float param1, float param2, float[] param3, float param4) {
        try {
            param3[2] = this.field_l * param2 + param1 * this.field_c + this.field_e * param4;
            if (param0 != -1416) {
                this.b(-0.36476919054985046f, -0.9391811490058899f, -41, 1.2040667533874512f);
            }
            param3[0] = param1 * this.field_m + param2 * this.field_i + this.field_b * param4;
            param3[1] = this.field_g * param1 + this.field_h * param2 + this.field_f * param4;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ut.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1) {
        eu var4 = null;
        this.field_i = 1.0f;
        this.field_e = hg.field_l[param1 & 16383];
        this.field_g = hg.field_l[param1 & 16383];
        this.field_c = hg.field_k[16383 & param1];
        this.field_m = 0.0f;
        if (param0 <= 33) {
          var4 = (eu) null;
          this.a((eu) null, false);
          this.field_f = -this.field_c;
          this.field_l = 0.0f;
          this.field_d = 0.0f;
          this.field_h = 0.0f;
          this.field_k = 0.0f;
          this.field_n = 0.0f;
          this.field_b = 0.0f;
          return;
        } else {
          this.field_f = -this.field_c;
          this.field_l = 0.0f;
          this.field_d = 0.0f;
          this.field_h = 0.0f;
          this.field_k = 0.0f;
          this.field_n = 0.0f;
          this.field_b = 0.0f;
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        float[] var6 = null;
        if (param2 <= 96) {
          var6 = (float[]) null;
          this.a(1.5263985395431519f, (float[]) null, (byte) -111, 0.11366769671440125f, -1.3526464700698853f, -1.8221346139907837f);
          this.field_n = this.field_n + (float)param1;
          this.field_d = this.field_d + (float)param0;
          this.field_k = this.field_k + (float)param3;
          return;
        } else {
          this.field_n = this.field_n + (float)param1;
          this.field_d = this.field_d + (float)param0;
          this.field_k = this.field_k + (float)param3;
          return;
        }
    }

    final void a(int param0) {
        this.field_g = 1.0f;
        this.field_d = 0.0f;
        this.field_n = 0.0f;
        this.field_i = 1.0f;
        this.field_f = 0.0f;
        this.field_h = 0.0f;
        this.field_l = 0.0f;
        this.field_e = (float)param0;
        this.field_m = 0.0f;
        this.field_b = 0.0f;
        this.field_k = 0.0f;
        this.field_c = 0.0f;
    }

    final float[] a(int param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_0_0 = null;
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
            param1[3] = this.field_n;
            param1[13] = 0.0f;
            param1[7] = this.field_d;
            param1[6] = this.field_f;
            param1[14] = 0.0f;
            param1[12] = (float)param0;
            param1[5] = this.field_g;
            param1[2] = this.field_b;
            param1[8] = this.field_l;
            param1[1] = this.field_m;
            param1[9] = this.field_c;
            param1[15] = 1.0f;
            param1[0] = this.field_i;
            param1[10] = this.field_e;
            param1[11] = this.field_k;
            param1[4] = this.field_h;
            stackOut_0_0 = (float[]) (param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ut.N(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, eu param1) {
        ut var3 = null;
        try {
            var3 = (ut) ((Object) param1);
            if (param0 != 0) {
                this.field_d = -0.26415005326271057f;
            }
            this.field_d = var3.field_d;
            this.field_m = var3.field_m;
            this.field_k = var3.field_k;
            this.field_g = var3.field_g;
            this.field_n = var3.field_n;
            this.field_i = var3.field_i;
            this.field_b = var3.field_b;
            this.field_e = var3.field_e;
            this.field_h = var3.field_h;
            this.field_c = var3.field_c;
            this.field_l = var3.field_l;
            this.field_f = var3.field_f;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ut.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final float[] b(int param0, float[] param1) {
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
              param1[8] = this.field_b;
              param1[4] = this.field_m;
              param1[9] = this.field_f;
              if (param0 < -55) {
                break L1;
              } else {
                this.field_d = -0.7466111183166504f;
                break L1;
              }
            }
            param1[6] = this.field_c;
            param1[11] = 0.0f;
            param1[12] = this.field_n;
            param1[15] = 1.0f;
            param1[13] = this.field_d;
            param1[1] = this.field_h;
            param1[7] = 0.0f;
            param1[2] = this.field_l;
            param1[5] = this.field_g;
            param1[14] = this.field_k;
            param1[10] = this.field_e;
            param1[3] = 0.0f;
            param1[0] = this.field_i;
            stackOut_2_0 = (float[]) (param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ut.R(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void b(float param0, float param1, int param2, float param3) {
        this.field_f = (float)param2;
        this.field_e = param3;
        this.field_b = 0.0f;
        this.field_c = 0.0f;
        this.field_l = 0.0f;
        this.field_h = 0.0f;
        this.field_n = 0.0f;
        this.field_m = 0.0f;
        this.field_g = param0;
        this.field_d = 0.0f;
        this.field_i = param1;
        this.field_k = 0.0f;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        this.field_l = param6;
        this.field_h = param2;
        this.field_i = param3;
        if (param9 != 18356) {
          this.field_i = 0.5659931898117065f;
          this.field_b = param4;
          this.field_m = param0;
          this.field_c = param8;
          this.field_n = 0.0f;
          this.field_g = param1;
          this.field_f = param7;
          this.field_e = param5;
          this.field_d = 0.0f;
          this.field_k = 0.0f;
          return;
        } else {
          this.field_b = param4;
          this.field_m = param0;
          this.field_c = param8;
          this.field_n = 0.0f;
          this.field_g = param1;
          this.field_f = param7;
          this.field_e = param5;
          this.field_d = 0.0f;
          this.field_k = 0.0f;
          return;
        }
    }

    final void a(eu param0, boolean param1) {
        ut var3 = (ut) ((Object) param0);
        this.field_b = var3.field_b;
        this.field_n = 0.0f;
        this.field_m = var3.field_m;
        this.field_g = var3.field_g;
        if (!param1) {
            return;
        }
        try {
            this.field_h = var3.field_h;
            this.field_l = var3.field_l;
            this.field_i = var3.field_i;
            this.field_k = 0.0f;
            this.field_c = var3.field_c;
            this.field_f = var3.field_f;
            this.field_e = var3.field_e;
            this.field_d = 0.0f;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ut.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(float param0, float param1, float param2, int param3) {
        this.field_l = 0.0f;
        this.field_c = 0.0f;
        this.field_h = 0.0f;
        this.field_n = param2;
        this.field_g = 1.0f;
        this.field_i = 1.0f;
        this.field_k = param1;
        this.field_f = (float)param3;
        this.field_b = 0.0f;
        this.field_e = 1.0f;
        this.field_m = 0.0f;
        this.field_d = param0;
    }

    public static void b(byte param0) {
        if (param0 != 49) {
            field_j = 12;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final void a(eu param0, byte param1, eu param2) {
        RuntimeException var4 = null;
        ut var5 = null;
        float[] var6 = null;
        ut var7 = null;
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
              var7 = (ut) ((Object) param0);
              var5 = (ut) ((Object) param2);
              this.field_i = var7.field_b * var5.field_l + (var7.field_m * var5.field_h + var5.field_i * var7.field_i);
              this.field_h = var5.field_l * var7.field_f + (var5.field_i * var7.field_h + var5.field_h * var7.field_g);
              this.field_m = var7.field_i * var5.field_m + var7.field_m * var5.field_g + var5.field_c * var7.field_b;
              this.field_l = var7.field_c * var5.field_h + var7.field_l * var5.field_i + var7.field_e * var5.field_l;
              this.field_g = var5.field_c * var7.field_f + (var5.field_m * var7.field_h + var5.field_g * var7.field_g);
              this.field_c = var5.field_c * var7.field_e + (var5.field_m * var7.field_l + var5.field_g * var7.field_c);
              if (param1 == 77) {
                break L1;
              } else {
                var6 = (float[]) null;
                this.a(-0.4196498990058899f, (float[]) null, (byte) 117, -0.21536625921726227f, 0.6118397116661072f, 0.4896458387374878f);
                break L1;
              }
            }
            this.field_b = var5.field_e * var7.field_b + (var7.field_i * var5.field_b + var7.field_m * var5.field_f);
            this.field_f = var7.field_g * var5.field_f + var7.field_h * var5.field_b + var5.field_e * var7.field_f;
            this.field_e = var5.field_e * var7.field_e + (var7.field_l * var5.field_b + var7.field_c * var5.field_f);
            this.field_n = var5.field_d * var7.field_m + var7.field_i * var5.field_n + var7.field_b * var5.field_k + var7.field_n;
            this.field_d = var7.field_f * var5.field_k + (var5.field_d * var7.field_g + var7.field_h * var5.field_n) + var7.field_d;
            this.field_k = var7.field_k + (var5.field_n * var7.field_l + var7.field_c * var5.field_d + var5.field_k * var7.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("ut.U(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_i = 1.0f;
        this.field_d = (float)param3;
        this.field_f = 0.0f;
        this.field_n = (float)param0;
        this.field_l = 0.0f;
        if (param2) {
          return;
        } else {
          this.field_e = 1.0f;
          this.field_g = 1.0f;
          this.field_k = (float)param1;
          this.field_b = 0.0f;
          this.field_c = 0.0f;
          this.field_m = 0.0f;
          this.field_h = 0.0f;
          return;
        }
    }

    final static void a(int param0, byte param1, tv param2, boolean param3) {
        RuntimeException var4 = null;
        ud stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        tv stackIn_1_3 = null;
        ud stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        tv stackIn_2_3 = null;
        ud stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        tv stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        tv stackOut_0_3 = null;
        ud stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        tv stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        ud stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        tv stackOut_1_3 = null;
        int stackOut_1_4 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = qr.field_b;
              stackOut_0_1 = 1;
              stackOut_0_2 = 1000000;
              stackOut_0_3 = (tv) (param2);
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              if (param3) {
                stackOut_2_0 = (ud) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = (tv) ((Object) stackIn_2_3);
                stackOut_2_4 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                break L1;
              } else {
                stackOut_1_0 = (ud) ((Object) stackIn_1_0);
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = (tv) ((Object) stackIn_1_3);
                stackOut_1_4 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                break L1;
              }
            }
            ((ud) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param0, 256);
            if (param1 == -55) {
              break L0;
            } else {
              ut.b((byte) 32);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("ut.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, float param1, float param2, float param3) {
        if (param0 != 96) {
          this.field_k = 1.0452516078948975f;
          this.field_k = this.field_k + param1;
          this.field_d = this.field_d + param2;
          this.field_n = this.field_n + param3;
          return;
        } else {
          this.field_k = this.field_k + param1;
          this.field_d = this.field_d + param2;
          this.field_n = this.field_n + param3;
          return;
        }
    }

    final float[] a(float[] param0, int param1) {
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
              param0[1] = this.field_h;
              param0[5] = this.field_g;
              param0[0] = this.field_i;
              param0[6] = 0.0f;
              param0[15] = 1.0f;
              param0[7] = 0.0f;
              param0[3] = 0.0f;
              param0[2] = 0.0f;
              param0[10] = this.field_k;
              param0[4] = this.field_m;
              param0[9] = this.field_d;
              param0[11] = 0.0f;
              param0[14] = 0.0f;
              param0[12] = 0.0f;
              param0[8] = this.field_n;
              param0[13] = 0.0f;
              if (param1 > 61) {
                break L1;
              } else {
                this.field_b = -0.7986855506896973f;
                break L1;
              }
            }
            stackOut_2_0 = (float[]) (param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ut.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(float param0, float param1, int param2, float param3) {
        this.field_d = this.field_d * param1;
        this.field_i = this.field_i * param0;
        this.field_k = this.field_k * param3;
        this.field_g = this.field_g * param1;
        this.field_e = this.field_e * param3;
        this.field_b = this.field_b * param0;
        this.field_n = this.field_n * param0;
        this.field_m = this.field_m * param0;
        this.field_h = this.field_h * param1;
        this.field_f = this.field_f * param1;
        this.field_l = this.field_l * param3;
        this.field_c = this.field_c * param3;
        if (param2 > -17) {
            float[] var6 = (float[]) null;
            this.a(-0.1824408620595932f, (float[]) null, (byte) 60, 1.0720683336257935f, 1.3190656900405884f, 0.16522423923015594f);
        }
    }

    final float[] a(float[] param0, byte param1) {
        float[] discarded$2 = null;
        RuntimeException var3 = null;
        float[] var4 = null;
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
              param0[0] = this.field_i;
              param0[2] = this.field_b;
              param0[7] = this.field_d;
              param0[6] = this.field_f;
              param0[5] = this.field_g;
              param0[1] = this.field_m;
              param0[4] = this.field_h;
              param0[3] = this.field_n;
              if (param1 == -37) {
                break L1;
              } else {
                var4 = (float[]) null;
                discarded$2 = this.a(30, (float[]) null);
                break L1;
              }
            }
            stackOut_2_0 = (float[]) (param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ut.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(float param0, float[] param1, byte param2, float param3, float param4, float param5) {
        RuntimeException var7 = null;
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  param1[2] = param4 * this.field_c + this.field_l * param0 + param3 * this.field_e;
                  param1[1] = param4 * this.field_g + param0 * this.field_h + this.field_f * param3;
                  var10 = -16 / ((-36 - param2) / 45);
                  param1[0] = this.field_b * param3 + (param4 * this.field_m + this.field_i * param0);
                  if (param0 > 0.00390625f) {
                    break L3;
                  } else {
                    if (param0 >= -0.00390625f) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var11 = -param5 / param0;
                var9 = this.field_l * var11 + this.field_k;
                var7_float = var11 * this.field_i + this.field_n;
                var8 = this.field_d + this.field_h * var11;
                if (var12 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L4: {
                if (param4 > 0.00390625f) {
                  break L4;
                } else {
                  if (param4 < -0.00390625f) {
                    break L4;
                  } else {
                    var11 = -param5 / param3;
                    var8 = this.field_d + this.field_f * var11;
                    var7_float = this.field_n + var11 * this.field_b;
                    var9 = var11 * this.field_e + this.field_k;
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var11 = -param5 / param4;
              var9 = this.field_k + var11 * this.field_c;
              var7_float = this.field_m * var11 + this.field_n;
              var8 = var11 * this.field_g + this.field_d;
              break L1;
            }
            param1[3] = -(var8 * param1[1] + param1[0] * var7_float + var9 * param1[2]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var7);
            stackOut_11_1 = new StringBuilder().append("ut.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    ut() {
        this.a(1);
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
              param0[9] = this.field_c;
              param0[11] = 0.0f;
              param0[14] = 0.0f;
              param0[10] = this.field_e;
              param0[4] = this.field_h;
              param0[0] = this.field_i;
              param0[5] = this.field_g;
              param0[7] = 0.0f;
              param0[2] = this.field_b;
              param0[12] = 0.0f;
              param0[13] = 0.0f;
              param0[6] = this.field_f;
              param0[3] = 0.0f;
              if (param1 == 86) {
                break L1;
              } else {
                field_o = (bj) null;
                break L1;
              }
            }
            param0[1] = this.field_m;
            param0[15] = 0.0f;
            param0[8] = this.field_l;
            stackOut_2_0 = (float[]) (param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ut.P(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_j = 0;
    }
}
