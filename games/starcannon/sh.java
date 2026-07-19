/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sh extends fh {
    static String field_s;
    static boolean field_t;

    sh(int param0) {
        this(nb.field_c, param0);
    }

    private sh(qe param0, int param1) {
        super(param0, param1);
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_t = false;
                break L1;
              }
            }
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "sh.CA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int[] param3, lb param4, int[] param5, boolean param6) {
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
        int var31 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
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
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
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
        var31 = StarCannon.field_A;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param5[3] >> 973091394;
            var22 = param5[4] >> -1212345086;
            var23 = param5[5] >> -1408213822;
            var24 = param5[6] >> 305147362;
            var25 = param5[7] >> 205317986;
            var26 = param5[8] >> 705631522;
            var27 = param5[9] >> 772935202;
            var28 = param5[10] >> -1631328062;
            var12 = param3[3] * var21 + (param3[4] * var22 + var23 * param3[5]) >> -2058889938;
            var29 = param5[11] >> -1264722078;
            var13 = var26 * param3[5] + (var24 * param3[3] - -(var25 * param3[4])) >> 508936430;
            var19 = param3[10] * var25 + param3[9] * var24 + var26 * param3[11] >> 1200648558;
            var14 = param3[5] * var29 + (var27 * param3[3] + param3[4] * var28) >> -1119565042;
            var20 = var29 * param3[11] + var28 * param3[10] + param3[9] * var27 >> 575921966;
            var18 = var22 * param3[10] + (param3[9] * var21 - -(var23 * param3[11])) >> 1357206510;
            var15 = param3[6] * var21 + (param3[7] * var22 + param3[8] * var23) >> 125415982;
            var16 = param3[8] * var26 + var25 * param3[7] + var24 * param3[6] >> 1082946382;
            var17 = param3[8] * var29 + var27 * param3[6] + param3[7] * var28 >> 62230094;
            var30 = -71 / ((-53 - param2) / 35);
            var21 = param3[0] + -param5[0];
            var22 = param3[1] + -param5[1];
            var23 = param3[2] + -param5[2];
            var9 = var21 * param5[3] + (param5[4] * var22 - -(var23 * param5[5])) >> 16 - fb.field_r;
            var11 = var23 * param5[11] + var22 * param5[10] + var21 * param5[9] >> -543084816;
            var10 = var23 * param5[8] + param5[6] * var21 - -(param5[7] * var22) >> -fb.field_r + 16;
            var21 = gl.field_e;
            var22 = gl.field_i;
            var23 = 0;
            L1: while (true) {
              if (var23 >= param4.field_R) {
                L2: {
                  if (param4.field_i == null) {
                    break L2;
                  } else {
                    if (null == param4.field_j) {
                      break L2;
                    } else {
                      if (null == param4.field_f) {
                        break L2;
                      } else {
                        if (null == param4.field_E) {
                          break L2;
                        } else {
                          if (param4.field_h == null) {
                            break L2;
                          } else {
                            if (null == param4.field_C) {
                              break L2;
                            } else {
                              if (param4.field_n == null) {
                                break L2;
                              } else {
                                if (param4.field_g == null) {
                                  break L2;
                                } else {
                                  if (null != param4.field_r) {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (var23 >= param4.field_P) {
                                        break L2;
                                      } else {
                                        var24 = param4.field_i[var23];
                                        var25 = param4.field_j[var23];
                                        var26 = param4.field_f[var23];
                                        ae.field_b[var23] = (var25 * var15 + (var24 * var12 - -(var18 * var26)) >> -198244048) + var9;
                                        cd.field_b[var23] = (var16 * var25 + var13 * var24 + var26 * var19 >> -1498476656) + var10;
                                        kl.field_c[var23] = var11 - -(var25 * var17 + (var24 * var14 + var20 * var26) >> -195263408);
                                        var24 = param4.field_E[var23];
                                        var25 = param4.field_h[var23];
                                        var26 = param4.field_C[var23];
                                        ad.field_D[var23] = (var24 * var12 - (-(var15 * var25) - var18 * var26) >> -554164688) + var9;
                                        hi.field_d[var23] = (var26 * var19 + var13 * var24 + var16 * var25 >> 131154864) + var10;
                                        StarCannon.field_y[var23] = (var20 * var26 + (var14 * var24 - -(var17 * var25)) >> 153648240) + var11;
                                        var24 = param4.field_n[var23];
                                        var25 = param4.field_g[var23];
                                        var26 = param4.field_r[var23];
                                        pd.field_d[var23] = (var18 * var26 + var25 * var15 + var12 * var24 >> -1751073840) + var9;
                                        ob.field_c[var23] = var10 - -(var25 * var16 + (var13 * var24 + var19 * var26) >> 1508689552);
                                        ih.field_g[var23] = var11 - -(var26 * var20 + (var14 * var24 + var17 * var25) >> -1007273520);
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
                L4: {
                  if (param6) {
                    var9 = param3[3];
                    var10 = param3[4];
                    var11 = param3[5];
                    var12 = param3[6];
                    var13 = param3[7];
                    var14 = param3[8];
                    var15 = param3[9];
                    var16 = param3[10];
                    var17 = param3[11];
                    var18 = 0;
                    L5: while (true) {
                      if ((param4.field_s ^ -1) >= (var18 ^ -1)) {
                        break L4;
                      } else {
                        stackOut_57_0 = var18;
                        stackOut_57_1 = rc.field_a.length;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        if (stackIn_59_0 >= stackIn_59_1) {
                          break L4;
                        } else {
                          var19 = param4.field_N[var18];
                          var20 = param4.field_a[var18];
                          var21 = param4.field_o[var18];
                          rc.field_a[var18] = var21 * var15 + var20 * var12 + var9 * var19 >> 1634770640;
                          fb.field_m[var18] = var20 * var13 + (var10 * var19 + var21 * var16) >> 173463920;
                          p.field_f[var18] = var17 * var21 + var19 * var11 + var20 * var14 >> 1018737584;
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                vh.a(var7_int, param1, param4, -6787, var8);
                break L0;
              } else {
                L6: {
                  var24 = param4.field_J[var23];
                  var25 = param4.field_x[var23];
                  var26 = param4.field_q[var23];
                  var27 = var9 - -(var26 * var18 + var24 * var12 - -(var15 * var25) >> 16 - fb.field_r);
                  var28 = (var26 * var19 + var24 * var13 + var16 * var25 >> 16 + -fb.field_r) + var10;
                  var29 = (var17 * var25 + (var24 * var14 + var20 * var26) >> 1682103056) + var11;
                  if (var29 < 50) {
                    sc.field_d[var23] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      bh.field_c[var23] = var27 / var29 + var21;
                      ri.field_a[var23] = var22 + var28 / var29;
                      sc.field_d[var23] = var29;
                      if (var29 < var7_int) {
                        var7_int = var29;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if ((var8 ^ -1) <= (var29 ^ -1)) {
                      break L6;
                    } else {
                      var8 = var29;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (!param0) {
                    break L8;
                  } else {
                    bj.field_a[var23] = var27 >> fb.field_r;
                    lj.field_g[var23] = var28 >> fb.field_r;
                    ej.field_s[var23] = var29;
                    break L8;
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
            stackOut_65_0 = (RuntimeException) (var7);
            stackOut_65_1 = new StringBuilder().append("sh.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L9;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L9;
            }
          }
          L10: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L10;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L10;
            }
          }
          L11: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L11;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param6 + ')');
        }
    }

    final String a(uj param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                sh.b(-96);
                break L1;
              }
            }
            stackOut_3_0 = uh.a(param0.field_k.length(), 0, '*');
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("sh.R(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static int b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -20 / ((param0 - -78) / 48);
            stackOut_0_0 = eh.a(2, nc.field_c, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "sh.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_s = "to return to the normal view.";
    }
}
