/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends ms {
    boolean field_o;
    static an field_l;
    int field_k;
    static String field_n;
    int[] field_m;

    public static void c(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
            field_n = null;
        }
    }

    eg() {
        ((eg) this).field_o = false;
    }

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
        fs var16 = null;
        fs var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = Sumoblitz.field_L ? 1 : 0;
        var16 = new fs(param1);
        var17 = var16;
        var17.field_p = -2 + param1.length;
        rl.field_n = var17.a(255);
        vg.field_k = new int[rl.field_n];
        we.field_B = new int[rl.field_n];
        og.field_d = new boolean[rl.field_n];
        ag.field_d = new byte[rl.field_n][];
        av.field_C = new int[rl.field_n];
        er.field_h = new int[rl.field_n];
        fl.field_o = new byte[rl.field_n][];
        var17.field_p = -(rl.field_n * 8) + -7 + param1.length;
        vf.field_d = var17.a(param0);
        li.field_u = var17.a(255);
        var3 = 1 + (var17.e(param0 + -31557) & 255);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= rl.field_n) {
              break L1;
            } else {
              er.field_h[var4] = var16.a(255);
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
              if (rl.field_n <= var4) {
                break L3;
              } else {
                av.field_C[var4] = var16.a(255);
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
                if (rl.field_n <= var4) {
                  break L5;
                } else {
                  vg.field_k[var4] = var16.a(255);
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
                  if (var4 >= rl.field_n) {
                    break L7;
                  } else {
                    we.field_B[var4] = var16.a(jg.a(param0, 0));
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_p = -(8 * rl.field_n) + (-7 + param1.length + -((-1 + var3) * 3));
                iv.field_l = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        iv.field_l[var4] = var16.c((byte) 121);
                        if ((iv.field_l[var4] ^ -1) != -1) {
                          break L10;
                        } else {
                          iv.field_l[var4] = 1;
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
                  var17.field_p = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= rl.field_n) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var5 = vg.field_k[var4];
                            var6 = we.field_B[var4];
                            var7 = var6 * var5;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            ag.field_d[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            fl.field_o[var4] = var25;
                            var10 = 0;
                            var11 = var17.e(param0 + -31557);
                            if ((var11 & 1) != 0) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var7 <= var12) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.d(true);
                                    var12++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (0 != (2 & var11)) {
                                  var12 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var7 <= var12) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var9[var12] = var16.d(true);
                                          var13 = var16.d(true);
                                          stackOut_32_0 = var10;
                                          stackIn_34_0 = stackOut_32_0;
                                          stackIn_33_0 = stackOut_32_0;
                                          if (var13 == -1) {
                                            stackOut_34_0 = stackIn_34_0;
                                            stackOut_34_1 = 0;
                                            stackIn_35_0 = stackOut_34_0;
                                            stackIn_35_1 = stackOut_34_1;
                                            break L19;
                                          } else {
                                            stackOut_33_0 = stackIn_33_0;
                                            stackOut_33_1 = 1;
                                            stackIn_35_0 = stackOut_33_0;
                                            stackIn_35_1 = stackOut_33_1;
                                            break L19;
                                          }
                                        }
                                        var10 = stackIn_35_0 | stackIn_35_1;
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
                                  stackOut_40_0 = var6 ^ -1;
                                  stackOut_40_1 = var13 ^ -1;
                                  stackIn_42_0 = stackOut_40_0;
                                  stackIn_42_1 = stackOut_40_1;
                                  L23: {
                                    if (stackIn_42_0 >= stackIn_42_1) {
                                      break L23;
                                    } else {
                                      var8[var12 + var5 * var13] = var16.d(true);
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
                                      if (var6 <= var13) {
                                        break L26;
                                      } else {
                                        L27: {
                                          var9[var5 * var13 + var12] = var16.d(true);
                                          var14 = var16.d(true);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (-1 == var14) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L27;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L27;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
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
                        og.field_d[var4] = var10 != 0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
