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
            field_J = null;
            break L0;
          }
        }
        L1: {
          if (!hk.b(10)) {
            L2: {
              if (qi.field_a != 96) {
                break L2;
              } else {
                if (((tl) this).field_B.field_h > 0) {
                  if (-3 == ((tl) this).field_B.field_h) {
                    break L2;
                  } else {
                    ((tl) this).field_B.a(0, (byte) 1);
                    break L2;
                  }
                } else {
                  ((tl) this).field_B.a(1, (byte) 1);
                  break L2;
                }
              }
            }
            L3: {
              if (-98 == qi.field_a) {
                if (((tl) this).field_B.field_h == 1) {
                  ((tl) this).field_B.a(0, (byte) 1);
                  break L3;
                } else {
                  if (-3 != (((tl) this).field_B.field_h ^ -1)) {
                    ((tl) this).field_B.a(1, (byte) 1);
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
                  if (0 > ((tl) this).field_B.field_h) {
                    break L5;
                  } else {
                    if (1 >= ((tl) this).field_B.field_h) {
                      ((tl) this).field_B.a(2, (byte) 1);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                ((tl) this).field_B.a(eo.field_Lb, (byte) 1);
                break L4;
              }
            }
            if ((qi.field_a ^ -1) == -99) {
              if (((tl) this).field_B.field_h == 2) {
                ((tl) this).field_B.a(eo.field_Lb, (byte) 1);
                ((tl) this).field_B.a(false);
                break L1;
              } else {
                ((tl) this).field_B.a(2, (byte) 1);
                ((tl) this).field_B.a(false);
                break L1;
              }
            } else {
              ((tl) this).field_B.a(eo.field_Lb, (byte) 1);
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
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String stackIn_9_0 = null;
        String stackOut_8_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var10 = param3 + (param2 + param1);
          if (0 == var10) {
            break L0;
          } else {
            param1 = (200 * param1 - -var10) / (var10 * 2);
            param3 = (200 * param3 + var10) / (var10 * 2);
            param2 = (200 * param2 - -var10) / (var10 * 2);
            break L0;
          }
        }
        if (param5 >= 90) {
          L1: {
            if ((param0 ^ -1) == 0) {
              break L1;
            } else {
              sa.field_h.c(param0 - -1 + ". ", 90, param7, param6, -1);
              break L1;
            }
          }
          L2: {
            sa.field_h.d(param8, 95, param7, param6, -1);
            var12 = Integer.toString(param4);
            sa.field_h.b(var12, se.field_i[0], param7, param6, -1);
            if ((var10 ^ -1) > -51) {
              stackOut_8_0 = Integer.toString(var10);
              stackIn_9_0 = stackOut_8_0;
              break L2;
            } else {
              stackOut_7_0 = "50+";
              stackIn_9_0 = stackOut_7_0;
              break L2;
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
          return;
        } else {
          return;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 69) {
            field_N = null;
        }
        if (!hk.b(-114)) {
            if (!(param1 >= 2)) {
                return 24;
            }
        }
        return 36;
    }

    final static int h(int param0) {
        int var1 = 0;
        while (n.h(param0 + 119)) {
            un.field_f.e(-15525);
            // ifeq L2
            var1 = 1;
        }
        un.field_f.a(un.a(-49, ua.field_o, lq.field_W), un.a(-49, gg.field_f, wn.field_i), -30);
        if (un.field_f.b((byte) 99)) {
            var1 = 1;
        }
        int var2 = 0;
        if (param0 != 8) {
            tl.d(-51, true);
        }
        if (var1 != 0) {
            if ((un.field_f.field_h ^ -1) <= -1) {
                var2 = ui.field_V[un.field_f.field_h];
                if ((var2 ^ -1) == -3) {
                    ra.a((byte) -108);
                }
            }
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
        int var17 = 0;
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
        L0: {
          if (param14 < 0) {
            break L0;
          } else {
            if (param2 >= fb.field_o) {
              return;
            } else {
              L1: {
                if (param7 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
                    break L1;
                  } else {
                    if (param6 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param7 < fb.field_k) {
                  break L2;
                } else {
                  if (param5 < fb.field_k) {
                    break L2;
                  } else {
                    if (fb.field_k > param6) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                var34 = param14 - param2;
                if (param2 != param1) {
                  L4: {
                    var30 = param4 << 1709412464;
                    var29 = param4 << 1709412464;
                    var22 = param12 << -400210384;
                    var21 = param12 << -400210384;
                    var26 = param13 << 1080554320;
                    var25 = param13 << 1080554320;
                    var18 = param7 << 591213136;
                    var17 = param7 << 591213136;
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
                      break L4;
                    } else {
                      var24 = (param11 - param12 << 1751112560) / var34;
                      var31 = (param0 + -param4 << 1287034416) / var35;
                      var33 = 0;
                      var28 = (param15 - param13 << -715358288) / var34;
                      var23 = (-param12 + param8 << 399196688) / var35;
                      var32 = (-param4 + param3 << 1187614320) / var34;
                      var27 = (param9 - param13 << 421295504) / var35;
                      break L4;
                    }
                  }
                  L5: {
                    if (0 > param2) {
                      if (param1 < 0) {
                        param2 = param1 - param2;
                        var25 = var25 + var27 * param2;
                        var30 = var30 + var32 * param2;
                        var26 = var26 + var28 * param2;
                        var29 = var29 + param2 * var31;
                        var18 = var18 + var20 * param2;
                        var22 = var22 + var24 * param2;
                        var17 = var17 + var19 * param2;
                        var21 = var21 + param2 * var23;
                        param2 = param1;
                        break L5;
                      } else {
                        param2 = -param2;
                        var25 = var25 + var27 * param2;
                        var18 = var18 + param2 * var20;
                        var29 = var29 + param2 * var31;
                        var17 = var17 + var19 * param2;
                        var30 = var30 + var32 * param2;
                        var26 = var26 + param2 * var28;
                        var22 = var22 + var24 * param2;
                        var21 = var21 + var23 * param2;
                        param2 = 0;
                        var36 = fb.field_m[param2];
                        L6: while (true) {
                          if (param1 <= param2) {
                            break L5;
                          } else {
                            L7: {
                              var37 = var17 >> 2022773648;
                              if (fb.field_k > var37) {
                                var38 = -(var17 >> 1085507824) + (var18 >> -1164320752);
                                if (var38 != 0) {
                                  L8: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (var26 - var25) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (var38 + var37 < fb.field_k) {
                                      break L8;
                                    } else {
                                      var38 = -1 + (fb.field_k - var37);
                                      break L8;
                                    }
                                  }
                                  if (var37 >= 0) {
                                    ng.a(var29, var25, var40, var36 + var37, (byte) -117, var41, var21, var38, param16, var39);
                                    break L7;
                                  } else {
                                    ng.a(-(var37 * var41) + var29, -(var40 * var37) + var25, var40, var36, (byte) -117, var41, var21 + -(var39 * var37), var37 + var38, param16, var39);
                                    break L7;
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L7;
                                  } else {
                                    if (var37 >= fb.field_k) {
                                      break L7;
                                    } else {
                                      ng.a(var29, var25, 0, var36 + var37, (byte) -117, 0, var21, var38, param16, 0);
                                      break L7;
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            param2++;
                            if (fb.field_o <= param2) {
                              return;
                            } else {
                              var17 = var17 + var19;
                              var29 = var29 + var31;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              var18 = var18 + var20;
                              var22 = var22 + var24;
                              var36 = var36 + qh.field_l;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var36 = fb.field_m[param2];
                      L9: while (true) {
                        if (param1 <= param2) {
                          break L5;
                        } else {
                          L10: {
                            var37 = var17 >> 2022773648;
                            if (fb.field_k > var37) {
                              var38 = -(var17 >> 1085507824) + (var18 >> -1164320752);
                              if (var38 != 0) {
                                L11: {
                                  var39 = (-var21 + var22) / var38;
                                  var40 = (var26 - var25) / var38;
                                  var41 = (var30 + -var29) / var38;
                                  if (var38 + var37 < fb.field_k) {
                                    break L11;
                                  } else {
                                    var38 = -1 + (fb.field_k - var37);
                                    break L11;
                                  }
                                }
                                if (var37 >= 0) {
                                  ng.a(var29, var25, var40, var36 + var37, (byte) -117, var41, var21, var38, param16, var39);
                                  break L10;
                                } else {
                                  ng.a(-(var37 * var41) + var29, -(var40 * var37) + var25, var40, var36, (byte) -117, var41, var21 + -(var39 * var37), var37 + var38, param16, var39);
                                  break L10;
                                }
                              } else {
                                if (var37 < 0) {
                                  break L10;
                                } else {
                                  if (var37 >= fb.field_k) {
                                    break L10;
                                  } else {
                                    ng.a(var29, var25, 0, var36 + var37, (byte) -117, 0, var21, var38, param16, 0);
                                    break L10;
                                  }
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                          param2++;
                          if (fb.field_o <= param2) {
                            return;
                          } else {
                            var17 = var17 + var19;
                            var29 = var29 + var31;
                            var25 = var25 + var27;
                            var21 = var21 + var23;
                            var30 = var30 + var32;
                            var26 = var26 + var28;
                            var18 = var18 + var20;
                            var22 = var22 + var24;
                            var36 = var36 + qh.field_l;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  var36 = -param1 + param14;
                  if (var36 != 0) {
                    L12: {
                      var37 = param6 << 1498627472;
                      var38 = param11 << 460803664;
                      var39 = param15 << -488602768;
                      var40 = param3 << 661549712;
                      if (var33 == 0) {
                        var21 = param8 << -1004289808;
                        var25 = param9 << 1384926672;
                        var17 = param5 << 365266544;
                        var29 = param0 << -1672047952;
                        break L12;
                      } else {
                        var18 = param5 << -1159079824;
                        var22 = param8 << -744071600;
                        var30 = param0 << 1166363056;
                        var26 = param9 << -700331760;
                        break L12;
                      }
                    }
                    var32 = (var40 + -var30) / var36;
                    var24 = (var38 + -var22) / var36;
                    var23 = (var38 - var21) / var36;
                    var19 = (-var17 + var37) / var36;
                    var27 = (-var25 + var39) / var36;
                    var20 = (var37 - var18) / var36;
                    var28 = (var39 - var26) / var36;
                    var31 = (-var29 + var40) / var36;
                    break L3;
                  } else {
                    var28 = 0;
                    var19 = 0;
                    var27 = 0;
                    var31 = 0;
                    var20 = 0;
                    var24 = 0;
                    var23 = 0;
                    var32 = 0;
                    break L3;
                  }
                } else {
                  L13: {
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
                      var17 = param7 << 1605246064;
                      var31 = 0;
                      var25 = param13;
                      var29 = param4;
                      break L13;
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
                        var17 = param7 << 1228170672;
                        var28 = (-param9 + param15 << 601643984) / var35;
                        break L13;
                      } else {
                        var31 = (-param0 + param3 << -1054665456) / var35;
                        var22 = param12 << -1421891056;
                        var25 = param9 << 186954512;
                        var17 = param5 << 1753137488;
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
                        break L13;
                      }
                    }
                  }
                  var33 = 0;
                  if (param2 < 0) {
                    param2 = Math.min(-param2, -param2 + param1);
                    var22 = var22 + param2 * var24;
                    var26 = var26 + var28 * param2;
                    var30 = var30 + var32 * param2;
                    var25 = var25 + param2 * var27;
                    var21 = var21 + var23 * param2;
                    var18 = var18 + var20 * param2;
                    var29 = var29 + param2 * var31;
                    var17 = var17 + var19 * param2;
                    param2 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L14: {
                if (param2 < 0) {
                  param2 = -param2;
                  var21 = var21 + param2 * var23;
                  var18 = var18 + param2 * var20;
                  var30 = var30 + var32 * param2;
                  var22 = var22 + var24 * param2;
                  var26 = var26 + param2 * var28;
                  var29 = var29 + param2 * var31;
                  var25 = var25 + param2 * var27;
                  var17 = var17 + param2 * var19;
                  param2 = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var35 = fb.field_m[param2];
                if (param10 == -49) {
                  break L15;
                } else {
                  field_J = null;
                  break L15;
                }
              }
              L16: while (true) {
                if (param14 <= param2) {
                  break L0;
                } else {
                  L17: {
                    var36 = var17 >> 448883920;
                    if (var36 < fb.field_k) {
                      var37 = -(var17 >> 646355760) + (var18 >> -1620379376);
                      if (0 == var37) {
                        if (var36 < 0) {
                          break L17;
                        } else {
                          if (var36 < fb.field_k) {
                            ng.a(var29, var25, 0, var36 - -var35, (byte) -117, 0, var21, var37, param16, 0);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      } else {
                        L18: {
                          var38 = (var22 - var21) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (var30 - var29) / var37;
                          if (fb.field_k <= var37 + var36) {
                            var37 = -var36 + fb.field_k + -1;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        if (var36 < 0) {
                          ng.a(-(var40 * var36) + var29, var25 + -(var36 * var39), var39, var35, (byte) -117, var40, var21 - var36 * var38, var37 + var36, param16, var38);
                          break L17;
                        } else {
                          ng.a(var29, var25, var39, var35 + var36, (byte) -117, var40, var21, var37, param16, var38);
                          break L17;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  param2++;
                  if (fb.field_o <= param2) {
                    return;
                  } else {
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var17 = var17 + var19;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    var35 = var35 + qh.field_l;
                    var18 = var18 + var20;
                    var29 = var29 + var31;
                    continue L16;
                  }
                }
              }
            }
          }
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
            field_H = null;
        }
        field_N = null;
        field_I = null;
        field_L = null;
        field_H = null;
        field_J = null;
    }

    final static void a(int param0, kh param1, int param2, boolean param3) {
        String var8_ref2 = null;
        int var4 = 0;
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
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        uo var28 = null;
        uo var29 = null;
        uo[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        uo stackIn_20_0 = null;
        uo stackIn_21_0 = null;
        uo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        uo stackIn_27_0 = null;
        uo stackIn_28_0 = null;
        uo stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        uo stackIn_72_0 = null;
        uo stackIn_73_0 = null;
        uo stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        uo stackIn_77_0 = null;
        uo stackIn_78_0 = null;
        uo stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        uo stackIn_83_0 = null;
        boolean stackIn_83_1 = false;
        uo stackIn_84_0 = null;
        boolean stackIn_84_1 = false;
        uo stackIn_85_0 = null;
        boolean stackIn_85_1 = false;
        int stackIn_85_2 = 0;
        uo stackIn_87_0 = null;
        uo stackIn_88_0 = null;
        uo stackIn_89_0 = null;
        uo stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_94_0 = 0;
        uo stackIn_108_0 = null;
        uo stackIn_109_0 = null;
        uo stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        uo stackIn_112_0 = null;
        uo stackIn_113_0 = null;
        uo stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        uo stackIn_116_0 = null;
        uo stackIn_117_0 = null;
        uo stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        uo stackIn_120_0 = null;
        uo stackIn_121_0 = null;
        uo stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        String stackIn_138_0 = null;
        uo stackIn_142_0 = null;
        uo stackIn_143_0 = null;
        uo stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        uo stackIn_145_0 = null;
        uo stackIn_146_0 = null;
        uo stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_216_0 = 0;
        uo stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        uo stackIn_319_0 = null;
        boolean stackIn_319_1 = false;
        uo stackIn_320_0 = null;
        boolean stackIn_320_1 = false;
        int stackIn_320_2 = 0;
        uo stackIn_322_0 = null;
        uo stackIn_323_0 = null;
        uo stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        uo stackIn_326_0 = null;
        uo stackIn_327_0 = null;
        uo stackIn_328_0 = null;
        uo stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        uo stackIn_331_0 = null;
        uo stackIn_332_0 = null;
        uo stackIn_333_0 = null;
        uo stackIn_334_0 = null;
        int stackIn_334_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        uo stackOut_19_0 = null;
        uo stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        uo stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        uo stackOut_26_0 = null;
        uo stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        uo stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        uo stackOut_82_0 = null;
        boolean stackOut_82_1 = false;
        uo stackOut_84_0 = null;
        boolean stackOut_84_1 = false;
        int stackOut_84_2 = 0;
        uo stackOut_83_0 = null;
        boolean stackOut_83_1 = false;
        int stackOut_83_2 = 0;
        uo stackOut_76_0 = null;
        uo stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        uo stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        uo stackOut_71_0 = null;
        uo stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        uo stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        uo stackOut_86_0 = null;
        uo stackOut_87_0 = null;
        uo stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        uo stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        String stackOut_137_0 = null;
        Object stackOut_136_0 = null;
        uo stackOut_141_0 = null;
        uo stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        uo stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        uo stackOut_144_0 = null;
        uo stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        uo stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_205_0 = 0;
        uo stackOut_325_0 = null;
        uo stackOut_326_0 = null;
        uo stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        uo stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        uo stackOut_321_0 = null;
        uo stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        uo stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        uo stackOut_317_0 = null;
        boolean stackOut_317_1 = false;
        uo stackOut_319_0 = null;
        boolean stackOut_319_1 = false;
        int stackOut_319_2 = 0;
        uo stackOut_318_0 = null;
        boolean stackOut_318_1 = false;
        int stackOut_318_2 = 0;
        uo stackOut_330_0 = null;
        uo stackOut_331_0 = null;
        uo stackOut_332_0 = null;
        int stackOut_332_1 = 0;
        uo stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        uo stackOut_115_0 = null;
        uo stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        uo stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        uo stackOut_111_0 = null;
        uo stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        uo stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        uo stackOut_107_0 = null;
        uo stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        uo stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        uo stackOut_119_0 = null;
        uo stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        uo stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        var8_ref2 = null;
        L0: {
          var26 = Pool.field_O;
          if (param3) {
            L1: {
              if (kh.field_Ac) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (cj.e((byte) 85)) {
                if (!param1.field_ec) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            break L0;
          }
        }
        L3: {
          var5 = 0;
          if (param3) {
            break L3;
          } else {
            var6 = 0;
            L4: while (true) {
              if (5 <= var6) {
                if (!mc.field_f[0][2].field_db) {
                  break L3;
                } else {
                  if (cj.e((byte) 85)) {
                    kk.field_B = rq.field_r;
                    break L3;
                  } else {
                    kk.field_B = nr.a(new String[1], -1, ep.field_v);
                    break L3;
                  }
                }
              } else {
                L5: {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    if (mc.field_f[0][var6 + 1].field_R == 0) {
                      break L5;
                    } else {
                      if (var6 == param1.field_ac) {
                        break L5;
                      } else {
                        param1.field_ac = var6;
                        var5 = 1;
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  stackOut_19_0 = mc.field_f[0][var6 + 1];
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (var4 == 0) {
                    stackOut_21_0 = (uo) (Object) stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L6;
                  } else {
                    stackOut_20_0 = (uo) (Object) stackIn_20_0;
                    stackOut_20_1 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L6;
                  }
                }
                L7: {
                  stackIn_22_0.field_pb = stackIn_22_1 != 0;
                  if (tq.field_p) {
                    break L7;
                  } else {
                    if (3 == var6) {
                      mc.field_f[0][var6 - -1].field_pb = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  stackOut_26_0 = mc.field_f[0][var6 - -1];
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (param1.field_ac != var6) {
                    stackOut_28_0 = (uo) (Object) stackIn_28_0;
                    stackOut_28_1 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L8;
                  } else {
                    stackOut_27_0 = (uo) (Object) stackIn_27_0;
                    stackOut_27_1 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L8;
                  }
                }
                stackIn_29_0.field_Ib = stackIn_29_1 != 0;
                var6++;
                continue L4;
              }
            }
          }
        }
        L9: {
          if (-3 >= (dg.field_T.length ^ -1)) {
            L10: {
              if (param3) {
                if (od.field_d != -1) {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  break L10;
                } else {
                  stackOut_39_0 = 0;
                  stackIn_42_0 = stackOut_39_0;
                  break L10;
                }
              } else {
                stackOut_37_0 = 0;
                stackIn_42_0 = stackOut_37_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_42_0;
              if (var6 == 0) {
                break L11;
              } else {
                var7 = od.field_d;
                var8_int = 0;
                L12: while (true) {
                  if (var8_int >= md.field_c.length) {
                    md.field_c[var7 / 8] = (byte)md.a((int) md.field_c[var7 / 8], 1 << var7 % 8);
                    break L11;
                  } else {
                    md.field_c[var8_int] = (byte) 0;
                    var8_int++;
                    continue L12;
                  }
                }
              }
            }
            L13: {
              if (param3) {
                stackOut_49_0 = -1;
                stackIn_50_0 = stackOut_49_0;
                break L13;
              } else {
                stackOut_48_0 = 0;
                stackIn_50_0 = stackOut_48_0;
                break L13;
              }
            }
            var7 = stackIn_50_0;
            L14: while (true) {
              if (dg.field_T.length <= var7) {
                break L9;
              } else {
                L15: {
                  if (var6 != 0) {
                    if (var7 != od.field_d) {
                      stackOut_56_0 = 1;
                      stackIn_58_0 = stackOut_56_0;
                      break L15;
                    } else {
                      stackOut_55_0 = 0;
                      stackIn_58_0 = stackOut_55_0;
                      break L15;
                    }
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_58_0 = stackOut_53_0;
                    break L15;
                  }
                }
                L16: {
                  var8_int = stackIn_58_0;
                  if (var4 == 0) {
                    break L16;
                  } else {
                    if (mc.field_f[1][var7 + 1].field_R == 0) {
                      break L16;
                    } else {
                      if (!param3) {
                        var9 = dg.field_T[var7];
                        if (var9 == param1.field_Nb) {
                          break L16;
                        } else {
                          param1.field_Nb = var9;
                          var5 = 1;
                          break L16;
                        }
                      } else {
                        if (var6 == 0) {
                          if (var7 != -1) {
                            md.field_c[var7 / 8] = (byte)cq.a((int) md.field_c[var7 / 8], 1 << rb.b(var7, 7));
                            break L16;
                          } else {
                            var9 = 0;
                            L17: while (true) {
                              if (md.field_c.length <= var9) {
                                break L16;
                              } else {
                                md.field_c[var9] = (byte) 0;
                                var9++;
                                continue L17;
                              }
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                }
                L18: {
                  if (param3) {
                    if (0 == (var7 ^ -1)) {
                      mc.field_f[1][var7 + 1].field_Ib = true;
                      var9 = 0;
                      L19: while (true) {
                        if (var9 >= dg.field_T.length) {
                          break L18;
                        } else {
                          L20: {
                            stackOut_82_0 = mc.field_f[1][1 + var7];
                            stackOut_82_1 = mc.field_f[1][1 + var7].field_Ib;
                            stackIn_84_0 = stackOut_82_0;
                            stackIn_84_1 = stackOut_82_1;
                            stackIn_83_0 = stackOut_82_0;
                            stackIn_83_1 = stackOut_82_1;
                            if ((md.field_c[var9 / 8] & 1 << (7 & var9)) != 0) {
                              stackOut_84_0 = (uo) (Object) stackIn_84_0;
                              stackOut_84_1 = stackIn_84_1;
                              stackOut_84_2 = 0;
                              stackIn_85_0 = stackOut_84_0;
                              stackIn_85_1 = stackOut_84_1;
                              stackIn_85_2 = stackOut_84_2;
                              break L20;
                            } else {
                              stackOut_83_0 = (uo) (Object) stackIn_83_0;
                              stackOut_83_1 = stackIn_83_1;
                              stackOut_83_2 = 1;
                              stackIn_85_0 = stackOut_83_0;
                              stackIn_85_1 = stackOut_83_1;
                              stackIn_85_2 = stackOut_83_2;
                              break L20;
                            }
                          }
                          stackIn_85_0.field_Ib = stackIn_85_1 & stackIn_85_2 != 0;
                          var9++;
                          continue L19;
                        }
                      }
                    } else {
                      L21: {
                        stackOut_76_0 = mc.field_f[1][1 + var7];
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if ((md.field_c[var7 / 8] & 1 << (7 & var7)) == 0) {
                          stackOut_78_0 = (uo) (Object) stackIn_78_0;
                          stackOut_78_1 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          break L21;
                        } else {
                          stackOut_77_0 = (uo) (Object) stackIn_77_0;
                          stackOut_77_1 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          break L21;
                        }
                      }
                      stackIn_79_0.field_Ib = stackIn_79_1 != 0;
                      break L18;
                    }
                  } else {
                    L22: {
                      var9 = dg.field_T[var7];
                      stackOut_71_0 = mc.field_f[1][var7 - -1];
                      stackIn_73_0 = stackOut_71_0;
                      stackIn_72_0 = stackOut_71_0;
                      if (var9 != param1.field_Nb) {
                        stackOut_73_0 = (uo) (Object) stackIn_73_0;
                        stackOut_73_1 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        break L22;
                      } else {
                        stackOut_72_0 = (uo) (Object) stackIn_72_0;
                        stackOut_72_1 = 1;
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_74_1 = stackOut_72_1;
                        break L22;
                      }
                    }
                    stackIn_74_0.field_Ib = stackIn_74_1 != 0;
                    break L18;
                  }
                }
                L23: {
                  L24: {
                    stackOut_86_0 = mc.field_f[1][1 + var7];
                    stackIn_89_0 = stackOut_86_0;
                    stackIn_87_0 = stackOut_86_0;
                    if (var4 == 0) {
                      break L24;
                    } else {
                      stackOut_87_0 = (uo) (Object) stackIn_87_0;
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_88_0 = stackOut_87_0;
                      if (var8_int != 0) {
                        break L24;
                      } else {
                        stackOut_88_0 = (uo) (Object) stackIn_88_0;
                        stackOut_88_1 = 1;
                        stackIn_90_0 = stackOut_88_0;
                        stackIn_90_1 = stackOut_88_1;
                        break L23;
                      }
                    }
                  }
                  stackOut_89_0 = (uo) (Object) stackIn_89_0;
                  stackOut_89_1 = 0;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  break L23;
                }
                stackIn_90_0.field_pb = stackIn_90_1 != 0;
                var7++;
                continue L14;
              }
            }
          } else {
            break L9;
          }
        }
        L25: {
          if (!param3) {
            stackOut_93_0 = 1;
            stackIn_94_0 = stackOut_93_0;
            break L25;
          } else {
            stackOut_92_0 = 0;
            stackIn_94_0 = stackOut_92_0;
            break L25;
          }
        }
        var6 = stackIn_94_0;
        L26: while (true) {
          if ((var6 ^ -1) <= -4) {
            L27: {
              if (!param3) {
                break L27;
              } else {
                if (1 < ji.field_g) {
                  var6 = 0;
                  L28: while (true) {
                    if (ji.field_g + 1 <= var6) {
                      break L27;
                    } else {
                      L29: {
                        var29 = mc.field_f[3][var6];
                        if (var4 == 0) {
                          break L29;
                        } else {
                          if (-1 != var29.field_R) {
                            pm.field_l = var6;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (!var29.field_db) {
                          break L30;
                        } else {
                          if (-1 < var6) {
                            L31: {
                              if (null != wp.field_f) {
                                stackOut_137_0 = wp.field_f[-1 + var6];
                                stackIn_138_0 = stackOut_137_0;
                                break L31;
                              } else {
                                stackOut_136_0 = null;
                                stackIn_138_0 = (String) (Object) stackOut_136_0;
                                break L31;
                              }
                            }
                            var8_ref2 = stackIn_138_0;
                            if (var8_ref2 != null) {
                              kk.field_B = var8_ref2;
                              break L30;
                            } else {
                              break L30;
                            }
                          } else {
                            break L30;
                          }
                        }
                      }
                      L32: {
                        stackOut_141_0 = (uo) var29;
                        stackIn_143_0 = stackOut_141_0;
                        stackIn_142_0 = stackOut_141_0;
                        if (var4 == 0) {
                          stackOut_143_0 = (uo) (Object) stackIn_143_0;
                          stackOut_143_1 = 0;
                          stackIn_144_0 = stackOut_143_0;
                          stackIn_144_1 = stackOut_143_1;
                          break L32;
                        } else {
                          stackOut_142_0 = (uo) (Object) stackIn_142_0;
                          stackOut_142_1 = 1;
                          stackIn_144_0 = stackOut_142_0;
                          stackIn_144_1 = stackOut_142_1;
                          break L32;
                        }
                      }
                      L33: {
                        stackIn_144_0.field_pb = stackIn_144_1 != 0;
                        stackOut_144_0 = (uo) var29;
                        stackIn_146_0 = stackOut_144_0;
                        stackIn_145_0 = stackOut_144_0;
                        if (pm.field_l != var6) {
                          stackOut_146_0 = (uo) (Object) stackIn_146_0;
                          stackOut_146_1 = 0;
                          stackIn_147_0 = stackOut_146_0;
                          stackIn_147_1 = stackOut_146_1;
                          break L33;
                        } else {
                          stackOut_145_0 = (uo) (Object) stackIn_145_0;
                          stackOut_145_1 = 1;
                          stackIn_147_0 = stackOut_145_0;
                          stackIn_147_1 = stackOut_145_1;
                          break L33;
                        }
                      }
                      stackIn_147_0.field_Ib = stackIn_147_1 != 0;
                      var6++;
                      continue L28;
                    }
                  }
                } else {
                  break L27;
                }
              }
            }
            var6 = 0;
            var7 = param2;
            L34: while (true) {
              if (var7 >= dr.field_c) {
                L35: {
                  if (var5 == 0) {
                    break L35;
                  } else {
                    if (param3) {
                      break L35;
                    } else {
                      lm.c(5, param0);
                      break L35;
                    }
                  }
                }
                return;
              } else {
                L36: {
                  var30 = mc.field_f[4 + var7];
                  var8 = var30;
                  if (param3) {
                    stackOut_152_0 = -1;
                    stackIn_153_0 = stackOut_152_0;
                    break L36;
                  } else {
                    stackOut_151_0 = 0;
                    stackIn_153_0 = stackOut_151_0;
                    break L36;
                  }
                }
                var9 = stackIn_153_0;
                L37: while (true) {
                  if (-1 + var30.length <= var9) {
                    var6 = var6 + (qf.field_j[var7] & 255);
                    var7++;
                    continue L34;
                  } else {
                    L38: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L38;
                      } else {
                        if (-1 >= (var9 ^ -1)) {
                          L39: {
                            if (op.field_a == null) {
                              break L39;
                            } else {
                              if (op.field_a[var7] == null) {
                                break L39;
                              } else {
                                if (((eq.field_S ^ -1) & op.field_a[var7][var9]) <= 0) {
                                  break L39;
                                } else {
                                  var14 = 1;
                                  var15 = s.a(op.field_a[var7][var9] & (eq.field_S ^ -1), (byte) 87);
                                  break L39;
                                }
                              }
                            }
                          }
                          L40: {
                            if (dl.field_j == null) {
                              break L40;
                            } else {
                              if (null != dl.field_j[var7]) {
                                if (mp.field_V > 0) {
                                  break L40;
                                } else {
                                  if (!dl.field_j[var7][var9]) {
                                    break L40;
                                  } else {
                                    var10 = 1;
                                    break L40;
                                  }
                                }
                              } else {
                                break L40;
                              }
                            }
                          }
                          L41: {
                            if (ci.field_d == null) {
                              break L41;
                            } else {
                              if (ci.field_d[var7] != null) {
                                L42: {
                                  var16 = ci.field_d[var7][var9];
                                  if (0 >= var16) {
                                    break L42;
                                  } else {
                                    if (mg.field_d < var16) {
                                      var12 = 1;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                if (-1 == (var16 ^ -1)) {
                                  break L41;
                                } else {
                                  if (rg.field_s) {
                                    break L41;
                                  } else {
                                    if (0 < mp.field_V) {
                                      break L41;
                                    } else {
                                      var10 = 1;
                                      break L41;
                                    }
                                  }
                                }
                              } else {
                                break L41;
                              }
                            }
                          }
                          L43: {
                            if (param3) {
                              if (ca.field_j != null) {
                                if (null != ca.field_j[var7]) {
                                  if (!ca.field_j[var7][var9]) {
                                    stackOut_187_0 = 0;
                                    stackIn_189_0 = stackOut_187_0;
                                    break L43;
                                  } else {
                                    stackOut_186_0 = 1;
                                    stackIn_189_0 = stackOut_186_0;
                                    break L43;
                                  }
                                } else {
                                  stackOut_184_0 = 0;
                                  stackIn_189_0 = stackOut_184_0;
                                  break L43;
                                }
                              } else {
                                stackOut_182_0 = 0;
                                stackIn_189_0 = stackOut_182_0;
                                break L43;
                              }
                            } else {
                              stackOut_180_0 = 0;
                              stackIn_189_0 = stackOut_180_0;
                              break L43;
                            }
                          }
                          var13 = stackIn_189_0;
                          if (null == w.field_j) {
                            break L38;
                          } else {
                            if (w.field_j[var7] == null) {
                              break L38;
                            } else {
                              L44: {
                                var16 = w.field_j[var7][var9];
                                if (var16 == 0) {
                                  break L44;
                                } else {
                                  if (rg.field_s) {
                                    break L44;
                                  } else {
                                    if (mp.field_V <= 0) {
                                      var10 = 1;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (-1 <= (var16 ^ -1)) {
                                break L38;
                              } else {
                                if (og.field_I < var16) {
                                  var11 = 1;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            }
                          }
                        } else {
                          break L38;
                        }
                      }
                    }
                    L45: {
                      if (2 > hq.field_i) {
                        break L45;
                      } else {
                        if (vj.field_c[12]) {
                          var12 = 0;
                          var11 = 0;
                          var14 = 0;
                          var13 = 0;
                          var10 = 0;
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                    }
                    L46: {
                      qk.field_b = true;
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_214_0 = 1;
                                stackIn_216_0 = stackOut_214_0;
                                break L46;
                              } else {
                                stackOut_213_0 = 0;
                                stackIn_216_0 = stackOut_213_0;
                                break L46;
                              }
                            } else {
                              stackOut_211_0 = 1;
                              stackIn_216_0 = stackOut_211_0;
                              break L46;
                            }
                          } else {
                            stackOut_209_0 = 1;
                            stackIn_216_0 = stackOut_209_0;
                            break L46;
                          }
                        } else {
                          stackOut_207_0 = 1;
                          stackIn_216_0 = stackOut_207_0;
                          break L46;
                        }
                      } else {
                        stackOut_205_0 = 1;
                        stackIn_216_0 = stackOut_205_0;
                        break L46;
                      }
                    }
                    L47: {
                      var16 = stackIn_216_0;
                      if (var16 != 0) {
                        break L47;
                      } else {
                        if (0 > var9) {
                          break L47;
                        } else {
                          if (we.field_m == null) {
                            break L47;
                          } else {
                            L48: {
                              if (!param3) {
                                break L48;
                              } else {
                                if (kh.field_Ac) {
                                  break L47;
                                } else {
                                  break L48;
                                }
                              }
                            }
                            L49: {
                              qk.field_b = false;
                              if (dk.field_j == null) {
                                dk.field_j = new byte[dr.field_c];
                                gf.field_b = new boolean[dr.field_c];
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                            ln.field_p = false;
                            var17_int = 0;
                            L50: while (true) {
                              if (var7 <= var17_int) {
                                L51: {
                                  sh.a(0, var7, var9, false, param1, -1, -1, param3);
                                  if (2 > hq.field_i) {
                                    break L51;
                                  } else {
                                    if (!vj.field_c[12]) {
                                      break L51;
                                    } else {
                                      qk.field_b = true;
                                      break L51;
                                    }
                                  }
                                }
                                if (!qk.field_b) {
                                  var16 = 1;
                                  break L47;
                                } else {
                                  break L47;
                                }
                              } else {
                                gf.field_b[var17_int] = false;
                                var17_int++;
                                continue L50;
                              }
                            }
                          }
                        }
                      }
                    }
                    L52: {
                      var17 = var8[var9 + 1];
                      if (var4 == 0) {
                        break L52;
                      } else {
                        if (-1 == (var17.field_R ^ -1)) {
                          break L52;
                        } else {
                          if (param3) {
                            if ((var9 ^ -1) != 0) {
                              ka.field_s[(var9 + var6) / 8] = (byte)cq.a((int) ka.field_s[(var9 + var6) / 8], 1 << rb.b(var9 + var6, 7));
                              break L52;
                            } else {
                              var18 = var6;
                              L53: while (true) {
                                if (var18 >= -1 + var6 - -var30.length) {
                                  break L52;
                                } else {
                                  ka.field_s[var18 / 8] = (byte)rb.b((int) ka.field_s[var18 / 8], 1 << rb.b(7, var18) ^ -1);
                                  var18++;
                                  continue L53;
                                }
                              }
                            }
                          } else {
                            if (var16 != 0) {
                              break L52;
                            } else {
                              if (param1.field_tc[var7] != (byte)var9) {
                                param1.field_tc[var7] = (byte)var9;
                                var5 = 1;
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                          }
                        }
                      }
                    }
                    L54: {
                      if (!param3) {
                        break L54;
                      } else {
                        if (var16 != 0) {
                          ka.field_s[(var9 + var6) / 8] = (byte)rb.b((int) ka.field_s[(var9 + var6) / 8], 1 << rb.b(var9 + var6, 7) ^ -1);
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                    }
                    L55: {
                      if ((var9 ^ -1) > -1) {
                        break L55;
                      } else {
                        if (var17.field_db) {
                          L56: {
                            if (null == mj.field_c) {
                              var18_ref = null;
                              break L56;
                            } else {
                              if (mj.field_c[var7] != null) {
                                var18_ref_String = mj.field_c[var7][var9];
                                break L56;
                              } else {
                                var18_ref_String = null;
                                break L56;
                              }
                            }
                          }
                          L57: {
                            if (null == ir.field_p) {
                              var19 = null;
                              break L57;
                            } else {
                              if (null != ir.field_p[var7]) {
                                var19_ref = ir.field_p[var7][var9];
                                break L57;
                              } else {
                                var19_ref = null;
                                break L57;
                              }
                            }
                          }
                          L58: {
                            var20 = null;
                            if (var19 == null) {
                              break L58;
                            } else {
                              if (!((String) var19).equals(var18_ref)) {
                                var20 = (String) var19;
                                break L58;
                              } else {
                                break L58;
                              }
                            }
                          }
                          L59: {
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
                              break L59;
                            } else {
                              if (var10 == 0) {
                                L60: {
                                  if (var11 != 0) {
                                    var22_int = -og.field_I + w.field_j[var7][var9];
                                    if ((var22_int ^ -1) == -2) {
                                      var21 = kb.field_b;
                                      break L60;
                                    } else {
                                      var21 = nr.a(new String[1], -1, cr.field_s);
                                      break L60;
                                    }
                                  } else {
                                    break L60;
                                  }
                                }
                                L61: {
                                  if (var12 != 0) {
                                    var31 = nr.a(new String[2], -1, sm.field_E);
                                    var22 = var31;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    var25 = var31;
                                    var22 = var25;
                                    if (var21 == null) {
                                      var21 = var31;
                                      break L61;
                                    } else {
                                      var21 = var21 + "<br>" + var31;
                                      break L61;
                                    }
                                  } else {
                                    break L61;
                                  }
                                }
                                if (var14 == 0) {
                                  break L59;
                                } else {
                                  L62: {
                                    var22 = dk.field_a;
                                    if (0 >= var15) {
                                      break L62;
                                    } else {
                                      if (null == fg.field_f) {
                                        break L62;
                                      } else {
                                        if (var15 > fg.field_f.length) {
                                          break L62;
                                        } else {
                                          if (null == fg.field_f[var15 - 1]) {
                                            break L62;
                                          } else {
                                            var22_ref = fg.field_f[-1 + var15][0];
                                            break L62;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 != null) {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L59;
                                  } else {
                                    var21 = var22_ref;
                                    break L59;
                                  }
                                }
                              } else {
                                var21 = lk.field_t;
                                break L59;
                              }
                            }
                          }
                          L63: {
                            if (var4 == 0) {
                              break L63;
                            } else {
                              if (qk.field_b) {
                                break L63;
                              } else {
                                L64: {
                                  var22_ref = null;
                                  if (ln.field_p) {
                                    var22 = "</col>" + ab.field_h + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L65: while (true) {
                                  if (var7 <= var24) {
                                    if (var23 != 0) {
                                      var21 = bg.field_b + var22;
                                      break L63;
                                    } else {
                                      var21 = nr.a(new String[1], param2 ^ -1, ka.field_t);
                                      break L63;
                                    }
                                  } else {
                                    if (gf.field_b[var24]) {
                                      var25 = "</col>" + ck.field_R[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 != null) {
                                        var23 = 1;
                                        var22 = var22 + ", " + var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var24++;
                                        continue L65;
                                      } else {
                                        var22 = var25;
                                        var24++;
                                        continue L65;
                                      }
                                    } else {
                                      var24++;
                                      continue L65;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L66: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + var21;
                              var33 = ug.a("<br>", "<br><col=A00000>", var32, -1);
                              if (var20 == null) {
                                var20 = var33;
                                break L66;
                              } else {
                                var20 = var20 + "<br>" + var33;
                                break L66;
                              }
                            } else {
                              break L66;
                            }
                          }
                          if (var20 != null) {
                            kk.field_B = var20;
                            break L55;
                          } else {
                            break L55;
                          }
                        } else {
                          break L55;
                        }
                      }
                    }
                    L67: {
                      if (!param3) {
                        L68: {
                          L69: {
                            stackOut_325_0 = (uo) var17;
                            stackIn_328_0 = stackOut_325_0;
                            stackIn_326_0 = stackOut_325_0;
                            if (!qk.field_b) {
                              break L69;
                            } else {
                              stackOut_326_0 = (uo) (Object) stackIn_326_0;
                              stackIn_328_0 = stackOut_326_0;
                              stackIn_327_0 = stackOut_326_0;
                              if (param1.field_tc[var7] != (byte)var9) {
                                break L69;
                              } else {
                                stackOut_327_0 = (uo) (Object) stackIn_327_0;
                                stackOut_327_1 = 1;
                                stackIn_329_0 = stackOut_327_0;
                                stackIn_329_1 = stackOut_327_1;
                                break L68;
                              }
                            }
                          }
                          stackOut_328_0 = (uo) (Object) stackIn_328_0;
                          stackOut_328_1 = 0;
                          stackIn_329_0 = stackOut_328_0;
                          stackIn_329_1 = stackOut_328_1;
                          break L68;
                        }
                        stackIn_329_0.field_Ib = stackIn_329_1 != 0;
                        break L67;
                      } else {
                        if (0 != (var9 ^ -1)) {
                          L70: {
                            stackOut_321_0 = (uo) var17;
                            stackIn_323_0 = stackOut_321_0;
                            stackIn_322_0 = stackOut_321_0;
                            if ((ka.field_s[(var6 - -var9) / 8] & 1 << (7 & var9 + var6)) == 0) {
                              stackOut_323_0 = (uo) (Object) stackIn_323_0;
                              stackOut_323_1 = 0;
                              stackIn_324_0 = stackOut_323_0;
                              stackIn_324_1 = stackOut_323_1;
                              break L70;
                            } else {
                              stackOut_322_0 = (uo) (Object) stackIn_322_0;
                              stackOut_322_1 = 1;
                              stackIn_324_0 = stackOut_322_0;
                              stackIn_324_1 = stackOut_322_1;
                              break L70;
                            }
                          }
                          stackIn_324_0.field_Ib = stackIn_324_1 != 0;
                          break L67;
                        } else {
                          var17.field_Ib = true;
                          var27 = var6;
                          var18 = var27;
                          L71: while (true) {
                            if (-1 + (var30.length + var6) <= var27) {
                              break L67;
                            } else {
                              L72: {
                                stackOut_317_0 = (uo) var17;
                                stackOut_317_1 = var17.field_Ib;
                                stackIn_319_0 = stackOut_317_0;
                                stackIn_319_1 = stackOut_317_1;
                                stackIn_318_0 = stackOut_317_0;
                                stackIn_318_1 = stackOut_317_1;
                                if (0 != (ka.field_s[var27 / 8] & 1 << (var27 & 7))) {
                                  stackOut_319_0 = (uo) (Object) stackIn_319_0;
                                  stackOut_319_1 = stackIn_319_1;
                                  stackOut_319_2 = 0;
                                  stackIn_320_0 = stackOut_319_0;
                                  stackIn_320_1 = stackOut_319_1;
                                  stackIn_320_2 = stackOut_319_2;
                                  break L72;
                                } else {
                                  stackOut_318_0 = (uo) (Object) stackIn_318_0;
                                  stackOut_318_1 = stackIn_318_1;
                                  stackOut_318_2 = 1;
                                  stackIn_320_0 = stackOut_318_0;
                                  stackIn_320_1 = stackOut_318_1;
                                  stackIn_320_2 = stackOut_318_2;
                                  break L72;
                                }
                              }
                              stackIn_320_0.field_Ib = stackIn_320_1 & stackIn_320_2 != 0;
                              var27++;
                              continue L71;
                            }
                          }
                        }
                      }
                    }
                    L73: {
                      L74: {
                        stackOut_330_0 = (uo) var17;
                        stackIn_333_0 = stackOut_330_0;
                        stackIn_331_0 = stackOut_330_0;
                        if (var4 == 0) {
                          break L74;
                        } else {
                          stackOut_331_0 = (uo) (Object) stackIn_331_0;
                          stackIn_333_0 = stackOut_331_0;
                          stackIn_332_0 = stackOut_331_0;
                          if (var16 != 0) {
                            break L74;
                          } else {
                            stackOut_332_0 = (uo) (Object) stackIn_332_0;
                            stackOut_332_1 = 1;
                            stackIn_334_0 = stackOut_332_0;
                            stackIn_334_1 = stackOut_332_1;
                            break L73;
                          }
                        }
                      }
                      stackOut_333_0 = (uo) (Object) stackIn_333_0;
                      stackOut_333_1 = 0;
                      stackIn_334_0 = stackOut_333_0;
                      stackIn_334_1 = stackOut_333_1;
                      break L73;
                    }
                    stackIn_334_0.field_pb = stackIn_334_1 != 0;
                    var9++;
                    continue L37;
                  }
                }
              }
            }
          } else {
            L75: {
              var28 = mc.field_f[2][var6];
              if (var4 == 0) {
                break L75;
              } else {
                if (var28.field_R == 0) {
                  break L75;
                } else {
                  if (!param3) {
                    if (param1.field_Yb != var6) {
                      var5 = 1;
                      param1.field_Yb = var6;
                      break L75;
                    } else {
                      break L75;
                    }
                  } else {
                    if (var6 == 0) {
                      mc.field_l = 0;
                      break L75;
                    } else {
                      mc.field_l = mc.field_l ^ var6;
                      break L75;
                    }
                  }
                }
              }
            }
            L76: {
              if (!param3) {
                L77: {
                  stackOut_115_0 = (uo) var28;
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_116_0 = stackOut_115_0;
                  if ((var6 & param1.field_Yb) == 0) {
                    stackOut_117_0 = (uo) (Object) stackIn_117_0;
                    stackOut_117_1 = 0;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    break L77;
                  } else {
                    stackOut_116_0 = (uo) (Object) stackIn_116_0;
                    stackOut_116_1 = 1;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    break L77;
                  }
                }
                stackIn_118_0.field_Ib = stackIn_118_1 != 0;
                break L76;
              } else {
                if (0 == var6) {
                  L78: {
                    stackOut_111_0 = (uo) var28;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_112_0 = stackOut_111_0;
                    if (0 != mc.field_l) {
                      stackOut_113_0 = (uo) (Object) stackIn_113_0;
                      stackOut_113_1 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      break L78;
                    } else {
                      stackOut_112_0 = (uo) (Object) stackIn_112_0;
                      stackOut_112_1 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      break L78;
                    }
                  }
                  stackIn_114_0.field_Ib = stackIn_114_1 != 0;
                  break L76;
                } else {
                  L79: {
                    stackOut_107_0 = (uo) var28;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_108_0 = stackOut_107_0;
                    if (-1 == (mc.field_l & var6 ^ -1)) {
                      stackOut_109_0 = (uo) (Object) stackIn_109_0;
                      stackOut_109_1 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      break L79;
                    } else {
                      stackOut_108_0 = (uo) (Object) stackIn_108_0;
                      stackOut_108_1 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      break L79;
                    }
                  }
                  stackIn_110_0.field_Ib = stackIn_110_1 != 0;
                  break L76;
                }
              }
            }
            L80: {
              stackOut_119_0 = (uo) var28;
              stackIn_121_0 = stackOut_119_0;
              stackIn_120_0 = stackOut_119_0;
              if (var4 == 0) {
                stackOut_121_0 = (uo) (Object) stackIn_121_0;
                stackOut_121_1 = 0;
                stackIn_122_0 = stackOut_121_0;
                stackIn_122_1 = stackOut_121_1;
                break L80;
              } else {
                stackOut_120_0 = (uo) (Object) stackIn_120_0;
                stackOut_120_1 = 1;
                stackIn_122_0 = stackOut_120_0;
                stackIn_122_1 = stackOut_120_1;
                break L80;
              }
            }
            stackIn_122_0.field_pb = stackIn_122_1 != 0;
            var6++;
            continue L26;
          }
        }
    }

    final static qb a(di param0, int param1, String param2, String param3) {
        int var4 = param0.b(param3, -1);
        if (param1 != 3812) {
            field_H = null;
        }
        int var5 = param0.a(var4, 0, param2);
        return kh.a(var5, var4, (byte) -97, param0);
    }

    final dd a(String param0, int param1, int param2, int param3) {
        int[] var5 = null;
        Object var6 = null;
        int[] var7 = null;
        L0: {
          if (param2 == 0) {
            break L0;
          } else {
            var6 = null;
            dd discarded$2 = ((tl) this).a((String) null, 127, -77, -84);
            break L0;
          }
        }
        L1: {
          if (hk.b(96)) {
            break L1;
          } else {
            if (param3 < 2) {
              var7 = mc.field_e.field_U[param1];
              var5 = var7;
              return ag.a((byte) 89, var7[var7.length >> -1129062495], param0);
            } else {
              break L1;
            }
          }
        }
        return super.a(param0, param1, 0, param3);
    }

    final int a(boolean param0, int param1) {
        if (!(hk.b(-114))) {
            return (param1 ^ -1) > -3 ? param1 * 240 + 300 : 380;
        }
        if (param0) {
            field_H = null;
        }
        if (!(-1 != param1)) {
            return 340 + ((tl) this).d(0, param1);
        }
        if (!(-2 != param1)) {
            return 130 + ((tl) this).d(0, param1);
        }
        return ((tl) this).d(0, param1) + 140;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        if (param0 == -16470) {
          L0: {
            var4 = ((tl) this).field_h[param2];
            if (-24 != (var4 ^ -1)) {
              super.b(param0 + 0, param1, param2);
              break L0;
            } else {
              if (((tl) this).field_B.b((byte) 75)) {
                nk.a(pl.field_d, ((tl) this).field_E, (byte) 101);
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
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        L0: {
          var11 = new char[param0];
          var10 = var11;
          var9 = var10;
          var4 = var9;
          var5 = 0;
          if (param1 == -7510) {
            break L0;
          } else {
            int discarded$2 = tl.h(-13);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= param0) {
            return new String(var11, 0, var5);
          } else {
            var7 = param2[param3 + var6] & 255;
            if (var7 != 0) {
              L2: {
                if (var7 < 128) {
                  break L2;
                } else {
                  if ((var7 ^ -1) <= -161) {
                    break L2;
                  } else {
                    L3: {
                      var8 = rf.field_a[-128 + var7];
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var9[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final int d(int param0, int param1) {
        if (!(hk.b(-117))) {
            return 2 <= param1 ? 260 : param1 * 240 + 100;
        }
        if (param0 != 0) {
            field_I = null;
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
            ((tl) this).c(120);
        }
        if (!hk.b(-119)) {
            if (!(param1 >= 2)) {
                return ((tl) this).field_x;
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
            field_I = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new int[]{2, 20, 21, 49, 5, 12, 13};
        field_I = new int[16384];
        field_H = "<%0> is already on your friend list.";
        field_K = 236;
    }
}
