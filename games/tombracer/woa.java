/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class woa extends od {
    byte[] field_k;
    static String field_l;

    final static void a(int param0, cga param1, boolean param2) {
        try {
            if (param2) {
                woa.a(-60);
            }
            aba.field_a.b((byte) -86, param1);
            wj.a(param1, param0, -118);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "woa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, cn param1, cn param2, int param3) {
        jma.field_j = param1;
        if (param0 > -52) {
            return;
        }
        try {
            dk.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "woa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    woa(byte[] param0) {
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "woa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != -20476) {
            field_l = (String) null;
        }
    }

    static {
        field_l = "Email address is unavailable";
    }
}
