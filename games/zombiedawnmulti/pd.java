/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    private ja[] field_d;
    static String field_f;
    static cj field_b;
    static String field_a;
    static String field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 100 / ((param0 - -82) / 37);
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
            return;
        }
        s.a(param0, 0, ((pd) this).field_d, param1, param3, param2);
    }

    final static int a(int param0) {
        if (param0 != -27486) {
          return -94;
        } else {
          return hp.a((byte) 99, g.field_a, 256) << 644485840 | hp.a((byte) -91, g.field_a, 256) << -1968869272 | hp.a((byte) -97, g.field_a, 256);
        }
    }

    final static boolean a(long param0, String param1, int param2) {
        ml var4 = null;
        Object var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param2 == 2) {
            break L0;
          } else {
            var5 = null;
            pd.a((byte) 9, (byte[]) null);
            break L0;
          }
        }
        var4 = dn.a(param1, false);
        if (var4 != null) {
          if (var4.field_Nb != null) {
            return true;
          } else {
            L1: {
              L2: {
                if (mh.field_c == null) {
                  break L2;
                } else {
                  if (vm.a(param0, (byte) -81) == null) {
                    break L2;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            return stackIn_13_0 != 0;
          }
        } else {
          L3: {
            L4: {
              if (mh.field_c == null) {
                break L4;
              } else {
                if (vm.a(param0, (byte) -81) == null) {
                  break L4;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L3;
          }
          return stackIn_7_0 != 0;
        }
    }

    pd(ja[] param0) {
        ((pd) this).field_d = param0;
    }

    final static void a(byte param0, byte[] param1) {
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
        k var16 = null;
        k var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var15 = ZombieDawnMulti.field_E ? 1 : 0;
          var16 = new k(param1);
          var17 = var16;
          var17.field_j = -2 + param1.length;
          qc.field_v = var17.d((byte) 69);
          ll.field_h = new boolean[qc.field_v];
          qj.field_o = new int[qc.field_v];
          k.field_i = new int[qc.field_v];
          if (param0 > 82) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        vf.field_b = new byte[qc.field_v][];
        oq.field_w = new int[qc.field_v];
        qp.field_t = new byte[qc.field_v][];
        vj.field_p = new int[qc.field_v];
        var17.field_j = param1.length + -7 - 8 * qc.field_v;
        ie.field_nb = var17.d((byte) 69);
        hj.field_a = var17.d((byte) 69);
        var3 = 1 + (var17.g(31365) & 255);
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= qc.field_v) {
              break L2;
            } else {
              k.field_i[var4] = var16.d((byte) 69);
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (qc.field_v <= var4) {
                break L4;
              } else {
                qj.field_o[var4] = var16.d((byte) 69);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= qc.field_v) {
                  break L6;
                } else {
                  oq.field_w[var4] = var16.d((byte) 69);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (var4 >= qc.field_v) {
                    break L8;
                  } else {
                    vj.field_p[var4] = var16.d((byte) 69);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_j = -(var3 * 3) + -4 + (param1.length + -(8 * qc.field_v));
                tp.field_t = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        tp.field_t[var4] = var16.e(128);
                        if (-1 != (tp.field_t[var4] ^ -1)) {
                          break L11;
                        } else {
                          tp.field_t[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_j = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= qc.field_v) {
                        break L13;
                      } else {
                        var5 = oq.field_w[var4];
                        var6 = vj.field_p[var4];
                        var7 = var6 * var5;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        qp.field_t[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        vf.field_b[var4] = var25;
                        var10 = 0;
                        var11 = var17.g(31365);
                        stackOut_25_0 = -1;
                        stackOut_25_1 = 1 & var11 ^ -1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        L14: {
                          L15: {
                            if (stackIn_27_0 != stackIn_27_1) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var7 <= var12) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.d(-249699580);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if ((var11 & 2) == 0) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var7 <= var12) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.d(-249699580);
                                          var13 = var16.d(-249699580);
                                          stackOut_35_0 = var10;
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_36_0 = stackOut_35_0;
                                          if (0 == (var13 ^ -1)) {
                                            stackOut_37_0 = stackIn_37_0;
                                            stackOut_37_1 = 0;
                                            stackIn_38_0 = stackOut_37_0;
                                            stackIn_38_1 = stackOut_37_1;
                                            break L20;
                                          } else {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 1;
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_38_0 | stackIn_38_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var5 <= var12) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var13 >= var6) {
                                      break L24;
                                    } else {
                                      var8[var13 * var5 + var12] = var16.d(-249699580);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if ((var11 & 2) == 0) {
                              break L14;
                            } else {
                              var12 = 0;
                              L25: while (true) {
                                if (var12 >= var5) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var6 <= var13) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var12 + var5 * var13] = var16.d(-249699580);
                                          var14 = var16.d(-249699580);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (0 == (var14 ^ -1)) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L28;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ll.field_h[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
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
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
