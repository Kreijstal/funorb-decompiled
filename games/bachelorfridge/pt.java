/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt implements qda {
    static String[] field_a;
    static String[] field_b;

    public static void a(int param0) {
        try {
            int var1_int = 1 % ((-76 - param0) / 49);
            field_a = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pt.C(" + param0 + ')');
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        kv var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var6_int = param0 + param1.field_s;
            if (param2 == 32679) {
              L1: {
                var7 = param1.field_v + param3;
                oka.a(var6_int, param1.field_p, var7, false, param1.field_q);
                var8 = fr.field_q[1];
                if (!(param1 instanceof hf)) {
                  break L1;
                } else {
                  if (((hf) ((Object) param1)).field_B) {
                    var8.d((param1.field_p - var8.field_n >> 215904801) + var6_int + 1, var7 + 1 + (param1.field_q - var8.field_o >> -206716639), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!param1.e(param2 ^ 31832)) {
                  break L2;
                } else {
                  uv.a(-4 + param1.field_p, var7 + 2, param1.field_q + -4, 2 + var6_int, false);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("pt.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int[] param1, ma param2, boolean param3, byte param4, boolean param5, int[] param6) {
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
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
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
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
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
        var30 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 1647970530;
              var22 = param1[4] >> -740894718;
              var23 = param1[5] >> -420859774;
              var24 = param1[6] >> -247909662;
              var25 = param1[7] >> 1836249538;
              var26 = param1[8] >> -1843261886;
              var27 = param1[9] >> 2021877250;
              var28 = param1[10] >> -896049886;
              var29 = param1[11] >> -953531710;
              var12 = var23 * param6[5] + param6[4] * var22 + param6[3] * var21 >> -1675212498;
              var13 = param6[4] * var25 + var24 * param6[3] + var26 * param6[5] >> 1907672878;
              var19 = param6[9] * var24 - -(var25 * param6[10]) + var26 * param6[11] >> -2031324370;
              var15 = var22 * param6[7] + (var21 * param6[6] + param6[8] * var23) >> 381956910;
              var17 = var28 * param6[7] + param6[6] * var27 - -(param6[8] * var29) >> -360331346;
              var18 = var23 * param6[11] + (var21 * param6[9] - -(var22 * param6[10])) >> -1134199858;
              var16 = var24 * param6[6] + (param6[7] * var25 - -(param6[8] * var26)) >> 1314786766;
              var20 = var28 * param6[10] + param6[9] * var27 - -(var29 * param6[11]) >> -1258961938;
              var14 = param6[5] * var29 + (param6[4] * var28 + var27 * param6[3]) >> 143963150;
              var21 = param6[0] - param1[0];
              var22 = param6[1] - param1[1];
              if (param4 == -121) {
                break L1;
              } else {
                pt.a(101);
                break L1;
              }
            }
            var23 = -param1[2] + param6[2];
            var9 = var23 * param1[5] + (param1[3] * var21 + var22 * param1[4]) >> 16 + -ima.field_s;
            var11 = param1[9] * var21 - -(param1[10] * var22) + var23 * param1[11] >> -2020559408;
            var10 = var23 * param1[8] + (var22 * param1[7] + var21 * param1[6]) >> 16 - ima.field_s;
            var21 = jb.field_h;
            var22 = jb.field_j;
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var23 >= param2.field_g) {
                      break L5;
                    } else {
                      var24 = param2.field_x[var23];
                      var25 = param2.field_O[var23];
                      var26 = param2.field_r[var23];
                      var27 = (var26 * var18 + (var24 * var12 + var25 * var15) >> 16 + -ima.field_s) + var9;
                      var28 = (var16 * var25 + (var13 * var24 + var26 * var19) >> -ima.field_s + 16) + var10;
                      var29 = (var26 * var20 + (var14 * var24 + var25 * var17) >> 67714640) + var11;
                      stackOut_6_0 = var29 ^ -1;
                      stackOut_6_1 = -51;
                      stackIn_68_0 = stackOut_6_0;
                      stackIn_68_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_7_0 <= stackIn_7_1) {
                              break L7;
                            } else {
                              dl.field_i[var23] = -2147483648;
                              if (var30 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            du.field_e[var23] = var21 + var27 / var29;
                            ew.field_s[var23] = var22 + var28 / var29;
                            if ((var29 ^ -1) < (var8 ^ -1)) {
                              var8 = var29;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          dl.field_i[var23] = var29;
                          if ((var7_int ^ -1) < (var29 ^ -1)) {
                            var7_int = var29;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L9: {
                          if (param5) {
                            on.field_w[var23] = var27 >> ima.field_s;
                            ra.field_s[var23] = var28 >> ima.field_s;
                            ji.field_i[var23] = var29;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L10: {
                    if (null == param2.field_o) {
                      break L10;
                    } else {
                      if (param2.field_D == null) {
                        break L10;
                      } else {
                        if (param2.field_L == null) {
                          break L10;
                        } else {
                          if (null == param2.field_M) {
                            break L10;
                          } else {
                            if (param2.field_j == null) {
                              break L10;
                            } else {
                              if (param2.field_p == null) {
                                break L10;
                              } else {
                                if (param2.field_s == null) {
                                  break L10;
                                } else {
                                  if (null == param2.field_z) {
                                    break L10;
                                  } else {
                                    if (param2.field_a == null) {
                                      break L10;
                                    } else {
                                      var23 = 0;
                                      L11: while (true) {
                                        if ((param2.field_K ^ -1) >= (var23 ^ -1)) {
                                          break L10;
                                        } else {
                                          var24 = param2.field_o[var23];
                                          var25 = param2.field_D[var23];
                                          var26 = param2.field_L[var23];
                                          fm.field_f[var23] = (var25 * var15 + (var24 * var12 + var18 * var26) >> -1167090224) + var9;
                                          ha.field_m[var23] = var10 + (var13 * var24 + var16 * var25 + var19 * var26 >> 1730338384);
                                          eb.field_p[var23] = var11 + (var26 * var20 + var24 * var14 + var17 * var25 >> 1770013968);
                                          var24 = param2.field_M[var23];
                                          var25 = param2.field_j[var23];
                                          var26 = param2.field_p[var23];
                                          hha.field_A[var23] = var9 + (var26 * var18 + (var12 * var24 - -(var15 * var25)) >> -1087742640);
                                          vea.field_x[var23] = (var19 * var26 + (var13 * var24 + var16 * var25) >> 1487169392) + var10;
                                          kea.field_s[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> 1350790896) + var11;
                                          var24 = param2.field_s[var23];
                                          var25 = param2.field_z[var23];
                                          var26 = param2.field_a[var23];
                                          tw.field_a[var23] = (var18 * var26 + (var24 * var12 - -(var25 * var15)) >> -464376240) + var9;
                                          mt.field_u[var23] = var10 - -(var26 * var19 + var25 * var16 + var13 * var24 >> -1417719056);
                                          tja.field_a[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> 1041430288) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L3;
                                          } else {
                                            if (var30 == 0) {
                                              continue L11;
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
                        }
                      }
                    }
                  }
                  L12: {
                    if (!param0) {
                      break L12;
                    } else {
                      var9 = param6[3];
                      var10 = param6[4];
                      var11 = param6[5];
                      var12 = param6[6];
                      var13 = param6[7];
                      var14 = param6[8];
                      var15 = param6[9];
                      var16 = param6[10];
                      var17 = param6[11];
                      var18 = 0;
                      L13: while (true) {
                        if ((param2.field_i ^ -1) >= (var18 ^ -1)) {
                          break L12;
                        } else {
                          stackOut_62_0 = bv.field_G.length;
                          stackOut_62_1 = var18;
                          stackIn_68_0 = stackOut_62_0;
                          stackIn_68_1 = stackOut_62_1;
                          stackIn_63_0 = stackOut_62_0;
                          stackIn_63_1 = stackOut_62_1;
                          if (var30 != 0) {
                            break L4;
                          } else {
                            if (stackIn_63_0 <= stackIn_63_1) {
                              break L12;
                            } else {
                              var19 = param2.field_f[var18];
                              var20 = param2.field_N[var18];
                              var21 = param2.field_b[var18];
                              bv.field_G[var18] = var12 * var20 + var9 * var19 - -(var21 * var15) >> 1494611216;
                              fv.field_x[var18] = var19 * var10 - (-(var20 * var13) + -(var21 * var16)) >> -1023432240;
                              ep.field_l[var18] = var21 * var17 + var19 * var11 - -(var14 * var20) >> 76951280;
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
                  stackOut_67_0 = 1;
                  stackOut_67_1 = var7_int;
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  break L4;
                }
                vm.a(stackIn_68_0 != 0, stackIn_68_1, var8, param2, param3);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) (var7);
            stackOut_70_1 = new StringBuilder().append("pt.B(").append(param0).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L14;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L14;
            }
          }
          L15: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L15;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L15;
            }
          }
          L16: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L16;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L16;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_17_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                var9_int = param0 + param6;
                if ((param6 ^ -1) >= -1) {
                  break L2;
                } else {
                  dg.e(param0, param2, param6, param1);
                  dg.e(param0, param5, param6, param1);
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              dg.e(var9_int, param2, -param6, param1);
              dg.e(var9_int, param5, -param6, param1);
              break L1;
            }
            L3: {
              L4: {
                if (param5 <= param2) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      dg.f(var9_int, param2, 1 + (param5 - param2), param1);
                      if ((param2 ^ -1) < (param4 ^ -1)) {
                        break L6;
                      } else {
                        if (param4 < param5) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_14_0 = 1;
                    stackIn_17_0 = stackOut_14_0;
                    break L5;
                  }
                  var10 = stackIn_17_0;
                  if (var13 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                L8: {
                  if ((param5 ^ -1) < (param4 ^ -1)) {
                    break L8;
                  } else {
                    if ((param4 ^ -1) > (param2 ^ -1)) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                stackOut_24_0 = 1;
                stackIn_27_0 = stackOut_24_0;
                break L7;
              }
              var10 = stackIn_27_0;
              dg.f(var9_int, param5, 1 + -param5 + param2, param1);
              break L3;
            }
            L9: {
              if (param7 > 43) {
                break L9;
              } else {
                pt.a(-3);
                break L9;
              }
            }
            L10: {
              L11: {
                if (var9_int < param8) {
                  break L11;
                } else {
                  L12: {
                    if (var10 != 0) {
                      L13: {
                        L14: {
                          var11 = param2 - -param5 >> 1908022657;
                          if (-1 > (param6 ^ -1)) {
                            break L14;
                          } else {
                            dg.e(var9_int, var11, -param6, param1);
                            var9_int = var9_int - param6;
                            if (var13 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var9_int = var9_int - param6;
                        dg.e(var9_int, var11, param6, param1);
                        break L13;
                      }
                      L15: {
                        var12 = -var11 + param4;
                        if (0 >= var12) {
                          break L15;
                        } else {
                          dg.f(var9_int, var11, var12, param1);
                          if (var13 == 0) {
                            break L12;
                          } else {
                            break L15;
                          }
                        }
                      }
                      dg.f(var9_int, var11 + var12, -var12, param1);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  if (param3) {
                    dg.e(param8, param4, -param8 + var9_int, param1);
                    if (var13 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L16: {
                if (var10 == 0) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      var11 = param2 - -param5 >> -120391359;
                      var12 = -var11 + param4;
                      if ((param6 ^ -1) < -1) {
                        break L18;
                      } else {
                        var9_int = var9_int + param6;
                        dg.e(var9_int, var11, -param6, param1);
                        if (var13 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    dg.e(var9_int, var11, param6, param1);
                    var9_int = var9_int + param6;
                    break L17;
                  }
                  L19: {
                    if (var12 <= 0) {
                      break L19;
                    } else {
                      dg.f(var9_int, var11, var12, param1);
                      if (var13 == 0) {
                        break L16;
                      } else {
                        break L19;
                      }
                    }
                  }
                  dg.f(var9_int, var12 + var11, -var12, param1);
                  break L16;
                }
              }
              if (!param3) {
                break L10;
              } else {
                dg.e(var9_int, param4, -var9_int + param8, param1);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var9), "pt.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_b = new String[]{"Turn time (seconds)", "Board", "Team size", "Game type", "Turn limit"};
    }
}
