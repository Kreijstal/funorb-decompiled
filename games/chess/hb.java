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
          throw fk.a((Throwable) (Object) var1, "hb.B(" + param0 + 41);
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
            throw fk.a((Throwable) (Object) runtimeException, "hb.C(" + param0 + 41);
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
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
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
              if (~var23 <= ~param5.field_d) {
                L3: {
                  if (param5.field_q == null) {
                    break L3;
                  } else {
                    if (null == param5.field_Q) {
                      break L3;
                    } else {
                      if (param5.field_w == null) {
                        break L3;
                      } else {
                        if (null == param5.field_h) {
                          break L3;
                        } else {
                          if (param5.field_L == null) {
                            break L3;
                          } else {
                            if (null == param5.field_u) {
                              break L3;
                            } else {
                              if (param5.field_p == null) {
                                break L3;
                              } else {
                                if (null == param5.field_D) {
                                  break L3;
                                } else {
                                  if (null == param5.field_s) {
                                    break L3;
                                  } else {
                                    var23 = 0;
                                    L4: while (true) {
                                      if (~var23 <= ~param5.field_e) {
                                        break L3;
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
                    L6: while (true) {
                      if (~var18 <= ~param5.field_t) {
                        break L5;
                      } else {
                        if (~lk.field_c.length >= ~var18) {
                          break L5;
                        } else {
                          var19 = param5.field_b[var18];
                          var20 = param5.field_f[var18];
                          var21 = param5.field_F[var18];
                          lk.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
                          ab.field_r[var18] = var19 * var10 - -(var20 * var13) - -(var16 * var21) >> 16;
                          pa.field_o[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> 16;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                ja.a(param5, var8, (byte) -100, var7_int, param4);
                break L0;
              } else {
                L7: {
                  var24 = param5.field_z[var23];
                  var25 = param5.field_a[var23];
                  var26 = param5.field_H[var23];
                  var27 = (var25 * var15 + (var24 * var12 + var18 * var26) >> 16 - pd.field_Tb) + var9;
                  var28 = var10 - -(var16 * var25 + (var13 * var24 + var26 * var19) >> -pd.field_Tb + 16);
                  var29 = (var26 * var20 + (var24 * var14 - -(var25 * var17)) >> 16) + var11;
                  if (var29 < 50) {
                    jd.field_i[var23] = -2147483648;
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
                      break L7;
                    } else {
                      break L7;
                    }
                  }
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
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("hb.D(").append(param0).append(44);
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L10;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L10;
            }
          }
          L11: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param2).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L11;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L11;
            }
          }
          L12: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44).append(param4).append(44);
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param5 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L12;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param6 + 41);
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
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new km[2][7];
    }
}
