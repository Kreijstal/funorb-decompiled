/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends kf {
    static id[] field_w;
    static long field_x;
    static lk field_y;

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        tj var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = il.field_k;
        if (var7 != null) {
          if (((af) this).a(param1, param2, param0, param5, param4 + -12768)) {
            if (!(((af) this).field_g instanceof da)) {
              if (!(var7.field_g instanceof da)) {
                return;
              } else {
                ((da) (Object) var7.field_g).a(var7, (af) this, 106);
                il.field_k = null;
                return;
              }
            } else {
              ((da) (Object) ((af) this).field_g).a(var7, (af) this, param4 + 138);
              il.field_k = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private af(int param0, int param1, int param2, int param3, de param4, qg param5, uj param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((af) this).field_t = param6;
    }

    public static void g(int param0) {
        field_y = null;
        field_w = null;
        if (param0 != 9392) {
            field_x = -117L;
        }
    }

    static {
    }
}
