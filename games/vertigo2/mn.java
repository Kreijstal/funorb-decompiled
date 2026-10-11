/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends li {
    static mn field_v;
    static String field_p;
    static boolean[] field_t;
    static er[] field_o;
    int field_r;
    static cr field_n;
    static String field_u;
    static String[] field_q;
    int field_s;

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        field_u = null;
        field_v = null;
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 6) {
          field_p = (String) null;
        }
    }

    final static void b(boolean param0, int param1) {
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 ||
          null == gd.field_j) {
          im.field_g = false;
        }
        if (param0) {
          if (rk.field_y <= 0) {
            if (ko.field_P > 0) {
              ko.field_P = ko.field_P - 1;
            } else {
              if (0 < mp.field_b) {
                mp.field_b = mp.field_b - 1;
              }
            }
          } else {
            rk.field_y = rk.field_y - 1;
          }
        } else {
          if (null != gd.field_j) {
            if (0 >= rk.field_y) {
              if (ko.field_P > 0) {
                ko.field_P = ko.field_P - 1;
              } else {
                if (ld.field_b > mp.field_b) {
                  if (0 == mp.field_b) {
                    ed.a(false, false);
                  }
                  mp.field_b = mp.field_b + 1;
                }
              }
            } else {
              rk.field_y = rk.field_y - 1;
            }
          } else {
            if (sj.field_d != null) {
              if (rk.field_y <= 0) {
                if (0 < mp.field_b) {
                  mp.field_b = mp.field_b - 1;
                } else {
                  if (ko.field_P < ld.field_b) {
                    if (ko.field_P == 0) {
                      ed.a(true, false);
                    }
                    ko.field_P = ko.field_P + 1;
                  }
                }
              } else {
                rk.field_y = rk.field_y - 1;
              }
            } else {
              im.field_g = false;
              if (0 >= ko.field_P) {
                if (0 >= mp.field_b) {
                  if (rk.field_y < ld.field_b) {
                    if (rk.field_y == 0) {
                      ne.c(false);
                    }
                    rk.field_y = rk.field_y + 1;
                  }
                } else {
                  mp.field_b = mp.field_b - 1;
                }
              } else {
                ko.field_P = ko.field_P - 1;
              }
            }
          }
        }
        if (param1 > -113) {
          mn.a((byte) 97, -80);
        }
    }

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        double var23_double = 0.0;
        int var23 = 0;
        int var24 = 0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        float var1_floatLifetime1;
        int var2Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        double var8Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        double var13Lifetime1;
        double var15Lifetime1;
        double var17Lifetime1;
        double var19Lifetime1;
        double var21_doubleLifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        double var23_doubleLifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        double var25Lifetime1;
        double var27Lifetime1;
        double var29Lifetime1;
        var31 = Vertigo2.field_L ? 1 : 0;
        try {
          var1_float = 1.399999976158142f;
          oo.b(var1_float);
          for (var2 = 0; var2 < bm.field_G.length; var2++) {
            var32 = bm.field_G[var2];
            var4 = 0;
            var5 = 512;
            var6 = var4 * 128;
            var1_float = var1_float - 0.10000000149011612f;
            for (var7 = var4; var7 < var5; var7++) {
              var8 = (double)(var7 >> 3) / 64.0 + 0.0078125;
              var10 = (double)(var7 & 7) / 8.0 + 0.0625;
              for (var12 = 0; var12 < 128; var12++) {
                var13 = (double)var12 / 128.0;
                var15 = var13;
                var17 = var13;
                var19 = var13;
                if (var10 != 0.0) {
                  if (0.5 > var13) {
                    var21_double = (var10 + 1.0) * var13;
                  } else {
                    var21_double = var13 + var10 - var13 * var10;
                  }
                  var23_double = var13 * 2.0 - var21_double;
                  var25 = 0.3333333333333333 + var8;
                  if (1.0 < var25) {
                    var25 = var25 - 1.0;
                  }
                  var27 = var8;
                  var29 = var8 - 0.3333333333333333;
                  if (!(var27 * 6.0 < 1.0)) {
                    if (1.0 > 2.0 * var27) {
                      var17 = var21_double;
                    } else {
                      if (!(2.0 > 3.0 * var27)) {
                        var17 = var23_double;
                      } else {
                        var17 = var23_double + 6.0 * ((0.6666666666666666 - var27) * (-var23_double + var21_double));
                      }
                    }
                  } else {
                    var17 = var27 * ((-var23_double + var21_double) * 6.0) + var23_double;
                  }
                  if (!(1.0 > 6.0 * var25)) {
                    if (!(2.0 * var25 < 1.0)) {
                      if (3.0 * var25 < 2.0) {
                        var15 = (-var25 + 0.6666666666666666) * (-var23_double + var21_double) * 6.0 + var23_double;
                      } else {
                        var15 = var23_double;
                      }
                    } else {
                      var15 = var21_double;
                    }
                  } else {
                    var15 = var23_double + (-var23_double + var21_double) * 6.0 * var25;
                  }
                  if (0.0 > var29) {
                    var29 = var29 + 1.0;
                  }
                  if (var29 * 6.0 < 1.0) {
                    var19 = var23_double + var29 * ((-var23_double + var21_double) * 6.0);
                  } else {
                    if (2.0 * var29 < 1.0) {
                      var19 = var21_double;
                    } else {
                      if (!(2.0 > var29 * 3.0)) {
                        var19 = var23_double;
                      } else {
                        var19 = var23_double + (var21_double - var23_double) * (-var29 + 0.6666666666666666) * 6.0;
                      }
                    }
                  }
                }
                var15 = Math.pow(var15, (double)var1_float);
                var17 = Math.pow(var17, (double)var1_float);
                var19 = Math.pow(var19, (double)var1_float);
                var21 = (int)(var15 * 256.0);
                var22 = (int)(256.0 * var17);
                var23 = (int)(256.0 * var19);
                var24 = var23 + (var21 << 16) + (var22 << 8);
                if (0 == var24) {
                  var24 = 1;
                }
                var32[var6++] = var24;
              }
            }
          }
          var1_floatLifetime1 = 1.399999976158142f;
          for (var2Lifetime1 = 0; var2Lifetime1 < Vertigo2.field_J.length; var2Lifetime1++) {
            var33 = Vertigo2.field_J[var2Lifetime1];
            var4Lifetime1 = 0;
            var5Lifetime1 = 512;
            var1_floatLifetime1 = var1_floatLifetime1 + 0.07000000029802322f;
            var6Lifetime1 = var4Lifetime1 * 128;
            for (var7Lifetime1 = var4Lifetime1; var7Lifetime1 < var5Lifetime1; var7Lifetime1++) {
              var8Lifetime1 = (double)(var7Lifetime1 >> 3) / 64.0 + 0.0078125;
              var10Lifetime1 = (double)(7 & var7Lifetime1) / 8.0 + 0.0625;
              for (var12Lifetime1 = 0; var12Lifetime1 < 128; var12Lifetime1++) {
                var13Lifetime1 = (double)var12Lifetime1 / 128.0;
                var15Lifetime1 = var13Lifetime1;
                var17Lifetime1 = var13Lifetime1;
                var19Lifetime1 = var13Lifetime1;
                if (var10Lifetime1 != 0.0) {
                  if (var13Lifetime1 < 0.5) {
                    var21_doubleLifetime1 = var13Lifetime1 * (1.0 + var10Lifetime1);
                  } else {
                    var21_doubleLifetime1 = var10Lifetime1 + var13Lifetime1 - var13Lifetime1 * var10Lifetime1;
                  }
                  var23_doubleLifetime1 = 2.0 * var13Lifetime1 - var21_doubleLifetime1;
                  var25Lifetime1 = var8Lifetime1 + 0.3333333333333333;
                  if (1.0 < var25Lifetime1) {
                    var25Lifetime1 = var25Lifetime1 - 1.0;
                  }
                  var27Lifetime1 = var8Lifetime1;
                  var29Lifetime1 = var8Lifetime1 - 0.3333333333333333;
                  if (!(1.0 > var27Lifetime1 * 6.0)) {
                    if (!(1.0 > 2.0 * var27Lifetime1)) {
                      if (2.0 > 3.0 * var27Lifetime1) {
                        var17Lifetime1 = var23_doubleLifetime1 + 6.0 * ((-var23_doubleLifetime1 + var21_doubleLifetime1) * (0.6666666666666666 - var27Lifetime1));
                      } else {
                        var17Lifetime1 = var23_doubleLifetime1;
                      }
                    } else {
                      var17Lifetime1 = var21_doubleLifetime1;
                    }
                  } else {
                    var17Lifetime1 = var27Lifetime1 * ((-var23_doubleLifetime1 + var21_doubleLifetime1) * 6.0) + var23_doubleLifetime1;
                  }
                  if (1.0 > var25Lifetime1 * 6.0) {
                    var15Lifetime1 = var23_doubleLifetime1 + var25Lifetime1 * ((var21_doubleLifetime1 - var23_doubleLifetime1) * 6.0);
                  } else {
                    if (!(1.0 > var25Lifetime1 * 2.0)) {
                      if (var25Lifetime1 * 3.0 < 2.0) {
                        var15Lifetime1 = 6.0 * ((var21_doubleLifetime1 - var23_doubleLifetime1) * (-var25Lifetime1 + 0.6666666666666666)) + var23_doubleLifetime1;
                      } else {
                        var15Lifetime1 = var23_doubleLifetime1;
                      }
                    } else {
                      var15Lifetime1 = var21_doubleLifetime1;
                    }
                  }
                  if (var29Lifetime1 < 0.0) {
                    var29Lifetime1 = var29Lifetime1 + 1.0;
                  }
                  if (1.0 > 6.0 * var29Lifetime1) {
                    var19Lifetime1 = var29Lifetime1 * (6.0 * (var21_doubleLifetime1 - var23_doubleLifetime1)) + var23_doubleLifetime1;
                  } else {
                    if (!(2.0 * var29Lifetime1 < 1.0)) {
                      if (!(var29Lifetime1 * 3.0 < 2.0)) {
                        var19Lifetime1 = var23_doubleLifetime1;
                      } else {
                        var19Lifetime1 = var23_doubleLifetime1 + 6.0 * ((0.6666666666666666 - var29Lifetime1) * (-var23_doubleLifetime1 + var21_doubleLifetime1));
                      }
                    } else {
                      var19Lifetime1 = var21_doubleLifetime1;
                    }
                  }
                }
                var15Lifetime1 = Math.pow(var15Lifetime1, (double)var1_floatLifetime1);
                var17Lifetime1 = Math.pow(var17Lifetime1, (double)var1_floatLifetime1);
                var19Lifetime1 = Math.pow(var19Lifetime1, (double)var1_floatLifetime1);
                var21Lifetime1 = (int)(256.0 * var15Lifetime1);
                var22Lifetime1 = (int)(256.0 * var17Lifetime1);
                var23Lifetime1 = (int)(var19Lifetime1 * 256.0);
                var24Lifetime1 = (var22Lifetime1 << 8) + ((var21Lifetime1 << 16) + var23Lifetime1);
                if (0 == var24Lifetime1) {
                  var24Lifetime1 = 1;
                }
                var33[var6Lifetime1++] = var24Lifetime1;
              }
            }
          }
          if (param0) {
            mn.b(false, 65);
          }
          oo.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "mn.D(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        if (rr.field_z[param1]) {
          eg.a(85, rr.field_B[param1]);
          rr.field_z[param1] = false;
        }
        if (param0 != 6) {
          mn.b(true, -91);
        }
    }

    final static char a(byte param0, int param1) {
        int var4 = 0;
        int var2 = -54 / ((param1 - 8) / 40);
        int var3 = param0 & 255;
        if (var3 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var3, 16));
        }
        if (var3 >= 128 &&
          var3 < 160) {
          var4 = fa.field_o[var3 - 128];
          if (var4 == 0) {
            var4 = 63;
          }
          var3 = var4;
        }
        return (char)var3;
    }

    mn(int param0, int param1) {
        this.field_r = param0;
        this.field_s = param1;
    }

    static {
        field_v = new mn(0, 0);
        field_p = "<%0> has left.";
        field_u = "This password contains your email address, and would be easy to guess";
    }
}
