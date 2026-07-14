/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static boolean field_a;
    static int field_b;
    static ll[] field_d;
    static int[] field_c;

    final static int a(int param0, int param1, int param2) {
        if ((param2 ^ -1) == param0) {
          if (!cn.a(113, param1)) {
            return ub.field_i[param2];
          } else {
            return 29;
          }
        } else {
          return ub.field_i[param2];
        }
    }

    public static void a(int param0) {
        if (param0 <= 119) {
            field_d = null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    final static String a(String param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        wa var7 = null;
        wa var8 = null;
        ab var9 = null;
        CharSequence var10 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var10 = (CharSequence) (Object) param0;
        if (!vn.a(var10, param1 + -29140)) {
          return fn.field_h;
        } else {
          if (jb.field_t != 2) {
            return oo.field_E;
          } else {
            var8 = im.a(0, param0);
            if (var8 == null) {
              return tj.a(122, new String[1], rd.field_c);
            } else {
              pg discarded$1 = vd.field_d.a((pg) (Object) var8, 121);
              L0: while (true) {
                var7 = (wa) (Object) vd.field_d.a(param1 ^ 29140);
                if (var7 != null) {
                  var7.field_Bb = var7.field_Bb - 1;
                  continue L0;
                } else {
                  var8.a(true);
                  var8.a((byte) 88);
                  rc.field_m = rc.field_m - 1;
                  if (param1 != 29140) {
                    return null;
                  } else {
                    var9 = he.field_e;
                    var9.b((byte) -48, param2);
                    var9.field_g = var9.field_g + 1;
                    var5 = var9.field_g;
                    var9.f(1, (byte) -118);
                    var9.a(param0, 23333);
                    var9.b(var9.field_g + -var5, (byte) 43);
                    return null;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
