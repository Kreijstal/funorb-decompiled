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

    public static void e(int param0) {
        try {
            field_i = null;
            field_j = null;
            field_l = null;
            int var1_int = -21 % ((param0 - 32) / 58);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "b.B(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, sj param4, byte param5, boolean param6) {
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
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
              L2: {
                L3: {
                  L4: {
                    if (param4.field_e <= var23) {
                      break L4;
                    } else {
                      var24 = param4.field_O[var23];
                      var25 = param4.field_M[var23];
                      var26 = param4.field_z[var23];
                      var27 = (var18 * var26 + var25 * var15 + var12 * var24 >> 16 - uc.field_b) + var9;
                      var28 = var10 - -(var24 * var13 + var25 * var16 - -(var26 * var19) >> 16 - uc.field_b);
                      var29 = (var20 * var26 + var25 * var17 + var24 * var14 >> 16) + var11;
                      stackOut_3_0 = 50;
                      stackOut_3_1 = var29;
                      stackIn_55_0 = stackOut_3_0;
                      stackIn_55_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_4_0 > stackIn_4_1) {
                              break L6;
                            } else {
                              L7: {
                                bg.field_L[var23] = var27 / var29 + var21;
                                sb.field_l[var23] = var28 / var29 + var22;
                                ah.field_i[var23] = var29;
                                if (~var7_int < ~var29) {
                                  var7_int = var29;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              if (~var8 > ~var29) {
                                var8 = var29;
                                if (var30 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          ah.field_i[var23] = -2147483648;
                          break L5;
                        }
                        L8: {
                          if (!param1) {
                            break L8;
                          } else {
                            wf.field_m[var23] = var27 >> uc.field_b;
                            fi.field_c[var23] = var28 >> uc.field_b;
                            jh.field_y[var23] = var29;
                            break L8;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L9: {
                    if (null == param4.field_B) {
                      break L9;
                    } else {
                      if (null == param4.field_E) {
                        break L9;
                      } else {
                        if (param4.field_s == null) {
                          break L9;
                        } else {
                          if (param4.field_F == null) {
                            break L9;
                          } else {
                            if (param4.field_v == null) {
                              break L9;
                            } else {
                              if (param4.field_o == null) {
                                break L9;
                              } else {
                                if (param4.field_w == null) {
                                  break L9;
                                } else {
                                  if (param4.field_H == null) {
                                    break L9;
                                  } else {
                                    if (param4.field_J == null) {
                                      break L9;
                                    } else {
                                      var23 = 0;
                                      L10: while (true) {
                                        if (~param4.field_k >= ~var23) {
                                          break L9;
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
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L10;
                                            } else {
                                              break L9;
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
                    }
                  }
                  stackOut_54_0 = param5;
                  stackOut_54_1 = -19;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L3;
                }
                if (stackIn_55_0 <= stackIn_55_1) {
                  break L2;
                } else {
                  field_l = null;
                  break L2;
                }
              }
              L11: {
                L12: {
                  if (!param6) {
                    break L12;
                  } else {
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
                    L13: while (true) {
                      if (~var18 <= ~param4.field_r) {
                        break L12;
                      } else {
                        stackOut_61_0 = ~gj.field_c.length;
                        stackOut_61_1 = ~var18;
                        stackIn_67_0 = stackOut_61_0;
                        stackIn_67_1 = stackOut_61_1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        if (var30 != 0) {
                          break L11;
                        } else {
                          if (stackIn_62_0 >= stackIn_62_1) {
                            break L12;
                          } else {
                            var19 = param4.field_y[var18];
                            var20 = param4.field_p[var18];
                            var21 = param4.field_K[var18];
                            gj.field_c[var18] = var12 * var20 + var19 * var9 - -(var15 * var21) >> 16;
                            vd.field_a[var18] = var20 * var13 + (var19 * var10 + var21 * var16) >> 16;
                            rc.field_j[var18] = var21 * var17 + (var11 * var19 - -(var20 * var14)) >> 16;
                            var18++;
                            if (var30 == 0) {
                              continue L13;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_66_0 = var8;
                stackOut_66_1 = -10;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                break L11;
              }
              rf.a(stackIn_67_0, stackIn_67_1, var7_int, param3, param4);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("b.E(");
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
              break L14;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L14;
            }
          }
          L15: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L15;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L15;
            }
          }
          L16: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L16;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L16;
            }
          }
          throw la.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param5 + ',' + param6 + ')');
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
            stackOut_0_0 = em.a(false, param3, param0, param2, param1, 50);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "b.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            if (wg.a(param3, param0, param2, -3)) {
              L1: {
                if (param1 == 10) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              stackOut_6_0 = hk.a((byte) 1);
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
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("b.F(").append(param0).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
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
