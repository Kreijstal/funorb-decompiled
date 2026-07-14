/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends gh {
    static int field_A;
    static int[] field_x;
    static String field_z;
    static tf field_y;

    final String b(ng param0, int param1) {
        if (param1 != -472248767) {
          field_y = null;
          return bc.a(false, '*', param0.field_q.length());
        } else {
          return bc.a(false, '*', param0.field_q.length());
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_y = null;
        if (param0 != 8192) {
            field_y = null;
            field_x = null;
            return;
        }
        field_x = null;
    }

    private ip(jl param0, int param1) {
        super(param0, param1);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
            if (param0 != 93) {
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

    ip(int param0) {
        this(he.field_d, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
        field_z = "Previous";
    }
}
