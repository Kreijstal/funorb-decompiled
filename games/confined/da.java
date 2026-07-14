/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static boolean field_b;
    private double field_c;
    private double field_f;
    static String field_a;
    private double field_d;
    static boolean field_i;
    static bi field_g;
    static vc field_j;
    static int field_h;
    private double field_k;
    static jb field_e;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        if (param3 <= -75) {
          if (param7 > param2) {
            if (param7 >= param4) {
              if (param2 < param4) {
                mb.a(param7, param6, param4, param2, param1, fn.field_h, param5, param0, (byte) 112);
                return;
              } else {
                mb.a(param7, param6, param2, param4, param0, fn.field_h, param5, param1, (byte) 112);
                return;
              }
            } else {
              mb.a(param4, param6, param7, param2, param1, fn.field_h, param0, param5, (byte) 112);
              return;
            }
          } else {
            if (param4 <= param2) {
              if (param4 > param7) {
                mb.a(param2, param6, param4, param7, param5, fn.field_h, param1, param0, (byte) 112);
                return;
              } else {
                mb.a(param2, param6, param7, param4, param0, fn.field_h, param1, param5, (byte) 112);
                return;
              }
            } else {
              mb.a(param4, param6, param2, param7, param5, fn.field_h, param0, param1, (byte) 112);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(double param0, byte param1) {
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        var4 = Math.sqrt(((da) this).field_f * ((da) this).field_f + ((da) this).field_c * ((da) this).field_c + ((da) this).field_d * ((da) this).field_d);
        if (var4 <= 0.0001) {
          return;
        } else {
          if (param1 != -65) {
            ((da) this).field_k = -1.916192409169927;
            var6 = Math.atan2(var4, ((da) this).field_k);
            var8 = ((da) this).field_f / var4;
            var10 = ((da) this).field_c / var4;
            var6 = var6 * param0;
            var12 = ((da) this).field_d / var4;
            ((da) this).field_k = Math.cos(var6);
            var4 = Math.sin(var6);
            ((da) this).field_c = var4 * var10;
            ((da) this).field_f = var4 * var8;
            ((da) this).field_d = var4 * var12;
            return;
          } else {
            var6 = Math.atan2(var4, ((da) this).field_k);
            var8 = ((da) this).field_f / var4;
            var10 = ((da) this).field_c / var4;
            var6 = var6 * param0;
            var12 = ((da) this).field_d / var4;
            ((da) this).field_k = Math.cos(var6);
            var4 = Math.sin(var6);
            ((da) this).field_c = var4 * var10;
            ((da) this).field_f = var4 * var8;
            ((da) this).field_d = var4 * var12;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_e = null;
        if (param0 != -12961) {
            da.a(69, -21, 50, (byte) -48, 34, -124, -53, 1);
        }
    }

    final void a(byte param0, da param1, double param2) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        Object var16 = null;
        double stackIn_5_0 = 0.0;
        double stackOut_4_0 = 0.0;
        double stackOut_3_0 = 0.0;
        double stackOut_2_0 = 0.0;
        L0: {
          var15 = Confined.field_J ? 1 : 0;
          var5 = ((da) this).field_d * param1.field_d + (param1.field_k * ((da) this).field_k + param1.field_f * ((da) this).field_f + ((da) this).field_c * param1.field_c);
          if (1.0 <= var5) {
            stackOut_4_0 = 0.0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (-1.0 < var5) {
              stackOut_3_0 = Math.acos(var5);
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 3.141592653589793;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        var7 = stackIn_5_0;
        if (var7 >= 0.0001) {
          if (var7 <= 3.141492653589793) {
            var9 = Math.sin(var7);
            var11 = Math.sin(var7 * (1.0 - param2)) / var9;
            var13 = Math.sin(var7 * param2) / var9;
            ((da) this).field_d = ((da) this).field_d * var11 + param1.field_d * var13;
            ((da) this).field_f = param1.field_f * var13 + var11 * ((da) this).field_f;
            ((da) this).field_c = param1.field_c * var13 + var11 * ((da) this).field_c;
            ((da) this).field_k = ((da) this).field_k * var11 + param1.field_k * var13;
            if (param0 == 116) {
              var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
              if (1e-7 <= var9) {
                var9 = 1.0 / var9;
                ((da) this).field_k = ((da) this).field_k * var9;
                ((da) this).field_f = ((da) this).field_f * var9;
                ((da) this).field_c = ((da) this).field_c * var9;
                ((da) this).field_d = ((da) this).field_d * var9;
                return;
              } else {
                ((da) this).field_k = 1.0;
                ((da) this).field_c = 0.0;
                ((da) this).field_f = 0.0;
                ((da) this).field_d = 0.0;
                return;
              }
            } else {
              var16 = null;
              ((da) this).a(87, (da) null);
              var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
              if (1e-7 <= var9) {
                var9 = 1.0 / var9;
                ((da) this).field_k = ((da) this).field_k * var9;
                ((da) this).field_f = ((da) this).field_f * var9;
                ((da) this).field_c = ((da) this).field_c * var9;
                ((da) this).field_d = ((da) this).field_d * var9;
                return;
              } else {
                ((da) this).field_k = 1.0;
                ((da) this).field_c = 0.0;
                ((da) this).field_f = 0.0;
                ((da) this).field_d = 0.0;
                return;
              }
            }
          } else {
            ((da) this).field_d = ((da) this).field_d + (param1.field_d - ((da) this).field_d) * param2;
            ((da) this).field_k = ((da) this).field_k + param2 * (-((da) this).field_k + param1.field_k);
            ((da) this).field_f = ((da) this).field_f + param2 * (param1.field_f - ((da) this).field_f);
            ((da) this).field_c = ((da) this).field_c + (param1.field_c - ((da) this).field_c) * param2;
            if (param0 == 116) {
              var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
              if (1e-7 > var9) {
                ((da) this).field_k = 1.0;
                ((da) this).field_c = 0.0;
                ((da) this).field_f = 0.0;
                ((da) this).field_d = 0.0;
                return;
              } else {
                var9 = 1.0 / var9;
                ((da) this).field_k = ((da) this).field_k * var9;
                ((da) this).field_f = ((da) this).field_f * var9;
                ((da) this).field_c = ((da) this).field_c * var9;
                ((da) this).field_d = ((da) this).field_d * var9;
                return;
              }
            } else {
              var16 = null;
              ((da) this).a(87, (da) null);
              var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
              if (1e-7 > var9) {
                ((da) this).field_k = 1.0;
                ((da) this).field_c = 0.0;
                ((da) this).field_f = 0.0;
                ((da) this).field_d = 0.0;
                return;
              } else {
                var9 = 1.0 / var9;
                ((da) this).field_k = ((da) this).field_k * var9;
                ((da) this).field_f = ((da) this).field_f * var9;
                ((da) this).field_c = ((da) this).field_c * var9;
                ((da) this).field_d = ((da) this).field_d * var9;
                return;
              }
            }
          }
        } else {
          ((da) this).field_d = ((da) this).field_d + (param1.field_d - ((da) this).field_d) * param2;
          ((da) this).field_k = ((da) this).field_k + param2 * (-((da) this).field_k + param1.field_k);
          ((da) this).field_f = ((da) this).field_f + param2 * (param1.field_f - ((da) this).field_f);
          ((da) this).field_c = ((da) this).field_c + (param1.field_c - ((da) this).field_c) * param2;
          if (param0 == 116) {
            var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
            if (1e-7 <= var9) {
              var9 = 1.0 / var9;
              ((da) this).field_k = ((da) this).field_k * var9;
              ((da) this).field_f = ((da) this).field_f * var9;
              ((da) this).field_c = ((da) this).field_c * var9;
              ((da) this).field_d = ((da) this).field_d * var9;
              return;
            } else {
              ((da) this).field_k = 1.0;
              ((da) this).field_c = 0.0;
              ((da) this).field_f = 0.0;
              ((da) this).field_d = 0.0;
              return;
            }
          } else {
            var16 = null;
            ((da) this).a(87, (da) null);
            var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
            if (1e-7 <= var9) {
              var9 = 1.0 / var9;
              ((da) this).field_k = ((da) this).field_k * var9;
              ((da) this).field_f = ((da) this).field_f * var9;
              ((da) this).field_c = ((da) this).field_c * var9;
              ((da) this).field_d = ((da) this).field_d * var9;
              return;
            } else {
              ((da) this).field_k = 1.0;
              ((da) this).field_c = 0.0;
              ((da) this).field_f = 0.0;
              ((da) this).field_d = 0.0;
              return;
            }
          }
        }
    }

    final void a(int[] param0, int param1) {
        double var3 = ((da) this).field_k * ((da) this).field_k;
        double var5 = ((da) this).field_f * ((da) this).field_k;
        double var7 = ((da) this).field_c * ((da) this).field_k;
        double var9 = ((da) this).field_k * ((da) this).field_d;
        double var11 = ((da) this).field_f * ((da) this).field_f;
        double var13 = ((da) this).field_c * ((da) this).field_f;
        double var15 = ((da) this).field_f * ((da) this).field_d;
        int var19 = -87 % ((-38 - param1) / 58);
        double var17 = ((da) this).field_c * ((da) this).field_c;
        double var20 = ((da) this).field_c * ((da) this).field_d;
        double var22 = ((da) this).field_d * ((da) this).field_d;
        param0[11] = (int)(65536.0 * (-var11 + (var22 + var3 - var17)));
        param0[9] = (int)(65536.0 * (var7 + (var15 + var7 + var15)));
        param0[8] = (int)((var20 + (var5 + var20) + var5) * 65536.0);
        param0[4] = (int)((var9 + var13 + var13 + var9) * 65536.0);
        param0[7] = (int)((-var22 + (var17 + var3 - var11)) * 65536.0);
        param0[3] = (int)(65536.0 * (var11 + var3 - var22 - var17));
        param0[6] = (int)((-var9 + (var13 - var9) + var13) * 65536.0);
        param0[5] = (int)(65536.0 * (-var7 + var15 - var7 + var15));
        param0[10] = (int)((var20 + (-var5 + (-var5 + var20))) * 65536.0);
    }

    final void a(byte param0, double[] param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        var3 = ((da) this).field_k * ((da) this).field_k;
        var5 = ((da) this).field_f * ((da) this).field_k;
        var7 = ((da) this).field_c * ((da) this).field_k;
        var9 = ((da) this).field_k * ((da) this).field_d;
        var11 = ((da) this).field_f * ((da) this).field_f;
        var13 = ((da) this).field_f * ((da) this).field_c;
        var15 = ((da) this).field_f * ((da) this).field_d;
        var17 = ((da) this).field_c * ((da) this).field_c;
        var19 = ((da) this).field_d * ((da) this).field_c;
        var21 = ((da) this).field_d * ((da) this).field_d;
        param1[3] = -var17 + (var3 + var11 - var21);
        param1[5] = -var7 + (var15 - var7) + var15;
        param1[11] = -var11 + (var3 + var21 - var17);
        param1[8] = var5 + (var19 + var5 + var19);
        param1[4] = var9 + (var13 + var9 + var13);
        param1[9] = var15 + (var7 + var15) + var7;
        param1[7] = var17 + var3 - var11 - var21;
        if (param0 <= 19) {
          return;
        } else {
          param1[6] = var13 - var9 - var9 + var13;
          param1[10] = var19 + (-var5 + (-var5 + var19));
          return;
        }
    }

    final void a(double param0, double param1, double param2, double param3, int param4) {
        double var10 = 0.0;
        double var12 = 0.0;
        param0 = param0 * 0.5;
        var10 = Math.sin(param0);
        var12 = Math.cos(param0);
        ((da) this).field_k = var12;
        if (param4 != 7) {
          field_a = null;
          ((da) this).field_d = param1 * var10;
          ((da) this).field_f = var10 * param2;
          ((da) this).field_c = var10 * param3;
          return;
        } else {
          ((da) this).field_d = param1 * var10;
          ((da) this).field_f = var10 * param2;
          ((da) this).field_c = var10 * param3;
          return;
        }
    }

    final void a(int param0, da param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        var3 = -(param1.field_f * ((da) this).field_f) + ((da) this).field_k * param1.field_k - ((da) this).field_c * param1.field_c - ((da) this).field_d * param1.field_d;
        var5 = -(((da) this).field_c * param1.field_d) + (((da) this).field_d * param1.field_c + (param1.field_f * ((da) this).field_k + ((da) this).field_f * param1.field_k));
        var7 = ((da) this).field_k * param1.field_c + param1.field_k * ((da) this).field_c + param1.field_d * ((da) this).field_f - param1.field_f * ((da) this).field_d;
        ((da) this).field_d = param1.field_f * ((da) this).field_c + (param1.field_k * ((da) this).field_d + ((da) this).field_k * param1.field_d) - param1.field_c * ((da) this).field_f;
        ((da) this).field_k = var3;
        ((da) this).field_f = var5;
        ((da) this).field_c = var7;
        if (param0 > -6) {
          return;
        } else {
          var9 = 1.0 / Math.sqrt(((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k) + ((da) this).field_d * ((da) this).field_d);
          ((da) this).field_d = ((da) this).field_d * var9;
          ((da) this).field_k = ((da) this).field_k * var9;
          ((da) this).field_c = ((da) this).field_c * var9;
          ((da) this).field_f = ((da) this).field_f * var9;
          return;
        }
    }

    final void a(int param0) {
        ((da) this).field_k = 1.0;
        ((da) this).field_d = (double)param0;
        ((da) this).field_f = 0.0;
        ((da) this).field_c = 0.0;
    }

    final static void a(int param0, int param1, bi param2, boolean param3, pm param4) {
        gk var5 = new gk(param4, param2, param1);
        var5.field_m = param0;
        var5.field_o = param3 ? true : false;
        var5.e(6466);
        var5.field_t = null;
    }

    da() {
        ((da) this).field_k = 1.0;
    }

    da(da param0) {
        ((da) this).field_c = param0.field_c;
        ((da) this).field_k = param0.field_k;
        ((da) this).field_d = param0.field_d;
        ((da) this).field_f = param0.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_i = true;
        field_a = "Upgrade controls";
    }
}
