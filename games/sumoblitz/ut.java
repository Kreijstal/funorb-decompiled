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
        param3[2] = ((ut) this).field_l * param2 + param1 * ((ut) this).field_c + ((ut) this).field_e * param4;
        if (param0 != -1416) {
          ((ut) this).b(-0.36476919054985046f, -0.9391811490058899f, -41, 1.2040667533874512f);
          param3[0] = param1 * ((ut) this).field_m + param2 * ((ut) this).field_i + ((ut) this).field_b * param4;
          param3[1] = ((ut) this).field_g * param1 + ((ut) this).field_h * param2 + ((ut) this).field_f * param4;
          return;
        } else {
          param3[0] = param1 * ((ut) this).field_m + param2 * ((ut) this).field_i + ((ut) this).field_b * param4;
          param3[1] = ((ut) this).field_g * param1 + ((ut) this).field_h * param2 + ((ut) this).field_f * param4;
          return;
        }
    }

    final void a(byte param0, int param1) {
        Object var4 = null;
        ((ut) this).field_i = 1.0f;
        ((ut) this).field_e = hg.field_l[param1 & 16383];
        ((ut) this).field_g = hg.field_l[param1 & 16383];
        ((ut) this).field_c = hg.field_k[16383 & param1];
        ((ut) this).field_m = 0.0f;
        if (param0 <= 33) {
          var4 = null;
          ((ut) this).a((eu) null, false);
          ((ut) this).field_f = -((ut) this).field_c;
          ((ut) this).field_l = 0.0f;
          ((ut) this).field_d = 0.0f;
          ((ut) this).field_h = 0.0f;
          ((ut) this).field_k = 0.0f;
          ((ut) this).field_n = 0.0f;
          ((ut) this).field_b = 0.0f;
          return;
        } else {
          ((ut) this).field_f = -((ut) this).field_c;
          ((ut) this).field_l = 0.0f;
          ((ut) this).field_d = 0.0f;
          ((ut) this).field_h = 0.0f;
          ((ut) this).field_k = 0.0f;
          ((ut) this).field_n = 0.0f;
          ((ut) this).field_b = 0.0f;
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        if (param2 <= 96) {
          var6 = null;
          ((ut) this).a(1.5263985395431519f, (float[]) null, (byte) -111, 0.11366769671440125f, -1.3526464700698853f, -1.8221346139907837f);
          ((ut) this).field_n = ((ut) this).field_n + (float)param1;
          ((ut) this).field_d = ((ut) this).field_d + (float)param0;
          ((ut) this).field_k = ((ut) this).field_k + (float)param3;
          return;
        } else {
          ((ut) this).field_n = ((ut) this).field_n + (float)param1;
          ((ut) this).field_d = ((ut) this).field_d + (float)param0;
          ((ut) this).field_k = ((ut) this).field_k + (float)param3;
          return;
        }
    }

    final void a(int param0) {
        ((ut) this).field_g = 1.0f;
        ((ut) this).field_d = 0.0f;
        ((ut) this).field_n = 0.0f;
        ((ut) this).field_i = 1.0f;
        ((ut) this).field_f = 0.0f;
        ((ut) this).field_h = 0.0f;
        ((ut) this).field_l = 0.0f;
        ((ut) this).field_e = (float)param0;
        ((ut) this).field_m = 0.0f;
        ((ut) this).field_b = 0.0f;
        ((ut) this).field_k = 0.0f;
        ((ut) this).field_c = 0.0f;
    }

    final float[] a(int param0, float[] param1) {
        param1[3] = ((ut) this).field_n;
        param1[13] = 0.0f;
        param1[7] = ((ut) this).field_d;
        param1[6] = ((ut) this).field_f;
        param1[14] = 0.0f;
        param1[12] = (float)param0;
        param1[5] = ((ut) this).field_g;
        param1[2] = ((ut) this).field_b;
        param1[8] = ((ut) this).field_l;
        param1[1] = ((ut) this).field_m;
        param1[9] = ((ut) this).field_c;
        param1[15] = 1.0f;
        param1[0] = ((ut) this).field_i;
        param1[10] = ((ut) this).field_e;
        param1[11] = ((ut) this).field_k;
        param1[4] = ((ut) this).field_h;
        return param1;
    }

    final void a(int param0, eu param1) {
        ut var3 = null;
        var3 = (ut) (Object) param1;
        if (param0 != 0) {
          ((ut) this).field_d = -0.26415005326271057f;
          ((ut) this).field_d = var3.field_d;
          ((ut) this).field_m = var3.field_m;
          ((ut) this).field_k = var3.field_k;
          ((ut) this).field_g = var3.field_g;
          ((ut) this).field_n = var3.field_n;
          ((ut) this).field_i = var3.field_i;
          ((ut) this).field_b = var3.field_b;
          ((ut) this).field_e = var3.field_e;
          ((ut) this).field_h = var3.field_h;
          ((ut) this).field_c = var3.field_c;
          ((ut) this).field_l = var3.field_l;
          ((ut) this).field_f = var3.field_f;
          return;
        } else {
          ((ut) this).field_d = var3.field_d;
          ((ut) this).field_m = var3.field_m;
          ((ut) this).field_k = var3.field_k;
          ((ut) this).field_g = var3.field_g;
          ((ut) this).field_n = var3.field_n;
          ((ut) this).field_i = var3.field_i;
          ((ut) this).field_b = var3.field_b;
          ((ut) this).field_e = var3.field_e;
          ((ut) this).field_h = var3.field_h;
          ((ut) this).field_c = var3.field_c;
          ((ut) this).field_l = var3.field_l;
          ((ut) this).field_f = var3.field_f;
          return;
        }
    }

    final float[] b(int param0, float[] param1) {
        param1[8] = ((ut) this).field_b;
        param1[4] = ((ut) this).field_m;
        param1[9] = ((ut) this).field_f;
        if (param0 >= -55) {
          ((ut) this).field_d = -0.7466111183166504f;
          param1[6] = ((ut) this).field_c;
          param1[11] = 0.0f;
          param1[12] = ((ut) this).field_n;
          param1[15] = 1.0f;
          param1[13] = ((ut) this).field_d;
          param1[1] = ((ut) this).field_h;
          param1[7] = 0.0f;
          param1[2] = ((ut) this).field_l;
          param1[5] = ((ut) this).field_g;
          param1[14] = ((ut) this).field_k;
          param1[10] = ((ut) this).field_e;
          param1[3] = 0.0f;
          param1[0] = ((ut) this).field_i;
          return param1;
        } else {
          param1[6] = ((ut) this).field_c;
          param1[11] = 0.0f;
          param1[12] = ((ut) this).field_n;
          param1[15] = 1.0f;
          param1[13] = ((ut) this).field_d;
          param1[1] = ((ut) this).field_h;
          param1[7] = 0.0f;
          param1[2] = ((ut) this).field_l;
          param1[5] = ((ut) this).field_g;
          param1[14] = ((ut) this).field_k;
          param1[10] = ((ut) this).field_e;
          param1[3] = 0.0f;
          param1[0] = ((ut) this).field_i;
          return param1;
        }
    }

    final void b(float param0, float param1, int param2, float param3) {
        ((ut) this).field_f = (float)param2;
        ((ut) this).field_e = param3;
        ((ut) this).field_b = 0.0f;
        ((ut) this).field_c = 0.0f;
        ((ut) this).field_l = 0.0f;
        ((ut) this).field_h = 0.0f;
        ((ut) this).field_n = 0.0f;
        ((ut) this).field_m = 0.0f;
        ((ut) this).field_g = param0;
        ((ut) this).field_d = 0.0f;
        ((ut) this).field_i = param1;
        ((ut) this).field_k = 0.0f;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        ((ut) this).field_l = param6;
        ((ut) this).field_h = param2;
        ((ut) this).field_i = param3;
        if (param9 != 18356) {
          ((ut) this).field_i = 0.5659931898117065f;
          ((ut) this).field_b = param4;
          ((ut) this).field_m = param0;
          ((ut) this).field_c = param8;
          ((ut) this).field_n = 0.0f;
          ((ut) this).field_g = param1;
          ((ut) this).field_f = param7;
          ((ut) this).field_e = param5;
          ((ut) this).field_d = 0.0f;
          ((ut) this).field_k = 0.0f;
          return;
        } else {
          ((ut) this).field_b = param4;
          ((ut) this).field_m = param0;
          ((ut) this).field_c = param8;
          ((ut) this).field_n = 0.0f;
          ((ut) this).field_g = param1;
          ((ut) this).field_f = param7;
          ((ut) this).field_e = param5;
          ((ut) this).field_d = 0.0f;
          ((ut) this).field_k = 0.0f;
          return;
        }
    }

    final void a(eu param0, boolean param1) {
        ut var3 = null;
        var3 = (ut) (Object) param0;
        ((ut) this).field_b = var3.field_b;
        ((ut) this).field_n = 0.0f;
        ((ut) this).field_m = var3.field_m;
        ((ut) this).field_g = var3.field_g;
        if (!param1) {
          return;
        } else {
          ((ut) this).field_h = var3.field_h;
          ((ut) this).field_l = var3.field_l;
          ((ut) this).field_i = var3.field_i;
          ((ut) this).field_k = 0.0f;
          ((ut) this).field_c = var3.field_c;
          ((ut) this).field_f = var3.field_f;
          ((ut) this).field_e = var3.field_e;
          ((ut) this).field_d = 0.0f;
          return;
        }
    }

    final void a(float param0, float param1, float param2, int param3) {
        ((ut) this).field_l = 0.0f;
        ((ut) this).field_c = 0.0f;
        ((ut) this).field_h = 0.0f;
        ((ut) this).field_n = param2;
        ((ut) this).field_g = 1.0f;
        ((ut) this).field_i = 1.0f;
        ((ut) this).field_k = param1;
        ((ut) this).field_f = (float)param3;
        ((ut) this).field_b = 0.0f;
        ((ut) this).field_e = 1.0f;
        ((ut) this).field_m = 0.0f;
        ((ut) this).field_d = param0;
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
        ut var5 = null;
        Object var6 = null;
        ut var7 = null;
        var7 = (ut) (Object) param0;
        var5 = (ut) (Object) param2;
        ((ut) this).field_i = var7.field_b * var5.field_l + (var7.field_m * var5.field_h + var5.field_i * var7.field_i);
        ((ut) this).field_h = var5.field_l * var7.field_f + (var5.field_i * var7.field_h + var5.field_h * var7.field_g);
        ((ut) this).field_m = var7.field_i * var5.field_m + var7.field_m * var5.field_g + var5.field_c * var7.field_b;
        ((ut) this).field_l = var7.field_c * var5.field_h + var7.field_l * var5.field_i + var7.field_e * var5.field_l;
        ((ut) this).field_g = var5.field_c * var7.field_f + (var5.field_m * var7.field_h + var5.field_g * var7.field_g);
        ((ut) this).field_c = var5.field_c * var7.field_e + (var5.field_m * var7.field_l + var5.field_g * var7.field_c);
        if (param1 != 77) {
          var6 = null;
          ((ut) this).a(-0.4196498990058899f, (float[]) null, (byte) 117, -0.21536625921726227f, 0.6118397116661072f, 0.4896458387374878f);
          ((ut) this).field_b = var5.field_e * var7.field_b + (var7.field_i * var5.field_b + var7.field_m * var5.field_f);
          ((ut) this).field_f = var7.field_g * var5.field_f + var7.field_h * var5.field_b + var5.field_e * var7.field_f;
          ((ut) this).field_e = var5.field_e * var7.field_e + (var7.field_l * var5.field_b + var7.field_c * var5.field_f);
          ((ut) this).field_n = var5.field_d * var7.field_m + var7.field_i * var5.field_n + var7.field_b * var5.field_k + var7.field_n;
          ((ut) this).field_d = var7.field_f * var5.field_k + (var5.field_d * var7.field_g + var7.field_h * var5.field_n) + var7.field_d;
          ((ut) this).field_k = var7.field_k + (var5.field_n * var7.field_l + var7.field_c * var5.field_d + var5.field_k * var7.field_e);
          return;
        } else {
          ((ut) this).field_b = var5.field_e * var7.field_b + (var7.field_i * var5.field_b + var7.field_m * var5.field_f);
          ((ut) this).field_f = var7.field_g * var5.field_f + var7.field_h * var5.field_b + var5.field_e * var7.field_f;
          ((ut) this).field_e = var5.field_e * var7.field_e + (var7.field_l * var5.field_b + var7.field_c * var5.field_f);
          ((ut) this).field_n = var5.field_d * var7.field_m + var7.field_i * var5.field_n + var7.field_b * var5.field_k + var7.field_n;
          ((ut) this).field_d = var7.field_f * var5.field_k + (var5.field_d * var7.field_g + var7.field_h * var5.field_n) + var7.field_d;
          ((ut) this).field_k = var7.field_k + (var5.field_n * var7.field_l + var7.field_c * var5.field_d + var5.field_k * var7.field_e);
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        ((ut) this).field_i = 1.0f;
        ((ut) this).field_d = (float)param3;
        ((ut) this).field_f = 0.0f;
        ((ut) this).field_n = (float)param0;
        ((ut) this).field_l = 0.0f;
        if (param2) {
          return;
        } else {
          ((ut) this).field_e = 1.0f;
          ((ut) this).field_g = 1.0f;
          ((ut) this).field_k = (float)param1;
          ((ut) this).field_b = 0.0f;
          ((ut) this).field_c = 0.0f;
          ((ut) this).field_m = 0.0f;
          ((ut) this).field_h = 0.0f;
          return;
        }
    }

    final static void a(int param0, byte param1, tv param2, boolean param3) {
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
        L0: {
          stackOut_0_0 = qr.field_b;
          stackOut_0_1 = 1;
          stackOut_0_2 = 1000000;
          stackOut_0_3 = (tv) param2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (param3) {
            stackOut_2_0 = (ud) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = (tv) (Object) stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (ud) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = (tv) (Object) stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        ((ud) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param0, 256);
        if (param1 != -55) {
          ut.b((byte) 32);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, float param1, float param2, float param3) {
        if (param0 != 96) {
          ((ut) this).field_k = 1.0452516078948975f;
          ((ut) this).field_k = ((ut) this).field_k + param1;
          ((ut) this).field_d = ((ut) this).field_d + param2;
          ((ut) this).field_n = ((ut) this).field_n + param3;
          return;
        } else {
          ((ut) this).field_k = ((ut) this).field_k + param1;
          ((ut) this).field_d = ((ut) this).field_d + param2;
          ((ut) this).field_n = ((ut) this).field_n + param3;
          return;
        }
    }

    final float[] a(float[] param0, int param1) {
        param0[1] = ((ut) this).field_h;
        param0[5] = ((ut) this).field_g;
        param0[0] = ((ut) this).field_i;
        param0[6] = 0.0f;
        param0[15] = 1.0f;
        param0[7] = 0.0f;
        param0[3] = 0.0f;
        param0[2] = 0.0f;
        param0[10] = ((ut) this).field_k;
        param0[4] = ((ut) this).field_m;
        param0[9] = ((ut) this).field_d;
        param0[11] = 0.0f;
        param0[14] = 0.0f;
        param0[12] = 0.0f;
        param0[8] = ((ut) this).field_n;
        param0[13] = 0.0f;
        if (param1 <= 61) {
          ((ut) this).field_b = -0.7986855506896973f;
          return param0;
        } else {
          return param0;
        }
    }

    final void a(float param0, float param1, int param2, float param3) {
        ((ut) this).field_d = ((ut) this).field_d * param1;
        ((ut) this).field_i = ((ut) this).field_i * param0;
        ((ut) this).field_k = ((ut) this).field_k * param3;
        ((ut) this).field_g = ((ut) this).field_g * param1;
        ((ut) this).field_e = ((ut) this).field_e * param3;
        ((ut) this).field_b = ((ut) this).field_b * param0;
        ((ut) this).field_n = ((ut) this).field_n * param0;
        ((ut) this).field_m = ((ut) this).field_m * param0;
        ((ut) this).field_h = ((ut) this).field_h * param1;
        ((ut) this).field_f = ((ut) this).field_f * param1;
        ((ut) this).field_l = ((ut) this).field_l * param3;
        ((ut) this).field_c = ((ut) this).field_c * param3;
        if (param2 > -17) {
            Object var6 = null;
            ((ut) this).a(-0.1824408620595932f, (float[]) null, (byte) 60, 1.0720683336257935f, 1.3190656900405884f, 0.16522423923015594f);
        }
    }

    final float[] a(float[] param0, byte param1) {
        Object var4 = null;
        param0[0] = ((ut) this).field_i;
        param0[2] = ((ut) this).field_b;
        param0[7] = ((ut) this).field_d;
        param0[6] = ((ut) this).field_f;
        param0[5] = ((ut) this).field_g;
        param0[1] = ((ut) this).field_m;
        param0[4] = ((ut) this).field_h;
        param0[3] = ((ut) this).field_n;
        if (param1 != -37) {
          var4 = null;
          float[] discarded$2 = ((ut) this).a(30, (float[]) null);
          return param0;
        } else {
          return param0;
        }
    }

    final void a(float param0, float[] param1, byte param2, float param3, float param4, float param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        param1[2] = param4 * ((ut) this).field_c + ((ut) this).field_l * param0 + param3 * ((ut) this).field_e;
        param1[1] = param4 * ((ut) this).field_g + param0 * ((ut) this).field_h + ((ut) this).field_f * param3;
        var10 = -16 / ((-36 - param2) / 45);
        param1[0] = ((ut) this).field_b * param3 + (param4 * ((ut) this).field_m + ((ut) this).field_i * param0);
        if (param0 <= 0.00390625f) {
          if (param0 >= -0.00390625f) {
            if (param4 <= 0.00390625f) {
              if (param4 < -0.00390625f) {
                var11 = -param5 / param4;
                var9 = ((ut) this).field_k + var11 * ((ut) this).field_c;
                var7 = ((ut) this).field_m * var11 + ((ut) this).field_n;
                var8 = var11 * ((ut) this).field_g + ((ut) this).field_d;
                param1[3] = -(var8 * param1[1] + param1[0] * var7 + var9 * param1[2]);
                return;
              } else {
                var11 = -param5 / param3;
                var8 = ((ut) this).field_d + ((ut) this).field_f * var11;
                var7 = ((ut) this).field_n + var11 * ((ut) this).field_b;
                var9 = var11 * ((ut) this).field_e + ((ut) this).field_k;
                param1[3] = -(var8 * param1[1] + param1[0] * var7 + var9 * param1[2]);
                return;
              }
            } else {
              var11 = -param5 / param4;
              var9 = ((ut) this).field_k + var11 * ((ut) this).field_c;
              var7 = ((ut) this).field_m * var11 + ((ut) this).field_n;
              var8 = var11 * ((ut) this).field_g + ((ut) this).field_d;
              param1[3] = -(var8 * param1[1] + param1[0] * var7 + var9 * param1[2]);
              return;
            }
          } else {
            var11 = -param5 / param0;
            var9 = ((ut) this).field_l * var11 + ((ut) this).field_k;
            var7 = var11 * ((ut) this).field_i + ((ut) this).field_n;
            var8 = ((ut) this).field_d + ((ut) this).field_h * var11;
            param1[3] = -(var8 * param1[1] + param1[0] * var7 + var9 * param1[2]);
            return;
          }
        } else {
          var11 = -param5 / param0;
          var9 = ((ut) this).field_l * var11 + ((ut) this).field_k;
          var7 = var11 * ((ut) this).field_i + ((ut) this).field_n;
          var8 = ((ut) this).field_d + ((ut) this).field_h * var11;
          param1[3] = -(var8 * param1[1] + param1[0] * var7 + var9 * param1[2]);
          return;
        }
    }

    ut() {
        ((ut) this).a(1);
    }

    final float[] b(float[] param0, byte param1) {
        param0[9] = ((ut) this).field_c;
        param0[11] = 0.0f;
        param0[14] = 0.0f;
        param0[10] = ((ut) this).field_e;
        param0[4] = ((ut) this).field_h;
        param0[0] = ((ut) this).field_i;
        param0[5] = ((ut) this).field_g;
        param0[7] = 0.0f;
        param0[2] = ((ut) this).field_b;
        param0[12] = 0.0f;
        param0[13] = 0.0f;
        param0[6] = ((ut) this).field_f;
        param0[3] = 0.0f;
        if (param1 != 86) {
          field_o = null;
          param0[1] = ((ut) this).field_m;
          param0[15] = 0.0f;
          param0[8] = ((ut) this).field_l;
          return param0;
        } else {
          param0[1] = ((ut) this).field_m;
          param0[15] = 0.0f;
          param0[8] = ((ut) this).field_l;
          return param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
