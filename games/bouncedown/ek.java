/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ji {
    static long field_f;

    ek(long param0, String param1) {
        super(param0, param1);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        var42 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (-1 < (param12 ^ -1)) {
                break L1;
              } else {
                if (param13 >= qk.field_g) {
                  break L1;
                } else {
                  L2: {
                    if (-1 >= (param11 ^ -1)) {
                      break L2;
                    } else {
                      if (-1 >= (param10 ^ -1)) {
                        break L2;
                      } else {
                        if (-1 < (param3 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param11 < qk.field_a) {
                      break L3;
                    } else {
                      if (qk.field_a > param10) {
                        break L3;
                      } else {
                        if (qk.field_a <= param3) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var34 = -param13 + param12;
                  if (!param9) {
                    L4: {
                      if (param13 != param7) {
                        L5: {
                          var30 = param8 << -2095260016;
                          var29 = param8 << -2095260016;
                          var26 = param6 << 146079280;
                          var25 = param6 << 146079280;
                          var22 = param4 << 1288294992;
                          var21 = param4 << 1288294992;
                          var18 = param11 << 1283812240;
                          var17_int = param11 << 1283812240;
                          var35 = param7 + -param13;
                          var19 = (param10 - param11 << 1970099824) / var35;
                          var20 = (-param11 + param3 << -574179536) / var34;
                          if (var20 <= var19) {
                            var23 = (param15 - param4 << 2108966064) / var34;
                            var32 = (param16 + -param8 << -666756656) / var35;
                            var33 = 1;
                            var28 = (param2 + -param6 << 1170142000) / var35;
                            var27 = (param14 + -param6 << -209936368) / var34;
                            var36 = var19;
                            var19 = var20;
                            var20 = var36;
                            var31 = (param5 + -param8 << 1528387440) / var34;
                            var24 = (param0 - param4 << -1891291920) / var35;
                            break L5;
                          } else {
                            var24 = (-param4 + param15 << 84308144) / var34;
                            var23 = (-param4 + param0 << -1942571024) / var35;
                            var33 = 0;
                            var28 = (param14 + -param6 << 36063472) / var34;
                            var31 = (param16 - param8 << 1337901968) / var35;
                            var27 = (-param6 + param2 << -1568008976) / var35;
                            var32 = (-param8 + param5 << 549601712) / var34;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (param13 >= 0) {
                              break L7;
                            } else {
                              if (param7 < 0) {
                                param13 = -param13 + param7;
                                var26 = var26 + var28 * param13;
                                var21 = var21 + param13 * var23;
                                var30 = var30 + var32 * param13;
                                var25 = var25 + var27 * param13;
                                var22 = var22 + var24 * param13;
                                var18 = var18 + param13 * var20;
                                var17_int = var17_int + var19 * param13;
                                var29 = var29 + param13 * var31;
                                param13 = param7;
                                break L6;
                              } else {
                                param13 = -param13;
                                var21 = var21 + param13 * var23;
                                var17_int = var17_int + var19 * param13;
                                var26 = var26 + var28 * param13;
                                var30 = var30 + var32 * param13;
                                var25 = var25 + param13 * var27;
                                var18 = var18 + param13 * var20;
                                var29 = var29 + var31 * param13;
                                var22 = var22 + param13 * var24;
                                param13 = 0;
                                break L7;
                              }
                            }
                          }
                          var36 = qk.field_b[param13];
                          L8: while (true) {
                            if (param7 <= param13) {
                              break L6;
                            } else {
                              L9: {
                                var37 = var17_int >> -1195746640;
                                if (qk.field_a > var37) {
                                  var38 = (var18 >> 1807415408) + -(var17_int >> -1799602960);
                                  if (var38 == 0) {
                                    if ((var37 ^ -1) > -1) {
                                      break L9;
                                    } else {
                                      if (qk.field_a <= var37) {
                                        break L9;
                                      } else {
                                        tk.a(var38, var36 + var37, var21, (byte) -72, 0, param1, 0, var29, var25, 0);
                                        break L9;
                                      }
                                    }
                                  } else {
                                    L10: {
                                      var39 = (-var21 + var22) / var38;
                                      var40 = (var26 - var25) / var38;
                                      var41 = (var30 - var29) / var38;
                                      if (var37 - -var38 < qk.field_a) {
                                        break L10;
                                      } else {
                                        var38 = -var37 + (qk.field_a - 1);
                                        break L10;
                                      }
                                    }
                                    if ((var37 ^ -1) > -1) {
                                      tk.a(var38 + var37, var36, -(var37 * var39) + var21, (byte) -72, var39, param1, var41, -(var41 * var37) + var29, var25 - var37 * var40, var40);
                                      break L9;
                                    } else {
                                      tk.a(var38, var36 + var37, var21, (byte) -72, var39, param1, var41, var29, var25, var40);
                                      break L9;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              param13++;
                              if (param13 >= qk.field_g) {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                var17_int = var17_int + var19;
                                var21 = var21 + var23;
                                var36 = var36 + na.field_e;
                                var30 = var30 + var32;
                                var22 = var22 + var24;
                                var26 = var26 + var28;
                                var29 = var29 + var31;
                                var25 = var25 + var27;
                                var18 = var18 + var20;
                                continue L8;
                              }
                            }
                          }
                        }
                        var36 = param12 - param7;
                        if (var36 != 0) {
                          L11: {
                            var37 = param3 << 1573710416;
                            var38 = param15 << 1971791472;
                            var39 = param14 << 868479536;
                            if (var33 == 0) {
                              var29 = param16 << 493337072;
                              var17_int = param10 << 1264874480;
                              var21 = param0 << 2101835792;
                              var25 = param2 << -930395440;
                              break L11;
                            } else {
                              var18 = param10 << -2086038544;
                              var30 = param16 << -1515328048;
                              var22 = param0 << 545150864;
                              var26 = param2 << -1188276624;
                              break L11;
                            }
                          }
                          var40 = param5 << -367850000;
                          var20 = (var37 + -var18) / var36;
                          var19 = (-var17_int + var37) / var36;
                          var23 = (-var21 + var38) / var36;
                          var27 = (-var25 + var39) / var36;
                          var31 = (-var29 + var40) / var36;
                          var28 = (var39 + -var26) / var36;
                          var32 = (var40 - var30) / var36;
                          var24 = (-var22 + var38) / var36;
                          break L4;
                        } else {
                          var20 = 0;
                          var31 = 0;
                          var24 = 0;
                          var27 = 0;
                          var28 = 0;
                          var19 = 0;
                          var32 = 0;
                          var23 = 0;
                          break L4;
                        }
                      } else {
                        L12: {
                          if (param13 == param12) {
                            var21 = param4;
                            var20 = 0;
                            var25 = param6;
                            var27 = 0;
                            var28 = 0;
                            var22 = param0;
                            var29 = param8;
                            var17_int = param11 << 664960560;
                            var23 = 0;
                            var32 = 0;
                            var18 = param10 << -1139156528;
                            var26 = param2;
                            var30 = param16;
                            var19 = 0;
                            var24 = 0;
                            var31 = 0;
                            break L12;
                          } else {
                            var35 = param12 - param7;
                            if (param10 <= param11) {
                              var27 = (-param2 + param14 << 358751152) / var35;
                              var17_int = param10 << 135441072;
                              var26 = param6 << -1351672048;
                              var22 = param4 << 1793570160;
                              var29 = param16 << -1554887152;
                              var18 = param11 << -2109023184;
                              var23 = (-param0 + param15 << -938643344) / var35;
                              var28 = (-param6 + param14 << -522368464) / var34;
                              var24 = (param15 - param4 << -292471824) / var34;
                              var32 = (param5 + -param8 << -197027024) / var34;
                              var21 = param0 << -1529941200;
                              var19 = (param3 + -param10 << -1267078480) / var35;
                              var30 = param8 << -1025020816;
                              var20 = (-param11 + param3 << -141147632) / var34;
                              var31 = (-param16 + param5 << 1645963344) / var35;
                              var25 = param2 << -571118992;
                              break L12;
                            } else {
                              var21 = param4 << 994798928;
                              var25 = param6 << -99766832;
                              var19 = (param3 - param11 << 1639785488) / var34;
                              var32 = (param5 + -param16 << 207059696) / var35;
                              var23 = (param15 - param4 << 1517444816) / var34;
                              var22 = param0 << -1036566960;
                              var28 = (param14 - param2 << -644320944) / var35;
                              var24 = (-param0 + param15 << 1780231536) / var35;
                              var18 = param10 << -920980656;
                              var29 = param8 << -929818352;
                              var30 = param16 << -2027812560;
                              var20 = (-param10 + param3 << -950866480) / var35;
                              var31 = (param5 + -param8 << -454801232) / var34;
                              var26 = param2 << 2145279760;
                              var27 = (param14 - param6 << 1312716688) / var34;
                              var17_int = param11 << 1478725040;
                              break L12;
                            }
                          }
                        }
                        var33 = 0;
                        if ((param13 ^ -1) > -1) {
                          param13 = Math.min(-param13, param7 - param13);
                          var17_int = var17_int + var19 * param13;
                          var29 = var29 + param13 * var31;
                          var30 = var30 + var32 * param13;
                          var21 = var21 + var23 * param13;
                          var25 = var25 + var27 * param13;
                          var18 = var18 + var20 * param13;
                          var26 = var26 + var28 * param13;
                          var22 = var22 + var24 * param13;
                          param13 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L13: {
                      if (-1 < (param13 ^ -1)) {
                        param13 = -param13;
                        var22 = var22 + var24 * param13;
                        var21 = var21 + param13 * var23;
                        var25 = var25 + var27 * param13;
                        var26 = var26 + var28 * param13;
                        var29 = var29 + param13 * var31;
                        var18 = var18 + var20 * param13;
                        var17_int = var17_int + var19 * param13;
                        var30 = var30 + param13 * var32;
                        param13 = 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var35 = qk.field_b[param13];
                    L14: while (true) {
                      if (param13 >= param12) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L15: {
                          var36 = var17_int >> 999517456;
                          if (var36 >= qk.field_a) {
                            break L15;
                          } else {
                            var37 = -(var17_int >> -1752654320) + (var18 >> 137934128);
                            if (-1 == (var37 ^ -1)) {
                              if (-1 < (var36 ^ -1)) {
                                break L15;
                              } else {
                                if (var36 >= qk.field_a) {
                                  break L15;
                                } else {
                                  tk.a(var37, var36 + var35, var21, (byte) -72, 0, param1, 0, var29, var25, 0);
                                  break L15;
                                }
                              }
                            } else {
                              L16: {
                                var38 = (var22 - var21) / var37;
                                var39 = (var26 - var25) / var37;
                                var40 = (-var29 + var30) / var37;
                                if (qk.field_a > var37 + var36) {
                                  break L16;
                                } else {
                                  var37 = -var36 + qk.field_a - 1;
                                  break L16;
                                }
                              }
                              if ((var36 ^ -1) > -1) {
                                tk.a(var37 + var36, var35, -(var36 * var38) + var21, (byte) -72, var38, param1, var40, var29 + -(var36 * var40), -(var39 * var36) + var25, var39);
                                break L15;
                              } else {
                                tk.a(var37, var35 + var36, var21, (byte) -72, var38, param1, var40, var29, var25, var39);
                                break L15;
                              }
                            }
                          }
                        }
                        param13++;
                        if (qk.field_g > param13) {
                          var30 = var30 + var32;
                          var18 = var18 + var20;
                          var17_int = var17_int + var19;
                          var22 = var22 + var24;
                          var35 = var35 + na.field_e;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var26 = var26 + var28;
                          var21 = var21 + var23;
                          continue L14;
                        } else {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
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
            stackOut_75_1 = new StringBuilder().append("ek.B(").append(param0).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param1 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final sb b(byte param0) {
        sb discarded$0 = null;
        if (param0 > -57) {
            discarded$0 = this.b((byte) 46);
        }
        return og.field_b;
    }

    final static kf c(int param0) {
        try {
            kf discarded$2 = null;
            Throwable var1 = null;
            kf stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            kf stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    discarded$2 = ek.c(25);
                    break L1;
                  }
                }
                stackOut_2_0 = (kf) (Class.forName("af").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
