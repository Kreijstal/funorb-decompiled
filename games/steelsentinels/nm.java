/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends ia {
    static String[] field_n;
    static int field_w;
    private String field_u;
    private boolean field_r;
    static String field_t;
    static int[] field_s;
    static int[] field_v;
    static boolean field_p;
    static gh field_q;
    private tk field_x;
    static qc field_o;

    final static void a(boolean param0, hk param1) {
        int var3 = SteelSentinels.field_G;
        param1.b(4);
        hk var2 = (hk) (Object) ci.field_e.e(13058);
        if (!param0) {
            Object var4 = null;
            nm.a(true, (hk) null);
        }
        while (var2 != null) {
            // ifeq L70
            var2 = (hk) (Object) ci.field_e.a((byte) -101);
        }
        if (var2 == null) {
            ci.field_e.a(3, (ck) (Object) param1);
        } else {
            ie.a((ck) (Object) var2, 30, (ck) (Object) param1);
        }
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        ql.j(-29713);
        if (param3 != 12) {
            return;
        }
        ag.field_p.h(param3 + 109);
        jd.field_kb = new pm(cc.field_Xb, (String) null, de.field_d, param1, param2);
        ci.field_a = new bf(ag.field_p, (lh) (Object) jd.field_kb);
        ag.field_p.a((lh) (Object) ci.field_a, 93);
    }

    final String a(int param0, String param1) {
        if (param0 != 100) {
            Object var4 = null;
            jj[] discarded$0 = nm.a((kj) null, (byte) 97);
        }
        if (((nm) this).field_x.a(param1, -1) == fa.field_d) {
            return ((nm) this).field_x.a(100, param1);
        }
        if (((nm) this).a(param1, param0 ^ -101) == fa.field_d) {
            return pl.field_W;
        }
        return mg.field_lc;
    }

    final static void a(int param0, byte param1) {
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 109, 1);
        var2.a((byte) 108, 1);
        int var3 = 30 / ((11 - param1) / 51);
    }

    final vd a(String param0, int param1) {
        dm var3 = null;
        if (((nm) this).field_x.a(param0, param1) == fa.field_d) {
            return fa.field_d;
        }
        if (!(param0.equals((Object) (Object) ((nm) this).field_u))) {
            var3 = ri.a(param0, -98);
            if (!(var3.a((byte) -72))) {
                return ma.field_Y;
            }
            ((nm) this).field_u = param0;
            ((nm) this).field_r = var3.b(200);
        }
        return !((nm) this).field_r ? fa.field_d : vf.field_b;
    }

    public static void d(byte param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_v = null;
        field_s = null;
        field_n = null;
        int var1 = -69 / ((param0 - 61) / 55);
    }

    nm(jf param0, jf param1) {
        super(param0);
        ((nm) this).field_u = "";
        ((nm) this).field_r = false;
        ((nm) this).field_x = new tk(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        qf.field_c.a(0, param1, param4, param3, param5);
        if (param6 <= 81) {
            field_n = null;
        }
        if (!(jk.field_i == null)) {
            jk.field_i.a(param2, param4, param0, (byte) 27, -ed.field_i + param0, param4);
        }
    }

    final static jj[] a(kj param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        jj[] var4 = null;
        int var5 = 0;
        jj var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        var2 = param0.g(-126, 8);
        if (0 >= var2) {
          if (param1 > 22) {
            var3 = param0.g(-77, 12);
            var4 = new jj[var3];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var3) {
                return var4;
              } else {
                if (!he.a(-1766, param0)) {
                  var6 = param0.g(30, fm.a(-1 + var5, 80));
                  var4[var5] = var4[var6];
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new jj();
                  int discarded$156 = param0.g(-78, 24);
                  int discarded$157 = param0.g(80, 24);
                  var6_ref.field_g = param0.g(94, 24);
                  int discarded$158 = param0.g(62, 9);
                  int discarded$159 = param0.g(-75, 12);
                  int discarded$160 = param0.g(122, 12);
                  int discarded$161 = param0.g(-103, 12);
                  var4[var5] = var6_ref;
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0, int param1, int param2, String param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        wk[] var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        wk[] stackIn_16_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        wk[] stackOut_15_0 = null;
        wk[] stackOut_14_0 = null;
        L0: {
          if (param1 <= oh.field_f) {
            if (param5 + param1 > oh.field_f) {
              if (param0 <= pi.field_c) {
                if (param0 - -param4 > pi.field_c) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_10_0 = stackOut_7_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_10_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_10_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_10_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_10_0;
          if (var6 == 0) {
            stackOut_12_0 = 1146810;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          } else {
            stackOut_11_0 = 0;
            stackIn_13_0 = stackOut_11_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_13_0;
          if (var6 == 0) {
            stackOut_15_0 = hk.field_Tb;
            stackIn_16_0 = stackOut_15_0;
            break L2;
          } else {
            stackOut_14_0 = wc.field_d;
            stackIn_16_0 = stackOut_14_0;
            break L2;
          }
        }
        var8 = stackIn_16_0;
        if (param2 >= 115) {
          L3: {
            jm.a(param0, param4, var8, 1, param1, param5);
            if (param3 != null) {
              pl.field_U.a(param3, param5 / 2 + param1, (1 + (param4 - -pl.field_U.field_U)) / 2 + param0, var7, -1);
              break L3;
            } else {
              break L3;
            }
          }
          return var6 != 0;
        } else {
          return true;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = param1;
        if (var2 != -2) {
          if (var2 != 2) {
            if (var2 == 3) {
              return 2;
            } else {
              if (-5 != var2) {
                if (-21 == var2) {
                  return 4;
                } else {
                  if (11 != var2) {
                    if (-13 != var2) {
                      if (var2 == -14) {
                        return 12;
                      } else {
                        if (14 != var2) {
                          if (6 == var2) {
                            return 5;
                          } else {
                            if (-8 != var2) {
                              if (var2 != 8) {
                                if ((var2 ^ -1) == -10) {
                                  return 8;
                                } else {
                                  if (var2 != -27) {
                                    if (-16 == var2) {
                                      return 27;
                                    } else {
                                      L0: {
                                        if (param0 == 8241) {
                                          break L0;
                                        } else {
                                          field_t = null;
                                          break L0;
                                        }
                                      }
                                      return -1;
                                    }
                                  } else {
                                    return 10;
                                  }
                                }
                              } else {
                                return 7;
                              }
                            } else {
                              return 6;
                            }
                          }
                        } else {
                          return 13;
                        }
                      }
                    } else {
                      return 11;
                    }
                  } else {
                    return 10;
                  }
                }
              } else {
                return 3;
              }
            }
          } else {
            return 1;
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = false;
        field_v = new int[]{48, 272, 380, 490, 591};
        field_s = new int[12];
        field_w = -1;
    }
}
