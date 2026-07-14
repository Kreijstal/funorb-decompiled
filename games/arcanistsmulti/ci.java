/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_b;
    static gd field_c;
    static kc field_a;
    static qb field_e;
    static pb field_d;

    final static void a(byte param0) {
        io.field_n = oo.d(-9685);
        p.field_b = new h();
        if (param0 <= 49) {
          field_b = null;
          sc.a(true, false, true);
          return;
        } else {
          sc.a(true, false, true);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static bd a(boolean param0, String param1, int param2, long param3, String param4) {
        if (-1L != (param3 ^ -1L)) {
          if (param0) {
            return (bd) (Object) new ld(param3, param4);
          } else {
            if (param2 >= -49) {
              field_e = null;
              return (bd) (Object) new im(param3, param4);
            } else {
              return (bd) (Object) new im(param3, param4);
            }
          }
        } else {
          if (param1 == null) {
            if (param0) {
              return (bd) (Object) new ld(param3, param4);
            } else {
              if (param2 < -49) {
                return (bd) (Object) new im(param3, param4);
              } else {
                field_e = null;
                return (bd) (Object) new im(param3, param4);
              }
            }
          } else {
            return (bd) (Object) new an(param1, param4);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Classic";
    }
}
