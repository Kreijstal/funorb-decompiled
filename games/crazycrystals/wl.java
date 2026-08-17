/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends ij {
    volatile boolean field_n;
    boolean field_q;
    boolean field_l;
    static volatile boolean field_m;
    static dl[][] field_p;
    static dl field_o;

    abstract byte[] e(int param0);

    final static void a(int[] param0, jg param1, int param2, boolean param3, boolean param4, int[] param5, boolean param6) {
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
        var30 = CrazyCrystals.field_B;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 615365666;
            var22 = param0[4] >> -1262587006;
            var23 = param0[5] >> -1689253854;
            var24 = param0[6] >> 1914335394;
            var25 = param0[7] >> -1266327134;
            var26 = param0[8] >> 1636657730;
            var27 = param0[9] >> 306658402;
            var28 = param0[10] >> -682360990;
            var12 = param5[5] * var23 + param5[4] * var22 + param5[3] * var21 >> -555744658;
            var29 = param0[11] >> -930642174;
            var13 = param5[3] * var24 + (var25 * param5[4] + var26 * param5[5]) >> -528187474;
            var14 = var29 * param5[5] + (param5[3] * var27 - -(param5[4] * var28)) >> -1052548178;
            var20 = var29 * param5[11] + param5[10] * var28 + param5[9] * var27 >> 921819566;
            var19 = var24 * param5[param2] - (-(var25 * param5[10]) + -(param5[11] * var26)) >> -718140338;
            var16 = param5[8] * var26 + var25 * param5[7] + param5[6] * var24 >> 744916718;
            var18 = param5[9] * var21 - (-(var22 * param5[10]) - param5[11] * var23) >> -554072082;
            var17 = var29 * param5[8] + (var27 * param5[6] - -(var28 * param5[7])) >> 513061518;
            var15 = var21 * param5[6] - -(var22 * param5[7]) + param5[8] * var23 >> 240954094;
            var21 = -param0[0] + param5[0];
            var22 = param5[1] + -param0[1];
            var23 = param5[2] - param0[2];
            var9 = var23 * param0[5] + (var21 * param0[3] + var22 * param0[4]) >> 16 + -li.field_c;
            var11 = param0[9] * var21 + (param0[10] * var22 - -(var23 * param0[11])) >> 126615088;
            var10 = var23 * param0[8] + param0[6] * var21 - -(var22 * param0[7]) >> 16 - li.field_c;
            var21 = nb.field_h;
            var22 = nb.field_f;
            var23 = 0;
            L1: while (true) {
              L2: {
                if ((var23 ^ -1) <= (param1.field_n ^ -1)) {
                  L3: {
                    if (param1.field_P == null) {
                      break L3;
                    } else {
                      if (null == param1.field_f) {
                        break L3;
                      } else {
                        if (null == param1.field_H) {
                          break L3;
                        } else {
                          if (null == param1.field_q) {
                            break L3;
                          } else {
                            if (param1.field_d == null) {
                              break L3;
                            } else {
                              if (param1.field_M == null) {
                                break L3;
                              } else {
                                if (null == param1.field_z) {
                                  break L3;
                                } else {
                                  if (param1.field_m == null) {
                                    break L3;
                                  } else {
                                    if (param1.field_y == null) {
                                      break L3;
                                    } else {
                                      var23 = 0;
                                      L4: while (true) {
                                        if (param1.field_I <= var23) {
                                          break L3;
                                        } else {
                                          var24 = param1.field_P[var23];
                                          var25 = param1.field_f[var23];
                                          var26 = param1.field_H[var23];
                                          qa.field_i[var23] = (var12 * var24 - (-(var15 * var25) + -(var18 * var26)) >> 509343088) + var9;
                                          fh.field_k[var23] = var10 - -(var25 * var16 + var24 * var13 + var19 * var26 >> 2066575664);
                                          vg.field_b[var23] = (var14 * var24 - (-(var17 * var25) - var26 * var20) >> -309041808) + var11;
                                          var24 = param1.field_q[var23];
                                          var25 = param1.field_d[var23];
                                          var26 = param1.field_M[var23];
                                          ol.field_C[var23] = (var15 * var25 + (var12 * var24 + var26 * var18) >> -461125008) + var9;
                                          ud.field_bb[var23] = (var24 * var13 - -(var16 * var25) + var26 * var19 >> 1791169712) + var10;
                                          ol.field_y[var23] = var11 - -(var26 * var20 + var14 * var24 - -(var17 * var25) >> 480374288);
                                          var24 = param1.field_z[var23];
                                          var25 = param1.field_m[var23];
                                          var26 = param1.field_y[var23];
                                          hp.field_q[var23] = (var18 * var26 + var25 * var15 + var24 * var12 >> 1618610608) + var9;
                                          vf.field_e[var23] = var10 + (var25 * var16 + (var13 * var24 - -(var19 * var26)) >> -100825200);
                                          d.field_a[var23] = (var25 * var17 + var24 * var14 - -(var26 * var20) >> -314336432) + var11;
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
                  if (param6) {
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
                    L5: while (true) {
                      stackIn_60_0 = var18;
                      stackIn_60_1 = param1.field_D;
                      if (stackIn_60_0 >= stackIn_60_1) {
                        break L2;
                      } else {
                        if ((cf.field_b.length ^ -1) >= (var18 ^ -1)) {
                          break L2;
                        } else {
                          var19 = param1.field_a[var18];
                          var20 = param1.field_N[var18];
                          var21 = param1.field_u[var18];
                          cf.field_b[var18] = var15 * var21 + var12 * var20 + var9 * var19 >> -1825066064;
                          jp.field_a[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> -861936144;
                          vm.field_d[var18] = var19 * var11 - (-(var14 * var20) + -(var21 * var17)) >> -348251376;
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  var24 = param1.field_L[var23];
                  var25 = param1.field_G[var23];
                  var26 = param1.field_b[var23];
                  var27 = (var15 * var25 + var12 * var24 - -(var26 * var18) >> 16 + -li.field_c) + var9;
                  var28 = var10 - -(var19 * var26 + var25 * var16 + var13 * var24 >> 16 + -li.field_c);
                  var29 = var11 + (var26 * var20 + var14 * var24 + var25 * var17 >> -933789936);
                  stackIn_60_0 = var29 ^ -1;

                  stackIn_60_1 = -51;

                  L7: {
                    if (stackIn_60_0 <= stackIn_60_1) {
                      L8: {
                        dn.field_a[var23] = var21 - -(var27 / var29);
                        qk.field_E[var23] = var28 / var29 + var22;
                        cf.field_g[var23] = var29;
                        if (var29 > var8) {
                          var8 = var29;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if ((var29 ^ -1) > (var7_int ^ -1)) {
                        var7_int = var29;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      cf.field_g[var23] = -2147483648;
                      break L7;
                    }
                  }
                  L9: {
                    if (param3) {
                      gl.field_d[var23] = var27 >> li.field_c;
                      qm.field_q[var23] = var28 >> li.field_c;
                      ff.field_b[var23] = var29;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var23++;
                  continue L1;
                }
              }
              ok.a(param1, var7_int, (byte) -119, param4, var8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("wl.K(");

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


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param1 == null) {
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


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_71_0), stackIn_79_2 + ',' + param6 + ')');
        }
    }

    wl() {
        this.field_n = true;
    }

    final static dl[] a(int param0, int param1, db param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        dl[] stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 53) {
                break L1;
              } else {
                wl.a((byte) 54);
                break L1;
              }
            }
            if (gm.a(param2, param0, true, param1)) {
              stackIn_7_0 = mm.a(71);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("wl.J(").append(param0).append(',').append(param1).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dl[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final static int[] a(byte param0) {
        RuntimeException var1 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -26) {
                break L1;
              } else {
                field_m = false;
                break L1;
              }
            }
            stackIn_4_0 = new int[8];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wl.L(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              sm.field_j = (63 & param1) >> -1492213148;
              j.field_j = (param1 & 13) >> 177883554;
              if (-3 > (sm.field_j ^ -1)) {
                sm.field_j = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-3 <= (j.field_j ^ -1)) {
                break L2;
              } else {
                j.field_j = 2;
                break L2;
              }
            }
            L3: {
              no.field_m = 3 & param1;
              if ((no.field_m ^ -1) >= -3) {
                break L3;
              } else {
                no.field_m = 2;
                break L3;
              }
            }
            L4: {
              if (param0 == 7) {
                break L4;
              } else {
                field_o = (dl) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "wl.N(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_p = (dl[][]) null;
            field_o = null;
            if (param0 >= -38) {
                wl.a((byte) 90);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "wl.M(" + param0 + ')');
        }
    }

    abstract int b(byte param0);

    final static dl a(String param0, db param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dl stackIn_2_0 = null;
        dl stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a(param3, -1);
            if (param2 == 10) {
              var5 = param1.a(-2862, param0, var4_int);
              stackIn_4_0 = sj.a(var5, var4_int, param1, 28);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (dl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("wl.O(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_m = false;
    }
}
