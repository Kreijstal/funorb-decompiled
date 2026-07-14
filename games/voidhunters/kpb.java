/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kpb extends io {
    static qkb field_q;
    static jo[] field_s;
    static String field_r;

    public static void c(int param0) {
        field_s = null;
        if (param0 != 17433) {
            kpb.c(-38);
            field_q = null;
            field_r = null;
            return;
        }
        field_q = null;
        field_r = null;
    }

    kpb(int param0) {
        this(loa.field_o, param0);
    }

    final String b(byte param0, shb param1) {
        if (param0 > -53) {
            return null;
        }
        return nva.a('*', true, param1.field_j.length());
    }

    private kpb(no param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Name";
        field_s = new jo[256];
    }
}
