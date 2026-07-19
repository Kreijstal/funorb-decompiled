/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends bb {
    static bh field_p;
    static String field_o;
    static int field_n;
    static String field_q;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var42 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (-1 < (param7 ^ -1)) {
                break L1;
              } else {
                if (cj.field_d > param3) {
                  L2: {
                    if ((param9 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (0 <= param15) {
                        break L2;
                      } else {
                        if (0 <= param11) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param9 < cj.field_b) {
                      break L3;
                    } else {
                      if (param15 < cj.field_b) {
                        break L3;
                      } else {
                        if (cj.field_b <= param11) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param12 <= -119) {
                      break L4;
                    } else {
                      field_q = (String) null;
                      break L4;
                    }
                  }
                  L5: {
                    var34 = -param3 + param7;
                    if (param0 != param3) {
                      L6: {
                        var26 = param8 << -1284809424;
                        var25 = param8 << -1284809424;
                        var22 = param6 << -243131792;
                        var21 = param6 << -243131792;
                        var18 = param9 << -1157620752;
                        var17_int = param9 << -1157620752;
                        var30 = param14 << -197505680;
                        var29 = param14 << -197505680;
                        var35 = param0 + -param3;
                        var19 = (param15 - param9 << -243510096) / var35;
                        var20 = (param11 - param9 << 329092208) / var34;
                        if (var19 >= var20) {
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var24 = (-param6 + param10 << 1270898512) / var35;
                          var27 = (param1 - param8 << 1476922704) / var34;
                          var33 = 1;
                          var31 = (param2 + -param14 << -699156944) / var34;
                          var23 = (param16 + -param6 << -121021264) / var34;
                          var28 = (-param8 + param4 << -1472766640) / var35;
                          var32 = (-param14 + param5 << -508261968) / var35;
                          break L6;
                        } else {
                          var27 = (param4 - param8 << -820373680) / var35;
                          var33 = 0;
                          var23 = (param10 - param6 << 635705456) / var35;
                          var32 = (param2 + -param14 << 559492816) / var34;
                          var28 = (param1 - param8 << -1508434352) / var34;
                          var24 = (param16 - param6 << -783575888) / var34;
                          var31 = (param5 + -param14 << -489020144) / var35;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (0 > param3) {
                            if (0 <= param0) {
                              param3 = -param3;
                              var21 = var21 + param3 * var23;
                              var26 = var26 + var28 * param3;
                              var30 = var30 + param3 * var32;
                              var18 = var18 + var20 * param3;
                              var25 = var25 + param3 * var27;
                              var17_int = var17_int + param3 * var19;
                              var22 = var22 + var24 * param3;
                              var29 = var29 + var31 * param3;
                              param3 = 0;
                              break L8;
                            } else {
                              param3 = -param3 + param0;
                              var21 = var21 + param3 * var23;
                              var17_int = var17_int + param3 * var19;
                              var18 = var18 + var20 * param3;
                              var30 = var30 + var32 * param3;
                              var29 = var29 + var31 * param3;
                              var25 = var25 + var27 * param3;
                              var22 = var22 + var24 * param3;
                              var26 = var26 + param3 * var28;
                              param3 = param0;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var36 = cj.field_a[param3];
                        L9: while (true) {
                          if (param3 >= param0) {
                            break L7;
                          } else {
                            L10: {
                              var37 = var17_int >> -284489680;
                              if (var37 < cj.field_b) {
                                var38 = (var18 >> -331794448) + -(var17_int >> 1184200624);
                                if (-1 != (var38 ^ -1)) {
                                  L11: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (var26 - var25) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (var37 + var38 >= cj.field_b) {
                                      var38 = cj.field_b - (var37 - -1);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (var37 < 0) {
                                    uk.a(var38 + var37, var39, var41, var21 + -(var37 * var39), var36, var40, param13, true, var25 + -(var40 * var37), var29 + -(var41 * var37));
                                    break L10;
                                  } else {
                                    uk.a(var38, var39, var41, var21, var37 - -var36, var40, param13, true, var25, var29);
                                    break L10;
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L10;
                                  } else {
                                    if (cj.field_b > var37) {
                                      uk.a(var38, 0, 0, var21, var37 + var36, 0, param13, true, var25, var29);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            param3++;
                            if (param3 >= cj.field_d) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var21 = var21 + var23;
                              var17_int = var17_int + var19;
                              var30 = var30 + var32;
                              var29 = var29 + var31;
                              var36 = var36 + ed.field_h;
                              var26 = var26 + var28;
                              var22 = var22 + var24;
                              var18 = var18 + var20;
                              var25 = var25 + var27;
                              continue L9;
                            }
                          }
                        }
                      }
                      var36 = -param0 + param7;
                      if (-1 == (var36 ^ -1)) {
                        var23 = 0;
                        var20 = 0;
                        var27 = 0;
                        var31 = 0;
                        var19 = 0;
                        var32 = 0;
                        var24 = 0;
                        var28 = 0;
                        break L5;
                      } else {
                        L12: {
                          var37 = param11 << -1298556240;
                          var38 = param16 << -1463334000;
                          var39 = param1 << 1589987824;
                          var40 = param2 << 645487984;
                          if (var33 == 0) {
                            var17_int = param15 << -1483228208;
                            var25 = param4 << -2067014992;
                            var29 = param5 << -806482672;
                            var21 = param10 << 1031499024;
                            break L12;
                          } else {
                            var26 = param4 << 635242640;
                            var30 = param5 << 1484110320;
                            var18 = param15 << -1750318576;
                            var22 = param10 << -1205717776;
                            break L12;
                          }
                        }
                        var23 = (-var21 + var38) / var36;
                        var28 = (var39 - var26) / var36;
                        var31 = (var40 - var29) / var36;
                        var20 = (var37 - var18) / var36;
                        var32 = (var40 + -var30) / var36;
                        var19 = (-var17_int + var37) / var36;
                        var24 = (var38 + -var22) / var36;
                        var27 = (var39 + -var25) / var36;
                        break L5;
                      }
                    } else {
                      L13: {
                        if (param7 == param3) {
                          var18 = param15 << -590686896;
                          var28 = 0;
                          var17_int = param9 << 2039308400;
                          var20 = 0;
                          var30 = param5;
                          var29 = param14;
                          var26 = param4;
                          var22 = param10;
                          var23 = 0;
                          var32 = 0;
                          var24 = 0;
                          var27 = 0;
                          var31 = 0;
                          var19 = 0;
                          var21 = param6;
                          var25 = param8;
                          break L13;
                        } else {
                          var35 = -param0 + param7;
                          if (param9 >= param15) {
                            var20 = (param11 - param9 << 178642032) / var34;
                            var17_int = param15 << -600993456;
                            var26 = param8 << 1912355760;
                            var30 = param14 << -74254000;
                            var21 = param10 << 2123502896;
                            var32 = (-param14 + param2 << -123939472) / var34;
                            var27 = (-param4 + param1 << 1986950608) / var35;
                            var29 = param5 << 516691024;
                            var18 = param9 << 1353176400;
                            var24 = (-param6 + param16 << -1298060208) / var34;
                            var28 = (param1 - param8 << 1297643504) / var34;
                            var31 = (-param5 + param2 << -365176976) / var35;
                            var23 = (-param10 + param16 << -2057309584) / var35;
                            var25 = param4 << -293982224;
                            var19 = (param11 - param15 << -319562544) / var35;
                            var22 = param6 << 735316912;
                            break L13;
                          } else {
                            var32 = (-param5 + param2 << -1097898448) / var35;
                            var28 = (param1 - param4 << -1442946672) / var35;
                            var20 = (-param15 + param11 << 1083482512) / var35;
                            var30 = param5 << 1026589936;
                            var27 = (param1 - param8 << 1987889040) / var34;
                            var24 = (param16 + -param10 << -179929072) / var35;
                            var19 = (param11 - param9 << 675140752) / var34;
                            var18 = param15 << -791902768;
                            var26 = param4 << 82560048;
                            var25 = param8 << 1529205648;
                            var31 = (-param14 + param2 << -282740048) / var34;
                            var23 = (-param6 + param16 << -2138163024) / var34;
                            var29 = param14 << -325038320;
                            var22 = param10 << 544991632;
                            var17_int = param9 << 1741424272;
                            var21 = param6 << 921403664;
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (0 <= param3) {
                          break L14;
                        } else {
                          param3 = Math.min(-param3, -param3 + param0);
                          var26 = var26 + param3 * var28;
                          var30 = var30 + var32 * param3;
                          var18 = var18 + param3 * var20;
                          var25 = var25 + param3 * var27;
                          var21 = var21 + var23 * param3;
                          var29 = var29 + var31 * param3;
                          var22 = var22 + param3 * var24;
                          var17_int = var17_int + param3 * var19;
                          param3 = 0;
                          break L14;
                        }
                      }
                      var33 = 0;
                      break L5;
                    }
                  }
                  L15: {
                    if (0 > param3) {
                      param3 = -param3;
                      var26 = var26 + var28 * param3;
                      var30 = var30 + param3 * var32;
                      var18 = var18 + var20 * param3;
                      var21 = var21 + var23 * param3;
                      var22 = var22 + var24 * param3;
                      var29 = var29 + param3 * var31;
                      var25 = var25 + var27 * param3;
                      var17_int = var17_int + var19 * param3;
                      param3 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var35 = cj.field_a[param3];
                  L16: while (true) {
                    if (param7 <= param3) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var36 = var17_int >> 1071679792;
                        if (var36 < cj.field_b) {
                          var37 = (var18 >> -583936752) + -(var17_int >> 558224912);
                          if (0 != var37) {
                            L18: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (-var25 + var26) / var37;
                              var40 = (var30 + -var29) / var37;
                              if (var37 + var36 >= cj.field_b) {
                                var37 = cj.field_b + (-var36 + -1);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (0 <= var36) {
                              uk.a(var37, var38, var40, var21, var35 + var36, var39, param13, true, var25, var29);
                              break L17;
                            } else {
                              uk.a(var36 + var37, var38, var40, -(var36 * var38) + var21, var35, var39, param13, true, var25 - var36 * var39, -(var36 * var40) + var29);
                              break L17;
                            }
                          } else {
                            if (0 > var36) {
                              break L17;
                            } else {
                              if (var36 < cj.field_b) {
                                uk.a(var37, 0, 0, var21, var35 + var36, 0, param13, true, var25, var29);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param3++;
                      if (param3 >= cj.field_d) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var30 = var30 + var32;
                        var17_int = var17_int + var19;
                        var25 = var25 + var27;
                        var35 = var35 + ed.field_h;
                        var21 = var21 + var23;
                        var26 = var26 + var28;
                        var29 = var29 + var31;
                        var22 = var22 + var24;
                        var18 = var18 + var20;
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
            stackOut_81_0 = (RuntimeException) (var17);
            stackOut_81_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param13 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L19;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L19;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    nh(long param0, String param1) {
        super(param0, param1);
    }

    final static bh a(int param0, int param1) {
        bh[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        bh[] var5 = null;
        var4 = wizardrun.field_H;
        var5 = od.b(109);
        var2 = var5;
        var3 = param0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (param1 != var5[var3].field_h) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    final sd a(boolean param0) {
        if (!param0) {
            field_q = (String) null;
        }
        return pc.field_m;
    }

    final static void c(byte param0) {
        gj.field_b = 0;
        ag.field_u = -1;
        vb.field_I = null;
        uc.field_a = -1;
        ol.field_b = false;
        int var1 = 71 / ((25 - param0) / 57);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var5_int = param1 + param4;
              var6 = param3 + param2;
              if (ed.field_c < param4) {
                stackOut_3_0 = param4;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ed.field_c;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param2 > ed.field_i) {
                stackOut_6_0 = param2;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ed.field_i;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ed.field_l > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ed.field_l;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= ed.field_b) {
                stackOut_12_0 = ed.field_b;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (ed.field_c > param4) {
                break L5;
              } else {
                if (ed.field_l > param4) {
                  var11 = param4 + ed.field_h * var8;
                  var12 = 1 - (-var10 - -var8) >> -971148351;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 = var11 + ed.field_h * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (ed.field_i > param2) {
                break L7;
              } else {
                if (ed.field_b > var6) {
                  var11 = param2 * ed.field_h - -var7;
                  var12 = -var7 + (var9 + 1) >> 889421473;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (var5_int < ed.field_c) {
                break L9;
              } else {
                if (var5_int < ed.field_l) {
                  var11 = ed.field_h * (var8 - -(var5_int - param4 & 1)) + var5_int;
                  var12 = var10 + 1 - var8 >> -305533567;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 = var11 + ed.field_h * 2;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (param2 < ed.field_i) {
                break L11;
              } else {
                if (var6 < ed.field_b) {
                  var11 = var7 + (var6 * ed.field_h - -(1 & var6 + -param2));
                  var12 = -var7 + var9 + 1 >> -980718527;
                  L12: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L11;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (param0 == 69) {
                break L13;
              } else {
                field_o = (String) null;
                break L13;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "nh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        int var1 = 9 / ((param0 - 53) / 57);
    }

    static {
        field_o = "Waiting for extra data";
        field_p = new bh(0, 2, 2, 1);
        field_q = "achievements to collect";
    }
}
