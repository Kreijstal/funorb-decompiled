/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends g implements wi, qh {
    private hl field_F;
    static int[][] field_G;
    private hl field_H;
    private v field_E;
    static String field_D;
    bd field_I;

    private final int a(String param0, int param1, lk param2, String param3, int param4, int param5, byte param6) {
        pa var9 = null;
        ck var10 = null;
        var10 = new ck(20, param4, 120 + param1, 25, param2, false, 120, 3, j.field_C, 16777215, param0);
        ((fh) this).b((lk) (Object) var10, (byte) 118);
        var9 = new pa(((of) param2).a(84), param3, 126, param4 - -((ck) var10).field_q, 25 + param1, param5);
        var9.field_k = (pl) this;
        if (param6 < 112) {
          boolean discarded$2 = this.d((byte) 89);
          ((fh) this).b((lk) (Object) var9, (byte) 118);
          return ((ck) var10).field_q - -((pa) var9).field_q;
        } else {
          ((fh) this).b((lk) (Object) var9, (byte) 118);
          return ((ck) var10).field_q - -((pa) var9).field_q;
        }
    }

    public final void a(boolean param0) {
        if (!param0) {
          ((fh) this).field_E = (v) null;
          ((hj) ((fh) this).field_E.a(-67)).g(80);
          return;
        } else {
          ((hj) ((fh) this).field_E.a(-67)).g(80);
          return;
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (param1 > -99) {
            field_G = (int[][]) (int[][]) null;
            if (this.a(param0, (byte) -115, param2, param3)) {
                return true;
            }
            if (98 == param2) {
                return ((fh) this).b(-85, param3);
            }
            if (param2 == 99) {
                return ((fh) this).a(param3, (byte) -28);
            }
            return false;
        }
        if (this.a(param0, (byte) -115, param2, param3)) {
            return true;
        }
        if (98 == param2) {
            return ((fh) this).b(-85, param3);
        }
        if (!(param2 != 99)) {
            return ((fh) this).a(param3, (byte) -28);
        }
        return false;
    }

    public static void m(int param0) {
        if (param0 != 200) {
            field_D = (String) null;
            field_D = null;
            field_G = (int[][]) null;
            return;
        }
        field_D = null;
        field_G = (int[][]) null;
    }

    public final void a(String param0, boolean param1) {
        v var3 = null;
        String var4 = null;
        String var5 = null;
        if (!param1) {
          var5 = (String) null;
          ((fh) this).a((String) null, true);
          var3 = ((fh) this).field_E;
          var4 = param0;
          ((hf) (Object) var3).a(var4, -18845, false);
          return;
        } else {
          var3 = ((fh) this).field_E;
          var4 = param0;
          ((hf) (Object) var3).a(var4, -18845, false);
          return;
        }
    }

    public fh() {
        super(0, 0, 496, 0, (ci) null);
        ((fh) this).field_E = new v("", (pl) null, 12);
        ek var1 = new ek(me.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, j.field_C.field_s, -1, 2147483647, true);
        lk var2 = new lk(ui.field_F, (ci) (Object) var1, (pl) null);
        ((fh) this).field_F = new hl(bl.field_g, (pl) null);
        ((fh) this).field_H = new hl(cj.field_m, (pl) null);
        ((fh) this).field_E.field_n = re.field_h;
        ((fh) this).field_E.a((byte) 68, (ba) (Object) new hj((hf) (Object) ((fh) this).field_E));
        ((fh) this).field_F.field_B = false;
        ((fh) this).field_F.field_v = (ci) (Object) new ki();
        ((fh) this).field_H.field_v = (ci) (Object) new nb();
        ((fh) this).field_E.field_v = (ci) (Object) new r(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(50, var3, 270, 20, true);
        int var5 = 200;
        var3 += 50;
        ((fh) this).b(var2, (byte) 118);
        var3 = var3 + (5 + this.a((lk) (Object) ((fh) this).field_E, pk.field_c, var3, 35, mj.field_a, 170));
        ((fh) this).field_F.a(40, var3, var5, -var5 + 496 >> -1861646943, true);
        ((fh) this).field_H.a(40, var3 - -15, 60, var4 - -3, true);
        ((fh) this).field_H.field_k = (pl) this;
        ((fh) this).field_F.field_k = (pl) this;
        ((fh) this).b((lk) (Object) ((fh) this).field_F, (byte) 118);
        ((fh) this).b((lk) (Object) ((fh) this).field_H, (byte) 118);
        ((fh) this).field_I = new bd((wi) this);
        ((fh) this).field_I.a(150, 20, -60 + -((fh) this).field_E.field_o + (((fh) this).field_h + -((fh) this).field_E.field_h), 60 + ((fh) this).field_E.field_h + ((fh) this).field_E.field_o, true);
        ((fh) this).b((lk) (Object) ((fh) this).field_I, (byte) 118);
        ((fh) this).a(var3 + (55 + var4), 0, 496, 0, true);
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        if (param3 != ((fh) this).field_H) {
          if (param3 == ((fh) this).field_F) {
            this.l(14831);
            var6 = -80 % ((param1 - -62) / 32);
            return;
          } else {
            var6 = -80 % ((param1 - -62) / 32);
            return;
          }
        } else {
          ub.c(0);
          var6 = -80 % ((param1 - -62) / 32);
          return;
        }
    }

    private final boolean d(byte param0) {
        if (this.a(98, (of) (Object) ((fh) this).field_E)) {
          if (param0 != 68) {
            ((fh) this).field_F = (hl) null;
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((fh) this).field_F.field_B = this.d((byte) 68);
    }

    private final void l(int param0) {
        String var3 = null;
        if (param0 == 14831) {
          if (!this.d((byte) 68)) {
            return;
          } else {
            rd.a((byte) 68, ((fh) this).field_E.field_r);
            return;
          }
        } else {
          var3 = (String) null;
          ((fh) this).a((String) null, true);
          if (!this.d((byte) 68)) {
            return;
          } else {
            rd.a((byte) 68, ((fh) this).field_E.field_r);
            return;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        String var3 = null;
        String var4 = null;
        if (param2 == -1) {
          var3 = null;
          if (ni.field_a != null) {
            if (ni.field_a.equals((Object) (Object) param0.getParameter("settings"))) {
              L0: {
                var4 = null;
                if (null == jf.field_l) {
                  break L0;
                } else {
                  if (jf.field_l.equals((Object) (Object) param0.getParameter("session"))) {
                    break L0;
                  } else {
                    var4 = jf.field_l;
                    break L0;
                  }
                }
              }
              return hi.a(var3, param1, var4, -1, 353);
            } else {
              L1: {
                var3 = ni.field_a;
                var4 = var3;
                var4 = var3;
                var4 = null;
                if (null == jf.field_l) {
                  break L1;
                } else {
                  if (jf.field_l.equals((Object) (Object) param0.getParameter("session"))) {
                    break L1;
                  } else {
                    var4 = jf.field_l;
                    break L1;
                  }
                }
              }
              return hi.a(var3, param1, var4, -1, 353);
            }
          } else {
            L2: {
              var4 = null;
              if (null == jf.field_l) {
                break L2;
              } else {
                if (jf.field_l.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = jf.field_l;
                  break L2;
                }
              }
            }
            return hi.a(var3, param1, var4, -1, 353);
          }
        } else {
          return (java.net.URL) null;
        }
    }

    private final int a(lk param0, String param1, int param2, int param3, String param4, int param5) {
        if (param3 != 35) {
          this.l(-7);
          return this.a(param4, param5, param0, param1, param2, 35, (byte) 114);
        } else {
          return this.a(param4, param5, param0, param1, param2, 35, (byte) 114);
        }
    }

    private final boolean a(int param0, of param1) {
        ba var3 = null;
        sg var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var3 = ((of) param1).a(-52);
        if (var3 == null) {
          return true;
        } else {
          if (param0 != 98) {
            return false;
          } else {
            L0: {
              var4 = ((ba) var3).a(true);
              if (ii.field_e != var4) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Try again";
    }
}
