/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends gg {
    static int field_l;
    byte[] field_k;
    int field_i;
    static int field_h;
    static int[] field_m;
    static int field_j;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(i.field_J);
            param1.removeFocusListener(i.field_J);
            fg.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_m = null;
    }

    private ob() throws Throwable {
        throw new Error();
    }

    static {
        field_h = -1;
        field_m = new int[8192];
    }
}
