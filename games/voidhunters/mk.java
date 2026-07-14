/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends rqa {
    static String field_p;
    static boolean[] field_o;

    final static void a(byte param0, int[] param1, asb param2, asb param3, caa[] param4, int[] param5, String[][] param6, asb param7, String[][] param8, byte[] param9, byte[] param10, String[] param11, phb[][] param12, int param13, phb[][] param14, int param15, String[] param16, boolean param17, int param18, String[] param19) {
        bd.a(101, param1, param3, param7, param4);
        hka.a(param7, -97);
        vrb.a(param10, 10231, param15, param7, param11, param6, param14, param13, param12, param8, param19, param9, param18, param16, param5);
        et.a(param7, param2, 2874, param17);
        vqb.f((byte) -107);
        if (param0 > 10) {
          fma.l(8611);
          gba.e(116);
          return;
        } else {
          field_o = null;
          fma.l(8611);
          gba.e(116);
          return;
        }
    }

    mk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 7) {
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(43, 62, param0[0].a(92));
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Show all game chat";
    }
}
