/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rr {
    static String field_u;
    static bi field_v;
    static String field_w;
    static km field_x;

    private ce(nq param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!ef.a(param0, false)) {
            if (param0 != 45) {
              if (160 != param0) {
                if (param0 != 32) {
                  if (95 == param0) {
                    return true;
                  } else {
                    var2 = -121 % ((param1 - 43) / 57);
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        sq.field_o = true;
        if (!param1) {
          return;
        } else {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          lg.a(var4, param0, 60, var2, var3);
          return;
        }
    }

    final String b(boolean param0, vg param1) {
        if (!param0) {
          field_w = null;
          return ad.a('*', param1.field_s.length(), -34);
        } else {
          return ad.a('*', param1.field_s.length(), -34);
        }
    }

    ce(int param0) {
        this(gn.field_u, param0);
    }

    final static void a(String param0, String param1, byte param2) {
        Object var4 = null;
        L0: {
          if (null != ji.field_G) {
            ji.field_G.i((byte) -104);
            break L0;
          } else {
            break L0;
          }
        }
        no.field_e = new ri(param0, param1, false, true, true);
        if (param2 != 3) {
          var4 = null;
          ce.a((java.applet.Applet) null, true);
          ae.field_f.b((vg) (Object) no.field_e, 122);
          return;
        } else {
          ae.field_f.b((vg) (Object) no.field_e, 122);
          return;
        }
    }

    public static void b(boolean param0) {
        field_x = null;
        field_w = null;
        field_u = null;
        field_v = null;
        if (!param0) {
            field_v = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Chat view has been scrolled up. Scroll down to chat.";
        field_w = "This game has been updated! Please reload this page.";
    }
}
