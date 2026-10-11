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
        this.field_i = 1.0f;
        float dupTemp$0 = hg.field_l[param1 & 16383];
        this.field_e = dupTemp$0;
        this.field_g = dupTemp$0;
        this.field_c = hg.field_k[16383 & param1];
        this.field_m = 0.0f;
        if (param0 > 33) {
          this.field_f = -this.field_c;
          this.field_l = 0.0f;
          this.field_d = 0.0f;
          this.field_h = 0.0f;
          this.field_k = 0.0f;
          this.field_n = 0.0f;
          this.field_b = 0.0f;
          return;
        }
        eu var4 = (eu) null;
        this.a((eu) null, false);
        this.field_f = -this.field_c;
        this.field_l = 0.0f;
        this.field_d = 0.0f;
        this.field_h = 0.0f;
        this.field_k = 0.0f;
        this.field_n = 0.0f;
        this.field_b = 0.0f;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 > 96) {
          this.field_n = this.field_n + (float)param1;
          this.field_d = this.field_d + (float)param0;
          this.field_k = this.field_k + (float)param3;
          return;
        }
        float[] var6 = (float[]) null;
        this.a(1.5263985395431519f, (float[]) null, (byte) -111, 0.11366769671440125f, -1.3526464700698853f, -1.8221346139907837f);
        this.field_n = this.field_n + (float)param1;
        this.field_d = this.field_d + (float)param0;
        this.field_k = this.field_k + (float)param3;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
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
          stackIn_1_0 = (float[]) (param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ut.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void a(int param0, eu param1) {
        ut var3 = null;
        try {
          var3 = (ut) (param1);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1[8] = this.field_b;
          param1[4] = this.field_m;
          param1[9] = this.field_f;
          if (param0 >= -55) {
            this.field_d = -0.7466111183166504f;
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
          stackIn_3_0 = (float[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
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
        if (param9 == 18356) {
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
    }

    final void a(eu param0, boolean param1) {
        ut var3 = (ut) (param0);
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
        ut var7 = null;
        ut var5 = null;
        try {
          var7 = (ut) (param0);
          var5 = (ut) (param2);
          this.field_i = var7.field_b * var5.field_l + (var7.field_m * var5.field_h + var5.field_i * var7.field_i);
          this.field_h = var5.field_l * var7.field_f + (var5.field_i * var7.field_h + var5.field_h * var7.field_g);
          this.field_m = var7.field_i * var5.field_m + var7.field_m * var5.field_g + var5.field_c * var7.field_b;
          this.field_l = var7.field_c * var5.field_h + var7.field_l * var5.field_i + var7.field_e * var5.field_l;
          this.field_g = var5.field_c * var7.field_f + (var5.field_m * var7.field_h + var5.field_g * var7.field_g);
          this.field_c = var5.field_c * var7.field_e + (var5.field_m * var7.field_l + var5.field_g * var7.field_c);
          if (param1 != 77) {
            float[] var6 = (float[]) null;
            this.a(-0.4196498990058899f, (float[]) null, (byte) 117, -0.21536625921726227f, 0.6118397116661072f, 0.4896458387374878f);
          }
          this.field_b = var5.field_e * var7.field_b + (var7.field_i * var5.field_b + var7.field_m * var5.field_f);
          this.field_f = var7.field_g * var5.field_f + var7.field_h * var5.field_b + var5.field_e * var7.field_f;
          this.field_e = var5.field_e * var7.field_e + (var7.field_l * var5.field_b + var7.field_c * var5.field_f);
          this.field_n = var5.field_d * var7.field_m + var7.field_i * var5.field_n + var7.field_b * var5.field_k + var7.field_n;
          this.field_d = var7.field_f * var5.field_k + (var5.field_d * var7.field_g + var7.field_h * var5.field_n) + var7.field_d;
          this.field_k = var7.field_k + (var5.field_n * var7.field_l + var7.field_c * var5.field_d + var5.field_k * var7.field_e);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ut.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_i = 1.0f;
        this.field_d = (float)param3;
        this.field_f = 0.0f;
        this.field_n = (float)param0;
        this.field_l = 0.0f;
        if (!param2) {
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
        ud stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        tv stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = qr.field_b;
          stackIn_2_1 = 1;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = (tv) (param2);
          stackIn_3_4 = !(param3);
          ((ud) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4, param0, 256);
          if (param1 == -55) {
            return;
          }
          ut.b((byte) 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ut.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, float param1, float param2, float param3) {
        if (param0 == 96) {
          this.field_k = this.field_k + param1;
          this.field_d = this.field_d + param2;
          this.field_n = this.field_n + param3;
          return;
        }
        this.field_k = 1.0452516078948975f;
        this.field_k = this.field_k + param1;
        this.field_d = this.field_d + param2;
        this.field_n = this.field_n + param3;
    }

    final float[] a(float[] param0, int param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
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
          if (param1 <= 61) {
            this.field_b = -0.7986855506896973f;
          }
          stackIn_3_0 = (float[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
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
        RuntimeException var3 = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[0] = this.field_i;
          param0[2] = this.field_b;
          param0[7] = this.field_d;
          param0[6] = this.field_f;
          param0[5] = this.field_g;
          param0[1] = this.field_m;
          param0[4] = this.field_h;
          param0[3] = this.field_n;
          if (param1 != -37) {
            var4 = (float[]) null;
            this.a(30, (float[]) null);
          }
          stackIn_3_0 = (float[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(float param0, float[] param1, byte param2, float param3, float param4, float param5) {
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          param1[2] = param4 * this.field_c + this.field_l * param0 + param3 * this.field_e;
          param1[1] = param4 * this.field_g + param0 * this.field_h + this.field_f * param3;
          var10 = -16 / ((-36 - param2) / 45);
          param1[0] = this.field_b * param3 + (param4 * this.field_m + this.field_i * param0);
          if (!(param0 > 0.00390625f) &&
            !(param0 < -0.00390625f)) {
            if (!(param4 > 0.00390625f) &&
              !(param4 < -0.00390625f)) {
              var11 = -param5 / param3;
              var8 = this.field_d + this.field_f * var11;
              var7_float = this.field_n + var11 * this.field_b;
              var9 = var11 * this.field_e + this.field_k;
            } else {
              var11 = -param5 / param4;
              var9 = this.field_k + var11 * this.field_c;
              var7_float = this.field_m * var11 + this.field_n;
              var8 = var11 * this.field_g + this.field_d;
            }
          } else {
            var11 = -param5 / param0;
            var9 = this.field_l * var11 + this.field_k;
            var7_float = var11 * this.field_i + this.field_n;
            var8 = this.field_d + this.field_h * var11;
          }
          param1[3] = -(var8 * param1[1] + param1[0] * var7_float + var9 * param1[2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("ut.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ut() {
        this.a(1);
    }

    final float[] b(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
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
          if (param1 != 86) {
            field_o = (bj) null;
          }
          param0[1] = this.field_m;
          param0[15] = 0.0f;
          param0[8] = this.field_l;
          stackIn_3_0 = (float[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_j = 0;
    }
}
