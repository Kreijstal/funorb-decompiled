/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends hf {
    private double field_bb;
    private oi field_ab;
    static String[] field_db;
    static pm field_gb;
    private gk field_eb;
    static mn field_fb;
    static int field_cb;

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14 = (((il) this).field_D - param5) * param6 + (param4 * (-param1 + ((il) this).field_t) + param2 * (((il) this).field_E - param3));
        if (param0 != 256) {
            il.a(29, -104, -89, 123, -104, -28, 35, -128, 22, -111, 96, 19, -44, 32);
        }
        if (0.01 < var14) {
            ((il) this).field_bb = ((il) this).field_bb * (var14 / ((il) this).field_C);
            ((il) this).field_C = var14;
        } else {
            ((il) this).field_C = 0.01;
            ((il) this).d(10797);
        }
    }

    final void a(byte param0, sa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(false, (il) this);
              if (param0 == 9) {
                break L1;
              } else {
                field_db = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("il.M(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = jd.field_d[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L3;
                  } else {
                    var23 = 0;
                    break L3;
                  }
                }
                L4: {
                  var24 = fn.field_h[var23 * 640 + var22];
                  var25 = 64 + (jd.field_h[var20] * param10 >> 17);
                  if (var25 >= 0) {
                    break L4;
                  } else {
                    var25 = -var25;
                    break L4;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                int incrementValue$1 = var15;
                var15++;
                fn.field_h[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var16 = var16 + var17;
                var17 = var17 + param3;
                var18++;
                continue L0;
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L5: while (true) {
            L6: {
              if (var18 < param7) {
                break L6;
              } else {
                var17 = var17 - param3;
                var16 = var16 - var17;
                if (var16 < param5) {
                  L7: {
                    var19 = (var18 << 4) - param12;
                    var20 = (var16 << param4) / param6;
                    var21 = jd.field_d[var20] * param10 >> 15;
                    var22 = var18 + (var19 * var21 + 131072 >> 18);
                    if (var22 >= 0) {
                      break L7;
                    } else {
                      var22 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var23 = param0 + (var14 * var21 + 131072 >> 18);
                    if (var23 >= 0) {
                      break L8;
                    } else {
                      var23 = 0;
                      break L8;
                    }
                  }
                  L9: {
                    var24 = fn.field_h[var23 * 640 + var22];
                    var25 = 64 + (jd.field_h[var20] * param10 >> 17);
                    if (var25 >= 0) {
                      break L9;
                    } else {
                      var25 = -var25;
                      break L9;
                    }
                  }
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15--;
                  fn.field_h[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var18--;
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        }
    }

    final void a(mn param0, byte param1) {
        try {
            ((il) this).field_ab.field_u = ((il) this).field_C * 100.0 * ((il) this).field_bb;
            ((il) this).field_ab.field_t = ((il) this).field_E;
            ((il) this).field_ab.field_p = ((il) this).field_D;
            int var3_int = 117 / ((-2 - param1) / 62);
            ((il) this).field_ab.field_o = ((il) this).field_t;
            param0.a((rk) (Object) ((il) this).field_ab, (byte) -106);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "il.OA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, il param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((il) this).a(-108, 0.3281889650477789, 0.2576175342789941, 0.29471273530872977, 0.5332136660810687, 0.07232902906045566, -0.616246603217351);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("il.L(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(boolean param0, ee param1) {
        try {
            if (!param0) {
                Object var4 = null;
                ((il) this).a((pm) null, -10);
            }
            ((il) this).c(param1, -7442);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "il.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, hf param1) {
        try {
            if (param0 >= -29) {
                ((il) this).a(-122, 0.7876643321579858, 1.110649259842214, 0.21791218678161003, -1.1153528215260917, -0.769190096817728, 0.8224237119110618);
            }
            ((il) this).c((ee) (Object) param1, -7442);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "il.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 11878) {
            field_gb = null;
        }
        super.a(param0, param1);
        ((il) this).field_C = ((il) this).field_C + 0.04;
        ((il) this).field_bb = ((il) this).field_bb - 0.01;
        if (((il) this).field_bb > 0.0) {
            ((il) this).field_eb.field_w = 8.0 * ((il) this).field_bb;
        } else {
            ((il) this).field_bb = 0.0;
            ((il) this).d(10797);
        }
    }

    public static void n(int param0) {
        field_db = null;
        field_gb = null;
        field_fb = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
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
        int var27 = 0;
        int var28 = 0;
        L0: {
          var4 = param2 * param2;
          var5 = param0 - param2 >> 4;
          var6 = param0 + 15 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + 15 >> 4;
          var10 = param1 + param2 + 15 >> 4;
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        L1: {
          if (var7 <= 640) {
            break L1;
          } else {
            var7 = 640;
            break L1;
          }
        }
        L2: {
          if (var8 >= 0) {
            break L2;
          } else {
            var8 = 0;
            break L2;
          }
        }
        L3: {
          if (var10 <= 376) {
            break L3;
          } else {
            var10 = 376;
            break L3;
          }
        }
        L4: {
          if (var6 >= 0) {
            break L4;
          } else {
            var6 = 0;
            break L4;
          }
        }
        L5: {
          if (var6 <= 640) {
            break L5;
          } else {
            var6 = 640;
            break L5;
          }
        }
        L6: {
          if (var9 >= 0) {
            break L6;
          } else {
            var9 = 0;
            break L6;
          }
        }
        L7: {
          if (var9 <= 376) {
            break L7;
          } else {
            var9 = 376;
            break L7;
          }
        }
        var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        var14 = var12 - var11;
        var15 = var13 - var12;
        var16 = var15 - var14;
        var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        var20 = var18 - var17;
        var21 = var19 - var18;
        var22 = var21 - var20;
        var23 = 16;
        var24 = var4;
        L8: while (true) {
          if (var4 <= 2147483647 >>> var23) {
            var25 = var9 * 640 + var6;
            var26 = var11 + var17;
            var27 = var20;
            var28 = var9;
            L9: while (true) {
              if (var28 >= var10) {
                var25 = var9 * 640 + var6;
                var26 = var11 + var17;
                var27 = var20;
                var28 = var9 - 1;
                L10: while (true) {
                  if (var28 < var8) {
                    return;
                  } else {
                    var27 = var27 - var22;
                    var26 = var26 - var27;
                    var25 -= 640;
                    il.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                    var28--;
                    continue L10;
                  }
                }
              } else {
                il.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                var26 = var26 + var27;
                var27 = var27 + var22;
                var25 += 640;
                var28++;
                continue L9;
              }
            }
          } else {
            var23--;
            var24 = var24 + 1 >>> 1;
            continue L8;
          }
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int var7_int = 0;
        RuntimeException var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int[] stackIn_16_4 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int[] stackOut_15_4 = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int[] stackOut_14_4 = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              var7_int = (int)(((il) this).field_bb * 32768.0);
              if (((il) this).field_Q <= 0) {
                break L1;
              } else {
                if (1 < ((il) this).field_Q) {
                  return;
                } else {
                  var7_int = var7_int >> 1;
                  break L1;
                }
              }
            }
            L2: {
              var8 = ((il) this).field_E - param3.field_T;
              if (param2 < -5) {
                break L2;
              } else {
                ((il) this).field_ab = null;
                break L2;
              }
            }
            L3: {
              var10 = -param3.field_L + ((il) this).field_t;
              var12 = ((il) this).field_D - param3.field_O;
              var14 = var10 * param3.field_ab + param3.field_R * var8 + param3.field_M * var12;
              var16 = var10 * param3.field_U + var8 * param3.field_V + param3.field_F * var12;
              var18 = var12 * param3.field_N + (param3.field_H * var10 + var8 * param3.field_P);
              if (var18 < 0.15) {
                break L3;
              } else {
                L4: {
                  var20 = (int)(10240.0 * (var14 / var18)) + 5120;
                  var21 = (int)(var16 / var18 * 10240.0) + 3008;
                  var22 = (int)(10240.0 * (((il) this).field_C / var18));
                  var7_int = (int)qn.field_v.a((double)var7_int * (1.0 - var12 / param1), 0, ((il) this).field_D);
                  var23 = var7_int >> 9;
                  if (var23 <= 255) {
                    break L4;
                  } else {
                    var23 = 255;
                    break L4;
                  }
                }
                L5: {
                  stackOut_10_0 = var20;
                  stackOut_10_1 = var21;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (var22 <= 2900) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = var22;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L5;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 2900;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L5;
                  }
                }
                L6: {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = var23;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (((il) this).f(-62)) {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = stackIn_15_3;
                    stackOut_15_4 = mm.field_gb;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    break L6;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = stackIn_14_3;
                    stackOut_14_4 = mm.field_cb;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    break L6;
                  }
                }
                L7: {
                  fn.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4);
                  stackOut_16_0 = var20;
                  stackOut_16_1 = var21;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (var22 <= 32768) {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = var22;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L7;
                  } else {
                    stackOut_17_0 = stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 32768;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L7;
                  }
                }
                il.a(stackIn_19_0, stackIn_19_1, stackIn_19_2, var7_int);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("il.QA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = jd.field_d[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= 375) {
                    break L3;
                  } else {
                    var23 = 375;
                    break L3;
                  }
                }
                var24 = fn.field_h[var23 * 640 + var22];
                var25 = 64 + (jd.field_h[var20] * param10 >> 17);
                if (var25 >= 0) {
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  int incrementValue$1 = var15;
                  var15++;
                  fn.field_h[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var16 = var16 + var17;
                  var17 = var17 + param3;
                  var18++;
                  continue L0;
                } else {
                  throw new Error();
                }
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L4: while (true) {
            L5: {
              if (var18 < param7) {
                break L5;
              } else {
                var17 = var17 - param3;
                var16 = var16 - var17;
                if (var16 < param5) {
                  L6: {
                    var19 = (var18 << 4) - param12;
                    var20 = (var16 << param4) / param6;
                    var21 = jd.field_d[var20] * param10 >> 15;
                    var22 = var18 + (var19 * var21 + 131072 >> 18);
                    if (var22 >= 0) {
                      break L6;
                    } else {
                      var22 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var23 = param0 + (var14 * var21 + 131072 >> 18);
                    if (var23 <= 375) {
                      break L7;
                    } else {
                      var23 = 375;
                      break L7;
                    }
                  }
                  L8: {
                    var24 = fn.field_h[var23 * 640 + var22];
                    var25 = 64 + (jd.field_h[var20] * param10 >> 17);
                    if (var25 >= 0) {
                      break L8;
                    } else {
                      var25 = -var25;
                      break L8;
                    }
                  }
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15--;
                  fn.field_h[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var18--;
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, vg param1) {
        try {
            if (param0 != -1) {
                Object var4 = null;
                ((il) this).c((ee) null, 17);
            }
            param1.a(false, (il) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "il.DA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = -72 % ((-35 - param1) / 60);
            param0.a(false, (il) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "il.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, ah param1) {
        try {
            int var3_int = 47 % ((param0 - 14) / 53);
            param1.a(false, (il) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "il.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(false, (il) this);
              if (param0 == -23154) {
                break L1;
              } else {
                ((il) this).field_bb = 0.6680277362695175;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("il.F(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    il(hn param0, dj param1, double[] param2, double param3, boolean param4) {
        super(param0, param1.field_E + param1.field_C * param2[9], param1.field_t + param2[10] * param1.field_C, param1.field_D + param2[11] * param1.field_C, 0.2, 0.0, (ee) (Object) param1, 0.0, 0.01);
        RuntimeException var7 = null;
        double var7_double = 0.0;
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
        RuntimeException decompiledCaughtException = null;
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
        ((il) this).field_ab = new oi((pm) this);
        try {
          L0: {
            L1: {
              ((il) this).field_G = param1.field_G + 0.3 * param2[10];
              ((il) this).field_L = param1.field_L + param2[11] * 0.3;
              ((il) this).field_K = param1.field_K + 0.3 * param2[9];
              if (!param4) {
                break L1;
              } else {
                L2: {
                  var7_double = Math.sqrt(((il) this).field_G * ((il) this).field_G + ((il) this).field_K * ((il) this).field_K + ((il) this).field_L * ((il) this).field_L);
                  if (var7_double >= 0.001) {
                    break L2;
                  } else {
                    var7_double = 0.001;
                    break L2;
                  }
                }
                ((il) this).field_W = param1.a(((il) this).field_K / var7_double, ((il) this).field_G / var7_double, ((il) this).field_L / var7_double, false);
                break L1;
              }
            }
            ((il) this).field_bb = 1.0 * param3;
            gd.a((int)(param3 * 96.0), 109, fg.field_mb, (pm) (Object) param1);
            ((il) this).field_eb = new gk((pm) this, hm.field_pb);
            ((il) this).field_eb.field_w = 8.0 * ((il) this).field_bb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7;
            stackOut_7_1 = new StringBuilder().append("il.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void c(ee param0, int param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        Object var21 = null;
        double stackIn_13_0 = 0.0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_12_0 = 0.0;
        double stackOut_11_0 = 0.0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != ((il) this).field_R) {
                break L1;
              } else {
                if (((il) this).field_Q > 0) {
                  ((il) this).field_Q = ((il) this).field_Q + 1;
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var3_double = param0.field_E - ((il) this).field_E;
              var5 = param0.field_t - ((il) this).field_t;
              var7 = -((il) this).field_D + param0.field_D;
              if (param1 == -7442) {
                break L2;
              } else {
                var21 = null;
                ((il) this).a(9, (hf) null);
                break L2;
              }
            }
            L3: {
              var9 = Math.sqrt(var7 * var7 + (var3_double * var3_double + var5 * var5));
              var11 = param0.field_C + ((il) this).field_C - var9;
              var13 = 32.0 * ((il) this).field_bb;
              if (param0.field_C < 0.001) {
                break L3;
              } else {
                if (param0.field_C <= var11) {
                  break L3;
                } else {
                  var13 = var13 * (var11 / param0.field_C);
                  break L3;
                }
              }
            }
            L4: {
              if (0.001 > var9) {
                stackOut_12_0 = 1000.0;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 1.0 / var9;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            var15 = stackIn_13_0;
            var7 = var7 * var15;
            var3_double = var3_double * var15;
            var5 = var5 * var15;
            var17 = ((il) this).field_bb / Math.sqrt(param0.field_M);
            var11 = var11 * (0.03 * var17);
            param0.field_G = param0.field_G - var5 * var11;
            param0.field_L = param0.field_L - var11 * var7;
            param0.field_K = param0.field_K - var3_double * var11;
            var19 = Math.pow(0.9, var17);
            param0.field_G = var19 * (param0.field_G - ((il) this).field_G) + ((il) this).field_G;
            param0.field_K = ((il) this).field_K + (param0.field_K - ((il) this).field_K) * var19;
            param0.field_L = ((il) this).field_L + var19 * (param0.field_L - ((il) this).field_L);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("il.J(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
    }

    final void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(false, (il) this);
              if (param1 <= -81) {
                break L1;
              } else {
                field_fb = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("il.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
