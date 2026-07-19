/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    private kda field_a;
    long field_c;
    private static String[] field_b;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != -23611) {
          field_b = (String[]) null;
          return uk.a(param2, (byte) -128, param0) & foa.a(param0, param2, 0);
        } else {
          return uk.a(param2, (byte) -128, param0) & foa.a(param0, param2, 0);
        }
    }

    protected final void finalize() throws Throwable {
        this.field_a.a(this.field_c, -6115);
        super.finalize();
    }

    final static void a(int param0, String param1, String param2) {
        try {
            if (!(ci.field_l == null)) {
                ci.field_l.i((byte) 20);
            }
            if (param0 != 0) {
                field_b = (String[]) null;
            }
            vn.field_b = new jw(param1, param2, false, true, true);
            um.field_l.a(101, vn.field_b);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pr.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_b = null;
        if (param0 != 28122) {
            discarded$0 = pr.a(-61, 4, -35);
        }
    }

    pr(kda param0, long param1, int param2) {
        try {
            this.field_a = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[2];
        field_b[0] = "2x2";
        field_b[1] = "3x3";
    }
}
