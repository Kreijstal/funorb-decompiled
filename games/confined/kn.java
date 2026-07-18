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
        RuntimeException var5 = null;
        double var5_double = 0.0;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var28 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (1e-7 > param2) {
              return;
            } else {
              L1: {
                var5_double = param2 * param1[9];
                var7 = param2 * param1[10];
                if (param0 == 26214) {
                  break L1;
                } else {
                  var29 = null;
                  ((kn) this).a(-107, -2.534413273598302, 0.45288593443831515, 0.5839953212132996, (vg) null, 63);
                  break L1;
                }
              }
              var9 = param1[11] * param2;
              var11 = 0;
              L2: while (true) {
                if (var11 >= 8192) {
                  break L0;
                } else {
                  L3: {
                    var12 = -var5_double + ((kn) this).field_h[var11];
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
                      break L3;
                    } else {
                      ((kn) this).field_h[var11] = var12;
                      ((kn) this).field_e[var11] = var14;
                      ((kn) this).field_f[var11] = var16;
                      break L3;
                    }
                  }
                  var11++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, double param1, double param2, double param3, vg param4, int param5) {
        RuntimeException var10 = null;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var62 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var64 = new kh((pm) null, (bi) null, 0);
              var11 = 32.0 * param4.field_R;
              if (param5 == -1212126616) {
                break L1;
              } else {
                var63 = null;
                ((kn) this).a((byte) 43, -52, (vg) null);
                break L1;
              }
            }
            L2: {
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
                break L2;
              } else {
                var35 = var35 - var33;
                break L2;
              }
            }
            var37 = 0;
            L3: while (true) {
              if (var37 >= 8192) {
                break L0;
              } else {
                L4: {
                  var38 = ((kn) this).field_h[var37];
                  var40 = ((kn) this).field_e[var37];
                  var42 = ((kn) this).field_f[var37];
                  var44 = var42 * var15 + (var40 * var13 + var11 * var38);
                  var46 = var19 * var40 + var17 * var38 + var42 * var21;
                  var48 = var27 * var42 + (var25 * var40 + var23 * var38);
                  if (var48 <= var35) {
                    break L4;
                  } else {
                    L5: {
                      var50 = 0.32 / var48 * 640.0;
                      if (var50 < 8.0) {
                        break L5;
                      } else {
                        var64.field_D = var46 + var31;
                        var64.field_C = -var33 + var48;
                        var64.field_ab = var46 - var31;
                        var64.field_bb = var44 - var29;
                        var64.field_Y = var29 + var44;
                        var64.field_A = var48 + var33;
                        if (!var64.g(-10603)) {
                          break L4;
                        } else {
                          var64.c(param5 + 1212124912);
                          if (!var64.field_V) {
                            break L5;
                          } else {
                            L6: {
                              var52 = (double)(var64.field_t + -var64.field_G);
                              var54 = (double)(-var64.field_z + var64.field_w);
                              var56_double = var50 / Math.sqrt(var54 * var54 + var52 * var52);
                              if (var56_double <= 1.0) {
                                break L6;
                              } else {
                                var56_double = 1.0;
                                break L6;
                              }
                            }
                            var58 = 255 + -(int)(255.0 * (1.0 - var56_double) * (1.0 - var56_double) * (-var56_double + 1.0));
                            var59 = (int)(var56_double * 255.0);
                            var64.field_H = var59 | (var59 << 8 | var58 << 16);
                            var64.a(param0, -72);
                            var60 = var64.a(13107, (byte) -63);
                            var64.a(param0, 0, -14936, var60);
                            var64.field_H = var58 << 16 | var58 << 8 | var59;
                            var61 = var60;
                            var60 = var64.a(26214, (byte) -63);
                            var64.a(param0, var61, -14936, var60);
                            var64.field_H = var58 << 8 | var59 << 16 | var59;
                            var61 = var60;
                            var60 = var64.a(39321, (byte) -63);
                            var64.a(param0, var61, -14936, var60);
                            var64.field_H = var58 | (var58 << 8 | var59 << 16);
                            var61 = var60;
                            var60 = var64.a(52428, (byte) -63);
                            var64.a(param0, var61, -14936, var60);
                            var61 = var60;
                            var64.field_H = var58 | (var59 << 16 | var59 << 8);
                            var64.a(param0, var61, -14936, 65536);
                            var64.b(param0, (byte) 27);
                            break L4;
                          }
                        }
                      }
                    }
                    var52 = 10240.0 * (var44 / var48) + 5120.0;
                    var54 = 3008.0 + var46 / var48 * 10240.0;
                    if (16.0 <= var50) {
                      if (var52 <= -var50) {
                        break L4;
                      } else {
                        if (var50 + 10240.0 <= var52) {
                          break L4;
                        } else {
                          if (-var50 >= var54) {
                            break L4;
                          } else {
                            if (var54 < var50 + 6016.0) {
                              fn.a((int)var52, (int)var54, (int)(0.5 + var50), 255, tl.field_d);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      if (var52 <= -16.0) {
                        break L4;
                      } else {
                        if (10256.0 <= var52) {
                          break L4;
                        } else {
                          if (var54 <= -16.0) {
                            break L4;
                          } else {
                            if (var54 >= 6032.0) {
                              break L4;
                            } else {
                              var56 = (int)(0.5 + var50 * 0.99609375 * var50);
                              if (var56 <= 0) {
                                break L4;
                              } else {
                                fn.a((int)var52, (int)var54, 16, var56, tl.field_d);
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var37++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var10;
            stackOut_30_1 = new StringBuilder().append("kn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        field_b = null;
    }

    final void a(byte param0, int param1, vg param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var25 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5 = -38 / ((param0 - -76) / 41);
            var4_int = 0;
            L1: while (true) {
              if (8192 <= var4_int) {
                break L0;
              } else {
                L2: {
                  var6 = ((kn) this).field_h[var4_int];
                  var8 = ((kn) this).field_e[var4_int];
                  var10 = ((kn) this).field_f[var4_int];
                  var12 = param2.field_M * var10 + (param2.field_R * var6 + param2.field_ab * var8);
                  var14 = param2.field_F * var10 + (param2.field_V * var6 + param2.field_U * var8);
                  var16 = param2.field_N * var10 + (param2.field_H * var8 + param2.field_P * var6);
                  if (var16 > 0.001) {
                    var18 = 10240.0 * (var12 / var16) + 5120.0;
                    var20 = 3008.0 + var14 / var16 * 10240.0;
                    var22 = 0.01 / var16 * 640.0;
                    if (var22 >= 16.0) {
                      if (var18 <= -var22) {
                        break L2;
                      } else {
                        if (var18 >= var22 + 10240.0) {
                          break L2;
                        } else {
                          if (var20 <= -var22) {
                            break L2;
                          } else {
                            if (6016.0 + var22 > var20) {
                              fn.a((int)var18, (int)var20, (int)(var22 + 0.5), 255 * param1 >> 8, tl.field_d);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      if (var18 <= -16.0) {
                        break L2;
                      } else {
                        if (10256.0 <= var18) {
                          break L2;
                        } else {
                          if (-16.0 >= var20) {
                            break L2;
                          } else {
                            if (var20 < 6032.0) {
                              var24 = (int)(var22 * 0.99609375 * var22 + 0.5);
                              if (0 < var24) {
                                fn.a((int)var18, (int)var20, 16, param1 * var24 >> 8, tl.field_d);
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("kn.C(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
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
        for (var1 = 0; var1 < 8192; var1++) {
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
            RuntimeException var6_ref = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param1.getParameter("cookiehost");
                      var7 = var9;
                      var7 = var9;
                      var8 = 61 % ((69 - param0) / 49);
                      var10 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var9;
                      var7 = var10;
                      var7 = var10;
                      if (param2 >= 0L) {
                        var7 = var10 + "; Expires=" + ha.a(ri.a(-3) - -(1000L * param2), 13) + "; Max-Age=" + param2;
                        break L2;
                      } else {
                        var7 = var10 + "; Discard;";
                        break L2;
                      }
                    }
                    kf.a(param1, true, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("kn.D(").append(param0).append(',');
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param3 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param4 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
            }
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
