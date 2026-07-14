/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends g {
    int field_Mb;
    static String field_Nb;
    String field_Lb;
    static boolean field_Gb;
    static int field_Hb;
    String field_Eb;
    static String field_Kb;
    static boolean field_Ib;
    static String field_Fb;
    static int field_Db;
    static int field_Jb;
    static String field_Ob;

    q() {
        super(0L, (g) null);
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
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
                if (!param1.equals((Object) (Object) "Z")) {
                  if (!param1.equals((Object) (Object) "F")) {
                    if (param0 > 57) {
                      if (!param1.equals((Object) (Object) "D")) {
                        if (param1.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param1);
                        }
                      } else {
                        return Double.TYPE;
                      }
                    } else {
                      q.e(106);
                      if (!param1.equals((Object) (Object) "D")) {
                        if (param1.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param1);
                        }
                      } else {
                        return Double.TYPE;
                      }
                    }
                  } else {
                    return Float.TYPE;
                  }
                } else {
                  return Boolean.TYPE;
                }
              }
            } else {
              return Short.TYPE;
            }
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
          field_Ib = true;
          field_Ob = null;
          field_Kb = null;
          field_Nb = null;
          field_Fb = null;
          return;
        } else {
          field_Ob = null;
          field_Kb = null;
          field_Nb = null;
          field_Fb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "Passwords must be between 5 and 20 letters and numbers";
        field_Nb = "Loading music";
        field_Fb = "Left click to fire weapon";
        field_Db = 500;
        field_Ob = "Cancel";
    }
}
