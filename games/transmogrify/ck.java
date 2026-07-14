/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends aj implements tc, df {
    private lj field_x;
    static hi field_I;
    private lj field_w;
    static String field_H;
    dh field_B;
    static String field_F;
    private vc field_D;
    static boolean field_A;
    static int field_z;
    static ti[] field_C;
    static int field_y;

    private final boolean a(ie param0, byte param1) {
        wa var3 = param0.a((byte) 110);
        if (!(var3 != null)) {
            return true;
        }
        rc var4 = var3.a(27835);
        int var5 = -107 / ((param1 - 56) / 50);
        return hi.field_b == var4 ? true : false;
    }

    private final boolean m(int param0) {
        if (!(this.a((ie) (Object) ((ck) this).field_D, (byte) -4))) {
            return false;
        }
        if (param0 != 10494) {
            return false;
        }
        return true;
    }

    private final int a(int param0, int param1, String param2, qg param3, String param4, byte param5) {
        if (param5 > -9) {
          field_H = null;
          return this.a(param3, param4, param0, param2, param1, (byte) -126, 35);
        } else {
          return this.a(param3, param4, param0, param2, param1, (byte) -126, 35);
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param1 == 17) {
          if (param0 != ((ck) this).field_w) {
            if (((ck) this).field_x != param0) {
              return;
            } else {
              this.n(0);
              return;
            }
          } else {
            bl.a(param1 + 841);
            return;
          }
        } else {
          var7 = null;
          int discarded$3 = this.a(21, 119, (String) null, (qg) null, (String) null, (byte) 74);
          if (param0 != ((ck) this).field_w) {
            if (((ck) this).field_x != param0) {
              return;
            } else {
              this.n(0);
              return;
            }
          } else {
            bl.a(param1 + 841);
            return;
          }
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        var5 = -109 % ((65 - param2) / 55);
        if (super.a(param0, param1, (byte) 10, param3)) {
          return true;
        } else {
          if (98 != param0) {
            if (param0 != 99) {
              return false;
            } else {
              return ((ck) this).b(param1, 51);
            }
          } else {
            return ((ck) this).a(2, param1);
          }
        }
    }

    public ck() {
        super(0, 0, 496, 0, (ui) null);
        ((ck) this).field_D = new vc("", (ma) null, 12);
        h var1 = new h(al.field_i, 0, 0, 0, 0, 16777215, -1, 3, 0, vd.field_h.field_y, -1, 2147483647, true);
        qg var2 = new qg(bj.field_P, (ui) (Object) var1, (ma) null);
        ((ck) this).field_x = new lj(Transmogrify.field_E, (ma) null);
        ((ck) this).field_w = new lj(fk.field_D, (ma) null);
        ((ck) this).field_D.field_j = mf.field_a;
        ((ck) this).field_D.a(-65, (wa) (Object) new li((rg) (Object) ((ck) this).field_D));
        ((ck) this).field_x.field_t = false;
        ((ck) this).field_x.field_q = (ui) (Object) new qa();
        ((ck) this).field_w.field_q = (ui) (Object) new ek();
        ((ck) this).field_D.field_q = (ui) (Object) new ni(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(53, var3, 20, 270, 50);
        var3 += 50;
        ((ck) this).a(var2, (byte) -110);
        var3 = var3 + (5 + this.a(var3, 170, bi.field_O, (qg) (Object) ((ck) this).field_D, rd.field_b, (byte) -32));
        ((ck) this).field_x.a(122, var3, -var5 + 496 >> -1478566719, var5, 40);
        ((ck) this).field_w.a(-116, 15 + var3, 3 + var4, 60, 40);
        ((ck) this).field_w.field_m = (ma) this;
        ((ck) this).field_x.field_m = (ma) this;
        ((ck) this).a((qg) (Object) ((ck) this).field_x, (byte) -111);
        ((ck) this).a((qg) (Object) ((ck) this).field_w, (byte) -95);
        ((ck) this).field_B = new dh((tc) this);
        ((ck) this).field_B.a(-110, 20, 60 + (((ck) this).field_D.field_p + ((ck) this).field_D.field_l), -60 + -((ck) this).field_D.field_p + (((ck) this).field_l - ((ck) this).field_D.field_l), 150);
        ((ck) this).a((qg) (Object) ((ck) this).field_B, (byte) -104);
        ((ck) this).a(109, 0, 0, 496, 55 + (var3 + var4));
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((ck) this).field_x.field_t = this.m(10494);
    }

    public static void l(int param0) {
        field_F = null;
        field_I = null;
        field_H = null;
        field_C = null;
        if (param0 >= -3) {
            Object var2 = null;
            boolean discarded$0 = ck.a((CharSequence) null, (byte) -90);
        }
    }

    private final void n(int param0) {
        if (!(this.m(10494))) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        rd.a(((ck) this).field_D.field_k, false);
    }

    public final void a(boolean param0, String param1) {
        vc var3 = ((ck) this).field_D;
        String var4 = param1;
        ((rg) (Object) var3).a(var4, param0, 1);
    }

    public final void a(byte param0) {
        ((li) (Object) ((ck) this).field_D.a((byte) 120)).g(-80);
        if (param0 != -69) {
            boolean discarded$0 = ((ck) this).a(-52, (qg) null, (byte) 25, 'ￚ');
        }
    }

    private final int a(qg param0, String param1, int param2, String param3, int param4, byte param5, int param6) {
        ob var9 = null;
        oc var10 = null;
        if (param5 > -37) {
          field_I = null;
          var10 = new oc(20, param2, param4 + 120, 25, param0, false, 120, 3, vd.field_h, 16777215, param3);
          ((ck) this).a((qg) (Object) var10, (byte) -80);
          var9 = new ob(((ie) (Object) param0).a((byte) 117), param1, 126, var10.field_h + param2, 25 + param4, param6);
          var9.field_m = (ma) this;
          ((ck) this).a((qg) (Object) var9, (byte) -113);
          return var9.field_h + var10.field_h;
        } else {
          var10 = new oc(20, param2, param4 + 120, 25, param0, false, 120, 3, vd.field_h, 16777215, param3);
          ((ck) this).a((qg) (Object) var10, (byte) -80);
          var9 = new ob(((ie) (Object) param0).a((byte) 117), param1, 126, var10.field_h + param2, 25 + param4, param6);
          var9.field_m = (ma) this;
          ((ck) this).a((qg) (Object) var9, (byte) -113);
          return var9.field_h + var10.field_h;
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        if (param1 >= -41) {
            field_z = 13;
            return q.a(param0, false, 85);
        }
        return q.a(param0, false, 85);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Orb coins: <%0>";
        field_H = "Language: ";
        field_I = new hi();
    }
}
