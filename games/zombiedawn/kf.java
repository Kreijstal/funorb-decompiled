/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends pn implements hh {
    static String field_X;
    static String field_V;
    private an field_U;
    private an field_W;
    static String field_Y;
    static String field_T;

    private final void n(int param0) {
        if (!(((kf) this).field_H)) {
            return;
        }
        ((kf) this).field_H = false;
        if (param0 != 10) {
            Object var3 = null;
            ((kf) this).a(34, -113, (an) null, 107, 77);
        }
    }

    private final an a(int param0, String param1, sk param2) {
        an var4 = null;
        int var5 = 0;
        var4 = new an(param1, param2);
        var4.field_h = (io) (Object) new vm();
        if (param0 != -1763) {
          this.n(-112);
          var5 = ((kf) this).field_n + -6;
          ((kf) this).field_n = ((kf) this).field_n + 38;
          var4.a(-127, var5, 15, -16 + (((kf) this).field_i - 14), 30);
          ((kf) this).a((ga) (Object) var4, 10);
          ((kf) this).a(true);
          return var4;
        } else {
          var5 = ((kf) this).field_n + -6;
          ((kf) this).field_n = ((kf) this).field_n + 38;
          var4.a(-127, var5, 15, -16 + (((kf) this).field_i - 14), 30);
          ((kf) this).a((ga) (Object) var4, 10);
          ((kf) this).a(true);
          return var4;
        }
    }

    kf(dn param0) {
        super(param0, 200, 130);
        ga var2 = new ga(mf.field_a, (sk) null);
        var2.field_n = 80;
        var2.field_i = ((kf) this).field_i;
        var2.field_k = 0;
        var2.field_j = 50;
        var2.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((kf) this).a(var2, 10);
        if (po.w(13296)) {
            ((kf) this).field_U = this.a(-1763, wd.field_w, (sk) this);
        }
        ((kf) this).field_W = this.a(-1763, re.field_c, (sk) this);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (param1 == -6) {
          if (param2 != ((kf) this).field_U) {
            if (((kf) this).field_W != param2) {
              return;
            } else {
              this.n(param1 + 16);
              return;
            }
          } else {
            td.a(param1 + 133);
            this.n(param1 ^ -16);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        if (!(param1 != 98)) {
            if (null != ((kf) this).field_U) {
                boolean discarded$0 = ((kf) this).field_U.a((byte) 100, (ga) this);
                return true;
            }
            boolean discarded$1 = ((kf) this).field_W.a((byte) 110, (ga) this);
            return true;
        }
        int var5 = 122 / ((param0 - -83) / 32);
        if (!((param1 ^ -1) != -100)) {
            boolean discarded$2 = ((kf) this).field_W.a((byte) 107, (ga) this);
            return true;
        }
        return super.a(75, param1, param2, param3);
    }

    public static void m(int param0) {
        field_T = null;
        field_V = null;
        field_Y = null;
        if (param0 != 4347) {
            kf.m(-22);
            field_X = null;
            return;
        }
        field_X = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "Name is available";
        field_Y = "Locked";
        field_V = "Updates will sent to the email address you've given";
    }
}
