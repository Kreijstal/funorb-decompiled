/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        var3 = na.a(param2, false);
        if (param1.indexOf(param2) == -1) {
          if (0 == (param1.indexOf(var3) ^ -1)) {
            if (param0 == 0) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (param1.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    return stackIn_14_0 != 0;
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
        } else {
          return true;
        }
    }

    static {
    }
}
