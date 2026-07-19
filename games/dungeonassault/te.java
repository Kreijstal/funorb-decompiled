/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class te {
    private static double[] field_a;

    final static void a(int param0, int param1, int param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param1 < gf.field_f) {
            break L0;
          } else {
            if (param1 < gf.field_e) {
              L1: {
                if (param0 >= gf.field_j) {
                  break L1;
                } else {
                  param2 = param2 - (gf.field_j - param0);
                  param0 = gf.field_j;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= gf.field_h) {
                  break L2;
                } else {
                  param2 = gf.field_h - param0;
                  break L2;
                }
              }
              var4 = param1 * gf.field_i + param0;
              L3: while (true) {
                param2--;
                if (param2 < 0) {
                  return;
                } else {
                  L4: {
                    var5 = 16 + (int)(32.0 * te.c(param0 + 102, param1 - 43, 0.125));
                    if (var5 >= 0) {
                      break L4;
                    } else {
                      var5 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 <= 31) {
                      break L5;
                    } else {
                      var5 = 31;
                      break L5;
                    }
                  }
                  gf.field_b[var4] = param3[var5];
                  param0++;
                  var4++;
                  continue L3;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static int[] b(int param0, int param1, double param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double[][] var8 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        ve var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        double[][] var27 = null;
        double[][] var28 = null;
        double stackIn_7_0 = 0.0;
        double stackIn_10_0 = 0.0;
        double stackIn_16_0 = 0.0;
        double stackIn_19_0 = 0.0;
        double stackOut_6_0 = 0.0;
        double stackOut_5_0 = 0.0;
        double stackOut_9_0 = 0.0;
        double stackOut_8_0 = 0.0;
        double stackOut_15_0 = 0.0;
        double stackOut_14_0 = 0.0;
        double stackOut_18_0 = 0.0;
        double stackOut_17_0 = 0.0;
        var4 = new int[param0 * param1];
        var7 = 0;
        var28 = te.a(param0, param1, param2);
        var27 = var28;
        var8 = var27;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param1) {
            return var4;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= param0) {
                var6++;
                continue L0;
              } else {
                L2: {
                  if (var5 != 0) {
                    stackOut_6_0 = var8[var5 - 1][var6];
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var28[0][var6];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_7_0;
                  if (var5 != param0 - 1) {
                    stackOut_9_0 = var8[var5 + 1][var6];
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var8[param0 - 1][var6];
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var11 = stackIn_10_0;
                    var13 = var11 - var9;
                    if (var5 == 0) {
                      break L5;
                    } else {
                      if (var5 != param0 - 1) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var13 = var13 * 2.0;
                  break L4;
                }
                L6: {
                  if (var6 != 0) {
                    stackOut_15_0 = var28[var5][var6 - 1];
                    stackIn_16_0 = stackOut_15_0;
                    break L6;
                  } else {
                    stackOut_14_0 = var28[var5][0];
                    stackIn_16_0 = stackOut_14_0;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_16_0;
                  if (var6 != param1 - 1) {
                    stackOut_18_0 = var28[var5][var6 + 1];
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  } else {
                    stackOut_17_0 = var28[var5][param1 - 1];
                    stackIn_19_0 = stackOut_17_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var17 = stackIn_19_0;
                    var19 = var17 - var15;
                    if (var6 == 0) {
                      break L9;
                    } else {
                      if (var6 != param1 - 1) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var19 = var19 * 2.0;
                  break L8;
                }
                L10: {
                  var21 = 1.0;
                  var23 = new ve((int)(var13 * 65536.0), (int)(var19 * 65536.0), (int)(var21 * 65536.0));
                  var23.b(true);
                  var24 = var23.field_d >> 10;
                  var25 = var23.field_f >> 10;
                  var26 = var23.field_b >> 10;
                  if (var24 >= -256) {
                    break L10;
                  } else {
                    var24 = -256;
                    break L10;
                  }
                }
                L11: {
                  if (var24 <= 255) {
                    break L11;
                  } else {
                    var24 = 255;
                    break L11;
                  }
                }
                L12: {
                  if (var25 >= -256) {
                    break L12;
                  } else {
                    var25 = -256;
                    break L12;
                  }
                }
                L13: {
                  if (var25 <= 255) {
                    break L13;
                  } else {
                    var25 = 255;
                    break L13;
                  }
                }
                L14: {
                  if (var26 >= -256) {
                    break L14;
                  } else {
                    var26 = -256;
                    break L14;
                  }
                }
                L15: {
                  if (var26 <= 255) {
                    break L15;
                  } else {
                    var26 = 255;
                    break L15;
                  }
                }
                var24 = var24 & 255;
                var25 = var25 & 255;
                var26 = var26 & 255;
                var4[var7] = -16777216 | var24 << 16 | var25 << 8 | var26;
                var5++;
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    final static double c(int param0, int param1, double param2) {
        int var8 = 0;
        double var9 = 0.0;
        double var4 = 0.0;
        double var6 = 1.0;
        for (var8 = 0; var8 < 8; var8++) {
            var9 = te.a((double)param0 * param2, (double)param1 * param2);
            var4 = var4 + var9 * var6;
            var6 = var6 * 0.5;
            param2 = param2 * 2.0;
        }
        return var4;
    }

    private final static double a(double param0) {
        int var2 = (int)param0;
        double var3 = param0 - (double)var2;
        double var5 = te.b(var2);
        double var7 = te.b(var2 + 1);
        return var5 + (var7 - var5) * var3;
    }

    private final static double a(int param0, int param1, int param2, double param3) {
        int var9 = 0;
        double var10 = 0.0;
        double var5 = 0.0;
        double var7 = 1.0;
        for (var9 = 0; var9 < 8; var9++) {
            var10 = te.a((double)param0 * param3, (double)param1 * param3, (double)param2 * param3);
            var5 = var5 + var10 * var7;
            var7 = var7 * 0.5;
            param3 = param3 * 2.0;
        }
        return var5;
    }

    final static cn a(int param0, int param1, int param2, int[] param3, int param4, int param5, double param6) {
        int incrementValue$1 = 0;
        cn var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var8 = new cn(param0, param1);
        var9 = var8.field_B;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (var11 >= param1) {
            return var8;
          } else {
            var12 = 0;
            L1: while (true) {
              if (var12 < param0) {
                L2: {
                  var13 = param4 + (int)((double)param5 * te.a(var12, var11, param2, param6));
                  if (var13 >= 0) {
                    break L2;
                  } else {
                    var13 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (var13 < param3.length) {
                    break L3;
                  } else {
                    var13 = param3.length - 1;
                    break L3;
                  }
                }
                incrementValue$1 = var10;
                var10++;
                var9[incrementValue$1] = param3[var13];
                var12++;
                continue L1;
              } else {
                var11++;
                continue L0;
              }
            }
          }
        }
    }

    final static double a(int param0) {
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var1 = 0.0;
        double var3 = 1.0;
        for (var5 = 0; var5 < 8; var5++) {
            var6 = (double)(1 << var5);
            var8 = te.a((double)param0 * var6 * 0.015625);
            var1 = var1 + var8 * var3;
            var3 = var3 * 0.5;
        }
        return var1;
    }

    private final static double[][] a(int param0, int param1, double param2) {
        int var5 = 0;
        int var6 = 0;
        double[][] var4 = new double[param0][param1];
        if (field_a == null) {
            te.b();
        }
        for (var5 = 0; var5 < param1; var5++) {
            for (var6 = 0; var6 < param0; var6++) {
                var4[var6][var5] = te.c(var6, var5, param2);
            }
        }
        return var4;
    }

    final static void b(int param0, int param1, int param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 < gf.field_j) {
            break L0;
          } else {
            if (param0 < gf.field_h) {
              L1: {
                if (param1 >= gf.field_f) {
                  break L1;
                } else {
                  param2 = param2 - (gf.field_f - param1);
                  param1 = gf.field_f;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= gf.field_e) {
                  break L2;
                } else {
                  param2 = gf.field_e - param1;
                  break L2;
                }
              }
              var4 = param1 * gf.field_i + param0;
              L3: while (true) {
                param2--;
                if (param2 < 0) {
                  return;
                } else {
                  L4: {
                    var5 = 16 + (int)(32.0 * te.c(param0 + 102, param1 - 43, 0.125));
                    if (var5 >= 0) {
                      break L4;
                    } else {
                      var5 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 <= 31) {
                      break L5;
                    } else {
                      var5 = 31;
                      break L5;
                    }
                  }
                  gf.field_b[var4] = param3[var5];
                  param1++;
                  var4 = var4 + gf.field_i;
                  continue L3;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static cn a(int param0, int param1, int[] param2, int param3, int param4, double param5) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        cn var7 = new cn(param0, param1);
        int[] var8 = var7.field_B;
        int var9 = 0;
        if (field_a == null) {
            te.b();
        }
        for (var10 = 0; var10 < param1; var10++) {
            for (var11 = 0; var11 < param0; var11++) {
                var12 = param3 + (int)((double)param4 * te.c(var11, var10, param5));
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var12 >= param2.length) {
                    var12 = param2.length - 1;
                }
                incrementValue$0 = var9;
                var9++;
                var8[incrementValue$0] = param2[var12];
            }
        }
        return var7;
    }

    private final static double b(int param0) {
        return field_a[param0 & 1023];
    }

    final static void b() {
        int var2 = 0;
        int var0 = 1024;
        field_a = new double[var0];
        Random var1 = new Random();
        for (var2 = var0 - 1; var2 >= 0; var2--) {
            field_a[var2] = 2.0 * var1.nextDouble() - 1.0;
        }
    }

    private final static double a(double param0, double param1, double param2) {
        int var6 = (int)param0;
        int var7 = (int)param1;
        int var8 = (int)param2;
        double var9 = param0 - (double)var6;
        double var11 = param1 - (double)var7;
        double var13 = param2 - (double)var8;
        double var15 = te.a(var6, var7, var8);
        double var17 = te.a(var6 + 1, var7, var8);
        double var19 = te.a(var6, var7 + 1, var8);
        double var21 = te.a(var6 + 1, var7 + 1, var8);
        double var23 = te.a(var6, var7, var8 + 1);
        double var25 = te.a(var6 + 1, var7, var8 + 1);
        double var27 = te.a(var6, var7 + 1, var8 + 1);
        double var29 = te.a(var6 + 1, var7 + 1, var8 + 1);
        double var31 = var15 + (var17 - var15) * var9;
        double var33 = var19 + (var21 - var19) * var9;
        double var35 = var23 + (var25 - var23) * var9;
        double var37 = var27 + (var29 - var27) * var9;
        double var39 = var31 + (var33 - var31) * var11;
        double var41 = var35 + (var37 - var35) * var11;
        return var39 + (var41 - var39) * var13;
    }

    private final static double a(int param0, int param1, int param2) {
        int var3 = param0 + param1 * 47 + param2 * 19;
        return field_a[var3 & 1023];
    }

    private final static double a(double param0, double param1) {
        int var4 = (int)param0;
        double var5 = param0 - (double)var4;
        int var7 = (int)param1;
        double var8 = param1 - (double)var7;
        double var10 = te.a(var4, var7);
        double var12 = te.a(var4 + 1, var7);
        double var14 = te.a(var4, var7 + 1);
        double var16 = te.a(var4 + 1, var7 + 1);
        double var18 = var10 + (var12 - var10) * var5;
        double var20 = var14 + (var16 - var14) * var5;
        return var18 + (var20 - var18) * var8;
    }

    private final static double a(int param0, int param1) {
        int var2 = param0 + param1 * 47;
        return field_a[var2 & 1023];
    }
}
