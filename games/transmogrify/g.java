/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends fi {
    static hi field_y;
    static boolean field_A;
    static int field_z;

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        vl var7 = null;
        vl var8 = null;
        super.a(param0, param1, param2, param3 ^ 0, param4, param5);
        var8 = b.field_i;
        var7 = var8;
        if (var8 != null) {
          if (((g) this).b(param5, param0, -1, param1, param4)) {
            if (((g) this).field_m instanceof s) {
              ((s) (Object) ((g) this).field_m).a((g) this, 2089, var8);
              b.field_i = null;
              if (param3 != -1) {
                g.i(-34);
                return;
              } else {
                return;
              }
            } else {
              if (!(var8.field_m instanceof s)) {
                if (param3 != -1) {
                  g.i(-34);
                  return;
                } else {
                  return;
                }
              } else {
                ((s) (Object) var8.field_m).a((g) this, param3 + 2090, var8);
                b.field_i = null;
                if (param3 != -1) {
                  g.i(-34);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param3 != -1) {
              g.i(-34);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != -1) {
            g.i(-34);
            return;
          } else {
            return;
          }
        }
    }

    private g(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((g) this).field_v = param6;
    }

    public static void i(int param0) {
        field_y = null;
        if (param0 != 19224) {
            field_z = 81;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new hi();
    }
}
