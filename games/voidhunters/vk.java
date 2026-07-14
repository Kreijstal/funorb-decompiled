/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends rqa {
    static String field_o;

    public static void e(byte param0) {
        if (param0 < 49) {
            return;
        }
        field_o = null;
    }

    final static void a(java.applet.Applet param0, int param1, String[] param2, int param3, int param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        pha.field_p = param0.getParameter("overxgames");
        if (pha.field_p != null) {
          L0: {
            ud.field_R = param0.getParameter("overxachievements");
            if (null == ud.field_R) {
              ud.field_R = "0";
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var6 = param0.getParameter("currency");
            if (var6 == null) {
              break L1;
            } else {
              if (hwa.a((CharSequence) (Object) var6, param1 + -2131)) {
                int discarded$2 = lob.a(-106, (CharSequence) (Object) var6);
                break L1;
              } else {
                via.field_a = new phb[param2.length];
                if (param1 == 2141) {
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= param2.length) {
                      return;
                    } else {
                      via.field_a[var7] = new phb(317, 34);
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          via.field_a = new phb[param2.length];
          if (param1 == 2141) {
            var7 = 0;
            L3: while (true) {
              if (var7 >= param2.length) {
                return;
              } else {
                via.field_a[var7] = new phb(317, 34);
                var7++;
                continue L3;
              }
            }
          } else {
            return;
          }
        } else {
          L4: {
            pha.field_p = "0";
            ud.field_R = param0.getParameter("overxachievements");
            if (null == ud.field_R) {
              ud.field_R = "0";
              break L4;
            } else {
              break L4;
            }
          }
          var6 = param0.getParameter("currency");
          if (var6 != null) {
            L5: {
              if (hwa.a((CharSequence) (Object) var6, param1 + -2131)) {
                int discarded$3 = lob.a(-106, (CharSequence) (Object) var6);
                break L5;
              } else {
                break L5;
              }
            }
            via.field_a = new phb[param2.length];
            if (param1 == 2141) {
              var7 = 0;
              L6: while (true) {
                if (var7 >= param2.length) {
                  return;
                } else {
                  via.field_a[var7] = new phb(317, 34);
                  var7++;
                  continue L6;
                }
              }
            } else {
              return;
            }
          } else {
            via.field_a = new phb[param2.length];
            if (param1 == 2141) {
              var7 = 0;
              L7: while (true) {
                if (var7 >= param2.length) {
                  return;
                } else {
                  via.field_a[var7] = new phb(317, 34);
                  var7++;
                  continue L7;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
            si.a(181, 62, param0[0].a(79));
            return new nc((Object) (Object) "void");
        }
        si.a(181, 62, param0[0].a(79));
        return new nc((Object) (Object) "void");
    }

    vk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unknown";
    }
}
