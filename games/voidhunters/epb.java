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
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (param4 == 13) {
          param0[0] = param5 * ((epb) this).field_i + param1 * ((epb) this).field_k + ((epb) this).field_f * param3;
          param0[2] = param3 * ((epb) this).field_c + (((epb) this).field_b * param1 + ((epb) this).field_d * param5);
          if (0.00390625f >= param1) {
            if (-0.00390625f <= param1) {
              if (param5 <= 0.00390625f) {
                if (-0.00390625f > param5) {
                  var10 = -param2 / param5;
                  var9 = ((epb) this).field_l + ((epb) this).field_d * var10;
                  var7 = var10 * ((epb) this).field_i + ((epb) this).field_n;
                  var8 = var10 * ((epb) this).field_j + ((epb) this).field_e;
                  param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
                  param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
                  return;
                } else {
                  var10 = -param2 / param3;
                  var9 = ((epb) this).field_l + ((epb) this).field_c * var10;
                  var8 = ((epb) this).field_e + var10 * ((epb) this).field_g;
                  var7 = var10 * ((epb) this).field_f + ((epb) this).field_n;
                  param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
                  param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
                  return;
                }
              } else {
                var10 = -param2 / param5;
                var9 = ((epb) this).field_l + ((epb) this).field_d * var10;
                var7 = var10 * ((epb) this).field_i + ((epb) this).field_n;
                var8 = var10 * ((epb) this).field_j + ((epb) this).field_e;
                param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
                param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
                return;
              }
            } else {
              var10 = -param2 / param1;
              var8 = ((epb) this).field_h * var10 + ((epb) this).field_e;
              var7 = var10 * ((epb) this).field_k + ((epb) this).field_n;
              var9 = ((epb) this).field_l + ((epb) this).field_b * var10;
              param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
              param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
              return;
            }
          } else {
            var10 = -param2 / param1;
            var8 = ((epb) this).field_h * var10 + ((epb) this).field_e;
            var7 = var10 * ((epb) this).field_k + ((epb) this).field_n;
            var9 = ((epb) this).field_l + ((epb) this).field_b * var10;
            param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
            param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
            return;
          }
        } else {
          L0: {
            ((epb) this).field_l = -0.19119702279567719f;
            param0[0] = param5 * ((epb) this).field_i + param1 * ((epb) this).field_k + ((epb) this).field_f * param3;
            param0[2] = param3 * ((epb) this).field_c + (((epb) this).field_b * param1 + ((epb) this).field_d * param5);
            if (0.00390625f < param1) {
              break L0;
            } else {
              if (-0.00390625f <= param1) {
                if (param5 <= 0.00390625f) {
                  if (-0.00390625f > param5) {
                    var10 = -param2 / param5;
                    var9 = ((epb) this).field_l + ((epb) this).field_d * var10;
                    var7 = var10 * ((epb) this).field_i + ((epb) this).field_n;
                    var8 = var10 * ((epb) this).field_j + ((epb) this).field_e;
                    param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
                    param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
                    return;
                  } else {
                    var10 = -param2 / param3;
                    var9 = ((epb) this).field_l + ((epb) this).field_c * var10;
                    var8 = ((epb) this).field_e + var10 * ((epb) this).field_g;
                    var7 = var10 * ((epb) this).field_f + ((epb) this).field_n;
                    param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
                    param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
                    return;
                  }
                } else {
                  var10 = -param2 / param5;
                  var9 = ((epb) this).field_l + ((epb) this).field_d * var10;
                  var7 = var10 * ((epb) this).field_i + ((epb) this).field_n;
                  var8 = var10 * ((epb) this).field_j + ((epb) this).field_e;
                  param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
                  param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          var10 = -param2 / param1;
          var8 = ((epb) this).field_h * var10 + ((epb) this).field_e;
          var7 = var10 * ((epb) this).field_k + ((epb) this).field_n;
          var9 = ((epb) this).field_l + ((epb) this).field_b * var10;
          param0[1] = param3 * ((epb) this).field_g + (param1 * ((epb) this).field_h + ((epb) this).field_j * param5);
          param0[3] = -(param0[0] * var7 + var8 * param0[1] + var9 * param0[2]);
          return;
        }
    }

    final void a(boolean param0, pw param1) {
        epb var3 = null;
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
        if (param0) {
          epb.c(30);
          return;
        } else {
          return;
        }
    }

    final void a(pw param0, int param1) {
        epb var4 = null;
        var4 = (epb) (Object) param0;
        ((epb) this).field_f = var4.field_b;
        ((epb) this).field_k = var4.field_k;
        ((epb) this).field_i = var4.field_h;
        ((epb) this).field_g = var4.field_d;
        ((epb) this).field_h = var4.field_i;
        ((epb) this).field_j = var4.field_j;
        if (param1 != 14) {
          ((epb) this).a(-58, -73, -57, 3, -107, -43);
          ((epb) this).field_b = var4.field_f;
          ((epb) this).field_n = -(((epb) this).field_f * var4.field_l + (((epb) this).field_k * var4.field_n + ((epb) this).field_i * var4.field_e));
          ((epb) this).field_d = var4.field_g;
          ((epb) this).field_c = var4.field_c;
          ((epb) this).field_e = -(((epb) this).field_g * var4.field_l + (((epb) this).field_j * var4.field_e + var4.field_n * ((epb) this).field_h));
          ((epb) this).field_l = -(((epb) this).field_c * var4.field_l + (var4.field_n * ((epb) this).field_b + var4.field_e * ((epb) this).field_d));
          return;
        } else {
          ((epb) this).field_b = var4.field_f;
          ((epb) this).field_n = -(((epb) this).field_f * var4.field_l + (((epb) this).field_k * var4.field_n + ((epb) this).field_i * var4.field_e));
          ((epb) this).field_d = var4.field_g;
          ((epb) this).field_c = var4.field_c;
          ((epb) this).field_e = -(((epb) this).field_g * var4.field_l + (((epb) this).field_j * var4.field_e + var4.field_n * ((epb) this).field_h));
          ((epb) this).field_l = -(((epb) this).field_c * var4.field_l + (var4.field_n * ((epb) this).field_b + var4.field_e * ((epb) this).field_d));
          return;
        }
    }

    private final void a(int param0) {
        ((epb) this).field_n = 0.0f;
        ((epb) this).field_d = 0.0f;
        ((epb) this).field_l = 0.0f;
        ((epb) this).field_i = 0.0f;
        ((epb) this).field_b = 0.0f;
        ((epb) this).field_j = 1.0f;
        ((epb) this).field_e = 0.0f;
        ((epb) this).field_g = 0.0f;
        ((epb) this).field_h = 0.0f;
        ((epb) this).field_c = (float)param0;
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
        this.a(1);
    }

    static {
    }
}
