/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    private double[] field_h;
    static ji field_d;
    static String field_a;
    private double[] field_f;
    private double[] field_e;
    static int field_c;
    static String field_b;
    static nf field_g;

    final void a(int param0, double[] param1, double param2) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        int var28 = 0;
        Object var29 = null;
        var28 = Confined.field_J ? 1 : 0;
        if (1e-7 > param2) {
          return;
        } else {
          L0: {
            var5 = param2 * param1[9];
            var7 = param2 * param1[10];
            if (param0 == 26214) {
              break L0;
            } else {
              var29 = null;
              ((kn) this).a(-107, -2.534413273598302, 0.45288593443831515, 0.5839953212132996, (vg) null, 63);
              break L0;
            }
          }
          var9 = param1[11] * param2;
          var11 = 0;
          L1: while (true) {
            if ((var11 ^ -1) <= -8193) {
              return;
            } else {
              var12 = -var5 + ((kn) this).field_h[var11];
              var14 = ((kn) this).field_e[var11] - var7;
              var16 = ((kn) this).field_f[var11] - var9;
              param2 = var12 * var12 + var14 * var14 + var16 * var16;
              if (1.0 < param2) {
                var18 = 6.283185307179586 * Math.random();
                var20 = 0.999 * Math.random();
                var22 = Math.sqrt(1.0 - var20);
                var20 = Math.sqrt(var20);
                var24 = var20 * Math.sin(var18);
                var26 = Math.cos(var18) * var20;
                ((kn) this).field_h[var11] = var26 * param1[6] + param1[3] * var24 + var22 * param1[9];
                ((kn) this).field_e[var11] = param1[7] * var26 + var24 * param1[4] + var22 * param1[10];
                ((kn) this).field_f[var11] = param1[11] * var22 + (param1[5] * var24 + var26 * param1[8]);
                var11++;
                continue L1;
              } else {
                ((kn) this).field_h[var11] = var12;
                ((kn) this).field_e[var11] = var14;
                ((kn) this).field_f[var11] = var16;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, double param1, double param2, double param3, vg param4, int param5) {
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        double var38 = 0.0;
        double var40 = 0.0;
        double var42 = 0.0;
        double var44 = 0.0;
        double var46 = 0.0;
        double var48 = 0.0;
        double var50 = 0.0;
        double var52 = 0.0;
        double var54 = 0.0;
        double var56_double = 0.0;
        int var56 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        Object var63 = null;
        kh var64 = null;
        L0: {
          var62 = Confined.field_J ? 1 : 0;
          var64 = new kh((pm) null, (bi) null, 0);
          var11 = 32.0 * param4.field_R;
          if (param5 == -1212126616) {
            break L0;
          } else {
            var63 = null;
            ((kn) this).a((byte) 43, -52, (vg) null);
            break L0;
          }
        }
        L1: {
          var13 = param4.field_ab * 32.0;
          var15 = 32.0 * param4.field_M;
          var17 = param4.field_V * 32.0;
          var19 = param4.field_U * 32.0;
          var21 = 32.0 * param4.field_F;
          var23 = 32.0 * param4.field_P;
          var25 = param4.field_H * 32.0;
          var27 = 32.0 * param4.field_N;
          var29 = param2 * var13 + var11 * param1 + var15 * param3;
          var31 = param2 * var19 + var17 * param1 + param3 * var21;
          var33 = var23 * param1 + var25 * param2 + param3 * var27;
          var35 = 0.032;
          if (var33 >= 0.0) {
            var35 = var35 + var33;
            break L1;
          } else {
            var35 = var35 - var33;
            break L1;
          }
        }
        var37 = 0;
        L2: while (true) {
          if (var37 >= 8192) {
            return;
          } else {
            L3: {
              var38 = ((kn) this).field_h[var37];
              var40 = ((kn) this).field_e[var37];
              var42 = ((kn) this).field_f[var37];
              var44 = var42 * var15 + (var40 * var13 + var11 * var38);
              var46 = var19 * var40 + var17 * var38 + var42 * var21;
              var48 = var27 * var42 + (var25 * var40 + var23 * var38);
              if (var48 <= var35) {
                break L3;
              } else {
                L4: {
                  var50 = 0.32 / var48 * 640.0;
                  if (var50 < 8.0) {
                    break L4;
                  } else {
                    var64.field_D = var46 + var31;
                    var64.field_C = -var33 + var48;
                    var64.field_ab = var46 - var31;
                    var64.field_bb = var44 - var29;
                    var64.field_Y = var29 + var44;
                    var64.field_A = var48 + var33;
                    if (!var64.g(-10603)) {
                      break L3;
                    } else {
                      var64.c(param5 + 1212124912);
                      if (!var64.field_V) {
                        break L4;
                      } else {
                        L5: {
                          var52 = (double)(var64.field_t + -var64.field_G);
                          var54 = (double)(-var64.field_z + var64.field_w);
                          var56_double = var50 / Math.sqrt(var54 * var54 + var52 * var52);
                          if (var56_double <= 1.0) {
                            break L5;
                          } else {
                            var56_double = 1.0;
                            break L5;
                          }
                        }
                        var58 = 255 + -(int)(255.0 * (1.0 - var56_double) * (1.0 - var56_double) * (-var56_double + 1.0));
                        var59 = (int)(var56_double * 255.0);
                        var64.field_H = var59 | (var59 << 304509096 | var58 << 468975696);
                        var64.a(param0, -72);
                        var60 = var64.a(13107, (byte) -63);
                        var64.a(param0, 0, -14936, var60);
                        var64.field_H = var58 << -1133084400 | var58 << 269288680 | var59;
                        var61 = var60;
                        var60 = var64.a(26214, (byte) -63);
                        var64.a(param0, var61, -14936, var60);
                        var64.field_H = var58 << -1212126616 | var59 << 559730992 | var59;
                        var61 = var60;
                        var60 = var64.a(39321, (byte) -63);
                        var64.a(param0, var61, -14936, var60);
                        var64.field_H = var58 | (var58 << 2011537224 | var59 << 1096189232);
                        var61 = var60;
                        var60 = var64.a(52428, (byte) -63);
                        var64.a(param0, var61, -14936, var60);
                        var61 = var60;
                        var64.field_H = var58 | (var59 << 314496496 | var59 << -395593528);
                        var64.a(param0, var61, -14936, 65536);
                        var64.b(param0, (byte) 27);
                        break L3;
                      }
                    }
                  }
                }
                var52 = 10240.0 * (var44 / var48) + 5120.0;
                var54 = 3008.0 + var46 / var48 * 10240.0;
                if (16.0 <= var50) {
                  if (var52 <= -var50) {
                    break L3;
                  } else {
                    if (var50 + 10240.0 <= var52) {
                      break L3;
                    } else {
                      if (-var50 >= var54) {
                        break L3;
                      } else {
                        if (var54 < var50 + 6016.0) {
                          fn.a((int)var52, (int)var54, (int)(0.5 + var50), 255, tl.field_d);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  if (var52 <= -16.0) {
                    break L3;
                  } else {
                    if (10256.0 <= var52) {
                      break L3;
                    } else {
                      if (var54 <= -16.0) {
                        break L3;
                      } else {
                        if (var54 >= 6032.0) {
                          break L3;
                        } else {
                          var56 = (int)(0.5 + var50 * 0.99609375 * var50);
                          if ((var56 ^ -1) >= -1) {
                            break L3;
                          } else {
                            fn.a((int)var52, (int)var54, 16, var56, tl.field_d);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var37++;
            continue L2;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -122) {
            field_c = -89;
        }
        field_g = null;
        field_d = null;
        field_b = null;
    }

    final void a(byte param0, int param1, vg param2) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24 = 0;
        int var25 = 0;
        var25 = Confined.field_J ? 1 : 0;
        var5 = -38 / ((param0 - -76) / 41);
        var4 = 0;
        L0: while (true) {
          if (8192 <= var4) {
            return;
          } else {
            var6 = ((kn) this).field_h[var4];
            var8 = ((kn) this).field_e[var4];
            var10 = ((kn) this).field_f[var4];
            var12 = param2.field_M * var10 + (param2.field_R * var6 + param2.field_ab * var8);
            var14 = param2.field_F * var10 + (param2.field_V * var6 + param2.field_U * var8);
            var16 = param2.field_N * var10 + (param2.field_H * var8 + param2.field_P * var6);
            if (var16 > 0.001) {
              var18 = 10240.0 * (var12 / var16) + 5120.0;
              var20 = 3008.0 + var14 / var16 * 10240.0;
              var22 = 0.01 / var16 * 640.0;
              if (var22 >= 16.0) {
                if (var18 > -var22) {
                  if (var18 < var22 + 10240.0) {
                    if (var20 > -var22) {
                      if (6016.0 + var22 > var20) {
                        fn.a((int)var18, (int)var20, (int)(var22 + 0.5), 255 * param1 >> -1972149144, tl.field_d);
                        var4++;
                        continue L0;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                if (var18 > -16.0) {
                  if (10256.0 > var18) {
                    if (-16.0 < var20) {
                      if (var20 < 6032.0) {
                        var24 = (int)(var22 * 0.99609375 * var22 + 0.5);
                        if (0 < var24) {
                          fn.a((int)var18, (int)var20, 16, param1 * var24 >> 744746408, tl.field_d);
                          var4++;
                          continue L0;
                        } else {
                          var4++;
                          continue L0;
                        }
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    kn() {
        int var1 = 0;
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        ((kn) this).field_h = new double[8192];
        ((kn) this).field_e = new double[8192];
        ((kn) this).field_f = new double[8192];
        for (var1 = 0; -8193 < (var1 ^ -1); var1++) {
            var2 = -0.999 + 1.998 * Math.random();
            var4 = Math.sqrt(1.0 - var2 * var2);
            var6 = Math.random() * 6.283185307179586;
            var8 = Math.sin(var6) * var4;
            var10 = var4 * Math.cos(var6);
            var12 = Math.pow(Math.random(), 0.3333333333333333);
            ((kn) this).field_h[var1] = var8 * var12;
            ((kn) this).field_e[var1] = var12 * var10;
            ((kn) this).field_f[var1] = var2 * var12;
        }
    }

    final static void a(int param0, java.applet.Applet param1, long param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var9 = param1.getParameter("cookiehost");
                var7 = var9;
                var7 = var9;
                var8 = 61 % ((69 - param0) / 49);
                var10 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var9;
                var7 = var10;
                var7 = var10;
                if (-1L >= (param2 ^ -1L)) {
                  var7 = var10 + "; Expires=" + ha.a(ri.a(-3) - -(1000L * param2), 13) + "; Max-Age=" + param2;
                  break L0;
                } else {
                  var7 = var10 + "; Discard;";
                  break L0;
                }
              }
              kf.a(param1, true, "document.cookie=\"" + var7 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> cluster missiles";
        field_a = "<col=FFFFFF>Nuclear missiles:</col> rare devices for use in tight corners, a single nuclear missile will explode with style and obliterate practically everything in sight. Press <col=FFFFFF><%0></col> to fire one. You can carry four.";
    }
}
