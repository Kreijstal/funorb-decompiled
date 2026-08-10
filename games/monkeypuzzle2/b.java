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
            field_j = (int[][]) null;
            field_l = null;
            int var1_int = -21 % ((param0 - 32) / 58);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "b.B(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, sj param4, byte param5, boolean param6) {
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        var30 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param2[3] >> 1995590722;
            var22 = param2[4] >> 1313923618;
            var23 = param2[5] >> -2086045502;
            var24 = param2[6] >> -660916990;
            var25 = param2[7] >> -42147262;
            var26 = param2[8] >> -1693838078;
            var27 = param2[9] >> -951537406;
            var28 = param2[10] >> -852633470;
            var29 = param2[11] >> 1349840930;
            var12 = var23 * param0[5] + param0[3] * var21 - -(var22 * param0[4]) >> 865624718;
            var13 = var25 * param0[4] + param0[3] * var24 - -(var26 * param0[5]) >> -916498578;
            var20 = param0[11] * var29 + (param0[9] * var27 + var28 * param0[10]) >> 1346552910;
            var14 = param0[3] * var27 + param0[4] * var28 - -(var29 * param0[5]) >> -669350002;
            var16 = param0[7] * var25 + var24 * param0[6] - -(var26 * param0[8]) >> -986832114;
            var17 = var28 * param0[7] + (param0[6] * var27 - -(var29 * param0[8])) >> 943040174;
            var19 = var25 * param0[10] + var24 * param0[9] + var26 * param0[11] >> -519995730;
            var15 = param0[8] * var23 + (var22 * param0[7] + var21 * param0[6]) >> -457578706;
            var18 = var22 * param0[10] + (param0[9] * var21 + var23 * param0[11]) >> -1539623314;
            var21 = -param2[0] + param0[0];
            var22 = -param2[1] + param0[1];
            var23 = param0[2] - param2[2];
            var9 = param2[3] * var21 - -(var22 * param2[4]) - -(var23 * param2[5]) >> 16 + -uc.field_b;
            var10 = param2[8] * var23 + (var22 * param2[7] + param2[6] * var21) >> 16 + -uc.field_b;
            var11 = var21 * param2[9] - (-(param2[10] * var22) - var23 * param2[11]) >> -1406406960;
            var21 = ig.field_h;
            var22 = ig.field_f;
            var23 = 0;
            L1: while (true) {
              L2: {
                if (param4.field_e <= var23) {
                  L3: {
                    if (null == param4.field_B) {
                      break L3;
                    } else {
                      if (null == param4.field_E) {
                        break L3;
                      } else {
                        if (param4.field_s == null) {
                          break L3;
                        } else {
                          if (param4.field_F == null) {
                            break L3;
                          } else {
                            if (param4.field_v == null) {
                              break L3;
                            } else {
                              if (param4.field_o == null) {
                                break L3;
                              } else {
                                if (param4.field_w == null) {
                                  break L3;
                                } else {
                                  if (param4.field_H == null) {
                                    break L3;
                                  } else {
                                    if (param4.field_J == null) {
                                      break L3;
                                    } else {
                                      var23 = 0;
                                      L4: while (true) {
                                        if ((param4.field_k ^ -1) >= (var23 ^ -1)) {
                                          break L3;
                                        } else {
                                          var24 = param4.field_B[var23];
                                          var25 = param4.field_E[var23];
                                          var26 = param4.field_s[var23];
                                          ci.field_c[var23] = var9 + (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -1222919152);
                                          p.field_d[var23] = var10 - -(var25 * var16 + (var24 * var13 - -(var19 * var26)) >> 394975920);
                                          ea.field_d[var23] = (var25 * var17 + (var14 * var24 - -(var20 * var26)) >> 680647824) + var11;
                                          var24 = param4.field_F[var23];
                                          var25 = param4.field_v[var23];
                                          var26 = param4.field_o[var23];
                                          ke.field_b[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> 1127922576);
                                          v.field_d[var23] = var10 - -(var26 * var19 + var13 * var24 - -(var16 * var25) >> -758531824);
                                          he.field_g[var23] = var11 + (var17 * var25 + var24 * var14 - -(var26 * var20) >> -542437904);
                                          var24 = param4.field_w[var23];
                                          var25 = param4.field_H[var23];
                                          var26 = param4.field_J[var23];
                                          me.field_j[var23] = (var12 * var24 + var15 * var25 + var18 * var26 >> -526125680) + var9;
                                          gi.field_j[var23] = (var13 * var24 + (var16 * var25 + var19 * var26) >> -48780176) + var10;
                                          wk.field_e[var23] = (var26 * var20 + (var24 * var14 + var25 * var17) >> 1864774288) + var11;
                                          var23++;
                                          continue L4;
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
                  stackIn_54_0 = param5;
                  stackIn_54_1 = -19;
                  break L2;
                } else {
                  var24 = param4.field_O[var23];
                  var25 = param4.field_M[var23];
                  var26 = param4.field_z[var23];
                  var27 = (var18 * var26 + var25 * var15 + var12 * var24 >> 16 - uc.field_b) + var9;
                  var28 = var10 - -(var24 * var13 + var25 * var16 - -(var26 * var19) >> 16 - uc.field_b);
                  var29 = (var20 * var26 + var25 * var17 + var24 * var14 >> -1525219248) + var11;
                  stackIn_54_0 = 50;

                  stackIn_54_1 = var29;

                  L5: {
                    if (stackIn_54_0 > stackIn_54_1) {
                      ah.field_i[var23] = -2147483648;
                      break L5;
                    } else {
                      L6: {
                        bg.field_L[var23] = var27 / var29 + var21;
                        sb.field_l[var23] = var28 / var29 + var22;
                        ah.field_i[var23] = var29;
                        if ((var7_int ^ -1) < (var29 ^ -1)) {
                          var7_int = var29;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if ((var8 ^ -1) > (var29 ^ -1)) {
                        var8 = var29;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L7: {
                    if (!param1) {
                      break L7;
                    } else {
                      wf.field_m[var23] = var27 >> uc.field_b;
                      fi.field_c[var23] = var28 >> uc.field_b;
                      jh.field_y[var23] = var29;
                      break L7;
                    }
                  }
                  var23++;
                  continue L1;
                }
              }
              L8: {
                if (stackIn_54_0 <= stackIn_54_1) {
                  break L8;
                } else {
                  field_l = (lg) null;
                  break L8;
                }
              }
              L9: {
                L10: {
                  if (!param6) {
                    break L10;
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
                    L11: while (true) {
                      if ((var18 ^ -1) <= (param4.field_r ^ -1)) {
                        break L10;
                      } else {
                        stackIn_66_0 = gj.field_c.length ^ -1;

                        stackIn_66_1 = var18 ^ -1;

                        if (stackIn_66_0 >= stackIn_66_1) {
                          break L10;
                        } else {
                          var19 = param4.field_y[var18];
                          var20 = param4.field_p[var18];
                          var21 = param4.field_K[var18];
                          gj.field_c[var18] = var12 * var20 + var19 * var9 - -(var15 * var21) >> 1806200304;
                          vd.field_a[var18] = var20 * var13 + (var19 * var10 + var21 * var16) >> -2043797808;
                          rc.field_j[var18] = var21 * var17 + (var11 * var19 - -(var20 * var14)) >> 1267971216;
                          var18++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
                stackIn_66_0 = var8;
                stackIn_66_1 = -10;
                break L9;
              }
              rf.a(stackIn_66_0, stackIn_66_1, var7_int, param3, param4);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("b.E(");

            if (param0 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L12;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L13;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L14;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L14;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_72_0), stackIn_80_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            ec.a(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "b.D(" + param0 + ',' + param1 + ')');
        }
    }

    abstract Object a(byte param0);

    abstract boolean b(byte param0);

    final static ad a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        ad stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            var5_int = 99 % ((param4 - 67) / 48);
            stackIn_1_0 = em.a(false, param3, param0, param2, param1, 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "b.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    b(int param0) {
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "b.<init>(" + param0 + ')');
        }
    }

    final static ai[] a(int param0, int param1, ad param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ai[] stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wg.a(param3, param0, param2, -3)) {
              L1: {
                if (param1 == 10) {
                  break L1;
                } else {
                  field_l = (lg) null;
                  break L1;
                }
              }
              stackIn_7_0 = hk.a((byte) 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("b.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ai[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_j = new int[11][];
        field_k = -1;
    }
}
