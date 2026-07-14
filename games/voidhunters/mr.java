/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends iw implements oo {
    static String field_L;
    static ij field_M;
    private htb field_K;
    static String field_J;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        Object var7 = null;
        if (((mr) this).field_K != param3) {
          if (param0 != 11) {
            var7 = null;
            ((mr) this).a(-125, -106, 11, (htb) null, 127);
            return;
          } else {
            return;
          }
        } else {
          this.h(-95);
          if (param0 == 11) {
            return;
          } else {
            var7 = null;
            ((mr) this).a(-125, -106, 11, (htb) null, 127);
            return;
          }
        }
    }

    final static String m(byte param0) {
        String var1 = "";
        if (!(null == jt.field_o)) {
            var1 = jt.field_o.a(30);
        }
        int var2 = 80 / ((-61 - param0) / 55);
        if (0 == var1.length()) {
            var1 = dla.c(120);
        }
        if (!(0 != var1.length())) {
            var1 = job.field_o;
        }
        return var1;
    }

    public static void l(byte param0) {
        field_L = null;
        field_M = null;
        field_J = null;
        if (param0 != -16) {
            hrb discarded$0 = mr.g(-102);
        }
    }

    mr(ida param0, dpb param1) {
        super(param0, 200, 150);
        Object var5 = null;
        shb var6 = null;
        String var7 = null;
        shb var8 = null;
        String var9 = null;
        shb var10 = null;
        String var11 = null;
        shb var12 = null;
        String var13 = null;
        shb var14 = null;
        var5 = null;
        if (param1 == qua.field_a) {
          var13 = oda.field_t;
          var14 = new shb(var13, (sba) null);
          var14.field_f = 80;
          var14.field_r = 50;
          var14.field_h = ((mr) this).field_h;
          var14.field_g = 0;
          var14.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((mr) this).b(-18756, var14);
          ((mr) this).field_K = this.a((byte) 113, (sba) this, wm.field_b);
        } else {
          if (param1 == bca.field_a) {
            ((mr) this).field_f = ((mr) this).field_f + 10;
            var9 = r.field_m;
            if (oq.c((byte) 109)) {
              var11 = jga.field_b;
              ((mr) this).field_f = ((mr) this).field_f + 20;
              var12 = new shb(var11, (sba) null);
              var12.field_f = 80;
              var12.field_r = 50;
              var12.field_h = ((mr) this).field_h;
              var12.field_g = 0;
              var12.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((mr) this).b(-18756, var12);
              ((mr) this).field_K = this.a((byte) 113, (sba) this, wm.field_b);
            } else {
              var10 = new shb(var9, (sba) null);
              var10.field_f = 80;
              var10.field_r = 50;
              var10.field_h = ((mr) this).field_h;
              var10.field_g = 0;
              var10.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((mr) this).b(-18756, var10);
              ((mr) this).field_K = this.a((byte) 113, (sba) this, wm.field_b);
            }
          } else {
            if (param1 == oca.field_a) {
              ((mr) this).field_f = ((mr) this).field_f + 30;
              var7 = tl.field_o;
              var8 = new shb(var7, (sba) null);
              var8.field_f = 80;
              var8.field_r = 50;
              var8.field_h = ((mr) this).field_h;
              var8.field_g = 0;
              var8.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((mr) this).b(-18756, var8);
              ((mr) this).field_K = this.a((byte) 113, (sba) this, wm.field_b);
            } else {
              var6 = new shb((String) var5, (sba) null);
              var6.field_f = 80;
              var6.field_r = 50;
              var6.field_h = ((mr) this).field_h;
              var6.field_g = 0;
              var6.field_q = (wwa) (Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((mr) this).b(-18756, var6);
              ((mr) this).field_K = this.a((byte) 113, (sba) this, wm.field_b);
            }
          }
        }
    }

    private final void h(int param0) {
        if (param0 < -39) {
          if (!((mr) this).field_z) {
            return;
          } else {
            ((mr) this).field_z = false;
            return;
          }
        } else {
          field_J = null;
          if (!((mr) this).field_z) {
            return;
          } else {
            ((mr) this).field_z = false;
            return;
          }
        }
    }

    final static hrb g(int param0) {
        if (param0 <= 37) {
            hrb discarded$0 = mr.g(84);
            return (hrb) (Object) new nmb();
        }
        return (hrb) (Object) new nmb();
    }

    private final htb a(byte param0, sba param1, String param2) {
        htb var4 = new htb(param2, param1);
        var4.field_q = (wwa) (Object) new vva();
        int var5 = -79 / ((6 - param0) / 32);
        int var6 = -6 + ((mr) this).field_f;
        ((mr) this).field_f = ((mr) this).field_f + 38;
        var4.a(15, ((mr) this).field_h - 14 + -16, 30, 1, var6);
        ((mr) this).b(-18756, (shb) (Object) var4);
        ((mr) this).a(false);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "<%0> is not on your ignore list.";
        field_J = "Game options";
    }
}
