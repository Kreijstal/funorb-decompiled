/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_b;
    static String field_a;
    static String field_c;

    final static tl a(String param0, byte param1, int param2) {
        q var3 = null;
        var3 = new q();
        if (param1 != 40) {
          field_b = null;
          ((tl) (Object) var3).field_d = param2;
          ((tl) (Object) var3).field_c = param0;
          return (tl) (Object) var3;
        } else {
          ((tl) (Object) var3).field_d = param2;
          ((tl) (Object) var3).field_c = param0;
          return (tl) (Object) var3;
        }
    }

    final static nk a(int param0, int param1, String param2) {
        nk var3 = new nk(false);
        var3.field_g = param0;
        var3.field_d = param2;
        if (param1 != 0) {
            return null;
        }
        return var3;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (param2 >= 99) {
          if (!re.a(param0, -102, param1)) {
            return false;
          } else {
            var3 = 0;
            L0: while (true) {
              if (param1.length() > var3) {
                if (!fd.a(true, param1.charAt(var3))) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          nk discarded$2 = nc.a(14, -121, (String) null);
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading fonts";
        field_a = "You have <%0> unread messages!";
        field_c = "Updates will sent to the email address you've given";
    }
}
