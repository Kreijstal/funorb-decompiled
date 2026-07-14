/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bga implements bo {
    private taa field_a;
    static naa field_c;
    static int field_b;
    static boolean field_d;

    public static void a(int param0) {
        if (param0 != 200) {
            bga.a(33);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(ufa param0, byte param1) {
        if (param1 > -10) {
            return;
        }
        param0.a(8, ((bga) this).field_a);
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        ((bga) this).field_a.a((uia) (Object) param1, param0 ^ 32582);
    }

    public final void a(kh param0, byte param1) {
        ((bga) this).field_a = hka.a(0, (uia) (Object) param0);
        if (param1 != -19) {
            field_d = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 200;
        field_d = false;
    }
}
