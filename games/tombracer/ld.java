/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends ota {
    static String field_d;
    static int field_e;
    static String field_f;

    final static boolean a(boolean param0, String param1) {
        Object var3 = null;
        if (!param0) {
          if (param1 != null) {
            if (param1.length() >= ik.field_f) {
              if (param1.length() > im.field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          boolean discarded$4 = ld.a(true, (String) null);
          if (param1 != null) {
            if (param1.length() >= ik.field_f) {
              if (param1.length() > im.field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    abstract na b(int param0);

    private ld() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        int var1 = 35 / ((param0 - -62) / 50);
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "White light beams are safe for you, but deadly for skeletons. Maybe you can persuade the skeletons to step into the light.";
        field_f = "(<%0> players want to join)";
    }
}
