/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dk extends td {
    static String field_q;
    static String field_p;

    final ii a(op param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        av var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wia var11 = null;
        aga var12 = null;
        int var13 = 0;
        int var14 = 0;
        iv var15 = null;
        int var16 = 0;
        aga var17 = null;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        L0: {
          var16 = BachelorFridge.field_y;
          var17 = ((dk) this).field_h.a(18, param0);
          var4 = ((dk) this).field_k;
          var5 = ((dk) this).field_n;
          var4 = -2 + ((dk) this).field_k + kla.a(5, param0.field_w, -2147483648);
          if (var4 >= 0) {
            break L0;
          } else {
            var4 = 0;
            break L0;
          }
        }
        L1: {
          var5 = -2 + ((dk) this).field_n - -kla.a(5, param0.field_w, param1 + 2147483645);
          if (param0.field_z > var4) {
            break L1;
          } else {
            var4 = param0.field_z - 1;
            break L1;
          }
        }
        L2: {
          if (-1 < (var5 ^ -1)) {
            var5 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0.field_B > var5) {
            break L3;
          } else {
            var5 = -1 + param0.field_B;
            break L3;
          }
        }
        var6 = new av(((dk) this).field_g, new nq(var17), ((dk) this).field_k, ((dk) this).field_n, var4, var5);
        if (param1 == 3) {
          var7 = -3;
          L4: while (true) {
            if (var7 > 3) {
              return (ii) (Object) var6;
            } else {
              var8 = -3;
              L5: while (true) {
                if (var8 > 3) {
                  var7++;
                  continue L4;
                } else {
                  var9 = var7 + var4;
                  var10 = var8 + var5;
                  if (0 <= var9) {
                    if (param0.field_z > var9) {
                      if ((var10 ^ -1) <= -1) {
                        if (var10 < param0.field_B) {
                          var11 = param0.field_a[var9][var10];
                          var12 = var11.field_l;
                          if (var12 != null) {
                            L6: {
                              if (0 <= var7) {
                                stackOut_27_0 = var7;
                                stackIn_28_0 = stackOut_27_0;
                                break L6;
                              } else {
                                stackOut_26_0 = -var7;
                                stackIn_28_0 = stackOut_26_0;
                                break L6;
                              }
                            }
                            L7: {
                              stackOut_28_0 = stackIn_28_0;
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_29_0 = stackOut_28_0;
                              if ((var8 ^ -1) > -1) {
                                stackOut_30_0 = stackIn_30_0;
                                stackOut_30_1 = -var8;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                break L7;
                              } else {
                                stackOut_29_0 = stackIn_29_0;
                                stackOut_29_1 = var8;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                break L7;
                              }
                            }
                            var13 = stackIn_31_0 + stackIn_31_1;
                            if (var13 < ov.field_e.length) {
                              var14 = ov.field_e[var13];
                              var15 = new iv(new nq(var12), false, 1, var14, 0);
                              var6.field_o.a((bw) (Object) var15, true);
                              var8++;
                              continue L5;
                            } else {
                              var8++;
                              continue L5;
                            }
                          } else {
                            var8++;
                            continue L5;
                          }
                        } else {
                          var8++;
                          continue L5;
                        }
                      } else {
                        var8++;
                        continue L5;
                      }
                    } else {
                      var8++;
                      continue L5;
                    }
                  } else {
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    dk(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((dk) this).field_k = param2;
        ((dk) this).field_n = param3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, byte param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        int var42 = 0;
        L0: {
          var42 = BachelorFridge.field_y;
          if (param4 < 0) {
            break L0;
          } else {
            if (param3 < jb.field_n) {
              L1: {
                if (param13 >= 0) {
                  break L1;
                } else {
                  if (param14 >= 0) {
                    break L1;
                  } else {
                    if (param6 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (jb.field_o > param13) {
                  break L2;
                } else {
                  if (param14 < jb.field_o) {
                    break L2;
                  } else {
                    if (jb.field_o <= param6) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param8 == -68) {
                  break L3;
                } else {
                  dk.a(28, -88, 0, -108, 107, -93, 5, (int[]) null, (byte) 90, -118, -41, -89, 64, -56, 104, 76, -106);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = param4 - param3;
                  if (param3 == param9) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var30 = param15 << 175188048;
                        var29 = param15 << 175188048;
                        var26 = param10 << -30431600;
                        var25 = param10 << -30431600;
                        var22 = param11 << 1138763568;
                        var21 = param11 << 1138763568;
                        var18 = param13 << -1492109872;
                        var17 = param13 << -1492109872;
                        var35 = -param3 + param9;
                        var19 = (param14 + -param13 << -1004093520) / var35;
                        var20 = (-param13 + param6 << -1778715280) / var34;
                        if (var19 < var20) {
                          break L7;
                        } else {
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var28 = (-param10 + param16 << 691299568) / var35;
                          var33 = 1;
                          var31 = (param12 - param15 << -39562928) / var34;
                          var27 = (param1 - param10 << 1799981264) / var34;
                          var32 = (param2 - param15 << 259532080) / var35;
                          var23 = (param5 + -param11 << -571529584) / var34;
                          var24 = (-param11 + param0 << -1059650352) / var35;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var32 = (param12 + -param15 << 912738032) / var34;
                      var33 = 0;
                      var27 = (-param10 + param16 << -1314700240) / var35;
                      var31 = (-param15 + param2 << -1973387280) / var35;
                      var24 = (param5 - param11 << 1560496272) / var34;
                      var28 = (param1 - param10 << -884792528) / var34;
                      var23 = (param0 + -param11 << -288182544) / var35;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param3 < 0) {
                          L10: {
                            if (param9 >= 0) {
                              break L10;
                            } else {
                              param3 = -param3 + param9;
                              var17 = var17 + param3 * var19;
                              var25 = var25 + param3 * var27;
                              var18 = var18 + param3 * var20;
                              var26 = var26 + var28 * param3;
                              var29 = var29 + param3 * var31;
                              var30 = var30 + var32 * param3;
                              var22 = var22 + param3 * var24;
                              var21 = var21 + var23 * param3;
                              param3 = param9;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param3 = -param3;
                          var25 = var25 + param3 * var27;
                          var26 = var26 + var28 * param3;
                          var17 = var17 + param3 * var19;
                          var18 = var18 + var20 * param3;
                          var30 = var30 + param3 * var32;
                          var22 = var22 + param3 * var24;
                          var29 = var29 + param3 * var31;
                          var21 = var21 + param3 * var23;
                          param3 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var36 = jb.field_a[param3];
                      L11: while (true) {
                        if (param3 >= param9) {
                          break L8;
                        } else {
                          L12: {
                            var37 = var17 >> -1279160368;
                            if (var37 < jb.field_o) {
                              L13: {
                                var38 = -(var17 >> 2124415600) + (var18 >> 56682320);
                                if (var38 != 0) {
                                  break L13;
                                } else {
                                  if (var37 < 0) {
                                    break L12;
                                  } else {
                                    if (jb.field_o <= var37) {
                                      break L12;
                                    } else {
                                      oj.a(var21, 0, 91, var36 + var37, param7, var29, var25, var38, 0, 0);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              L14: {
                                var39 = (var22 - var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var38 + var37 < jb.field_o) {
                                  break L14;
                                } else {
                                  var38 = -1 + (-var37 + jb.field_o);
                                  break L14;
                                }
                              }
                              L15: {
                                if (var37 < 0) {
                                  break L15;
                                } else {
                                  oj.a(var21, var39, 120, var36 + var37, param7, var29, var25, var38, var40, var41);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              oj.a(-(var39 * var37) + var21, var39, 92, var36, param7, var29 + -(var41 * var37), -(var40 * var37) + var25, var38 + var37, var40, var41);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          param3++;
                          if (jb.field_n > param3) {
                            var26 = var26 + var28;
                            var30 = var30 + var32;
                            var17 = var17 + var19;
                            var18 = var18 + var20;
                            var21 = var21 + var23;
                            var29 = var29 + var31;
                            var25 = var25 + var27;
                            var36 = var36 + dg.field_i;
                            var22 = var22 + var24;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var36 = -param9 + param4;
                        if (var36 == 0) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              var37 = param6 << 708647824;
                              var38 = param5 << 1697277360;
                              var39 = param1 << -1666969776;
                              var40 = param12 << -1117510480;
                              if (var33 == 0) {
                                break L19;
                              } else {
                                var22 = param0 << -657593648;
                                var26 = param16 << 1718225200;
                                var30 = param2 << 2037472592;
                                var18 = param14 << 1111224656;
                                if (0 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var29 = param2 << 1143353104;
                            var25 = param16 << -1507081648;
                            var21 = param0 << -492401200;
                            var17 = param14 << -597899824;
                            break L18;
                          }
                          var28 = (var39 - var26) / var36;
                          var23 = (var38 - var21) / var36;
                          var19 = (-var17 + var37) / var36;
                          var20 = (var37 + -var18) / var36;
                          var32 = (-var30 + var40) / var36;
                          var27 = (var39 + -var25) / var36;
                          var24 = (-var22 + var38) / var36;
                          var31 = (var40 + -var29) / var36;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var19 = 0;
                      var24 = 0;
                      var31 = 0;
                      var20 = 0;
                      var23 = 0;
                      var28 = 0;
                      var32 = 0;
                      var27 = 0;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param3 != param4) {
                      break L21;
                    } else {
                      var27 = 0;
                      var32 = 0;
                      var31 = 0;
                      var30 = param2;
                      var20 = 0;
                      var28 = 0;
                      var23 = 0;
                      var17 = param13 << -1540693872;
                      var19 = 0;
                      var21 = param11;
                      var22 = param0;
                      var25 = param10;
                      var29 = param15;
                      var26 = param16;
                      var18 = param14 << -269395728;
                      var24 = 0;
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    var35 = param4 + -param9;
                    if (param14 > param13) {
                      break L22;
                    } else {
                      var22 = param11 << -2017230768;
                      var32 = (-param15 + param12 << -678169360) / var34;
                      var26 = param10 << -871054576;
                      var21 = param0 << -1436409584;
                      var30 = param15 << -2039285840;
                      var19 = (param6 + -param14 << -846474672) / var35;
                      var25 = param16 << 1309928912;
                      var20 = (param6 - param13 << 1748632208) / var34;
                      var24 = (param5 + -param11 << 1667292176) / var34;
                      var28 = (-param10 + param1 << -681757904) / var34;
                      var23 = (-param0 + param5 << -785667152) / var35;
                      var17 = param14 << 752585936;
                      var18 = param13 << -553035984;
                      var31 = (param12 - param2 << 234418672) / var35;
                      var29 = param2 << -250677744;
                      var27 = (param1 + -param16 << -641705424) / var35;
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var32 = (-param2 + param12 << -1374285360) / var35;
                  var31 = (param12 - param15 << 1872652688) / var34;
                  var22 = param0 << -9609296;
                  var27 = (-param10 + param1 << -298847568) / var34;
                  var21 = param11 << -1837281904;
                  var18 = param14 << -1627605872;
                  var26 = param16 << -1621209008;
                  var24 = (-param0 + param5 << 860151696) / var35;
                  var29 = param15 << 424246800;
                  var17 = param13 << 1865115088;
                  var23 = (-param11 + param5 << -303409712) / var34;
                  var28 = (param1 + -param16 << 1031638832) / var35;
                  var25 = param10 << 1217192304;
                  var30 = param2 << -1309745776;
                  var19 = (-param13 + param6 << 1879610768) / var34;
                  var20 = (-param14 + param6 << -915295504) / var35;
                  break L20;
                }
                var33 = 0;
                if (param3 >= 0) {
                  break L4;
                } else {
                  param3 = Math.min(-param3, -param3 + param9);
                  var25 = var25 + param3 * var27;
                  var17 = var17 + var19 * param3;
                  var29 = var29 + var31 * param3;
                  var22 = var22 + var24 * param3;
                  var18 = var18 + var20 * param3;
                  var26 = var26 + param3 * var28;
                  var21 = var21 + var23 * param3;
                  var30 = var30 + var32 * param3;
                  param3 = 0;
                  break L4;
                }
              }
              L23: {
                if (param3 < 0) {
                  param3 = -param3;
                  var25 = var25 + param3 * var27;
                  var29 = var29 + param3 * var31;
                  var21 = var21 + param3 * var23;
                  var18 = var18 + param3 * var20;
                  var22 = var22 + var24 * param3;
                  var17 = var17 + param3 * var19;
                  var26 = var26 + var28 * param3;
                  var30 = var30 + param3 * var32;
                  param3 = 0;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                var35 = jb.field_a[param3];
                if (param4 <= param3) {
                  break L24;
                } else {
                  L25: {
                    var36 = var17 >> 1602694832;
                    if (jb.field_o > var36) {
                      L26: {
                        var37 = (var18 >> 981637808) - (var17 >> 71520592);
                        if (var37 != 0) {
                          break L26;
                        } else {
                          if (var36 < 0) {
                            break L25;
                          } else {
                            if (var36 >= jb.field_o) {
                              break L25;
                            } else {
                              oj.a(var21, 0, 78, var36 + var35, param7, var29, var25, var37, 0, 0);
                              if (0 == 0) {
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      L27: {
                        var38 = (-var21 + var22) / var37;
                        var39 = (var26 + -var25) / var37;
                        var40 = (var30 + -var29) / var37;
                        if (jb.field_o <= var37 + var36) {
                          var37 = -var36 + jb.field_o - 1;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      L28: {
                        if (var36 < 0) {
                          break L28;
                        } else {
                          oj.a(var21, var38, 123, var36 + var35, param7, var29, var25, var37, var39, var40);
                          if (0 == 0) {
                            break L25;
                          } else {
                            break L28;
                          }
                        }
                      }
                      oj.a(-(var38 * var36) + var21, var38, 97, var35, param7, var29 + -(var40 * var36), -(var36 * var39) + var25, var37 + var36, var39, var40);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  param3++;
                  if (jb.field_n <= param3) {
                    return;
                  } else {
                    var17 = var17 + var19;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var21 = var21 + var23;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    var35 = var35 + dg.field_i;
                    break L24;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        L0: {
          var14 = BachelorFridge.field_y;
          if (param9 == 455530063) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        param1 = -param12;
        L1: while (true) {
          if (0 <= param1) {
            return;
          } else {
            param11 = -param2;
            L2: while (true) {
              if (-1 >= (param11 ^ -1)) {
                param7 = param7 + param4;
                param10 = param10 + param5;
                param1++;
                continue L1;
              } else {
                param10++;
                param6 = param8[param10];
                if ((param6 & -33554432) == 0) {
                  param7++;
                  param11++;
                  continue L2;
                } else {
                  L3: {
                    param0 = (255 & param6) + (param6 >> 455530063 & 510);
                    param6 = ((param6 & 65347) >> -1690707224) + param0 / 3 >> -930261087;
                    if (-1 != (param6 ^ -1)) {
                      break L3;
                    } else {
                      param6 = 1;
                      break L3;
                    }
                  }
                  param6 = (param6 << 1765404552) + (param6 << -281625392) + param6;
                  param7++;
                  param3[param7] = param6;
                  param11++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(Object[] param0, byte param1, int[] param2) {
        if (param1 <= 85) {
            field_q = null;
        }
        ea.a(-1 + param2.length, 0, (byte) 27, param2, param0);
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 != -19353) {
            Object var2 = null;
            dk.a(-88, 87, 19, (int[]) null, -13, 60, -25, 60, (int[]) null, -102, 66, -4, 77);
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Cancel rematch";
    }
}
