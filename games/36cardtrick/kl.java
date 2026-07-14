/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends g implements cl, qh, wi {
    private v field_D;
    private v field_M;
    private v field_I;
    private hl field_F;
    private v field_K;
    private hl field_O;
    private v field_J;
    private ua field_N;
    static String field_P;
    bd field_L;
    static int field_E;
    private dg field_H;
    private v field_G;

    private final String n(int param0) {
        if (param0 != 2716) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, byte param3, lk param4) {
        gl var7 = null;
        ck var8 = null;
        var8 = new ck(20, param1, param0 + 120, 25, param4, false, 120, 3, j.field_C, 16777215, param2);
        ((kl) this).b((lk) (Object) var8, (byte) 118);
        var7 = new gl(((of) param4).a(-108));
        ((kl) this).b((lk) (Object) var7, (byte) 118);
        if (param3 != -21) {
          return -4;
        } else {
          var7.a(15, (-15 + ((ck) var8).field_q >> -2023095551) + ((ck) var8).field_i, 15, 3 + (((ck) var8).field_h + ((ck) var8).field_o), true);
          return ((ck) var8).field_q;
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((kl) this).field_O.field_B = this.e((byte) 60);
    }

    public final void a(boolean param0) {
        ((hj) ((kl) this).field_D.a(109)).g(102);
        if (!param0) {
            kl.b(-18, 20, -112, 46, -45);
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (this.a(param0, (byte) -109, param2, param3)) {
          return true;
        } else {
          if (-99 != (param2 ^ -1)) {
            if (param2 == 99) {
              return ((kl) this).a(param3, (byte) -28);
            } else {
              if (param1 > -99) {
                ((kl) this).field_J = (v) null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            return ((kl) this).b(106, param3);
          }
        }
    }

    public final void a(int param0, int param1, byte param2, dg param3) {
        int var6 = 0;
        var6 = Main.field_T;
        if (param1 != -1) {
          if (-2 == param1) {
            he.a(0, "privacy.ws");
            if (param2 != 26) {
              ((kl) this).field_J = (v) null;
              return;
            } else {
              return;
            }
          } else {
            if (param1 == 2) {
              he.a(0, "conduct.ws");
              if (param2 != 26) {
                ((kl) this).field_J = (v) null;
                return;
              } else {
                return;
              }
            } else {
              if (param2 == 26) {
                return;
              } else {
                ((kl) this).field_J = (v) null;
                return;
              }
            }
          }
        } else {
          he.a(0, "terms.ws");
          if (param2 == 26) {
            return;
          } else {
            ((kl) this).field_J = (v) null;
            return;
          }
        }
    }

    private final boolean l(int param0) {
        if (!(this.e((byte) 38))) {
            return false;
        }
        if (param0 != 20) {
            kl.b(113, 1, -15, 15, -70);
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((kl) this).field_I.field_r);
        } catch (NumberFormatException numberFormatException) {
        }
        return oc.a(((kl) this).field_M.field_r, (kl) this, ((kl) this).field_D.field_r, ((kl) this).field_G.field_r, ((kl) this).field_N.field_D, param0 ^ 20, var2);
    }

    public static void m(int param0) {
        if (param0 != -23573) {
            return;
        }
        field_P = null;
    }

    private final boolean e(byte param0) {
        int var2 = 0;
        if (this.a(false, (of) (Object) ((kl) this).field_D)) {
          if (this.a(false, (of) (Object) ((kl) this).field_M)) {
            if (this.a(false, (of) (Object) ((kl) this).field_J)) {
              if (this.a(false, (of) (Object) ((kl) this).field_G)) {
                if (this.a(false, (of) (Object) ((kl) this).field_K)) {
                  if (!this.a(false, (of) (Object) ((kl) this).field_I)) {
                    return false;
                  } else {
                    var2 = 50 / ((param0 - -26) / 55);
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

    private final int a(String param0, int param1, lk param2, int param3, int param4) {
        int var7 = 95 % ((-3 - param3) / 53);
        ck var6 = new ck(20, param4, param1 + 120, 25, param2, false, 120, 3, j.field_C, 16777215, param0);
        ((kl) this).b((lk) (Object) var6, (byte) 118);
        return ((ck) var6).field_q;
    }

    public final void a(String param0, boolean param1) {
        v var3 = ((kl) this).field_D;
        String var4 = param0;
        ((hf) (Object) var3).a(var4, -18845, false);
        if (!param1) {
            kl.m(86);
            return;
        }
    }

    private final int a(lk param0, boolean param1, int param2, String param3, String param4, int param5) {
        String var8 = null;
        if (!param1) {
          var8 = (String) null;
          ((kl) this).a((String) null, true);
          return this.a(param0, param5, param4, param3, param2, 25, 35);
        } else {
          return this.a(param0, param5, param4, param3, param2, 25, 35);
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        var6 = 37 / ((param1 - -62) / 32);
        if (param3 != ((kl) this).field_F) {
          if (((kl) this).field_O == param3) {
            boolean discarded$2 = this.l(20);
            return;
          } else {
            return;
          }
        } else {
          a.d((byte) 63);
          return;
        }
    }

    private final boolean a(boolean param0, of param1) {
        ba var3 = null;
        sg var4 = null;
        ba stackIn_4_0 = null;
        ba stackIn_5_0 = null;
        ba stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ba stackOut_3_0 = null;
        ba stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ba stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var3 = ((of) param1).a(94);
        if (var3 == null) {
          return true;
        } else {
          L0: {
            stackOut_3_0 = (ba) var3;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param0) {
              stackOut_5_0 = (ba) (Object) stackIn_5_0;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = (ba) (Object) stackIn_4_0;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          var4 = ((ba) (Object) stackIn_6_0).a(stackIn_6_1 != 0);
          if (pe.field_b == var4) {
            return false;
          } else {
            if (tb.field_b == var4) {
              return false;
            } else {
              if (il.field_e != var4) {
                if (param0) {
                  String discarded$2 = this.d((byte) -121);
                  return true;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    private final String d(byte param0) {
        if (param0 != 62) {
            return (String) null;
        }
        return "</col></u>";
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Main.field_T;
          vj.d(param2, param1, param4 - -1, 10000536);
          vj.d(param2, param0 + param1, 1 + param4, 12105912);
          var5 = 1;
          if (param1 - -var5 < vj.field_h) {
            var5 = vj.field_h + -param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var6 = param0;
          if (vj.field_b >= param1 - -var6) {
            break L1;
          } else {
            var6 = vj.field_b - param1;
            break L1;
          }
        }
        if (param3 != 48) {
          return;
        } else {
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param0);
              var9 = var8 << 1064439248 | var8 << -478241528 | var8;
              vj.field_j[(var7 + param1) * vj.field_l + param2] = var9;
              vj.field_j[param2 + (var7 + param1) * vj.field_l - -param4] = var9;
              var7++;
              continue L2;
            }
          }
        }
    }

    private final int a(lk param0, int param1, String param2, String param3, int param4, int param5, int param6) {
        ck var10 = new ck(20, param4, param1 + 120, param5, param0, false, 120, 3, j.field_C, 16777215, param3);
        ((kl) this).b((lk) (Object) var10, (byte) 118);
        pa var9 = new pa(((of) param0).a(-125), param2, 126, ((ck) var10).field_q + param4, 50 + param1, param6);
        var9.field_k = (pl) this;
        ((kl) this).b((lk) (Object) var9, (byte) 118);
        return ((pa) var9).field_q + ((ck) var10).field_q;
    }

    public kl() {
        super(0, 0, 496, 0, (ci) null);
        ((kl) this).field_D = new v("", (pl) null, 12);
        ((kl) this).field_M = new v("", (pl) null, 100);
        ((kl) this).field_J = new v("", (pl) null, 100);
        ((kl) this).field_G = new v("", (pl) null, 20);
        ((kl) this).field_K = new v("", (pl) null, 20);
        ((kl) this).field_I = new v("", (pl) null, 3);
        int var1 = 1;
        ((kl) this).field_N = new ua("", (pl) null, var1 != 0);
        ((kl) this).field_O = new hl(qk.field_h, (pl) null);
        ((kl) this).field_F = new hl(dl.field_j, (pl) null);
        ((kl) this).field_D.field_n = re.field_h;
        ((kl) this).field_M.field_n = pf.field_g;
        ((kl) this).field_J.field_n = te.field_b;
        ((kl) this).field_G.field_n = db.field_f;
        ((kl) this).field_K.field_n = ja.field_c;
        ((kl) this).field_I.field_n = cc.field_b;
        ((kl) this).field_N.field_n = nc.field_c;
        ((kl) this).field_D.a((byte) 68, (ba) (Object) new hj((hf) (Object) ((kl) this).field_D));
        ((kl) this).field_M.a((byte) 68, (ba) (Object) new rd((hf) (Object) ((kl) this).field_M));
        ((kl) this).field_J.a((byte) 68, (ba) (Object) new p((hf) (Object) ((kl) this).field_J, (hf) (Object) ((kl) this).field_M));
        ((kl) this).field_G.a((byte) 68, (ba) (Object) new mk((hf) (Object) ((kl) this).field_G, (hf) (Object) ((kl) this).field_D, (hf) (Object) ((kl) this).field_M));
        ((kl) this).field_K.a((byte) 68, (ba) (Object) new fg((hf) (Object) ((kl) this).field_K, (hf) (Object) ((kl) this).field_G));
        ((kl) this).field_I.a((byte) 68, (ba) (Object) new ai((hf) (Object) ((kl) this).field_I));
        ((kl) this).field_O.field_B = false;
        ((kl) this).field_O.field_v = (ci) (Object) new ki();
        ((kl) this).field_F.field_v = (ci) (Object) new nb();
        ((kl) this).field_D.field_v = (ci) (Object) new r(10000536);
        ((kl) this).field_J.field_v = (ci) (Object) new r(10000536);
        ((kl) this).field_M.field_v = (ci) (Object) new r(10000536);
        ((kl) this).field_I.field_v = (ci) (Object) new r(10000536);
        ((kl) this).field_N.field_v = (ci) (Object) new tg();
        ((kl) this).field_K.field_v = (ci) (Object) new rl(10000536);
        ((kl) this).field_G.field_v = (ci) (Object) new rl(10000536);
        String var2 = re.a(lk.field_t, new String[2], (byte) -50);
        int var3 = 20;
        var3 = var3 + this.a(cf.field_a, 170, (lk) (Object) ((kl) this).field_M, -74, var3);
        var3 = var3 + (5 + this.a((lk) (Object) ((kl) this).field_J, 170, "", mb.field_b, var3, 25, 20));
        var3 = var3 + this.a(fl.field_b, 170, (lk) (Object) ((kl) this).field_G, -96, var3);
        var3 = var3 + (this.a((lk) (Object) ((kl) this).field_K, true, var3, hk.field_c, mc.field_a, 170) + 5);
        var3 = var3 + (this.a((lk) (Object) ((kl) this).field_D, true, var3, mj.field_a, pk.field_c, 170) - -5);
        var3 = var3 + this.a(170, var3, th.field_b, (byte) -21, (lk) (Object) ((kl) this).field_I);
        ck var4 = new ck(46, var3, -90 + ((kl) this).field_h, 25, (lk) (Object) ((kl) this).field_N, true, -120 + ((kl) this).field_h, 5, me.field_c, 11579568, Main.field_M);
        ((kl) this).b((lk) (Object) var4, (byte) 118);
        var3 = var3 + ((ck) var4).field_q;
        ek var5 = new ek(j.field_C, 0, 0, 0, 0, 16777215, -1, 0, 0, j.field_C.field_s, -1, 2147483647, true);
        ((kl) this).field_H = new dg(var2, (ci) (Object) var5);
        ((kl) this).field_H.field_n = "";
        ((kl) this).field_H.a(ni.field_b, (byte) -117, 0);
        ((kl) this).field_H.a(ni.field_b, (byte) 52, 1);
        ((kl) this).field_H.field_k = (pl) this;
        ((kl) this).field_H.b(-63, ((kl) this).field_h - 90, 46, var3);
        var3 = var3 + (15 + ((kl) this).field_H.field_q);
        ((kl) this).b((lk) (Object) ((kl) this).field_H, (byte) 118);
        int var6 = 4;
        int var7 = 200;
        ((kl) this).field_O.a(40, var3, var7, -var7 + 496 >> 156031425, true);
        ((kl) this).field_F.a(40, var3 - -15, 60, 3 + var6, true);
        ((kl) this).field_F.field_k = (pl) this;
        ((kl) this).field_O.field_k = (pl) this;
        ((kl) this).b((lk) (Object) ((kl) this).field_O, (byte) 118);
        ((kl) this).b((lk) (Object) ((kl) this).field_F, (byte) 118);
        ((kl) this).field_L = new bd((wi) this);
        ((kl) this).field_L.a(150, 20 + ((kl) this).field_D.field_i, -60 + (-((kl) this).field_D.field_h + ((kl) this).field_h - ((kl) this).field_D.field_o), ((kl) this).field_D.field_h + ((kl) this).field_D.field_o + 60, true);
        ((kl) this).b((lk) (Object) ((kl) this).field_L, (byte) 118);
        ((kl) this).a(var6 + (var3 - -55), 0, 496, 0, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Names cannot start or end with space or underscore";
    }
}
