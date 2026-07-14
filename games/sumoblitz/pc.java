/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ri field_c;
    static String field_a;
    static jn field_d;
    static ri[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 1) {
          field_c = null;
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 < -22) {
          if (-6407 != param0) {
            if (6409 != param0) {
              if (-32842 != param0) {
                if (6410 != param0) {
                  if (6407 != param0) {
                    if ((param0 ^ -1) == -6409) {
                      return 4;
                    } else {
                      throw new IllegalArgumentException("");
                    }
                  } else {
                    return 3;
                  }
                } else {
                  return 2;
                }
              } else {
                return 1;
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
