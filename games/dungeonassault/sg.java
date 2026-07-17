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
        if (param1 == 3) {
          var3 = tg.field_f[3][param2];
          if (var3 != 23) {
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
        L0: {
          var42 = DungeonAssault.field_K;
          if (param3 < 0) {
            break L0;
          } else {
            if (~re.field_i < ~param9) {
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
                    if (~re.field_b < ~param16) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                var34 = -param9 + param3;
                if (param9 == param7) {
                  L4: {
                    if (param3 != param9) {
                      var35 = param3 - param7;
                      if (~param5 >= ~param14) {
                        var30 = param13 << 16;
                        var24 = (param15 - param10 << 16) / var34;
                        var31 = (-param4 + param6 << 16) / var35;
                        var22 = param10 << 16;
                        var28 = (param1 - param2 << 16) / var34;
                        var21 = param11 << 16;
                        var20 = (-param14 + param16 << 16) / var34;
                        var23 = (param15 + -param11 << 16) / var35;
                        var25 = param12 << 16;
                        var17_int = param5 << 16;
                        var19 = (param16 - param5 << 16) / var35;
                        var18 = param14 << 16;
                        var29 = param4 << 16;
                        var32 = (-param13 + param6 << 16) / var34;
                        var26 = param2 << 16;
                        var27 = (param1 + -param12 << 16) / var35;
                        break L4;
                      } else {
                        var21 = param10 << 16;
                        var28 = (-param12 + param1 << 16) / var35;
                        var27 = (-param2 + param1 << 16) / var34;
                        var23 = (param15 + -param10 << 16) / var34;
                        var30 = param4 << 16;
                        var19 = (param16 + -param14 << 16) / var34;
                        var31 = (param6 + -param13 << 16) / var34;
                        var25 = param2 << 16;
                        var29 = param13 << 16;
                        var26 = param12 << 16;
                        var22 = param11 << 16;
                        var20 = (param16 + -param5 << 16) / var35;
                        var17_int = param14 << 16;
                        var24 = (-param11 + param15 << 16) / var35;
                        var32 = (-param4 + param6 << 16) / var35;
                        var18 = param5 << 16;
                        break L4;
                      }
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
                      var18 = param5 << 16;
                      var21 = param10;
                      var17_int = param14 << 16;
                      var22 = param11;
                      var30 = param4;
                      var20 = 0;
                      var19 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (0 > param9) {
                      param9 = Math.min(-param9, -param9 + param7);
                      var17_int = var17_int + var19 * param9;
                      var22 = var22 + var24 * param9;
                      var21 = var21 + param9 * var23;
                      var29 = var29 + param9 * var31;
                      var25 = var25 + param9 * var27;
                      var26 = var26 + var28 * param9;
                      var30 = var30 + param9 * var32;
                      var18 = var18 + var20 * param9;
                      param9 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var33 = 0;
                  break L3;
                } else {
                  L6: {
                    var26 = param2 << 16;
                    var25 = param2 << 16;
                    var22 = param10 << 16;
                    var21 = param10 << 16;
                    var18 = param14 << 16;
                    var17_int = param14 << 16;
                    var30 = param13 << 16;
                    var29 = param13 << 16;
                    var35 = -param9 + param7;
                    var19 = (-param14 + param5 << 16) / var35;
                    var20 = (param16 + -param14 << 16) / var34;
                    if (var20 > var19) {
                      var27 = (param12 + -param2 << 16) / var35;
                      var33 = 0;
                      var32 = (param6 + -param13 << 16) / var34;
                      var24 = (param15 - param10 << 16) / var34;
                      var28 = (-param2 + param1 << 16) / var34;
                      var31 = (param4 - param13 << 16) / var35;
                      var23 = (-param10 + param11 << 16) / var35;
                      break L6;
                    } else {
                      var31 = (param6 - param13 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var33 = 1;
                      var28 = (-param2 + param12 << 16) / var35;
                      var27 = (param1 + -param2 << 16) / var34;
                      var24 = (-param10 + param11 << 16) / var35;
                      var32 = (-param13 + param4 << 16) / var35;
                      var23 = (param15 + -param10 << 16) / var34;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (0 > param9) {
                        if (0 <= param7) {
                          param9 = -param9;
                          var17_int = var17_int + param9 * var19;
                          var25 = var25 + param9 * var27;
                          var30 = var30 + var32 * param9;
                          var22 = var22 + param9 * var24;
                          var21 = var21 + var23 * param9;
                          var26 = var26 + param9 * var28;
                          var29 = var29 + param9 * var31;
                          var18 = var18 + param9 * var20;
                          param9 = 0;
                          break L8;
                        } else {
                          param9 = -param9 + param7;
                          var18 = var18 + param9 * var20;
                          var29 = var29 + var31 * param9;
                          var25 = var25 + var27 * param9;
                          var30 = var30 + var32 * param9;
                          var21 = var21 + param9 * var23;
                          var17_int = var17_int + var19 * param9;
                          var22 = var22 + var24 * param9;
                          var26 = var26 + var28 * param9;
                          param9 = param7;
                          break L7;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var36 = re.field_e[param9];
                    L9: while (true) {
                      if (~param7 >= ~param9) {
                        break L7;
                      } else {
                        L10: {
                          var37 = var17_int >> 16;
                          if (var37 >= re.field_b) {
                            break L10;
                          } else {
                            var38 = (var18 >> 16) + -(var17_int >> 16);
                            if (var38 == 0) {
                              if (var37 < 0) {
                                break L10;
                              } else {
                                if (~re.field_b < ~var37) {
                                  lo.a(var38, var37 + var36, 0, var25, 0, var21, param0, 0, var29, 0);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              L11: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (var38 + var37 < re.field_b) {
                                  break L11;
                                } else {
                                  var38 = -1 + (re.field_b + -var37);
                                  break L11;
                                }
                              }
                              if (var37 < 0) {
                                lo.a(var37 + var38, var36, var41, var25 - var40 * var37, 0, var21 + -(var39 * var37), param0, var39, var29 - var37 * var41, var40);
                                break L10;
                              } else {
                                lo.a(var38, var36 + var37, var41, var25, 0, var21, param0, var39, var29, var40);
                                break L10;
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
                          var17_int = var17_int + var19;
                          var25 = var25 + var27;
                          continue L9;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = -param7 + param3;
                  if (var36 != 0) {
                    L12: {
                      var37 = param16 << 16;
                      var38 = param15 << 16;
                      var39 = param1 << 16;
                      var40 = param6 << 16;
                      if (var33 != 0) {
                        var18 = param5 << 16;
                        var22 = param11 << 16;
                        var30 = param4 << 16;
                        var26 = param12 << 16;
                        break L12;
                      } else {
                        var29 = param4 << 16;
                        var25 = param12 << 16;
                        var17_int = param5 << 16;
                        var21 = param11 << 16;
                        break L12;
                      }
                    }
                    var19 = (var37 - var17_int) / var36;
                    var27 = (var39 + -var25) / var36;
                    var31 = (var40 - var29) / var36;
                    var24 = (var38 - var22) / var36;
                    var28 = (var39 - var26) / var36;
                    var20 = (-var18 + var37) / var36;
                    var32 = (var40 + -var30) / var36;
                    var23 = (-var21 + var38) / var36;
                    break L3;
                  } else {
                    var27 = 0;
                    var19 = 0;
                    var23 = 0;
                    var20 = 0;
                    var31 = 0;
                    var28 = 0;
                    var24 = 0;
                    var32 = 0;
                    break L3;
                  }
                }
              }
              L13: {
                if (param9 >= 0) {
                  break L13;
                } else {
                  param9 = -param9;
                  var17_int = var17_int + param9 * var19;
                  var21 = var21 + var23 * param9;
                  var30 = var30 + var32 * param9;
                  var25 = var25 + var27 * param9;
                  var22 = var22 + var24 * param9;
                  var18 = var18 + var20 * param9;
                  var26 = var26 + var28 * param9;
                  var29 = var29 + param9 * var31;
                  param9 = 0;
                  break L13;
                }
              }
              var35 = re.field_e[param9];
              L14: while (true) {
                if (param9 >= param3) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (re.field_b > var36) {
                      var37 = (var18 >> 16) - (var17_int >> 16);
                      if (var37 != 0) {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (~(var36 - -var37) <= ~re.field_b) {
                            var37 = -1 + (-var36 + re.field_b);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (0 <= var36) {
                          lo.a(var37, var35 + var36, var40, var25, 0, var21, param0, var38, var29, var39);
                          break L15;
                        } else {
                          lo.a(var37 + var36, var35, var40, var25 - var39 * var36, 0, -(var36 * var38) + var21, param0, var38, var29 - var36 * var40, var39);
                          break L15;
                        }
                      } else {
                        if (0 > var36) {
                          break L15;
                        } else {
                          if (~var36 > ~re.field_b) {
                            lo.a(var37, var36 + var35, 0, var25, 0, var21, param0, 0, var29, 0);
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
                  param9++;
                  if (param9 >= re.field_i) {
                    return;
                  } else {
                    var29 = var29 + var31;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    var18 = var18 + var20;
                    var35 = var35 + gf.field_i;
                    var17_int = var17_int + var19;
                    var25 = var25 + var27;
                    var22 = var22 + var24;
                    var26 = var26 + var28;
                    continue L14;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = 0;
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
