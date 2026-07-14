/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static fh field_b;
    static boolean field_a;

    final static void a(int param0, bd[] param1, int param2, int param3, int param4) {
        int var10 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != null) {
            // if_icmpge L17
        } else {
            return;
        }
        if (param0 <= 91) {
            field_a = true;
        }
        int var5 = param1[0].field_u;
        int var6 = param1[2].field_u;
        int var7 = param1[1].field_u;
        param1[0].e(param4, param3);
        param1[2].e(param2 + param4 - var6, param3);
        si.b(ia.field_i);
        si.f(param4 + var5, param3, param4 - (-param2 + var6), param1[1].field_r + param3);
        int var8 = param4 - -var5;
        int var9 = param4 + param2 + -var6;
        param4 = var8;
        while (param4 < var9) {
            param1[1].e(param4, param3);
            param4 = param4 + var7;
        }
        si.a(ia.field_i);
    }

    final static void b(int param0) {
        cl var1 = (cl) (Object) ne.field_q.g(-64);
        if (param0 != -4309) {
            field_a = false;
        }
        if (!(var1 != null)) {
            le.c((byte) 113);
            return;
        }
        en var2 = sc.field_g;
        int discarded$0 = var2.d(8195);
        int discarded$1 = var2.d(8195);
        int discarded$2 = var2.d(8195);
        int discarded$3 = var2.d(8195);
        var1.b(-96);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = HostileSpawn.field_I ? 1 : 0;
          if (param16 < 0) {
            break L0;
          } else {
            if (param8 < ge.field_f) {
              L1: {
                if (0 <= param15) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (0 > param5) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param15 < ge.field_h) {
                  break L2;
                } else {
                  if (param6 < ge.field_h) {
                    break L2;
                  } else {
                    if (ge.field_h > param5) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param10 == 1299210768) {
                L3: {
                  L4: {
                    var34 = param16 + -param8;
                    if (param4 == param8) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var18 = param15 << 1026883312;
                          var17 = param15 << 1026883312;
                          var22 = param3 << 812759440;
                          var21 = param3 << 812759440;
                          var30 = param1 << 1313304304;
                          var29 = param1 << 1313304304;
                          var26 = param2 << -1419175280;
                          var25 = param2 << -1419175280;
                          var35 = param4 + -param8;
                          var19 = (-param15 + param6 << -69050416) / var35;
                          var20 = (param5 - param15 << -133818416) / var34;
                          if (var20 <= var19) {
                            break L6;
                          } else {
                            var24 = (-param3 + param14 << -396841936) / var34;
                            var32 = (-param1 + param0 << 1340598160) / var34;
                            var28 = (-param2 + param13 << -576029456) / var34;
                            var27 = (-param2 + param12 << 991385904) / var35;
                            var31 = (-param1 + param7 << -608558736) / var35;
                            var23 = (param9 + -param3 << 424850384) / var35;
                            var33 = 0;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var27 = (-param2 + param13 << 1499577136) / var34;
                        var31 = (-param1 + param0 << -1021004240) / var34;
                        var32 = (-param1 + param7 << 1299210768) / var35;
                        var28 = (-param2 + param12 << 895058992) / var35;
                        var23 = (-param3 + param14 << 1659525872) / var34;
                        var33 = 1;
                        var24 = (-param3 + param9 << -1958424880) / var35;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param8 < 0) {
                            L9: {
                              if (0 > param4) {
                                break L9;
                              } else {
                                param8 = -param8;
                                var26 = var26 + param8 * var28;
                                var18 = var18 + param8 * var20;
                                var22 = var22 + param8 * var24;
                                var29 = var29 + param8 * var31;
                                var30 = var30 + param8 * var32;
                                var25 = var25 + param8 * var27;
                                var17 = var17 + param8 * var19;
                                var21 = var21 + param8 * var23;
                                param8 = 0;
                                if (0 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            param8 = param4 - param8;
                            var29 = var29 + param8 * var31;
                            var25 = var25 + var27 * param8;
                            var26 = var26 + param8 * var28;
                            var22 = var22 + var24 * param8;
                            var21 = var21 + param8 * var23;
                            var17 = var17 + var19 * param8;
                            var30 = var30 + var32 * param8;
                            var18 = var18 + param8 * var20;
                            param8 = param4;
                            if (0 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var36 = ge.field_e[param8];
                        L10: while (true) {
                          if (param8 >= param4) {
                            break L7;
                          } else {
                            L11: {
                              var37 = var17 >> 1675906896;
                              if (ge.field_h <= var37) {
                                break L11;
                              } else {
                                L12: {
                                  var38 = (var18 >> 1470394992) + -(var17 >> 2103717520);
                                  if (0 == var38) {
                                    break L12;
                                  } else {
                                    L13: {
                                      var39 = (var22 + -var21) / var38;
                                      var40 = (-var25 + var26) / var38;
                                      var41 = (-var29 + var30) / var38;
                                      if (var38 + var37 >= ge.field_h) {
                                        var38 = -1 + -var37 + ge.field_h;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (0 <= var37) {
                                          break L15;
                                        } else {
                                          sb.a(param11, var21 + -(var37 * var39), var36, var37 + var38, var25 + -(var40 * var37), var41, var39, var40, var29 + -(var37 * var41), (byte) 3);
                                          if (0 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      sb.a(param11, var21, var36 + var37, var38, var25, var41, var39, var40, var29, (byte) 3);
                                      break L14;
                                    }
                                    if (0 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (0 > var37) {
                                  break L11;
                                } else {
                                  if (var37 < ge.field_h) {
                                    sb.a(param11, var21, var36 + var37, var38, var25, 0, 0, 0, var29, (byte) 3);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            param8++;
                            if (param8 >= ge.field_f) {
                              return;
                            } else {
                              var18 = var18 + var20;
                              var36 = var36 + si.field_e;
                              var25 = var25 + var27;
                              var29 = var29 + var31;
                              var17 = var17 + var19;
                              var21 = var21 + var23;
                              var22 = var22 + var24;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              if (0 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        L17: {
                          var36 = param16 - param4;
                          if (0 == var36) {
                            break L17;
                          } else {
                            L18: {
                              L19: {
                                var37 = param5 << 1250318512;
                                var38 = param14 << -1523344400;
                                var39 = param13 << -671704080;
                                var40 = param0 << 609669200;
                                if (var33 != 0) {
                                  break L19;
                                } else {
                                  var29 = param7 << 389447344;
                                  var17 = param6 << 799091632;
                                  var25 = param12 << 1340336976;
                                  var21 = param9 << 839009456;
                                  if (0 == 0) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              var18 = param6 << -135302544;
                              var26 = param12 << 578014224;
                              var22 = param9 << 1091946384;
                              var30 = param7 << 111797584;
                              break L18;
                            }
                            var24 = (-var22 + var38) / var36;
                            var20 = (var37 - var18) / var36;
                            var28 = (-var26 + var39) / var36;
                            var27 = (-var25 + var39) / var36;
                            var31 = (var40 + -var29) / var36;
                            var23 = (-var21 + var38) / var36;
                            var32 = (var40 + -var30) / var36;
                            var19 = (-var17 + var37) / var36;
                            if (0 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        var28 = 0;
                        var19 = 0;
                        var20 = 0;
                        var24 = 0;
                        var32 = 0;
                        var31 = 0;
                        var23 = 0;
                        var27 = 0;
                        break L16;
                      }
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L20: {
                    L21: {
                      if (param8 == param16) {
                        break L21;
                      } else {
                        L22: {
                          L23: {
                            var35 = param16 - param4;
                            if (param15 < param6) {
                              break L23;
                            } else {
                              var25 = param12 << 1072412304;
                              var21 = param9 << 2065920240;
                              var32 = (-param1 + param0 << -765560080) / var34;
                              var29 = param7 << 1701381136;
                              var19 = (-param6 + param5 << -1097618576) / var35;
                              var31 = (-param7 + param0 << 1721078032) / var35;
                              var28 = (param13 + -param2 << 22178608) / var34;
                              var18 = param15 << -450275088;
                              var17 = param6 << -701537680;
                              var26 = param2 << -1951596848;
                              var22 = param3 << -1446904560;
                              var24 = (param14 + -param3 << -1551928336) / var34;
                              var20 = (param5 + -param15 << 2028075568) / var34;
                              var27 = (param13 + -param12 << -25611920) / var35;
                              var23 = (-param9 + param14 << 1866721072) / var35;
                              var30 = param1 << -237071568;
                              if (0 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var18 = param6 << 601185040;
                          var30 = param7 << -723548368;
                          var32 = (param0 - param7 << -669397456) / var35;
                          var26 = param12 << -1050686096;
                          var24 = (-param9 + param14 << 1823287664) / var35;
                          var25 = param2 << 330920688;
                          var31 = (param0 + -param1 << -1463764752) / var34;
                          var22 = param9 << -1826779536;
                          var20 = (-param6 + param5 << 912593712) / var35;
                          var23 = (param14 - param3 << 1408694544) / var34;
                          var29 = param1 << -1685177360;
                          var17 = param15 << 1443071920;
                          var28 = (-param12 + param13 << 1304895152) / var35;
                          var27 = (-param2 + param13 << -879410832) / var34;
                          var19 = (param5 + -param15 << -283942512) / var34;
                          var21 = param3 << -255642864;
                          break L22;
                        }
                        if (0 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var23 = 0;
                    var24 = 0;
                    var31 = 0;
                    var26 = param12;
                    var30 = param7;
                    var19 = 0;
                    var28 = 0;
                    var22 = param9;
                    var20 = 0;
                    var18 = param6 << 1301265968;
                    var21 = param3;
                    var32 = 0;
                    var17 = param15 << -174333648;
                    var29 = param1;
                    var25 = param2;
                    var27 = 0;
                    break L20;
                  }
                  var33 = 0;
                  if (param8 >= 0) {
                    break L3;
                  } else {
                    param8 = Math.min(-param8, -param8 + param4);
                    var18 = var18 + var20 * param8;
                    var26 = var26 + param8 * var28;
                    var29 = var29 + param8 * var31;
                    var22 = var22 + var24 * param8;
                    var21 = var21 + param8 * var23;
                    var30 = var30 + param8 * var32;
                    var25 = var25 + var27 * param8;
                    var17 = var17 + var19 * param8;
                    param8 = 0;
                    break L3;
                  }
                }
                L24: {
                  if (0 > param8) {
                    param8 = -param8;
                    var30 = var30 + param8 * var32;
                    var21 = var21 + var23 * param8;
                    var26 = var26 + var28 * param8;
                    var25 = var25 + param8 * var27;
                    var29 = var29 + param8 * var31;
                    var18 = var18 + param8 * var20;
                    var22 = var22 + param8 * var24;
                    var17 = var17 + var19 * param8;
                    param8 = 0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                var35 = ge.field_e[param8];
                if (param8 < param16) {
                  L25: {
                    var36 = var17 >> -1749641456;
                    if (var36 >= ge.field_h) {
                      break L25;
                    } else {
                      L26: {
                        var37 = -(var17 >> 1266920176) + (var18 >> -1713211312);
                        if (var37 != 0) {
                          break L26;
                        } else {
                          if (var36 < 0) {
                            break L25;
                          } else {
                            if (ge.field_h <= var36) {
                              break L25;
                            } else {
                              sb.a(param11, var21, var35 + var36, var37, var25, 0, 0, 0, var29, (byte) 3);
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
                        var38 = (var22 + -var21) / var37;
                        var39 = (var26 - var25) / var37;
                        var40 = (-var29 + var30) / var37;
                        if (ge.field_h > var36 + var37) {
                          break L27;
                        } else {
                          var37 = ge.field_h - (var36 - -1);
                          break L27;
                        }
                      }
                      L28: {
                        if (var36 < 0) {
                          break L28;
                        } else {
                          sb.a(param11, var21, var35 + var36, var37, var25, var40, var38, var39, var29, (byte) 3);
                          if (0 == 0) {
                            break L25;
                          } else {
                            break L28;
                          }
                        }
                      }
                      sb.a(param11, var21 - var36 * var38, var35, var36 + var37, var25 - var39 * var36, var40, var38, var39, var29 + -(var36 * var40), (byte) 3);
                      break L25;
                    }
                  }
                  param8++;
                  if (ge.field_f <= param8) {
                    return;
                  } else {
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var29 = var29 + var31;
                    var18 = var18 + var20;
                    var17 = var17 + var19;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    var26 = var26 + var28;
                    var35 = var35 + si.field_e;
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

    public static void a(int param0) {
        field_b = null;
        int var1 = -104 % ((36 - param0) / 62);
    }

    final static void a(byte param0) {
        if (param0 != 75) {
          return;
        } else {
          L0: {
            tb.f((byte) -85);
            if (null == se.field_h) {
              break L0;
            } else {
              v.a(67, se.field_h);
              break L0;
            }
          }
          L1: {
            qc.c((byte) -118);
            lj.d((byte) 114);
            md.b(51);
            if (!bj.c((byte) -29)) {
              break L1;
            } else {
              s.field_b.i(19319, 1);
              mb.d(0, -22370);
              break L1;
            }
          }
          le.c((byte) 99);
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        var2 = ln.field_a.field_d;
        if (param1 != 30427) {
          return;
        } else {
          var3 = param0 % var2;
          var4 = var3;
          var5 = param0 / var2;
          var6 = var5;
          ln.field_a.field_f[param0] = 3;
          var7 = 0;
          L0: while (true) {
            if (var7 != 0) {
              pc.a(2);
              return;
            } else {
              var7 = 1;
              var8 = var3;
              L1: while (true) {
                if (var4 < var8) {
                  continue L0;
                } else {
                  var9 = var5;
                  L2: while (true) {
                    if (var6 < var9) {
                      var8++;
                      continue L1;
                    } else {
                      if (ln.field_a.field_f[var9 * var2 + var8] == 3) {
                        L3: {
                          if (-1 + var2 <= var6) {
                            break L3;
                          } else {
                            var6++;
                            break L3;
                          }
                        }
                        L4: {
                          if (1 < var3) {
                            var3--;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (-2 <= (var5 ^ -1)) {
                            break L5;
                          } else {
                            var5--;
                            break L5;
                          }
                        }
                        L6: {
                          if (var4 < var2 + -1) {
                            var4++;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          ln.field_a.field_f[var8 + var9 * var2] = 2;
                          if ((ln.field_a.field_f[var8 - 1 - -(var9 * var2)] ^ -1) == -2) {
                            ln.field_a.field_f[var2 * var9 + var8 - 1] = 3;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (ln.field_a.field_f[var9 * var2 + var8 - -1] == 1) {
                            ln.field_a.field_f[1 + (var8 - -(var2 * var9))] = 3;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (ln.field_a.field_f[(-1 + var9) * var2 + var8] == 1) {
                            ln.field_a.field_f[var8 + (var9 + -1) * var2] = 3;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (1 != ln.field_a.field_f[(var9 + 1) * var2 + var8]) {
                            break L10;
                          } else {
                            ln.field_a.field_f[var2 * (var9 - -1) + var8] = 3;
                            break L10;
                          }
                        }
                        var7 = 0;
                        var9++;
                        continue L2;
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fh();
    }
}
