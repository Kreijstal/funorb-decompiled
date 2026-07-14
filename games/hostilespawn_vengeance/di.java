/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;
    static String field_c;
    static bd[] field_b;

    final static void a(int param0, int param1, pf param2, int param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        u var21 = null;
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
        int[] var41 = null;
        int var44 = 0;
        pf var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        u stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        u stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          L1: {
            var40 = HostileSpawn.field_I ? 1 : 0;
            var45 = param2;
            if (null == var45.field_x) {
              break L1;
            } else {
              if ((var45.field_f ^ -1) >= -2) {
                break L1;
              } else {
                var62 = var45.field_x;
                jc.a(ke.field_z, 0, 0, var62, 8965);
                break L0;
              }
            }
          }
          jc.a(-122);
          break L0;
        }
        L2: {
          if (param4 == -536936193) {
            break L2;
          } else {
            field_b = null;
            break L2;
          }
        }
        var66 = new int[param2.field_L];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param2.field_L];
        var64 = oa.field_c;
        var63 = in.field_c;
        var65 = dl.field_o;
        var13 = 0;
        L3: while (true) {
          if (param2.field_L <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= th.field_Lb) {
                return;
              } else {
                L5: {
                  var14 = lh.field_d[var44];
                  var15 = param2.field_i[var14];
                  var16 = param2.field_P[var14];
                  var17 = param2.field_z[var14];
                  if (param2.field_m[var14] >= oa.field_c.length) {
                    stackOut_23_0 = -1;
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_22_0 = param2.field_m[var14];
                    stackIn_24_0 = stackOut_22_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_24_0;
                  if (param2.field_y[var14] >= oa.field_c.length) {
                    stackOut_26_0 = -1;
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_25_0 = param2.field_y[var14];
                    stackIn_27_0 = stackOut_25_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_27_0;
                  if (oa.field_c.length > param2.field_q[var14]) {
                    stackOut_29_0 = param2.field_q[var14];
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  } else {
                    stackOut_28_0 = -1;
                    stackIn_30_0 = stackOut_28_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_30_0;
                    if (ce.field_f == null) {
                      break L9;
                    } else {
                      if (null == param2.field_g) {
                        break L9;
                      } else {
                        if (var14 >= param2.field_g.length) {
                          break L9;
                        } else {
                          if (0 == (param2.field_g[var14] ^ -1)) {
                            break L9;
                          } else {
                            if (ce.field_f.length > param2.field_g[var14]) {
                              stackOut_37_0 = ce.field_f[param2.field_g[var14]];
                              stackIn_38_0 = stackOut_37_0;
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = null;
                  stackIn_38_0 = (u) (Object) stackOut_36_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_38_0;
                  var22 = tb.field_K[var15];
                  var23 = lc.field_c[var15];
                  var24 = tb.field_K[var16];
                  var25 = lc.field_c[var16];
                  var26 = tb.field_K[var17];
                  var27 = lc.field_c[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var20 == var19) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_47_0 = var21.field_i;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          stackOut_46_0 = 8355711;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_48_0;
                      var31 = 16711935 & var30;
                      var32 = var30 & 65280;
                      var33 = (var32 * var28 & 16711842) >>> -340125496 | (var31 * var28 & -16711843) >>> 2037412424;
                      var33 = var33 + 65793 * var29;
                      oe.a(var22, (byte) -121, var23, var26, 8355711 & var33 >> 946791137, var25, var27, var24);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 != null) {
                    stackOut_43_0 = var21.field_i;
                    stackIn_44_0 = stackOut_43_0;
                    break L12;
                  } else {
                    stackOut_42_0 = 8355711;
                    stackIn_44_0 = stackOut_42_0;
                    break L12;
                  }
                }
                var34 = stackIn_44_0;
                var35 = var34 & 16711935;
                var36 = var34 & 65280;
                var37 = var28 * var35 >>> 818058440 & 738132223 | -1207894272 & var36 * var28 >>> -1896549880;
                var38 = (var35 * var29 & -16711797) >>> -1425123416 | (16711793 & var29 * var36) >>> -1059380152;
                var37 = var37 + var31 * 65793;
                var38 = var38 + 65793 * var32;
                var39 = var30 * var35 >>> -238162584 & -536936193 | 1040252672 & var30 * var36 >>> -2020918872;
                var39 = var39 + var33 * 65793;
                ml.a(var25, var39 >> -136356720, var22, var37 & 255, 255 & var38 >> -537693208, var39 & 255, var27, var37 >> -767347920, var23, 255 & var38, var24, (var37 & 65322) >> 71356424, 255 & var39 >> 303590312, var38 >> -1483402896, false, var26);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param1 * var63[var13] + var64[var13] * param5 + var65[var13] * param0 >> -157769848;
              if (var14 <= -1) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (-1 > var14) {
                stackOut_14_0 = 128;
                stackIn_15_0 = stackOut_14_0;
                break L14;
              } else {
                if (-129 < (var14 ^ -1)) {
                  stackOut_13_0 = var14 + 128;
                  stackIn_15_0 = stackOut_13_0;
                  break L14;
                } else {
                  stackOut_12_0 = 256;
                  stackIn_15_0 = stackOut_12_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_15_0;
              var15 = param7 * var65[var13] + param3 * var64[var13] - -(param6 * var63[var13]) >> -384152248;
              stackOut_15_0 = pk.field_i;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if ((var15 ^ -1) > -1) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L15;
              } else {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L15;
              }
            }
            var15 = stackIn_18_0[stackIn_18_1];
            var14 = (-var15 + 256) * var14 >>> 1521298344;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 <= 51) {
            Object var2 = null;
            di.a(34, -107, (pf) null, 22, 29, -106, 117, -16);
        }
    }

    final static int a(double param0, int param1, double param2, double param3) {
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var17 = HostileSpawn.field_I ? 1 : 0;
          var7 = 90 / ((param1 - 85) / 37);
          param3 = param3 * 0.02454369260617026;
          var8 = -Math.sin(param3);
          var10 = -Math.cos(param3);
          var12 = (int)param2;
          if ((double)var12 > param2) {
            var12--;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var13 = (int)param0;
          if ((double)var13 <= param0) {
            break L1;
          } else {
            var13--;
            break L1;
          }
        }
        param2 = param2 - (double)var12;
        param0 = param0 - (double)var13;
        var14 = var12;
        var15 = var13;
        var16 = var12 + var13 * ln.field_a.field_d;
        L2: while (true) {
          if ((ln.field_a.field_c[var16] ^ -1) == -3) {
            if (var12 != var14) {
              if (var15 != var13) {
                L3: {
                  if (var12 <= var14) {
                    L4: {
                      if (0.0 >= var10) {
                        break L4;
                      } else {
                        if (2 == ln.field_a.field_c[-ln.field_a.field_d + var16]) {
                          return 64;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var10 >= 0.0) {
                      break L3;
                    } else {
                      if (ln.field_a.field_c[ln.field_a.field_d + var16] == 2) {
                        return 64;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    L5: {
                      if (var10 <= 0.0) {
                        break L5;
                      } else {
                        if ((ln.field_a.field_c[-ln.field_a.field_d + var16] ^ -1) == -3) {
                          return 192;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (0.0 <= var10) {
                      break L3;
                    } else {
                      if ((ln.field_a.field_c[var16 + ln.field_a.field_d] ^ -1) != -3) {
                        break L3;
                      } else {
                        return 192;
                      }
                    }
                  }
                }
                L6: {
                  if (var15 >= var13) {
                    L7: {
                      if (0.0 <= var8) {
                        break L7;
                      } else {
                        if (-3 == ln.field_a.field_c[var16 + 1]) {
                          return 0;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var8 <= 0.0) {
                      break L6;
                    } else {
                      if (ln.field_a.field_c[var16 - 1] == 2) {
                        return 0;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    L8: {
                      if (0.0 <= var8) {
                        break L8;
                      } else {
                        if (-3 == (ln.field_a.field_c[var16 - -1] ^ -1)) {
                          return 128;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (0.0 >= var8) {
                      break L6;
                    } else {
                      if (ln.field_a.field_c[-1 + var16] == -3) {
                        return 128;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (var12 <= var14) {
                  L9: {
                    if (var15 < var13) {
                      stackOut_72_0 = 96;
                      stackIn_73_0 = stackOut_72_0;
                      break L9;
                    } else {
                      stackOut_71_0 = 32;
                      stackIn_73_0 = stackOut_71_0;
                      break L9;
                    }
                  }
                  return stackIn_73_0;
                } else {
                  L10: {
                    if (var13 <= var15) {
                      stackOut_68_0 = 224;
                      stackIn_69_0 = stackOut_68_0;
                      break L10;
                    } else {
                      stackOut_67_0 = 160;
                      stackIn_69_0 = stackOut_67_0;
                      break L10;
                    }
                  }
                  return stackIn_69_0;
                }
              } else {
                L11: {
                  if (var12 > var14) {
                    stackOut_30_0 = 192;
                    stackIn_31_0 = stackOut_30_0;
                    break L11;
                  } else {
                    stackOut_29_0 = 64;
                    stackIn_31_0 = stackOut_29_0;
                    break L11;
                  }
                }
                return stackIn_31_0;
              }
            } else {
              L12: {
                if (var15 < var13) {
                  stackOut_25_0 = 128;
                  stackIn_26_0 = stackOut_25_0;
                  break L12;
                } else {
                  stackOut_24_0 = 0;
                  stackIn_26_0 = stackOut_24_0;
                  break L12;
                }
              }
              return stackIn_26_0;
            }
          } else {
            L13: {
              var12 = var14;
              var13 = var15;
              param2 = param2 + var8;
              param0 = param0 + var10;
              if (1.0 > param2) {
                if (0.0 > param2) {
                  param2 = param2 + 1.0;
                  var14--;
                  var16--;
                  break L13;
                } else {
                  break L13;
                }
              } else {
                var14++;
                param2 = param2 - 1.0;
                var16++;
                break L13;
              }
            }
            L14: {
              if (1.0 > param0) {
                if (0.0 <= param0) {
                  break L14;
                } else {
                  param0 = param0 + 1.0;
                  var16 = var16 - ln.field_a.field_d;
                  var15--;
                  break L14;
                }
              } else {
                var15++;
                var16 = var16 + ln.field_a.field_d;
                param0 = param0 - 1.0;
                break L14;
              }
            }
            L15: {
              if (ln.field_a.field_d <= var14) {
                break L15;
              } else {
                if ((var14 ^ -1) > -1) {
                  break L15;
                } else {
                  if (var15 >= ln.field_a.field_a) {
                    break L15;
                  } else {
                    if ((var15 ^ -1) <= -1) {
                      continue L2;
                    } else {
                      break L15;
                    }
                  }
                }
              }
            }
            return 128;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "<col=ffffff>Rocket<nbsp>launcher</col><br>The rocket launcher fires electromagnetic pulse (EMP) rockets that instantly disable electrical equipment. The blast is also effective against groups of organic targets.";
    }
}
