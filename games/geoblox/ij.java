/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends oe implements pl {
    static int field_X;
    static float field_ab;
    private hk field_bb;
    static String field_Z;
    static int field_cb;
    static int field_W;
    static String field_Y;

    private final hk a(String param0, byte param1, bb param2) {
        hk var4 = null;
        int var5 = 0;
        var4 = new hk(param0, param2);
        if (param1 != 87) {
          field_X = 121;
          var4.field_q = (dh) (Object) new ml();
          var5 = ((ij) this).field_h + -6;
          ((ij) this).field_h = ((ij) this).field_h + 38;
          var4.a(30, -14 + (((ij) this).field_r + -16), (byte) -111, var5, 15);
          ((ij) this).b((byte) -70, (el) (Object) var4);
          ((ij) this).c(param1 + -198);
          return var4;
        } else {
          var4.field_q = (dh) (Object) new ml();
          var5 = ((ij) this).field_h + -6;
          ((ij) this).field_h = ((ij) this).field_h + 38;
          var4.a(30, -14 + (((ij) this).field_r + -16), (byte) -111, var5, 15);
          ((ij) this).b((byte) -70, (el) (Object) var4);
          ((ij) this).c(param1 + -198);
          return var4;
        }
    }

    public static void i(byte param0) {
        field_Z = null;
        if (param0 > 0) {
            ij.i((byte) 25);
            field_Y = null;
            return;
        }
        field_Y = null;
    }

    final static int m(int param0) {
        if (param0 <= 18) {
            int discarded$0 = ij.m(48);
            return qi.b(f.field_qb, 1);
        }
        return qi.b(f.field_qb, 1);
    }

    ij(ng param0, uj param1) {
        super(param0, 200, 150);
        Object var5 = null;
        el var6 = null;
        String var7 = null;
        el var8 = null;
        String var9 = null;
        el var10 = null;
        String var11 = null;
        el var12 = null;
        String var13 = null;
        el var14 = null;
        var5 = null;
        if (q.field_h == param1) {
          var13 = ei.field_gb;
          var14 = new el(var13, (bb) null);
          var14.field_v = 0;
          var14.field_h = 80;
          var14.field_r = ((ij) this).field_r;
          var14.field_m = 50;
          var14.field_q = (dh) (Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ij) this).b((byte) -91, var14);
          ((ij) this).field_bb = this.a(hh.field_b, (byte) 87, (bb) this);
        } else {
          if (param1 == ei.field_hb) {
            var9 = k.field_b;
            ((ij) this).field_h = ((ij) this).field_h + 10;
            if (nb.a(true)) {
              var11 = ad.field_n;
              ((ij) this).field_h = ((ij) this).field_h + 20;
              var12 = new el(var11, (bb) null);
              var12.field_v = 0;
              var12.field_h = 80;
              var12.field_r = ((ij) this).field_r;
              var12.field_m = 50;
              var12.field_q = (dh) (Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ij) this).b((byte) -91, var12);
              ((ij) this).field_bb = this.a(hh.field_b, (byte) 87, (bb) this);
            } else {
              var10 = new el(var9, (bb) null);
              var10.field_v = 0;
              var10.field_h = 80;
              var10.field_r = ((ij) this).field_r;
              var10.field_m = 50;
              var10.field_q = (dh) (Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ij) this).b((byte) -91, var10);
              ((ij) this).field_bb = this.a(hh.field_b, (byte) 87, (bb) this);
            }
          } else {
            if (param1 == pa.field_b) {
              var7 = f.field_nb;
              ((ij) this).field_h = ((ij) this).field_h + 30;
              var8 = new el(var7, (bb) null);
              var8.field_v = 0;
              var8.field_h = 80;
              var8.field_r = ((ij) this).field_r;
              var8.field_m = 50;
              var8.field_q = (dh) (Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ij) this).b((byte) -91, var8);
              ((ij) this).field_bb = this.a(hh.field_b, (byte) 87, (bb) this);
            } else {
              var6 = new el((String) var5, (bb) null);
              var6.field_v = 0;
              var6.field_h = 80;
              var6.field_r = ((ij) this).field_r;
              var6.field_m = 50;
              var6.field_q = (dh) (Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ij) this).b((byte) -91, var6);
              ((ij) this).field_bb = this.a(hh.field_b, (byte) 87, (bb) this);
            }
          }
        }
    }

    private final void j(byte param0) {
        if (!(((ij) this).field_I)) {
            return;
        }
        int var2 = 102 / ((param0 - 6) / 43);
        ((ij) this).field_I = false;
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        if (!(param4 != ((ij) this).field_bb)) {
            this.j((byte) 122);
        }
        if (param1 != -20) {
            field_W = -95;
            return;
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        if (el.field_o.field_x) {
          if (null != ul.field_a) {
            ul.field_a.b(-(ul.field_a.field_s >> -881621759) + 319, -(ul.field_a.field_o >> -1172163679) + 240);
            if (param0 < 3) {
              field_Z = null;
              return;
            } else {
              return;
            }
          } else {
            L0: {
              var1 = el.field_o.field_w - 2;
              var2 = el.field_o.field_u - 2;
              if (-1 > (wa.field_a ^ -1)) {
                vg.field_f[ha.field_g].b(320 - (vg.field_f[ha.field_g].field_s >> -1387017855), -(vg.field_f[ha.field_g].field_o >> 10164129) + 240);
                break L0;
              } else {
                break L0;
              }
            }
            fc.field_b[uf.field_b].b(var1 + 320, 240 + var2, rj.field_c);
            vh.field_H[nd.field_a].b(320 + var1, 240 + var2, rj.field_c);
            if (param0 < 3) {
              field_Z = null;
              return;
            } else {
              return;
            }
          }
        } else {
          L1: {
            var1 = el.field_o.field_w - 2;
            var2 = el.field_o.field_u - 2;
            if (-1 > (wa.field_a ^ -1)) {
              vg.field_f[ha.field_g].b(320 - (vg.field_f[ha.field_g].field_s >> -1387017855), -(vg.field_f[ha.field_g].field_o >> 10164129) + 240);
              break L1;
            } else {
              break L1;
            }
          }
          fc.field_b[uf.field_b].b(var1 + 320, 240 + var2, rj.field_c);
          vh.field_H[nd.field_a].b(320 + var1, 240 + var2, rj.field_c);
          if (param0 < 3) {
            field_Z = null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
        field_Z = "Menu";
        field_ab = 0.5f;
        field_Y = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
