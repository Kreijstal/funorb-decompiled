/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_f;
    int field_c;
    String field_b;
    static ek field_j;
    String field_a;
    static int field_i;
    qk field_d;
    static String field_e;
    String field_g;
    static long field_h;
    static int field_k;

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 0) {
            field_j = (ek) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        if (!param0.equals((Object) (Object) "B")) {
          if (param1 <= -54) {
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
                    if (!param0.equals((Object) (Object) "F")) {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    } else {
                      return Float.TYPE;
                    }
                  }
                }
              } else {
                return Short.TYPE;
              }
            }
          } else {
            t.a((byte) 20);
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
                    if (!param0.equals((Object) (Object) "F")) {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    } else {
                      return Float.TYPE;
                    }
                  }
                }
              } else {
                return Short.TYPE;
              }
            }
          }
        } else {
          return Byte.TYPE;
        }
    }

    final static void a(byte param0) {
        if (param0 < 84) {
            return;
        }
        ri.field_c = rd.field_j.c(false);
        CharSequence var2 = (CharSequence) ri.field_c;
        aa.field_fb = ff.a((byte) 116, var2);
    }

    private t() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Service unavailable";
        field_i = 111;
        field_e = null;
        field_h = 0L;
        field_k = 20;
    }
}
