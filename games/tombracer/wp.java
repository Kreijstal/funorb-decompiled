/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_a;
    static int field_b;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 <= 60) {
            field_a = null;
        }
    }

    final static mu a(int param0, String param1) {
        String var2 = null;
        mu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (hia.field_s != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = jd.a(1, var6);
              if (var2 != null) {
                if (param0 > 85) {
                  var3 = (mu) (Object) hia.field_s.a(-128, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_tb;
                      var4 = jd.a(1, var7);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (mu) (Object) hia.field_s.b((byte) 47);
                        continue L0;
                      } else {
                        return var3;
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
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          if (null == hka.field_b) {
            break L0;
          } else {
            if (null != hka.field_b.field_h) {
              hka.field_b.field_h.field_cb = false;
              break L0;
            } else {
              lu.field_b = null;
              if (param0 == -1) {
                hka.field_b = null;
                return;
              } else {
                var2 = null;
                mu discarded$4 = wp.a(-23, (String) null);
                hka.field_b = null;
                return;
              }
            }
          }
        }
        lu.field_b = null;
        if (param0 != -1) {
          var2 = null;
          mu discarded$5 = wp.a(-23, (String) null);
          hka.field_b = null;
          return;
        } else {
          hka.field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
