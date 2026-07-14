/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends ec {
    static String field_E;
    static String[] field_J;
    static i field_B;
    static v field_H;
    static String[] field_F;
    static ic field_I;

    public static void f(int param0) {
        field_E = null;
        field_H = null;
        if (param0 > -100) {
            return;
        }
        field_B = null;
        field_F = null;
        field_I = null;
        field_J = null;
    }

    private vg(int param0, int param1, int param2, int param3, ol param4, cd param5, fi param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((vg) this).field_x = param6;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        ce var7 = null;
        ce var8 = null;
        if (param5 > 73) {
          super.a(param0, param1, param2, param3, param4, 125);
          var8 = ra.field_b;
          var7 = var8;
          if (var8 != null) {
            if (((vg) this).a(param4, param1, param0, (byte) 46, param2)) {
              if (!(((vg) this).field_o instanceof ik)) {
                if (!(var8.field_o instanceof ik)) {
                  return;
                } else {
                  ((ik) (Object) var8.field_o).a(120, (vg) this, var8);
                  ra.field_b = null;
                  return;
                }
              } else {
                ((ik) (Object) ((vg) this).field_o).a(82, (vg) this, var8);
                ra.field_b = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Your turn";
        field_J = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
