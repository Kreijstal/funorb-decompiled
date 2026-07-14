/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua implements Runnable {
    volatile boolean field_e;
    volatile boolean field_d;
    volatile ug[] field_g;
    fd field_b;
    static ji field_f;
    static String field_a;
    static jb[] field_c;

    public final void run() {
        int var1_int = 0;
        ug var2 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        ((ua) this).field_e = true;
        try {
            while (!((ua) this).field_d) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = ((ua) this).field_g[var1_int];
                    if (var2 != null) {
                        var2.f();
                    }
                }
                vj.a(10L, (byte) -49);
                Object var5 = null;
                eb.a(((ua) this).field_b, 1001, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            ic.a((byte) -125, (String) null, (Throwable) (Object) exception);
        } finally {
            ((ua) this).field_e = false;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 60) {
            return;
        }
        field_f = null;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static float a(byte param0, float param1, float param2, float param3) {
        if (param0 > 0) {
            field_c = null;
        }
        if (param2 < param1) {
            param2 = param2 + param3;
            // ifge L56
            param2 = param1;
        } else {
            if (!(param2 <= param1)) {
                param2 = param2 - param3;
                if (param2 < param1) {
                    param2 = param1;
                }
            }
        }
        return param2;
    }

    ua() {
        ((ua) this).field_g = new ug[2];
        ((ua) this).field_d = false;
        ((ua) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player Name: ";
        field_c = new jb[]{};
    }
}
