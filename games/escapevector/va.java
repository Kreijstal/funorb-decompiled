/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private fl field_c;
    static long field_b;
    private fl field_a;

    final boolean b(int param0) {
        if (param0 != -182442704) {
            this.field_a = (fl) null;
        }
        return this.field_c.field_j == this.field_c ? true : false;
    }

    final static void d(int param0) {
        od.field_j.field_g = param0;
        od.field_j.field_d = 0;
    }

    final int c(int param0) {
        int var4 = EscapeVector.field_A;
        int var2 = param0;
        fl var3 = this.field_c.field_j;
        while (this.field_c != var3) {
            var3 = var3.field_j;
            var2++;
        }
        return var2;
    }

    final fl b(byte param0) {
        fl var2 = null;
        var2 = this.field_c.field_j;
        if (this.field_c == var2) {
          return null;
        } else {
          L0: {
            if (param0 == -75) {
              break L0;
            } else {
              this.field_a = (fl) null;
              break L0;
            }
          }
          var2.d(110);
          return var2;
        }
    }

    final void a(int param0, fl param1) {
        try {
            if (null != param1.field_i) {
                param1.d(109);
            }
            if (param0 != -1) {
                field_b = 29L;
            }
            param1.field_j = this.field_c;
            param1.field_i = this.field_c.field_i;
            param1.field_i.field_j = param1;
            param1.field_j.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "va.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(n param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var2_int = param0.e(0);
            if (param1) {
              L1: {
                if ((var2_int ^ -1) != -2) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var3 = stackIn_6_0;
              stackOut_6_0 = var3;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("va.H(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, boolean param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var42 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (-1 < (param10 ^ -1)) {
                break L1;
              } else {
                if (param8 < bi.field_f) {
                  L2: {
                    if ((param7 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (0 <= param5) {
                        break L2;
                      } else {
                        if (0 > param13) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (bi.field_c > param7) {
                      break L3;
                    } else {
                      if (bi.field_c > param5) {
                        break L3;
                      } else {
                        if (bi.field_c <= param13) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param11) {
                      break L4;
                    } else {
                      va.d(-74);
                      break L4;
                    }
                  }
                  L5: {
                    var34 = param10 - param8;
                    if (param9 == param8) {
                      L6: {
                        if (param10 != param8) {
                          var35 = param10 - param9;
                          if (param5 <= param7) {
                            var21 = param1 << 1238346640;
                            var25 = param6 << 1240585712;
                            var20 = (-param7 + param13 << -1367935024) / var34;
                            var19 = (-param5 + param13 << -746185488) / var35;
                            var30 = param2 << -293727632;
                            var18 = param7 << -208009328;
                            var17_int = param5 << -1849434960;
                            var27 = (param15 - param6 << 62194832) / var35;
                            var23 = (param0 - param1 << -16823280) / var35;
                            var22 = param12 << -510893360;
                            var31 = (-param3 + param16 << -1010576432) / var35;
                            var26 = param14 << 1316018672;
                            var32 = (param16 + -param2 << 2108345712) / var34;
                            var29 = param3 << -1946528464;
                            var24 = (-param12 + param0 << 1828996368) / var34;
                            var28 = (-param14 + param15 << -1155048720) / var34;
                            break L6;
                          } else {
                            var26 = param6 << 2103066224;
                            var31 = (param16 - param2 << 1310450128) / var34;
                            var30 = param3 << -227852976;
                            var17_int = param7 << 864842256;
                            var28 = (-param6 + param15 << -1104184720) / var35;
                            var27 = (-param14 + param15 << -773350128) / var34;
                            var19 = (param13 + -param7 << -105433104) / var34;
                            var21 = param12 << -1160101936;
                            var18 = param5 << 2099405296;
                            var22 = param1 << -813887504;
                            var25 = param14 << -886957584;
                            var29 = param2 << 738393200;
                            var32 = (-param3 + param16 << 1429514160) / var35;
                            var23 = (-param12 + param0 << 1560331792) / var34;
                            var24 = (param0 + -param1 << 1872523760) / var35;
                            var20 = (-param5 + param13 << -1012870288) / var35;
                            break L6;
                          }
                        } else {
                          var22 = param1;
                          var30 = param3;
                          var27 = 0;
                          var32 = 0;
                          var18 = param5 << 1145580880;
                          var28 = 0;
                          var17_int = param7 << 93762384;
                          var23 = 0;
                          var20 = 0;
                          var24 = 0;
                          var19 = 0;
                          var31 = 0;
                          var26 = param6;
                          var25 = param14;
                          var29 = param2;
                          var21 = param12;
                          break L6;
                        }
                      }
                      L7: {
                        if ((param8 ^ -1) > -1) {
                          param8 = Math.min(-param8, -param8 + param9);
                          var21 = var21 + param8 * var23;
                          var25 = var25 + param8 * var27;
                          var17_int = var17_int + var19 * param8;
                          var29 = var29 + param8 * var31;
                          var26 = var26 + var28 * param8;
                          var22 = var22 + param8 * var24;
                          var30 = var30 + var32 * param8;
                          var18 = var18 + param8 * var20;
                          param8 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var33 = 0;
                      break L5;
                    } else {
                      L8: {
                        var22 = param12 << 458796048;
                        var21 = param12 << 458796048;
                        var30 = param2 << -182442704;
                        var29 = param2 << -182442704;
                        var26 = param14 << -1924487952;
                        var25 = param14 << -1924487952;
                        var18 = param7 << 1583734832;
                        var17_int = param7 << 1583734832;
                        var35 = param9 + -param8;
                        var20 = (param13 + -param7 << -1097627920) / var34;
                        var19 = (-param7 + param5 << 2067730768) / var35;
                        if (var20 <= var19) {
                          var23 = (-param12 + param0 << -1020699248) / var34;
                          var27 = (-param14 + param15 << 1585423408) / var34;
                          var24 = (param1 + -param12 << 63966864) / var35;
                          var33 = 1;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var32 = (param3 - param2 << 1143250384) / var35;
                          var28 = (param6 + -param14 << -2135201904) / var35;
                          var31 = (-param2 + param16 << 589337616) / var34;
                          break L8;
                        } else {
                          var23 = (param1 + -param12 << 1780976688) / var35;
                          var24 = (param0 - param12 << 977718896) / var34;
                          var32 = (-param2 + param16 << 747828240) / var34;
                          var27 = (-param14 + param6 << 1387133264) / var35;
                          var31 = (-param2 + param3 << 1290943632) / var35;
                          var33 = 0;
                          var28 = (-param14 + param15 << 414944176) / var34;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (param8 >= 0) {
                            break L10;
                          } else {
                            if (0 > param9) {
                              param8 = param9 - param8;
                              var30 = var30 + param8 * var32;
                              var25 = var25 + param8 * var27;
                              var22 = var22 + var24 * param8;
                              var26 = var26 + var28 * param8;
                              var29 = var29 + var31 * param8;
                              var18 = var18 + var20 * param8;
                              var21 = var21 + param8 * var23;
                              var17_int = var17_int + var19 * param8;
                              param8 = param9;
                              break L9;
                            } else {
                              param8 = -param8;
                              var29 = var29 + param8 * var31;
                              var25 = var25 + param8 * var27;
                              var26 = var26 + param8 * var28;
                              var22 = var22 + var24 * param8;
                              var30 = var30 + var32 * param8;
                              var18 = var18 + var20 * param8;
                              var21 = var21 + param8 * var23;
                              var17_int = var17_int + var19 * param8;
                              param8 = 0;
                              break L10;
                            }
                          }
                        }
                        var36 = bi.field_a[param8];
                        L11: while (true) {
                          if (param8 >= param9) {
                            break L9;
                          } else {
                            L12: {
                              var37 = var17_int >> -1702337296;
                              if (bi.field_c > var37) {
                                var38 = -(var17_int >> -145893392) + (var18 >> 2073914288);
                                if (var38 != 0) {
                                  L13: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (var26 - var25) / var38;
                                    var41 = (var30 - var29) / var38;
                                    if (bi.field_c <= var37 + var38) {
                                      var38 = -1 + bi.field_c - var37;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (-1 < (var37 ^ -1)) {
                                    ha.a(var25 + -(var40 * var37), var36, var41, (byte) -114, var29 - var37 * var41, var39, var40, var38 + var37, param4, var21 - var39 * var37);
                                    break L12;
                                  } else {
                                    ha.a(var25, var37 + var36, var41, (byte) -121, var29, var39, var40, var38, param4, var21);
                                    break L12;
                                  }
                                } else {
                                  if ((var37 ^ -1) > -1) {
                                    break L12;
                                  } else {
                                    if (bi.field_c <= var37) {
                                      break L12;
                                    } else {
                                      ha.a(var25, var37 + var36, 0, (byte) -116, var29, 0, 0, var38, param4, var21);
                                      break L12;
                                    }
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                            param8++;
                            if (param8 >= bi.field_f) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var26 = var26 + var28;
                              var29 = var29 + var31;
                              var18 = var18 + var20;
                              var17_int = var17_int + var19;
                              var36 = var36 + em.field_l;
                              var30 = var30 + var32;
                              var22 = var22 + var24;
                              continue L11;
                            }
                          }
                        }
                      }
                      var36 = -param9 + param10;
                      if (var36 == 0) {
                        var20 = 0;
                        var27 = 0;
                        var32 = 0;
                        var31 = 0;
                        var23 = 0;
                        var19 = 0;
                        var28 = 0;
                        var24 = 0;
                        break L5;
                      } else {
                        L14: {
                          var37 = param13 << -1359081904;
                          var38 = param0 << -2123728752;
                          var39 = param15 << -1878488688;
                          var40 = param16 << 1783984208;
                          if (var33 != 0) {
                            var18 = param5 << -2125281872;
                            var26 = param6 << -1734894736;
                            var22 = param1 << -631182928;
                            var30 = param3 << -1735681808;
                            break L14;
                          } else {
                            var25 = param6 << 1843966800;
                            var17_int = param5 << -1413744272;
                            var29 = param3 << -603765104;
                            var21 = param1 << 221631408;
                            break L14;
                          }
                        }
                        var27 = (var39 + -var25) / var36;
                        var31 = (var40 - var29) / var36;
                        var23 = (-var21 + var38) / var36;
                        var28 = (-var26 + var39) / var36;
                        var32 = (-var30 + var40) / var36;
                        var19 = (-var17_int + var37) / var36;
                        var20 = (-var18 + var37) / var36;
                        var24 = (var38 + -var22) / var36;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if (param8 < 0) {
                      param8 = -param8;
                      var17_int = var17_int + var19 * param8;
                      var25 = var25 + param8 * var27;
                      var29 = var29 + param8 * var31;
                      var21 = var21 + var23 * param8;
                      var18 = var18 + var20 * param8;
                      var26 = var26 + param8 * var28;
                      var30 = var30 + var32 * param8;
                      var22 = var22 + var24 * param8;
                      param8 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var35 = bi.field_a[param8];
                  L16: while (true) {
                    if (param8 >= param10) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var36 = var17_int >> -115984176;
                        if (bi.field_c <= var36) {
                          break L17;
                        } else {
                          var37 = -(var17_int >> 1079880304) + (var18 >> -1434337776);
                          if (-1 != (var37 ^ -1)) {
                            L18: {
                              var38 = (var22 + -var21) / var37;
                              var39 = (-var25 + var26) / var37;
                              var40 = (var30 + -var29) / var37;
                              if (bi.field_c <= var37 + var36) {
                                var37 = -1 + (bi.field_c + -var36);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if ((var36 ^ -1) <= -1) {
                              ha.a(var25, var36 + var35, var40, (byte) -109, var29, var38, var39, var37, param4, var21);
                              break L17;
                            } else {
                              ha.a(var25 + -(var39 * var36), var35, var40, (byte) -103, -(var40 * var36) + var29, var38, var39, var36 + var37, param4, -(var38 * var36) + var21);
                              break L17;
                            }
                          } else {
                            if (0 > var36) {
                              break L17;
                            } else {
                              if (var36 < bi.field_c) {
                                ha.a(var25, var35 + var36, 0, (byte) -114, var29, 0, 0, var37, param4, var21);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      param8++;
                      if (param8 >= bi.field_f) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var35 = var35 + em.field_l;
                        var17_int = var17_int + var19;
                        var22 = var22 + var24;
                        var30 = var30 + var32;
                        var18 = var18 + var20;
                        var29 = var29 + var31;
                        var21 = var21 + var23;
                        var26 = var26 + var28;
                        var25 = var25 + var27;
                        continue L16;
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
          L19: {
            var17 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var17);
            stackOut_79_1 = new StringBuilder().append("va.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param4 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L19;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L19;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                wi.field_i = param0;
                try {
                    if (param1 > -110) {
                        field_b = 2L;
                    }
                    var3 = param2.getParameter("cookieprefix");
                    var4 = param2.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(0 != param0.length())) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    sd.a((byte) -111, param2, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                gl.a((byte) 15, param2);
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "va.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fl a(byte param0) {
        int var2 = 0;
        fl var3 = null;
        var2 = -2 / ((param0 - 48) / 32);
        var3 = this.field_a;
        if (var3 == this.field_c) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var3.field_j;
          return var3;
        }
    }

    public va() {
        this.field_c = new fl();
        this.field_c.field_i = this.field_c;
        this.field_c.field_j = this.field_c;
    }

    final fl a(int param0) {
        fl var2 = this.field_c.field_j;
        if (!(var2 != this.field_c)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_j;
        if (param0 != 0) {
            field_b = 88L;
        }
        return var2;
    }

    static {
    }
}
