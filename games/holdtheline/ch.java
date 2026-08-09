/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends hl {
    byte[] field_l;
    int field_j;
    static String[] field_t;
    el[] field_s;
    short[] field_q;
    static tk field_n;
    ik[] field_o;
    static float[] field_r;
    private int[] field_p;
    byte[] field_k;
    static ee field_i;
    static int field_m;
    byte[] field_v;
    static go field_u;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                      if (param1 >= 8) {
                        break L2;
                      } else {
                        ch.a((byte) 36);
                        break L2;
                      }
                    }
                    param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 69), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("ch.E(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int[] param1, byte[] param2, ld param3) {
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var8 = 57 / ((param0 - -27) / 58);
            var7 = null;
            var9 = 0;
            L1: while (true) {
              if ((var9 ^ -1) <= -129) {
                stackIn_23_0 = var5_int;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (null == param2) {
                      break L3;
                    } else {
                      if (-1 != (param2[var9] ^ -1)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = this.field_p[var9];
                  if ((var10 ^ -1) == -1) {
                    break L2;
                  } else {
                    L4: {
                      if ((var10 ^ -1) == (var6 ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          var6 = var10;
                          var10--;
                          if (0 == (var10 & 1)) {
                            var7 = param3.a(var10 >> -1551093598, (byte) 127, param1);
                            break L5;
                          } else {
                            var7 = param3.a(param1, var10 >> 121006466, (byte) 115);
                            break L5;
                          }
                        }
                        if (null != var7) {
                          break L4;
                        } else {
                          var5_int = 0;
                          break L4;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L2;
                    } else {
                      this.field_s[var9] = (el) (var7);
                      this.field_p[var9] = 0;
                      break L2;
                    }
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("ch.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_36_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final static fn a(String param0, gn param1, int param2, gn param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fn stackIn_2_0 = null;
        fn stackIn_4_0 = null;
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
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3.c(param0, 3);
            var6 = param3.a(var5_int, param4, false);
            if (param2 == 14819) {
              stackIn_4_0 = fi.a(-17072, param1, param3, var6, var5_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ch.D(");

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
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -6) {
            return;
        }
        try {
            field_n = null;
            field_r = null;
            field_u = null;
            field_t = null;
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ch.G(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
            le.field_s = new float[8];
            if (param0 != 9) {
                field_t = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ch.F(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, byte param3, qk param4, boolean param5, boolean param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
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
        var30 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              if (param3 >= 77) {
                break L1;
              } else {
                field_u = (go) null;
                break L1;
              }
            }
            var21 = param0[3] >> -1632735646;
            var22 = param0[4] >> 218996546;
            var23 = param0[5] >> -2138195710;
            var24 = param0[6] >> 1944848130;
            var25 = param0[7] >> -916852766;
            var26 = param0[8] >> -1771446718;
            var27 = param0[9] >> 464381058;
            var28 = param0[10] >> 35834914;
            var13 = param2[5] * var26 + (var24 * param2[3] - -(param2[4] * var25)) >> -1210903634;
            var12 = param2[4] * var22 + (var21 * param2[3] - -(var23 * param2[5])) >> -1374562674;
            var29 = param0[11] >> -1069299262;
            var20 = param2[11] * var29 + (param2[9] * var27 + var28 * param2[10]) >> 728934766;
            var16 = var24 * param2[6] + (param2[7] * var25 + param2[8] * var26) >> -138926258;
            var17 = param2[7] * var28 + param2[6] * var27 - -(param2[8] * var29) >> -396774610;
            var19 = var26 * param2[11] + (param2[9] * var24 - -(param2[10] * var25)) >> 1178041166;
            var18 = var23 * param2[11] + var21 * param2[9] + var22 * param2[10] >> -1443322994;
            var14 = var28 * param2[4] + var27 * param2[3] + param2[5] * var29 >> 856306638;
            var15 = var22 * param2[7] + (var21 * param2[6] + var23 * param2[8]) >> -1331739026;
            var21 = param2[0] + -param0[0];
            var22 = param2[1] - param0[1];
            var23 = param2[2] + -param0[2];
            var9 = var23 * param0[5] + var22 * param0[4] + var21 * param0[3] >> -il.field_c + 16;
            var10 = param0[8] * var23 + (var21 * param0[6] - -(param0[7] * var22)) >> -il.field_c + 16;
            var11 = param0[11] * var23 + var21 * param0[9] - -(param0[10] * var22) >> -1865160368;
            var21 = li.field_b;
            var22 = li.field_c;
            var23 = 0;
            L2: while (true) {
              L3: {
                if (param4.field_u <= var23) {
                  L4: {
                    if (null == param4.field_a) {
                      break L4;
                    } else {
                      if (param4.field_g == null) {
                        break L4;
                      } else {
                        if (null == param4.field_b) {
                          break L4;
                        } else {
                          if (null == param4.field_M) {
                            break L4;
                          } else {
                            if (null == param4.field_R) {
                              break L4;
                            } else {
                              if (param4.field_v == null) {
                                break L4;
                              } else {
                                if (param4.field_D == null) {
                                  break L4;
                                } else {
                                  if (null == param4.field_C) {
                                    break L4;
                                  } else {
                                    if (param4.field_h != null) {
                                      var23 = 0;
                                      L5: while (true) {
                                        if ((param4.field_J ^ -1) >= (var23 ^ -1)) {
                                          break L4;
                                        } else {
                                          var24 = param4.field_a[var23];
                                          var25 = param4.field_g[var23];
                                          var26 = param4.field_b[var23];
                                          ae.field_d[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> -2053476912);
                                          wb.field_e[var23] = (var26 * var19 + (var13 * var24 + var16 * var25) >> -635486256) + var10;
                                          ba.field_a[var23] = var11 + (var26 * var20 + (var25 * var17 + var14 * var24) >> 520618032);
                                          var24 = param4.field_M[var23];
                                          var25 = param4.field_R[var23];
                                          var26 = param4.field_v[var23];
                                          jb.field_Y[var23] = var9 - -(var15 * var25 + var12 * var24 + var18 * var26 >> 715560048);
                                          oe.field_h[var23] = (var24 * var13 + var25 * var16 - -(var19 * var26) >> 431454832) + var10;
                                          u.field_U[var23] = var11 - -(var26 * var20 + (var14 * var24 - -(var17 * var25)) >> -1849469136);
                                          var24 = param4.field_D[var23];
                                          var25 = param4.field_C[var23];
                                          var26 = param4.field_h[var23];
                                          si.field_ob[var23] = (var26 * var18 + (var25 * var15 + var24 * var12) >> 498617168) + var9;
                                          pe.field_a[var23] = (var19 * var26 + var25 * var16 + var24 * var13 >> -842452368) + var10;
                                          cg.field_j[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 1138700496) + var11;
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
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
                  if (!param5) {
                    break L3;
                  } else {
                    var9 = param2[3];
                    var10 = param2[4];
                    var11 = param2[5];
                    var12 = param2[6];
                    var13 = param2[7];
                    var14 = param2[8];
                    var15 = param2[9];
                    var16 = param2[10];
                    var17 = param2[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_62_0 = param4.field_o;
                      stackIn_62_1 = var18;
                      if (stackIn_62_0 <= stackIn_62_1) {
                        break L3;
                      } else {
                        stackIn_65_0 = kf.field_T.length;
                        if (stackIn_65_0 <= var18) {
                          break L3;
                        } else {
                          var19 = param4.field_c[var18];
                          var20 = param4.field_s[var18];
                          var21 = param4.field_A[var18];
                          kf.field_T[var18] = var12 * var20 + var9 * var19 + var15 * var21 >> 1860694480;
                          gb.field_q[var18] = var16 * var21 + (var13 * var20 + var19 * var10) >> -66495184;
                          u.field_S[var18] = var21 * var17 + var11 * var19 - -(var14 * var20) >> 1023792336;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  var24 = param4.field_m[var23];
                  var25 = param4.field_G[var23];
                  var26 = param4.field_k[var23];
                  var27 = (var18 * var26 + var12 * var24 - -(var15 * var25) >> -il.field_c + 16) + var9;
                  var28 = (var16 * var25 + var13 * var24 - -(var26 * var19) >> 16 + -il.field_c) + var10;
                  var29 = (var26 * var20 + var14 * var24 + var17 * var25 >> -363710928) + var11;
                  stackIn_62_0 = var29;

                  stackIn_62_1 = 50;

                  L8: {
                    if (stackIn_62_0 >= stackIn_62_1) {
                      L9: {
                        gd.field_d[var23] = var21 - -(var27 / var29);
                        om.field_p[var23] = var22 - -(var28 / var29);
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                          var8 = var29;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if ((var29 ^ -1) <= (var7_int ^ -1)) {
                          break L10;
                        } else {
                          var7_int = var29;
                          break L10;
                        }
                      }
                      ff.field_c[var23] = var29;
                      break L8;
                    } else {
                      ff.field_c[var23] = -2147483648;
                      break L8;
                    }
                  }
                  L11: {
                    if (param6) {
                      uf.field_c[var23] = var27 >> il.field_c;
                      tl.field_z[var23] = var28 >> il.field_c;
                      sd.field_b[var23] = var29;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              pg.a(var8, param4, param1, 3, var7_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var7);

            stackIn_74_1 = new StringBuilder().append("ch.A(");

            if (param0 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L12;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L13;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L14;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L14;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_75_0), stackIn_83_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ch(byte[] param0) {
        int incrementValue$0 = 0;
        ik dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_29_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        byte[] stackIn_61_0 = null;
        byte[] stackIn_65_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_158_0 = 0;
        Object stackIn_161_0 = null;
        byte[] stackIn_161_1 = null;
        Object stackIn_178_0 = null;
        byte[] stackIn_178_1 = null;
        Object stackIn_194_0 = null;
        byte[] stackIn_194_1 = null;
        Object stackIn_207_0 = null;
        byte[] stackIn_207_1 = null;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_265_0 = 0;
        int stackIn_265_1 = 0;
        int stackIn_311_0 = 0;
        int stackIn_311_1 = 0;
        int stackIn_319_0 = 0;
        int stackIn_319_1 = 0;
        ik stackIn_322_0 = null;
        RuntimeException stackIn_330_0 = null;
        StringBuilder stackIn_330_1 = null;
        RuntimeException stackIn_332_0 = null;
        StringBuilder stackIn_332_1 = null;
        RuntimeException stackIn_333_0 = null;
        StringBuilder stackIn_333_1 = null;
        String stackIn_333_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        th var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ik[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ik var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        ik var28 = null;
        int var28_int = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var36 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_l = new byte[128];
                    this.field_p = new int[128];
                    this.field_q = new short[128];
                    this.field_v = new byte[128];
                    this.field_s = new el[128];
                    this.field_o = new ik[128];
                    this.field_k = new byte[128];
                    var2 = new th(param0);
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 == var2.field_i[var2.field_l + var3]) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 4: {
                    var4 = new byte[var3];
                    var5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var3 ^ -1) >= (var5 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4[var5] = var2.f(0);
                    var5++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 9: {
                    var3++;
                    var2.field_l = var2.field_l + 1;
                    var5 = var2.field_l;
                    var2.field_l = var2.field_l + var3;
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var2.field_i[var6 + var2.field_l] ^ -1) == -1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 12: {
                    var7 = new byte[var6];
                    var8 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((var8 ^ -1) <= (var6 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7[var8] = var2.f(0);
                    var8++;
                    statePc = 13;
                    continue stateLoop;
                }
                case 17: {
                    var6++;
                    var2.field_l = var2.field_l + 1;
                    var8 = var2.field_l;
                    var2.field_l = var2.field_l + var6;
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var2.field_i[var9 + var2.field_l] == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var9++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 20: {
                    var10 = new byte[var9];
                    var11_int = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if ((var9 ^ -1) >= (var11_int ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var10[var11_int] = var2.f(0);
                    var11_int++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 25: {
                    var9++;
                    var2.field_l = var2.field_l + 1;
                    var11 = new byte[var9];
                    if ((var9 ^ -1) >= -2) {
                        statePc = 41;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var11[1] = (byte) 1;
                    var12 = 2;
                    var13_int = 1;
                    var14 = 2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((var9 ^ -1) >= (var14 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var15_int = var2.f((byte) -89);
                    stackIn_43_0 = var15_int;
                    stackIn_29_0 = stackIn_43_0;
                    if (false) {
                        statePc = 43;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    incrementValue$0 = var12;
                    var12++;
                    var13_int = incrementValue$0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 33: {
                    if (var15_int > var13_int) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var15_int--;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var13_int = var15_int;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var11[var14] = (byte)var13_int;
                    var14++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 41: {
                    var12 = var9;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = var12;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var13 = new ik[stackIn_43_0];
                    var14 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var14 >= var13.length) {
                        statePc = 56;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    dupTemp$1 = new ik();
                    var13[var14] = dupTemp$1;
                    var15 = dupTemp$1;
                    var16_int = var2.f((byte) -60);
                    stackIn_59_0 = 0;
                    stackIn_46_0 = stackIn_59_0;
                    stackIn_59_1 = var16_int;
                    stackIn_46_1 = stackIn_59_1;
                    if (false) {
                        statePc = 59;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 < stackIn_46_1) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var15.field_l = new byte[2 * var16_int];
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var16_int = var2.f((byte) -44);
                    if (-1 > (var16_int ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var15.field_g = new byte[2 + 2 * var16_int];
                    var15.field_g[1] = (byte) 64;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var14++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 56: {
                    var14 = var2.f((byte) -93);
                    if (var14 <= 0) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = var14;
                    stackIn_59_1 = 2;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = new byte[stackIn_59_0 * stackIn_59_1];
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = null;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var15_array = stackIn_61_0;
                    var14 = var2.f((byte) -29);
                    if (0 >= var14) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_65_0 = new byte[var14 * 2];
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = null;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var16 = stackIn_65_0;
                    var17 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (0 == var2.field_i[var17 + var2.field_l]) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var17++;
                    statePc = 66;
                    continue stateLoop;
                }
                case 68: {
                    var18 = new byte[var17];
                    var19 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((var17 ^ -1) >= (var19 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var18[var19] = var2.f(0);
                    var19++;
                    statePc = 69;
                    continue stateLoop;
                }
                case 73: {
                    var17++;
                    var2.field_l = var2.field_l + 1;
                    var19 = 0;
                    var20 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var20 >= 128) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var19 = var19 + var2.f((byte) -93);
                    this.field_q[var20] = (short)var19;
                    var20++;
                    statePc = 74;
                    continue stateLoop;
                }
                case 78: {
                    var19 = 0;
                    var20 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (-129 >= (var20 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var19 = var19 + var2.f((byte) -86);
                    this.field_q[var20] = (short)(this.field_q[var20] + (var19 << -730105048));
                    var20++;
                    statePc = 79;
                    continue stateLoop;
                }
                case 83: {
                    var20 = 0;
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (128 <= var23) {
                        statePc = 95;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if ((var20 ^ -1) == -1) {
                        statePc = 90;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var21 < var18.length) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var20 = -1;
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    incrementValue$2 = var21;
                    var21++;
                    var20 = var18[incrementValue$2];
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var22 = var2.d((byte) -17);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    this.field_q[var23] = (short)(this.field_q[var23] + pk.a(-1 + var22 << -1685483730, 32768));
                    var20--;
                    this.field_p[var23] = var22;
                    var23++;
                    statePc = 84;
                    continue stateLoop;
                }
                case 95: {
                    var21 = 0;
                    var20 = 0;
                    var23 = 0;
                    var24 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (-129 >= (var24 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if ((this.field_p[var24] ^ -1) != -1) {
                        statePc = 103;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if ((var20 ^ -1) == -1) {
                        statePc = 108;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 108: {
                    incrementValue$3 = var5;
                    var5++;
                    var23 = var2.field_i[incrementValue$3] - 1;
                    if ((var4.length ^ -1) >= (var21 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    incrementValue$4 = var21;
                    var21++;
                    var20 = var4[incrementValue$4];
                    statePc = 111;
                    continue stateLoop;
                }
                case 110: {
                    var20 = -1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var20--;
                    this.field_v[var24] = (byte)var23;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var24++;
                    statePc = 96;
                    continue stateLoop;
                }
                case 113: {
                    var20 = 0;
                    var21 = 0;
                    var24 = 0;
                    var25_int = 0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (var25_int >= 128) {
                        statePc = 126;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if ((this.field_p[var25_int] ^ -1) == -1) {
                        statePc = 125;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (0 != var20) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    incrementValue$5 = var8;
                    var8++;
                    var24 = var2.field_i[incrementValue$5] + 16 << -208918974;
                    if (var21 < var7.length) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var20 = -1;
                    statePc = 124;
                    continue stateLoop;
                }
                case 123: {
                    incrementValue$6 = var21;
                    var21++;
                    var20 = var7[incrementValue$6];
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var20--;
                    this.field_l[var25_int] = (byte)var24;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var25_int++;
                    statePc = 114;
                    continue stateLoop;
                }
                case 126: {
                    var20 = 0;
                    var21 = 0;
                    var25 = null;
                    var26 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (-129 >= (var26 ^ -1)) {
                        statePc = 142;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_143_0 = this.field_p[var26];
                    stackIn_129_0 = stackIn_143_0;
                    if (false) {
                        statePc = 143;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var20 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var25 = var13[var11[var21]];
                    if (var10.length <= var21) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    incrementValue$7 = var21;
                    var21++;
                    var20 = var10[incrementValue$7];
                    statePc = 140;
                    continue stateLoop;
                }
                case 139: {
                    var20 = -1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    this.field_o[var26] = (ik) (var25);
                    var20--;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var26++;
                    statePc = 127;
                    continue stateLoop;
                }
                case 142: {
                    var21 = 0;
                    var20 = 0;
                    var26 = 0;
                    stackIn_143_0 = 0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var27 = stackIn_143_0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (128 <= var27) {
                        statePc = 157;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackIn_158_0 = var20;
                    stackIn_146_0 = stackIn_158_0;
                    if (false) {
                        statePc = 158;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 != 0) {
                        statePc = 156;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (var21 < var18.length) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var20 = -1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 153: {
                    incrementValue$8 = var21;
                    var21++;
                    var20 = var18[incrementValue$8];
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (-1 <= (this.field_p[var27] ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var26 = 1 + var2.f((byte) -112);
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    this.field_k[var27] = (byte)var26;
                    var20--;
                    var27++;
                    statePc = 144;
                    continue stateLoop;
                }
                case 157: {
                    this.field_j = 1 + var2.f((byte) -54);
                    stackIn_158_0 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var27 = stackIn_158_0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (var27 >= var12) {
                        statePc = 177;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var28 = var13[var27];
                    stackIn_178_0 = null;
                    stackIn_161_0 = stackIn_178_0;
                    stackIn_178_1 = var28.field_l;
                    stackIn_161_1 = stackIn_178_1;
                    if (false) {
                        statePc = 178;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (stackIn_161_0 != stackIn_161_1) {
                        statePc = 165;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var29 = 1;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (var28.field_l.length <= var29) {
                        statePc = 170;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var28.field_l[var29] = var2.f(0);
                    var29 += 2;
                    statePc = 166;
                    continue stateLoop;
                }
                case 170: {
                    if (null == var28.field_g) {
                        statePc = 176;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var29 = 3;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if ((-2 + var28.field_g.length ^ -1) >= (var29 ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var28.field_g[var29] = var2.f(0);
                    var29 += 2;
                    statePc = 172;
                    continue stateLoop;
                }
                case 176: {
                    var27++;
                    statePc = 159;
                    continue stateLoop;
                }
                case 177: {
                    stackIn_178_0 = null;
                    stackIn_178_1 = (byte[]) (var15_array);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0 != stackIn_178_1) {
                        statePc = 180;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var27 = 1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if ((var27 ^ -1) <= (var15_array.length ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var15_array[var27] = var2.f(0);
                    var27 += 2;
                    statePc = 181;
                    continue stateLoop;
                }
                case 185: {
                    if (var16 == null) {
                        statePc = 191;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var27 = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if ((var16.length ^ -1) >= (var27 ^ -1)) {
                        statePc = 191;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var16[var27] = var2.f(0);
                    var27 += 2;
                    statePc = 187;
                    continue stateLoop;
                }
                case 191: {
                    var27 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var28 = var13[var27];
                    stackIn_207_0 = null;
                    stackIn_194_0 = stackIn_207_0;
                    stackIn_207_1 = var28.field_g;
                    stackIn_194_1 = stackIn_207_1;
                    if (false) {
                        statePc = 207;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (stackIn_194_0 == stackIn_194_1) {
                        statePc = 202;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (var28.field_g.length <= var29) {
                        statePc = 202;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var19 = 1 + (var19 + var2.f((byte) -36));
                    var28.field_g[var29] = (byte)var19;
                    var29 += 2;
                    statePc = 198;
                    continue stateLoop;
                }
                case 202: {
                    var27++;
                    statePc = 192;
                    continue stateLoop;
                }
                case 203: {
                    var27 = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var28 = var13[var27];
                    stackIn_207_0 = null;
                    stackIn_207_1 = var28.field_l;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (stackIn_207_0 == stackIn_207_1) {
                        statePc = 213;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (var28.field_l.length <= var29) {
                        statePc = 213;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var19 = 1 + var19 - -var2.f((byte) -34);
                    var28.field_l[var29] = (byte)var19;
                    var29 += 2;
                    statePc = 209;
                    continue stateLoop;
                }
                case 213: {
                    var27++;
                    statePc = 204;
                    continue stateLoop;
                }
                case 214: {
                    if (var15_array == null) {
                        statePc = 239;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var19 = var2.f((byte) -25);
                    var15_array[0] = (byte)var19;
                    var27 = 2;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (var27 >= var15_array.length) {
                        statePc = 220;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    var19 = var2.f((byte) -30) + 1 + var19;
                    var15_array[var27] = (byte)var19;
                    var27 += 2;
                    statePc = 216;
                    continue stateLoop;
                }
                case 220: {
                    var27 = var15_array[0];
                    var28_int = var15_array[1];
                    var29 = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (var29 >= var27) {
                        statePc = 225;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    this.field_k[var29] = (byte)(32 + var28_int * this.field_k[var29] >> 1524593734);
                    var29++;
                    statePc = 221;
                    continue stateLoop;
                }
                case 225: {
                    var29 = 2;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (var15_array.length <= var29) {
                        statePc = 233;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var30 = var15_array[var29];
                    var31 = var15_array[var29 - -1];
                    var32 = var28_int * (var30 - var27) - -((var30 + -var27) / 2);
                    var33 = var27;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if (var33 >= var30) {
                        statePc = 232;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var34 = sf.a(var32, -var27 + var30, (byte) -76);
                    var32 = var32 + (var31 + -var28_int);
                    this.field_k[var33] = (byte)(var34 * this.field_k[var33] + 32 >> 2048904166);
                    var33++;
                    statePc = 228;
                    continue stateLoop;
                }
                case 232: {
                    var27 = var30;
                    var28_int = var31;
                    var29 += 2;
                    statePc = 226;
                    continue stateLoop;
                }
                case 233: {
                    var30 = var27;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (var30 >= 128) {
                        statePc = 238;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    this.field_k[var30] = (byte)(var28_int * this.field_k[var30] - -32 >> 350603846);
                    var30++;
                    statePc = 234;
                    continue stateLoop;
                }
                case 238: {
                    var15_array = null;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (var16 != null) {
                        statePc = 242;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var19 = var2.f((byte) -27);
                    var16[0] = (byte)var19;
                    var27 = 2;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (var27 >= var16.length) {
                        statePc = 247;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var19 = var2.f((byte) -110) + (1 + var19);
                    var16[var27] = (byte)var19;
                    var27 += 2;
                    statePc = 243;
                    continue stateLoop;
                }
                case 247: {
                    var27 = var16[0];
                    var28_int = var16[1] << -1693911583;
                    var29 = 0;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var29 >= var27) {
                        statePc = 259;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var30 = var28_int + (this.field_l[var29] & 255);
                    stackIn_261_0 = var30 ^ -1;
                    stackIn_250_0 = stackIn_261_0;
                    stackIn_261_1 = -1;
                    stackIn_250_1 = stackIn_261_1;
                    if (false) {
                        statePc = 261;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0 <= stackIn_250_1) {
                        statePc = 254;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var30 = 0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if (128 < var30) {
                        statePc = 257;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var30 = 128;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    this.field_l[var29] = (byte)var30;
                    var29++;
                    statePc = 248;
                    continue stateLoop;
                }
                case 259: {
                    var29 = 2;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    stackIn_261_0 = var16.length ^ -1;
                    stackIn_261_1 = var29 ^ -1;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (stackIn_261_0 >= stackIn_261_1) {
                        statePc = 274;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var30 = var16[var29];
                    var31 = var16[var29 + 1] << -600490847;
                    var32 = (var30 + -var27) * var28_int - -((var30 + -var27) / 2);
                    var33 = var27;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                        statePc = 273;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var34 = sf.a(var32, -var27 + var30, (byte) -86);
                    var35 = var34 + (this.field_l[var33] & 255);
                    stackIn_261_0 = 0;
                    stackIn_265_0 = stackIn_261_0;
                    stackIn_261_1 = var35;
                    stackIn_265_1 = stackIn_261_1;
                    if (false) {
                        statePc = 261;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (stackIn_265_0 > stackIn_265_1) {
                        statePc = 267;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var35 = 0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (var35 > 128) {
                        statePc = 271;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var35 = 128;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    var32 = var32 + (-var28_int + var31);
                    this.field_l[var33] = (byte)var35;
                    var33++;
                    statePc = 263;
                    continue stateLoop;
                }
                case 273: {
                    var29 += 2;
                    var28_int = var31;
                    var27 = var30;
                    statePc = 260;
                    continue stateLoop;
                }
                case 274: {
                    var16 = null;
                    var30 = var27;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    if ((var30 ^ -1) <= -129) {
                        statePc = 283;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var31 = var28_int + (this.field_l[var30] & 255);
                    if (var31 >= 0) {
                        statePc = 278;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var31 = 0;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    if ((var31 ^ -1) < -129) {
                        statePc = 281;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var31 = 128;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    this.field_l[var30] = (byte)var31;
                    var30++;
                    statePc = 275;
                    continue stateLoop;
                }
                case 283: {
                    var27 = 0;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    if (var12 <= var27) {
                        statePc = 288;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var13[var27].field_b = var2.f((byte) -28);
                    var27++;
                    statePc = 284;
                    continue stateLoop;
                }
                case 288: {
                    var27 = 0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var28 = var13[var27];
                    if (var28.field_l == null) {
                        statePc = 295;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var28.field_d = var2.f((byte) -16);
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (var28.field_g == null) {
                        statePc = 298;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var28.field_n = var2.f((byte) -120);
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    if (var28.field_b > 0) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var28.field_c = var2.f((byte) -81);
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var27++;
                    statePc = 289;
                    continue stateLoop;
                }
                case 303: {
                    var27 = 0;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 308;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var13[var27].field_m = var2.f((byte) -50);
                    var27++;
                    statePc = 304;
                    continue stateLoop;
                }
                case 308: {
                    var27 = 0;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 317;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var28 = var13[var27];
                    stackIn_319_0 = 0;
                    stackIn_311_0 = stackIn_319_0;
                    stackIn_319_1 = var28.field_m;
                    stackIn_311_1 = stackIn_319_1;
                    if (false) {
                        statePc = 319;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (stackIn_311_0 >= stackIn_311_1) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var28.field_h = var2.f((byte) -50);
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    var27++;
                    statePc = 309;
                    continue stateLoop;
                }
                case 317: {
                    var27 = 0;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    stackIn_319_0 = var12 ^ -1;
                    stackIn_319_1 = var27 ^ -1;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    if (stackIn_319_0 >= stackIn_319_1) {
                        statePc = 334;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    stackIn_322_0 = var13[var27];
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    var28 = stackIn_322_0;
                    if (-1 <= (var28.field_h ^ -1)) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    var28.field_j = var2.f((byte) -81);
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    var27++;
                    statePc = 318;
                    continue stateLoop;
                }
                case 334: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -8346) {
                break L1;
              } else {
                ch.a(-62, 14, (hj) null, 98, (byte) 42);
                break L1;
              }
            }
            this.field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ch.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param2.e(-(param2.field_o / 2) + param3, param1 + -(param2.field_v / 2), param0);
              if (param4 == 98) {
                break L1;
              } else {
                field_t = (String[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ch.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1 = "";
              if (null != lh.field_a) {
                var1 = lh.field_a.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != var1.length()) {
                break L2;
              } else {
                var1 = u.j(21);
                break L2;
              }
            }
            L3: {
              if (0 != var1.length()) {
                break L3;
              } else {
                var1 = nd.field_k;
                break L3;
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                ch.a(100);
                break L4;
              }
            }
            stackIn_12_0 = (String) (var1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "ch.C(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    static {
        field_r = new float[]{3.0f, 2.75f, 2.5f, 2.25f, 2.0f};
        field_t = new String[]{"By rating", "By win percentage"};
    }
}
