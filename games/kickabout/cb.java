/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String field_a;
    static uh field_d;
    static ld field_c;
    static byte[][][] field_b;
    static String field_f;
    static String field_e;

    final static boolean a(int param0, String param1, byte param2, int[] param3, long param4) {
        if (param2 <= -53) {
          if (param3 != null) {
            if (param0 == 2) {
              if (nq.a(false, param1, param4)) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
        int var1 = -18 / ((param0 - -33) / 61);
        field_d = null;
        field_c = null;
    }

    final static void a(jt param0, byte param1) {
        np.field_Jb.a((gn) (Object) new vf(param0), 3);
        if (param1 < 118) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for opponent to choose a formation.";
        field_c = new ld();
        field_f = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_e = "Account created successfully!";
    }
}
