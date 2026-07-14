/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends en implements vd {
    private pc field_V;
    static wb field_Q;
    static java.math.BigInteger field_S;
    static String field_U;

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        if (!(param4 != ((gn) this).field_V)) {
            this.l(15);
        }
        int var6 = 52 / ((param0 - 83) / 36);
    }

    final static void f(boolean param0) {
        jl.field_a = null;
        sl.field_r = null;
        rd.field_h = param0 ? true : false;
        ne.field_a = null;
        lo.field_c = null;
    }

    public static void e(boolean param0) {
        field_U = null;
        if (param0) {
            field_U = null;
            field_Q = null;
            field_S = null;
            return;
        }
        field_Q = null;
        field_S = null;
    }

    private final pc a(bi param0, String param1, byte param2) {
        pc var4 = null;
        int var5 = 0;
        var4 = new pc(param1, param0);
        var4.field_i = (wo) (Object) new ve();
        var5 = ((gn) this).field_f + -6;
        if (param2 <= 115) {
          field_Q = null;
          ((gn) this).field_f = ((gn) this).field_f + 38;
          var4.a(30, 15, var5, -16 + (-14 + ((gn) this).field_g), (byte) -52);
          ((gn) this).b((qm) (Object) var4, -20);
          ((gn) this).f(-30);
          return var4;
        } else {
          ((gn) this).field_f = ((gn) this).field_f + 38;
          var4.a(30, 15, var5, -16 + (-14 + ((gn) this).field_g), (byte) -52);
          ((gn) this).b((qm) (Object) var4, -20);
          ((gn) this).f(-30);
          return var4;
        }
    }

    private final void l(int param0) {
        if (((gn) this).field_C) {
          if (param0 != 15) {
            ((gn) this).field_V = null;
            ((gn) this).field_C = false;
            return;
          } else {
            ((gn) this).field_C = false;
            return;
          }
        } else {
          return;
        }
    }

    gn(ol param0, bf param1) {
        super(param0, 200, 150);
        Object var5 = null;
        qm var6 = null;
        String var7 = null;
        qm var8 = null;
        String var9 = null;
        qm var10 = null;
        String var11 = null;
        qm var12 = null;
        String var13 = null;
        qm var14 = null;
        var5 = null;
        if (eb.field_w == param1) {
          var13 = field_U;
          var14 = new qm(var13, (bi) null);
          var14.field_g = ((gn) this).field_g;
          var14.field_r = 0;
          var14.field_f = 80;
          var14.field_j = 50;
          var14.field_i = (wo) (Object) new lb(ba.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((gn) this).b(var14, 125);
          ((gn) this).field_V = this.a((bi) this, qo.field_o, (byte) 118);
        } else {
          if (ab.field_A == param1) {
            ((gn) this).field_f = ((gn) this).field_f + 10;
            var9 = nh.field_C;
            if (jl.a(100)) {
              var11 = md.field_n;
              ((gn) this).field_f = ((gn) this).field_f + 20;
              var12 = new qm(var11, (bi) null);
              var12.field_g = ((gn) this).field_g;
              var12.field_r = 0;
              var12.field_f = 80;
              var12.field_j = 50;
              var12.field_i = (wo) (Object) new lb(ba.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gn) this).b(var12, 125);
              ((gn) this).field_V = this.a((bi) this, qo.field_o, (byte) 118);
            } else {
              var10 = new qm(var9, (bi) null);
              var10.field_g = ((gn) this).field_g;
              var10.field_r = 0;
              var10.field_f = 80;
              var10.field_j = 50;
              var10.field_i = (wo) (Object) new lb(ba.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gn) this).b(var10, 125);
              ((gn) this).field_V = this.a((bi) this, qo.field_o, (byte) 118);
            }
          } else {
            if (param1 == rn.field_r) {
              var7 = fn.field_i;
              ((gn) this).field_f = ((gn) this).field_f + 30;
              var8 = new qm(var7, (bi) null);
              var8.field_g = ((gn) this).field_g;
              var8.field_r = 0;
              var8.field_f = 80;
              var8.field_j = 50;
              var8.field_i = (wo) (Object) new lb(ba.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gn) this).b(var8, 125);
              ((gn) this).field_V = this.a((bi) this, qo.field_o, (byte) 118);
            } else {
              var6 = new qm((String) var5, (bi) null);
              var6.field_g = ((gn) this).field_g;
              var6.field_r = 0;
              var6.field_f = 80;
              var6.field_j = 50;
              var6.field_i = (wo) (Object) new lb(ba.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gn) this).b(var6, 125);
              ((gn) this).field_V = this.a((bi) this, qo.field_o, (byte) 118);
            }
          }
        }
    }

    final static boolean d(boolean param0) {
        if (param0) {
            field_S = null;
            return j.c((byte) -23);
        }
        return j.c((byte) -23);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new wb();
        field_S = new java.math.BigInteger("65537");
        field_U = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
