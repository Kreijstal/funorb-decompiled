/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ug {
    li field_g;
    int field_j;
    ug field_h;
    static byte[][] field_f;
    static int field_l;
    static ad field_k;
    static java.awt.Frame field_e;
    static le[] field_i;

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
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
        var42 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param4) {
                break L1;
              } else {
                if (ig.field_a <= param12) {
                  break L1;
                } else {
                  L2: {
                    if (-1 >= (param10 ^ -1)) {
                      break L2;
                    } else {
                      if (0 <= param11) {
                        break L2;
                      } else {
                        if (0 <= param8) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ig.field_c > param10) {
                      break L3;
                    } else {
                      if (param11 < ig.field_c) {
                        break L3;
                      } else {
                        if (param8 >= ig.field_c) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param16 == -972948528) {
                      break L4;
                    } else {
                      field_l = -2;
                      break L4;
                    }
                  }
                  L5: {
                    var34 = param4 - param12;
                    if (param13 != param12) {
                      L6: {
                        var26 = param3 << 1257773456;
                        var25 = param3 << 1257773456;
                        var22 = param15 << 1055098224;
                        var21 = param15 << 1055098224;
                        var30 = param9 << -1105007280;
                        var29 = param9 << -1105007280;
                        var18 = param10 << 179075728;
                        var17_int = param10 << 179075728;
                        var35 = -param12 + param13;
                        var20 = (param8 - param10 << -110869168) / var34;
                        var19 = (param11 - param10 << 570979344) / var35;
                        if (var20 <= var19) {
                          var28 = (param0 + -param3 << -567954192) / var35;
                          var27 = (-param3 + param1 << -98996400) / var34;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var31 = (-param9 + param6 << 659433136) / var34;
                          var23 = (-param15 + param14 << -1424879728) / var34;
                          var32 = (-param9 + param5 << -1670743856) / var35;
                          var24 = (param7 - param15 << -1965505392) / var35;
                          var33 = 1;
                          break L6;
                        } else {
                          var23 = (param7 + -param15 << 1951501712) / var35;
                          var24 = (param14 - param15 << -1311537072) / var34;
                          var31 = (-param9 + param5 << 907024336) / var35;
                          var27 = (-param3 + param0 << 2012286064) / var35;
                          var33 = 0;
                          var32 = (param6 - param9 << -277571056) / var34;
                          var28 = (param1 - param3 << -816155696) / var34;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param12 >= 0) {
                            break L8;
                          } else {
                            if (0 <= param13) {
                              param12 = -param12;
                              var30 = var30 + param12 * var32;
                              var26 = var26 + param12 * var28;
                              var21 = var21 + var23 * param12;
                              var17_int = var17_int + var19 * param12;
                              var22 = var22 + param12 * var24;
                              var29 = var29 + param12 * var31;
                              var25 = var25 + param12 * var27;
                              var18 = var18 + param12 * var20;
                              param12 = 0;
                              break L8;
                            } else {
                              param12 = -param12 + param13;
                              var18 = var18 + var20 * param12;
                              var25 = var25 + param12 * var27;
                              var30 = var30 + var32 * param12;
                              var26 = var26 + param12 * var28;
                              var22 = var22 + var24 * param12;
                              var29 = var29 + param12 * var31;
                              var21 = var21 + param12 * var23;
                              var17_int = var17_int + var19 * param12;
                              param12 = param13;
                              break L7;
                            }
                          }
                        }
                        var36 = ig.field_i[param12];
                        L9: while (true) {
                          if (param12 >= param13) {
                            break L7;
                          } else {
                            L10: {
                              var37 = var17_int >> 245846928;
                              if (ig.field_c <= var37) {
                                break L10;
                              } else {
                                var38 = (var18 >> 1378488656) - (var17_int >> 1391907344);
                                if (0 != var38) {
                                  L11: {
                                    var39 = (var22 - var21) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (var37 + var38 < ig.field_c) {
                                      break L11;
                                    } else {
                                      var38 = -1 + ig.field_c - var37;
                                      break L11;
                                    }
                                  }
                                  if ((var37 ^ -1) > -1) {
                                    nd.a(var36, var38 + var37, var41, param2, var39, -23487, var29 - var41 * var37, var40, -(var40 * var37) + var25, -(var39 * var37) + var21);
                                    break L10;
                                  } else {
                                    nd.a(var37 - -var36, var38, var41, param2, var39, -23487, var29, var40, var25, var21);
                                    break L10;
                                  }
                                } else {
                                  if (0 > var37) {
                                    break L10;
                                  } else {
                                    if (var37 >= ig.field_c) {
                                      break L10;
                                    } else {
                                      nd.a(var37 + var36, var38, 0, param2, 0, -23487, var29, 0, var25, var21);
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            param12++;
                            if (param12 < ig.field_a) {
                              var26 = var26 + var28;
                              var17_int = var17_int + var19;
                              var21 = var21 + var23;
                              var30 = var30 + var32;
                              var25 = var25 + var27;
                              var22 = var22 + var24;
                              var18 = var18 + var20;
                              var36 = var36 + ge.field_h;
                              var29 = var29 + var31;
                              continue L9;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var36 = param4 - param13;
                      if (var36 != 0) {
                        L12: {
                          var37 = param8 << 1415178064;
                          var38 = param14 << -1707918256;
                          var39 = param1 << 1745981712;
                          if (var33 == 0) {
                            var25 = param0 << 366421136;
                            var21 = param7 << -808833776;
                            var29 = param5 << 890730960;
                            var17_int = param11 << 909592976;
                            break L12;
                          } else {
                            var26 = param0 << -972948528;
                            var18 = param11 << -1472510224;
                            var22 = param7 << 1411209936;
                            var30 = param5 << -1734466192;
                            break L12;
                          }
                        }
                        var40 = param6 << 441712816;
                        var19 = (var37 + -var17_int) / var36;
                        var20 = (-var18 + var37) / var36;
                        var27 = (var39 + -var25) / var36;
                        var31 = (var40 - var29) / var36;
                        var23 = (var38 + -var21) / var36;
                        var28 = (var39 - var26) / var36;
                        var32 = (-var30 + var40) / var36;
                        var24 = (-var22 + var38) / var36;
                        break L5;
                      } else {
                        var31 = 0;
                        var23 = 0;
                        var24 = 0;
                        var27 = 0;
                        var28 = 0;
                        var32 = 0;
                        var19 = 0;
                        var20 = 0;
                        break L5;
                      }
                    } else {
                      L13: {
                        if (param12 == param4) {
                          var31 = 0;
                          var25 = param3;
                          var17_int = param10 << -1498937936;
                          var19 = 0;
                          var18 = param11 << -1814887568;
                          var27 = 0;
                          var28 = 0;
                          var20 = 0;
                          var24 = 0;
                          var26 = param0;
                          var22 = param7;
                          var21 = param15;
                          var30 = param5;
                          var29 = param9;
                          var23 = 0;
                          var32 = 0;
                          break L13;
                        } else {
                          var35 = param4 - param13;
                          if (param11 > param10) {
                            var31 = (-param9 + param6 << 664192464) / var34;
                            var17_int = param10 << -188632848;
                            var29 = param9 << 1164718128;
                            var21 = param15 << 172491504;
                            var18 = param11 << 1017178672;
                            var28 = (-param0 + param1 << 492952496) / var35;
                            var25 = param3 << -619919888;
                            var30 = param5 << 924653712;
                            var32 = (-param5 + param6 << 1545881488) / var35;
                            var27 = (param1 + -param3 << 984486416) / var34;
                            var24 = (param14 + -param7 << -1538991952) / var35;
                            var19 = (-param10 + param8 << -1237639792) / var34;
                            var23 = (-param15 + param14 << 1300095600) / var34;
                            var20 = (param8 + -param11 << 269818320) / var35;
                            var26 = param0 << -592244720;
                            var22 = param7 << -1911350352;
                            break L13;
                          } else {
                            var23 = (-param7 + param14 << 860607568) / var35;
                            var31 = (param6 + -param5 << 553992400) / var35;
                            var17_int = param11 << -1399034224;
                            var27 = (-param0 + param1 << -650360368) / var35;
                            var28 = (-param3 + param1 << 746105296) / var34;
                            var18 = param10 << 1582160432;
                            var26 = param3 << -950291440;
                            var19 = (param8 - param11 << 1622972880) / var35;
                            var20 = (param8 + -param10 << -448950064) / var34;
                            var22 = param15 << -1183333648;
                            var21 = param7 << 1874725232;
                            var24 = (param14 + -param15 << 1103308304) / var34;
                            var30 = param9 << 295230928;
                            var29 = param5 << -1593343536;
                            var25 = param0 << -274002320;
                            var32 = (param6 - param9 << 121127344) / var34;
                            break L13;
                          }
                        }
                      }
                      var33 = 0;
                      if (-1 >= (param12 ^ -1)) {
                        break L5;
                      } else {
                        param12 = Math.min(-param12, -param12 + param13);
                        var18 = var18 + param12 * var20;
                        var22 = var22 + var24 * param12;
                        var26 = var26 + param12 * var28;
                        var17_int = var17_int + param12 * var19;
                        var29 = var29 + var31 * param12;
                        var30 = var30 + var32 * param12;
                        var25 = var25 + param12 * var27;
                        var21 = var21 + param12 * var23;
                        param12 = 0;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (param12 >= 0) {
                      break L14;
                    } else {
                      param12 = -param12;
                      var25 = var25 + param12 * var27;
                      var26 = var26 + var28 * param12;
                      var22 = var22 + var24 * param12;
                      var21 = var21 + var23 * param12;
                      var29 = var29 + param12 * var31;
                      var30 = var30 + var32 * param12;
                      var18 = var18 + var20 * param12;
                      var17_int = var17_int + param12 * var19;
                      param12 = 0;
                      break L14;
                    }
                  }
                  var35 = ig.field_i[param12];
                  L15: while (true) {
                    if (param4 <= param12) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var36 = var17_int >> -1203816432;
                        if (ig.field_c <= var36) {
                          break L16;
                        } else {
                          var37 = (var18 >> 551450512) + -(var17_int >> 670448880);
                          if (var37 == 0) {
                            if (var36 < 0) {
                              break L16;
                            } else {
                              if (var36 < ig.field_c) {
                                nd.a(var35 + var36, var37, 0, param2, 0, -23487, var29, 0, var25, var21);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (-var25 + var26) / var37;
                              var40 = (-var29 + var30) / var37;
                              if (ig.field_c <= var37 + var36) {
                                var37 = -1 + (ig.field_c - var36);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if ((var36 ^ -1) > -1) {
                              nd.a(var35, var37 - -var36, var40, param2, var38, param16 ^ 972971921, var29 + -(var36 * var40), var39, -(var39 * var36) + var25, var21 + -(var38 * var36));
                              break L16;
                            } else {
                              nd.a(var35 + var36, var37, var40, param2, var38, -23487, var29, var39, var25, var21);
                              break L16;
                            }
                          }
                        }
                      }
                      param12++;
                      if (ig.field_a > param12) {
                        var29 = var29 + var31;
                        var35 = var35 + ge.field_h;
                        var26 = var26 + var28;
                        var25 = var25 + var27;
                        var21 = var21 + var23;
                        var22 = var22 + var24;
                        var18 = var18 + var20;
                        var30 = var30 + var32;
                        var17_int = var17_int + var19;
                        continue L15;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
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
            stackIn_75_0 = (RuntimeException) (var17);

            stackIn_75_1 = new StringBuilder().append("hk.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L18;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L18;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param0;
              var6 = param1 + param4;
              if (ge.field_a < param0) {
                stackIn_4_0 = param0;
                break L1;
              } else {
                stackIn_4_0 = ge.field_a;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (ge.field_f >= param1) {
                stackIn_7_0 = ge.field_f;
                break L2;
              } else {
                stackIn_7_0 = param1;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ge.field_j > var5_int) {
                stackIn_10_0 = var5_int;
                break L3;
              } else {
                stackIn_10_0 = ge.field_j;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= ge.field_k) {
                stackIn_13_0 = ge.field_k;
                break L4;
              } else {
                stackIn_13_0 = var6;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (ge.field_a > param0) {
                break L5;
              } else {
                if (param0 < ge.field_j) {
                  var11 = ge.field_h * var8 - -param0;
                  var12 = 1 - (-var10 - -var8) >> 359888961;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      ge.field_i[var11] = 16777215;
                      var11 = var11 + ge.field_h * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            if (param2 >= 1) {
              L7: {
                if (ge.field_f > param1) {
                  break L7;
                } else {
                  if (ge.field_k > var6) {
                    var11 = ge.field_h * param1 - -var7;
                    var12 = 1 + var9 + -var7 >> -421357055;
                    L8: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        ge.field_i[var11] = 16777215;
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
                if (var5_int < ge.field_a) {
                  break L9;
                } else {
                  if (var5_int >= ge.field_j) {
                    break L9;
                  } else {
                    var11 = ((1 & var5_int + -param0) + var8) * ge.field_h - -var5_int;
                    var12 = -var8 + (1 - -var10) >> -833531359;
                    L10: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L9;
                      } else {
                        ge.field_i[var11] = 16777215;
                        var11 = var11 + ge.field_h * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (param1 < ge.field_f) {
                  break L11;
                } else {
                  if (ge.field_k <= var6) {
                    break L11;
                  } else {
                    var11 = var7 + (var6 * ge.field_h - -(1 & -param1 + var6));
                    var12 = 1 - -var9 - var7 >> 743510657;
                    L12: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L11;
                      } else {
                        ge.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "hk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ai[] a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        ai[] var1 = new ai[eg.field_c];
        if (param0 != 1) {
            return (ai[]) null;
        }
        for (var2 = 0; eg.field_c > var2; var2++) {
            var1[var2] = new ai(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], cb.field_b[var2], fk.field_d);
        }
        gb.a(-119);
        return var1;
    }

    public static void b(byte param0) {
        field_k = null;
        if (param0 != 85) {
            field_k = (ad) null;
        }
        field_i = null;
        field_f = (byte[][]) null;
        field_e = null;
    }

    final static void a(gk param0, md param1, int param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            StringBuilder stackIn_42_1 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            i var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var18 = new i();
                  var18.field_e = param0.a((byte) 114);
                  var18.field_l = param0.e(param2 ^ 80);
                  var18.field_g = new int[var18.field_e];
                  var18.field_k = new ic[var18.field_e];
                  var18.field_f = new byte[var18.field_e][][];
                  if (param2 == -1) {
                    break L1;
                  } else {
                    hk.a(-56, 123, -43, -34, -46);
                    break L1;
                  }
                }
                var18.field_o = new int[var18.field_e];
                var18.field_q = new int[var18.field_e];
                var18.field_s = new ic[var18.field_e];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var18.field_e) {
                    ua.field_v.a(-8212, var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param0.a((byte) 114);
                            if (var6_int == 0) {
                              break L5;
                            } else {
                              if ((var6_int ^ -1) == -2) {
                                break L5;
                              } else {
                                if (2 != var6_int) {
                                  L6: {
                                    if (-4 == (var6_int ^ -1)) {
                                      break L6;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 1;
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param0.f(param2 + 0);
                                  var21 = param0.f(-1);
                                  var9 = param0.a((byte) 114);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var22 = new byte[var9][];
                                        var19 = var22;
                                        var11 = var19;
                                        if (-4 == (var6_int ^ -1)) {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param0.e(126);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param0.a(var22[var12_int], var13, -127, 0);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var18.field_q[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_s[var5] = param1.a(102, var12, di.a(var20, -63), var21);
                                          var18.field_f[var5] = var22;
                                          break L4;
                                        } else {
                                          var12[var17] = di.a(var10[var17], -112);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param0.f(-1);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L11: {
                            var15 = param0.f(param2 ^ 0);
                            var7 = var15;
                            var16 = param0.f(param2 ^ 0);
                            var8 = var16;
                            var9 = 0;
                            if (-2 != (var6_int ^ -1)) {
                              break L11;
                            } else {
                              var9 = param0.e(param2 ^ -127);
                              break L11;
                            }
                          }
                          var18.field_q[var5] = var6_int;
                          var18.field_g[var5] = var9;
                          var18.field_k[var5] = param1.a(false, di.a(var15, param2 + -64), var16);
                          break L4;
                        }
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_o[var5] = -1;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_o[var5] = -2;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_o[var5] = -3;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_o[var5] = -4;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_o[var5] = -5;
                        decompiledRegionSelector0 = 0;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var5++;
                      continue L2;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_39_0 = (RuntimeException) (var4);

                stackIn_39_1 = new StringBuilder().append("hk.C(");

                if (param0 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

                if (param1 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "null";
                  break L18;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "{...}";
                  break L18;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hk(li param0, ug param1) {
        try {
            this.field_g = param0;
            this.field_j = param0.f();
            this.field_h = param1;
            this.field_g.g(re.field_e * this.field_j / 256);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = -1;
        field_f = new byte[250][];
    }
}
