/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kj {
    int field_c;
    int field_a;
    int field_e;
    static df field_d;
    static t field_b;
    static String field_f;

    final static void a(int param0) {
        df var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        if (param0 != 8) {
          return;
        } else {
          var1 = wa.field_d;
          L0: while (true) {
            if (!jd.g((byte) -126)) {
              return;
            } else {
              var1.f(73, 8);
              int fieldTemp$2 = var1.field_n + 1;
              var1.field_n = var1.field_n + 1;
              var2 = fieldTemp$2;
              hk.a(var1, -2933);
              wa.field_d.c((byte) 48, -var2 + var1.field_n);
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = Torquing.field_u;
          if (param16 < 0) {
            break L0;
          } else {
            if (param15 >= be.field_f) {
              break L0;
            } else {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (param4 >= 0) {
                    break L1;
                  } else {
                    if (param9 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (be.field_p > param2) {
                  break L2;
                } else {
                  if (param4 < be.field_p) {
                    break L2;
                  } else {
                    if (be.field_p > param9) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param7 == 388870384) {
                L3: {
                  L4: {
                    var34 = -param15 + param16;
                    if (param15 == param11) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var30 = param14 << 388870384;
                          var29 = param14 << 388870384;
                          var26 = param1 << 1703099120;
                          var25 = param1 << 1703099120;
                          var18 = param2 << -1976908784;
                          var17 = param2 << -1976908784;
                          var22 = param12 << -1489636304;
                          var21 = param12 << -1489636304;
                          var35 = param11 - param15;
                          var20 = (-param2 + param9 << 2139498160) / var34;
                          var19 = (-param2 + param4 << 945189456) / var35;
                          if (var20 <= var19) {
                            break L6;
                          } else {
                            var23 = (param8 - param12 << -1011491984) / var35;
                            var27 = (param3 + -param1 << 790763792) / var35;
                            var32 = (-param14 + param10 << 314251088) / var34;
                            var28 = (param13 + -param1 << -363881904) / var34;
                            var24 = (-param12 + param6 << -1693834768) / var34;
                            var33 = 0;
                            var31 = (param0 + -param14 << 283653232) / var35;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var23 = (param6 - param12 << -1165946960) / var34;
                        var28 = (-param1 + param3 << -1514226960) / var35;
                        var32 = (param0 - param14 << -2041605968) / var35;
                        var33 = 1;
                        var24 = (param8 + -param12 << -1494139536) / var35;
                        var31 = (-param14 + param10 << 1212396752) / var34;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var27 = (param13 - param1 << -1438639632) / var34;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param15 < 0) {
                            L9: {
                              if (param11 < 0) {
                                break L9;
                              } else {
                                param15 = -param15;
                                var18 = var18 + param15 * var20;
                                var30 = var30 + param15 * var32;
                                var22 = var22 + param15 * var24;
                                var25 = var25 + param15 * var27;
                                var17 = var17 + param15 * var19;
                                var26 = var26 + param15 * var28;
                                var21 = var21 + var23 * param15;
                                var29 = var29 + var31 * param15;
                                param15 = 0;
                                if (0 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            param15 = param11 + -param15;
                            var26 = var26 + var28 * param15;
                            var17 = var17 + param15 * var19;
                            var29 = var29 + var31 * param15;
                            var21 = var21 + param15 * var23;
                            var30 = var30 + param15 * var32;
                            var22 = var22 + param15 * var24;
                            var25 = var25 + var27 * param15;
                            var18 = var18 + var20 * param15;
                            param15 = param11;
                            if (0 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var36 = be.field_n[param15];
                        L10: while (true) {
                          if (param11 <= param15) {
                            break L7;
                          } else {
                            L11: {
                              var37 = var17 >> 1226328784;
                              if (be.field_p <= var37) {
                                break L11;
                              } else {
                                L12: {
                                  var38 = (var18 >> -110285936) - (var17 >> -1130554480);
                                  if (var38 == 0) {
                                    break L12;
                                  } else {
                                    L13: {
                                      var39 = (-var21 + var22) / var38;
                                      var40 = (-var25 + var26) / var38;
                                      var41 = (var30 + -var29) / var38;
                                      if (var38 + var37 >= be.field_p) {
                                        var38 = be.field_p + -var37 - 1;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (var37 < 0) {
                                          break L15;
                                        } else {
                                          fh.a(-1709787119, var21, var38, var29, var25, var40, var41, var36 + var37, var39, param5);
                                          if (0 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      fh.a(-1709787119, var21 - var39 * var37, var37 + var38, -(var41 * var37) + var29, var25 - var37 * var40, var40, var41, var36, var39, param5);
                                      break L14;
                                    }
                                    if (0 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (var37 < 0) {
                                  break L11;
                                } else {
                                  if (be.field_p > var37) {
                                    fh.a(-1709787119, var21, var38, var29, var25, 0, 0, var37 + var36, 0, param5);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            param15++;
                            if (be.field_f <= param15) {
                              return;
                            } else {
                              var29 = var29 + var31;
                              var22 = var22 + var24;
                              var36 = var36 + ph.field_j;
                              var18 = var18 + var20;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              var17 = var17 + var19;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
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
                          var36 = param16 + -param11;
                          if (var36 != 0) {
                            break L17;
                          } else {
                            var28 = 0;
                            var27 = 0;
                            var31 = 0;
                            var32 = 0;
                            var24 = 0;
                            var19 = 0;
                            var23 = 0;
                            var20 = 0;
                            if (0 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          L19: {
                            var37 = param9 << 1692027376;
                            var38 = param6 << 806621712;
                            var39 = param13 << 543866384;
                            if (var33 == 0) {
                              break L19;
                            } else {
                              var30 = param0 << -2096818128;
                              var18 = param4 << 235257328;
                              var22 = param8 << -1998876624;
                              var26 = param3 << -1499634800;
                              if (0 == 0) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var21 = param8 << -698755792;
                          var29 = param0 << 306489616;
                          var17 = param4 << -1428157776;
                          var25 = param3 << 1614198896;
                          break L18;
                        }
                        var40 = param10 << 1020366000;
                        var31 = (var40 - var29) / var36;
                        var24 = (-var22 + var38) / var36;
                        var27 = (var39 - var25) / var36;
                        var32 = (-var30 + var40) / var36;
                        var19 = (var37 + -var17) / var36;
                        var20 = (var37 + -var18) / var36;
                        var28 = (-var26 + var39) / var36;
                        var23 = (var38 + -var21) / var36;
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
                      if (param15 == param16) {
                        break L21;
                      } else {
                        L22: {
                          L23: {
                            var35 = param16 + -param11;
                            if (param2 < param4) {
                              break L23;
                            } else {
                              var19 = (param9 - param4 << -1334556336) / var35;
                              var28 = (-param1 + param13 << 2610832) / var34;
                              var31 = (-param0 + param10 << -1553722896) / var35;
                              var26 = param1 << 1904361328;
                              var20 = (param9 + -param2 << -1245019088) / var34;
                              var30 = param14 << 1533490320;
                              var17 = param4 << 480364080;
                              var21 = param8 << 673574000;
                              var18 = param2 << 2023052752;
                              var29 = param0 << -890133328;
                              var24 = (-param12 + param6 << 1423262576) / var34;
                              var32 = (-param14 + param10 << -44855408) / var34;
                              var25 = param3 << 2137090224;
                              var27 = (param13 - param3 << -1044354448) / var35;
                              var23 = (-param8 + param6 << -255788016) / var35;
                              var22 = param12 << 656843888;
                              if (0 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var29 = param14 << 1751179280;
                          var22 = param8 << -1115548304;
                          var31 = (-param14 + param10 << -1535534480) / var34;
                          var20 = (-param4 + param9 << 1768582480) / var35;
                          var28 = (-param3 + param13 << -9890576) / var35;
                          var32 = (param10 + -param0 << -155704432) / var35;
                          var27 = (-param1 + param13 << 2126085168) / var34;
                          var24 = (param6 - param8 << -1701705680) / var35;
                          var19 = (-param2 + param9 << 1330565328) / var34;
                          var26 = param3 << 1899393776;
                          var30 = param0 << 125515632;
                          var17 = param2 << -1559546064;
                          var18 = param4 << 675979728;
                          var25 = param1 << 2120094640;
                          var21 = param12 << 1739892592;
                          var23 = (-param12 + param6 << 801210576) / var34;
                          break L22;
                        }
                        if (0 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var18 = param4 << -199542480;
                    var31 = 0;
                    var26 = param3;
                    var24 = 0;
                    var22 = param8;
                    var32 = 0;
                    var30 = param0;
                    var17 = param2 << 739197296;
                    var27 = 0;
                    var20 = 0;
                    var25 = param1;
                    var23 = 0;
                    var19 = 0;
                    var21 = param12;
                    var28 = 0;
                    var29 = param14;
                    break L20;
                  }
                  L24: {
                    if (param15 >= 0) {
                      break L24;
                    } else {
                      param15 = Math.min(-param15, param11 + -param15);
                      var21 = var21 + param15 * var23;
                      var26 = var26 + var28 * param15;
                      var30 = var30 + var32 * param15;
                      var18 = var18 + param15 * var20;
                      var25 = var25 + var27 * param15;
                      var29 = var29 + param15 * var31;
                      var22 = var22 + var24 * param15;
                      var17 = var17 + var19 * param15;
                      param15 = 0;
                      break L24;
                    }
                  }
                  var33 = 0;
                  break L3;
                }
                L25: {
                  if (param15 >= 0) {
                    break L25;
                  } else {
                    param15 = -param15;
                    var17 = var17 + var19 * param15;
                    var18 = var18 + var20 * param15;
                    var29 = var29 + var31 * param15;
                    var21 = var21 + param15 * var23;
                    var26 = var26 + var28 * param15;
                    var22 = var22 + var24 * param15;
                    var30 = var30 + param15 * var32;
                    var25 = var25 + param15 * var27;
                    param15 = 0;
                    break L25;
                  }
                }
                var35 = be.field_n[param15];
                if (param16 > param15) {
                  L26: {
                    var36 = var17 >> -1995230992;
                    if (var36 < be.field_p) {
                      var37 = -(var17 >> -1365673520) + (var18 >> 911130832);
                      if (0 == var37) {
                        if (var36 < 0) {
                          break L26;
                        } else {
                          if (be.field_p <= var36) {
                            break L26;
                          } else {
                            fh.a(param7 + -2098657503, var21, var37, var29, var25, 0, 0, var36 + var35, 0, param5);
                            break L26;
                          }
                        }
                      } else {
                        if (var36 < 0) {
                          break L26;
                        } else {
                          if (be.field_p <= var36) {
                            break L26;
                          } else {
                            fh.a(param7 + -2098657503, var21, var37, var29, var25, 0, 0, var36 + var35, 0, param5);
                            break L26;
                          }
                        }
                      }
                    } else {
                      break L26;
                    }
                  }
                  param15++;
                  if (param15 >= be.field_f) {
                    return;
                  } else {
                    var25 = var25 + var27;
                    var18 = var18 + var20;
                    var35 = var35 + ph.field_j;
                    var22 = var22 + var24;
                    var21 = var21 + var23;
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    var26 = var26 + var28;
                    var17 = var17 + var19;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    abstract void a(byte param0, int param1, int param2);

    public static void a(byte param0) {
        field_b = null;
        int var1 = 55 / ((36 - param0) / 55);
        field_d = null;
        field_f = null;
    }

    abstract void a(int param0, int param1, byte param2);

    abstract void a(int param0, int param1, int param2);

    kj(int param0, int param1, int param2) {
        ((kj) this).field_c = param1;
        ((kj) this).field_a = param0;
        ((kj) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Quit to website";
    }
}
