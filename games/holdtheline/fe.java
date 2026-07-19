/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static int[] field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        RuntimeException var17 = null;
        int var17_int = 0;
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
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var42 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param5 < (param1 ^ -1)) {
                break L1;
              } else {
                if (li.field_d > param15) {
                  L2: {
                    if (param9 >= 0) {
                      break L2;
                    } else {
                      if (0 <= param3) {
                        break L2;
                      } else {
                        if (param6 < 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param9 < li.field_i) {
                      break L3;
                    } else {
                      if (param3 < li.field_i) {
                        break L3;
                      } else {
                        if (li.field_i <= param6) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var34 = -param15 + param1;
                    if (param15 != param12) {
                      L5: {
                        var26 = param10 << -1948393648;
                        var25 = param10 << -1948393648;
                        var30 = param13 << 650028176;
                        var29 = param13 << 650028176;
                        var22 = param0 << -1127576720;
                        var21 = param0 << -1127576720;
                        var18 = param9 << 1945018544;
                        var17_int = param9 << 1945018544;
                        var35 = param12 + -param15;
                        var19 = (-param9 + param3 << 19535120) / var35;
                        var20 = (-param9 + param6 << 1536102544) / var34;
                        if (var20 > var19) {
                          var24 = (param2 - param0 << -1904113616) / var34;
                          var31 = (param7 - param13 << 843577136) / var35;
                          var28 = (param11 + -param10 << 2018256816) / var34;
                          var32 = (-param13 + param4 << -1486177264) / var34;
                          var27 = (-param10 + param16 << 2108805104) / var35;
                          var23 = (param14 - param0 << 1853214672) / var35;
                          var33 = 0;
                          break L5;
                        } else {
                          var28 = (-param10 + param16 << 489150864) / var35;
                          var32 = (param7 - param13 << -1019485584) / var35;
                          var27 = (param11 + -param10 << 685222224) / var34;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var33 = 1;
                          var24 = (param14 - param0 << 1074446416) / var35;
                          var31 = (param4 - param13 << -822213712) / var34;
                          var23 = (param2 + -param0 << 494862928) / var34;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (-1 >= (param15 ^ -1)) {
                            break L7;
                          } else {
                            if (0 <= param12) {
                              param15 = -param15;
                              var30 = var30 + param15 * var32;
                              var25 = var25 + var27 * param15;
                              var21 = var21 + param15 * var23;
                              var17_int = var17_int + var19 * param15;
                              var26 = var26 + param15 * var28;
                              var22 = var22 + param15 * var24;
                              var18 = var18 + var20 * param15;
                              var29 = var29 + var31 * param15;
                              param15 = 0;
                              break L7;
                            } else {
                              param15 = param12 - param15;
                              var18 = var18 + var20 * param15;
                              var22 = var22 + param15 * var24;
                              var25 = var25 + var27 * param15;
                              var26 = var26 + param15 * var28;
                              var30 = var30 + param15 * var32;
                              var21 = var21 + param15 * var23;
                              var17_int = var17_int + var19 * param15;
                              var29 = var29 + param15 * var31;
                              param15 = param12;
                              break L6;
                            }
                          }
                        }
                        var36 = li.field_a[param15];
                        L8: while (true) {
                          if (param15 >= param12) {
                            break L6;
                          } else {
                            L9: {
                              var37 = var17_int >> -1943395408;
                              if (li.field_i > var37) {
                                var38 = (var18 >> -1876583888) + -(var17_int >> -1277247312);
                                if (0 == var38) {
                                  if (var37 < 0) {
                                    break L9;
                                  } else {
                                    if (li.field_i <= var37) {
                                      break L9;
                                    } else {
                                      sg.a(0, var37 - -var36, 0, var25, 0, param8, var38, var29, param5 ^ 122, var21);
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    var39 = (var22 - var21) / var38;
                                    var40 = (var26 + -var25) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (li.field_i <= var37 - -var38) {
                                      var38 = -1 + (-var37 + li.field_i);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if ((var37 ^ -1) <= -1) {
                                    sg.a(var41, var36 + var37, var39, var25, var40, param8, var38, var29, -123, var21);
                                    break L9;
                                  } else {
                                    sg.a(var41, var36, var39, -(var37 * var40) + var25, var40, param8, var38 - -var37, var29 - var41 * var37, param5 ^ 126, -(var37 * var39) + var21);
                                    break L9;
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param15++;
                            if (li.field_d <= param15) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var17_int = var17_int + var19;
                              var30 = var30 + var32;
                              var21 = var21 + var23;
                              var36 = var36 + tc.field_j;
                              var26 = var26 + var28;
                              var22 = var22 + var24;
                              var25 = var25 + var27;
                              var29 = var29 + var31;
                              var18 = var18 + var20;
                              continue L8;
                            }
                          }
                        }
                      }
                      var36 = param1 - param12;
                      if (var36 == 0) {
                        var27 = 0;
                        var20 = 0;
                        var23 = 0;
                        var32 = 0;
                        var19 = 0;
                        var24 = 0;
                        var31 = 0;
                        var28 = 0;
                        break L4;
                      } else {
                        L11: {
                          var37 = param6 << 425110896;
                          var38 = param2 << 74881232;
                          var39 = param11 << 1092937296;
                          var40 = param4 << 74191888;
                          if (var33 != 0) {
                            var18 = param3 << -222780176;
                            var22 = param14 << -457945520;
                            var26 = param16 << -754077296;
                            var30 = param7 << -1404679280;
                            break L11;
                          } else {
                            var21 = param14 << -33179088;
                            var29 = param7 << 1949330960;
                            var25 = param16 << 1559195344;
                            var17_int = param3 << 1704091376;
                            break L11;
                          }
                        }
                        var31 = (-var29 + var40) / var36;
                        var20 = (-var18 + var37) / var36;
                        var24 = (-var22 + var38) / var36;
                        var23 = (-var21 + var38) / var36;
                        var27 = (var39 - var25) / var36;
                        var19 = (var37 - var17_int) / var36;
                        var32 = (-var30 + var40) / var36;
                        var28 = (-var26 + var39) / var36;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param15 != param1) {
                          var35 = -param12 + param1;
                          if (param9 >= param3) {
                            var26 = param10 << -1742986288;
                            var30 = param13 << -845953264;
                            var17_int = param3 << -1279724112;
                            var25 = param16 << 709886864;
                            var20 = (-param9 + param6 << -1396669744) / var34;
                            var28 = (param11 - param10 << -2089543184) / var34;
                            var24 = (param2 - param0 << -424391728) / var34;
                            var32 = (-param13 + param4 << 611830704) / var34;
                            var21 = param14 << -1798404944;
                            var31 = (-param7 + param4 << -1186895120) / var35;
                            var22 = param0 << 758007760;
                            var27 = (param11 + -param16 << 719261424) / var35;
                            var29 = param7 << 864882000;
                            var19 = (param6 + -param3 << -507499792) / var35;
                            var23 = (param2 - param14 << -2060889456) / var35;
                            var18 = param9 << 959923536;
                            break L12;
                          } else {
                            var31 = (-param13 + param4 << 699985552) / var34;
                            var24 = (param2 - param14 << -1863164144) / var35;
                            var17_int = param9 << -1623993168;
                            var20 = (param6 - param3 << -988361648) / var35;
                            var32 = (-param7 + param4 << 100658640) / var35;
                            var27 = (-param10 + param11 << 1142973008) / var34;
                            var18 = param3 << 1900660752;
                            var25 = param10 << -1237456272;
                            var26 = param16 << -148173392;
                            var22 = param14 << -1381901168;
                            var28 = (-param16 + param11 << -928892240) / var35;
                            var23 = (-param0 + param2 << 1305293168) / var34;
                            var21 = param0 << 266589264;
                            var29 = param13 << 1088985360;
                            var19 = (param6 + -param9 << 297551888) / var34;
                            var30 = param7 << -1324773456;
                            break L12;
                          }
                        } else {
                          var26 = param16;
                          var20 = 0;
                          var28 = 0;
                          var24 = 0;
                          var19 = 0;
                          var31 = 0;
                          var22 = param14;
                          var30 = param7;
                          var21 = param0;
                          var25 = param10;
                          var23 = 0;
                          var18 = param3 << -514905648;
                          var17_int = param9 << 640613776;
                          var27 = 0;
                          var29 = param13;
                          var32 = 0;
                          break L12;
                        }
                      }
                      var33 = 0;
                      if ((param15 ^ -1) > -1) {
                        param15 = Math.min(-param15, -param15 + param12);
                        var18 = var18 + var20 * param15;
                        var21 = var21 + var23 * param15;
                        var17_int = var17_int + var19 * param15;
                        var22 = var22 + var24 * param15;
                        var30 = var30 + var32 * param15;
                        var25 = var25 + param15 * var27;
                        var29 = var29 + var31 * param15;
                        var26 = var26 + var28 * param15;
                        param15 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if ((param15 ^ -1) <= -1) {
                      break L13;
                    } else {
                      param15 = -param15;
                      var18 = var18 + var20 * param15;
                      var21 = var21 + param15 * var23;
                      var26 = var26 + var28 * param15;
                      var22 = var22 + var24 * param15;
                      var25 = var25 + var27 * param15;
                      var17_int = var17_int + var19 * param15;
                      var30 = var30 + param15 * var32;
                      var29 = var29 + param15 * var31;
                      param15 = 0;
                      break L13;
                    }
                  }
                  var35 = li.field_a[param15];
                  L14: while (true) {
                    if (param15 >= param1) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L15: {
                        var36 = var17_int >> 499799824;
                        if (li.field_i <= var36) {
                          break L15;
                        } else {
                          var37 = (var18 >> -170016432) + -(var17_int >> -25708016);
                          if (-1 == (var37 ^ -1)) {
                            if (var36 < 0) {
                              break L15;
                            } else {
                              if (li.field_i > var36) {
                                sg.a(0, var36 - -var35, 0, var25, 0, param8, var37, var29, -127, var21);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          } else {
                            L16: {
                              var38 = (var22 + -var21) / var37;
                              var39 = (var26 + -var25) / var37;
                              var40 = (-var29 + var30) / var37;
                              if (li.field_i <= var37 + var36) {
                                var37 = li.field_i + (-var36 + -1);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (0 > var36) {
                              sg.a(var40, var35, var38, var25 - var39 * var36, var39, param8, var37 - -var36, var29 + -(var40 * var36), -118, var21 - var36 * var38);
                              break L15;
                            } else {
                              sg.a(var40, var35 + var36, var38, var25, var39, param8, var37, var29, param5 ^ 121, var21);
                              break L15;
                            }
                          }
                        }
                      }
                      param15++;
                      if (param15 >= li.field_d) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var25 = var25 + var27;
                        var29 = var29 + var31;
                        var18 = var18 + var20;
                        var17_int = var17_int + var19;
                        var35 = var35 + tc.field_j;
                        var30 = var30 + var32;
                        var21 = var21 + var23;
                        var26 = var26 + var28;
                        var22 = var22 + var24;
                        continue L14;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var17 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var17);
            stackOut_75_1 = new StringBuilder().append("fe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param8 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L17;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L17;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static k a(byte[] param0, int param1) {
        k discarded$2 = null;
        k var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        k stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        k stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 1092937296) {
                  break L1;
                } else {
                  var3 = (byte[]) null;
                  discarded$2 = fe.a((byte[]) null, -47);
                  break L1;
                }
              }
              var2 = new k(param0, la.field_j, wb.field_g, nk.field_K, ad.field_d, dd.field_E, lk.field_e);
              tk.a(false);
              stackOut_5_0 = (k) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("fe.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        if (param0 != -754077296) {
            fe.a(-97, 113, 16, 125, -102, -116, 48, -40, (int[]) null, -2, -100, 114, 61, -5, 101, 85, 23);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_a = "SUV";
    }
}
