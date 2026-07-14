/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends dqa implements ln, oo, jpb {
    private htb field_v;
    private kja field_w;
    private tga field_F;
    private tga field_A;
    private tga field_x;
    private tga field_y;
    static String field_G;
    rcb field_C;
    private tga field_D;
    private jla field_E;
    private htb field_B;
    private tga field_z;

    private final int a(int param0, String param1, int param2, String param3, int param4, shb param5) {
        if (param0 > -40) {
          boolean discarded$2 = this.d(45);
          return this.a(param5, param4, param2, param3, false, 35, param1);
        } else {
          return this.a(param5, param4, param2, param3, false, 35, param1);
        }
    }

    private final int a(shb param0, int param1, String param2, int param3, byte param4) {
        sca var6 = null;
        Object var7 = null;
        var6 = new sca(20, param1, param3 + 120, 25, param0, false, 120, 3, loa.field_o, 16777215, param2);
        ((rq) this).b(-18756, (shb) (Object) var6);
        if (param4 > -27) {
          var7 = null;
          ((rq) this).a((byte) 37, (String) null);
          return var6.field_f;
        } else {
          return var6.field_f;
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (param0 == 11) {
          if (param3 != ((rq) this).field_v) {
            if (((rq) this).field_B != param3) {
              return;
            } else {
              boolean discarded$2 = this.d(param0 + -7);
              return;
            }
          } else {
            to.e((byte) -77);
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0, lca param1) {
        eeb var3 = null;
        qrb var4 = null;
        var3 = param1.a(-782444220);
        if (var3 == null) {
          return true;
        } else {
          if (param0 == 22239) {
            var4 = var3.a((byte) 35);
            if (cca.field_o != var4) {
              if (tg.field_p == var4) {
                return false;
              } else {
                if (mp.field_p == var4) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
        ((rq) this).field_B.field_x = this.e(-122);
    }

    private final boolean d(int param0) {
        if (!this.e(-119)) {
            return false;
        }
        int var2 = -1;
        if (param0 != 4) {
            return false;
        }
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((rq) this).field_D.field_j);
        } catch (NumberFormatException numberFormatException) {
        }
        return ku.a(((rq) this).field_x.field_j, var2, (rq) this, ((rq) this).field_E.field_u, param0 + -3, ((rq) this).field_F.field_j, ((rq) this).field_z.field_j);
    }

    private final int a(int param0, shb param1, byte param2, String param3, int param4) {
        pla var7 = null;
        sca var8 = null;
        var8 = new sca(20, param4, param0 + 120, 25, param1, false, 120, 3, loa.field_o, 16777215, param3);
        ((rq) this).b(param2 + -18860, (shb) (Object) var8);
        var7 = new pla(((lca) (Object) param1).a(-782444220));
        ((rq) this).b(-18756, (shb) (Object) var7);
        if (param2 != 104) {
          field_G = null;
          var7.a(var8.field_h + (var8.field_g - -3), 15, 15, param2 + -103, (var8.field_f + -15 >> -2037283519) + var8.field_r);
          return var8.field_f;
        } else {
          var7.a(var8.field_h + (var8.field_g - -3), 15, 15, param2 + -103, (var8.field_f + -15 >> -2037283519) + var8.field_r);
          return var8.field_f;
        }
    }

    public rq() {
        super(0, 0, 496, 0, (wwa) null);
        ((rq) this).field_F = new tga("", (sba) null, 12);
        ((rq) this).field_z = new tga("", (sba) null, 100);
        ((rq) this).field_y = new tga("", (sba) null, 100);
        ((rq) this).field_x = new tga("", (sba) null, 20);
        ((rq) this).field_A = new tga("", (sba) null, 20);
        ((rq) this).field_D = new tga("", (sba) null, 3);
        int var1 = 1;
        ((rq) this).field_E = new jla("", (sba) null, var1 != 0);
        ((rq) this).field_B = new htb(so.field_d, (sba) null);
        ((rq) this).field_v = new htb(gsa.field_p, (sba) null);
        ((rq) this).field_F.field_p = gna.field_m;
        ((rq) this).field_z.field_p = lcb.field_s;
        ((rq) this).field_y.field_p = dj.field_a;
        ((rq) this).field_x.field_p = sha.field_x;
        ((rq) this).field_A.field_p = knb.field_p;
        ((rq) this).field_D.field_p = lq.field_j;
        ((rq) this).field_E.field_p = jv.field_f;
        ((rq) this).field_F.a(6614, (eeb) (Object) new tib((uf) (Object) ((rq) this).field_F));
        ((rq) this).field_z.a(6614, (eeb) (Object) new rm((uf) (Object) ((rq) this).field_z));
        ((rq) this).field_y.a(6614, (eeb) (Object) new bla((uf) (Object) ((rq) this).field_y, (uf) (Object) ((rq) this).field_z));
        ((rq) this).field_x.a(6614, (eeb) (Object) new ocb((uf) (Object) ((rq) this).field_x, (uf) (Object) ((rq) this).field_F, (uf) (Object) ((rq) this).field_z));
        ((rq) this).field_A.a(6614, (eeb) (Object) new vqa((uf) (Object) ((rq) this).field_A, (uf) (Object) ((rq) this).field_x));
        ((rq) this).field_D.a(6614, (eeb) (Object) new wgb((uf) (Object) ((rq) this).field_D));
        ((rq) this).field_B.field_x = false;
        ((rq) this).field_B.field_q = (wwa) (Object) new vva();
        ((rq) this).field_v.field_q = (wwa) (Object) new meb();
        ((rq) this).field_F.field_q = (wwa) (Object) new io(10000536);
        ((rq) this).field_y.field_q = (wwa) (Object) new io(10000536);
        ((rq) this).field_z.field_q = (wwa) (Object) new io(10000536);
        ((rq) this).field_D.field_q = (wwa) (Object) new io(10000536);
        ((rq) this).field_E.field_q = (wwa) (Object) new dw();
        ((rq) this).field_A.field_q = (wwa) (Object) new kpb(10000536);
        ((rq) this).field_x.field_q = (wwa) (Object) new kpb(10000536);
        String var2 = isa.a(vwa.field_o, new String[2], 109);
        int var3 = 20;
        var3 = var3 + this.a((shb) (Object) ((rq) this).field_z, var3, lbb.field_h, 170, (byte) -42);
        var3 = var3 + (5 + this.a((shb) (Object) ((rq) this).field_y, var3, 170, qs.field_b, false, 20, ""));
        var3 = var3 + this.a((shb) (Object) ((rq) this).field_x, var3, dpa.field_q, 170, (byte) -36);
        var3 = var3 + (this.a(-41, mmb.field_e, 170, lg.field_d, var3, (shb) (Object) ((rq) this).field_A) + 5);
        var3 = var3 + (5 + this.a(-103, tj.field_r, 170, ffb.field_c, var3, (shb) (Object) ((rq) this).field_F));
        var3 = var3 + this.a(170, (shb) (Object) ((rq) this).field_D, (byte) 104, jja.field_a, var3);
        sca var4 = new sca(46, var3, -90 + ((rq) this).field_h, 25, (shb) (Object) ((rq) this).field_E, true, ((rq) this).field_h - 120, 5, web.field_o, 11579568, shb.field_m);
        ((rq) this).b(-18756, (shb) (Object) var4);
        var3 = var3 + var4.field_f;
        bob var5 = new bob(loa.field_o, 0, 0, 0, 0, 16777215, -1, 0, 0, loa.field_o.field_k, -1, 2147483647, true);
        ((rq) this).field_w = new kja(var2, (wwa) (Object) var5);
        ((rq) this).field_w.field_p = "";
        ((rq) this).field_w.a(0, -1, pma.field_q);
        ((rq) this).field_w.a(1, -1, pma.field_q);
        ((rq) this).field_w.field_l = (sba) this;
        ((rq) this).field_w.a(((rq) this).field_h - 90, var3, 46, (byte) -23);
        var3 = var3 + (15 + ((rq) this).field_w.field_f);
        ((rq) this).b(-18756, (shb) (Object) ((rq) this).field_w);
        int var6 = 4;
        int var7 = 200;
        ((rq) this).field_B.a(496 + -var7 >> -1997136831, var7, 40, 1, var3);
        ((rq) this).field_v.a(3 + var6, 60, 40, 1, 15 + var3);
        ((rq) this).field_v.field_l = (sba) this;
        ((rq) this).field_B.field_l = (sba) this;
        ((rq) this).b(-18756, (shb) (Object) ((rq) this).field_B);
        ((rq) this).b(-18756, (shb) (Object) ((rq) this).field_v);
        ((rq) this).field_C = new rcb((jpb) this);
        ((rq) this).field_C.a(60 + (((rq) this).field_F.field_h + ((rq) this).field_F.field_g), -60 + (-((rq) this).field_F.field_h + ((rq) this).field_h) + -((rq) this).field_F.field_g, 150, 1, 20 + ((rq) this).field_F.field_r);
        ((rq) this).b(-18756, (shb) (Object) ((rq) this).field_C);
        ((rq) this).a(0, 496, var3 + 55 + var6, 1, 0);
    }

    private final boolean e(int param0) {
        if (param0 < -57) {
          if (this.a(22239, (lca) (Object) ((rq) this).field_F)) {
            if (this.a(22239, (lca) (Object) ((rq) this).field_z)) {
              if (this.a(22239, (lca) (Object) ((rq) this).field_y)) {
                if (this.a(22239, (lca) (Object) ((rq) this).field_x)) {
                  if (this.a(22239, (lca) (Object) ((rq) this).field_A)) {
                    if (!this.a(22239, (lca) (Object) ((rq) this).field_D)) {
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
          ((rq) this).field_w = null;
          if (this.a(22239, (lca) (Object) ((rq) this).field_F)) {
            if (this.a(22239, (lca) (Object) ((rq) this).field_z)) {
              if (this.a(22239, (lca) (Object) ((rq) this).field_y)) {
                if (this.a(22239, (lca) (Object) ((rq) this).field_x)) {
                  if (this.a(22239, (lca) (Object) ((rq) this).field_A)) {
                    if (!this.a(22239, (lca) (Object) ((rq) this).field_D)) {
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

    private final String i(byte param0) {
        if (param0 >= -97) {
            return null;
        }
        return "</col></u>";
    }

    private final int a(shb param0, int param1, int param2, String param3, boolean param4, int param5, String param6) {
        sca var10 = new sca(20, param1, 120 + param2, 25, param0, param4, 120, 3, loa.field_o, 16777215, param3);
        ((rq) this).b(-18756, (shb) (Object) var10);
        gm var9 = new gm(((lca) (Object) param0).a(-782444220), param6, 126, param1 - -var10.field_f, param2 + 50, param5);
        var9.field_l = (sba) this;
        ((rq) this).b(-18756, (shb) (Object) var9);
        return var9.field_f + var10.field_f;
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if ((param1 ^ -1) == -99) {
            return ((rq) this).a(param2, 0);
          } else {
            if ((param1 ^ -1) == -100) {
              return ((rq) this).a(true, param2);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void a(int param0, int param1, int param2, kja param3) {
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param0 != (param2 ^ -1)) {
          if (param2 != 1) {
            if ((param2 ^ -1) != -3) {
              return;
            } else {
              vba.a(12, "conduct.ws");
              return;
            }
          } else {
            vba.a(12, "privacy.ws");
            return;
          }
        } else {
          vba.a(12, "terms.ws");
          return;
        }
    }

    private final String j(byte param0) {
        if (param0 != 50) {
            ((rq) this).field_v = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0) {
        if (param0 != 1546) {
            return;
        }
        ((tib) (Object) ((rq) this).field_F.a(param0 ^ -782442674)).d((byte) 38);
    }

    public static void f(int param0) {
        int var1 = 67 / ((-47 - param0) / 56);
        field_G = null;
    }

    public final void a(byte param0, String param1) {
        tga var3 = ((rq) this).field_F;
        if (param0 != 41) {
            return;
        }
        String var4 = param1;
        ((uf) (Object) var3).a(false, 0, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Scamming";
    }
}
