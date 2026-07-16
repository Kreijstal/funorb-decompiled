/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String[] field_b;
    static kh field_a;
    static int field_c;

    final static String b(int param0) {
        if (!nh.field_P) {
          if (ge.field_c >= ea.field_b) {
            if (ge.field_c >= sd.field_lb + ea.field_b) {
              if (param0 == -1) {
                return null;
              } else {
                return null;
              }
            } else {
              return oc.field_b;
            }
          } else {
            if (param0 == -1) {
              return null;
            } else {
              return null;
            }
          }
        } else {
          if (param0 == -1) {
            return null;
          } else {
            return null;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        Object var5 = null;
        L0: {
          var5 = null;
          var3 = var5;
          var4 = null;
          if (null == jg.field_B) {
            break L0;
          } else {
            if (!jg.field_B.equals((Object) (Object) param0.getParameter("settings"))) {
              var3 = (Object) (Object) jg.field_B;
              var4 = var3;
              var4 = var3;
              break L0;
            } else {
              if (!param2) {
                L1: {
                  if (null == bl.field_b) {
                    break L1;
                  } else {
                    if (bl.field_b.equals((Object) (Object) param0.getParameter("session"))) {
                      break L1;
                    } else {
                      var4 = (Object) (Object) bl.field_b;
                      break L1;
                    }
                  }
                }
                return bi.a(param1, (byte) -107, -1, (String) var5, (String) var4);
              } else {
                L2: {
                  field_c = 112;
                  if (null == bl.field_b) {
                    break L2;
                  } else {
                    if (bl.field_b.equals((Object) (Object) param0.getParameter("session"))) {
                      break L2;
                    } else {
                      var4 = (Object) (Object) bl.field_b;
                      break L2;
                    }
                  }
                }
                return bi.a(param1, (byte) -107, -1, (String) var5, (String) var4);
              }
            }
          }
        }
        if (param2) {
          L3: {
            field_c = 112;
            if (null == bl.field_b) {
              break L3;
            } else {
              if (bl.field_b.equals((Object) (Object) param0.getParameter("session"))) {
                break L3;
              } else {
                var4 = (Object) (Object) bl.field_b;
                break L3;
              }
            }
          }
          return bi.a(param1, (byte) -107, -1, (String) var3, (String) var4);
        } else {
          L4: {
            if (null == bl.field_b) {
              break L4;
            } else {
              if (bl.field_b.equals((Object) (Object) param0.getParameter("session"))) {
                break L4;
              } else {
                var4 = (Object) (Object) bl.field_b;
                break L4;
              }
            }
          }
          return bi.a(param1, (byte) -107, -1, (String) var3, (String) var4);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
            String discarded$0 = ag.b(8);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
