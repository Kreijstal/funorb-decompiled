/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cj extends wj implements cw {
    static hd field_D;
    private hl field_B;
    static String field_H;
    static int field_G;
    static String field_E;
    static String field_F;

    abstract boolean b(boolean param0);

    abstract int m(int param0);

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6) {
        String var7 = null;
        if (ov.field_b == 2) {
            var7 = ds.field_e;
        } else {
            var7 = vo.field_db;
        }
        wb.a(param0, var7, param6, param3, param2, 73, param5, param1);
    }

    void a(hl param0, int param1) {
        try {
            ((cj) this).field_B = param0;
            if (param1 != -20274) {
                cj.a(-16);
            }
            ((cj) this).field_B.field_g = (cj) this;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "cj.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int l(int param0);

    cj(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4);
    }

    public static void a(int param0) {
        field_H = null;
        field_F = null;
        field_E = null;
        if (param0 > -88) {
            int discarded$0 = cj.k(94);
            field_D = null;
            return;
        }
        field_D = null;
    }

    final static int k(int param0) {
        if (param0 != 256) {
            int discarded$0 = cj.k(38);
            return 256;
        }
        return 256;
    }

    abstract int h(byte param0);

    public final l a(byte param0) {
        if (param0 > -107) {
            return null;
        }
        return (l) (Object) ((cj) this).field_B;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Replace";
        field_H = "Respect";
        field_F = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
