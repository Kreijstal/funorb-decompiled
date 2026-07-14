/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_d;
    static String field_f;
    static int field_a;
    static String field_c;
    static so field_e;
    static di field_g;
    static boolean[] field_b;

    final static void a(int param0, String[] param1) {
        int var2 = 0;
        if (lh.field_c == null) {
          if (null != tg.field_a) {
            tg.field_a.field_S.a(false, param1);
            var2 = 25 % ((param0 - -8) / 53);
            return;
          } else {
            var2 = 25 % ((param0 - -8) / 53);
            return;
          }
        } else {
          lh.field_c.field_P.a(false, param1);
          if (null == tg.field_a) {
            var2 = 25 % ((param0 - -8) / 53);
            return;
          } else {
            tg.field_a.field_S.a(false, param1);
            var2 = 25 % ((param0 - -8) / 53);
            return;
          }
        }
    }

    final static void a(qp param0, int param1) {
        Object var3 = null;
        if (param1 != 0) {
          var3 = null;
          gf.a((qp) null, 80);
          e.field_a.a(param1 ^ -99, (vh) (Object) param0);
          return;
        } else {
          e.field_a.a(param1 ^ -99, (vh) (Object) param0);
          return;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_g = null;
        field_e = null;
        if (!param0) {
          var2 = null;
          gf.a((qp) null, 34);
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static eo a(int param0, String param1) {
        String var2 = null;
        int var3 = 0;
        eo var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (df.field_b != null) {
          if (param1 != null) {
            if (0 != param1.length()) {
              var3 = 53 / ((-16 - param0) / 62);
              var6 = (CharSequence) (Object) param1;
              var2 = hq.a(83, var6);
              if (var2 != null) {
                var4 = (eo) (Object) df.field_b.a((long)var2.hashCode(), false);
                L0: while (true) {
                  if (var4 != null) {
                    var7 = (CharSequence) (Object) var4.field_Zb;
                    var5 = hq.a(84, var7);
                    if (var5.equals((Object) (Object) var2)) {
                      return var4;
                    } else {
                      var4 = (eo) (Object) df.field_b.a(-127);
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Please remove <%0> from your friend list first.";
        field_c = "Accept <%0> into this game";
    }
}
