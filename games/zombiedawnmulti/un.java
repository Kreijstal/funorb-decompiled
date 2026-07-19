/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class un extends gf implements fi {
    private pm field_m;
    static String field_n;
    static String field_p;
    static int field_k;
    static String field_o;
    static String field_l;

    un(pm param0) {
        try {
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "un.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          if (param0 >= 74) {
            break L0;
          } else {
            un.a((int[]) null, 70, 11, -98, -57, -82, -73, -16, 0, -9, 113, -26, 31, 38, 49, 83, -9);
            break L0;
          }
        }
        L1: {
          if (param1) {
            if ((lb.field_c[param2] ^ -1) <= (lb.field_c[param3] ^ -1)) {
              if ((lb.field_c[param2] ^ -1) >= (lb.field_c[param3] ^ -1)) {
                if (hn.field_f[param3] <= hn.field_f[param2]) {
                  if ((hn.field_f[param3] ^ -1) <= (hn.field_f[param2] ^ -1)) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (hn.field_f[param2] < hn.field_f[param3]) {
              return true;
            } else {
              if ((hn.field_f[param2] ^ -1) >= (hn.field_f[param3] ^ -1)) {
                if ((lb.field_c[param2] ^ -1) > (lb.field_c[param3] ^ -1)) {
                  return true;
                } else {
                  if (lb.field_c[param3] < lb.field_c[param2]) {
                    return false;
                  } else {
                    break L1;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
        var4 = ie.field_ob[param2] + (kj.field_p[param2] + vk.field_J[param2]);
        var5 = ie.field_ob[param3] + (vk.field_J[param3] + kj.field_p[param3]);
        if (var4 >= var5) {
          if (var4 <= var5) {
            L2: {
              if (param2 >= param3) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L2;
              } else {
                stackOut_27_0 = 1;
                stackIn_29_0 = stackOut_27_0;
                break L2;
              }
            }
            return stackIn_29_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    abstract re a(boolean param0, String param1);

    public final void a(pm param0, boolean param1) {
        try {
            if (!param1) {
                this.field_m = (pm) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "un.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract String a(String param0, int param1);

    public static void g(int param0) {
        field_n = null;
        field_l = null;
        field_o = null;
        field_p = null;
        if (param0 != -1317848592) {
            un.g(-41);
        }
    }

    public final boolean b(int param0) {
        pm var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -3) {
            break L0;
          } else {
            var3 = (pm) null;
            this.a((pm) null, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_m.field_j == null) {
              break L2;
            } else {
              if ((this.field_m.field_j.length() ^ -1) != -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var42 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param4) {
                break L1;
              } else {
                if (ep.field_h <= param9) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param11) {
                      break L2;
                    } else {
                      if (-1 >= (param12 ^ -1)) {
                        break L2;
                      } else {
                        if (0 > param1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if ((ep.field_i ^ -1) < (param11 ^ -1)) {
                      break L3;
                    } else {
                      if ((ep.field_i ^ -1) < (param12 ^ -1)) {
                        break L3;
                      } else {
                        if ((ep.field_i ^ -1) < (param1 ^ -1)) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  var34 = param4 + -param9;
                  if (param3 == -10423) {
                    L4: {
                      L5: {
                        if ((param9 ^ -1) != (param7 ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              if (param9 != param4) {
                                break L7;
                              } else {
                                var18 = param12 << -1192344624;
                                var25 = param6;
                                var21 = param5;
                                var27 = 0;
                                var28 = 0;
                                var23 = 0;
                                var24 = 0;
                                var17_int = param11 << 1836078288;
                                var30 = param2;
                                var22 = param8;
                                var26 = param14;
                                var20 = 0;
                                var19 = 0;
                                var31 = 0;
                                var29 = param13;
                                var32 = 0;
                                if (var42 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var35 = param4 - param7;
                              if (param12 > param11) {
                                break L8;
                              } else {
                                var20 = (param1 + -param11 << 378139152) / var34;
                                var29 = param2 << -181569392;
                                var22 = param5 << 1979799280;
                                var27 = (-param14 + param16 << 1943156112) / var35;
                                var28 = (-param6 + param16 << 1228261392) / var34;
                                var31 = (-param2 + param10 << -116118352) / var35;
                                var32 = (param10 + -param13 << 1145116144) / var34;
                                var30 = param13 << 28652528;
                                var17_int = param12 << -965665168;
                                var24 = (-param5 + param15 << 1503812336) / var34;
                                var25 = param14 << -928924208;
                                var26 = param6 << 1938772432;
                                var19 = (-param12 + param1 << 49131504) / var35;
                                var23 = (-param8 + param15 << 290849104) / var35;
                                var18 = param11 << 1393597968;
                                var21 = param8 << 1191312336;
                                if (var42 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var31 = (param10 + -param13 << -1623140336) / var34;
                            var26 = param14 << 25054992;
                            var25 = param6 << 1259409488;
                            var17_int = param11 << -644464592;
                            var22 = param8 << -555807376;
                            var32 = (param10 + -param2 << 2099303632) / var35;
                            var27 = (param16 - param6 << -481644112) / var34;
                            var29 = param13 << -222173040;
                            var18 = param12 << -1799601968;
                            var24 = (param15 - param8 << -1746394032) / var35;
                            var30 = param2 << -889269040;
                            var23 = (-param5 + param15 << -1463351216) / var34;
                            var28 = (-param14 + param16 << -2119132496) / var35;
                            var19 = (-param11 + param1 << -1443308432) / var34;
                            var21 = param5 << -1317848592;
                            var20 = (-param12 + param1 << -1340086000) / var35;
                            break L6;
                          }
                          L9: {
                            if (-1 >= (param9 ^ -1)) {
                              break L9;
                            } else {
                              param9 = Math.min(-param9, param7 + -param9);
                              var29 = var29 + var31 * param9;
                              var17_int = var17_int + param9 * var19;
                              var21 = var21 + var23 * param9;
                              var25 = var25 + var27 * param9;
                              var26 = var26 + var28 * param9;
                              var22 = var22 + var24 * param9;
                              var18 = var18 + param9 * var20;
                              var30 = var30 + var32 * param9;
                              param9 = 0;
                              break L9;
                            }
                          }
                          var33 = 0;
                          if (var42 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L10: {
                        L11: {
                          var30 = param13 << -264337104;
                          var29 = param13 << -264337104;
                          var18 = param11 << 1730631728;
                          var17_int = param11 << 1730631728;
                          var26 = param6 << -1021344880;
                          var25 = param6 << -1021344880;
                          var22 = param5 << 2041589616;
                          var21 = param5 << 2041589616;
                          var35 = param7 + -param9;
                          var19 = (-param11 + param12 << 2022103888) / var35;
                          var20 = (param1 + -param11 << -1378527216) / var34;
                          if ((var19 ^ -1) <= (var20 ^ -1)) {
                            break L11;
                          } else {
                            var27 = (-param6 + param14 << -1203805392) / var35;
                            var33 = 0;
                            var32 = (-param13 + param10 << -1481619280) / var34;
                            var24 = (-param5 + param15 << -1794122992) / var34;
                            var31 = (-param13 + param2 << 1185955824) / var35;
                            var28 = (-param6 + param16 << -1459637392) / var34;
                            var23 = (param8 - param5 << 2060626224) / var35;
                            if (var42 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var32 = (-param13 + param2 << 943347024) / var35;
                        var31 = (param10 + -param13 << 127196784) / var34;
                        var23 = (param15 - param5 << 139985392) / var34;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var27 = (-param6 + param16 << -1970842736) / var34;
                        var28 = (-param6 + param14 << -503304560) / var35;
                        var24 = (param8 - param5 << 208950544) / var35;
                        var33 = 1;
                        break L10;
                      }
                      L12: {
                        L13: {
                          L14: {
                            if (-1 < (param9 ^ -1)) {
                              L15: {
                                if (0 > param7) {
                                  break L15;
                                } else {
                                  param9 = -param9;
                                  var18 = var18 + param9 * var20;
                                  var25 = var25 + var27 * param9;
                                  var22 = var22 + var24 * param9;
                                  var29 = var29 + param9 * var31;
                                  var21 = var21 + param9 * var23;
                                  var30 = var30 + param9 * var32;
                                  var17_int = var17_int + param9 * var19;
                                  var26 = var26 + param9 * var28;
                                  param9 = 0;
                                  if (var42 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              param9 = param7 - param9;
                              var21 = var21 + param9 * var23;
                              var22 = var22 + var24 * param9;
                              var18 = var18 + var20 * param9;
                              var25 = var25 + param9 * var27;
                              var26 = var26 + param9 * var28;
                              var17_int = var17_int + var19 * param9;
                              var29 = var29 + param9 * var31;
                              var30 = var30 + var32 * param9;
                              param9 = param7;
                              if (var42 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                          var36 = ep.field_a[param9];
                          L16: while (true) {
                            if (param9 >= param7) {
                              break L13;
                            } else {
                              var37 = var17_int >> -1120218992;
                              stackOut_36_0 = var37 ^ -1;
                              stackOut_36_1 = ep.field_i ^ -1;
                              stackIn_55_0 = stackOut_36_0;
                              stackIn_55_1 = stackOut_36_1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              if (var42 != 0) {
                                break L12;
                              } else {
                                L17: {
                                  if (stackIn_37_0 > stackIn_37_1) {
                                    L18: {
                                      var38 = -(var17_int >> -1276425040) + (var18 >> -737654768);
                                      if (-1 != (var38 ^ -1)) {
                                        break L18;
                                      } else {
                                        if (0 > var37) {
                                          break L17;
                                        } else {
                                          if ((var37 ^ -1) > (ep.field_i ^ -1)) {
                                            ub.a(var38, var21, var29, (byte) 102, param0, 0, 0, var25, var37 - -var36, 0);
                                            if (var42 == 0) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    L19: {
                                      var39 = (-var21 + var22) / var38;
                                      var40 = (-var25 + var26) / var38;
                                      var41 = (-var29 + var30) / var38;
                                      if ((ep.field_i ^ -1) >= (var37 + var38 ^ -1)) {
                                        var38 = -1 + (ep.field_i - var37);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (var37 >= 0) {
                                        break L20;
                                      } else {
                                        ub.a(var37 + var38, var21 - var39 * var37, var29 + -(var37 * var41), (byte) -126, param0, var40, var41, -(var37 * var40) + var25, var36, var39);
                                        if (var42 == 0) {
                                          break L17;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    ub.a(var38, var21, var29, (byte) 116, param0, var40, var41, var25, var37 - -var36, var39);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                param9++;
                                if (param9 < ep.field_h) {
                                  var25 = var25 + var27;
                                  var17_int = var17_int + var19;
                                  var36 = var36 + oo.field_b;
                                  var21 = var21 + var23;
                                  var29 = var29 + var31;
                                  var26 = var26 + var28;
                                  var30 = var30 + var32;
                                  var18 = var18 + var20;
                                  var22 = var22 + var24;
                                  if (var42 == 0) {
                                    continue L16;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        var36 = param4 - param7;
                        stackOut_54_0 = 0;
                        stackOut_54_1 = var36;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        break L12;
                      }
                      L21: {
                        if (stackIn_55_0 != stackIn_55_1) {
                          break L21;
                        } else {
                          var23 = 0;
                          var20 = 0;
                          var32 = 0;
                          var24 = 0;
                          var31 = 0;
                          var19 = 0;
                          var28 = 0;
                          var27 = 0;
                          if (var42 == 0) {
                            break L4;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        L23: {
                          var37 = param1 << 2034389008;
                          var38 = param15 << 179653136;
                          var39 = param16 << 533920880;
                          if (var33 == 0) {
                            break L23;
                          } else {
                            var30 = param2 << 1258608624;
                            var18 = param12 << 608565456;
                            var22 = param8 << -173835088;
                            var26 = param14 << 705780880;
                            if (var42 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var25 = param14 << -168441968;
                        var21 = param8 << -1946820272;
                        var17_int = param12 << 948784080;
                        var29 = param2 << 1759829872;
                        break L22;
                      }
                      var40 = param10 << -1065052944;
                      var23 = (-var21 + var38) / var36;
                      var27 = (-var25 + var39) / var36;
                      var20 = (-var18 + var37) / var36;
                      var19 = (var37 + -var17_int) / var36;
                      var32 = (-var30 + var40) / var36;
                      var28 = (var39 + -var26) / var36;
                      var24 = (var38 - var22) / var36;
                      var31 = (var40 + -var29) / var36;
                      break L4;
                    }
                    L24: {
                      if ((param9 ^ -1) > -1) {
                        param9 = -param9;
                        var29 = var29 + param9 * var31;
                        var21 = var21 + var23 * param9;
                        var22 = var22 + param9 * var24;
                        var17_int = var17_int + var19 * param9;
                        var30 = var30 + param9 * var32;
                        var18 = var18 + param9 * var20;
                        var25 = var25 + param9 * var27;
                        var26 = var26 + var28 * param9;
                        param9 = 0;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    var35 = ep.field_a[param9];
                    L25: while (true) {
                      L26: {
                        L27: {
                          if (param9 >= param4) {
                            break L27;
                          } else {
                            var36 = var17_int >> -319314160;
                            if (var42 != 0) {
                              break L26;
                            } else {
                              L28: {
                                if ((var36 ^ -1) > (ep.field_i ^ -1)) {
                                  L29: {
                                    var37 = (var18 >> 1304137168) + -(var17_int >> -1108062672);
                                    if (var37 != 0) {
                                      break L29;
                                    } else {
                                      if ((var36 ^ -1) > -1) {
                                        break L28;
                                      } else {
                                        if (ep.field_i <= var36) {
                                          break L28;
                                        } else {
                                          ub.a(var37, var21, var29, (byte) -84, param0, 0, 0, var25, var35 + var36, 0);
                                          if (var42 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L30: {
                                    var38 = (var22 - var21) / var37;
                                    var39 = (var26 - var25) / var37;
                                    var40 = (var30 + -var29) / var37;
                                    if ((var36 + var37 ^ -1) > (ep.field_i ^ -1)) {
                                      break L30;
                                    } else {
                                      var37 = -1 + (ep.field_i + -var36);
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (var36 >= 0) {
                                      break L31;
                                    } else {
                                      ub.a(var37 - -var36, var21 - var38 * var36, var29 + -(var36 * var40), (byte) 81, param0, var39, var40, -(var39 * var36) + var25, var35, var38);
                                      if (var42 == 0) {
                                        break L28;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  ub.a(var37, var21, var29, (byte) -24, param0, var39, var40, var25, var35 + var36, var38);
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              param9++;
                              if (param9 >= ep.field_h) {
                                decompiledRegionSelector0 = 6;
                                break L0;
                              } else {
                                var35 = var35 + oo.field_b;
                                var22 = var22 + var24;
                                var26 = var26 + var28;
                                var18 = var18 + var20;
                                var21 = var21 + var23;
                                var25 = var25 + var27;
                                var29 = var29 + var31;
                                var17_int = var17_int + var19;
                                var30 = var30 + var32;
                                if (var42 == 0) {
                                  continue L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                        break L26;
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
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
          L32: {
            var17 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) (var17);
            stackOut_85_1 = new StringBuilder().append("un.S(");
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param0 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L32;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L32;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    public final void a(pm param0, int param1) {
        try {
            this.a(-1306);
            if (param1 != 0) {
                un.g(78);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "un.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final re f(int param0) {
        if (param0 != -3) {
            un.g(38);
        }
        return this.a(false, this.field_m.field_j);
    }

    final String e(int param0) {
        if (param0 != -3) {
            un.a((int[]) null, -99, -31, 9, -3, 10, 88, -54, -105, 27, -84, -122, -1, -93, -21, -86, 107);
        }
        return this.a(this.field_m.field_j, -1276425040);
    }

    static {
        field_n = "Cloak your zombies in pure fear.";
        field_k = 1;
        field_o = "Nimble Fingers";
        field_l = "<%0> has lost connection.";
    }
}
