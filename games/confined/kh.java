/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends dc {
    static bi field_fb;
    static jg field_gb;
    static String field_W;

    final boolean a(int param0, boolean param1, pm param2) {
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        if (((kh) this).field_T == param2) {
          return false;
        } else {
          if (param2.c(5)) {
            L0: {
              var4 = -((kh) this).field_cb + param2.field_E;
              var6 = param2.field_t - ((kh) this).field_L;
              var8 = -((kh) this).field_X + param2.field_D;
              var10 = ((kh) this).field_x * var4 + var6 * ((kh) this).field_P + var8 * ((kh) this).field_K;
              if (var10 < (double)param0) {
                break L0;
              } else {
                var12 = var4 - var10 * ((kh) this).field_x;
                var14 = var6 - var10 * ((kh) this).field_P;
                var16 = var8 - var10 * ((kh) this).field_K;
                var18 = var16 * var16 + (var14 * var14 + var12 * var12);
                var20 = param2.field_C * param2.field_C;
                if (var18 < var20) {
                  L1: {
                    var22 = Math.sqrt(var20 - var18);
                    var24 = var10 - var22;
                    if (!param1) {
                      break L1;
                    } else {
                      if (((kh) this).field_y > var24) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                  ((kh) this).field_R = ((kh) this).field_cb + ((kh) this).field_x * var24;
                  ((kh) this).field_y = var24;
                  ((kh) this).field_s = ((kh) this).field_L + ((kh) this).field_P * var24;
                  ((kh) this).field_S = param2;
                  ((kh) this).field_eb = var24 * ((kh) this).field_K + ((kh) this).field_X;
                  return true;
                } else {
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void i(int param0) {
        lc var3 = ((kh) this).field_T.field_A.field_x;
        lc var2 = var3;
        ((kh) this).field_S = null;
        ((kh) this).field_eb = var2.field_r[var3.field_a - param0];
        ((kh) this).field_y = (((kh) this).field_eb - ((kh) this).field_X) / ((kh) this).field_K;
        ((kh) this).field_R = ((kh) this).field_cb + ((kh) this).field_x * ((kh) this).field_y;
        ((kh) this).field_s = ((kh) this).field_P * ((kh) this).field_y + ((kh) this).field_L;
    }

    private final boolean a(int param0, boolean param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        double[] var7 = null;
        double[] var8 = null;
        double[] var9 = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24 = 0;
        lc var25 = null;
        lc var26 = null;
        L0: {
          var24 = Confined.field_J ? 1 : 0;
          var25 = ((kh) this).field_T.field_A.field_x;
          var26 = var25;
          var5 = var26.field_f + -1;
          if (param2) {
            break L0;
          } else {
            field_fb = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= var26.field_f) {
            return param1;
          } else {
            L2: {
              var7 = new double[]{var25.field_v[param0][var6], var25.field_v[1 + param0][var6], var25.field_v[param0 - -1][var5], var25.field_v[param0][var5]};
              var8 = new double[]{var25.field_n[param0][var6], var25.field_n[1 + param0][var6], var25.field_n[param0 + 1][var5], var25.field_n[param0][var5]};
              var9 = new double[]{var25.field_r[param0], var25.field_r[1 + param0], var25.field_r[1 + param0], var25.field_r[param0]};
              var10 = -var7[1] + var7[2];
              var12 = var8[2] - var8[1];
              var14 = -var7[3] + var7[2];
              var16 = -var8[3] + var8[2];
              var18 = var9[2] - var9[3];
              var20 = var7[0] - var7[1];
              var22 = var8[0] - var8[1];
              if (0.0 <= (-(var10 * (var22 + var16)) + (var14 + var20) * var12) * var18) {
                L3: {
                  if (!this.a(var9[2], (byte) -32, param1, var9[0], var7[1], var7[2], var8[1], var8[2], var9[1], var8[0], var7[0])) {
                    break L3;
                  } else {
                    param1 = true;
                    break L3;
                  }
                }
                if (!this.a(var9[0], (byte) -32, param1, var9[2], var7[3], var7[0], var8[3], var8[0], var9[3], var8[2], var7[2])) {
                  break L2;
                } else {
                  param1 = true;
                  break L2;
                }
              } else {
                L4: {
                  if (!this.a(var9[1], (byte) -32, param1, var9[3], var7[0], var7[1], var8[0], var8[1], var9[0], var8[3], var7[3])) {
                    break L4;
                  } else {
                    param1 = true;
                    break L4;
                  }
                }
                if (!this.a(var9[3], (byte) -32, param1, var9[1], var7[2], var7[3], var8[2], var8[3], var9[2], var8[1], var7[1])) {
                  break L2;
                } else {
                  param1 = true;
                  var5 = var6;
                  var6++;
                  continue L1;
                }
              }
            }
            var5 = var6;
            var6++;
            continue L1;
          }
        }
    }

    final void f(byte param0) {
        lc var3 = ((kh) this).field_T.field_A.field_x;
        lc var2 = var3;
        if (param0 >= -117) {
            field_fb = null;
        }
        ((kh) this).field_S = null;
        ((kh) this).field_eb = var3.field_r[0];
        ((kh) this).field_y = (-((kh) this).field_X + ((kh) this).field_eb) / ((kh) this).field_K;
        ((kh) this).field_s = ((kh) this).field_P * ((kh) this).field_y + ((kh) this).field_L;
        ((kh) this).field_R = ((kh) this).field_cb + ((kh) this).field_y * ((kh) this).field_x;
    }

    public static void g(byte param0) {
        field_fb = null;
        field_gb = null;
        if (param0 <= 13) {
            return;
        }
        field_W = null;
    }

    kh(pm param0, bi param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(boolean param0, int param1, int param2) {
        lc var13 = ((kh) this).field_T.field_A.field_x;
        lc var14 = var13;
        double var5 = var13.field_r[param2];
        if (param1 != 28) {
            return true;
        }
        if (0.001 * (var5 - ((kh) this).field_X) > ((kh) this).field_K) {
            return this.a(param2 - 1, param0, true);
        }
        double var7 = (-((kh) this).field_X + var5) / ((kh) this).field_K;
        double var9 = ((kh) this).field_x * var7 + ((kh) this).field_cb;
        double var11 = var7 * ((kh) this).field_P + ((kh) this).field_L;
        if (var14.a(var11, var9, (byte) 29, param2)) {
            return this.a(-1 + param2, param0, true);
        }
        return false;
    }

    final static void a(byte param0, boolean param1) {
        vg.field_Z.a((byte) -47, 0, 0);
        if (param0 != 35) {
            kh.a((byte) -77, false);
        }
    }

    final static void h(int param0) {
        int var1 = 57 % ((0 - param0) / 62);
        tj.field_z[45] = 26;
        tj.field_z[46] = 72;
        tj.field_z[44] = 71;
        tj.field_z[91] = 42;
        tj.field_z[92] = 74;
        tj.field_z[59] = 57;
        tj.field_z[520] = 59;
        tj.field_z[222] = 58;
        tj.field_z[192] = 28;
        tj.field_z[61] = 27;
        tj.field_z[93] = 43;
        tj.field_z[47] = 73;
    }

    private final boolean a(double param0, byte param1, boolean param2, double param3, double param4, double param5, double param6, double param7, double param8, double param9, double param10) {
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        L0: {
          if (param1 == -32) {
            break L0;
          } else {
            field_fb = null;
            break L0;
          }
        }
        param5 = param5 - param10;
        param7 = param7 - param9;
        param8 = param8 - param3;
        param0 = param0 - param3;
        param4 = param4 - param10;
        param6 = param6 - param9;
        var21 = param6 * param0 - param8 * param7;
        var23 = -(param4 * param0) + param5 * param8;
        var25 = -(param5 * param6) + param4 * param7;
        var27 = var25 * var25 + (var21 * var21 + var23 * var23);
        if (0.000001 > var27) {
          return false;
        } else {
          var27 = 1.0 / Math.sqrt(var27);
          var23 = var23 * var27;
          var25 = var25 * var27;
          var21 = var21 * var27;
          var27 = param10 - ((kh) this).field_cb;
          var29 = param9 - ((kh) this).field_L;
          var31 = param3 - ((kh) this).field_X;
          var33 = var25 * var31 + (var27 * var21 + var23 * var29);
          if (var33 < 0.0) {
            var35 = ((kh) this).field_K * var25 + (var21 * ((kh) this).field_x + var23 * ((kh) this).field_P);
            if (0.0001 * var33 >= var35) {
              L1: {
                var37 = var33 / var35;
                if (!param2) {
                  break L1;
                } else {
                  if (var37 >= ((kh) this).field_y) {
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              ((kh) this).field_s = ((kh) this).field_P * var37 + ((kh) this).field_L;
              ((kh) this).field_S = null;
              ((kh) this).field_y = var37;
              ((kh) this).field_eb = ((kh) this).field_X + ((kh) this).field_K * var37;
              ((kh) this).field_R = ((kh) this).field_x * var37 + ((kh) this).field_cb;
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(double param0, int param1, double param2, double param3, double param4, double param5, double param6, double param7, boolean param8, double param9) {
        ((kh) this).field_x = param7;
        ((kh) this).field_L = param0;
        ((kh) this).field_K = param2;
        ((kh) this).field_P = param9;
        if (param8) {
            return;
        }
        ((kh) this).field_H = param1;
        ((kh) this).field_cb = param6;
        ((kh) this).field_u = param3;
        ((kh) this).field_B = param4;
        ((kh) this).field_X = param5;
    }

    final boolean a(int param0, byte param1, boolean param2) {
        int var5 = 14 % ((param1 - 63) / 56);
        lc var14 = ((kh) this).field_T.field_A.field_x;
        lc var15 = var14;
        double var6 = var14.field_r[param0];
        if (((kh) this).field_K > 0.001 * (-((kh) this).field_X + var6)) {
            return this.a(param0, param2, true);
        }
        double var8 = (-((kh) this).field_X + var6) / ((kh) this).field_K;
        double var10 = ((kh) this).field_cb + var8 * ((kh) this).field_x;
        double var12 = ((kh) this).field_L + var8 * ((kh) this).field_P;
        if (!var15.a(var12, var10, (byte) 55, param0)) {
            return false;
        }
        return this.a(param0, param2, true);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        var4 = new char[param1];
        var5 = param2;
        var6 = 0;
        L0: while (true) {
          if (param1 <= var6) {
            return new String(var4, 0, var5);
          } else {
            var7 = 255 & param0[param3 + var6];
            if (var7 != -1) {
              L1: {
                if (-129 > var7) {
                  break L1;
                } else {
                  if (-161 >= (var7 ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var8 = cd.field_m[var7 - 128];
                      if (var8 != 0) {
                        break L2;
                      } else {
                        var8 = 63;
                        break L2;
                      }
                    }
                    var7 = var8;
                    break L1;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
