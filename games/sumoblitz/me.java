/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    final static boolean a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= param1.length()) {
              return false;
            } else {
              var3 = param1.charAt(var2);
              if (!rg.a(98, (char) var3)) {
                if (!ea.a((byte) -54, (char) var3)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    static {
    }
}
