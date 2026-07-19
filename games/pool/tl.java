/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends ob {
    static vk field_N;
    static int field_K;
    static int field_M;
    static int[] field_L;
    static nl field_J;
    static int[] field_I;
    static String field_H;

    final void e(int param0) {
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (param0 == -34) {
            break L0;
          } else {
            field_J = (nl) null;
            break L0;
          }
        }
        L1: {
          if (!hk.b(10)) {
            L2: {
              if (qi.field_a != 96) {
                break L2;
              } else {
                if (this.field_B.field_h > 0) {
                  if (-3 == (this.field_B.field_h ^ -1)) {
                    break L2;
                  } else {
                    this.field_B.a(0, (byte) 1);
                    break L2;
                  }
                } else {
                  this.field_B.a(1, (byte) 1);
                  break L2;
                }
              }
            }
            L3: {
              if (-98 == (qi.field_a ^ -1)) {
                if (this.field_B.field_h == 1) {
                  this.field_B.a(0, (byte) 1);
                  break L3;
                } else {
                  if (-3 != (this.field_B.field_h ^ -1)) {
                    this.field_B.a(1, (byte) 1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L4: {
              if ((qi.field_a ^ -1) != -100) {
                break L4;
              } else {
                L5: {
                  if (0 > this.field_B.field_h) {
                    break L5;
                  } else {
                    if (1 >= this.field_B.field_h) {
                      this.field_B.a(2, (byte) 1);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_B.a(eo.field_Lb, (byte) 1);
                break L4;
              }
            }
            if ((qi.field_a ^ -1) == -99) {
              if (this.field_B.field_h == 2) {
                this.field_B.a(eo.field_Lb, (byte) 1);
                this.field_B.a(false);
                break L1;
              } else {
                this.field_B.a(2, (byte) 1);
                this.field_B.a(false);
                break L1;
              }
            } else {
              this.field_B.a(eo.field_Lb, (byte) 1);
              break L1;
            }
          } else {
            super.e(-34);
            break L1;
          }
        }
    }

    tl(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(em.field_M, param0, param1, param2, param3, param4, param5);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var10_int = param3 + (param2 + param1);
              if (0 == var10_int) {
                break L1;
              } else {
                param1 = (200 * param1 - -var10_int) / (var10_int * 2);
                param3 = (200 * param3 + var10_int) / (var10_int * 2);
                param2 = (200 * param2 - -var10_int) / (var10_int * 2);
                break L1;
              }
            }
            if (param5 >= 90) {
              L2: {
                if ((param0 ^ -1) == 0) {
                  break L2;
                } else {
                  sa.field_h.c(param0 - -1 + ". ", 90, param7, param6, -1);
                  break L2;
                }
              }
              L3: {
                sa.field_h.d(param8, 95, param7, param6, -1);
                var12 = Integer.toString(param4);
                sa.field_h.b(var12, se.field_i[0], param7, param6, -1);
                if ((var10_int ^ -1) > -51) {
                  stackOut_8_0 = Integer.toString(var10_int);
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = "50+";
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              var13 = stackIn_9_0;
              var11 = var13;
              sa.field_h.b(var13, se.field_i[1], param7, param6, -1);
              var14 = param1 + "%";
              sa.field_h.b(var14, se.field_i[2], param7, param6, -1);
              var15 = param2 + "%";
              sa.field_h.b(var15, se.field_i[3], param7, param6, -1);
              var16 = param3 + "%";
              sa.field_h.b(var16, se.field_i[4], param7, param6, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var10);
            stackOut_11_1 = new StringBuilder().append("tl.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param8 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 69) {
            field_N = (vk) null;
        }
        if (!hk.b(-114)) {
            if (!(param1 >= 2)) {
                return 24;
            }
        }
        return 36;
    }

    final static int h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!n.h(param0 + 119)) {
                L2: {
                  un.field_f.a(un.a(-49, ua.field_o, lq.field_W), un.a(-49, gg.field_f, wn.field_i), -30);
                  if (!un.field_f.b((byte) 99)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (param0 == 8) {
                    break L3;
                  } else {
                    tl.d(-51, true);
                    break L3;
                  }
                }
                L4: {
                  if (var1_int == 0) {
                    break L4;
                  } else {
                    if ((un.field_f.field_h ^ -1) > -1) {
                      break L4;
                    } else {
                      var2 = ui.field_V[un.field_f.field_h];
                      if ((var2 ^ -1) != -3) {
                        break L4;
                      } else {
                        ra.a((byte) -108);
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                un.field_f.e(-15525);
                if (!un.field_f.b((byte) 119)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "tl.F(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
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
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              if ((param14 ^ -1) > -1) {
                break L1;
              } else {
                if (param2 >= fb.field_o) {
                  break L1;
                } else {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if ((param5 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (-1 >= (param6 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param7 < fb.field_k) {
                      break L3;
                    } else {
                      if (param5 < fb.field_k) {
                        break L3;
                      } else {
                        if (fb.field_k > param6) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    var34 = param14 - param2;
                    if (param2 != param1) {
                      L5: {
                        var30 = param4 << 1709412464;
                        var29 = param4 << 1709412464;
                        var22 = param12 << -400210384;
                        var21 = param12 << -400210384;
                        var26 = param13 << 1080554320;
                        var25 = param13 << 1080554320;
                        var18 = param7 << 591213136;
                        var17_int = param7 << 591213136;
                        var35 = -param2 + param1;
                        var20 = (param6 + -param7 << -52734256) / var34;
                        var19 = (param5 + -param7 << 1432662832) / var35;
                        if (var20 <= var19) {
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var33 = 1;
                          var31 = (-param4 + param3 << -1392458384) / var34;
                          var27 = (param15 + -param13 << -969753392) / var34;
                          var32 = (-param4 + param0 << 2111953200) / var35;
                          var28 = (-param13 + param9 << 1889911056) / var35;
                          var24 = (param8 - param12 << -1905028496) / var35;
                          var23 = (param11 + -param12 << -339869840) / var34;
                          break L5;
                        } else {
                          var24 = (param11 - param12 << 1751112560) / var34;
                          var31 = (param0 + -param4 << 1287034416) / var35;
                          var33 = 0;
                          var28 = (param15 - param13 << -715358288) / var34;
                          var23 = (-param12 + param8 << 399196688) / var35;
                          var32 = (-param4 + param3 << 1187614320) / var34;
                          var27 = (param9 - param13 << 421295504) / var35;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (0 > param2) {
                            if (param1 < 0) {
                              param2 = param1 - param2;
                              var25 = var25 + var27 * param2;
                              var30 = var30 + var32 * param2;
                              var26 = var26 + var28 * param2;
                              var29 = var29 + param2 * var31;
                              var18 = var18 + var20 * param2;
                              var22 = var22 + var24 * param2;
                              var17_int = var17_int + var19 * param2;
                              var21 = var21 + param2 * var23;
                              param2 = param1;
                              break L6;
                            } else {
                              param2 = -param2;
                              var25 = var25 + var27 * param2;
                              var18 = var18 + param2 * var20;
                              var29 = var29 + param2 * var31;
                              var17_int = var17_int + var19 * param2;
                              var30 = var30 + var32 * param2;
                              var26 = var26 + param2 * var28;
                              var22 = var22 + var24 * param2;
                              var21 = var21 + var23 * param2;
                              param2 = 0;
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var36 = fb.field_m[param2];
                        L8: while (true) {
                          if (param1 <= param2) {
                            break L6;
                          } else {
                            L9: {
                              var37 = var17_int >> 2022773648;
                              if (fb.field_k > var37) {
                                var38 = -(var17_int >> 1085507824) + (var18 >> -1164320752);
                                if (-1 != (var38 ^ -1)) {
                                  L10: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (var26 - var25) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (var38 + var37 < fb.field_k) {
                                      break L10;
                                    } else {
                                      var38 = -1 + (fb.field_k - var37);
                                      break L10;
                                    }
                                  }
                                  if ((var37 ^ -1) <= -1) {
                                    ng.a(var29, var25, var40, var36 + var37, (byte) -117, var41, var21, var38, param16, var39);
                                    break L9;
                                  } else {
                                    ng.a(-(var37 * var41) + var29, -(var40 * var37) + var25, var40, var36, (byte) -117, var41, var21 + -(var39 * var37), var37 + var38, param16, var39);
                                    break L9;
                                  }
                                } else {
                                  if ((var37 ^ -1) > -1) {
                                    break L9;
                                  } else {
                                    if (var37 >= fb.field_k) {
                                      break L9;
                                    } else {
                                      ng.a(var29, var25, 0, var36 + var37, (byte) -117, 0, var21, var38, param16, 0);
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param2++;
                            if (fb.field_o <= param2) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var17_int = var17_int + var19;
                              var29 = var29 + var31;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              var18 = var18 + var20;
                              var22 = var22 + var24;
                              var36 = var36 + qh.field_l;
                              continue L8;
                            }
                          }
                        }
                      }
                      var36 = -param1 + param14;
                      if (var36 != 0) {
                        L11: {
                          var37 = param6 << 1498627472;
                          var38 = param11 << 460803664;
                          var39 = param15 << -488602768;
                          var40 = param3 << 661549712;
                          if (var33 == 0) {
                            var21 = param8 << -1004289808;
                            var25 = param9 << 1384926672;
                            var17_int = param5 << 365266544;
                            var29 = param0 << -1672047952;
                            break L11;
                          } else {
                            var18 = param5 << -1159079824;
                            var22 = param8 << -744071600;
                            var30 = param0 << 1166363056;
                            var26 = param9 << -700331760;
                            break L11;
                          }
                        }
                        var32 = (var40 + -var30) / var36;
                        var24 = (var38 + -var22) / var36;
                        var23 = (var38 - var21) / var36;
                        var19 = (-var17_int + var37) / var36;
                        var27 = (-var25 + var39) / var36;
                        var20 = (var37 - var18) / var36;
                        var28 = (var39 - var26) / var36;
                        var31 = (-var29 + var40) / var36;
                        break L4;
                      } else {
                        var28 = 0;
                        var19 = 0;
                        var27 = 0;
                        var31 = 0;
                        var20 = 0;
                        var24 = 0;
                        var23 = 0;
                        var32 = 0;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param2 == param14) {
                          var18 = param5 << 1807411536;
                          var30 = param0;
                          var24 = 0;
                          var26 = param9;
                          var19 = 0;
                          var32 = 0;
                          var21 = param12;
                          var23 = 0;
                          var28 = 0;
                          var22 = param8;
                          var20 = 0;
                          var27 = 0;
                          var17_int = param7 << 1605246064;
                          var31 = 0;
                          var25 = param13;
                          var29 = param4;
                          break L12;
                        } else {
                          var35 = param14 + -param1;
                          if (param5 > param7) {
                            var18 = param5 << -1377266736;
                            var23 = (-param12 + param11 << -1280226352) / var34;
                            var27 = (param15 - param13 << -267509360) / var34;
                            var30 = param0 << -698308176;
                            var20 = (-param5 + param6 << 164001680) / var35;
                            var24 = (-param8 + param11 << 313403536) / var35;
                            var19 = (-param7 + param6 << 229994032) / var34;
                            var31 = (-param4 + param3 << 1955427280) / var34;
                            var29 = param4 << -396445776;
                            var26 = param9 << -1097478160;
                            var25 = param13 << 1607415216;
                            var32 = (param3 + -param0 << 1118997424) / var35;
                            var22 = param8 << -618872656;
                            var21 = param12 << -1068823728;
                            var17_int = param7 << 1228170672;
                            var28 = (-param9 + param15 << 601643984) / var35;
                            break L12;
                          } else {
                            var31 = (-param0 + param3 << -1054665456) / var35;
                            var22 = param12 << -1421891056;
                            var25 = param9 << 186954512;
                            var17_int = param5 << 1753137488;
                            var20 = (-param7 + param6 << 1334340336) / var34;
                            var28 = (param15 - param13 << 1878167472) / var34;
                            var19 = (param6 + -param5 << 448637872) / var35;
                            var32 = (-param4 + param3 << 969862256) / var34;
                            var18 = param7 << -30880848;
                            var30 = param4 << -1158797488;
                            var29 = param0 << -1065630416;
                            var26 = param13 << 1772720080;
                            var27 = (param15 + -param9 << -1500260944) / var35;
                            var21 = param8 << 438005712;
                            var24 = (param11 - param12 << 938233936) / var34;
                            var23 = (-param8 + param11 << -523396208) / var35;
                            break L12;
                          }
                        }
                      }
                      var33 = 0;
                      if (-1 < (param2 ^ -1)) {
                        param2 = Math.min(-param2, -param2 + param1);
                        var22 = var22 + param2 * var24;
                        var26 = var26 + var28 * param2;
                        var30 = var30 + var32 * param2;
                        var25 = var25 + param2 * var27;
                        var21 = var21 + var23 * param2;
                        var18 = var18 + var20 * param2;
                        var29 = var29 + param2 * var31;
                        var17_int = var17_int + var19 * param2;
                        param2 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (-1 < (param2 ^ -1)) {
                      param2 = -param2;
                      var21 = var21 + param2 * var23;
                      var18 = var18 + param2 * var20;
                      var30 = var30 + var32 * param2;
                      var22 = var22 + var24 * param2;
                      var26 = var26 + param2 * var28;
                      var29 = var29 + param2 * var31;
                      var25 = var25 + param2 * var27;
                      var17_int = var17_int + param2 * var19;
                      param2 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    var35 = fb.field_m[param2];
                    if (param10 == -49) {
                      break L14;
                    } else {
                      field_J = (nl) null;
                      break L14;
                    }
                  }
                  L15: while (true) {
                    if (param14 <= param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var36 = var17_int >> 448883920;
                        if (var36 < fb.field_k) {
                          var37 = -(var17_int >> 646355760) + (var18 >> -1620379376);
                          if (0 == var37) {
                            if (var36 < 0) {
                              break L16;
                            } else {
                              if (var36 < fb.field_k) {
                                ng.a(var29, var25, 0, var36 - -var35, (byte) -117, 0, var21, var37, param16, 0);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              var38 = (var22 - var21) / var37;
                              var39 = (var26 + -var25) / var37;
                              var40 = (var30 - var29) / var37;
                              if (fb.field_k <= var37 + var36) {
                                var37 = -var36 + fb.field_k + -1;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if ((var36 ^ -1) > -1) {
                              ng.a(-(var40 * var36) + var29, var25 + -(var36 * var39), var39, var35, (byte) -117, var40, var21 - var36 * var38, var37 + var36, param16, var38);
                              break L16;
                            } else {
                              ng.a(var29, var25, var39, var35 + var36, (byte) -117, var40, var21, var37, param16, var38);
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      param2++;
                      if (fb.field_o <= param2) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var26 = var26 + var28;
                        var22 = var22 + var24;
                        var17_int = var17_int + var19;
                        var25 = var25 + var27;
                        var30 = var30 + var32;
                        var21 = var21 + var23;
                        var35 = var35 + qh.field_l;
                        var18 = var18 + var20;
                        var29 = var29 + var31;
                        continue L15;
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
            stackOut_78_0 = (RuntimeException) (var17);
            stackOut_78_1 = new StringBuilder().append("tl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param16 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L18;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
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

    public static void g(int param0) {
        if (param0 != 0) {
            field_H = (String) null;
        }
        field_N = null;
        field_I = null;
        field_L = null;
        field_H = null;
        field_J = null;
    }

    final static void a(int param0, kh param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        uo[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        uo var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        uo var28 = null;
        uo var29 = null;
        uo[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        uo stackIn_21_0 = null;
        uo stackIn_22_0 = null;
        uo stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        uo stackIn_28_0 = null;
        uo stackIn_29_0 = null;
        uo stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        uo stackIn_73_0 = null;
        uo stackIn_74_0 = null;
        uo stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        uo stackIn_78_0 = null;
        uo stackIn_79_0 = null;
        uo stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        uo stackIn_84_0 = null;
        boolean stackIn_84_1 = false;
        uo stackIn_85_0 = null;
        boolean stackIn_85_1 = false;
        uo stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        int stackIn_86_2 = 0;
        uo stackIn_88_0 = null;
        uo stackIn_89_0 = null;
        uo stackIn_90_0 = null;
        uo stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_95_0 = 0;
        uo stackIn_109_0 = null;
        uo stackIn_110_0 = null;
        uo stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        uo stackIn_113_0 = null;
        uo stackIn_114_0 = null;
        uo stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        uo stackIn_117_0 = null;
        uo stackIn_118_0 = null;
        uo stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        uo stackIn_121_0 = null;
        uo stackIn_122_0 = null;
        uo stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        String stackIn_139_0 = null;
        uo stackIn_143_0 = null;
        uo stackIn_144_0 = null;
        uo stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        uo stackIn_146_0 = null;
        uo stackIn_147_0 = null;
        uo stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_213_0 = 0;
        uo stackIn_316_0 = null;
        boolean stackIn_316_1 = false;
        uo stackIn_317_0 = null;
        boolean stackIn_317_1 = false;
        uo stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        int stackIn_318_2 = 0;
        uo stackIn_320_0 = null;
        uo stackIn_321_0 = null;
        uo stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        uo stackIn_324_0 = null;
        uo stackIn_325_0 = null;
        uo stackIn_326_0 = null;
        uo stackIn_327_0 = null;
        int stackIn_327_1 = 0;
        uo stackIn_329_0 = null;
        uo stackIn_330_0 = null;
        uo stackIn_331_0 = null;
        uo stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        RuntimeException stackIn_339_0 = null;
        StringBuilder stackIn_339_1 = null;
        RuntimeException stackIn_340_0 = null;
        StringBuilder stackIn_340_1 = null;
        RuntimeException stackIn_341_0 = null;
        StringBuilder stackIn_341_1 = null;
        String stackIn_341_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        uo stackOut_20_0 = null;
        uo stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        uo stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        uo stackOut_27_0 = null;
        uo stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        uo stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        uo stackOut_83_0 = null;
        boolean stackOut_83_1 = false;
        uo stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        int stackOut_85_2 = 0;
        uo stackOut_84_0 = null;
        boolean stackOut_84_1 = false;
        int stackOut_84_2 = 0;
        uo stackOut_77_0 = null;
        uo stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        uo stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        uo stackOut_72_0 = null;
        uo stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        uo stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        uo stackOut_87_0 = null;
        uo stackOut_88_0 = null;
        uo stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        uo stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        String stackOut_138_0 = null;
        Object stackOut_137_0 = null;
        uo stackOut_142_0 = null;
        uo stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        uo stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        uo stackOut_145_0 = null;
        uo stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        uo stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_211_0 = 0;
        uo stackOut_323_0 = null;
        uo stackOut_324_0 = null;
        uo stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        uo stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        uo stackOut_319_0 = null;
        uo stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        uo stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        uo stackOut_315_0 = null;
        boolean stackOut_315_1 = false;
        uo stackOut_317_0 = null;
        boolean stackOut_317_1 = false;
        int stackOut_317_2 = 0;
        uo stackOut_316_0 = null;
        boolean stackOut_316_1 = false;
        int stackOut_316_2 = 0;
        uo stackOut_328_0 = null;
        uo stackOut_329_0 = null;
        uo stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        uo stackOut_331_0 = null;
        int stackOut_331_1 = 0;
        uo stackOut_116_0 = null;
        uo stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        uo stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        uo stackOut_112_0 = null;
        uo stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        uo stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        uo stackOut_108_0 = null;
        uo stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        uo stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        uo stackOut_120_0 = null;
        uo stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        uo stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        RuntimeException stackOut_338_0 = null;
        StringBuilder stackOut_338_1 = null;
        RuntimeException stackOut_340_0 = null;
        StringBuilder stackOut_340_1 = null;
        String stackOut_340_2 = null;
        RuntimeException stackOut_339_0 = null;
        StringBuilder stackOut_339_1 = null;
        String stackOut_339_2 = null;
        var26 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param3) {
                L2: {
                  if (kh.field_Ac) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (cj.e((byte) 85)) {
                    if (!param1.field_ec) {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L3;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_8_0 = stackOut_5_0;
                      break L3;
                    }
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_8_0 = stackOut_3_0;
                    break L3;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L4: {
              var5 = 0;
              if (param3) {
                break L4;
              } else {
                var6 = 0;
                L5: while (true) {
                  if (5 <= var6) {
                    if (!mc.field_f[0][2].field_db) {
                      break L4;
                    } else {
                      if (cj.e((byte) 85)) {
                        kk.field_B = rq.field_r;
                        break L4;
                      } else {
                        kk.field_B = nr.a(new String[]{em.field_L.field_Ob}, -1, ep.field_v);
                        break L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var4_int == 0) {
                        break L6;
                      } else {
                        if (mc.field_f[0][var6 + 1].field_R == 0) {
                          break L6;
                        } else {
                          if (var6 == param1.field_ac) {
                            break L6;
                          } else {
                            param1.field_ac = var6;
                            var5 = 1;
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      stackOut_20_0 = mc.field_f[0][var6 + 1];
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var4_int == 0) {
                        stackOut_22_0 = (uo) ((Object) stackIn_22_0);
                        stackOut_22_1 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L7;
                      } else {
                        stackOut_21_0 = (uo) ((Object) stackIn_21_0);
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L7;
                      }
                    }
                    L8: {
                      stackIn_23_0.field_pb = stackIn_23_1 != 0;
                      if (tq.field_p) {
                        break L8;
                      } else {
                        if (3 == var6) {
                          mc.field_f[0][var6 - -1].field_pb = false;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      stackOut_27_0 = mc.field_f[0][var6 - -1];
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (param1.field_ac != var6) {
                        stackOut_29_0 = (uo) ((Object) stackIn_29_0);
                        stackOut_29_1 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        break L9;
                      } else {
                        stackOut_28_0 = (uo) ((Object) stackIn_28_0);
                        stackOut_28_1 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        break L9;
                      }
                    }
                    stackIn_30_0.field_Ib = stackIn_30_1 != 0;
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L10: {
              if (-3 >= (dg.field_T.length ^ -1)) {
                L11: {
                  if (param3) {
                    if (od.field_d != -1) {
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L11;
                    } else {
                      stackOut_40_0 = 0;
                      stackIn_43_0 = stackOut_40_0;
                      break L11;
                    }
                  } else {
                    stackOut_38_0 = 0;
                    stackIn_43_0 = stackOut_38_0;
                    break L11;
                  }
                }
                L12: {
                  var6 = stackIn_43_0;
                  if (var6 == 0) {
                    break L12;
                  } else {
                    var7 = od.field_d;
                    var8_int = 0;
                    L13: while (true) {
                      if (var8_int >= md.field_c.length) {
                        md.field_c[var7 / 8] = (byte)md.a((int) md.field_c[var7 / 8], 1 << var7 % 8);
                        break L12;
                      } else {
                        md.field_c[var8_int] = (byte) 0;
                        var8_int++;
                        continue L13;
                      }
                    }
                  }
                }
                L14: {
                  if (param3) {
                    stackOut_50_0 = -1;
                    stackIn_51_0 = stackOut_50_0;
                    break L14;
                  } else {
                    stackOut_49_0 = 0;
                    stackIn_51_0 = stackOut_49_0;
                    break L14;
                  }
                }
                var7 = stackIn_51_0;
                L15: while (true) {
                  if (dg.field_T.length <= var7) {
                    break L10;
                  } else {
                    L16: {
                      if (var6 != 0) {
                        if (var7 != od.field_d) {
                          stackOut_57_0 = 1;
                          stackIn_59_0 = stackOut_57_0;
                          break L16;
                        } else {
                          stackOut_56_0 = 0;
                          stackIn_59_0 = stackOut_56_0;
                          break L16;
                        }
                      } else {
                        stackOut_54_0 = 0;
                        stackIn_59_0 = stackOut_54_0;
                        break L16;
                      }
                    }
                    L17: {
                      var8_int = stackIn_59_0;
                      if (var4_int == 0) {
                        break L17;
                      } else {
                        if (mc.field_f[1][var7 + 1].field_R == 0) {
                          break L17;
                        } else {
                          if (!param3) {
                            var9 = dg.field_T[var7];
                            if (var9 == param1.field_Nb) {
                              break L17;
                            } else {
                              param1.field_Nb = var9;
                              var5 = 1;
                              break L17;
                            }
                          } else {
                            if (var6 == 0) {
                              if (var7 != -1) {
                                md.field_c[var7 / 8] = (byte)cq.a((int) md.field_c[var7 / 8], 1 << rb.b(var7, 7));
                                break L17;
                              } else {
                                var9 = 0;
                                L18: while (true) {
                                  if (md.field_c.length <= var9) {
                                    break L17;
                                  } else {
                                    md.field_c[var9] = (byte) 0;
                                    var9++;
                                    continue L18;
                                  }
                                }
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (param3) {
                        if (0 == (var7 ^ -1)) {
                          mc.field_f[1][var7 + 1].field_Ib = true;
                          var9 = 0;
                          L20: while (true) {
                            if (var9 >= dg.field_T.length) {
                              break L19;
                            } else {
                              L21: {
                                stackOut_83_0 = mc.field_f[1][1 + var7];
                                stackOut_83_1 = mc.field_f[1][1 + var7].field_Ib;
                                stackIn_85_0 = stackOut_83_0;
                                stackIn_85_1 = stackOut_83_1;
                                stackIn_84_0 = stackOut_83_0;
                                stackIn_84_1 = stackOut_83_1;
                                if ((md.field_c[var9 / 8] & 1 << (7 & var9)) != 0) {
                                  stackOut_85_0 = (uo) ((Object) stackIn_85_0);
                                  stackOut_85_1 = stackIn_85_1;
                                  stackOut_85_2 = 0;
                                  stackIn_86_0 = stackOut_85_0;
                                  stackIn_86_1 = stackOut_85_1;
                                  stackIn_86_2 = stackOut_85_2;
                                  break L21;
                                } else {
                                  stackOut_84_0 = (uo) ((Object) stackIn_84_0);
                                  stackOut_84_1 = stackIn_84_1;
                                  stackOut_84_2 = 1;
                                  stackIn_86_0 = stackOut_84_0;
                                  stackIn_86_1 = stackOut_84_1;
                                  stackIn_86_2 = stackOut_84_2;
                                  break L21;
                                }
                              }
                              stackIn_86_0.field_Ib = stackIn_86_1 & stackIn_86_2 != 0;
                              var9++;
                              continue L20;
                            }
                          }
                        } else {
                          L22: {
                            stackOut_77_0 = mc.field_f[1][1 + var7];
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_78_0 = stackOut_77_0;
                            if ((md.field_c[var7 / 8] & 1 << (7 & var7)) == 0) {
                              stackOut_79_0 = (uo) ((Object) stackIn_79_0);
                              stackOut_79_1 = 0;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              break L22;
                            } else {
                              stackOut_78_0 = (uo) ((Object) stackIn_78_0);
                              stackOut_78_1 = 1;
                              stackIn_80_0 = stackOut_78_0;
                              stackIn_80_1 = stackOut_78_1;
                              break L22;
                            }
                          }
                          stackIn_80_0.field_Ib = stackIn_80_1 != 0;
                          break L19;
                        }
                      } else {
                        L23: {
                          var9 = dg.field_T[var7];
                          stackOut_72_0 = mc.field_f[1][var7 - -1];
                          stackIn_74_0 = stackOut_72_0;
                          stackIn_73_0 = stackOut_72_0;
                          if (var9 != param1.field_Nb) {
                            stackOut_74_0 = (uo) ((Object) stackIn_74_0);
                            stackOut_74_1 = 0;
                            stackIn_75_0 = stackOut_74_0;
                            stackIn_75_1 = stackOut_74_1;
                            break L23;
                          } else {
                            stackOut_73_0 = (uo) ((Object) stackIn_73_0);
                            stackOut_73_1 = 1;
                            stackIn_75_0 = stackOut_73_0;
                            stackIn_75_1 = stackOut_73_1;
                            break L23;
                          }
                        }
                        stackIn_75_0.field_Ib = stackIn_75_1 != 0;
                        break L19;
                      }
                    }
                    L24: {
                      L25: {
                        stackOut_87_0 = mc.field_f[1][1 + var7];
                        stackIn_90_0 = stackOut_87_0;
                        stackIn_88_0 = stackOut_87_0;
                        if (var4_int == 0) {
                          break L25;
                        } else {
                          stackOut_88_0 = (uo) ((Object) stackIn_88_0);
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_89_0 = stackOut_88_0;
                          if (var8_int != 0) {
                            break L25;
                          } else {
                            stackOut_89_0 = (uo) ((Object) stackIn_89_0);
                            stackOut_89_1 = 1;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            break L24;
                          }
                        }
                      }
                      stackOut_90_0 = (uo) ((Object) stackIn_90_0);
                      stackOut_90_1 = 0;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      break L24;
                    }
                    stackIn_91_0.field_pb = stackIn_91_1 != 0;
                    var7++;
                    continue L15;
                  }
                }
              } else {
                break L10;
              }
            }
            L26: {
              if (!param3) {
                stackOut_94_0 = 1;
                stackIn_95_0 = stackOut_94_0;
                break L26;
              } else {
                stackOut_93_0 = 0;
                stackIn_95_0 = stackOut_93_0;
                break L26;
              }
            }
            var6 = stackIn_95_0;
            L27: while (true) {
              if ((var6 ^ -1) <= -4) {
                L28: {
                  if (!param3) {
                    break L28;
                  } else {
                    if (1 < ji.field_g) {
                      var6 = 0;
                      L29: while (true) {
                        if (ji.field_g + 1 <= var6) {
                          break L28;
                        } else {
                          L30: {
                            var29 = mc.field_f[3][var6];
                            if (var4_int == 0) {
                              break L30;
                            } else {
                              if (-1 != (var29.field_R ^ -1)) {
                                pm.field_l = var6;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (!var29.field_db) {
                              break L31;
                            } else {
                              if (-1 > (var6 ^ -1)) {
                                L32: {
                                  if (null != wp.field_f) {
                                    stackOut_138_0 = wp.field_f[-1 + var6];
                                    stackIn_139_0 = stackOut_138_0;
                                    break L32;
                                  } else {
                                    stackOut_137_0 = null;
                                    stackIn_139_0 = (String) ((Object) stackOut_137_0);
                                    break L32;
                                  }
                                }
                                var8_ref = stackIn_139_0;
                                if (var8_ref != null) {
                                  kk.field_B = var8_ref;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L33: {
                            stackOut_142_0 = (uo) (var29);
                            stackIn_144_0 = stackOut_142_0;
                            stackIn_143_0 = stackOut_142_0;
                            if (var4_int == 0) {
                              stackOut_144_0 = (uo) ((Object) stackIn_144_0);
                              stackOut_144_1 = 0;
                              stackIn_145_0 = stackOut_144_0;
                              stackIn_145_1 = stackOut_144_1;
                              break L33;
                            } else {
                              stackOut_143_0 = (uo) ((Object) stackIn_143_0);
                              stackOut_143_1 = 1;
                              stackIn_145_0 = stackOut_143_0;
                              stackIn_145_1 = stackOut_143_1;
                              break L33;
                            }
                          }
                          L34: {
                            stackIn_145_0.field_pb = stackIn_145_1 != 0;
                            stackOut_145_0 = (uo) (var29);
                            stackIn_147_0 = stackOut_145_0;
                            stackIn_146_0 = stackOut_145_0;
                            if (pm.field_l != var6) {
                              stackOut_147_0 = (uo) ((Object) stackIn_147_0);
                              stackOut_147_1 = 0;
                              stackIn_148_0 = stackOut_147_0;
                              stackIn_148_1 = stackOut_147_1;
                              break L34;
                            } else {
                              stackOut_146_0 = (uo) ((Object) stackIn_146_0);
                              stackOut_146_1 = 1;
                              stackIn_148_0 = stackOut_146_0;
                              stackIn_148_1 = stackOut_146_1;
                              break L34;
                            }
                          }
                          stackIn_148_0.field_Ib = stackIn_148_1 != 0;
                          var6++;
                          continue L29;
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                }
                var6 = 0;
                var7 = param2;
                L35: while (true) {
                  if (var7 >= dr.field_c) {
                    L36: {
                      if (var5 == 0) {
                        break L36;
                      } else {
                        if (param3) {
                          break L36;
                        } else {
                          lm.c(5, param0);
                          break L36;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L37: {
                      var30 = mc.field_f[4 + var7];
                      var8 = var30;
                      if (param3) {
                        stackOut_153_0 = -1;
                        stackIn_154_0 = stackOut_153_0;
                        break L37;
                      } else {
                        stackOut_152_0 = 0;
                        stackIn_154_0 = stackOut_152_0;
                        break L37;
                      }
                    }
                    var9 = stackIn_154_0;
                    L38: while (true) {
                      if (-1 + var30.length <= var9) {
                        var6 = var6 + (qf.field_j[var7] & 255);
                        var7++;
                        continue L35;
                      } else {
                        L39: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L39;
                          } else {
                            if (-1 >= (var9 ^ -1)) {
                              L40: {
                                if (op.field_a == null) {
                                  break L40;
                                } else {
                                  if (op.field_a[var7] == null) {
                                    break L40;
                                  } else {
                                    if (((eq.field_S ^ -1) & op.field_a[var7][var9]) <= 0) {
                                      break L40;
                                    } else {
                                      var14 = 1;
                                      var15 = s.a(op.field_a[var7][var9] & (eq.field_S ^ -1), (byte) 87);
                                      break L40;
                                    }
                                  }
                                }
                              }
                              L41: {
                                if (dl.field_j == null) {
                                  break L41;
                                } else {
                                  if (null != dl.field_j[var7]) {
                                    if (mp.field_V > 0) {
                                      break L41;
                                    } else {
                                      if (!dl.field_j[var7][var9]) {
                                        break L41;
                                      } else {
                                        var10 = 1;
                                        break L41;
                                      }
                                    }
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              L42: {
                                if (ci.field_d == null) {
                                  break L42;
                                } else {
                                  if (ci.field_d[var7] != null) {
                                    L43: {
                                      var16 = ci.field_d[var7][var9];
                                      if (0 >= var16) {
                                        break L43;
                                      } else {
                                        if (mg.field_d < var16) {
                                          var12 = 1;
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    if (-1 == (var16 ^ -1)) {
                                      break L42;
                                    } else {
                                      if (rg.field_s) {
                                        break L42;
                                      } else {
                                        if (0 < mp.field_V) {
                                          break L42;
                                        } else {
                                          var10 = 1;
                                          break L42;
                                        }
                                      }
                                    }
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              L44: {
                                if (param3) {
                                  if (ca.field_j != null) {
                                    if (null != ca.field_j[var7]) {
                                      if (!ca.field_j[var7][var9]) {
                                        stackOut_188_0 = 0;
                                        stackIn_190_0 = stackOut_188_0;
                                        break L44;
                                      } else {
                                        stackOut_187_0 = 1;
                                        stackIn_190_0 = stackOut_187_0;
                                        break L44;
                                      }
                                    } else {
                                      stackOut_185_0 = 0;
                                      stackIn_190_0 = stackOut_185_0;
                                      break L44;
                                    }
                                  } else {
                                    stackOut_183_0 = 0;
                                    stackIn_190_0 = stackOut_183_0;
                                    break L44;
                                  }
                                } else {
                                  stackOut_181_0 = 0;
                                  stackIn_190_0 = stackOut_181_0;
                                  break L44;
                                }
                              }
                              var13 = stackIn_190_0;
                              if (null == w.field_j) {
                                break L39;
                              } else {
                                if (w.field_j[var7] == null) {
                                  break L39;
                                } else {
                                  L45: {
                                    var16 = w.field_j[var7][var9];
                                    if (var16 == 0) {
                                      break L45;
                                    } else {
                                      if (rg.field_s) {
                                        break L45;
                                      } else {
                                        if (mp.field_V <= 0) {
                                          var10 = 1;
                                          break L45;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  if (-1 <= (var16 ^ -1)) {
                                    break L39;
                                  } else {
                                    if (og.field_I < var16) {
                                      var11 = 1;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L39;
                            }
                          }
                        }
                        L46: {
                          if (2 > hq.field_i) {
                            break L46;
                          } else {
                            if (vj.field_c[12]) {
                              var12 = 0;
                              var11 = 0;
                              var14 = 0;
                              var13 = 0;
                              var10 = 0;
                              break L46;
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          L48: {
                            qk.field_b = true;
                            if (var10 != 0) {
                              break L48;
                            } else {
                              if (var11 != 0) {
                                break L48;
                              } else {
                                if (var12 != 0) {
                                  break L48;
                                } else {
                                  if (var13 != 0) {
                                    break L48;
                                  } else {
                                    if (var14 == 0) {
                                      stackOut_212_0 = 0;
                                      stackIn_213_0 = stackOut_212_0;
                                      break L47;
                                    } else {
                                      stackOut_210_0 = 1;
                                      stackIn_213_0 = stackOut_210_0;
                                      break L47;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_211_0 = 1;
                          stackIn_213_0 = stackOut_211_0;
                          break L47;
                        }
                        L49: {
                          var16 = stackIn_213_0;
                          if (var16 != 0) {
                            break L49;
                          } else {
                            if (0 > var9) {
                              break L49;
                            } else {
                              if (we.field_m == null) {
                                break L49;
                              } else {
                                L50: {
                                  if (!param3) {
                                    break L50;
                                  } else {
                                    if (kh.field_Ac) {
                                      break L49;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                L51: {
                                  qk.field_b = false;
                                  if (dk.field_j == null) {
                                    dk.field_j = new byte[dr.field_c];
                                    gf.field_b = new boolean[dr.field_c];
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                ln.field_p = false;
                                var17_int = 0;
                                L52: while (true) {
                                  if (var7 <= var17_int) {
                                    L53: {
                                      sh.a(0, var7, var9, false, param1, -1, -1, param3);
                                      if (2 > hq.field_i) {
                                        break L53;
                                      } else {
                                        if (!vj.field_c[12]) {
                                          break L53;
                                        } else {
                                          qk.field_b = true;
                                          break L53;
                                        }
                                      }
                                    }
                                    if (!qk.field_b) {
                                      var16 = 1;
                                      break L49;
                                    } else {
                                      break L49;
                                    }
                                  } else {
                                    gf.field_b[var17_int] = false;
                                    var17_int++;
                                    continue L52;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L54: {
                          var17 = var8[var9 + 1];
                          if (var4_int == 0) {
                            break L54;
                          } else {
                            if (-1 == (var17.field_R ^ -1)) {
                              break L54;
                            } else {
                              if (param3) {
                                if ((var9 ^ -1) != 0) {
                                  ka.field_s[(var9 + var6) / 8] = (byte)cq.a((int) ka.field_s[(var9 + var6) / 8], 1 << rb.b(var9 + var6, 7));
                                  break L54;
                                } else {
                                  var18 = var6;
                                  L55: while (true) {
                                    if (var18 >= -1 + var6 - -var30.length) {
                                      break L54;
                                    } else {
                                      ka.field_s[var18 / 8] = (byte)rb.b((int) ka.field_s[var18 / 8], 1 << rb.b(7, var18) ^ -1);
                                      var18++;
                                      continue L55;
                                    }
                                  }
                                }
                              } else {
                                if (var16 != 0) {
                                  break L54;
                                } else {
                                  if (param1.field_tc[var7] != (byte)var9) {
                                    param1.field_tc[var7] = (byte)var9;
                                    var5 = 1;
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L56: {
                          if (!param3) {
                            break L56;
                          } else {
                            if (var16 != 0) {
                              ka.field_s[(var9 + var6) / 8] = (byte)rb.b((int) ka.field_s[(var9 + var6) / 8], 1 << rb.b(var9 + var6, 7) ^ -1);
                              break L56;
                            } else {
                              break L56;
                            }
                          }
                        }
                        L57: {
                          if ((var9 ^ -1) > -1) {
                            break L57;
                          } else {
                            if (var17.field_db) {
                              L58: {
                                if (null == mj.field_c) {
                                  var18_ref = null;
                                  break L58;
                                } else {
                                  if (mj.field_c[var7] != null) {
                                    var18_ref = mj.field_c[var7][var9];
                                    break L58;
                                  } else {
                                    var18_ref = null;
                                    break L58;
                                  }
                                }
                              }
                              L59: {
                                if (null == ir.field_p) {
                                  var19 = null;
                                  break L59;
                                } else {
                                  if (null != ir.field_p[var7]) {
                                    var19 = ir.field_p[var7][var9];
                                    break L59;
                                  } else {
                                    var19 = null;
                                    break L59;
                                  }
                                }
                              }
                              L60: {
                                var20 = null;
                                if (var19 == null) {
                                  break L60;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              L61: {
                                var21 = null;
                                if (var13 != 0) {
                                  var21 = he.field_a;
                                  var22 = var21;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var25 = var21;
                                  var22 = var25;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var22 = var25;
                                  break L61;
                                } else {
                                  if (var10 == 0) {
                                    L62: {
                                      if (var11 != 0) {
                                        var22_int = -og.field_I + w.field_j[var7][var9];
                                        if ((var22_int ^ -1) == -2) {
                                          var21 = kb.field_b;
                                          break L62;
                                        } else {
                                          var21 = nr.a(new String[]{Integer.toString(var22_int)}, -1, cr.field_s);
                                          break L62;
                                        }
                                      } else {
                                        break L62;
                                      }
                                    }
                                    L63: {
                                      if (var12 != 0) {
                                        var31 = nr.a(new String[]{Integer.toString(mg.field_d), Integer.toString(ci.field_d[var7][var9])}, -1, sm.field_E);
                                        var22_ref = var31;
                                        var25_ref = var22_ref;
                                        var22_ref = var25_ref;
                                        var21 = var22_ref;
                                        var25_ref = var31;
                                        var22_ref = var25_ref;
                                        if (var21 == null) {
                                          var21 = var31;
                                          break L63;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L63;
                                        }
                                      } else {
                                        break L63;
                                      }
                                    }
                                    if (var14 == 0) {
                                      break L61;
                                    } else {
                                      L64: {
                                        var22_ref = dk.field_a;
                                        if (0 >= var15) {
                                          break L64;
                                        } else {
                                          if (null == fg.field_f) {
                                            break L64;
                                          } else {
                                            if (var15 > fg.field_f.length) {
                                              break L64;
                                            } else {
                                              if (null == fg.field_f[var15 - 1]) {
                                                break L64;
                                              } else {
                                                var22_ref = fg.field_f[-1 + var15][0];
                                                break L64;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 != null) {
                                        var21 = (String) (var21) + "<br>" + var22_ref;
                                        break L61;
                                      } else {
                                        var21 = var22_ref;
                                        break L61;
                                      }
                                    }
                                  } else {
                                    var21 = lk.field_t;
                                    break L61;
                                  }
                                }
                              }
                              L65: {
                                if (var4_int == 0) {
                                  break L65;
                                } else {
                                  if (qk.field_b) {
                                    break L65;
                                  } else {
                                    L66: {
                                      var22_ref = null;
                                      if (ln.field_p) {
                                        var22_ref = "</col>" + ab.field_h + "<col=A00000>";
                                        var25_ref = var22_ref;
                                        var22_ref = var25_ref;
                                        var25_ref = var22_ref;
                                        var22_ref = var25_ref;
                                        var21 = var22_ref;
                                        break L66;
                                      } else {
                                        break L66;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L67: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 != 0) {
                                          var21 = bg.field_b + var22_ref;
                                          break L65;
                                        } else {
                                          var21 = nr.a(new String[]{var22_ref}, param2 ^ -1, ka.field_t);
                                          break L65;
                                        }
                                      } else {
                                        if (gf.field_b[var24]) {
                                          L68: {
                                            var25_ref = "</col>" + ck.field_R[var24] + "<col=A00000>";
                                            var22_ref = var25_ref;
                                            var21 = var22_ref;
                                            var22_ref = var25_ref;
                                            if (var22_ref != null) {
                                              var23 = 1;
                                              var22_ref = var22_ref + ", " + var25_ref;
                                              var21 = var22_ref;
                                              var21 = var22_ref;
                                              break L68;
                                            } else {
                                              var22_ref = var25_ref;
                                              break L68;
                                            }
                                          }
                                          var24++;
                                          continue L67;
                                        } else {
                                          var24++;
                                          continue L67;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L69: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = ug.a("<br>", "<br><col=A00000>", var32, -1);
                                  if (var20 == null) {
                                    var20 = var33;
                                    break L69;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L69;
                                  }
                                } else {
                                  break L69;
                                }
                              }
                              if (var20 != null) {
                                kk.field_B = (String) (var20);
                                break L57;
                              } else {
                                break L57;
                              }
                            } else {
                              break L57;
                            }
                          }
                        }
                        L70: {
                          if (!param3) {
                            L71: {
                              L72: {
                                stackOut_323_0 = (uo) (var17);
                                stackIn_326_0 = stackOut_323_0;
                                stackIn_324_0 = stackOut_323_0;
                                if (!qk.field_b) {
                                  break L72;
                                } else {
                                  stackOut_324_0 = (uo) ((Object) stackIn_324_0);
                                  stackIn_326_0 = stackOut_324_0;
                                  stackIn_325_0 = stackOut_324_0;
                                  if (param1.field_tc[var7] != (byte)var9) {
                                    break L72;
                                  } else {
                                    stackOut_325_0 = (uo) ((Object) stackIn_325_0);
                                    stackOut_325_1 = 1;
                                    stackIn_327_0 = stackOut_325_0;
                                    stackIn_327_1 = stackOut_325_1;
                                    break L71;
                                  }
                                }
                              }
                              stackOut_326_0 = (uo) ((Object) stackIn_326_0);
                              stackOut_326_1 = 0;
                              stackIn_327_0 = stackOut_326_0;
                              stackIn_327_1 = stackOut_326_1;
                              break L71;
                            }
                            stackIn_327_0.field_Ib = stackIn_327_1 != 0;
                            break L70;
                          } else {
                            if (0 != (var9 ^ -1)) {
                              L73: {
                                stackOut_319_0 = (uo) (var17);
                                stackIn_321_0 = stackOut_319_0;
                                stackIn_320_0 = stackOut_319_0;
                                if ((ka.field_s[(var6 - -var9) / 8] & 1 << (7 & var9 + var6)) == 0) {
                                  stackOut_321_0 = (uo) ((Object) stackIn_321_0);
                                  stackOut_321_1 = 0;
                                  stackIn_322_0 = stackOut_321_0;
                                  stackIn_322_1 = stackOut_321_1;
                                  break L73;
                                } else {
                                  stackOut_320_0 = (uo) ((Object) stackIn_320_0);
                                  stackOut_320_1 = 1;
                                  stackIn_322_0 = stackOut_320_0;
                                  stackIn_322_1 = stackOut_320_1;
                                  break L73;
                                }
                              }
                              stackIn_322_0.field_Ib = stackIn_322_1 != 0;
                              break L70;
                            } else {
                              var17.field_Ib = true;
                              var27 = var6;
                              var18 = var27;
                              L74: while (true) {
                                if (-1 + (var30.length + var6) <= var27) {
                                  break L70;
                                } else {
                                  L75: {
                                    stackOut_315_0 = (uo) (var17);
                                    stackOut_315_1 = var17.field_Ib;
                                    stackIn_317_0 = stackOut_315_0;
                                    stackIn_317_1 = stackOut_315_1;
                                    stackIn_316_0 = stackOut_315_0;
                                    stackIn_316_1 = stackOut_315_1;
                                    if (0 != (ka.field_s[var27 / 8] & 1 << (var27 & 7))) {
                                      stackOut_317_0 = (uo) ((Object) stackIn_317_0);
                                      stackOut_317_1 = stackIn_317_1;
                                      stackOut_317_2 = 0;
                                      stackIn_318_0 = stackOut_317_0;
                                      stackIn_318_1 = stackOut_317_1;
                                      stackIn_318_2 = stackOut_317_2;
                                      break L75;
                                    } else {
                                      stackOut_316_0 = (uo) ((Object) stackIn_316_0);
                                      stackOut_316_1 = stackIn_316_1;
                                      stackOut_316_2 = 1;
                                      stackIn_318_0 = stackOut_316_0;
                                      stackIn_318_1 = stackOut_316_1;
                                      stackIn_318_2 = stackOut_316_2;
                                      break L75;
                                    }
                                  }
                                  stackIn_318_0.field_Ib = stackIn_318_1 & stackIn_318_2 != 0;
                                  var27++;
                                  continue L74;
                                }
                              }
                            }
                          }
                        }
                        L76: {
                          L77: {
                            stackOut_328_0 = (uo) (var17);
                            stackIn_331_0 = stackOut_328_0;
                            stackIn_329_0 = stackOut_328_0;
                            if (var4_int == 0) {
                              break L77;
                            } else {
                              stackOut_329_0 = (uo) ((Object) stackIn_329_0);
                              stackIn_331_0 = stackOut_329_0;
                              stackIn_330_0 = stackOut_329_0;
                              if (var16 != 0) {
                                break L77;
                              } else {
                                stackOut_330_0 = (uo) ((Object) stackIn_330_0);
                                stackOut_330_1 = 1;
                                stackIn_332_0 = stackOut_330_0;
                                stackIn_332_1 = stackOut_330_1;
                                break L76;
                              }
                            }
                          }
                          stackOut_331_0 = (uo) ((Object) stackIn_331_0);
                          stackOut_331_1 = 0;
                          stackIn_332_0 = stackOut_331_0;
                          stackIn_332_1 = stackOut_331_1;
                          break L76;
                        }
                        stackIn_332_0.field_pb = stackIn_332_1 != 0;
                        var9++;
                        continue L38;
                      }
                    }
                  }
                }
              } else {
                L78: {
                  var28 = mc.field_f[2][var6];
                  if (var4_int == 0) {
                    break L78;
                  } else {
                    if (var28.field_R == 0) {
                      break L78;
                    } else {
                      if (!param3) {
                        if (param1.field_Yb != var6) {
                          var5 = 1;
                          param1.field_Yb = var6;
                          break L78;
                        } else {
                          break L78;
                        }
                      } else {
                        if (var6 == 0) {
                          mc.field_l = 0;
                          break L78;
                        } else {
                          mc.field_l = mc.field_l ^ var6;
                          break L78;
                        }
                      }
                    }
                  }
                }
                L79: {
                  if (!param3) {
                    L80: {
                      stackOut_116_0 = (uo) (var28);
                      stackIn_118_0 = stackOut_116_0;
                      stackIn_117_0 = stackOut_116_0;
                      if ((var6 & param1.field_Yb) == 0) {
                        stackOut_118_0 = (uo) ((Object) stackIn_118_0);
                        stackOut_118_1 = 0;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        break L80;
                      } else {
                        stackOut_117_0 = (uo) ((Object) stackIn_117_0);
                        stackOut_117_1 = 1;
                        stackIn_119_0 = stackOut_117_0;
                        stackIn_119_1 = stackOut_117_1;
                        break L80;
                      }
                    }
                    stackIn_119_0.field_Ib = stackIn_119_1 != 0;
                    break L79;
                  } else {
                    if (0 == var6) {
                      L81: {
                        stackOut_112_0 = (uo) (var28);
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_113_0 = stackOut_112_0;
                        if (0 != mc.field_l) {
                          stackOut_114_0 = (uo) ((Object) stackIn_114_0);
                          stackOut_114_1 = 0;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          break L81;
                        } else {
                          stackOut_113_0 = (uo) ((Object) stackIn_113_0);
                          stackOut_113_1 = 1;
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_115_1 = stackOut_113_1;
                          break L81;
                        }
                      }
                      stackIn_115_0.field_Ib = stackIn_115_1 != 0;
                      break L79;
                    } else {
                      L82: {
                        stackOut_108_0 = (uo) (var28);
                        stackIn_110_0 = stackOut_108_0;
                        stackIn_109_0 = stackOut_108_0;
                        if (-1 == (mc.field_l & var6 ^ -1)) {
                          stackOut_110_0 = (uo) ((Object) stackIn_110_0);
                          stackOut_110_1 = 0;
                          stackIn_111_0 = stackOut_110_0;
                          stackIn_111_1 = stackOut_110_1;
                          break L82;
                        } else {
                          stackOut_109_0 = (uo) ((Object) stackIn_109_0);
                          stackOut_109_1 = 1;
                          stackIn_111_0 = stackOut_109_0;
                          stackIn_111_1 = stackOut_109_1;
                          break L82;
                        }
                      }
                      stackIn_111_0.field_Ib = stackIn_111_1 != 0;
                      break L79;
                    }
                  }
                }
                L83: {
                  stackOut_120_0 = (uo) (var28);
                  stackIn_122_0 = stackOut_120_0;
                  stackIn_121_0 = stackOut_120_0;
                  if (var4_int == 0) {
                    stackOut_122_0 = (uo) ((Object) stackIn_122_0);
                    stackOut_122_1 = 0;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_123_1 = stackOut_122_1;
                    break L83;
                  } else {
                    stackOut_121_0 = (uo) ((Object) stackIn_121_0);
                    stackOut_121_1 = 1;
                    stackIn_123_0 = stackOut_121_0;
                    stackIn_123_1 = stackOut_121_1;
                    break L83;
                  }
                }
                stackIn_123_0.field_pb = stackIn_123_1 != 0;
                var6++;
                continue L27;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L84: {
            var4 = decompiledCaughtException;
            stackOut_338_0 = (RuntimeException) (var4);
            stackOut_338_1 = new StringBuilder().append("tl.P(").append(param0).append(',');
            stackIn_340_0 = stackOut_338_0;
            stackIn_340_1 = stackOut_338_1;
            stackIn_339_0 = stackOut_338_0;
            stackIn_339_1 = stackOut_338_1;
            if (param1 == null) {
              stackOut_340_0 = (RuntimeException) ((Object) stackIn_340_0);
              stackOut_340_1 = (StringBuilder) ((Object) stackIn_340_1);
              stackOut_340_2 = "null";
              stackIn_341_0 = stackOut_340_0;
              stackIn_341_1 = stackOut_340_1;
              stackIn_341_2 = stackOut_340_2;
              break L84;
            } else {
              stackOut_339_0 = (RuntimeException) ((Object) stackIn_339_0);
              stackOut_339_1 = (StringBuilder) ((Object) stackIn_339_1);
              stackOut_339_2 = "{...}";
              stackIn_341_0 = stackOut_339_0;
              stackIn_341_1 = stackOut_339_1;
              stackIn_341_2 = stackOut_339_2;
              break L84;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_341_0), stackIn_341_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static qb a(di param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(param3, -1);
              if (param1 == 3812) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            var5 = param0.a(var4_int, 0, param2);
            stackOut_2_0 = kh.a(var5, var4_int, (byte) -97, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("tl.S(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final dd a(String param0, int param1, int param2, int param3) {
        dd discarded$2 = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        int[] var7 = null;
        dd stackIn_6_0 = null;
        dd stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_7_0 = null;
        dd stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$2 = this.a((String) null, 127, -77, -84);
                break L1;
              }
            }
            L2: {
              if (hk.b(96)) {
                break L2;
              } else {
                if (param3 < 2) {
                  var7 = mc.field_e.field_U[param1];
                  var5 = var7;
                  stackOut_7_0 = ag.a((byte) 89, var7[var7.length >> -1129062495], param0);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_5_0 = super.a(param0, param1, 0, param3);
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5_ref);
            stackOut_9_1 = new StringBuilder().append("tl.PA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final int a(boolean param0, int param1) {
        if (!(hk.b(-114))) {
            return (param1 ^ -1) > -3 ? param1 * 240 + 300 : 380;
        }
        if (param0) {
            field_H = (String) null;
        }
        if (!(-1 != (param1 ^ -1))) {
            return 340 + this.d(0, param1);
        }
        if (!(-2 != (param1 ^ -1))) {
            return 130 + this.d(0, param1);
        }
        return this.d(0, param1) + 140;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        if (param0 == -16470) {
          L0: {
            var4 = this.field_h[param2];
            if (-24 != (var4 ^ -1)) {
              super.b(param0 + 0, param1, param2);
              break L0;
            } else {
              if (this.field_B.b((byte) 75)) {
                nk.a(pl.field_d, this.field_E, (byte) 101);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 6402) {
            return 53;
        }
        if (2 <= param0) {
            return super.a(param0, 6402);
        }
        return 0;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        var10 = Pool.field_O;
        super.c(43);
        if (hk.b(-128)) {
          this.f(320);
          return;
        } else {
          L0: {
            if (tm.field_b == null) {
              tm.field_b = wp.a(0, 10, (byte) 68, 7);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 170;
          nj.a(vk.field_y, (byte) 65, 520, 60, 150, ni.field_Z.field_G + 176 + 16);
          var3 = 2;
          var3 = 15658734;
          ni.field_Z.b(eq.field_T, se.field_i[0], var2, var3, -1);
          ni.field_Z.b(jf.field_n, se.field_i[1], var2, var3, -1);
          ni.field_Z.b(vj.field_b, se.field_i[2], var2, var3, -1);
          ni.field_Z.b(qe.field_G, se.field_i[3], var2, var3, -1);
          ni.field_Z.b(um.field_a, se.field_i[4], var2, var3, -1);
          if (param0 > 36) {
            L1: {
              var2 = var2 + (8 + (ni.field_Z.field_w + sa.field_h.field_C));
              if (!tm.field_b.field_v) {
                var4 = cl.field_j;
                break L1;
              } else {
                if (tm.field_b.field_n != null) {
                  var4 = mm.field_e;
                  var5 = tm.field_b.field_n[eo.field_Lb];
                  var6 = tm.field_b.field_q[eo.field_Lb];
                  var7 = 0;
                  var8 = 0;
                  L2: while (true) {
                    if ((var8 ^ -1) <= -11) {
                      if (var7 == 0) {
                        var3 = 4;
                        this.a(-1, tm.field_b.field_y, tm.field_b.field_x, tm.field_b.field_w, tm.field_b.field_t, 100, 16777215, var2, di.field_j);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if (var5 != null) {
                        L3: {
                          stackOut_15_0 = 62;
                          stackOut_15_1 = var2 + -sa.field_h.field_C;
                          stackOut_15_2 = 516;
                          stackOut_15_3 = 16;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          if ((1 & var8) == 0) {
                            stackOut_17_0 = stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = stackIn_17_2;
                            stackOut_17_3 = stackIn_17_3;
                            stackOut_17_4 = 4475508;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            stackIn_18_3 = stackOut_17_3;
                            stackIn_18_4 = stackOut_17_4;
                            break L3;
                          } else {
                            stackOut_16_0 = stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = stackIn_16_2;
                            stackOut_16_3 = stackIn_16_3;
                            stackOut_16_4 = 4146281;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            stackIn_18_3 = stackOut_16_3;
                            stackIn_18_4 = stackOut_16_4;
                            break L3;
                          }
                        }
                        L4: {
                          qh.f(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4);
                          var3 = 13421772;
                          var9 = var5[var8];
                          if (or.a((byte) 3, var9)) {
                            var7 = 1;
                            var3 = 16777215;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.a(var8, var6[1 + 4 * var8], var6[var8 * 4 - -3], var6[2 + 4 * var8], var6[var8 * 4], 117, var3, var2, var9);
                        var4 = null;
                        var2 += 16;
                        var8++;
                        continue L2;
                      } else {
                        var2 += 16;
                        var8++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4 = fh.field_a;
                  break L1;
                }
              }
            }
            L5: {
              if (var4 != null) {
                sa.field_h.b(var4, qh.field_l >> -1083587871, 245, 16777215, -1);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final void f(int param0) {
        sa.field_h.b(ra.field_a, param0, 380, 15658734, -1);
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int discarded$4 = 0;
        int incrementValue$5 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var11 = new char[param0];
              var10 = var11;
              var9 = var10;
              var4 = var9;
              var5 = 0;
              if (param1 == -7510) {
                break L1;
              } else {
                discarded$4 = tl.h(-13);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 >= param0) {
                stackOut_13_0 = new String(var11, 0, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L3: {
                  var7 = param2[param3 + var6] & 255;
                  if (var7 != 0) {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if ((var7 ^ -1) <= -161) {
                          break L4;
                        } else {
                          L5: {
                            var8 = rf.field_a[-128 + var7];
                            if (var8 != 0) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    incrementValue$5 = var5;
                    var5++;
                    var9[incrementValue$5] = (char)var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4_ref);
            stackOut_15_1 = new StringBuilder().append("tl.U(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final int d(int param0, int param1) {
        if (!(hk.b(-117))) {
            return 2 <= param1 ? 260 : param1 * 240 + 100;
        }
        if (param0 != 0) {
            field_I = (int[]) null;
        }
        return param1 * 350 + 80;
    }

    final void e(byte param0) {
        tm.field_b = null;
        if (param0 != -6) {
            field_K = -93;
        }
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
            this.c(120);
        }
        if (!hk.b(-119)) {
            if (!(param1 >= 2)) {
                return this.field_x;
            }
            return 390;
        }
        return 390;
    }

    final static void d(int param0, boolean param1) {
        fl.field_q.a((byte) -79, param1);
        jj var2 = sg.field_J;
        if (!(var2 == null)) {
            var2.a(fl.field_q.field_sb, (byte) 74, fl.field_q.field_ib);
        }
        if (param0 >= -74) {
            field_I = (int[]) null;
        }
    }

    static {
        field_L = new int[]{2, 20, 21, 49, 5, 12, 13};
        field_I = new int[16384];
        field_H = "<%0> is already on your friend list.";
        field_K = 236;
    }
}
