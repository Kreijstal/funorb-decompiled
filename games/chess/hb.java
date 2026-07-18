/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static km[][] field_b;
    static ci field_a;

    final static jd[] a(int param0) {
        RuntimeException var1 = null;
        jd[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        jd[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            stackOut_3_0 = new jd[]{ph.field_g, le.field_g, dn.field_f};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "hb.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "hb.C(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1, byte param2, int[] param3, boolean param4, em param5, boolean param6) {
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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var30 = Chess.field_G;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 2;
              var22 = param1[4] >> 2;
              var23 = param1[5] >> 2;
              var24 = param1[6] >> 2;
              var25 = param1[7] >> 2;
              var26 = param1[8] >> 2;
              var27 = param1[9] >> 2;
              var28 = param1[10] >> 2;
              var29 = param1[11] >> 2;
              var13 = var26 * param3[5] + (param3[3] * var24 - -(var25 * param3[4])) >> 14;
              var12 = var23 * param3[5] + (param3[4] * var22 + var21 * param3[3]) >> 14;
              var17 = var29 * param3[8] + param3[7] * var28 + param3[6] * var27 >> 14;
              var15 = param3[6] * var21 - (-(param3[7] * var22) + -(var23 * param3[8])) >> 14;
              var18 = param3[10] * var22 + (var21 * param3[9] + param3[11] * var23) >> 14;
              var19 = param3[11] * var26 + var24 * param3[9] - -(var25 * param3[10]) >> 14;
              var14 = param3[4] * var28 + var27 * param3[3] + param3[5] * var29 >> 14;
              var16 = param3[6] * var24 - -(param3[7] * var25) - -(var26 * param3[8]) >> 14;
              if (param2 == -98) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var20 = var28 * param3[10] + (var27 * param3[9] - -(param3[11] * var29)) >> 14;
            var21 = param3[0] - param1[0];
            var22 = param3[1] + -param1[1];
            var23 = -param1[2] + param3[2];
            var9 = var23 * param1[5] + (var22 * param1[4] + param1[3] * var21) >> 16 + -pd.field_Tb;
            var10 = param1[6] * var21 - (-(var22 * param1[7]) + -(var23 * param1[8])) >> 16 - pd.field_Tb;
            var11 = param1[9] * var21 - -(param1[10] * var22) + var23 * param1[11] >> 16;
            var21 = nh.field_n;
            var22 = nh.field_f;
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var23 <= ~param5.field_d) {
                    break L4;
                  } else {
                    var24 = param5.field_z[var23];
                    var25 = param5.field_a[var23];
                    var26 = param5.field_H[var23];
                    var27 = (var25 * var15 + (var24 * var12 + var18 * var26) >> 16 - pd.field_Tb) + var9;
                    var28 = var10 - -(var16 * var25 + (var13 * var24 + var26 * var19) >> -pd.field_Tb + 16);
                    var29 = (var26 * var20 + (var24 * var14 - -(var25 * var17)) >> 16) + var11;
                    stackOut_6_0 = ~var29;
                    stackOut_6_1 = -51;
                    stackIn_63_0 = stackOut_6_0;
                    stackIn_63_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var30 != 0) {
                      L5: while (true) {
                        if (stackIn_63_0 <= stackIn_63_1) {
                          break L3;
                        } else {
                          if (~lk.field_c.length >= ~var18) {
                            break L3;
                          } else {
                            var19 = param5.field_b[var18];
                            var20 = param5.field_f[var18];
                            var21 = param5.field_F[var18];
                            lk.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
                            ab.field_r[var18] = var19 * var10 - -(var20 * var13) - -(var16 * var21) >> 16;
                            pa.field_o[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> 16;
                            var18++;
                            if (var30 == 0) {
                              stackOut_62_0 = ~var18;
                              stackOut_62_1 = ~param5.field_t;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              continue L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_7_0 > stackIn_7_1) {
                            break L7;
                          } else {
                            L8: {
                              qm.field_c[var23] = var27 / var29 + var21;
                              tc.field_w[var23] = var28 / var29 + var22;
                              jd.field_i[var23] = var29;
                              if (var29 < var7_int) {
                                var7_int = var29;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (~var29 < ~var8) {
                              var8 = var29;
                              if (var30 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        jd.field_i[var23] = -2147483648;
                        break L6;
                      }
                      L9: {
                        if (!param0) {
                          break L9;
                        } else {
                          ve.field_Gb[var23] = var27 >> pd.field_Tb;
                          ob.field_u[var23] = var28 >> pd.field_Tb;
                          qi.field_p[var23] = var29;
                          break L9;
                        }
                      }
                      var23++;
                      if (var30 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L10: {
                  L11: {
                    if (param5.field_q == null) {
                      break L11;
                    } else {
                      if (null == param5.field_Q) {
                        break L11;
                      } else {
                        if (param5.field_w == null) {
                          break L11;
                        } else {
                          if (null == param5.field_h) {
                            break L11;
                          } else {
                            if (param5.field_L == null) {
                              break L11;
                            } else {
                              if (null == param5.field_u) {
                                break L11;
                              } else {
                                if (param5.field_p == null) {
                                  break L11;
                                } else {
                                  if (null == param5.field_D) {
                                    break L11;
                                  } else {
                                    if (null == param5.field_s) {
                                      break L11;
                                    } else {
                                      var23 = 0;
                                      L12: while (true) {
                                        if (~var23 <= ~param5.field_e) {
                                          break L11;
                                        } else {
                                          var24 = param5.field_q[var23];
                                          var25 = param5.field_Q[var23];
                                          var26 = param5.field_w[var23];
                                          wj.field_d[var23] = (var25 * var15 + var24 * var12 + var26 * var18 >> 16) + var9;
                                          he.field_Gb[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> 16) + var10;
                                          qh.field_e[var23] = var11 + (var25 * var17 + var24 * var14 + var20 * var26 >> 16);
                                          var24 = param5.field_h[var23];
                                          var25 = param5.field_L[var23];
                                          var26 = param5.field_u[var23];
                                          db.field_n[var23] = var9 + (var26 * var18 + (var15 * var25 + var12 * var24) >> 16);
                                          t.field_M[var23] = var10 - -(var26 * var19 + var24 * var13 - -(var16 * var25) >> 16);
                                          uc.field_e[var23] = var11 + (var25 * var17 + (var24 * var14 - -(var26 * var20)) >> 16);
                                          var24 = param5.field_p[var23];
                                          var25 = param5.field_D[var23];
                                          var26 = param5.field_s[var23];
                                          l.field_n[var23] = var9 - -(var26 * var18 + (var12 * var24 - -(var15 * var25)) >> 16);
                                          wk.field_d[var23] = var10 + (var26 * var19 + var13 * var24 + var25 * var16 >> 16);
                                          ld.field_p[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L10;
                                          } else {
                                            if (var30 == 0) {
                                              continue L12;
                                            } else {
                                              break L11;
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
                    break L10;
                  } else {
                    break L3;
                  }
                }
                var18 = 0;
                L13: while (true) {
                  stackOut_62_0 = ~var18;
                  stackOut_62_1 = ~param5.field_t;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  if (stackIn_63_0 <= stackIn_63_1) {
                    break L3;
                  } else {
                    if (~lk.field_c.length >= ~var18) {
                      break L3;
                    } else {
                      var19 = param5.field_b[var18];
                      var20 = param5.field_f[var18];
                      var21 = param5.field_F[var18];
                      lk.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
                      ab.field_r[var18] = var19 * var10 - -(var20 * var13) - -(var16 * var21) >> 16;
                      pa.field_o[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> 16;
                      var18++;
                      if (var30 == 0) {
                        continue L13;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ja.a(param5, var8, (byte) -100, var7_int, param4);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("hb.D(").append(param0).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L14;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L14;
            }
          }
          L15: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',');
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L15;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L15;
            }
          }
          L16: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param4).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param5 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L16;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L16;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ',' + param6 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == -118) {
              hc.field_b = param0;
              uk.a(false, 12);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("hb.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new km[2][7];
    }
}
