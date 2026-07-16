/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;
    static double field_c;
    static String field_b;

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
        fj var16 = null;
        fj var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        var15 = Torquing.field_u;
        var16 = new fj(param1);
        var17 = var16;
        var17.field_n = -2 + param1.length;
        ti.field_g = var17.i(7088);
        fq.field_G = new byte[ti.field_g][];
        fj.field_o = new int[ti.field_g];
        ij.field_o = new int[ti.field_g];
        pn.field_b = new byte[ti.field_g][];
        na.field_G = new int[ti.field_g];
        lp.field_e = new boolean[ti.field_g];
        vo.field_b = new int[ti.field_g];
        var17.field_n = -(8 * ti.field_g) + -7 + param1.length;
        fm.field_E = var17.i(7088);
        rh.field_d = var17.i(7088);
        var3 = (255 & var17.i((byte) -101)) + 1;
        if (param0 >= 101) {
          var4 = 0;
          L0: while (true) {
            L1: {
              if (ti.field_g <= var4) {
                break L1;
              } else {
                fj.field_o[var4] = var16.i(7088);
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
                if (var4 >= ti.field_g) {
                  break L3;
                } else {
                  na.field_G[var4] = var16.i(7088);
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
                  if (ti.field_g <= var4) {
                    break L5;
                  } else {
                    vo.field_b[var4] = var16.i(7088);
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
                    if (ti.field_g <= var4) {
                      break L7;
                    } else {
                      ij.field_o[var4] = var16.i(7088);
                      var4++;
                      if (0 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var17.field_n = param1.length - (7 - -(ti.field_g * 8) + 3 * (-1 + var3));
                  cq.field_y = new int[var3];
                  var4 = 1;
                  L8: while (true) {
                    L9: {
                      if (var4 >= var3) {
                        break L9;
                      } else {
                        L10: {
                          cq.field_y[var4] = var16.e((byte) 62);
                          if ((cq.field_y[var4] ^ -1) == -1) {
                            cq.field_y[var4] = 1;
                            break L10;
                          } else {
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
                    var17.field_n = 0;
                    var4 = 0;
                    L11: while (true) {
                      L12: {
                        if (ti.field_g <= var4) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              var5 = vo.field_b[var4];
                              var6 = ij.field_o[var4];
                              var7 = var6 * var5;
                              var24 = new byte[var7];
                              var22 = var24;
                              var20 = var22;
                              var18 = var20;
                              var8 = var18;
                              pn.field_b[var4] = var24;
                              var25 = new byte[var7];
                              var23 = var25;
                              var21 = var23;
                              var19 = var21;
                              var9 = var19;
                              fq.field_G[var4] = var25;
                              var10 = 0;
                              var11 = var17.i((byte) -101);
                              if ((1 & var11) != 0) {
                                break L14;
                              } else {
                                var12 = 0;
                                L15: while (true) {
                                  L16: {
                                    if (var7 <= var12) {
                                      break L16;
                                    } else {
                                      var8[var12] = var16.f((byte) 88);
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  if ((2 & var11) == 0) {
                                    break L13;
                                  } else {
                                    var12 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var12 >= var7) {
                                          break L18;
                                        } else {
                                          L19: {
                                            byte dupTemp$2 = var16.f((byte) 80);
                                            var9[var12] = dupTemp$2;
                                            var13 = dupTemp$2;
                                            stackOut_34_0 = var10;
                                            stackIn_36_0 = stackOut_34_0;
                                            stackIn_35_0 = stackOut_34_0;
                                            if (var13 == -1) {
                                              stackOut_36_0 = stackIn_36_0;
                                              stackOut_36_1 = 0;
                                              stackIn_37_0 = stackOut_36_0;
                                              stackIn_37_1 = stackOut_36_1;
                                              break L19;
                                            } else {
                                              stackOut_35_0 = stackIn_35_0;
                                              stackOut_35_1 = 1;
                                              stackIn_37_0 = stackOut_35_0;
                                              stackIn_37_1 = stackOut_35_1;
                                              break L19;
                                            }
                                          }
                                          var10 = stackIn_37_0 | stackIn_37_1;
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
                                        var8[var5 * var13 + var12] = var16.f((byte) 103);
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
                              if (0 == (var11 & 2)) {
                                break L13;
                              } else {
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
                                            byte dupTemp$3 = var16.f((byte) 61);
                                            var9[var5 * var13 + var12] = dupTemp$3;
                                            var14 = dupTemp$3;
                                            stackOut_51_0 = var10;
                                            stackIn_53_0 = stackOut_51_0;
                                            stackIn_52_0 = stackOut_51_0;
                                            if (0 == (var14 ^ -1)) {
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
                              }
                            }
                          }
                          lp.field_e[var4] = var10 != 0;
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

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = param1;
        if (param3) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return n.field_s[var4];
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 >= -44) {
          return;
        } else {
          L0: {
            og.a((java.awt.Component) (Object) param1, -1);
            qk.a(-90, (java.awt.Component) (Object) param1);
            if (null != wb.field_u) {
              wb.field_u.a(0, (java.awt.Component) (Object) param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 52) {
            Object var2 = null;
            tf.a(37, (java.awt.Canvas) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_b = "Visit the Account Management section on the main site to view.";
    }
}
