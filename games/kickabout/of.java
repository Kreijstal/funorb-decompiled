/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static int field_e;
    static hd[] field_d;
    static vn field_f;
    static String field_b;
    static String field_c;
    static int field_a;

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0) {
            field_f = null;
        }
    }

    final static String a(int param0, byte param1, String param2) {
        int var5 = 0;
        int var6 = 0;
        gg var7 = null;
        gg var8 = null;
        ml var9 = null;
        CharSequence var10 = null;
        var6 = Kickabout.field_G;
        var10 = (CharSequence) (Object) param2;
        if (!ef.a(var10, -9907)) {
          return kq.field_Ib;
        } else {
          if ((ts.field_d ^ -1) == -3) {
            var8 = tr.a(param2, (byte) 40);
            if (var8 == null) {
              return vo.a((byte) -18, af.field_c, new String[1]);
            } else {
              gn discarded$1 = ne.field_I.b(-7584, (gn) (Object) var8);
              L0: while (true) {
                var7 = (gg) (Object) ne.field_I.c(33);
                if (var7 == null) {
                  var8.c((byte) -109);
                  var8.f(25);
                  bc.field_d = bc.field_d - 1;
                  var9 = or.field_d;
                  var9.b(param0, (byte) -85);
                  var9.field_n = var9.field_n + 1;
                  var5 = var9.field_n;
                  var9.a(123, 1);
                  var9.a(14190, param2);
                  if (param1 < 4) {
                    of.a(false);
                    var9.c(62, var9.field_n - var5);
                    return null;
                  } else {
                    var9.c(62, var9.field_n - var5);
                    return null;
                  }
                } else {
                  var7.field_Cb = var7.field_Cb - 1;
                  continue L0;
                }
              }
            }
          } else {
            return kh.field_t;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "lost";
        field_b = "<%0> is already on your ignore list.";
    }
}
