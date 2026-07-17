/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqa extends hha {
    static String field_p;
    uia field_r;
    static boolean[] field_n;
    int field_s;
    static String field_o;
    static apa field_t;
    byte field_q;

    final byte[] b(byte param0) {
        if (param0 == -126) {
          L0: {
            if (((qqa) this).field_m) {
              break L0;
            } else {
              if (((qqa) this).field_r.field_h < -((qqa) this).field_q + ((qqa) this).field_r.field_g.length) {
                break L0;
              } else {
                return ((qqa) this).field_r.field_g;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return null;
        }
    }

    final int a(byte param0) {
        if (!(null != ((qqa) this).field_r)) {
            return 0;
        }
        if (param0 > -7) {
            return -52;
        }
        return 100 * ((qqa) this).field_r.field_h / (-((qqa) this).field_q + ((qqa) this).field_r.field_g.length);
    }

    final static boolean a(uia param0, char[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != param1[0]) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = param0.field_h;
              var5 = 1;
              L1: while (true) {
                if (param1.length <= var5) {
                  param0.field_h = var4_int;
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (param0.field_g.length == param0.field_h) {
                      break L2;
                    } else {
                      if (param0.c((byte) 106) == param1[var5]) {
                        var5++;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0.field_h = var4_int;
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("qqa.H(");
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
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + 1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static ima a(int[] param0, oc param1, int param2) {
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        ima stackIn_51_0 = null;
        Object stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        Object stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        Object stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Object stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        Object stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        Object stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        ima stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        Object stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        Object stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        Object stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        Object stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        Object stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = null;
            var5 = null;
            var6 = null;
            var7 = null;
            L1: {
              if (param1.field_g == null) {
                break L1;
              } else {
                var8 = param1.field_F;
                var45 = new int[var8];
                var46 = new int[var8];
                var47 = new int[var8];
                var48 = new int[var8];
                var49 = new int[var8];
                var50 = new int[var8];
                var15 = 0;
                L2: while (true) {
                  if (var15 >= var8) {
                    var15 = 0;
                    L3: while (true) {
                      if (param2 <= var15) {
                        var24 = new int[var8];
                        var4 = (Object) (Object) var24;
                        var25 = new int[var8];
                        var5 = (Object) (Object) var25;
                        var7 = (Object) (Object) new float[var8][];
                        var26 = new int[var8];
                        var6 = (Object) (Object) var26;
                        var15 = 0;
                        L4: while (true) {
                          if (~var15 <= ~var8) {
                            break L1;
                          } else {
                            L5: {
                              var16 = param1.field_u[var15];
                              if (var16 <= 0) {
                                break L5;
                              } else {
                                L6: {
                                  var24[var15] = (var46[var15] + var45[var15]) / 2;
                                  var25[var15] = (var48[var15] + var47[var15]) / 2;
                                  var26[var15] = (var49[var15] + var50[var15]) / 2;
                                  if (1 == var16) {
                                    var20 = param1.field_j[var15];
                                    var18 = 64.0f / (float)param1.field_f[var15];
                                    if (var20 != 0) {
                                      if (0 >= var20) {
                                        var17 = (float)(-var20) / 1024.0f;
                                        var19 = 1.0f;
                                        break L6;
                                      } else {
                                        var19 = (float)var20 / 1024.0f;
                                        var17 = 1.0f;
                                        break L6;
                                      }
                                    } else {
                                      var19 = 1.0f;
                                      var17 = 1.0f;
                                      break L6;
                                    }
                                  } else {
                                    if (var16 != 2) {
                                      var19 = (float)param1.field_x[var15] / 1024.0f;
                                      var18 = (float)param1.field_f[var15] / 1024.0f;
                                      var17 = (float)param1.field_j[var15] / 1024.0f;
                                      break L6;
                                    } else {
                                      var19 = 64.0f / (float)param1.field_x[var15];
                                      var18 = 64.0f / (float)param1.field_f[var15];
                                      var17 = 64.0f / (float)param1.field_j[var15];
                                      break L6;
                                    }
                                  }
                                }
                                ((Object[]) var7)[var15] = (Object) (Object) sea.a(var18, var19, 16486, (int) param1.field_K[var15], var17, sea.c((int) param1.field_i[var15], 255), (int) param1.field_s[var15], (int) param1.field_q[var15]);
                                break L5;
                              }
                            }
                            var15++;
                            continue L4;
                          }
                        }
                      } else {
                        L7: {
                          var16 = param0[var15];
                          if (-1 == param1.field_g[var16]) {
                            break L7;
                          } else {
                            var17_int = param1.field_g[var16] & 255;
                            var18_int = 0;
                            L8: while (true) {
                              if (3 <= var18_int) {
                                break L7;
                              } else {
                                L9: {
                                  if (var18_int != 0) {
                                    if (var18_int == 1) {
                                      var19_int = param1.field_t[var16];
                                      break L9;
                                    } else {
                                      var19_int = param1.field_J[var16];
                                      break L9;
                                    }
                                  } else {
                                    var19_int = param1.field_a[var16];
                                    break L9;
                                  }
                                }
                                L10: {
                                  var20 = param1.field_b[var19_int];
                                  var21 = param1.field_I[var19_int];
                                  var22 = param1.field_p[var19_int];
                                  if (~var20 > ~var45[var17_int]) {
                                    var45[var17_int] = var20;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (~var20 < ~var46[var17_int]) {
                                    var46[var17_int] = var20;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (var21 >= var47[var17_int]) {
                                    break L12;
                                  } else {
                                    var47[var17_int] = var21;
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (~var21 < ~var48[var17_int]) {
                                    var48[var17_int] = var21;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (~var22 > ~var49[var17_int]) {
                                    var49[var17_int] = var22;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  if (~var50[var17_int] > ~var22) {
                                    var50[var17_int] = var22;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var18_int++;
                                continue L8;
                              }
                            }
                          }
                        }
                        var15++;
                        continue L3;
                      }
                    }
                  } else {
                    var45[var15] = 2147483647;
                    var46[var15] = -2147483647;
                    var47[var15] = 2147483647;
                    var48[var15] = -2147483647;
                    var49[var15] = 2147483647;
                    var50[var15] = -2147483647;
                    var15++;
                    continue L2;
                  }
                }
              }
            }
            stackOut_50_0 = new ima((int[]) var4, (int[]) var5, (int[]) var6, (float[][]) var7);
            stackIn_51_0 = stackOut_50_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = (Object) (Object) decompiledCaughtException;
            stackOut_52_0 = var4;
            stackOut_52_1 = new StringBuilder().append("qqa.G(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L16;
            } else {
              stackOut_53_0 = stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L16;
            }
          }
          L17: {
            stackOut_55_0 = stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(44);
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_57_0 = stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L17;
            } else {
              stackOut_56_0 = stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 44 + param2 + 44 + -6 + 41);
        }
        return stackIn_51_0;
    }

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        field_p = null;
        field_o = null;
    }

    qqa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Move";
        field_o = "Passwords can only contain letters and numbers";
    }
}
