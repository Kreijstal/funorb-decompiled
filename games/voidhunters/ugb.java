/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ugb extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(qua.field_b);
    }

    final static int a(int param0, pgb param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = kmb.field_a;
        if (param1.field_a != param0) {
          if (param1.field_a != 4) {
            if (param1.field_i != wqa.field_a) {
              var2 = bja.field_p[param1.field_a];
              return var2;
            } else {
              var2 = rqa.field_m[param1.field_a];
              return var2;
            }
          } else {
            var2 = bja.field_p[param1.field_a];
            return var2;
          }
        } else {
          if (!param1.field_k) {
            if (0 == param1.field_f) {
              if (-1 != (param1.field_h ^ -1)) {
                var2 = bja.field_p[param1.field_a];
                return var2;
              } else {
                var2 = rqa.field_m[param1.field_a];
                return var2;
              }
            } else {
              var2 = bja.field_p[param1.field_a];
              return var2;
            }
          } else {
            var2 = kmb.field_a;
            return var2;
          }
        }
    }

    ugb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
