/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_c;
    static oj field_b;
    static String field_a;

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
        ka var16 = null;
        ka var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        var15 = stellarshard.field_B;
        var16 = new ka(param1);
        var17 = var16;
        var17.field_k = -2 + param1.length;
        sb.field_b = var17.c((byte) 40);
        ih.field_d = new int[sb.field_b];
        ih.field_b = new byte[sb.field_b][];
        vc.field_b = new int[sb.field_b];
        lj.field_D = new byte[sb.field_b][];
        ak.field_c = new int[sb.field_b];
        sk.field_c = new boolean[sb.field_b];
        vi.field_c = new int[sb.field_b];
        var17.field_k = param1.length + (-7 - sb.field_b * 8);
        nc.field_G = var17.c((byte) 86);
        wd.field_b = var17.c((byte) 39);
        var3 = 1 + (var17.f(4) & 255);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (sb.field_b <= var4) {
              break L1;
            } else {
              ak.field_c[var4] = var16.c((byte) 30);
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
              if (sb.field_b <= var4) {
                break L3;
              } else {
                vi.field_c[var4] = var16.c((byte) 95);
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
                if (sb.field_b <= var4) {
                  break L5;
                } else {
                  vc.field_b[var4] = var16.c((byte) 30);
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
                  if (var4 >= sb.field_b) {
                    break L7;
                  } else {
                    ih.field_d[var4] = var16.c((byte) 83);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_k = -(3 * (-1 + var3)) + param1.length + (-7 + -(sb.field_b * 8));
                gj.field_w = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        gj.field_w[var4] = var16.c(true);
                        if ((gj.field_w[var4] ^ -1) != -1) {
                          break L10;
                        } else {
                          gj.field_w[var4] = 1;
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
                  var17.field_k = param0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (sb.field_b <= var4) {
                        break L12;
                      } else {
                        var5 = vc.field_b[var4];
                        var6 = ih.field_d[var4];
                        var7 = var6 * var5;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        ih.field_b[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        lj.field_D[var4] = var25;
                        var10 = 0;
                        var11 = var17.f(4);
                        stackOut_23_0 = 0;
                        stackOut_23_1 = 1 & var11;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        L13: {
                          L14: {
                            if (stackIn_25_0 == stackIn_25_1) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var5 <= var12) {
                                    break L16;
                                  } else {
                                    var13 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var13 >= var6) {
                                          break L18;
                                        } else {
                                          var8[var13 * var5 + var12] = var16.g(-62);
                                          var13++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                if ((2 & var11) != 0) {
                                  var12 = 0;
                                  L19: while (true) {
                                    L20: {
                                      if (var12 >= var5) {
                                        break L20;
                                      } else {
                                        var13 = 0;
                                        L21: while (true) {
                                          L22: {
                                            if (var13 >= var6) {
                                              break L22;
                                            } else {
                                              L23: {
                                                byte dupTemp$2 = var16.g(ih.a(param0, 102));
                                                var9[var12 + var13 * var5] = dupTemp$2;
                                                var14 = dupTemp$2;
                                                stackOut_39_0 = var10;
                                                stackIn_41_0 = stackOut_39_0;
                                                stackIn_40_0 = stackOut_39_0;
                                                if (var14 == -1) {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 0;
                                                  stackIn_42_0 = stackOut_41_0;
                                                  stackIn_42_1 = stackOut_41_1;
                                                  break L23;
                                                } else {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 1;
                                                  stackIn_42_0 = stackOut_40_0;
                                                  stackIn_42_1 = stackOut_40_1;
                                                  break L23;
                                                }
                                              }
                                              var10 = stackIn_42_0 | stackIn_42_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L19;
                                          } else {
                                            break L20;
                                          }
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
                          L24: while (true) {
                            L25: {
                              if (var12 >= var7) {
                                break L25;
                              } else {
                                var8[var12] = var16.g(110);
                                var12++;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if ((2 & var11) != 0) {
                              var12 = 0;
                              L26: while (true) {
                                if (var7 <= var12) {
                                  break L13;
                                } else {
                                  L27: {
                                    byte dupTemp$3 = var16.g(-81);
                                    var9[var12] = dupTemp$3;
                                    var13 = dupTemp$3;
                                    stackOut_53_0 = var10;
                                    stackIn_55_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (0 == (var13 ^ -1)) {
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
                                  var12++;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        sk.field_c[var4] = var10 != 0;
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

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0) {
            field_a = null;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 >= 108) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            param2 = ci.a(param2, '_', "", 2619);
            var3 = la.a(param2, (byte) 79);
            if (0 != (param0.indexOf(param2) ^ -1)) {
              break L2;
            } else {
              if (-1 == param0.indexOf(var3)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Waiting for fonts";
        field_b = new oj();
        field_a = "Account created successfully!";
    }
}
