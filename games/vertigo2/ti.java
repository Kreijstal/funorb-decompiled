/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ti {
    static String field_a;
    static ve field_b;

    final static void b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (tg.field_e >= 224) {
                pk.b(105, 256);
                break L1;
              } else {
                var1_int = tg.field_e % 32;
                pk.b(114, 32 + tg.field_e + -var1_int);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "ti.G(" + 10 + 41);
        }
    }

    final static void a(boolean param0, r param1, int param2, r param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            fm.a(lk.field_a, fm.field_e, ca.field_f, ol.field_H, 12895, (cc) (Object) kb.field_c, rq.field_t, true, ee.field_b, ja.field_e, ip.field_a, pn.field_N);
            int discarded$2 = 1;
            kb.field_d = gk.a(param1, "lobby", "chatfilter");
            ba.field_f[1] = uo.field_j;
            ba.field_f[2] = vg.field_a;
            ba.field_f[0] = lo.field_g;
            rq.a((cc) (Object) li.field_e, 2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ti.E(").append(1).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(4).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        try {
          L0: {
            L1: {
              if (param0 < -33) {
                break L1;
              } else {
                String discarded$2 = ti.a((byte) -39);
                break L1;
              }
            }
            L2: {
              if (gl.field_o) {
                break L2;
              } else {
                if (qf.field_b < aj.field_h) {
                  break L2;
                } else {
                  if (~(ea.field_g + aj.field_h) < ~qf.field_b) {
                    stackOut_12_0 = as.field_a;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_14_0 = null;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "ti.D(" + param0 + 41);
        }
        return (String) (Object) stackIn_15_0;
    }

    final static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int discarded$3 = 112;
            kk.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "ti.F(" + -95 + 41);
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "ti.B(" + 24260 + 41);
        }
    }

    final static boolean a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param0 >= 0) {
              if (param0 >= 1582) {
                if (param0 % 4 != 0) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                } else {
                  if (param0 % 100 == 0) {
                    if (param0 % 400 == 0) {
                      stackOut_30_0 = 1;
                      stackIn_31_0 = stackOut_30_0;
                      break L0;
                    } else {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
                  }
                }
              } else {
                L1: {
                  if (param0 % 4 != 0) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L1;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_18_0 = stackOut_15_0;
                    break L1;
                  }
                }
                return stackIn_18_0 != 0;
              }
            } else {
              L2: {
                if ((1 + param0) % 4 != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "ti.C(" + param0 + 44 + 0 + 41);
        }
        return stackIn_31_0 != 0;
    }

    final static void a(int[] param0, byte param1, boolean param2, boolean param3, boolean param4, int[] param5, jp param6) {
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
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var30 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param5[3] >> 2;
            var22 = param5[4] >> 2;
            var23 = param5[5] >> 2;
            var24 = param5[6] >> 2;
            var25 = param5[7] >> 2;
            var26 = param5[8] >> 2;
            var27 = param5[9] >> 2;
            var28 = param5[10] >> 2;
            var13 = param0[5] * var26 + (var25 * param0[4] + var24 * param0[3]) >> 14;
            var29 = param5[11] >> 2;
            var12 = param0[5] * var23 + (param0[4] * var22 + param0[3] * var21) >> 14;
            var14 = var29 * param0[5] + var28 * param0[4] + param0[3] * var27 >> 14;
            var18 = param0[11] * var23 + (param0[9] * var21 + var22 * param0[10]) >> 14;
            var16 = var26 * param0[8] + param0[7] * var25 + param0[6] * var24 >> 14;
            var15 = param0[7] * var22 + param0[6] * var21 - -(var23 * param0[8]) >> 14;
            var19 = param0[11] * var26 + (param0[10] * var25 + param0[9] * var24) >> 14;
            var17 = param0[6] * var27 - (-(param0[7] * var28) - param0[8] * var29) >> 14;
            var20 = var28 * param0[10] + (param0[9] * var27 - -(var29 * param0[11])) >> 14;
            var21 = param0[0] + -param5[0];
            var22 = param0[1] - param5[1];
            var23 = -param5[2] + param0[2];
            var9 = var23 * param5[5] + param5[3] * var21 + var22 * param5[4] >> -hi.field_j + 16;
            var10 = param5[8] * var23 + (param5[6] * var21 - -(var22 * param5[7])) >> -hi.field_j + 16;
            var11 = param5[11] * var23 + param5[9] * var21 + var22 * param5[10] >> 16;
            var21 = oo.field_l;
            var22 = oo.field_e;
            var23 = 0;
            L1: while (true) {
              if (var23 >= param6.field_F) {
                L2: {
                  if (param6.field_A == null) {
                    break L2;
                  } else {
                    if (null == param6.field_z) {
                      break L2;
                    } else {
                      if (null == param6.field_y) {
                        break L2;
                      } else {
                        if (param6.field_s == null) {
                          break L2;
                        } else {
                          if (null == param6.field_l) {
                            break L2;
                          } else {
                            if (param6.field_v == null) {
                              break L2;
                            } else {
                              if (param6.field_f == null) {
                                break L2;
                              } else {
                                if (null == param6.field_b) {
                                  break L2;
                                } else {
                                  if (param6.field_M != null) {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (~var23 <= ~param6.field_w) {
                                        break L2;
                                      } else {
                                        var24 = param6.field_A[var23];
                                        var25 = param6.field_z[var23];
                                        var26 = param6.field_y[var23];
                                        fq.field_b[var23] = var9 - -(var26 * var18 + var24 * var12 + var25 * var15 >> 16);
                                        fd.field_t[var23] = var10 + (var16 * var25 + (var24 * var13 + var19 * var26) >> 16);
                                        wq.field_G[var23] = var11 - -(var26 * var20 + var25 * var17 + var24 * var14 >> 16);
                                        var24 = param6.field_s[var23];
                                        var25 = param6.field_l[var23];
                                        var26 = param6.field_v[var23];
                                        jb.field_H[var23] = var9 - -(var26 * var18 + (var12 * var24 + var25 * var15) >> 16);
                                        fh.field_u[var23] = var10 - -(var24 * var13 - (-(var25 * var16) + -(var26 * var19)) >> 16);
                                        ek.field_y[var23] = (var20 * var26 + (var17 * var25 + var14 * var24) >> 16) + var11;
                                        var24 = param6.field_f[var23];
                                        var25 = param6.field_b[var23];
                                        var26 = param6.field_M[var23];
                                        ne.field_O[var23] = var9 + (var18 * var26 + var12 * var24 - -(var15 * var25) >> 16);
                                        mg.field_J[var23] = var10 - -(var13 * var24 + (var16 * var25 - -(var19 * var26)) >> 16);
                                        nf.field_u[var23] = (var26 * var20 + var14 * var24 - -(var25 * var17) >> 16) + var11;
                                        var23++;
                                        continue L3;
                                      }
                                    }
                                  } else {
                                    break L2;
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
                L4: while (true) {
                  L5: {
                    if (~param6.field_K >= ~var18) {
                      break L5;
                    } else {
                      if (var18 >= pk.field_w.length) {
                        break L5;
                      } else {
                        var19 = param6.field_h[var18];
                        var20 = param6.field_O[var18];
                        var21 = param6.field_a[var18];
                        pk.field_w[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 16;
                        dp.field_A[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
                        dh.field_d[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  wl.a(param6, false, var7_int, 112, var8);
                  break L0;
                }
              } else {
                L6: {
                  var24 = param6.field_I[var23];
                  var25 = param6.field_r[var23];
                  var26 = param6.field_m[var23];
                  var27 = (var26 * var18 + var15 * var25 + var12 * var24 >> 16 - hi.field_j) + var9;
                  var28 = var10 - -(var13 * var24 - -(var25 * var16) + var19 * var26 >> 16 - hi.field_j);
                  var29 = var11 + (var20 * var26 + var25 * var17 + var14 * var24 >> 16);
                  if (50 > var29) {
                    pk.field_v[var23] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      nj.field_a[var23] = var27 / var29 + var21;
                      ml.field_t[var23] = var22 + var28 / var29;
                      pk.field_v[var23] = var29;
                      if (var8 < var29) {
                        var8 = var29;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (var29 >= var7_int) {
                      break L6;
                    } else {
                      var7_int = var29;
                      break L6;
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
          L8: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("ti.A(");
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L8;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L8;
            }
          }
          L9: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44).append(-53).append(44).append(0).append(44).append(0).append(44).append(1).append(44);
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L9;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L9;
            }
          }
          L10: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44);
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L10;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L10;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Invite";
        field_b = new ve(4, 1, 1, 1);
    }
}
