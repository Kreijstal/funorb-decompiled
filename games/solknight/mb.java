/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static ff field_b;
    private String field_c;
    private boolean field_a;

    final static sd a(int param0, int param1, byte param2, int param3, int param4) {
        sd var5 = null;
        int var6 = 0;
        sd stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        sd stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5 = (sd) ((Object) r.field_b.a((byte) 51));
            L1: while (true) {
              L2: {
                if (var5 == null) {
                  var5 = new sd();
                  var5.field_l = param1;
                  var5.field_o = param0;
                  var5.field_k = param3;
                  stackIn_12_0 = param2;
                  stackIn_12_1 = 105;
                  break L2;
                } else {
                  stackIn_12_0 = var5.field_o ^ -1;

                  stackIn_12_1 = param0 ^ -1;

                  if (stackIn_12_0 == stackIn_12_1) {
                    stackIn_9_0 = (sd) (var5);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var5 = (sd) ((Object) r.field_b.b(-123));
                    continue L1;
                  }
                }
              }
              L3: {
                if (stackIn_12_0 > stackIn_12_1) {
                  break L3;
                } else {
                  field_b = (ff) null;
                  break L3;
                }
              }
              r.field_b.a(var5, -7044);
              fi.a(var5, param4, -24045);
              stackIn_16_0 = (sd) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var5_ref), "mb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        try {
            ug.a((byte) -76, bf.field_b[param1], qc.field_l[param1] * param2 >> -613042327);
            if (!param0) {
                field_b = (ff) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "mb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(uh param0, boolean param1, int[] param2, int[] param3, boolean param4, boolean param5, int param6) {
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
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
        var30 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param2[3] >> 2125712226;
            var22 = param2[4] >> -1704795422;
            var23 = param2[5] >> 672611586;
            var24 = param2[6] >> 1916375586;
            var25 = param2[7] >> 280135106;
            var26 = param2[8] >> 1204802754;
            var27 = param2[9] >> 1382796034;
            var28 = param2[10] >> -1954958462;
            var12 = var23 * param3[param6] + param3[3] * var21 - -(var22 * param3[4]) >> -694484242;
            var29 = param2[11] >> -1716993790;
            var13 = param3[5] * var26 + (param3[4] * var25 + param3[3] * var24) >> 472493806;
            var17 = var29 * param3[8] + param3[7] * var28 + var27 * param3[6] >> 517022254;
            var15 = param3[6] * var21 - -(var22 * param3[7]) - -(param3[8] * var23) >> 1512010030;
            var18 = param3[11] * var23 + param3[10] * var22 + var21 * param3[9] >> 1320737678;
            var20 = param3[11] * var29 + (var28 * param3[10] + var27 * param3[9]) >> -604474514;
            var19 = param3[11] * var26 + (var25 * param3[10] + param3[9] * var24) >> 1824446542;
            var16 = var26 * param3[8] + (var24 * param3[6] + param3[7] * var25) >> -582515794;
            var14 = param3[5] * var29 + var27 * param3[3] - -(var28 * param3[4]) >> 1223073134;
            var21 = param3[0] + -param2[0];
            var22 = param3[1] - param2[1];
            var23 = -param2[2] + param3[2];
            var9 = var22 * param2[4] + (param2[3] * var21 - -(var23 * param2[5])) >> -pj.field_H + 16;
            var10 = var23 * param2[8] + param2[6] * var21 - -(var22 * param2[7]) >> -pj.field_H + 16;
            var11 = param2[11] * var23 + var22 * param2[10] + var21 * param2[9] >> -373387952;
            var21 = hk.field_f;
            var22 = hk.field_e;
            var23 = 0;
            L1: while (true) {
              L2: {
                if (var23 >= param0.field_y) {
                  L3: {
                    if (null == param0.field_p) {
                      break L3;
                    } else {
                      if (null == param0.field_x) {
                        break L3;
                      } else {
                        if (param0.field_h == null) {
                          break L3;
                        } else {
                          if (null == param0.field_i) {
                            break L3;
                          } else {
                            if (null == param0.field_O) {
                              break L3;
                            } else {
                              if (null == param0.field_I) {
                                break L3;
                              } else {
                                if (null == param0.field_L) {
                                  break L3;
                                } else {
                                  if (null == param0.field_M) {
                                    break L3;
                                  } else {
                                    if (param0.field_u == null) {
                                      break L3;
                                    } else {
                                      var23 = 0;
                                      L4: while (true) {
                                        if (var23 >= param0.field_F) {
                                          break L3;
                                        } else {
                                          var24 = param0.field_p[var23];
                                          var25 = param0.field_x[var23];
                                          var26 = param0.field_h[var23];
                                          ng.field_b[var23] = var9 - -(var12 * var24 - -(var15 * var25) - -(var26 * var18) >> 958944272);
                                          hg.field_B[var23] = (var19 * var26 + (var24 * var13 - -(var16 * var25)) >> -695032752) + var10;
                                          cd.field_b[var23] = (var25 * var17 + (var24 * var14 + var20 * var26) >> -551299376) + var11;
                                          var24 = param0.field_i[var23];
                                          var25 = param0.field_O[var23];
                                          var26 = param0.field_I[var23];
                                          ab.field_A[var23] = var9 + (var26 * var18 + (var15 * var25 + var24 * var12) >> -214451472);
                                          aj.field_o[var23] = (var13 * var24 + (var25 * var16 - -(var26 * var19)) >> -653712112) + var10;
                                          pl.field_c[var23] = var11 + (var24 * var14 - (-(var25 * var17) + -(var26 * var20)) >> -1421785616);
                                          var24 = param0.field_L[var23];
                                          var25 = param0.field_M[var23];
                                          var26 = param0.field_u[var23];
                                          fa.field_g[var23] = var9 - -(var25 * var15 + (var24 * var12 + var26 * var18) >> 66425104);
                                          ci.field_pb[var23] = (var16 * var25 + (var13 * var24 + var19 * var26) >> -1444672816) + var10;
                                          pb.field_a[var23] = (var24 * var14 + (var25 * var17 + var26 * var20) >> 845614384) + var11;
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
                  if (param4) {
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
                      stackIn_54_0 = param0.field_b;
                      stackIn_54_1 = var18;
                      if (stackIn_54_0 <= stackIn_54_1) {
                        break L2;
                      } else {
                        stackIn_57_0 = var18 ^ -1;
                        stackIn_57_1 = mh.field_a.length ^ -1;
                        if (stackIn_57_0 <= stackIn_57_1) {
                          break L2;
                        } else {
                          var19 = param0.field_B[var18];
                          var20 = param0.field_v[var18];
                          var21 = param0.field_J[var18];
                          mh.field_a[var18] = var12 * var20 + var9 * var19 + var21 * var15 >> 1729509936;
                          fa.field_e[var18] = var21 * var16 + var19 * var10 + var20 * var13 >> -29012752;
                          tk.field_r[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> -557878896;
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  var24 = param0.field_n[var23];
                  var25 = param0.field_q[var23];
                  var26 = param0.field_z[var23];
                  var27 = var9 + (var24 * var12 - (-(var25 * var15) - var18 * var26) >> -pj.field_H + 16);
                  var28 = var10 + (var24 * var13 - -(var16 * var25) + var19 * var26 >> 16 - pj.field_H);
                  var29 = var11 - -(var20 * var26 + var25 * var17 + var14 * var24 >> -443971504);
                  stackIn_54_0 = -51;

                  stackIn_54_1 = var29 ^ -1;

                  L7: {
                    if (stackIn_54_0 < stackIn_54_1) {
                      hl.field_a[var23] = -2147483648;
                      break L7;
                    } else {
                      L8: {
                        qb.field_ab[var23] = var27 / var29 + var21;
                        a.field_d[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) <= (var29 ^ -1)) {
                          break L8;
                        } else {
                          var8 = var29;
                          break L8;
                        }
                      }
                      hl.field_a[var23] = var29;
                      if (var7_int <= var29) {
                        break L7;
                      } else {
                        var7_int = var29;
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (!param1) {
                      break L9;
                    } else {
                      ig.field_D[var23] = var27 >> pj.field_H;
                      ob.field_m[var23] = var28 >> pj.field_H;
                      hf.field_b[var23] = var29;
                      break L9;
                    }
                  }
                  var23++;
                  continue L1;
                }
              }
              jd.a(var8, false, param5, param0, var7_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var7);

            stackIn_66_1 = new StringBuilder().append("mb.D(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L10;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L11;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param3 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L12;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L12;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_67_0), stackIn_75_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        o[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 4) {
                break L1;
              } else {
                mb.b(-114);
                break L1;
              }
            }
            stackIn_4_0 = ug.a(param0, -8591, 1, param3, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var4), "mb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_c = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "mb.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final String a(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 34) {
                break L1;
              } else {
                mb.a((uh) null, false, (int[]) null, (int[]) null, false, false, -8);
                break L1;
              }
            }
            stackIn_4_0 = this.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "mb.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    mb(String param0) {
        this(param0, false);
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != -694484242) {
                mb.a(-113, -50, (byte) 55, 27, -105);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "mb.G(" + param0 + ')');
        }
    }

    mb(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (this.field_c == null) {
                this.field_c = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_a = param1;
              if (-1 == (this.field_c.length() ^ -1)) {
                this.field_a = false;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("mb.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new ff(11, 0, 1, 2);
    }
}
