/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static char field_c;
    static tf field_a;
    static int field_g;
    static long field_f;
    static int field_b;
    static ut[] field_d;
    static String field_e;
    static int field_h;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        int var2 = 0;
        if (param1.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (!param1.equals((Object) (Object) "S")) {
              if (!param1.equals((Object) (Object) "J")) {
                if (param1.equals((Object) (Object) "Z")) {
                  return Boolean.TYPE;
                } else {
                  if (param1.equals((Object) (Object) "F")) {
                    return Float.TYPE;
                  } else {
                    if (param1.equals((Object) (Object) "D")) {
                      return Double.TYPE;
                    } else {
                      if (param1.equals((Object) (Object) "C")) {
                        return Character.TYPE;
                      } else {
                        var2 = 29 % ((param0 - -28) / 51);
                        return Class.forName(param1);
                      }
                    }
                  }
                }
              } else {
                return Long.TYPE;
              }
            } else {
              return Short.TYPE;
            }
          }
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 10) {
            return false;
        }
        return true;
    }

    final static String a(String param0, int param1, byte param2) {
        int var4 = 0;
        ml var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param0;
        if (!ef.a(var6, -9907)) {
          return kq.field_Ib;
        } else {
          if (hm.a((byte) 86, param0)) {
            return ec.field_g;
          } else {
            if (ts.field_d == 2) {
              if (!hi.a(0, param0)) {
                if (ou.field_y >= 100) {
                  return an.field_f;
                } else {
                  if (!lf.a(param0, 108)) {
                    var5 = or.field_d;
                    var5.b(param1, (byte) 97);
                    var5.field_n = var5.field_n + 1;
                    if (param2 <= 124) {
                      return null;
                    } else {
                      var4 = var5.field_n;
                      var5.a(112, 2);
                      var5.a(14190, param0);
                      var5.c(62, var5.field_n + -var4);
                      return null;
                    }
                  } else {
                    return vo.a((byte) -18, pt.field_i, new String[1]);
                  }
                }
              } else {
                return vo.a((byte) -18, of.field_b, new String[1]);
              }
            } else {
              return pu.field_Ab;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        int var1 = 89 / ((param0 - 12) / 60);
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 640;
        field_a = new tf();
        field_e = "<%0> has not yet unlocked this option for use.";
        field_h = 66;
    }
}
