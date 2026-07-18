/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ti {
    static String field_a;
    static ve field_b;

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (tg.field_e >= 224) {
                  break L3;
                } else {
                  var1_int = tg.field_e % 32;
                  pk.b(param0 + 104, 32 + tg.field_e + -var1_int);
                  if (!Vertigo2.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              pk.b(param0 + 95, 256);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "ti.G(" + param0 + ')');
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
            L1: {
              fm.a(lk.field_a, fm.field_e, ca.field_f, ol.field_H, 12895, (cc) (Object) kb.field_c, rq.field_t, param0, ee.field_b, ja.field_e, ip.field_a, pn.field_N);
              kb.field_d = gk.a(param1, "lobby", "chatfilter", true);
              ba.field_f[1] = uo.field_j;
              ba.field_f[2] = vg.field_a;
              if (param2 == 4) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            ba.field_f[0] = lo.field_g;
            rq.a((cc) (Object) li.field_e, param2 + -2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
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
          throw wn.a((Throwable) (Object) var1, "ti.D(" + param0 + ')');
        }
        return (String) (Object) stackIn_15_0;
    }

    final static void c(int param0) {
        try {
            kk.b((byte) 112);
            if (param0 > -83) {
                field_b = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ti.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 24260) {
            return;
        }
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ti.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param0 >= 0) {
              if (!param1) {
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
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
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
          throw wn.a((Throwable) (Object) var2, "ti.C(" + param0 + ',' + param1 + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
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
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
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
            if (param1 == -53) {
              var22 = oo.field_e;
              var23 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var23 >= param6.field_F) {
                      break L3;
                    } else {
                      var24 = param6.field_I[var23];
                      var25 = param6.field_r[var23];
                      var26 = param6.field_m[var23];
                      var27 = (var26 * var18 + var15 * var25 + var12 * var24 >> 16 - hi.field_j) + var9;
                      var28 = var10 - -(var13 * var24 - -(var25 * var16) + var19 * var26 >> 16 - hi.field_j);
                      var29 = var11 + (var20 * var26 + var25 * var17 + var14 * var24 >> 16);
                      stackOut_5_0 = 50;
                      stackOut_5_1 = var29;
                      stackIn_62_0 = stackOut_5_0;
                      stackIn_62_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var30 != 0) {
                        L4: while (true) {
                          if (stackIn_62_0 >= stackIn_62_1) {
                            break L2;
                          } else {
                            if (var18 >= pk.field_w.length) {
                              break L2;
                            } else {
                              var19 = param6.field_h[var18];
                              var20 = param6.field_O[var18];
                              var21 = param6.field_a[var18];
                              pk.field_w[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 16;
                              dp.field_A[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
                              dh.field_d[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 16;
                              var18++;
                              if (var30 == 0) {
                                stackOut_61_0 = ~param6.field_K;
                                stackOut_61_1 = ~var18;
                                stackIn_62_0 = stackOut_61_0;
                                stackIn_62_1 = stackOut_61_1;
                                continue L4;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_6_0 > stackIn_6_1) {
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
                                break L5;
                              } else {
                                var7_int = var29;
                                if (var30 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          pk.field_v[var23] = -2147483648;
                          break L5;
                        }
                        L8: {
                          if (!param3) {
                            break L8;
                          } else {
                            te.field_F[var23] = var27 >> hi.field_j;
                            fa.field_u[var23] = var28 >> hi.field_j;
                            ea.field_h[var23] = var29;
                            break L8;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (param6.field_A == null) {
                        break L10;
                      } else {
                        if (null == param6.field_z) {
                          break L10;
                        } else {
                          if (null == param6.field_y) {
                            break L10;
                          } else {
                            if (param6.field_s == null) {
                              break L10;
                            } else {
                              if (null == param6.field_l) {
                                break L10;
                              } else {
                                if (param6.field_v == null) {
                                  break L10;
                                } else {
                                  if (param6.field_f == null) {
                                    break L10;
                                  } else {
                                    if (null == param6.field_b) {
                                      break L10;
                                    } else {
                                      if (param6.field_M != null) {
                                        var23 = 0;
                                        L11: while (true) {
                                          if (~var23 <= ~param6.field_w) {
                                            break L10;
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
                                            if (var30 != 0) {
                                              break L9;
                                            } else {
                                              if (var30 == 0) {
                                                continue L11;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L10;
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
                    if (param4) {
                      var9 = param0[3];
                      var10 = param0[4];
                      var11 = param0[5];
                      var12 = param0[6];
                      var13 = param0[7];
                      var14 = param0[8];
                      var15 = param0[9];
                      var16 = param0[10];
                      var17 = param0[11];
                      break L9;
                    } else {
                      break L2;
                    }
                  }
                  var18 = 0;
                  L12: while (true) {
                    stackOut_61_0 = ~param6.field_K;
                    stackOut_61_1 = ~var18;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (stackIn_62_0 >= stackIn_62_1) {
                      break L2;
                    } else {
                      if (var18 >= pk.field_w.length) {
                        break L2;
                      } else {
                        var19 = param6.field_h[var18];
                        var20 = param6.field_O[var18];
                        var21 = param6.field_a[var18];
                        pk.field_w[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 16;
                        dp.field_A[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
                        dh.field_d[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 16;
                        var18++;
                        if (var30 == 0) {
                          continue L12;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                wl.a(param6, param2, var7_int, 112, var8);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("ti.A(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L13;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L13;
            }
          }
          L14: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L14;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L14;
            }
          }
          L15: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param6 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L15;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L15;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ')');
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
