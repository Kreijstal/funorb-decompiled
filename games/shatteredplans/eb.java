/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    static String[] field_f;
    static String field_e;
    static int field_b;
    static int[] field_a;
    volatile boolean field_c;

    public static void b() {
        field_a = null;
        field_f = null;
        field_e = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= gd.field_b.length) {
                break L0;
              } else {
                param1 = gd.field_b[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$4 = param1;
                  param1--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$5 = var6;
                    var6++;
                    param0 = jl.field_M[incrementValue$5];
                    param4[param2[param0]] = param4[param2[param0]] + 1;
                    jl.field_M[param4[param2[param0]]] = param0;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("eb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(12).append(',');
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
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(qb param0, int param1) {
        try {
            if (param1 != -17115) {
                field_b = 54;
            }
            ql.a(((eb) this).field_d, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "eb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((eb) this).field_c = true;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "eb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27_int = 0;
        double var27 = 0.0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        var34 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = 0.15000000596046448f + (float)di.field_m / 1000.0f;
              var1_int = -(int)(200.0 * Math.sin((double)var3));
              var2 = -200 + (int)(200.0 * Math.cos((double)var3));
              ks.field_j.f(var1_int, var2);
              gf.h(0, 0, gf.field_b, gf.field_k);
              var4 = 125;
              var5 = 400;
              var6 = var5 - -150;
              var7 = 100 + var6;
              var8 = var6 - -150;
              var9 = var5 + 50;
              var10 = -80;
              var11 = 140;
              var2 = var10;
              var1_int = -260;
              if (~var5 < ~di.field_m) {
                if (~di.field_m > ~var4) {
                  stackOut_5_0 = var10;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = re.a(var10, -var4 + var5, -var4 + di.field_m, var11, 0);
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = var11;
                stackIn_6_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_6_0;
              tf.field_b.c(var1_int, var2 + (var12 - 120), 128);
              qq.field_n.f(var1_int, var12 - -var2);
              if (~var5 >= ~di.field_m) {
                stackOut_10_0 = 205 + var10 << 4;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                if (~di.field_m > ~var4) {
                  stackOut_9_0 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = re.a(0, -var4 + var5, di.field_m + -var4, 205 - -var10 << 4, 0);
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
            }
            L3: {
              var13 = stackIn_11_0;
              var14 = 454 + var1_int << 4;
              var15 = -var13 + (var10 + 374 - -var2 << 4);
              var16 = 32 - -vc.a((byte) -39, 32);
              if (~var6 < ~di.field_m) {
                gf.b(var14, var15, var16, 128, fe.field_u);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var17 = 454 + (var1_int + 3);
              var18 = var17 << 4;
              var19 = (var13 >> 4) + -36;
              var20 = var19 << 4;
              var21 = 144;
              if (var7 > di.field_m) {
                break L4;
              } else {
                var22 = -var7 + di.field_m;
                var23 = -var7 + 1000;
                var24 = var22 << 2;
                var24 = var24 + var22 * 16 * var22 / var23;
                var20 = var20 - (var24 >> 4);
                var21 = var21 * (-var22 + var23) / var23;
                var17 = var17 + (var24 >> 4);
                var19 = var19 - (var24 >> 8);
                var18 = var18 + var24;
                break L4;
              }
            }
            L5: {
              var22 = 454 + var1_int - -3 << 4;
              var23 = 169 + var10 << 4;
              var24 = -var7 + 950 << 2;
              var24 = var24 + (-var7 + 950) * (-(var7 * 16) + 15200) / (1000 + -var7);
              var22 = var22 + var24;
              var23 = var23 - (var24 >> 4);
              gf.d(0, 0, var22 - -320 >> 4, 480);
              gf.d(var17, var19, 20, 4, 0);
              if (~di.field_m <= ~var9) {
                L6: {
                  var25 = -var9 + di.field_m;
                  var26 = var6 - var9;
                  var27_int = 440 * var25 / var26;
                  var28 = var27_int - -rg.a(64, -64, (byte) 109);
                  if (var28 >= 0) {
                    break L6;
                  } else {
                    var28 = 0;
                    break L6;
                  }
                }
                L7: {
                  if (255 >= var28) {
                    break L7;
                  } else {
                    var28 = 255;
                    break L7;
                  }
                }
                L8: {
                  gf.a(16 + var17, var19 + 2, (var28 >> 2) * 65793);
                  var28 = -40 + (var27_int + rg.a(64, -64, (byte) 114));
                  if (var28 < 0) {
                    var28 = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var28 <= 255) {
                    break L9;
                  } else {
                    var28 = 255;
                    break L9;
                  }
                }
                L10: {
                  gf.a(3 + var17, var19 - -3, 65793 * (var28 >> 2));
                  var28 = rg.a(64, -64, (byte) 98) + (var27_int - 80);
                  if (var28 < 0) {
                    var28 = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var28 <= 255) {
                    break L11;
                  } else {
                    var28 = 255;
                    break L11;
                  }
                }
                L12: {
                  gf.a(var17 - -12, var19, 65793 * (var28 >> 2));
                  var28 = -120 + var27_int + rg.a(64, -64, (byte) 126);
                  if (var28 < 0) {
                    var28 = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var28 <= 255) {
                    break L13;
                  } else {
                    var28 = 255;
                    break L13;
                  }
                }
                gf.a(var17 - -7, 1 + var19, (var28 >> 2) * 65793);
                break L5;
              } else {
                break L5;
              }
            }
            L14: {
              gf.a();
              if (var9 <= di.field_m) {
                L15: {
                  var25 = -var9 + di.field_m;
                  var26 = -var9 + var8;
                  var27 = 0.0003141592653589793 * (double)var25 * (double)var25;
                  if (var25 > var26) {
                    stackOut_42_0 = 128;
                    stackIn_43_0 = stackOut_42_0;
                    break L15;
                  } else {
                    stackOut_41_0 = var25 * 128 / var26;
                    stackIn_43_0 = stackOut_41_0;
                    break L15;
                  }
                }
                var29 = stackIn_43_0;
                var30 = 0;
                L16: while (true) {
                  if (var30 >= 3) {
                    L17: {
                      if (600 > var25) {
                        stackOut_52_0 = var25;
                        stackIn_53_0 = stackOut_52_0;
                        break L17;
                      } else {
                        stackOut_51_0 = 600;
                        stackIn_53_0 = stackOut_51_0;
                        break L17;
                      }
                    }
                    var30 = stackIn_53_0;
                    var31 = -1 + sd.field_p;
                    var32 = 0;
                    L18: while (true) {
                      if (var30 <= var32) {
                        break L14;
                      } else {
                        L19: {
                          if (var31 >= 0) {
                            break L19;
                          } else {
                            var31 += 600;
                            break L19;
                          }
                        }
                        var33 = 256 * (var30 - var32) / 600;
                        gf.b(p.field_A[var31], np.field_f[var31], var33, 12, fe.field_x);
                        gf.b(p.field_A[var31], np.field_f[var31], var33 >> 2, 128, fe.field_x);
                        var31--;
                        var32++;
                        continue L18;
                      }
                    }
                  } else {
                    L20: {
                      var31 = (int)(Math.cos(3.141592653589793 * (double)(2 * var30) / 3.0 + var27) * (double)(var21 >> 1));
                      var31 = var31 + var18;
                      var32 = (int)((double)var21 * Math.sin(var27 + 3.141592653589793 * (double)(var30 * 2) / 3.0));
                      var32 = var32 + var20;
                      if (~(var22 + 320) > ~var31) {
                        break L20;
                      } else {
                        gf.g(var17, var19, var31 >> 4, var32 >> 4, 0);
                        gf.b(var31, var32, 64, var29, fe.field_x);
                        p.field_A[sd.field_p] = var31;
                        np.field_f[sd.field_p] = var32;
                        int fieldTemp$1 = sd.field_p + 1;
                        sd.field_p = sd.field_p + 1;
                        if (fieldTemp$1 == 600) {
                          sd.field_p = 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var30++;
                    continue L16;
                  }
                }
              } else {
                break L14;
              }
            }
            L21: {
              if (900 < di.field_m) {
                L22: {
                  if (di.field_m > 950) {
                    var16 = re.a(0, 50, -900 + di.field_m, 256, 0);
                    break L22;
                  } else {
                    var16 = re.a(256, 50, -950 + di.field_m, 0, 0);
                    break L22;
                  }
                }
                gf.a(var22, var23, var16, 12, fe.field_v);
                gf.a(var22 + 128, var23 - 16, var16 >> 1, 12, fe.field_v);
                gf.a(var22 - -256, var23 - 32, var16 >> 2, 12, fe.field_v);
                break L21;
              } else {
                break L21;
              }
            }
            L23: {
              var25 = -var22 + var18;
              if (var25 <= 0) {
                break L23;
              } else {
                L24: {
                  var16 = var25;
                  if (var16 <= 320) {
                    break L24;
                  } else {
                    var20 = var20 - (var16 + -320 >> 2);
                    var18 = var18 + (var16 - 320 << 1);
                    var16 = -(var16 >> 2) + 320;
                    break L24;
                  }
                }
                gf.b(var18, var20, var16, 256, fe.field_u);
                break L23;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "eb.A(" + 320 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    eb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = "Offer NAP";
        field_a = new int[]{18, 19, 9};
    }
}
