/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends lc implements ki, rc, rf {
    private vc field_L;
    private ti field_A;
    private wd field_D;
    private ti field_C;
    private ti field_F;
    static int[] field_I;
    private ff field_G;
    private ti field_E;
    private wd field_K;
    private ti field_J;
    private ti field_B;
    static int field_H;
    nd field_z;

    private final int a(lk param0, String param1, int param2, int param3, int param4) {
        hb var6 = new hb(20, param2, param3 + param4, 25, param0, false, 120, 3, sg.field_a, 16777215, param1);
        ((gh) this).b((lk) (Object) var6, true);
        return var6.field_m;
    }

    public final void a(vc param0, byte param1, int param2, int param3) {
        int var6 = 0;
        var6 = Bounce.field_N;
        if (param3 != 0) {
          if (param3 == 1) {
            eh.a("privacy.ws", (byte) 21);
            if (param1 != 125) {
              ((gh) this).field_A = null;
              return;
            } else {
              return;
            }
          } else {
            if (2 != param3) {
              if (param1 != 125) {
                ((gh) this).field_A = null;
                return;
              } else {
                return;
              }
            } else {
              eh.a("conduct.ws", (byte) 21);
              if (param1 == 125) {
                return;
              } else {
                ((gh) this).field_A = null;
                return;
              }
            }
          }
        } else {
          eh.a("terms.ws", (byte) 21);
          if (param1 == 125) {
            return;
          } else {
            ((gh) this).field_A = null;
            return;
          }
        }
    }

    private final boolean a(wc param0, int param1) {
        uh var3 = null;
        vf var4 = null;
        if (param1 == -5389) {
          var3 = param0.a(true);
          if (var3 != null) {
            var4 = var3.a((byte) 123);
            if (var4 != a.field_e) {
              if (var4 == ui.field_o) {
                return false;
              } else {
                if (var4 == ha.field_l) {
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
        } else {
          gh.b(true);
          var3 = param0.a(true);
          if (var3 != null) {
            var4 = var3.a((byte) 123);
            if (var4 != a.field_e) {
              if (var4 == ui.field_o) {
                return false;
              } else {
                if (var4 == ha.field_l) {
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
    }

    private final String e(byte param0) {
        if (param0 <= 3) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        if (param0 > 6) {
          if (param4 != ((gh) this).field_K) {
            if (param4 != ((gh) this).field_D) {
              return;
            } else {
              boolean discarded$2 = this.l(80);
              return;
            }
          } else {
            oh.b(true);
            return;
          }
        } else {
          return;
        }
    }

    private final int a(String param0, String param1, int param2, lk param3, byte param4, int param5, int param6) {
        s var9 = null;
        hb var10 = null;
        var10 = new hb(20, param6, 120 - -param2, 25, param3, false, 120, 3, sg.field_a, 16777215, param1);
        ((gh) this).b((lk) (Object) var10, true);
        var9 = new s(((wc) (Object) param3).a(true), param0, 126, param6 + var10.field_m, param2 + 50, param5);
        if (param4 != -123) {
          ((gh) this).field_B = null;
          var9.field_n = (sk) this;
          ((gh) this).b((lk) (Object) var9, true);
          return var10.field_m - -var9.field_m;
        } else {
          var9.field_n = (sk) this;
          ((gh) this).b((lk) (Object) var9, true);
          return var10.field_m - -var9.field_m;
        }
    }

    public gh() {
        super(0, 0, 496, 0, (fc) null);
        ((gh) this).field_F = new ti("", (sk) null, 12);
        ((gh) this).field_B = new ti("", (sk) null, 100);
        ((gh) this).field_C = new ti("", (sk) null, 100);
        ((gh) this).field_A = new ti("", (sk) null, 20);
        ((gh) this).field_E = new ti("", (sk) null, 20);
        ((gh) this).field_J = new ti("", (sk) null, 3);
        int var1 = 1;
        ((gh) this).field_G = new ff("", (sk) null, var1 != 0);
        ((gh) this).field_D = new wd(vg.field_l, (sk) null);
        ((gh) this).field_K = new wd(rg.field_e, (sk) null);
        ((gh) this).field_F.field_q = ej.field_e;
        ((gh) this).field_B.field_q = ta.field_d;
        ((gh) this).field_C.field_q = pc.field_c;
        ((gh) this).field_A.field_q = rg.field_b;
        ((gh) this).field_E.field_q = fd.field_o;
        ((gh) this).field_J.field_q = jb.field_b;
        ((gh) this).field_G.field_q = pb.field_g;
        ((gh) this).field_F.a((uh) (Object) new mg((ba) (Object) ((gh) this).field_F), true);
        ((gh) this).field_B.a((uh) (Object) new nj((ba) (Object) ((gh) this).field_B), true);
        ((gh) this).field_C.a((uh) (Object) new cl((ba) (Object) ((gh) this).field_C, (ba) (Object) ((gh) this).field_B), true);
        ((gh) this).field_A.a((uh) (Object) new bf((ba) (Object) ((gh) this).field_A, (ba) (Object) ((gh) this).field_F, (ba) (Object) ((gh) this).field_B), true);
        ((gh) this).field_E.a((uh) (Object) new bd((ba) (Object) ((gh) this).field_E, (ba) (Object) ((gh) this).field_A), true);
        ((gh) this).field_J.a((uh) (Object) new hg((ba) (Object) ((gh) this).field_J), true);
        ((gh) this).field_D.field_y = false;
        ((gh) this).field_D.field_j = (fc) (Object) new jh();
        ((gh) this).field_K.field_j = (fc) (Object) new r();
        ((gh) this).field_F.field_j = (fc) (Object) new tc(10000536);
        tc dupTemp$0 = new tc(10000536);
        ((gh) this).field_C.field_j = (fc) (Object) dupTemp$0;
        ((gh) this).field_B.field_j = (fc) (Object) dupTemp$0;
        ((gh) this).field_J.field_j = (fc) (Object) new tc(10000536);
        ((gh) this).field_G.field_j = (fc) (Object) new pj();
        wg dupTemp$1 = new wg(10000536);
        ((gh) this).field_E.field_j = (fc) (Object) dupTemp$1;
        ((gh) this).field_A.field_j = (fc) (Object) dupTemp$1;
        String var2 = jf.a(mj.field_j, new String[2], (byte) -126);
        int var3 = 20;
        var3 = var3 + this.a((lk) (Object) ((gh) this).field_B, c.field_d, var3, 120, 170);
        var3 = var3 + (this.a("", l.field_a, 170, (lk) (Object) ((gh) this).field_C, (byte) -123, 20, var3) - -5);
        var3 = var3 + this.a((lk) (Object) ((gh) this).field_A, ae.field_d, var3, 120, 170);
        var3 = var3 + (this.a(qh.field_d, ml.field_c, var3, (byte) -121, (lk) (Object) ((gh) this).field_E, 170) - -5);
        var3 = var3 + (5 + this.a(dg.field_i, pe.field_b, var3, (byte) -121, (lk) (Object) ((gh) this).field_F, 170));
        var3 = var3 + this.a((lk) (Object) ((gh) this).field_J, var3, 170, true, rj.field_h);
        hb var4 = new hb(46, var3, -90 + ((gh) this).field_k, 25, (lk) (Object) ((gh) this).field_G, true, -120 + ((gh) this).field_k, 5, qj.field_d, 11579568, ll.field_D);
        ((gh) this).b((lk) (Object) var4, true);
        var3 = var3 + var4.field_m;
        jd var5 = new jd(sg.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, sg.field_a.field_s, -1, 2147483647, true);
        ((gh) this).field_L = new vc(var2, (fc) (Object) var5);
        ((gh) this).field_L.field_q = "";
        ((gh) this).field_L.a(ud.field_b, 0, (byte) -77);
        ((gh) this).field_L.a(ud.field_b, 1, (byte) 36);
        ((gh) this).field_L.field_n = (sk) this;
        ((gh) this).field_L.a(var3, (byte) -65, 46, -90 + ((gh) this).field_k);
        var3 = var3 + (15 + ((gh) this).field_L.field_m);
        ((gh) this).b((lk) (Object) ((gh) this).field_L, true);
        int var6 = 4;
        int var7 = 200;
        ((gh) this).field_D.b(40, 80, var7, -var7 + 496 >> 750575329, var3);
        ((gh) this).field_K.b(40, 80, 60, 3 + var6, 15 + var3);
        ((gh) this).field_K.field_n = (sk) this;
        ((gh) this).field_D.field_n = (sk) this;
        ((gh) this).b((lk) (Object) ((gh) this).field_D, true);
        ((gh) this).b((lk) (Object) ((gh) this).field_K, true);
        ((gh) this).field_z = new nd((rf) this);
        ((gh) this).field_z.b(150, 80, -60 + -((gh) this).field_F.field_r + ((gh) this).field_k - ((gh) this).field_F.field_k, 60 + (((gh) this).field_F.field_r - -((gh) this).field_F.field_k), 20 + ((gh) this).field_F.field_i);
        ((gh) this).b((lk) (Object) ((gh) this).field_z, true);
        ((gh) this).b(var6 + (var3 - -55), 80, 496, 0, 0);
    }

    final void a(int param0, int param1, int param2, lk param3) {
        super.a(param0, param1, param2, param3);
        ((gh) this).field_D.field_y = this.k(2);
    }

    private final boolean l(int param0) {
        if (!this.k(2)) {
            return false;
        }
        int var2 = -1;
        if (param0 <= 55) {
            return true;
        }
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((gh) this).field_J.field_h);
        } catch (NumberFormatException numberFormatException) {
        }
        return pg.a(2, (gh) this, ((gh) this).field_F.field_h, var2, ((gh) this).field_B.field_h, ((gh) this).field_A.field_h, ((gh) this).field_G.field_z);
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 != param2) {
            if (-100 != (param2 ^ -1)) {
              return false;
            } else {
              return ((gh) this).a(param0, param3 + 34320);
            }
          } else {
            return ((gh) this).a((byte) -42, param0);
          }
        } else {
          return true;
        }
    }

    public final void a(String param0, byte param1) {
        ti var3 = ((gh) this).field_F;
        String var4 = param0;
        ((ba) (Object) var3).a(false, var4, true);
        if (param1 != 43) {
            ((gh) this).a(-97);
            return;
        }
    }

    private final int a(String param0, String param1, int param2, byte param3, lk param4, int param5) {
        if (param3 != -121) {
          ((gh) this).field_F = null;
          return this.a(param0, param1, param5, param4, (byte) -123, 35, param2);
        } else {
          return this.a(param0, param1, param5, param4, (byte) -123, 35, param2);
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_I = null;
            field_I = null;
            return;
        }
        field_I = null;
    }

    private final int a(lk param0, int param1, int param2, boolean param3, String param4) {
        hb var8 = new hb(20, param1, 120 + param2, 25, param0, false, 120, 3, sg.field_a, 16777215, param4);
        ((gh) this).b((lk) (Object) var8, true);
        la var7 = new la(((wc) (Object) param0).a(param3));
        ((gh) this).b((lk) (Object) var7, true);
        var7.b(15, 80, 15, 3 + (var8.field_r - -var8.field_k), (var8.field_m + -15 >> -2025240255) + var8.field_i);
        return var8.field_m;
    }

    private final String a(boolean param0) {
        if (param0) {
            return null;
        }
        return "</col></u>";
    }

    public final void a(int param0) {
        ((mg) (Object) ((gh) this).field_F.a(true)).i((byte) -122);
        if (param0 != -3814) {
            Object var3 = null;
            int discarded$0 = this.a((lk) null, -19, -5, false, (String) null);
        }
    }

    private final boolean k(int param0) {
        if (this.a((wc) (Object) ((gh) this).field_F, -5389)) {
          if (this.a((wc) (Object) ((gh) this).field_B, -5389)) {
            if (this.a((wc) (Object) ((gh) this).field_C, -5389)) {
              if (this.a((wc) (Object) ((gh) this).field_A, -5389)) {
                if (this.a((wc) (Object) ((gh) this).field_E, param0 + -5391)) {
                  if (this.a((wc) (Object) ((gh) this).field_J, param0 + -5391)) {
                    if (param0 != 2) {
                      return true;
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
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[8192];
    }
}
