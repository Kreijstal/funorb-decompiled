/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oj {
    static String field_a;
    static java.awt.Frame field_c;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
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
        L0: {
          var42 = client.field_A ? 1 : 0;
          if (param14 < 0) {
            break L0;
          } else {
            if (param11 >= qg.field_e) {
              break L0;
            } else {
              L1: {
                if (0 <= param10) {
                  break L1;
                } else {
                  if (param4 >= 0) {
                    break L1;
                  } else {
                    if (param5 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (qg.field_a > param10) {
                  break L2;
                } else {
                  if (qg.field_a > param4) {
                    break L2;
                  } else {
                    if (qg.field_a > param5) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param7 < -32) {
                  break L3;
                } else {
                  ke discarded$1 = oj.a(false, 33);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = param14 + -param11;
                  if (param11 == param3) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var18 = param10 << -730941840;
                        var17 = param10 << -730941840;
                        var30 = param16 << 1289314096;
                        var29 = param16 << 1289314096;
                        var22 = param15 << 1566545744;
                        var21 = param15 << 1566545744;
                        var26 = param2 << 1351173328;
                        var25 = param2 << 1351173328;
                        var35 = -param11 + param3;
                        var19 = (param4 + -param10 << 730891408) / var35;
                        var20 = (param5 - param10 << -203723312) / var34;
                        if (var20 > var19) {
                          break L7;
                        } else {
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var27 = (-param2 + param9 << -673284208) / var34;
                          var32 = (-param16 + param1 << 1073040304) / var35;
                          var31 = (param13 - param16 << -173449456) / var34;
                          var33 = 1;
                          var28 = (param6 + -param2 << 383628816) / var35;
                          var23 = (param0 - param15 << -1494216976) / var34;
                          var24 = (-param15 + param8 << 1793998992) / var35;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var33 = 0;
                      var27 = (-param2 + param6 << -1396000880) / var35;
                      var32 = (param13 - param16 << -527501296) / var34;
                      var24 = (-param15 + param0 << 88354320) / var34;
                      var28 = (-param2 + param9 << 1843172400) / var34;
                      var31 = (-param16 + param1 << 1221710416) / var35;
                      var23 = (param8 + -param15 << 445940656) / var35;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param11 < 0) {
                          L10: {
                            if (param3 >= 0) {
                              break L10;
                            } else {
                              param11 = param3 - param11;
                              var26 = var26 + var28 * param11;
                              var17 = var17 + var19 * param11;
                              var29 = var29 + var31 * param11;
                              var30 = var30 + var32 * param11;
                              var21 = var21 + param11 * var23;
                              var22 = var22 + param11 * var24;
                              var25 = var25 + var27 * param11;
                              var18 = var18 + param11 * var20;
                              param11 = param3;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param11 = -param11;
                          var25 = var25 + param11 * var27;
                          var26 = var26 + var28 * param11;
                          var22 = var22 + var24 * param11;
                          var18 = var18 + var20 * param11;
                          var17 = var17 + param11 * var19;
                          var30 = var30 + param11 * var32;
                          var29 = var29 + param11 * var31;
                          var21 = var21 + var23 * param11;
                          param11 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var36 = qg.field_d[param11];
                      L11: while (true) {
                        if (param3 <= param11) {
                          break L8;
                        } else {
                          L12: {
                            var37 = var17 >> 1660328304;
                            if ((qg.field_a ^ -1) < (var37 ^ -1)) {
                              L13: {
                                var38 = -(var17 >> 314386992) + (var18 >> -1916013776);
                                if (var38 != 0) {
                                  break L13;
                                } else {
                                  if (var37 < 0) {
                                    break L12;
                                  } else {
                                    if (var37 < qg.field_a) {
                                      ve.a(var25, var37 + var36, 0, 0, var21, var38, 9, param12, var29, 0);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L14: {
                                var39 = (var22 + -var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var37 - -var38 >= qg.field_a) {
                                  var38 = -1 + (qg.field_a - var37);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                if (var37 >= 0) {
                                  break L15;
                                } else {
                                  ve.a(var25 + -(var37 * var40), var36, var40, var39, var21 + -(var37 * var39), var38 - -var37, 9, param12, var29 + -(var37 * var41), var41);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              ve.a(var25, var37 - -var36, var40, var39, var21, var38, 9, param12, var29, var41);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          param11++;
                          if (param11 < qg.field_e) {
                            var18 = var18 + var20;
                            var21 = var21 + var23;
                            var30 = var30 + var32;
                            var26 = var26 + var28;
                            var22 = var22 + var24;
                            var36 = var36 + hk.field_j;
                            var17 = var17 + var19;
                            var25 = var25 + var27;
                            var29 = var29 + var31;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var36 = -param3 + param14;
                        if (var36 == 0) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              var37 = param5 << -572941456;
                              var38 = param0 << -204350576;
                              var39 = param9 << -1376142832;
                              var40 = param13 << 275676016;
                              if (var33 == 0) {
                                break L19;
                              } else {
                                var26 = param6 << 683536;
                                var22 = param8 << 900853968;
                                var30 = param1 << 1844960624;
                                var18 = param4 << 1120306672;
                                if (0 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var21 = param8 << 1813150832;
                            var25 = param6 << -1157667376;
                            var29 = param1 << 1306533680;
                            var17 = param4 << 1674738864;
                            break L18;
                          }
                          var31 = (-var29 + var40) / var36;
                          var23 = (var38 + -var21) / var36;
                          var27 = (-var25 + var39) / var36;
                          var20 = (-var18 + var37) / var36;
                          var24 = (-var22 + var38) / var36;
                          var32 = (-var30 + var40) / var36;
                          var19 = (var37 + -var17) / var36;
                          var28 = (var39 + -var26) / var36;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var23 = 0;
                      var19 = 0;
                      var32 = 0;
                      var20 = 0;
                      var31 = 0;
                      var24 = 0;
                      var27 = 0;
                      var28 = 0;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param11 != param14) {
                      break L21;
                    } else {
                      var31 = 0;
                      var32 = 0;
                      var29 = param16;
                      var30 = param1;
                      var23 = 0;
                      var26 = param6;
                      var22 = param8;
                      var18 = param4 << 2085950640;
                      var21 = param15;
                      var25 = param2;
                      var17 = param10 << 227461968;
                      var24 = 0;
                      var20 = 0;
                      var27 = 0;
                      var28 = 0;
                      var19 = 0;
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    var35 = -param3 + param14;
                    if (param4 <= param10) {
                      break L22;
                    } else {
                      var24 = (param0 + -param8 << 103509712) / var35;
                      var25 = param2 << 1824834864;
                      var18 = param4 << 1447744176;
                      var22 = param8 << -2087622768;
                      var31 = (-param16 + param13 << 169002384) / var34;
                      var27 = (param9 + -param2 << 1818588624) / var34;
                      var17 = param10 << -2136218224;
                      var28 = (param9 - param6 << 2004310480) / var35;
                      var23 = (param0 + -param15 << 164776688) / var34;
                      var19 = (-param10 + param5 << 57541136) / var34;
                      var26 = param6 << 1927871056;
                      var20 = (param5 + -param4 << -640950384) / var35;
                      var21 = param15 << 769210544;
                      var30 = param1 << -966869008;
                      var32 = (-param1 + param13 << 908598512) / var35;
                      var29 = param16 << -592129456;
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var28 = (param9 + -param2 << -1680556016) / var34;
                  var27 = (param9 + -param6 << -41763632) / var35;
                  var31 = (-param1 + param13 << 1969128912) / var35;
                  var21 = param8 << 694023920;
                  var29 = param1 << -1110131216;
                  var22 = param15 << 811891056;
                  var24 = (param0 + -param15 << -870526320) / var34;
                  var20 = (-param10 + param5 << 1917023856) / var34;
                  var23 = (param0 - param8 << 602685712) / var35;
                  var26 = param2 << 1164548048;
                  var32 = (param13 + -param16 << 1308800688) / var34;
                  var30 = param16 << 1888427600;
                  var17 = param4 << -1712434352;
                  var25 = param6 << 2013083280;
                  var19 = (param5 + -param4 << 1684500688) / var35;
                  var18 = param10 << -1403567344;
                  break L20;
                }
                L23: {
                  if (param11 >= 0) {
                    break L23;
                  } else {
                    param11 = Math.min(-param11, param3 + -param11);
                    var26 = var26 + param11 * var28;
                    var30 = var30 + param11 * var32;
                    var18 = var18 + param11 * var20;
                    var17 = var17 + param11 * var19;
                    var21 = var21 + var23 * param11;
                    var22 = var22 + var24 * param11;
                    var29 = var29 + param11 * var31;
                    var25 = var25 + param11 * var27;
                    param11 = 0;
                    break L23;
                  }
                }
                var33 = 0;
                break L4;
              }
              L24: {
                if (param11 < 0) {
                  param11 = -param11;
                  var25 = var25 + param11 * var27;
                  var21 = var21 + param11 * var23;
                  var18 = var18 + param11 * var20;
                  var17 = var17 + param11 * var19;
                  var30 = var30 + var32 * param11;
                  var29 = var29 + var31 * param11;
                  var26 = var26 + param11 * var28;
                  var22 = var22 + var24 * param11;
                  param11 = 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              var35 = qg.field_d[param11];
              if (param11 < param14) {
                L25: {
                  var36 = var17 >> -1578848208;
                  if (qg.field_a <= var36) {
                    break L25;
                  } else {
                    var37 = (var18 >> 502258192) - (var17 >> 1575409104);
                    if (var37 == 0) {
                      if (var36 < 0) {
                        break L25;
                      } else {
                        if (qg.field_a <= var36) {
                          break L25;
                        } else {
                          ve.a(var25, var36 + var35, 0, 0, var21, var37, 9, param12, var29, 0);
                          break L25;
                        }
                      }
                    } else {
                      if (var36 < 0) {
                        break L25;
                      } else {
                        if (qg.field_a <= var36) {
                          break L25;
                        } else {
                          ve.a(var25, var36 + var35, 0, 0, var21, var37, 9, param12, var29, 0);
                          break L25;
                        }
                      }
                    }
                  }
                }
                param11++;
                if (param11 >= qg.field_e) {
                  return;
                } else {
                  var29 = var29 + var31;
                  var35 = var35 + hk.field_j;
                  var26 = var26 + var28;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                  var22 = var22 + var24;
                  var30 = var30 + var32;
                  var17 = var17 + var19;
                  var21 = var21 + var23;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wl var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > ta.field_k.field_j) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if ((ta.field_k.field_o ^ -1) == 0) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (ta.field_k.field_o != -2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 8: {
                        try {
                            if (param0 != hd.field_n) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            d.field_f = bl.field_U.a(124, pe.field_b, cb.field_c);
                            hd.field_n = hd.field_n + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (hd.field_n == 1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (2 == d.field_f.field_c) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = al.a(0, -1);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (-2 != (d.field_f.field_c ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            hd.field_n = hd.field_n + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((hd.field_n ^ -1) != -3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            rk.field_L = new qk((java.net.Socket) d.field_f.field_b, bl.field_U);
                            var2 = new wl(13);
                            gi.a(hh.field_f, fh.field_f, 17, var2, cn.field_U);
                            var2.a(true, 15);
                            var2.a(vm.field_w, false);
                            rk.field_L.a(0, 13, param0 + 1, var2.field_r);
                            hd.field_n = hd.field_n + 1;
                            me.field_E = 30000L + ik.a(param0 ^ 4);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-4 == hd.field_n) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-1 < rk.field_L.b(0)) {
                                statePc = 26;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (me.field_E >= ik.a(param0 ^ 4)) {
                                statePc = 30;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = al.a(0, -2);
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0;
                    }
                    case 26: {
                        try {
                            var1_int = rk.field_L.c((byte) 8);
                            if (-1 == var1_int) {
                                statePc = 29;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = al.a(0, var1_int);
                            stackIn_28_0 = stackOut_27_0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0;
                    }
                    case 29: {
                        try {
                            hd.field_n = hd.field_n + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-5 != hd.field_n) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ta.field_k.a((Object) (Object) rk.field_L, (byte) -128, ta.field_f);
                            rk.field_L = null;
                            d.field_f = null;
                            hd.field_n = 0;
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = -1;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return al.a(0, -3);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 3805) {
            field_b = null;
        }
    }

    final static ke a(boolean param0, int param1) {
        ec var3 = null;
        ec var4 = null;
        ke var5 = null;
        ec var6 = null;
        ec var7 = null;
        ke var8 = null;
        ec var9 = null;
        L0: {
          var5 = new ke(3);
          var8 = var5;
          if (ph.n(-30146)) {
            var7 = new ec(20, qn.field_rb, (mm) (Object) a.field_t);
            var7.field_l = 320 - var7.field_n / 2;
            var7.field_m = 372;
            var8.a(var7, 112);
            break L0;
          } else {
            var5.a(new ec(23, vh.field_b[0], (mm) (Object) a.field_t), 117);
            var5.a(new ec(23, vh.field_b[1], (mm) (Object) a.field_t), param1 + -299);
            var5.field_f[1].field_n = 200;
            var6 = var5.field_f[0];
            var3 = var6;
            var6.field_n = 200;
            var5.field_f[0].field_l = 320 + (-var5.field_f[0].field_n + -10);
            var5.field_f[1].field_l = 330;
            var5.field_f[1].field_m = 372;
            var4 = var5.field_f[0];
            var4.field_m = 372;
            break L0;
          }
        }
        var9 = new ec(13, pc.field_f, (mm) (Object) a.field_t);
        var9.field_l = -(var9.field_n / 2) + 320;
        var9.field_m = param1;
        var8.a(var9, 102);
        var8.field_w = 70;
        var8.field_y = 500;
        var8.field_z = 76;
        var8.field_q = 272;
        var8.a(cj.field_c, param0, -129);
        return var8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Remove <%0> from ignore list";
        field_b = "To <%0>: ";
    }
}
