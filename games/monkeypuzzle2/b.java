/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class b extends bf {
    static int[][] field_j;
    static java.awt.Frame field_i;
    int field_n;
    static int field_m;
    static volatile int field_k;
    static lg field_l;

    public static void e() {
        try {
            field_i = null;
            field_j = null;
            field_l = null;
            int var1_int = 0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "b.B(" + 116 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, sj param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var29 = 0;
        int var30 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var30 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param2[3] >> 2;
            var22 = param2[4] >> 2;
            var23 = param2[5] >> 2;
            var24 = param2[6] >> 2;
            var25 = param2[7] >> 2;
            var26 = param2[8] >> 2;
            var27 = param2[9] >> 2;
            var28 = param2[10] >> 2;
            var29 = param2[11] >> 2;
            var12 = var23 * param0[5] + param0[3] * var21 - -(var22 * param0[4]) >> 14;
            var13 = var25 * param0[4] + param0[3] * var24 - -(var26 * param0[5]) >> 14;
            var20 = param0[11] * var29 + (param0[9] * var27 + var28 * param0[10]) >> 14;
            var14 = param0[3] * var27 + param0[4] * var28 - -(var29 * param0[5]) >> 14;
            var16 = param0[7] * var25 + var24 * param0[6] - -(var26 * param0[8]) >> 14;
            var17 = var28 * param0[7] + (param0[6] * var27 - -(var29 * param0[8])) >> 14;
            var19 = var25 * param0[10] + var24 * param0[9] + var26 * param0[11] >> 14;
            var15 = param0[8] * var23 + (var22 * param0[7] + var21 * param0[6]) >> 14;
            var18 = var22 * param0[10] + (param0[9] * var21 + var23 * param0[11]) >> 14;
            var21 = -param2[0] + param0[0];
            var22 = -param2[1] + param0[1];
            var23 = param0[2] - param2[2];
            var9 = param2[3] * var21 - -(var22 * param2[4]) - -(var23 * param2[5]) >> 16 + -uc.field_b;
            var10 = param2[8] * var23 + (var22 * param2[7] + param2[6] * var21) >> 16 + -uc.field_b;
            var11 = var21 * param2[9] - (-(param2[10] * var22) - var23 * param2[11]) >> 16;
            var21 = ig.field_h;
            var22 = ig.field_f;
            var23 = 0;
            L1: while (true) {
              if (param4.field_e <= var23) {
                L2: {
                  if (null == param4.field_B) {
                    break L2;
                  } else {
                    if (null == param4.field_E) {
                      break L2;
                    } else {
                      if (param4.field_s == null) {
                        break L2;
                      } else {
                        if (param4.field_F == null) {
                          break L2;
                        } else {
                          if (param4.field_v == null) {
                            break L2;
                          } else {
                            if (param4.field_o == null) {
                              break L2;
                            } else {
                              if (param4.field_w == null) {
                                break L2;
                              } else {
                                if (param4.field_H == null) {
                                  break L2;
                                } else {
                                  if (param4.field_J == null) {
                                    break L2;
                                  } else {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (~param4.field_k >= ~var23) {
                                        break L2;
                                      } else {
                                        var24 = param4.field_B[var23];
                                        var25 = param4.field_E[var23];
                                        var26 = param4.field_s[var23];
                                        ci.field_c[var23] = var9 + (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> 16);
                                        p.field_d[var23] = var10 - -(var25 * var16 + (var24 * var13 - -(var19 * var26)) >> 16);
                                        ea.field_d[var23] = (var25 * var17 + (var14 * var24 - -(var20 * var26)) >> 16) + var11;
                                        var24 = param4.field_F[var23];
                                        var25 = param4.field_v[var23];
                                        var26 = param4.field_o[var23];
                                        ke.field_b[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> 16);
                                        v.field_d[var23] = var10 - -(var26 * var19 + var13 * var24 - -(var16 * var25) >> 16);
                                        he.field_g[var23] = var11 + (var17 * var25 + var24 * var14 - -(var26 * var20) >> 16);
                                        var24 = param4.field_w[var23];
                                        var25 = param4.field_H[var23];
                                        var26 = param4.field_J[var23];
                                        me.field_j[var23] = (var12 * var24 + var15 * var25 + var18 * var26 >> 16) + var9;
                                        gi.field_j[var23] = (var13 * var24 + (var16 * var25 + var19 * var26) >> 16) + var10;
                                        wk.field_e[var23] = (var26 * var20 + (var24 * var14 + var25 * var17) >> 16) + var11;
                                        var23++;
                                        continue L3;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (-91 <= -19) {
                    break L4;
                  } else {
                    field_l = null;
                    break L4;
                  }
                }
                var9 = param0[3];
                var10 = param0[4];
                var11 = param0[5];
                var12 = param0[6];
                var13 = param0[7];
                var14 = param0[8];
                var15 = param0[9];
                var16 = param0[10];
                var17 = param0[11];
                var18 = 0;
                L5: while (true) {
                  L6: {
                    if (~var18 <= ~param4.field_r) {
                      break L6;
                    } else {
                      if (~gj.field_c.length >= ~var18) {
                        break L6;
                      } else {
                        var19 = param4.field_y[var18];
                        var20 = param4.field_p[var18];
                        var21 = param4.field_K[var18];
                        gj.field_c[var18] = var12 * var20 + var19 * var9 - -(var15 * var21) >> 16;
                        vd.field_a[var18] = var20 * var13 + (var19 * var10 + var21 * var16) >> 16;
                        rc.field_j[var18] = var21 * var17 + (var11 * var19 - -(var20 * var14)) >> 16;
                        var18++;
                        continue L5;
                      }
                    }
                  }
                  rf.a(var8, -10, var7_int, false, param4);
                  break L0;
                }
              } else {
                L7: {
                  var24 = param4.field_O[var23];
                  var25 = param4.field_M[var23];
                  var26 = param4.field_z[var23];
                  var27 = (var18 * var26 + var25 * var15 + var12 * var24 >> 16 - uc.field_b) + var9;
                  var28 = var10 - -(var24 * var13 + var25 * var16 - -(var26 * var19) >> 16 - uc.field_b);
                  var29 = (var20 * var26 + var25 * var17 + var24 * var14 >> 16) + var11;
                  if (50 > var29) {
                    ah.field_i[var23] = -2147483648;
                    break L7;
                  } else {
                    L8: {
                      bg.field_L[var23] = var27 / var29 + var21;
                      sb.field_l[var23] = var28 / var29 + var22;
                      ah.field_i[var23] = var29;
                      if (~var7_int < ~var29) {
                        var7_int = var29;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (~var8 > ~var29) {
                      var8 = var29;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                var23++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("b.E(");
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L9;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L9;
            }
          }
          L10: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(false).append(',');
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L10;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L10;
            }
          }
          L11: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(false).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L11;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L11;
            }
          }
          throw la.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + -91 + ',' + true + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -21342) {
                break L1;
              } else {
                field_m = 117;
                break L1;
              }
            }
            int discarded$2 = ec.a(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "b.D(" + param0 + ',' + param1 + ')');
        }
    }

    abstract Object a(byte param0);

    abstract boolean b(byte param0);

    final static ad a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        ad stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_0_0 = null;
        try {
          L0: {
            var5_int = 99 % ((param4 - 67) / 48);
            int discarded$1 = 50;
            stackOut_0_0 = em.a(false, param3, false, true, 1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "b.G(" + false + ',' + 1 + ',' + true + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    b(int param0) {
        try {
            ((b) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "b.<init>(" + param0 + ')');
        }
    }

    final static ai[] a(int param0, int param1, ad param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ai[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ai[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$8 = -3;
            if (wg.a(param3, param0, param2)) {
              int discarded$9 = 1;
              stackOut_6_0 = hk.a();
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ai[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("b.F(").append(param0).append(',').append(10).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[11][];
        field_k = -1;
    }
}
