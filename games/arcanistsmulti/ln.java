/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends df implements pj, vb, ro {
    static String field_L;
    static String field_R;
    private bi field_K;
    static int field_J;
    static int[] field_M;
    static String field_T;
    static cn field_U;
    private bi field_P;
    li field_G;
    private bi field_D;
    private ej field_S;
    static String field_Q;
    private ag field_O;
    private ag field_C;
    static byte[][] field_I;
    private bi field_H;
    private bi field_N;
    private bk field_F;
    private bi field_E;

    private final boolean a(int param0, el param1) {
        pd var3 = null;
        eh var4 = null;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        if (param0 >= 43) {
          var3 = param1.a(0);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a(-83);
            if (var4 == ra.field_k) {
              return false;
            } else {
              if (var4 == da.field_f) {
                return false;
              } else {
                L0: {
                  if (cg.field_Wb == var4) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                return stackIn_23_0 != 0;
              }
            }
          }
        } else {
          ((ln) this).field_F = null;
          var3 = param1.a(0);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a(-83);
            if (var4 == ra.field_k) {
              return false;
            } else {
              if (var4 != da.field_f) {
                if (cg.field_Wb != var4) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    public static void g(int param0) {
        field_I = null;
        int var1 = -76 / ((68 - param0) / 58);
        field_U = null;
        field_L = null;
        field_T = null;
        field_Q = null;
        field_R = null;
        field_M = null;
    }

    private final boolean h(int param0) {
        if (param0 == 0) {
          if (this.a(118, (el) (Object) ((ln) this).field_K)) {
            if (this.a(param0 + 91, (el) (Object) ((ln) this).field_N)) {
              if (this.a(99, (el) (Object) ((ln) this).field_D)) {
                if (this.a(72, (el) (Object) ((ln) this).field_P)) {
                  if (this.a(94, (el) (Object) ((ln) this).field_E)) {
                    if (!this.a(80, (el) (Object) ((ln) this).field_H)) {
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
          ((ln) this).field_D = null;
          if (this.a(118, (el) (Object) ((ln) this).field_K)) {
            if (this.a(param0 + 91, (el) (Object) ((ln) this).field_N)) {
              if (this.a(99, (el) (Object) ((ln) this).field_D)) {
                if (this.a(72, (el) (Object) ((ln) this).field_P)) {
                  if (this.a(94, (el) (Object) ((ln) this).field_E)) {
                    if (!this.a(80, (el) (Object) ((ln) this).field_H)) {
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

    private final int a(int param0, qm param1, String param2, int param3, int param4, String param5) {
        int var7 = 34 % ((41 - param3) / 45);
        return this.a(param2, param1, 25, 35, param4, param5, param0);
    }

    private final String g(byte param0) {
        if (param0 != 34) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(String param0, int param1) {
        bi var3 = null;
        String var4 = null;
        var3 = ((ln) this).field_K;
        if (param1 != 90) {
          field_T = null;
          var4 = param0;
          ((rn) (Object) var3).a(false, var4, false);
          return;
        } else {
          var4 = param0;
          ((rn) (Object) var3).a(false, var4, false);
          return;
        }
    }

    public ln() {
        super(0, 0, 496, 0, (pf) null);
        ((ln) this).field_K = new bi("", (wc) null, 12);
        ((ln) this).field_N = new bi("", (wc) null, 100);
        ((ln) this).field_D = new bi("", (wc) null, 100);
        ((ln) this).field_P = new bi("", (wc) null, 20);
        ((ln) this).field_E = new bi("", (wc) null, 20);
        ((ln) this).field_H = new bi("", (wc) null, 3);
        int var1 = 1;
        ((ln) this).field_F = new bk("", (wc) null, var1 != 0);
        ((ln) this).field_C = new ag(wm.field_G, (wc) null);
        ((ln) this).field_O = new ag(kn.field_rb, (wc) null);
        ((ln) this).field_K.field_q = eh.field_b;
        ((ln) this).field_N.field_q = jk.field_s;
        ((ln) this).field_D.field_q = dn.field_Fb;
        ((ln) this).field_P.field_q = ao.field_c;
        ((ln) this).field_E.field_q = nk.field_j;
        ((ln) this).field_H.field_q = lc.field_k;
        ((ln) this).field_F.field_q = ce.field_l;
        ((ln) this).field_K.a((pd) (Object) new dg((rn) (Object) ((ln) this).field_K), (byte) 18);
        ((ln) this).field_N.a((pd) (Object) new ki((rn) (Object) ((ln) this).field_N), (byte) -127);
        ((ln) this).field_D.a((pd) (Object) new ja((rn) (Object) ((ln) this).field_D, (rn) (Object) ((ln) this).field_N), (byte) -128);
        ((ln) this).field_P.a((pd) (Object) new ui((rn) (Object) ((ln) this).field_P, (rn) (Object) ((ln) this).field_K, (rn) (Object) ((ln) this).field_N), (byte) -127);
        ((ln) this).field_E.a((pd) (Object) new mn((rn) (Object) ((ln) this).field_E, (rn) (Object) ((ln) this).field_P), (byte) -128);
        ((ln) this).field_H.a((pd) (Object) new lo((rn) (Object) ((ln) this).field_H), (byte) 39);
        ((ln) this).field_C.field_B = false;
        ((ln) this).field_C.field_r = (pf) (Object) new mm();
        ((ln) this).field_O.field_r = (pf) (Object) new gm();
        ((ln) this).field_K.field_r = (pf) (Object) new ib(10000536);
        ((ln) this).field_D.field_r = (pf) (Object) new ib(10000536);
        ((ln) this).field_N.field_r = (pf) (Object) new ib(10000536);
        ((ln) this).field_H.field_r = (pf) (Object) new ib(10000536);
        ((ln) this).field_F.field_r = (pf) (Object) new ii();
        ((ln) this).field_E.field_r = (pf) (Object) new tc(10000536);
        ((ln) this).field_P.field_r = (pf) (Object) new tc(10000536);
        String var2 = tj.a(-23, new String[2], fn.field_d);
        int var3 = 20;
        var3 = var3 + this.a((qm) (Object) ((ln) this).field_N, bk.field_K, var3, 170, 109);
        var3 = var3 + (5 + this.a("", (qm) (Object) ((ln) this).field_D, 25, 20, 170, dn.field_Gb, var3));
        var3 = var3 + this.a((qm) (Object) ((ln) this).field_P, eh.field_a, var3, 170, 126);
        var3 = var3 + (5 + this.a(var3, (qm) (Object) ((ln) this).field_E, rm.field_p, 99, 170, le.field_A));
        var3 = var3 + (5 + this.a(var3, (qm) (Object) ((ln) this).field_K, bj.field_kb, -67, 170, ch.field_h));
        var3 = var3 + this.a(ka.field_n, (qm) (Object) ((ln) this).field_H, (byte) -71, 170, var3);
        ke var4 = new ke(46, var3, ((ln) this).field_v - 90, 25, (qm) (Object) ((ln) this).field_F, true, ((ln) this).field_v - 120, 5, vc.field_e, 11579568, rj.field_c);
        ((ln) this).c(-114, (qm) (Object) var4);
        var3 = var3 + var4.field_k;
        jm var5 = new jm(ia.field_c, 0, 0, 0, 0, 16777215, -1, 0, 0, ia.field_c.field_C, -1, 2147483647, true);
        ((ln) this).field_S = new ej(var2, (pf) (Object) var5);
        ((ln) this).field_S.field_q = "";
        ((ln) this).field_S.a(0, 0, mm.field_s);
        ((ln) this).field_S.a(1, 0, mm.field_s);
        ((ln) this).field_S.field_o = (wc) this;
        ((ln) this).field_S.a(46, (byte) -4, ((ln) this).field_v + -90, var3);
        var3 = var3 + (((ln) this).field_S.field_k - -15);
        ((ln) this).c(-66, (qm) (Object) ((ln) this).field_S);
        int var6 = 4;
        int var7 = 200;
        ((ln) this).field_C.a(40, var3, var7, -var7 + 496 >> -746238655, -87);
        ((ln) this).field_O.a(40, 15 + var3, 60, 3 + var6, -100);
        ((ln) this).field_O.field_o = (wc) this;
        ((ln) this).field_C.field_o = (wc) this;
        ((ln) this).c(-85, (qm) (Object) ((ln) this).field_C);
        ((ln) this).c(-96, (qm) (Object) ((ln) this).field_O);
        ((ln) this).field_G = new li((ro) this);
        ((ln) this).field_G.a(150, ((ln) this).field_K.field_j + 20, -60 + (((ln) this).field_v + (-((ln) this).field_K.field_n - ((ln) this).field_K.field_v)), 60 + (((ln) this).field_K.field_n + ((ln) this).field_K.field_v), -127);
        ((ln) this).c(-99, (qm) (Object) ((ln) this).field_G);
        ((ln) this).a(var3 - (-55 + -var6), 0, 496, 0, -107);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (param0) {
          if (((ln) this).field_O != param4) {
            if (((ln) this).field_C != param4) {
              return;
            } else {
              boolean discarded$4 = this.a(-48);
              return;
            }
          } else {
            ba.a(110);
            return;
          }
        } else {
          field_M = null;
          if (((ln) this).field_O != param4) {
            if (((ln) this).field_C != param4) {
              return;
            } else {
              boolean discarded$5 = this.a(-48);
              return;
            }
          } else {
            ba.a(110);
            return;
          }
        }
    }

    private final boolean a(int param0) {
        if (!(this.h(0))) {
            return false;
        }
        int var2 = -73 / ((72 - param0) / 40);
        int var3 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var3 = Integer.parseInt(((ln) this).field_H.field_g);
        } catch (NumberFormatException numberFormatException) {
        }
        return bb.a(((ln) this).field_P.field_g, ((ln) this).field_K.field_g, var3, (ln) this, -30001, ((ln) this).field_N.field_g, ((ln) this).field_F.field_z);
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        if (!this.a(param0, (byte) -121, param2, param3)) {
          if (param1 <= -120) {
            if (param3 != 98) {
              if (param3 == 99) {
                return ((ln) this).b(2, param0);
              } else {
                return false;
              }
            } else {
              return ((ln) this).a(param0, 9555);
            }
          } else {
            ((ln) this).field_O = null;
            if (param3 != 98) {
              if (param3 == 99) {
                return ((ln) this).b(2, param0);
              } else {
                return false;
              }
            } else {
              return ((ln) this).a(param0, 9555);
            }
          }
        } else {
          return true;
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((ln) this).field_C.field_B = this.h(0);
    }

    public final void a(int param0, ej param1, int param2, int param3) {
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 != param3) {
          if (1 == param3) {
            uh.a(126, "privacy.ws");
            if (param2 != -1607) {
              ((ln) this).field_P = null;
              return;
            } else {
              return;
            }
          } else {
            if ((param3 ^ -1) == -3) {
              uh.a(127, "conduct.ws");
              if (param2 != -1607) {
                ((ln) this).field_P = null;
                return;
              } else {
                return;
              }
            } else {
              if (param2 == -1607) {
                return;
              } else {
                ((ln) this).field_P = null;
                return;
              }
            }
          }
        } else {
          uh.a(param2 + 1734, "terms.ws");
          if (param2 == -1607) {
            return;
          } else {
            ((ln) this).field_P = null;
            return;
          }
        }
    }

    private final String e(boolean param0) {
        if (param0) {
            return null;
        }
        return "</col></u>";
    }

    private final int a(String param0, qm param1, int param2, int param3, int param4, String param5, int param6) {
        ke var10 = new ke(20, param6, 120 - -param4, param2, param1, false, 120, 3, ia.field_c, 16777215, param5);
        ((ln) this).c(-75, (qm) (Object) var10);
        sc var9 = new sc(((el) (Object) param1).a(0), param0, 126, param6 + var10.field_k, param4 - -50, param3);
        var9.field_o = (wc) this;
        ((ln) this).c(-127, (qm) (Object) var9);
        return var9.field_k + var10.field_k;
    }

    public final void a(byte param0) {
        if (param0 != -7) {
            return;
        }
        ((dg) (Object) ((ln) this).field_K.a(0)).e(126);
    }

    private final int a(String param0, qm param1, byte param2, int param3, int param4) {
        mk var7 = null;
        ke var8 = null;
        var8 = new ke(20, param4, param3 + 120, 25, param1, false, 120, 3, ia.field_c, 16777215, param0);
        if (param2 != -71) {
          return 93;
        } else {
          ((ln) this).c(param2 ^ 13, (qm) (Object) var8);
          var7 = new mk(((el) (Object) param1).a(0));
          ((ln) this).c(-94, (qm) (Object) var7);
          var7.a(15, var8.field_j + (-15 + var8.field_k >> -500800383), 15, 3 + var8.field_v + var8.field_n, param2 + -48);
          return var8.field_k;
        }
    }

    private final int a(qm param0, String param1, int param2, int param3, int param4) {
        ke var6 = null;
        if (param4 <= 97) {
          String discarded$1 = this.g((byte) -39);
          var6 = new ke(20, param2, param3 + 120, 25, param0, false, 120, 3, ia.field_c, 16777215, param1);
          ((ln) this).c(-66, (qm) (Object) var6);
          return var6.field_k;
        } else {
          var6 = new ke(20, param2, param3 + 120, 25, param0, false, 120, 3, ia.field_c, 16777215, param1);
          ((ln) this).c(-66, (qm) (Object) var6);
          return var6.field_k;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Accept";
        field_T = "Add friend";
        field_J = -1;
        field_L = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
