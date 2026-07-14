/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static String field_c;
    static String field_d;
    static String field_b;
    static int[][] field_a;

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = 40 % ((param0 - 22) / 63);
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 == -12863) {
          if (null != oi.field_k) {
            if (oi.field_k.e((byte) -118) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ae.b(8);
          if (null != oi.field_k) {
            if (oi.field_k.e((byte) -118) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static ii a(int param0, ci param1, int param2, boolean param3) {
        if (param3) {
          if (!rl.a(param2, 0, param0, param1)) {
            return null;
          } else {
            return f.a(0);
          }
        } else {
          field_c = null;
          if (!rl.a(param2, 0, param0, param1)) {
            return null;
          } else {
            return f.a(0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Suggested names: ";
        field_c = "Use this alternative as your account name";
        field_b = "This password contains your Player Name, and would be easy to guess";
    }
}
