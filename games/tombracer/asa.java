/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class asa extends gda {
    float field_n;
    float field_e;
    float field_q;
    float field_g;
    float field_k;
    float field_l;
    float field_h;
    float field_o;
    static vna field_j;
    float field_i;
    float field_p;
    float field_f;
    float field_m;

    final void b(int param0, int param1) {
        ((asa) this).field_g = 1.0f;
        ((asa) this).field_h = ph.field_c[16383 & param1];
        ((asa) this).field_q = ph.field_c[16383 & param1];
        ((asa) this).field_o = ph.field_n[16383 & param1];
        ((asa) this).field_m = -((asa) this).field_o;
        ((asa) this).field_k = 0.0f;
        ((asa) this).field_i = 0.0f;
        ((asa) this).field_f = 0.0f;
        int var3 = -3 / ((-42 - param0) / 50);
        ((asa) this).field_e = 0.0f;
        ((asa) this).field_p = 0.0f;
        ((asa) this).field_n = 0.0f;
        ((asa) this).field_l = 0.0f;
    }

    final void a(gda param0, byte param1) {
        asa var5 = (asa) (Object) param0;
        ((asa) this).field_g = var5.field_g;
        ((asa) this).field_f = var5.field_p;
        ((asa) this).field_l = var5.field_k;
        ((asa) this).field_k = var5.field_l;
        int var4 = -22 % ((73 - param1) / 49);
        ((asa) this).field_m = var5.field_o;
        ((asa) this).field_q = var5.field_q;
        ((asa) this).field_p = var5.field_f;
        ((asa) this).field_h = var5.field_h;
        ((asa) this).field_e = -(((asa) this).field_l * var5.field_n + var5.field_e * ((asa) this).field_g + var5.field_i * ((asa) this).field_f);
        ((asa) this).field_o = var5.field_m;
        ((asa) this).field_n = -(((asa) this).field_m * var5.field_i + (((asa) this).field_q * var5.field_n + ((asa) this).field_k * var5.field_e));
        ((asa) this).field_i = -(var5.field_e * ((asa) this).field_p + var5.field_n * ((asa) this).field_o + var5.field_i * ((asa) this).field_h);
    }

    final void a(int param0, int param1, int param2) {
        ((asa) this).field_n = ((asa) this).field_n + (float)param1;
        ((asa) this).field_e = ((asa) this).field_e + (float)param0;
        ((asa) this).field_i = ((asa) this).field_i + (float)param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = ph.field_c[16383 & param3];
        float var8 = ph.field_n[param3 & 16383];
        float var9 = ph.field_c[param4 & 16383];
        float var10 = ph.field_n[16383 & param4];
        float var11 = ph.field_c[16383 & param5];
        float var12 = ph.field_n[param5 & 16383];
        float var13 = var8 * var11;
        float var14 = var12 * var8;
        ((asa) this).field_p = var7 * var10;
        ((asa) this).field_q = var7 * var11;
        ((asa) this).field_k = var12 * -var9 + var10 * var13;
        ((asa) this).field_m = var13 * var9 + var12 * var10;
        ((asa) this).field_h = var9 * var7;
        ((asa) this).field_f = -var10 * var11 + var14 * var9;
        ((asa) this).field_g = var11 * var9 + var14 * var10;
        ((asa) this).field_l = var7 * var12;
        ((asa) this).field_o = -var8;
        ((asa) this).field_i = -(((asa) this).field_h * (float)param2) + (-((float)param1 * ((asa) this).field_o) + (float)(-param0) * ((asa) this).field_p);
        ((asa) this).field_e = -((float)param2 * ((asa) this).field_f) + (-(((asa) this).field_l * (float)param1) + ((asa) this).field_g * (float)(-param0));
        ((asa) this).field_n = -((float)param2 * ((asa) this).field_m) + (((asa) this).field_k * (float)(-param0) - ((asa) this).field_q * (float)param1);
    }

    final float a(float param0, float param1, byte param2, float param3) {
        if (param2 > -40) {
          ((asa) this).a(0.7830915451049805f, 11, -1.1317301988601685f, 0.6542510986328125f);
          return param0 * ((asa) this).field_h + (((asa) this).field_p * param1 + ((asa) this).field_o * param3) + ((asa) this).field_i;
        } else {
          return param0 * ((asa) this).field_h + (((asa) this).field_p * param1 + ((asa) this).field_o * param3) + ((asa) this).field_i;
        }
    }

    final void b(gda param0, int param1) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        asa var12 = null;
        var12 = (asa) (Object) param0;
        var4 = var12.field_g;
        var5 = var12.field_k;
        var6 = var12.field_l;
        var7 = var12.field_q;
        var8 = var12.field_f;
        var9 = var12.field_m;
        var10 = var12.field_e;
        ((asa) this).field_k = var12.field_p * var12.field_m + (var12.field_q * var5 + var4 * var12.field_k);
        ((asa) this).field_g = var12.field_l * var5 + var12.field_g * var4 + var12.field_f * var12.field_p;
        var11 = var12.field_n;
        if (param1 != 3) {
          ((asa) this).field_e = -1.1916428804397583f;
          ((asa) this).field_q = var6 * var12.field_k + var7 * var12.field_q + var12.field_m * var12.field_o;
          ((asa) this).field_l = var12.field_f * var12.field_o + (var12.field_g * var6 + var7 * var12.field_l);
          ((asa) this).field_p = var12.field_p * var12.field_h + (var5 * var12.field_o + var4 * var12.field_p);
          ((asa) this).field_m = var8 * var12.field_k + var12.field_q * var9 + var12.field_h * var12.field_m;
          ((asa) this).field_f = var12.field_h * var12.field_f + (var12.field_l * var9 + var12.field_g * var8);
          ((asa) this).field_o = var12.field_o * var12.field_h + (var12.field_o * var7 + var12.field_p * var6);
          ((asa) this).field_h = var12.field_h * var12.field_h + (var12.field_p * var8 + var12.field_o * var9);
          ((asa) this).field_n = var12.field_n + (var12.field_q * var11 + var12.field_k * var10 + var12.field_m * var12.field_i);
          ((asa) this).field_e = var10 * var12.field_g + var12.field_l * var11 + var12.field_f * var12.field_i + var12.field_e;
          ((asa) this).field_i = var11 * var12.field_o + var10 * var12.field_p + var12.field_i * var12.field_h + var12.field_i;
          return;
        } else {
          ((asa) this).field_q = var6 * var12.field_k + var7 * var12.field_q + var12.field_m * var12.field_o;
          ((asa) this).field_l = var12.field_f * var12.field_o + (var12.field_g * var6 + var7 * var12.field_l);
          ((asa) this).field_p = var12.field_p * var12.field_h + (var5 * var12.field_o + var4 * var12.field_p);
          ((asa) this).field_m = var8 * var12.field_k + var12.field_q * var9 + var12.field_h * var12.field_m;
          ((asa) this).field_f = var12.field_h * var12.field_f + (var12.field_l * var9 + var12.field_g * var8);
          ((asa) this).field_o = var12.field_o * var12.field_h + (var12.field_o * var7 + var12.field_p * var6);
          ((asa) this).field_h = var12.field_h * var12.field_h + (var12.field_p * var8 + var12.field_o * var9);
          ((asa) this).field_n = var12.field_n + (var12.field_q * var11 + var12.field_k * var10 + var12.field_m * var12.field_i);
          ((asa) this).field_e = var10 * var12.field_g + var12.field_l * var11 + var12.field_f * var12.field_i + var12.field_e;
          ((asa) this).field_i = var11 * var12.field_o + var10 * var12.field_p + var12.field_i * var12.field_h + var12.field_i;
          return;
        }
    }

    final void a(float[] param0, float param1, byte param2, float param3, float param4) {
        param0[1] = ((asa) this).field_m * param3 + (param1 * ((asa) this).field_q + ((asa) this).field_k * param4);
        if (param2 < 42) {
          return;
        } else {
          param0[2] = ((asa) this).field_p * param4 + param1 * ((asa) this).field_o + ((asa) this).field_h * param3;
          param0[0] = ((asa) this).field_f * param3 + (((asa) this).field_g * param4 + ((asa) this).field_l * param1);
          return;
        }
    }

    final void a(byte param0) {
        ((asa) this).field_h = -((asa) this).field_h;
        ((asa) this).field_m = -((asa) this).field_m;
        ((asa) this).field_k = -((asa) this).field_k;
        ((asa) this).field_o = -((asa) this).field_o;
        ((asa) this).field_i = -((asa) this).field_i;
        ((asa) this).field_p = -((asa) this).field_p;
        ((asa) this).field_n = -((asa) this).field_n;
        ((asa) this).field_q = -((asa) this).field_q;
        if (param0 != 42) {
            ((asa) this).a((byte) -117, -0.41521722078323364f, -0.9205878973007202f, -0.2643323540687561f);
        }
    }

    final void a(byte param0, float param1, float param2, float param3) {
        ((asa) this).field_h = 1.0f;
        ((asa) this).field_q = 1.0f;
        if (param0 < 116) {
          field_j = null;
          ((asa) this).field_l = 0.0f;
          ((asa) this).field_k = 0.0f;
          ((asa) this).field_i = param2;
          ((asa) this).field_g = 1.0f;
          ((asa) this).field_o = 0.0f;
          ((asa) this).field_m = 0.0f;
          ((asa) this).field_f = 0.0f;
          ((asa) this).field_n = param1;
          ((asa) this).field_p = 0.0f;
          ((asa) this).field_e = param3;
          return;
        } else {
          ((asa) this).field_l = 0.0f;
          ((asa) this).field_k = 0.0f;
          ((asa) this).field_i = param2;
          ((asa) this).field_g = 1.0f;
          ((asa) this).field_o = 0.0f;
          ((asa) this).field_m = 0.0f;
          ((asa) this).field_f = 0.0f;
          ((asa) this).field_n = param1;
          ((asa) this).field_p = 0.0f;
          ((asa) this).field_e = param3;
          return;
        }
    }

    final float[] a(float[] param0, byte param1) {
        param0[3] = 0.0f;
        param0[14] = ((asa) this).field_i;
        param0[7] = 0.0f;
        if (param1 != -37) {
          return null;
        } else {
          param0[2] = ((asa) this).field_p;
          param0[8] = ((asa) this).field_f;
          param0[6] = ((asa) this).field_o;
          param0[0] = ((asa) this).field_g;
          param0[11] = 0.0f;
          param0[9] = ((asa) this).field_m;
          param0[13] = ((asa) this).field_n;
          param0[1] = ((asa) this).field_k;
          param0[15] = 1.0f;
          param0[10] = ((asa) this).field_h;
          param0[4] = ((asa) this).field_l;
          param0[5] = ((asa) this).field_q;
          param0[12] = ((asa) this).field_e;
          return param0;
        }
    }

    final float[] a(boolean param0, float[] param1) {
        param1[10] = ((asa) this).field_h;
        param1[3] = ((asa) this).field_e;
        param1[7] = ((asa) this).field_n;
        param1[13] = 0.0f;
        param1[9] = ((asa) this).field_o;
        param1[2] = ((asa) this).field_f;
        param1[5] = ((asa) this).field_q;
        if (param0) {
          return null;
        } else {
          param1[8] = ((asa) this).field_p;
          param1[4] = ((asa) this).field_k;
          param1[6] = ((asa) this).field_m;
          param1[11] = ((asa) this).field_i;
          param1[12] = 0.0f;
          param1[1] = ((asa) this).field_l;
          param1[0] = ((asa) this).field_g;
          param1[15] = 1.0f;
          param1[14] = 0.0f;
          return param1;
        }
    }

    final void d(int param0) {
        float var2 = ph.field_c[16383 & param0];
        float var3 = ph.field_n[16383 & param0];
        float var4 = ((asa) this).field_g;
        float var5 = ((asa) this).field_l;
        float var6 = ((asa) this).field_f;
        float var7 = ((asa) this).field_e;
        ((asa) this).field_g = var4 * var2 + ((asa) this).field_p * var3;
        ((asa) this).field_l = var2 * var5 + var3 * ((asa) this).field_o;
        ((asa) this).field_p = -(var3 * var4) + ((asa) this).field_p * var2;
        ((asa) this).field_o = var2 * ((asa) this).field_o - var3 * var5;
        ((asa) this).field_f = ((asa) this).field_h * var3 + var2 * var6;
        ((asa) this).field_e = var3 * ((asa) this).field_i + var7 * var2;
        ((asa) this).field_h = -(var3 * var6) + ((asa) this).field_h * var2;
        ((asa) this).field_i = -(var3 * var7) + var2 * ((asa) this).field_i;
    }

    final void a(float param0, int param1, float param2, float param3) {
        ((asa) this).field_i = ((asa) this).field_i + param3;
        ((asa) this).field_n = ((asa) this).field_n + param0;
        ((asa) this).field_e = ((asa) this).field_e + param2;
        if (param1 >= -15) {
            ((asa) this).field_p = 0.7425627112388611f;
        }
    }

    final void b(int param0, float param1, float param2, float param3) {
        ((asa) this).field_k = ((asa) this).field_k * param2;
        ((asa) this).field_i = ((asa) this).field_i * param1;
        ((asa) this).field_g = ((asa) this).field_g * param3;
        ((asa) this).field_e = ((asa) this).field_e * param3;
        if (param0 != 11403) {
          ((asa) this).field_f = 0.17367041110992432f;
          ((asa) this).field_o = ((asa) this).field_o * param1;
          ((asa) this).field_l = ((asa) this).field_l * param3;
          ((asa) this).field_h = ((asa) this).field_h * param1;
          ((asa) this).field_n = ((asa) this).field_n * param2;
          ((asa) this).field_m = ((asa) this).field_m * param2;
          ((asa) this).field_p = ((asa) this).field_p * param1;
          ((asa) this).field_q = ((asa) this).field_q * param2;
          ((asa) this).field_f = ((asa) this).field_f * param3;
          return;
        } else {
          ((asa) this).field_o = ((asa) this).field_o * param1;
          ((asa) this).field_l = ((asa) this).field_l * param3;
          ((asa) this).field_h = ((asa) this).field_h * param1;
          ((asa) this).field_n = ((asa) this).field_n * param2;
          ((asa) this).field_m = ((asa) this).field_m * param2;
          ((asa) this).field_p = ((asa) this).field_p * param1;
          ((asa) this).field_q = ((asa) this).field_q * param2;
          ((asa) this).field_f = ((asa) this).field_f * param3;
          return;
        }
    }

    final void c(int param0) {
        float var2 = ph.field_c[16383 & param0];
        float var3 = ph.field_n[16383 & param0];
        float var4 = ((asa) this).field_k;
        float var5 = ((asa) this).field_q;
        float var6 = ((asa) this).field_m;
        float var7 = ((asa) this).field_n;
        ((asa) this).field_k = var2 * var4 - var3 * ((asa) this).field_p;
        ((asa) this).field_q = -(((asa) this).field_o * var3) + var5 * var2;
        ((asa) this).field_p = ((asa) this).field_p * var2 + var3 * var4;
        ((asa) this).field_m = var2 * var6 - ((asa) this).field_h * var3;
        ((asa) this).field_o = ((asa) this).field_o * var2 + var3 * var5;
        ((asa) this).field_n = -(var3 * ((asa) this).field_i) + var2 * var7;
        ((asa) this).field_h = ((asa) this).field_h * var2 + var3 * var6;
        ((asa) this).field_i = ((asa) this).field_i * var2 + var3 * var7;
    }

    final void a() {
        ((asa) this).field_h = 1.0f;
        ((asa) this).field_l = 0.0f;
        ((asa) this).field_k = 0.0f;
        ((asa) this).field_e = 0.0f;
        ((asa) this).field_i = 0.0f;
        ((asa) this).field_f = 0.0f;
        ((asa) this).field_p = 0.0f;
        ((asa) this).field_n = 0.0f;
        ((asa) this).field_g = 1.0f;
        ((asa) this).field_o = 0.0f;
        ((asa) this).field_m = 0.0f;
        ((asa) this).field_q = 1.0f;
    }

    final float[] a(byte param0, float[] param1) {
        param1[15] = 1.0f;
        param1[11] = 0.0f;
        if (param0 > -112) {
          return null;
        } else {
          param1[13] = 0.0f;
          param1[1] = ((asa) this).field_k;
          param1[7] = 0.0f;
          param1[3] = 0.0f;
          param1[12] = 0.0f;
          param1[0] = ((asa) this).field_g;
          param1[6] = 0.0f;
          param1[8] = ((asa) this).field_e;
          param1[5] = ((asa) this).field_q;
          param1[10] = ((asa) this).field_i;
          param1[14] = 0.0f;
          param1[9] = ((asa) this).field_n;
          param1[2] = 0.0f;
          param1[4] = ((asa) this).field_l;
          return param1;
        }
    }

    final void b(int param0) {
        float var2 = ph.field_c[16383 & param0];
        float var3 = ph.field_n[16383 & param0];
        float var4 = ((asa) this).field_g;
        float var5 = ((asa) this).field_l;
        float var6 = ((asa) this).field_f;
        ((asa) this).field_g = var4 * var2 - var3 * ((asa) this).field_k;
        float var7 = ((asa) this).field_e;
        ((asa) this).field_k = var2 * ((asa) this).field_k + var4 * var3;
        ((asa) this).field_l = -(var3 * ((asa) this).field_q) + var5 * var2;
        ((asa) this).field_f = var6 * var2 - var3 * ((asa) this).field_m;
        ((asa) this).field_q = ((asa) this).field_q * var2 + var5 * var3;
        ((asa) this).field_e = var7 * var2 - ((asa) this).field_n * var3;
        ((asa) this).field_m = var2 * ((asa) this).field_m + var3 * var6;
        ((asa) this).field_n = var3 * var7 + ((asa) this).field_n * var2;
    }

    final float[] a(float[] param0, int param1) {
        param0[7] = ((asa) this).field_n;
        if (param1 >= -88) {
          return null;
        } else {
          param0[3] = ((asa) this).field_e;
          param0[0] = ((asa) this).field_g;
          param0[4] = ((asa) this).field_k;
          param0[1] = ((asa) this).field_l;
          param0[5] = ((asa) this).field_q;
          param0[6] = ((asa) this).field_m;
          param0[2] = ((asa) this).field_f;
          return param0;
        }
    }

    final void a(gda param0, gda param1, byte param2) {
        asa var5 = null;
        asa var6 = null;
        var6 = (asa) (Object) param0;
        var5 = (asa) (Object) param1;
        if (param2 >= 118) {
          ((asa) this).field_g = var5.field_g * var6.field_g + var5.field_k * var6.field_l + var6.field_f * var5.field_p;
          ((asa) this).field_k = var6.field_m * var5.field_p + (var6.field_q * var5.field_k + var6.field_k * var5.field_g);
          ((asa) this).field_p = var5.field_g * var6.field_p + var5.field_k * var6.field_o + var5.field_p * var6.field_h;
          ((asa) this).field_l = var5.field_q * var6.field_l + var5.field_l * var6.field_g + var6.field_f * var5.field_o;
          ((asa) this).field_q = var6.field_m * var5.field_o + (var5.field_q * var6.field_q + var6.field_k * var5.field_l);
          ((asa) this).field_f = var6.field_f * var5.field_h + (var5.field_f * var6.field_g + var5.field_m * var6.field_l);
          ((asa) this).field_o = var6.field_o * var5.field_q + var6.field_p * var5.field_l + var5.field_o * var6.field_h;
          ((asa) this).field_m = var5.field_m * var6.field_q + var6.field_k * var5.field_f + var5.field_h * var6.field_m;
          ((asa) this).field_e = var6.field_e + (var6.field_l * var5.field_n + var6.field_g * var5.field_e + var6.field_f * var5.field_i);
          ((asa) this).field_h = var6.field_o * var5.field_m + var5.field_f * var6.field_p + var6.field_h * var5.field_h;
          ((asa) this).field_n = var5.field_n * var6.field_q + var6.field_k * var5.field_e + var6.field_m * var5.field_i + var6.field_n;
          ((asa) this).field_i = var6.field_i + (var6.field_h * var5.field_i + (var5.field_n * var6.field_o + var5.field_e * var6.field_p));
          return;
        } else {
          ((asa) this).field_o = -0.8563432097434998f;
          ((asa) this).field_g = var5.field_g * var6.field_g + var5.field_k * var6.field_l + var6.field_f * var5.field_p;
          ((asa) this).field_k = var6.field_m * var5.field_p + (var6.field_q * var5.field_k + var6.field_k * var5.field_g);
          ((asa) this).field_p = var5.field_g * var6.field_p + var5.field_k * var6.field_o + var5.field_p * var6.field_h;
          ((asa) this).field_l = var5.field_q * var6.field_l + var5.field_l * var6.field_g + var6.field_f * var5.field_o;
          ((asa) this).field_q = var6.field_m * var5.field_o + (var5.field_q * var6.field_q + var6.field_k * var5.field_l);
          ((asa) this).field_f = var6.field_f * var5.field_h + (var5.field_f * var6.field_g + var5.field_m * var6.field_l);
          ((asa) this).field_o = var6.field_o * var5.field_q + var6.field_p * var5.field_l + var5.field_o * var6.field_h;
          ((asa) this).field_m = var5.field_m * var6.field_q + var6.field_k * var5.field_f + var5.field_h * var6.field_m;
          ((asa) this).field_e = var6.field_e + (var6.field_l * var5.field_n + var6.field_g * var5.field_e + var6.field_f * var5.field_i);
          ((asa) this).field_h = var6.field_o * var5.field_m + var5.field_f * var6.field_p + var6.field_h * var5.field_h;
          ((asa) this).field_n = var5.field_n * var6.field_q + var6.field_k * var5.field_e + var6.field_m * var5.field_i + var6.field_n;
          ((asa) this).field_i = var6.field_i + (var6.field_h * var5.field_i + (var5.field_n * var6.field_o + var5.field_e * var6.field_p));
          return;
        }
    }

    final void a(float param0, float param1, byte param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
        if (param2 <= 12) {
          ((asa) this).field_g = -1.8287684917449951f;
          ((asa) this).field_i = 0.0f;
          ((asa) this).field_q = param9;
          ((asa) this).field_f = param1;
          ((asa) this).field_m = param3;
          ((asa) this).field_k = param7;
          ((asa) this).field_o = param0;
          ((asa) this).field_p = param4;
          ((asa) this).field_e = 0.0f;
          ((asa) this).field_h = param8;
          ((asa) this).field_l = param6;
          ((asa) this).field_n = 0.0f;
          ((asa) this).field_g = param5;
          return;
        } else {
          ((asa) this).field_i = 0.0f;
          ((asa) this).field_q = param9;
          ((asa) this).field_f = param1;
          ((asa) this).field_m = param3;
          ((asa) this).field_k = param7;
          ((asa) this).field_o = param0;
          ((asa) this).field_p = param4;
          ((asa) this).field_e = 0.0f;
          ((asa) this).field_h = param8;
          ((asa) this).field_l = param6;
          ((asa) this).field_n = 0.0f;
          ((asa) this).field_g = param5;
          return;
        }
    }

    final void a(int param0, gda param1) {
        asa var4 = null;
        asa var5 = null;
        if (param0 != 1217) {
          asa.e(-51);
          var4 = (asa) (Object) param1;
          ((asa) this).field_p = var4.field_p;
          ((asa) this).field_f = var4.field_f;
          ((asa) this).field_l = var4.field_l;
          ((asa) this).field_m = var4.field_m;
          ((asa) this).field_h = var4.field_h;
          ((asa) this).field_q = var4.field_q;
          ((asa) this).field_o = var4.field_o;
          ((asa) this).field_n = 0.0f;
          ((asa) this).field_g = var4.field_g;
          ((asa) this).field_i = 0.0f;
          ((asa) this).field_e = 0.0f;
          ((asa) this).field_k = var4.field_k;
          return;
        } else {
          var5 = (asa) (Object) param1;
          ((asa) this).field_p = var5.field_p;
          ((asa) this).field_f = var5.field_f;
          ((asa) this).field_l = var5.field_l;
          ((asa) this).field_m = var5.field_m;
          ((asa) this).field_h = var5.field_h;
          ((asa) this).field_q = var5.field_q;
          ((asa) this).field_o = var5.field_o;
          ((asa) this).field_n = 0.0f;
          ((asa) this).field_g = var5.field_g;
          ((asa) this).field_i = 0.0f;
          ((asa) this).field_e = 0.0f;
          ((asa) this).field_k = var5.field_k;
          return;
        }
    }

    final float a(float param0, float param1, float param2, byte param3) {
        if (param3 < 122) {
          ((asa) this).field_f = 0.6931706070899963f;
          return ((asa) this).field_m * param1 + (param2 * ((asa) this).field_q + ((asa) this).field_k * param0) + ((asa) this).field_n;
        } else {
          return ((asa) this).field_m * param1 + (param2 * ((asa) this).field_q + ((asa) this).field_k * param0) + ((asa) this).field_n;
        }
    }

    final float[] b(float[] param0, int param1) {
        Object var4 = null;
        param0[1] = ((asa) this).field_l;
        param0[4] = ((asa) this).field_k;
        param0[9] = ((asa) this).field_o;
        param0[2] = ((asa) this).field_f;
        param0[12] = 0.0f;
        param0[8] = ((asa) this).field_p;
        if (param1 <= 1) {
          var4 = null;
          ((asa) this).b((gda) null, -14);
          param0[7] = 0.0f;
          param0[10] = ((asa) this).field_h;
          param0[3] = 0.0f;
          param0[15] = 0.0f;
          param0[11] = 0.0f;
          param0[14] = 0.0f;
          param0[0] = ((asa) this).field_g;
          param0[6] = ((asa) this).field_m;
          param0[5] = ((asa) this).field_q;
          param0[13] = 0.0f;
          return param0;
        } else {
          param0[7] = 0.0f;
          param0[10] = ((asa) this).field_h;
          param0[3] = 0.0f;
          param0[15] = 0.0f;
          param0[11] = 0.0f;
          param0[14] = 0.0f;
          param0[0] = ((asa) this).field_g;
          param0[6] = ((asa) this).field_m;
          param0[5] = ((asa) this).field_q;
          param0[13] = 0.0f;
          return param0;
        }
    }

    final void a(float param0, int param1, int param2, int param3, int param4, float param5, float param6) {
        float var8 = 0.0f;
        float var9 = 0.0f;
        Object var10 = null;
        L0: {
          if (param3 != 0) {
            var8 = ph.field_c[16383 & param3];
            var9 = ph.field_n[16383 & param3];
            ((asa) this).field_e = (-(0.5f * var8) + 0.5f * var9) * (float)(2 * param1) + param0;
            ((asa) this).field_f = 0.0f;
            ((asa) this).field_l = (float)param2 * (var9 * -2.0f);
            ((asa) this).field_p = 0.0f;
            ((asa) this).field_n = param6 + (-(0.5f * var8) + -0.5f * var9) * (float)(param2 * 2);
            ((asa) this).field_m = 0.0f;
            ((asa) this).field_h = 1.0f;
            ((asa) this).field_k = var9 * 2.0f * (float)param1;
            ((asa) this).field_o = 0.0f;
            ((asa) this).field_i = param5;
            ((asa) this).field_g = (float)param1 * (var8 * 2.0f);
            ((asa) this).field_q = var8 * 2.0f * (float)param2;
            break L0;
          } else {
            ((asa) this).field_o = 0.0f;
            ((asa) this).field_i = param5;
            ((asa) this).field_e = (float)(-param1) + param0;
            ((asa) this).field_l = 0.0f;
            ((asa) this).field_p = 0.0f;
            ((asa) this).field_m = 0.0f;
            ((asa) this).field_f = 0.0f;
            ((asa) this).field_n = (float)(-param2) + param6;
            ((asa) this).field_h = 1.0f;
            ((asa) this).field_g = (float)(param1 * 2);
            ((asa) this).field_q = (float)(param2 * 2);
            ((asa) this).field_k = 0.0f;
            break L0;
          }
        }
        if (param4 != 2) {
          var10 = null;
          ((asa) this).a(-20, (gda) null);
          return;
        } else {
          return;
        }
    }

    public static void e(int param0) {
        if (param0 != 14) {
            asa.e(96);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static void a(int param0, eua param1) {
        if (param1 == null) {
          return;
        } else {
          kga.field_n = param1;
          rua.field_gb.field_J.d(8);
          rua.field_gb.b(-125, (jea) (Object) kga.field_n);
          if (param0 >= -20) {
            field_j = null;
            vo.field_b = true;
            return;
          } else {
            vo.field_b = true;
            return;
          }
        }
    }

    final float a(int param0, float param1, float param2, float param3) {
        Object var6 = null;
        if (param0 != 1) {
          var6 = null;
          ((asa) this).b((gda) null, -20);
          return ((asa) this).field_e + (param3 * ((asa) this).field_f + (((asa) this).field_l * param2 + param1 * ((asa) this).field_g));
        } else {
          return ((asa) this).field_e + (param3 * ((asa) this).field_f + (((asa) this).field_l * param2 + param1 * ((asa) this).field_g));
        }
    }

    final void a(int param0, float param1, float param2, float[] param3, float param4, float param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param0 == 32560) {
          param3[1] = ((asa) this).field_k * param2 + param5 * ((asa) this).field_q + param1 * ((asa) this).field_m;
          param3[0] = param1 * ((asa) this).field_f + (((asa) this).field_l * param5 + param2 * ((asa) this).field_g);
          if (0.00390625f >= param2) {
            if (param2 >= -0.00390625f) {
              if (param5 <= 0.00390625f) {
                if (-0.00390625f > param5) {
                  var10 = -param4 / param5;
                  var8 = ((asa) this).field_n + ((asa) this).field_q * var10;
                  var9 = ((asa) this).field_i + ((asa) this).field_o * var10;
                  var7 = var10 * ((asa) this).field_l + ((asa) this).field_e;
                  param3[2] = ((asa) this).field_p * param2 + ((asa) this).field_o * param5 + param1 * ((asa) this).field_h;
                  param3[3] = -(var9 * param3[2] + (var8 * param3[1] + param3[0] * var7));
                  return;
                } else {
                  var10 = -param4 / param1;
                  var7 = ((asa) this).field_e + var10 * ((asa) this).field_f;
                  var9 = ((asa) this).field_i + var10 * ((asa) this).field_h;
                  var8 = var10 * ((asa) this).field_m + ((asa) this).field_n;
                  param3[2] = ((asa) this).field_p * param2 + ((asa) this).field_o * param5 + param1 * ((asa) this).field_h;
                  param3[3] = -(var9 * param3[2] + (var8 * param3[1] + param3[0] * var7));
                  return;
                }
              } else {
                var10 = -param4 / param5;
                var8 = ((asa) this).field_n + ((asa) this).field_q * var10;
                var9 = ((asa) this).field_i + ((asa) this).field_o * var10;
                var7 = var10 * ((asa) this).field_l + ((asa) this).field_e;
                param3[2] = ((asa) this).field_p * param2 + ((asa) this).field_o * param5 + param1 * ((asa) this).field_h;
                param3[3] = -(var9 * param3[2] + (var8 * param3[1] + param3[0] * var7));
                return;
              }
            } else {
              var10 = -param4 / param2;
              var7 = ((asa) this).field_e + ((asa) this).field_g * var10;
              var9 = ((asa) this).field_i + var10 * ((asa) this).field_p;
              var8 = ((asa) this).field_k * var10 + ((asa) this).field_n;
              param3[2] = ((asa) this).field_p * param2 + ((asa) this).field_o * param5 + param1 * ((asa) this).field_h;
              param3[3] = -(var9 * param3[2] + (var8 * param3[1] + param3[0] * var7));
              return;
            }
          } else {
            var10 = -param4 / param2;
            var7 = ((asa) this).field_e + ((asa) this).field_g * var10;
            var9 = ((asa) this).field_i + var10 * ((asa) this).field_p;
            var8 = ((asa) this).field_k * var10 + ((asa) this).field_n;
            param3[2] = ((asa) this).field_p * param2 + ((asa) this).field_o * param5 + param1 * ((asa) this).field_h;
            param3[3] = -(var9 * param3[2] + (var8 * param3[1] + param3[0] * var7));
            return;
          }
        } else {
          return;
        }
    }

    final void a(float param0, float param1, boolean param2, float param3) {
        Object var6 = null;
        ((asa) this).field_e = 0.0f;
        ((asa) this).field_k = 0.0f;
        ((asa) this).field_g = param1;
        ((asa) this).field_o = 0.0f;
        ((asa) this).field_i = 0.0f;
        ((asa) this).field_f = 0.0f;
        if (param2) {
          var6 = null;
          ((asa) this).b((gda) null, 20);
          ((asa) this).field_n = 0.0f;
          ((asa) this).field_m = 0.0f;
          ((asa) this).field_h = param0;
          ((asa) this).field_p = 0.0f;
          ((asa) this).field_q = param3;
          ((asa) this).field_l = 0.0f;
          return;
        } else {
          ((asa) this).field_n = 0.0f;
          ((asa) this).field_m = 0.0f;
          ((asa) this).field_h = param0;
          ((asa) this).field_p = 0.0f;
          ((asa) this).field_q = param3;
          ((asa) this).field_l = 0.0f;
          return;
        }
    }

    final void a(gda param0, int param1) {
        asa var3 = null;
        var3 = (asa) (Object) param0;
        ((asa) this).field_q = var3.field_q;
        ((asa) this).field_k = var3.field_k;
        ((asa) this).field_g = var3.field_g;
        ((asa) this).field_i = var3.field_i;
        ((asa) this).field_e = var3.field_e;
        ((asa) this).field_h = var3.field_h;
        ((asa) this).field_n = var3.field_n;
        ((asa) this).field_p = var3.field_p;
        if (param1 != 1) {
          ((asa) this).field_e = 0.3872254192829132f;
          ((asa) this).field_o = var3.field_o;
          ((asa) this).field_f = var3.field_f;
          ((asa) this).field_m = var3.field_m;
          ((asa) this).field_l = var3.field_l;
          return;
        } else {
          ((asa) this).field_o = var3.field_o;
          ((asa) this).field_f = var3.field_f;
          ((asa) this).field_m = var3.field_m;
          ((asa) this).field_l = var3.field_l;
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((asa) this).field_n = (float)param2;
        ((asa) this).field_p = 0.0f;
        ((asa) this).field_o = 0.0f;
        ((asa) this).field_e = (float)param1;
        if (param0) {
          ((asa) this).a(-0.05258991941809654f, 0.013552773743867874f, false, 0.009597906842827797f);
          ((asa) this).field_f = 0.0f;
          ((asa) this).field_m = 0.0f;
          ((asa) this).field_i = (float)param3;
          ((asa) this).field_g = 1.0f;
          ((asa) this).field_k = 0.0f;
          ((asa) this).field_h = 1.0f;
          ((asa) this).field_l = 0.0f;
          ((asa) this).field_q = 1.0f;
          return;
        } else {
          ((asa) this).field_f = 0.0f;
          ((asa) this).field_m = 0.0f;
          ((asa) this).field_i = (float)param3;
          ((asa) this).field_g = 1.0f;
          ((asa) this).field_k = 0.0f;
          ((asa) this).field_h = 1.0f;
          ((asa) this).field_l = 0.0f;
          ((asa) this).field_q = 1.0f;
          return;
        }
    }

    asa() {
        ((asa) this).a();
    }

    static {
    }
}
