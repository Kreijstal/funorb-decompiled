/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static boolean field_b;
    static rf field_d;
    static String field_a;
    static int field_c;

    final static void a(byte param0) {
        if (param0 != -35) {
          field_b = false;
          ce.field_b = false;
          field_b = false;
          h.a(-1, true);
          gb.field_i = el.field_p;
          ma.field_o = el.field_p;
          return;
        } else {
          ce.field_b = false;
          field_b = false;
          h.a(-1, true);
          gb.field_i = el.field_p;
          ma.field_o = el.field_p;
          return;
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = param0.length();
        param0.setLength(param3);
        var5 = var4;
        if (param1 == 0) {
          L0: while (true) {
            if (param3 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param2);
              var5++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != -23354) {
          var2 = null;
          StringBuilder discarded$2 = k.a((StringBuilder) null, 112, '￫', -41);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (!param0.equals((Object) (Object) "B")) {
          if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (!param0.equals((Object) (Object) "S")) {
              if (param0.equals((Object) (Object) "J")) {
                return Long.TYPE;
              } else {
                if (param0.equals((Object) (Object) "Z")) {
                  return Boolean.TYPE;
                } else {
                  if (param0.equals((Object) (Object) "F")) {
                    return Float.TYPE;
                  } else {
                    if (!param0.equals((Object) (Object) "D")) {
                      if (param1 < -95) {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      } else {
                        return null;
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
        } else {
          return Byte.TYPE;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Achievements";
        field_c = 0;
    }
}
