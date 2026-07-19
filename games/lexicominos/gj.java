/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends rh {
    static aj field_w;
    static int field_t;
    private Object field_v;
    static int[] field_x;
    static String field_u;
    static byte[][] field_s;

    final Object c(byte param0) {
        if (param0 != 30) {
            gj.d(70);
            return this.field_v;
        }
        return this.field_v;
    }

    final static db[] a(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          field_s = (byte[][]) null;
          return wb.a(param0, param1, 1, param3, 3);
        } else {
          return wb.a(param0, param1, 1, param3, 3);
        }
    }

    final boolean d(byte param0) {
        int var2 = -20 % ((-6 - param0) / 48);
        return false;
    }

    public static void d(int param0) {
        field_w = null;
        field_s = (byte[][]) null;
        field_u = null;
        if (param0 != -8601) {
            gj.d(-12);
            field_x = null;
            return;
        }
        field_x = null;
    }

    gj(Object param0, int param1) {
        super(param1);
        try {
            this.field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_x = new int[128];
        field_s = new byte[50][];
        field_u = "Visit the Account Management section on the main site to view.";
        field_w = new aj(0, 2, 2, 1);
    }
}
