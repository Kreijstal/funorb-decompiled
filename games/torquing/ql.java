/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends am {
    static ed field_u;
    static qd field_s;
    static boolean field_t;

    public static void b(int param0) {
        field_s = null;
        field_u = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = Torquing.field_u;
          var51 = ((ql) this).field_r.a(15142, param1);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!((ql) this).field_r.field_b) {
            break L0;
          } else {
            var54 = ((ql) this).b(0, 2, param1);
            var52 = ((ql) this).c(24066, param1, 0);
            var53 = ((ql) this).c(24066, param1, 1);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var58 = var52[1];
            var59 = var52[2];
            var56 = var53[0];
            var57 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L1: while (true) {
              if (ci.field_c <= var16) {
                break L0;
              } else {
                var17 = var54[var16];
                if (var17 == 4096) {
                  var7[var16] = var55[var16];
                  var8[var16] = var58[var16];
                  var9[var16] = var59[var16];
                  var16++;
                  continue L1;
                } else {
                  if (0 == var17) {
                    var7[var16] = var56[var16];
                    var8[var16] = var57[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L1;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var17 * var55[var16] + var18 * var56[var16] >> 12;
                    var8[var16] = var18 * var57[var16] + var58[var16] * var17 >> 12;
                    var9[var16] = var17 * var59[var16] + var60[var16] * var18 >> 12;
                    var16++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param0 == -29116) {
            break L2;
          } else {
            field_u = null;
            break L2;
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param0.i((byte) -101) != 1) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((ql) this).field_p = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                field_u = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ql.H(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, uh param1, uh param2) {
        try {
            tb.field_l = param2;
            if (param0 != -1618866100) {
                field_u = null;
            }
            tb.field_l.b((lf) (Object) Torquing.field_v);
            ti.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ql.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, t param2, int param3, int param4, byte param5) {
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param4 << 8) / param2.field_w;
              var7 = (param4 << 8) + var6_int * param2.field_v;
              param3 = param3 + param2.field_r;
              param1 = param1 + param2.field_v;
              var8 = param3 * ph.field_j + param1;
              var9 = 0;
              var10 = param2.field_t;
              var11 = param2.field_s;
              var12 = -var11 + ph.field_j;
              var13 = 0;
              if (ph.field_c > param3) {
                var14 = -param3 + ph.field_c;
                var10 = var10 - var14;
                var8 = var8 + var14 * ph.field_j;
                var9 = var9 + var14 * var11;
                param3 = ph.field_c;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 - -var10 <= ph.field_h) {
                break L2;
              } else {
                var10 = var10 - (var10 + param3 - ph.field_h);
                break L2;
              }
            }
            L3: {
              if (param1 >= ph.field_k) {
                break L3;
              } else {
                var14 = ph.field_k - param1;
                var11 = var11 - var14;
                var13 = var13 + var14;
                param1 = ph.field_k;
                var9 = var9 + var14;
                var7 = var7 + var6_int * var14;
                var12 = var12 + var14;
                var8 = var8 + var14;
                break L3;
              }
            }
            if (param5 < -43) {
              L4: {
                if (param1 + var11 <= ph.field_a) {
                  break L4;
                } else {
                  var14 = var11 + param1 + -ph.field_a;
                  var12 = var12 + var14;
                  var13 = var13 + var14;
                  var11 = var11 - var14;
                  break L4;
                }
              }
              L5: {
                if (var11 <= 0) {
                  break L5;
                } else {
                  if (0 >= var10) {
                    break L5;
                  } else {
                    param3 = -var10;
                    L6: while (true) {
                      if (0 <= param3) {
                        break L0;
                      } else {
                        var14 = var7;
                        param1 = -var11;
                        L7: while (true) {
                          if (0 <= param1) {
                            var9 = var9 + var13;
                            var8 = var8 + var12;
                            param3++;
                            continue L6;
                          } else {
                            L8: {
                              var15 = var14 >> 8;
                              var14 = var14 + var6_int;
                              var16 = -var15 + 256;
                              if (0 <= var15) {
                                L9: {
                                  int incrementValue$1 = var9;
                                  var9++;
                                  var17 = param2.field_y[incrementValue$1];
                                  if (var17 != 0) {
                                    if (var15 <= 255) {
                                      var18 = ph.field_e[var8];
                                      var19 = 16711935 & var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 8;
                                      ph.field_e[var8] = var19 - -(ie.a(var16 * ie.a(var18, 65280) - -(ie.a(65280, var17) * var15), 16711913) >> 8);
                                      break L9;
                                    } else {
                                      ph.field_e[var8] = var17;
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var8++;
                                break L8;
                              } else {
                                var8++;
                                var9++;
                                break L8;
                              }
                            }
                            param1++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public ql() {
        super(3, false);
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = Torquing.field_u;
          var3 = ((ql) this).field_l.a(param1, 25657);
          if (param0 > 86) {
            break L0;
          } else {
            field_t = false;
            break L0;
          }
        }
        L1: {
          if (!((ql) this).field_l.field_b) {
            break L1;
          } else {
            var14 = ((ql) this).b(0, 0, param1);
            var15 = ((ql) this).b(0, 1, param1);
            var13 = ((ql) this).b(0, 2, param1);
            var7 = 0;
            L2: while (true) {
              if (var7 >= ci.field_c) {
                break L1;
              } else {
                var8 = var13[var7];
                if (var8 != 4096) {
                  if (var8 != 0) {
                    var3[var7] = var14[var7] * var8 + (4096 - var8) * var15[var7] >> 12;
                    var7++;
                    continue L2;
                  } else {
                    var3[var7] = var15[var7];
                    var7++;
                    continue L2;
                  }
                } else {
                  var3[var7] = var14[var7];
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new ed();
        field_s = new qd();
    }
}
