/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int[] field_a;
    static int[] field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        var3 = rk.a(param1, 5);
        if (param2 == (param0.indexOf(param1) ^ -1)) {
          if ((param0.indexOf(var3) ^ -1) == 0) {
            if (!param0.startsWith(param1)) {
              if (!param0.startsWith(var3)) {
                if (!param0.endsWith(param1)) {
                  if (param0.endsWith(var3)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  return stackIn_11_0 != 0;
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

    public static void a(int param0) {
        field_a = null;
        if (param0 != -5928) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[2];
        field_b = new int[128];
    }
}
