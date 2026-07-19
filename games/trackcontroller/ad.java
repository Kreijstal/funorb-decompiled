/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vh {
    static String field_s;
    private Object field_r;

    final static void a(int param0, int param1, byte param2) {
        dd.field_o = 1;
        nf.field_e = param1;
        if (param2 > -22) {
            ad.i(-126);
            jh.field_a = param0;
            return;
        }
        jh.field_a = param0;
    }

    final Object a(byte param0) {
        int var2 = -30 % ((param0 - -35) / 39);
        return this.field_r;
    }

    public static void i(int param0) {
        if (param0 != 1) {
            field_s = (String) null;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final boolean f(int param0) {
        boolean discarded$0 = false;
        if (param0 != -19429) {
            discarded$0 = this.f(26);
            return false;
        }
        return false;
    }

    ad(Object param0, int param1) {
        super(param1);
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_s = "Friends can be added in multiplayer<nbsp>games";
    }
}
