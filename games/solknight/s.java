/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends gf {
    static String field_ib;
    static int field_gb;
    static java.applet.Applet field_jb;
    static String field_hb;

    s(i param0, rc param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void c(int param0, rc param1) {
        Object var4 = null;
        if (param0 != -3399) {
          var4 = null;
          ((s) this).c(-9, (rc) null);
          super.c(param0 + 0, param1);
          return;
        } else {
          super.c(param0 + 0, param1);
          return;
        }
    }

    public static void m(int param0) {
        if (param0 != -1) {
            return;
        }
        field_ib = null;
        field_hb = null;
        field_jb = null;
    }

    final static String o(int param0) {
        String var1 = "";
        if (!(ve.field_a == null)) {
            var1 = ve.field_a.j(-19569);
        }
        int var2 = -90 % ((param0 - 58) / 51);
        if (var1.length() == 0) {
            var1 = qe.a((byte) 127);
        }
        if (!(-1 != (var1.length() ^ -1))) {
            var1 = je.field_a;
        }
        return var1;
    }

    final static void n(int param0) {
        L0: {
          if (null != kj.field_P) {
            kj.field_P.a();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 0) {
          if (null != ql.field_r) {
            ql.field_r.a();
            return;
          } else {
            return;
          }
        } else {
          String discarded$6 = s.o(-8);
          if (null == ql.field_r) {
            return;
          } else {
            ql.field_r.a();
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = 0;
        field_ib = null;
    }
}
