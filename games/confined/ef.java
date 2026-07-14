/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends sj {
    static int field_tb;
    static int field_sb;
    static String field_ub;
    static int field_vb;
    static String field_wb;

    final void a(fj param0, byte param1) {
        super.a(param0, param1);
    }

    ef(sh param0, fj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static boolean a(int param0, String param1) {
        if (param1 != null) {
          if (param1.length() >= gb.field_d) {
            if (param1.length() <= oj.field_x) {
              if (param0 < 58) {
                field_vb = 90;
                return false;
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
          return true;
        }
    }

    public static void n(int param0) {
        field_wb = null;
        if (param0 <= 94) {
            ef.n(-3);
            field_ub = null;
            return;
        }
        field_ub = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_tb = 0;
        field_wb = "Names should contain a maximum of 12 characters";
        field_ub = "Difficulty: ";
    }
}
