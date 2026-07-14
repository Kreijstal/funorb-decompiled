/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends oj {
    int field_z;
    static String field_y;
    int field_E;
    static float field_C;
    static int field_B;
    static boolean field_D;
    static int field_F;

    public static void g(int param0) {
        if (param0 >= -63) {
            q.g(6);
        }
        field_y = null;
    }

    final static void a(boolean param0, String param1) {
        fp.a(param1, (byte) -65);
        af.a(param0, lo.field_o, -1);
    }

    final String a(byte param0, boolean param1) {
        if (param1) {
            System.out.println("Teleport disappear event debug");
            System.out.println("Unit at " + ((q) this).field_z + "," + ((q) this).field_E);
        }
        String var3 = "EventTelepop: pos: (" + ((q) this).field_z + "," + ((q) this).field_E + ")";
        int var4 = -35 % ((param0 - 53) / 51);
        return var3;
    }

    q(int param0, int param1) {
        ((q) this).field_E = param1;
        ((q) this).field_z = param0;
        ((q) this).field_m = 6;
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 >= -84) {
            String discarded$0 = ((q) this).a((byte) -47, true);
        }
        return ((q) this).a((byte) -39, param2, param0, true);
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        if (param1 != -26661) {
            ((q) this).field_E = -18;
        }
        if (!((q) this).field_w.field_bb) {
            ((q) this).field_w.e(param1 + 26574);
        } else {
            var5 = param0.c(((q) this).field_E, true, ((q) this).field_z);
            var6 = var5;
            var6.field_bb = false;
            ((q) this).field_w.d(param1 ^ 26707);
        }
        fl.a(param0, -112);
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16) {
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
          var42 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param11 < 0) {
            break L0;
          } else {
            if (param15 < tm.field_q) {
              L1: {
                if (param14 >= 0) {
                  break L1;
                } else {
                  if (param12 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param9) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param14 < tm.field_l) {
                  break L2;
                } else {
                  if (tm.field_l > param12) {
                    break L2;
                  } else {
                    if (tm.field_l <= param9) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param13) {
                L3: {
                  L4: {
                    var34 = param11 - param15;
                    if (param10 != param15) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (param15 == param11) {
                            break L6;
                          } else {
                            L7: {
                              L8: {
                                var35 = param11 - param10;
                                if (param12 <= param14) {
                                  break L8;
                                } else {
                                  var31 = (-param4 + param3 << -617802416) / var34;
                                  var32 = (-param2 + param3 << -1127948144) / var35;
                                  var21 = param8 << 1144106096;
                                  var24 = (-param6 + param16 << 1035282480) / var35;
                                  var19 = (-param14 + param9 << 957933616) / var34;
                                  var22 = param6 << -1196755888;
                                  var17 = param14 << 1854144112;
                                  var26 = param7 << 642376464;
                                  var27 = (param5 + -param1 << -1833056720) / var34;
                                  var20 = (-param12 + param9 << 1619882896) / var35;
                                  var23 = (-param8 + param16 << 1238722800) / var34;
                                  var25 = param1 << 21088048;
                                  var29 = param4 << 1134098992;
                                  var30 = param2 << -428196208;
                                  var28 = (param5 + -param7 << 2089788592) / var35;
                                  var18 = param12 << 393474384;
                                  if (0 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var27 = (param5 - param7 << 928600656) / var35;
                              var20 = (-param14 + param9 << -2086561648) / var34;
                              var24 = (-param8 + param16 << 1422363696) / var34;
                              var17 = param12 << 1885533936;
                              var28 = (param5 + -param1 << -1828936016) / var34;
                              var21 = param6 << -1196857392;
                              var31 = (param3 + -param2 << 1933329552) / var35;
                              var25 = param7 << 1897925776;
                              var18 = param14 << -192153584;
                              var19 = (-param12 + param9 << -901278288) / var35;
                              var26 = param1 << -660559280;
                              var29 = param2 << 725168944;
                              var30 = param4 << -99465104;
                              var22 = param8 << -1597476592;
                              var32 = (-param4 + param3 << 1678158608) / var34;
                              var23 = (-param6 + param16 << 1817962416) / var35;
                              break L7;
                            }
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var20 = 0;
                        var28 = 0;
                        var25 = param1;
                        var19 = 0;
                        var23 = 0;
                        var31 = 0;
                        var29 = param4;
                        var32 = 0;
                        var22 = param6;
                        var26 = param7;
                        var18 = param12 << -1261663472;
                        var21 = param8;
                        var30 = param2;
                        var24 = 0;
                        var27 = 0;
                        var17 = param14 << 1842989072;
                        break L5;
                      }
                      L9: {
                        if (param15 >= 0) {
                          break L9;
                        } else {
                          param15 = Math.min(-param15, param10 + -param15);
                          var29 = var29 + var31 * param15;
                          var26 = var26 + var28 * param15;
                          var22 = var22 + var24 * param15;
                          var21 = var21 + param15 * var23;
                          var18 = var18 + var20 * param15;
                          var30 = var30 + var32 * param15;
                          var25 = var25 + param15 * var27;
                          var17 = var17 + param15 * var19;
                          param15 = 0;
                          break L9;
                        }
                      }
                      var33 = 0;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var18 = param14 << 761180208;
                      var17 = param14 << 761180208;
                      var30 = param4 << 961521040;
                      var29 = param4 << 961521040;
                      var26 = param1 << 2026602448;
                      var25 = param1 << 2026602448;
                      var22 = param8 << 1208716112;
                      var21 = param8 << 1208716112;
                      var35 = -param15 + param10;
                      var20 = (param9 + -param14 << 1961598832) / var34;
                      var19 = (-param14 + param12 << 1206483408) / var35;
                      if (var19 < var20) {
                        break L11;
                      } else {
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var23 = (param16 + -param8 << -1921526384) / var34;
                        var27 = (-param1 + param5 << 1930161328) / var34;
                        var32 = (param2 - param4 << -495995248) / var35;
                        var24 = (param6 + -param8 << 1394739568) / var35;
                        var33 = 1;
                        var31 = (-param4 + param3 << 1829520208) / var34;
                        var28 = (-param1 + param7 << -1899406896) / var35;
                        if (0 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var28 = (-param1 + param5 << -35646576) / var34;
                    var32 = (param3 - param4 << 791280400) / var34;
                    var33 = 0;
                    var23 = (param6 - param8 << 233011440) / var35;
                    var31 = (-param4 + param2 << 1821695088) / var35;
                    var27 = (-param1 + param7 << 525608656) / var35;
                    var24 = (-param8 + param16 << -819422800) / var34;
                    break L10;
                  }
                  L12: {
                    L13: {
                      if (param15 >= 0) {
                        var36 = tm.field_k[param15];
                        L14: while (true) {
                          if (param15 >= param10) {
                            break L12;
                          } else {
                            L15: {
                              var37 = var17 >> 1732492848;
                              if (var37 >= tm.field_l) {
                                break L15;
                              } else {
                                L16: {
                                  var38 = -(var17 >> 1427226992) + (var18 >> 2062146160);
                                  if (var38 == 0) {
                                    break L16;
                                  } else {
                                    L17: {
                                      var39 = (var22 - var21) / var38;
                                      var40 = (-var25 + var26) / var38;
                                      var41 = (-var29 + var30) / var38;
                                      if (tm.field_l <= var38 + var37) {
                                        var38 = tm.field_l - (var37 - -1);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      L19: {
                                        if (var37 >= 0) {
                                          break L19;
                                        } else {
                                          jn.a(var29 + -(var37 * var41), -(var37 * var39) + var21, var39, 33423424, var36, var37 + var38, var25 - var40 * var37, param0, var40, var41);
                                          if (0 == 0) {
                                            break L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      jn.a(var29, var21, var39, 33423424, var36 + var37, var38, var25, param0, var40, var41);
                                      break L18;
                                    }
                                    if (0 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (0 > var37) {
                                  break L15;
                                } else {
                                  if (tm.field_l > var37) {
                                    jn.a(var29, var21, 0, 33423424, var37 + var36, var38, var25, param0, 0, 0);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            param15++;
                            if (tm.field_q > param15) {
                              var18 = var18 + var20;
                              var26 = var26 + var28;
                              var22 = var22 + var24;
                              var30 = var30 + var32;
                              var17 = var17 + var19;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var36 = var36 + qn.field_l;
                              var29 = var29 + var31;
                              if (0 == 0) {
                                continue L14;
                              } else {
                                break L13;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        L20: {
                          if (param10 >= 0) {
                            break L20;
                          } else {
                            param15 = -param15 + param10;
                            var30 = var30 + var32 * param15;
                            var21 = var21 + var23 * param15;
                            var18 = var18 + param15 * var20;
                            var29 = var29 + param15 * var31;
                            var22 = var22 + var24 * param15;
                            var26 = var26 + param15 * var28;
                            var25 = var25 + param15 * var27;
                            var17 = var17 + var19 * param15;
                            param15 = param10;
                            if (0 == 0) {
                              break L12;
                            } else {
                              break L20;
                            }
                          }
                        }
                        param15 = -param15;
                        var18 = var18 + param15 * var20;
                        var17 = var17 + param15 * var19;
                        var29 = var29 + var31 * param15;
                        var25 = var25 + var27 * param15;
                        var30 = var30 + param15 * var32;
                        var21 = var21 + param15 * var23;
                        var22 = var22 + var24 * param15;
                        var26 = var26 + param15 * var28;
                        param15 = 0;
                        break L13;
                      }
                    }
                    var36 = tm.field_k[param15];
                    L21: while (true) {
                      if (param15 >= param10) {
                        break L12;
                      } else {
                        L22: {
                          var37 = var17 >> 1732492848;
                          if (var37 >= tm.field_l) {
                            break L22;
                          } else {
                            L23: {
                              var38 = -(var17 >> 1427226992) + (var18 >> 2062146160);
                              if (var38 == 0) {
                                break L23;
                              } else {
                                L24: {
                                  var39 = (var22 - var21) / var38;
                                  var40 = (-var25 + var26) / var38;
                                  var41 = (-var29 + var30) / var38;
                                  if (tm.field_l <= var38 + var37) {
                                    var38 = tm.field_l - (var37 - -1);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                L25: {
                                  L26: {
                                    if (var37 >= 0) {
                                      break L26;
                                    } else {
                                      jn.a(var29 + -(var37 * var41), -(var37 * var39) + var21, var39, 33423424, var36, var37 + var38, var25 - var40 * var37, param0, var40, var41);
                                      if (0 == 0) {
                                        break L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  jn.a(var29, var21, var39, 33423424, var36 + var37, var38, var25, param0, var40, var41);
                                  break L25;
                                }
                                if (0 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (0 > var37) {
                              break L22;
                            } else {
                              if (tm.field_l > var37) {
                                jn.a(var29, var21, 0, 33423424, var37 + var36, var38, var25, param0, 0, 0);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        param15++;
                        if (tm.field_q > param15) {
                          var18 = var18 + var20;
                          var26 = var26 + var28;
                          var22 = var22 + var24;
                          var30 = var30 + var32;
                          var17 = var17 + var19;
                          var25 = var25 + var27;
                          var21 = var21 + var23;
                          var36 = var36 + qn.field_l;
                          var29 = var29 + var31;
                          if (0 == 0) {
                            continue L21;
                          } else {
                            break L12;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L27: {
                    var36 = param11 - param10;
                    if (0 != var36) {
                      break L27;
                    } else {
                      var28 = 0;
                      var19 = 0;
                      var23 = 0;
                      var24 = 0;
                      var20 = 0;
                      var27 = 0;
                      var32 = 0;
                      var31 = 0;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    L29: {
                      var37 = param9 << -259574160;
                      var38 = param16 << 260703920;
                      var39 = param5 << 616500080;
                      var40 = param3 << -1874265872;
                      if (var33 == 0) {
                        break L29;
                      } else {
                        var22 = param6 << -86246960;
                        var18 = param12 << -519669072;
                        var30 = param2 << -28900016;
                        var26 = param7 << 974072624;
                        if (0 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    var21 = param6 << 1338735280;
                    var25 = param7 << 806131376;
                    var17 = param12 << -1429073968;
                    var29 = param2 << 105104400;
                    break L28;
                  }
                  var24 = (-var22 + var38) / var36;
                  var31 = (-var29 + var40) / var36;
                  var32 = (-var30 + var40) / var36;
                  var28 = (-var26 + var39) / var36;
                  var20 = (var37 - var18) / var36;
                  var27 = (var39 - var25) / var36;
                  var19 = (-var17 + var37) / var36;
                  var23 = (var38 - var21) / var36;
                  break L3;
                }
                L30: {
                  if (param15 < 0) {
                    param15 = -param15;
                    var18 = var18 + var20 * param15;
                    var17 = var17 + param15 * var19;
                    var30 = var30 + param15 * var32;
                    var29 = var29 + param15 * var31;
                    var25 = var25 + param15 * var27;
                    var26 = var26 + param15 * var28;
                    var22 = var22 + var24 * param15;
                    var21 = var21 + var23 * param15;
                    param15 = 0;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                var35 = tm.field_k[param15];
                if (param15 < param11) {
                  L31: {
                    var36 = var17 >> 698250640;
                    if (var36 < tm.field_l) {
                      L32: {
                        var37 = -(var17 >> 58193264) + (var18 >> 154602224);
                        if (var37 != 0) {
                          break L32;
                        } else {
                          if (var36 < 0) {
                            break L31;
                          } else {
                            if (var36 >= tm.field_l) {
                              break L31;
                            } else {
                              jn.a(var29, var21, 0, 33423424, var35 + var36, var37, var25, param0, 0, 0);
                              if (0 == 0) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                        }
                      }
                      L33: {
                        var38 = (var22 + -var21) / var37;
                        var39 = (-var25 + var26) / var37;
                        var40 = (var30 + -var29) / var37;
                        if (var37 + var36 >= tm.field_l) {
                          var37 = -var36 + (tm.field_l + -1);
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      L34: {
                        if (var36 >= 0) {
                          break L34;
                        } else {
                          jn.a(-(var36 * var40) + var29, -(var36 * var38) + var21, var38, 33423424, var35, var36 + var37, var25 + -(var36 * var39), param0, var39, var40);
                          if (0 == 0) {
                            break L31;
                          } else {
                            break L34;
                          }
                        }
                      }
                      jn.a(var29, var21, var38, 33423424, var35 + var36, var37, var25, param0, var39, var40);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  param15++;
                  if (param15 >= tm.field_q) {
                    return;
                  } else {
                    var35 = var35 + qn.field_l;
                    var29 = var29 + var31;
                    var26 = var26 + var28;
                    var21 = var21 + var23;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var17 = var17 + var19;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> has withdrawn a draw offer";
        field_D = false;
    }
}
