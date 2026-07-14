/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static wj field_b;
    static int[] field_c;
    static String field_a;

    final static void a(byte[] param0, byte param1) {
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
        ni var16 = null;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        var15 = fleas.field_A ? 1 : 0;
        var16 = new ni(param0);
        var17 = var16;
        var17.field_i = param0.length - 2;
        ef.field_l = var17.d((byte) -68);
        if (param1 == -91) {
          vg.field_I = new int[ef.field_l];
          wb.field_t = new byte[ef.field_l][];
          gg.field_i = new boolean[ef.field_l];
          of.field_d = new byte[ef.field_l][];
          ij.field_H = new int[ef.field_l];
          ob.field_a = new int[ef.field_l];
          b.field_b = new int[ef.field_l];
          var17.field_i = -(ef.field_l * 8) + (-7 + param0.length);
          e.field_e = var17.d((byte) 75);
          uf.field_k = var17.d((byte) -49);
          var3 = 1 + (255 & var17.e(false));
          var4 = 0;
          L0: while (true) {
            L1: {
              if (ef.field_l <= var4) {
                break L1;
              } else {
                vg.field_I[var4] = var16.d((byte) 62);
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
                if (ef.field_l <= var4) {
                  break L3;
                } else {
                  b.field_b[var4] = var16.d((byte) -124);
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
                  if (var4 >= ef.field_l) {
                    break L5;
                  } else {
                    ij.field_H[var4] = var16.d((byte) 106);
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
                    if (var4 >= ef.field_l) {
                      break L7;
                    } else {
                      ob.field_a[var4] = var16.d((byte) -74);
                      var4++;
                      if (0 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var17.field_i = -(ef.field_l * 8) + param0.length - (7 + (-1 + var3) * 3);
                  rd.field_d = new int[var3];
                  var4 = 1;
                  L8: while (true) {
                    L9: {
                      if (var3 <= var4) {
                        break L9;
                      } else {
                        L10: {
                          rd.field_d[var4] = var16.c(true);
                          if (0 != rd.field_d[var4]) {
                            break L10;
                          } else {
                            rd.field_d[var4] = 1;
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
                    var17.field_i = 0;
                    var4 = 0;
                    L11: while (true) {
                      L12: {
                        if (ef.field_l <= var4) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              var5 = ij.field_H[var4];
                              var6 = ob.field_a[var4];
                              var7 = var6 * var5;
                              var24 = new byte[var7];
                              var22 = var24;
                              var20 = var22;
                              var18 = var20;
                              var8 = var18;
                              of.field_d[var4] = var24;
                              var25 = new byte[var7];
                              var23 = var25;
                              var21 = var23;
                              var19 = var21;
                              var9 = var19;
                              wb.field_t[var4] = var25;
                              var10 = 0;
                              var11 = var17.e(false);
                              if ((1 & var11) == 0) {
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
                                            var8[var12 - -(var5 * var13)] = var16.i(-65);
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
                                  if (-1 == (2 & var11 ^ -1)) {
                                    break L13;
                                  } else {
                                    var12 = 0;
                                    L19: while (true) {
                                      L20: {
                                        if (var5 <= var12) {
                                          break L20;
                                        } else {
                                          var13 = 0;
                                          L21: while (true) {
                                            L22: {
                                              if (var13 >= var6) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  var9[var5 * var13 + var12] = var16.i(-107);
                                                  var14 = var16.i(-107);
                                                  stackOut_38_0 = var10;
                                                  stackIn_40_0 = stackOut_38_0;
                                                  stackIn_39_0 = stackOut_38_0;
                                                  if ((var14 ^ -1) == 0) {
                                                    stackOut_40_0 = stackIn_40_0;
                                                    stackOut_40_1 = 0;
                                                    stackIn_41_0 = stackOut_40_0;
                                                    stackIn_41_1 = stackOut_40_1;
                                                    break L23;
                                                  } else {
                                                    stackOut_39_0 = stackIn_39_0;
                                                    stackOut_39_1 = 1;
                                                    stackIn_41_0 = stackOut_39_0;
                                                    stackIn_41_1 = stackOut_39_1;
                                                    break L23;
                                                  }
                                                }
                                                var10 = stackIn_41_0 | stackIn_41_1;
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
                                  var8[var12] = var16.i(-124);
                                  var12++;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              if (-1 == (var11 & 2 ^ -1)) {
                                break L13;
                              } else {
                                var12 = 0;
                                L26: while (true) {
                                  if (var7 <= var12) {
                                    break L13;
                                  } else {
                                    L27: {
                                      var9[var12] = var16.i(df.a((int) param1, 31));
                                      var13 = var16.i(df.a((int) param1, 31));
                                      stackOut_51_0 = var10;
                                      stackIn_53_0 = stackOut_51_0;
                                      stackIn_52_0 = stackOut_51_0;
                                      if (var13 == -1) {
                                        stackOut_53_0 = stackIn_53_0;
                                        stackOut_53_1 = 0;
                                        stackIn_54_0 = stackOut_53_0;
                                        stackIn_54_1 = stackOut_53_1;
                                        break L27;
                                      } else {
                                        stackOut_52_0 = stackIn_52_0;
                                        stackOut_52_1 = 1;
                                        stackIn_54_0 = stackOut_52_0;
                                        stackIn_54_1 = stackOut_52_1;
                                        break L27;
                                      }
                                    }
                                    var10 = stackIn_54_0 | stackIn_54_1;
                                    var12++;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          gg.field_i[var4] = var10 != 0;
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
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        bd.field_kb = null;
        ic.field_bb = null;
        int var1 = -5 % ((param0 - 44) / 58);
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -29049) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        if (!(ok.field_x == null)) {
            ok.field_x.n(param0 + -22645);
        }
        if (param0 != 0) {
            field_a = null;
        }
        uc.field_e = new nf();
        ak.field_a.d((qa) (Object) uc.field_e, param0 ^ 26034);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
    }
}
