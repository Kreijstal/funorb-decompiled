/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends gg {
    static String field_k;
    static String field_o;
    static String field_l;
    boolean field_n;
    int[] field_m;

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        int var1 = -67 / ((param0 - 35) / 55);
        field_l = null;
    }

    final static Class b(String param0, int param1) throws ClassNotFoundException {
        if (param0.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (param1 < -52) {
            if (param0.equals((Object) (Object) "I")) {
              return Integer.TYPE;
            } else {
              if (!param0.equals((Object) (Object) "S")) {
                if (!param0.equals((Object) (Object) "J")) {
                  if (param0.equals((Object) (Object) "Z")) {
                    return Boolean.TYPE;
                  } else {
                    if (param0.equals((Object) (Object) "F")) {
                      return Float.TYPE;
                    } else {
                      if (!param0.equals((Object) (Object) "D")) {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      } else {
                        return Double.TYPE;
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
          } else {
            return null;
          }
        }
    }

    final static pb[] a(byte param0, int param1) {
        pb[] var2 = null;
        pb[] var3 = null;
        if (param0 > -107) {
          field_k = null;
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        } else {
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        }
    }

    he() {
        ((he) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Shoots all round";
        field_o = "Waiting for models";
        field_l = "Heavy cannon";
    }
}
