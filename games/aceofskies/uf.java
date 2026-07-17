/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static String field_e;
    private wl field_c;
    int field_a;
    static String[] field_b;
    static int[] field_d;

    final static boolean a(boolean param0) {
        if (aj.field_s == null) {
            return false;
        }
        if (!aj.field_s.a(false)) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = 19;
    }

    protected final void finalize() throws Throwable {
        ((uf) this).field_c.d(-124, ((uf) this).field_a);
        super.finalize();
    }

    uf(wl param0, int param1, int param2) {
        try {
            ((uf) this).field_a = param2;
            ((uf) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "uf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = null;
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
