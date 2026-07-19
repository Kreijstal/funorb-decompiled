/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static hg field_g;
    static String field_c;
    static boolean field_e;
    static String field_b;
    static int field_f;
    static String[] field_d;
    static int[] field_a;

    final static void a(byte param0) {
        if (param0 >= -116) {
            String var2 = (String) null;
            ag.a(111, true, -0.42625245451927185f, (String) null);
        }
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        try {
            if (param0 != 11819) {
                ag.a(-62);
            }
            if (null == mk.field_e) {
                mk.field_e = new ch(jh.field_e, qf.field_g);
                jh.field_e.b(mk.field_e, (byte) -105);
            }
            mk.field_e.a(param3, param2, param1, param0 + -11945);
            wb.b();
            qe.a((byte) -31, true);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ag.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 9604) {
            return;
        }
        field_g = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_c = "Kick";
        field_g = new hg(12, 0, 1, 0);
        field_e = false;
        field_d = new String[255];
        field_b = "Cancel";
        field_f = 0;
        field_a = new int[128];
    }
}
