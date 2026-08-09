/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends oj {
    int field_z;
    static String field_y;
    int field_E;
    static float field_C;
    static int field_B;
    static boolean field_D;
    static int field_F;

    public static void g(int param0) {
        if (param0 >= -63) {
            q.g(6);
        }
        field_y = null;
    }

    final static void a(boolean param0, String param1) {
        try {
            fp.a(param1, (byte) -65);
            af.a(param0, lo.field_o, -1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "q.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        if (param1) {
            System.out.println("Teleport disappear event debug");
            System.out.println("Unit at " + this.field_z + "," + this.field_E);
        }
        String var3 = "EventTelepop: pos: (" + this.field_z + "," + this.field_E + ")";
        int var4 = -35 % ((param0 - 53) / 51);
        return var3;
    }

    q(int param0, int param1) {
        this.field_E = param1;
        this.field_z = param0;
        this.field_m = 6;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                this.a((byte) -47, true);
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) -39, param2, param0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("q.A(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        try {
            if (param1 != -26661) {
                this.field_E = -18;
            }
            if (!this.field_w.field_bb) {
                this.field_w.e(param1 + 26574);
            } else {
                var5 = param0.c(this.field_E, true, this.field_z);
                var6 = var5;
                var6.field_bb = false;
                this.field_w.d(param1 ^ 26707);
            }
            fl.a(param0, -112);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "q.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16) {
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
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var33 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        var42 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 < (param11 ^ -1)) {
                break L1;
              } else {
                if (param15 < tm.field_q) {
                  L2: {
                    if ((param14 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (-1 >= (param12 ^ -1)) {
                        break L2;
                      } else {
                        if (0 <= param9) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param14 < tm.field_l) {
                      break L3;
                    } else {
                      if (tm.field_l > param12) {
                        break L3;
                      } else {
                        if (tm.field_l <= param9) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param13) {
                    L4: {
                      var34 = param11 - param15;
                      if (param10 != param15) {
                        L5: {
                          var18 = param14 << 761180208;
                          var17_int = param14 << 761180208;
                          var30 = param4 << 961521040;
                          var29 = param4 << 961521040;
                          var26 = param1 << 2026602448;
                          var25 = param1 << 2026602448;
                          var22 = param8 << 1208716112;
                          var21 = param8 << 1208716112;
                          var35 = -param15 + param10;
                          var20 = (param9 + -param14 << 1961598832) / var34;
                          var19 = (-param14 + param12 << 1206483408) / var35;
                          if (var19 < var20) {
                            var28 = (-param1 + param5 << -35646576) / var34;
                            var32 = (param3 - param4 << 791280400) / var34;
                            var33 = 0;
                            var23 = (param6 - param8 << 233011440) / var35;
                            var31 = (-param4 + param2 << 1821695088) / var35;
                            var27 = (-param1 + param7 << 525608656) / var35;
                            var24 = (-param8 + param16 << -819422800) / var34;
                            break L5;
                          } else {
                            var36 = var19;
                            var19 = var20;
                            var20 = var36;
                            var23 = (param16 + -param8 << -1921526384) / var34;
                            var27 = (-param1 + param5 << 1930161328) / var34;
                            var32 = (param2 - param4 << -495995248) / var35;
                            var24 = (param6 + -param8 << 1394739568) / var35;
                            var33 = 1;
                            var31 = (-param4 + param3 << 1829520208) / var34;
                            var28 = (-param1 + param7 << -1899406896) / var35;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (param15 >= 0) {
                              break L7;
                            } else {
                              if ((param10 ^ -1) <= -1) {
                                param15 = -param15;
                                var18 = var18 + param15 * var20;
                                var17_int = var17_int + param15 * var19;
                                var29 = var29 + var31 * param15;
                                var25 = var25 + var27 * param15;
                                var30 = var30 + param15 * var32;
                                var21 = var21 + param15 * var23;
                                var22 = var22 + var24 * param15;
                                var26 = var26 + param15 * var28;
                                param15 = 0;
                                break L7;
                              } else {
                                param15 = -param15 + param10;
                                var30 = var30 + var32 * param15;
                                var21 = var21 + var23 * param15;
                                var18 = var18 + param15 * var20;
                                var29 = var29 + param15 * var31;
                                var22 = var22 + var24 * param15;
                                var26 = var26 + param15 * var28;
                                var25 = var25 + param15 * var27;
                                var17_int = var17_int + var19 * param15;
                                param15 = param10;
                                break L6;
                              }
                            }
                          }
                          var36 = tm.field_k[param15];
                          L8: while (true) {
                            if (param15 >= param10) {
                              break L6;
                            } else {
                              L9: {
                                var37 = var17_int >> 1732492848;
                                if (var37 >= tm.field_l) {
                                  break L9;
                                } else {
                                  var38 = -(var17_int >> 1427226992) + (var18 >> 2062146160);
                                  if (var38 == 0) {
                                    if (0 > var37) {
                                      break L9;
                                    } else {
                                      if (tm.field_l > var37) {
                                        jn.a(var29, var21, 0, 33423424, var37 + var36, var38, var25, param0, 0, 0);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  } else {
                                    L10: {
                                      var39 = (var22 - var21) / var38;
                                      var40 = (-var25 + var26) / var38;
                                      var41 = (-var29 + var30) / var38;
                                      if (tm.field_l <= var38 + var37) {
                                        var38 = tm.field_l - (var37 - -1);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    if (-1 >= (var37 ^ -1)) {
                                      jn.a(var29, var21, var39, 33423424, var36 + var37, var38, var25, param0, var40, var41);
                                      break L9;
                                    } else {
                                      jn.a(var29 + -(var37 * var41), -(var37 * var39) + var21, var39, 33423424, var36, var37 + var38, var25 - var40 * var37, param0, var40, var41);
                                      break L9;
                                    }
                                  }
                                }
                              }
                              param15++;
                              if (tm.field_q > param15) {
                                var18 = var18 + var20;
                                var26 = var26 + var28;
                                var22 = var22 + var24;
                                var30 = var30 + var32;
                                var17_int = var17_int + var19;
                                var25 = var25 + var27;
                                var21 = var21 + var23;
                                var36 = var36 + qn.field_l;
                                var29 = var29 + var31;
                                continue L8;
                              } else {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        var36 = param11 - param10;
                        if (0 != var36) {
                          L11: {
                            var37 = param9 << -259574160;
                            var38 = param16 << 260703920;
                            var39 = param5 << 616500080;
                            var40 = param3 << -1874265872;
                            if (var33 == 0) {
                              var21 = param6 << 1338735280;
                              var25 = param7 << 806131376;
                              var17_int = param12 << -1429073968;
                              var29 = param2 << 105104400;
                              break L11;
                            } else {
                              var22 = param6 << -86246960;
                              var18 = param12 << -519669072;
                              var30 = param2 << -28900016;
                              var26 = param7 << 974072624;
                              break L11;
                            }
                          }
                          var24 = (-var22 + var38) / var36;
                          var31 = (-var29 + var40) / var36;
                          var32 = (-var30 + var40) / var36;
                          var28 = (-var26 + var39) / var36;
                          var20 = (var37 - var18) / var36;
                          var27 = (var39 - var25) / var36;
                          var19 = (-var17_int + var37) / var36;
                          var23 = (var38 - var21) / var36;
                          break L4;
                        } else {
                          var28 = 0;
                          var19 = 0;
                          var23 = 0;
                          var24 = 0;
                          var20 = 0;
                          var27 = 0;
                          var32 = 0;
                          var31 = 0;
                          break L4;
                        }
                      } else {
                        L12: {
                          if (param15 == param11) {
                            var20 = 0;
                            var28 = 0;
                            var25 = param1;
                            var19 = 0;
                            var23 = 0;
                            var31 = 0;
                            var29 = param4;
                            var32 = 0;
                            var22 = param6;
                            var26 = param7;
                            var18 = param12 << -1261663472;
                            var21 = param8;
                            var30 = param2;
                            var24 = 0;
                            var27 = 0;
                            var17_int = param14 << 1842989072;
                            break L12;
                          } else {
                            var35 = param11 - param10;
                            if (param12 <= param14) {
                              var27 = (param5 - param7 << 928600656) / var35;
                              var20 = (-param14 + param9 << -2086561648) / var34;
                              var24 = (-param8 + param16 << 1422363696) / var34;
                              var17_int = param12 << 1885533936;
                              var28 = (param5 + -param1 << -1828936016) / var34;
                              var21 = param6 << -1196857392;
                              var31 = (param3 + -param2 << 1933329552) / var35;
                              var25 = param7 << 1897925776;
                              var18 = param14 << -192153584;
                              var19 = (-param12 + param9 << -901278288) / var35;
                              var26 = param1 << -660559280;
                              var29 = param2 << 725168944;
                              var30 = param4 << -99465104;
                              var22 = param8 << -1597476592;
                              var32 = (-param4 + param3 << 1678158608) / var34;
                              var23 = (-param6 + param16 << 1817962416) / var35;
                              break L12;
                            } else {
                              var31 = (-param4 + param3 << -617802416) / var34;
                              var32 = (-param2 + param3 << -1127948144) / var35;
                              var21 = param8 << 1144106096;
                              var24 = (-param6 + param16 << 1035282480) / var35;
                              var19 = (-param14 + param9 << 957933616) / var34;
                              var22 = param6 << -1196755888;
                              var17_int = param14 << 1854144112;
                              var26 = param7 << 642376464;
                              var27 = (param5 + -param1 << -1833056720) / var34;
                              var20 = (-param12 + param9 << 1619882896) / var35;
                              var23 = (-param8 + param16 << 1238722800) / var34;
                              var25 = param1 << 21088048;
                              var29 = param4 << 1134098992;
                              var30 = param2 << -428196208;
                              var28 = (param5 + -param7 << 2089788592) / var35;
                              var18 = param12 << 393474384;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if ((param15 ^ -1) <= -1) {
                            break L13;
                          } else {
                            param15 = Math.min(-param15, param10 + -param15);
                            var29 = var29 + var31 * param15;
                            var26 = var26 + var28 * param15;
                            var22 = var22 + var24 * param15;
                            var21 = var21 + param15 * var23;
                            var18 = var18 + var20 * param15;
                            var30 = var30 + var32 * param15;
                            var25 = var25 + param15 * var27;
                            var17_int = var17_int + param15 * var19;
                            param15 = 0;
                            break L13;
                          }
                        }
                        var33 = 0;
                        break L4;
                      }
                    }
                    L14: {
                      if ((param15 ^ -1) > -1) {
                        param15 = -param15;
                        var18 = var18 + var20 * param15;
                        var17_int = var17_int + param15 * var19;
                        var30 = var30 + param15 * var32;
                        var29 = var29 + param15 * var31;
                        var25 = var25 + param15 * var27;
                        var26 = var26 + param15 * var28;
                        var22 = var22 + var24 * param15;
                        var21 = var21 + var23 * param15;
                        param15 = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var35 = tm.field_k[param15];
                    L15: while (true) {
                      if (param15 >= param11) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L16: {
                          var36 = var17_int >> 698250640;
                          if (var36 < tm.field_l) {
                            var37 = -(var17_int >> 58193264) + (var18 >> 154602224);
                            if (-1 != (var37 ^ -1)) {
                              L17: {
                                var38 = (var22 + -var21) / var37;
                                var39 = (-var25 + var26) / var37;
                                var40 = (var30 + -var29) / var37;
                                if (var37 + var36 >= tm.field_l) {
                                  var37 = -var36 + (tm.field_l + -1);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              if (-1 >= (var36 ^ -1)) {
                                jn.a(var29, var21, var38, 33423424, var35 + var36, var37, var25, param0, var39, var40);
                                break L16;
                              } else {
                                jn.a(-(var36 * var40) + var29, -(var36 * var38) + var21, var38, 33423424, var35, var36 + var37, var25 + -(var36 * var39), param0, var39, var40);
                                break L16;
                              }
                            } else {
                              if (-1 < (var36 ^ -1)) {
                                break L16;
                              } else {
                                if (var36 >= tm.field_l) {
                                  break L16;
                                } else {
                                  jn.a(var29, var21, 0, 33423424, var35 + var36, var37, var25, param0, 0, 0);
                                  break L16;
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                        param15++;
                        if (param15 >= tm.field_q) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var35 = var35 + qn.field_l;
                          var29 = var29 + var31;
                          var26 = var26 + var28;
                          var21 = var21 + var23;
                          var22 = var22 + var24;
                          var18 = var18 + var20;
                          var17_int = var17_int + var19;
                          var25 = var25 + var27;
                          var30 = var30 + var32;
                          continue L15;
                        }
                      }
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
          L18: {
            var17 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var17);

            stackIn_79_1 = new StringBuilder().append("q.E(");

            if (param0 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L18;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    static {
        field_y = "<%0> has withdrawn a draw offer";
        field_D = false;
    }
}
