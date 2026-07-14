/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static db field_b;
    static hl field_c;
    static String field_a;
    static String[] field_d;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2 = 0;
        var2 = -29 % ((param1 - -14) / 52);
        if (!param0.equals((Object) (Object) "B")) {
          if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (param0.equals((Object) (Object) "S")) {
              return Short.TYPE;
            } else {
              if (!param0.equals((Object) (Object) "J")) {
                if (!param0.equals((Object) (Object) "Z")) {
                  if (param0.equals((Object) (Object) "F")) {
                    return Float.TYPE;
                  } else {
                    if (param0.equals((Object) (Object) "D")) {
                      return Double.TYPE;
                    } else {
                      if (param0.equals((Object) (Object) "C")) {
                        return Character.TYPE;
                      } else {
                        return Class.forName(param0);
                      }
                    }
                  }
                } else {
                  return Boolean.TYPE;
                }
              } else {
                return Long.TYPE;
              }
            }
          }
        } else {
          return Byte.TYPE;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 119) {
          hh.a(-5, 126, -83, 41, -91);
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        nj.field_d = param2;
        i.field_n = param1;
        if (param4 >= -87) {
          hh.a((byte) 61);
          h.field_a = param3;
          hl.field_wb = param0;
          return;
        } else {
          h.field_a = param3;
          hl.field_wb = param0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading fonts";
        field_b = new db(12, 0, 1, 0);
        field_d = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
