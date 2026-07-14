/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends br {
    static String field_j;
    private int field_r;
    static String field_q;
    private boolean field_k;
    static int field_s;
    static String field_f;
    private int field_o;
    private th field_l;
    private int field_p;
    private ge field_t;
    private int field_i;
    private rl field_m;
    static ea field_h;
    static String[] field_n;
    private boolean field_g;

    final static void a(int param0, double param1, int param2, int param3, double param4) {
        L0: {
          L1: {
            if (od.field_Db != -1) {
              break L1;
            } else {
              if (-1 >= param2) {
                break L1;
              } else {
                he.field_k = new th();
                break L0;
              }
            }
          }
          if (0 == param2) {
            he.field_k = null;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          od.field_Db = param2;
          la.field_n = param1;
          if (param3 != ab.field_o) {
            if (-1 != param0) {
              break L2;
            } else {
              break L2;
            }
          } else {
            if (param0 < -1) {
              th discarded$1 = new th();
              break L2;
            } else {
              if (-1 != param0) {
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        si.field_C = param4;
        ab.field_o = param0;
    }

    final static ae a(int param0, ga param1) {
        int var2 = param1.d((byte) 69);
        int var3 = param1.d((byte) 69);
        int var4 = param1.d((byte) 69);
        int var5 = param1.d((byte) 69);
        if (param0 != 20399) {
            Object var9 = null;
            ri discarded$0 = nk.a(-34, (int[]) null, (ri) null);
        }
        int var6 = param1.d((byte) 69);
        int var7 = param1.d((byte) 69);
        int var8 = param1.d((byte) 69);
        return (ae) (Object) td.a(var5, var2, var4, (byte) 125, var8, var6, var7, var3);
    }

    nk(ge param0, int param1, int param2, boolean param3) {
        this(param0.field_A, param1, param2, param3);
        ((nk) this).field_t = param0;
        ((nk) this).field_l.a((br) (Object) ((nk) this).field_t, false);
    }

    final static ri a(int param0, int[] param1, ri param2) {
        ri var3 = new ri(0, 0, 0);
        var3.field_b = param2.field_b;
        var3.field_f = param2.field_f;
        var3.field_m = param2.field_m;
        var3.field_h = param2.field_h;
        if (param0 < 84) {
            return null;
        }
        var3.field_j = param2.field_j;
        var3.field_a = param2.field_a;
        var3.field_e = param2.field_e;
        var3.field_l = param1;
        return var3;
    }

    final static ja a(ja param0, int param1, int param2, int param3) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        g.c(vb.field_b);
        oo.b();
        param0.g(3, 3);
        var12 = oo.field_i;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var4 = var9;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var12.length) {
            g.d();
            if (param2 == 255) {
              return vb.field_b;
            } else {
              return null;
            }
          } else {
            var6 = var12[var5];
            if (0 != var6) {
              if (0 != (65535 & var6)) {
                if (-1 == (16711935 & var6 ^ -1)) {
                  var7 = var6 >> 246071752;
                  var4[var5] = cr.b(tq.b(16711696, var7 * tq.b(255, param1 >> 158125584) << 638653192), cr.b(tq.b(255, param1) * var7 >> -2043701208, tq.b(tq.b(param1 >> -706115832, 255) * var7, 65280)));
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var7 = var6 >> -1932291568;
                var4[var5] = cr.b(tq.b(1107361536, var7 * tq.b(255, param3 >> -1166418768)) << 1310836744, cr.b(var7 * tq.b(255, param3) >> -1094131736, tq.b(65280, var7 * (tq.b(65362, param3) >> 707409480))));
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static ja[] a(int param0, byte param1) {
        int var2 = -119 / ((43 - param1) / 47);
        ja[] var3 = new ja[9];
        var3[4] = k.a(-111, 64, param0);
        return var3;
    }

    final void a(int param0) {
        int var2 = 0;
        br var3 = null;
        br var4 = null;
        ek var5 = null;
        int var6 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          ((nk) this).field_p = ((nk) this).field_p + 6;
          if (((nk) this).field_r < ((nk) this).field_p) {
            if (((nk) this).field_k) {
              ((nk) this).field_m.field_b.field_i.a((byte) 122);
              ((nk) this).field_m.field_b.a(48);
              ((nk) this).a(true);
              var2 = ((nk) this).field_p * ((nk) this).field_p;
              if (param0 >= 91) {
                break L0;
              } else {
                nk.a((byte) -1);
                break L0;
              }
            } else {
              ((nk) this).a(true);
              var2 = ((nk) this).field_p * ((nk) this).field_p;
              if (param0 >= 91) {
                break L0;
              } else {
                nk.a((byte) -1);
                break L0;
              }
            }
          } else {
            var2 = ((nk) this).field_p * ((nk) this).field_p;
            if (param0 >= 91) {
              break L0;
            } else {
              nk.a((byte) -1);
              break L0;
            }
          }
        }
        var3 = ((nk) this).field_l.c(49);
        L1: while (true) {
          if (!(var3 instanceof ha)) {
            return;
          } else {
            L2: {
              var4 = var3.field_d;
              if (((ha) (Object) var3).field_f >= var2) {
                break L2;
              } else {
                var3.a(true);
                var5 = ((ha) (Object) var3).field_m;
                if (!(var5 instanceof ge)) {
                  if (!(var5 instanceof lm)) {
                    break L2;
                  } else {
                    if (!((nk) this).field_g) {
                      ((lm) (Object) var5).a(800, true);
                      break L2;
                    } else {
                      ((lm) (Object) var5).c(false);
                      break L2;
                    }
                  }
                } else {
                  L3: {
                    if ((Object) (Object) var5 == (Object) (Object) ((nk) this).field_t) {
                      break L3;
                    } else {
                      if (!((nk) this).field_g) {
                        ((ge) (Object) var5).d(400, -118);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((ge) (Object) var5).m((byte) 42);
                  ((nk) this).field_t = null;
                  break L2;
                }
              }
            }
            var3 = var4;
            continue L1;
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_n = null;
        field_q = null;
        field_h = null;
        int var1 = -54 / ((21 - param0) / 40);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawnMulti.field_E ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (param2 & 16712141) >> -2136508688;
        int var5 = param2 >> 428695592 & 255;
        int var6 = 255 & param2;
        int var7 = (16766674 & param0) >> 1216394416;
        if (param1 != 455739624) {
            Object var13 = null;
            ri discarded$0 = nk.a(-88, (int[]) null, (ri) null);
        }
        int var8 = param0 >> -1040362296 & 255;
        int var9 = 255 & param0;
        for (var10 = 0; 256 > var10; var10++) {
            var11 = -var10 + 256;
            var14[var10] = (var6 * var10 >> -765718936) - (-(var9 * var11 >> 114843944) - (((var10 * var4 >> -1760534520) - -(var11 * var7 >> -2124228216) << 587744304) - -((var8 * var11 >> 53549288) + (var10 * var5 >> -1051937112) << 455739624)));
        }
        return var3;
    }

    nk(rl param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        br var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        L0: {
          ((nk) this).field_k = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((nk) this).field_g = stackIn_3_1 != 0;
          ((nk) this).field_m = param0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!((nk) this).field_g) {
            stackOut_5_0 = this;
            stackOut_5_1 = 180;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 90;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((nk) this).field_r = stackIn_6_1;
          if (((nk) this).field_m.field_b.a(-128, param2, param1)) {
            break L2;
          } else {
            param2 = param2 - (param2 % 24 + -4);
            break L2;
          }
        }
        ((nk) this).field_p = 0;
        ((nk) this).field_i = param2;
        ((nk) this).field_o = param1;
        ((nk) this).field_l = new th();
        var5 = ((nk) this).field_r * ((nk) this).field_r;
        var6 = ((nk) this).field_m.field_u.c(76);
        L3: while (true) {
          if (!(var6 instanceof ek)) {
          } else {
            L4: {
              L5: {
                L6: {
                  if (!(var6 instanceof ge)) {
                    break L6;
                  } else {
                    if (9 != ((ge) (Object) var6).field_Q) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var6 instanceof fd) {
                  break L5;
                } else {
                  if (!(var6 instanceof lm)) {
                    break L4;
                  } else {
                    if (((lm) (Object) var6).field_Q == 2) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L7: {
                var7 = ((ek) (Object) var6).e((byte) -112);
                var8 = ((ek) (Object) var6).g(1829947600);
                var9 = ((nk) this).field_o + -var7;
                var10 = -var8 + ((nk) this).field_i;
                var11 = var10 * var10 + var9 * var9;
                if (var11 >= var5) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L7;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L7;
                }
              }
              L8: {
                var12 = stackIn_18_0;
                if (!(var6 instanceof fd)) {
                  L9: {
                    stackOut_26_0 = var12;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (((nk) this).field_m.field_b.a(var8, -34, var7, ((nk) this).field_i, ((nk) this).field_o) == -1) {
                      stackOut_28_0 = stackIn_28_0;
                      stackOut_28_1 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L9;
                    } else {
                      stackOut_27_0 = stackIn_27_0;
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L9;
                    }
                  }
                  var12 = stackIn_29_0 & stackIn_29_1;
                  break L8;
                } else {
                  L10: {
                    L11: {
                      stackOut_19_0 = var12;
                      stackIn_23_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (-1 != ((nk) this).field_m.field_b.a(-24 + (-24 + (var8 - 2)), 98, var7, ((nk) this).field_i, ((nk) this).field_o)) {
                        break L11;
                      } else {
                        stackOut_20_0 = stackIn_20_0;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (0 != (((nk) this).field_m.field_b.a(-48 + var8 + -2, -58, var7 + 24, ((nk) this).field_i, ((nk) this).field_o) ^ -1)) {
                          break L11;
                        } else {
                          stackOut_21_0 = stackIn_21_0;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (-1 != ((nk) this).field_m.field_b.a(var8 + 2, -124, var7, ((nk) this).field_i, ((nk) this).field_o)) {
                            break L11;
                          } else {
                            stackOut_22_0 = stackIn_22_0;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (0 == (((nk) this).field_m.field_b.a(2 + var8, 107, 24 + var7, ((nk) this).field_i, ((nk) this).field_o) ^ -1)) {
                              stackOut_24_0 = stackIn_24_0;
                              stackOut_24_1 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_23_0 = stackIn_23_0;
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L10;
                  }
                  var12 = stackIn_25_0 & stackIn_25_1;
                  break L8;
                }
              }
              if (var12 == 0) {
                break L4;
              } else {
                L12: {
                  if (!(var6 instanceof ge)) {
                    break L12;
                  } else {
                    var13 = (ge) (Object) var6;
                    if (!((nk) this).field_m.field_m.b(0, var13.field_gb)) {
                      break L12;
                    } else {
                      ((nk) this).field_m.a((byte) -100, var13);
                      var6 = var6.field_d;
                      continue L3;
                    }
                  }
                }
                ((nk) this).field_l.a((br) (Object) new ha((ek) (Object) var6, var11), false);
                break L4;
              }
            }
            var6 = var6.field_d;
            continue L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Remove <%0> from friend list";
        field_q = "Orb points: ";
        field_f = "Learn to organise them.";
    }
}
