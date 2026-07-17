/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends wv {
    static String field_j;
    static sa field_m;
    static wk[] field_l;
    static String field_k;

    oq(long param0, String param1) {
        super(param0, param1);
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 < 66) {
          oq.a(-38);
          field_m = null;
          field_j = null;
          field_l = null;
          return;
        } else {
          field_m = null;
          field_j = null;
          field_l = null;
          return;
        }
    }

    final h a(byte param0) {
        int var2 = -72 / ((-63 - param0) / 45);
        return qv.field_l;
    }

    final static int a() {
        return ii.field_b;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        try {
            param1.addKeyListener((java.awt.event.KeyListener) (Object) va.field_w);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) va.field_w);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oq.F(" + 27080 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Classic";
        field_m = new sa();
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
