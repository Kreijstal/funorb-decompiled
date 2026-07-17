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
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_h = null;
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "nd.B(" + 105 + 41);
        }
    }

    final static void a(ee param0, boolean param1, int[] param2, int param3, boolean param4, int[] param5) {
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
            var12 = param5[3] * var21 - (-(var22 * param5[4]) + -(var23 * param5[5])) >> 14;
            var13 = var26 * param5[5] + (param5[3] * var24 + param5[4] * var25) >> 14;
            var29 = param2[11] >> 2;
            var15 = var22 * param5[7] + param5[6] * var21 + var23 * param5[8] >> 14;
            var19 = param5[10] * var25 + (var24 * param5[9] - -(param5[11] * var26)) >> 14;
            var17 = param5[6] * var27 + (param5[7] * var28 - -(param5[8] * var29)) >> 14;
            var20 = var28 * param5[10] + param5[9] * var27 - -(param5[11] * var29) >> 14;
            var16 = param5[8] * var26 + param5[6] * var24 + param5[7] * var25 >> 14;
            var18 = var23 * param5[11] + (param5[9] * var21 - -(param5[10] * var22)) >> 14;
            var14 = var28 * param5[4] + var27 * param5[3] - -(param5[5] * var29) >> 14;
            var21 = -param2[0] + param5[0];
            var22 = -param2[1] + param5[1];
            var23 = -param2[2] + param5[2];
            var9 = var22 * param2[4] + param2[3] * var21 - -(param2[5] * var23) >> -hb.field_l + 16;
            var11 = param2[10] * var22 + (param2[9] * var21 + var23 * param2[11]) >> 16;
            var10 = var22 * param2[7] + var21 * param2[6] + var23 * param2[8] >> 16 - hb.field_l;
            var21 = ob.field_b;
            var22 = ob.field_c;
            var23 = 0;
            L1: while (true) {
              if (~var23 <= ~param0.field_m) {
                L2: {
                  if (null == param0.field_Q) {
                    break L2;
                  } else {
                    if (param0.field_i == null) {
                      break L2;
                    } else {
                      if (param0.field_w == null) {
                        break L2;
                      } else {
                        if (param0.field_c == null) {
                          break L2;
                        } else {
                          if (null == param0.field_e) {
                            break L2;
                          } else {
                            if (param0.field_q == null) {
                              break L2;
                            } else {
                              if (param0.field_O == null) {
                                break L2;
                              } else {
                                if (null == param0.field_d) {
                                  break L2;
                                } else {
                                  if (param0.field_b == null) {
                                    break L2;
                                  } else {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (~param0.field_l >= ~var23) {
                                        break L2;
                                      } else {
                                        var24 = param0.field_Q[var23];
                                        var25 = param0.field_i[var23];
                                        var26 = param0.field_w[var23];
                                        ec.field_a[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var18 * var26) >> 16);
                                        dl.field_f[var23] = (var26 * var19 + (var24 * var13 + var25 * var16) >> 16) + var10;
                                        lm.field_a[var23] = (var26 * var20 + (var14 * var24 + var25 * var17) >> 16) + var11;
                                        var24 = param0.field_c[var23];
                                        var25 = param0.field_e[var23];
                                        var26 = param0.field_q[var23];
                                        ad.field_u[var23] = (var24 * var12 - (-(var15 * var25) + -(var18 * var26)) >> 16) + var9;
                                        nf.field_f[var23] = var10 - -(var24 * var13 + var16 * var25 - -(var26 * var19) >> 16);
                                        hj.field_J[var23] = (var17 * var25 + var24 * var14 + var26 * var20 >> 16) + var11;
                                        var24 = param0.field_O[var23];
                                        var25 = param0.field_d[var23];
                                        var26 = param0.field_b[var23];
                                        hl.field_c[var23] = (var25 * var15 + (var24 * var12 + var26 * var18) >> 16) + var9;
                                        pj.field_a[var23] = (var19 * var26 + (var25 * var16 + var24 * var13) >> 16) + var10;
                                        t.field_a[var23] = (var26 * var20 + var24 * var14 - -(var25 * var17) >> 16) + var11;
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
                L4: while (true) {
                  L5: {
                    if (var18 >= param0.field_o) {
                      break L5;
                    } else {
                      stackOut_59_0 = ~ph.field_m.length;
                      stackOut_59_1 = ~var18;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_61_1 = stackOut_59_1;
                      if (stackIn_61_0 >= stackIn_61_1) {
                        break L5;
                      } else {
                        var19 = param0.field_j[var18];
                        var20 = param0.field_P[var18];
                        var21 = param0.field_u[var18];
                        ph.field_m[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> 16;
                        k.field_e[var18] = var16 * var21 + var20 * var13 + var19 * var10 >> 16;
                        mg.field_p[var18] = var21 * var17 + var14 * var20 + var11 * var19 >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  int discarded$1 = 124;
                  ld.a(var8, false, param0, var7_int);
                  break L0;
                }
              } else {
                L6: {
                  var24 = param0.field_D[var23];
                  var25 = param0.field_B[var23];
                  var26 = param0.field_L[var23];
                  var27 = var9 + (var18 * var26 + (var15 * var25 + var12 * var24) >> 16 - hb.field_l);
                  var28 = var10 + (var24 * var13 + (var16 * var25 - -(var19 * var26)) >> 16 + -hb.field_l);
                  var29 = (var20 * var26 + (var25 * var17 + var14 * var24) >> 16) + var11;
                  if (var29 >= 50) {
                    L7: {
                      gm.field_l[var23] = var27 / var29 + var21;
                      nb.field_c[var23] = var28 / var29 + var22;
                      gd.field_e[var23] = var29;
                      if (var29 < var7_int) {
                        var7_int = var29;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (~var29 >= ~var8) {
                      break L6;
                    } else {
                      var8 = var29;
                      break L6;
                    }
                  } else {
                    gd.field_e[var23] = -2147483648;
                    break L6;
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
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("nd.C(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L8;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L8;
            }
          }
          L9: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44).append(1).append(44);
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L9;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L9;
            }
          }
          L10: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(44).append(37).append(44).append(0).append(44);
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param5 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L10;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + 0 + 41);
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            vc.field_c = je.a(5);
            jl.field_I = new d();
            qc.a(true, true, 106);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "nd.E(" + -11 + 41);
        }
    }

    final static boolean a(char param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0 < 65) {
                    break L3;
                  } else {
                    if (90 >= param0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param0 < 97) {
                    break L4;
                  } else {
                    if (param0 > 122) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "nd.A(" + param0 + 44 + 127 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final static void a() {
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
              int discarded$2 = -62;
              var1 = lk.c();
              mb.field_s = new uh(var1, (String) null, true, false, false);
              var2 = -1;
              jl.field_I.a((gl) (Object) bj.field_f, (byte) -1);
              bj.field_f.a((gl) (Object) mb.field_s, -67);
              bj.field_f.j(-2065096856);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1_ref, "nd.D(" + 25 + 41);
        }
    }

    nd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Equipment screen", "Select equipment group", "Equip buttons", "Soldier tabs", "Recruit button", "Primary weapon", "Armour", "Secondary weapon", "Grenades", "Portrait", "Health", "Speed", "Strength", "Firing accuracy", "Exit to mission select screen.", "On this screen you give your soldiers the latest equipment to fight the enemy. Take note of the strength bar, if it starts flashing, then the soldier is encumbered lowering their movement speed. Try giving the soldier smaller or fewer weapons. The basic pistol and jacket weigh nothing."};
        field_h = "Exit Equip Screen";
    }
}
