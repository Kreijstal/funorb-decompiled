/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mb {
    static ff field_b;
    private String field_c;
    private boolean field_a;

    final static sd a(int param0, int param1, byte param2, int param3, int param4) {
        sd var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        sd stackIn_8_0 = null;
        sd stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        sd stackOut_13_0 = null;
        sd stackOut_7_0 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5 = (sd) (Object) r.field_b.a((byte) 51);
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  var5 = new sd();
                  var5.field_l = param1;
                  var5.field_o = param0;
                  var5.field_k = param3;
                  if (param2 > 105) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                r.field_b.a((gg) (Object) var5, -7044);
                int discarded$1 = -24045;
                fi.a(var5, param4);
                stackOut_13_0 = (sd) var5;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                if (~var5.field_o == ~param0) {
                  stackOut_7_0 = (sd) var5;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  var5 = (sd) (Object) r.field_b.b(-123);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var5_ref, "mb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ud discarded$3 = ug.a((byte) -76, bf.field_b[param1], qc.field_l[param1] * param2 >> 9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "mb.F(" + true + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(uh param0, boolean param1, int[] param2, int[] param3, boolean param4, boolean param5, int param6) {
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
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
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
        var30 = SolKnight.field_L ? 1 : 0;
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
            var12 = var23 * param3[param6] + param3[3] * var21 - -(var22 * param3[4]) >> 14;
            var29 = param2[11] >> 2;
            var13 = param3[5] * var26 + (param3[4] * var25 + param3[3] * var24) >> 14;
            var17 = var29 * param3[8] + param3[7] * var28 + var27 * param3[6] >> 14;
            var15 = param3[6] * var21 - -(var22 * param3[7]) - -(param3[8] * var23) >> 14;
            var18 = param3[11] * var23 + param3[10] * var22 + var21 * param3[9] >> 14;
            var20 = param3[11] * var29 + (var28 * param3[10] + var27 * param3[9]) >> 14;
            var19 = param3[11] * var26 + (var25 * param3[10] + param3[9] * var24) >> 14;
            var16 = var26 * param3[8] + (var24 * param3[6] + param3[7] * var25) >> 14;
            var14 = param3[5] * var29 + var27 * param3[3] - -(var28 * param3[4]) >> 14;
            var21 = param3[0] + -param2[0];
            var22 = param3[1] - param2[1];
            var23 = -param2[2] + param3[2];
            var9 = var22 * param2[4] + (param2[3] * var21 - -(var23 * param2[5])) >> -pj.field_H + 16;
            var10 = var23 * param2[8] + param2[6] * var21 - -(var22 * param2[7]) >> -pj.field_H + 16;
            var11 = param2[11] * var23 + var22 * param2[10] + var21 * param2[9] >> 16;
            var21 = hk.field_f;
            var22 = hk.field_e;
            var23 = 0;
            L1: while (true) {
              if (var23 >= param0.field_y) {
                L2: {
                  if (null == param0.field_p) {
                    break L2;
                  } else {
                    if (null == param0.field_x) {
                      break L2;
                    } else {
                      if (param0.field_h == null) {
                        break L2;
                      } else {
                        if (null == param0.field_i) {
                          break L2;
                        } else {
                          if (null == param0.field_O) {
                            break L2;
                          } else {
                            if (null == param0.field_I) {
                              break L2;
                            } else {
                              if (null == param0.field_L) {
                                break L2;
                              } else {
                                if (null == param0.field_M) {
                                  break L2;
                                } else {
                                  if (param0.field_u == null) {
                                    break L2;
                                  } else {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (var23 >= param0.field_F) {
                                        break L2;
                                      } else {
                                        var24 = param0.field_p[var23];
                                        var25 = param0.field_x[var23];
                                        var26 = param0.field_h[var23];
                                        ng.field_b[var23] = var9 - -(var12 * var24 - -(var15 * var25) - -(var26 * var18) >> 16);
                                        hg.field_B[var23] = (var19 * var26 + (var24 * var13 - -(var16 * var25)) >> 16) + var10;
                                        cd.field_b[var23] = (var25 * var17 + (var24 * var14 + var20 * var26) >> 16) + var11;
                                        var24 = param0.field_i[var23];
                                        var25 = param0.field_O[var23];
                                        var26 = param0.field_I[var23];
                                        ab.field_A[var23] = var9 + (var26 * var18 + (var15 * var25 + var24 * var12) >> 16);
                                        aj.field_o[var23] = (var13 * var24 + (var25 * var16 - -(var26 * var19)) >> 16) + var10;
                                        pl.field_c[var23] = var11 + (var24 * var14 - (-(var25 * var17) + -(var26 * var20)) >> 16);
                                        var24 = param0.field_L[var23];
                                        var25 = param0.field_M[var23];
                                        var26 = param0.field_u[var23];
                                        fa.field_g[var23] = var9 - -(var25 * var15 + (var24 * var12 + var26 * var18) >> 16);
                                        ci.field_pb[var23] = (var16 * var25 + (var13 * var24 + var19 * var26) >> 16) + var10;
                                        pb.field_a[var23] = (var24 * var14 + (var25 * var17 + var26 * var20) >> 16) + var11;
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
                L4: {
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
                      if (param0.field_b <= var18) {
                        break L4;
                      } else {
                        stackOut_53_0 = ~var18;
                        stackOut_53_1 = ~mh.field_a.length;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        if (stackIn_55_0 <= stackIn_55_1) {
                          break L4;
                        } else {
                          var19 = param0.field_B[var18];
                          var20 = param0.field_v[var18];
                          var21 = param0.field_J[var18];
                          mh.field_a[var18] = var12 * var20 + var9 * var19 + var21 * var15 >> 16;
                          fa.field_e[var18] = var21 * var16 + var19 * var10 + var20 * var13 >> 16;
                          tk.field_r[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> 16;
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                jd.a(var8, false, false, param0, var7_int);
                break L0;
              } else {
                L6: {
                  var24 = param0.field_n[var23];
                  var25 = param0.field_q[var23];
                  var26 = param0.field_z[var23];
                  var27 = var9 + (var24 * var12 - (-(var25 * var15) - var18 * var26) >> -pj.field_H + 16);
                  var28 = var10 + (var24 * var13 - -(var16 * var25) + var19 * var26 >> 16 - pj.field_H);
                  var29 = var11 - -(var20 * var26 + var25 * var17 + var14 * var24 >> 16);
                  if (var29 < 50) {
                    hl.field_a[var23] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      qb.field_ab[var23] = var27 / var29 + var21;
                      a.field_d[var23] = var28 / var29 + var22;
                      if (~var8 <= ~var29) {
                        break L7;
                      } else {
                        var8 = var29;
                        break L7;
                      }
                    }
                    hl.field_a[var23] = var29;
                    if (var7_int <= var29) {
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
            stackOut_61_0 = (RuntimeException) var7;
            stackOut_61_1 = new StringBuilder().append("mb.D(");
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L8;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L8;
            }
          }
          L9: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(false).append(',');
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L9;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L9;
            }
          }
          L10: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L10;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L10;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param4 + ',' + false + ',' + param6 + ')');
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        o[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        o[] stackOut_3_0 = null;
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
            stackOut_3_0 = ug.a(param0, -8591, 1, param3, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var4, "mb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((mb) this).field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = ((mb) this).field_a;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "mb.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final String a(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
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
            stackOut_3_0 = ((mb) this).field_c;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "mb.C(" + param0 + ')');
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
                sd discarded$0 = mb.a(-113, -50, (byte) 55, 27, -105);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "mb.G(" + param0 + ')');
        }
    }

    mb(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ((mb) this).field_c = param0;
              if (((mb) this).field_c == null) {
                ((mb) this).field_c = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((mb) this).field_a = param1;
              if (((mb) this).field_c.length() == 0) {
                ((mb) this).field_a = false;
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
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("mb.<init>(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ff(11, 0, 1, 2);
    }
}
