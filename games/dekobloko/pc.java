/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_c;
    static String field_d;
    static ji field_b;
    static String field_a;
    static String field_e;
    static String field_f;

    final static String a(int param0) {
        if (sh.field_d == pa.field_V) {
            return ve.field_Gc;
        }
        if (param0 != 2) {
            return null;
        }
        return tc.field_Qb;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 >= -9) {
            return;
        }
        field_e = null;
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(int param0, int param1, long param2, String param3, int[] param4) {
        if (param1 == 2) {
          if (param4 != null) {
            if (param0 == 2) {
              if (!sg.a(param3, 120, param2)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = null;
          if (param4 != null) {
            if (param0 == 2) {
              if (!sg.a(param3, 120, param2)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_d = "Private";
        field_a = "FINISH<br><%0>";
        field_e = "Change display name";
        field_f = "Return to Main Menu";
    }
}
