/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_g;
    static qb[] field_i;
    static String field_f;
    static int field_h;
    static ll[] field_c;
    static String field_e;
    static String field_d;
    static String field_a;
    static String field_b;

    final static String a(int param0, String param1, eg param2, String param3, String param4) {
        if (param2.c(param0 + -28076)) {
          if (param0 != 17153) {
            field_b = null;
            return param1 + " - " + param2.b(param4, 119) + "%";
          } else {
            return param1 + " - " + param2.b(param4, 119) + "%";
          }
        } else {
          return param3;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        String var3 = null;
        String var4 = null;
        L0: {
          var3 = null;
          var4 = null;
          if (vm.field_b == null) {
            break L0;
          } else {
            if (vm.field_b.equals((Object) (Object) param0.getParameter("settings"))) {
              break L0;
            } else {
              var3 = vm.field_b;
              var4 = var3;
              var4 = var3;
              break L0;
            }
          }
        }
        L1: {
          if (so.field_g == null) {
            break L1;
          } else {
            if (!so.field_g.equals((Object) (Object) param0.getParameter("session"))) {
              var4 = so.field_g;
              break L1;
            } else {
              if (param2 != -31843) {
                return null;
              } else {
                return si.a((byte) 115, var3, var4, -1, param1);
              }
            }
          }
        }
        if (param2 != -31843) {
          return null;
        } else {
          return si.a((byte) 115, var3, var4, -1, param1);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -1) {
          field_e = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_d = null;
          field_i = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_d = null;
          field_i = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> must play 1 more rated game before playing with the current options.";
        field_f = "There are no valid types of game that match your preferences.";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = "In Rated games, it is important to remember that, as long as your team wins and you haven't resigned, you will gain rating. You will only lose your rating if you resign or your team loses. So, don't quit just because you have died: stay, give advice and cheer on your allies!";
        field_e = "Unable to add friend - system busy";
    }
}
