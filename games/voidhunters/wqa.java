/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wqa implements dja {
    static long field_a;
    static int field_b;

    public final tv a(byte param0) {
        int var2 = -10 / ((param0 - -64) / 50);
        return (tv) ((Object) new iia());
    }

    final static boolean a(boolean param0, int param1) {
        if (param0) {
            return true;
        }
        return param1 >= 0 ? true : false;
    }

    public final tv[] a(int param0, int param1) {
        tv[] discarded$0 = null;
        if (param0 != 11995) {
            discarded$0 = this.a(-39, -108);
            return (tv[]) ((Object) new iia[param1]);
        }
        return (tv[]) ((Object) new iia[param1]);
    }

    final static void a(int param0, bc param1, int param2, int param3, bc param4, int param5) {
        ih.field_e = param5;
        pva.field_g = param0;
        if (param2 <= 112) {
            return;
        }
        try {
            vhb.field_d = param1;
            hwa.field_q = param3;
            ska.field_o = param4;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wqa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_b = 1;
    }
}
