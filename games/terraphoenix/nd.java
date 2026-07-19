/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends uf {
    String[][] field_p;
    static int field_k;
    boolean field_m;
    int field_s;
    static int field_i;
    long[][] field_l;
    static String[] field_o;
    static String field_h;
    static int field_r;
    int field_n;
    int field_j;
    int[][] field_q;

    public static void c(int param0) {
        try {
            field_h = null;
            field_o = null;
            if (param0 <= 80) {
                field_r = 88;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "nd.B(" + param0 + ')');
        }
    }

    final static void a(ee param0, boolean param1, int[] param2, int param3, boolean param4, int[] param5, boolean param6) {
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
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
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
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var30 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param2[3] >> 1637957538;
              var22 = param2[4] >> -757592030;
              var23 = param2[5] >> -49228702;
              var24 = param2[6] >> 1603339746;
              var25 = param2[7] >> 1996458210;
              if (param3 > 34) {
                break L1;
              } else {
                nd.c((byte) -54);
                break L1;
              }
            }
            var26 = param2[8] >> 596622210;
            var27 = param2[9] >> -1843031294;
            var28 = param2[10] >> -252002974;
            var12 = param5[3] * var21 - (-(var22 * param5[4]) + -(var23 * param5[5])) >> -1303592850;
            var13 = var26 * param5[5] + (param5[3] * var24 + param5[4] * var25) >> 416609454;
            var29 = param2[11] >> 715708002;
            var15 = var22 * param5[7] + param5[6] * var21 + var23 * param5[8] >> -782886354;
            var19 = param5[10] * var25 + (var24 * param5[9] - -(param5[11] * var26)) >> -1879223826;
            var17 = param5[6] * var27 + (param5[7] * var28 - -(param5[8] * var29)) >> -882289682;
            var20 = var28 * param5[10] + param5[9] * var27 - -(param5[11] * var29) >> -1800553330;
            var16 = param5[8] * var26 + param5[6] * var24 + param5[7] * var25 >> -1639604114;
            var18 = var23 * param5[11] + (param5[9] * var21 - -(param5[10] * var22)) >> -1396594066;
            var14 = var28 * param5[4] + var27 * param5[3] - -(param5[5] * var29) >> 1863597006;
            var21 = -param2[0] + param5[0];
            var22 = -param2[1] + param5[1];
            var23 = -param2[2] + param5[2];
            var9 = var22 * param2[4] + param2[3] * var21 - -(param2[5] * var23) >> -hb.field_l + 16;
            var11 = param2[10] * var22 + (param2[9] * var21 + var23 * param2[11]) >> -501391664;
            var10 = var22 * param2[7] + var21 * param2[6] + var23 * param2[8] >> 16 - hb.field_l;
            var21 = ob.field_b;
            var22 = ob.field_c;
            var23 = 0;
            L2: while (true) {
              if ((var23 ^ -1) <= (param0.field_m ^ -1)) {
                L3: {
                  if (null == param0.field_Q) {
                    break L3;
                  } else {
                    if (param0.field_i == null) {
                      break L3;
                    } else {
                      if (param0.field_w == null) {
                        break L3;
                      } else {
                        if (param0.field_c == null) {
                          break L3;
                        } else {
                          if (null == param0.field_e) {
                            break L3;
                          } else {
                            if (param0.field_q == null) {
                              break L3;
                            } else {
                              if (param0.field_O == null) {
                                break L3;
                              } else {
                                if (null == param0.field_d) {
                                  break L3;
                                } else {
                                  if (param0.field_b == null) {
                                    break L3;
                                  } else {
                                    var23 = 0;
                                    L4: while (true) {
                                      if ((param0.field_l ^ -1) >= (var23 ^ -1)) {
                                        break L3;
                                      } else {
                                        var24 = param0.field_Q[var23];
                                        var25 = param0.field_i[var23];
                                        var26 = param0.field_w[var23];
                                        ec.field_a[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var18 * var26) >> -1726542096);
                                        dl.field_f[var23] = (var26 * var19 + (var24 * var13 + var25 * var16) >> 557486992) + var10;
                                        lm.field_a[var23] = (var26 * var20 + (var14 * var24 + var25 * var17) >> -481821648) + var11;
                                        var24 = param0.field_c[var23];
                                        var25 = param0.field_e[var23];
                                        var26 = param0.field_q[var23];
                                        ad.field_u[var23] = (var24 * var12 - (-(var15 * var25) + -(var18 * var26)) >> -1572986352) + var9;
                                        nf.field_f[var23] = var10 - -(var24 * var13 + var16 * var25 - -(var26 * var19) >> 979920176);
                                        hj.field_J[var23] = (var17 * var25 + var24 * var14 + var26 * var20 >> 32051152) + var11;
                                        var24 = param0.field_O[var23];
                                        var25 = param0.field_d[var23];
                                        var26 = param0.field_b[var23];
                                        hl.field_c[var23] = (var25 * var15 + (var24 * var12 + var26 * var18) >> -534882704) + var9;
                                        pj.field_a[var23] = (var19 * var26 + (var25 * var16 + var24 * var13) >> 1894156720) + var10;
                                        t.field_a[var23] = (var26 * var20 + var24 * var14 - -(var25 * var17) >> -67285744) + var11;
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
                L5: {
                  if (param1) {
                    var9 = param5[3];
                    var10 = param5[4];
                    var11 = param5[5];
                    var12 = param5[6];
                    var13 = param5[7];
                    var14 = param5[8];
                    var15 = param5[9];
                    var16 = param5[10];
                    var17 = param5[11];
                    var18 = 0;
                    L6: while (true) {
                      if (var18 >= param0.field_o) {
                        break L5;
                      } else {
                        stackOut_59_0 = ph.field_m.length ^ -1;
                        stackOut_59_1 = var18 ^ -1;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        if (stackIn_61_0 >= stackIn_61_1) {
                          break L5;
                        } else {
                          var19 = param0.field_j[var18];
                          var20 = param0.field_P[var18];
                          var21 = param0.field_u[var18];
                          ph.field_m[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> 1269421072;
                          k.field_e[var18] = var16 * var21 + var20 * var13 + var19 * var10 >> 1409265776;
                          mg.field_p[var18] = var21 * var17 + var14 * var20 + var11 * var19 >> -2075043952;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                ld.a(var8, param4, param0, var7_int, (byte) 124);
                break L0;
              } else {
                L7: {
                  var24 = param0.field_D[var23];
                  var25 = param0.field_B[var23];
                  var26 = param0.field_L[var23];
                  var27 = var9 + (var18 * var26 + (var15 * var25 + var12 * var24) >> 16 - hb.field_l);
                  var28 = var10 + (var24 * var13 + (var16 * var25 - -(var19 * var26)) >> 16 + -hb.field_l);
                  var29 = (var20 * var26 + (var25 * var17 + var14 * var24) >> -1213753104) + var11;
                  if (-51 >= (var29 ^ -1)) {
                    L8: {
                      gm.field_l[var23] = var27 / var29 + var21;
                      nb.field_c[var23] = var28 / var29 + var22;
                      gd.field_e[var23] = var29;
                      if (var29 < var7_int) {
                        var7_int = var29;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if ((var29 ^ -1) >= (var8 ^ -1)) {
                      break L7;
                    } else {
                      var8 = var29;
                      break L7;
                    }
                  } else {
                    gd.field_e[var23] = -2147483648;
                    break L7;
                  }
                }
                L9: {
                  if (!param6) {
                    break L9;
                  } else {
                    ld.field_h[var23] = var27 >> hb.field_l;
                    jl.field_A[var23] = var28 >> hb.field_l;
                    qa.field_a[var23] = var29;
                    break L9;
                  }
                }
                var23++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var7);
            stackOut_67_1 = new StringBuilder().append("nd.C(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L10;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L10;
            }
          }
          L11: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L11;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L11;
            }
          }
          L12: {
            stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param5 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L12;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L12;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param6 + ')');
        }
    }

    final static void c(byte param0) {
        vc.field_c = je.a(param0 ^ -16);
        jl.field_I = new d();
        if (param0 != -11) {
            return;
        }
        try {
            qc.a(true, true, 106);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "nd.E(" + param0 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 > 123) {
                break L1;
              } else {
                field_o = (String[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (-66 < (param0 ^ -1)) {
                    break L4;
                  } else {
                    if (90 >= param0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param0 < 97) {
                    break L5;
                  } else {
                    if (-123 > (param0 ^ -1)) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "nd.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!qi.field_b) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (nb.field_b == null) {
                  break L1;
                } else {
                  nb.field_b.h((byte) -126);
                  break L1;
                }
              }
              var1 = lk.c(-62);
              mb.field_s = new uh(var1, (String) null, true, false, false);
              var2 = -47 % ((-58 - param0) / 40);
              jl.field_I.a((gl) (bj.field_f), (byte) -1);
              bj.field_f.a(mb.field_s, -67);
              bj.field_f.j(-2065096856);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "nd.D(" + param0 + ')');
        }
    }

    nd() {
    }

    static {
        field_o = new String[]{"Equipment screen", "Select equipment group", "Equip buttons", "Soldier tabs", "Recruit button", "Primary weapon", "Armour", "Secondary weapon", "Grenades", "Portrait", "Health", "Speed", "Strength", "Firing accuracy", "Exit to mission select screen.", "On this screen you give your soldiers the latest equipment to fight the enemy. Take note of the strength bar, if it starts flashing, then the soldier is encumbered lowering their movement speed. Try giving the soldier smaller or fewer weapons. The basic pistol and jacket weigh nothing."};
        field_h = "Exit Equip Screen";
    }
}
