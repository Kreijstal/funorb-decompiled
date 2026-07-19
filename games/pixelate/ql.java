/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends jj {
    static int field_m;
    static int field_o;
    static ak field_n;

    final static int g(int param0) {
        if (param0 != 13428) {
            field_m = -88;
            return oi.field_c;
        }
        return oi.field_c;
    }

    final static void b(boolean param0) {
        h.field_X = bi.b(4);
        wa.field_c = new kn();
        rd.a(true, -17130, true);
        if (param0) {
            ql.d(-24);
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            field_n = (ak) null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static boolean e(int param0) {
        if (param0 >= 94) {
          if (null != lb.field_x) {
            if (null == lb.field_x.n(640)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ql.f(30);
          if (null != lb.field_x) {
            if (null == lb.field_x.n(640)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        jk.field_a.f(0, 0);
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            c.field_T = true;
            var2 = "tuhstatbut";
            if (param1 != -7624) {
                field_o = 58;
            }
            var3 = "rvnadlm";
            var4 = -1L;
            nn.a(param0, 78, var3, var2, var4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ql.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        dk.field_c = false;
        wp.field_a = null;
        var1 = 32 / ((-65 - param0) / 51);
        if (!to.field_s) {
          var2 = ra.field_g;
          if ((var2 ^ -1) < -1) {
            if ((var2 ^ -1) == -2) {
              wp.field_a = to.field_o;
              wp.field_a = gi.a(0, new CharSequence[]{(CharSequence) ((Object) wp.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) tn.field_d)});
              to.field_r.p(-100);
              fl.a((byte) 81);
              return;
            } else {
              wp.field_a = sd.a(cf.field_v, 63, new String[]{Integer.toString(var2)});
              wp.field_a = gi.a(0, new CharSequence[]{(CharSequence) ((Object) wp.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) tn.field_d)});
              to.field_r.p(-100);
              fl.a((byte) 81);
              return;
            }
          } else {
            to.field_r.p(-100);
            fl.a((byte) 81);
            return;
          }
        } else {
          to.field_r.o(2121792);
          return;
        }
    }

    ql(String param0, tf[] param1) {
        super(param0, param1);
    }

    static {
    }
}
