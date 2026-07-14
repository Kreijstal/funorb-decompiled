/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends jt {
    private java.lang.ref.SoftReference field_B;
    static volatile int field_C;

    final Object c(byte param0) {
        int var2 = 58 % ((param0 - 37) / 58);
        return ((kl) this).field_B.get();
    }

    final static ha a(int param0, java.awt.Canvas param1, d param2, int param3, int param4) {
        if (param4 != -1) {
            return null;
        }
        return (ha) (Object) new qa(param1, param2, param3, param0);
    }

    kl(Object param0, int param1) {
        super(param1);
        ((kl) this).field_B = new java.lang.ref.SoftReference(param0);
    }

    final boolean e(int param0) {
        int var2 = -79 % ((14 - param0) / 51);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = -1;
    }
}
