/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends kd {
    int field_i;
    int field_l;
    static boolean field_k;
    int field_n;
    int[] field_h;
    static int field_o;
    int field_p;
    int field_m;
    int field_j;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
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
        var42 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (k.field_d > param3) {
                  L2: {
                    if (0 <= param13) {
                      break L2;
                    } else {
                      if (-1 >= (param9 ^ -1)) {
                        break L2;
                      } else {
                        if (0 > param16) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if ((k.field_f ^ -1) < (param13 ^ -1)) {
                      break L3;
                    } else {
                      if ((k.field_f ^ -1) < (param9 ^ -1)) {
                        break L3;
                      } else {
                        if (param16 >= k.field_f) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param12 == -1464114640) {
                    L4: {
                      L5: {
                        var34 = param1 - param3;
                        if (param6 == param3) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var30 = param7 << -784694448;
                              var29 = param7 << -784694448;
                              var26 = param11 << 1301668912;
                              var25 = param11 << 1301668912;
                              var18 = param13 << 1694128400;
                              var17_int = param13 << 1694128400;
                              var22 = param5 << 1872127760;
                              var21 = param5 << 1872127760;
                              var35 = param6 - param3;
                              var19 = (param9 + -param13 << 2001023408) / var35;
                              var20 = (param16 - param13 << -1790780656) / var34;
                              if (var19 >= var20) {
                                break L7;
                              } else {
                                var32 = (param8 + -param7 << -446993904) / var34;
                                var23 = (param10 - param5 << 47289776) / var35;
                                var27 = (param15 + -param11 << -1464114640) / var35;
                                var31 = (-param7 + param14 << 1823951472) / var35;
                                var24 = (param0 + -param5 << 1984144976) / var34;
                                var33 = 0;
                                var28 = (param2 + -param11 << -1239474064) / var34;
                                if (var42 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var27 = (param2 - param11 << -1449691728) / var34;
                            var31 = (-param7 + param8 << -2080218160) / var34;
                            var24 = (-param5 + param10 << -1432025744) / var35;
                            var36 = var19;
                            var19 = var20;
                            var20 = var36;
                            var33 = 1;
                            var23 = (param0 - param5 << -1854740816) / var34;
                            var32 = (param14 + -param7 << 1683830992) / var35;
                            var28 = (param15 + -param11 << -679402832) / var35;
                            break L6;
                          }
                          L8: {
                            L9: {
                              L10: {
                                if (param3 < 0) {
                                  L11: {
                                    if (-1 >= (param6 ^ -1)) {
                                      break L11;
                                    } else {
                                      param3 = -param3 + param6;
                                      var18 = var18 + var20 * param3;
                                      var25 = var25 + var27 * param3;
                                      var21 = var21 + param3 * var23;
                                      var30 = var30 + var32 * param3;
                                      var26 = var26 + var28 * param3;
                                      var17_int = var17_int + param3 * var19;
                                      var29 = var29 + param3 * var31;
                                      var22 = var22 + var24 * param3;
                                      param3 = param6;
                                      if (var42 == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param3 = -param3;
                                  var29 = var29 + var31 * param3;
                                  var26 = var26 + param3 * var28;
                                  var22 = var22 + var24 * param3;
                                  var21 = var21 + param3 * var23;
                                  var30 = var30 + var32 * param3;
                                  var17_int = var17_int + param3 * var19;
                                  var25 = var25 + param3 * var27;
                                  var18 = var18 + param3 * var20;
                                  param3 = 0;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var36 = k.field_e[param3];
                              L12: while (true) {
                                if ((param6 ^ -1) >= (param3 ^ -1)) {
                                  break L9;
                                } else {
                                  var37 = var17_int >> 503428368;
                                  stackIn_45_0 = var37;

                                  stackIn_45_1 = k.field_f;

                                  if (var42 != 0) {
                                    break L8;
                                  } else {
                                    L13: {
                                      if (stackIn_45_0 < stackIn_45_1) {
                                        L14: {
                                          var38 = -(var17_int >> 518468912) + (var18 >> 1155114352);
                                          if (var38 == 0) {
                                            break L14;
                                          } else {
                                            L15: {
                                              var39 = (var22 - var21) / var38;
                                              var40 = (var26 - var25) / var38;
                                              var41 = (-var29 + var30) / var38;
                                              if (var37 - -var38 < k.field_f) {
                                                break L15;
                                              } else {
                                                var38 = k.field_f - var37 - 1;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              L17: {
                                                if (var37 < 0) {
                                                  break L17;
                                                } else {
                                                  vb.a(var39, var25, var38, var41, var21, (byte) -95, param4, var40, var36 + var37, var29);
                                                  if (var42 == 0) {
                                                    break L16;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              vb.a(var39, -(var40 * var37) + var25, var38 - -var37, var41, var21 + -(var37 * var39), (byte) -95, param4, var40, var36, var29 + -(var41 * var37));
                                              break L16;
                                            }
                                            if (var42 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (0 > var37) {
                                          break L13;
                                        } else {
                                          if ((k.field_f ^ -1) >= (var37 ^ -1)) {
                                            break L13;
                                          } else {
                                            vb.a(0, var25, var38, 0, var21, (byte) -95, param4, 0, var37 - -var36, var29);
                                            break L13;
                                          }
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    param3++;
                                    if ((param3 ^ -1) > (k.field_d ^ -1)) {
                                      var21 = var21 + var23;
                                      var22 = var22 + var24;
                                      var26 = var26 + var28;
                                      var30 = var30 + var32;
                                      var29 = var29 + var31;
                                      var17_int = var17_int + var19;
                                      var36 = var36 + lf.field_f;
                                      var18 = var18 + var20;
                                      var25 = var25 + var27;
                                      if (var42 == 0) {
                                        continue L12;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                            var36 = param1 - param6;
                            stackIn_45_0 = var36 ^ -1;
                            stackIn_45_1 = -1;
                            break L8;
                          }
                          L18: {
                            L19: {
                              if (stackIn_45_0 != stackIn_45_1) {
                                break L19;
                              } else {
                                var24 = 0;
                                var23 = 0;
                                var27 = 0;
                                var19 = 0;
                                var32 = 0;
                                var20 = 0;
                                var28 = 0;
                                var31 = 0;
                                if (var42 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              L21: {
                                var37 = param16 << 1417813520;
                                var38 = param0 << 221873008;
                                var39 = param2 << -1191438576;
                                if (var33 != 0) {
                                  break L21;
                                } else {
                                  var21 = param10 << -866746736;
                                  var29 = param14 << -264827472;
                                  var17_int = param9 << 1065624656;
                                  var25 = param15 << 1937650960;
                                  if (var42 == 0) {
                                    break L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              var22 = param10 << 1408694288;
                              var18 = param9 << 1355062160;
                              var30 = param14 << 946440112;
                              var26 = param15 << -748447760;
                              break L20;
                            }
                            var40 = param8 << -110867504;
                            var20 = (var37 + -var18) / var36;
                            var24 = (-var22 + var38) / var36;
                            var31 = (-var29 + var40) / var36;
                            var27 = (-var25 + var39) / var36;
                            var28 = (var39 + -var26) / var36;
                            var19 = (-var17_int + var37) / var36;
                            var23 = (var38 + -var21) / var36;
                            var32 = (var40 - var30) / var36;
                            break L18;
                          }
                          if (var42 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L22: {
                        L23: {
                          if ((param3 ^ -1) != (param1 ^ -1)) {
                            break L23;
                          } else {
                            var18 = param9 << 295157488;
                            var26 = param15;
                            var28 = 0;
                            var27 = 0;
                            var25 = param11;
                            var30 = param14;
                            var31 = 0;
                            var32 = 0;
                            var23 = 0;
                            var19 = 0;
                            var20 = 0;
                            var21 = param5;
                            var24 = 0;
                            var17_int = param13 << 655450704;
                            var29 = param7;
                            var22 = param10;
                            if (var42 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          var35 = param1 - param6;
                          if ((param9 ^ -1) >= (param13 ^ -1)) {
                            break L24;
                          } else {
                            var24 = (param0 - param10 << -545221616) / var35;
                            var30 = param14 << 2014944720;
                            var26 = param15 << -56450384;
                            var25 = param11 << -820185072;
                            var21 = param5 << -480064880;
                            var23 = (-param5 + param0 << 264325072) / var34;
                            var17_int = param13 << -1973324976;
                            var28 = (param2 + -param15 << -1763662576) / var35;
                            var32 = (param8 + -param14 << 612568368) / var35;
                            var29 = param7 << 1471051952;
                            var22 = param10 << -531647632;
                            var27 = (param2 + -param11 << -1438801616) / var34;
                            var31 = (param8 + -param7 << -1435885904) / var34;
                            var18 = param9 << 1128041360;
                            var19 = (param16 + -param13 << 1924839280) / var34;
                            var20 = (-param9 + param16 << -1450193040) / var35;
                            if (var42 == 0) {
                              break L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var26 = param11 << 1895570928;
                        var17_int = param9 << 1804481296;
                        var24 = (param0 - param5 << -1766099856) / var34;
                        var18 = param13 << 2140033968;
                        var20 = (param16 + -param13 << 2069455504) / var34;
                        var27 = (-param15 + param2 << -2038519536) / var35;
                        var21 = param10 << 623532080;
                        var25 = param15 << 1117346256;
                        var22 = param5 << -923417616;
                        var29 = param14 << 1267713040;
                        var28 = (param2 - param11 << 1227442032) / var34;
                        var19 = (-param9 + param16 << -1461491280) / var35;
                        var23 = (-param10 + param0 << -1617051568) / var35;
                        var32 = (-param7 + param8 << 273147024) / var34;
                        var31 = (param8 + -param14 << -1175046704) / var35;
                        var30 = param7 << 921511408;
                        break L22;
                      }
                      var33 = 0;
                      if ((param3 ^ -1) <= -1) {
                        break L4;
                      } else {
                        param3 = Math.min(-param3, -param3 + param6);
                        var30 = var30 + param3 * var32;
                        var25 = var25 + param3 * var27;
                        var22 = var22 + var24 * param3;
                        var29 = var29 + param3 * var31;
                        var18 = var18 + param3 * var20;
                        var21 = var21 + param3 * var23;
                        var17_int = var17_int + param3 * var19;
                        var26 = var26 + param3 * var28;
                        param3 = 0;
                        break L4;
                      }
                    }
                    L25: {
                      if ((param3 ^ -1) <= -1) {
                        break L25;
                      } else {
                        param3 = -param3;
                        var26 = var26 + var28 * param3;
                        var25 = var25 + var27 * param3;
                        var18 = var18 + var20 * param3;
                        var30 = var30 + var32 * param3;
                        var21 = var21 + param3 * var23;
                        var29 = var29 + param3 * var31;
                        var17_int = var17_int + var19 * param3;
                        var22 = var22 + var24 * param3;
                        param3 = 0;
                        break L25;
                      }
                    }
                    var35 = k.field_e[param3];
                    L26: while (true) {
                      L27: {
                        L28: {
                          if (param1 <= param3) {
                            break L28;
                          } else {
                            var36 = var17_int >> -798359184;
                            if (var42 != 0) {
                              break L27;
                            } else {
                              L29: {
                                if (k.field_f > var36) {
                                  L30: {
                                    var37 = (var18 >> 159836240) - (var17_int >> -1229344336);
                                    if ((var37 ^ -1) != -1) {
                                      break L30;
                                    } else {
                                      if (var36 < 0) {
                                        break L29;
                                      } else {
                                        if ((var36 ^ -1) > (k.field_f ^ -1)) {
                                          vb.a(0, var25, var37, 0, var21, (byte) -95, param4, 0, var36 + var35, var29);
                                          if (var42 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                  }
                                  L31: {
                                    var38 = (var22 - var21) / var37;
                                    var39 = (-var25 + var26) / var37;
                                    var40 = (var30 - var29) / var37;
                                    if (var37 + var36 >= k.field_f) {
                                      var37 = k.field_f - var36 + -1;
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if ((var36 ^ -1) > -1) {
                                      break L32;
                                    } else {
                                      vb.a(var38, var25, var37, var40, var21, (byte) -95, param4, var39, var35 + var36, var29);
                                      if (var42 == 0) {
                                        break L29;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  vb.a(var38, -(var39 * var36) + var25, var36 + var37, var40, var21 - var36 * var38, (byte) -95, param4, var39, var35, -(var36 * var40) + var29);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              param3++;
                              if ((k.field_d ^ -1) >= (param3 ^ -1)) {
                                decompiledRegionSelector0 = 6;
                                break L0;
                              } else {
                                var25 = var25 + var27;
                                var17_int = var17_int + var19;
                                var29 = var29 + var31;
                                var22 = var22 + var24;
                                var18 = var18 + var20;
                                var30 = var30 + var32;
                                var35 = var35 + lf.field_f;
                                var26 = var26 + var28;
                                var21 = var21 + var23;
                                if (var42 == 0) {
                                  continue L26;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                        }
                        break L27;
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
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
          L33: {
            var17 = decompiledCaughtException;
            stackIn_85_0 = (RuntimeException) (var17);

            stackIn_85_1 = new StringBuilder().append("ul.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L33;
            } else {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L33;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    final static int a(nc param0, sj param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param1.field_n) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param1.field_h ^ -1) != (param0.field_k ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var4_int = param0.field_m.length;
                        var5 = param1.field_n[param3].length / var4_int;
                        if (param2 >= 44) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ul.a(-76, -113, 52, -107, (int[]) null, 3, 112, 69, -116, -97, 14, -59, 65, 10, -40, 3, 50);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var5 ^ -1) >= (var6 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_29_0 = (param0.field_h < param1.field_i[param3][var6] ? -1 : (param0.field_h == param1.field_i[param3][var6] ? 0 : 1));
                        stackIn_13_0 = stackIn_29_0;
                        if (var8 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (md.a(param1.field_j[param3][var6], -98)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var4_int ^ -1) >= (var7 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_26_0 = param1.field_n[param3][var7 + var4_int * var6] ^ -1;
                        stackIn_22_0 = stackIn_26_0;
                        if (var8 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != (param0.field_m[var7] ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = var6;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var4);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("ul.E(");
                    stackIn_31_1 = stackIn_32_1;
                    if (param0 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_0 = stackIn_35_0;
                    stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
                    stackIn_34_1 = stackIn_35_1;
                    if (param1 == null) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    throw ld.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_n = param3;
        if (param2 != 0) {
            return;
        }
        try {
            this.field_i = param4;
            this.field_j = param5;
            this.field_h = param0;
            this.field_l = param7;
            this.field_p = param1;
            this.field_m = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(sh param0, sh param1, sh param2, byte param3) {
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        jb[] var5 = null;
        jb[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        jb[] var10 = null;
        int var11_int = 0;
        db var11 = null;
        int var12 = 0;
        db var13 = null;
        int var14 = 0;
        jb[] var15 = null;
        db var16 = null;
        int[][] var17 = null;
        db var18 = null;
        db var19 = null;
        int[][] var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ti.field_I = td.a("commonui", "frame_top", param0, 22306);
                        we.field_i = td.a("commonui", "frame_bottom", param0, 22306);
                        Lexicominos.field_I = df.a("commonui", "jagex_logo_grey", param0, (byte) -123);
                        uc.field_hb = td.a("commonui", "button", param0, 22306);
                        be.field_b = uk.a("validation", "commonui", -909811167, param0);
                        cl.field_T = (le) ((Object) ee.a("commonui", "arezzo12", false, param1, param0));
                        ql.field_Q = (le) ((Object) ee.a("commonui", "arezzo14", false, param1, param0));
                        ra.field_c = (le) ((Object) ee.a("commonui", "arezzo14bold", false, param1, param0));
                        var18 = new db(param2.a((byte) 127, "", "button.gif"), (java.awt.Component) ((Object) ug.field_y));
                        nh.a("commonui", param0, false, "dropdown");
                        var5 = wf.a(param0, "commonui", true, "screen_options");
                        si.field_u = new jb[4];
                        oc.field_d = new jb[4];
                        uj.field_a = new jb[4];
                        var6 = new jb[][]{uj.field_a, si.field_u, oc.field_d};
                        var20 = new int[4][];
                        var17 = var20;
                        var7 = var17;
                        var7[0] = var5[0].field_j;
                        var8 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8 >= var20.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7[var8] = (int[]) ((Object) var20[0].clone());
                        var8++;
                        if (var14 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var14 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var5[0].field_i[0];
                        var20[2][var8] = 16777215;
                        var20[1][var8] = 2394342;
                        var20[3][var8] = 4767999;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (3 <= var9) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var15 = var6[var9];
                        var10 = var15;
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var14 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11_int >= var15.length) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var15[var11_int] = bf.a(var20[var11_int], var5[var9], 0);
                        var11_int++;
                        if (var14 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var14 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var14 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = var18.field_u;
                        ja.b((byte) -116);
                        var18.b();
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        lf.b(stackIn_18_0, 0, lf.field_f, lf.field_a);
                        var16 = new db(var9, var9);
                        var19 = var16;
                        var19.b();
                        var18.b(0, 0);
                        var11 = new db(var9, var9);
                        var11.b();
                        var18.b(-var18.field_p + var9, 0);
                        var12 = -33 / ((param3 - 38) / 59);
                        var13 = new db(var18.field_p + -(var9 * 2), var9);
                        var13.b();
                        var18.b(-var9, 0);
                        pd.a(-22949);
                        uc.field_hb = new db[]{var16, var13, var11};
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var4);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("ul.B(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 14080) {
              try {
                L1: {
                  if (!ab.field_b.startsWith("win")) {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L1;
                  } else {
                    L2: {
                      if (param0.startsWith("http://")) {
                        break L2;
                      } else {
                        if (param0.startsWith("https://")) {
                          break L2;
                        } else {
                          stackIn_11_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L1;
                        }
                      }
                    }
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    var3 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var3 >= param0.length()) {
                            break L5;
                          } else {
                            stackIn_21_0 = var2.indexOf((int) param0.charAt(var3));

                            if (var4 != 0) {
                              break L4;
                            } else {
                              if (stackIn_21_0 == -1) {
                                stackIn_18_0 = 0;
                                decompiledRegionSelector0 = 3;
                                break L1;
                              } else {
                                var3++;
                                if (var4 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackIn_21_0 = 1;
                        break L4;
                      }
                      decompiledRegionSelector0 = 2;
                      break L1;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                stackIn_23_0 = 0;
                return stackIn_23_0 != 0;
              }
              if (decompiledRegionSelector0 == 0) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2_ref2);

            stackIn_26_1 = new StringBuilder().append("ul.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_18_0 != 0;
              }
            }
          }
        }
    }

    ul() {
    }

    static {
        field_k = true;
        field_o = 0;
    }
}
