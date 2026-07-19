/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int[] param15, int param16) {
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
        int[] var43 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var42 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param9) {
                break L1;
              } else {
                if (param11 >= ig.field_d) {
                  break L1;
                } else {
                  L2: {
                    if ((param4 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if ((param12 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (-1 >= (param5 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ig.field_g > param4) {
                      break L3;
                    } else {
                      if (ig.field_g > param12) {
                        break L3;
                      } else {
                        if (param5 < ig.field_g) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    var34 = -param11 + param9;
                    if (param13) {
                      break L4;
                    } else {
                      var43 = (int[]) null;
                      ld.a(29, 6, -127, -98, -7, 42, 31, -8, 40, -32, 19, -107, 30, true, 124, (int[]) null, -97);
                      break L4;
                    }
                  }
                  L5: {
                    if (param8 != param11) {
                      L6: {
                        var26 = param2 << 1625176720;
                        var25 = param2 << 1625176720;
                        var18 = param4 << -1688661392;
                        var17_int = param4 << -1688661392;
                        var22 = param6 << 228912752;
                        var21 = param6 << 228912752;
                        var30 = param10 << 201344016;
                        var29 = param10 << 201344016;
                        var35 = -param11 + param8;
                        var20 = (-param4 + param5 << -1262249776) / var34;
                        var19 = (-param4 + param12 << 1175311440) / var35;
                        if (var20 > var19) {
                          var24 = (-param6 + param1 << -1145027792) / var34;
                          var27 = (-param2 + param3 << -1827033616) / var35;
                          var32 = (param16 + -param10 << -11204048) / var34;
                          var33 = 0;
                          var31 = (-param10 + param0 << 2083775888) / var35;
                          var28 = (-param2 + param14 << -753356048) / var34;
                          var23 = (param7 + -param6 << 1302085712) / var35;
                          break L6;
                        } else {
                          var28 = (-param2 + param3 << 1874226128) / var35;
                          var31 = (param16 + -param10 << -1948703760) / var34;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var27 = (-param2 + param14 << 1664762320) / var34;
                          var23 = (param1 + -param6 << -789599888) / var34;
                          var33 = 1;
                          var24 = (param7 - param6 << -2107587632) / var35;
                          var32 = (-param10 + param0 << 251301584) / var35;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if ((param11 ^ -1) > -1) {
                            if (-1 >= (param8 ^ -1)) {
                              param11 = -param11;
                              var18 = var18 + var20 * param11;
                              var30 = var30 + param11 * var32;
                              var26 = var26 + param11 * var28;
                              var25 = var25 + param11 * var27;
                              var22 = var22 + param11 * var24;
                              var17_int = var17_int + var19 * param11;
                              var29 = var29 + var31 * param11;
                              var21 = var21 + var23 * param11;
                              param11 = 0;
                              break L8;
                            } else {
                              param11 = -param11 + param8;
                              var21 = var21 + var23 * param11;
                              var18 = var18 + param11 * var20;
                              var25 = var25 + param11 * var27;
                              var22 = var22 + var24 * param11;
                              var26 = var26 + var28 * param11;
                              var30 = var30 + var32 * param11;
                              var29 = var29 + param11 * var31;
                              var17_int = var17_int + var19 * param11;
                              param11 = param8;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var36 = ig.field_i[param11];
                        L9: while (true) {
                          if (param8 <= param11) {
                            break L7;
                          } else {
                            L10: {
                              var37 = var17_int >> -1228364368;
                              if (var37 >= ig.field_g) {
                                break L10;
                              } else {
                                var38 = (var18 >> -353253680) - (var17_int >> 421531120);
                                if (0 != var38) {
                                  L11: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (ig.field_g > var37 - -var38) {
                                      break L11;
                                    } else {
                                      var38 = -var37 + (ig.field_g - 1);
                                      break L11;
                                    }
                                  }
                                  if (0 > var37) {
                                    al.a(var41, var37 + var38, var21 - var37 * var39, var29 - var41 * var37, var40, var39, param15, -1, var36, -(var40 * var37) + var25);
                                    break L10;
                                  } else {
                                    al.a(var41, var38, var21, var29, var40, var39, param15, -1, var37 + var36, var25);
                                    break L10;
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L10;
                                  } else {
                                    if (ig.field_g > var37) {
                                      al.a(0, var38, var21, var29, 0, 0, param15, -1, var37 - -var36, var25);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            param11++;
                            if (param11 >= ig.field_d) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var17_int = var17_int + var19;
                              var36 = var36 + ll.field_d;
                              var25 = var25 + var27;
                              var29 = var29 + var31;
                              var30 = var30 + var32;
                              var18 = var18 + var20;
                              var26 = var26 + var28;
                              var21 = var21 + var23;
                              var22 = var22 + var24;
                              continue L9;
                            }
                          }
                        }
                      }
                      var36 = param9 - param8;
                      if (0 != var36) {
                        L12: {
                          var37 = param5 << -379103248;
                          var38 = param1 << 1207346352;
                          var39 = param14 << -1007307184;
                          if (var33 == 0) {
                            var17_int = param12 << -1389993520;
                            var29 = param0 << 1024600112;
                            var25 = param3 << 1509646224;
                            var21 = param7 << -1672142224;
                            break L12;
                          } else {
                            var26 = param3 << -1500736560;
                            var30 = param0 << -156956656;
                            var18 = param12 << 222157904;
                            var22 = param7 << -1848729776;
                            break L12;
                          }
                        }
                        var40 = param16 << -485646640;
                        var19 = (var37 - var17_int) / var36;
                        var27 = (-var25 + var39) / var36;
                        var24 = (var38 - var22) / var36;
                        var23 = (var38 + -var21) / var36;
                        var31 = (var40 - var29) / var36;
                        var32 = (-var30 + var40) / var36;
                        var20 = (-var18 + var37) / var36;
                        var28 = (var39 + -var26) / var36;
                        break L5;
                      } else {
                        var28 = 0;
                        var24 = 0;
                        var27 = 0;
                        var23 = 0;
                        var20 = 0;
                        var32 = 0;
                        var19 = 0;
                        var31 = 0;
                        break L5;
                      }
                    } else {
                      L13: {
                        if (param9 != param11) {
                          var35 = -param8 + param9;
                          if (param12 <= param4) {
                            var18 = param4 << -1534683312;
                            var25 = param3 << 587244752;
                            var27 = (-param3 + param14 << -981958800) / var35;
                            var30 = param10 << 181780080;
                            var32 = (-param10 + param16 << 1319463856) / var34;
                            var29 = param0 << 1254808816;
                            var21 = param7 << 927486480;
                            var20 = (param5 + -param4 << 700819920) / var34;
                            var31 = (param16 + -param0 << -1980283248) / var35;
                            var28 = (param14 - param2 << -1206491280) / var34;
                            var19 = (param5 - param12 << -1814944144) / var35;
                            var23 = (param1 + -param7 << -1557437968) / var35;
                            var17_int = param12 << -1203981200;
                            var26 = param2 << -894218768;
                            var24 = (param1 - param6 << 1819999696) / var34;
                            var22 = param6 << -563299120;
                            break L13;
                          } else {
                            var18 = param12 << 1596815376;
                            var22 = param7 << -1266909072;
                            var23 = (param1 - param6 << 116945584) / var34;
                            var25 = param2 << 1365586672;
                            var31 = (-param10 + param16 << -2138192368) / var34;
                            var32 = (param16 - param0 << -1397033200) / var35;
                            var26 = param3 << -287116016;
                            var21 = param6 << 234369616;
                            var27 = (param14 + -param2 << -645824688) / var34;
                            var19 = (-param4 + param5 << 1307456208) / var34;
                            var24 = (-param7 + param1 << 1718380656) / var35;
                            var28 = (param14 + -param3 << -354608272) / var35;
                            var29 = param10 << -208942096;
                            var17_int = param4 << -236359120;
                            var20 = (param5 + -param12 << -1678917744) / var35;
                            var30 = param0 << -1335100144;
                            break L13;
                          }
                        } else {
                          var28 = 0;
                          var17_int = param4 << -489886832;
                          var18 = param12 << 314165008;
                          var20 = 0;
                          var24 = 0;
                          var30 = param0;
                          var26 = param3;
                          var29 = param10;
                          var23 = 0;
                          var27 = 0;
                          var32 = 0;
                          var25 = param2;
                          var31 = 0;
                          var19 = 0;
                          var21 = param6;
                          var22 = param7;
                          break L13;
                        }
                      }
                      var33 = 0;
                      if (0 > param11) {
                        param11 = Math.min(-param11, -param11 + param8);
                        var22 = var22 + param11 * var24;
                        var26 = var26 + var28 * param11;
                        var21 = var21 + param11 * var23;
                        var29 = var29 + param11 * var31;
                        var17_int = var17_int + var19 * param11;
                        var18 = var18 + var20 * param11;
                        var30 = var30 + var32 * param11;
                        var25 = var25 + param11 * var27;
                        param11 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (param11 >= 0) {
                      break L14;
                    } else {
                      param11 = -param11;
                      var21 = var21 + var23 * param11;
                      var22 = var22 + var24 * param11;
                      var17_int = var17_int + param11 * var19;
                      var25 = var25 + var27 * param11;
                      var18 = var18 + var20 * param11;
                      var26 = var26 + param11 * var28;
                      var29 = var29 + var31 * param11;
                      var30 = var30 + param11 * var32;
                      param11 = 0;
                      break L14;
                    }
                  }
                  var35 = ig.field_i[param11];
                  L15: while (true) {
                    if (param9 <= param11) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var36 = var17_int >> 2006442192;
                        if (var36 >= ig.field_g) {
                          break L16;
                        } else {
                          var37 = -(var17_int >> -624400656) + (var18 >> -1216263344);
                          if (0 == var37) {
                            if ((var36 ^ -1) > -1) {
                              break L16;
                            } else {
                              if (var36 < ig.field_g) {
                                al.a(0, var37, var21, var29, 0, 0, param15, -1, var35 + var36, var25);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (var26 + -var25) / var37;
                              var40 = (-var29 + var30) / var37;
                              if (var37 + var36 >= ig.field_g) {
                                var37 = -1 + -var36 + ig.field_g;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if ((var36 ^ -1) > -1) {
                              al.a(var40, var36 + var37, var21 + -(var36 * var38), -(var40 * var36) + var29, var39, var38, param15, -1, var35, -(var36 * var39) + var25);
                              break L16;
                            } else {
                              al.a(var40, var37, var21, var29, var39, var38, param15, -1, var36 - -var35, var25);
                              break L16;
                            }
                          }
                        }
                      }
                      param11++;
                      if (ig.field_d <= param11) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var18 = var18 + var20;
                        var35 = var35 + ll.field_d;
                        var17_int = var17_int + var19;
                        var26 = var26 + var28;
                        var22 = var22 + var24;
                        var29 = var29 + var31;
                        var21 = var21 + var23;
                        var25 = var25 + var27;
                        var30 = var30 + var32;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var17 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var17);
            stackOut_78_1 = new StringBuilder().append("ld.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param15 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L18;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L18;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param16 + ')');
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

    public static void a(int param0) {
        if (param0 != -16723) {
            field_a = (String) null;
        }
        field_a = null;
    }

    final static void a(boolean param0, boolean param1) {
        sa.field_Q.a(param0, param1);
        if (!param1) {
            ld.a(false, true);
        }
    }

    final static void a(int param0, byte param1) {
        ee.field_f = TrackController.field_E[param0];
        if (param1 != -29) {
            return;
        }
        pc.field_t = ea.field_u[param0];
        jb.field_c = ff.field_c[param0];
    }

    static {
        field_a = "Unpacking sound effects";
    }
}
