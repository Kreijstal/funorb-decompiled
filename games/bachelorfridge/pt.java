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
            throw pe.a((Throwable) (Object) runtimeException, "pt.C(" + param0 + ')');
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
                  if (((hf) (Object) param1).field_B) {
                    var8.d((param1.field_p - var8.field_n >> 1) + var6_int + 1, var7 + 1 + (param1.field_q - var8.field_o >> 1), 256);
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
                  int discarded$3 = 0;
                  uv.a(-4 + param1.field_p, var7 + 2, param1.field_q + -4, 2 + var6_int);
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("pt.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var30 = BachelorFridge.field_y;
        try {
          L0: {
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
            var12 = var23 * param6[5] + param6[4] * var22 + param6[3] * var21 >> 14;
            var13 = param6[4] * var25 + var24 * param6[3] + var26 * param6[5] >> 14;
            var19 = param6[9] * var24 - -(var25 * param6[10]) + var26 * param6[11] >> 14;
            var15 = var22 * param6[7] + (var21 * param6[6] + param6[8] * var23) >> 14;
            var17 = var28 * param6[7] + param6[6] * var27 - -(param6[8] * var29) >> 14;
            var18 = var23 * param6[11] + (var21 * param6[9] - -(var22 * param6[10])) >> 14;
            var16 = var24 * param6[6] + (param6[7] * var25 - -(param6[8] * var26)) >> 14;
            var20 = var28 * param6[10] + param6[9] * var27 - -(var29 * param6[11]) >> 14;
            var14 = param6[5] * var29 + (param6[4] * var28 + var27 * param6[3]) >> 14;
            var21 = param6[0] - param1[0];
            var22 = param6[1] - param1[1];
            var23 = -param1[2] + param6[2];
            var9 = var23 * param1[5] + (param1[3] * var21 + var22 * param1[4]) >> 16 + -ima.field_s;
            var11 = param1[9] * var21 - -(param1[10] * var22) + var23 * param1[11] >> 16;
            var10 = var23 * param1[8] + (var22 * param1[7] + var21 * param1[6]) >> 16 - ima.field_s;
            var21 = jb.field_h;
            var22 = jb.field_j;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var23 >= param2.field_g) {
                      break L4;
                    } else {
                      var24 = param2.field_x[var23];
                      var25 = param2.field_O[var23];
                      var26 = param2.field_r[var23];
                      var27 = (var26 * var18 + (var24 * var12 + var25 * var15) >> 16 + -ima.field_s) + var9;
                      var28 = (var16 * var25 + (var13 * var24 + var26 * var19) >> -ima.field_s + 16) + var10;
                      var29 = (var26 * var20 + (var14 * var24 + var25 * var17) >> 16) + var11;
                      stackOut_6_0 = ~var29;
                      stackOut_6_1 = -51;
                      stackIn_66_0 = stackOut_6_0;
                      stackIn_66_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_7_0 <= stackIn_7_1) {
                              break L6;
                            } else {
                              dl.field_i[var23] = -2147483648;
                              if (var30 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            du.field_e[var23] = var21 + var27 / var29;
                            ew.field_s[var23] = var22 + var28 / var29;
                            if (~var29 < ~var8) {
                              var8 = var29;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          dl.field_i[var23] = var29;
                          if (~var7_int < ~var29) {
                            var7_int = var29;
                            break L5;
                          } else {
                            break L5;
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
                  L8: {
                    if (null == param2.field_o) {
                      break L8;
                    } else {
                      if (param2.field_D == null) {
                        break L8;
                      } else {
                        if (param2.field_L == null) {
                          break L8;
                        } else {
                          if (null == param2.field_M) {
                            break L8;
                          } else {
                            if (param2.field_j == null) {
                              break L8;
                            } else {
                              if (param2.field_p == null) {
                                break L8;
                              } else {
                                if (param2.field_s == null) {
                                  break L8;
                                } else {
                                  if (null == param2.field_z) {
                                    break L8;
                                  } else {
                                    if (param2.field_a == null) {
                                      break L8;
                                    } else {
                                      var23 = 0;
                                      L9: while (true) {
                                        if (~param2.field_K >= ~var23) {
                                          break L8;
                                        } else {
                                          var24 = param2.field_o[var23];
                                          var25 = param2.field_D[var23];
                                          var26 = param2.field_L[var23];
                                          fm.field_f[var23] = (var25 * var15 + (var24 * var12 + var18 * var26) >> 16) + var9;
                                          ha.field_m[var23] = var10 + (var13 * var24 + var16 * var25 + var19 * var26 >> 16);
                                          eb.field_p[var23] = var11 + (var26 * var20 + var24 * var14 + var17 * var25 >> 16);
                                          var24 = param2.field_M[var23];
                                          var25 = param2.field_j[var23];
                                          var26 = param2.field_p[var23];
                                          hha.field_A[var23] = var9 + (var26 * var18 + (var12 * var24 - -(var15 * var25)) >> 16);
                                          vea.field_x[var23] = (var19 * var26 + (var13 * var24 + var16 * var25) >> 16) + var10;
                                          kea.field_s[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> 16) + var11;
                                          var24 = param2.field_s[var23];
                                          var25 = param2.field_z[var23];
                                          var26 = param2.field_a[var23];
                                          tw.field_a[var23] = (var18 * var26 + (var24 * var12 - -(var25 * var15)) >> 16) + var9;
                                          mt.field_u[var23] = var10 - -(var26 * var19 + var25 * var16 + var13 * var24 >> 16);
                                          tja.field_a[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L9;
                                            } else {
                                              break L8;
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
                  L10: while (true) {
                    L11: {
                      if (~param2.field_i >= ~var18) {
                        break L11;
                      } else {
                        stackOut_60_0 = bv.field_G.length;
                        stackOut_60_1 = var18;
                        stackIn_66_0 = stackOut_60_0;
                        stackIn_66_1 = stackOut_60_1;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          if (stackIn_61_0 <= stackIn_61_1) {
                            break L11;
                          } else {
                            var19 = param2.field_f[var18];
                            var20 = param2.field_N[var18];
                            var21 = param2.field_b[var18];
                            bv.field_G[var18] = var12 * var20 + var9 * var19 - -(var21 * var15) >> 16;
                            fv.field_x[var18] = var19 * var10 - (-(var20 * var13) + -(var21 * var16)) >> 16;
                            ep.field_l[var18] = var21 * var17 + var19 * var11 - -(var14 * var20) >> 16;
                            var18++;
                            if (var30 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_65_0 = 1;
                    stackOut_65_1 = var7_int;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    break L3;
                  }
                }
                vm.a(stackIn_66_0 != 0, stackIn_66_1, var8, param2, false);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("pt.B(").append(true).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L12;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L12;
            }
          }
          L13: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param2 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L13;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L13;
            }
          }
          L14: {
            stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
            stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(false).append(',').append(-121).append(',').append(false).append(',');
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param6 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L14;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte param7) {
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
                if (param6 <= 0) {
                  break L2;
                } else {
                  dg.e(param0, param2, param6, 3518976);
                  dg.e(param0, param5, param6, 3518976);
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              dg.e(var9_int, param2, -param6, 3518976);
              dg.e(var9_int, param5, -param6, 3518976);
              break L1;
            }
            L3: {
              L4: {
                if (param5 <= param2) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      dg.f(var9_int, param2, 1 + (param5 - param2), 3518976);
                      if (~param2 < ~param4) {
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
                  if (~param5 < ~param4) {
                    break L8;
                  } else {
                    if (~param4 > ~param2) {
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
              dg.f(var9_int, param5, 1 + -param5 + param2, 3518976);
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
                if (var9_int < 350) {
                  break L11;
                } else {
                  L12: {
                    if (var10 != 0) {
                      L13: {
                        L14: {
                          var11 = param2 - -param5 >> 1;
                          if (param6 > 0) {
                            break L14;
                          } else {
                            dg.e(var9_int, var11, -param6, 3518976);
                            var9_int = var9_int - param6;
                            if (var13 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var9_int = var9_int - param6;
                        dg.e(var9_int, var11, param6, 3518976);
                        break L13;
                      }
                      L15: {
                        var12 = -var11 + param4;
                        if (0 >= var12) {
                          break L15;
                        } else {
                          dg.f(var9_int, var11, var12, 3518976);
                          if (var13 == 0) {
                            break L12;
                          } else {
                            break L15;
                          }
                        }
                      }
                      dg.f(var9_int, var11 + var12, -var12, 3518976);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  dg.e(350, param4, -350 + var9_int, 3518976);
                  if (var13 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              L16: {
                if (var10 == 0) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      var11 = param2 - -param5 >> 1;
                      var12 = -var11 + param4;
                      if (param6 > 0) {
                        break L18;
                      } else {
                        var9_int = var9_int + param6;
                        dg.e(var9_int, var11, -param6, 3518976);
                        if (var13 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    dg.e(var9_int, var11, param6, 3518976);
                    var9_int = var9_int + param6;
                    break L17;
                  }
                  L19: {
                    if (var12 <= 0) {
                      break L19;
                    } else {
                      dg.f(var9_int, var11, var12, 3518976);
                      if (var13 == 0) {
                        break L16;
                      } else {
                        break L19;
                      }
                    }
                  }
                  dg.f(var9_int, var12 + var11, -var12, 3518976);
                  break L16;
                }
              }
              dg.e(var9_int, param4, -var9_int + 350, 3518976);
              break L10;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var9, "pt.D(" + param0 + ',' + 3518976 + ',' + param2 + ',' + true + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + 350 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Turn time (seconds)", "Board", "Team size", "Game type", "Turn limit"};
    }
}
