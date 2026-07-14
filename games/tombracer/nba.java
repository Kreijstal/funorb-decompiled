/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nba {
    static int field_b;
    static int[] field_a;

    final static void a(ff param0, la param1, byte param2) {
        int var3 = 0;
        if (!vpa.a(76)) {
          if (!param0.k(-25319)) {
            if (param1.q((byte) -82) < 0) {
              return;
            } else {
              ql.field_k.k(98, -2988);
              ql.field_k.f(-1477662136, param1.q((byte) -82));
              var3 = 8 % ((param2 - 51) / 36);
              ql.field_k.f(-1477662136, param1.a((byte) 107));
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(fia param0, sq param1, int param2, int param3, int param4, java.awt.Component param5, int param6, boolean param7) {
        kta.a(param3, param7, 10);
        ipa.field_P = kta.a(param0, param5, 0, param4);
        int var8 = 22 % ((50 - param6) / 54);
        gg.field_b = kta.a(param0, param5, 1, param2);
        kva.field_n = new en();
        ov.field_p = param2;
        gg.field_b.b((cg) (Object) kva.field_n);
        tva.field_d = param1;
        tva.field_d.a((byte) 100, ff.field_w);
        ipa.field_P.b((cg) (Object) tva.field_d);
    }

    public static void a(boolean param0) {
        if (param0) {
            nba.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
