/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends java.awt.Canvas {
    static uf[] field_e;
    private java.awt.Component field_b;
    static ml field_d;
    static String field_c;
    static volatile boolean field_a;

    final static int a(int param0, byte param1, int param2) {
        int var4 = stellarshard.field_B;
        if (param1 != 109) {
            hi.a((byte) -90);
        }
        int var3 = 0;
        while ((param0 ^ -1) < -1) {
            var3 = var3 << 62269921 | 1 & param2;
            param2 = param2 >>> 1;
            param0--;
        }
        return var3;
    }

    public final void paint(java.awt.Graphics param0) {
        ((hi) this).field_b.paint(param0);
    }

    hi(java.awt.Component param0) {
        ((hi) this).field_b = param0;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -92) {
            hi.a((byte) 93);
        }
        field_c = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((hi) this).field_b.update(param0);
    }

    final static bk a(String param0, boolean param1) {
        if (al.field_f.a(param1)) {
            if (!param0.equals((Object) (Object) al.field_f.c(-112))) {
                al.field_f = de.a(param0, -49);
            }
        }
        return al.field_f;
    }

    final static void b(byte param0) {
        vi.a(true);
        if (param0 != 109) {
            Object var2 = null;
            bk discarded$0 = hi.a((String) null, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_e = new uf[255];
        field_c = "Create your own free Jagex account";
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = new uf();
        }
        field_a = false;
    }
}
