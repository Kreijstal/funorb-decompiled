/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static ja field_b;
    static String field_e;
    static int field_f;
    static String field_g;
    static cj field_c;
    static byte[][] field_a;
    static String field_d;

    final static cj a(int param0) {
        if (-1 <= (da.field_a ^ -1)) {
          if ((sq.field_Q ^ -1) >= -1) {
            if (param0 == 21262) {
              return null;
            } else {
              field_f = -119;
              return null;
            }
          } else {
            return dl.field_a;
          }
        } else {
          return dl.field_a;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_g = null;
        field_d = null;
        if (param0) {
          vb.a(false);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(int param0, String[][] param1, String[] param2, String[] param3, boolean param4, String[][] param5, int[] param6, String[] param7, byte[] param8, ul param9, int[] param10, int param11, ja[][] param12, int param13, ul param14, boolean param15, ja[][] param16, ul param17, byte[] param18, ri[] param19) {
        lc.a(-12035, param14, param10, param19, param9);
        if (param15) {
            return;
        }
        km.a(param14, (byte) -125);
        md.a(param7, param13, param6, param14, param2, param12, param16, param1, param8, param0, !param15 ? true : false, param18, param3, param11, param5);
        t.a(param17, param14, 0, param4);
        po.a(2);
        wf.a(6835);
        hb.b(41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ja(54, 54);
        field_f = 0;
        field_e = "You do not have a suitable number of players for the current options.";
        field_g = "Invite only";
        field_d = "Game options";
        field_a = new byte[250][];
    }
}
