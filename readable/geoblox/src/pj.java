/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends IntrusiveNode {
    byte[] field_h;
    static nd field_f;
    static int[] meshFaceOrder;
    static ck field_g;

    pj(byte[] param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        meshFaceOrder = null;
        field_g = null;
        if (param0) {
            pj.b(false);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        field_f = new nd();
        meshFaceOrder = new int[16384];
        field_g = new ck(0, 2, 2, 1);
    }
}
