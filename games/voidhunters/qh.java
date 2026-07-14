/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends iw implements oo {
    private htb field_M;
    static String field_L;
    static String field_N;
    private htb field_K;
    static int field_J;

    private final void m(byte param0) {
        if (!((qh) this).field_z) {
            return;
        }
        ((qh) this).field_z = false;
        if (param0 != -10) {
            ((qh) this).field_M = null;
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if ((param1 ^ -1) != -99) {
          if (param0 == -15834) {
            if (-100 == (param1 ^ -1)) {
              boolean discarded$4 = ((qh) this).field_M.a(0, (shb) this);
              return true;
            } else {
              return super.a(-15834, param1, param2, param3);
            }
          } else {
            qh.l((byte) 46);
            if (-100 == (param1 ^ -1)) {
              boolean discarded$5 = ((qh) this).field_M.a(0, (shb) this);
              return true;
            } else {
              return super.a(-15834, param1, param2, param3);
            }
          }
        } else {
          if (null != ((qh) this).field_K) {
            boolean discarded$6 = ((qh) this).field_K.a(0, (shb) this);
            return true;
          } else {
            boolean discarded$7 = ((qh) this).field_M.a(0, (shb) this);
            return true;
          }
        }
    }

    public static void l(byte param0) {
        int var1 = 99 / ((-24 - param0) / 62);
        field_N = null;
        field_L = null;
    }

    qh(ida param0) {
        super(param0, 200, 130);
        shb var2 = new shb(dib.field_j, (sba) null);
        var2.field_g = 0;
        var2.field_f = 80;
        var2.field_r = 50;
        var2.field_h = ((qh) this).field_h;
        var2.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((qh) this).b(-18756, var2);
        if (fda.e((byte) 90)) {
            ((qh) this).field_K = this.a((sba) this, kg.field_s, 125);
        }
        ((qh) this).field_M = this.a((sba) this, wm.field_b, 125);
    }

    private final htb a(sba param0, String param1, int param2) {
        htb var4 = null;
        int var5 = 0;
        var4 = new htb(param1, param0);
        var4.field_q = (wwa) (Object) new vva();
        if (param2 <= 123) {
          field_L = null;
          var5 = -6 + ((qh) this).field_f;
          ((qh) this).field_f = ((qh) this).field_f + 38;
          var4.a(15, -14 + (((qh) this).field_h + -16), 30, 1, var5);
          ((qh) this).b(-18756, (shb) (Object) var4);
          ((qh) this).a(false);
          return var4;
        } else {
          var5 = -6 + ((qh) this).field_f;
          ((qh) this).field_f = ((qh) this).field_f + 38;
          var4.a(15, -14 + (((qh) this).field_h + -16), 30, 1, var5);
          ((qh) this).b(-18756, (shb) (Object) var4);
          ((qh) this).a(false);
          return var4;
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (param3 != ((qh) this).field_K) {
          if (((qh) this).field_M != param3) {
            if (param0 != 11) {
              this.m((byte) 55);
              return;
            } else {
              return;
            }
          } else {
            this.m((byte) -10);
            if (param0 == 11) {
              return;
            } else {
              this.m((byte) 55);
              return;
            }
          }
        } else {
          gnb.a(0);
          this.m((byte) -10);
          if (param0 == 11) {
            return;
          } else {
            this.m((byte) 55);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Fire grapples";
        field_N = "Email address is unavailable";
        field_J = 1;
    }
}
