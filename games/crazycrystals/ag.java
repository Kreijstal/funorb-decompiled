/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_a;
    static boolean field_b;
    static dl[] field_c;

    final static void a(String param0, int param1) {
        try {
            if (param1 != 48) {
                field_b = false;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ag.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 != 48) {
            return false;
        }
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 19266) {
            field_b = false;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_a = "Return to Main Menu";
    }
}
