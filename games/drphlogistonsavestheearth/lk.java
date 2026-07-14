/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk extends u {
    private long field_g;
    static String field_n;
    static he[] field_m;
    static String[] field_i;
    static volatile boolean field_j;
    static he field_k;
    static String field_l;
    private String field_h;

    final static int[] c(byte param0) {
        if (param0 != 8) {
            field_j = false;
        }
        return new int[8];
    }

    final static vj a(boolean param0, boolean param1, int param2, int param3, int param4) {
        if (param4 != 8) {
            field_k = null;
        }
        return na.a(param1, param2, false, param0, true, param3);
    }

    db b(byte param0) {
        if (param0 != -98) {
            ((lk) this).field_g = -35L;
        }
        return si.field_A;
    }

    final static void b(int param0) {
        qg.a(true, bg.field_q, ol.field_j, (byte) -11);
        hl.field_b = true;
        if (param0 != 1) {
            int[] discarded$0 = lk.c((byte) -37);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_n = null;
        field_i = null;
        field_k = null;
        field_m = null;
        if (param0 != -27996) {
            field_k = null;
        }
    }

    final static void a(byte[] param0, int param1) {
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
        od var16 = null;
        od var17 = null;
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
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var16 = new od(param0);
        var17 = var16;
        var17.field_j = -2 + param0.length;
        bd.field_M = var17.j(-788751192);
        vi.field_b = new int[bd.field_M];
        a.field_e = new byte[bd.field_M][];
        bd.field_O = new boolean[bd.field_M];
        ll.field_o = new byte[bd.field_M][];
        kh.field_i = new int[bd.field_M];
        qa.field_J = new int[bd.field_M];
        gf.field_o = new int[bd.field_M];
        var17.field_j = -(bd.field_M * 8) + (-7 + param0.length);
        oe.field_b = var17.j(-788751192);
        ih.field_K = var17.j(-788751192);
        var3 = (var17.l(31760) & 255) + 1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (bd.field_M <= var4) {
              break L1;
            } else {
              kh.field_i[var4] = var16.j(-788751192);
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
              if (var4 >= bd.field_M) {
                break L3;
              } else {
                vi.field_b[var4] = var16.j(-788751192);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var5 = 35 % ((param1 - -12) / 63);
            var4 = 0;
            L4: while (true) {
              L5: {
                if (bd.field_M <= var4) {
                  break L5;
                } else {
                  gf.field_o[var4] = var16.j(-788751192);
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
                  if (var4 >= bd.field_M) {
                    break L7;
                  } else {
                    qa.field_J[var4] = var16.j(-788751192);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_j = -(3 * var3) + (3 + (-7 + param0.length) + -(bd.field_M * 8));
                aj.field_a = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        aj.field_a[var4] = var16.g(-1);
                        if (-1 == (aj.field_a[var4] ^ -1)) {
                          aj.field_a[var4] = 1;
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
                  var17.field_j = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (bd.field_M <= var4) {
                        break L12;
                      } else {
                        var5 = gf.field_o[var4];
                        var6 = qa.field_J[var4];
                        var7 = var5 * var6;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        a.field_e[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        ll.field_o[var4] = var25;
                        var10 = 0;
                        var11 = var17.l(31760);
                        stackOut_24_0 = -1;
                        stackOut_24_1 = 1 & var11 ^ -1;
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
                                  if (var12 >= var7) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.n(-98);
                                    var12++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (-1 == (var11 & 2 ^ -1)) {
                                  break L13;
                                } else {
                                  var12 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var12 >= var7) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var9[var12] = var16.n(98);
                                          var13 = var16.n(98);
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
                                      var8[var13 * var5 + var12] = var16.n(-88);
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
                            if ((var11 & 2) != 0) {
                              var12 = 0;
                              L24: while (true) {
                                if (var5 <= var12) {
                                  break L13;
                                } else {
                                  var13 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if (var6 <= var13) {
                                        break L26;
                                      } else {
                                        L27: {
                                          var9[var13 * var5 + var12] = var16.n(99);
                                          var14 = var16.n(99);
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
                        bd.field_O[var4] = var10 != 0;
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

    final void a(od param0, int param1) {
        if (param1 <= 19) {
            return;
        }
        param0.a(((lk) this).field_g, (byte) 127);
        param0.b(1, ((lk) this).field_h);
    }

    lk(long param0, String param1) {
        ((lk) this).field_g = param0;
        ((lk) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Connection restored.";
        field_j = false;
        field_l = "Use this alternative as your account name";
    }
}
