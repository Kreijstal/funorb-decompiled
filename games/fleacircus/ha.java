/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends lh {
    static int field_l;
    byte[] field_r;
    static dd field_i;
    static String field_m;
    long field_q;
    int field_n;
    static String field_p;
    static String field_j;
    static sf field_o;
    static boolean field_k;

    final static void a(int param0) {
        ee.field_i = false;
        if (param0 != -17288) {
            field_k = true;
            int discarded$0 = ae.field_a.e(false);
            return;
        }
        int discarded$1 = ae.field_a.e(false);
    }

    public static void b(boolean param0) {
        field_p = null;
        field_m = null;
        field_i = null;
        field_o = null;
        if (param0) {
            return;
        }
        field_j = null;
    }

    ha(long param0, int param1, byte[] param2) {
        ((ha) this).field_n = param1;
        ((ha) this).field_r = param2;
        ((ha) this).field_q = param0;
    }

    final static boolean a(rh param0, int param1, int param2, int param3) {
        byte[] var6 = null;
        byte[] var4 = null;
        if (param1 != -32180) {
            Object var5 = null;
            boolean discarded$0 = ha.a((rh) null, -106, -37, 82);
            var6 = param0.a(param2, (byte) 120, param3);
            var4 = var6;
            if (!(var6 != null)) {
                return false;
            }
            l.a(var6, (byte) -91);
            return true;
        }
        var6 = param0.a(param2, (byte) 120, param3);
        var4 = var6;
        if (!(var6 != null)) {
            return false;
        }
        l.a(var6, (byte) -91);
        return true;
    }

    final static mk a(String[] args, int param1) {
        mk var2 = null;
        if (param1 != -21916) {
          ha.b(false);
          var2 = new mk(false);
          var2.field_j = args;
          return var2;
        } else {
          var2 = new mk(false);
          var2.field_j = args;
          return var2;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                if (param1 != 7152) {
                    field_p = null;
                }
                param0.getAppletContext().showDocument(ib.a(param0, var2, -5441), "_top");
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
        field_p = "Block: ";
        field_m = "Names cannot start or end with space or underscore";
        field_j = "Email is valid";
    }
}
