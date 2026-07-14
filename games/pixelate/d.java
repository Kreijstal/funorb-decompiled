/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static int field_b;
    static String field_d;
    static String field_a;
    static int field_c;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 == -17540) {
          if (!lo.field_Nb) {
            throw new IllegalStateException();
          } else {
            sd.field_I = true;
            nl.a(0, false);
            el.field_b = 0;
            return;
          }
        } else {
          field_b = -91;
          if (!lo.field_Nb) {
            throw new IllegalStateException();
          } else {
            sd.field_I = true;
            nl.a(0, false);
            el.field_b = 0;
            return;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
            if (param0 != 0) {
                return;
            }
            try {
                param1.getAppletContext().showDocument(lg.a(false, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(fm param0, fm param1, boolean param2, byte[] param3, String[][] param4, int param5, hh[] param6, int[] param7, String[] param8, int param9, boolean param10, String[][] param11, int param12, int[] param13, tf[][] param14, fm param15, String[] param16, byte[] param17, tf[][] param18) {
        Object var20 = null;
        ge.a(param8, param12, param1, param17, param14, param5, param4, param15, param3, (String[]) null, param18, param6, param11, param0, param16, param7, 1, param10, param13, (byte) -41);
        if (param2) {
            return;
        }
        d.a((fm) null, (fm) null, true, (byte[]) null, (String[][]) null, -25, (hh[]) null, (int[]) null, (String[]) null, -85, true, (String[][]) null, 103, (int[]) null, (tf[][]) null, (fm) null, (String[]) null, (byte[]) null, (tf[][]) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "More suggestions";
        field_a = "(<%0> players want to join)";
        field_b = 22;
    }
}
