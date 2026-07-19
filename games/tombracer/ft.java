/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft {
    static il field_c;
    int field_b;
    static boolean field_a;

    public static void a(byte param0) {
        try {
            int var1_int = 62 % ((param0 - 12) / 39);
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ft.D(" + param0 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 < 75) {
                field_c = (il) null;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(sda.a(param1, -1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ft.toString()");
        }
    }

    final static void a(an param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
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
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_68_0 = 0;
        boolean stackOut_68_1 = false;
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
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var30 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param3[3] >> 1934635298;
            var22 = param3[4] >> -2075374558;
            var23 = param3[5] >> 1251086882;
            var24 = param3[6] >> -2138636670;
            var25 = param3[7] >> 1498001762;
            var26 = param3[8] >> -1735598046;
            var27 = param3[9] >> -2003742334;
            var28 = param3[10] >> 1098126402;
            var12 = var23 * param2[5] + var21 * param2[3] - -(param2[4] * var22) >> 1935767630;
            var13 = param2[3] * var24 - (-(param2[4] * var25) + -(param2[5] * var26)) >> 1695478830;
            var29 = param3[11] >> 1042674946;
            var19 = param2[10] * var25 + var24 * param2[9] - -(param2[11] * var26) >> -1322869106;
            var14 = var27 * param2[3] - -(param2[4] * var28) - -(var29 * param2[5]) >> 150918478;
            var18 = var23 * param2[11] + (var22 * param2[10] + var21 * param2[9]) >> 1165201550;
            var15 = param2[8] * var23 + (param2[6] * var21 + param2[7] * var22) >> 1430796526;
            var17 = var28 * param2[7] + (var27 * param2[6] - -(param2[8] * var29)) >> 253423150;
            if (param1 == 1251086882) {
              var20 = param2[11] * var29 + param2[10] * var28 + var27 * param2[9] >> -2103803986;
              var16 = var26 * param2[8] + param2[6] * var24 - -(param2[7] * var25) >> -1108782258;
              var21 = param2[0] + -param3[0];
              var22 = -param3[1] + param2[1];
              var23 = -param3[2] + param2[2];
              var9 = param3[5] * var23 + (param3[3] * var21 - -(param3[4] * var22)) >> -hma.field_a + 16;
              var10 = param3[8] * var23 + (param3[6] * var21 - -(param3[7] * var22)) >> 16 + -hma.field_a;
              var11 = param3[10] * var22 + var21 * param3[9] - -(var23 * param3[11]) >> -751660592;
              var21 = uoa.field_f;
              var22 = uoa.field_g;
              var23 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (param0.field_I <= var23) {
                        break L4;
                      } else {
                        var24 = param0.field_l[var23];
                        var25 = param0.field_h[var23];
                        var26 = param0.field_t[var23];
                        var27 = var9 + (var24 * var12 - -(var15 * var25) + var18 * var26 >> -hma.field_a + 16);
                        var28 = var10 + (var13 * var24 - (-(var16 * var25) + -(var19 * var26)) >> 16 + -hma.field_a);
                        var29 = (var25 * var17 + (var24 * var14 + var20 * var26) >> 2041045360) + var11;
                        stackOut_5_0 = var29 ^ -1;
                        stackOut_5_1 = -51;
                        stackIn_69_0 = stackOut_5_0;
                        stackIn_69_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 <= stackIn_6_1) {
                                break L6;
                              } else {
                                wp.field_c[var23] = -2147483648;
                                if (var30 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              ds.field_f[var23] = var27 / var29 + var21;
                              mg.field_e[var23] = var28 / var29 + var22;
                              if ((var29 ^ -1) > (var7_int ^ -1)) {
                                var7_int = var29;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if ((var8 ^ -1) > (var29 ^ -1)) {
                                var8 = var29;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            wp.field_c[var23] = var29;
                            break L5;
                          }
                          L9: {
                            if (!param6) {
                              break L9;
                            } else {
                              bma.field_p[var23] = var27 >> hma.field_a;
                              ipa.field_M[var23] = var28 >> hma.field_a;
                              iia.field_v[var23] = var29;
                              break L9;
                            }
                          }
                          var23++;
                          if (var30 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L10: {
                      if (null == param0.field_j) {
                        break L10;
                      } else {
                        if (null == param0.field_F) {
                          break L10;
                        } else {
                          if (null == param0.field_o) {
                            break L10;
                          } else {
                            if (null == param0.field_x) {
                              break L10;
                            } else {
                              if (null == param0.field_G) {
                                break L10;
                              } else {
                                if (null == param0.field_J) {
                                  break L10;
                                } else {
                                  if (null == param0.field_E) {
                                    break L10;
                                  } else {
                                    if (param0.field_v == null) {
                                      break L10;
                                    } else {
                                      if (param0.field_L != null) {
                                        var23 = 0;
                                        L11: while (true) {
                                          if ((var23 ^ -1) <= (param0.field_u ^ -1)) {
                                            break L10;
                                          } else {
                                            var24 = param0.field_j[var23];
                                            var25 = param0.field_F[var23];
                                            var26 = param0.field_o[var23];
                                            rva.field_u[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> -477582192);
                                            un.field_r[var23] = var10 + (var16 * var25 + var24 * var13 + var26 * var19 >> 1981401872);
                                            lq.field_o[var23] = (var25 * var17 + (var24 * var14 - -(var26 * var20)) >> 624850896) + var11;
                                            var24 = param0.field_x[var23];
                                            var25 = param0.field_G[var23];
                                            var26 = param0.field_J[var23];
                                            fva.field_c[var23] = var9 - -(var25 * var15 + var24 * var12 - -(var18 * var26) >> 1998056176);
                                            hma.field_f[var23] = (var25 * var16 + var13 * var24 + var26 * var19 >> 2106204592) + var10;
                                            gv.field_q[var23] = var11 + (var26 * var20 + (var25 * var17 + var14 * var24) >> 175809808);
                                            var24 = param0.field_E[var23];
                                            var25 = param0.field_v[var23];
                                            var26 = param0.field_L[var23];
                                            nc.field_b[var23] = var9 + (var26 * var18 + (var15 * var25 + var24 * var12) >> 741632464);
                                            eq.field_p[var23] = var10 - -(var25 * var16 + (var13 * var24 - -(var19 * var26)) >> 1335959152);
                                            bw.field_b[var23] = var11 + (var25 * var17 + var14 * var24 - -(var26 * var20) >> 540637360);
                                            var23++;
                                            if (var30 != 0) {
                                              break L2;
                                            } else {
                                              if (var30 == 0) {
                                                continue L11;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L10;
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
                    L12: {
                      if (!param4) {
                        break L12;
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
                        L13: while (true) {
                          if ((var18 ^ -1) <= (param0.field_A ^ -1)) {
                            break L12;
                          } else {
                            stackOut_63_0 = ada.field_y.length ^ -1;
                            stackOut_63_1 = var18 ^ -1;
                            stackIn_69_0 = stackOut_63_0;
                            stackIn_69_1 = stackOut_63_1;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            if (var30 != 0) {
                              break L3;
                            } else {
                              if (stackIn_64_0 >= stackIn_64_1) {
                                break L12;
                              } else {
                                var19 = param0.field_k[var18];
                                var20 = param0.field_c[var18];
                                var21 = param0.field_r[var18];
                                ada.field_y[var18] = var19 * var9 + var20 * var12 + var21 * var15 >> 464724048;
                                ie.field_i[var18] = var19 * var10 + (var13 * var20 - -(var21 * var16)) >> -748737104;
                                dd.field_d[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> -376922224;
                                var18++;
                                if (var30 == 0) {
                                  continue L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_68_0 = var7_int;
                    stackOut_68_1 = param5;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1 ? 1 : 0;
                    break L3;
                  }
                  ck.a(stackIn_69_0, stackIn_69_1 != 0, param0, param1 ^ -1251095052, var8);
                  break L2;
                }
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
          L14: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var7);
            stackOut_71_1 = new StringBuilder().append("ft.A(");
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L14;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L14;
            }
          }
          L15: {
            stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param1).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L15;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L15;
            }
          }
          L16: {
            stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L16;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(q param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if ((vga.field_n.a((byte) -16) ^ -1) > param1) {
                vga.field_n.b((byte) -90, param0);
                break L1;
              } else {
                break L1;
              }
            }
            param0.c(param1 ^ 8174);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("ft.B(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    ft(int param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ft.<init>(" + param0 + ')');
        }
    }

    static {
    }
}
