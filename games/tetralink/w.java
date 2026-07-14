/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends um {
    static String field_s;
    static String field_q;
    static oh field_r;

    public static void g(int param0) {
        field_s = null;
        int var1 = -40 % ((param0 - -64) / 39);
        field_q = null;
        field_r = null;
    }

    w(nn param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        if (param1 != 26202) {
            return null;
        }
        if (!(((w) this).a(param1 + -26202, param0) != db.field_h)) {
            return qi.field_o;
        }
        return null;
    }

    final jk a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param1;
        if (!ni.a(var4, 10)) {
          return db.field_h;
        } else {
          if (param0 == 0) {
            var5 = (CharSequence) (Object) param1;
            var3 = rc.a(var5, 10);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return db.field_h;
              } else {
                return pf.field_a;
              }
            } else {
              return db.field_h;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Show chat (<%0> unread messages)";
    }
}
