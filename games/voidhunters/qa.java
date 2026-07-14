/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends rqa {
    static ij field_o;
    static String field_p;

    qa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(202, 62, param0[0].a(32));
        if (param1 >= -119) {
          var4 = null;
          qa.a((byte) -17, (java.awt.Canvas) null);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        mv.a(10009, (java.awt.Component) (Object) param1);
        ts.a((java.awt.Component) (Object) param1, 1);
        if (!(kkb.field_o == null)) {
            kkb.field_o.a(-16, (java.awt.Component) (Object) param1);
        }
        int var2 = 13 / ((16 - param0) / 56);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -63) {
            field_o = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, String param1, int param2) {
        Object var4 = null;
        if (null != fwa.field_g) {
          if (null != fwa.field_g.field_e) {
            fwa.field_g.field_e.a(param1, param2, false);
            if (param0 != 202) {
              var4 = null;
              qa.a(-93, (String) null, -78);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 202) {
              var4 = null;
              qa.a(-93, (String) null, -78);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 202) {
            var4 = null;
            qa.a(-93, (String) null, -78);
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
        field_p = "<%0> left";
        field_o = new ij();
    }
}
