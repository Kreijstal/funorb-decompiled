/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hb {
    static bi field_d;
    static java.applet.Applet field_a;
    static bi[] field_b;
    static int field_e;
    static String field_c;

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == -31654) {
            break L0;
          } else {
            field_e = 87;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!hq.a(-95, (char) var3)) {
              if (!dk.a((byte) -66, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static ve a(byte param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (eg.field_q != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = ji.a(var6, true);
              if (var2 != null) {
                if (param0 == -90) {
                  var3 = (ve) (Object) eg.field_q.a(65280, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Ab;
                      var4 = ji.a(var7, true);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (ve) (Object) eg.field_q.d((byte) -112);
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
        } else {
          return null;
        }
    }

    public static void c(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != -122) {
            field_d = null;
        }
        field_a = null;
    }

    abstract int b(byte param0);

    abstract oh a(byte param0);

    abstract oh a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = "Player";
    }
}
