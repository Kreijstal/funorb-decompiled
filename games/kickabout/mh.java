/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends jd {
    static gm field_k;
    static dk field_q;
    private boolean field_n;
    static String field_l;
    private String field_m;
    private ge field_p;
    static String field_o;
    static int[] field_j;

    mh(ga param0, ga param1) {
        super(param0);
        ((mh) this).field_n = false;
        ((mh) this).field_m = "";
        ((mh) this).field_p = new ge(param0, param1);
    }

    final String a(byte param0, String param1) {
        Object var4 = null;
        if (param0 == 25) {
          if (((mh) this).field_p.a(param1, -5) == jt.field_Bb) {
            return ((mh) this).field_p.a((byte) 25, param1);
          } else {
            if (((mh) this).a(param1, -5) == jt.field_Bb) {
              return ql.field_b;
            } else {
              return dl.field_g;
            }
          }
        } else {
          var4 = null;
          rv discarded$8 = ((mh) this).a((String) null, 68);
          if (((mh) this).field_p.a(param1, -5) == jt.field_Bb) {
            return ((mh) this).field_p.a((byte) 25, param1);
          } else {
            if (((mh) this).a(param1, -5) == jt.field_Bb) {
              return ql.field_b;
            } else {
              return dl.field_g;
            }
          }
        }
    }

    final rv a(String param0, int param1) {
        kw var3 = null;
        if (((mh) this).field_p.a(param0, param1) == jt.field_Bb) {
            return jt.field_Bb;
        }
        if (!(param0.equals((Object) (Object) ((mh) this).field_m))) {
            var3 = kt.a(false, param0);
            if (!(var3.a((byte) -80))) {
                return en.field_p;
            }
            ((mh) this).field_m = param0;
            ((mh) this).field_n = var3.b((byte) -90);
        }
        return ((mh) this).field_n ? he.field_yb : jt.field_Bb;
    }

    public static void g(int param0) {
        field_o = null;
        field_q = null;
        field_l = null;
        field_k = null;
        field_j = null;
        if (param0 != -29635) {
            field_l = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Connection lost. <%0>";
        field_o = null;
    }
}
