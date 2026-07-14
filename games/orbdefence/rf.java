/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends ta implements ff, ai, bf {
    we field_M;
    static String field_H;
    static boolean field_N;
    private of field_P;
    private oc field_O;
    static int field_C;
    private oc field_G;
    private te field_L;
    private oc field_D;
    private s field_K;
    private s field_F;
    private oc field_E;
    static String field_A;
    private oc field_J;
    private oc field_B;

    private final String d(byte param0) {
        if (param0 < 24) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, int param3, String param4, byte param5, pj param6) {
        kk var9 = null;
        h var10 = null;
        var10 = new h(20, param1, 120 - -param3, 25, param6, false, 120, 3, lm.field_f, 16777215, param4);
        if (param5 != -81) {
          return 5;
        } else {
          ((rf) this).a((pj) (Object) var10, (byte) 74);
          var9 = new kk(((ib) (Object) param6).a((byte) -115), param2, 126, param1 + var10.field_r, 50 + param3, param0);
          var9.field_h = (ag) this;
          ((rf) this).a((pj) (Object) var9, (byte) 74);
          return var9.field_r + var10.field_r;
        }
    }

    public rf() {
        super(0, 0, 496, 0, (td) null);
        ((rf) this).field_B = new oc("", (ag) null, 12);
        ((rf) this).field_O = new oc("", (ag) null, 100);
        ((rf) this).field_G = new oc("", (ag) null, 100);
        ((rf) this).field_D = new oc("", (ag) null, 20);
        ((rf) this).field_J = new oc("", (ag) null, 20);
        ((rf) this).field_E = new oc("", (ag) null, 3);
        int var1 = 1;
        ((rf) this).field_P = new of("", (ag) null, var1 != 0);
        ((rf) this).field_K = new s(vd.field_f, (ag) null);
        ((rf) this).field_F = new s(bi.field_b, (ag) null);
        ((rf) this).field_B.field_i = bg.field_b;
        ((rf) this).field_O.field_i = ce.field_b;
        ((rf) this).field_G.field_i = bc.field_s;
        ((rf) this).field_D.field_i = ba.field_g;
        ((rf) this).field_J.field_i = fk.field_a;
        ((rf) this).field_E.field_i = df.field_c;
        ((rf) this).field_P.field_i = OrbDefence.field_C;
        ((rf) this).field_B.a((ga) (Object) new bc((vi) (Object) ((rf) this).field_B), 67);
        ((rf) this).field_O.a((ga) (Object) new wg((vi) (Object) ((rf) this).field_O), 45);
        ((rf) this).field_G.a((ga) (Object) new b((vi) (Object) ((rf) this).field_G, (vi) (Object) ((rf) this).field_O), 79);
        ((rf) this).field_D.a((ga) (Object) new em((vi) (Object) ((rf) this).field_D, (vi) (Object) ((rf) this).field_B, (vi) (Object) ((rf) this).field_O), 34);
        ((rf) this).field_J.a((ga) (Object) new ug((vi) (Object) ((rf) this).field_J, (vi) (Object) ((rf) this).field_D), 53);
        ((rf) this).field_E.a((ga) (Object) new nb((vi) (Object) ((rf) this).field_E), 33);
        ((rf) this).field_K.field_F = false;
        ((rf) this).field_K.field_j = (td) (Object) new vk();
        ((rf) this).field_F.field_j = (td) (Object) new qc();
        ((rf) this).field_B.field_j = (td) (Object) new fg(10000536);
        ((rf) this).field_G.field_j = (td) (Object) new fg(10000536);
        ((rf) this).field_O.field_j = (td) (Object) new fg(10000536);
        ((rf) this).field_E.field_j = (td) (Object) new fg(10000536);
        ((rf) this).field_P.field_j = (td) (Object) new fi();
        ((rf) this).field_J.field_j = (td) (Object) new eg(10000536);
        ((rf) this).field_D.field_j = (td) (Object) new eg(10000536);
        String var2 = t.a(-415993727, new String[2], nb.field_n);
        int var3 = 20;
        var3 = var3 + this.a(var3, (pj) (Object) ((rf) this).field_O, 170, (byte) -82, ef.field_h);
        var3 = var3 + (this.a(20, var3, "", 170, a.field_u, (byte) -81, (pj) (Object) ((rf) this).field_G) - -5);
        var3 = var3 + this.a(var3, (pj) (Object) ((rf) this).field_D, 170, (byte) -82, hi.field_h);
        var3 = var3 + (this.a(170, var3, pf.field_c, lm.field_b, (pj) (Object) ((rf) this).field_J, false) - -5);
        var3 = var3 + (this.a(170, var3, bh.field_a, ja.field_b, (pj) (Object) ((rf) this).field_B, false) - -5);
        var3 = var3 + this.a(var3, 170, pi.field_c, (pj) (Object) ((rf) this).field_E, 25);
        h var4 = new h(46, var3, -90 + ((rf) this).field_m, 25, (pj) (Object) ((rf) this).field_P, true, ((rf) this).field_m - 120, 5, pc.field_bb, 11579568, rh.field_d);
        ((rf) this).a((pj) (Object) var4, (byte) 74);
        var3 = var3 + var4.field_r;
        jc var5 = new jc(lm.field_f, 0, 0, 0, 0, 16777215, -1, 0, 0, lm.field_f.field_H, -1, 2147483647, true);
        ((rf) this).field_L = new te(var2, (td) (Object) var5);
        ((rf) this).field_L.field_i = "";
        ((rf) this).field_L.a(0, b.field_p, 2);
        ((rf) this).field_L.a(1, b.field_p, 2);
        ((rf) this).field_L.field_h = (ag) this;
        ((rf) this).field_L.a(var3, (byte) 53, -90 + ((rf) this).field_m, 46);
        var3 = var3 + (((rf) this).field_L.field_r - -15);
        ((rf) this).a((pj) (Object) ((rf) this).field_L, (byte) 74);
        int var6 = 4;
        int var7 = 200;
        ((rf) this).field_K.a(-var7 + 496 >> -547514431, var3, 40, (byte) -90, var7);
        ((rf) this).field_F.a(3 + var6, var3 - -15, 40, (byte) -90, 60);
        ((rf) this).field_F.field_h = (ag) this;
        ((rf) this).field_K.field_h = (ag) this;
        ((rf) this).a((pj) (Object) ((rf) this).field_K, (byte) 74);
        ((rf) this).a((pj) (Object) ((rf) this).field_F, (byte) 74);
        ((rf) this).field_M = new we((bf) this);
        ((rf) this).field_M.a(((rf) this).field_B.field_m + (((rf) this).field_B.field_s + 60), ((rf) this).field_B.field_n + 20, 150, (byte) -90, ((rf) this).field_m - (((rf) this).field_B.field_s + ((rf) this).field_B.field_m + 60));
        ((rf) this).a((pj) (Object) ((rf) this).field_M, (byte) 74);
        ((rf) this).a(0, 0, var6 + var3 + 55, (byte) -90, 496);
    }

    private final String e(byte param0) {
        int var2 = -43 % ((-69 - param0) / 52);
        return "</col></u>";
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param1) {
            return ((rf) this).a(param2, false);
          } else {
            if (param1 != 99) {
              return false;
            } else {
              return ((rf) this).b(param2, false);
            }
          }
        }
    }

    final static boolean l(int param0) {
        int var1 = 68 % ((param0 - 46) / 52);
        return 250 < ji.field_b ? true : false;
    }

    public final void a(int param0, String param1) {
        oc var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((rf) this).field_B;
        var4 = param1;
        ((vi) (Object) var3).a(0, false, var4);
        if (param0 < 104) {
          var5 = null;
          boolean discarded$2 = ((rf) this).a('k', 11, (pj) null, -124);
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, String param2, pj param3, int param4) {
        h var8 = new h(20, param0, param1 + 120, param4, param3, false, 120, 3, lm.field_f, 16777215, param2);
        ((rf) this).a((pj) (Object) var8, (byte) 74);
        jf var7 = new jf(((ib) (Object) param3).a((byte) -113));
        ((rf) this).a((pj) (Object) var7, (byte) 74);
        var7.a(3 + (var8.field_m + var8.field_s), var8.field_n + (var8.field_r + -15 >> 413039617), 15, (byte) -90, 15);
        return var8.field_r;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = 0;
        if (((rf) this).field_F != param3) {
          if (((rf) this).field_K != param3) {
            var6 = 18 / ((-3 - param0) / 62);
            return;
          } else {
            boolean discarded$2 = this.e(false);
            var6 = 18 / ((-3 - param0) / 62);
            return;
          }
        } else {
          qd.a((byte) 122);
          var6 = 18 / ((-3 - param0) / 62);
          return;
        }
    }

    private final boolean e(boolean param0) {
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (this.k(20)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var2 = -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var2 = Integer.parseInt(((rf) this).field_E.field_l);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    numberFormatException = (NumberFormatException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return ie.a(var2, -10031, ((rf) this).field_B.field_l, ((rf) this).field_O.field_l, (rf) this, ((rf) this).field_P.field_D, ((rf) this).field_D.field_l);
                }
                case 8: {
                    boolean discarded$2 = this.e(false);
                    return ie.a(var2, -10031, ((rf) this).field_B.field_l, ((rf) this).field_O.field_l, (rf) this, ((rf) this).field_P.field_D, ((rf) this).field_D.field_l);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, String param2, String param3, pj param4, boolean param5) {
        if (param5) {
          field_C = 113;
          return this.a(35, param1, param3, param0, param2, (byte) -81, param4);
        } else {
          return this.a(35, param1, param3, param0, param2, (byte) -81, param4);
        }
    }

    public final void a(byte param0) {
        ((bc) (Object) ((rf) this).field_B.a((byte) 65)).b((byte) 77);
        if (param0 != -8) {
            Object var3 = null;
            int discarded$0 = this.a(-125, (pj) null, 66, (byte) 102, (String) null);
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((rf) this).field_K.field_F = this.k(20);
    }

    private final boolean k(int param0) {
        Object var3 = null;
        if (param0 == 20) {
          if (this.a((ib) (Object) ((rf) this).field_B, -94)) {
            if (this.a((ib) (Object) ((rf) this).field_O, param0 ^ 73)) {
              if (this.a((ib) (Object) ((rf) this).field_G, param0 ^ 59)) {
                if (this.a((ib) (Object) ((rf) this).field_D, -98)) {
                  if (this.a((ib) (Object) ((rf) this).field_J, -112)) {
                    if (!this.a((ib) (Object) ((rf) this).field_E, -118)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          int discarded$1 = this.a(77, -40, (String) null, (String) null, (pj) null, false);
          if (this.a((ib) (Object) ((rf) this).field_B, -94)) {
            if (this.a((ib) (Object) ((rf) this).field_O, param0 ^ 73)) {
              if (this.a((ib) (Object) ((rf) this).field_G, param0 ^ 59)) {
                if (this.a((ib) (Object) ((rf) this).field_D, -98)) {
                  if (this.a((ib) (Object) ((rf) this).field_J, -112)) {
                    if (!this.a((ib) (Object) ((rf) this).field_E, -118)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void c(boolean param0) {
        field_H = null;
        if (param0) {
            return;
        }
        field_A = null;
    }

    private final boolean a(ib param0, int param1) {
        ga var3 = null;
        qd var4 = null;
        int var5 = 0;
        var3 = param0.a((byte) 89);
        if (var3 != null) {
          var4 = var3.d(-7847);
          var5 = -60 % ((-34 - param1) / 60);
          if (var4 != vh.field_h) {
            if (var4 == ml.field_a) {
              return false;
            } else {
              if (fm.field_a == var4) {
                return false;
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, pj param1, int param2, byte param3, String param4) {
        h var6 = null;
        Object var7 = null;
        var6 = new h(20, param0, param2 + 120, 25, param1, false, 120, 3, lm.field_f, 16777215, param4);
        ((rf) this).a((pj) (Object) var6, (byte) 74);
        if (param3 != -82) {
          var7 = null;
          ((rf) this).a(-72, -9, (byte) -113, (te) null);
          return var6.field_r;
        } else {
          return var6.field_r;
        }
    }

    public final void a(int param0, int param1, byte param2, te param3) {
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (0 != param1) {
          if (1 != param1) {
            if (param1 != 2) {
              if (param2 != 101) {
                rf.c(true);
                return;
              } else {
                return;
              }
            } else {
              ol.a("conduct.ws", 1);
              if (param2 != 101) {
                rf.c(true);
                return;
              } else {
                return;
              }
            }
          } else {
            ol.a("privacy.ws", 1);
            if (param2 == 101) {
              return;
            } else {
              rf.c(true);
              return;
            }
          }
        } else {
          ol.a("terms.ws", 1);
          if (param2 == 101) {
            return;
          } else {
            rf.c(true);
            return;
          }
        }
    }

    final static void d(boolean param0) {
        Object var2 = null;
        if (param0) {
          field_C = 44;
          var2 = null;
          ed.a((String) null, 0, sk.field_G);
          return;
        } else {
          var2 = null;
          ed.a((String) null, 0, sk.field_G);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0>.<%1>k";
        field_A = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_N = false;
    }
}
