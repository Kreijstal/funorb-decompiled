/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[] field_b;
    static String field_d;
    static wl field_a;
    static hj field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -38) {
            field_d = null;
            field_d = null;
            field_b = null;
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, int param1, byte param2, int param3, String[] param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          ca.field_b = param0.getParameter("overxgames");
          if (null == ca.field_b) {
            ca.field_b = "0";
            break L0;
          } else {
            break L0;
          }
        }
        ji.field_a = param0.getParameter("overxachievements");
        if (param2 < -120) {
          if (ji.field_a != null) {
            L1: {
              var6 = param0.getParameter("currency");
              if (var6 == null) {
                break L1;
              } else {
                if (fk.a(false, (CharSequence) (Object) var6)) {
                  int discarded$2 = gn.a(16777215, (CharSequence) (Object) var6);
                  break L1;
                } else {
                  sf.field_b = new ed[param4.length];
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= param4.length) {
                      return;
                    } else {
                      sf.field_b[var7] = new ed(317, 34);
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            }
            sf.field_b = new ed[param4.length];
            var7 = 0;
            L3: while (true) {
              if (var7 >= param4.length) {
                return;
              } else {
                sf.field_b[var7] = new ed(317, 34);
                var7++;
                continue L3;
              }
            }
          } else {
            ji.field_a = "0";
            var6 = param0.getParameter("currency");
            if (var6 != null) {
              L4: {
                if (fk.a(false, (CharSequence) (Object) var6)) {
                  int discarded$3 = gn.a(16777215, (CharSequence) (Object) var6);
                  break L4;
                } else {
                  break L4;
                }
              }
              sf.field_b = new ed[param4.length];
              var7 = 0;
              L5: while (true) {
                if (var7 >= param4.length) {
                  return;
                } else {
                  sf.field_b[var7] = new ed(317, 34);
                  var7++;
                  continue L5;
                }
              }
            } else {
              sf.field_b = new ed[param4.length];
              var7 = 0;
              L6: while (true) {
                if (var7 >= param4.length) {
                  return;
                } else {
                  sf.field_b[var7] = new ed(317, 34);
                  var7++;
                  continue L6;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "OFF";
    }
}
