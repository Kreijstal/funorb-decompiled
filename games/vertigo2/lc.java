/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static boolean field_d;
    static int field_b;
    static String field_c;
    static int field_a;
    static cr field_e;
    static double field_g;
    static int field_f;

    final static void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ed var16 = null;
        ed var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        var15 = Vertigo2.field_L ? 1 : 0;
        var16 = new ed(param1);
        var17 = var16;
        var17.field_u = -2 + param1.length;
        eo.field_m = var17.a((byte) -11);
        vi.field_w = new int[eo.field_m];
        vl.field_j = new boolean[eo.field_m];
        pc.field_a = new int[eo.field_m];
        mh.field_c = new int[eo.field_m];
        ca.field_a = new int[eo.field_m];
        ej.field_c = new byte[eo.field_m][];
        se.field_y = new byte[eo.field_m][];
        var17.field_u = param1.length + -7 - eo.field_m * 8;
        ql.field_M = var17.a((byte) -11);
        vj.field_c = var17.a((byte) -11);
        var3 = (var17.h(-11) & 255) + 1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (eo.field_m <= var4) {
              break L1;
            } else {
              ca.field_a[var4] = var16.a((byte) -11);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= eo.field_m) {
                break L3;
              } else {
                pc.field_a[var4] = var16.a((byte) -11);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (eo.field_m <= var4) {
                  break L5;
                } else {
                  mh.field_c[var4] = var16.a((byte) -11);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (eo.field_m <= var4) {
                    break L7;
                  } else {
                    vi.field_w[var4] = var16.a((byte) -11);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_u = -(3 * (var3 - 1)) + (param1.length - 7 + -(eo.field_m * 8));
                in.field_c = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        in.field_c[var4] = var16.m(0);
                        if ((in.field_c[var4] ^ -1) != -1) {
                          break L10;
                        } else {
                          in.field_c[var4] = 1;
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (param0 <= 52) {
                    return;
                  } else {
                    var17.field_u = 0;
                    var4 = 0;
                    L11: while (true) {
                      L12: {
                        if (var4 >= eo.field_m) {
                          break L12;
                        } else {
                          var5 = mh.field_c[var4];
                          var6 = vi.field_w[var4];
                          var7 = var6 * var5;
                          var24 = new byte[var7];
                          var22 = var24;
                          var20 = var22;
                          var18 = var20;
                          var8 = var18;
                          se.field_y[var4] = var24;
                          var25 = new byte[var7];
                          var23 = var25;
                          var21 = var23;
                          var19 = var21;
                          var9 = var19;
                          ej.field_c[var4] = var25;
                          var10 = 0;
                          var11 = var17.h(-11);
                          stackOut_24_0 = 0;
                          stackOut_24_1 = var11 & 1;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          L13: {
                            L14: {
                              if (stackIn_26_0 != stackIn_26_1) {
                                break L14;
                              } else {
                                var12 = 0;
                                L15: while (true) {
                                  L16: {
                                    if (var7 <= var12) {
                                      break L16;
                                    } else {
                                      var8[var12] = var16.g(97);
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  if ((var11 & 2) != 0) {
                                    var12 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var7 <= var12) {
                                          break L18;
                                        } else {
                                          L19: {
                                            var9[var12] = var16.g(102);
                                            var13 = var16.g(102);
                                            stackOut_35_0 = var10;
                                            stackIn_37_0 = stackOut_35_0;
                                            stackIn_36_0 = stackOut_35_0;
                                            if (0 == (var13 ^ -1)) {
                                              stackOut_37_0 = stackIn_37_0;
                                              stackOut_37_1 = 0;
                                              stackIn_38_0 = stackOut_37_0;
                                              stackIn_38_1 = stackOut_37_1;
                                              break L19;
                                            } else {
                                              stackOut_36_0 = stackIn_36_0;
                                              stackOut_36_1 = 1;
                                              stackIn_38_0 = stackOut_36_0;
                                              stackIn_38_1 = stackOut_36_1;
                                              break L19;
                                            }
                                          }
                                          var10 = stackIn_38_0 | stackIn_38_1;
                                          var12++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (0 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var12 = 0;
                            L20: while (true) {
                              L21: {
                                if (var5 <= var12) {
                                  break L21;
                                } else {
                                  var13 = 0;
                                  L22: while (true) {
                                    L23: {
                                      if (var13 >= var6) {
                                        break L23;
                                      } else {
                                        var8[var13 * var5 + var12] = var16.g(106);
                                        var13++;
                                        if (0 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              if ((2 & var11) != 0) {
                                var12 = 0;
                                L24: while (true) {
                                  if (var12 >= var5) {
                                    break L13;
                                  } else {
                                    var13 = 0;
                                    L25: while (true) {
                                      L26: {
                                        if (var13 >= var6) {
                                          break L26;
                                        } else {
                                          L27: {
                                            var9[var12 - -(var5 * var13)] = var16.g(112);
                                            var14 = var16.g(112);
                                            stackOut_53_0 = var10;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_54_0 = stackOut_53_0;
                                            if (0 == (var14 ^ -1)) {
                                              stackOut_55_0 = stackIn_55_0;
                                              stackOut_55_1 = 0;
                                              stackIn_56_0 = stackOut_55_0;
                                              stackIn_56_1 = stackOut_55_1;
                                              break L27;
                                            } else {
                                              stackOut_54_0 = stackIn_54_0;
                                              stackOut_54_1 = 1;
                                              stackIn_56_0 = stackOut_54_0;
                                              stackIn_56_1 = stackOut_54_1;
                                              break L27;
                                            }
                                          }
                                          var10 = stackIn_56_0 | stackIn_56_1;
                                          var13++;
                                          if (0 == 0) {
                                            continue L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L24;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                          vl.field_j[var4] = var10 != 0;
                          var4++;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30015) {
            field_e = null;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_c = "Waiting for sound effects";
    }
}
