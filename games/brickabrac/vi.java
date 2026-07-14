/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi extends nm {
    int field_j;
    int field_k;
    int field_o;
    int field_l;
    int field_m;
    int field_i;
    static String field_n;

    final static void a(int param0, int[] param1, int param2, fo param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        int var4 = 0;
        int var5 = 29 / ((-52 - param0) / 49);
        while (var4 < param2) {
            for (var6 = 0; param1.length > var6; var6++) {
                var7 = param3.a(-37880252, param1.length);
                var8 = param1[var7];
                param1[var7] = param1[var6];
                param1[var6] = var8;
            }
            var4++;
        }
    }

    vi(int param0, int param1, int param2, int param3, int param4) {
        ((vi) this).field_j = param0;
        ((vi) this).field_o = param3;
        ((vi) this).field_m = param1;
        ((vi) this).field_k = param2;
        ((vi) this).field_i = param4;
    }

    void a(int param0, wq param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          var3 = param1.l(255);
          if (0 != (128 & var3)) {
            var4 = param1.l(255);
            var5 = (var3 & 7) << -1426136509;
            var5 = var5 | (224 & var4) >> -1162655419;
            var6 = 31 & var4;
            ((vi) this).field_j = var6 * 34 << 1418235528;
            ((vi) this).field_m = var5 * 16 << -450919800;
            break L0;
          } else {
            var4 = var3 & 12;
            var5 = var3 & 3;
            ((vi) this).field_j = var4 << -1263652434 | param1.i(65280);
            ((vi) this).field_m = var5 << 1215528720 | param1.i(65280);
            break L0;
          }
        }
        L1: {
          if (-1 == (64 & var3 ^ -1)) {
            ((vi) this).field_k = 0;
            ((vi) this).field_o = 0;
            break L1;
          } else {
            ((vi) this).field_k = param1.a(127);
            ((vi) this).field_o = param1.a(127);
            break L1;
          }
        }
        L2: {
          if ((var3 & 32) == 0) {
            ((vi) this).field_l = 0;
            break L2;
          } else {
            ((vi) this).field_l = param1.l(255);
            break L2;
          }
        }
        if (param0 >= 89) {
          L3: {
            if (-1 != (var3 & 16 ^ -1)) {
              ((vi) this).field_i = param1.l(255);
              break L3;
            } else {
              ((vi) this).field_i = 0;
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static int c(byte param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        boolean discarded$8 = mf.field_f.a(v.field_e, tk.field_r, -114, true);
        mf.field_f.i(79);
        while (jl.a((byte) 5)) {
            boolean discarded$9 = mf.field_f.a(go.field_b, dc.field_b, true);
        }
        int var1 = -30 % ((55 - param0) / 43);
        if (!(0 == (ch.field_b ^ -1))) {
            var2 = ch.field_b;
            bd.a(-1, true);
            return var2;
        }
        if (!(!t.field_g)) {
            return 3;
        }
        if (!(ka.field_l != jm.field_f)) {
            return 1;
        }
        if (!ma.field_I.b(96)) {
            return 1;
        }
        if (ik.field_g == jm.field_f) {
            return 2;
        }
        return -1;
    }

    final static void a(byte param0) {
        if (param0 >= -81) {
            field_n = null;
        }
        nl.field_b.c((640 + -nl.field_b.field_x) / 2, 19);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = BrickABrac.field_J ? 1 : 0;
          if (param15 < 0) {
            break L0;
          } else {
            if (param2 < mg.field_b) {
              L1: {
                if (0 <= param7) {
                  break L1;
                } else {
                  if (0 <= param4) {
                    break L1;
                  } else {
                    if (param1 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (mg.field_e > param7) {
                  break L2;
                } else {
                  if (param4 < mg.field_e) {
                    break L2;
                  } else {
                    if (mg.field_e <= param1) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param3 == -111) {
                  break L3;
                } else {
                  field_n = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = -param2 + param15;
                  if (param2 == param14) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var22 = param16 << -1934746448;
                        var21 = param16 << -1934746448;
                        var18 = param7 << -1197919408;
                        var17 = param7 << -1197919408;
                        var26 = param5 << 1426883376;
                        var25 = param5 << 1426883376;
                        var30 = param0 << 288307760;
                        var29 = param0 << 288307760;
                        var35 = param14 - param2;
                        var19 = (-param7 + param4 << -1717457136) / var35;
                        var20 = (param1 + -param7 << -1782691760) / var34;
                        if (var19 < var20) {
                          break L7;
                        } else {
                          var23 = (param8 - param16 << -652570448) / var34;
                          var32 = (-param0 + param13 << 1828517296) / var35;
                          var28 = (-param5 + param6 << 1593360688) / var35;
                          var33 = 1;
                          var31 = (-param0 + param11 << 1377047600) / var34;
                          var24 = (param10 - param16 << 1907117360) / var35;
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var27 = (param12 + -param5 << -552102448) / var34;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var28 = (param12 + -param5 << -112986480) / var34;
                      var27 = (-param5 + param6 << -2096479856) / var35;
                      var33 = 0;
                      var31 = (param13 + -param0 << -103459440) / var35;
                      var24 = (param8 + -param16 << 829015600) / var34;
                      var32 = (-param0 + param11 << 777508016) / var34;
                      var23 = (param10 + -param16 << 1861690832) / var35;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param2 < 0) {
                          L10: {
                            if (param14 >= 0) {
                              break L10;
                            } else {
                              param2 = -param2 + param14;
                              var18 = var18 + var20 * param2;
                              var22 = var22 + param2 * var24;
                              var29 = var29 + param2 * var31;
                              var30 = var30 + param2 * var32;
                              var21 = var21 + var23 * param2;
                              var26 = var26 + param2 * var28;
                              var17 = var17 + var19 * param2;
                              var25 = var25 + param2 * var27;
                              param2 = param14;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2 = -param2;
                          var18 = var18 + param2 * var20;
                          var29 = var29 + param2 * var31;
                          var17 = var17 + param2 * var19;
                          var26 = var26 + var28 * param2;
                          var22 = var22 + var24 * param2;
                          var21 = var21 + var23 * param2;
                          var30 = var30 + param2 * var32;
                          var25 = var25 + var27 * param2;
                          param2 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var36 = mg.field_g[param2];
                      L11: while (true) {
                        if (param2 >= param14) {
                          break L8;
                        } else {
                          L12: {
                            var37 = var17 >> 1401003120;
                            if (mg.field_e > var37) {
                              L13: {
                                var38 = -(var17 >> 457728304) + (var18 >> -368317744);
                                if (0 == var38) {
                                  break L13;
                                } else {
                                  L14: {
                                    var39 = (var22 - var21) / var38;
                                    var40 = (var26 + -var25) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (mg.field_e > var38 + var37) {
                                      break L14;
                                    } else {
                                      var38 = -1 + (-var37 + mg.field_e);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (var37 < 0) {
                                        break L16;
                                      } else {
                                        rp.a((byte) 117, var29, var41, var39, var40, var36 + var37, var38, var21, param9, var25);
                                        if (0 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    rp.a((byte) 121, var29 - var41 * var37, var41, var39, var40, var36, var38 + var37, var21 - var37 * var39, param9, -(var40 * var37) + var25);
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
                                if (var37 < mg.field_e) {
                                  rp.a((byte) 127, var29, 0, 0, 0, var36 + var37, var38, var21, param9, var25);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                          param2++;
                          if (mg.field_b > param2) {
                            var22 = var22 + var24;
                            var36 = var36 + lb.field_c;
                            var26 = var26 + var28;
                            var18 = var18 + var20;
                            var25 = var25 + var27;
                            var21 = var21 + var23;
                            var29 = var29 + var31;
                            var17 = var17 + var19;
                            var30 = var30 + var32;
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
                        var36 = -param14 + param15;
                        if (var36 != 0) {
                          break L18;
                        } else {
                          var24 = 0;
                          var19 = 0;
                          var27 = 0;
                          var32 = 0;
                          var23 = 0;
                          var20 = 0;
                          var28 = 0;
                          var31 = 0;
                          if (0 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        L20: {
                          var37 = param1 << -244571344;
                          var38 = param8 << 2064746064;
                          var39 = param12 << 625798064;
                          if (var33 == 0) {
                            break L20;
                          } else {
                            var26 = param6 << -1032189232;
                            var22 = param10 << -1092265072;
                            var30 = param13 << 830605328;
                            var18 = param4 << -628043248;
                            if (0 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var21 = param10 << 1995881616;
                        var29 = param13 << 186696560;
                        var17 = param4 << 1108317232;
                        var25 = param6 << -613387728;
                        break L19;
                      }
                      var40 = param11 << 61810608;
                      var19 = (var37 + -var17) / var36;
                      var23 = (-var21 + var38) / var36;
                      var32 = (-var30 + var40) / var36;
                      var28 = (-var26 + var39) / var36;
                      var20 = (-var18 + var37) / var36;
                      var31 = (-var29 + var40) / var36;
                      var24 = (var38 - var22) / var36;
                      var27 = (-var25 + var39) / var36;
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
                    if (param2 == param15) {
                      break L22;
                    } else {
                      L23: {
                        L24: {
                          var35 = param15 + -param14;
                          if (param7 >= param4) {
                            break L24;
                          } else {
                            var24 = (param8 - param10 << 1994506288) / var35;
                            var31 = (-param0 + param11 << 1845830608) / var34;
                            var30 = param13 << -263768944;
                            var20 = (param1 - param4 << -1368298384) / var35;
                            var32 = (-param13 + param11 << 15670256) / var35;
                            var22 = param10 << 367601968;
                            var25 = param5 << -1172688560;
                            var23 = (-param16 + param8 << 989820688) / var34;
                            var28 = (-param6 + param12 << -149528912) / var35;
                            var26 = param6 << 331376656;
                            var18 = param4 << 130134928;
                            var19 = (param1 - param7 << 88284816) / var34;
                            var29 = param0 << 302027472;
                            var21 = param16 << -1954040080;
                            var27 = (param12 - param5 << -1967729584) / var34;
                            var17 = param7 << -1990705936;
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var31 = (param11 - param13 << 1824987568) / var35;
                        var28 = (param12 + -param5 << -445826480) / var34;
                        var18 = param7 << 1560499504;
                        var20 = (-param7 + param1 << 1309125200) / var34;
                        var23 = (-param10 + param8 << -718638320) / var35;
                        var24 = (-param16 + param8 << 2127586160) / var34;
                        var22 = param16 << -476708080;
                        var19 = (-param4 + param1 << -49508304) / var35;
                        var21 = param10 << 798970032;
                        var32 = (-param0 + param11 << -1835795568) / var34;
                        var27 = (-param6 + param12 << -1435667024) / var35;
                        var17 = param4 << -1784067376;
                        var25 = param6 << -2133230384;
                        var30 = param0 << 292657808;
                        var29 = param13 << 871308304;
                        var26 = param5 << -753131888;
                        break L23;
                      }
                      if (0 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var23 = 0;
                  var28 = 0;
                  var21 = param16;
                  var31 = 0;
                  var26 = param6;
                  var30 = param13;
                  var24 = 0;
                  var29 = param0;
                  var18 = param4 << 904178352;
                  var19 = 0;
                  var22 = param10;
                  var32 = 0;
                  var27 = 0;
                  var17 = param7 << -1865060752;
                  var25 = param5;
                  var20 = 0;
                  break L21;
                }
                L25: {
                  if (param2 >= 0) {
                    break L25;
                  } else {
                    param2 = Math.min(-param2, -param2 + param14);
                    var25 = var25 + var27 * param2;
                    var22 = var22 + param2 * var24;
                    var26 = var26 + param2 * var28;
                    var18 = var18 + var20 * param2;
                    var30 = var30 + param2 * var32;
                    var29 = var29 + var31 * param2;
                    var17 = var17 + param2 * var19;
                    var21 = var21 + var23 * param2;
                    param2 = 0;
                    break L25;
                  }
                }
                var33 = 0;
                break L4;
              }
              L26: {
                if (param2 < 0) {
                  param2 = -param2;
                  var22 = var22 + param2 * var24;
                  var30 = var30 + param2 * var32;
                  var21 = var21 + param2 * var23;
                  var26 = var26 + var28 * param2;
                  var29 = var29 + var31 * param2;
                  var25 = var25 + param2 * var27;
                  var17 = var17 + var19 * param2;
                  var18 = var18 + param2 * var20;
                  param2 = 0;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                var35 = mg.field_g[param2];
                if (param15 <= param2) {
                  break L27;
                } else {
                  L28: {
                    var36 = var17 >> 1019217744;
                    if (mg.field_e > var36) {
                      var37 = (var18 >> 2099679728) - (var17 >> -649612432);
                      if (var37 == 0) {
                        if (var36 < 0) {
                          break L28;
                        } else {
                          if (mg.field_e <= var36) {
                            break L28;
                          } else {
                            rp.a((byte) 127, var29, 0, 0, 0, var36 + var35, var37, var21, param9, var25);
                            break L28;
                          }
                        }
                      } else {
                        if (var36 < 0) {
                          break L28;
                        } else {
                          if (mg.field_e <= var36) {
                            break L28;
                          } else {
                            rp.a((byte) 127, var29, 0, 0, 0, var36 + var35, var37, var21, param9, var25);
                            break L28;
                          }
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                  param2++;
                  if (mg.field_b > param2) {
                    var17 = var17 + var19;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var35 = var35 + lb.field_c;
                    var18 = var18 + var20;
                    var21 = var21 + var23;
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    break L27;
                  } else {
                    return;
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

    int a(int param0, StringBuilder param1) {
        if (param0 <= 79) {
            vi.a((byte) 80);
        }
        return (11 * ((vi) this).field_l - -666 << -1533397033 | 3 * (((vi) this).field_i - -5) << 1758093959) ^ (((vi) this).field_m * 17 - -10855845 << 2001979587 ^ ((vi) this).field_j * 31 - -15790320) + (58339 + 11 * ((vi) this).field_k | 29 * ((vi) this).field_o << -725590579);
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != 34) {
            Object var2 = null;
            vi.a(-84, 122, -97, (byte) 68, 30, 8, -62, -26, -113, (int[]) null, 112, -31, -33, -94, -22, -100, 90);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        jf.d(-99);
        lb.d(param2, param3, param1, param4);
        if (param0 < 68) {
            field_n = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Waiting for sound effects";
    }
}
