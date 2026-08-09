/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static ve field_b;

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (-225 >= (tg.field_e ^ -1)) {
                pk.b(param0 + 95, 256);
                break L2;
              } else {
                var1_int = tg.field_e % 32;
                pk.b(param0 + 104, 32 + tg.field_e + -var1_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ti.G(" + param0 + ')');
        }
    }

    final static void a(boolean param0, r param1, int param2, r param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              fm.a(lk.field_a, fm.field_e, ca.field_f, ol.field_H, 12895, kb.field_c, rq.field_t, param0, ee.field_b, ja.field_e, ip.field_a, pn.field_N);
              kb.field_d = gk.a(param1, "lobby", "chatfilter", true);
              ba.field_f[1] = uo.field_j;
              ba.field_f[2] = vg.field_a;
              if (param2 == 4) {
                break L1;
              } else {
                field_b = (ve) null;
                break L1;
              }
            }
            ba.field_f[0] = lo.field_g;
            rq.a(li.field_e, param2 + -2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ti.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -33) {
                break L1;
              } else {
                ti.a((byte) -39);
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
                  if ((ea.field_g + aj.field_h ^ -1) < (qf.field_b ^ -1)) {
                    stackIn_13_0 = as.field_a;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_15_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ti.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return (String) ((Object) stackIn_15_0);
        }
    }

    final static void c(int param0) {
        try {
            kk.b((byte) 112);
            if (param0 > -83) {
                field_b = (ve) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ti.F(" + param0 + ')');
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
            throw wn.a((Throwable) ((Object) runtimeException), "ti.B(" + param0 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param0 ^ -1) <= -1) {
              if (!param1) {
                if (-1583 >= (param0 ^ -1)) {
                  if (-1 != (param0 % 4 ^ -1)) {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param0 % 100 ^ -1) == -1) {
                      if (param0 % 400 == 0) {
                        stackIn_31_0 = 1;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackIn_29_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_26_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L1: {
                    if (param0 % 4 != 0) {
                      stackIn_18_0 = 0;
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L2: {
                if (((1 + param0) % 4 ^ -1) != -1) {
                  stackIn_7_0 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "ti.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_26_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0 != 0;
                  } else {
                    return stackIn_31_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int[] param0, byte param1, boolean param2, boolean param3, boolean param4, int[] param5, jp param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
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
        var30 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param5[3] >> -2087942206;
            var22 = param5[4] >> 783795650;
            var23 = param5[5] >> 221545314;
            var24 = param5[6] >> 1155449762;
            var25 = param5[7] >> -547134078;
            var26 = param5[8] >> 186874978;
            var27 = param5[9] >> -226561118;
            var28 = param5[10] >> -1942384606;
            var13 = param0[5] * var26 + (var25 * param0[4] + var24 * param0[3]) >> -1936077266;
            var29 = param5[11] >> -235924254;
            var12 = param0[5] * var23 + (param0[4] * var22 + param0[3] * var21) >> 1471335982;
            var14 = var29 * param0[5] + var28 * param0[4] + param0[3] * var27 >> 1737233870;
            var18 = param0[11] * var23 + (param0[9] * var21 + var22 * param0[10]) >> -2057639954;
            var16 = var26 * param0[8] + param0[7] * var25 + param0[6] * var24 >> -776363410;
            var15 = param0[7] * var22 + param0[6] * var21 - -(var23 * param0[8]) >> -503564946;
            var19 = param0[11] * var26 + (param0[10] * var25 + param0[9] * var24) >> -1040748274;
            var17 = param0[6] * var27 - (-(param0[7] * var28) - param0[8] * var29) >> -428104402;
            var20 = var28 * param0[10] + (param0[9] * var27 - -(var29 * param0[11])) >> -936021042;
            var21 = param0[0] + -param5[0];
            var22 = param0[1] - param5[1];
            var23 = -param5[2] + param0[2];
            var9 = var23 * param5[5] + param5[3] * var21 + var22 * param5[4] >> -hi.field_j + 16;
            var10 = param5[8] * var23 + (param5[6] * var21 - -(var22 * param5[7])) >> -hi.field_j + 16;
            var11 = param5[11] * var23 + param5[9] * var21 + var22 * param5[10] >> -1110847728;
            var21 = oo.field_l;
            if (param1 == -53) {
              var22 = oo.field_e;
              var23 = 0;
              L1: while (true) {
                L2: {
                  if (var23 >= param6.field_F) {
                    L3: {
                      if (param6.field_A == null) {
                        break L3;
                      } else {
                        if (null == param6.field_z) {
                          break L3;
                        } else {
                          if (null == param6.field_y) {
                            break L3;
                          } else {
                            if (param6.field_s == null) {
                              break L3;
                            } else {
                              if (null == param6.field_l) {
                                break L3;
                              } else {
                                if (param6.field_v == null) {
                                  break L3;
                                } else {
                                  if (param6.field_f == null) {
                                    break L3;
                                  } else {
                                    if (null == param6.field_b) {
                                      break L3;
                                    } else {
                                      if (param6.field_M != null) {
                                        var23 = 0;
                                        L4: while (true) {
                                          if ((var23 ^ -1) <= (param6.field_w ^ -1)) {
                                            break L3;
                                          } else {
                                            var24 = param6.field_A[var23];
                                            var25 = param6.field_z[var23];
                                            var26 = param6.field_y[var23];
                                            fq.field_b[var23] = var9 - -(var26 * var18 + var24 * var12 + var25 * var15 >> 1596584144);
                                            fd.field_t[var23] = var10 + (var16 * var25 + (var24 * var13 + var19 * var26) >> 886384080);
                                            wq.field_G[var23] = var11 - -(var26 * var20 + var25 * var17 + var24 * var14 >> 620296912);
                                            var24 = param6.field_s[var23];
                                            var25 = param6.field_l[var23];
                                            var26 = param6.field_v[var23];
                                            jb.field_H[var23] = var9 - -(var26 * var18 + (var12 * var24 + var25 * var15) >> 665377648);
                                            fh.field_u[var23] = var10 - -(var24 * var13 - (-(var25 * var16) + -(var26 * var19)) >> -1612684720);
                                            ek.field_y[var23] = (var20 * var26 + (var17 * var25 + var14 * var24) >> -484880144) + var11;
                                            var24 = param6.field_f[var23];
                                            var25 = param6.field_b[var23];
                                            var26 = param6.field_M[var23];
                                            ne.field_O[var23] = var9 + (var18 * var26 + var12 * var24 - -(var15 * var25) >> -348875920);
                                            mg.field_J[var23] = var10 - -(var13 * var24 + (var16 * var25 - -(var19 * var26)) >> 1477690096);
                                            nf.field_u[var23] = (var26 * var20 + var14 * var24 - -(var25 * var17) >> -635184464) + var11;
                                            var23++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        break L3;
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
                      var18 = 0;
                      L5: while (true) {
                        stackIn_60_0 = param6.field_K ^ -1;
                        stackIn_60_1 = var18 ^ -1;
                        if (stackIn_60_0 >= stackIn_60_1) {
                          break L2;
                        } else {
                          if (var18 >= pk.field_w.length) {
                            break L2;
                          } else {
                            var19 = param6.field_h[var18];
                            var20 = param6.field_O[var18];
                            var21 = param6.field_a[var18];
                            pk.field_w[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 1877238544;
                            dp.field_A[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> -1660776304;
                            dh.field_d[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 1910521392;
                            var18++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    var24 = param6.field_I[var23];
                    var25 = param6.field_r[var23];
                    var26 = param6.field_m[var23];
                    var27 = (var26 * var18 + var15 * var25 + var12 * var24 >> 16 - hi.field_j) + var9;
                    var28 = var10 - -(var13 * var24 - -(var25 * var16) + var19 * var26 >> 16 - hi.field_j);
                    var29 = var11 + (var20 * var26 + var25 * var17 + var14 * var24 >> 515014576);
                    stackIn_60_0 = 50;

                    stackIn_60_1 = var29;

                    L7: {
                      if (stackIn_60_0 > stackIn_60_1) {
                        pk.field_v[var23] = -2147483648;
                        break L7;
                      } else {
                        L8: {
                          nj.field_a[var23] = var27 / var29 + var21;
                          ml.field_t[var23] = var22 + var28 / var29;
                          pk.field_v[var23] = var29;
                          if (var8 < var29) {
                            var8 = var29;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (var29 >= var7_int) {
                          break L7;
                        } else {
                          var7_int = var29;
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (!param3) {
                        break L9;
                      } else {
                        te.field_F[var23] = var27 >> hi.field_j;
                        fa.field_u[var23] = var28 >> hi.field_j;
                        ea.field_h[var23] = var29;
                        break L9;
                      }
                    }
                    var23++;
                    continue L1;
                  }
                }
                wl.a(param6, param2, var7_int, 112, var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("ti.A(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L10;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L11;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');

            if (param6 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L12;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L12;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_71_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Invite";
        field_b = new ve(4, 1, 1, 1);
    }
}
