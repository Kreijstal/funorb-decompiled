/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static dd field_d;
    static String field_c;
    static int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 < 48) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        if (param1.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (!param1.equals((Object) (Object) "S")) {
              if (param1.equals((Object) (Object) "J")) {
                return Long.TYPE;
              } else {
                if (param1.equals((Object) (Object) "Z")) {
                  return Boolean.TYPE;
                } else {
                  if (param1.equals((Object) (Object) "F")) {
                    return Float.TYPE;
                  } else {
                    if (!param1.equals((Object) (Object) "D")) {
                      if (!param1.equals((Object) (Object) "C")) {
                        if (param0 >= -88) {
                          field_a = null;
                          return Class.forName(param1);
                        } else {
                          return Class.forName(param1);
                        }
                      } else {
                        return Character.TYPE;
                      }
                    } else {
                      return Double.TYPE;
                    }
                  }
                }
              }
            } else {
              return Short.TYPE;
            }
          }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var1 = -126 / ((-26 - param0) / 54);
        if ((th.field_D ^ -1) >= -33) {
            lg.a(-103, 0);
        } else {
            var2 = th.field_D % 32;
            if (0 == var2) {
                var2 = 32;
            }
            lg.a(-116, th.field_D - var2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End of free game!";
    }
}
