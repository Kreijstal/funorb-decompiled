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
        int var42 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
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
                    if (k.field_f > param13) {
                      break L3;
                    } else {
                      if (k.field_f > param9) {
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
                      var34 = param1 - param3;
                      if (param6 == param3) {
                        L5: {
                          if (param3 != param1) {
                            var35 = param1 - param6;
                            if (param9 <= param13) {
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
                              break L5;
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
                              break L5;
                            }
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
                            break L5;
                          }
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
                      } else {
                        L6: {
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
                          } else {
                            var32 = (param8 + -param7 << -446993904) / var34;
                            var23 = (param10 - param5 << 47289776) / var35;
                            var27 = (param15 + -param11 << -1464114640) / var35;
                            var31 = (-param7 + param14 << 1823951472) / var35;
                            var24 = (param0 + -param5 << 1984144976) / var34;
                            var33 = 0;
                            var28 = (param2 + -param11 << -1239474064) / var34;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            if (param3 < 0) {
                              if (-1 >= (param6 ^ -1)) {
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
                                break L8;
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
                                break L7;
                              }
                            } else {
                              break L8;
                            }
                          }
                          var36 = k.field_e[param3];
                          L9: while (true) {
                            if (param6 <= param3) {
                              break L7;
                            } else {
                              L10: {
                                var37 = var17_int >> 503428368;
                                if (var37 < k.field_f) {
                                  var38 = -(var17_int >> 518468912) + (var18 >> 1155114352);
                                  if (var38 == 0) {
                                    if (0 > var37) {
                                      break L10;
                                    } else {
                                      if (k.field_f <= var37) {
                                        break L10;
                                      } else {
                                        vb.a(0, var25, var38, 0, var21, (byte) -95, param4, 0, var37 - -var36, var29);
                                        break L10;
                                      }
                                    }
                                  } else {
                                    L11: {
                                      var39 = (var22 - var21) / var38;
                                      var40 = (var26 - var25) / var38;
                                      var41 = (-var29 + var30) / var38;
                                      if (var37 - -var38 < k.field_f) {
                                        break L11;
                                      } else {
                                        var38 = k.field_f - var37 - 1;
                                        break L11;
                                      }
                                    }
                                    if (var37 < 0) {
                                      vb.a(var39, -(var40 * var37) + var25, var38 - -var37, var41, var21 + -(var37 * var39), (byte) -95, param4, var40, var36, var29 + -(var41 * var37));
                                      break L10;
                                    } else {
                                      vb.a(var39, var25, var38, var41, var21, (byte) -95, param4, var40, var36 + var37, var29);
                                      break L10;
                                    }
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              param3++;
                              if (param3 < k.field_d) {
                                var21 = var21 + var23;
                                var22 = var22 + var24;
                                var26 = var26 + var28;
                                var30 = var30 + var32;
                                var29 = var29 + var31;
                                var17_int = var17_int + var19;
                                var36 = var36 + lf.field_f;
                                var18 = var18 + var20;
                                var25 = var25 + var27;
                                continue L9;
                              } else {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        var36 = param1 - param6;
                        if (var36 != 0) {
                          L12: {
                            var37 = param16 << 1417813520;
                            var38 = param0 << 221873008;
                            var39 = param2 << -1191438576;
                            if (var33 != 0) {
                              var22 = param10 << 1408694288;
                              var18 = param9 << 1355062160;
                              var30 = param14 << 946440112;
                              var26 = param15 << -748447760;
                              break L12;
                            } else {
                              var21 = param10 << -866746736;
                              var29 = param14 << -264827472;
                              var17_int = param9 << 1065624656;
                              var25 = param15 << 1937650960;
                              break L12;
                            }
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
                          break L4;
                        } else {
                          var24 = 0;
                          var23 = 0;
                          var27 = 0;
                          var19 = 0;
                          var32 = 0;
                          var20 = 0;
                          var28 = 0;
                          var31 = 0;
                          break L4;
                        }
                      }
                    }
                    L13: {
                      if ((param3 ^ -1) <= -1) {
                        break L13;
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
                        break L13;
                      }
                    }
                    var35 = k.field_e[param3];
                    L14: while (true) {
                      if (param1 <= param3) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L15: {
                          var36 = var17_int >> -798359184;
                          if (k.field_f > var36) {
                            var37 = (var18 >> 159836240) - (var17_int >> -1229344336);
                            if (var37 != 0) {
                              L16: {
                                var38 = (var22 - var21) / var37;
                                var39 = (-var25 + var26) / var37;
                                var40 = (var30 - var29) / var37;
                                if (var37 + var36 >= k.field_f) {
                                  var37 = k.field_f - var36 + -1;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if ((var36 ^ -1) > -1) {
                                vb.a(var38, -(var39 * var36) + var25, var36 + var37, var40, var21 - var36 * var38, (byte) -95, param4, var39, var35, -(var36 * var40) + var29);
                                break L15;
                              } else {
                                vb.a(var38, var25, var37, var40, var21, (byte) -95, param4, var39, var35 + var36, var29);
                                break L15;
                              }
                            } else {
                              if (var36 < 0) {
                                break L15;
                              } else {
                                if (var36 < k.field_f) {
                                  vb.a(0, var25, var37, 0, var21, (byte) -95, param4, 0, var36 + var35, var29);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        param3++;
                        if (k.field_d <= param3) {
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
                          continue L14;
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
          L17: {
            var17 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var17);

            stackIn_78_1 = new StringBuilder().append("ul.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L17;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L17;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (null == param1.field_n) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (param1.field_h != param0.field_k) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = param0.field_m.length;
                        var5 = param1.field_n[param3].length / var4_int;
                        if (param2 >= 44) {
                          break L2;
                        } else {
                          ul.a(-76, -113, 52, -107, (int[]) null, 3, 112, 69, -116, -97, 14, -59, 65, 10, -40, 3, 50);
                          break L2;
                        }
                      }
                      var6 = 0;
                      L3: while (true) {
                        if (var5 <= var6) {
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if (param0.field_h == param1.field_i[param3][var6]) {
                              if (md.a(param1.field_j[param3][var6], -98)) {
                                var7 = 0;
                                L5: while (true) {
                                  if (var4_int <= var7) {
                                    stackIn_21_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param1.field_n[param3][var7 + var4_int * var6] != param0.field_m[var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("ul.E(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_24_0;
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
        db var18 = null;
        jb[] var5 = null;
        jb[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        jb[] var15 = null;
        int var11_int = 0;
        db var16 = null;
        db var19 = null;
        db var11 = null;
        db var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var14 = Lexicominos.field_L ? 1 : 0;
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
            for (var8 = 1; var8 < var20.length; var8++) {
                var7[var8] = (int[]) ((Object) var20[0].clone());
            }
            var8 = var5[0].field_i[0];
            var20[2][var8] = 16777215;
            var20[1][var8] = 2394342;
            var20[3][var8] = 4767999;
            for (var9 = 0; 3 > var9; var9++) {
                var15 = var6[var9];
                jb[] var10 = var15;
                for (var11_int = 0; var11_int < var15.length; var11_int++) {
                    var15[var11_int] = bf.a(var20[var11_int], var5[var9], 0);
                }
            }
            var9 = var18.field_u;
            ja.b((byte) -116);
            var18.b();
            lf.b(0, 0, lf.field_f, lf.field_a);
            var16 = new db(var9, var9);
            var19 = var16;
            var19.b();
            var18.b(0, 0);
            var11 = new db(var9, var9);
            var11.b();
            var18.b(-var18.field_p + var9, 0);
            int var12 = -33 / ((param3 - 38) / 59);
            var13 = new db(var18.field_p + -(var9 * 2), var9);
            var13.b();
            var18.b(-var9, 0);
            pd.a(-22949);
            uc.field_hb = new db[]{var16, var13, var11};
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ul.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
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
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
                      if (var3 >= param0.length()) {
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackIn_20_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L1;
                      } else {
                        if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                          stackIn_17_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                stackIn_22_0 = 0;
                return stackIn_22_0 != 0;
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
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("ul.A(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
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
                return stackIn_17_0 != 0;
              } else {
                return stackIn_20_0 != 0;
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
