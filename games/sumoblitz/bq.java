/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bq {
    static String[] field_a;
    static int[] field_d;
    static da field_c;
    fr field_b;

    final static an a(boolean param0, int param1) {
        an var2 = new an(true);
        var2.field_c = param0 ? true : false;
        return var2;
    }

    final static void a(int param0) {
        cb.field_b = false;
        int discarded$0 = ig.field_a.e(-31302);
    }

    abstract void b(int param0);

    abstract void a(byte param0, int param1, ht param2);

    abstract void a(int param0, boolean param1);

    abstract void a(byte param0, boolean param1);

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_a = null;
    }

    abstract boolean b(byte param0);

    bq(fr param0) {
        try {
            ((bq) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bq.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void a(byte param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
