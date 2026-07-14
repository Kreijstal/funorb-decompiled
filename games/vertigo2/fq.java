/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fq {
    int field_h;
    int field_d;
    int field_e;
    static String field_f;
    static int field_g;
    static double field_j;
    int field_k;
    static boolean field_i;
    static String field_a;
    int field_l;
    int field_c;
    static int[] field_b;

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        if (param0 > -122) {
            field_f = null;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
            if (param1 != -16) {
                return;
            }
            try {
                param0.getAppletContext().showDocument(ar.a(param0, var2, 0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Offer rematch";
        field_a = "Your game";
        field_b = new int[8192];
    }
}
