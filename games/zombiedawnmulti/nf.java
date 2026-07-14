/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static int field_a;
    static int field_b;
    static int field_c;
    static int field_d;

    final static ma a(byte param0, String param1) {
        int var5 = 0;
        String var6 = null;
        ma var7 = null;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param1.length();
        if (-1 == (var2 ^ -1)) {
            return jo.field_e;
        }
        if ((var2 ^ -1) < -256) {
            return er.field_f;
        }
        String[] var3 = mk.a('.', false, param1);
        if (2 > var3.length) {
            return jo.field_e;
        }
        if (param0 < 79) {
            return null;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = lq.a((byte) 1, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return pg.a(var3[-1 + var3.length], (byte) -86);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ka.a(50, (byte) -110);
    }
}
