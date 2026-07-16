/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends uf {
    static java.awt.Frame field_w;
    static boolean field_u;
    static String field_t;
    static int[][] field_v;

    public static void f(int param0) {
        Object var2 = null;
        field_t = null;
        field_w = null;
        if (param0 != -24631) {
          var2 = null;
          boolean discarded$2 = bg.a((String) null, -7, (String) null);
          field_v = null;
          return;
        } else {
          field_v = null;
          return;
        }
    }

    final String b(rc param0, int param1) {
        if (param1 != 0) {
          bg.f(57);
          return uc.a(param1 + -110, '*', param0.field_i.length());
        } else {
          return uc.a(param1 + -110, '*', param0.field_i.length());
        }
    }

    private bg(mg param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(String param0, int param1, String param2) {
        Object var4 = null;
        if (lc.a(0, param2)) {
          return false;
        } else {
          if (lh.a(param2, (byte) -57)) {
            return false;
          } else {
            if (!b.a(param2, (byte) 93)) {
              if (param0.length() != 0) {
                if (!ne.a(param2, false, param0)) {
                  if (!gl.a(param2, 80, param0)) {
                    if (l.a(param0, param2, 0)) {
                      return false;
                    } else {
                      if (param1 < 41) {
                        var4 = null;
                        boolean discarded$2 = bg.a((String) null, 71, (String) null);
                        return true;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    bg(int param0) {
        this(ua.field_G, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = false;
        field_t = "Waiting for extra data";
    }
}
