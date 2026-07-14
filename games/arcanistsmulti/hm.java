/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static String field_b;
    static String field_d;
    static boolean field_c;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        if (param2 == -1) {
          var3 = pn.a(8671, param1);
          if ((param0.indexOf(param1) ^ -1) == 0) {
            if (param0.indexOf(var3) == -1) {
              if (!param0.startsWith(param1)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param1)) {
                    if (param0.endsWith(var3)) {
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
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            char discarded$0 = hm.a((byte) 69, 72);
        }
    }

    final static char a(byte param0, int param1) {
        int var4 = 0;
        int var2 = -108 / ((-55 - param1) / 44);
        int var3 = param0 & 255;
        if (!(var3 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var3, 16));
        }
        if (128 <= var3) {
            if (160 > var3) {
                var4 = oc.field_a[var3 + -128];
                if (var4 == 0) {
                    var4 = 63;
                }
                var3 = var4;
            }
        }
        return (char)var3;
    }

    public static void a(int param0) {
        int var1 = -47 / ((82 - param0) / 42);
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Storm spells focus on direct attacks and powerful wind effects.";
        field_a = "<shad><col=<%0>>STORM</col></shad>";
        field_b = "<br><br>You don't have enough health to transfer power to your familiar.";
    }
}
