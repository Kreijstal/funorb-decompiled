/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik {
    int field_c;
    static hk field_d;
    static String field_a;
    static i field_b;

    abstract void a(int param0, ha param1, int param2);

    abstract int a(int param0);

    final static void a(String param0, byte param1) {
        try {
            if (null != rd.field_j) {
                rd.field_j.field_pc.b(87);
            }
            if (!(null == bc.field_a)) {
                bc.field_a.field_pc.b(93);
            }
            Object var3 = null;
            af.a((Throwable) null, -63, param0);
            dj.a((byte) -124);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ik.B(" + (param0 != null ? "{...}" : "null") + 44 + 40 + 41);
        }
    }

    abstract void a(ha param0, int param1);

    abstract void a(byte param0, ha param1);

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1700635440) {
            ik.b(-53);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    ik(int param0) {
        ((ik) this).field_c = param0;
    }

    abstract void a(int param0, vh param1);

    final static int a(long param0, long param1, int param2) {
        if (param2 != -1700635440) {
            return 126;
        }
        return (int)(param0 * param1 >> 16);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> has withdrawn the request to join.";
    }
}
