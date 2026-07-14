/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ki implements ka {
    static String[] field_M;
    private ge field_K;
    static String field_E;
    static o[] field_F;
    private pj[] field_J;
    static mf field_I;
    static int field_L;
    static int field_N;
    static mg field_G;
    static int field_H;
    private String[] field_D;

    final static int a(int param0, byte param1) {
        int var3 = SolKnight.field_L ? 1 : 0;
        qf.field_a = null;
        ug.field_f = 0;
        if (param1 != -86) {
            field_L = -67;
        }
        ik.field_b = null;
        int var2 = ue.field_a;
        ue.field_a = vc.field_e;
        if (param0 == 51) {
            il.field_c.field_c = 2;
        } else {
            if (param0 != 50) {
                il.field_c.field_c = 1;
            } else {
                il.field_c.field_c = 5;
            }
        }
        vc.field_e = var2;
        il.field_c.field_l = il.field_c.field_l + 1;
        if (2 <= il.field_c.field_l) {
            if (param0 == -52) {
                return 2;
            }
        }
        if (-3 <= il.field_c.field_l) {
            if (!(param0 != 50)) {
                return 5;
            }
        }
        if ((il.field_c.field_l ^ -1) <= -5) {
            return 1;
        }
        return -1;
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        if (super.a(param0, (byte) -77, param2, param3)) {
            return true;
        }
        int var5 = -102 / ((param1 - 31) / 56);
        if (98 == param2) {
            return ((ua) this).a((byte) -112, param3);
        }
        if (99 == param2) {
            return ((ua) this).b(108, param3);
        }
        return false;
    }

    public static void e(byte param0) {
        field_I = null;
        int var1 = -23 % ((param0 - 11) / 52);
        field_F = null;
        field_M = null;
        field_E = null;
        field_G = null;
    }

    final static void a(byte param0) {
        if (param0 > -92) {
            ua.a((byte) 57);
        }
        hc.a(lf.field_e, false, ug.field_d, true);
        ga.field_G = true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        mg var5 = field_G;
        if (((ua) this).field_D != null) {
            int discarded$0 = var5.a(nb.field_d, param2 + ((ua) this).field_m, ((ua) this).field_j + param0, ((ua) this).field_t, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_F);
        }
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
        gb var16 = null;
        gb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        var15 = SolKnight.field_L ? 1 : 0;
        var16 = new gb(param1);
        var17 = var16;
        var17.field_m = -2 + param1.length;
        nb.field_c = var17.i(39);
        qf.field_d = new int[nb.field_c];
        rg.field_e = new boolean[nb.field_c];
        ph.field_h = new int[nb.field_c];
        uj.field_b = new int[nb.field_c];
        sa.field_l = new int[nb.field_c];
        jc.field_c = new byte[nb.field_c][];
        uf.field_s = new byte[nb.field_c][];
        var17.field_m = -(nb.field_c * 8) + param1.length - 7;
        kl.field_a = var17.i(param0 ^ -8);
        we.field_e = var17.i(28);
        var3 = 1 + (255 & var17.j(255));
        var4 = 0;
        L0: while (true) {
          L1: {
            if (nb.field_c <= var4) {
              break L1;
            } else {
              ph.field_h[var4] = var16.i(-116);
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
              if (var4 >= nb.field_c) {
                break L3;
              } else {
                qf.field_d[var4] = var16.i(-110);
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
                if (var4 >= nb.field_c) {
                  break L5;
                } else {
                  sa.field_l[var4] = var16.i(11);
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
                  if (nb.field_c <= var4) {
                    break L7;
                  } else {
                    uj.field_b[var4] = var16.i(param0 + 40);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_m = param1.length + (-7 + -(8 * nb.field_c) + 3 + -(3 * var3));
                ig.field_H = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var4 >= var3) {
                      break L9;
                    } else {
                      L10: {
                        ig.field_H[var4] = var16.b(false);
                        if (ig.field_H[var4] != 0) {
                          break L10;
                        } else {
                          ig.field_H[var4] = 1;
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
                  var17.field_m = 0;
                  var4 = param0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= nb.field_c) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var5 = sa.field_l[var4];
                            var6 = uj.field_b[var4];
                            var7 = var5 * var6;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            jc.field_c[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            uf.field_s[var4] = var25;
                            var10 = 0;
                            var11 = var17.j(255);
                            if (0 != (var11 & 1)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var12 >= var7) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.a((byte) -14);
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
                                      if (var7 <= var12) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var9[var12] = var16.a((byte) -14);
                                          var13 = var16.a((byte) -14);
                                          stackOut_31_0 = var10;
                                          stackIn_33_0 = stackOut_31_0;
                                          stackIn_32_0 = stackOut_31_0;
                                          if ((var13 ^ -1) == 0) {
                                            stackOut_33_0 = stackIn_33_0;
                                            stackOut_33_1 = 0;
                                            stackIn_34_0 = stackOut_33_0;
                                            stackIn_34_1 = stackOut_33_1;
                                            break L19;
                                          } else {
                                            stackOut_32_0 = stackIn_32_0;
                                            stackOut_32_1 = 1;
                                            stackIn_34_0 = stackOut_32_0;
                                            stackIn_34_1 = stackOut_32_1;
                                            break L19;
                                          }
                                        }
                                        var10 = stackIn_34_0 | stackIn_34_1;
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
                                    if (var6 <= var13) {
                                      break L23;
                                    } else {
                                      var8[var12 - -(var13 * var5)] = var16.a((byte) -14);
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
                            if ((var11 & 2) == 0) {
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
                                          var9[var12 - -(var13 * var5)] = var16.a((byte) -14);
                                          var14 = var16.a((byte) -14);
                                          stackOut_48_0 = var10;
                                          stackIn_50_0 = stackOut_48_0;
                                          stackIn_49_0 = stackOut_48_0;
                                          if (0 == (var14 ^ -1)) {
                                            stackOut_50_0 = stackIn_50_0;
                                            stackOut_50_1 = 0;
                                            stackIn_51_0 = stackOut_50_0;
                                            stackIn_51_1 = stackOut_50_1;
                                            break L27;
                                          } else {
                                            stackOut_49_0 = stackIn_49_0;
                                            stackOut_49_1 = 1;
                                            stackIn_51_0 = stackOut_49_0;
                                            stackIn_51_1 = stackOut_49_1;
                                            break L27;
                                          }
                                        }
                                        var10 = stackIn_51_0 | stackIn_51_1;
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
                        rg.field_e[var4] = var10 != 0;
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

    final static ol a(boolean param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        if (!param0) {
            field_H = -117;
        }
        ol var2 = new ol(param1, ph.field_h, qf.field_d, sa.field_l, uj.field_b, ig.field_H, jc.field_c);
        og.a((byte) -97);
        return var2;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        if (param4) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((ua) this).field_D.length) {
              L1: {
                if (param3 != ((ua) this).field_J[((ua) this).field_D.length]) {
                  break L1;
                } else {
                  ((ua) this).field_K.a((byte) 22);
                  break L1;
                }
              }
              return;
            } else {
              if (param3 == ((ua) this).field_J[var6]) {
                ((ua) this).field_K.a(param4, ((ua) this).field_D[var6]);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static mb h(int param0) {
        if (param0 != 0) {
            field_F = null;
        }
        return new mb(sg.b(-1), he.a(71));
    }

    ua(ge param0) {
        super(0, 0, 0, 0, (j) null);
        ((ua) this).field_K = param0;
    }

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SolKnight.field_L ? 1 : 0;
          ((ua) this).field_B.a(true);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              var3 = param1.length;
              ((ua) this).field_D = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  L2: {
                    var4 = new ri(field_G, 0, 1);
                    ((ua) this).field_J = new pj[var3 + 1];
                    if (param0 == 20870) {
                      break L2;
                    } else {
                      field_L = -28;
                      break L2;
                    }
                  }
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      ((ua) this).field_J[var3] = new pj(wc.field_d, (dg) this);
                      ((ua) this).field_J[var3].field_w = (j) (Object) var4;
                      ((ua) this).field_J[var3].b(15, 100, 0, 0, 20 - -((1 + var3) * 16));
                      ((ua) this).a((rc) (Object) ((ua) this).field_J[var3], 5411);
                      return;
                    } else {
                      ((ua) this).field_J[var5] = new pj(((ua) this).field_D[var5], (dg) this);
                      ((ua) this).field_J[var5].field_w = (j) (Object) var4;
                      ((ua) this).field_J[var5].field_z = he.field_f;
                      ((ua) this).field_J[var5].b(15, 80, 0, 0, 20 - -(16 * var5));
                      ((ua) this).a((rc) (Object) ((ua) this).field_J[var5], 5411);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((ua) this).field_D[var4_int] = gh.a(-31433, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((ua) this).field_D = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Subscribing members have access to fullscreen mode.<br>TODO Game-specific benefits, screenshots, etc.";
        field_M = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_L = 0;
    }
}
