/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static int[] field_c;
    static String field_f;
    static int[] field_d;
    static cn field_b;
    static String field_a;
    static String[] field_e;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 == param0) {
          var3 = tg.field_f[3][param2];
          if ((var3 ^ -1) != -24) {
            return true;
          } else {
            L0: {
              if (ak.field_o[0] > gm.field_d.field_m) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = DungeonAssault.field_K;
          if (param3 < 0) {
            break L0;
          } else {
            if (re.field_i > param9) {
              L1: {
                if (param14 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
                    break L1;
                  } else {
                    if (param16 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param14 < re.field_b) {
                  break L2;
                } else {
                  if (re.field_b > param5) {
                    break L2;
                  } else {
                    if (re.field_b > param16) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param8 == -13) {
                  break L3;
                } else {
                  field_e = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = -param9 + param3;
                  if (param9 == param7) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var26 = param2 << 1569488592;
                        var25 = param2 << 1569488592;
                        var22 = param10 << 496564624;
                        var21 = param10 << 496564624;
                        var18 = param14 << -2114889776;
                        var17 = param14 << -2114889776;
                        var30 = param13 << 80200912;
                        var29 = param13 << 80200912;
                        var35 = -param9 + param7;
                        var19 = (-param14 + param5 << -1392084464) / var35;
                        var20 = (param16 + -param14 << -1415605584) / var34;
                        if (var20 > var19) {
                          break L7;
                        } else {
                          var31 = (param6 - param13 << -1700253456) / var34;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var33 = 1;
                          var28 = (-param2 + param12 << -1303753488) / var35;
                          var27 = (param1 + -param2 << 382499696) / var34;
                          var24 = (-param10 + param11 << -1670542256) / var35;
                          var32 = (-param13 + param4 << 1008863952) / var35;
                          var23 = (param15 + -param10 << -1008382224) / var34;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var27 = (param12 + -param2 << 506674256) / var35;
                      var33 = 0;
                      var32 = (param6 + -param13 << -758797104) / var34;
                      var24 = (param15 - param10 << -1798514608) / var34;
                      var28 = (-param2 + param1 << -1381469168) / var34;
                      var31 = (param4 - param13 << -2014537136) / var35;
                      var23 = (-param10 + param11 << 236562832) / var35;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (0 > param9) {
                          L10: {
                            if (0 <= param7) {
                              break L10;
                            } else {
                              param9 = -param9 + param7;
                              var18 = var18 + param9 * var20;
                              var29 = var29 + var31 * param9;
                              var25 = var25 + var27 * param9;
                              var30 = var30 + var32 * param9;
                              var21 = var21 + param9 * var23;
                              var17 = var17 + var19 * param9;
                              var22 = var22 + var24 * param9;
                              var26 = var26 + var28 * param9;
                              param9 = param7;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param9 = -param9;
                          var17 = var17 + param9 * var19;
                          var25 = var25 + param9 * var27;
                          var30 = var30 + var32 * param9;
                          var22 = var22 + param9 * var24;
                          var21 = var21 + var23 * param9;
                          var26 = var26 + param9 * var28;
                          var29 = var29 + param9 * var31;
                          var18 = var18 + param9 * var20;
                          param9 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var36 = re.field_e[param9];
                      L11: while (true) {
                        if (param7 <= param9) {
                          break L8;
                        } else {
                          L12: {
                            var37 = var17 >> -85975184;
                            if (var37 >= re.field_b) {
                              break L12;
                            } else {
                              L13: {
                                var38 = (var18 >> -1924408112) + -(var17 >> -890356784);
                                if (var38 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    var39 = (-var21 + var22) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (var38 + var37 < re.field_b) {
                                      break L14;
                                    } else {
                                      var38 = -1 + (re.field_b + -var37);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (var37 < 0) {
                                        break L16;
                                      } else {
                                        lo.a(var38, var36 + var37, var41, var25, 0, var21, param0, var39, var29, var40);
                                        if (0 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    lo.a(var37 + var38, var36, var41, var25 - var40 * var37, 0, var21 + -(var39 * var37), param0, var39, var29 - var37 * var41, var40);
                                    break L15;
                                  }
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var37 < 0) {
                                break L12;
                              } else {
                                if (re.field_b > var37) {
                                  lo.a(var38, var37 + var36, 0, var25, 0, var21, param0, 0, var29, 0);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          param9++;
                          if (param9 < re.field_i) {
                            var21 = var21 + var23;
                            var30 = var30 + var32;
                            var26 = var26 + var28;
                            var36 = var36 + gf.field_i;
                            var29 = var29 + var31;
                            var22 = var22 + var24;
                            var18 = var18 + var20;
                            var17 = var17 + var19;
                            var25 = var25 + var27;
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
                    L17: {
                      L18: {
                        var36 = -param7 + param3;
                        if (var36 != 0) {
                          break L18;
                        } else {
                          var27 = 0;
                          var19 = 0;
                          var23 = 0;
                          var20 = 0;
                          var31 = 0;
                          var28 = 0;
                          var24 = 0;
                          var32 = 0;
                          if (0 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        L20: {
                          var37 = param16 << 881778576;
                          var38 = param15 << -839491920;
                          var39 = param1 << -1067829648;
                          var40 = param6 << 1346054704;
                          if (var33 != 0) {
                            break L20;
                          } else {
                            var29 = param4 << 1153898864;
                            var25 = param12 << -1937222064;
                            var17 = param5 << -2118807952;
                            var21 = param11 << 267540304;
                            if (0 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var18 = param5 << 162112400;
                        var22 = param11 << 1129782064;
                        var30 = param4 << 1050394032;
                        var26 = param12 << 1857699216;
                        break L19;
                      }
                      var19 = (var37 - var17) / var36;
                      var27 = (var39 + -var25) / var36;
                      var31 = (var40 - var29) / var36;
                      var24 = (var38 - var22) / var36;
                      var28 = (var39 - var26) / var36;
                      var20 = (-var18 + var37) / var36;
                      var32 = (var40 + -var30) / var36;
                      var23 = (-var21 + var38) / var36;
                      break L17;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L21: {
                  L22: {
                    if (param3 != param9) {
                      break L22;
                    } else {
                      var28 = 0;
                      var26 = param12;
                      var31 = 0;
                      var27 = 0;
                      var23 = 0;
                      var24 = 0;
                      var29 = param13;
                      var32 = 0;
                      var25 = param2;
                      var18 = param5 << -2039748112;
                      var21 = param10;
                      var17 = param14 << -735475280;
                      var22 = param11;
                      var30 = param4;
                      var20 = 0;
                      var19 = 0;
                      if (0 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    var35 = param3 - param7;
                    if (param5 <= param14) {
                      break L23;
                    } else {
                      var21 = param10 << 1591060560;
                      var28 = (-param12 + param1 << 1441919216) / var35;
                      var27 = (-param2 + param1 << 1877461968) / var34;
                      var23 = (param15 + -param10 << 99503568) / var34;
                      var30 = param4 << -1933975056;
                      var19 = (param16 + -param14 << -580859152) / var34;
                      var31 = (param6 + -param13 << 992830192) / var34;
                      var25 = param2 << 1302706832;
                      var29 = param13 << -2016212176;
                      var26 = param12 << -933781104;
                      var22 = param11 << -559002512;
                      var20 = (param16 + -param5 << 820667376) / var35;
                      var17 = param14 << -650366032;
                      var24 = (-param11 + param15 << 1106929424) / var35;
                      var32 = (-param4 + param6 << -611094608) / var35;
                      var18 = param5 << 401071312;
                      if (0 == 0) {
                        break L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var30 = param13 << -1931890256;
                  var24 = (param15 - param10 << -965269456) / var34;
                  var31 = (-param4 + param6 << -565806672) / var35;
                  var22 = param10 << 93459376;
                  var28 = (param1 - param2 << -454066256) / var34;
                  var21 = param11 << 2125246416;
                  var20 = (-param14 + param16 << 8244400) / var34;
                  var23 = (param15 + -param11 << 522391568) / var35;
                  var25 = param12 << 1371833200;
                  var17 = param5 << -2140465424;
                  var19 = (param16 - param5 << -983570768) / var35;
                  var18 = param14 << -664948880;
                  var29 = param4 << 390236624;
                  var32 = (-param13 + param6 << -1804647600) / var34;
                  var26 = param2 << -1034057712;
                  var27 = (param1 + -param12 << 1083631376) / var35;
                  break L21;
                }
                L24: {
                  if (0 > param9) {
                    param9 = Math.min(-param9, -param9 + param7);
                    var17 = var17 + var19 * param9;
                    var22 = var22 + var24 * param9;
                    var21 = var21 + param9 * var23;
                    var29 = var29 + param9 * var31;
                    var25 = var25 + param9 * var27;
                    var26 = var26 + var28 * param9;
                    var30 = var30 + param9 * var32;
                    var18 = var18 + var20 * param9;
                    param9 = 0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                var33 = 0;
                break L4;
              }
              L25: {
                if (param9 >= 0) {
                  break L25;
                } else {
                  param9 = -param9;
                  var17 = var17 + param9 * var19;
                  var21 = var21 + var23 * param9;
                  var30 = var30 + var32 * param9;
                  var25 = var25 + var27 * param9;
                  var22 = var22 + var24 * param9;
                  var18 = var18 + var20 * param9;
                  var26 = var26 + var28 * param9;
                  var29 = var29 + param9 * var31;
                  param9 = 0;
                  break L25;
                }
              }
              var35 = re.field_e[param9];
              if (param9 < param3) {
                L26: {
                  var36 = var17 >> 979545104;
                  if (re.field_b > var36) {
                    L27: {
                      var37 = (var18 >> 60602480) - (var17 >> 14226384);
                      if (var37 != 0) {
                        break L27;
                      } else {
                        if (0 > var36) {
                          break L26;
                        } else {
                          if (var36 < re.field_b) {
                            lo.a(var37, var36 + var35, 0, var25, 0, var21, param0, 0, var29, 0);
                            if (0 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L28: {
                      var38 = (-var21 + var22) / var37;
                      var39 = (-var25 + var26) / var37;
                      var40 = (-var29 + var30) / var37;
                      if (var36 - -var37 >= re.field_b) {
                        var37 = -1 + (-var36 + re.field_b);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (0 <= var36) {
                        break L29;
                      } else {
                        lo.a(var37 + var36, var35, var40, var25 - var39 * var36, 0, -(var36 * var38) + var21, param0, var38, var29 - var36 * var40, var39);
                        if (0 == 0) {
                          break L26;
                        } else {
                          break L29;
                        }
                      }
                    }
                    lo.a(var37, var35 + var36, var40, var25, 0, var21, param0, var38, var29, var39);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                param9++;
                if (param9 >= re.field_i) {
                  return;
                } else {
                  var29 = var29 + var31;
                  var30 = var30 + var32;
                  var21 = var21 + var23;
                  var18 = var18 + var20;
                  var35 = var35 + gf.field_i;
                  var17 = var17 + var19;
                  var25 = var25 + var27;
                  var22 = var22 + var24;
                  var26 = var26 + var28;
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

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = -90 % ((3 - param0) / 42);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[46];
        field_f = "Daemonette";
        field_a = "These work in the same way as trap rooms, but the consequences of a failed roll are that any monsters in the dungeon will be much harder to surprise when starting combat. Some guardians require a raider to make a successful Sneak roll (against the Guardian's Detect), while others require a Dodge roll (against the Guardian's Snare)";
        field_d = new int[46];
        field_d[0] = 1;
        field_c[0] = 100;
        field_d[1] = 1;
        field_c[1] = 100;
        field_d[2] = 1;
        field_c[2] = 100;
        field_d[3] = 1;
        field_c[3] = 100;
        field_d[4] = 2;
        field_d[5] = 2;
        field_c[4] = 200;
        field_c[5] = 200;
        field_d[6] = 3;
        field_c[6] = 300;
        field_d[7] = 2;
        field_d[8] = 1;
        field_c[7] = 200;
        field_c[8] = 100;
        field_d[9] = 1;
        field_c[9] = 100;
        field_d[10] = 2;
        field_d[11] = 2;
        field_c[10] = 200;
        field_d[12] = 2;
        field_c[11] = 200;
        field_c[12] = 200;
        field_d[13] = 3;
        field_d[14] = 3;
        field_c[13] = 300;
        field_d[15] = 1;
        field_c[14] = 300;
        field_c[15] = 100;
        field_d[16] = 1;
        field_c[16] = 100;
        field_d[17] = 1;
        field_d[18] = 3;
        field_c[17] = 100;
        field_d[19] = 1;
        field_c[18] = 300;
        field_d[20] = 1;
        field_c[19] = 100;
        field_d[21] = 1;
        field_c[20] = 100;
        field_d[22] = 10;
        field_c[21] = 100;
        field_d[23] = 5;
        field_c[22] = 1000;
        field_c[23] = 500;
        field_d[24] = 5;
        field_c[24] = 500;
        field_d[25] = 3;
        field_c[25] = 300;
        field_d[26] = 3;
        field_c[26] = 300;
        field_d[27] = 3;
        field_d[28] = 3;
        field_c[27] = 300;
        field_c[28] = 300;
        field_d[29] = 3;
        field_d[30] = 5;
        field_c[29] = 300;
        field_c[30] = 500;
        field_d[31] = 10;
        field_d[32] = 10;
        field_c[31] = 1000;
        field_c[32] = 1000;
        field_d[33] = 5;
        field_d[34] = 3;
        field_c[33] = 500;
        field_c[34] = 300;
        field_d[35] = 5;
        field_d[36] = 3;
        field_c[35] = 500;
        field_d[37] = 10;
        field_c[36] = 300;
        field_d[38] = 3;
        field_c[37] = 1000;
        field_c[38] = 300;
        field_d[39] = 5;
        field_c[39] = 500;
        field_d[40] = 5;
        field_c[40] = 500;
        field_d[41] = 10;
        field_d[42] = 10;
        field_c[41] = 1000;
        field_d[43] = 3;
        field_c[42] = 1000;
        field_c[43] = 300;
        field_d[44] = 5;
        field_d[45] = 10;
        field_c[44] = 500;
        field_c[45] = 1000;
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
