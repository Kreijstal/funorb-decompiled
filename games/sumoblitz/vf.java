/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static int field_b;
    static qr field_c;
    static String field_e;
    static ki field_a;
    static int field_d;

    final static void a(byte param0) {
        if (null != hc.field_c) {
            hc.field_c.n(-7);
            if (param0 == -49) {
                ro.field_a = new vq();
                vi.field_y.b((byte) -94, (pk) (Object) ro.field_a);
                return;
            }
            vf.a(3);
            ro.field_a = new vq();
            vi.field_y.b((byte) -94, (pk) (Object) ro.field_a);
            return;
        }
        if (param0 != -49) {
            vf.a(3);
            ro.field_a = new vq();
            vi.field_y.b((byte) -94, (pk) (Object) ro.field_a);
            return;
        }
        ro.field_a = new vq();
        vi.field_y.b((byte) -94, (pk) (Object) ro.field_a);
    }

    final static bo a(ki param0, boolean param1, String param2, String param3, ki param4) {
        if (!param1) {
            field_c = null;
        }
        int var5 = param4.a(0, param2);
        int var6 = param4.a(var5, param3, (byte) 126);
        return tf.a(param0, (byte) -71, var5, var6, param4);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        if (param0 != 1) {
            Object var2 = null;
            bo discarded$0 = vf.a((ki) null, false, (String) null, (String) null, (ki) null);
            field_a = null;
            field_e = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var1 = rg.field_C[param0];
        for (var2 = 1; var2 < rg.field_C.length; var2++) {
            var3 = rg.field_C[var2];
            la.a(Sumoblitz.field_G, var2 << 1402994692, Sumoblitz.field_G, var1, var3);
            var1 = var1 + var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 200;
        field_e = "Reload game";
        field_c = new qr();
    }
}
