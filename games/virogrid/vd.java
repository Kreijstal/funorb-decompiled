/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends wa implements fg {
    private le field_U;
    static mg[] field_Y;
    static String field_X;
    static en field_Z;
    private int field_W;
    static String field_V;

    vd(String param0, cd param1, int param2) {
        super(param0, param1, param2);
    }

    final String d(int param0) {
        if (((vd) this).field_p) {
          if (((vd) this).field_h != null) {
            km.a(((vd) this).field_g + (-((vd) this).field_W + nl.field_u), hk.field_Jb, -83);
            if (param0 <= 35) {
              return null;
            } else {
              return ((vd) this).field_h;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void l(int param0) {
        field_X = null;
        field_Z = null;
        if (param0 != -1) {
          field_Y = null;
          field_V = null;
          field_Y = null;
          return;
        } else {
          field_V = null;
          field_Y = null;
          return;
        }
    }

    final static hh a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        hh var5 = null;
        var4 = param0;
        if (param0 != null) {
          if (param0.length() != 0) {
            var2 = param0.indexOf('@');
            if (var2 == -1) {
              return a.field_H;
            } else {
              var3 = param0.substring(0, var2);
              var4 = param0.substring(var2 + 1);
              if (param1 > 6) {
                var5 = j.a(var3, 0);
                if (var5 != null) {
                  return var5;
                } else {
                  return qc.a(28320, var4);
                }
              } else {
                return null;
              }
            }
          } else {
            return pi.field_b;
          }
        } else {
          return pi.field_b;
        }
    }

    final void e(int param0) {
        super.e(param0);
        if (null != ((vd) this).field_U) {
            ((vd) this).field_U.b(false);
        }
    }

    final void a(le param0, byte param1) {
        ((vd) this).field_U = param0;
        if (param1 <= 124) {
            field_X = null;
        }
    }

    public final le a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ((vd) this).field_U;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        super.a(param0, 114, param2, param3);
        if (param1 < 113) {
          return;
        } else {
          ((vd) this).field_W = nl.field_u - (((vd) this).field_l + param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "This password contains repeated characters, and would be easy to guess";
        field_X = null;
    }
}
