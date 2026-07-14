/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tmb extends rqa {
    static int field_o;

    tmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = 74;
          nsb.field_a = param0[0].a(92);
          return new nc((Object) (Object) "void");
        } else {
          nsb.field_a = param0[0].a(92);
          return new nc((Object) (Object) "void");
        }
    }

    final static int a(tv param0, byte param1) {
        Object var3 = null;
        bk.field_w.field_e = 0;
        if (param1 < -5) {
          bk.field_w.q(-81);
          if (param0 instanceof utb) {
            ((utb) (Object) param0).a(bk.field_w, (byte) -116);
            bk.field_w.r(32712);
            return psb.a(bk.field_w.field_h, bk.field_w.field_e, 0);
          } else {
            param0.b(bk.field_w, -111);
            bk.field_w.r(32712);
            return psb.a(bk.field_w.field_h, bk.field_w.field_e, 0);
          }
        } else {
          var3 = null;
          int discarded$1 = tmb.a((tv) null, (byte) 16);
          bk.field_w.q(-81);
          if (param0 instanceof utb) {
            ((utb) (Object) param0).a(bk.field_w, (byte) -116);
            bk.field_w.r(32712);
            return psb.a(bk.field_w.field_h, bk.field_w.field_e, 0);
          } else {
            param0.b(bk.field_w, -111);
            bk.field_w.r(32712);
            return psb.a(bk.field_w.field_h, bk.field_w.field_e, 0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        amb discarded$0 = new amb();
        field_o = -1;
    }
}
