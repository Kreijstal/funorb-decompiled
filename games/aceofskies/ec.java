/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ao {
    private float field_j;
    private float field_q;
    private float field_p;
    private float field_u;
    static int[] field_m;
    private float field_h;
    private float field_k;
    static int field_g;
    private float field_i;
    private float field_l;
    private float field_s;
    static String field_o;
    private float field_f;
    static int field_t;
    private float field_r;
    static pa[] field_e;
    private float field_n;

    final static void a(int param0, int param1, ll[] param2, int param3, int param4, hc param5, int param6, ll[] param7, ll[] param8, int param9, int param10, int param11, int param12, int param13, int param14) {
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
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        try {
          L0: {
            var15_int = param5.field_C + param5.field_D;
            var16 = param5.field_C;
            uu.a(param4, var15_int, param10, -28265, 480, param3, param7, var15_int, var16, param6, param2, param9, param12, param5, param8, param5, var16, param1, param14, param13, param0);
            if (param11 > 17) {
              break L0;
            } else {
              field_o = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var15 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var15);

            stackIn_5_1 = new StringBuilder().append("ec.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final void b(float param0, float param1, float param2, int param3) {
        this.field_k = 0.0f;
        this.field_s = 0.0f;
        this.field_u = 0.0f;
        this.field_j = param2;
        this.field_h = 0.0f;
        this.field_f = param0;
        this.field_q = 0.0f;
        this.field_r = 0.0f;
        this.field_p = 0.0f;
        this.field_l = param1;
        this.field_i = 0.0f;
        int var5 = -22 % ((-28 - param3) / 45);
        this.field_n = 0.0f;
    }

    final void a(int param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
        this.field_f = param7;
        this.field_l = param4;
        if (param0 != -9596) {
          return;
        } else {
          this.field_h = 0.0f;
          this.field_j = param3;
          this.field_q = 0.0f;
          this.field_n = param2;
          this.field_k = 0.0f;
          this.field_s = param9;
          this.field_p = param6;
          this.field_r = param1;
          this.field_i = param8;
          this.field_u = param5;
          return;
        }
    }

    final float[] c(float[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0[7] = this.field_q;
            param0[0] = this.field_l;
            param0[11] = this.field_h;
            param0[10] = this.field_j;
            param0[4] = this.field_s;
            param0[1] = this.field_n;
            param0[13] = 0.0f;
            param0[12] = 0.0f;
            param0[14] = 0.0f;
            param0[15] = 1.0f;
            param0[3] = this.field_k;
            param0[6] = this.field_p;
            var3_int = -122 / ((param1 - -20) / 44);
            param0[5] = this.field_f;
            param0[9] = this.field_u;
            param0[8] = this.field_r;
            param0[2] = this.field_i;
            stackIn_1_0 = (float[]) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ec.R(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final float[] a(float[] param0, int param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0[11] = 0.0f;
              if (param1 >= 19) {
                break L1;
              } else {
                this.field_j = -0.5310285687446594f;
                break L1;
              }
            }
            param0[4] = this.field_s;
            param0[5] = this.field_f;
            param0[7] = 0.0f;
            param0[2] = this.field_i;
            param0[9] = this.field_u;
            param0[6] = this.field_p;
            param0[3] = 0.0f;
            param0[10] = this.field_j;
            param0[8] = this.field_r;
            param0[0] = this.field_l;
            param0[13] = 0.0f;
            param0[15] = 0.0f;
            param0[1] = this.field_n;
            param0[12] = 0.0f;
            param0[14] = 0.0f;
            stackIn_3_0 = (float[]) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ec.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String b(byte param0) {
        if (!(fj.field_a != null)) {
            return "";
        }
        if (param0 > -116) {
            return (String) null;
        }
        return fj.field_a;
    }

    final float[] b(float[] param0, int param1) {
        RuntimeException var3 = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0[5] = this.field_f;
              param0[10] = this.field_h;
              param0[6] = 0.0f;
              param0[2] = 0.0f;
              param0[9] = this.field_q;
              if (param1 == 3911) {
                break L1;
              } else {
                var4 = (float[]) null;
                this.a(-0.6887861490249634f, 1.046116590499878f, (float[]) null, 3.051898241043091f, -1.188960313796997f, 89);
                break L1;
              }
            }
            param0[7] = 0.0f;
            param0[12] = 0.0f;
            param0[15] = 1.0f;
            param0[0] = this.field_l;
            param0[1] = this.field_s;
            param0[4] = this.field_n;
            param0[14] = 0.0f;
            param0[13] = 0.0f;
            param0[11] = 0.0f;
            param0[8] = this.field_k;
            param0[3] = 0.0f;
            stackIn_3_0 = (float[]) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ec.P(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(ao param0, boolean param1) {
        ec var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (ec) ((Object) param0);
            this.field_q = var3.field_q;
            this.field_l = var3.field_l;
            this.field_s = var3.field_s;
            this.field_u = var3.field_u;
            this.field_j = var3.field_j;
            this.field_f = var3.field_f;
            this.field_r = var3.field_r;
            this.field_k = var3.field_k;
            this.field_p = var3.field_p;
            this.field_n = var3.field_n;
            this.field_i = var3.field_i;
            this.field_h = var3.field_h;
            if (param1) {
              break L0;
            } else {
              field_m = (int[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("ec.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final float[] a(boolean param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1[3] = this.field_k;
              if (!param0) {
                break L1;
              } else {
                this.field_j = -0.9808043837547302f;
                break L1;
              }
            }
            param1[1] = this.field_n;
            param1[5] = this.field_f;
            param1[4] = this.field_s;
            param1[0] = this.field_l;
            param1[7] = this.field_q;
            param1[2] = this.field_i;
            param1[6] = this.field_p;
            stackIn_3_0 = (float[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ec.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.field_j = 1.0f;
        this.field_r = 0.0f;
        this.field_s = 0.0f;
        this.field_n = 0.0f;
        this.field_f = 1.0f;
        this.field_i = 0.0f;
        this.field_q = (float)param3;
        this.field_k = (float)param2;
        if (param1 != 106) {
          field_o = (String) null;
          this.field_p = 0.0f;
          this.field_h = (float)param0;
          this.field_u = 0.0f;
          this.field_l = 1.0f;
          return;
        } else {
          this.field_p = 0.0f;
          this.field_h = (float)param0;
          this.field_u = 0.0f;
          this.field_l = 1.0f;
          return;
        }
    }

    final void a(ao param0, byte param1) {
        ec var3 = null;
        try {
            var3 = (ec) ((Object) param0);
            this.field_i = var3.field_i;
            this.field_h = 0.0f;
            this.field_r = var3.field_r;
            this.field_s = var3.field_s;
            this.field_p = var3.field_p;
            this.field_j = var3.field_j;
            if (param1 >= -105) {
                this.a((byte) -34);
            }
            this.field_f = var3.field_f;
            this.field_n = var3.field_n;
            this.field_l = var3.field_l;
            this.field_q = 0.0f;
            this.field_u = var3.field_u;
            this.field_k = 0.0f;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ec.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(float param0, float param1, float param2, int param3) {
        this.field_q = this.field_q * param0;
        this.field_p = this.field_p * param0;
        this.field_k = this.field_k * param2;
        this.field_j = this.field_j * param1;
        this.field_i = this.field_i * param2;
        this.field_f = this.field_f * param0;
        this.field_l = this.field_l * param2;
        if (param3 != 0) {
          this.field_u = 0.663159966468811f;
          this.field_h = this.field_h * param1;
          this.field_r = this.field_r * param1;
          this.field_s = this.field_s * param0;
          this.field_n = this.field_n * param2;
          this.field_u = this.field_u * param1;
          return;
        } else {
          this.field_h = this.field_h * param1;
          this.field_r = this.field_r * param1;
          this.field_s = this.field_s * param0;
          this.field_n = this.field_n * param2;
          this.field_u = this.field_u * param1;
          return;
        }
    }

    final void a(float param0, float[] param1, int param2, float param3, float param4) {
        try {
            param1[0] = param0 * this.field_n + param4 * this.field_l + this.field_i * param3;
            param1[2] = param0 * this.field_u + this.field_r * param4 + this.field_j * param3;
            param1[1] = this.field_f * param0 + param4 * this.field_s + param3 * this.field_p;
            if (param2 != -11232) {
                float[] var7 = (float[]) null;
                this.b((float[]) null, 45);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ec.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final float[] a(float[] param0, boolean param1) {
        RuntimeException var3 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0[3] = 0.0f;
            param0[9] = this.field_p;
            param0[15] = 1.0f;
            param0[1] = this.field_s;
            param0[4] = this.field_n;
            param0[7] = 0.0f;
            param0[2] = this.field_r;
            param0[12] = this.field_k;
            if (param1) {
              param0[11] = 0.0f;
              param0[10] = this.field_j;
              param0[8] = this.field_i;
              param0[0] = this.field_l;
              param0[14] = this.field_h;
              param0[6] = this.field_u;
              param0[5] = this.field_f;
              param0[13] = this.field_q;
              stackIn_4_0 = (float[]) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (float[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ec.G(");

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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(ao param0, byte param1, ao param2) {
        ec var6 = null;
        ec var5 = null;
        try {
            var6 = (ec) ((Object) param0);
            var5 = (ec) ((Object) param2);
            this.field_l = var6.field_n * var5.field_s + var6.field_l * var5.field_l + var6.field_i * var5.field_r;
            this.field_s = var5.field_s * var6.field_f + var6.field_s * var5.field_l + var6.field_p * var5.field_r;
            this.field_n = var5.field_n * var6.field_l + var6.field_n * var5.field_f + var6.field_i * var5.field_u;
            if (param1 >= -5) {
                this.field_q = 0.6797500252723694f;
            }
            this.field_r = var6.field_r * var5.field_l + var6.field_u * var5.field_s + var5.field_r * var6.field_j;
            this.field_f = var6.field_s * var5.field_n + var5.field_f * var6.field_f + var6.field_p * var5.field_u;
            this.field_u = var6.field_u * var5.field_f + var6.field_r * var5.field_n + var5.field_u * var6.field_j;
            this.field_i = var5.field_p * var6.field_n + var6.field_l * var5.field_i + var6.field_i * var5.field_j;
            this.field_p = var5.field_j * var6.field_p + (var5.field_i * var6.field_s + var5.field_p * var6.field_f);
            this.field_j = var5.field_p * var6.field_u + var6.field_r * var5.field_i + var5.field_j * var6.field_j;
            this.field_k = var6.field_n * var5.field_q + var5.field_k * var6.field_l + var6.field_i * var5.field_h + var6.field_k;
            this.field_q = var6.field_q + (var6.field_f * var5.field_q + var6.field_s * var5.field_k + var6.field_p * var5.field_h);
            this.field_h = var6.field_h + (var5.field_q * var6.field_u + var6.field_r * var5.field_k + var6.field_j * var5.field_h);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ec.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_l = (float)param1;
        float dupTemp$0 = qe.field_a[param0 & 16383];
        this.field_j = dupTemp$0;
        this.field_f = dupTemp$0;
        this.field_u = qe.field_i[param0 & 16383];
        this.field_r = 0.0f;
        this.field_k = 0.0f;
        this.field_q = 0.0f;
        this.field_n = 0.0f;
        this.field_p = -this.field_u;
        this.field_i = 0.0f;
        this.field_h = 0.0f;
        this.field_s = 0.0f;
    }

    final void b(float param0, byte param1, float param2, float param3) {
        if (param1 > -122) {
          field_o = (String) null;
          this.field_k = this.field_k + param3;
          this.field_h = this.field_h + param2;
          this.field_q = this.field_q + param0;
          return;
        } else {
          this.field_k = this.field_k + param3;
          this.field_h = this.field_h + param2;
          this.field_q = this.field_q + param0;
          return;
        }
    }

    final void a(float param0, byte param1, float param2, float param3) {
        this.field_h = param3;
        this.field_q = param2;
        this.field_i = 0.0f;
        this.field_r = 0.0f;
        this.field_n = 0.0f;
        if (param1 != 107) {
          ec.b(47);
          this.field_s = 0.0f;
          this.field_k = param0;
          this.field_f = 1.0f;
          this.field_l = 1.0f;
          this.field_j = 1.0f;
          this.field_p = 0.0f;
          this.field_u = 0.0f;
          return;
        } else {
          this.field_s = 0.0f;
          this.field_k = param0;
          this.field_f = 1.0f;
          this.field_l = 1.0f;
          this.field_j = 1.0f;
          this.field_p = 0.0f;
          this.field_u = 0.0f;
          return;
        }
    }

    final void a(byte param0) {
        this.field_s = 0.0f;
        this.field_n = 0.0f;
        if (param0 != -59) {
          return;
        } else {
          this.field_h = 0.0f;
          this.field_f = 1.0f;
          this.field_r = 0.0f;
          this.field_k = 0.0f;
          this.field_j = 1.0f;
          this.field_u = 0.0f;
          this.field_i = 0.0f;
          this.field_l = 1.0f;
          this.field_q = 0.0f;
          this.field_p = 0.0f;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 15 / ((-40 - param3) / 51);
        this.field_k = this.field_k + (float)param1;
        this.field_h = this.field_h + (float)param2;
        this.field_q = this.field_q + (float)param0;
    }

    ec() {
        this.a((byte) -59);
    }

    final void a(float param0, float param1, float[] param2, float param3, float param4, int param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 11) {
                break L1;
              } else {
                field_m = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param2[0] = this.field_i * param3 + (param1 * this.field_n + param0 * this.field_l);
                if (0.00390625f < param0) {
                  break L3;
                } else {
                  if (-0.00390625f > param0) {
                    break L3;
                  } else {
                    L4: {
                      if (0.00390625f < param1) {
                        break L4;
                      } else {
                        if (param1 >= -0.00390625f) {
                          var10 = -param4 / param3;
                          var8 = this.field_q + this.field_p * var10;
                          var9 = this.field_j * var10 + this.field_h;
                          var7_float = this.field_k + this.field_i * var10;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var10 = -param4 / param1;
                    var7_float = this.field_k + var10 * this.field_n;
                    var8 = var10 * this.field_f + this.field_q;
                    var9 = this.field_u * var10 + this.field_h;
                    break L2;
                  }
                }
              }
              var10 = -param4 / param0;
              var7_float = this.field_k + this.field_l * var10;
              var8 = this.field_q + this.field_s * var10;
              var9 = this.field_h + var10 * this.field_r;
              break L2;
            }
            param2[1] = this.field_p * param3 + (this.field_s * param0 + this.field_f * param1);
            param2[2] = param0 * this.field_r + this.field_u * param1 + this.field_j * param3;
            param2[3] = -(param2[2] * var9 + (var8 * param2[1] + var7_float * param2[0]));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("ec.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
        field_o = null;
    }

    static {
        field_m = new int[8192];
        field_o = "Logging in...";
        field_g = -1;
    }
}
