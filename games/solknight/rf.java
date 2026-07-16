/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends ki implements re, ka, ge {
    private tg field_L;
    private kj field_J;
    static String field_E;
    private qb field_K;
    private qb field_S;
    private pj field_R;
    static String[] field_H;
    private qb field_O;
    static String[] field_Q;
    static String[] field_N;
    private pj field_D;
    private qb field_I;
    private qb field_P;
    ua field_G;
    private qb field_M;
    static String field_F;

    final static int b(int param0, int param1, boolean param2, int param3) {
        if (param1 != 16711935) {
          if (param0 == 20) {
            if (param1 == 0) {
              if (!param2) {
                param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
                return param1 << 8 * param3;
              } else {
                return param1;
              }
            } else {
              param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
              return param1 << 8 * param3;
            }
          } else {
            return 75;
          }
        } else {
          if (!param2) {
            if (param0 == 20) {
              if (param1 == 0) {
                if (param2) {
                  return param1;
                } else {
                  param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
                  return param1 << 8 * param3;
                }
              } else {
                param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
                return param1 << 8 * param3;
              }
            } else {
              return 75;
            }
          } else {
            return param1;
          }
        }
    }

    private final String g(boolean param0) {
        if (param0) {
            ((rf) this).field_K = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean f(boolean param0) {
        Object var3 = null;
        if (!param0) {
          if (this.a((wj) (Object) ((rf) this).field_P, (byte) 114)) {
            if (this.a((wj) (Object) ((rf) this).field_I, (byte) 96)) {
              if (this.a((wj) (Object) ((rf) this).field_M, (byte) 113)) {
                if (this.a((wj) (Object) ((rf) this).field_O, (byte) 105)) {
                  if (this.a((wj) (Object) ((rf) this).field_K, (byte) 121)) {
                    if (!this.a((wj) (Object) ((rf) this).field_S, (byte) 90)) {
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
          int discarded$1 = this.a((String) null, -93, (byte) 14, (rc) null, -14);
          if (this.a((wj) (Object) ((rf) this).field_P, (byte) 114)) {
            if (this.a((wj) (Object) ((rf) this).field_I, (byte) 96)) {
              if (this.a((wj) (Object) ((rf) this).field_M, (byte) 113)) {
                if (this.a((wj) (Object) ((rf) this).field_O, (byte) 105)) {
                  if (this.a((wj) (Object) ((rf) this).field_K, (byte) 121)) {
                    if (!this.a((wj) (Object) ((rf) this).field_S, (byte) 90)) {
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

    private final int a(int param0, int param1, rc param2, String param3, String param4, int param5) {
        if (param1 != 35) {
            return -87;
        }
        return this.a((byte) 91, param0, 35, param5, param3, param4, param2);
    }

    final static void h(int param0) {
        h.a(17, true);
        if (param0 != 15) {
            field_N = null;
        }
    }

    public final void a(int param0, int param1, int param2, kj param3) {
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        if (param1 != 0) {
          if (1 == param1) {
            ud.a(11692, "privacy.ws");
            if (param2 != 50) {
              ((rf) this).field_R = null;
              return;
            } else {
              return;
            }
          } else {
            if (-3 != (param1 ^ -1)) {
              if (param2 != 50) {
                ((rf) this).field_R = null;
                return;
              } else {
                return;
              }
            } else {
              ud.a(11692, "conduct.ws");
              if (param2 == 50) {
                return;
              } else {
                ((rf) this).field_R = null;
                return;
              }
            }
          }
        } else {
          ud.a(11692, "terms.ws");
          if (param2 == 50) {
            return;
          } else {
            ((rf) this).field_R = null;
            return;
          }
        }
    }

    public rf() {
        super(0, 0, 496, 0, (j) null);
        ((rf) this).field_P = new qb("", (dg) null, 12);
        ((rf) this).field_I = new qb("", (dg) null, 100);
        ((rf) this).field_M = new qb("", (dg) null, 100);
        ((rf) this).field_O = new qb("", (dg) null, 20);
        ((rf) this).field_K = new qb("", (dg) null, 20);
        ((rf) this).field_S = new qb("", (dg) null, 3);
        int var1 = 1;
        ((rf) this).field_L = new tg("", (dg) null, var1 != 0);
        ((rf) this).field_R = new pj(qg.field_b, (dg) null);
        ((rf) this).field_D = new pj(mf.field_F, (dg) null);
        ((rf) this).field_P.field_z = ql.field_u;
        ((rf) this).field_I.field_z = qh.field_d;
        ((rf) this).field_M.field_z = pj.field_G;
        ((rf) this).field_O.field_z = kj.field_K;
        ((rf) this).field_K.field_z = wi.field_k;
        ((rf) this).field_S.field_z = oa.field_i;
        ((rf) this).field_L.field_z = wi.field_h;
        ((rf) this).field_P.a((oe) (Object) new df((vg) (Object) ((rf) this).field_P), false);
        ((rf) this).field_I.a((oe) (Object) new dc((vg) (Object) ((rf) this).field_I), false);
        ((rf) this).field_M.a((oe) (Object) new qa((vg) (Object) ((rf) this).field_M, (vg) (Object) ((rf) this).field_I), false);
        ((rf) this).field_O.a((oe) (Object) new uk((vg) (Object) ((rf) this).field_O, (vg) (Object) ((rf) this).field_P, (vg) (Object) ((rf) this).field_I), false);
        ((rf) this).field_K.a((oe) (Object) new el((vg) (Object) ((rf) this).field_K, (vg) (Object) ((rf) this).field_O), false);
        ((rf) this).field_S.a((oe) (Object) new cl((vg) (Object) ((rf) this).field_S), false);
        ((rf) this).field_R.field_B = false;
        ((rf) this).field_R.field_w = (j) (Object) new gh();
        ((rf) this).field_D.field_w = (j) (Object) new ri();
        ((rf) this).field_P.field_w = (j) (Object) new uf(10000536);
        uf dupTemp$0 = new uf(10000536);
        ((rf) this).field_M.field_w = (j) (Object) dupTemp$0;
        ((rf) this).field_I.field_w = (j) (Object) dupTemp$0;
        ((rf) this).field_S.field_w = (j) (Object) new uf(10000536);
        ((rf) this).field_L.field_w = (j) (Object) new pb();
        bg dupTemp$1 = new bg(10000536);
        ((rf) this).field_K.field_w = (j) (Object) dupTemp$1;
        ((rf) this).field_O.field_w = (j) (Object) dupTemp$1;
        String var2 = bb.a(rk.field_a, new String[2], -63);
        int var3 = 20;
        var3 = var3 + this.a(el.field_j, var3, (byte) 119, (rc) (Object) ((rf) this).field_I, 170);
        var3 = var3 + (5 + this.a((byte) 91, var3, 20, 170, "", rj.field_a, (rc) (Object) ((rf) this).field_M));
        var3 = var3 + this.a(ld.field_O, var3, (byte) 44, (rc) (Object) ((rf) this).field_O, 170);
        var3 = var3 + (this.a(var3, 35, (rc) (Object) ((rf) this).field_K, uc.field_d, pk.field_X, 170) - -5);
        var3 = var3 + (this.a(var3, 35, (rc) (Object) ((rf) this).field_P, uc.field_k, eb.field_a, 170) - -5);
        var3 = var3 + this.a(var3, (rc) (Object) ((rf) this).field_S, 170, cb.field_b, true);
        ke var4 = new ke(46, var3, -90 + ((rf) this).field_t, 25, (rc) (Object) ((rf) this).field_L, true, ((rf) this).field_t - 120, 5, jh.field_g, 11579568, h.field_e);
        ((rf) this).a((rc) (Object) var4, 5411);
        var3 = var3 + var4.field_x;
        af var5 = new af(ua.field_G, 0, 0, 0, 0, 16777215, -1, 0, 0, ua.field_G.field_F, -1, 2147483647, true);
        ((rf) this).field_J = new kj(var2, (j) (Object) var5);
        ((rf) this).field_J.field_z = "";
        ((rf) this).field_J.a(0, mj.field_a, 1);
        ((rf) this).field_J.a(1, mj.field_a, 1);
        ((rf) this).field_J.field_n = (dg) this;
        ((rf) this).field_J.b(46, var3, 1, ((rf) this).field_t + -90);
        var3 = var3 + (15 + ((rf) this).field_J.field_x);
        ((rf) this).a((rc) (Object) ((rf) this).field_J, 5411);
        int var6 = 4;
        int var7 = 200;
        ((rf) this).field_R.b(40, var7, 496 + -var7 >> -1595769247, 0, var3);
        ((rf) this).field_D.b(40, 60, 3 + var6, 0, var3 + 15);
        ((rf) this).field_D.field_n = (dg) this;
        ((rf) this).field_R.field_n = (dg) this;
        ((rf) this).a((rc) (Object) ((rf) this).field_R, 5411);
        ((rf) this).a((rc) (Object) ((rf) this).field_D, 5411);
        ((rf) this).field_G = new ua((ge) this);
        ((rf) this).field_G.b(150, -((rf) this).field_P.field_t + ((rf) this).field_t - ((rf) this).field_P.field_m + -60, ((rf) this).field_P.field_t + (((rf) this).field_P.field_m + 60), 0, ((rf) this).field_P.field_j + 20);
        ((rf) this).a((rc) (Object) ((rf) this).field_G, 5411);
        ((rf) this).b(var3 - (-55 - var6), 496, 0, 0, 0);
    }

    public final void a(byte param0) {
        ((df) (Object) ((rf) this).field_P.a(param0 + 95)).a(true);
        if (param0 != 22) {
            field_H = null;
        }
    }

    public static void e(boolean param0) {
        field_E = null;
        if (param0) {
          rf.e(false);
          field_Q = null;
          field_N = null;
          field_H = null;
          field_F = null;
          return;
        } else {
          field_Q = null;
          field_N = null;
          field_H = null;
          field_F = null;
          return;
        }
    }

    private final boolean i(int param0) {
        if (param0 != 11608) {
            return false;
        }
        if (!this.f(false)) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((rf) this).field_S.field_i);
        } catch (NumberFormatException numberFormatException) {
        }
        return nf.a(var2, ((rf) this).field_L.field_F, ((rf) this).field_I.field_i, ((rf) this).field_P.field_i, (rf) this, ((rf) this).field_O.field_i, (byte) 118);
    }

    private final int a(byte param0, int param1, int param2, int param3, String param4, String param5, rc param6) {
        pk var9 = null;
        Object var10 = null;
        ke var11 = null;
        var11 = new ke(20, param1, 120 + param3, 25, param6, false, 120, 3, ua.field_G, 16777215, param5);
        ((rf) this).a((rc) (Object) var11, 5411);
        var9 = new pk(((wj) (Object) param6).a(56), param4, 126, param1 - -var11.field_x, param3 + 50, param2);
        var9.field_n = (dg) this;
        ((rf) this).a((rc) (Object) var9, param0 + 5320);
        if (param0 != 91) {
          var10 = null;
          boolean discarded$2 = ((rf) this).a('|', (byte) -62, -94, (rc) null);
          return var11.field_x + var9.field_x;
        } else {
          return var11.field_x + var9.field_x;
        }
    }

    private final int a(String param0, int param1, byte param2, rc param3, int param4) {
        ke var6 = null;
        Object var7 = null;
        if (param2 <= 29) {
          var7 = null;
          int discarded$1 = this.a((String) null, 47, (byte) 87, (rc) null, -94);
          var6 = new ke(20, param1, 120 - -param4, 25, param3, false, 120, 3, ua.field_G, 16777215, param0);
          ((rf) this).a((rc) (Object) var6, 5411);
          return var6.field_x;
        } else {
          var6 = new ke(20, param1, 120 - -param4, 25, param3, false, 120, 3, ua.field_G, 16777215, param0);
          ((rf) this).a((rc) (Object) var6, 5411);
          return var6.field_x;
        }
    }

    private final boolean a(wj param0, byte param1) {
        oe var3 = null;
        qf var4 = null;
        var3 = param0.a(93);
        if (var3 == null) {
          return true;
        } else {
          if (param1 >= 87) {
            var4 = var3.b(-9362);
            if (rg.field_f == var4) {
              return false;
            } else {
              if (var4 == hg.field_E) {
                return false;
              } else {
                if (var4 == rd.field_b) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          } else {
            field_Q = null;
            var4 = var3.b(-9362);
            if (rg.field_f == var4) {
              return false;
            } else {
              if (var4 == hg.field_E) {
                return false;
              } else {
                if (var4 == rd.field_b) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    private final int a(int param0, rc param1, int param2, String param3, boolean param4) {
        kc var7 = null;
        ke var8 = null;
        var8 = new ke(20, param0, 120 - -param2, 25, param1, false, 120, 3, ua.field_G, 16777215, param3);
        ((rf) this).a((rc) (Object) var8, 5411);
        var7 = new kc(((wj) (Object) param1).a(86));
        ((rf) this).a((rc) (Object) var7, 5411);
        if (!param4) {
          return -52;
        } else {
          var7.b(15, 15, var8.field_t + var8.field_m + 3, 0, (var8.field_x - 15 >> -1903468927) + var8.field_j);
          return var8.field_x;
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 0;
        if (super.a(param0, (byte) 125, param2, param3)) {
          return true;
        } else {
          if (-99 != (param2 ^ -1)) {
            if (99 == param2) {
              return ((rf) this).b(117, param3);
            } else {
              var5 = -101 % ((param1 - 31) / 56);
              return false;
            }
          } else {
            return ((rf) this).a((byte) -123, param3);
          }
        }
    }

    private final String j(int param0) {
        if (param0 != 99) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        Object var7 = null;
        if (((rf) this).field_D == param3) {
          ig.a((byte) -79);
          if (param4) {
            return;
          } else {
            var7 = null;
            ((rf) this).a(61, -5, -28, (kj) null);
            return;
          }
        } else {
          if (((rf) this).field_R != param3) {
            if (!param4) {
              var7 = null;
              ((rf) this).a(61, -5, -28, (kj) null);
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$3 = this.i(11608);
            if (param4) {
              return;
            } else {
              var7 = null;
              ((rf) this).a(61, -5, -28, (kj) null);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        super.a(param0, param1, param2, param3);
        ((rf) this).field_R.field_B = this.f(false);
    }

    public final void a(boolean param0, String param1) {
        qb var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((rf) this).field_P;
        var4 = param1;
        if (!param0) {
          var5 = null;
          boolean discarded$2 = ((rf) this).a('`', (byte) -72, -5, (rc) null);
          ((vg) (Object) var3).a(109, false, var4);
          return;
        } else {
          ((vg) (Object) var3).a(109, false, var4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Unpacking music";
        field_N = new String[]{"Divide into multiple warheads in proximity to a target.", "Fly towards the mouse pointer for the first two seconds of flight.", "Slow to fire but explode damaging everything in a large radius near by.", "Fires very quickly but not too powerful. Focus on the important asteroids only.", "Can shoot through small asteroids and damage multiple targets. Target the centre of the asteroid for maximum damage.", "Fires streams of bolts before recharging.  The bolts home in on the mouse cursor at high speed.", "Takes a short time to charge before firing where you cannot move the gun. The beam causes massive damage to everything it hits."};
        field_H = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_Q = new String[]{"TODO Summary page of the goal and control mechanism.", "TODO Full controls.", "TODO Objective and/or plot. May want to go from this page to tutorial."};
    }
}
