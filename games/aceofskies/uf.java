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
        if (param0) {
            return true;
        }
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
        int var1 = 39 / ((33 - param0) / 45);
    }

    protected final void finalize() throws Throwable {
        this.field_c.d(-124, this.field_a);
        super.finalize();
    }

    uf(wl param0, int param1, int param2) {
        try {
            this.field_a = param2;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = null;
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
