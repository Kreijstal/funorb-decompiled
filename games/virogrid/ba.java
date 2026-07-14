/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ba {
    static il field_c;
    static int field_a;
    static String field_b;

    final static String a(String param0, int param1, byte param2) {
        if (-4 == (param1 ^ -1)) {
          return nm.field_c;
        } else {
          if (param2 == 83) {
            if (param1 != -7) {
              if (-8 == param1) {
                return hg.field_o;
              } else {
                if ((param1 ^ -1) != -9) {
                  if (param1 == 9) {
                    return wc.field_e;
                  } else {
                    if ((param1 ^ -1) == -11) {
                      return se.field_a;
                    } else {
                      if (11 != param1) {
                        if (param1 != 14) {
                          return null;
                        } else {
                          return oi.a(new String[1], oe.field_d, param2 ^ 81);
                        }
                      } else {
                        return qd.field_g;
                      }
                    }
                  }
                } else {
                  return ti.field_c;
                }
              }
            } else {
              return na.field_Eb;
            }
          } else {
            return null;
          }
        }
    }

    abstract int a(int param0, int param1);

    final static void b(int param0) {
        if (param0 != 14) {
            ba.a(-71);
        }
    }

    abstract sj a(byte param0);

    abstract byte[] b(int param0, int param1);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 14) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
