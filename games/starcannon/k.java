/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static int field_a;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        var3 = vh.a(param2, 0);
        if (param1.indexOf(param2) == -1) {
          if (param1.indexOf(var3) == -1) {
            if (param0 == 19272) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (param1.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
