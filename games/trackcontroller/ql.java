/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends dd {
    static String field_q;

    final String c(byte param0, al param1) {
        Object var4 = null;
        if (param0 <= 49) {
          var4 = null;
          String discarded$2 = ((ql) this).c((byte) -78, (al) null);
          return uh.a(param1.field_s.length(), '*', (byte) 20);
        } else {
          return uh.a(param1.field_s.length(), '*', (byte) 20);
        }
    }

    public static void c(int param0) {
        if (param0 != 42) {
            Object var2 = null;
            int discarded$0 = ql.a(39, (byte[]) null, 29);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static int a(int param0, byte[] param1, int param2) {
        if (param0 != 0) {
            ql.c(-93);
            return cl.a(1, param2, 0, param1);
        }
        return cl.a(1, param2, 0, param1);
    }

    ql(int param0) {
        this(gk.field_c, param0);
    }

    private ql(oh param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Loading sound effects";
    }
}
