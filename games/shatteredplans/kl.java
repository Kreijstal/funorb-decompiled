/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends wf {
    static int field_t;
    static int field_o;
    static bc field_s;
    static bi[] field_q;
    boolean field_p;
    static String field_r;

    kl(ln param0, pf param1, int[][] param2, fs param3, me param4, int param5, dc param6) {
        super(param0);
        sd[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln[] var12_ref_ln__ = null;
        int var12 = 0;
        int var13 = 0;
        ln var14_ref_ln = null;
        int var14 = 0;
        sd var15 = null;
        sd var16 = null;
        int var17 = 0;
        int var18_int = 0;
        ln[] var18 = null;
        int var19 = 0;
        ln var20 = null;
        int var22 = 0;
        int var23 = 0;
        sd[] var24 = null;
        ln[] var25 = null;
        ln var26 = null;
        ln[] var27 = null;
        ln var28 = null;
        ((kl) this).field_p = false;
        var24 = new sd[param0.field_D.length];
        var8 = var24;
        var9 = 0;
        var12_ref_ln__ = param0.field_D;
        var13 = 0;
        L0: while (true) {
          if (var13 >= var12_ref_ln__.length) {
            if (-1 != (var9 ^ -1)) {
              var15 = (sd) (Object) param1.d(0);
              var16 = null;
              ((kl) this).field_j = 0;
              var10 = 0;
              L1: while (true) {
                if (var15 == null) {
                  L2: {
                    ((kl) this).field_j = ((kl) this).field_j + 50 * (-1 + var9);
                    if (!(param4 instanceof ui)) {
                      break L2;
                    } else {
                      if (-37 != (((kl) this).field_n.field_p ^ -1)) {
                        break L2;
                      } else {
                        ((kl) this).field_j = ((kl) this).field_j + 100;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!(param4 instanceof hp)) {
                      break L3;
                    } else {
                      if (((kl) this).field_n.field_L != 2) {
                        break L3;
                      } else {
                        L4: {
                          if (!param6.field_o.field_i) {
                            var17 = var16.field_r;
                            break L4;
                          } else {
                            var17 = param3.field_m.field_r;
                            break L4;
                          }
                        }
                        L5: {
                          if (-5 * ((kl) this).field_n.field_G[0] <= var17) {
                            break L5;
                          } else {
                            ((kl) this).field_j = ((kl) this).field_j - 100;
                            break L5;
                          }
                        }
                        if (null == ((kl) this).field_n.field_y) {
                          break L3;
                        } else {
                          if (((kl) this).field_n.field_y.field_x != param5) {
                            break L3;
                          } else {
                            ((kl) this).field_j = ((kl) this).field_j + 100;
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    ((kl) this).field_i = param0.field_x;
                    if (null != param0.field_y) {
                      var27 = param0.field_D;
                      var23 = 0;
                      var18_int = var23;
                      L7: while (true) {
                        if (var23 >= var27.length) {
                          break L6;
                        } else {
                          var28 = var27[var23];
                          if (param3 != var28.field_y) {
                            L8: {
                              if (param0.field_y == var28.field_y) {
                                break L8;
                              } else {
                                if (null != var28.field_y) {
                                  if (!param0.field_y.field_h[var28.field_y.field_x]) {
                                    break L8;
                                  } else {
                                    var23++;
                                    continue L7;
                                  }
                                } else {
                                  var23++;
                                  continue L7;
                                }
                              }
                            }
                            ((kl) this).field_i = ((kl) this).field_i + var28.field_x;
                            var23++;
                            continue L7;
                          } else {
                            var23++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var25 = param0.field_D;
                      var18_int = 0;
                      L9: while (true) {
                        if (var18_int >= var25.length) {
                          break L6;
                        } else {
                          var26 = var25[var18_int];
                          if (param3 != var26.field_y) {
                            if (var26.field_y != null) {
                              ((kl) this).field_i = ((kl) this).field_i + var26.field_x;
                              var18_int++;
                              continue L9;
                            } else {
                              var18_int++;
                              continue L9;
                            }
                          } else {
                            var18_int++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if (!param0.field_u) {
                      break L10;
                    } else {
                      ((kl) this).field_i = 2 * ((kl) this).field_i;
                      break L10;
                    }
                  }
                  L11: {
                    if (param6.field_o.field_l) {
                      break L11;
                    } else {
                      var17 = 0;
                      var18 = ((kl) this).field_n.field_D;
                      var19 = 0;
                      L12: while (true) {
                        if (var18.length <= var19) {
                          L13: {
                            if ((((kl) this).field_i ^ -1) >= -1) {
                              break L13;
                            } else {
                              if (0 >= var17) {
                                break L13;
                              } else {
                                var17++;
                                break L13;
                              }
                            }
                          }
                          ((kl) this).field_i = ((kl) this).field_i + var17;
                          break L11;
                        } else {
                          var20 = var18[var19];
                          if (param3 != var20.field_y) {
                            var17++;
                            var19++;
                            continue L12;
                          } else {
                            var19++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                  L14: {
                    if (((kl) this).field_i != 0) {
                      break L14;
                    } else {
                      ((kl) this).field_i = 1;
                      break L14;
                    }
                  }
                } else {
                  var14 = 0;
                  L15: while (true) {
                    L16: {
                      if (var9 <= var14) {
                        break L16;
                      } else {
                        if (var24[var14] != var15) {
                          var14++;
                          continue L15;
                        } else {
                          var12 = 0;
                          var22 = 0;
                          var13 = var22;
                          L17: while (true) {
                            if ((var22 ^ -1) <= -5) {
                              break L16;
                            } else {
                              L18: {
                                var12 = var12 + param0.field_G[var22] * param2[var10][var22];
                                if ((var12 ^ -1) <= -1) {
                                  break L18;
                                } else {
                                  var12 = -var12;
                                  break L18;
                                }
                              }
                              if (var12 > ((kl) this).field_j) {
                                ((kl) this).field_j = var12;
                                var16 = var15;
                                var22++;
                                continue L17;
                              } else {
                                var22++;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                    }
                    var15 = (sd) (Object) param1.a((byte) -71);
                    var10++;
                    continue L1;
                  }
                }
              }
            } else {
              throw new RuntimeException("Target star " + param0.field_I + " does not appear to be connected to any of AI's stars.");
            }
          } else {
            var14_ref_ln = var12_ref_ln__[var13];
            if (var14_ref_ln.field_y == param3) {
              var11 = 0;
              var10 = 0;
              L19: while (true) {
                L20: {
                  if (var10 >= var9) {
                    break L20;
                  } else {
                    if (var24[var10] != var14_ref_ln.field_R) {
                      var10++;
                      continue L19;
                    } else {
                      var11 = 1;
                      break L20;
                    }
                  }
                }
                if (var11 == 0) {
                  var8[var9] = var14_ref_ln.field_R;
                  var9++;
                  var13++;
                  continue L0;
                } else {
                  var13++;
                  continue L0;
                }
              }
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    final static boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 95) {
            break L0;
          } else {
            boolean discarded$2 = kl.d((byte) -4);
            break L0;
          }
        }
        L1: {
          L2: {
            if (w.d(true)) {
              break L2;
            } else {
              if (0 < es.field_m) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        if (param0 > -53) {
            boolean discarded$0 = kl.d((byte) 123);
        }
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = ShatteredPlansClient.field_F ? 1 : 0;
          var7 = param3 & 16711935;
          if (param5 > param6) {
            param5 = param6;
            break L0;
          } else {
            break L0;
          }
        }
        gf.f(3 + param2, param1, 4 + param6 + -3, 16777215);
        var8 = param3 & 65280;
        gf.a(param2 + 3 - 1, 1 + param1, 16777215);
        gf.f(3 + param2, 1 + param1, -3 + (param6 + 2), 0);
        gf.a(3 + (param6 + param2), 1 + param1, 16777215);
        var9 = 2;
        L1: while (true) {
          if (var9 >= 3) {
            L2: {
              if (param0 >= 12) {
                break L2;
              } else {
                field_r = null;
                break L2;
              }
            }
            var9 = 3;
            L3: while (true) {
              if (var9 >= -3 + param4) {
                var9 = param4 - 3;
                L4: while (true) {
                  if (var9 >= -2 + param4) {
                    gf.f(param2, param1 - (-param4 - -1), 1 + param6, 16777215);
                    gf.a(param2, param1 - -param4 - 2, 16777215);
                    gf.f(param2 - -1, param1 + (param4 + -2), param6 - 1, 0);
                    gf.a(-3 + param2 + param6 + 4, param1 + param4 + -2, 16777215);
                    return;
                  } else {
                    L5: {
                      var10 = (var9 * 256 - 512) / (param4 + -4);
                      var11 = (16711680 & var8 * (256 + -var10) + 65280 * (var10 >> -1658367999) | var7 * (256 - var10) + 16711935 * (var10 >> -280830879) & -16711936) >>> 58022056;
                      var12 = ((var10 >> 837909057) * 16711935 + 1073758208 + -(var10 * 4194368) & -16711936 | (var10 >> 258183137) * 65280 + 16384 * (-var10 + 256) & 16711680) >>> -1301822424;
                      var13 = 8355711 & var12 >> -261580447;
                      var14 = var9 + param1;
                      var15 = -var9 + (param4 + param2 + (param5 + 2 - 3));
                      var16 = var15 + 5;
                      var17 = -3 + param4 + (param2 - -param6) - (-2 - -var9);
                      gf.a(param2, var14, 16777215);
                      if (var17 >= var16) {
                        break L5;
                      } else {
                        var16 = var17;
                        break L5;
                      }
                    }
                    gf.a(1 + param2, var14, 0);
                    gf.f(2 + param2, var14, var15 - (param2 + 2), var11);
                    gf.f(var15, var14, -var15 + var16, var13);
                    gf.f(var16, var14, -var16 + var17, var12);
                    gf.a(var17, var14, 16777215);
                    gf.a(-1 + var17, var14, 0);
                    var9++;
                    continue L4;
                  }
                }
              } else {
                L6: {
                  var10 = (-2 + var9) * 256 / (param4 - 4);
                  var11 = (-16711936 & (var10 >> -1782260415) * 16711935 + (-var10 + 256) * var7 | (-var10 + 256) * var8 + 65280 * (var10 >> -823623263) & 16711680) >>> 1502004008;
                  var12 = (16711680 & (-var10 + 256) * 8192 + 49152 * (var10 >> 1866955681) | -16711936 & 2097184 * (256 - var10) + 12583104 * (var10 >> -2088532895)) >>> -843651544;
                  var13 = (16711422 & var12) >> -1721998751;
                  var14 = var9 + param1;
                  var15 = param2 - -param5 + 3;
                  var16 = var15 + 5;
                  var17 = param6 + param2 - -3;
                  if (var17 < var16) {
                    var16 = var17;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                gf.a(param2, var14, 16777215);
                gf.a(1 + param2, var14, 0);
                gf.f(2 + param2, var14, var15 - param2 - 2, var11);
                gf.f(var15, var14, var16 - var15, var13);
                gf.f(var16, var14, -var16 + var17, var12);
                gf.a(3 + (param6 + param2), var14, 16777215);
                gf.a(2 + (param6 + param2), var14, 0);
                var9++;
                continue L3;
              }
            }
          } else {
            L7: {
              var10 = (var9 * 256 + -512) / (param4 - 4);
              var11 = (-16711936 & (var10 >> 2124687521) * 16711935 + (-var10 + 256) * var7 | 16711680 & (256 - var10) * var8 + (var10 >> 781713377) * 65280) >>> 1453120424;
              var12 = (-16711936 & 12583104 * (var10 >> 1064213697) + 536879104 - 2097184 * var10 | 16711680 & (var10 >> -602231807) * 49152 + (2097152 - var10 * 8192)) >>> -219704792;
              var13 = 8355711 & var12 >> 34204449;
              var14 = param1 + var9;
              var15 = param2 - (-3 + var9);
              var16 = 3 + param5 + param2;
              var17 = var16 - -5;
              var18 = param6 + param2 + 3;
              if (var17 > var18) {
                var17 = var18;
                break L7;
              } else {
                break L7;
              }
            }
            gf.a(var15, var14, 16777215);
            gf.a(1 + var15, var14, 0);
            gf.f(2 + var15, var14, var16 + -var15 - 2, var11);
            gf.f(var16, var14, var17 + -var16, var13);
            gf.f(var17, var14, var18 + -var17, var12);
            gf.a(var18, var14, 16777215);
            gf.a(var18 - 1, var14, 0);
            var9++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "In the first half of the 22nd Century (Old Earth Reckoning) scientists in the Escher Programme began research into faster-than-light travel.";
    }
}
