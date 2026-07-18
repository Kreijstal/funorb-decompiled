/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static kba field_a;
    private uq field_b;

    final void a(int param0, qfa param1) {
        try {
            ((vf) this).field_b = param1.a((byte[]) null, 24, 196584, true, (byte) 125);
            od discarded$0 = new od(((vf) this).field_b, 5126, 2, 0);
            od discarded$1 = new od(((vf) this).field_b, 5126, 3, param0);
            od discarded$2 = new od(((vf) this).field_b, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vf() {
        mb discarded$0 = new mb(786336);
        int discarded$1 = ieb.a(1600, -61);
    }

    public static void a(byte param0) {
        if (param0 != -26) {
            vf.a((byte) 123);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new kba();
    }
}
