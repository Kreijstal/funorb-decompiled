/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lf extends df {
    static char[] field_e;
    private String field_d;
    private long field_c;

    qg a(byte param0) {
        if (param0 != -32) {
            return null;
        }
        return Geoblox.field_B;
    }

    public static void b(int param0) {
        if (param0 != 8221) {
            lf.b(91);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final void a(int param0, qc param1) {
        param1.b((byte) 59, ((lf) this).field_c);
        param1.a(((lf) this).field_d, false);
        if (param0 < 107) {
            field_e = null;
        }
    }

    lf(long param0, String param1) {
        ((lf) this).field_c = param0;
        ((lf) this).field_d = param1;
    }

    final static String c(byte param0) {
        if (param0 <= 14) {
            field_e = null;
            if (vl.field_q) {
                return null;
            }
            if (wg.field_e > oe.field_V) {
                return null;
            }
            if (!(ue.field_j + wg.field_e <= oe.field_V)) {
                return tc.field_a;
            }
            return null;
        }
        if (vl.field_q) {
            return null;
        }
        if (wg.field_e > oe.field_V) {
            return null;
        }
        if (!(ue.field_j + wg.field_e <= oe.field_V)) {
            return tc.field_a;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
