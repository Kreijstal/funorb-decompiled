/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    int field_a;
    static String[] field_e;
    int field_d;
    static int[] field_c;
    static int field_f;
    int[] field_g;
    static int field_b;

    final static jp a(mf param0, int param1, int param2) {
        RuntimeException var4 = null;
        jp stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (ln.a(-100, param2, param0, param1)) {
              int discarded$2 = 13874;
              stackOut_3_0 = ta.b();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ml.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0) {
        pi var2 = k.field_h;
        var2.e(-13413, param0);
        var2.a(-21, 1);
        var2.a(-111, 0);
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (null == ((ml) this).field_g) {
            break L0;
          } else {
            if (((ml) this).field_g.length == 0) {
              break L0;
            } else {
              L1: {
                if (param0 == -95) {
                  break L1;
                } else {
                  ((ml) this).field_a = -53;
                  break L1;
                }
              }
              var3 = 1;
              L2: while (true) {
                if (((ml) this).field_g.length <= var3) {
                  return ((ml) this).field_g.length - 1;
                } else {
                  if (((ml) this).field_g[-1 + var3] + ((ml) this).field_g[var3] >> 1 <= param1) {
                    var3++;
                    continue L2;
                  } else {
                    return -1 + var3;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final int b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 56) {
          L0: {
            L1: {
              if (((ml) this).field_g == null) {
                break L1;
              } else {
                if (0 != ((ml) this).field_g.length) {
                  stackOut_6_0 = ((ml) this).field_g[-1 + ((ml) this).field_g.length];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 69;
        }
    }

    final static void a(int param0, tp param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var20 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param5 + param0 << 8) / param1.field_f;
              param4 = param4 + param1.field_b;
              param3 = param3 + param1.field_g;
              var7 = var6_int * param1.field_b + (param5 << 8);
              if (param2 > 80) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              var8 = param3 * lb.field_c + param4;
              var9 = 0;
              var10 = param1.field_a;
              var11 = param1.field_d;
              var12 = lb.field_c + -var11;
              var13 = 0;
              if (param3 < lb.field_b) {
                var14 = -param3 + lb.field_b;
                var9 = var9 + var11 * var14;
                var10 = var10 - var14;
                param3 = lb.field_b;
                var8 = var8 + lb.field_c * var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 >= lb.field_i) {
                break L3;
              } else {
                var14 = -param4 + lb.field_i;
                param4 = lb.field_i;
                var9 = var9 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var7 = var7 + var14 * var6_int;
                var8 = var8 + var14;
                break L3;
              }
            }
            L4: {
              if (~(var10 + param3) < ~lb.field_j) {
                var10 = var10 - (param3 - (-var10 + lb.field_j));
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (lb.field_f < param4 + var11) {
                var14 = param4 + (var11 - lb.field_f);
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (var10 > 0) {
                  param3 = -var10;
                  L7: while (true) {
                    if (param3 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param4 = -var11;
                      L8: while (true) {
                        if (0 <= param4) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param3++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = 256 - var15;
                            if (var15 >= 0) {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param1.field_j[255 & param1.field_i[incrementValue$1]];
                                if (var17 != 0) {
                                  if (var15 > 255) {
                                    lb.field_l[var8] = var17;
                                    break L10;
                                  } else {
                                    var18 = lb.field_l[var8];
                                    var19 = (16711935 & var18) * var16 - -((var17 & 16711935) * var15) >> 8 & 16711935;
                                    lb.field_l[var8] = ik.a(65280, var16 * ik.a(var18, 65280) - -(var15 * ik.a(65280, var17)) >> 8) + var19;
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var9++;
                              var8++;
                              break L9;
                            }
                          }
                          param4++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("ml.F(").append(param0).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a() {
        field_c = null;
        field_e = null;
    }

    ml(int param0, int param1, int param2) {
        ((ml) this).field_a = param1;
        ((ml) this).field_g = new int[param2 + 1];
        ((ml) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
