/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ri field_c;
    static String field_a;
    static jn field_d;
    static ri[] field_b;

    public static void a() {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 < -22) {
          if (param0 != 6406) {
            if (6409 != param0) {
              if (param0 == 32841) {
                return 1;
              } else {
                if (6410 != param0) {
                  if (6407 != param0) {
                    if (param0 != 6408) {
                      throw new IllegalArgumentException("");
                    } else {
                      return 4;
                    }
                  } else {
                    return 3;
                  }
                } else {
                  return 2;
                }
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        } else {
          return -76;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
