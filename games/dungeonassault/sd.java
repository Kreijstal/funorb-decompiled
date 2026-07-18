/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends da {
    int field_H;
    static ef field_G;
    static String field_I;
    static int field_J;
    static int[] field_F;

    sd(lm param0) {
        super(param0.field_q, param0.field_v, param0.field_x, param0.field_s, (ca) null, (pg) null);
        try {
            param0.b(0, ((sd) this).field_x, 0, 0, ((sd) this).field_s);
            ((sd) this).field_H = 256;
            ((sd) this).field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, cn param1, int param2, int param3, int param4, int param5) {
        try {
            int var6_int = -14 / ((param2 - -15) / 36);
            param1.h(param0, param5);
            db.field_v.b(Integer.toString(param4), 20 + param0, param5 - -(la.field_b.field_H + param1.field_v >> 1), param3, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(boolean param0) {
        field_F = null;
        field_G = null;
        if (param0) {
            sd.b(true);
            field_I = null;
            return;
        }
        field_I = null;
    }

    public sd() {
        super(0, 0, 0, 0, (ca) null, (pg) null);
        ((sd) this).field_H = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 == param0)) {
            return;
        }
        if (null == ((sd) this).field_D) {
            return;
        }
        if (!(((sd) this).field_H != 0)) {
            return;
        }
        if (!(((sd) this).field_H != 256)) {
            ((sd) this).field_D.a(param0, ((sd) this).field_q + param1, 0, ((sd) this).field_v + param3);
            return;
        }
        cn var6 = new cn(((sd) this).field_D.field_x, ((sd) this).field_D.field_s);
        lm.a(var6, (byte) -79);
        ((sd) this).field_D.a(param0, 0, param2, param2);
        ti.c(true);
        var6.d(param1 + ((sd) this).field_q, ((sd) this).field_v + param3, ((sd) this).field_H);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new ef();
        field_I = "Saurus Warrior";
        field_F = new int[12];
    }
}
