/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static ri[] field_a;
    static qu field_b;
    static String field_d;
    private pj field_e;
    private ro field_g;
    private int field_f;
    static String field_h;
    private te field_c;

    final pj a(byte param0, long param1) {
        pj var4 = (pj) ((Object) this.field_c.a(param0 ^ -60, param1));
        if (param0 != -88) {
            this.a((byte) -122, 80L);
        }
        if (var4 != null) {
            this.field_g.a(var4, (byte) -114);
        }
        return var4;
    }

    final void a(long param0, pj param1, int param2) {
        pj var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (this.field_f != 0) {
                this.field_f = this.field_f - 1;
                break L1;
              } else {
                var5 = this.field_g.b((byte) 72);
                var5.b(false);
                var5.c(-5106);
                if (this.field_e == var5) {
                  var5 = this.field_g.b((byte) 72);
                  var5.b(false);
                  var5.c(-5106);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              this.field_c.a(param1, -1, param0);
              if (param2 < -114) {
                break L2;
              } else {
                this.field_g = (ro) null;
                break L2;
              }
            }
            this.field_g.a(param1, (byte) -109);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("ph.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1882049616) {
            return;
        }
        field_b = null;
        field_h = null;
        field_d = null;
        field_a = null;
    }

    final static void a(byte param0) {
        f.field_s = null;
        if (param0 > -77) {
            field_h = (String) null;
        }
        gf.field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, byte param14, int param15, int param16) {
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        var42 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param12 ^ -1) > -1) {
                break L1;
              } else {
                if (param13 < nk.field_c) {
                  L2: {
                    if (-1 >= (param0 ^ -1)) {
                      break L2;
                    } else {
                      if (param9 >= 0) {
                        break L2;
                      } else {
                        if (param10 < 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (nk.field_i > param0) {
                      break L3;
                    } else {
                      if (nk.field_i > param9) {
                        break L3;
                      } else {
                        if (param10 >= nk.field_i) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param14 == -48) {
                      break L4;
                    } else {
                      field_d = (String) null;
                      break L4;
                    }
                  }
                  L5: {
                    var34 = -param13 + param12;
                    if (param13 == param16) {
                      L6: {
                        if (param13 == param12) {
                          var29 = param6;
                          var31 = 0;
                          var26 = param8;
                          var19 = 0;
                          var18 = param9 << -1077523088;
                          var30 = param5;
                          var28 = 0;
                          var25 = param11;
                          var24 = 0;
                          var17_int = param0 << 1437709936;
                          var21 = param15;
                          var27 = 0;
                          var23 = 0;
                          var32 = 0;
                          var20 = 0;
                          var22 = param7;
                          break L6;
                        } else {
                          var35 = -param16 + param12;
                          if (param0 >= param9) {
                            var27 = (param2 + -param8 << -2121466096) / var35;
                            var30 = param6 << 580063056;
                            var31 = (-param5 + param1 << 1183648720) / var35;
                            var28 = (param2 - param11 << 1952775696) / var34;
                            var23 = (param3 + -param7 << 1936611888) / var35;
                            var22 = param15 << -1461731216;
                            var26 = param11 << 680195344;
                            var24 = (param3 + -param15 << -1603266384) / var34;
                            var18 = param0 << 546542800;
                            var21 = param7 << 156357840;
                            var32 = (param1 - param6 << 1448437424) / var34;
                            var19 = (-param9 + param10 << 1988590992) / var35;
                            var25 = param8 << -2091325648;
                            var20 = (param10 - param0 << -2072106928) / var34;
                            var17_int = param9 << -2074021200;
                            var29 = param5 << -1334708848;
                            break L6;
                          } else {
                            var21 = param15 << 1828993232;
                            var31 = (param1 - param6 << -1223080176) / var34;
                            var17_int = param0 << 901179984;
                            var28 = (param2 - param8 << -1456495408) / var35;
                            var25 = param11 << 587286864;
                            var22 = param7 << 1121881424;
                            var26 = param8 << -1500322320;
                            var32 = (param1 - param5 << -1341589520) / var35;
                            var24 = (param3 + -param7 << 1028290640) / var35;
                            var23 = (-param15 + param3 << -232458416) / var34;
                            var30 = param5 << -1613186800;
                            var27 = (param2 + -param11 << -1287114864) / var34;
                            var20 = (-param9 + param10 << -147876720) / var35;
                            var18 = param9 << 453796720;
                            var29 = param6 << -212932400;
                            var19 = (-param0 + param10 << 730628944) / var34;
                            break L6;
                          }
                        }
                      }
                      var33 = 0;
                      if (-1 >= (param13 ^ -1)) {
                        break L5;
                      } else {
                        param13 = Math.min(-param13, -param13 + param16);
                        var22 = var22 + param13 * var24;
                        var21 = var21 + var23 * param13;
                        var30 = var30 + param13 * var32;
                        var17_int = var17_int + var19 * param13;
                        var26 = var26 + param13 * var28;
                        var18 = var18 + param13 * var20;
                        var25 = var25 + var27 * param13;
                        var29 = var29 + var31 * param13;
                        param13 = 0;
                        break L5;
                      }
                    } else {
                      L7: {
                        var30 = param6 << 2124493264;
                        var29 = param6 << 2124493264;
                        var22 = param15 << -1689728752;
                        var21 = param15 << -1689728752;
                        var26 = param11 << 1882049616;
                        var25 = param11 << 1882049616;
                        var18 = param0 << -659029232;
                        var17_int = param0 << -659029232;
                        var35 = -param13 + param16;
                        var19 = (-param0 + param9 << 880478000) / var35;
                        var20 = (param10 + -param0 << -1792008592) / var34;
                        if (var19 >= var20) {
                          var28 = (-param11 + param8 << 505732304) / var35;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var33 = 1;
                          var31 = (-param6 + param1 << -1223719568) / var34;
                          var27 = (-param11 + param2 << -1118095856) / var34;
                          var23 = (-param15 + param3 << -1873597168) / var34;
                          var32 = (param5 - param6 << -947410640) / var35;
                          var24 = (-param15 + param7 << -444550480) / var35;
                          break L7;
                        } else {
                          var27 = (-param11 + param8 << 1654166096) / var35;
                          var32 = (param1 + -param6 << -2129474256) / var34;
                          var23 = (-param15 + param7 << 49618832) / var35;
                          var28 = (-param11 + param2 << -1052171248) / var34;
                          var24 = (-param15 + param3 << 1293896144) / var34;
                          var31 = (-param6 + param5 << 548654128) / var35;
                          var33 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param13 < 0) {
                            if (0 <= param16) {
                              param13 = -param13;
                              var21 = var21 + param13 * var23;
                              var30 = var30 + var32 * param13;
                              var25 = var25 + var27 * param13;
                              var17_int = var17_int + var19 * param13;
                              var26 = var26 + var28 * param13;
                              var29 = var29 + param13 * var31;
                              var22 = var22 + var24 * param13;
                              var18 = var18 + param13 * var20;
                              param13 = 0;
                              break L9;
                            } else {
                              param13 = param16 + -param13;
                              var25 = var25 + param13 * var27;
                              var21 = var21 + var23 * param13;
                              var22 = var22 + param13 * var24;
                              var30 = var30 + var32 * param13;
                              var29 = var29 + var31 * param13;
                              var18 = var18 + param13 * var20;
                              var17_int = var17_int + param13 * var19;
                              var26 = var26 + param13 * var28;
                              param13 = param16;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var36 = nk.field_d[param13];
                        L10: while (true) {
                          if (param13 >= param16) {
                            break L8;
                          } else {
                            L11: {
                              var37 = var17_int >> 178183856;
                              if ((var37 ^ -1) <= (nk.field_i ^ -1)) {
                                break L11;
                              } else {
                                var38 = -(var17_int >> 712852496) + (var18 >> -549947120);
                                if (-1 == (var38 ^ -1)) {
                                  if (0 > var37) {
                                    break L11;
                                  } else {
                                    if (nk.field_i > var37) {
                                      mn.a(0, 0, param4, var38, 0, var25, var21, var37 + var36, true, var29);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    var39 = (var22 - var21) / var38;
                                    var40 = (var26 - var25) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (nk.field_i > var38 + var37) {
                                      break L12;
                                    } else {
                                      var38 = -var37 + (nk.field_i + -1);
                                      break L12;
                                    }
                                  }
                                  if (0 > var37) {
                                    mn.a(var40, var39, param4, var37 + var38, var41, var25 - var37 * var40, var21 - var39 * var37, var36, true, -(var37 * var41) + var29);
                                    break L11;
                                  } else {
                                    mn.a(var40, var39, param4, var38, var41, var25, var21, var37 + var36, true, var29);
                                    break L11;
                                  }
                                }
                              }
                            }
                            param13++;
                            if (nk.field_c <= param13) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var29 = var29 + var31;
                              var18 = var18 + var20;
                              var26 = var26 + var28;
                              var36 = var36 + lk.field_b;
                              var30 = var30 + var32;
                              var17_int = var17_int + var19;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var22 = var22 + var24;
                              continue L10;
                            }
                          }
                        }
                      }
                      var36 = -param16 + param12;
                      if (var36 != 0) {
                        L13: {
                          var37 = param10 << 2137551952;
                          var38 = param3 << -560856080;
                          var39 = param2 << 1915958864;
                          if (var33 != 0) {
                            var18 = param9 << 2017589488;
                            var30 = param5 << -447180656;
                            var26 = param8 << 1152581008;
                            var22 = param7 << 1714859696;
                            break L13;
                          } else {
                            var25 = param8 << 538560304;
                            var17_int = param9 << 885366544;
                            var21 = param7 << 1072034992;
                            var29 = param5 << -414900336;
                            break L13;
                          }
                        }
                        var40 = param1 << 1270246672;
                        var20 = (-var18 + var37) / var36;
                        var27 = (var39 + -var25) / var36;
                        var31 = (var40 + -var29) / var36;
                        var28 = (-var26 + var39) / var36;
                        var24 = (-var22 + var38) / var36;
                        var32 = (-var30 + var40) / var36;
                        var19 = (-var17_int + var37) / var36;
                        var23 = (-var21 + var38) / var36;
                        break L5;
                      } else {
                        var27 = 0;
                        var31 = 0;
                        var20 = 0;
                        var28 = 0;
                        var19 = 0;
                        var23 = 0;
                        var32 = 0;
                        var24 = 0;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (0 <= param13) {
                      break L14;
                    } else {
                      param13 = -param13;
                      var17_int = var17_int + param13 * var19;
                      var21 = var21 + var23 * param13;
                      var26 = var26 + param13 * var28;
                      var29 = var29 + param13 * var31;
                      var25 = var25 + var27 * param13;
                      var18 = var18 + param13 * var20;
                      var30 = var30 + param13 * var32;
                      var22 = var22 + param13 * var24;
                      param13 = 0;
                      break L14;
                    }
                  }
                  var35 = nk.field_d[param13];
                  L15: while (true) {
                    if (param13 >= param12) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var36 = var17_int >> 1879310608;
                        if (var36 >= nk.field_i) {
                          break L16;
                        } else {
                          var37 = -(var17_int >> 1075498064) + (var18 >> 534417072);
                          if (var37 == 0) {
                            if ((var36 ^ -1) > -1) {
                              break L16;
                            } else {
                              if (nk.field_i > var36) {
                                mn.a(0, 0, param4, var37, 0, var25, var21, var35 + var36, true, var29);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (var26 - var25) / var37;
                              var40 = (-var29 + var30) / var37;
                              if (nk.field_i > var37 + var36) {
                                break L17;
                              } else {
                                var37 = -1 + (nk.field_i - var36);
                                break L17;
                              }
                            }
                            if ((var36 ^ -1) <= -1) {
                              mn.a(var39, var38, param4, var37, var40, var25, var21, var35 + var36, true, var29);
                              break L16;
                            } else {
                              mn.a(var39, var38, param4, var36 + var37, var40, var25 + -(var39 * var36), var21 + -(var38 * var36), var35, true, var29 + -(var40 * var36));
                              break L16;
                            }
                          }
                        }
                      }
                      param13++;
                      if (param13 < nk.field_c) {
                        var29 = var29 + var31;
                        var26 = var26 + var28;
                        var25 = var25 + var27;
                        var30 = var30 + var32;
                        var21 = var21 + var23;
                        var35 = var35 + lk.field_b;
                        var22 = var22 + var24;
                        var18 = var18 + var20;
                        var17_int = var17_int + var19;
                        continue L15;
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
          L18: {
            var17 = decompiledCaughtException;
            stackIn_76_0 = (RuntimeException) (var17);

            stackIn_76_1 = new StringBuilder().append("ph.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L18;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L18;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    ph(int param0) {
        int var2 = 0;
        this.field_e = new pj();
        this.field_g = new ro();
        this.field_f = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_c = new te(var2);
    }

    static {
        field_h = "Username: ";
        field_d = "You have <%0> unread messages!";
    }
}
