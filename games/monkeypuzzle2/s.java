/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends nf implements ql {
    static String[] field_Q;
    static int field_R;
    private t field_P;
    static de field_S;
    static int field_T;
    static int field_O;

    s(kj param0, kg param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        we var6 = null;
        String var7 = null;
        we var8 = null;
        String var9 = null;
        we var10 = null;
        we var11 = null;
        var3 = null;
        if (param1 != hf.field_g) {
          if (param1 != cg.field_c) {
            L0: {
              if (ma.field_b != param1) {
                break L0;
              } else {
                ((s) this).field_p = ((s) this).field_p + 30;
                var3 = mg.field_r;
                break L0;
              }
            }
            var11 = new we(var3, (of) null);
            var11.field_e = 50;
            var11.field_l = ((s) this).field_l;
            var11.field_p = 80;
            var11.field_r = 0;
            var11.field_h = (ml) (Object) new a(pf.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((s) this).b((byte) -75, var11);
            ((s) this).field_P = this.a(false, (of) this, db.field_e);
          } else {
            var7 = pd.field_e;
            var3 = var7;
            var3 = var7;
            ((s) this).field_p = ((s) this).field_p + 10;
            if (da.a(352)) {
              var9 = kk.field_h;
              var3 = var9;
              var3 = var9;
              ((s) this).field_p = ((s) this).field_p + 20;
              var10 = new we(var9, (of) null);
              var10.field_e = 50;
              var10.field_l = ((s) this).field_l;
              var10.field_p = 80;
              var10.field_r = 0;
              var10.field_h = (ml) (Object) new a(pf.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((s) this).b((byte) -75, var10);
              ((s) this).field_P = this.a(false, (of) this, db.field_e);
            } else {
              var8 = new we(var7, (of) null);
              var8.field_e = 50;
              var8.field_l = ((s) this).field_l;
              var8.field_p = 80;
              var8.field_r = 0;
              var8.field_h = (ml) (Object) new a(pf.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((s) this).b((byte) -75, var8);
              ((s) this).field_P = this.a(false, (of) this, db.field_e);
            }
          }
        } else {
          var5 = ld.field_b;
          var6 = new we(var5, (of) null);
          var6.field_e = 50;
          var6.field_l = ((s) this).field_l;
          var6.field_p = 80;
          var6.field_r = 0;
          var6.field_h = (ml) (Object) new a(pf.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((s) this).b((byte) -75, var6);
          ((s) this).field_P = this.a(false, (of) this, db.field_e);
        }
    }

    public static void q(int param0) {
        field_S = null;
        field_Q = null;
        if (param0 != 7993) {
            field_S = null;
        }
    }

    private final t a(boolean param0, of param1, String param2) {
        t var4 = null;
        int var5 = 0;
        var4 = new t(param2, param1);
        var4.field_h = (ml) (Object) new hd();
        var5 = ((s) this).field_p - 6;
        ((s) this).field_p = ((s) this).field_p + 38;
        var4.a(30, 13361, 15, -30 + ((s) this).field_l, var5);
        ((s) this).b((byte) -98, (we) (Object) var4);
        if (param0) {
          s.q(-59);
          ((s) this).g(-1);
          return var4;
        } else {
          ((s) this).g(-1);
          return var4;
        }
    }

    private final void f(byte param0) {
        if (!(((s) this).field_z)) {
            return;
        }
        if (param0 != -93) {
            return;
        }
        ((s) this).field_z = false;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (param4 != ((s) this).field_P) {
          if (param3 != 7) {
            field_Q = null;
            return;
          } else {
            return;
          }
        } else {
          this.f((byte) -93);
          if (param3 == 7) {
            return;
          } else {
            field_Q = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new String[]{"By rating", "By win percentage"};
        field_S = null;
        field_R = 0;
        field_T = 0;
    }
}
