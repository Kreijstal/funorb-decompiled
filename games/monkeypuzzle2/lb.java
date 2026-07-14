/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ua implements ql {
    private t field_B;
    static le[] field_E;
    private t field_F;
    static int field_z;
    private t field_G;
    static le field_H;
    static te field_I;
    static String field_A;
    static pd field_C;
    static int[] field_D;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, 103)) {
          return true;
        } else {
          if ((param2 ^ -1) != -99) {
            var5 = -36 / ((37 - param3) / 50);
            if (99 == param2) {
              return ((lb) this).b(param0, false);
            } else {
              return false;
            }
          } else {
            return ((lb) this).a((byte) 114, param0);
          }
        }
    }

    final static String d(byte param0) {
        if (ch.field_d == cf.field_b) {
          return mh.field_F;
        } else {
          if (param0 == -56) {
            if (ed.field_c == cf.field_b) {
              return pi.field_p;
            } else {
              if (!bb.field_a.a(param0 + 56)) {
                return pi.field_p;
              } else {
                return bh.field_b;
              }
            }
          } else {
            return null;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (((lb) this).field_F == param4) {
            je.a(-117);
            break L0;
          } else {
            if (((lb) this).field_G != param4) {
              if (param4 == ((lb) this).field_B) {
                il.a(true);
                break L0;
              } else {
                break L0;
              }
            } else {
              dc.a(0);
              break L0;
            }
          }
        }
        L1: {
          if (param3 == 7) {
            break L1;
          } else {
            var8 = null;
            boolean discarded$1 = ((lb) this).a((we) null, '￙', -4, -125);
            break L1;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param3 + ((lb) this).field_r;
        if (param0 != 30) {
          return;
        } else {
          var6 = ((lb) this).field_e - -param2;
          int discarded$1 = t.field_z.a(p.field_b, var5 - -20, 20 + var6, -40 + ((lb) this).field_l, ((lb) this).field_p - 50, 16777215, -1, 1, 0, t.field_z.field_C);
          super.a(param0 + 0, param1, param2, param3);
          return;
        }
    }

    public lb() {
        super(0, 0, 476, 225, (ml) null);
        ((lb) this).field_G = new t(oi.field_g, (of) null);
        ((lb) this).field_F = new t(aj.field_d, (of) null);
        ((lb) this).field_B = new t(oi.field_d, (of) null);
        hd var1 = new hd();
        ((lb) this).field_G.field_h = (ml) (Object) var1;
        ((lb) this).field_F.field_h = (ml) (Object) var1;
        ((lb) this).field_B.field_h = (ml) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 912876193;
        ((lb) this).field_F.a(30, 13361, -var3 + ((lb) this).field_l >> -1607869439, var4, -var2 + (((lb) this).field_p - 48));
        ((lb) this).field_B.a(30, 13361, (-var3 + ((lb) this).field_l >> 1318501857) + var4 - -var2, var4, -var2 + ((lb) this).field_p + -48);
        ((lb) this).field_G.a(30, 13361, ((lb) this).field_l - var3 >> -920203807, var3, ((lb) this).field_p - (78 - -(2 * var2)));
        ((lb) this).field_F.field_o = (of) this;
        ((lb) this).field_G.field_o = (of) this;
        ((lb) this).field_G.field_m = wd.field_s;
        ((lb) this).field_B.field_o = (of) this;
        ((lb) this).field_B.field_m = ca.field_n;
        ((lb) this).b((byte) -20, (we) (Object) ((lb) this).field_F);
        ((lb) this).b((byte) -119, (we) (Object) ((lb) this).field_G);
        ((lb) this).b((byte) -42, (we) (Object) ((lb) this).field_B);
    }

    public static void e(byte param0) {
        field_H = null;
        field_A = null;
        field_C = null;
        field_E = null;
        int var1 = 1 % ((param0 - -47) / 59);
        field_D = null;
        field_I = null;
    }

    final static void b(boolean param0) {
        int var2 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1 = param0 ? 1 : 0;
        for (var2 = 0; n.field_a > var2; var2++) {
            if (n.field_b[var2] != null) {
                // ifne L38
            } else {
                var1 = 1;
                break;
            }
        }
        if (!(var1 != 0)) {
            return;
        }
        int var3 = pf.a((byte) -103, 4);
        n.field_b[var2] = li.a(ke.field_h[var3 + 8], 100, 96);
        na.a((byte) 42, n.field_b[var2]);
    }

    final static le[] a(boolean param0, String param1, ad param2, String param3) {
        int var4 = param2.c(param1, (byte) -105);
        int var5 = param2.a(param3, var4, -28459);
        if (param0) {
            lb.e((byte) -92);
        }
        return wj.a((byte) 83, var5, param2, var4);
    }

    final static void a(int param0, int param1, byte param2, le[] param3, int param4, int param5) {
        int var6 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var23 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param3 == null) {
          return;
        } else {
          L0: {
            if (-1 <= (param1 ^ -1)) {
              break L0;
            } else {
              if (param5 <= 0) {
                break L0;
              } else {
                L1: {
                  if (null == param3[3]) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param3[3].field_m;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (param3[5] == null) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = param3[5].field_m;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_13_0;
                  if (null == param3[1]) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = param3[1].field_n;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_16_0;
                  if (null != param3[7]) {
                    stackOut_18_0 = param3[7].field_n;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_19_0;
                  var10 = param1 + param0;
                  var11 = param5 + param4;
                  var12 = param0 + var6;
                  var13 = -var7 + var10;
                  var14 = var8 + param4;
                  var15 = var11 + -var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 < var16) {
                    var17 = param0 + param1 * var6 / (var6 + var7);
                    var16 = param0 + param1 * var6 / (var6 + var7);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = 76 % ((param2 - -86) / 33);
                  var20 = var15;
                  if (var20 < var18) {
                    var20 = var8 * param5 / (var8 + var9) + param4;
                    var18 = var8 * param5 / (var8 + var9) + param4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  ge.b(cg.field_d);
                  if (null == param3[0]) {
                    break L7;
                  } else {
                    ge.c(param0, param4, var16, var18);
                    param3[0].c(param0, param4);
                    ge.a(cg.field_d);
                    break L7;
                  }
                }
                L8: {
                  if (null == param3[2]) {
                    break L8;
                  } else {
                    ge.c(var17, param4, var10, var18);
                    param3[2].c(var13, param4);
                    ge.a(cg.field_d);
                    break L8;
                  }
                }
                L9: {
                  if (param3[6] != null) {
                    ge.c(param0, var20, var16, var11);
                    param3[6].c(param0, var15);
                    ge.a(cg.field_d);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param3[8] == null) {
                    break L10;
                  } else {
                    ge.c(var17, var20, var10, var11);
                    param3[8].c(var13, var15);
                    ge.a(cg.field_d);
                    break L10;
                  }
                }
                L11: {
                  if (null == param3[1]) {
                    break L11;
                  } else {
                    if (-1 != (param3[1].field_m ^ -1)) {
                      ge.c(var16, param4, var17, var18);
                      var21 = var12;
                      L12: while (true) {
                        L13: {
                          if (var21 >= var13) {
                            break L13;
                          } else {
                            param3[1].c(var21, param4);
                            var21 = var21 + param3[1].field_m;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        ge.a(cg.field_d);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L14: {
                  if (param3[7] == null) {
                    break L14;
                  } else {
                    if (0 == param3[7].field_m) {
                      break L14;
                    } else {
                      ge.c(var16, var20, var17, var11);
                      var21 = var12;
                      L15: while (true) {
                        L16: {
                          if (var13 <= var21) {
                            break L16;
                          } else {
                            param3[7].c(var21, var15);
                            var21 = var21 + param3[7].field_m;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ge.a(cg.field_d);
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (null == param3[3]) {
                    break L17;
                  } else {
                    if (-1 != (param3[3].field_n ^ -1)) {
                      ge.c(param0, var18, var16, var20);
                      var21 = var14;
                      L18: while (true) {
                        L19: {
                          if (var15 <= var21) {
                            break L19;
                          } else {
                            param3[3].c(param0, var21);
                            var21 = var21 + param3[3].field_n;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ge.a(cg.field_d);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (null == param3[5]) {
                    break L20;
                  } else {
                    if (-1 != (param3[5].field_n ^ -1)) {
                      ge.c(var17, var18, var10, var20);
                      var21 = var14;
                      L21: while (true) {
                        L22: {
                          if (var15 <= var21) {
                            break L22;
                          } else {
                            param3[5].c(var13, var21);
                            var21 = var21 + param3[5].field_n;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        ge.a(cg.field_d);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (null == param3[4]) {
                    break L23;
                  } else {
                    if (param3[4].field_m == 0) {
                      break L23;
                    } else {
                      if (-1 != (param3[4].field_n ^ -1)) {
                        ge.c(var16, var18, var17, var20);
                        var21 = var14;
                        L24: while (true) {
                          L25: {
                            if (var21 >= var15) {
                              break L25;
                            } else {
                              var22 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var13 <= var22) {
                                    break L27;
                                  } else {
                                    param3[4].c(var22, var21);
                                    var22 = var22 + param3[4].field_m;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param3[4].field_n;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          ge.a(cg.field_d);
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new le(640, 480);
        field_A = "Press 'ENTER'";
        field_I = new te(6, 0, 4, 2);
        field_D = new int[10];
    }
}
