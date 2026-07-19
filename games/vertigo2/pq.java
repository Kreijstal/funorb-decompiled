/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    static long field_e;
    static int[] field_c;
    static wk field_f;
    static String field_a;
    private int[] field_d;
    static String field_g;
    static String field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var3 = -1 + (this.field_d.length >> -1595717119);
          if (param1 == 1) {
            break L0;
          } else {
            field_f = (wk) null;
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = this.field_d[var4 + (var4 - -1)];
          if (0 != (var5 ^ -1)) {
            if (param0 != this.field_d[var4 + var4]) {
              var4 = var3 & var4 + 1;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, boolean param14, int param15, int param16) {
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
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var42 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 < (param3 ^ -1)) {
                break L1;
              } else {
                if (param7 < oo.field_b) {
                  L2: {
                    if (-1 >= (param2 ^ -1)) {
                      break L2;
                    } else {
                      if (0 <= param12) {
                        break L2;
                      } else {
                        if ((param8 ^ -1) > -1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 < oo.field_q) {
                      break L3;
                    } else {
                      if (oo.field_q > param12) {
                        break L3;
                      } else {
                        if (oo.field_q > param8) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param14) {
                    L4: {
                      var34 = -param7 + param3;
                      if (param16 != param7) {
                        L5: {
                          var30 = param15 << -1725134448;
                          var29 = param15 << -1725134448;
                          var22 = param5 << -1364282704;
                          var21 = param5 << -1364282704;
                          var26 = param0 << 1333410768;
                          var25 = param0 << 1333410768;
                          var18 = param2 << -1290703536;
                          var17_int = param2 << -1290703536;
                          var35 = param16 + -param7;
                          var19 = (-param2 + param12 << 498480592) / var35;
                          var20 = (-param2 + param8 << 791128208) / var34;
                          if (var19 >= var20) {
                            var36 = var19;
                            var19 = var20;
                            var20 = var36;
                            var33 = 1;
                            var28 = (param1 + -param0 << 1046983120) / var35;
                            var24 = (-param5 + param9 << 1945341648) / var35;
                            var23 = (param4 - param5 << -362314544) / var34;
                            var32 = (param6 - param15 << -218003696) / var35;
                            var27 = (-param0 + param11 << -1744247824) / var34;
                            var31 = (-param15 + param10 << -1001332400) / var34;
                            break L5;
                          } else {
                            var28 = (-param0 + param11 << 571334640) / var34;
                            var32 = (-param15 + param10 << 1195994448) / var34;
                            var31 = (param6 - param15 << -503275536) / var35;
                            var33 = 0;
                            var24 = (-param5 + param4 << 191840080) / var34;
                            var27 = (param1 - param0 << -711174864) / var35;
                            var23 = (-param5 + param9 << -1267668528) / var35;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if ((param7 ^ -1) <= -1) {
                              break L7;
                            } else {
                              if ((param16 ^ -1) <= -1) {
                                param7 = -param7;
                                var21 = var21 + var23 * param7;
                                var22 = var22 + param7 * var24;
                                var17_int = var17_int + param7 * var19;
                                var30 = var30 + var32 * param7;
                                var29 = var29 + var31 * param7;
                                var25 = var25 + var27 * param7;
                                var18 = var18 + var20 * param7;
                                var26 = var26 + var28 * param7;
                                param7 = 0;
                                break L7;
                              } else {
                                param7 = param16 - param7;
                                var22 = var22 + param7 * var24;
                                var18 = var18 + var20 * param7;
                                var17_int = var17_int + param7 * var19;
                                var30 = var30 + var32 * param7;
                                var29 = var29 + var31 * param7;
                                var25 = var25 + param7 * var27;
                                var26 = var26 + var28 * param7;
                                var21 = var21 + param7 * var23;
                                param7 = param16;
                                break L6;
                              }
                            }
                          }
                          var36 = oo.field_a[param7];
                          L8: while (true) {
                            if (param16 <= param7) {
                              break L6;
                            } else {
                              L9: {
                                var37 = var17_int >> 1458374608;
                                if (oo.field_q <= var37) {
                                  break L9;
                                } else {
                                  var38 = (var18 >> 877371504) - (var17_int >> -1337012496);
                                  if (-1 == (var38 ^ -1)) {
                                    if ((var37 ^ -1) > -1) {
                                      break L9;
                                    } else {
                                      if (var37 >= oo.field_q) {
                                        break L9;
                                      } else {
                                        hm.a(0, 0, var25, var38, (byte) 120, var21, var29, param13, var36 + var37, 0);
                                        break L9;
                                      }
                                    }
                                  } else {
                                    L10: {
                                      var39 = (-var21 + var22) / var38;
                                      var40 = (var26 + -var25) / var38;
                                      var41 = (var30 - var29) / var38;
                                      if (var37 + var38 < oo.field_q) {
                                        break L10;
                                      } else {
                                        var38 = -var37 + (oo.field_q + -1);
                                        break L10;
                                      }
                                    }
                                    if ((var37 ^ -1) <= -1) {
                                      hm.a(var41, var40, var25, var38, (byte) 52, var21, var29, param13, var37 + var36, var39);
                                      break L9;
                                    } else {
                                      hm.a(var41, var40, var25 + -(var40 * var37), var37 + var38, (byte) 40, var21 - var37 * var39, -(var41 * var37) + var29, param13, var36, var39);
                                      break L9;
                                    }
                                  }
                                }
                              }
                              param7++;
                              if (param7 < oo.field_b) {
                                var17_int = var17_int + var19;
                                var18 = var18 + var20;
                                var36 = var36 + bi.field_e;
                                var26 = var26 + var28;
                                var25 = var25 + var27;
                                var21 = var21 + var23;
                                var30 = var30 + var32;
                                var29 = var29 + var31;
                                var22 = var22 + var24;
                                continue L8;
                              } else {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        var36 = -param16 + param3;
                        if (-1 == (var36 ^ -1)) {
                          var20 = 0;
                          var32 = 0;
                          var27 = 0;
                          var28 = 0;
                          var24 = 0;
                          var19 = 0;
                          var31 = 0;
                          var23 = 0;
                          break L4;
                        } else {
                          L11: {
                            var37 = param8 << 423677392;
                            var38 = param4 << 294978800;
                            var39 = param11 << -631859248;
                            if (var33 == 0) {
                              var29 = param6 << -664679472;
                              var25 = param1 << -1095482096;
                              var17_int = param12 << 1575134832;
                              var21 = param9 << -1561515824;
                              break L11;
                            } else {
                              var30 = param6 << -255400720;
                              var18 = param12 << -139098480;
                              var22 = param9 << -1709980112;
                              var26 = param1 << -1945535728;
                              break L11;
                            }
                          }
                          var40 = param10 << 1293517648;
                          var27 = (var39 - var25) / var36;
                          var31 = (var40 + -var29) / var36;
                          var23 = (-var21 + var38) / var36;
                          var20 = (-var18 + var37) / var36;
                          var24 = (-var22 + var38) / var36;
                          var32 = (-var30 + var40) / var36;
                          var28 = (var39 - var26) / var36;
                          var19 = (var37 - var17_int) / var36;
                          break L4;
                        }
                      } else {
                        L12: {
                          if (param7 == param3) {
                            var27 = 0;
                            var22 = param9;
                            var28 = 0;
                            var25 = param0;
                            var31 = 0;
                            var23 = 0;
                            var26 = param1;
                            var20 = 0;
                            var30 = param6;
                            var24 = 0;
                            var32 = 0;
                            var19 = 0;
                            var17_int = param2 << 288847216;
                            var29 = param15;
                            var18 = param12 << -2064078384;
                            var21 = param5;
                            break L12;
                          } else {
                            var35 = param3 - param16;
                            if (param2 < param12) {
                              var25 = param0 << -1762827152;
                              var23 = (param4 - param5 << 1298668496) / var34;
                              var22 = param9 << 1554853776;
                              var18 = param12 << -1705196976;
                              var27 = (-param0 + param11 << 1827569136) / var34;
                              var26 = param1 << -1609827952;
                              var28 = (param11 + -param1 << -449203536) / var35;
                              var20 = (param8 - param12 << 1084262800) / var35;
                              var17_int = param2 << 2118127248;
                              var32 = (-param6 + param10 << 897544784) / var35;
                              var24 = (param4 + -param9 << 915163152) / var35;
                              var29 = param15 << -975995824;
                              var30 = param6 << -1915460144;
                              var31 = (param10 - param15 << 1019225424) / var34;
                              var19 = (-param2 + param8 << 310600656) / var34;
                              var21 = param5 << 906277744;
                              break L12;
                            } else {
                              var32 = (-param15 + param10 << 1484533072) / var34;
                              var24 = (param4 - param5 << 1075680688) / var34;
                              var21 = param9 << -1846949328;
                              var31 = (param10 - param6 << 944490928) / var35;
                              var22 = param5 << -1347963760;
                              var28 = (-param0 + param11 << -1665232912) / var34;
                              var29 = param6 << -265967536;
                              var30 = param15 << 1823910960;
                              var20 = (param8 - param2 << 533106064) / var34;
                              var26 = param0 << -1304094992;
                              var17_int = param12 << 792434512;
                              var25 = param1 << 52570736;
                              var19 = (param8 + -param12 << 2072181072) / var35;
                              var18 = param2 << -1905908912;
                              var27 = (param11 - param1 << 92780176) / var35;
                              var23 = (-param9 + param4 << -1139055088) / var35;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (0 <= param7) {
                            break L13;
                          } else {
                            param7 = Math.min(-param7, param16 + -param7);
                            var26 = var26 + var28 * param7;
                            var30 = var30 + param7 * var32;
                            var18 = var18 + var20 * param7;
                            var29 = var29 + param7 * var31;
                            var22 = var22 + param7 * var24;
                            var25 = var25 + param7 * var27;
                            var21 = var21 + param7 * var23;
                            var17_int = var17_int + param7 * var19;
                            param7 = 0;
                            break L13;
                          }
                        }
                        var33 = 0;
                        break L4;
                      }
                    }
                    L14: {
                      if ((param7 ^ -1) <= -1) {
                        break L14;
                      } else {
                        param7 = -param7;
                        var17_int = var17_int + var19 * param7;
                        var25 = var25 + var27 * param7;
                        var30 = var30 + param7 * var32;
                        var22 = var22 + var24 * param7;
                        var21 = var21 + param7 * var23;
                        var18 = var18 + var20 * param7;
                        var29 = var29 + param7 * var31;
                        var26 = var26 + param7 * var28;
                        param7 = 0;
                        break L14;
                      }
                    }
                    var35 = oo.field_a[param7];
                    L15: while (true) {
                      if (param7 >= param3) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L16: {
                          var36 = var17_int >> 2128594352;
                          if (var36 >= oo.field_q) {
                            break L16;
                          } else {
                            var37 = (var18 >> -174542640) - (var17_int >> -1802088432);
                            if (var37 == 0) {
                              if ((var36 ^ -1) > -1) {
                                break L16;
                              } else {
                                if (oo.field_q > var36) {
                                  hm.a(0, 0, var25, var37, (byte) 68, var21, var29, param13, var36 + var35, 0);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            } else {
                              L17: {
                                var38 = (var22 + -var21) / var37;
                                var39 = (-var25 + var26) / var37;
                                var40 = (var30 - var29) / var37;
                                if (var36 - -var37 >= oo.field_q) {
                                  var37 = -1 + -var36 + oo.field_q;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              if ((var36 ^ -1) > -1) {
                                hm.a(var40, var39, -(var39 * var36) + var25, var36 + var37, (byte) 107, var21 + -(var36 * var38), var29 + -(var36 * var40), param13, var35, var38);
                                break L16;
                              } else {
                                hm.a(var40, var39, var25, var37, (byte) 89, var21, var29, param13, var36 + var35, var38);
                                break L16;
                              }
                            }
                          }
                        }
                        param7++;
                        if (oo.field_b > param7) {
                          var18 = var18 + var20;
                          var35 = var35 + bi.field_e;
                          var17_int = var17_int + var19;
                          var30 = var30 + var32;
                          var29 = var29 + var31;
                          var22 = var22 + var24;
                          var26 = var26 + var28;
                          var25 = var25 + var27;
                          var21 = var21 + var23;
                          continue L15;
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
            stackOut_73_0 = (RuntimeException) (var17);
            stackOut_73_1 = new StringBuilder().append("pq.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param13 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    pq(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> -566478847) + param0.length < var2_int) {
                this.field_d = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int - -var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if (this.field_d[var4 + (var4 - -1)] == -1) {
                            this.field_d[var4 - -var4] = param0[var3];
                            this.field_d[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_d[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("pq.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            field_e = 43L;
        }
        gl.field_k = true;
        aj.field_j = 15000L + gk.a(56);
        return -12 == (hn.field_w ^ -1) ? true : false;
    }

    final static void a(byte param0) {
        boolean discarded$0 = false;
        pe.field_r = false;
        if (param0 <= 92) {
            discarded$0 = pq.b(-21);
        }
        hj.field_b = id.field_f.h(-11) == 0 ? true : false;
    }

    static {
        field_a = "You are on <%0>";
        field_b = "Updates will sent to the email address you've given";
        field_g = "Open";
    }
}
