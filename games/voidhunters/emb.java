/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class emb extends rqa {
    static int field_p;
    static int[] field_o;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var42 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (bfb.field_h > param7) {
                  L2: {
                    if (param15 >= (param9 ^ -1)) {
                      break L2;
                    } else {
                      if (-1 >= (param14 ^ -1)) {
                        break L2;
                      } else {
                        if (-1 < (param16 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param9 < bfb.field_a) {
                      break L3;
                    } else {
                      if (bfb.field_a > param14) {
                        break L3;
                      } else {
                        if (bfb.field_a > param16) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    var34 = -param7 + param3;
                    if (param7 != param13) {
                      L5: {
                        var26 = param8 << 66409008;
                        var25 = param8 << 66409008;
                        var30 = param2 << -123615760;
                        var29 = param2 << -123615760;
                        var22 = param5 << 1995479504;
                        var21 = param5 << 1995479504;
                        var18 = param9 << -1386479184;
                        var17_int = param9 << -1386479184;
                        var35 = -param7 + param13;
                        var19 = (-param9 + param14 << -1793566000) / var35;
                        var20 = (-param9 + param16 << -64223856) / var34;
                        if (var20 > var19) {
                          var33 = 0;
                          var24 = (param12 - param5 << 1002264816) / var34;
                          var28 = (param11 + -param8 << -478820720) / var34;
                          var27 = (-param8 + param0 << -695094800) / var35;
                          var23 = (-param5 + param1 << -1246741744) / var35;
                          var31 = (-param2 + param6 << 1882924656) / var35;
                          var32 = (param10 - param2 << -813148944) / var34;
                          break L5;
                        } else {
                          var24 = (param1 - param5 << 1753349968) / var35;
                          var33 = 1;
                          var27 = (-param8 + param11 << -1077125808) / var34;
                          var28 = (-param8 + param0 << -1887232752) / var35;
                          var23 = (param12 - param5 << 205317648) / var34;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var32 = (-param2 + param6 << 1750283472) / var35;
                          var31 = (param10 + -param2 << 1285122800) / var34;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (-1 < (param7 ^ -1)) {
                            if ((param13 ^ -1) <= -1) {
                              param7 = -param7;
                              var18 = var18 + var20 * param7;
                              var30 = var30 + param7 * var32;
                              var29 = var29 + param7 * var31;
                              var21 = var21 + var23 * param7;
                              var26 = var26 + var28 * param7;
                              var22 = var22 + param7 * var24;
                              var17_int = var17_int + var19 * param7;
                              var25 = var25 + param7 * var27;
                              param7 = 0;
                              break L7;
                            } else {
                              param7 = param13 - param7;
                              var29 = var29 + param7 * var31;
                              var18 = var18 + var20 * param7;
                              var22 = var22 + param7 * var24;
                              var25 = var25 + var27 * param7;
                              var21 = var21 + param7 * var23;
                              var17_int = var17_int + var19 * param7;
                              var30 = var30 + param7 * var32;
                              var26 = var26 + param7 * var28;
                              param7 = param13;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var36 = bfb.field_g[param7];
                        L8: while (true) {
                          if (param7 >= param13) {
                            break L6;
                          } else {
                            L9: {
                              var37 = var17_int >> -454439664;
                              if (bfb.field_a <= var37) {
                                break L9;
                              } else {
                                var38 = (var18 >> -72804304) - (var17_int >> -585879824);
                                if (-1 == (var38 ^ -1)) {
                                  if ((var37 ^ -1) > -1) {
                                    break L9;
                                  } else {
                                    if (bfb.field_a > var37) {
                                      bdb.a(var25, 0, var21, var37 + var36, var38, 0, var29, param4, 0, true);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (var26 - var25) / var38;
                                    var41 = (var30 - var29) / var38;
                                    if (bfb.field_a <= var38 + var37) {
                                      var38 = -var37 + bfb.field_a - 1;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if ((var37 ^ -1) > -1) {
                                    bdb.a(-(var37 * var40) + var25, var40, var21 - var37 * var39, var36, var37 + var38, var41, -(var41 * var37) + var29, param4, var39, true);
                                    break L9;
                                  } else {
                                    bdb.a(var25, var40, var21, var37 - -var36, var38, var41, var29, param4, var39, true);
                                    break L9;
                                  }
                                }
                              }
                            }
                            param7++;
                            if (param7 < bfb.field_h) {
                              var21 = var21 + var23;
                              var36 = var36 + dma.field_g;
                              var25 = var25 + var27;
                              var26 = var26 + var28;
                              var29 = var29 + var31;
                              var17_int = var17_int + var19;
                              var18 = var18 + var20;
                              var30 = var30 + var32;
                              var22 = var22 + var24;
                              continue L8;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var36 = -param13 + param3;
                      if (var36 == 0) {
                        var32 = 0;
                        var31 = 0;
                        var20 = 0;
                        var19 = 0;
                        var28 = 0;
                        var23 = 0;
                        var27 = 0;
                        var24 = 0;
                        break L4;
                      } else {
                        L11: {
                          var37 = param16 << 1210370320;
                          var38 = param12 << -2082345488;
                          var39 = param11 << 916691600;
                          var40 = param10 << -1156121936;
                          if (var33 == 0) {
                            var17_int = param14 << 745908240;
                            var21 = param1 << 1190585680;
                            var25 = param0 << -741709808;
                            var29 = param6 << 1937851504;
                            break L11;
                          } else {
                            var22 = param1 << -382148816;
                            var30 = param6 << -1428507088;
                            var18 = param14 << 872277808;
                            var26 = param0 << -728522992;
                            break L11;
                          }
                        }
                        var23 = (-var21 + var38) / var36;
                        var31 = (-var29 + var40) / var36;
                        var28 = (-var26 + var39) / var36;
                        var19 = (-var17_int + var37) / var36;
                        var24 = (var38 - var22) / var36;
                        var32 = (-var30 + var40) / var36;
                        var27 = (-var25 + var39) / var36;
                        var20 = (-var18 + var37) / var36;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param3 != param7) {
                          var35 = -param13 + param3;
                          if (param14 > param9) {
                            var25 = param8 << 615792048;
                            var27 = (param11 + -param8 << -1262812528) / var34;
                            var26 = param0 << 1276412176;
                            var24 = (param12 - param1 << 1923127344) / var35;
                            var20 = (param16 - param14 << 1627169392) / var35;
                            var30 = param6 << -965311024;
                            var29 = param2 << 2084026800;
                            var18 = param14 << -1432331312;
                            var23 = (param12 - param5 << -1047585840) / var34;
                            var28 = (param11 + -param0 << 1579801872) / var35;
                            var17_int = param9 << 1199838544;
                            var19 = (param16 - param9 << -40211920) / var34;
                            var32 = (param10 + -param6 << 454097392) / var35;
                            var31 = (-param2 + param10 << -2047704688) / var34;
                            var22 = param1 << -2016149840;
                            var21 = param5 << -1937257168;
                            break L12;
                          } else {
                            var25 = param0 << 1972291920;
                            var21 = param1 << 1292399504;
                            var18 = param9 << 1894446960;
                            var27 = (-param0 + param11 << 2072281232) / var35;
                            var20 = (-param9 + param16 << 1851624304) / var34;
                            var17_int = param14 << -597598928;
                            var30 = param2 << -52220752;
                            var29 = param6 << 1038370768;
                            var32 = (param10 + -param2 << -489942192) / var34;
                            var23 = (-param1 + param12 << -1439410928) / var35;
                            var22 = param5 << 763022416;
                            var31 = (-param6 + param10 << 1658876496) / var35;
                            var26 = param8 << 558641552;
                            var28 = (-param8 + param11 << -255913840) / var34;
                            var24 = (param12 - param5 << -1343973840) / var34;
                            var19 = (-param14 + param16 << -164655344) / var35;
                            break L12;
                          }
                        } else {
                          var27 = 0;
                          var18 = param14 << -676759152;
                          var20 = 0;
                          var17_int = param9 << 1255503664;
                          var31 = 0;
                          var23 = 0;
                          var32 = 0;
                          var24 = 0;
                          var26 = param0;
                          var19 = 0;
                          var30 = param6;
                          var22 = param1;
                          var28 = 0;
                          var21 = param5;
                          var25 = param8;
                          var29 = param2;
                          break L12;
                        }
                      }
                      var33 = 0;
                      if (-1 >= (param7 ^ -1)) {
                        break L4;
                      } else {
                        param7 = Math.min(-param7, param13 + -param7);
                        var18 = var18 + param7 * var20;
                        var21 = var21 + var23 * param7;
                        var26 = var26 + var28 * param7;
                        var25 = var25 + var27 * param7;
                        var29 = var29 + param7 * var31;
                        var22 = var22 + var24 * param7;
                        var30 = var30 + param7 * var32;
                        var17_int = var17_int + var19 * param7;
                        param7 = 0;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (param7 < 0) {
                      param7 = -param7;
                      var22 = var22 + param7 * var24;
                      var21 = var21 + var23 * param7;
                      var30 = var30 + var32 * param7;
                      var29 = var29 + var31 * param7;
                      var18 = var18 + var20 * param7;
                      var26 = var26 + param7 * var28;
                      var25 = var25 + var27 * param7;
                      var17_int = var17_int + param7 * var19;
                      param7 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var35 = bfb.field_g[param7];
                  L14: while (true) {
                    if (param7 >= param3) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L15: {
                        var36 = var17_int >> -878846512;
                        if (var36 < bfb.field_a) {
                          var37 = (var18 >> -224428816) + -(var17_int >> -41904944);
                          if (var37 != 0) {
                            L16: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (var26 + -var25) / var37;
                              var40 = (-var29 + var30) / var37;
                              if (bfb.field_a <= var36 + var37) {
                                var37 = -var36 + bfb.field_a - 1;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if ((var36 ^ -1) > -1) {
                              bdb.a(var25 + -(var36 * var39), var39, var21 - var36 * var38, var35, var37 - -var36, var40, var29 + -(var36 * var40), param4, var38, true);
                              break L15;
                            } else {
                              bdb.a(var25, var39, var21, var36 - -var35, var37, var40, var29, param4, var38, true);
                              break L15;
                            }
                          } else {
                            if ((var36 ^ -1) > -1) {
                              break L15;
                            } else {
                              if (var36 >= bfb.field_a) {
                                break L15;
                              } else {
                                bdb.a(var25, 0, var21, var36 + var35, var37, 0, var29, param4, 0, true);
                                break L15;
                              }
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      param7++;
                      if (param7 < bfb.field_h) {
                        var30 = var30 + var32;
                        var22 = var22 + var24;
                        var18 = var18 + var20;
                        var29 = var29 + var31;
                        var35 = var35 + dma.field_g;
                        var26 = var26 + var28;
                        var17_int = var17_int + var19;
                        var25 = var25 + var27;
                        var21 = var21 + var23;
                        continue L14;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
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
            stackOut_74_0 = (RuntimeException) (var17);
            stackOut_74_1 = new StringBuilder().append("emb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L17;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L17;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    emb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                emb.a(62);
                break L1;
              }
            }
            si.a(76, 62, param0[0].a(92));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("emb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != 23518) {
            emb.a(-25, -40, 101, -77, (int[]) null, -65, 79, 17, 32, 59, 77, -19, 88, -80, -117, 21, 79);
        }
        field_o = null;
    }

    static {
        field_p = 0;
    }
}
