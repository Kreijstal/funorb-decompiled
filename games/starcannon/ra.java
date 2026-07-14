/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends ik {
    static sk field_t;
    rb field_u;
    byte field_w;
    int field_v;
    static String field_y;
    static String field_x;

    final static re a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        re var9 = null;
        Object var10 = null;
        if (param5 >= -67) {
          var10 = null;
          re discarded$1 = ra.a(58, -25, 122, -39, (int[]) null, 47, 64, -83, 118);
          var9 = new re(param0, param7, param1, param2, param6, param3, param4);
          s.field_e.b(68, (rf) (Object) var9);
          vh.a(param8, var9, 0);
          return var9;
        } else {
          var9 = new re(param0, param7, param1, param2, param6, param3, param4);
          s.field_e.b(68, (rf) (Object) var9);
          vh.a(param8, var9, 0);
          return var9;
        }
    }

    final byte[] f(int param0) {
        if (!((ra) this).field_r) {
          if (((ra) this).field_u.field_g >= ((ra) this).field_u.field_f.length + -((ra) this).field_w) {
            if (param0 != 0) {
              byte[] discarded$2 = ((ra) this).f(-20);
              return ((ra) this).field_u.field_f;
            } else {
              return ((ra) this).field_u.field_f;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final int e(int param0) {
        if (((ra) this).field_u != null) {
          if (param0 != -29144) {
            return 74;
          } else {
            return 100 * ((ra) this).field_u.field_g / (-((ra) this).field_w + ((ra) this).field_u.field_f.length);
          }
        } else {
          return 0;
        }
    }

    public static void d(byte param0) {
        field_x = null;
        field_y = null;
        field_t = null;
        int var1 = -116 / ((54 - param0) / 34);
    }

    ra() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new sk();
        field_y = "SIDE GUNS - Provides extra fire platforms for the Nova Ray's main gun, which support the front of the ship.";
        field_x = "FULL ACCESS";
    }
}
